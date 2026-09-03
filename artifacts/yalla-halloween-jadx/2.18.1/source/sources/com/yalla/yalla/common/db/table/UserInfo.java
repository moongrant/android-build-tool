package com.yalla.yalla.common.db.table;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.app.base.model.TagListModel;
import com.app.base.model.UserInfoApiModel;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.common.db.converter.TagConverter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"userId"})}, tableName = "UserInfoTable")
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b=\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0017\u0018\u00002\u00020\u0001:\u0002stB\u0007¢\u0006\u0004\bq\u0010rJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000J\b\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\"\u0010$\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R$\u0010'\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R$\u0010*\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\"\u0010-\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R\"\u00100\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R$\u00103\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0015\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019R\"\u00106\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0015\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010\u0019R\"\u00109\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001c\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010 R\"\u0010<\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001c\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\"\u0010?\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001c\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 R$\u0010B\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0015\u001a\u0004\bC\u0010\u0017\"\u0004\bD\u0010\u0019R\"\u0010E\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u0010\u001c\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010 R\"\u0010H\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010\u001c\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010 R\"\u0010K\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010\u001c\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010 R\"\u0010N\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010\u001c\u001a\u0004\bO\u0010\u001e\"\u0004\bP\u0010 R*\u0010R\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020\u001a8F@FX\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010\u001c\u001a\u0004\bS\u0010\u001e\"\u0004\bT\u0010 R\"\u0010U\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010\u001c\u001a\u0004\bV\u0010\u001e\"\u0004\bW\u0010 R(\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R*\u0010`\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u00078F@FX\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\b`\u0010b\"\u0004\bc\u0010dR*\u0010e\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020\u001a8V@VX\u0097\u000e¢\u0006\u0012\n\u0004\be\u0010\u001c\u001a\u0004\bf\u0010\u001e\"\u0004\bg\u0010 R*\u0010h\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020\u001a8F@FX\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010\u001c\u001a\u0004\bi\u0010\u001e\"\u0004\bj\u0010 R*\u0010k\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020\u001a8F@FX\u0087\u000e¢\u0006\u0012\n\u0004\bk\u0010\u001c\u001a\u0004\bl\u0010\u001e\"\u0004\bm\u0010 R*\u0010n\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u00078F@FX\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010a\u001a\u0004\bo\u0010b\"\u0004\bp\u0010d¨\u0006u"}, d2 = {"Lcom/yalla/yalla/common/db/table/UserInfo;", "Ljava/io/Serializable;", "userInfo", "", "updateInfo", "Lcom/app/base/model/UserInfoApiModel;", "toOldModel", "", "areItemShowContentsTheSame", "", "toString", "isOfficialRole", "isNotMangerRole", "", "userId", "J", "getUserId", "()J", "setUserId", "(J)V", "userIdx", "Ljava/lang/String;", "getUserIdx", "()Ljava/lang/String;", "setUserIdx", "(Ljava/lang/String;)V", "", "idLevel", "I", "getIdLevel", "()I", "setIdLevel", "(I)V", "userName", "getUserName", "setUserName", "userHeader", "getUserHeader", "setUserHeader", "userHeaderFrame", "getUserHeaderFrame", "setUserHeaderFrame", "background", "getBackground", "setBackground", "userLevel", "getUserLevel", "setUserLevel", "sex", "getSex", "setSex", "bio", "getBio", "setBio", "birthday", "getBirthday", "setBirthday", "age", "getAge", "setAge", "countryId", "getCountryId", "setCountryId", "region", "getRegion", "setRegion", "medal", "getMedal", "setMedal", "visitorNum", "getVisitorNum", "setVisitorNum", "followedNum", "getFollowedNum", "setFollowedNum", "fansNum", "getFansNum", "setFansNum", "joinRoomNum", "getJoinRoomNum", "setJoinRoomNum", AppMeasurementSdk.ConditionalUserProperty.VALUE, "role", "getRole", "setRole", "regTime", "getRegTime", "setRegTime", "", "Lcom/yalla/yalla/common/db/table/UserInfo$TagInfo;", "tags", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "isPremium", "Z", "()Z", "setPremium", "(Z)V", "premiumLevel", "getPremiumLevel", "setPremiumLevel", "vipState", "getVipState", "setVipState", "vipLevel", "getVipLevel", "setVipLevel", "showVIP", "getShowVIP", "setShowVIP", "<init>", "()V", "Role", "TagInfo", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class UserInfo implements Serializable {
    public static final int $stable = 8;

    @SerializedName("age")
    @ColumnInfo(name = "age")
    private int age;

    @SerializedName(alternate = {"countryid"}, value = "countryId")
    @ColumnInfo(name = "countryId")
    private int countryId;

    @SerializedName(alternate = {"fansnum"}, value = "fansNum")
    @ColumnInfo(name = "fansNum")
    private int fansNum;

    @SerializedName(alternate = {"followednum"}, value = "followedNum")
    @ColumnInfo(name = "followedNum")
    private int followedNum;

    @SerializedName(alternate = {"isPrettyPara", "isprettypara"}, value = "idLevel")
    @ColumnInfo(name = "idLevel")
    private int idLevel;

    @SerializedName(alternate = {"nIsVIP", "isVip"}, value = "isVIP")
    @ColumnInfo(name = "vip")
    private boolean isPremium;

    @SerializedName(alternate = {"rjoinNum"}, value = "joinRoomNum")
    @ColumnInfo(name = "joinRoomNum")
    private int joinRoomNum;

    @SerializedName(alternate = {"nVipLv", "nvipLv"}, value = "nVIPLv")
    @ColumnInfo(name = "vipLevel")
    private int premiumLevel;

    @SerializedName(alternate = {"regtime"}, value = "regTime")
    @ColumnInfo(name = "regTime")
    private int regTime;

    @SerializedName("region")
    @ColumnInfo(name = "region")
    private int region;

    @SerializedName("role")
    @ColumnInfo(name = "role")
    private int role;

    @SerializedName(alternate = {"id", "userid", "uid"}, value = "userId")
    @PrimaryKey
    @ColumnInfo(name = "userId")
    private long userId;

    @SerializedName(alternate = {"userlevel", "level"}, value = "userLevel")
    @ColumnInfo(name = "userLevel")
    private int userLevel;

    @SerializedName(alternate = {"kaVipLv", "kaviplv", "kavipLv"}, value = "kaVIPLv")
    @ColumnInfo(name = "kaVipLevel")
    private int vipLevel;

    @SerializedName(alternate = {"kaVipState", "kavipstate"}, value = "kaVIPState")
    @ColumnInfo(name = "kaVipState")
    private int vipState;

    @SerializedName(alternate = {"visitornum"}, value = "visitorNum")
    @ColumnInfo(name = "visitorNum")
    private int visitorNum;

    @SerializedName(alternate = {"prettyid", "prettyId", "idx"}, value = "userIdx")
    @ColumnInfo(name = "userIdx")
    @NotNull
    private String userIdx = "";

    @SerializedName(alternate = {"nickname", "username", "nickName", "name"}, value = "userName")
    @ColumnInfo(name = "userName")
    @NotNull
    private String userName = "";

    @SerializedName(alternate = {"imageurl", "imageUrl", "headurl", "headUrl", "headphoto", "headImg"}, value = "userAvatar")
    @ColumnInfo(name = "userAvatar")
    @NotNull
    private String userHeader = "";

    @SerializedName(alternate = {"headframeurl"}, value = "userFrame")
    @ColumnInfo(name = "userFrame")
    @Nullable
    private String userHeaderFrame = "";

    @SerializedName(alternate = {"backgroundPicture"}, value = "background")
    @ColumnInfo(name = "background")
    @Nullable
    private String background = "";

    @SerializedName(alternate = {"sex"}, value = "gender")
    @ColumnInfo(name = "gender")
    private int sex = 2;

    @SerializedName(alternate = {"sign"}, value = "bio")
    @ColumnInfo(name = "bio")
    @Nullable
    private String bio = "";

    @SerializedName("birthday")
    @ColumnInfo(name = "birthday")
    @NotNull
    private String birthday = "";

    @SerializedName("medal")
    @ColumnInfo(name = "medal")
    @Nullable
    private String medal = "";

    @Ignore
    @Nullable
    private transient o0O00OO<Integer> _role = o0OOO00.OooO0Oo(0);

    @TypeConverters({TagConverter.class})
    @SerializedName("tags")
    @ColumnInfo(name = "tags")
    @NotNull
    private List<TagInfo> tags = new ArrayList();

    @Ignore
    @Nullable
    private transient o0O00OO<Boolean> _isPremium = o0OOO00.OooO0Oo(Boolean.FALSE);

    @Ignore
    @Nullable
    private transient o0O00OO<Integer> _premiumLevel = o0OOO00.OooO0Oo(0);

    @Ignore
    @Nullable
    private transient o0O00OO<Integer> _vipState = o0OOO00.OooO0Oo(0);

    @Ignore
    @Nullable
    private transient o0O00OO<Integer> _vipLevel = o0OOO00.OooO0Oo(0);

    @SerializedName(alternate = {"showkavip", "showKAVIP"}, value = "showVIP")
    @ColumnInfo(defaultValue = "1", name = "showVIP")
    private boolean showVIP = true;

    @Ignore
    @Nullable
    private transient o0O00OO<Boolean> _showVIP = o0OOO00.OooO0Oo(Boolean.TRUE);

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/common/db/table/UserInfo$Role;", "", "()V", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Role {
        public static final int $stable = 0;
        public static final int All = 4;
        public static final int Manager = 1;
        public static final int Official = 2;
        public static final int SimpleManager = 5;
        public static final int User = 0;
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/common/db/table/UserInfo$TagInfo;", "Ljava/io/Serializable;", "()V", "tagId", "", "getTagId", "()I", "setTagId", "(I)V", "tagName", "", "getTagName", "()Ljava/lang/String;", "setTagName", "(Ljava/lang/String;)V", "typeId", "getTypeId", "setTypeId", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class TagInfo implements Serializable {
        public static final int $stable = 8;

        @SerializedName("tagId")
        @ColumnInfo(name = "tagId")
        private int tagId;

        @SerializedName("tagName")
        @ColumnInfo(name = "tagName")
        @NotNull
        private String tagName = "";

        @SerializedName("typeId")
        @ColumnInfo(name = "typeId")
        private int typeId;

        public final int getTagId() {
            return this.tagId;
        }

        @NotNull
        public final String getTagName() {
            return this.tagName;
        }

        public final int getTypeId() {
            return this.typeId;
        }

        public final void setTagId(int i) {
            this.tagId = i;
        }

        public final void setTagName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.tagName = str;
        }

        public final void setTypeId(int i) {
            this.typeId = i;
        }

        @NotNull
        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TagInfo(tagId=");
            sbOooO0o0.append(this.tagId);
            sbOooO0o0.append(", typeId=");
            sbOooO0o0.append(this.typeId);
            sbOooO0o0.append(", tagName='");
            return OooO.OooO00o(sbOooO0o0, this.tagName, "')");
        }
    }

    public final boolean areItemShowContentsTheSame(@Nullable UserInfo userInfo) {
        return (userInfo != null && isPremium() == userInfo.isPremium()) && getPremiumLevel() == userInfo.getPremiumLevel() && Intrinsics.areEqual(this.userName, userInfo.userName) && Intrinsics.areEqual(this.userIdx, userInfo.userIdx) && Intrinsics.areEqual(this.userHeader, userInfo.userHeader) && Intrinsics.areEqual(this.userHeaderFrame, userInfo.userHeaderFrame) && Intrinsics.areEqual(this.bio, userInfo.bio) && this.age == userInfo.age && this.countryId == userInfo.countryId && this.sex == userInfo.sex && this.idLevel == userInfo.idLevel && Intrinsics.areEqual(this.medal, userInfo.medal) && getRole() == userInfo.getRole();
    }

    public final int getAge() {
        return this.age;
    }

    @Nullable
    public final String getBackground() {
        return this.background;
    }

    @Nullable
    public final String getBio() {
        return this.bio;
    }

    @NotNull
    public final String getBirthday() {
        return this.birthday;
    }

    public final int getCountryId() {
        return this.countryId;
    }

    public final int getFansNum() {
        return this.fansNum;
    }

    public final int getFollowedNum() {
        return this.followedNum;
    }

    public final int getIdLevel() {
        return this.idLevel;
    }

    public final int getJoinRoomNum() {
        return this.joinRoomNum;
    }

    @Nullable
    public final String getMedal() {
        return this.medal;
    }

    public int getPremiumLevel() {
        if (this._premiumLevel == null) {
            this._premiumLevel = o0OOO00.OooO0Oo(Integer.valueOf(this.premiumLevel));
        }
        int i = this.premiumLevel;
        o0O00OO<Integer> o0o00oo2 = this._premiumLevel;
        Intrinsics.checkNotNull(o0o00oo2);
        if (i != o0o00oo2.getValue().intValue()) {
            o0O00OO<Integer> o0o00oo3 = this._premiumLevel;
            Intrinsics.checkNotNull(o0o00oo3);
            o0o00oo3.setValue(Integer.valueOf(this.premiumLevel));
        }
        o0O00OO<Integer> o0o00oo4 = this._premiumLevel;
        Intrinsics.checkNotNull(o0o00oo4);
        return o0o00oo4.getValue().intValue();
    }

    public final int getRegTime() {
        return this.regTime;
    }

    public final int getRegion() {
        return this.region;
    }

    public final int getRole() {
        if (this._role == null) {
            this._role = o0OOO00.OooO0Oo(Integer.valueOf(this.role));
        }
        int i = this.role;
        o0O00OO<Integer> o0o00oo2 = this._role;
        Intrinsics.checkNotNull(o0o00oo2);
        if (i != o0o00oo2.getValue().intValue()) {
            o0O00OO<Integer> o0o00oo3 = this._role;
            Intrinsics.checkNotNull(o0o00oo3);
            o0o00oo3.setValue(Integer.valueOf(this.role));
        }
        o0O00OO<Integer> o0o00oo4 = this._role;
        Intrinsics.checkNotNull(o0o00oo4);
        return o0o00oo4.getValue().intValue();
    }

    public final int getSex() {
        return this.sex;
    }

    public final boolean getShowVIP() {
        if (this._showVIP == null) {
            this._showVIP = o0OOO00.OooO0Oo(Boolean.valueOf(this.showVIP));
        }
        boolean z = this.showVIP;
        o0O00OO<Boolean> o0o00oo2 = this._showVIP;
        Intrinsics.checkNotNull(o0o00oo2);
        if (z != o0o00oo2.getValue().booleanValue()) {
            o0O00OO<Boolean> o0o00oo3 = this._showVIP;
            Intrinsics.checkNotNull(o0o00oo3);
            o0o00oo3.setValue(Boolean.valueOf(this.showVIP));
        }
        o0O00OO<Boolean> o0o00oo4 = this._showVIP;
        Intrinsics.checkNotNull(o0o00oo4);
        return o0o00oo4.getValue().booleanValue();
    }

    @NotNull
    public final List<TagInfo> getTags() {
        return this.tags;
    }

    @NotNull
    public final String getUserHeader() {
        return this.userHeader;
    }

    @Nullable
    public final String getUserHeaderFrame() {
        return this.userHeaderFrame;
    }

    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUserIdx() {
        return this.userIdx;
    }

    public final int getUserLevel() {
        return this.userLevel;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public final int getVipLevel() {
        if (this._vipLevel == null) {
            this._vipLevel = o0OOO00.OooO0Oo(Integer.valueOf(this.vipLevel));
        }
        int i = this.vipLevel;
        o0O00OO<Integer> o0o00oo2 = this._vipLevel;
        Intrinsics.checkNotNull(o0o00oo2);
        if (i != o0o00oo2.getValue().intValue()) {
            o0O00OO<Integer> o0o00oo3 = this._vipLevel;
            Intrinsics.checkNotNull(o0o00oo3);
            o0o00oo3.setValue(Integer.valueOf(this.vipLevel));
        }
        o0O00OO<Integer> o0o00oo4 = this._vipLevel;
        Intrinsics.checkNotNull(o0o00oo4);
        return o0o00oo4.getValue().intValue();
    }

    public final int getVipState() {
        if (this._vipState == null) {
            this._vipState = o0OOO00.OooO0Oo(Integer.valueOf(this.vipState));
        }
        int i = this.vipState;
        o0O00OO<Integer> o0o00oo2 = this._vipState;
        Intrinsics.checkNotNull(o0o00oo2);
        if (i != o0o00oo2.getValue().intValue()) {
            o0O00OO<Integer> o0o00oo3 = this._vipState;
            Intrinsics.checkNotNull(o0o00oo3);
            o0o00oo3.setValue(Integer.valueOf(this.vipState));
        }
        o0O00OO<Integer> o0o00oo4 = this._vipState;
        Intrinsics.checkNotNull(o0o00oo4);
        return o0o00oo4.getValue().intValue();
    }

    public final int getVisitorNum() {
        return this.visitorNum;
    }

    public final boolean isNotMangerRole() {
        return getRole() == 2 || getRole() == 0;
    }

    public final boolean isOfficialRole() {
        return getRole() == 2 || getRole() == 4;
    }

    public final boolean isPremium() {
        if (this._isPremium == null) {
            this._isPremium = o0OOO00.OooO0Oo(Boolean.valueOf(this.isPremium));
        }
        boolean z = this.isPremium;
        o0O00OO<Boolean> o0o00oo2 = this._isPremium;
        Intrinsics.checkNotNull(o0o00oo2);
        if (z != o0o00oo2.getValue().booleanValue()) {
            o0O00OO<Boolean> o0o00oo3 = this._isPremium;
            Intrinsics.checkNotNull(o0o00oo3);
            o0o00oo3.setValue(Boolean.valueOf(this.isPremium));
        }
        o0O00OO<Boolean> o0o00oo4 = this._isPremium;
        Intrinsics.checkNotNull(o0o00oo4);
        return o0o00oo4.getValue().booleanValue();
    }

    public final void setAge(int i) {
        this.age = i;
    }

    public final void setBackground(@Nullable String str) {
        this.background = str;
    }

    public final void setBio(@Nullable String str) {
        this.bio = str;
    }

    public final void setBirthday(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.birthday = str;
    }

    public final void setCountryId(int i) {
        this.countryId = i;
    }

    public final void setFansNum(int i) {
        this.fansNum = i;
    }

    public final void setFollowedNum(int i) {
        this.followedNum = i;
    }

    public final void setIdLevel(int i) {
        this.idLevel = i;
    }

    public final void setJoinRoomNum(int i) {
        this.joinRoomNum = i;
    }

    public final void setMedal(@Nullable String str) {
        this.medal = str;
    }

    public final void setPremium(boolean z) {
        this.isPremium = z;
        if (this._isPremium == null) {
            this._isPremium = o0OOO00.OooO0Oo(Boolean.valueOf(z));
        }
        o0O00OO<Boolean> o0o00oo2 = this._isPremium;
        Intrinsics.checkNotNull(o0o00oo2);
        o0o00oo2.setValue(Boolean.valueOf(z));
    }

    public void setPremiumLevel(int i) {
        this.premiumLevel = i;
        if (this._premiumLevel == null) {
            this._premiumLevel = o0OOO00.OooO0Oo(Integer.valueOf(i));
        }
        o0O00OO<Integer> o0o00oo2 = this._premiumLevel;
        Intrinsics.checkNotNull(o0o00oo2);
        o0o00oo2.setValue(Integer.valueOf(i));
    }

    public final void setRegTime(int i) {
        this.regTime = i;
    }

    public final void setRegion(int i) {
        this.region = i;
    }

    public final void setRole(int i) {
        this.role = i;
        if (this._role == null) {
            this._role = o0OOO00.OooO0Oo(Integer.valueOf(i));
        }
        o0O00OO<Integer> o0o00oo2 = this._role;
        Intrinsics.checkNotNull(o0o00oo2);
        o0o00oo2.setValue(Integer.valueOf(i));
    }

    public final void setSex(int i) {
        this.sex = i;
    }

    public final void setShowVIP(boolean z) {
        this.showVIP = z;
        if (this._showVIP == null) {
            this._showVIP = o0OOO00.OooO0Oo(Boolean.valueOf(z));
        }
        o0O00OO<Boolean> o0o00oo2 = this._showVIP;
        Intrinsics.checkNotNull(o0o00oo2);
        o0o00oo2.setValue(Boolean.valueOf(z));
    }

    public final void setTags(@NotNull List<TagInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tags = list;
    }

    public final void setUserHeader(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userHeader = str;
    }

    public final void setUserHeaderFrame(@Nullable String str) {
        this.userHeaderFrame = str;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final void setUserIdx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userIdx = str;
    }

    public final void setUserLevel(int i) {
        this.userLevel = i;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    public final void setVipLevel(int i) {
        this.vipLevel = i;
        if (this._vipLevel == null) {
            this._vipLevel = o0OOO00.OooO0Oo(Integer.valueOf(i));
        }
        o0O00OO<Integer> o0o00oo2 = this._vipLevel;
        Intrinsics.checkNotNull(o0o00oo2);
        o0o00oo2.setValue(Integer.valueOf(i));
    }

    public final void setVipState(int i) {
        this.vipState = i;
        if (this._vipState == null) {
            this._vipState = o0OOO00.OooO0Oo(Integer.valueOf(i));
        }
        o0O00OO<Integer> o0o00oo2 = this._vipState;
        Intrinsics.checkNotNull(o0o00oo2);
        o0o00oo2.setValue(Integer.valueOf(i));
    }

    public final void setVisitorNum(int i) {
        this.visitorNum = i;
    }

    @NotNull
    public UserInfoApiModel toOldModel() {
        UserInfoApiModel userInfoApiModel = new UserInfoApiModel();
        userInfoApiModel.setId(String.valueOf(this.userId));
        userInfoApiModel.setPrettyid(this.userIdx);
        userInfoApiModel.setIsprettypara(this.idLevel);
        userInfoApiModel.setNickname(this.userName);
        userInfoApiModel.setHeadurl(this.userHeader);
        userInfoApiModel.setUserlevel(String.valueOf(this.userLevel));
        userInfoApiModel.setSign(this.bio);
        userInfoApiModel.setSex(String.valueOf(this.sex));
        userInfoApiModel.setBirthday(this.birthday);
        userInfoApiModel.setVip(isPremium() ? 1 : 0);
        userInfoApiModel.setViplevel(getPremiumLevel());
        userInfoApiModel.setRole(getRole());
        userInfoApiModel.setCountryid(String.valueOf(this.countryId));
        userInfoApiModel.setRegion(this.region);
        userInfoApiModel.setMedal(this.medal);
        userInfoApiModel.setVisitornum(this.visitorNum);
        userInfoApiModel.setFollowednum(this.followedNum);
        userInfoApiModel.setFansnum(this.fansNum);
        userInfoApiModel.setAge(this.age);
        userInfoApiModel.setRjoinNum(this.joinRoomNum);
        userInfoApiModel.setRegtime(String.valueOf(this.regTime));
        userInfoApiModel.setBackgroundPicture(this.background);
        userInfoApiModel.setHeadframeurl(this.userHeaderFrame);
        userInfoApiModel.getTags().clear();
        for (TagInfo tagInfo : this.tags) {
            TagListModel.TagInfo tagInfo2 = new TagListModel.TagInfo();
            tagInfo2.tagId = tagInfo.getTagId();
            tagInfo2.typeId = tagInfo.getTypeId();
            tagInfo2.tagName = tagInfo.getTagName();
            userInfoApiModel.getTags().add(tagInfo2);
        }
        return userInfoApiModel;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("UserInfo(userId=");
        sbOooO0o0.append(this.userId);
        sbOooO0o0.append(", userIdx='");
        sbOooO0o0.append(this.userIdx);
        sbOooO0o0.append("', idLevel=");
        sbOooO0o0.append(this.idLevel);
        sbOooO0o0.append(", userName='");
        sbOooO0o0.append(this.userName);
        sbOooO0o0.append("', userAvatar='");
        sbOooO0o0.append(this.userHeader);
        sbOooO0o0.append("', userFrame='");
        sbOooO0o0.append(this.userHeaderFrame);
        sbOooO0o0.append("', background='");
        sbOooO0o0.append(this.background);
        sbOooO0o0.append("', userLevel=");
        sbOooO0o0.append(this.userLevel);
        sbOooO0o0.append(", gender=");
        sbOooO0o0.append(this.sex);
        sbOooO0o0.append(", bio='");
        sbOooO0o0.append(this.bio);
        sbOooO0o0.append("', birthday='");
        sbOooO0o0.append(this.birthday);
        sbOooO0o0.append("', age=");
        sbOooO0o0.append(this.age);
        sbOooO0o0.append(", countryId=");
        sbOooO0o0.append(this.countryId);
        sbOooO0o0.append(", region=");
        sbOooO0o0.append(this.region);
        sbOooO0o0.append(", medal='");
        sbOooO0o0.append(this.medal);
        sbOooO0o0.append("', visitorNum=");
        sbOooO0o0.append(this.visitorNum);
        sbOooO0o0.append(", followedNum=");
        sbOooO0o0.append(this.followedNum);
        sbOooO0o0.append(", fansNum=");
        sbOooO0o0.append(this.fansNum);
        sbOooO0o0.append(", joinRoomNum=");
        sbOooO0o0.append(this.joinRoomNum);
        sbOooO0o0.append(", role=");
        sbOooO0o0.append(getRole());
        sbOooO0o0.append(", regTime=");
        sbOooO0o0.append(this.regTime);
        sbOooO0o0.append(", tags=");
        sbOooO0o0.append(this.tags);
        sbOooO0o0.append(", vip=");
        sbOooO0o0.append(isPremium());
        sbOooO0o0.append(", vipLevel=");
        sbOooO0o0.append(getPremiumLevel());
        sbOooO0o0.append(", kaVipState=");
        sbOooO0o0.append(getVipState());
        sbOooO0o0.append(", kaVipLevel=");
        sbOooO0o0.append(getVipLevel());
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public final void updateInfo(@NotNull UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.userIdx = userInfo.userIdx;
        this.idLevel = userInfo.idLevel;
        this.userName = userInfo.userName;
        this.userHeader = userInfo.userHeader;
        this.userHeaderFrame = userInfo.userHeaderFrame;
        this.userLevel = userInfo.userLevel;
        this.sex = userInfo.sex;
        this.birthday = userInfo.birthday;
        this.age = userInfo.age;
        this.medal = userInfo.medal;
        setRole(userInfo.getRole());
        setPremium(userInfo.isPremium());
        setPremiumLevel(userInfo.getPremiumLevel());
        setVipState(userInfo.getVipState());
        setVipLevel(userInfo.getVipLevel());
        setShowVIP(userInfo.getShowVIP());
    }
}
