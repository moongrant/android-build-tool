package com.yallatech.support.platform.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u001d\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/yallatech/support/platform/share/bean/YLMusic;", "Lcom/yallatech/support/platform/share/bean/YLMedia;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "getMediaType", "()Lcom/yallatech/support/platform/share/bean/IMedia$MediaType;", "mediaType", "", "openAppUrl", "Ljava/lang/String;", "getOpenAppUrl", "()Ljava/lang/String;", "setOpenAppUrl", "(Ljava/lang/String;)V", "musicUrl", "getMusicUrl", "setMusicUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class YLMusic extends YLMedia {
    public static final int MUSIC_URL_LENGTH_LIMIT = 1000;

    @NotNull
    private String musicUrl;

    @Nullable
    private String openAppUrl;

    @NotNull
    public static final Parcelable.Creator<YLMusic> CREATOR = new Creator();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<YLMusic> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final YLMusic createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new YLMusic(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final YLMusic[] newArray(int i) {
            return new YLMusic[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YLMusic() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.yallatech.support.platform.share.bean.IMedia
    @NotNull
    public IMedia.MediaType getMediaType() {
        return IMedia.MediaType.MUSIC;
    }

    @NotNull
    public final String getMusicUrl() {
        return this.musicUrl;
    }

    @Nullable
    public final String getOpenAppUrl() {
        return this.openAppUrl;
    }

    public final void setMusicUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.musicUrl = str;
    }

    public final void setOpenAppUrl(@Nullable String str) {
        this.openAppUrl = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.musicUrl);
        parcel.writeString(this.openAppUrl);
    }

    public YLMusic(@NotNull String musicUrl, @Nullable String str) {
        Intrinsics.checkNotNullParameter(musicUrl, "musicUrl");
        this.musicUrl = musicUrl;
        this.openAppUrl = str;
    }

    public /* synthetic */ YLMusic(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
    }
}
