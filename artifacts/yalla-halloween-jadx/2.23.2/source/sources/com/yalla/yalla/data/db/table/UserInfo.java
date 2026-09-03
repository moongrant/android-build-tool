package com.yalla.yalla.data.db.table;

import OooO0OO.OooO0O0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.data.db.converter.BooleanTypeAdapter;
import com.yalla.yalla.data.db.converter.TagConverter;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.model.user.UserInfoApiModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u0093\u00012\u00020\u0001:\b\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0085\u0001\u001a\u00020\u00052\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0000J\r\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u000508J\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u000708J\r\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u000508J\r\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u000708J\r\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u000708J\u0007\u0010\u008c\u0001\u001a\u00020\u0005J\u0007\u0010\u008d\u0001\u001a\u00020\u0005J\n\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0016J\t\u0010\u0090\u0001\u001a\u00020\rH\u0016J\u0011\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001d\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R$\u0010#\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001e\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001e\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u001e\u0010-\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001e\u00100\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R&\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00058F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\u0016\u00107\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00109\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R \u0010<\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0017\"\u0004\b>\u0010\u0019R&\u0010?\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00078V@VX\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0012\"\u0004\bA\u0010\u0014R\u0016\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010C\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0012\"\u0004\bE\u0010\u0014R\u001e\u0010F\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0012\"\u0004\bH\u0010\u0014R&\u0010I\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00078F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0012\"\u0004\bK\u0010\u0014R\u001e\u0010L\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0012\"\u0004\bN\u0010\u0014R&\u0010O\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00058F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00101\"\u0004\bQ\u00103R\u0016\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010S\u001a\b\u0012\u0004\u0012\u00020U0T8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001e\u0010Z\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0017\"\u0004\b\\\u0010\u0019R \u0010]\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0017\"\u0004\b_\u0010\u0019R&\u0010`\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b8F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001e\u0010e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0017\"\u0004\bg\u0010\u0019R\u001e\u0010h\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0012\"\u0004\bj\u0010\u0014R&\u0010k\u001a\u00020\r2\u0006\u00104\u001a\u00020\r8F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0017\"\u0004\bm\u0010\u0019R&\u0010n\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00078F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u0012\"\u0004\bp\u0010\u0014R\u0016\u0010q\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010r\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00078F@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0012\"\u0004\bt\u0010\u0014R\u0016\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010v\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0012\"\u0004\bx\u0010\u0014R\u001e\u0010y\u001a\u00020\r8F@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u0017\"\u0004\b{\u0010\u0019R\u001e\u0010|\u001a\u00020\u00078F@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0012\"\u0004\b~\u0010\u0014R%\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0097\u0001"}, d2 = {"Lcom/yalla/yalla/data/db/table/UserInfo;", "Ljava/io/Serializable;", "()V", "_isPremium", "Landroidx/compose/runtime/MutableState;", "", "_premiumLevel", "", "_role", "_showVIP", "_userId", "", "_userName", "", "_vipLevel", "_vipState", "age", "getAge", "()I", "setAge", "(I)V", "background", "getBackground", "()Ljava/lang/String;", "setBackground", "(Ljava/lang/String;)V", "bio", "getBio", "setBio", "birthday", "getBirthday", "setBirthday", "countryId", "getCountryId", "setCountryId", "currBadgeLv", "getCurrBadgeLv$annotations", "getCurrBadgeLv", "setCurrBadgeLv", "fansNum", "getFansNum", "setFansNum", "followedNum", "getFollowedNum", "setFollowedNum", "idLevel", "getIdLevel", "setIdLevel", "isBlackUser", "()Z", "setBlackUser", "(Z)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isPremium", "setPremium", "isPremiumStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "joinRoomNum", "getJoinRoomNum", "setJoinRoomNum", "medal", "getMedal", "setMedal", "premiumLevel", "getPremiumLevel", "setPremiumLevel", "premiumLevelStateFlow", "regTime", "getRegTime", "setRegTime", "region", "getRegion", "setRegion", "role", "getRole", "setRole", "sex", "getSex", "setSex", "showVIP", "getShowVIP", "setShowVIP", "showVIPStateFlow", "tags", "", "Lcom/yalla/yalla/data/db/table/UserInfo$TagInfo;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "userHeader", "getUserHeader", "setUserHeader", "userHeaderFrame", "getUserHeaderFrame", "setUserHeaderFrame", "userId", "getUserId", "()J", "setUserId", "(J)V", "userIdx", "getUserIdx", "setUserIdx", "userLevel", "getUserLevel", "setUserLevel", "userName", "getUserName", "setUserName", "vipLevel", "getVipLevel", "setVipLevel", "vipLevelStateFlow", "vipState", "getVipState", "setVipState", "vipStateStateFlow", "visitorNum", "getVisitorNum", "setVisitorNum", "wealthBadgeWithBg", "getWealthBadgeWithBg", "setWealthBadgeWithBg", "wealthLevel", "getWealthLevel", "setWealthLevel", "wealthLv", "Lcom/yalla/yalla/data/db/table/UserInfo$WealthLevelModel;", "getWealthLv$Common_YallaRelease", "()Lcom/yalla/yalla/data/db/table/UserInfo$WealthLevelModel;", "setWealthLv$Common_YallaRelease", "(Lcom/yalla/yalla/data/db/table/UserInfo$WealthLevelModel;)V", "areItemShowContentsTheSame", "userInfo", "getIsPremiumStateFlow", "getPremiumLevelStateFlow", "getShowVIPStateFlow", "getVipLevelStateFlow", "getVipStateStateFlow", "isNotMangerRole", "isOfficialRole", "toOldModel", "Lcom/yalla/yalla/model/user/UserInfoApiModel;", "toString", "updateInfo", "", "Companion", "Role", "TagInfo", "WealthLevelModel", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Entity(indices = {@Index(unique = true, value = {"userId"})}, tableName = "UserInfoTable")
@SourceDebugExtension({"SMAP\nUserInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfo.kt\ncom/yalla/yalla/data/db/table/UserInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,561:1\n1#2:562\n1855#3,2:563\n*S KotlinDebug\n*F\n+ 1 UserInfo.kt\ncom/yalla/yalla/data/db/table/UserInfo\n*L\n458#1:563,2\n*E\n"})
public class UserInfo implements Serializable {

