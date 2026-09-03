package com.yalla.yalla.model.moment;

import OooO0OO.OooO0O0;
import android.text.TextUtils;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.facebook.appevents.OooOOO0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.model.VipLevel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010!\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010h\u001a\u00020\u00002\b\u0010i\u001a\u0004\u0018\u00010jJ\u0006\u0010k\u001a\u00020lJ\u000e\u0010m\u001a\u00020\u00002\u0006\u0010i\u001a\u00020jJ\u000e\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020\u000fJ\u0010\u0010q\u001a\u00020o2\b\u0010r\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010s\u001a\u00020o2\u0006\u0010p\u001a\u00020\u000fJF\u0010t\u001a\u00020o2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010u\u001a\u0004\u0018\u00010\u00112\b\u0010@\u001a\u0004\u0018\u00010\u00112\b\u0010v\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010w\u001a\u00020\u0005J\u0010\u0010x\u001a\u00020\u00002\b\u0010y\u001a\u0004\u0018\u00010zJ\u0010\u0010{\u001a\u00020\u00002\b\u0010i\u001a\u0004\u0018\u00010jJ\u000e\u0010|\u001a\u00020o2\u0006\u0010\u001c\u001a\u00020\u000bJ\b\u0010}\u001a\u00020\u0011H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R&\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R&\u0010+\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R&\u0010-\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010!\"\u0004\b.\u0010#R&\u0010/\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R&\u00101\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R\u001a\u00103\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010(\"\u0004\b5\u0010*R\u001a\u00106\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010\u0016R \u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010;R\u001c\u0010@\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0019\"\u0004\bB\u0010\u001bR&\u0010C\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0014\"\u0004\bE\u0010\u0016R&\u0010F\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0014\"\u0004\bH\u0010\u0016R&\u0010I\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0014\"\u0004\bK\u0010\u0016R\u001a\u0010L\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010(\"\u0004\bN\u0010*R\u001a\u0010O\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010(\"\u0004\bQ\u0010*R\u001a\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0S8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R*\u0010T\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010Y\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0019\"\u0004\b[\u0010\u001bR\u001e\u0010\\\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010(\"\u0004\b^\u0010*R\u001e\u0010_\u001a\u00020'8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010(\"\u0004\ba\u0010*R\u001a\u0010b\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0019\"\u0004\bd\u0010\u001bR\u001a\u0010e\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010(\"\u0004\bg\u0010*¨\u0006~"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "Ljava/io/Serializable;", "()V", "_isAddedLocalList", "Landroidx/compose/runtime/MutableState;", "", "_isHide", "_isLocalMessageDiscolor", "_isPraise", "_isSendProp", "_num", "", "_praiseNum", "_propNum", "_sonFirst", "Lcom/yalla/yalla/model/moment/MomentReplyModel;", "content", "", "createTime", "getCreateTime", "()J", "setCreateTime", "(J)V", "headurl", "getHeadurl", "()Ljava/lang/String;", "setHeadurl", "(Ljava/lang/String;)V", "id", "getId", "setId", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isAddedLocalList", "()Z", "setAddedLocalList", "(Z)V", "isDel", "setDel", "isFeature", "", "()I", "setFeature", "(I)V", "isHide", "setHide", "isLocalMessageDiscolor", "setLocalMessageDiscolor", "isPraise", "setPraise", "isSendProp", "setSendProp", "kaVIPLv", "getKaVIPLv", "setKaVIPLv", "localId", "getLocalId", "setLocalId", "localSendRewardIsIn", "getLocalSendRewardIsIn", "()Landroidx/compose/runtime/MutableState;", "setLocalSendRewardIsIn", "(Landroidx/compose/runtime/MutableState;)V", "localShowRewardAnim", "getLocalShowRewardAnim", "nickname", "getNickname", "setNickname", "num", "getNum", "setNum", "praiseNum", "getPraiseNum", "setPraiseNum", "propNum", "getPropNum", "setPropNum", "role", "getRole", "setRole", "sex", "getSex", "setSex", "son", "", "sonFirst", "getSonFirst", "()Lcom/yalla/yalla/model/moment/MomentReplyModel;", "setSonFirst", "(Lcom/yalla/yalla/model/moment/MomentReplyModel;)V", "userid", "getUserid", "setUserid", "vip", "getVip", "setVip", "vipLevel", "getVipLevel", "setVipLevel", "wealthBadgeImage", "getWealthBadgeImage", "setWealthBadgeImage", "wealthLevel", "getWealthLevel", "setWealthLevel", "addLocalSendingCommentReplyModel", "sendPostCommentModel", "Lcom/yalla/yalla/model/moment/MomentSendCommentModel;", "getContent", "Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "removeLocalSendingCommentReplyModel", "replyAdd", "", "data", "replyDelete", "data0", "replyFirst", "setLoadMomentCommentDetailModel", "userId", "headUrl", "localMessageDiscolor", "setLocalCommentResultModel", "commentResultModel", "Lcom/yalla/yalla/model/moment/MomentCommentResultModel;", "setLocalSendingCommentModel", "setLocalSendingCommentModelId", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MomentCommentDetailModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private transient MutableState<Boolean> _isAddedLocalList;

    @Nullable
    private transient MutableState<Boolean> _isHide;

    @Nullable
    private transient MutableState<Boolean> _isLocalMessageDiscolor;

    @Nullable
    private transient MutableState<Boolean> _isPraise;

    @Nullable
    private transient MutableState<Boolean> _isSendProp;

    @Nullable
    private transient MutableState<Long> _num;

    @Nullable
    private transient MutableState<Long> _praiseNum;

    @Nullable
    private transient MutableState<Long> _propNum;

    @Nullable
    private transient MutableState<MomentReplyModel> _sonFirst;

    @Nullable
    private String content;
    private long createTime;

    @Nullable
    private String headurl;
    private long id;
    private boolean isAddedLocalList;
    private boolean isDel;
    private int isFeature;
    private boolean isHide;
    private boolean isLocalMessageDiscolor;
    private boolean isPraise;
    private boolean isSendProp;
    private int kaVIPLv;
    private long localId;

    @NotNull
    private transient MutableState<Boolean> localSendRewardIsIn;

    @NotNull
    private final transient MutableState<Boolean> localShowRewardAnim;

    @Nullable
    private String nickname;
    private long num;
    private long praiseNum;
    private long propNum;
    private int role;
    private int sex;

    @SerializedName("son")
    @NotNull
    private List<MomentReplyModel> son;

    @Nullable
    private MomentReplyModel sonFirst;

    @Nullable
    private String userid;

    @SerializedName("isVIP")
    private int vip;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    private int vipLevel;

    @NotNull
    private String wealthBadgeImage;
    private int wealthLevel;

    public MomentCommentDetailModel() {
        Boolean bool = Boolean.FALSE;
        this._isHide = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._num = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this._praiseNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this._isPraise = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._propNum = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.localShowRewardAnim = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.localSendRewardIsIn = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._isSendProp = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._isLocalMessageDiscolor = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.wealthBadgeImage = "";
        this._isAddedLocalList = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._sonFirst = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.son = new ArrayList();
    }

    @NotNull
    public final MomentCommentDetailModel addLocalSendingCommentReplyModel(@Nullable MomentSendCommentModel sendPostCommentModel) {
        setNum(getNum() + 1);
        MomentReplyModel momentReplyModel = new MomentReplyModel();
        Intrinsics.checkNotNull(sendPostCommentModel);
        MomentReplyModel localPostCommentReplyModel = momentReplyModel.setLocalPostCommentReplyModel(sendPostCommentModel);
        if (this.son.size() == 0) {
            this.son.add(localPostCommentReplyModel);
        } else {
            this.son.add(0, localPostCommentReplyModel);
        }
        setSonFirst(localPostCommentReplyModel);
        return this;
    }

    @NotNull
    public final MomentSendContentModel getContent() {
        MomentSendContentModel momentSendContentModel = new MomentSendContentModel("");
        if (TextUtils.isEmpty(this.content)) {
            return momentSendContentModel;
        }
        Object objOooO0O0 = oOOO00.OooO0O0(this.content, new TypeToken<MomentSendContentModel>() { // from class: com.yalla.yalla.model.moment.MomentCommentDetailModel.getContent.1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(...)");
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

    public final long getLocalId() {
        return this.localId;
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
    public final String getNickname() {
        return this.nickname;
    }

    public final long getNum() {
        if (this._num == null) {
            this._num = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(this.num), null, 2, null);
        }
        long j = this.num;
        MutableState<Long> mutableState = this._num;
        Intrinsics.checkNotNull(mutableState);
        if (j != mutableState.getValue().longValue()) {
            MutableState<Long> mutableState2 = this._num;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Long.valueOf(this.num));
        }
        MutableState<Long> mutableState3 = this._num;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().longValue();
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

    @Nullable
    public final MomentReplyModel getSonFirst() {
        if (!this.son.isEmpty()) {
            this.sonFirst = this.son.get(0);
        }
        if (this._sonFirst == null) {
            this._sonFirst = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(this.sonFirst, null, 2, null);
        }
        MomentReplyModel momentReplyModel = this.sonFirst;
        MutableState<MomentReplyModel> mutableState = this._sonFirst;
        Intrinsics.checkNotNull(mutableState);
        if (!Intrinsics.areEqual(momentReplyModel, mutableState.getValue())) {
            MutableState<MomentReplyModel> mutableState2 = this._sonFirst;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(this.sonFirst);
        }
        MutableState<MomentReplyModel> mutableState3 = this._sonFirst;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue();
    }

    @Nullable
    public final String getUserid() {
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

    public final boolean isAddedLocalList() {
        if (this._isAddedLocalList == null) {
            this._isAddedLocalList = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.isAddedLocalList), null, 2, null);
        }
        boolean z = this.isAddedLocalList;
        MutableState<Boolean> mutableState = this._isAddedLocalList;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._isAddedLocalList;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.isAddedLocalList));
        }
        MutableState<Boolean> mutableState3 = this._isAddedLocalList;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: isDel, reason: from getter */
    public final boolean getIsDel() {
        return this.isDel;
    }

    /* JADX INFO: renamed from: isFeature, reason: from getter */
    public final int getIsFeature() {
        return this.isFeature;
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

    public final boolean isLocalMessageDiscolor() {
        if (this._isLocalMessageDiscolor == null) {
            this._isLocalMessageDiscolor = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(this.isLocalMessageDiscolor), null, 2, null);
        }
        boolean z = this.isLocalMessageDiscolor;
        MutableState<Boolean> mutableState = this._isLocalMessageDiscolor;
        Intrinsics.checkNotNull(mutableState);
        if (z != mutableState.getValue().booleanValue()) {
            MutableState<Boolean> mutableState2 = this._isLocalMessageDiscolor;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Boolean.valueOf(this.isLocalMessageDiscolor));
        }
        MutableState<Boolean> mutableState3 = this._isLocalMessageDiscolor;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().booleanValue();
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

    @NotNull
    public final MomentCommentDetailModel removeLocalSendingCommentReplyModel(@NotNull MomentSendCommentModel sendPostCommentModel) {
        Intrinsics.checkNotNullParameter(sendPostCommentModel, "sendPostCommentModel");
        setNum(getNum() - 1 >= 0 ? getNum() - 1 : 0L);
        int size = this.son.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            MomentReplyModel momentReplyModel = this.son.get(i2);
            if (momentReplyModel != null && momentReplyModel.getLocalId() == sendPostCommentModel.getLocalId()) {
                i = i2;
                break;
            }
        }
        if (this.son.size() > i) {
            this.son.remove(i);
        }
        setSonFirst(null);
        return this;
    }

    public final void replyAdd(@NotNull MomentReplyModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        setNum(getNum() + 1);
        replyFirst(data);
    }

    public final void replyDelete(@Nullable MomentReplyModel data0) {
        setNum(getNum() - 1);
        if (getNum() < 0) {
            setNum(0L);
        }
        if (this.son.isEmpty()) {
            this.son.add(data0);
        } else {
            this.son.add(0, data0);
        }
        setSonFirst(data0);
    }

    public final void replyFirst(@NotNull MomentReplyModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.son.isEmpty()) {
            this.son.add(data);
        } else {
            this.son.add(0, data);
        }
        setSonFirst(data);
    }

    public final void setAddedLocalList(boolean z) {
        this.isAddedLocalList = z;
        if (this._isAddedLocalList == null) {
            this._isAddedLocalList = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        MutableState<Boolean> mutableState = this._isAddedLocalList;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDel(boolean z) {
        this.isDel = z;
    }

    public final void setFeature(int i) {
        this.isFeature = i;
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

    public final void setLoadMomentCommentDetailModel(long id, @Nullable String userId, @Nullable String nickname, @Nullable String headUrl, @Nullable String content, long createTime, boolean localMessageDiscolor) {
        this.id = id;
        this.userid = userId;
        this.nickname = nickname;
        this.headurl = headUrl;
        this.content = content;
        this.createTime = createTime;
        setLocalMessageDiscolor(localMessageDiscolor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MomentCommentDetailModel setLocalCommentResultModel(@Nullable MomentCommentResultModel commentResultModel) {
        if (commentResultModel != null) {
            this.id = commentResultModel.getCid();
            this.content = commentResultModel.getCommentContent();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Object value = o0O00oO0.OooOOo0().getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            this.userid = sb.toString();
            this.nickname = (String) o0O00oO0.OooOOoo().getValue();
            this.headurl = (String) o0O00oO0.OooO().getValue();
            T value2 = o0O00oO0.OooOOO().getValue();
            Intrinsics.checkNotNull(value2);
            this.sex = ((Number) value2).intValue();
            T value3 = o0O00oO0.OooOO0o().getValue();
            Intrinsics.checkNotNull(value3);
            Pair pair = (Pair) value3;
            this.vip = ((Boolean) pair.getFirst()).booleanValue() ? 1 : 0;
            this.vipLevel = ((Number) pair.getSecond()).intValue();
            this.createTime = System.currentTimeMillis();
            setNum(0L);
            this.isDel = true;
            this.son = new ArrayList();
            this.role = 0;
            setLocalMessageDiscolor(false);
            setPraiseNum(0L);
            this.isFeature = 0;
            setPraise(false);
            setPropNum(0L);
            setSendProp(false);
            MutableLiveData mutableLiveDataOooOO0 = o0O00oO0.OooOO0();
            if (mutableLiveDataOooOO0.getValue() != 0) {
                T value4 = mutableLiveDataOooOO0.getValue();
                Intrinsics.checkNotNull(value4);
                this.kaVIPLv = ((Number) ((Pair) value4).getSecond()).intValue();
            }
        }
        return this;
    }

    public final void setLocalId(long j) {
        this.localId = j;
    }

    public final void setLocalMessageDiscolor(boolean z) {
        this.isLocalMessageDiscolor = z;
        if (this._isLocalMessageDiscolor == null) {
            this._isSendProp = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }
        MutableState<Boolean> mutableState = this._isLocalMessageDiscolor;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final void setLocalSendRewardIsIn(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.localSendRewardIsIn = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MomentCommentDetailModel setLocalSendingCommentModel(@Nullable MomentSendCommentModel sendPostCommentModel) {
        if (sendPostCommentModel != null) {
            this.localId = sendPostCommentModel.getLocalId();
            this.id = 0L;
            MomentSendContentModel content = sendPostCommentModel.getContent();
            Intrinsics.checkNotNull(content);
            this.content = content.toJSONString();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Object value = o0O00oO0.OooOOo0().getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            this.userid = sb.toString();
            this.nickname = (String) o0O00oO0.OooOOoo().getValue();
            this.headurl = (String) o0O00oO0.OooO().getValue();
            T value2 = o0O00oO0.OooOOO().getValue();
            Intrinsics.checkNotNull(value2);
            this.sex = ((Number) value2).intValue();
            T value3 = o0O00oO0.OooOO0o().getValue();
            Intrinsics.checkNotNull(value3);
            Pair pair = (Pair) value3;
            this.vip = ((Boolean) pair.getFirst()).booleanValue() ? 1 : 0;
            this.vipLevel = ((Number) pair.getSecond()).intValue();
            this.createTime = System.currentTimeMillis();
            setNum(0L);
            this.isDel = true;
            this.son = new ArrayList();
            this.role = 0;
            setLocalMessageDiscolor(false);
            setPraiseNum(0L);
            this.isFeature = 0;
            setPraise(false);
            setPropNum(0L);
            setSendProp(false);
            Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
            this.kaVIPLv = pair2 != null ? ((Number) pair2.getSecond()).intValue() : VipLevel.Vip0.getValue();
        }
        return this;
    }

    public final void setLocalSendingCommentModelId(long id) {
        this.id = id;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setNum(long j) {
        this.num = j;
        if (this._num == null) {
            this._num = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j), null, 2, null);
        }
        MutableState<Long> mutableState = this._num;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Long.valueOf(j));
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

    public final void setSonFirst(@Nullable MomentReplyModel momentReplyModel) {
        this.sonFirst = momentReplyModel;
        if (this._sonFirst == null) {
            this._sonFirst = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(momentReplyModel, null, 2, null);
        }
        MutableState<MomentReplyModel> mutableState = this._sonFirst;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(momentReplyModel);
    }

    public final void setUserid(@Nullable String str) {
        this.userid = str;
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
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<MomentReplyModel> it = this.son.iterator();
        while (it.hasNext()) {
            stringBuffer.append(String.valueOf(it.next()));
        }
        long j = this.id;
        String str = this.userid;
        String str2 = this.nickname;
        String str3 = this.headurl;
        int i = this.sex;
        int i2 = this.vip;
        int i3 = this.vipLevel;
        String str4 = this.content;
        long num = getNum();
        long j2 = this.createTime;
        boolean z = this.isDel;
        int i4 = this.role;
        long propNum = getPropNum();
        boolean zIsSendProp = isSendProp();
        boolean zIsLocalMessageDiscolor = isLocalMessageDiscolor();
        MomentSendContentModel content = getContent();
        StringBuilder sb = new StringBuilder("MomentCommentDetailModel{id=");
        sb.append(j);
        sb.append(", userid='");
        sb.append(str);
        OooO0O0.OooO00o(sb, "', nickname='", str2, "', headurl='", str3);
        sb.append("', sex=");
        sb.append(i);
        sb.append(", vip=");
        sb.append(i2);
        sb.append(",\n             vipLevel=");
        sb.append(i3);
        sb.append(", content='");
        sb.append(str4);
        OooOOO0.OooO00o(sb, "', num=", num, ", createTime=");
        sb.append(j2);
        sb.append(", isDel=");
        sb.append(z);
        sb.append(", son=");
        sb.append((Object) stringBuffer);
        sb.append(", role=");
        sb.append(i4);
        OooOOO0.OooO00o(sb, ", \n             propNum=", propNum, ", isSendProp=");
        sb.append(zIsSendProp);
        sb.append(", localMessageDiscolor=");
        sb.append(zIsLocalMessageDiscolor);
        sb.append(", \n                getContent=");
        sb.append(content);
        sb.append("}");
        return sb.toString();
    }
}
