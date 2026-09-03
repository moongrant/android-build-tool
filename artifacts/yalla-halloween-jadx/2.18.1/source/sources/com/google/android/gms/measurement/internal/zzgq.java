package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0OO0OoO.OooOO0O;
import o0OO0OoO.o000;
import o0OO0OoO.o0000;
import o0OO0OoO.o0000O;
import o0OO0OoO.o0000O0;
import o0OO0OoO.o0000O00;
import o0OO0OoO.o0000O0O;
import o0OO0OoO.o0000OO0;
import o0OO0OoO.o0000oo;
import o0OO0OoO.o000O0;
import o0OO0OoO.o000O00;
import o0OO0OoO.o000O000;
import o0OO0OoO.o000O00O;
import o0OO0OoO.o000O0o;
import o0OO0OoO.o000OO;
import o0OO0OoO.o000Oo0;
import o0OO0OoO.o0oOo0O0;
import o0OO0OoO.oo0ooO;
import p331o0O0oooO.o0OOOO00;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgq extends zzed {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzkz f16225OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Boolean f16226OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f16227OooO0OO;

    public zzgq(zzkz zzkzVar, String str) {
        Preconditions.checkNotNull(zzkzVar);
        this.f16225OooO00o = zzkzVar;
        this.f16227OooO0OO = null;
    }

    @VisibleForTesting
    public final void OooOOo(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.f16225OooO00o.zzaz().zzs()) {
            runnable.run();
        } else {
            this.f16225OooO00o.zzaz().zzp(runnable);
        }
    }

    public final void OooOOo0(zzaw zzawVar, zzq zzqVar) {
        this.f16225OooO00o.OooO00o();
        this.f16225OooO00o.OooO0o0(zzawVar, zzqVar);
    }

    @BinderThread
    public final void OooOOoo(zzq zzqVar) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        OooOo00(zzqVar.zza, false);
        this.f16225OooO00o.zzv().OooOOo0(zzqVar.zzb, zzqVar.zzq);
    }

    @BinderThread
    public final void OooOo00(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f16225OooO00o.zzay().zzd().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f16226OooO0O0 == null) {
                    this.f16226OooO0O0 = Boolean.valueOf("com.google.android.gms".equals(this.f16227OooO0OO) || UidVerifier.isGooglePlayServicesUid(this.f16225OooO00o.zzau(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(this.f16225OooO00o.zzau()).isUidGoogleSigned(Binder.getCallingUid()));
                }
                if (this.f16226OooO0O0.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.f16225OooO00o.zzay().zzd().zzb("Measurement Service called with invalid calling package. appId", zzeo.OooO0o0(str));
                throw e;
            }
        }
        if (this.f16227OooO0OO == null && GooglePlayServicesUtilLight.uidHasPackageName(this.f16225OooO00o.zzau(), Binder.getCallingUid(), str)) {
            this.f16227OooO0OO = str;
        }
        if (str.equals(this.f16227OooO0OO)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final String zzd(zzq zzqVar) {
        OooOOoo(zzqVar);
        zzkz zzkzVar = this.f16225OooO00o;
        try {
            return (String) zzkzVar.zzaz().zzh(new o0oOo0O0(zzkzVar, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzkzVar.zzay().zzd().zzc("Failed to get app instance id. appId", zzeo.OooO0o0(zzqVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final List zze(zzq zzqVar, boolean z) {
        OooOOoo(zzqVar);
        String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<oo0ooO> list = (List) this.f16225OooO00o.zzaz().zzh(new o000O00(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (oo0ooO oo0ooo : list) {
                if (z || !zzlh.OooOoo0(oo0ooo.f37908OooO0OO)) {
                    arrayList.add(new zzlc(oo0ooo));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f16225OooO00o.zzay().zzd().zzc("Failed to get user properties. appId", zzeo.OooO0o0(zzqVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final List zzf(String str, String str2, zzq zzqVar) {
        OooOOoo(zzqVar);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.f16225OooO00o.zzaz().zzh(new o0000O0(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f16225OooO00o.zzay().zzd().zzb("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final List zzg(String str, String str2, String str3) {
        OooOo00(str, true);
        try {
            return (List) this.f16225OooO00o.zzaz().zzh(new o0000O0O(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f16225OooO00o.zzay().zzd().zzb("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final List zzh(String str, String str2, boolean z, zzq zzqVar) {
        OooOOoo(zzqVar);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<oo0ooO> list = (List) this.f16225OooO00o.zzaz().zzh(new o0000O00(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (oo0ooO oo0ooo : list) {
                if (z || !zzlh.OooOoo0(oo0ooo.f37908OooO0OO)) {
                    arrayList.add(new zzlc(oo0ooo));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f16225OooO00o.zzay().zzd().zzc("Failed to query user properties. appId", zzeo.OooO0o0(zzqVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final List zzi(String str, String str2, String str3, boolean z) {
        OooOo00(str, true);
        try {
            List<oo0ooO> list = (List) this.f16225OooO00o.zzaz().zzh(new o0000oo(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (oo0ooO oo0ooo : list) {
                if (z || !zzlh.OooOoo0(oo0ooo.f37908OooO0OO)) {
                    arrayList.add(new zzlc(oo0ooo));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f16225OooO00o.zzay().zzd().zzc("Failed to get user properties as. appId", zzeo.OooO0o0(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzj(zzq zzqVar) {
        OooOOoo(zzqVar);
        OooOOo(new o000O00O(this, zzqVar, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzk(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        OooOOoo(zzqVar);
        OooOOo(new o000(this, zzawVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzl(zzaw zzawVar, String str, String str2) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str);
        OooOo00(str, true);
        OooOOo(new o000O000(this, zzawVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzm(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        OooOo00(zzqVar.zza, false);
        OooOOo(new o000OO(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzn(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        OooOOoo(zzqVar);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.zza = zzqVar.zza;
        OooOOo(new o0OOOO00(this, zzacVar2, zzqVar, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzo(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zza);
        OooOo00(zzacVar.zza, true);
        OooOOo(new o0000(this, new zzac(zzacVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzp(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        Preconditions.checkNotNull(zzqVar.zzv);
        o0000OO0 o0000oo1 = new o0000OO0(this, zzqVar);
        Preconditions.checkNotNull(o0000oo1);
        if (this.f16225OooO00o.zzaz().zzs()) {
            o0000oo1.run();
        } else {
            this.f16225OooO00o.zzaz().zzq(o0000oo1);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzq(long j, String str, String str2, String str3) {
        OooOOo(new o000O0(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzr(final Bundle bundle, zzq zzqVar) {
        OooOOoo(zzqVar);
        final String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        OooOOo(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzfz
            @Override // java.lang.Runnable
            public final void run() {
                zzgq zzgqVar = this.zza;
                String str2 = str;
                Bundle bundle2 = bundle;
                OooOO0O oooOO0OZzi = zzgqVar.f16225OooO00o.zzi();
                oooOO0OZzi.zzg();
                oooOO0OZzi.OooO00o();
                byte[] bArrZzbv = oooOO0OZzi.f37794OooO0O0.zzu().OooOOo(new zzar(oooOO0OZzi.f37615OooO00o, "", str2, "dep", 0L, bundle2)).zzbv();
                oooOO0OZzi.f37615OooO00o.zzay().zzj().zzc("Saving default event parameters, appId, data size", oooOO0OZzi.f37615OooO00o.zzj().OooO0Oo(str2), Integer.valueOf(bArrZzbv.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("parameters", bArrZzbv);
                try {
                    if (oooOO0OZzi.OooOOo().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        oooOO0OZzi.f37615OooO00o.zzay().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzeo.OooO0o0(str2));
                    }
                } catch (SQLiteException e) {
                    oooOO0OZzi.f37615OooO00o.zzay().zzd().zzc("Error storing default event parameters. appId", zzeo.OooO0o0(str2), e);
                }
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzs(zzq zzqVar) {
        OooOOoo(zzqVar);
        OooOOo(new o0000O(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzt(zzlc zzlcVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzlcVar);
        OooOOoo(zzqVar);
        OooOOo(new o000Oo0(this, zzlcVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final byte[] zzu(zzaw zzawVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzawVar);
        OooOo00(str, true);
        this.f16225OooO00o.zzay().zzc().zzb("Log and bundle. event", this.f16225OooO00o.zzj().OooO0Oo(zzawVar.zza));
        long jNanoTime = this.f16225OooO00o.zzav().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f16225OooO00o.zzaz().zzi(new o000O0o(this, zzawVar, str)).get();
            if (bArr == null) {
                this.f16225OooO00o.zzay().zzd().zzb("Log and bundle returned null. appId", zzeo.OooO0o0(str));
                bArr = new byte[0];
            }
            this.f16225OooO00o.zzay().zzc().zzd("Log and bundle processed. event, size, time_ms", this.f16225OooO00o.zzj().OooO0Oo(zzawVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.f16225OooO00o.zzav().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f16225OooO00o.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzeo.OooO0o0(str), this.f16225OooO00o.zzj().OooO0Oo(zzawVar.zza), e);
            return null;
        }
    }
}