    @SerializedName("age")
    @ColumnInfo(name = "age")
    private int age;

    @SerializedName(alternate = {"countryid"}, value = "countryId")
    @ColumnInfo(name = "countryId")
    private int countryId;

    @SerializedName(alternate = {"currbadgelv"}, value = "currBadgeLv")
    @ColumnInfo(name = "currBadgeLv")
    private int currBadgeLv;

    @SerializedName(alternate = {"fansnum"}, value = "fansNum")
    @ColumnInfo(name = "fansNum")
    private int fansNum;

    @SerializedName(alternate = {"followednum"}, value = "followedNum")
    @ColumnInfo(name = "followedNum")
    private int followedNum;

    @SerializedName(alternate = {"prettyIdFlag", "isPrettyPara", "isprettypara"}, value = "idLevel")
    @ColumnInfo(name = "idLevel")
    private int idLevel;

    @SerializedName("isBlackUser")
    @JsonAdapter(BooleanTypeAdapter.class)
    @ColumnInfo(name = "isBlackUser")
    private boolean isBlackUser;

    @SerializedName(alternate = {"nIsVIP", "isVip"}, value = "isVIP")
    @ColumnInfo(name = "vip")
    private boolean isPremium;

    @Nullable
    private transient MutableStateFlow<Boolean> isPremiumStateFlow;

    @SerializedName(alternate = {"rjoinNum"}, value = "joinRoomNum")
    @ColumnInfo(name = "joinRoomNum")
    private int joinRoomNum;

    @SerializedName(alternate = {"nVipLv", "nvipLv"}, value = "nVIPLv")
    @ColumnInfo(name = "vipLevel")
    private int premiumLevel;

    @Nullable
    private transient MutableStateFlow<Integer> premiumLevelStateFlow;

