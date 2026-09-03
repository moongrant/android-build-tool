package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f4357Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final IntentSender f4358Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final Intent f4359Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f4360Oooo0oo;

    public class OooO00o implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    public IntentSenderRequest(@NonNull IntentSender intentSender, @Nullable Intent intent, int i, int i2) {
        this.f4358Oooo0o = intentSender;
        this.f4359Oooo0oO = intent;
        this.f4360Oooo0oo = i;
        this.f4357Oooo = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.f4358Oooo0o, i);
        parcel.writeParcelable(this.f4359Oooo0oO, i);
        parcel.writeInt(this.f4360Oooo0oo);
        parcel.writeInt(this.f4357Oooo);
    }

    public IntentSenderRequest(@NonNull Parcel parcel) {
        this.f4358Oooo0o = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f4359Oooo0oO = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f4360Oooo0oo = parcel.readInt();
        this.f4357Oooo = parcel.readInt();
    }
}
