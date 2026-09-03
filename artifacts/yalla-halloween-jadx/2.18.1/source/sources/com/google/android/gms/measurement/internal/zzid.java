package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import com.android.billingclient.api.oo000o;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;
import o0OO0OoO.OooO00o;
import o0OO0OoO.Oooo0;
import o0OO0OoO.o00;
import o0OO0OoO.o00O0;
import o0OO0OoO.o00O00;
import o0OO0OoO.o00O000;
import o0OO0OoO.o00O0000;
import o0OO0OoO.o00O000o;
import o0OO0OoO.o00O00O;
import o0OO0OoO.o00O00OO;
import o0OO0OoO.o00O00o0;
import o0OO0OoO.o00O0O0;
import o0OO0OoO.o00O0O00;
import o0OO0OoO.o00O0O0O;
import o0OO0OoO.o00O0OO0;
import o0OO0OoO.o00OOO0;
import o0OO0OoO.o00Oo00;
import o0OO0OoO.o00oOoo;
import o0OO0OoO.o0O000;
import o0OO0OoO.o0O00000;
import o0OO0OoO.o0O0000O;
import o0OO0OoO.o0O0O00;
import o0OO0OoO.o0O0O0Oo;
import o0OO0OoO.o0O0ooO;
import o0OO0OoO.o0o0Oo;
import o0OO0OoO.oOO00O;
import o0OO0OoO.oo00o;
import o0OO0OoO.oo0o0Oo;
import o0OO0OoO.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzid extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("consentLock")
    public zzai f16238OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @VisibleForTesting
    public oo0oOO0 f16239OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public zzgy f16240OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f16241OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CopyOnWriteArraySet f16242OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicReference f16243OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Object f16244OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("consentLock")
    public int f16245OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicLong f16246OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f16247OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final zzs f16248OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f16249OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @VisibleForTesting
    public boolean f16250OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o00O00OO f16251OooOOOo;

    public zzid(zzfy zzfyVar) {
        super(zzfyVar);
        this.f16242OooO0o0 = new CopyOnWriteArraySet();
        this.f16244OooO0oo = new Object();
        this.f16250OooOOOO = true;
        this.f16251OooOOOo = new o00O00OO(this);
        this.f16243OooO0oO = new AtomicReference();
        this.f16238OooO = new zzai(null, null);
        this.f16245OooOO0 = 100;
        this.f16247OooOO0o = -1L;
        this.f16249OooOOO0 = 100;
        this.f16246OooOO0O = new AtomicLong(0L);
        this.f16248OooOOO = new zzs(zzfyVar);
    }

    public static /* bridge */ /* synthetic */ void OooOOO(zzid zzidVar, zzai zzaiVar, zzai zzaiVar2) {
        boolean z;
        zzah[] zzahVarArr = {zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            zzah zzahVar = zzahVarArr[i];
            if (!zzaiVar2.zzi(zzahVar) && zzaiVar.zzi(zzahVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean zZzl = zzaiVar.zzl(zzaiVar2, zzah.ANALYTICS_STORAGE, zzah.AD_STORAGE);
        if (z || zZzl) {
            zzidVar.f37615OooO00o.zzh().OooO0OO();
        }
    }

    public static void OooOOOO(zzid zzidVar, zzai zzaiVar, int i, long j, boolean z, boolean z2) {
        zzidVar.zzg();
        zzidVar.zza();
        if (j <= zzidVar.f16247OooOO0o && zzai.zzj(zzidVar.f16249OooOOO0, i)) {
            zzidVar.f37615OooO00o.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzaiVar);
            return;
        }
        o0O0O00 o0o0o00Zzm = zzidVar.f37615OooO00o.zzm();
        zzfy zzfyVar = o0o0o00Zzm.f37615OooO00o;
        o0o0o00Zzm.zzg();
        if (!o0o0o00Zzm.OooOO0O(i)) {
            zzidVar.f37615OooO00o.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor editorEdit = o0o0o00Zzm.OooO0o0().edit();
        editorEdit.putString("consent_settings", zzaiVar.zzh());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        zzidVar.f16247OooOO0o = j;
        zzidVar.f16249OooOOO0 = i;
        zzjs zzjsVarZzt = zzidVar.f37615OooO00o.zzt();
        zzjsVarZzt.zzg();
        zzjsVarZzt.zza();
        if (z) {
            zzjsVarZzt.OooOO0O();
            zzjsVarZzt.f37615OooO00o.zzi().zzj();
        }
        if (zzjsVarZzt.OooO0o0()) {
            zzjsVarZzt.OooOO0(new o0O0000O(zzjsVarZzt, zzjsVarZzt.OooO0oO(false)));
        }
        if (z2) {
            zzidVar.f37615OooO00o.zzt().zzu(new AtomicReference());
        }
    }

    public final void OooO(String str) {
        this.f16243OooO0oO.set(str);
    }

    @Override // o0OO0OoO.oo0o0Oo
    public final boolean OooO0O0() {
        return false;
    }

    @WorkerThread
    public final void OooO0OO(String str, String str2, Bundle bundle) {
        zzg();
        OooO0Oo(str, str2, this.f37615OooO00o.zzav().currentTimeMillis(), bundle);
    }

    @WorkerThread
    public final void OooO0Oo(String str, String str2, long j, Bundle bundle) {
        zzg();
        OooO0o0(str, str2, j, bundle, true, this.f16240OooO0Oo == null || zzlh.OooOoo0(str2), true, null);
    }

    public final void OooO0o(long j, boolean z) {
        zzg();
        zza();
        this.f37615OooO00o.zzay().zzc().zza("Resetting analytics data (FE)");
        zzki zzkiVarZzu = this.f37615OooO00o.zzu();
        zzkiVarZzu.zzg();
        o0O0O0Oo o0o0o0oo = zzkiVarZzu.f16278OooO0o0;
        o0o0o0oo.f37788OooO0OO.OooO00o();
        o0o0o0oo.f37786OooO00o = 0L;
        o0o0o0oo.f37787OooO0O0 = 0L;
        zzoz.zzc();
        if (this.f37615OooO00o.zzf().zzs(null, zzeb.zzas)) {
            this.f37615OooO00o.zzh().OooO0OO();
        }
        boolean zZzJ = this.f37615OooO00o.zzJ();
        o0O0O00 o0o0o00Zzm = this.f37615OooO00o.zzm();
        o0o0o00Zzm.f37767OooO0o0.zzb(j);
        if (!TextUtils.isEmpty(o0o0o00Zzm.f37615OooO00o.zzm().f37779OooOOoo.zza())) {
            o0o0o00Zzm.f37779OooOOoo.zzb(null);
        }
        zzoe.zzc();
        zzag zzagVarZzf = o0o0o00Zzm.f37615OooO00o.zzf();
        zzea zzeaVar = zzeb.zzad;
        if (zzagVarZzf.zzs(null, zzeaVar)) {
            o0o0o00Zzm.f37773OooOOO.zzb(0L);
        }
        if (!o0o0o00Zzm.f37615OooO00o.zzf().zzv()) {
            o0o0o00Zzm.OooO(!zZzJ);
        }
        o0o0o00Zzm.f37781OooOo00.zzb(null);
        o0o0o00Zzm.f37780OooOo0.zzb(0L);
        o0o0o00Zzm.f37782OooOo0O.zzb(null);
        if (z) {
            zzjs zzjsVarZzt = this.f37615OooO00o.zzt();
            zzjsVarZzt.zzg();
            zzjsVarZzt.zza();
            zzq zzqVarOooO0oO = zzjsVarZzt.OooO0oO(false);
            zzjsVarZzt.OooOO0O();
            zzjsVarZzt.f37615OooO00o.zzi().zzj();
            zzjsVarZzt.OooOO0(new o0o0Oo(zzjsVarZzt, zzqVarOooO0oO));
        }
        zzoe.zzc();
        if (this.f37615OooO00o.zzf().zzs(null, zzeaVar)) {
            this.f37615OooO00o.zzu().f16276OooO0Oo.OooO00o();
        }
        this.f16250OooOOOO = !zZzJ;
    }

    @WorkerThread
    public final void OooO0o0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        Bundle[] bundleArr;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.f37615OooO00o.zzJ()) {
            this.f37615OooO00o.zzay().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List list = this.f37615OooO00o.zzh().f16108OooO;
        if (list != null && !list.contains(str2)) {
            this.f37615OooO00o.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f16241OooO0o) {
            this.f16241OooO0o = true;
            try {
                try {
                    (!this.f37615OooO00o.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f37615OooO00o.zzau().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f37615OooO00o.zzau());
                } catch (Exception e) {
                    this.f37615OooO00o.zzay().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.f37615OooO00o.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.f37615OooO00o.zzaw();
            OooOO0O(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid", bundle.getString("gclid"), this.f37615OooO00o.zzav().currentTimeMillis());
        }
        this.f37615OooO00o.zzaw();
        if (z && zzlh.zzal(str2)) {
            this.f37615OooO00o.zzv().OooOO0o(bundle, this.f37615OooO00o.zzm().f37782OooOo0O.zza());
        }
        if (!z3) {
            this.f37615OooO00o.zzaw();
            if (!"_iap".equals(str2)) {
                zzlh zzlhVarZzv = this.f37615OooO00o.zzv();
                int i = 2;
                if (zzlhVarZzv.OooOo0o("event", str2)) {
                    if (zzlhVarZzv.OooOOoo("event", zzgv.zza, zzgv.zzb, str2)) {
                        zzlhVarZzv.f37615OooO00o.zzf();
                        if (zzlhVarZzv.OooOOo("event", 40, str2)) {
                            i = 0;
                        }
                    } else {
                        i = 13;
                    }
                }
                if (i != 0) {
                    this.f37615OooO00o.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.f37615OooO00o.zzj().OooO0Oo(str2));
                    zzlh zzlhVarZzv2 = this.f37615OooO00o.zzv();
                    this.f37615OooO00o.zzf();
                    this.f37615OooO00o.zzv().OooOOO(this.f16251OooOOOo, null, i, "_ev", zzlhVarZzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        this.f37615OooO00o.zzaw();
        zzik zzikVarZzj = this.f37615OooO00o.zzs().zzj(false);
        if (zzikVarZzj != null && !bundle.containsKey("_sc")) {
            zzikVarZzj.f16252OooO00o = true;
        }
        zzlh.zzK(zzikVarZzj, bundle, z && !z3);
        boolean zEquals = "am".equals(str);
        boolean zOooOoo0 = zzlh.OooOoo0(str2);
        if (!z || this.f16240OooO0Oo == null || zOooOoo0) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                this.f37615OooO00o.zzay().zzc().zzc("Passing event to registered event handler (FE)", this.f37615OooO00o.zzj().OooO0Oo(str2), this.f37615OooO00o.zzj().OooO0O0(bundle));
                Preconditions.checkNotNull(this.f16240OooO0Oo);
                this.f16240OooO0Oo.interceptEvent(str, str2, bundle, j);
                return;
            }
            z4 = true;
        }
        if (this.f37615OooO00o.OooO0O0()) {
            int iZzh = this.f37615OooO00o.zzv().zzh(str2);
            if (iZzh != 0) {
                this.f37615OooO00o.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", this.f37615OooO00o.zzj().OooO0Oo(str2));
                zzlh zzlhVarZzv3 = this.f37615OooO00o.zzv();
                this.f37615OooO00o.zzf();
                this.f37615OooO00o.zzv().OooOOO(this.f16251OooOOOo, str3, iZzh, "_ev", zzlhVarZzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleOoooO = this.f37615OooO00o.zzv().OoooO(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(bundleOoooO);
            this.f37615OooO00o.zzaw();
            if (this.f37615OooO00o.zzs().zzj(false) != null && "_ae".equals(str2)) {
                o0O0O0Oo o0o0o0oo = this.f37615OooO00o.zzu().f16278OooO0o0;
                long jElapsedRealtime = o0o0o0oo.f37789OooO0Oo.f37615OooO00o.zzav().elapsedRealtime();
                long j2 = jElapsedRealtime - o0o0o0oo.f37787OooO0O0;
                o0o0o0oo.f37787OooO0O0 = jElapsedRealtime;
                if (j2 > 0) {
                    this.f37615OooO00o.zzv().OooOO0(bundleOoooO, j2);
                }
            }
            zznv.zzc();
            if (this.f37615OooO00o.zzf().zzs(null, zzeb.zzac)) {
                if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) && "_ssr".equals(str2)) {
                    zzlh zzlhVarZzv4 = this.f37615OooO00o.zzv();
                    String string = bundleOoooO.getString("_ffr");
                    String strTrim = Strings.isEmptyOrWhitespace(string) ? null : string != null ? string.trim() : string;
                    if (zzlf.zza(strTrim, zzlhVarZzv4.f37615OooO00o.zzm().f37779OooOOoo.zza())) {
                        zzlhVarZzv4.f37615OooO00o.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzlhVarZzv4.f37615OooO00o.zzm().f37779OooOOoo.zzb(strTrim);
                } else if ("_ae".equals(str2)) {
                    String strZza = this.f37615OooO00o.zzv().f37615OooO00o.zzm().f37779OooOOoo.zza();
                    if (!TextUtils.isEmpty(strZza)) {
                        bundleOoooO.putString("_ffr", strZza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleOoooO);
            if (this.f37615OooO00o.zzm().f37773OooOOO.zza() > 0 && this.f37615OooO00o.zzm().OooOO0(j) && this.f37615OooO00o.zzm().f37776OooOOOo.zzb()) {
                Oooo0.OooO00o(this.f37615OooO00o, "Current session is expired, remove the session number, ID, and engagement time");
                OooOO0O(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", null, this.f37615OooO00o.zzav().currentTimeMillis());
                OooOO0O(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sno", null, this.f37615OooO00o.zzav().currentTimeMillis());
                OooOO0O(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_se", null, this.f37615OooO00o.zzav().currentTimeMillis());
            }
            if (bundleOoooO.getLong("extend_session", 0L) == 1) {
                Oooo0.OooO00o(this.f37615OooO00o, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.f37615OooO00o.zzu().f16276OooO0Oo.OooO0O0(j, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleOoooO.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str4 = (String) arrayList2.get(i2);
                if (str4 != null) {
                    this.f37615OooO00o.zzv();
                    Object obj = bundleOoooO.get(str4);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleOoooO.putParcelableArray(str4, bundleArr);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                Bundle bundleOoooO0O = (Bundle) arrayList.get(i3);
                String str5 = i3 != 0 ? "_ep" : str2;
                bundleOoooO0O.putString("_o", str);
                if (z2) {
                    bundleOoooO0O = this.f37615OooO00o.zzv().OoooO0O(bundleOoooO0O);
                }
                Bundle bundle2 = bundleOoooO0O;
                zzaw zzawVar = new zzaw(str5, new zzau(bundle2), str, j);
                zzjs zzjsVarZzt = this.f37615OooO00o.zzt();
                Objects.requireNonNull(zzjsVarZzt);
                Preconditions.checkNotNull(zzawVar);
                zzjsVarZzt.zzg();
                zzjsVarZzt.zza();
                zzjsVarZzt.OooOO0O();
                zzjsVarZzt.OooOO0(new o0O000(zzjsVarZzt, zzjsVarZzt.OooO0oO(true), zzjsVarZzt.f37615OooO00o.zzi().zzo(zzawVar), zzawVar));
                if (!z4) {
                    Iterator it = this.f16242OooO0o0.iterator();
                    while (it.hasNext()) {
                        ((zzgz) it.next()).onEvent(str, str2, new Bundle(bundle2), j);
                    }
                }
                i3++;
            }
            this.f37615OooO00o.zzaw();
            if (this.f37615OooO00o.zzs().zzj(false) == null || !"_ae".equals(str2)) {
                return;
            }
            this.f37615OooO00o.zzu().f16278OooO0o0.OooO00o(true, true, this.f37615OooO00o.zzav().elapsedRealtime());
        }
    }

    public final void OooO0oO(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str3 : bundle2.keySet()) {
            Object obj = bundle2.get(str3);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str3, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f37615OooO00o.zzaz().zzp(new o00(this, str, str2, j, bundle2, z, z2, z3));
    }

    public final void OooO0oo(String str, String str2, long j, Object obj) {
        this.f37615OooO00o.zzaz().zzp(new o00O0000(this, str, str2, obj, j));
    }

    @WorkerThread
    public final void OooOO0(zzai zzaiVar) {
        zzg();
        boolean z = (zzaiVar.zzi(zzah.ANALYTICS_STORAGE) && zzaiVar.zzi(zzah.AD_STORAGE)) || this.f37615OooO00o.zzt().OooO0o0();
        if (z != this.f37615OooO00o.zzK()) {
            this.f37615OooO00o.zzG(z);
            o0O0O00 o0o0o00Zzm = this.f37615OooO00o.zzm();
            zzfy zzfyVar = o0o0o00Zzm.f37615OooO00o;
            o0o0o00Zzm.zzg();
            Boolean boolValueOf = o0o0o00Zzm.OooO0o0().contains("measurement_enabled_from_api") ? Boolean.valueOf(o0o0o00Zzm.OooO0o0().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                OooOO0o(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    @WorkerThread
    public final void OooOO0O(String str, String str2, Object obj, long j) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long lValueOf = Long.valueOf(true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    this.f37615OooO00o.zzm().f37772OooOO0o.zzb(lValueOf.longValue() == 1 ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    this.f37615OooO00o.zzm().f37772OooOO0o.zzb("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.f37615OooO00o.zzm().f37772OooOO0o.zzb("unset");
                str2 = "_npa";
            }
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!this.f37615OooO00o.zzJ()) {
            Oooo0.OooO00o(this.f37615OooO00o, "User property not set since app measurement is disabled");
            return;
        }
        if (this.f37615OooO00o.OooO0O0()) {
            zzlc zzlcVar = new zzlc(str4, j, obj2, str);
            zzjs zzjsVarZzt = this.f37615OooO00o.zzt();
            zzjsVarZzt.zzg();
            zzjsVarZzt.zza();
            zzjsVarZzt.OooOO0O();
            zzjsVarZzt.OooOO0(new o00OOO0(zzjsVarZzt, zzjsVarZzt.OooO0oO(true), zzjsVarZzt.f37615OooO00o.zzi().zzp(zzlcVar), zzlcVar));
        }
    }

    @WorkerThread
    public final void OooOO0o(Boolean bool, boolean z) {
        zzg();
        zza();
        this.f37615OooO00o.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.f37615OooO00o.zzm().OooO0oo(bool);
        if (z) {
            o0O0O00 o0o0o00Zzm = this.f37615OooO00o.zzm();
            zzfy zzfyVar = o0o0o00Zzm.f37615OooO00o;
            o0o0o00Zzm.zzg();
            SharedPreferences.Editor editorEdit = o0o0o00Zzm.OooO0o0().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.f37615OooO00o.zzK() || !(bool == null || bool.booleanValue())) {
            OooOOO0();
        }
    }

    @WorkerThread
    public final void OooOOO0() {
        zzg();
        String strZza = this.f37615OooO00o.zzm().f37772OooOO0o.zza();
        int i = 1;
        if (strZza != null) {
            if ("unset".equals(strZza)) {
                OooOO0O("app", "_npa", null, this.f37615OooO00o.zzav().currentTimeMillis());
            } else {
                OooOO0O("app", "_npa", Long.valueOf(true != ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(strZza) ? 0L : 1L), this.f37615OooO00o.zzav().currentTimeMillis());
            }
        }
        if (!this.f37615OooO00o.zzJ() || !this.f16250OooOOOO) {
            this.f37615OooO00o.zzay().zzc().zza("Updating Scion state (FE)");
            zzjs zzjsVarZzt = this.f37615OooO00o.zzt();
            zzjsVarZzt.zzg();
            zzjsVarZzt.zza();
            zzjsVarZzt.OooOO0(new o0O00000(zzjsVarZzt, zzjsVarZzt.OooO0oO(true)));
            return;
        }
        this.f37615OooO00o.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzz();
        zzoe.zzc();
        if (this.f37615OooO00o.zzf().zzs(null, zzeb.zzad)) {
            this.f37615OooO00o.zzu().f16276OooO0Oo.OooO00o();
        }
        this.f37615OooO00o.zzaz().zzp(new oo000o(this, i));
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = this.f37615OooO00o.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.f37615OooO00o.zzaz().zzp(new o00O000o(this, bundle2));
    }

    public final void zzB() {
        if (!(this.f37615OooO00o.zzau().getApplicationContext() instanceof Application) || this.f16239OooO0OO == null) {
            return;
        }
        ((Application) this.f37615OooO00o.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f16239OooO0OO);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.f37615OooO00o.zzav().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            this.f37615OooO00o.zzs().zzx(bundle2, j);
        } else {
            OooO0oO(str3, str2, j, bundle2, z2, !z2 || this.f16240OooO0Oo == null || zzlh.OooOoo0(str2), z);
        }
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzfy.OooO0OO();
        throw null;
    }

    public final void zzJ(zzgz zzgzVar) {
        zza();
        Preconditions.checkNotNull(zzgzVar);
        if (this.f16242OooO0o0.add(zzgzVar)) {
            return;
        }
        OooO00o.OooO0O0(this.f37615OooO00o, "OnEventListener already registered");
    }

    public final void zzK(long j) {
        this.f16243OooO0oO.set(null);
        this.f37615OooO00o.zzaz().zzp(new o00oOoo(this, j));
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.f37615OooO00o.zzav().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            OooO00o.OooO0O0(this.f37615OooO00o, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgu.zza(bundle2, "app_id", String.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null);
        zzgu.zza(bundle2, "name", String.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgu.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.f37615OooO00o.zzv().Oooo(string) != 0) {
            this.f37615OooO00o.zzay().zzd().zzb("Invalid conditional user property name", this.f37615OooO00o.zzj().OooO0o(string));
            return;
        }
        if (this.f37615OooO00o.zzv().Oooo0o(string, obj) != 0) {
            this.f37615OooO00o.zzay().zzd().zzc("Invalid conditional user property value", this.f37615OooO00o.zzj().OooO0o(string), obj);
            return;
        }
        Object objOooO0o = this.f37615OooO00o.zzv().OooO0o(string, obj);
        if (objOooO0o == null) {
            this.f37615OooO00o.zzay().zzd().zzc("Unable to normalize conditional user property value", this.f37615OooO00o.zzj().OooO0o(string), obj);
            return;
        }
        zzgu.zzb(bundle2, objOooO0o);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            this.f37615OooO00o.zzf();
            if (j2 > 15552000000L || j2 < 1) {
                this.f37615OooO00o.zzay().zzd().zzc("Invalid conditional user property timeout", this.f37615OooO00o.zzj().OooO0o(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        this.f37615OooO00o.zzf();
        if (j3 > 15552000000L || j3 < 1) {
            this.f37615OooO00o.zzay().zzd().zzc("Invalid conditional user property time to live", this.f37615OooO00o.zzj().OooO0o(string), Long.valueOf(j3));
        } else {
            this.f37615OooO00o.zzaz().zzp(new o00O000(this, bundle2));
        }
    }

    public final void zzR(Bundle bundle, int i, long j) {
        zza();
        String strZzg = zzai.zzg(bundle);
        if (strZzg != null) {
            this.f37615OooO00o.zzay().zzl().zzb("Ignoring invalid consent setting", strZzg);
            this.f37615OooO00o.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzai.zza(bundle), i, j);
    }

    public final void zzS(zzai zzaiVar, int i, long j) {
        zzai zzaiVar2;
        boolean z;
        boolean z2;
        boolean z3;
        zzai zzaiVarZzd = zzaiVar;
        zza();
        if (i != -10 && zzaiVar.zze() == null && zzaiVar.zzf() == null) {
            this.f37615OooO00o.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.f16244OooO0oo) {
            zzaiVar2 = this.f16238OooO;
            z = true;
            z2 = false;
            if (zzai.zzj(i, this.f16245OooOO0)) {
                boolean zZzk = zzaiVarZzd.zzk(this.f16238OooO);
                zzah zzahVar = zzah.ANALYTICS_STORAGE;
                if (zzaiVarZzd.zzi(zzahVar) && !this.f16238OooO.zzi(zzahVar)) {
                    z2 = true;
                }
                zzaiVarZzd = zzaiVarZzd.zzd(this.f16238OooO);
                this.f16238OooO = zzaiVarZzd;
                this.f16245OooOO0 = i;
                z3 = z2;
                z2 = zZzk;
            } else {
                z = false;
                z3 = false;
            }
        }
        if (!z) {
            this.f37615OooO00o.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzaiVarZzd);
            return;
        }
        long andIncrement = this.f16246OooOO0O.getAndIncrement();
        if (z2) {
            this.f16243OooO0oO.set(null);
            this.f37615OooO00o.zzaz().zzq(new o00O0O0O(this, zzaiVarZzd, j, i, andIncrement, z3, zzaiVar2));
            return;
        }
        o00O0OO0 o00o0oo1 = new o00O0OO0(this, zzaiVarZzd, i, andIncrement, z3, zzaiVar2);
        if (i == 30 || i == -10) {
            this.f37615OooO00o.zzaz().zzq(o00o0oo1);
        } else {
            this.f37615OooO00o.zzaz().zzp(o00o0oo1);
        }
    }

    @WorkerThread
    public final void zzT(zzgy zzgyVar) {
        zzgy zzgyVar2;
        zzg();
        zza();
        if (zzgyVar != null && zzgyVar != (zzgyVar2 = this.f16240OooO0Oo)) {
            Preconditions.checkState(zzgyVar2 == null, "EventInterceptor already set.");
        }
        this.f16240OooO0Oo = zzgyVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.f37615OooO00o.zzaz().zzp(new o00O0O0(this, bool, 0));
    }

    public final void zzW(String str, String str2, Object obj, boolean z) {
        zzX(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", obj, true, this.f37615OooO00o.zzav().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    public final void zzX(String str, String str2, Object obj, boolean z, long j) {
        int iOooo;
        String str3 = str == null ? "app" : str;
        if (z) {
            iOooo = this.f37615OooO00o.zzv().Oooo(str2);
        } else {
            zzlh zzlhVarZzv = this.f37615OooO00o.zzv();
            if (!zzlhVarZzv.OooOo0o("user property", str2)) {
                iOooo = 6;
            } else if (zzlhVarZzv.OooOOoo("user property", zzgx.zza, null, str2)) {
                zzlhVarZzv.f37615OooO00o.zzf();
                if (zzlhVarZzv.OooOOo("user property", 24, str2)) {
                    iOooo = 0;
                } else {
                    iOooo = 6;
                }
            } else {
                iOooo = 15;
            }
        }
        if (iOooo != 0) {
            zzlh zzlhVarZzv2 = this.f37615OooO00o.zzv();
            this.f37615OooO00o.zzf();
            this.f37615OooO00o.zzv().OooOOO(this.f16251OooOOOo, null, iOooo, "_ev", zzlhVarZzv2.zzD(str2, 24, true), str2 != null ? str2.length() : 0);
        } else {
            if (obj == null) {
                OooO0oo(str3, str2, j, null);
                return;
            }
            int iOooo0o = this.f37615OooO00o.zzv().Oooo0o(str2, obj);
            if (iOooo0o != 0) {
                zzlh zzlhVarZzv3 = this.f37615OooO00o.zzv();
                this.f37615OooO00o.zzf();
                this.f37615OooO00o.zzv().OooOOO(this.f16251OooOOOo, null, iOooo0o, "_ev", zzlhVarZzv3.zzD(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
            } else {
                Object objOooO0o = this.f37615OooO00o.zzv().OooO0o(str2, obj);
                if (objOooO0o != null) {
                    OooO0oo(str3, str2, j, objOooO0o);
                }
            }
        }
    }

    public final void zzZ(zzgz zzgzVar) {
        zza();
        Preconditions.checkNotNull(zzgzVar);
        if (this.f16242OooO0o0.remove(zzgzVar)) {
            return;
        }
        OooO00o.OooO0O0(this.f37615OooO00o, "OnEventListener had not been registered");
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.f37615OooO00o.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f37615OooO00o.zzaz().OooO0o0(atomicReference, 15000L, "boolean test flag value", new o00O00O(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f37615OooO00o.zzaz().OooO0o0(atomicReference, 15000L, "double test flag value", new o00O0O00(this, atomicReference, 0));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f37615OooO00o.zzaz().OooO0o0(atomicReference, 15000L, "int test flag value", new o00O0(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f37615OooO00o.zzaz().OooO0o0(atomicReference, 15000L, "long test flag value", new oo00o(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.f16243OooO0oO.get();
    }

    public final String zzp() {
        zzik zzikVarZzi = this.f37615OooO00o.zzs().zzi();
        if (zzikVarZzi != null) {
            return zzikVarZzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzik zzikVarZzi = this.f37615OooO00o.zzs().zzi();
        if (zzikVarZzi != null) {
            return zzikVarZzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f37615OooO00o.zzaz().OooO0o0(atomicReference, 15000L, "String test flag value", new o00O00o0(this, atomicReference, 0));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.f37615OooO00o.zzaz().zzs()) {
            this.f37615OooO00o.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f37615OooO00o.zzaw();
        if (zzab.zza()) {
            this.f37615OooO00o.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f37615OooO00o.zzaz().OooO0o0(atomicReference, 5000L, "get conditional user properties", new o00O00(this, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlh.zzH(list);
        }
        this.f37615OooO00o.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzt(boolean z) {
        zza();
        Oooo0.OooO00o(this.f37615OooO00o, "Getting user properties (FE)");
        if (this.f37615OooO00o.zzaz().zzs()) {
            this.f37615OooO00o.zzay().zzd().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        this.f37615OooO00o.zzaw();
        if (zzab.zza()) {
            this.f37615OooO00o.zzay().zzd().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f37615OooO00o.zzaz().OooO0o0(atomicReference, 5000L, "get user properties", new o0O0ooO(this, atomicReference, z));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        this.f37615OooO00o.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z) {
        if (this.f37615OooO00o.zzaz().zzs()) {
            this.f37615OooO00o.zzay().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f37615OooO00o.zzaw();
        if (zzab.zza()) {
            this.f37615OooO00o.zzay().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f37615OooO00o.zzaz().OooO0o0(atomicReference, 5000L, "get user properties", new oOO00O(this, atomicReference, str, str2, z));
        List<zzlc> list = (List) atomicReference.get();
        if (list == null) {
            this.f37615OooO00o.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        p021OooOooo.Oooo0 oooo0 = new p021OooOooo.Oooo0(list.size());
        for (zzlc zzlcVar : list) {
            Object objZza = zzlcVar.zza();
            if (objZza != null) {
                oooo0.put(zzlcVar.zzb, objZza);
            }
        }
        return oooo0;
    }

    @WorkerThread
    public final void zzz() {
        zzg();
        zza();
        if (this.f37615OooO00o.OooO0O0()) {
            if (this.f37615OooO00o.zzf().zzs(null, zzeb.zzX)) {
                zzag zzagVarZzf = this.f37615OooO00o.zzf();
                zzagVarZzf.f37615OooO00o.zzaw();
                Boolean boolOooO0Oo = zzagVarZzf.OooO0Oo("google_analytics_deferred_deep_link_enabled");
                if (boolOooO0Oo != null && boolOooO0Oo.booleanValue()) {
                    this.f37615OooO00o.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.f37615OooO00o.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhf
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzid zzidVar = this.zza;
                            zzidVar.zzg();
                            if (zzidVar.f37615OooO00o.zzm().f37778OooOOo0.zzb()) {
                                zzidVar.f37615OooO00o.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jZza = zzidVar.f37615OooO00o.zzm().f37777OooOOo.zza();
                            zzidVar.f37615OooO00o.zzm().f37777OooOOo.zzb(1 + jZza);
                            zzidVar.f37615OooO00o.zzf();
                            if (jZza < 5) {
                                zzidVar.f37615OooO00o.zzE();
                            } else {
                                OooO00o.OooO0O0(zzidVar.f37615OooO00o, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzidVar.f37615OooO00o.zzm().f37778OooOOo0.zza(true);
                            }
                        }
                    });
                }
            }
            zzjs zzjsVarZzt = this.f37615OooO00o.zzt();
            zzjsVarZzt.zzg();
            zzjsVarZzt.zza();
            zzq zzqVarOooO0oO = zzjsVarZzt.OooO0oO(true);
            zzjsVarZzt.f37615OooO00o.zzi().zzk();
            zzjsVarZzt.OooOO0(new o00Oo00(zzjsVarZzt, zzqVarOooO0oO));
            this.f16250OooOOOO = false;
            o0O0O00 o0o0o00Zzm = this.f37615OooO00o.zzm();
            o0o0o00Zzm.zzg();
            String string = o0o0o00Zzm.OooO0o0().getString("previous_os_version", null);
            o0o0o00Zzm.f37615OooO00o.zzg().OooO0OO();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = o0o0o00Zzm.OooO0o0().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f37615OooO00o.zzg().OooO0OO();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            OooO0OO(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
        }
    }
}
