package com.yallatech.support.platform.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.facebook.share.internal.ShareConstants;
import com.yallatech.support.platform.base.BaseReq;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\n\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B3\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/yallatech/support/platform/share/bean/ShareRequest;", "Lcom/yallatech/support/platform/base/BaseReq;", "Landroid/os/Parcelable;", "", "getType", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yallatech/support/platform/share/bean/YLMedia;", "ylMedia", "Lcom/yallatech/support/platform/share/bean/YLMedia;", "getYlMedia", "()Lcom/yallatech/support/platform/share/bean/YLMedia;", "setYlMedia", "(Lcom/yallatech/support/platform/share/bean/YLMedia;)V", "", "description", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "", "thumbData", "[B", "getThumbData", "()[B", "setThumbData", "([B)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;[BLcom/yallatech/support/platform/share/bean/YLMedia;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ShareRequest extends BaseReq {
    public static final int DESCRIPTION_LENGTH_LIMIT = 500;
    public static final int OPEN_APP_URL_LENGTH_LIMIT = 1000;
    public static final int THUMB_DATA_SIZE_LIMIT = 32768;
    public static final int TITLE_LENGTH_LIMIT = 100;

    @NotNull
    public static final String YL_PLATFORM_SHARE_APP_ICON = "yp_share_app_icon";

    @NotNull
    public static final String YL_PLATFORM_SHARE_APP_NAME = "yp_share_app_name";

    @NotNull
    public static final String YL_PLATFORM_SHARE_DESCRIPTION = "yp_share_description";

    @NotNull
    public static final String YL_PLATFORM_SHARE_EXTRA_DATA = "yp_share_extra_data";

    @NotNull
    public static final String YL_PLATFORM_SHARE_IMAGE_PATH = "yp_share_image_path";

    @NotNull
    public static final String YL_PLATFORM_SHARE_MUSIC_URL = "yp_share_music_url";

    @NotNull
    public static final String YL_PLATFORM_SHARE_OPEN_APP_URL = "yp_share_open_app_url";

    @NotNull
    public static final String YL_PLATFORM_SHARE_REDIRECT_URI = "yp_share_redirect_uri";

    @NotNull
    public static final String YL_PLATFORM_SHARE_THUMB_DATA = "yp_share_thumb_data";

    @NotNull
    public static final String YL_PLATFORM_SHARE_TITLE = "yp_share_title";

    @NotNull
    public static final String YL_PLATFORM_SHARE_TYPE = "yp_share_type";

    @NotNull
    public static final String YL_PLATFORM_SHARE_VIDEO_URL = "yp_share_video_url";

    @NotNull
    public static final String YL_PLATFORM_SHARE_WEB_PAGE_URL = "yp_share_web_page_url";

    @NotNull
    private String description;

    @Nullable
    private byte[] thumbData;

    @NotNull
    private String title;

    @Nullable
    private YLMedia ylMedia;

    @NotNull
    public static final Parcelable.Creator<ShareRequest> CREATOR = new Creator();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<ShareRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShareRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareRequest(parcel.readString(), parcel.readString(), parcel.createByteArray(), (YLMedia) parcel.readParcelable(ShareRequest.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShareRequest[] newArray(int i) {
            return new ShareRequest[i];
        }
    }

    public ShareRequest() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final byte[] getThumbData() {
        return this.thumbData;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // com.yallatech.support.platform.base.BaseReq
    public int getType() {
        return 2;
    }

    @Nullable
    public final YLMedia getYlMedia() {
        return this.ylMedia;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setThumbData(@Nullable byte[] bArr) {
        this.thumbData = bArr;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setYlMedia(@Nullable YLMedia yLMedia) {
        this.ylMedia = yLMedia;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeByteArray(this.thumbData);
        parcel.writeParcelable(this.ylMedia, flags);
    }

    public /* synthetic */ ShareRequest(String str, String str2, byte[] bArr, YLMedia yLMedia, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? null : yLMedia);
    }

    public ShareRequest(@NotNull String title, @NotNull String description, @Nullable byte[] bArr, @Nullable YLMedia yLMedia) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.title = title;
        this.description = description;
        this.thumbData = bArr;
        this.ylMedia = yLMedia;
    }
}
