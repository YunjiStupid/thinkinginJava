package com.zhanglei.testjava8;

import java.math.BigDecimal;

/**
 * 团购产品
 * @author ZhangMingHui on 2017/7/27.
 */
public class GroupBean {

    /**
     * 团购搜索街道
     */
    private Integer fuserBrowseAreaCode;

    /**
     * 产品
     */
    private String fid;
    /**
     * 供应商ID
     */
    private String fsupplierid;
    /**
     * 供应商名称
     */
    private String fsuppliername;
    /**
     * 团购区域 销售区域
     */
    private String fgrouparea;
    /**
     * 销售区域id
     */
    private String fgroupareaid;
    /**
     * 市场产品名称
     */
    private String fmarketproductname;
    /**
     * 产品名称
     */
    private String fproductname;
    /**
     * 推荐行业
     */
    private String frecommendindustry;
    /**
     * 营销方案
     */
    private String fmarketingplanid;
    /**
     * 适应行业
     */
    private String fsuitindustry;
    /**
     * 纸板材料
     */
    private String fmaterialid;
    /**
     * 物流
     */
    private String flogistics;
    /**
     * 楞型
     */
    private String fflutetype;
    /**
     * 最大接单长
     */
    private String fmaxorderlength;
    /**
     * 最小接单长
     */
    private String fminorderlength;
    /**
     * 最大接单宽
     */
    private String fmaxorderwidth   ;
    /**
     * 最小接单宽
     */
    private String fminorderwidth;
    /**
     * 落料长加
     */
    private String fmateriallengthplus;
    /**
     * 落料宽加
     */
    private String fmaterialwidthplus;
    /**
     * 交期天数
     */
    private String fdeliveryday;
    /**
     * 层次
     */
    private String flayer;
    /**
     * 产品描述
     */
    private String fdescribe;
    /**
     * 区域拆分键
     */
    private String fkeyarea;

    /**
     * 营销方式参数*********************************************
     */
    /**
     * 价格方案变更表id
     */
    private String fmktplanchangeid;
    /**
     * 价格方案名称
     */
    private String fmarketingname;
    /**
     * 团购开始时间
     */
    private String fstarttime;
    /**
     * 团购结束时间
     */
    private String fendtime;
    /**
     * 价格提前展示时期
     */
    private String faheadtime;
    /**
     * 倒计时展示期
     */
    private String fcutdowntime;
    /**
     * 产品id
     */
    private String fgroupgoodid;

    /**
     * 团购开始时间Long
     */
    private long fstarttimeLong;
    /**
     * 团购结束时间Long
     */
    private long fendtimeLong;
    /**
     * 限时开始时间
     */
    private String flimitedstarttime;

    /**
     * 限时结束时间
     */
    private String flimitedendtime;

    /**
     * //限时开始时间long
     */
    private long flimitedstarttimeLong;

    /**
     * //限时结束时间long
     */
    private long flimitedendtimeLong;
    /**
     * 起步单量
     */
    private int fminarea;
    /**
     * 限购量
     */
    private int fmaxarea;
    /**
     * 团购产品原价
     */
    private BigDecimal funitprice;
    /**
     * 团购价格
     */
    private BigDecimal fgroupprice;
    /**
     * 团购类型 1：限量、2：限时
     */
    private int fgrouptype;
    /**
     * 系统时间
     */
    private String systime;
    /**
     * 系统时间Long
     */
    private long systimeLong;
    /**
     * 已购买量
     */
    private double fSoldNum;
    /**
     * 营销方案是否结束 进行中 false  结束 true
     */
    private boolean fIsEnd;
    /**
     * 是否置顶(0-置顶,1-不值顶)
     */
    private String fistop;
    /**
     * 标签名称
     */
    private String flabelname;
    /**
     * 标签图片
     */
    private String flabelurl;
    /**
     * 是否开团 不开团 1  开团 2
     */
    private int fOpenGroup ;
    /**
     * 是否显示合作商名称 0不显示  1显示
     */
    private String fisdiplaysn;
    /**
     * 统计数
     */
    private String countOrder;
    /**
     * 是否存在可用方案 1：不存在 2：存在
     */
    private String fisExistScheme;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFsupplierid() {
        return fsupplierid;
    }

    public void setFsupplierid(String fsupplierid) {
        this.fsupplierid = fsupplierid;
    }

    public String getFsuppliername() {
        return fsuppliername;
    }

    public void setFsuppliername(String fsuppliername) {
        this.fsuppliername = fsuppliername;
    }

    public String getFgrouparea() {
        return fgrouparea;
    }

