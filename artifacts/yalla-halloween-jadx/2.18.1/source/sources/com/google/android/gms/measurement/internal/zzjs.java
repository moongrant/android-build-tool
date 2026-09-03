package com.google.android.gms.measurement.internal;

import OooO0o.OooO0OO;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.internal.measurement.zzpf;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o0OO0OoO.OooO00o;
import o0OO0OoO.Oooo0;
import o0OO0OoO.o0;
import o0OO0OoO.o00OOOO0;
import o0OO0OoO.o00OOOOo;
import o0OO0OoO.o0O000O;
import o0OO0OoO.o0O0O00;
import o0OO0OoO.o0O0OO0;
import o0OO0OoO.o0O0o;
import o0OO0OoO.o0oOOo;
import o0OO0OoO.oo00oO;
import o0OO0OoO.oo0o0Oo;
import p167o00Ooo.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzjs extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0 f16266OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final zzjr f16267OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public zzee f16268OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0oOOo f16269OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Boolean f16270OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O0OO0 f16271OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f16272OooO0oo;

    public zzjs(zzfy zzfyVar) {
        super(zzfyVar);
        this.f16272OooO0oo = new ArrayList();
        this.f16271OooO0oO = new o0O0OO0(zzfyVar.zzav());
        this.f16267OooO0OO = new zzjr(this);
        this.f16269OooO0o = new o0oOOo(this, zzfyVar);
        this.f16266OooO = new o0(this, zzfyVar);
    }

    public static /* bridge */ /* synthetic */ void OooOOO0(zzjs zzjsVar, ComponentName componentName) {
        zzjsVar.zzg();
        if (zzjsVar.f16268OooO0Oo != null) {
            zzjsVar.f16268OooO0Oo = null;
            zzjsVar.f37615OooO00o.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjsVar.zzg();
            zzjsVar.OooOOO();
        }
    }

    @WorkerThread
    public final void OooO() {
        zzg();
        o0O0OO0 o0o0oo0 = this.f16271OooO0oO;
        o0o0oo0.f37792OooO0O0 = o0o0oo0.f37791OooO00o.elapsedRealtime();
        o0oOOo o0oooo2 = this.f16269OooO0o;
        this.f37615OooO00o.zzf();
        o0oooo2.OooO0OO(((Long) zzeb.zzI.zza(null)).longValue());
    }

    @Override // o0OO0OoO.oo0o0Oo
    public final boolean OooO0O0() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final void OooO0OO(zzee zzeeVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int size;
        zzg();
        zza();
        OooOO0O();
        this.f37615OooO00o.zzf();
        int i = 0;
        int i2 = 100;
        while (i < 1001 && i2 == 100) {
            ArrayList arrayList = new ArrayList();
            List listZzi = this.f37615OooO00o.zzi().zzi(100);
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
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        zzeeVar.zzk((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e) {
                        this.f37615OooO00o.zzay().zzd().zzb("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlc) {
                    try {
                        zzeeVar.zzt((zzlc) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e2) {
                        this.f37615OooO00o.zzay().zzd().zzb("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzeeVar.zzn((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e3) {
                        this.f37615OooO00o.zzay().zzd().zzb("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    OooOO0.OooO0O0(this.f37615OooO00o, "Discarding data. Unrecognized parcel type.");
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
        this.f37615OooO00o.zzaw();
        OooOO0(new o0O000O(this, OooO0oO(true), this.f37615OooO00o.zzi().zzn(zzacVar), new zzac(zzacVar)));
    }

    @WorkerThread
    public final boolean OooO0o() {
        zzg();
        zza();
        if (this.f16270OooO0o0 == null) {
            zzg();
            zza();
            o0O0O00 o0o0o00Zzm = this.f37615OooO00o.zzm();
            o0o0o00Zzm.zzg();
            boolean z = false;
            Boolean boolValueOf = !o0o0o00Zzm.OooO0o0().contains("use_service") ? null : Boolean.valueOf(o0o0o00Zzm.OooO0o0().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                this.f37615OooO00o.zzaw();
                zzef zzefVarZzh = this.f37615OooO00o.zzh();
                zzefVarZzh.zza();
                if (zzefVarZzh.f16116OooOO0O == 1) {
                    z = true;
                } else {
                    Oooo0.OooO00o(this.f37615OooO00o, "Checking service availability");
                    int iZzo = this.f37615OooO00o.zzv().zzo(12451000);
                    if (iZzo == 0) {
                        Oooo0.OooO00o(this.f37615OooO00o, "Service available");
                    } else if (iZzo != 1) {
                        if (iZzo == 2) {
                            this.f37615OooO00o.zzay().zzc().zza("Service container out of date");
                            if (this.f37615OooO00o.zzv().zzm() >= 17443) {
                                z = boolValueOf == null;
                            }
                        } else if (iZzo == 3) {
                            OooO00o.OooO0O0(this.f37615OooO00o, "Service disabled");
                        } else if (iZzo == 9) {
                            OooO00o.OooO0O0(this.f37615OooO00o, "Service invalid");
                        } else if (iZzo != 18) {
                            this.f37615OooO00o.zzay().zzk().zzb("Unexpected service status", Integer.valueOf(iZzo));
                        } else {
                            OooO00o.OooO0O0(this.f37615OooO00o, "Service updating");
                        }
                        z2 = false;
                    } else {
                        Oooo0.OooO00o(this.f37615OooO00o, "Service missing");
                    }
                    z = true;
                }
                if (!z && this.f37615OooO00o.zzf().OooO0o0()) {
                    OooOO0.OooO0O0(this.f37615OooO00o, "No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    o0O0O00 o0o0o00Zzm2 = this.f37615OooO00o.zzm();
                    o0o0o00Zzm2.zzg();
                    SharedPreferences.Editor editorEdit = o0o0o00Zzm2.OooO0o0().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.f16270OooO0o0 = Boolean.valueOf(z2);
        }
        return this.f16270OooO0o0.booleanValue();
    }

    @WorkerThread
    public final boolean OooO0o0() {
        zzg();
        zza();
        return !OooO0o() || this.f37615OooO00o.zzv().zzm() >= ((Integer) zzeb.zzaf.zza(null)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x0106  */
    @WorkerThread
    public final zzq OooO0oO(boolean z) {
        String strOooO00o;
        List list;
        long j;
        String str;
        String str2;
        Pair pairZza;
        this.f37615OooO00o.zzaw();
        zzef zzefVarZzh = this.f37615OooO00o.zzh();
        String str3 = null;
        if (z) {
            zzeo zzeoVarZzay = this.f37615OooO00o.zzay();
            if (zzeoVarZzay.f37615OooO00o.zzm().f37765OooO0Oo == null || (pairZza = zzeoVarZzay.f37615OooO00o.zzm().f37765OooO0Oo.zza()) == null || pairZza == o0O0O00.f37762OooOo0o) {
                strOooO00o = null;
            } else {
                strOooO00o = OooO0OO.OooO00o(String.valueOf(pairZza.second), CertificateUtil.DELIMITER, (String) pairZza.first);
            }
        } else {
            strOooO00o = null;
        }
        zzefVarZzh.zzg();
        String strZzl = zzefVarZzh.zzl();
        String strZzm = zzefVarZzh.zzm();
        zzefVarZzh.zza();
        String str4 = zzefVarZzh.f16110OooO0Oo;
        zzefVarZzh.zza();
        long j2 = zzefVarZzh.f16112OooO0o0;
        zzefVarZzh.zza();
        Preconditions.checkNotNull(zzefVarZzh.f16111OooO0o);
        String str5 = zzefVarZzh.f16111OooO0o;
        zzefVarZzh.f37615OooO00o.zzf().zzh();
        zzefVarZzh.zza();
        zzefVarZzh.zzg();
        long j3 = zzefVarZzh.f16113OooO0oO;
        if (j3 == 0) {
            zzlh zzlhVarZzv = zzefVarZzh.f37615OooO00o.zzv();
            Context contextZzau = zzefVarZzh.f37615OooO00o.zzau();
            String packageName = zzefVarZzh.f37615OooO00o.zzau().getPackageName();
            zzlhVarZzv.zzg();
            Preconditions.checkNotNull(contextZzau);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzau.getPackageManager();
            MessageDigest messageDigestOooO0oo = zzlh.OooO0oo();
            long jOoooO00 = -1;
            if (messageDigestOooO0oo == null) {
                OooOO0.OooO0O0(zzlhVarZzv.f37615OooO00o, "Could not get MD5 instance");
            } else if (packageManager != null) {
                try {
                    if (zzlhVarZzv.OooOoOO(contextZzau, packageName)) {
                        jOoooO00 = 0;
                    } else {
                        Signature[] signatureArr = Wrappers.packageManager(contextZzau).getPackageInfo(zzlhVarZzv.f37615OooO00o.zzau().getPackageName(), 64).signatures;
                        if (signatureArr == null || signatureArr.length <= 0) {
                            zzlhVarZzv.f37615OooO00o.zzay().zzk().zza("Could not get signatures");
                        } else {
                            jOoooO00 = zzlh.OoooO00(messageDigestOooO0oo.digest(signatureArr[0].toByteArray()));
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    zzlhVarZzv.f37615OooO00o.zzay().zzd().zzb("Package name not found", e);
                }
            } else {
                jOoooO00 = 0;
            }
            j3 = jOoooO00;
            zzefVarZzh.f16113OooO0oO = j3;
        }
        long j4 = j3;
        boolean zZzJ = zzefVarZzh.f37615OooO00o.zzJ();
        boolean z2 = !zzefVarZzh.f37615OooO00o.zzm().f37775OooOOOO;
        zzefVarZzh.zzg();
        if (zzefVarZzh.f37615OooO00o.zzJ()) {
            zzpf.zzc();
            if (zzefVarZzh.f37615OooO00o.zzf().zzs(null, zzeb.zzaa)) {
                Oooo0.OooO00o(zzefVarZzh.f37615OooO00o, "Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = zzefVarZzh.f37615OooO00o.zzau().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zzefVarZzh.f37615OooO00o.zzau());
                            if (objInvoke == null) {
                                str3 = null;
                            } else {
                                try {
                                    str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                } catch (Exception unused) {
                                    zzefVarZzh.f37615OooO00o.zzay().zzl().zza("Failed to retrieve Firebase Instance Id");
                                    str3 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            zzefVarZzh.f37615OooO00o.zzay().zzm().zza("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
        }
        String str6 = str3;
        zzfy zzfyVar = zzefVarZzh.f37615OooO00o;
        long jZza = zzfyVar.zzm().f37767OooO0o0.zza();
        long jMin = jZza == 0 ? zzfyVar.f16224Oooo00O : Math.min(zzfyVar.f16224Oooo00O, jZza);
        zzefVarZzh.zza();
        int i = zzefVarZzh.f16116OooOO0O;
        boolean zZzr = zzefVarZzh.f37615OooO00o.zzf().zzr();
        o0O0O00 o0o0o00Zzm = zzefVarZzh.f37615OooO00o.zzm();
        o0o0o00Zzm.zzg();
        boolean z3 = o0o0o00Zzm.OooO0o0().getBoolean("deferred_analytics_collection", false);
        zzefVarZzh.zza();
        String str7 = zzefVarZzh.f16119OooOOO0;
        Boolean boolOooO0Oo = zzefVarZzh.f37615OooO00o.zzf().OooO0Oo("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolOooO0Oo == null ? null : Boolean.valueOf(!boolOooO0Oo.booleanValue());
        long j5 = zzefVarZzh.f16114OooO0oo;
        List list2 = zzefVarZzh.f16108OooO;
        String strZzh = zzefVarZzh.f37615OooO00o.zzm().OooO0o().zzh();
        if (zzefVarZzh.f16115OooOO0 == null) {
            list = list2;
            j = j5;
            if (zzefVarZzh.f37615OooO00o.zzf().zzs(null, zzeb.zzax)) {
                zzefVarZzh.f16115OooOO0 = zzefVarZzh.f37615OooO00o.zzv().OooO0oO();
            } else {
                zzefVarZzh.f16115OooOO0 = "";
            }
        } else {
            list = list2;
            j = j5;
        }
        String str8 = zzefVarZzh.f16115OooOO0;
        zzoz.zzc();
        if (zzefVarZzh.f37615OooO00o.zzf().zzs(null, zzeb.zzas)) {
            zzefVarZzh.zzg();
            if (zzefVarZzh.f16120OooOOOO == 0) {
                str = str7;
            } else {
                str = str7;
                long jCurrentTimeMillis = zzefVarZzh.f37615OooO00o.zzav().currentTimeMillis() - zzefVarZzh.f16120OooOOOO;
                if (zzefVarZzh.f16118OooOOO != null && jCurrentTimeMillis > 86400000 && zzefVarZzh.f16121OooOOOo == null) {
                    zzefVarZzh.OooO0OO();
                }
            }
            if (zzefVarZzh.f16118OooOOO == null) {
                zzefVarZzh.OooO0OO();
            }
            str2 = zzefVarZzh.f16118OooOOO;
        } else {
            str = str7;
            str2 = null;
        }
        return new zzq(strZzl, strZzm, str4, j2, str5, 73000L, j4, strOooO00o, zZzJ, z2, str6, jMin, i, zZzr, z3, str, boolValueOf, j, list, strZzh, str8, str2);
    }

    @WorkerThread
    public final void OooO0oo() {
        zzg();
        this.f37615OooO00o.zzay().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.f16272OooO0oo.size()));
        Iterator it = this.f16272OooO0oo.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                this.f37615OooO00o.zzay().zzd().zzb("Task exception while flushing queue", e);
            }
        }
        this.f16272OooO0oo.clear();
        this.f16266OooO.OooO00o();
    }

    @WorkerThread
    public final void OooOO0(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.f16272OooO0oo.size();
        this.f37615OooO00o.zzf();
        if (size >= 1000) {
            OooOO0.OooO0O0(this.f37615OooO00o, "Discarding data. Max runnable queue size reached");
            return;
        }
        this.f16272OooO0oo.add(runnable);
        this.f16266OooO.OooO0OO(60000L);
        OooOOO();
    }

    public final void OooOO0O() {
        this.f37615OooO00o.zzaw();
    }

    public final Boolean OooOO0o() {
        return this.f16270OooO0o0;
    }

    @WorkerThread
    public final void OooOOO() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (OooO0o()) {
            this.f16267OooO0OO.zzc();
            return;
        }
        if (this.f37615OooO00o.zzf().OooO0o0()) {
            return;
        }
        this.f37615OooO00o.zzaw();
        List<ResolveInfo> listQueryIntentServices = this.f37615OooO00o.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.f37615OooO00o.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            OooOO0.OooO0O0(this.f37615OooO00o, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextZzau = this.f37615OooO00o.zzau();
        this.f37615OooO00o.zzaw();
        intent.setComponent(new ComponentName(contextZzau, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f16267OooO0OO.zzb(intent);
    }

    @WorkerThread
    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzaw zzawVar, String str) {
        zzg();
        zza();
        if (this.f37615OooO00o.zzv().zzo(12451000) == 0) {
            OooOO0(new o0O0o(this, zzawVar, str, zzcfVar));
        } else {
            OooO00o.OooO0O0(this.f37615OooO00o, "Not bundling data. Service unavailable or out of date");
            this.f37615OooO00o.zzv().zzS(zzcfVar, new byte[0]);
        }
    }

    @WorkerThread
    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        OooOO0(new oo00oO(this, OooO0oO(false), bundle));
    }

    @WorkerThread
    public final boolean zzL() {
        zzg();
        zza();
        return this.f16268OooO0Oo != null;
    }

    @WorkerThread
    public final void zzs() {
        zzg();
        zza();
        this.f16267OooO0OO.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.f37615OooO00o.zzau(), this.f16267OooO0OO);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f16268OooO0Oo = null;
    }

    @WorkerThread
    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        OooOO0(new o00OOOOo(this, OooO0oO(false), zzcfVar));
    }

    @WorkerThread
    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        OooOO0(new o00OOOO0(this, atomicReference, OooO0oO(false)));
    }
}
