package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import p255o00ooOOo.o0O0o;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@KeepName
public final class BinderWrapper implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new o0O0o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final IBinder f15039OooO0Oo;

    @KeepForSdk
    public BinderWrapper(@NonNull IBinder iBinder) {
        this.f15039OooO0Oo = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f15039OooO0Oo);
    }
}
