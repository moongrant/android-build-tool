package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import io.agora.rtc.video.VideoCapture;

/* JADX INFO: loaded from: classes3.dex */
public final class zzc extends zzh implements zze {
    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zza(int i, String str, String str2) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(3);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 5);
        int i2 = parcelOooOo00.readInt();
        parcelOooOo00.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zzc(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(i);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        zzj.zzc(parcelOooOOoo, bundle);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 10);
        int i2 = parcelOooOo00.readInt();
        parcelOooOo00.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzd(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(9);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        zzj.zzc(parcelOooOOoo, bundle);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 902);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOo00, Bundle.CREATOR);
        parcelOooOo00.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zze(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(9);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        zzj.zzc(parcelOooOOoo, bundle);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 12);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOo00, Bundle.CREATOR);
        parcelOooOo00.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzf(int i, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(3);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        parcelOooOOoo.writeString(str3);
        parcelOooOOoo.writeString(null);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 3);
        Bundle bundle = (Bundle) zzj.zza(parcelOooOo00, Bundle.CREATOR);
        parcelOooOo00.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzg(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(i);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        parcelOooOOoo.writeString(str3);
        parcelOooOOoo.writeString(null);
        zzj.zzc(parcelOooOOoo, bundle);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 8);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOo00, Bundle.CREATOR);
        parcelOooOo00.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzh(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(6);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        parcelOooOOoo.writeString(str3);
        zzj.zzc(parcelOooOOoo, bundle);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 9);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOo00, Bundle.CREATOR);
        parcelOooOo00.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzi(int i, String str, String str2, String str3) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(3);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        parcelOooOOoo.writeString(str3);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 4);
        Bundle bundle = (Bundle) zzj.zza(parcelOooOo00, Bundle.CREATOR);
        parcelOooOo00.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzj(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(9);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        parcelOooOOoo.writeString(str3);
        zzj.zzc(parcelOooOOoo, bundle);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 11);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOo00, Bundle.CREATOR);
        parcelOooOo00.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzk(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(3);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        zzj.zzc(parcelOooOOoo, bundle);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 2);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOo00, Bundle.CREATOR);
        parcelOooOo00.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzl(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(i);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        zzj.zzc(parcelOooOOoo, bundle);
        zzj.zzc(parcelOooOOoo, bundle2);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, VideoCapture.VideoCaptureEvent.kCameraErrorRuntimeUnknown);
        Bundle bundle3 = (Bundle) zzj.zza(parcelOooOo00, Bundle.CREATOR);
        parcelOooOo00.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle zzm(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(8);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        parcelOooOOoo.writeString("subs");
        zzj.zzc(parcelOooOOoo, bundle);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 801);
        Bundle bundle2 = (Bundle) zzj.zza(parcelOooOo00, Bundle.CREATOR);
        parcelOooOo00.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final void zzn(int i, String str, Bundle bundle, zzg zzgVar) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(12);
        parcelOooOOoo.writeString(str);
        zzj.zzc(parcelOooOOoo, bundle);
        zzj.zzd(parcelOooOOoo, zzgVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f15376OooO0Oo.transact(1201, parcelOooOOoo, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcelOooOOoo.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int zzr(int i, String str, String str2) throws RemoteException {
        Parcel parcelOooOOoo = zzh.OooOOoo();
        parcelOooOOoo.writeInt(i);
        parcelOooOOoo.writeString(str);
        parcelOooOOoo.writeString(str2);
        Parcel parcelOooOo00 = OooOo00(parcelOooOOoo, 1);
        int i2 = parcelOooOo00.readInt();
        parcelOooOo00.recycle();
        return i2;
    }
}
