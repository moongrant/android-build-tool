package com.app.base.mixedroom.model;

import OooO00o.OooO00o;
import com.app.base.bean.AbsJavaBean;
import com.app.base.model.ProfileLimitModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
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

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("RoomConfiguration{ \n barid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barid, '\'', ",\n baridx='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.baridx, '\'', ",\n own=");
        sbOooO0o0.append(this.own);
        sbOooO0o0.append(",\n labelid=");
        sbOooO0o0.append(this.labelid);
        sbOooO0o0.append(",\n labelname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.labelname, '\'', ",\n bartype=");
        sbOooO0o0.append(this.bartype);
        sbOooO0o0.append(",\n barlevel=");
        sbOooO0o0.append(this.barlevel);
        sbOooO0o0.append(",\n experience='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.experience, '\'', ",\n experiencePercent=");
        sbOooO0o0.append(this.experiencePercent);
        sbOooO0o0.append(",\n barname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barname, '\'', ",\n notice='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.notice, '\'', ",\n wage=");
        sbOooO0o0.append(this.wage);
        sbOooO0o0.append(",\n barimage='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barimage, '\'', ",\n isfollow=");
        sbOooO0o0.append(this.isfollow);
        sbOooO0o0.append(",\n isencrypt=");
        sbOooO0o0.append(this.isencrypt);
        sbOooO0o0.append(",\n ispwdroom=");
        sbOooO0o0.append(this.ispwdroom);
        sbOooO0o0.append(",\n isManageEvent=");
        sbOooO0o0.append(this.isManageEvent);
        sbOooO0o0.append(",\n countryid=");
        sbOooO0o0.append(this.countryid);
        sbOooO0o0.append(",\n dues=");
        sbOooO0o0.append(this.dues);
        sbOooO0o0.append(",\n membernum=");
        sbOooO0o0.append(this.membernum);
        sbOooO0o0.append(",\n region=");
        sbOooO0o0.append(this.region);
        sbOooO0o0.append(",\n isofficial=");
        sbOooO0o0.append(this.isofficial);
        sbOooO0o0.append(",\n guestlive=");
        sbOooO0o0.append(this.guestlive);
        sbOooO0o0.append(",\n isforbidroom=");
        sbOooO0o0.append(this.isforbidroom);
        sbOooO0o0.append(",\n isPrettyBarId=");
        sbOooO0o0.append(this.isPrettyBarId);
        sbOooO0o0.append(",\n varietyLevel=");
        sbOooO0o0.append(this.varietyLevel);
        sbOooO0o0.append(",\n medal='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.medal, '\'', ",\n profileLimit=");
        sbOooO0o0.append(this.profileLimit);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