    @SerializedName(alternate = {"regtime"}, value = "regTime")
    @ColumnInfo(name = "regTime")
    private int regTime;

    @SerializedName("region")
    @ColumnInfo(name = "region")
    private int region;

    @SerializedName("role")
    @ColumnInfo(name = "role")
    private int role;

    @Nullable
    private transient MutableStateFlow<Boolean> showVIPStateFlow;

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

    @Nullable
    private transient MutableStateFlow<Integer> vipLevelStateFlow;

    @SerializedName(alternate = {"kaVipState", "kavipstate"}, value = "kaVIPState")
    @ColumnInfo(name = "kaVipState")
    private int vipState;

    @Nullable
    private transient MutableStateFlow<Integer> vipStateStateFlow;

    @SerializedName(alternate = {"visitornum"}, value = "visitorNum")
    @ColumnInfo(name = "visitorNum")
    private int visitorNum;

    @SerializedName(alternate = {"currweallv", "wealthLevel"}, value = "currWealLv")
    @ColumnInfo(name = "currWealLv")
    private int wealthLevel;

    @SerializedName(alternate = {"wealthInfo"}, value = "wealthLv")
    @Ignore
    @Nullable
    private WealthLevelModel wealthLv;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Ignore
    @Nullable
    private transient MutableState<Long> _userId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    @SerializedName(alternate = {"prettyid", "prettyId", "idx"}, value = "userIdx")
    @ColumnInfo(name = "userIdx")
    @NotNull
    private String userIdx = "";

    @SerializedName(alternate = {"nickname", "username", "nickName", "name"}, value = "userName")
    @ColumnInfo(name = "userName")
    @NotNull
    private String userName = "";

    @Ignore
    @Nullable
    private transient MutableState<String> _userName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

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
    private transient MutableState<Integer> _role = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    @TypeConverters({TagConverter.class})
    @SerializedName("tags")
    @ColumnInfo(name = "tags")
    @NotNull
    private List<TagInfo> tags = new ArrayList();

    @Nullable
    private transient MutableState<Boolean> _isPremium = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @Nullable
    private transient MutableState<Integer> _premiumLevel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    @Nullable
    private transient MutableState<Integer> _vipState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    @Nullable
    private transient MutableState<Integer> _vipLevel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    @SerializedName(alternate = {"showkavip", "showKAVIP"}, value = "showVIP")
    @ColumnInfo(defaultValue = "1", name = "showVIP")
    private boolean showVIP = true;

    @Nullable
    private transient MutableState<Boolean> _showVIP = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    @SerializedName(alternate = {"currbadgeimg", "wealthBadgeImage"}, value = "currBadgeImg")
    @ColumnInfo(name = "currBadgeImg")
    @NotNull
    private String wealthBadgeWithBg = "";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/data/db/table/UserInfo$Companion;", "", "()V", "isOfficialRole", "", "userRole", "", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isOfficialRole(int userRole) {
            return userRole == 2 || userRole == 4;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/data/db/table/UserInfo$Role;", "", "()V", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Role {
        public static final int $stable = 0;
        public static final int All = 4;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int Manager = 1;
        public static final int Official = 2;
        public static final int SimpleManager = 5;
        public static final int User = 0;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/data/db/table/UserInfo$Role$Companion;", "", "()V", "All", "", "Manager", "Official", "SimpleManager", "User", "isOfficial", "", "propId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean isOfficial(int propId) {
                return propId == 2 || propId == 4;
            }
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/data/db/table/UserInfo$TagInfo;", "Ljava/io/Serializable;", "()V", "tagId", "", "getTagId", "()I", "setTagId", "(I)V", "tagName", "", "getTagName", "()Ljava/lang/String;", "setTagName", "(Ljava/lang/String;)V", "typeId", "getTypeId", "setTypeId", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            int i = this.tagId;
            int i2 = this.typeId;
            return o0oOO.OooO0O0(o00000.OooO00o("TagInfo(tagId=", i, ", typeId=", i2, ", tagName='"), this.tagName, "')");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/yalla/yalla/data/db/table/UserInfo$WealthLevelModel;", "Ljava/io/Serializable;", "()V", "badgeRoundedImg", "", "getBadgeRoundedImg", "()Ljava/lang/String;", "setBadgeRoundedImg", "(Ljava/lang/String;)V", "currBadgeImg", "getCurrBadgeImg", "setCurrBadgeImg", "mainCardImg", "getMainCardImg", "setMainCardImg", "mainTextColour", "getMainTextColour", "setMainTextColour", "showWealthLevel", "", "getShowWealthLevel", "()Z", "setShowWealthLevel", "(Z)V", "wealthLevel", "", "getWealthLevel", "()I", "setWealthLevel", "(I)V", "wealthProfileCardImg", "getWealthProfileCardImg", "setWealthProfileCardImg", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class WealthLevelModel implements Serializable {
        public static final int $stable = 8;