    public void setFgrouparea(String fgrouparea) {
        this.fgrouparea = fgrouparea;
    }

    public String getFgroupareaid() {
        return fgroupareaid;
    }

    public void setFgroupareaid(String fgroupareaid) {
        this.fgroupareaid = fgroupareaid;
    }

    public String getFmarketproductname() {
        return fmarketproductname;
    }

    public void setFmarketproductname(String fmarketproductname) {
        this.fmarketproductname = fmarketproductname;
    }

    public String getFproductname() {
        return fproductname;
    }

    public void setFproductname(String fproductname) {
        this.fproductname = fproductname;
    }

    public String getFrecommendindustry() {
        return frecommendindustry;
    }

    public void setFrecommendindustry(String frecommendindustry) {
        this.frecommendindustry = frecommendindustry;
    }

    public String getFmarketingplanid() {
        return fmarketingplanid;
    }

    public void setFmarketingplanid(String fmarketingplanid) {
        this.fmarketingplanid = fmarketingplanid;
    }

    public String getFsuitindustry() {
        return fsuitindustry;
    }

    public void setFsuitindustry(String fsuitindustry) {
        this.fsuitindustry = fsuitindustry;
    }

    public String getFmaterialid() {
        return fmaterialid;
    }

    public void setFmaterialid(String fmaterialid) {
        this.fmaterialid = fmaterialid;
    }

    public String getFlogistics() {
        return flogistics;
    }

    public void setFlogistics(String flogistics) {
        this.flogistics = flogistics;
    }

    public String getFflutetype() {
        return fflutetype;
    }

    public void setFflutetype(String fflutetype) {
        this.fflutetype = fflutetype;
    }

    public String getFmaxorderlength() {
        return fmaxorderlength;
    }

    public void setFmaxorderlength(String fmaxorderlength) {
        this.fmaxorderlength = fmaxorderlength;
    }

    public String getFminorderlength() {
        return fminorderlength;
    }

    public void setFminorderlength(String fminorderlength) {
        this.fminorderlength = fminorderlength;
    }

    public String getFmaxorderwidth() {
        return fmaxorderwidth;
    }

    public void setFmaxorderwidth(String fmaxorderwidth) {
        this.fmaxorderwidth = fmaxorderwidth;
    }

    public String getFminorderwidth() {
        return fminorderwidth;
    }

    public void setFminorderwidth(String fminorderwidth) {
        this.fminorderwidth = fminorderwidth;
    }

    public String getFmateriallengthplus() {
        return fmateriallengthplus;
    }

    public void setFmateriallengthplus(String fmateriallengthplus) {
        this.fmateriallengthplus = fmateriallengthplus;
    }

    public String getFmaterialwidthplus() {
        return fmaterialwidthplus;
    }

    public void setFmaterialwidthplus(String fmaterialwidthplus) {
        this.fmaterialwidthplus = fmaterialwidthplus;
    }

    public String getFdeliveryday() {
        return fdeliveryday;
    }

    public void setFdeliveryday(String fdeliveryday) {
        this.fdeliveryday = fdeliveryday;
    }

    public String getFlayer() {
        return flayer;
    }

    public void setFlayer(String flayer) {
        this.flayer = flayer;
    }

    public String getFdescribe() {
        return fdescribe;
    }

    public void setFdescribe(String fdescribe) {
        this.fdescribe = fdescribe;
    }

    public String getFkeyarea() {
        return fkeyarea;
    }

    public void setFkeyarea(String fkeyarea) {
        this.fkeyarea = fkeyarea;
    }

    public String getFmktplanchangeid() {
        return fmktplanchangeid;
    }

    public void setFmktplanchangeid(String fmktplanchangeid) {
        this.fmktplanchangeid = fmktplanchangeid;
    }

    public String getFmarketingname() {
        return fmarketingname;
    }

    public void setFmarketingname(String fmarketingname) {
        this.fmarketingname = fmarketingname;
    }

    public String getFstarttime() {
        return fstarttime;
    }

    public void setFstarttime(String fstarttime) {
        this.fstarttime = fstarttime;
    }

    public String getFendtime() {
        return fendtime;
    }

    public void setFendtime(String fendtime) {
        this.fendtime = fendtime;
    }

    public String getFaheadtime() {
        return faheadtime;
    }

    public void setFaheadtime(String faheadtime) {
        this.faheadtime = faheadtime;
    }

    public String getFcutdowntime() {
        return fcutdowntime;
    }

    public void setFcutdowntime(String fcutdowntime) {
        this.fcutdowntime = fcutdowntime;
    }

