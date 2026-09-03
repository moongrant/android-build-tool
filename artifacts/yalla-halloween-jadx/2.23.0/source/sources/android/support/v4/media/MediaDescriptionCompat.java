package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Uri f2089OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f2090OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CharSequence f2091OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CharSequence f2092OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CharSequence f2093OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Bitmap f2094OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Bundle f2095OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Uri f2096OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public MediaDescription f2097OooOO0o;

    public class OooO00o implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.OooO00o(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    @RequiresApi(21)
    public static class OooO0O0 {
        @Nullable
        @DoNotInline
        public static CharSequence OooO(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        @DoNotInline
        public static MediaDescription OooO00o(MediaDescription.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        public static MediaDescription.Builder OooO0O0() {
            return new MediaDescription.Builder();
        }

        @Nullable
        @DoNotInline
        public static CharSequence OooO0OO(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        @Nullable
        @DoNotInline
        public static Bundle OooO0Oo(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        @Nullable
        @DoNotInline
        public static Uri OooO0o(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        @Nullable
        @DoNotInline
        public static Bitmap OooO0o0(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        @Nullable
        @DoNotInline
        public static String OooO0oO(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        @Nullable
        @DoNotInline
        public static CharSequence OooO0oo(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        @DoNotInline
        public static void OooOO0(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        @DoNotInline
        public static void OooOO0O(MediaDescription.Builder builder, @Nullable Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        public static void OooOO0o(MediaDescription.Builder builder, @Nullable Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        @DoNotInline
        public static void OooOOO(MediaDescription.Builder builder, @Nullable String str) {
            builder.setMediaId(str);
        }

        @DoNotInline
        public static void OooOOO0(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setIconUri(uri);
        }

        @DoNotInline
        public static void OooOOOO(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        @DoNotInline
        public static void OooOOOo(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    @RequiresApi(23)
    public static class OooO0OO {
        @Nullable
        @DoNotInline
        public static Uri OooO00o(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        @DoNotInline
        public static void OooO0O0(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public MediaDescriptionCompat() {
        throw null;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f2090OooO0Oo = str;
        this.f2092OooO0o0 = charSequence;
        this.f2091OooO0o = charSequence2;
        this.f2093OooO0oO = charSequence3;
        this.f2094OooO0oo = bitmap;
        this.f2089OooO = uri;
        this.f2095OooOO0 = bundle;
        this.f2096OooOO0O = uri2;
    }

    public static MediaDescriptionCompat OooO00o(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strOooO0oO = OooO0O0.OooO0oO(mediaDescription);
        CharSequence charSequenceOooO = OooO0O0.OooO(mediaDescription);
        CharSequence charSequenceOooO0oo = OooO0O0.OooO0oo(mediaDescription);
        CharSequence charSequenceOooO0OO = OooO0O0.OooO0OO(mediaDescription);
        Bitmap bitmapOooO0o0 = OooO0O0.OooO0o0(mediaDescription);
        Uri uriOooO0o = OooO0O0.OooO0o(mediaDescription);
        Bundle bundleOooO0Oo = OooO0O0.OooO0Oo(mediaDescription);
        if (bundleOooO0Oo != null) {
            bundleOooO0Oo = MediaSessionCompat.OooO0O0(bundleOooO0Oo);
        }
        Uri uriOooO00o = bundleOooO0Oo != null ? (Uri) bundleOooO0Oo.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uriOooO00o == null) {
            bundle = bundleOooO0Oo;
        } else if (bundleOooO0Oo.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleOooO0Oo.size() == 2) {
            bundle = null;
        } else {
            bundleOooO0Oo.remove("android.support.v4.media.description.MEDIA_URI");
            bundleOooO0Oo.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleOooO0Oo;
        }
        if (uriOooO00o == null) {
            uriOooO00o = OooO0OO.OooO00o(mediaDescription);
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strOooO0oO, charSequenceOooO, charSequenceOooO0oo, charSequenceOooO0OO, bitmapOooO0o0, uriOooO0o, bundle, uriOooO00o);
        mediaDescriptionCompat.f2097OooOO0o = mediaDescription;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f2092OooO0o0) + ", " + ((Object) this.f2091OooO0o) + ", " + ((Object) this.f2093OooO0oO);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionOooO00o = this.f2097OooOO0o;
        if (mediaDescriptionOooO00o == null) {
            MediaDescription.Builder builderOooO0O0 = OooO0O0.OooO0O0();
            OooO0O0.OooOOO(builderOooO0O0, this.f2090OooO0Oo);
            OooO0O0.OooOOOo(builderOooO0O0, this.f2092OooO0o0);
            OooO0O0.OooOOOO(builderOooO0O0, this.f2091OooO0o);
            OooO0O0.OooOO0(builderOooO0O0, this.f2093OooO0oO);
            OooO0O0.OooOO0o(builderOooO0O0, this.f2094OooO0oo);
            OooO0O0.OooOOO0(builderOooO0O0, this.f2089OooO);
            OooO0O0.OooOO0O(builderOooO0O0, this.f2095OooOO0);
            OooO0OO.OooO0O0(builderOooO0O0, this.f2096OooOO0O);
            mediaDescriptionOooO00o = OooO0O0.OooO00o(builderOooO0O0);
            this.f2097OooOO0o = mediaDescriptionOooO00o;
        }
        mediaDescriptionOooO00o.writeToParcel(parcel, i);
    }
}
