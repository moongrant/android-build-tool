package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.android.billingclient.api.BillingClient;
import io.agora.rtc.video.VideoCapture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc extends zzh implements zze {
    public zzc(IBinder iBinder) {
        super(iBinder);
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zza(int i, String str, String str2) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(3);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        Parcel parcelOooOOo0 = OooOOo0(5, parcelOooOOOo);
        int i2 = parcelOooOOo0.readInt();
        parcelOooOOo0.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zzc(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(i);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        zzj.zzc(parcelOooOOOo, bundle);
        Parcel parcelOooOOo0 = OooOOo0(10, parcelOooOOOo);
        int i2 = parcelOooOOo0.readInt();
        parcelOooOOo0.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzd(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(9);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        zzj.zzc(parcelOooOOOo, bundle);
        Parcel parcelOooOOo0 = OooOOo0(902, parcelOooOOOo);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOo0, Bundle.CREATOR);
        parcelOooOOo0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zze(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(9);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        zzj.zzc(parcelOooOOOo, bundle);
        Parcel parcelOooOOo0 = OooOOo0(12, parcelOooOOOo);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOo0, Bundle.CREATOR);
        parcelOooOOo0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzf(int i, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(3);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        parcelOooOOOo.writeString(str3);
        parcelOooOOOo.writeString(null);
        Parcel parcelOooOOo0 = OooOOo0(3, parcelOooOOOo);
        Bundle bundle = (Bundle) zzj.zza(parcelOooOOo0, Bundle.CREATOR);
        parcelOooOOo0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzg(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(i);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        parcelOooOOOo.writeString(str3);
        parcelOooOOOo.writeString(null);
        zzj.zzc(parcelOooOOOo, bundle);
        Parcel parcelOooOOo0 = OooOOo0(8, parcelOooOOOo);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOo0, Bundle.CREATOR);
        parcelOooOOo0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzh(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(6);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        parcelOooOOOo.writeString(str3);
        zzj.zzc(parcelOooOOOo, bundle);
        Parcel parcelOooOOo0 = OooOOo0(9, parcelOooOOOo);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOo0, Bundle.CREATOR);
        parcelOooOOo0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzi(int i, String str, String str2, String str3) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(3);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        parcelOooOOOo.writeString(str3);
        Parcel parcelOooOOo0 = OooOOo0(4, parcelOooOOOo);
        Bundle bundle = (Bundle) zzj.zza(parcelOooOOo0, Bundle.CREATOR);
        parcelOooOOo0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzj(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(9);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        parcelOooOOOo.writeString(str3);
        zzj.zzc(parcelOooOOOo, bundle);
        Parcel parcelOooOOo0 = OooOOo0(11, parcelOooOOOo);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOo0, Bundle.CREATOR);
        parcelOooOOo0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzk(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(3);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        zzj.zzc(parcelOooOOOo, bundle);
        Parcel parcelOooOOo0 = OooOOo0(2, parcelOooOOOo);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOo0, Bundle.CREATOR);
        parcelOooOOo0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzl(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(10);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        zzj.zzc(parcelOooOOOo, bundle);
        zzj.zzc(parcelOooOOOo, bundle2);
        Parcel parcelOooOOo0 = OooOOo0(VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown, parcelOooOOOo);
        Bundle bundle3 = (Bundle) zzj.zza(parcelOooOOo0, Bundle.CREATOR);
        parcelOooOOo0.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzm(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(8);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        parcelOooOOOo.writeString(BillingClient.SkuType.SUBS);
        zzj.zzc(parcelOooOOOo, bundle);
        Parcel parcelOooOOo0 = OooOOo0(801, parcelOooOOOo);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOo0, Bundle.CREATOR);
        parcelOooOOo0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final void zzn(int i, String str, Bundle bundle, zzg zzgVar) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(12);
        parcelOooOOOo.writeString(str);
        zzj.zzc(parcelOooOOOo, bundle);
        zzj.zzd(parcelOooOOOo, zzgVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f16054OooO00o.transact(1201, parcelOooOOOo, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcelOooOOOo.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zzr(int i, String str, String str2) throws RemoteException {
        Parcel parcelOooOOOo = OooOOOo();
        parcelOooOOOo.writeInt(i);
        parcelOooOOOo.writeString(str);
        parcelOooOOOo.writeString(str2);
        Parcel parcelOooOOo0 = OooOOo0(1, parcelOooOOOo);
        int i2 = parcelOooOOo0.readInt();
        parcelOooOOo0.recycle();
        return i2;
    }
}
