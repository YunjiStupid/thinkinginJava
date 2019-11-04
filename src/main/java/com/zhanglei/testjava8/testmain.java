package com.zhanglei.testjava8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zhanglei
 * @description
 * @date 2019/4/25
 */
public class testmain {

    public static void main(String[] args) {
        GroupBean product1 = new GroupBean();
        GroupBean product2 = new GroupBean();
        GroupBean product3 = new GroupBean();
        GroupBean product4 = new GroupBean();
        GroupBean product5 = new GroupBean();
        GroupBean product6 = new GroupBean();
        GroupBean product7 = new GroupBean();
        GroupBean product8 = new GroupBean();
        GroupBean product9 = new GroupBean();
        GroupBean product10 = new GroupBean();
        GroupBean product11 = new GroupBean();
        GroupBean product12 = new GroupBean();

        product1.setFsupplierid("400");
        product1.setFistop("0");
        product1.setFproductname("product1");
        product1.setFgrouptype(2);

        product2.setFsupplierid("400");
        product2.setFistop("0");
        product2.setFproductname("product2");
        product2.setFgrouptype(2);

        product3.setFsupplierid("400");
        product3.setFistop("0");
        product3.setFproductname("product3");
        product3.setFgrouptype(1);

        product4.setFsupplierid("400");
        product4.setFistop("0");
        product4.setFproductname("product4");
        product4.setFgrouptype(1);

        //***************************************************

        product5.setFsupplierid("401");
        product5.setFistop("1");
        product5.setFproductname("product5");
        product5.setFgrouptype(1);

        product6.setFsupplierid("401");
        product6.setFistop("0");
        product6.setFproductname("product6");
        product6.setFgrouptype(2);

        product7.setFsupplierid("401");
        product7.setFistop("1");
        product7.setFproductname("product7");
        product7.setFgrouptype(2);

        //****************************************************
        product8.setFsupplierid("399");
        product8.setFistop("1");
        product8.setFproductname("product8");
        product8.setFgrouptype(1);

        product9.setFsupplierid("399");
        product9.setFistop("0");
        product9.setFproductname("product9");
        product9.setFgrouptype(1);

        product10.setFsupplierid("399");
        product10.setFistop("0");
        product10.setFproductname("product10");
        product10.setFgrouptype(2);

        product11.setFsupplierid("399");
        product11.setFistop("1");
        product11.setFproductname("product11");
        product11.setFgrouptype(2);

        product12.setFsupplierid("399");
        product12.setFistop("1");
        product12.setFproductname("product12");
        product12.setFgrouptype(2);


        List<GroupBean> limitNumProduct = new ArrayList<>();
        limitNumProduct.add(product1);
        limitNumProduct.add(product2);
        limitNumProduct.add(product3);
        limitNumProduct.add(product4);
        limitNumProduct.add(product5);
        limitNumProduct.add(product6);
        limitNumProduct.add(product7);
        limitNumProduct.add(product8);
        limitNumProduct.add(product9);
        limitNumProduct.add(product10);
        limitNumProduct.add(product11);
        limitNumProduct.add(product12);

        setTopOrder(limitNumProduct);

        limitNumProduct.forEach(System.out::println);
    }

    public static void setTopOrder(List<GroupBean> productList){
        List<GroupBean> limitNumProduct = new ArrayList<>();
        List<GroupBean> limitTimeProduct = new ArrayList<>();
        Iterator<GroupBean> proIterable = productList.iterator();
        //分类查出所有限时，限量，原价
        while (proIterable.hasNext()) {
            GroupBean product = proIterable.next();
            //查出所有限量方案
            if (product.getFgrouptype() == 1) {
                //添加需要置顶的数据
                limitNumProduct.add(product);
                //在主列表中删除置顶数据
                proIterable.remove();
            }else{
                //查出所有限时方案
                limitTimeProduct.add(product);
            }
        }
        //给限量排序**************************************************************************
        List<GroupBean> tempNumProductList = new ArrayList<>();
        Iterator<GroupBean> proLimitNum = limitNumProduct.iterator();
        List<GroupBean> topNumProduct = new ArrayList<>();
        while (proLimitNum.hasNext()) {
            GroupBean product = proLimitNum.next();
            if ("1".equals(product.getFistop())) {
                //添加需要置顶的数据
                topNumProduct.add(product);
                //在主列表中删除置顶数据
                proLimitNum.remove();
            }
        }
        //没有标签的限量方案放进temp
        tempNumProductList.addAll(limitNumProduct);
        limitNumProduct.clear();
        limitNumProduct.addAll(topNumProduct);
        limitNumProduct.addAll(tempNumProductList);
        //给限时排序****************************************************************************
        Map<String,List<GroupBean>> map =limitTimeProduct.stream().collect(Collectors.groupingBy(GroupBean::getFsupplierid,LinkedHashMap::new,Collectors.toCollection(ArrayList<GroupBean>::new)));
        List<GroupBean> listTime = new ArrayList();
        map.forEach((k,v)->{
            List<GroupBean> fastList = v.stream().filter(x->"1".equals(x.getFistop())).collect(Collectors.toList());
            List<GroupBean> lastList = v.stream().filter(x->!"1".equals(x.getFistop())).collect(Collectors.toList());
            listTime.addAll(fastList);
            listTime.addAll(lastList);
        });

        //总体拼接排序
        productList.clear();
        productList.addAll(limitNumProduct);
        productList.addAll(listTime);
    }
}
