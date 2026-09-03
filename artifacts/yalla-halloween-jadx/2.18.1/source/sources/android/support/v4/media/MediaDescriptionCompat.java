package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final CharSequence f4239Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f4240Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final CharSequence f4241Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final CharSequence f4242Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Uri f4243OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Uri f4244OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Bitmap f4245OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Bundle f4246OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Object f4247OoooOO0;

    public static class OooO00o implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.OooO00o(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f4240Oooo0o = str;
        this.f4241Oooo0oO = charSequence;
        this.f4242Oooo0oo = charSequence2;
        this.f4239Oooo = charSequence3;
        this.f4245OoooO00 = bitmap;
        this.f4244OoooO0 = uri;
        this.f4246OoooO0O = bundle;
        this.f4243OoooO = uri2;
    }

    public static MediaDescriptionCompat OooO00o(Object obj) {
        Uri uri;
        Uri uriOooO00o;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = (MediaDescription) obj;
        String mediaId = mediaDescription.getMediaId();
        CharSequence title = mediaDescription.getTitle();
        CharSequence subtitle = mediaDescription.getSubtitle();
        CharSequence description = mediaDescription.getDescription();
        Bitmap iconBitmap = mediaDescription.getIconBitmap();
        Uri iconUri = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            MediaSessionCompat.OooO00o(extras);
            uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri != null) {
            if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                extras = null;
            } else {
                extras.remove("android.support.v4.media.description.MEDIA_URI");
                extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
        }
        if (uri != null) {
            uriOooO00o = uri;
        } else {
            uriOooO00o = i >= 23 ? OooOOO0.OooO00o(obj) : null;
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, extras, uriOooO00o);
        mediaDescriptionCompat.f4247OoooOO0 = obj;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f4241Oooo0oO) + ", " + ((Object) this.f4242Oooo0oo) + ", " + ((Object) this.f4239Oooo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = Build.VERSION.SDK_INT;
        Object objBuild = this.f4247OoooOO0;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f4240Oooo0o);
            builder.setTitle(this.f4241Oooo0oO);
            builder.setSubtitle(this.f4242Oooo0oo);
            builder.setDescription(this.f4239Oooo);
            builder.setIconBitmap(this.f4245OoooO00);
            builder.setIconUri(this.f4244OoooO0);
            Bundle bundle = this.f4246OoooO0O;
            if (i2 < 23 && this.f4243OoooO != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f4243OoooO);
            }
            builder.setExtras(bundle);
            if (i2 >= 23) {
                OooOOO0.OooO00o.OooO00o(builder, this.f4243OoooO);
            }
            objBuild = builder.build();
            this.f4247OoooOO0 = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
