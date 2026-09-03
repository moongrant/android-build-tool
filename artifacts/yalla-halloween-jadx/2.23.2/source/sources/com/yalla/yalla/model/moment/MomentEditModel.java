package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.share.internal.ShareConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;
import p423o0OoO0OO.o0000OO0;
import p423o0OoO0OO.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010C\u001a\u00020\u0019J\u000e\u0010D\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u0004J\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040+J\u0006\u0010F\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00040+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u001c\u00104\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR \u00107\u001a\b\u0012\u0004\u0012\u00020\u00040+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\u001c\u0010:\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001a\u0010=\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0012\"\u0004\b?\u0010\u0014R\u001a\u0010@\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010'\"\u0004\bB\u0010)¨\u0006G"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentEditModel;", "Ljava/io/Serializable;", "()V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "editAddress", "getEditAddress", "setEditAddress", "editId", "", "getEditId", "()J", "setEditId", "(J)V", "editPicSizes", "getEditPicSizes", "setEditPicSizes", "editPicUploadIsSuccess", "", "getEditPicUploadIsSuccess", "()Z", "setEditPicUploadIsSuccess", "(Z)V", "editPicUrlName", "getEditPicUrlName", "setEditPicUrlName", "editToken", "getEditToken", "setEditToken", "editedNum", "", "getEditedNum", "()I", "setEditedNum", "(I)V", "httpImagesFromEditMomentDetail", "", "Lcom/yalla/yalla/model/moment/MomentImageModel;", "getHttpImagesFromEditMomentDetail", "()Ljava/util/List;", "setHttpImagesFromEditMomentDetail", "(Ljava/util/List;)V", "httpImagesFromEditMomentDetailUrl", "getHttpImagesFromEditMomentDetailUrl", "setHttpImagesFromEditMomentDetailUrl", "latitude", "getLatitude", "setLatitude", "listSendPostImage", "getListSendPostImage", "setListSendPostImage", "longitude", "getLongitude", "setLongitude", ShareConstants.RESULT_POST_ID, "getPostId", "setPostId", "type", "getType", "setType", "isInEdit", "isInEditChanged", "localImages", "toJSONString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMomentEditModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentEditModel.kt\ncom/yalla/yalla/model/moment/MomentEditModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1855#2,2:82\n*S KotlinDebug\n*F\n+ 1 MomentEditModel.kt\ncom/yalla/yalla/model/moment/MomentEditModel\n*L\n52#1:82,2\n*E\n"})
public final class MomentEditModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private String content;
    private long editId;
    private boolean editPicUploadIsSuccess;
    private int editedNum;

    @Nullable
    private String latitude;

    @Nullable
    private String longitude;
    private long postId;
    private int type;

    @NotNull
    private List<MomentImageModel> httpImagesFromEditMomentDetail = new ArrayList();

    @NotNull
    private List<String> httpImagesFromEditMomentDetailUrl = new ArrayList();

    @NotNull
    private String editPicUrlName = "";

    @NotNull
    private String editPicSizes = "";

    @NotNull
    private String editToken = "";

    @NotNull
    private String editAddress = "";

    @NotNull
    private List<String> listSendPostImage = new ArrayList();

    @NotNull
    private String address = "";

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getEditAddress() {
        return this.editAddress;
    }

    public final long getEditId() {
        return this.editId;
    }

    @NotNull
    public final String getEditPicSizes() {
        return this.editPicSizes;
    }

    public final boolean getEditPicUploadIsSuccess() {
        return this.editPicUploadIsSuccess;
    }

    @NotNull
    public final String getEditPicUrlName() {
        return this.editPicUrlName;
    }

    @NotNull
    public final String getEditToken() {
        return this.editToken;
    }

    public final int getEditedNum() {
        return this.editedNum;
    }

    @NotNull
    public final List<MomentImageModel> getHttpImagesFromEditMomentDetail() {
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

    public final long getPostId() {
        return this.postId;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isInEdit() {
        return o00O00OO.OooO0o(this.editToken);
    }

    public final boolean isInEditChanged(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return (o0000OO0.OooO0O0(this.listSendPostImage, this.httpImagesFromEditMomentDetailUrl, new Function1<String, String>() { // from class: com.yalla.yalla.model.moment.MomentEditModel.isInEditChanged.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        }) || Intrinsics.areEqual(this.address, this.editAddress)) ? false : true;
    }

    @NotNull
    public final List<String> localImages() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.listSendPostImage) {
            if ((!StringsKt.isBlank(str)) && !o00O00OO.OooO0Oo(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setEditAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.editAddress = str;
    }

    public final void setEditId(long j) {
        this.editId = j;
    }

    public final void setEditPicSizes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.editPicSizes = str;
    }

    public final void setEditPicUploadIsSuccess(boolean z) {
        this.editPicUploadIsSuccess = z;
    }

    public final void setEditPicUrlName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.editPicUrlName = str;
    }

    public final void setEditToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.editToken = str;
    }

    public final void setEditedNum(int i) {
        this.editedNum = i;
    }

    public final void setHttpImagesFromEditMomentDetail(@NotNull List<MomentImageModel> list) {
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

    public final void setPostId(long j) {
        this.postId = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public final String toJSONString() {
        return OooO.OooO00o(this);
    }
}
