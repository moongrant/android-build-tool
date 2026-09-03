package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv extends zza implements IAccountAccessor {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo(2, OooOOo0());
        Account account = (Account) com.google.android.gms.internal.common.zzc.zza(parcelOooOOOo, Account.CREATOR);
        parcelOooOOOo.recycle();
        return account;
    }
}