        @SerializedName(alternate = {"wealthShow"}, value = "showWealthLevel")
        private boolean showWealthLevel;

        @SerializedName(alternate = {"wealthLevel"}, value = "currWealthLv")
        private int wealthLevel;

        @SerializedName(alternate = {"wealthBadgeUrl"}, value = "currBadgeImg")
        @NotNull
        private String currBadgeImg = "";

        @NotNull
        private String badgeRoundedImg = "";

        @SerializedName("profileCardImg")
        @NotNull
        private String wealthProfileCardImg = "";

        @NotNull
        private String mainCardImg = "";

        @NotNull
        private String mainTextColour = "";

        @NotNull
        public final String getBadgeRoundedImg() {
            return this.badgeRoundedImg;
        }

        @NotNull
        public final String getCurrBadgeImg() {
            return this.currBadgeImg;
        }

        @NotNull
        public final String getMainCardImg() {
            return this.mainCardImg;
        }

        @NotNull
        public final String getMainTextColour() {
            return this.mainTextColour;
        }

        public final boolean getShowWealthLevel() {
            return this.showWealthLevel;
        }

        public final int getWealthLevel() {
            return this.wealthLevel;
        }

        @NotNull
        public final String getWealthProfileCardImg() {
            return this.wealthProfileCardImg;
        }

        public final void setBadgeRoundedImg(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.badgeRoundedImg = str;
        }

        public final void setCurrBadgeImg(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.currBadgeImg = str;
        }

        public final void setMainCardImg(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.mainCardImg = str;
        }

        public final void setMainTextColour(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.mainTextColour = str;
        }

        public final void setShowWealthLevel(boolean z) {
            this.showWealthLevel = z;
        }

        public final void setWealthLevel(int i) {
            this.wealthLevel = i;
        }

