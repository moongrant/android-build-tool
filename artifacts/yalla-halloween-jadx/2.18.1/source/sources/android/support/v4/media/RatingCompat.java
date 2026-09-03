package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f4251Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final float f4252Oooo0oO;

    public static class OooO00o implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Style {
    }

    public RatingCompat(int i, float f) {
        this.f4251Oooo0o = i;
        this.f4252Oooo0oO = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f4251Oooo0o;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Rating:style=");
        sbOooO0o0.append(this.f4251Oooo0o);
        sbOooO0o0.append(" rating=");
        float f = this.f4252Oooo0oO;
        sbOooO0o0.append(f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? "unrated" : String.valueOf(f));
        return sbOooO0o0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4251Oooo0o);
        parcel.writeFloat(this.f4252Oooo0oO);
    }
}
