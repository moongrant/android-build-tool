package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrj;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p031OoooO0.o0OoOo0;
import p269o00ooooo.o0O0OO0;
import p269o00ooooo.o0OO0oO0;
import p269o00ooooo.o0OOO0;
import p269o00ooooo.oO;
import p269o00ooooo.oO0OO00;
import p269o00ooooo.oO0o0000;
import p269o00ooooo.oO0oO000;
import p269o00ooooo.oOO000o;
import p269o00ooooo.oOOO00;
import p269o00ooooo.oOo00o00;
import p269o00ooooo.ooo0o;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzjz extends o0OO0oO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final oO f16062OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final zzjy f16063OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public zzej f16064OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oO0oO000 f16065OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Boolean f16066OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oOOO00 f16067OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f16068OooO0oo;

    public zzjz(zzgd zzgdVar) {
        super(zzgdVar);
        this.f16068OooO0oo = new ArrayList();
        this.f16067OooO0oO = new oOOO00(zzgdVar.zzax());
        this.f16063OooO0OO = new zzjy(this);
        this.f16065OooO0o = new oO0oO000(this, zzgdVar);
        this.f16062OooO = new oO(this, zzgdVar);
    }

    public static /* bridge */ /* synthetic */ void OooOO0O(zzjz zzjzVar, ComponentName componentName) {
        zzjzVar.zzg();
        if (zzjzVar.f16064OooO0Oo != null) {
            zzjzVar.f16064OooO0Oo = null;
            zzjzVar.f41276OooO00o.zzaA().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjzVar.zzg();
            zzjzVar.OooOO0o();
        }
    }

    @WorkerThread
    public final void OooO() {
        zzg();
        oOOO00 oooo00 = this.f16067OooO0oO;
        oooo00.f41474OooO0O0 = oooo00.f41473OooO00o.elapsedRealtime();
        this.f41276OooO00o.zzf();
        this.f16065OooO0o.OooO0OO(((Long) zzeg.zzJ.zza(null)).longValue());
    }

    @Override // p269o00ooooo.o0OO0oO0
    public final boolean OooO0O0() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final void OooO0OO(zzej zzejVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int size;
        zzg();
        zza();
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzay();
        zzgdVar.zzf();
        int i = 0;
        int i2 = 100;
        while (i < 1001 && i2 == 100) {
            ArrayList arrayList = new ArrayList();
            List listZzi = zzgdVar.zzi().zzi(100);
            if (listZzi != null) {
                arrayList.addAll(listZzi);
                size = listZzi.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i3);
                if (abstractSafeParcelable2 instanceof zzau) {
                    try {
                        zzejVar.zzk((zzau) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e) {
                        zzgdVar.zzaA().zzd().zzb("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlk) {
                    try {
                        zzejVar.zzt((zzlk) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e2) {
                        zzgdVar.zzaA().zzd().zzb("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzejVar.zzn((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e3) {
                        zzgdVar.zzaA().zzd().zzb("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    o0O0OO0.OooO00o(zzgdVar, "Discarding data. Unrecognized parcel type.");
                }
            }
            i++;
            i2 = size;
        }
    }

    @WorkerThread
    public final void OooO0Oo(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zza();
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzay();
        OooOO0(new oOO000o(this, OooO0oO(true), zzgdVar.zzi().zzn(zzacVar), new zzac(zzacVar)));
    }

    @WorkerThread
    public final boolean OooO0o() {
        zzg();
        zza();
        if (this.f16066OooO0o0 == null) {
            zzg();
            zza();
            o0OOO0 o0ooo0Zzm = this.f41276OooO00o.zzm();
            o0ooo0Zzm.zzg();
            boolean z = false;
            Boolean boolValueOf = !o0ooo0Zzm.OooO0Oo().contains("use_service") ? null : Boolean.valueOf(o0ooo0Zzm.OooO0Oo().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                this.f41276OooO00o.zzay();
                zzek zzekVarZzh = this.f41276OooO00o.zzh();
                zzekVarZzh.zza();
                if (zzekVarZzh.f15912OooOO0O == 1) {
                    z = true;
                } else {
                    this.f41276OooO00o.zzaA().zzj().zza("Checking service availability");
                    int iZzo = this.f41276OooO00o.zzv().zzo(12451000);
                    if (iZzo == 0) {
                        this.f41276OooO00o.zzaA().zzj().zza("Service available");
                    } else if (iZzo == 1) {
                        this.f41276OooO00o.zzaA().zzj().zza("Service missing");
                    } else if (iZzo != 2) {
                        if (iZzo == 3) {
                            this.f41276OooO00o.zzaA().zzk().zza("Service disabled");
                        } else if (iZzo == 9) {
                            this.f41276OooO00o.zzaA().zzk().zza("Service invalid");
                        } else if (iZzo != 18) {
                            this.f41276OooO00o.zzaA().zzk().zzb("Unexpected service status", Integer.valueOf(iZzo));
                        } else {
                            this.f41276OooO00o.zzaA().zzk().zza("Service updating");
                        }
                        z2 = false;
                    } else {
                        this.f41276OooO00o.zzaA().zzc().zza("Service container out of date");
                        if (this.f41276OooO00o.zzv().zzm() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && this.f41276OooO00o.zzf().OooO0Oo()) {
                    o0O0OO0.OooO00o(this.f41276OooO00o, "No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    o0OOO0 o0ooo0Zzm2 = this.f41276OooO00o.zzm();
                    o0ooo0Zzm2.zzg();
                    SharedPreferences.Editor editorEdit = o0ooo0Zzm2.OooO0Oo().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.f16066OooO0o0 = Boolean.valueOf(z2);
        }
        return this.f16066OooO0o0.booleanValue();
    }

    @WorkerThread
    public final boolean OooO0o0() {
        zzg();
        zza();
        return !OooO0o() || this.f41276OooO00o.zzv().zzm() >= ((Integer) zzeg.zzah.zza(null)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c4  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    public final zzq OooO0oO(boolean z) {
        String strOooO00o;
        boolean z2;
        String str;
        int i;
        String str2;
        long j;
        int i2;
        Pair pairZza;
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzay();
        zzek zzekVarZzh = zzgdVar.zzh();
        if (z) {
            zzet zzetVarZzaA = zzgdVar.zzaA();
            if (zzetVarZzaA.f41276OooO00o.zzm().f41210OooO0Oo == null || (pairZza = zzetVarZzaA.f41276OooO00o.zzm().f41210OooO0Oo.zza()) == null || pairZza == o0OOO0.f41207OooOo) {
                strOooO00o = null;
            } else {
                strOooO00o = o0OoOo0.OooO00o(String.valueOf(pairZza.second), CertificateUtil.DELIMITER, (String) pairZza.first);
            }
        } else {
            strOooO00o = null;
        }
        String str3 = strOooO00o;
        zzekVarZzh.zzg();
        String strZzl = zzekVarZzh.zzl();
        String strZzm = zzekVarZzh.zzm();
        zzekVarZzh.zza();
        String str4 = zzekVarZzh.f15906OooO0Oo;
        zzekVarZzh.zza();
        long j2 = zzekVarZzh.f15908OooO0o0;
        zzekVarZzh.zza();
        Preconditions.checkNotNull(zzekVarZzh.f15907OooO0o);
        String str5 = zzekVarZzh.f15907OooO0o;
        zzgd zzgdVar2 = zzekVarZzh.f41276OooO00o;
        zzgdVar2.zzf().zzh();
        zzekVarZzh.zza();
        zzekVarZzh.zzg();
        long jOooo0oo = zzekVarZzh.f15909OooO0oO;
        if (jOooo0oo == 0) {
            zzlp zzlpVarZzv = zzgdVar2.zzv();
            Context contextZzaw = zzgdVar2.zzaw();
            String packageName = zzgdVar2.zzaw().getPackageName();
            zzlpVarZzv.zzg();
            Preconditions.checkNotNull(contextZzaw);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzaw.getPackageManager();
            MessageDigest messageDigestOooO0oO = zzlp.OooO0oO();
            zzgd zzgdVar3 = zzlpVarZzv.f41276OooO00o;
            if (messageDigestOooO0oO == null) {
                o0O0OO0.OooO00o(zzgdVar3, "Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (zzlpVarZzv.OooOoO(contextZzaw, packageName)) {
                            jOooo0oo = 0;
                        } else {
                            Signature[] signatureArr = Wrappers.packageManager(contextZzaw).getPackageInfo(zzgdVar3.zzaw().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                zzgdVar3.zzaA().zzk().zza("Could not get signatures");
                            } else {
                                jOooo0oo = zzlp.Oooo0oo(messageDigestOooO0oO.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        zzgdVar3.zzaA().zzd().zzb("Package name not found", e);
                    }
                } else {
                    jOooo0oo = 0;
                }
                zzekVarZzh.f15909OooO0oO = jOooo0oo;
            }
            jOooo0oo = -1;
            zzekVarZzh.f15909OooO0oO = jOooo0oo;
        }
        long j3 = jOooo0oo;
        boolean zZzJ = zzgdVar2.zzJ();
        boolean z3 = !zzgdVar2.zzm().f41221OooOOOo;
        zzekVarZzh.zzg();
        if (zzgdVar2.zzJ()) {
            zzrj.zzc();
            if (zzgdVar2.zzf().zzs(null, zzeg.zzac)) {
                zzgdVar2.zzaA().zzj().zza("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = zzgdVar2.zzaw().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zzgdVar2.zzaw());
                            if (objInvoke != null) {
                                z2 = zZzJ;
                                try {
                                    str = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                } catch (Exception unused) {
                                    zzgdVar2.zzaA().zzl().zza("Failed to retrieve Firebase Instance Id");
                                    str = null;
                                }
                            }
                        } catch (Exception unused2) {
                            z2 = zZzJ;
                            zzgdVar2.zzaA().zzm().zza("Failed to obtain Firebase Analytics instance");
                        }
                        str = null;
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            z2 = zZzJ;
            str = null;
        } else {
            z2 = zZzJ;
            str = null;
        }
        String str6 = str;
        long jZza = zzgdVar2.zzm().f41212OooO0o0.zza();
        long j4 = zzgdVar2.f16020Oooo00O;
        long jMin = jZza == 0 ? j4 : Math.min(j4, jZza);
        zzekVarZzh.zza();
        int i3 = zzekVarZzh.f15912OooOO0O;
        boolean zZzr = zzgdVar2.zzf().zzr();
        o0OOO0 o0ooo0Zzm = zzgdVar2.zzm();
        o0ooo0Zzm.zzg();
        boolean z4 = o0ooo0Zzm.OooO0Oo().getBoolean("deferred_analytics_collection", false);
        zzekVarZzh.zza();
        String str7 = zzekVarZzh.f15915OooOOO0;
        Boolean boolOooO0OO = zzgdVar2.zzf().OooO0OO("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolOooO0OO == null ? null : Boolean.valueOf(!boolOooO0OO.booleanValue());
        long j5 = zzekVarZzh.f15910OooO0oo;
        List list = zzekVarZzh.f15904OooO;
        String strZzi = zzgdVar2.zzm().OooO0o0().zzi();
        if (zzekVarZzh.f15911OooOO0 == null) {
            zzekVarZzh.f15911OooOO0 = zzgdVar2.zzv().OooO0o();
        }
        String str8 = zzekVarZzh.f15911OooOO0;
        zzqu.zzc();
        if (zzgdVar2.zzf().zzs(null, zzeg.zzan)) {
            zzekVarZzh.zzg();
            if (zzekVarZzh.f15916OooOOOO == 0) {
                i = i3;
            } else {
                i = i3;
                long jCurrentTimeMillis = zzgdVar2.zzax().currentTimeMillis() - zzekVarZzh.f15916OooOOOO;
                if (zzekVarZzh.f15914OooOOO != null && jCurrentTimeMillis > 86400000 && zzekVarZzh.f15917OooOOOo == null) {
                    zzekVarZzh.OooO0OO();
                }
            }
            if (zzekVarZzh.f15914OooOOO == null) {
                zzekVarZzh.OooO0OO();
            }
            str2 = zzekVarZzh.f15914OooOOO;
        } else {
            i = i3;
            str2 = null;
        }
        String str9 = str2;
        zzag zzagVarZzf = zzgdVar2.zzf();
        zzgd zzgdVar4 = zzagVarZzf.f41276OooO00o;
        Boolean boolOooO0OO2 = zzagVarZzf.OooO0OO("google_analytics_sgtm_upload_enabled");
        boolean zBooleanValue = boolOooO0OO2 == null ? false : boolOooO0OO2.booleanValue();
        zzpz.zzc();
        if (zzgdVar2.zzf().zzs(null, zzeg.zzaD)) {
            zzlp zzlpVarZzv2 = zzgdVar2.zzv();
            String strZzl2 = zzekVarZzh.zzl();
            zzgd zzgdVar5 = zzlpVarZzv2.f41276OooO00o;
            if (zzgdVar5.zzaw().getPackageManager() == null) {
                j = 0;
            } else {
                try {
                    i2 = 0;
                    try {
                        ApplicationInfo applicationInfo = Wrappers.packageManager(zzgdVar5.zzaw()).getApplicationInfo(strZzl2, 0);
                        if (applicationInfo != null) {
                            i2 = applicationInfo.targetSdkVersion;
                        }
                    } catch (PackageManager.NameNotFoundException unused4) {
                        zzgdVar5.zzay();
                        zzgdVar5.zzaA().zzi().zzb("PackageManager failed to find running app: app_id", strZzl2);
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    i2 = 0;
                }
                j = i2;
            }
        } else {
            j = 0;
        }
        return new zzq(strZzl, strZzm, str4, j2, str5, 79000L, j3, str3, z2, z3, str6, jMin, i, zZzr, z4, str7, boolValueOf, j5, list, strZzi, str8, str9, zBooleanValue, j);
    }

    @WorkerThread
    public final void OooO0oo() {
        zzg();
        zzgd zzgdVar = this.f41276OooO00o;
        zzer zzerVarZzj = zzgdVar.zzaA().zzj();
        ArrayList arrayList = this.f16068OooO0oo;
        zzerVarZzj.zzb("Processing queued up service tasks", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                zzgdVar.zzaA().zzd().zzb("Task exception while flushing queue", e);
            }
        }
        arrayList.clear();
        this.f16062OooO.OooO00o();
    }

    @WorkerThread
    public final void OooOO0(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f16068OooO0oo;
        long size = arrayList.size();
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzf();
        if (size >= 1000) {
            o0O0OO0.OooO00o(zzgdVar, "Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f16062OooO.OooO0OO(60000L);
        OooOO0o();
    }

    @WorkerThread
    public final void OooOO0o() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        boolean zOooO0o = OooO0o();
        zzjy zzjyVar = this.f16063OooO0OO;
        if (zOooO0o) {
            zzjyVar.zzc();
            return;
        }
        zzgd zzgdVar = this.f41276OooO00o;
        if (zzgdVar.zzf().OooO0Oo()) {
            return;
        }
        zzgdVar.zzay();
        List<ResolveInfo> listQueryIntentServices = zzgdVar.zzaw().getPackageManager().queryIntentServices(new Intent().setClassName(zzgdVar.zzaw(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            o0O0OO0.OooO00o(zzgdVar, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextZzaw = zzgdVar.zzaw();
        zzgdVar.zzay();
        intent.setComponent(new ComponentName(contextZzaw, "com.google.android.gms.measurement.AppMeasurementService"));
        zzjyVar.zzb(intent);
    }

    @WorkerThread
    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzau zzauVar, String str) {
        zzg();
        zza();
        zzgd zzgdVar = this.f41276OooO00o;
        if (zzgdVar.zzv().zzo(12451000) == 0) {
            OooOO0(new oOo00o00(this, zzauVar, str, zzcfVar));
        } else {
            zzgdVar.zzaA().zzk().zza("Not bundling data. Service unavailable or out of date");
            zzgdVar.zzv().zzT(zzcfVar, new byte[0]);
        }
    }

    @WorkerThread
    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        OooOO0(new oO0o0000(this, OooO0oO(false), bundle));
    }

    @WorkerThread
    public final boolean zzL() {
        zzg();
        zza();
        return this.f16064OooO0Oo != null;
    }

    @WorkerThread
    public final void zzs() {
        zzg();
        zza();
        zzjy zzjyVar = this.f16063OooO0OO;
        zzjyVar.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.f41276OooO00o.zzaw(), zzjyVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f16064OooO0Oo = null;
    }

    @WorkerThread
    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        OooOO0(new oO0OO00(this, OooO0oO(false), zzcfVar));
    }

    @WorkerThread
    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        OooOO0(new ooo0o(this, atomicReference, OooO0oO(false)));
    }
}