        public final void setWealthProfileCardImg(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.wealthProfileCardImg = str;
        }
    }

    @Deprecated(message = "暂不使用")
    public static /* synthetic */ void getCurrBadgeLv$annotations() {
    }

    public final boolean areItemShowContentsTheSame(@Nullable UserInfo userInfo) {
        return (userInfo != null && isPremium() == userInfo.isPremium()) && getPremiumLevel() == userInfo.getPremiumLevel() && Intrinsics.areEqual(getUserName(), userInfo.getUserName()) && Intrinsics.areEqual(this.userIdx, userInfo.userIdx) && Intrinsics.areEqual(this.userHeader, userInfo.userHeader) && Intrinsics.areEqual(this.userHeaderFrame, userInfo.userHeaderFrame) && Intrinsics.areEqual(this.bio, userInfo.bio) && this.age == userInfo.age && this.countryId == userInfo.countryId && this.sex == userInfo.sex && this.idLevel == userInfo.idLevel && Intrinsics.areEqual(this.medal, userInfo.medal) && getRole() == userInfo.getRole();
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

    public final int getCurrBadgeLv() {
        return this.currBadgeLv;
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

    @NotNull
    public final MutableStateFlow<Boolean> getIsPremiumStateFlow() {
        if (this.isPremiumStateFlow == null) {
            isPremium();
        }
        MutableStateFlow<Boolean> mutableStateFlow = this.isPremiumStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        return mutableStateFlow;
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
            this._premiumLevel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(this.premiumLevel), null, 2, null);
        }
        int i = this.premiumLevel;
        MutableState<Integer> mutableState = this._premiumLevel;
        Intrinsics.checkNotNull(mutableState);
        if (i != mutableState.getValue().intValue()) {
            MutableState<Integer> mutableState2 = this._premiumLevel;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Integer.valueOf(this.premiumLevel));
        }
        if (this.premiumLevelStateFlow == null) {
            this.premiumLevelStateFlow = StateFlowKt.MutableStateFlow(Integer.valueOf(this.premiumLevel));
        }
        int i2 = this.premiumLevel;
        MutableStateFlow<Integer> mutableStateFlow = this.premiumLevelStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        if (i2 != mutableStateFlow.getValue().intValue()) {
            MutableStateFlow<Integer> mutableStateFlow2 = this.premiumLevelStateFlow;
            Intrinsics.checkNotNull(mutableStateFlow2);
            mutableStateFlow2.setValue(Integer.valueOf(this.premiumLevel));
        }
        MutableState<Integer> mutableState3 = this._premiumLevel;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().intValue();
    }

    @NotNull
    public final MutableStateFlow<Integer> getPremiumLevelStateFlow() {
        if (this.premiumLevelStateFlow == null) {
            getPremiumLevel();
        }
        MutableStateFlow<Integer> mutableStateFlow = this.premiumLevelStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        return mutableStateFlow;
    }

    public final int getRegTime() {
        return this.regTime;
    }

    public final int getRegion() {
        return this.region;
    }

    public final int getRole() {
        if (this._role == null) {
            this._role = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(this.role), null, 2, null);
        }
        int i = this.role;
        MutableState<Integer> mutableState = this._role;
        Intrinsics.checkNotNull(mutableState);
        if (i != mutableState.getValue().intValue()) {
            MutableState<Integer> mutableState2 = this._role;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Integer.valueOf(this.role));
        }
        MutableState<Integer> mutableState3 = this._role;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().intValue();
    }

    public final int getSex() {
        return this.sex;
    }

    public final boolean getShowVIP() {
        if (this._showVIP == null) {
            this._showVIP = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.showVIP), null, 2, null);
        }
        boolean z = this.showVIP;
        MutableState<Boolean> mutableState = this._showVIP;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._showVIP;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.showVIP));
        }
        if (this.showVIPStateFlow == null) {
            this.showVIPStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(this.showVIP));
        }
        boolean z2 = this.showVIP;
        MutableStateFlow<Boolean> mutableStateFlow = this.showVIPStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        if (z2 != mutableStateFlow.getValue().booleanValue()) {
            MutableStateFlow<Boolean> mutableStateFlow2 = this.showVIPStateFlow;
            Intrinsics.checkNotNull(mutableStateFlow2);
            mutableStateFlow2.setValue(Boolean.valueOf(this.showVIP));
        }
        MutableState<Boolean> mutableState3 = this._showVIP;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
    }

    @NotNull
    public final MutableStateFlow<Boolean> getShowVIPStateFlow() {
        if (this.showVIPStateFlow == null) {
            getShowVIP();
        }
        MutableStateFlow<Boolean> mutableStateFlow = this.showVIPStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        return mutableStateFlow;
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
        if (this._userId == null) {
            this._userId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(this.userId), null, 2, null);
        }
        long j = this.userId;
        MutableState<Long> mutableState = this._userId;
        Intrinsics.checkNotNull(mutableState);
        if (j != mutableState.getValue().longValue()) {
            MutableState<Long> mutableState2 = this._userId;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Long.valueOf(this.userId));
        }
        MutableState<Long> mutableState3 = this._userId;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().longValue();
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
        if (this._userName == null) {
            this._userName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(this.userName, null, 2, null);
        }
        String str = this.userName;
        MutableState<String> mutableState = this._userName;
        Intrinsics.checkNotNull(mutableState);
        if (!Intrinsics.areEqual(str, mutableState.getValue())) {
            MutableState<String> mutableState2 = this._userName;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(this.userName);
        }
        MutableState<String> mutableState3 = this._userName;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue();
    }

    public final int getVipLevel() {
        if (this._vipLevel == null) {
            this._vipLevel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(this.vipLevel), null, 2, null);
        }
        int i = this.vipLevel;
        MutableState<Integer> mutableState = this._vipLevel;
        Intrinsics.checkNotNull(mutableState);
        if (i != mutableState.getValue().intValue()) {
            MutableState<Integer> mutableState2 = this._vipLevel;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Integer.valueOf(this.vipLevel));
        }
        if (this.vipLevelStateFlow == null) {
            this.vipLevelStateFlow = StateFlowKt.MutableStateFlow(Integer.valueOf(this.vipLevel));
        }
        int i2 = this.vipLevel;
        MutableStateFlow<Integer> mutableStateFlow = this.vipLevelStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        if (i2 != mutableStateFlow.getValue().intValue()) {
            MutableStateFlow<Integer> mutableStateFlow2 = this.vipLevelStateFlow;
            Intrinsics.checkNotNull(mutableStateFlow2);
            mutableStateFlow2.setValue(Integer.valueOf(this.vipLevel));
        }
        MutableState<Integer> mutableState3 = this._vipLevel;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().intValue();
    }

    @NotNull
    public final MutableStateFlow<Integer> getVipLevelStateFlow() {
        if (this.vipLevelStateFlow == null) {
            getVipLevel();
        }
        MutableStateFlow<Integer> mutableStateFlow = this.vipLevelStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        return mutableStateFlow;
    }

    public final int getVipState() {
        if (this._vipState == null) {
            this._vipState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(this.vipState), null, 2, null);
        }
        int i = this.vipState;
        MutableState<Integer> mutableState = this._vipState;
        Intrinsics.checkNotNull(mutableState);
        if (i != mutableState.getValue().intValue()) {
            MutableState<Integer> mutableState2 = this._vipState;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Integer.valueOf(this.vipState));
        }
        if (this.vipStateStateFlow == null) {
            this.vipStateStateFlow = StateFlowKt.MutableStateFlow(Integer.valueOf(this.vipState));
        }
        int i2 = this.vipState;
        MutableStateFlow<Integer> mutableStateFlow = this.vipStateStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        if (i2 != mutableStateFlow.getValue().intValue()) {
            MutableStateFlow<Integer> mutableStateFlow2 = this.vipStateStateFlow;
            Intrinsics.checkNotNull(mutableStateFlow2);
            mutableStateFlow2.setValue(Integer.valueOf(this.vipState));
        }
        MutableState<Integer> mutableState3 = this._vipState;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().intValue();
    }

    @NotNull
    public final MutableStateFlow<Integer> getVipStateStateFlow() {
        if (this.vipStateStateFlow == null) {
            getVipState();
        }
        MutableStateFlow<Integer> mutableStateFlow = this.vipStateStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        return mutableStateFlow;
    }

    public final int getVisitorNum() {
        return this.visitorNum;
    }

    @NotNull
    public final String getWealthBadgeWithBg() {
        String badgeRoundedImg;
        String str = this.wealthBadgeWithBg;
        if (!StringsKt.isBlank(str)) {
            return str;
        }
        WealthLevelModel wealthLevelModel = this.wealthLv;
        return (wealthLevelModel == null || (badgeRoundedImg = wealthLevelModel.getBadgeRoundedImg()) == null) ? this.wealthBadgeWithBg : badgeRoundedImg;
    }

    public final int getWealthLevel() {
        WealthLevelModel wealthLevelModel;
        int i = this.wealthLevel;
        return (i != 0 || (wealthLevelModel = this.wealthLv) == null) ? i : wealthLevelModel.getWealthLevel();
    }

    @Nullable
    /* JADX INFO: renamed from: getWealthLv$Common_YallaRelease, reason: from getter */
    public final WealthLevelModel getWealthLv() {
        return this.wealthLv;
    }

    /* JADX INFO: renamed from: isBlackUser, reason: from getter */
    public final boolean getIsBlackUser() {
        return this.isBlackUser;
    }

    public final boolean isNotMangerRole() {
        return getRole() == 2 || getRole() == 0;
    }

    public final boolean isOfficialRole() {
        return getRole() == 2 || getRole() == 4;
    }

    public final boolean isPremium() {
        if (this._isPremium == null) {
            this._isPremium = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.isPremium), null, 2, null);
        }
        boolean z = this.isPremium;
        MutableState<Boolean> mutableState = this._isPremium;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._isPremium;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.isPremium));
        }
        if (this.isPremiumStateFlow == null) {
            this.isPremiumStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(this.isPremium));
        }
        boolean z2 = this.isPremium;
        MutableStateFlow<Boolean> mutableStateFlow = this.isPremiumStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        if (z2 != mutableStateFlow.getValue().booleanValue()) {
            MutableStateFlow<Boolean> mutableStateFlow2 = this.isPremiumStateFlow;
            Intrinsics.checkNotNull(mutableStateFlow2);
            mutableStateFlow2.setValue(Boolean.valueOf(this.isPremium));
        }
        MutableState<Boolean> mutableState3 = this._isPremium;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
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

    public final void setBlackUser(boolean z) {
        this.isBlackUser = z;
    }

    public final void setCountryId(int i) {
        this.countryId = i;
    }

    public final void setCurrBadgeLv(int i) {
        this.currBadgeLv = i;
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
            this._isPremium = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        if (this.isPremiumStateFlow == null) {
            this.isPremiumStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(this.isPremium));
        }
        MutableStateFlow<Boolean> mutableStateFlow = this.isPremiumStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        mutableStateFlow.setValue(Boolean.valueOf(z));
        MutableState<Boolean> mutableState = this._isPremium;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
    }

    public void setPremiumLevel(int i) {
        this.premiumLevel = i;
        if (this._premiumLevel == null) {
            this._premiumLevel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        }
        if (this.premiumLevelStateFlow == null) {
            this.premiumLevelStateFlow = StateFlowKt.MutableStateFlow(Integer.valueOf(this.premiumLevel));
        }
        MutableStateFlow<Integer> mutableStateFlow = this.premiumLevelStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        mutableStateFlow.setValue(Integer.valueOf(i));
        MutableState<Integer> mutableState = this._premiumLevel;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Integer.valueOf(i));
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
            this._role = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        }
        MutableState<Integer> mutableState = this._role;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Integer.valueOf(i));
    }

    public final void setSex(int i) {
        this.sex = i;
    }

    public final void setShowVIP(boolean z) {
        this.showVIP = z;
        if (this._showVIP == null) {
            this._showVIP = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        if (this.showVIPStateFlow == null) {
            this.showVIPStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(this.showVIP));
        }
        MutableStateFlow<Boolean> mutableStateFlow = this.showVIPStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        mutableStateFlow.setValue(Boolean.valueOf(z));
        MutableState<Boolean> mutableState = this._showVIP;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
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
        if (this._userId == null) {
            this._userId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j), null, 2, null);
        }
        MutableState<Long> mutableState = this._userId;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Long.valueOf(j));
    }

    public final void setUserIdx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userIdx = str;
    }

    public final void setUserLevel(int i) {
        this.userLevel = i;
    }

    public final void setUserName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.userName = value;
        if (this._userName == null) {
            this._userName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
        }
        MutableState<String> mutableState = this._userName;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(value);
    }

    public final void setVipLevel(int i) {
        this.vipLevel = i;
        if (this._vipLevel == null) {
            this._vipLevel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        }
        if (this.vipLevelStateFlow == null) {
            this.vipLevelStateFlow = StateFlowKt.MutableStateFlow(Integer.valueOf(this.vipLevel));
        }
        MutableStateFlow<Integer> mutableStateFlow = this.vipLevelStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        mutableStateFlow.setValue(Integer.valueOf(i));
        MutableState<Integer> mutableState = this._vipLevel;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Integer.valueOf(i));
    }

    public final void setVipState(int i) {
        this.vipState = i;
        if (this._vipState == null) {
            this._vipState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        }
        if (this.vipStateStateFlow == null) {
            this.vipStateStateFlow = StateFlowKt.MutableStateFlow(Integer.valueOf(this.vipState));
        }
        MutableStateFlow<Integer> mutableStateFlow = this.vipStateStateFlow;
        Intrinsics.checkNotNull(mutableStateFlow);
        mutableStateFlow.setValue(Integer.valueOf(i));
        MutableState<Integer> mutableState = this._vipState;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Integer.valueOf(i));
    }

    public final void setVisitorNum(int i) {
        this.visitorNum = i;
    }

    public final void setWealthBadgeWithBg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wealthBadgeWithBg = str;
    }

    public final void setWealthLevel(int i) {
        this.wealthLevel = i;
    }

    public final void setWealthLv$Common_YallaRelease(@Nullable WealthLevelModel wealthLevelModel) {
        this.wealthLv = wealthLevelModel;
    }

    @NotNull
    public UserInfoApiModel toOldModel() {
        UserInfoApiModel userInfoApiModel = new UserInfoApiModel();
        userInfoApiModel.setId(String.valueOf(getUserId()));
        userInfoApiModel.setPrettyid(this.userIdx);
        userInfoApiModel.setIsprettypara(this.idLevel);
        userInfoApiModel.setNickname(getUserName());
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
        long userId = getUserId();
        String str = this.userIdx;
        int i = this.idLevel;
        String userName = getUserName();
        String str2 = this.userHeader;
        String str3 = this.userHeaderFrame;
        String str4 = this.background;
        int i2 = this.userLevel;
        int i3 = this.sex;
        String str5 = this.bio;
        String str6 = this.birthday;
        int i4 = this.age;
        int i5 = this.countryId;
        int i6 = this.region;
        String str7 = this.medal;
        int i7 = this.visitorNum;
        int i8 = this.followedNum;
        int i9 = this.fansNum;
        int i10 = this.joinRoomNum;
        int role = getRole();
        int i11 = this.regTime;
        List<TagInfo> list = this.tags;
        boolean zIsPremium = isPremium();
        int premiumLevel = getPremiumLevel();
        int vipState = getVipState();
        int vipLevel = getVipLevel();
        boolean showVIP = getShowVIP();
        StringBuilder sb = new StringBuilder("UserInfo(userId=");
        sb.append(userId);
        sb.append(", userIdx='");
        sb.append(str);
        sb.append("', idLevel=");
        sb.append(i);
        sb.append(", userName='");
        sb.append(userName);
        OooO0O0.OooO00o(sb, "', userHeader='", str2, "', userHeaderFrame=", str3);
        sb.append(", background=");
        sb.append(str4);
        sb.append(", userLevel=");
        sb.append(i2);
        sb.append(", sex=");
        sb.append(i3);
        sb.append(", bio=");
        sb.append(str5);
        sb.append(", birthday='");
        sb.append(str6);
        sb.append("', age=");
        sb.append(i4);
        sb.append(", countryId=");
        sb.append(i5);
        sb.append(", region=");
        sb.append(i6);
        sb.append(", medal=");
        sb.append(str7);
        sb.append(", visitorNum=");
        sb.append(i7);
        sb.append(", followedNum=");
        sb.append(i8);
        sb.append(", fansNum=");
        sb.append(i9);
        sb.append(", joinRoomNum=");
        sb.append(i10);
        sb.append(", role=");
        sb.append(role);
        sb.append(", regTime=");
        sb.append(i11);
        sb.append(", tags=");
        sb.append(list);
        sb.append(", isPremium=");
        sb.append(zIsPremium);
        sb.append(", premiumLevel=");
        sb.append(premiumLevel);
        sb.append(", vipState=");
        sb.append(vipState);
        sb.append(", vipLevel=");
        sb.append(vipLevel);
        sb.append(", showVIP=");
        sb.append(showVIP);
        sb.append(")");
        return sb.toString();
    }

    public final void updateInfo(@NotNull UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.userIdx = userInfo.userIdx;
        this.idLevel = userInfo.idLevel;
        setUserName(userInfo.getUserName());
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
        this.wealthLevel = userInfo.getWealthLevel();
        this.wealthBadgeWithBg = userInfo.getWealthBadgeWithBg();
    }
}
