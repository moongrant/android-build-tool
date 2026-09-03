package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final float f4275Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f4276Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long f4277Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final long f4278Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final long f4279OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f4280OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final long f4281OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final CharSequence f4282OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public List<CustomAction> f4283OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final Bundle f4284OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final long f4285o000oOoO;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Actions {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ErrorCode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MediaKeyAction {
    }

    public static class OooO00o implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface State {
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List list, long j5, Bundle bundle) {
        this.f4276Oooo0o = i;
        this.f4277Oooo0oO = j;
        this.f4278Oooo0oo = j2;
        this.f4275Oooo = f;
        this.f4281OoooO00 = j3;
        this.f4280OoooO0 = 0;
        this.f4282OoooO0O = charSequence;
        this.f4279OoooO = j4;
        this.f4283OoooOO0 = new ArrayList(list);
        this.f4285o000oOoO = j5;
        this.f4284OoooOOO = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f4276Oooo0o);
        sb.append(", position=");
        sb.append(this.f4277Oooo0oO);
        sb.append(", buffered position=");
        sb.append(this.f4278Oooo0oo);
        sb.append(", speed=");
        sb.append(this.f4275Oooo);
        sb.append(", updated=");
        sb.append(this.f4279OoooO);
        sb.append(", actions=");
        sb.append(this.f4281OoooO00);
        sb.append(", error code=");
        sb.append(this.f4280OoooO0);
        sb.append(", error message=");
        sb.append(this.f4282OoooO0O);
        sb.append(", custom actions=");
        sb.append(this.f4283OoooOO0);
        sb.append(", active item id=");
        return OooOOO0.OooO00o(sb, this.f4285o000oOoO, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4276Oooo0o);
        parcel.writeLong(this.f4277Oooo0oO);
        parcel.writeFloat(this.f4275Oooo);
        parcel.writeLong(this.f4279OoooO);
        parcel.writeLong(this.f4278Oooo0oo);
        parcel.writeLong(this.f4281OoooO00);
        TextUtils.writeToParcel(this.f4282OoooO0O, parcel, i);
        parcel.writeTypedList(this.f4283OoooOO0);
        parcel.writeLong(this.f4285o000oOoO);
        parcel.writeBundle(this.f4284OoooOOO);
        parcel.writeInt(this.f4280OoooO0);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final Bundle f4286Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final String f4287Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final CharSequence f4288Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final int f4289Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Object f4290OoooO00;

        public static class OooO00o implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f4287Oooo0o = str;
            this.f4288Oooo0oO = charSequence;
            this.f4289Oooo0oo = i;
            this.f4286Oooo = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Action:mName='");
            sbOooO0o0.append((Object) this.f4288Oooo0oO);
            sbOooO0o0.append(", mIcon=");
            sbOooO0o0.append(this.f4289Oooo0oo);
            sbOooO0o0.append(", mExtras=");
            sbOooO0o0.append(this.f4286Oooo);
            return sbOooO0o0.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f4287Oooo0o);
            TextUtils.writeToParcel(this.f4288Oooo0oO, parcel, i);
            parcel.writeInt(this.f4289Oooo0oo);
            parcel.writeBundle(this.f4286Oooo);
        }

        public CustomAction(Parcel parcel) {
            this.f4287Oooo0o = parcel.readString();
            this.f4288Oooo0oO = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4289Oooo0oo = parcel.readInt();
            this.f4286Oooo = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f4276Oooo0o = parcel.readInt();
        this.f4277Oooo0oO = parcel.readLong();
        this.f4275Oooo = parcel.readFloat();
        this.f4279OoooO = parcel.readLong();
        this.f4278Oooo0oo = parcel.readLong();
        this.f4281OoooO00 = parcel.readLong();
        this.f4282OoooO0O = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4283OoooOO0 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f4285o000oOoO = parcel.readLong();
        this.f4284OoooOOO = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f4280OoooO0 = parcel.readInt();
    }
}
