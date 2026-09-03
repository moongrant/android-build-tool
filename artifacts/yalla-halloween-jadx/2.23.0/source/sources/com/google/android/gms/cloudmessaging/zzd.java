package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import p251o00ooO0O.o00000O;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new o00000O();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Messenger f14584OooO0Oo;

    public zzd(IBinder iBinder) {
        this.f14584OooO0Oo = new Messenger(iBinder);
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
        Messenger messenger = this.f14584OooO0Oo;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }

    public final IBinder zza() {
        Messenger messenger = this.f14584OooO0Oo;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void zzb(Message message) throws RemoteException {
        Messenger messenger = this.f14584OooO0Oo;
        messenger.getClass();
        messenger.send(message);
    }
}
