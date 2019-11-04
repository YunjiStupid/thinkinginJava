package com.streamtest;

import com.streamtest.model.Trader;
import com.streamtest.model.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 付诸实践
 *
 * @author zhanglei
 * @description
 * @date 2019/11/1
 */
public class Test5_5 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        Trader mbrio = new Trader("Mbrio","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(mbrio, 2012, 700),
                new Transaction(alan, 2012, 950));

        System.out.println("找出2011年的所有交易并按交易额排序（从低到高）");
        System.out.println();
        transactions.stream().filter(x -> x.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue).thenComparing(Transaction::getYear))
                .forEach(x -> System.out.println(x.getTrader() + "," +  x.getValue()));

        System.out.println("****************************************************************");
        System.out.println("返回所有交易员的姓名字符串，按字母顺序排序");
        System.out.println();
        String collect = transactions.stream().map(x -> x.getTrader().getName())
                .sorted().collect(Collectors.joining(", "));
        System.out.println(collect);

        System.out.println("****************************************************************");
        System.out.println("有没有交易员是在米兰工作的");
        transactions.stream().filter(x -> "Milan".equals(x.getTrader().getCity()))
                .forEach(x -> System.out.println(x.getTrader().getName()));
        System.out.println();
        boolean b = transactions.stream().anyMatch(s -> "Milan".equals(s.getTrader().getName()));
        System.out.println(b);

        System.out.println("****************************************************************");
        System.out.println("打印生活在剑桥的交易员的所有交易额");
        transactions.stream().filter(x -> "Cambridge".equals(x.getTrader().getCity()))
                .map(Transaction::getValue)
                .distinct()
                .forEach(System.out::println);

        System.out.println("****************************************************************");
        System.out.println("所有交易中，最高的交易额是多少");
        Optional<Integer> reduce = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
         System.out.println(reduce.get());
        System.out.println(reduce);


    }
}
