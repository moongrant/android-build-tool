package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import io.agora.rtc.video.VideoCapture;

/* JADX INFO: loaded from: classes3.dex */
public final class zzc extends zzh implements zze {
    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zza(int i, String str, String str2) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(3);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 5);
        int i2 = parcelOooOOoo.readInt();
        parcelOooOOoo.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zzc(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(i);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        zzj.zzc(parcelOooOOo, bundle);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 10);
        int i2 = parcelOooOOoo.readInt();
        parcelOooOOoo.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzd(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(9);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        zzj.zzc(parcelOooOOo, bundle);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 902);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOoo, Bundle.CREATOR);
        parcelOooOOoo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zze(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(9);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        zzj.zzc(parcelOooOOo, bundle);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 12);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOoo, Bundle.CREATOR);
        parcelOooOOoo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzf(int i, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(3);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        parcelOooOOo.writeString(str3);
        parcelOooOOo.writeString(null);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 3);
        Bundle bundle = (Bundle) zzj.zza(parcelOooOOoo, Bundle.CREATOR);
        parcelOooOOoo.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzg(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(i);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        parcelOooOOo.writeString(str3);
        parcelOooOOo.writeString(null);
        zzj.zzc(parcelOooOOo, bundle);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 8);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOoo, Bundle.CREATOR);
        parcelOooOOoo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzh(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(6);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        parcelOooOOo.writeString(str3);
        zzj.zzc(parcelOooOOo, bundle);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 9);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOoo, Bundle.CREATOR);
        parcelOooOOoo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzi(int i, String str, String str2, String str3) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(3);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        parcelOooOOo.writeString(str3);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 4);
        Bundle bundle = (Bundle) zzj.zza(parcelOooOOoo, Bundle.CREATOR);
        parcelOooOOoo.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzj(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(9);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        parcelOooOOo.writeString(str3);
        zzj.zzc(parcelOooOOo, bundle);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 11);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOoo, Bundle.CREATOR);
        parcelOooOOoo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzk(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(3);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        zzj.zzc(parcelOooOOo, bundle);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 2);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOoo, Bundle.CREATOR);
        parcelOooOOoo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzl(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(i);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        zzj.zzc(parcelOooOOo, bundle);
        zzj.zzc(parcelOooOOo, bundle2);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown);
        Bundle bundle3 = (Bundle) zzj.zza(parcelOooOOoo, Bundle.CREATOR);
        parcelOooOOoo.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzm(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(8);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        parcelOooOOo.writeString("subs");
        zzj.zzc(parcelOooOOo, bundle);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 801);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOOoo, Bundle.CREATOR);
        parcelOooOOoo.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final void zzn(int i, String str, Bundle bundle, zzg zzgVar) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(12);
        parcelOooOOo.writeString(str);
        zzj.zzc(parcelOooOOo, bundle);
        zzj.zzd(parcelOooOOo, zzgVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f15852OooO0Oo.transact(1201, parcelOooOOo, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcelOooOOo.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zzr(int i, String str, String str2) throws RemoteException {
        Parcel parcelOooOOo = zzh.OooOOo();
        parcelOooOOo.writeInt(i);
        parcelOooOOo.writeString(str);
        parcelOooOOo.writeString(str2);
        Parcel parcelOooOOoo = OooOOoo(parcelOooOOo, 1);
        int i2 = parcelOooOOoo.readInt();
        parcelOooOOoo.recycle();
        return i2;
    }
}
