package com.yalla.yalla.model.moment;

import OooO0OO.OooO0O0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.model.MomentSelectMedia;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;
import p187o00o00o0.OooO;
import p423o0OoO0OO.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001J\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001J\u0007\u0010\u0089\u0001\u001a\u00020TJ\u0007\u0010\u008a\u0001\u001a\u00020TJ\r\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020P0IJ\u0019\u0010\f\u001a\u00030\u008c\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010S\u001a\u00020TJ\u0007\u0010\u008d\u0001\u001a\u00020\tJ\t\u0010\u008e\u0001\u001a\u00020\tH\u0016R\u0018\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR\u001a\u0010-\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000b\"\u0004\b/\u0010\rR\u001a\u00100\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000b\"\u0004\b2\u0010\rR\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000b\"\u0004\b;\u0010\rR\u001a\u0010<\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u000b\"\u0004\bG\u0010\rR \u0010H\u001a\b\u0012\u0004\u0012\u00020J0IX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR \u0010O\u001a\b\u0012\u0004\u0012\u00020P0IX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\u001a\u0010S\u001a\u00020TX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010U\"\u0004\bV\u0010WR\u001c\u0010X\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u000b\"\u0004\bZ\u0010\rR \u0010[\u001a\b\u0012\u0004\u0012\u00020P0IX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010L\"\u0004\b]\u0010NR\u001c\u0010^\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u000b\"\u0004\b`\u0010\rR\u001c\u0010a\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u000b\"\u0004\bc\u0010\rR\u001c\u0010d\u001a\u0004\u0018\u00010eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001a\u0010j\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0015\"\u0004\bl\u0010\u0017R\u001a\u0010m\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u001b\"\u0004\bo\u0010\u001dR*\u0010q\u001a\u0004\u0018\u00010\u00072\b\u0010p\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u001b\"\u0004\bx\u0010\u001dR\u001a\u0010y\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u000b\"\u0004\b{\u0010\rR\u001a\u0010|\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0015\"\u0004\b~\u0010\u0017R\u001c\u0010\u007f\u001a\u00020\u0019X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u001b\"\u0005\b\u0081\u0001\u0010\u001dR\u001d\u0010\u0082\u0001\u001a\u00020\u0013X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0015\"\u0005\b\u0084\u0001\u0010\u0017¨\u0006\u008f\u0001"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentSendModel;", "Ljava/io/Serializable;", "contentModel", "Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "(Lcom/yalla/yalla/model/moment/MomentSendContentModel;)V", "_sendPostState", "Landroidx/compose/runtime/MutableState;", "Lcom/yalla/yalla/model/moment/MomentSendState;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "content", "getContent", "()Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "setContent", "editId", "", "getEditId", "()J", "setEditId", "(J)V", "editIsNewPic", "", "getEditIsNewPic", "()I", "setEditIsNewPic", "(I)V", "editIsNewVideo", "getEditIsNewVideo", "setEditIsNewVideo", "editMaxNum", "getEditMaxNum", "setEditMaxNum", "editModel", "Lcom/yalla/yalla/model/moment/MomentEditModel;", "getEditModel", "()Lcom/yalla/yalla/model/moment/MomentEditModel;", "setEditModel", "(Lcom/yalla/yalla/model/moment/MomentEditModel;)V", "editPicFile", "getEditPicFile", "setEditPicFile", "editPicSizes", "getEditPicSizes", "setEditPicSizes", "editPicUrlName", "getEditPicUrlName", "setEditPicUrlName", "editState", "Lcom/yalla/yalla/model/moment/MomentEditState;", "getEditState", "()Lcom/yalla/yalla/model/moment/MomentEditState;", "setEditState", "(Lcom/yalla/yalla/model/moment/MomentEditState;)V", "editToken", "getEditToken", "setEditToken", "editedNum", "getEditedNum", "setEditedNum", "forward", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "getForward", "()Lcom/yalla/yalla/model/moment/MomentDetailModel;", "setForward", "(Lcom/yalla/yalla/model/moment/MomentDetailModel;)V", "forwardContentStr", "getForwardContentStr", "setForwardContentStr", "httpImagesFromEditMomentDetail", "", "Lcom/yalla/yalla/model/moment/MomentImageModel;", "getHttpImagesFromEditMomentDetail", "()Ljava/util/List;", "setHttpImagesFromEditMomentDetail", "(Ljava/util/List;)V", "httpImagesFromEditMomentDetailMedia", "Lcom/yalla/yalla/model/MomentSelectMedia;", "getHttpImagesFromEditMomentDetailMedia", "setHttpImagesFromEditMomentDetailMedia", "isToLocationInfo", "", "()Z", "setToLocationInfo", "(Z)V", "latitude", "getLatitude", "setLatitude", "listSendPostMedia", "getListSendPostMedia", "setListSendPostMedia", "longitude", "getLongitude", "setLongitude", "notifyUserid", "getNotifyUserid", "setNotifyUserid", "poll", "Lcom/yalla/yalla/model/moment/MomentSendPollModel;", "getPoll", "()Lcom/yalla/yalla/model/moment/MomentSendPollModel;", "setPoll", "(Lcom/yalla/yalla/model/moment/MomentSendPollModel;)V", ShareConstants.RESULT_POST_ID, "getPostId", "setPostId", "power", "getPower", "setPower", AppMeasurementSdk.ConditionalUserProperty.VALUE, "sendPostState", "getSendPostState", "()Lcom/yalla/yalla/model/moment/MomentSendState;", "setSendPostState", "(Lcom/yalla/yalla/model/moment/MomentSendState;)V", "shareType", "getShareType", "setShareType", "sourcesid", "getSourcesid", "setSourcesid", "taskId", "getTaskId", "setTaskId", "type", "getType", "setType", "videoDuration", "getVideoDuration", "setVideoDuration", "getForwardContent", "Lcom/yalla/yalla/model/moment/MomentForwardContent;", "getMomentPoll", "Lcom/yalla/yalla/model/moment/MomentPoll;", "isInEdit", "isSendFailed", "localMedias", "", "toJSONString", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMomentSendModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendModel.kt\ncom/yalla/yalla/model/moment/MomentSendModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n1855#2,2:199\n*S KotlinDebug\n*F\n+ 1 MomentSendModel.kt\ncom/yalla/yalla/model/moment/MomentSendModel\n*L\n39#1:199,2\n*E\n"})
public final class MomentSendModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private transient MutableState<MomentSendState> _sendPostState;

    @NotNull
    private String address;

    @Nullable
    private MomentSendContentModel content;
    private long editId;
    private int editIsNewPic;
    private int editIsNewVideo;
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
    private List<MomentImageModel> httpImagesFromEditMomentDetail;

    @NotNull
    private List<MomentSelectMedia> httpImagesFromEditMomentDetailMedia;
    private boolean isToLocationInfo;

    @Nullable
    private String latitude;

    @NotNull
    private List<MomentSelectMedia> listSendPostMedia;

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
    private long videoDuration;

    /* JADX WARN: Multi-variable type inference failed */
    public MomentSendModel() {
        this(null, 1, 0 == true ? 1 : 0);
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

    public final int getEditIsNewVideo() {
        return this.editIsNewVideo;
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
            if (o00O00OO.OooO0o(this.forwardContentStr)) {
                return (MomentForwardContent) OooO.OooO0O0(MomentForwardContent.class, this.forwardContentStr);
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
    public final List<MomentImageModel> getHttpImagesFromEditMomentDetail() {
        return this.httpImagesFromEditMomentDetail;
    }

    @NotNull
    public final List<MomentSelectMedia> getHttpImagesFromEditMomentDetailMedia() {
        return this.httpImagesFromEditMomentDetailMedia;
    }

    @Nullable
    public final String getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final List<MomentSelectMedia> getListSendPostMedia() {
        return this.listSendPostMedia;
    }

    @Nullable
    public final String getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final MomentPoll getMomentPoll() {
        try {
            if (this.type == 21 && o00O00OO.OooO0o(this.forwardContentStr)) {
                return (MomentPoll) OooO.OooO0O0(MomentPoll.class, this.forwardContentStr);
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
        if (this._sendPostState == null) {
            this._sendPostState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(this.sendPostState, null, 2, null);
        }
        MomentSendState momentSendState = this.sendPostState;
        MutableState<MomentSendState> mutableState = this._sendPostState;
        Intrinsics.checkNotNull(mutableState);
        if (momentSendState != mutableState.getValue()) {
            MutableState<MomentSendState> mutableState2 = this._sendPostState;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(this.sendPostState);
        }
        MutableState<MomentSendState> mutableState3 = this._sendPostState;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue();
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

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final boolean isInEdit() {
        return o00O00OO.OooO0o(this.editToken);
    }

    public final boolean isSendFailed() {
        return getSendPostState() == MomentSendState.FailedImage || getSendPostState() == MomentSendState.FailedContent || getSendPostState() == MomentSendState.FailedSendFrequently;
    }

    /* JADX INFO: renamed from: isToLocationInfo, reason: from getter */
    public final boolean getIsToLocationInfo() {
        return this.isToLocationInfo;
    }

    @NotNull
    public final List<MomentSelectMedia> localMedias() {
        ArrayList arrayList = new ArrayList();
        for (MomentSelectMedia momentSelectMedia : this.listSendPostMedia) {
            if ((!StringsKt.isBlank(momentSelectMedia.getPath())) && !o00O00OO.OooO0Oo(momentSelectMedia.getPath())) {
                arrayList.add(momentSelectMedia);
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

    public final void setEditIsNewVideo(int i) {
        this.editIsNewVideo = i;
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

    public final void setHttpImagesFromEditMomentDetail(@NotNull List<MomentImageModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.httpImagesFromEditMomentDetail = list;
    }

    public final void setHttpImagesFromEditMomentDetailMedia(@NotNull List<MomentSelectMedia> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.httpImagesFromEditMomentDetailMedia = list;
    }

    public final void setLatitude(@Nullable String str) {
        this.latitude = str;
    }

    public final void setListSendPostMedia(@NotNull List<MomentSelectMedia> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listSendPostMedia = list;
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
        if (this._sendPostState == null) {
            this._sendPostState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(momentSendState, null, 2, null);
        }
        MutableState<MomentSendState> mutableState = this._sendPostState;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(momentSendState);
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

    public final void setVideoDuration(long j) {
        this.videoDuration = j;
    }

    @NotNull
    public final String toJSONString() {
        return OooO.OooO00o(this);
    }

    @NotNull
    public String toString() {
        long j = this.postId;
        long j2 = this.taskId;
        int i = this.type;
        String str = this.editToken;
        int i2 = this.editedNum;
        int i3 = this.editMaxNum;
        long j3 = this.editId;
        int i4 = this.editIsNewPic;
        List<MomentSelectMedia> list = this.listSendPostMedia;
        List<MomentImageModel> list2 = this.httpImagesFromEditMomentDetail;
        MomentDetailModel momentDetailModel = this.forward;
        String str2 = this.forwardContentStr;
        MomentEditState momentEditState = this.editState;
        String str3 = this.address;
        boolean z = this.isToLocationInfo;
        String str4 = this.sourcesid;
        int i5 = this.power;
        String str5 = this.longitude;
        String str6 = this.latitude;
        int i6 = this.shareType;
        String str7 = this.notifyUserid;
        String strOooO00o = OooO.OooO00o(this.content);
        String strOooO00o2 = OooO.OooO00o(this.poll);
        StringBuilder sbOooO00o = o00O0000.OooO00o("MomentSendModel(\npostId=", j, ", taskId=");
        sbOooO00o.append(j2);
        sbOooO00o.append(", type=");
        sbOooO00o.append(i);
        sbOooO00o.append(", editToken='");
        sbOooO00o.append(str);
        sbOooO00o.append("',editedNum='");
        sbOooO00o.append(i2);
        sbOooO00o.append("',editMaxNum='");
        sbOooO00o.append(i3);
        sbOooO00o.append("',editId='");
        sbOooO00o.append(j3);
        sbOooO00o.append("',editIsNewPic='");
        sbOooO00o.append(i4);
        sbOooO00o.append("',listSendPostMedia=");
        sbOooO00o.append(list);
        sbOooO00o.append(", httpImagesFromEditMomentDetail=");
        sbOooO00o.append(list2);
        sbOooO00o.append(", forward=");
        sbOooO00o.append(momentDetailModel);
        sbOooO00o.append(", forwardContentStr=");
        sbOooO00o.append(str2);
        sbOooO00o.append(", editState=");
        sbOooO00o.append(momentEditState);
        sbOooO00o.append(", address='");
        sbOooO00o.append(str3);
        sbOooO00o.append("', isToLocationInfo=");
        sbOooO00o.append(z);
        sbOooO00o.append(", sourcesid='");
        sbOooO00o.append(str4);
        sbOooO00o.append("', power=");
        sbOooO00o.append(i5);
        sbOooO00o.append(", longitude=");
        sbOooO00o.append(str5);
        sbOooO00o.append(", latitude=");
        sbOooO00o.append(str6);
        sbOooO00o.append(", shareType=");
        sbOooO00o.append(i6);
        OooO0O0.OooO00o(sbOooO00o, ", notifyUserid=", str7, ", \ncontent=", strOooO00o);
        return androidx.compose.compiler.plugins.kotlin.OooO0O0.OooO00o(sbOooO00o, ", \npoll=", strOooO00o2, ", \n)");
    }

    public MomentSendModel(@Nullable MomentSendContentModel momentSendContentModel) {
        this.httpImagesFromEditMomentDetail = new ArrayList();
        this.httpImagesFromEditMomentDetailMedia = new ArrayList();
        this.editPicFile = "";
        this.editPicUrlName = "";
        this.editPicSizes = "";
        this.listSendPostMedia = new ArrayList();
        this._sendPostState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.address = "";
        this.sourcesid = "";
        this.editToken = "";
        this.content = momentSendContentModel;
        this.forwardContentStr = "";
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
