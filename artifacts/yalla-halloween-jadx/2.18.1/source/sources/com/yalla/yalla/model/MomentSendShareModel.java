package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.view.pop.roomSharePop.RoomShareModel;
import com.yalla.yalla.common.model.ShareWebModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010F\u001a\u00020\u0012H\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001c\u0010#\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u000203X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/yalla/yalla/model/MomentSendShareModel;", "Ljava/io/Serializable;", "type", "", "(I)V", "editMaxNum", "getEditMaxNum", "()Ljava/lang/Integer;", "setEditMaxNum", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "editMomentDetailModel", "Lcom/yalla/yalla/model/MomentDetailModel;", "getEditMomentDetailModel", "()Lcom/yalla/yalla/model/MomentDetailModel;", "setEditMomentDetailModel", "(Lcom/yalla/yalla/model/MomentDetailModel;)V", "editToken", "", "getEditToken", "()Ljava/lang/String;", "setEditToken", "(Ljava/lang/String;)V", "editedNum", "getEditedNum", "setEditedNum", "eventModel", "Lcom/yalla/yalla/model/EventModel;", "getEventModel", "()Lcom/yalla/yalla/model/EventModel;", "setEventModel", "(Lcom/yalla/yalla/model/EventModel;)V", "forwardMomentDetailModel", "getForwardMomentDetailModel", "setForwardMomentDetailModel", "imagePath", "getImagePath", "setImagePath", "momentAdapterTag", "Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "getMomentAdapterTag", "()Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "setMomentAdapterTag", "(Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;)V", "roomShareModel", "Lcom/app/base/view/pop/roomSharePop/RoomShareModel;", "getRoomShareModel", "()Lcom/app/base/view/pop/roomSharePop/RoomShareModel;", "setRoomShareModel", "(Lcom/app/base/view/pop/roomSharePop/RoomShareModel;)V", "sharePostType", "Lcom/yalla/yalla/model/MomentSendShareType;", "getSharePostType", "()Lcom/yalla/yalla/model/MomentSendShareType;", "setSharePostType", "(Lcom/yalla/yalla/model/MomentSendShareType;)V", "topicInfoModel", "Lcom/yalla/yalla/model/TopicInfoModel;", "getTopicInfoModel", "()Lcom/yalla/yalla/model/TopicInfoModel;", "setTopicInfoModel", "(Lcom/yalla/yalla/model/TopicInfoModel;)V", "getType", "()I", "webModel", "Lcom/yalla/yalla/common/model/ShareWebModel;", "getWebModel", "()Lcom/yalla/yalla/common/model/ShareWebModel;", "setWebModel", "(Lcom/yalla/yalla/common/model/ShareWebModel;)V", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MomentSendShareModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private MomentDetailModel editMomentDetailModel;

    @Nullable
    private String editToken;

    @Nullable
    private EventModel eventModel;

    @Nullable
    private MomentDetailModel forwardMomentDetailModel;

    @Nullable
    private String imagePath;

    @Nullable
    private MomentAdapterTag momentAdapterTag;

    @Nullable
    private RoomShareModel roomShareModel;

    @Nullable
    private TopicInfoModel topicInfoModel;
    private final int type;

    @Nullable
    private ShareWebModel webModel;

    @NotNull
    private MomentSendShareType sharePostType = MomentSendShareType.CreateText;

    @Nullable
    private Integer editedNum = 0;

    @Nullable
    private Integer editMaxNum = 0;

    public MomentSendShareModel(int i) {
        this.type = i;
    }

    @Nullable
    public final Integer getEditMaxNum() {
        return this.editMaxNum;
    }

    @Nullable
    public final MomentDetailModel getEditMomentDetailModel() {
        return this.editMomentDetailModel;
    }

    @Nullable
    public final String getEditToken() {
        return this.editToken;
    }

    @Nullable
    public final Integer getEditedNum() {
        return this.editedNum;
    }

    @Nullable
    public final EventModel getEventModel() {
        return this.eventModel;
    }

    @Nullable
    public final MomentDetailModel getForwardMomentDetailModel() {
        return this.forwardMomentDetailModel;
    }

    @Nullable
    public final String getImagePath() {
        return this.imagePath;
    }

    @Nullable
    public final MomentAdapterTag getMomentAdapterTag() {
        return this.momentAdapterTag;
    }

    @Nullable
    public final RoomShareModel getRoomShareModel() {
        return this.roomShareModel;
    }

    @NotNull
    public final MomentSendShareType getSharePostType() {
        return this.sharePostType;
    }

    @Nullable
    public final TopicInfoModel getTopicInfoModel() {
        return this.topicInfoModel;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final ShareWebModel getWebModel() {
        return this.webModel;
    }

    public final void setEditMaxNum(@Nullable Integer num) {
        this.editMaxNum = num;
    }

    public final void setEditMomentDetailModel(@Nullable MomentDetailModel momentDetailModel) {
        this.editMomentDetailModel = momentDetailModel;
    }

    public final void setEditToken(@Nullable String str) {
        this.editToken = str;
    }

    public final void setEditedNum(@Nullable Integer num) {
        this.editedNum = num;
    }

    public final void setEventModel(@Nullable EventModel eventModel) {
        this.eventModel = eventModel;
    }

    public final void setForwardMomentDetailModel(@Nullable MomentDetailModel momentDetailModel) {
        this.forwardMomentDetailModel = momentDetailModel;
    }

    public final void setImagePath(@Nullable String str) {
        this.imagePath = str;
    }

    public final void setMomentAdapterTag(@Nullable MomentAdapterTag momentAdapterTag) {
        this.momentAdapterTag = momentAdapterTag;
    }

    public final void setRoomShareModel(@Nullable RoomShareModel roomShareModel) {
        this.roomShareModel = roomShareModel;
    }

    public final void setSharePostType(@NotNull MomentSendShareType momentSendShareType) {
        Intrinsics.checkNotNullParameter(momentSendShareType, "<set-?>");
        this.sharePostType = momentSendShareType;
    }

    public final void setTopicInfoModel(@Nullable TopicInfoModel topicInfoModel) {
        this.topicInfoModel = topicInfoModel;
    }

    public final void setWebModel(@Nullable ShareWebModel shareWebModel) {
        this.webModel = shareWebModel;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MomentSendShareModel(\n\t type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append(", \n\t sharePostType=");
        sbOooO0o0.append(this.sharePostType);
        sbOooO0o0.append(", \n\t imagePath=");
        sbOooO0o0.append(this.imagePath);
        sbOooO0o0.append(", \n\t roomShareModel=");
        sbOooO0o0.append(this.roomShareModel);
        sbOooO0o0.append(", \n\t topicInfoModel=");
        sbOooO0o0.append(this.topicInfoModel);
        sbOooO0o0.append(", \n\t eventModel=");
        sbOooO0o0.append(this.eventModel);
        sbOooO0o0.append(", \n\t webModel=");
        sbOooO0o0.append(this.webModel);
        sbOooO0o0.append(", \n\t forwardMomentDetailModel=");
        sbOooO0o0.append(this.forwardMomentDetailModel);
        sbOooO0o0.append(", \n\t editMomentDetailModel=");
        sbOooO0o0.append(this.editMomentDetailModel);
        sbOooO0o0.append(", \n\t momentAdapterTag=");
        sbOooO0o0.append(this.momentAdapterTag);
        sbOooO0o0.append(", \n\t editToken=");
        sbOooO0o0.append(this.editToken);
        sbOooO0o0.append(", \n\t editedNum=");
        sbOooO0o0.append(this.editedNum);
        sbOooO0o0.append("\n\t editMaxNum=");
        sbOooO0o0.append(this.editMaxNum);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
