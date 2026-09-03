package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.share.internal.ShareConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p516o0o0O000.o0Oo0oo;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010{\u001a\u0004\u0018\u00010|J\b\u0010}\u001a\u0004\u0018\u00010~J\u0006\u0010\u007f\u001a\u00020MJ\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060CJ\u0019\u0010\t\u001a\u00030\u0081\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010L\u001a\u00020MJ\u0007\u0010\u0082\u0001\u001a\u00020\u0006J\t\u0010\u0083\u0001\u001a\u00020\u0006H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR\u001a\u0010'\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\u001a\u0010*\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\nR\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010\nR\u001a\u00106\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\b\"\u0004\bA\u0010\nR \u0010B\u001a\b\u0012\u0004\u0012\u00020D0CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR \u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR\u001a\u0010L\u001a\u00020MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010N\"\u0004\bO\u0010PR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\b\"\u0004\bS\u0010\nR \u0010T\u001a\b\u0012\u0004\u0012\u00020\u00060CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010F\"\u0004\bV\u0010HR\u001c\u0010W\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\b\"\u0004\bY\u0010\nR\u001c\u0010Z\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\b\"\u0004\b\\\u0010\nR\u001c\u0010]\u001a\u0004\u0018\u00010^X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0012\"\u0004\be\u0010\u0014R\u001a\u0010f\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0018\"\u0004\bh\u0010\u001aR\u001c\u0010i\u001a\u0004\u0018\u00010jX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001a\u0010o\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0018\"\u0004\bq\u0010\u001aR\u001a\u0010r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\b\"\u0004\bt\u0010\nR\u001a\u0010u\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0012\"\u0004\bw\u0010\u0014R\u001a\u0010x\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0018\"\u0004\bz\u0010\u001a¨\u0006\u0084\u0001"}, d2 = {"Lcom/yalla/yalla/model/MomentSendModel;", "Ljava/io/Serializable;", "contentModel", "Lcom/yalla/yalla/model/MomentSendContentModel;", "(Lcom/yalla/yalla/model/MomentSendContentModel;)V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "content", "getContent", "()Lcom/yalla/yalla/model/MomentSendContentModel;", "setContent", "editId", "", "getEditId", "()J", "setEditId", "(J)V", "editIsNewPic", "", "getEditIsNewPic", "()I", "setEditIsNewPic", "(I)V", "editMaxNum", "getEditMaxNum", "setEditMaxNum", "editModel", "Lcom/yalla/yalla/model/MomentEditModel;", "getEditModel", "()Lcom/yalla/yalla/model/MomentEditModel;", "setEditModel", "(Lcom/yalla/yalla/model/MomentEditModel;)V", "editPicFile", "getEditPicFile", "setEditPicFile", "editPicSizes", "getEditPicSizes", "setEditPicSizes", "editPicUrlName", "getEditPicUrlName", "setEditPicUrlName", "editState", "Lcom/yalla/yalla/model/MomentEditState;", "getEditState", "()Lcom/yalla/yalla/model/MomentEditState;", "setEditState", "(Lcom/yalla/yalla/model/MomentEditState;)V", "editToken", "getEditToken", "setEditToken", "editedNum", "getEditedNum", "setEditedNum", "forward", "Lcom/yalla/yalla/model/MomentDetailModel;", "getForward", "()Lcom/yalla/yalla/model/MomentDetailModel;", "setForward", "(Lcom/yalla/yalla/model/MomentDetailModel;)V", "forwardContentStr", "getForwardContentStr", "setForwardContentStr", "httpImagesFromEditMomentDetail", "", "Lcom/app/base/adapter/imageView9Grid/ImageView9GridModel;", "getHttpImagesFromEditMomentDetail", "()Ljava/util/List;", "setHttpImagesFromEditMomentDetail", "(Ljava/util/List;)V", "httpImagesFromEditMomentDetailUrl", "getHttpImagesFromEditMomentDetailUrl", "setHttpImagesFromEditMomentDetailUrl", "isToLocationInfo", "", "()Z", "setToLocationInfo", "(Z)V", "latitude", "getLatitude", "setLatitude", "listSendPostImage", "getListSendPostImage", "setListSendPostImage", "longitude", "getLongitude", "setLongitude", "notifyUserid", "getNotifyUserid", "setNotifyUserid", "poll", "Lcom/yalla/yalla/model/MomentSendPollModel;", "getPoll", "()Lcom/yalla/yalla/model/MomentSendPollModel;", "setPoll", "(Lcom/yalla/yalla/model/MomentSendPollModel;)V", ShareConstants.RESULT_POST_ID, "getPostId", "setPostId", "power", "getPower", "setPower", "sendPostState", "Lcom/yalla/yalla/model/MomentSendState;", "getSendPostState", "()Lcom/yalla/yalla/model/MomentSendState;", "setSendPostState", "(Lcom/yalla/yalla/model/MomentSendState;)V", "shareType", "getShareType", "setShareType", "sourcesid", "getSourcesid", "setSourcesid", "taskId", "getTaskId", "setTaskId", "type", "getType", "setType", "getForwardContent", "Lcom/yalla/yalla/model/MomentForwardContent;", "getMomentPoll", "Lcom/yalla/yalla/model/MomentPoll;", "isInEdit", "localImages", "", "toJSONString", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MomentSendModel implements Serializable {
    public static final int $stable = 8;

    @NotNull
    private String address;

    @Nullable
    private MomentSendContentModel content;
    private long editId;
    private int editIsNewPic;
    private int editMaxNum;

    @Nullable
    private MomentEditModel editModel;

    @NotNull
    private String editPicFile;

    @NotNull
    private String editPicSizes;

    @NotNull
    private String editPicUrlName;

    @Nullable
    private MomentEditState editState;

    @NotNull
    private String editToken;
    private int editedNum;

    @Nullable
    private MomentDetailModel forward;

    @NotNull
    private String forwardContentStr;

    @NotNull
    private List<ImageView9GridModel> httpImagesFromEditMomentDetail;

    @NotNull
    private List<String> httpImagesFromEditMomentDetailUrl;
    private boolean isToLocationInfo;

    @Nullable
    private String latitude;

    @NotNull
    private List<String> listSendPostImage;

    @Nullable
    private String longitude;

    @Nullable
    private String notifyUserid;

    @Nullable
    private MomentSendPollModel poll;
    private long postId;
    private int power;

    @Nullable
    private MomentSendState sendPostState;
    private int shareType;

    @NotNull
    private String sourcesid;
    private long taskId;
    private int type;

    /* JADX WARN: Multi-variable type inference failed */
    public MomentSendModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MomentSendModel(@Nullable MomentSendContentModel momentSendContentModel) {
        this.httpImagesFromEditMomentDetail = new ArrayList();
        this.httpImagesFromEditMomentDetailUrl = new ArrayList();
        this.editPicFile = "";
        this.editPicUrlName = "";
        this.editPicSizes = "";
        this.listSendPostImage = new ArrayList();
        this.address = "";
        this.sourcesid = "";
        this.editToken = "";
        this.content = momentSendContentModel;
        this.forwardContentStr = "";
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final MomentSendContentModel getContent() {
        return this.content;
    }

    public final long getEditId() {
        return this.editId;
    }

    public final int getEditIsNewPic() {
        return this.editIsNewPic;
    }

    public final int getEditMaxNum() {
        return this.editMaxNum;
    }

    @Nullable
    public final MomentEditModel getEditModel() {
        return this.editModel;
    }

    @NotNull
    public final String getEditPicFile() {
        return this.editPicFile;
    }

    @NotNull
    public final String getEditPicSizes() {
        return this.editPicSizes;
    }

    @NotNull
    public final String getEditPicUrlName() {
        return this.editPicUrlName;
    }

    @Nullable
    public final MomentEditState getEditState() {
        return this.editState;
    }

    @NotNull
    public final String getEditToken() {
        return this.editToken;
    }

    public final int getEditedNum() {
        return this.editedNum;
    }

    @Nullable
    public final MomentDetailModel getForward() {
        return this.forward;
    }

    @Nullable
    public final MomentForwardContent getForwardContent() {
        try {
            if (o00O0.OooO0o0(this.forwardContentStr)) {
                return (MomentForwardContent) o0Oo0oo.OooO0OO(this.forwardContentStr, MomentForwardContent.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @NotNull
    public final String getForwardContentStr() {
        return this.forwardContentStr;
    }

    @NotNull
    public final List<ImageView9GridModel> getHttpImagesFromEditMomentDetail() {
        return this.httpImagesFromEditMomentDetail;
    }

    @NotNull
    public final List<String> getHttpImagesFromEditMomentDetailUrl() {
        return this.httpImagesFromEditMomentDetailUrl;
    }

    @Nullable
    public final String getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final List<String> getListSendPostImage() {
        return this.listSendPostImage;
    }

    @Nullable
    public final String getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final MomentPoll getMomentPoll() {
        try {
            if (this.type == 21 && o00O0.OooO0o0(this.forwardContentStr)) {
                return (MomentPoll) o0Oo0oo.OooO0OO(this.forwardContentStr, MomentPoll.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Nullable
    public final String getNotifyUserid() {
        return this.notifyUserid;
    }

    @Nullable
    public final MomentSendPollModel getPoll() {
        return this.poll;
    }

    public final long getPostId() {
        return this.postId;
    }

    public final int getPower() {
        return this.power;
    }

    @Nullable
    public final MomentSendState getSendPostState() {
        return this.sendPostState;
    }

    public final int getShareType() {
        return this.shareType;
    }

    @NotNull
    public final String getSourcesid() {
        return this.sourcesid;
    }

    public final long getTaskId() {
        return this.taskId;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isInEdit() {
        return o00O0.OooO0o0(this.editToken);
    }

    /* JADX INFO: renamed from: isToLocationInfo, reason: from getter */
    public final boolean getIsToLocationInfo() {
        return this.isToLocationInfo;
    }

    @NotNull
    public final List<String> localImages() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.listSendPostImage) {
            if ((!StringsKt.isBlank(str)) && !o00O0.OooO0Oo(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void setContent(@Nullable MomentSendContentModel momentSendContentModel) {
        this.content = momentSendContentModel;
    }

    public final void setEditId(long j) {
        this.editId = j;
    }

    public final void setEditIsNewPic(int i) {
        this.editIsNewPic = i;
    }

    public final void setEditMaxNum(int i) {
        this.editMaxNum = i;
    }

    public final void setEditModel(@Nullable MomentEditModel momentEditModel) {
        this.editModel = momentEditModel;
    }

    public final void setEditPicFile(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.editPicFile = str;
    }

    public final void setEditPicSizes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.editPicSizes = str;
    }

    public final void setEditPicUrlName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.editPicUrlName = str;
    }

    public final void setEditState(@Nullable MomentEditState momentEditState) {
        this.editState = momentEditState;
    }

    public final void setEditToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.editToken = str;
    }

    public final void setEditedNum(int i) {
        this.editedNum = i;
    }

    public final void setForward(@Nullable MomentDetailModel momentDetailModel) {
        this.forward = momentDetailModel;
    }

    public final void setForwardContentStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.forwardContentStr = str;
    }

    public final void setHttpImagesFromEditMomentDetail(@NotNull List<ImageView9GridModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.httpImagesFromEditMomentDetail = list;
    }

    public final void setHttpImagesFromEditMomentDetailUrl(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.httpImagesFromEditMomentDetailUrl = list;
    }

    public final void setLatitude(@Nullable String str) {
        this.latitude = str;
    }

    public final void setListSendPostImage(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listSendPostImage = list;
    }

    public final void setLongitude(@Nullable String str) {
        this.longitude = str;
    }

    public final void setNotifyUserid(@Nullable String str) {
        this.notifyUserid = str;
    }

    public final void setPoll(@Nullable MomentSendPollModel momentSendPollModel) {
        this.poll = momentSendPollModel;
    }

    public final void setPostId(long j) {
        this.postId = j;
    }

    public final void setPower(int i) {
        this.power = i;
    }

    public final void setSendPostState(@Nullable MomentSendState momentSendState) {
        this.sendPostState = momentSendState;
    }

    public final void setShareType(int i) {
        this.shareType = i;
    }

    public final void setSourcesid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sourcesid = str;
    }

    public final void setTaskId(long j) {
        this.taskId = j;
    }

    public final void setToLocationInfo(boolean z) {
        this.isToLocationInfo = z;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public final String toJSONString() {
        return o0Oo0oo.OooO0O0(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MomentSendModel(\npostId=");
        sbOooO0o0.append(this.postId);
        sbOooO0o0.append(", taskId=");
        sbOooO0o0.append(this.taskId);
        sbOooO0o0.append(", type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append(", editToken='");
        sbOooO0o0.append(this.editToken);
        sbOooO0o0.append("',editedNum='");
        sbOooO0o0.append(this.editedNum);
        sbOooO0o0.append("',editMaxNum='");
        sbOooO0o0.append(this.editMaxNum);
        sbOooO0o0.append("',editId='");
        sbOooO0o0.append(this.editId);
        sbOooO0o0.append("',editIsNewPic='");
        sbOooO0o0.append(this.editIsNewPic);
        sbOooO0o0.append("',listSendPostImage=");
        sbOooO0o0.append(this.listSendPostImage);
        sbOooO0o0.append(", httpImagesFromEditMomentDetail=");
        sbOooO0o0.append(this.httpImagesFromEditMomentDetail);
        sbOooO0o0.append(", forward=");
        sbOooO0o0.append(this.forward);
        sbOooO0o0.append(", forwardContentStr=");
        sbOooO0o0.append(this.forwardContentStr);
        sbOooO0o0.append(", editState=");
        sbOooO0o0.append(this.editState);
        sbOooO0o0.append(", address='");
        sbOooO0o0.append(this.address);
        sbOooO0o0.append("', isToLocationInfo=");
        sbOooO0o0.append(this.isToLocationInfo);
        sbOooO0o0.append(", sourcesid='");
        sbOooO0o0.append(this.sourcesid);
        sbOooO0o0.append("', power=");
        sbOooO0o0.append(this.power);
        sbOooO0o0.append(", longitude=");
        sbOooO0o0.append(this.longitude);
        sbOooO0o0.append(", latitude=");
        sbOooO0o0.append(this.latitude);
        sbOooO0o0.append(", shareType=");
        sbOooO0o0.append(this.shareType);
        sbOooO0o0.append(", notifyUserid=");
        sbOooO0o0.append(this.notifyUserid);
        sbOooO0o0.append(", \ncontent=");
        sbOooO0o0.append(o0Oo0oo.OooO0O0(this.content));
        sbOooO0o0.append(", \npoll=");
        sbOooO0o0.append(o0Oo0oo.OooO0O0(this.poll));
        sbOooO0o0.append(", \n)");
        return sbOooO0o0.toString();
    }

    public final void setAddress(@Nullable String address, boolean isToLocationInfo) {
        if (address == null) {
            address = "";
        }
        this.address = address;
        this.isToLocationInfo = isToLocationInfo;
    }

    public /* synthetic */ MomentSendModel(MomentSendContentModel momentSendContentModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : momentSendContentModel);
    }
}
