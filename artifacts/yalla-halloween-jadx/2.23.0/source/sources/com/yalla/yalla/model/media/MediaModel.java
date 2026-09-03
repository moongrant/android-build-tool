package com.yalla.yalla.model.media;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p117o00O0Oo.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\u0006\u0010!\u001a\u00020\"J\t\u0010#\u001a\u00020\u001dHÖ\u0001J\u0006\u0010$\u001a\u00020\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR!\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006+"}, d2 = {"Lcom/yalla/yalla/model/media/MediaModel;", "Landroid/os/Parcelable;", "isPicture", "", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "videoInfo", "Lcom/yalla/yalla/model/media/MediaVideoInfo;", "(ZLandroid/net/Uri;Lcom/yalla/yalla/model/media/MediaVideoInfo;)V", "()Z", "realFilePath", "", "getRealFilePath$annotations", "()V", "getRealFilePath", "()Ljava/lang/String;", "realFilePath$delegate", "Lkotlin/Lazy;", "getUri", "()Landroid/net/Uri;", "getVideoInfo", "()Lcom/yalla/yalla/model/media/MediaVideoInfo;", "setVideoInfo", "(Lcom/yalla/yalla/model/media/MediaVideoInfo;)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "getVideoDuration", "", "hashCode", "isFileNotExit", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MediaModel implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MediaModel> CREATOR = new Creator();
    private final boolean isPicture;

    /* JADX INFO: renamed from: realFilePath$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy realFilePath;

    @NotNull
    private final Uri uri;

    @Nullable
    private MediaVideoInfo videoInfo;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MediaModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MediaModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MediaModel(parcel.readInt() != 0, (Uri) parcel.readParcelable(MediaModel.class.getClassLoader()), parcel.readInt() == 0 ? null : MediaVideoInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MediaModel[] newArray(int i) {
            return new MediaModel[i];
        }
    }

    public MediaModel(boolean z, @NotNull Uri uri, @Nullable MediaVideoInfo mediaVideoInfo) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.isPicture = z;
        this.uri = uri;
        this.videoInfo = mediaVideoInfo;
        this.realFilePath = LazyKt.lazy(new Function0<String>() { // from class: com.yalla.yalla.model.media.MediaModel$realFilePath$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                String strOooO00o = OooOO0O.OooO00o.OooO00o(o000O0.OooO00o(), this.this$0.getUri());
                return strOooO00o == null ? "" : strOooO00o;
            }
        });
    }

    public static /* synthetic */ MediaModel copy$default(MediaModel mediaModel, boolean z, Uri uri, MediaVideoInfo mediaVideoInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mediaModel.isPicture;
        }
        if ((i & 2) != 0) {
            uri = mediaModel.uri;
        }
        if ((i & 4) != 0) {
            mediaVideoInfo = mediaModel.videoInfo;
        }
        return mediaModel.copy(z, uri, mediaVideoInfo);
    }

    public static /* synthetic */ void getRealFilePath$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsPicture() {
        return this.isPicture;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MediaVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    @NotNull
    public final MediaModel copy(boolean isPicture, @NotNull Uri uri, @Nullable MediaVideoInfo videoInfo) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new MediaModel(isPicture, uri, videoInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaModel)) {
            return false;
        }
        MediaModel mediaModel = (MediaModel) other;
        return this.isPicture == mediaModel.isPicture && Intrinsics.areEqual(this.uri, mediaModel.uri) && Intrinsics.areEqual(this.videoInfo, mediaModel.videoInfo);
    }

    @NotNull
    public final String getRealFilePath() {
        return (String) this.realFilePath.getValue();
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public final long getVideoDuration() throws IOException {
        long j = 0;
        if (!(getRealFilePath().length() == 0) && !this.isPicture) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(getRealFilePath());
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                Intrinsics.checkNotNull(strExtractMetadata);
                j = Long.parseLong(strExtractMetadata);
            } catch (Exception unused) {
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        return j;
    }

    @Nullable
    public final MediaVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        boolean z = this.isPicture;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = (this.uri.hashCode() + (r0 * 31)) * 31;
        MediaVideoInfo mediaVideoInfo = this.videoInfo;
        return iHashCode + (mediaVideoInfo == null ? 0 : mediaVideoInfo.hashCode());
    }

    public final boolean isFileNotExit() {
        return TextUtils.isEmpty(getRealFilePath()) || !new File(getRealFilePath()).exists();
    }

    public final boolean isPicture() {
        return this.isPicture;
    }

    public final void setVideoInfo(@Nullable MediaVideoInfo mediaVideoInfo) {
        this.videoInfo = mediaVideoInfo;
    }

    @NotNull
    public String toString() {
        return "MediaModel(isPicture=" + this.isPicture + ", uri=" + this.uri + ", videoInfo=" + this.videoInfo + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isPicture ? 1 : 0);
        parcel.writeParcelable(this.uri, flags);
        MediaVideoInfo mediaVideoInfo = this.videoInfo;
        if (mediaVideoInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaVideoInfo.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ MediaModel(boolean z, Uri uri, MediaVideoInfo mediaVideoInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, uri, (i & 4) != 0 ? null : mediaVideoInfo);
    }
}
