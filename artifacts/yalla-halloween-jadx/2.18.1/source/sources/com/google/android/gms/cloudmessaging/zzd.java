package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Objects;
import p328o0O0ooOO.o00Oo00;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new o00Oo00();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Messenger f15085Oooo0o;

    public zzd(IBinder iBinder) {
        this.f15085Oooo0o = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return zza().equals(((zzd) obj).zza());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f15085Oooo0o;
        Objects.requireNonNull(messenger);
        parcel.writeStrongBinder(messenger.getBinder());
    }

    public final IBinder zza() {
        Messenger messenger = this.f15085Oooo0o;
        Objects.requireNonNull(messenger);
        return messenger.getBinder();
    }

    public final void zzb(Message message) throws RemoteException {
        Messenger messenger = this.f15085Oooo0o;
        Objects.requireNonNull(messenger);
        messenger.send(message);
    }
}
