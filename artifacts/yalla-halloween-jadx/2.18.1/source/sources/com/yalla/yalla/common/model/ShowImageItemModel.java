package com.yalla.yalla.common.model;

import OooO00o.OooO00o;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.selectPicture.model.ImageLocationInfo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0016JV\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\tHÖ\u0001J\b\u00101\u001a\u00020\u0003H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u000b\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00062"}, d2 = {"Lcom/yalla/yalla/common/model/ShowImageItemModel;", "Ljava/io/Serializable;", "url", "", "imageView", "Landroid/widget/ImageView;", "imageLocationInfo", "Lcom/app/selectPicture/model/ImageLocationInfo;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", "watermarkText", "isSave", "", "(Ljava/lang/String;Landroid/widget/ImageView;Lcom/app/selectPicture/model/ImageLocationInfo;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getImageLocationInfo", "()Lcom/app/selectPicture/model/ImageLocationInfo;", "setImageLocationInfo", "(Lcom/app/selectPicture/model/ImageLocationInfo;)V", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "()Ljava/lang/Boolean;", "setSave", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "getWatermarkText", "setWatermarkText", "getWidth", "()Ljava/lang/Integer;", "setWidth", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Landroid/widget/ImageView;Lcom/app/selectPicture/model/ImageLocationInfo;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/yalla/yalla/common/model/ShowImageItemModel;", "equals", "other", "", "hashCode", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ShowImageItemModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private ImageLocationInfo imageLocationInfo;

    @Nullable
    private ImageView imageView;

    @Nullable
    private Boolean isSave;

    @Nullable
    private String url;

    @Nullable
    private String watermarkText;

    @Nullable
    private Integer width;

    public ShowImageItemModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public ShowImageItemModel(@Nullable String str, @Nullable ImageView imageView, @Nullable ImageLocationInfo imageLocationInfo, @Nullable Integer num, @Nullable String str2, @Nullable Boolean bool) {
        this.url = str;
        this.imageView = imageView;
        this.imageLocationInfo = imageLocationInfo;
        this.width = num;
        this.watermarkText = str2;
        this.isSave = bool;
    }

    public static /* synthetic */ ShowImageItemModel copy$default(ShowImageItemModel showImageItemModel, String str, ImageView imageView, ImageLocationInfo imageLocationInfo, Integer num, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = showImageItemModel.url;
        }
        if ((i & 2) != 0) {
            imageView = showImageItemModel.imageView;
        }
        ImageView imageView2 = imageView;
        if ((i & 4) != 0) {
            imageLocationInfo = showImageItemModel.imageLocationInfo;
        }
        ImageLocationInfo imageLocationInfo2 = imageLocationInfo;
        if ((i & 8) != 0) {
            num = showImageItemModel.width;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str2 = showImageItemModel.watermarkText;
        }
        String str3 = str2;
        if ((i & 32) != 0) {
            bool = showImageItemModel.isSave;
        }
        return showImageItemModel.copy(str, imageView2, imageLocationInfo2, num2, str3, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImageView getImageView() {
        return this.imageView;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImageLocationInfo getImageLocationInfo() {
        return this.imageLocationInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWatermarkText() {
        return this.watermarkText;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsSave() {
        return this.isSave;
    }

    @NotNull
    public final ShowImageItemModel copy(@Nullable String url, @Nullable ImageView imageView, @Nullable ImageLocationInfo imageLocationInfo, @Nullable Integer width, @Nullable String watermarkText, @Nullable Boolean isSave) {
        return new ShowImageItemModel(url, imageView, imageLocationInfo, width, watermarkText, isSave);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowImageItemModel)) {
            return false;
        }
        ShowImageItemModel showImageItemModel = (ShowImageItemModel) other;
        return Intrinsics.areEqual(this.url, showImageItemModel.url) && Intrinsics.areEqual(this.imageView, showImageItemModel.imageView) && Intrinsics.areEqual(this.imageLocationInfo, showImageItemModel.imageLocationInfo) && Intrinsics.areEqual(this.width, showImageItemModel.width) && Intrinsics.areEqual(this.watermarkText, showImageItemModel.watermarkText) && Intrinsics.areEqual(this.isSave, showImageItemModel.isSave);
    }

    @Nullable
    public final ImageLocationInfo getImageLocationInfo() {
        return this.imageLocationInfo;
    }

    @Nullable
    public final ImageView getImageView() {
        return this.imageView;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getWatermarkText() {
        return this.watermarkText;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ImageView imageView = this.imageView;
        int iHashCode2 = (iHashCode + (imageView == null ? 0 : imageView.hashCode())) * 31;
        ImageLocationInfo imageLocationInfo = this.imageLocationInfo;
        int iHashCode3 = (iHashCode2 + (imageLocationInfo == null ? 0 : imageLocationInfo.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.watermarkText;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isSave;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSave() {
        return this.isSave;
    }

    public final void setImageLocationInfo(@Nullable ImageLocationInfo imageLocationInfo) {
        this.imageLocationInfo = imageLocationInfo;
    }

    public final void setImageView(@Nullable ImageView imageView) {
        this.imageView = imageView;
    }

    public final void setSave(@Nullable Boolean bool) {
        this.isSave = bool;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setWatermarkText(@Nullable String str) {
        this.watermarkText = str;
    }

    public final void setWidth(@Nullable Integer num) {
        this.width = num;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ShowImageItemModel(url=");
        sbOooO0o0.append(this.url);
        sbOooO0o0.append(", imageView=");
        sbOooO0o0.append(this.imageView);
        sbOooO0o0.append(", imageLocationInfo=");
        sbOooO0o0.append(this.imageLocationInfo);
        sbOooO0o0.append(", width=");
        sbOooO0o0.append(this.width);
        sbOooO0o0.append(", watermarkText=");
        sbOooO0o0.append(this.watermarkText);
        sbOooO0o0.append(", isSave=");
        sbOooO0o0.append(this.isSave);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public /* synthetic */ ShowImageItemModel(String str, ImageView imageView, ImageLocationInfo imageLocationInfo, Integer num, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : imageView, (i & 4) == 0 ? imageLocationInfo : null, (i & 8) != 0 ? 0 : num, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? Boolean.FALSE : bool);
    }
}
