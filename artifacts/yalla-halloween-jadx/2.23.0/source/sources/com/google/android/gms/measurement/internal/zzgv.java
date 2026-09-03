package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p269o00ooooo.O0O0;
import p269o00ooooo.o;
import p269o00ooooo.o0O0o0;
import p269o00ooooo.oO000;
import p269o00ooooo.oO00000;
import p269o00ooooo.oO00000o;
import p269o00ooooo.oO0000O;
import p269o00ooooo.oO0000Oo;
import p269o00ooooo.oO0000o0;
import p269o00ooooo.oO000O0;
import p269o00ooooo.oO000O0O;
import p269o00ooooo.oO000OOo;
import p269o00ooooo.oO0OOo0o;
import p269o00ooooo.oO0Oo0oo;
import p269o00ooooo.oO0OoOO0;
import p269o00ooooo.oO0Ooooo;
import p269o00ooooo.oO0o0o;
import p269o00ooooo.oOOo0O00;
import p269o00ooooo.ooOOOOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgv extends zzei {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zzlh f16021OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f16022OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Boolean f16023OooO0o0;

    public zzgv(zzlh zzlhVar, String str) {
        Preconditions.checkNotNull(zzlhVar);
        this.f16021OooO0Oo = zzlhVar;
        this.f16022OooO0o = null;
    }

    public final void OooOOoo(zzau zzauVar, zzq zzqVar) {
        zzlh zzlhVar = this.f16021OooO0Oo;
        zzlhVar.OooO00o();
        zzlhVar.OooO0Oo(zzauVar, zzqVar);
    }

    @BinderThread
    public final void OooOo0(zzq zzqVar) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        OooOo0O(zzqVar.zza, false);
        this.f16021OooO0Oo.zzv().OooOOo0(zzqVar.zzb, zzqVar.zzq);
    }

    @VisibleForTesting
    public final void OooOo00(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        zzlh zzlhVar = this.f16021OooO0Oo;
        if (zzlhVar.zzaB().zzs()) {
            runnable.run();
        } else {
            zzlhVar.zzaB().zzp(runnable);
        }
    }

    @BinderThread
    public final void OooOo0O(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzlh zzlhVar = this.f16021OooO0Oo;
        if (zIsEmpty) {
            zzlhVar.zzaA().zzd().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f16023OooO0o0 == null) {
                    this.f16023OooO0o0 = Boolean.valueOf("com.google.android.gms".equals(this.f16022OooO0o) || UidVerifier.isGooglePlayServicesUid(zzlhVar.zzaw(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(zzlhVar.zzaw()).isUidGoogleSigned(Binder.getCallingUid()));
                }
                if (this.f16023OooO0o0.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                zzlhVar.zzaA().zzd().zzb("Measurement Service called with invalid calling package. appId", zzet.OooO0Oo(str));
                throw e;
            }
        }
        if (this.f16022OooO0o == null && GooglePlayServicesUtilLight.uidHasPackageName(zzlhVar.zzaw(), Binder.getCallingUid(), str)) {
            this.f16022OooO0o = str;
        }
        if (str.equals(this.f16022OooO0o)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final String zzd(zzq zzqVar) {
        OooOo0(zzqVar);
        zzlh zzlhVar = this.f16021OooO0Oo;
        try {
            return (String) zzlhVar.zzaB().zzh(new oOOo0O00(zzlhVar, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzlhVar.zzaA().zzd().zzc("Failed to get app instance id. appId", zzet.OooO0Oo(zzqVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zze(zzq zzqVar, boolean z) {
        OooOo0(zzqVar);
        String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        zzlh zzlhVar = this.f16021OooO0Oo;
        try {
            List<O0O0> list = (List) zzlhVar.zzaB().zzh(new oO000OOo(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (O0O0 o0o0 : list) {
                if (z || !zzlp.OooOoOO(o0o0.f41106OooO0OO)) {
                    arrayList.add(new zzlk(o0o0));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            zzlhVar.zzaA().zzd().zzc("Failed to get user properties. appId", zzet.OooO0Oo(zzqVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zzf(String str, String str2, zzq zzqVar) {
        OooOo0(zzqVar);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        zzlh zzlhVar = this.f16021OooO0Oo;
        try {
            return (List) zzlhVar.zzaB().zzh(new oO0000Oo(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            zzlhVar.zzaA().zzd().zzb("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zzg(String str, String str2, String str3) {
        OooOo0O(str, true);
        zzlh zzlhVar = this.f16021OooO0Oo;
        try {
            return (List) zzlhVar.zzaB().zzh(new oO0000o0(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            zzlhVar.zzaA().zzd().zzb("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zzh(String str, String str2, boolean z, zzq zzqVar) {
        OooOo0(zzqVar);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        zzlh zzlhVar = this.f16021OooO0Oo;
        try {
            List<O0O0> list = (List) zzlhVar.zzaB().zzh(new oO00000o(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (O0O0 o0o0 : list) {
                if (z || !zzlp.OooOoOO(o0o0.f41106OooO0OO)) {
                    arrayList.add(new zzlk(o0o0));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            zzlhVar.zzaA().zzd().zzc("Failed to query user properties. appId", zzet.OooO0Oo(zzqVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zzi(String str, String str2, String str3, boolean z) {
        OooOo0O(str, true);
        zzlh zzlhVar = this.f16021OooO0Oo;
        try {
            List<O0O0> list = (List) zzlhVar.zzaB().zzh(new oO0000O(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (O0O0 o0o0 : list) {
                if (z || !zzlp.OooOoOO(o0o0.f41106OooO0OO)) {
                    arrayList.add(new zzlk(o0o0));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            zzlhVar.zzaA().zzd().zzc("Failed to get user properties as. appId", zzet.OooO0Oo(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzj(zzq zzqVar) {
        OooOo0(zzqVar);
        OooOo00(new ooOOOOoo(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzk(zzau zzauVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzauVar);
        OooOo0(zzqVar);
        OooOo00(new oO0Ooooo(this, zzauVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzl(zzau zzauVar, String str, String str2) {
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotEmpty(str);
        OooOo0O(str, true);
        OooOo00(new oO0o0o(this, zzauVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzm(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        OooOo0O(zzqVar.zza, false);
        OooOo00(new oO000(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzn(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        OooOo0(zzqVar);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.zza = zzqVar.zza;
        OooOo00(new o(this, zzacVar2, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzo(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zza);
        OooOo0O(zzacVar.zza, true);
        OooOo00(new oO00000(this, new zzac(zzacVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzp(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        Preconditions.checkNotNull(zzqVar.zzv);
        oO000O0O oo000o0o = new oO000O0O(this, zzqVar);
        Preconditions.checkNotNull(oo000o0o);
        zzlh zzlhVar = this.f16021OooO0Oo;
        if (zzlhVar.zzaB().zzs()) {
            oo000o0o.run();
        } else {
            zzlhVar.zzaB().zzq(oo000o0o);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzq(long j, String str, String str2, String str3) {
        OooOo00(new oO0OOo0o(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzr(final Bundle bundle, zzq zzqVar) {
        OooOo0(zzqVar);
        final String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        OooOo00(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzge
            @Override // java.lang.Runnable
            public final void run() {
                zzgv zzgvVar = this.zza;
                String str2 = str;
                Bundle bundle2 = bundle;
                o0O0o0 o0o0o0Zzh = zzgvVar.f16021OooO0Oo.zzh();
                o0o0o0Zzh.zzg();
                o0o0o0Zzh.OooO00o();
                byte[] bArrZzbx = o0o0o0Zzh.f41477OooO0O0.zzu().OooOOo(new zzap(o0o0o0Zzh.f41276OooO00o, "", str2, "dep", 0L, bundle2)).zzbx();
                zzgd zzgdVar = o0o0o0Zzh.f41276OooO00o;
                zzgdVar.zzaA().zzj().zzc("Saving default event parameters, appId, data size", zzgdVar.zzj().OooO0Oo(str2), Integer.valueOf(bArrZzbx.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("parameters", bArrZzbx);
                try {
                    if (o0o0o0Zzh.OooOOo().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        zzgdVar.zzaA().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzet.OooO0Oo(str2));
                    }
                } catch (SQLiteException e) {
                    zzgdVar.zzaA().zzd().zzc("Error storing default event parameters. appId", zzet.OooO0Oo(str2), e);
                }
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzs(zzq zzqVar) {
        OooOo0(zzqVar);
        OooOo00(new oO000O0(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzt(zzlk zzlkVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzlkVar);
        OooOo0(zzqVar);
        OooOo00(new oO0Oo0oo(this, zzlkVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final byte[] zzu(zzau zzauVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzauVar);
        OooOo0O(str, true);
        zzlh zzlhVar = this.f16021OooO0Oo;
        zzlhVar.zzaA().zzc().zzb("Log and bundle. event", zzlhVar.zzi().OooO0Oo(zzauVar.zza));
        long jNanoTime = zzlhVar.zzax().nanoTime() / AnimationKt.MillisToNanos;
        try {
            byte[] bArr = (byte[]) zzlhVar.zzaB().zzi(new oO0OoOO0(this, zzauVar, str)).get();
            if (bArr == null) {
                zzlhVar.zzaA().zzd().zzb("Log and bundle returned null. appId", zzet.OooO0Oo(str));
                bArr = new byte[0];
            }
            zzlhVar.zzaA().zzc().zzd("Log and bundle processed. event, size, time_ms", zzlhVar.zzi().OooO0Oo(zzauVar.zza), Integer.valueOf(bArr.length), Long.valueOf((zzlhVar.zzax().nanoTime() / AnimationKt.MillisToNanos) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            zzlhVar.zzaA().zzd().zzd("Failed to log and bundle. appId, event, error", zzet.OooO0Oo(str), zzlhVar.zzi().OooO0Oo(zzauVar.zza), e);
            return null;
        }
    }
}
