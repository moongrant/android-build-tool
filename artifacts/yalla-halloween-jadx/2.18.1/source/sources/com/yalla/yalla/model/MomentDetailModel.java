package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.common.db.table.UserInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.o00Oo0;
import p498o0o00Oo0.OooOOO;
import p516o0o0O000.o0Oo0oo;
import p522o0o0O0o.o000O0;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010©\u0001\u001a\u00030ª\u00012\u0007\u0010£\u0001\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\nJ\n\u0010«\u0001\u001a\u0005\u0018\u00010¬\u0001J\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u0001J\u0007\u0010¯\u0001\u001a\u00020\nJ\u0017\u0010°\u0001\u001a\u0012\u0012\u0004\u0012\u00020g0fj\b\u0012\u0004\u0012\u00020g`hJ\n\u0010±\u0001\u001a\u0005\u0018\u00010²\u0001J\u0007\u0010³\u0001\u001a\u00020\u0010J\u0011\u0010´\u0001\u001a\u00030ª\u00012\u0007\u0010µ\u0001\u001a\u00020\nJ\t\u0010¶\u0001\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0012\u00103\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R\u001a\u00107\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR\u001e\u0010:\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R\u001a\u0010=\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0012\"\u0004\b>\u0010\u0014R\u001a\u0010?\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0012\"\u0004\b@\u0010\u0014R\u001a\u0010A\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0012\"\u0004\bB\u0010\u0014R\u001a\u0010C\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0012\"\u0004\bD\u0010\u0014R\u001a\u0010E\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0012\"\u0004\bF\u0010\u0014R\u001e\u0010G\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0012\"\u0004\bH\u0010\u0014R\u001a\u0010I\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0012\"\u0004\bJ\u0010\u0014R\u001a\u0010K\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0012\"\u0004\bL\u0010\u0014R\u001a\u0010M\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0012\"\u0004\b1\u0010\u0014R\u001e\u0010N\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0012\"\u0004\bO\u0010\u0014R\u001a\u0010P\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010+\"\u0004\bQ\u0010-R\u001a\u0010R\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0012\"\u0004\bS\u0010\u0014R\u001a\u0010T\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0012\"\u0004\bU\u0010\u0014R\u001e\u0010V\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0012\"\u0004\bW\u0010\u0014R\u001a\u0010X\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0012\"\u0004\bY\u0010\u0014R\u001a\u0010Z\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0012\"\u0004\b[\u0010\u0014R\u001e\u0010\\\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0012\"\u0004\b^\u0010\u0014R\u001a\u0010_\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010+\"\u0004\ba\u0010-R\u001a\u0010b\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010+\"\u0004\bd\u0010-R\u001e\u0010e\u001a\u0012\u0012\u0004\u0012\u00020g0fj\b\u0012\u0004\u0012\u00020g`hX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010i\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\f\"\u0004\bk\u0010\u000eR\u001e\u0010l\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010+\"\u0004\bn\u0010-R\u001a\u0010o\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\f\"\u0004\bq\u0010\u000eR\u001e\u0010r\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\f\"\u0004\bt\u0010\u000eR\u001a\u0010u\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\f\"\u0004\bw\u0010\u000eR\u001e\u0010x\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010+\"\u0004\bz\u0010-R\u001a\u0010{\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010+\"\u0004\b}\u0010-R\u001b\u0010~\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010!\"\u0005\b\u0080\u0001\u0010#R\u001d\u0010\u0081\u0001\u001a\u00020)X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010+\"\u0005\b\u0083\u0001\u0010-R\"\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R+\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R#\u0010\u0091\u0001\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010\f\"\u0005\b\u0093\u0001\u0010\u000eR\u001d\u0010\u0094\u0001\u001a\u00020)X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010+\"\u0005\b\u0096\u0001\u0010-R\u001d\u0010\u0097\u0001\u001a\u00020\nX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010\f\"\u0005\b\u0099\u0001\u0010\u000eR\u001d\u0010\u009a\u0001\u001a\u00020\u001fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010!\"\u0005\b\u009c\u0001\u0010#R\u001d\u0010\u009d\u0001\u001a\u00020\u001fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010!\"\u0005\b\u009f\u0001\u0010#R\u001d\u0010 \u0001\u001a\u00020)X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u0010+\"\u0005\b¢\u0001\u0010-R\u001d\u0010£\u0001\u001a\u00020\u001fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0001\u0010!\"\u0005\b¥\u0001\u0010#R\u001d\u0010¦\u0001\u001a\u00020\u001fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u0010!\"\u0005\b¨\u0001\u0010#¨\u0006·\u0001"}, d2 = {"Lcom/yalla/yalla/model/MomentDetailModel;", "Ljava/io/Serializable;", "()V", "adData", "Lcom/yalla/yalla/model/MomentAdDataModel;", "getAdData", "()Lcom/yalla/yalla/model/MomentAdDataModel;", "setAdData", "(Lcom/yalla/yalla/model/MomentAdDataModel;)V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "attachedIsDelete", "", "getAttachedIsDelete", "()Z", "setAttachedIsDelete", "(Z)V", "circleDisbanded", "getCircleDisbanded", "setCircleDisbanded", "comment", "Lcom/yalla/yalla/model/MomentCommentModel;", "getComment", "()Lcom/yalla/yalla/model/MomentCommentModel;", "setComment", "(Lcom/yalla/yalla/model/MomentCommentModel;)V", "commentNum", "", "getCommentNum", "()J", "setCommentNum", "(J)V", "content", "createTime", "getCreateTime", "setCreateTime", "deleteType", "", "getDeleteType", "()I", "setDeleteType", "(I)V", "forward", "getForward", "()Lcom/yalla/yalla/model/MomentDetailModel;", "setForward", "(Lcom/yalla/yalla/model/MomentDetailModel;)V", "forwardContent", "forwardType", "getForwardType", "setForwardType", "headUrl", "getHeadUrl", "setHeadUrl", "id", "getId", "setId", "isCanDel", "setCanDel", "isCanEdit", "setCanEdit", "isCanReport", "setCanReport", "isCanShare", "setCanShare", "isCanTop", "setCanTop", "isEdited", "setEdited", "isFeatured", "setFeatured", "isFollow", "setFollow", "isForward", "isFriend", "setFriend", "isInHeBlack", "setInHeBlack", "isInRoom", "setInRoom", "isPraise", "setPraise", "isTop", "setTop", "isVIP", "setVIP", "isWaterMark", "setWaterMark", "isblack", "getIsblack", "setIsblack", "kaVipLv", "getKaVipLv", "setKaVipLv", "kaVipState", "getKaVipState", "setKaVipState", "listImageInfo", "Ljava/util/ArrayList;", "Lcom/app/base/adapter/imageView9Grid/ImageView9GridModel;", "Lkotlin/collections/ArrayList;", "medal", "getMedal", "setMedal", "nVipLv", "getNVipLv", "setNVipLv", "nickName", "getNickName", "setNickName", "pFName", "getPFName", "setPFName", "pNumber", "getPNumber", "setPNumber", "positionid", "getPositionid", "setPositionid", "power", "getPower", "setPower", "praiseNum", "getPraiseNum", "setPraiseNum", "role", "getRole", "setRole", "sendPostModel", "Lcom/yalla/yalla/model/MomentSendModel;", "getSendPostModel", "()Lcom/yalla/yalla/model/MomentSendModel;", "setSendPostModel", "(Lcom/yalla/yalla/model/MomentSendModel;)V", "sendPropUsers", "", "Lcom/yalla/yalla/common/db/table/UserInfo;", "getSendPropUsers", "()Ljava/util/List;", "setSendPropUsers", "(Ljava/util/List;)V", "sessionId", "getSessionId", "setSessionId", "sex", "getSex", "setSex", "size", "getSize", "setSize", "sourcesId", "getSourcesId", "setSourcesId", "totalPropValue", "getTotalPropValue", "setTotalPropValue", "type", "getType", "setType", "userId", "getUserId", "setUserId", "userIdx", "getUserIdx", "setUserIdx", "addGiftGiver", "", "getContent", "Lcom/yalla/yalla/model/MomentSendContentModel;", "getForwardContent", "Lcom/yalla/yalla/model/MomentForwardContent;", "getForwardContentStr", "getImageInfoList", "getMomentPoll", "Lcom/yalla/yalla/model/MomentPoll;", "isMySelf", "setMomentPoll", "pollJsonString", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MomentDetailModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private MomentAdDataModel adData;
    private boolean attachedIsDelete;
    private boolean circleDisbanded;

    @SerializedName(alternate = {"commentHotInfo"}, value = "comment")
    @Nullable
    private MomentCommentModel comment;
    private long commentNum;

    @Nullable
    private String content;
    private long createTime;
    private int deleteType;

    @Nullable
    private MomentDetailModel forward;
    private int forwardType;

    @SerializedName(alternate = {"dyid"}, value = "id")
    private long id;
    private boolean isCanDel;
    private boolean isCanEdit;
    private boolean isCanReport;
    private boolean isCanShare;
    private boolean isCanTop;

    @SerializedName(alternate = {"isEdited"}, value = "isEdit")
    private boolean isEdited;
    private boolean isFeatured;
    private boolean isFollow;
    private boolean isForward;

    @SerializedName("isFrind")
    private boolean isFriend;
    private boolean isInRoom;
    private boolean isPraise;

    @SerializedName(alternate = {"isTop", "isTopForUserPostList"}, value = "istop")
    private boolean isTop;
    private boolean isVIP;
    private boolean isWaterMark;

    @SerializedName(alternate = {"isBlack"}, value = "isblack")
    private boolean isblack;
    private int kaVipLv;
    private int kaVipState;

    @SerializedName(alternate = {"nVIPLv", "nVipLv"}, value = "nvipLv")
    private int nVipLv;

    @SerializedName(alternate = {"positionId"}, value = "positionid")
    private int positionid;
    private int power;
    private long praiseNum;
    private int role;

    @Nullable
    private MomentSendModel sendPostModel;

    @SerializedName(alternate = {"sessionid"}, value = "sessionId")
    @Nullable
    private String sessionId;
    private int sex;
    private long sourcesId;
    private long totalPropValue;
    private int type;
    private long userId;
    private long userIdx;

    @NotNull
    private String nickName = "";

    @NotNull
    private String headUrl = "";

    @NotNull
    private String address = "";

    @SerializedName("pFname")
    @NotNull
    private String pFName = "";

    @NotNull
    private String pNumber = "";

    @NotNull
    private String size = "";

    @NotNull
    private String medal = "";

    @SerializedName("sendPropUsers")
    @NotNull
    private List<UserInfo> sendPropUsers = new ArrayList();

    @SerializedName("forwardConent")
    @NotNull
    private String forwardContent = "";

    @NotNull
    private ArrayList<ImageView9GridModel> listImageInfo = new ArrayList<>();
    private int isInHeBlack = -1;

    public final void addGiftGiver(final long userId, @NotNull String headUrl) {
        Intrinsics.checkNotNullParameter(headUrl, "headUrl");
        o000O0.OooO0OO(this.sendPropUsers, new Function1<UserInfo, Boolean>() { // from class: com.yalla.yalla.model.MomentDetailModel.addGiftGiver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull UserInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getUserId() == userId);
            }
        });
        List<UserInfo> list = this.sendPropUsers;
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setUserHeader(headUrl);
        Unit unit = Unit.INSTANCE;
        list.add(0, userInfo);
    }

    @Nullable
    public final MomentAdDataModel getAdData() {
        return this.adData;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    public final boolean getAttachedIsDelete() {
        return this.attachedIsDelete;
    }

    public final boolean getCircleDisbanded() {
        return this.circleDisbanded;
    }

    @Nullable
    public final MomentCommentModel getComment() {
        return this.comment;
    }

    public final long getCommentNum() {
        return this.commentNum;
    }

    @Nullable
    public final MomentSendContentModel getContent() {
        String str = this.content;
        if (str != null) {
            return (MomentSendContentModel) o0Oo0oo.OooO0OO(str, MomentSendContentModel.class);
        }
        return null;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDeleteType() {
        return this.deleteType;
    }

    @Nullable
    public final MomentDetailModel getForward() {
        return this.forward;
    }

    @Nullable
    public final MomentForwardContent getForwardContent() {
        try {
            if (o00O0.OooO0o0(this.forwardContent)) {
                return (MomentForwardContent) o0Oo0oo.OooO0OO(this.forwardContent, MomentForwardContent.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getForwardContentStr, reason: from getter */
    public final String getForwardContent() {
        return this.forwardContent;
    }

    public final int getForwardType() {
        return this.forwardType;
    }

    @NotNull
    public final String getHeadUrl() {
        return this.headUrl;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final ArrayList<ImageView9GridModel> getImageInfoList() {
        if (!this.listImageInfo.isEmpty()) {
            return this.listImageInfo;
        }
        ArrayList<ImageView9GridModel> arrayListOooO00o = o00Oo0.OooO00o(this.pFName, this.pNumber, this.size);
        Intrinsics.checkNotNullExpressionValue(arrayListOooO00o, "getImageInfoList(pFName, pNumber, size)");
        this.listImageInfo = arrayListOooO00o;
        return arrayListOooO00o;
    }

    public final boolean getIsblack() {
        return this.isblack;
    }

    public final int getKaVipLv() {
        return this.kaVipLv;
    }

    public final int getKaVipState() {
        return this.kaVipState;
    }

    @NotNull
    public final String getMedal() {
        return this.medal;
    }

    @Nullable
    public final MomentPoll getMomentPoll() {
        try {
            if (this.type == 21 && o00O0.OooO0o0(this.forwardContent)) {
                return (MomentPoll) o0Oo0oo.OooO0OO(this.forwardContent, MomentPoll.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public final int getNVipLv() {
        return this.nVipLv;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final String getPFName() {
        return this.pFName;
    }

    @NotNull
    public final String getPNumber() {
        return this.pNumber;
    }

    public final int getPositionid() {
        return this.positionid;
    }

    public final int getPower() {
        return this.power;
    }

    public final long getPraiseNum() {
        return this.praiseNum;
    }

    public final int getRole() {
        return this.role;
    }

    @Nullable
    public final MomentSendModel getSendPostModel() {
        return this.sendPostModel;
    }

    @NotNull
    public final List<UserInfo> getSendPropUsers() {
        return this.sendPropUsers;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSex() {
        return this.sex;
    }

    @NotNull
    public final String getSize() {
        return this.size;
    }

    public final long getSourcesId() {
        return this.sourcesId;
    }

    public final long getTotalPropValue() {
        return this.totalPropValue;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final long getUserIdx() {
        return this.userIdx;
    }

    /* JADX INFO: renamed from: isCanDel, reason: from getter */
    public final boolean getIsCanDel() {
        return this.isCanDel;
    }

    /* JADX INFO: renamed from: isCanEdit, reason: from getter */
    public final boolean getIsCanEdit() {
        return this.isCanEdit;
    }

    /* JADX INFO: renamed from: isCanReport, reason: from getter */
    public final boolean getIsCanReport() {
        return this.isCanReport;
    }

    /* JADX INFO: renamed from: isCanShare, reason: from getter */
    public final boolean getIsCanShare() {
        return this.isCanShare;
    }

    /* JADX INFO: renamed from: isCanTop, reason: from getter */
    public final boolean getIsCanTop() {
        return this.isCanTop;
    }

    /* JADX INFO: renamed from: isEdited, reason: from getter */
    public final boolean getIsEdited() {
        return this.isEdited;
    }

    /* JADX INFO: renamed from: isFeatured, reason: from getter */
    public final boolean getIsFeatured() {
        return this.isFeatured;
    }

    /* JADX INFO: renamed from: isFollow, reason: from getter */
    public final boolean getIsFollow() {
        return this.isFollow;
    }

    /* JADX INFO: renamed from: isForward, reason: from getter */
    public final boolean getIsForward() {
        return this.isForward;
    }

    /* JADX INFO: renamed from: isFriend, reason: from getter */
    public final boolean getIsFriend() {
        return this.isFriend;
    }

    /* JADX INFO: renamed from: isInHeBlack, reason: from getter */
    public final int getIsInHeBlack() {
        return this.isInHeBlack;
    }

    /* JADX INFO: renamed from: isInRoom, reason: from getter */
    public final boolean getIsInRoom() {
        return this.isInRoom;
    }

    public final boolean isMySelf() {
        long j = this.userId;
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        return value != null && j == value.longValue();
    }

    /* JADX INFO: renamed from: isPraise, reason: from getter */
    public final boolean getIsPraise() {
        return this.isPraise;
    }

    /* JADX INFO: renamed from: isTop, reason: from getter */
    public final boolean getIsTop() {
        return this.isTop;
    }

    /* JADX INFO: renamed from: isVIP, reason: from getter */
    public final boolean getIsVIP() {
        return this.isVIP;
    }

    /* JADX INFO: renamed from: isWaterMark, reason: from getter */
    public final boolean getIsWaterMark() {
        return this.isWaterMark;
    }

    public final void setAdData(@Nullable MomentAdDataModel momentAdDataModel) {
        this.adData = momentAdDataModel;
    }

    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void setAttachedIsDelete(boolean z) {
        this.attachedIsDelete = z;
    }

    public final void setCanDel(boolean z) {
        this.isCanDel = z;
    }

    public final void setCanEdit(boolean z) {
        this.isCanEdit = z;
    }

    public final void setCanReport(boolean z) {
        this.isCanReport = z;
    }

    public final void setCanShare(boolean z) {
        this.isCanShare = z;
    }

    public final void setCanTop(boolean z) {
        this.isCanTop = z;
    }

    public final void setCircleDisbanded(boolean z) {
        this.circleDisbanded = z;
    }

    public final void setComment(@Nullable MomentCommentModel momentCommentModel) {
        this.comment = momentCommentModel;
    }

    public final void setCommentNum(long j) {
        this.commentNum = j;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDeleteType(int i) {
        this.deleteType = i;
    }

    public final void setEdited(boolean z) {
        this.isEdited = z;
    }

    public final void setFeatured(boolean z) {
        this.isFeatured = z;
    }

    public final void setFollow(boolean z) {
        this.isFollow = z;
    }

    public final void setForward(boolean z) {
        this.isForward = z;
    }

    public final void setForwardType(int i) {
        this.forwardType = i;
    }

    public final void setFriend(boolean z) {
        this.isFriend = z;
    }

    public final void setHeadUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headUrl = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setInHeBlack(int i) {
        this.isInHeBlack = i;
    }

    public final void setInRoom(boolean z) {
        this.isInRoom = z;
    }

    public final void setIsblack(boolean z) {
        this.isblack = z;
    }

    public final void setKaVipLv(int i) {
        this.kaVipLv = i;
    }

    public final void setKaVipState(int i) {
        this.kaVipState = i;
    }

    public final void setMedal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.medal = str;
    }

    public final void setMomentPoll(@NotNull String pollJsonString) {
        Intrinsics.checkNotNullParameter(pollJsonString, "pollJsonString");
        this.forwardContent = pollJsonString;
    }

    public final void setNVipLv(int i) {
        this.nVipLv = i;
    }

    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    public final void setPFName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pFName = str;
    }

    public final void setPNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pNumber = str;
    }

    public final void setPositionid(int i) {
        this.positionid = i;
    }

    public final void setPower(int i) {
        this.power = i;
    }

    public final void setPraise(boolean z) {
        this.isPraise = z;
    }

    public final void setPraiseNum(long j) {
        this.praiseNum = j;
    }

    public final void setRole(int i) {
        this.role = i;
    }

    public final void setSendPostModel(@Nullable MomentSendModel momentSendModel) {
        this.sendPostModel = momentSendModel;
    }

    public final void setSendPropUsers(@NotNull List<UserInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sendPropUsers = list;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    public final void setSex(int i) {
        this.sex = i;
    }

    public final void setSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.size = str;
    }

    public final void setSourcesId(long j) {
        this.sourcesId = j;
    }

    public final void setTop(boolean z) {
        this.isTop = z;
    }

    public final void setTotalPropValue(long j) {
        this.totalPropValue = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final void setUserIdx(long j) {
        this.userIdx = j;
    }

    public final void setVIP(boolean z) {
        this.isVIP = z;
    }

    public final void setWaterMark(boolean z) {
        this.isWaterMark = z;
    }

    @NotNull
    public String toString() {
        return o0Oo0oo.OooO0O0(this);
    }

    public final void setForward(@Nullable MomentDetailModel momentDetailModel) {
        this.forward = momentDetailModel;
    }
}
