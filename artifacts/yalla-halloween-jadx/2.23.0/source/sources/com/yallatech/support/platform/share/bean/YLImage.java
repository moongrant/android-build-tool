package com.yallatech.support.platform.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/yallatech/support/platform/share/bean/YLImage;", "Lcom/yallatech/support/platform/share/bean/YLMedia;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "imageData", "[B", "getImageData", "()[B", "setImageData", "([B)V", "", "imagePath", "Ljava/lang/String;", "getImagePath", "()Ljava/lang/String;", "setImagePath", "(Ljava/lang/String;)V", "Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "getMediaType", "()Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "mediaType", "<init>", "([BLjava/lang/String;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class YLImage extends YLMedia {
    public static final int IMAGE_DATA_SIZE_LIMIT = 31457280;
    public static final int IMAGE_PATH_LENGTH_LIMIT = 1000;

    @Nullable
    private byte[] imageData;

    @Nullable
    private String imagePath;

    @NotNull
    public static final Parcelable.Creator<YLImage> CREATOR = new Creator();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<YLImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final YLImage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new YLImage(parcel.createByteArray(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final YLImage[] newArray(int i) {
            return new YLImage[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YLImage() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final byte[] getImageData() {
        return this.imageData;
    }

    @Nullable
    public final String getImagePath() {
        return this.imagePath;
    }

    @Override // com.yallatech.support.platform.share.bean.IMedia
    @NotNull
    public IMedia.MediaType getMediaType() {
        return IMedia.MediaType.IMAGE;
    }

    public final void setImageData(@Nullable byte[] bArr) {
        this.imageData = bArr;
    }

    public final void setImagePath(@Nullable String str) {
        this.imagePath = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeByteArray(this.imageData);
        parcel.writeString(this.imagePath);
    }

    public YLImage(@Nullable byte[] bArr, @Nullable String str) {
        this.imageData = bArr;
        this.imagePath = str;
    }

    public /* synthetic */ YLImage(byte[] bArr, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bArr, (i & 2) != 0 ? "" : str);
    }
}
