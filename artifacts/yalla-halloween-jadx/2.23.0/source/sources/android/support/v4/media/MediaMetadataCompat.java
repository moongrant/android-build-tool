package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Bundle f2098OooO0Oo;

    public class OooO00o implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        OooOO0 oooOO1 = new OooOO0();
        oooOO1.put("android.media.metadata.TITLE", 1);
        oooOO1.put("android.media.metadata.ARTIST", 1);
        oooOO1.put("android.media.metadata.DURATION", 0);
        oooOO1.put("android.media.metadata.ALBUM", 1);
        oooOO1.put("android.media.metadata.AUTHOR", 1);
        oooOO1.put("android.media.metadata.WRITER", 1);
        oooOO1.put("android.media.metadata.COMPOSER", 1);
        oooOO1.put("android.media.metadata.COMPILATION", 1);
        oooOO1.put("android.media.metadata.DATE", 1);
        oooOO1.put("android.media.metadata.YEAR", 0);
        oooOO1.put("android.media.metadata.GENRE", 1);
        oooOO1.put("android.media.metadata.TRACK_NUMBER", 0);
        oooOO1.put("android.media.metadata.NUM_TRACKS", 0);
        oooOO1.put("android.media.metadata.DISC_NUMBER", 0);
        oooOO1.put("android.media.metadata.ALBUM_ARTIST", 1);
        oooOO1.put("android.media.metadata.ART", 2);
        oooOO1.put("android.media.metadata.ART_URI", 1);
        oooOO1.put("android.media.metadata.ALBUM_ART", 2);
        oooOO1.put("android.media.metadata.ALBUM_ART_URI", 1);
        oooOO1.put("android.media.metadata.USER_RATING", 3);
        oooOO1.put("android.media.metadata.RATING", 3);
        oooOO1.put("android.media.metadata.DISPLAY_TITLE", 1);
        oooOO1.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        oooOO1.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        oooOO1.put("android.media.metadata.DISPLAY_ICON", 2);
        oooOO1.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        oooOO1.put("android.media.metadata.MEDIA_ID", 1);
        oooOO1.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        oooOO1.put("android.media.metadata.MEDIA_URI", 1);
        oooOO1.put("android.media.metadata.ADVERTISEMENT", 0);
        oooOO1.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new OooO00o();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f2098OooO0Oo = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f2098OooO0Oo);
    }
}