    public String getFgroupgoodid() {
        return fgroupgoodid;
    }

    public void setFgroupgoodid(String fgroupgoodid) {
        this.fgroupgoodid = fgroupgoodid;
    }

    public long getFstarttimeLong() {
        return fstarttimeLong;
    }

    public void setFstarttimeLong(long fstarttimeLong) {
        this.fstarttimeLong = fstarttimeLong;
    }

    public long getFendtimeLong() {
        return fendtimeLong;
    }

    public void setFendtimeLong(long fendtimeLong) {
        this.fendtimeLong = fendtimeLong;
    }

    public String getFlimitedstarttime() {
        return flimitedstarttime;
    }

    public void setFlimitedstarttime(String flimitedstarttime) {
        this.flimitedstarttime = flimitedstarttime;
    }

    public String getFlimitedendtime() {
        return flimitedendtime;
    }

    public void setFlimitedendtime(String flimitedendtime) {
        this.flimitedendtime = flimitedendtime;
    }

    public long getFlimitedstarttimeLong() {
        return flimitedstarttimeLong;
    }

    public void setFlimitedstarttimeLong(long flimitedstarttimeLong) {
        this.flimitedstarttimeLong = flimitedstarttimeLong;
    }

    public long getFlimitedendtimeLong() {
        return flimitedendtimeLong;
    }

    public void setFlimitedendtimeLong(long flimitedendtimeLong) {
        this.flimitedendtimeLong = flimitedendtimeLong;
    }

    public int getFminarea() {
        return fminarea;
    }

    public void setFminarea(int fminarea) {
        this.fminarea = fminarea;
    }

    public int getFmaxarea() {
        return fmaxarea;
    }

    public void setFmaxarea(int fmaxarea) {
        this.fmaxarea = fmaxarea;
    }

    public BigDecimal getFunitprice() {
        return funitprice;
    }

    public void setFunitprice(BigDecimal funitprice) {
        this.funitprice = funitprice;
    }

    public BigDecimal getFgroupprice() {
        return fgroupprice;
    }

    public void setFgroupprice(BigDecimal fgroupprice) {
        this.fgroupprice = fgroupprice;
    }

    public int getFgrouptype() {
        return fgrouptype;
    }

    public void setFgrouptype(int fgrouptype) {
        this.fgrouptype = fgrouptype;
    }

    public String getSystime() {
        return systime;
    }

    public void setSystime(String systime) {
        this.systime = systime;
    }

    public long getSystimeLong() {
        return systimeLong;
    }

    public void setSystimeLong(long systimeLong) {
        this.systimeLong = systimeLong;
    }

    public double getfSoldNum() {
        return fSoldNum;
    }

    public void setfSoldNum(double fSoldNum) {
        this.fSoldNum = fSoldNum;
    }

    public boolean isfIsEnd() {
        return fIsEnd;
    }

    public void setfIsEnd(boolean fIsEnd) {
        this.fIsEnd = fIsEnd;
    }

    public String getFistop() {
        return fistop;
    }

    public void setFistop(String fistop) {
        this.fistop = fistop;
    }

    public String getFlabelname() {
        return flabelname;
    }

    public void setFlabelname(String flabelname) {
        this.flabelname = flabelname;
    }

    public String getFlabelurl() {
        return flabelurl;
    }

    public void setFlabelurl(String flabelurl) {
        this.flabelurl = flabelurl;
    }

    public int getfOpenGroup() {
        return fOpenGroup;
    }

    public void setfOpenGroup(int fOpenGroup) {
        this.fOpenGroup = fOpenGroup;
    }

    public String getFisdiplaysn() {
        return fisdiplaysn;
    }

    public void setFisdiplaysn(String fisdiplaysn) {
        this.fisdiplaysn = fisdiplaysn;
    }

    public String getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(String countOrder) {
        this.countOrder = countOrder;
    }

    public String getFisExistScheme() {
        return fisExistScheme;
    }

    public void setFisExistScheme(String fisExistScheme) {
        this.fisExistScheme = fisExistScheme;
    }

    public Integer getFuserBrowseAreaCode() {
        return fuserBrowseAreaCode;
    }

    public void setFuserBrowseAreaCode(Integer fuserBrowseAreaCode) {
        this.fuserBrowseAreaCode = fuserBrowseAreaCode;
    }

    @Override
    public String toString() {
        return "GroupBean{" +
                "fsupplierid='" + fsupplierid + '\'' +
                ", fproductname='" + fproductname + '\'' +
                ", fgrouptype=" + fgrouptype +
                ", fistop='" + fistop + '\'' +
                '}';
    }
}