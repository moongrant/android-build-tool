package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.TagListModel;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0002\u008f\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\u001a\u00103\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR\u001a\u00106\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\f\"\u0004\b8\u0010\u000eR\u001a\u00109\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\bR\u001a\u0010>\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0006\"\u0004\b@\u0010\bR\u001a\u0010A\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0006\"\u0004\bC\u0010\bR\u001a\u0010D\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0006\"\u0004\bF\u0010\bR\u001a\u0010G\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0006\"\u0004\bI\u0010\bR\u001c\u0010J\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u000eR\u001a\u0010M\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u000eR\u001c\u0010P\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\u000eR\u001c\u0010S\u001a\u0004\u0018\u00010TX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010Y\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\f\"\u0004\b[\u0010\u000eR.\u0010\\\u001a\u0016\u0012\u0004\u0012\u00020^\u0018\u00010]j\n\u0012\u0004\u0012\u00020^\u0018\u0001`_X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0006\"\u0004\bf\u0010\bR\u001a\u0010g\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0006\"\u0004\bi\u0010\bR\u001c\u0010j\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\f\"\u0004\bl\u0010\u000eR\u001a\u0010m\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0015\"\u0004\bo\u0010\u0017R\u001a\u0010p\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0015\"\u0004\br\u0010\u0017R\u001a\u0010s\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0006\"\u0004\bu\u0010\bR\u001c\u0010v\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\f\"\u0004\bx\u0010\u000eR\u001c\u0010y\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\f\"\u0004\b{\u0010\u000eR.\u0010|\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010}0]j\n\u0012\u0006\u0012\u0004\u0018\u00010}`_X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010a\"\u0004\b\u007f\u0010cR\u001d\u0010\u0080\u0001\u001a\u00020\u0013X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u0015\"\u0005\b\u0082\u0001\u0010\u0017R\u001f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\f\"\u0005\b\u0085\u0001\u0010\u000eR\u001d\u0010\u0086\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\u0006\"\u0005\b\u0088\u0001\u0010\bR\u001d\u0010\u0089\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u0006\"\u0005\b\u008b\u0001\u0010\bR\u001d\u0010\u008c\u0001\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\u0006\"\u0005\b\u008e\u0001\u0010\b¨\u0006\u0090\u0001"}, d2 = {"Lcom/yalla/yalla/model/user/UserInfoApiModel;", "Ljava/io/Serializable;", "()V", "age", "", "getAge", "()I", "setAge", "(I)V", "backgroundPicture", "", "getBackgroundPicture", "()Ljava/lang/String;", "setBackgroundPicture", "(Ljava/lang/String;)V", "birthday", "getBirthday", "setBirthday", "coin", "", "getCoin", "()J", "setCoin", "(J)V", "coinFrozen", "", "getCoinFrozen", "()Z", "setCoinFrozen", "(Z)V", "countryid", "getCountryid", "setCountryid", "crystal", "getCrystal", "setCrystal", "debtAmount", "getDebtAmount", "setDebtAmount", "fansnum", "getFansnum", "setFansnum", "followednum", "getFollowednum", "setFollowednum", "hePullBlack", "getHePullBlack", "setHePullBlack", "headframeurl", "getHeadframeurl", "setHeadframeurl", "headurl", "getHeadurl", "setHeadurl", "id", "getId", "setId", "inroom", "getInroom", "setInroom", "isBlackUser", "setBlackUser", "isfollow", "getIsfollow", "setIsfollow", "isfriend", "getIsfriend", "setIsfriend", "isnewuser", "getIsnewuser", "setIsnewuser", "isprettypara", "getIsprettypara", "setIsprettypara", "medal", "getMedal", "setMedal", "memoName", "getMemoName", "setMemoName", "nickname", "getNickname", "setNickname", "power", "Lcom/yalla/yalla/model/user/UserInfoApiModel$PowerBean;", "getPower", "()Lcom/yalla/yalla/model/user/UserInfoApiModel$PowerBean;", "setPower", "(Lcom/yalla/yalla/model/user/UserInfoApiModel$PowerBean;)V", "prettyid", "getPrettyid", "setPrettyid", "profileLimit", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/ProfileLimitModel;", "Lkotlin/collections/ArrayList;", "getProfileLimit", "()Ljava/util/ArrayList;", "setProfileLimit", "(Ljava/util/ArrayList;)V", "pullblack", "getPullblack", "setPullblack", "region", "getRegion", "setRegion", "regtime", "getRegtime", "setRegtime", "rfollowNum", "getRfollowNum", "setRfollowNum", "rjoinNum", "getRjoinNum", "setRjoinNum", "role", "getRole", "setRole", "sex", "getSex", "setSex", "sign", "getSign", "setSign", "tags", "Lcom/yalla/yalla/model/TagListModel$TagInfo;", "getTags", "setTags", "timestamp", "getTimestamp", "setTimestamp", "userlevel", "getUserlevel", "setUserlevel", "vip", "getVip", "setVip", "viplevel", "getViplevel", "setViplevel", "visitornum", "getVisitornum", "setVisitornum", "PowerBean", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UserInfoApiModel implements Serializable {
    public static final int $stable = 8;
    private int age;

    @Nullable
    private String backgroundPicture;

    @Nullable
    private String birthday;
    private long coin;
    private boolean coinFrozen;

    @Nullable
    private String countryid;
    private long crystal;
    private int debtAmount;
    private int fansnum;
    private int followednum;
    private int hePullBlack;

    @Nullable
    private String headframeurl;
    private long inroom;
    private int isBlackUser;
    private int isfollow;
    private int isfriend;
    private int isnewuser;
    private int isprettypara;

    @Nullable
    private String medal;

    @Nullable
    private String nickname;

    @Nullable
    private PowerBean power;

    @Nullable
    private String prettyid;

    @Nullable
    private ArrayList<ProfileLimitModel> profileLimit;
    private int pullblack;

    @Nullable
    private String regtime;
    private long rfollowNum;
    private long rjoinNum;
    private int role;

    @Nullable
    private String sex;

    @Nullable
    private String sign;
    private long timestamp;

    @Nullable
    private String userlevel;
    private int vip;
    private int viplevel;
    private int visitornum;

    @NotNull
    private String memoName = "";

    @NotNull
    private String id = "";

    @NotNull
    private String headurl = "";
    private int region = -1;

    @NotNull
    private ArrayList<TagListModel.TagInfo> tags = new ArrayList<>();

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/model/user/UserInfoApiModel$PowerBean;", "Ljava/io/Serializable;", "()V", "isWaterMark", "", "()I", "setWaterMark", "(I)V", "isverify", "getIsverify", "setIsverify", "seeinroom", "getSeeinroom", "setSeeinroom", "seeroom", "getSeeroom", "setSeeroom", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PowerBean implements Serializable {
        public static final int $stable = 8;
        private int isWaterMark;
        private int isverify;
        private int seeinroom;
        private int seeroom;

        public final int getIsverify() {
            return this.isverify;
        }

        public final int getSeeinroom() {
            return this.seeinroom;
        }

        public final int getSeeroom() {
            return this.seeroom;
        }

        /* JADX INFO: renamed from: isWaterMark, reason: from getter */
        public final int getIsWaterMark() {
            return this.isWaterMark;
        }

        public final void setIsverify(int i) {
            this.isverify = i;
        }

        public final void setSeeinroom(int i) {
            this.seeinroom = i;
        }

        public final void setSeeroom(int i) {
            this.seeroom = i;
        }

        public final void setWaterMark(int i) {
            this.isWaterMark = i;
        }
    }

    public final int getAge() {
        return this.age;
    }

    @Nullable
    public final String getBackgroundPicture() {
        return this.backgroundPicture;
    }

    @Nullable
    public final String getBirthday() {
        return this.birthday;
    }

    public final long getCoin() {
        return this.coin;
    }

    public final boolean getCoinFrozen() {
        return this.coinFrozen;
    }

    @Nullable
    public final String getCountryid() {
        return this.countryid;
    }

    public final long getCrystal() {
        return this.crystal;
    }

    public final int getDebtAmount() {
        return this.debtAmount;
    }

    public final int getFansnum() {
        return this.fansnum;
    }

    public final int getFollowednum() {
        return this.followednum;
    }

    public final int getHePullBlack() {
        return this.hePullBlack;
    }

    @Nullable
    public final String getHeadframeurl() {
        return this.headframeurl;
    }

    @NotNull
    public final String getHeadurl() {
        return this.headurl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getInroom() {
        return this.inroom;
    }

    public final int getIsfollow() {
        return this.isfollow;
    }

    public final int getIsfriend() {
        return this.isfriend;
    }

    public final int getIsnewuser() {
        return this.isnewuser;
    }

    public final int getIsprettypara() {
        return this.isprettypara;
    }

    @Nullable
    public final String getMedal() {
        return this.medal;
    }

    @NotNull
    public final String getMemoName() {
        return this.memoName;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final PowerBean getPower() {
        return this.power;
    }

    @Nullable
    public final String getPrettyid() {
        return this.prettyid;
    }

    @Nullable
    public final ArrayList<ProfileLimitModel> getProfileLimit() {
        return this.profileLimit;
    }

    public final int getPullblack() {
        return this.pullblack;
    }

    public final int getRegion() {
        return this.region;
    }

    @Nullable
    public final String getRegtime() {
        return this.regtime;
    }

    public final long getRfollowNum() {
        return this.rfollowNum;
    }

    public final long getRjoinNum() {
        return this.rjoinNum;
    }

    public final int getRole() {
        return this.role;
    }

    @Nullable
    public final String getSex() {
        return this.sex;
    }

    @Nullable
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    public final ArrayList<TagListModel.TagInfo> getTags() {
        return this.tags;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getUserlevel() {
        return this.userlevel;
    }

    public final int getVip() {
        return this.vip;
    }

    public final int getViplevel() {
        return this.viplevel;
    }

    public final int getVisitornum() {
        return this.visitornum;
    }

    /* JADX INFO: renamed from: isBlackUser, reason: from getter */
    public final int getIsBlackUser() {
        return this.isBlackUser;
    }

    public final void setAge(int i) {
        this.age = i;
    }

    public final void setBackgroundPicture(@Nullable String str) {
        this.backgroundPicture = str;
    }

    public final void setBirthday(@Nullable String str) {
        this.birthday = str;
    }

    public final void setBlackUser(int i) {
        this.isBlackUser = i;
    }

    public final void setCoin(long j) {
        this.coin = j;
    }

    public final void setCoinFrozen(boolean z) {
        this.coinFrozen = z;
    }

    public final void setCountryid(@Nullable String str) {
        this.countryid = str;
    }

    public final void setCrystal(long j) {
        this.crystal = j;
    }

    public final void setDebtAmount(int i) {
        this.debtAmount = i;
    }

    public final void setFansnum(int i) {
        this.fansnum = i;
    }

    public final void setFollowednum(int i) {
        this.followednum = i;
    }

    public final void setHePullBlack(int i) {
        this.hePullBlack = i;
    }

    public final void setHeadframeurl(@Nullable String str) {
        this.headframeurl = str;
    }

    public final void setHeadurl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headurl = str;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setInroom(long j) {
        this.inroom = j;
    }

    public final void setIsfollow(int i) {
        this.isfollow = i;
    }

    public final void setIsfriend(int i) {
        this.isfriend = i;
    }

    public final void setIsnewuser(int i) {
        this.isnewuser = i;
    }

    public final void setIsprettypara(int i) {
        this.isprettypara = i;
    }

    public final void setMedal(@Nullable String str) {
        this.medal = str;
    }

    public final void setMemoName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.memoName = str;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setPower(@Nullable PowerBean powerBean) {
        this.power = powerBean;
    }

    public final void setPrettyid(@Nullable String str) {
        this.prettyid = str;
    }

    public final void setProfileLimit(@Nullable ArrayList<ProfileLimitModel> arrayList) {
        this.profileLimit = arrayList;
    }

    public final void setPullblack(int i) {
        this.pullblack = i;
    }

    public final void setRegion(int i) {
        this.region = i;
    }

    public final void setRegtime(@Nullable String str) {
        this.regtime = str;
    }

    public final void setRfollowNum(long j) {
        this.rfollowNum = j;
    }

    public final void setRjoinNum(long j) {
        this.rjoinNum = j;
    }

    public final void setRole(int i) {
        this.role = i;
    }

    public final void setSex(@Nullable String str) {
        this.sex = str;
    }

    public final void setSign(@Nullable String str) {
        this.sign = str;
    }

    public final void setTags(@NotNull ArrayList<TagListModel.TagInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.tags = arrayList;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setUserlevel(@Nullable String str) {
        this.userlevel = str;
    }

    public final void setVip(int i) {
        this.vip = i;
    }

    public final void setViplevel(int i) {
        this.viplevel = i;
    }

    public final void setVisitornum(int i) {
        this.visitornum = i;
    }
}
