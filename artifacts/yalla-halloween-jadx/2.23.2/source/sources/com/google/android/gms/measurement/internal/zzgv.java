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
import p256o00ooOO0.o0OoO00O;
import p271o00ooooo.oO00O0o;
import p271o00ooooo.oO0O0;
import p271o00ooooo.oO0O00oO;
import p271o00ooooo.oO0O0O00;
import p271o00ooooo.oO0O0O0o;
import p271o00ooooo.oO0O0Oo0;
import p271o00ooooo.oO0OO00;
import p271o00ooooo.oO0OO0O;
import p271o00ooooo.oO0Oo0o0;
import p271o00ooooo.oO0o0000;
import p271o00ooooo.oO0oO000;
import p271o00ooooo.oOo0o0oO;
import p271o00ooooo.oOo0oooO;
import p271o00ooooo.ooOOO00O;
import p271o00ooooo.ooOOO0Oo;
import p271o00ooooo.ooo0o;
import p271o00ooooo.p0;
import p271o00ooooo.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgv extends zzei {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zzlh f15545OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f15546OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Boolean f15547OooO0o0;

    public zzgv(zzlh zzlhVar, String str) {
        Preconditions.checkNotNull(zzlhVar);
        this.f15545OooO0Oo = zzlhVar;
        this.f15546OooO0o = null;
    }

    @VisibleForTesting
    public final void OooOo0(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        zzlh zzlhVar = this.f15545OooO0Oo;
        if (zzlhVar.zzaB().zzs()) {
            runnable.run();
        } else {
            zzlhVar.zzaB().zzp(runnable);
        }
    }

    public final void OooOo00(zzau zzauVar, zzq zzqVar) {
        zzlh zzlhVar = this.f15545OooO0Oo;
        zzlhVar.OooO00o();
        zzlhVar.OooO0Oo(zzauVar, zzqVar);
    }

    @BinderThread
    public final void OooOo0O(zzq zzqVar) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        OooOo0o(zzqVar.zza, false);
        this.f15545OooO0Oo.zzv().OooOOo0(zzqVar.zzb, zzqVar.zzq);
    }

    @BinderThread
    public final void OooOo0o(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzlh zzlhVar = this.f15545OooO0Oo;
        if (zIsEmpty) {
            zzlhVar.zzaA().zzd().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f15547OooO0o0 == null) {
                    this.f15547OooO0o0 = Boolean.valueOf("com.google.android.gms".equals(this.f15546OooO0o) || UidVerifier.isGooglePlayServicesUid(zzlhVar.zzaw(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(zzlhVar.zzaw()).isUidGoogleSigned(Binder.getCallingUid()));
                }
                if (this.f15547OooO0o0.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                zzlhVar.zzaA().zzd().zzb("Measurement Service called with invalid calling package. appId", zzet.OooO0Oo(str));
                throw e;
            }
        }
        if (this.f15546OooO0o == null && GooglePlayServicesUtilLight.uidHasPackageName(zzlhVar.zzaw(), Binder.getCallingUid(), str)) {
            this.f15546OooO0o = str;
        }
        if (str.equals(this.f15546OooO0o)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final String zzd(zzq zzqVar) {
        OooOo0O(zzqVar);
        zzlh zzlhVar = this.f15545OooO0Oo;
        try {
            return (String) zzlhVar.zzaB().zzh(new p0(zzlhVar, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzlhVar.zzaA().zzd().zzc("Failed to get app instance id. appId", zzet.OooO0Oo(zzqVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zze(zzq zzqVar, boolean z) {
        OooOo0O(zzqVar);
        String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        zzlh zzlhVar = this.f15545OooO0Oo;
        try {
            List<u0> list = (List) zzlhVar.zzaB().zzh(new oO0Oo0o0(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (u0 u0Var : list) {
                if (z || !zzlp.OooOoOO(u0Var.f40848OooO0OO)) {
                    arrayList.add(new zzlk(u0Var));
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
        OooOo0O(zzqVar);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        zzlh zzlhVar = this.f15545OooO0Oo;
        try {
            return (List) zzlhVar.zzaB().zzh(new oOo0oooO(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            zzlhVar.zzaA().zzd().zzb("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zzg(String str, String str2, String str3) {
        OooOo0o(str, true);
        zzlh zzlhVar = this.f15545OooO0Oo;
        try {
            return (List) zzlhVar.zzaB().zzh(new oO0O0Oo0(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            zzlhVar.zzaA().zzd().zzb("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zzh(String str, String str2, boolean z, zzq zzqVar) {
        OooOo0O(zzqVar);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        zzlh zzlhVar = this.f15545OooO0Oo;
        try {
            List<u0> list = (List) zzlhVar.zzaB().zzh(new oO0O0O00(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (u0 u0Var : list) {
                if (z || !zzlp.OooOoOO(u0Var.f40848OooO0OO)) {
                    arrayList.add(new zzlk(u0Var));
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
        OooOo0o(str, true);
        zzlh zzlhVar = this.f15545OooO0Oo;
        try {
            List<u0> list = (List) zzlhVar.zzaB().zzh(new oO0O0O0o(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (u0 u0Var : list) {
                if (z || !zzlp.OooOoOO(u0Var.f40848OooO0OO)) {
                    arrayList.add(new zzlk(u0Var));
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
        OooOo0O(zzqVar);
        OooOo0(new oO0o0000(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzk(zzau zzauVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzauVar);
        OooOo0O(zzqVar);
        OooOo0(new o0OoO00O(1, this, zzauVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzl(zzau zzauVar, String str, String str2) {
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotEmpty(str);
        OooOo0o(str, true);
        OooOo0(new ooo0o(this, zzauVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzm(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        OooOo0o(zzqVar.zza, false);
        OooOo0(new oOo0o0oO(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzn(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        OooOo0O(zzqVar);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.zza = zzqVar.zza;
        OooOo0(new oO0O00oO(this, zzacVar2, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzo(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zza);
        OooOo0o(zzacVar.zza, true);
        OooOo0(new oO0O0(this, new zzac(zzacVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzp(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        Preconditions.checkNotNull(zzqVar.zzv);
        ooOOO00O ooooo00o = new ooOOO00O(this, zzqVar);
        Preconditions.checkNotNull(ooooo00o);
        zzlh zzlhVar = this.f15545OooO0Oo;
        if (zzlhVar.zzaB().zzs()) {
            ooooo00o.run();
        } else {
            zzlhVar.zzaB().zzq(ooooo00o);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzq(long j, String str, String str2, String str3) {
        OooOo0(new oO0oO000(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzr(final Bundle bundle, zzq zzqVar) {
        OooOo0O(zzqVar);
        final String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        OooOo0(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzge
            @Override // java.lang.Runnable
            public final void run() {
                zzgv zzgvVar = this.zza;
                String str2 = str;
                Bundle bundle2 = bundle;
                oO00O0o oo00o0oZzh = zzgvVar.f15545OooO0Oo.zzh();
                oo00o0oZzh.zzg();
                oo00o0oZzh.OooO00o();
                byte[] bArrZzbx = oo00o0oZzh.f40509OooO0O0.zzu().OooOOo(new zzap(oo00o0oZzh.f40788OooO00o, "", str2, "dep", 0L, bundle2)).zzbx();
                zzgd zzgdVar = oo00o0oZzh.f40788OooO00o;
                zzgdVar.zzaA().zzj().zzc("Saving default event parameters, appId, data size", zzgdVar.zzj().OooO0Oo(str2), Integer.valueOf(bArrZzbx.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("parameters", bArrZzbx);
                try {
                    if (oo00o0oZzh.OooOOo().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
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
        OooOo0O(zzqVar);
        OooOo0(new ooOOO0Oo(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzt(zzlk zzlkVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzlkVar);
        OooOo0O(zzqVar);
        OooOo0(new oO0OO0O(this, zzlkVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final byte[] zzu(zzau zzauVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzauVar);
        OooOo0o(str, true);
        zzlh zzlhVar = this.f15545OooO0Oo;
        zzlhVar.zzaA().zzc().zzb("Log and bundle. event", zzlhVar.zzi().OooO0Oo(zzauVar.zza));
        long jNanoTime = zzlhVar.zzax().nanoTime() / AnimationKt.MillisToNanos;
        try {
            byte[] bArr = (byte[]) zzlhVar.zzaB().zzi(new oO0OO00(this, zzauVar, str)).get();
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
