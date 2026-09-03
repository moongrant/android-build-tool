package com.yalla.yalla.mixedroom.model;

import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.bean.AbsJavaBean;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class RoomConfiguration extends AbsJavaBean {
    private String barid;
    private String baridx;
    private String barimage;
    private int barlevel;
    private String barname;
    private int bartype;
    private int countryid;
    private String experience;
    private int experiencePercent;
    private int guestlive;
    public Boolean isAdminApplymic;
    public Boolean isAdminLockmic;
    public Boolean isManageEvent;
    private int isPrettyBarId;
    private int isfollow;
    private Boolean isforbidroom;
    private int ispwdroom;
    private int labelid;
    private String labelname;
    private String medal;
    private String notice;
    private ArrayList<ProfileLimitModel> profileLimit;
    private int varietyLevel;
    private int wage;
    private int own = 0;
    private int isencrypt = 0;
    private int dues = 0;
    private int membernum = 0;
    private int region = 0;
    private int isofficial = 0;

    public RoomConfiguration() {
        Boolean bool = Boolean.FALSE;
        this.isAdminLockmic = bool;
        this.isManageEvent = bool;
        this.isAdminApplymic = bool;
    }

    public Boolean getAdminLockmic() {
        return this.isAdminLockmic;
    }

    public String getBarid() {
        return this.barid;
    }

    public String getBaridx() {
        return this.baridx;
    }

    public String getBarimage() {
        return this.barimage;
    }

    public int getBarlevel() {
        return this.barlevel;
    }

    public String getBarname() {
        return this.barname;
    }

    public int getBartype() {
        return this.bartype;
    }

    public int getCountryid() {
        return this.countryid;
    }

    public int getDues() {
        return this.dues;
    }

    public String getExperience() {
        return this.experience;
    }

    public int getExperiencePercent() {
        return this.experiencePercent;
    }

    public Boolean getIsForBidRoom() {
        return this.isforbidroom;
    }

    public int getIsPrettyBarId() {
        return this.isPrettyBarId;
    }

    public int getIsencrypt() {
        return this.isencrypt;
    }

    public int getIsfollow() {
        return this.isfollow;
    }

    public int getIsofficial() {
        return this.isofficial;
    }

    public int getIspwdroom() {
        return this.ispwdroom;
    }

    public int getLabelid() {
        return this.labelid;
    }

    public String getLabelname() {
        return this.labelname;
    }

    public Boolean getManageEvent() {
        return this.isManageEvent;
    }

    public String getMedal() {
        return this.medal;
    }

    public int getMembernum() {
        return this.membernum;
    }

    public String getNotice() {
        return this.notice;
    }

    public int getOwn() {
        return this.own;
    }

    public ArrayList<ProfileLimitModel> getProfileLimit() {
        return this.profileLimit;
    }

    public int getRegion() {
        return this.region;
    }

    public int getVarietyLevel() {
        return this.varietyLevel;
    }

    public int getWage() {
        return this.wage;
    }

    public boolean isGuestlive() {
        return this.guestlive == 1;
    }

    public void setBarid(String str) {
        this.barid = str;
    }

    public void setBaridx(String str) {
        this.baridx = str;
    }

    public void setBarimage(String str) {
        this.barimage = str;
    }

    public void setBarlevel(int i) {
        this.barlevel = i;
    }

    public void setBarname(String str) {
        this.barname = str;
    }

    public void setBartype(int i) {
        this.bartype = i;
    }

    public void setCountryid(int i) {
        this.countryid = i;
    }

    public void setDues(int i) {
        this.dues = i;
    }

    public void setExperience(String str) {
        this.experience = str;
    }

    public void setExperiencePercent(int i) {
        this.experiencePercent = i;
    }

    public void setGuestlive(boolean z) {
        this.guestlive = z ? 1 : 0;
    }

    public void setIsencrypt(int i) {
        this.isencrypt = i;
    }

    public void setIsfollow(int i) {
        this.isfollow = i;
    }

    public void setIsofficial(int i) {
        this.isofficial = i;
    }

    public void setIspwdroom(int i) {
        this.ispwdroom = i;
    }

    public void setLabelid(int i) {
        this.labelid = i;
    }

    public void setLabelname(String str) {
        this.labelname = str;
    }

    public void setManageEvent(Boolean bool) {
        this.isManageEvent = bool;
    }

    public void setMedal(String str) {
        this.medal = str;
    }

    public void setMembernum(int i) {
        this.membernum = i;
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public void setOwn(int i) {
        this.own = i;
    }

    public void setProfileLimit(ArrayList<ProfileLimitModel> arrayList) {
        this.profileLimit = arrayList;
    }

    public void setRegion(int i) {
        this.region = i;
    }

    public void setVarietyLevel(int i) {
        this.varietyLevel = i;
    }

    public void setWage(int i) {
        this.wage = i;
    }

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        return "RoomConfiguration{ \n barid='" + this.barid + "',\n baridx='" + this.baridx + "',\n own=" + this.own + ",\n labelid=" + this.labelid + ",\n labelname='" + this.labelname + "',\n bartype=" + this.bartype + ",\n barlevel=" + this.barlevel + ",\n experience='" + this.experience + "',\n experiencePercent=" + this.experiencePercent + ",\n barname='" + this.barname + "',\n notice='" + this.notice + "',\n wage=" + this.wage + ",\n barimage='" + this.barimage + "',\n isfollow=" + this.isfollow + ",\n isencrypt=" + this.isencrypt + ",\n ispwdroom=" + this.ispwdroom + ",\n isManageEvent=" + this.isManageEvent + ",\n countryid=" + this.countryid + ",\n dues=" + this.dues + ",\n membernum=" + this.membernum + ",\n region=" + this.region + ",\n isofficial=" + this.isofficial + ",\n guestlive=" + this.guestlive + ",\n isforbidroom=" + this.isforbidroom + ",\n isPrettyBarId=" + this.isPrettyBarId + ",\n varietyLevel=" + this.varietyLevel + ",\n medal='" + this.medal + "',\n profileLimit=" + this.profileLimit + '}';
    }
}
