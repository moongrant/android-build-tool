package com.yalla.yalla.model.moment;

import android.text.TextUtils;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import com.code.android.util.o0OoOo0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.model.VipLevel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010e\u001a\u00020fJD\u0010g\u001a\u00020h2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010i\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010\r2\b\u0010j\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010k\u001a\u00020\u0006J\u000e\u0010l\u001a\u00020\u00002\u0006\u0010m\u001a\u00020nJ\u000e\u0010o\u001a\u00020h2\u0006\u0010\u0018\u001a\u00020\nJ\u0018\u0010p\u001a\u00020\u00002\b\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010s\u001a\u00020nJ\u0018\u0010t\u001a\u00020\u00002\b\u0010q\u001a\u0004\u0018\u00010r2\u0006\u0010s\u001a\u00020nJ\b\u0010u\u001a\u00020\rH\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR&\u0010$\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR&\u0010&\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0010\"\u0004\b0\u0010\u0012R\u001a\u00101\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R\u001a\u00104\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010\u0012R \u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u001c\u0010>\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0015\"\u0004\b@\u0010\u0017R\u001c\u0010A\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0015\"\u0004\bC\u0010\u0017R\u001c\u0010D\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0015\"\u0004\bF\u0010\u0017R\u001c\u0010G\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0015\"\u0004\bI\u0010\u0017R&\u0010J\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0010\"\u0004\bL\u0010\u0012R&\u0010M\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0010\"\u0004\bO\u0010\u0012R\u001a\u0010P\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010+\"\u0004\bR\u0010-R\u001a\u0010S\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010+\"\u0004\bU\u0010-R\u001a\u0010V\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0010\"\u0004\bX\u0010\u0012R\u001e\u0010Y\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010+\"\u0004\b[\u0010-R\u001e\u0010\\\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010+\"\u0004\b^\u0010-R\u001a\u0010_\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0015\"\u0004\ba\u0010\u0017R\u001a\u0010b\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010+\"\u0004\bd\u0010-¨\u0006v"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentReplyModel;", "Ljava/io/Serializable;", "Lcom/squareup/wire/internal/Serializable;", "()V", "_isHide", "Landroidx/compose/runtime/MutableState;", "", "_isPraise", "_isSendProp", "_praiseNum", "", "_propNum", "content", "", "createTime", "getCreateTime", "()J", "setCreateTime", "(J)V", "headurl", "getHeadurl", "()Ljava/lang/String;", "setHeadurl", "(Ljava/lang/String;)V", "id", "getId", "setId", "isDel", "()Z", "setDel", "(Z)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isHide", "setHide", "isLocalMessageDiscolor", "setLocalMessageDiscolor", "isPraise", "setPraise", "isSendProp", "setSendProp", "kaVIPLv", "", "getKaVIPLv", "()I", "setKaVIPLv", "(I)V", "localCommentId", "getLocalCommentId", "setLocalCommentId", "localId", "getLocalId", "setLocalId", "localMomentId", "getLocalMomentId", "setLocalMomentId", "localSendRewardIsIn", "getLocalSendRewardIsIn", "()Landroidx/compose/runtime/MutableState;", "setLocalSendRewardIsIn", "(Landroidx/compose/runtime/MutableState;)V", "localShowRewardAnim", "getLocalShowRewardAnim", "medal", "getMedal", "setMedal", "nickname", "getNickname", "setNickname", "parentUserId", "getParentUserId", "setParentUserId", "parentUserName", "getParentUserName", "setParentUserName", "praiseNum", "getPraiseNum", "setPraiseNum", "propNum", "getPropNum", "setPropNum", "role", "getRole", "setRole", "sex", "getSex", "setSex", "userid", "getUserid", "setUserid", "vip", "getVip", "setVip", "vipLevel", "getVipLevel", "setVipLevel", "wealthBadgeImage", "getWealthBadgeImage", "setWealthBadgeImage", "wealthLevel", "getWealthLevel", "setWealthLevel", "getContent", "Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "setLoadPostCommentSonModel", "", "userId", "headUrl", "localMessageDiscolor", "setLocalPostCommentReplyModel", "sendPostCommentModel", "Lcom/yalla/yalla/model/moment/MomentSendCommentModel;", "setLocalPostCommentReplyModelId", "setLocalReplyResultModel", ReportItem.QualityKeyResult, "Lcom/yalla/yalla/model/moment/MomentCommentResultModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "setLocalReplySonResultModel", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentReplyModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private transient MutableState<Boolean> _isHide;

    @Nullable
    private transient MutableState<Boolean> _isPraise;

    @Nullable
    private transient MutableState<Boolean> _isSendProp;

    @Nullable
    private transient MutableState<Long> _praiseNum;

    @Nullable
    private transient MutableState<Long> _propNum;

    @Nullable
    private String content;
    private long createTime;

    @Nullable
    private String headurl;
    private long id;
    private boolean isDel;
    private boolean isHide;
    private boolean isLocalMessageDiscolor;
    private boolean isPraise;
    private boolean isSendProp;
    private int kaVIPLv;
    private long localCommentId;
    private long localId;
    private long localMomentId;

    @NotNull
    private transient MutableState<Boolean> localSendRewardIsIn;

    @NotNull
    private final transient MutableState<Boolean> localShowRewardAnim;

    @Nullable
    private String medal;

    @Nullable
    private String nickname;

    @Nullable
    private String parentUserId;

    @Nullable
    private String parentUserName;
    private long praiseNum;
    private long propNum;
    private int role;
    private int sex;
    private long userid;

    @SerializedName("isVIP")
    private int vip;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    private int vipLevel;

    @NotNull
    private String wealthBadgeImage;
    private int wealthLevel;

    public MomentReplyModel() {
        Boolean bool = Boolean.FALSE;
        this._isHide = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._praiseNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this._isPraise = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._propNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.localShowRewardAnim = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.localSendRewardIsIn = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._isSendProp = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.wealthBadgeImage = "";
    }

    @NotNull
    public final MomentSendContentModel getContent() {
        MomentSendContentModel momentSendContentModel = new MomentSendContentModel("");
        if (TextUtils.isEmpty(this.content)) {
            return momentSendContentModel;
        }
        Object objOooO0O0 = oOo00OO0.OooO0O0(this.content, new TypeToken<MomentSendContentModel>() { // from class: com.yalla.yalla.model.moment.MomentReplyModel.getContent.1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(content, object…tSendContentModel?>() {})");
        return (MomentSendContentModel) objOooO0O0;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getHeadurl() {
        return this.headurl;
    }

    public final long getId() {
        return this.id;
    }

    public final int getKaVIPLv() {
        return this.kaVIPLv;
    }

    public final long getLocalCommentId() {
        return this.localCommentId;
    }

    public final long getLocalId() {
        return this.localId;
    }

    public final long getLocalMomentId() {
        return this.localMomentId;
    }

    @NotNull
    public final MutableState<Boolean> getLocalSendRewardIsIn() {
        return this.localSendRewardIsIn;
    }

    @NotNull
    public final MutableState<Boolean> getLocalShowRewardAnim() {
        return this.localShowRewardAnim;
    }

    @Nullable
    public final String getMedal() {
        return this.medal;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getParentUserId() {
        return this.parentUserId;
    }

    @Nullable
    public final String getParentUserName() {
        return this.parentUserName;
    }

    public final long getPraiseNum() {
        if (this._praiseNum == null) {
            this._praiseNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(this.praiseNum), null, 2, null);
        }
        long j = this.praiseNum;
        MutableState<Long> mutableState = this._praiseNum;
        Intrinsics.checkNotNull(mutableState);
        if (j != mutableState.getValue().longValue()) {
            MutableState<Long> mutableState2 = this._praiseNum;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Long.valueOf(this.praiseNum));
        }
        MutableState<Long> mutableState3 = this._praiseNum;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().longValue();
    }

    public final long getPropNum() {
        if (this._propNum == null) {
            this._propNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(this.propNum), null, 2, null);
        }
        long j = this.propNum;
        MutableState<Long> mutableState = this._propNum;
        Intrinsics.checkNotNull(mutableState);
        if (j != mutableState.getValue().longValue()) {
            MutableState<Long> mutableState2 = this._propNum;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Long.valueOf(this.propNum));
        }
        MutableState<Long> mutableState3 = this._propNum;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().longValue();
    }

    public final int getRole() {
        return this.role;
    }

    public final int getSex() {
        return this.sex;
    }

    public final long getUserid() {
        return this.userid;
    }

    public final int getVip() {
        return this.vip;
    }

    public final int getVipLevel() {
        return this.vipLevel;
    }

    @NotNull
    public final String getWealthBadgeImage() {
        return this.wealthBadgeImage;
    }

    public final int getWealthLevel() {
        return this.wealthLevel;
    }

    /* JADX INFO: renamed from: isDel, reason: from getter */
    public final boolean getIsDel() {
        return this.isDel;
    }

    public final boolean isHide() {
        if (this._isHide == null) {
            this._isHide = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.isHide), null, 2, null);
        }
        boolean z = this.isHide;
        MutableState<Boolean> mutableState = this._isHide;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._isHide;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.isHide));
        }
        MutableState<Boolean> mutableState3 = this._isHide;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: isLocalMessageDiscolor, reason: from getter */
    public final boolean getIsLocalMessageDiscolor() {
        return this.isLocalMessageDiscolor;
    }

    public final boolean isPraise() {
        if (this._isPraise == null) {
            this._isPraise = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.isPraise), null, 2, null);
        }
        boolean z = this.isPraise;
        MutableState<Boolean> mutableState = this._isPraise;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._isPraise;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.isPraise));
        }
        MutableState<Boolean> mutableState3 = this._isPraise;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
    }

    public final boolean isSendProp() {
        if (this._isSendProp == null) {
            this._isSendProp = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.isSendProp), null, 2, null);
        }
        boolean z = this.isSendProp;
        MutableState<Boolean> mutableState = this._isSendProp;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._isSendProp;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.isSendProp));
        }
        MutableState<Boolean> mutableState3 = this._isSendProp;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDel(boolean z) {
        this.isDel = z;
    }

    public final void setHeadurl(@Nullable String str) {
        this.headurl = str;
    }

    public final void setHide(boolean z) {
        this.isHide = z;
        if (this._isHide == null) {
            this._isHide = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        MutableState<Boolean> mutableState = this._isHide;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setKaVIPLv(int i) {
        this.kaVIPLv = i;
    }

    public final void setLoadPostCommentSonModel(long id, long userId, @Nullable String nickname, @Nullable String headUrl, @Nullable String content, long createTime, boolean localMessageDiscolor) {
        this.id = id;
        this.userid = userId;
        this.nickname = nickname;
        this.headurl = headUrl;
        this.content = content;
        this.createTime = createTime;
        this.isLocalMessageDiscolor = localMessageDiscolor;
    }

    public final void setLocalCommentId(long j) {
        this.localCommentId = j;
    }

    public final void setLocalId(long j) {
        this.localId = j;
    }

    public final void setLocalMessageDiscolor(boolean z) {
        this.isLocalMessageDiscolor = z;
    }

    public final void setLocalMomentId(long j) {
        this.localMomentId = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MomentReplyModel setLocalPostCommentReplyModel(@NotNull MomentSendCommentModel sendPostCommentModel) {
        Intrinsics.checkNotNullParameter(sendPostCommentModel, "sendPostCommentModel");
        this.localId = sendPostCommentModel.getLocalId();
        this.id = 0L;
        this.parentUserId = sendPostCommentModel.getParentUserId();
        this.parentUserName = sendPostCommentModel.getParentUserName();
        this.content = OooOO0.OooO00o(sendPostCommentModel.getContent());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        this.userid = ((Number) OooO0OO.OooO0O0()).longValue();
        this.nickname = (String) o000000O.OooOOoo().getValue();
        this.headurl = (String) o000000O.OooO().getValue();
        T value = o000000O.OooOOO().getValue();
        Intrinsics.checkNotNull(value);
        this.sex = ((Number) value).intValue();
        T value2 = o000000O.OooOO0o().getValue();
        Intrinsics.checkNotNull(value2);
        Pair pair = (Pair) value2;
        this.vip = ((Boolean) pair.getFirst()).booleanValue() ? 1 : 0;
        this.vipLevel = ((Number) pair.getSecond()).intValue();
        setPropNum(0L);
        setSendProp(false);
        this.isDel = true;
        this.createTime = System.currentTimeMillis();
        return this;
    }

    public final void setLocalPostCommentReplyModelId(long id) {
        this.id = id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MomentReplyModel setLocalReplyResultModel(@Nullable MomentCommentResultModel result, @NotNull MomentSendCommentModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (result != null) {
            this.localMomentId = o0OoOo0.OooO(0L, model.getDyid());
            this.localCommentId = o0OoOo0.OooO(0L, model.getCid());
            this.id = result.getCid();
            this.content = result.getCommentContent();
            this.parentUserId = model.getParentUserId();
            this.parentUserName = model.getParentUserName();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            this.userid = ((Number) OooO0OO.OooO0O0()).longValue();
            this.nickname = (String) o000000O.OooOOoo().getValue();
            this.headurl = (String) o000000O.OooO().getValue();
            T value = o000000O.OooOOO().getValue();
            Intrinsics.checkNotNull(value);
            this.sex = ((Number) value).intValue();
            T value2 = o000000O.OooOO0o().getValue();
            Intrinsics.checkNotNull(value2);
            Pair pair = (Pair) value2;
            this.vip = ((Boolean) pair.getFirst()).booleanValue() ? 1 : 0;
            this.vipLevel = ((Number) pair.getSecond()).intValue();
            Pair pair2 = (Pair) o000000O.OooOO0().getValue();
            this.kaVIPLv = pair2 != null ? ((Number) pair2.getSecond()).intValue() : VipLevel.Vip0.getValue();
            setPropNum(0L);
            setSendProp(false);
            this.isDel = true;
            this.localId = System.currentTimeMillis();
            this.createTime = System.currentTimeMillis();
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MomentReplyModel setLocalReplySonResultModel(@Nullable MomentCommentResultModel result, @NotNull MomentSendCommentModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (result != null) {
            this.localMomentId = o0OoOo0.OooO(0L, model.getDyid());
            this.localCommentId = o0OoOo0.OooO(0L, model.getCid());
            this.id = result.getCid();
            this.content = result.getCommentContent();
            this.parentUserId = model.getParentUserId();
            this.parentUserName = model.getParentUserName();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            this.userid = ((Number) OooO0OO.OooO0O0()).longValue();
            this.nickname = (String) o000000O.OooOOoo().getValue();
            this.headurl = (String) o000000O.OooO().getValue();
            T value = o000000O.OooOOO().getValue();
            Intrinsics.checkNotNull(value);
            this.sex = ((Number) value).intValue();
            T value2 = o000000O.OooOO0o().getValue();
            Intrinsics.checkNotNull(value2);
            Pair pair = (Pair) value2;
            this.vip = ((Boolean) pair.getFirst()).booleanValue() ? 1 : 0;
            this.vipLevel = ((Number) pair.getSecond()).intValue();
            Pair pair2 = (Pair) o000000O.OooOO0().getValue();
            this.kaVIPLv = pair2 != null ? ((Number) pair2.getSecond()).intValue() : VipLevel.Vip0.getValue();
            setPropNum(0L);
            setSendProp(false);
            this.isDel = true;
            this.localId = System.currentTimeMillis();
            this.createTime = System.currentTimeMillis();
        }
        return this;
    }

    public final void setLocalSendRewardIsIn(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.localSendRewardIsIn = mutableState;
    }

    public final void setMedal(@Nullable String str) {
        this.medal = str;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setParentUserId(@Nullable String str) {
        this.parentUserId = str;
    }

    public final void setParentUserName(@Nullable String str) {
        this.parentUserName = str;
    }

    public final void setPraise(boolean z) {
        this.isPraise = z;
        if (this._isPraise == null) {
            this._isPraise = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        MutableState<Boolean> mutableState = this._isPraise;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void setPraiseNum(long j) {
        this.praiseNum = j;
        if (this._praiseNum == null) {
            this._praiseNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j), null, 2, null);
        }
        MutableState<Long> mutableState = this._praiseNum;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Long.valueOf(j));
    }

    public final void setPropNum(long j) {
        this.propNum = j;
        if (this._propNum == null) {
            this._propNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j), null, 2, null);
        }
        MutableState<Long> mutableState = this._propNum;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Long.valueOf(j));
    }

    public final void setRole(int i) {
        this.role = i;
    }

    public final void setSendProp(boolean z) {
        this.isSendProp = z;
        if (this._isSendProp == null) {
            this._isSendProp = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        MutableState<Boolean> mutableState = this._isSendProp;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void setSex(int i) {
        this.sex = i;
    }

    public final void setUserid(long j) {
        this.userid = j;
    }

    public final void setVip(int i) {
        this.vip = i;
    }

    public final void setVipLevel(int i) {
        this.vipLevel = i;
    }

    public final void setWealthBadgeImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wealthBadgeImage = str;
    }

    public final void setWealthLevel(int i) {
        this.wealthLevel = i;
    }

    @NotNull
    public String toString() {
        return OooOO0.OooO00o(this);
    }
}
