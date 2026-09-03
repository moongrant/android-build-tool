package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;
import p188o00o0O.OooOO0;
import p269o00ooooo.o0OO0oO0;
import p269o00ooooo.o0OOO0;
import p269o00ooooo.oO00O0o;
import p269o00ooooo.oO00O0oO;
import p269o00ooooo.oO00OO0O;
import p269o00ooooo.oO00OOO;
import p269o00ooooo.oO00OOOo;
import p269o00ooooo.oO00OOo0;
import p269o00ooooo.oO00Oo0;
import p269o00ooooo.oO00Oo00;
import p269o00ooooo.oO00o0;
import p269o00ooooo.oO00o000;
import p269o00ooooo.oO0O000o;
import p269o00ooooo.oO0OO00o;
import p269o00ooooo.oO0OO0O;
import p269o00ooooo.oO0OOO00;
import p269o00ooooo.oOO;
import p269o00ooooo.oOO0000;
import p269o00ooooo.oOO00000;
import p269o00ooooo.oOOoOOO0;
import p269o00ooooo.oOo0000O;
import p269o00ooooo.oOo000Oo;
import p269o00ooooo.oOo000o0;
import p269o00ooooo.oOo00o0o;
import p269o00ooooo.oOo00ooO;
import p269o00ooooo.ooOOO00O;
import p269o00ooooo.ooOOO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzik extends o0OO0oO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("consentLock")
    public zzhb f16036OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @VisibleForTesting
    public oO0O000o f16037OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public zzhf f16038OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f16039OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CopyOnWriteArraySet f16040OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AtomicReference f16041OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Object f16042OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final AtomicLong f16043OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f16044OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final zzs f16045OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final oO0OOO00 f16046OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @VisibleForTesting
    public boolean f16047OooOOO0;

    public zzik(zzgd zzgdVar) {
        super(zzgdVar);
        this.f16040OooO0o0 = new CopyOnWriteArraySet();
        this.f16042OooO0oo = new Object();
        this.f16047OooOOO0 = true;
        this.f16046OooOOO = new oO0OOO00(this);
        this.f16041OooO0oO = new AtomicReference();
        this.f16036OooO = zzhb.zza;
        this.f16044OooOO0O = -1L;
        this.f16043OooOO0 = new AtomicLong(0L);
        this.f16045OooOO0o = new zzs(zzgdVar);
    }

    public static /* bridge */ /* synthetic */ void OooOO0O(zzik zzikVar, zzhb zzhbVar, zzhb zzhbVar2) {
        boolean z;
        zzha[] zzhaVarArr = {zzha.ANALYTICS_STORAGE, zzha.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            zzha zzhaVar = zzhaVarArr[i];
            if (!zzhbVar2.zzj(zzhaVar) && zzhbVar.zzj(zzhaVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean zZzn = zzhbVar.zzn(zzhbVar2, zzha.ANALYTICS_STORAGE, zzha.AD_STORAGE);
        if (z || zZzn) {
            zzikVar.f41276OooO00o.zzh().OooO0OO();
        }
    }

    public static void OooOO0o(zzik zzikVar, zzhb zzhbVar, long j, boolean z, boolean z2) {
        zzikVar.zzg();
        zzikVar.zza();
        zzgd zzgdVar = zzikVar.f41276OooO00o;
        zzhb zzhbVarOooO0o0 = zzgdVar.zzm().OooO0o0();
        if (j <= zzikVar.f16044OooOO0O && zzhb.zzk(zzhbVarOooO0o0.zza(), zzhbVar.zza())) {
            zzgdVar.zzaA().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzhbVar);
            return;
        }
        o0OOO0 o0ooo0Zzm = zzgdVar.zzm();
        zzgd zzgdVar2 = o0ooo0Zzm.f41276OooO00o;
        o0ooo0Zzm.zzg();
        int iZza = zzhbVar.zza();
        if (!o0ooo0Zzm.OooOO0(iZza)) {
            zzgdVar.zzaA().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzhbVar.zza()));
            return;
        }
        SharedPreferences.Editor editorEdit = o0ooo0Zzm.OooO0Oo().edit();
        editorEdit.putString("consent_settings", zzhbVar.zzi());
        editorEdit.putInt("consent_source", iZza);
        editorEdit.apply();
        zzikVar.f16044OooOO0O = j;
        zzjz zzjzVarZzt = zzgdVar.zzt();
        zzjzVarZzt.zzg();
        zzjzVarZzt.zza();
        if (z) {
            zzgd zzgdVar3 = zzjzVarZzt.f41276OooO00o;
            zzgdVar3.zzay();
            zzgdVar3.zzi().zzj();
        }
        if (zzjzVarZzt.OooO0o0()) {
            zzjzVarZzt.OooOO0(new oOO0000(zzjzVarZzt, zzjzVarZzt.OooO0oO(false)));
        }
        if (z2) {
            zzgdVar.zzt().zzu(new AtomicReference());
        }
    }

    @WorkerThread
    public final void OooO(Boolean bool, boolean z) {
        zzg();
        zza();
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzaA().zzc().zzb("Setting app measurement enabled (FE)", bool);
        zzgdVar.zzm().OooO0oO(bool);
        if (z) {
            o0OOO0 o0ooo0Zzm = zzgdVar.zzm();
            zzgd zzgdVar2 = o0ooo0Zzm.f41276OooO00o;
            o0ooo0Zzm.zzg();
            SharedPreferences.Editor editorEdit = o0ooo0Zzm.OooO0Oo().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (zzgdVar.zzK() || !(bool == null || bool.booleanValue())) {
            OooOO0();
        }
    }

    @Override // p269o00ooooo.o0OO0oO0
    public final boolean OooO0O0() {
        return false;
    }

    @WorkerThread
    public final void OooO0OO(Bundle bundle, String str, String str2) {
        zzg();
        OooO0Oo(str, str2, bundle, this.f41276OooO00o.zzax().currentTimeMillis());
    }

    @WorkerThread
    public final void OooO0Oo(String str, String str2, Bundle bundle, long j) {
        zzg();
        OooO0o0(str, str2, j, bundle, true, this.f16038OooO0Oo == null || zzlp.OooOoOO(str2), true, null);
    }

    public final void OooO0o(long j, boolean z) {
        zzg();
        zza();
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzaA().zzc().zza("Resetting analytics data (FE)");
        zzkp zzkpVarZzu = zzgdVar.zzu();
        zzkpVarZzu.zzg();
        oOO ooo = zzkpVarZzu.f16073OooO0o;
        ooo.f41418OooO0OO.OooO00o();
        ooo.f41416OooO00o = 0L;
        ooo.f41417OooO0O0 = 0L;
        zzqu.zzc();
        if (zzgdVar.zzf().zzs(null, zzeg.zzan)) {
            zzgdVar.zzh().OooO0OO();
        }
        boolean zZzJ = zzgdVar.zzJ();
        o0OOO0 o0ooo0Zzm = zzgdVar.zzm();
        o0ooo0Zzm.f41212OooO0o0.zzb(j);
        zzgd zzgdVar2 = o0ooo0Zzm.f41276OooO00o;
        if (!TextUtils.isEmpty(zzgdVar2.zzm().f41226OooOo00.zza())) {
            o0ooo0Zzm.f41226OooOo00.zzb(null);
        }
        zzph.zzc();
        zzag zzagVarZzf = zzgdVar2.zzf();
        zzef zzefVar = zzeg.zzaf;
        if (zzagVarZzf.zzs(null, zzefVar)) {
            o0ooo0Zzm.f41218OooOOO.zzb(0L);
        }
        o0ooo0Zzm.f41220OooOOOO.zzb(0L);
        if (!zzgdVar2.zzf().zzv()) {
            o0ooo0Zzm.OooO0oo(!zZzJ);
        }
        o0ooo0Zzm.f41225OooOo0.zzb(null);
        o0ooo0Zzm.f41227OooOo0O.zzb(0L);
        o0ooo0Zzm.f41228OooOo0o.zzb(null);
        if (z) {
            zzjz zzjzVarZzt = zzgdVar.zzt();
            zzjzVarZzt.zzg();
            zzjzVarZzt.zza();
            zzq zzqVarOooO0oO = zzjzVarZzt.OooO0oO(false);
            zzgd zzgdVar3 = zzjzVarZzt.f41276OooO00o;
            zzgdVar3.zzay();
            zzgdVar3.zzi().zzj();
            zzjzVarZzt.OooOO0(new ooOOO00O(zzjzVarZzt, zzqVarOooO0oO));
        }
        zzph.zzc();
        if (zzgdVar.zzf().zzs(null, zzefVar)) {
            zzgdVar.zzu().f16074OooO0o0.OooO00o();
        }
        this.f16047OooOOO0 = !zZzJ;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: o00ooooo.oOO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: com.google.android.gms.measurement.internal.zzgd
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: com.google.android.gms.measurement.internal.zzgd
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v27 ??, new type: com.google.android.gms.measurement.internal.zzjz
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v36 ??, new type: o00ooooo.oOOO000o
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v20 ??, new type: com.google.android.gms.measurement.internal.zzlp
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v23 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @androidx.annotation.WorkerThread
    public final void OooO0o0(java.lang.String r23, java.lang.String r24, long r25, android.os.Bundle r27, boolean r28, boolean r29, boolean r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 1245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.OooO0o0(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    @WorkerThread
    public final void OooO0oO(zzhb zzhbVar) {
        zzg();
        boolean zZzj = zzhbVar.zzj(zzha.ANALYTICS_STORAGE);
        zzgd zzgdVar = this.f41276OooO00o;
        boolean z = (zZzj && zzhbVar.zzj(zzha.AD_STORAGE)) || zzgdVar.zzt().OooO0o0();
        if (z != zzgdVar.zzK()) {
            zzgdVar.zzG(z);
            o0OOO0 o0ooo0Zzm = zzgdVar.zzm();
            zzgd zzgdVar2 = o0ooo0Zzm.f41276OooO00o;
            o0ooo0Zzm.zzg();
            Boolean boolValueOf = o0ooo0Zzm.OooO0Oo().contains("measurement_enabled_from_api") ? Boolean.valueOf(o0ooo0Zzm.OooO0Oo().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                OooO(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    @WorkerThread
    public final void OooO0oo(long j, String str, String str2, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        boolean zEquals = "allow_personalized_ads".equals(str2);
        zzgd zzgdVar = this.f41276OooO00o;
        if (zEquals) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long lValueOf = Long.valueOf(true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    zzgdVar.zzm().f41217OooOO0o.zzb(lValueOf.longValue() == 1 ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    zzgdVar.zzm().f41217OooOO0o.zzb("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                zzgdVar.zzm().f41217OooOO0o.zzb("unset");
                str2 = "_npa";
            }
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!zzgdVar.zzJ()) {
            zzgdVar.zzaA().zzj().zza("User property not set since app measurement is disabled");
            return;
        }
        if (zzgdVar.OooO00o()) {
            zzlk zzlkVar = new zzlk(j, str4, str, obj2);
            zzjz zzjzVarZzt = zzgdVar.zzt();
            zzjzVarZzt.zzg();
            zzjzVarZzt.zza();
            zzgd zzgdVar2 = zzjzVarZzt.f41276OooO00o;
            zzgdVar2.zzay();
            zzjzVarZzt.OooOO0(new ooOOO0Oo(zzjzVarZzt, zzjzVarZzt.OooO0oO(true), zzgdVar2.zzi().zzp(zzlkVar), zzlkVar));
        }
    }

    @WorkerThread
    public final void OooOO0() {
        zzg();
        zzgd zzgdVar = this.f41276OooO00o;
        String strZza = zzgdVar.zzm().f41217OooOO0o.zza();
        if (strZza != null) {
            if ("unset".equals(strZza)) {
                OooO0oo(zzgdVar.zzax().currentTimeMillis(), "app", "_npa", null);
            } else {
                OooO0oo(zzgdVar.zzax().currentTimeMillis(), "app", "_npa", Long.valueOf(true != ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(strZza) ? 0L : 1L));
            }
        }
        if (!zzgdVar.zzJ() || !this.f16047OooOOO0) {
            zzgdVar.zzaA().zzc().zza("Updating Scion state (FE)");
            zzjz zzjzVarZzt = zzgdVar.zzt();
            zzjzVarZzt.zzg();
            zzjzVarZzt.zza();
            zzjzVarZzt.OooOO0(new oOO00000(zzjzVarZzt, zzjzVarZzt.OooO0oO(true)));
            return;
        }
        zzgdVar.zzaA().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzz();
        zzph.zzc();
        if (zzgdVar.zzf().zzs(null, zzeg.zzaf)) {
            zzgdVar.zzu().f16074OooO0o0.OooO00o();
        }
        zzgdVar.zzaB().zzp(new oO00O0o(this));
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        zzgd zzgdVar = this.f41276OooO00o;
        long jCurrentTimeMillis = zzgdVar.zzax().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzgdVar.zzaB().zzp(new oO00Oo00(this, bundle2));
    }

    public final void zzB() {
        zzgd zzgdVar = this.f41276OooO00o;
        if (!(zzgdVar.zzaw().getApplicationContext() instanceof Application) || this.f16037OooO0OO == null) {
            return;
        }
        ((Application) zzgdVar.zzaw().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f16037OooO0OO);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.f41276OooO00o.zzax().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        zzgd zzgdVar = this.f41276OooO00o;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            zzgdVar.zzs().zzx(bundle2, j);
            return;
        }
        boolean z3 = !z2 || this.f16038OooO0Oo == null || zzlp.OooOoOO(str2);
        String str3 = str == null ? "app" : str;
        Bundle bundle3 = new Bundle(bundle2);
        for (String str4 : bundle3.keySet()) {
            Object obj = bundle3.get(str4);
            if (obj instanceof Bundle) {
                bundle3.putBundle(str4, new Bundle((Bundle) obj));
            } else if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                for (int i = 0; i < parcelableArr.length; i++) {
                    Parcelable parcelable = parcelableArr[i];
                    if (parcelable instanceof Bundle) {
                        parcelableArr[i] = new Bundle((Bundle) parcelable);
                    }
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Object obj2 = list.get(i2);
                    if (obj2 instanceof Bundle) {
                        list.set(i2, new Bundle((Bundle) obj2));
                    }
                }
            }
        }
        zzgdVar.zzaB().zzp(new oO00O0oO(this, str3, str2, j, bundle3, z2, z3, z));
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void zzJ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.f16040OooO0o0.add(zzhgVar)) {
            return;
        }
        this.f41276OooO00o.zzaA().zzk().zza("OnEventListener already registered");
    }

    public final void zzK(long j) {
        this.f16041OooO0oO.set(null);
        this.f41276OooO00o.zzaB().zzp(new oO00OOOo(this, j));
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.f41276OooO00o.zzax().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean zIsEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        zzgd zzgdVar = this.f41276OooO00o;
        if (!zIsEmpty) {
            zzgdVar.zzaA().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgz.zza(bundle2, "app_id", String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null);
        zzgz.zza(bundle2, "name", String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (zzgdVar.zzv().Oooo0oO(string) != 0) {
            zzgdVar.zzaA().zzd().zzb("Invalid conditional user property name", zzgdVar.zzj().OooO0o(string));
            return;
        }
        if (zzgdVar.zzv().Oooo0OO(obj, string) != 0) {
            zzgdVar.zzaA().zzd().zzc("Invalid conditional user property value", zzgdVar.zzj().OooO0o(string), obj);
            return;
        }
        Object objOooO0o0 = zzgdVar.zzv().OooO0o0(obj, string);
        if (objOooO0o0 == null) {
            zzgdVar.zzaA().zzd().zzc("Unable to normalize conditional user property value", zzgdVar.zzj().OooO0o(string), obj);
            return;
        }
        zzgz.zzb(bundle2, objOooO0o0);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            zzgdVar.zzf();
            if (j2 > 15552000000L || j2 < 1) {
                zzgdVar.zzaA().zzd().zzc("Invalid conditional user property timeout", zzgdVar.zzj().OooO0o(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        zzgdVar.zzf();
        if (j3 > 15552000000L || j3 < 1) {
            zzgdVar.zzaA().zzd().zzc("Invalid conditional user property time to live", zzgdVar.zzj().OooO0o(string), Long.valueOf(j3));
        } else {
            zzgdVar.zzaB().zzp(new oO00OOo0(this, bundle2));
        }
    }

    public final void zzR(zzhb zzhbVar, long j) {
        zzhb zzhbVar2;
        boolean z;
        zzhb zzhbVar3;
        boolean z2;
        boolean zZzm;
        zza();
        int iZza = zzhbVar.zza();
        if (iZza != -10 && zzhbVar.zzf() == null && zzhbVar.zzg() == null) {
            this.f41276OooO00o.zzaA().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.f16042OooO0oo) {
            zzhbVar2 = this.f16036OooO;
            z = false;
            if (zzhb.zzk(iZza, zzhbVar2.zza())) {
                zZzm = zzhbVar.zzm(this.f16036OooO);
                zzha zzhaVar = zzha.ANALYTICS_STORAGE;
                if (zzhbVar.zzj(zzhaVar) && !this.f16036OooO.zzj(zzhaVar)) {
                    z = true;
                }
                zzhb zzhbVarZze = zzhbVar.zze(this.f16036OooO);
                this.f16036OooO = zzhbVarZze;
                zzhbVar3 = zzhbVarZze;
                z2 = z;
                z = true;
            } else {
                zzhbVar3 = zzhbVar;
                z2 = false;
                zZzm = false;
            }
        }
        if (!z) {
            this.f41276OooO00o.zzaA().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzhbVar3);
            return;
        }
        long andIncrement = this.f16043OooOO0.getAndIncrement();
        if (zZzm) {
            this.f16041OooO0oO.set(null);
            this.f41276OooO00o.zzaB().zzq(new oOo0000O(this, zzhbVar3, j, andIncrement, z2, zzhbVar2));
            return;
        }
        oOo000o0 ooo000o0 = new oOo000o0(this, zzhbVar3, andIncrement, z2, zzhbVar2);
        if (iZza == 30 || iZza == -10) {
            this.f41276OooO00o.zzaB().zzq(ooo000o0);
        } else {
            this.f41276OooO00o.zzaB().zzp(ooo000o0);
        }
    }

    public final void zzS(Bundle bundle, int i, long j) {
        zza();
        String strZzh = zzhb.zzh(bundle);
        if (strZzh != null) {
            zzgd zzgdVar = this.f41276OooO00o;
            zzgdVar.zzaA().zzl().zzb("Ignoring invalid consent setting", strZzh);
            zzgdVar.zzaA().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzR(zzhb.zzb(bundle, i), j);
    }

    @WorkerThread
    public final void zzT(zzhf zzhfVar) {
        zzhf zzhfVar2;
        zzg();
        zza();
        if (zzhfVar != null && zzhfVar != (zzhfVar2 = this.f16038OooO0Oo)) {
            Preconditions.checkState(zzhfVar2 == null, "EventInterceptor already set.");
        }
        this.f16038OooO0Oo = zzhfVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.f41276OooO00o.zzaB().zzp(new oOo000Oo(this, bool));
    }

    public final void zzW(String str, String str2, Object obj, boolean z) {
        zzX(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", obj, true, this.f41276OooO00o.zzax().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    public final void zzX(String str, String str2, Object obj, boolean z, long j) {
        int iOooo0oO;
        int length;
        zzgd zzgdVar = this.f41276OooO00o;
        if (z) {
            iOooo0oO = zzgdVar.zzv().Oooo0oO(str2);
        } else {
            zzlp zzlpVarZzv = zzgdVar.zzv();
            if (!zzlpVarZzv.OooOo0o("user property", str2)) {
                iOooo0oO = 6;
            } else if (zzlpVarZzv.OooOo00("user property", zzhe.zza, null, str2)) {
                zzlpVarZzv.f41276OooO00o.zzf();
                if (zzlpVarZzv.OooOOo(24, "user property", str2)) {
                    iOooo0oO = 0;
                } else {
                    iOooo0oO = 6;
                }
            } else {
                iOooo0oO = 15;
            }
        }
        oO0OOO00 oo0ooo00 = this.f16046OooOOO;
        if (iOooo0oO != 0) {
            zzlp zzlpVarZzv2 = zzgdVar.zzv();
            zzgdVar.zzf();
            String strZzD = zzlpVarZzv2.zzD(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            zzgdVar.zzv().getClass();
            zzlp.OooOOO(oo0ooo00, null, iOooo0oO, "_ev", strZzD, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            zzgdVar.zzaB().zzp(new oO00OO0O(this, str3, str2, null, j));
            return;
        }
        int iOooo0OO = zzgdVar.zzv().Oooo0OO(obj, str2);
        if (iOooo0OO == 0) {
            Object objOooO0o0 = zzgdVar.zzv().OooO0o0(obj, str2);
            if (objOooO0o0 != null) {
                zzgdVar.zzaB().zzp(new oO00OO0O(this, str3, str2, objOooO0o0, j));
                return;
            }
            return;
        }
        zzlp zzlpVarZzv3 = zzgdVar.zzv();
        zzgdVar.zzf();
        String strZzD2 = zzlpVarZzv3.zzD(str2, 24, true);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
        zzgdVar.zzv().getClass();
        zzlp.OooOOO(oo0ooo00, null, iOooo0OO, "_ev", strZzD2, length);
    }

    public final void zzZ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.f16040OooO0o0.remove(zzhgVar)) {
            return;
        }
        this.f41276OooO00o.zzaA().zzk().zza("OnEventListener had not been registered");
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.f41276OooO00o.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f41276OooO00o.zzaB().OooO0Oo(atomicReference, 15000L, "boolean test flag value", new oOOoOOO0(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f41276OooO00o.zzaB().OooO0Oo(atomicReference, 15000L, "double test flag value", new oO0OO00o(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f41276OooO00o.zzaB().OooO0Oo(atomicReference, 15000L, "int test flag value", new oOo00ooO(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f41276OooO00o.zzaB().OooO0Oo(atomicReference, 15000L, "long test flag value", new oOo00o0o(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.f16041OooO0oO.get();
    }

    public final String zzp() {
        zzir zzirVarZzi = this.f41276OooO00o.zzs().zzi();
        if (zzirVarZzi != null) {
            return zzirVarZzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzir zzirVarZzi = this.f41276OooO00o.zzs().zzi();
        if (zzirVarZzi != null) {
            return zzirVarZzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f41276OooO00o.zzaB().OooO0Oo(atomicReference, 15000L, "String test flag value", new oO00o0(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        zzgd zzgdVar = this.f41276OooO00o;
        if (zzgdVar.zzaB().zzs()) {
            zzgdVar.zzaA().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        zzgdVar.zzay();
        if (zzab.zza()) {
            zzgdVar.zzaA().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        zzgdVar.zzaB().OooO0Oo(atomicReference, 5000L, "get conditional user properties", new oO00Oo0(this, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlp.zzH(list);
        }
        zzgdVar.zzaA().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzt(boolean z) {
        zza();
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzaA().zzj().zza("Getting user properties (FE)");
        if (zzgdVar.zzaB().zzs()) {
            zzgdVar.zzaA().zzd().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        zzgdVar.zzay();
        if (zzab.zza()) {
            zzgdVar.zzaA().zzd().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        zzgdVar.zzaB().OooO0Oo(atomicReference, 5000L, "get user properties", new oO00OOO(this, atomicReference, z));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzgdVar.zzaA().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z) {
        zzgd zzgdVar = this.f41276OooO00o;
        if (zzgdVar.zzaB().zzs()) {
            zzgdVar.zzaA().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        zzgdVar.zzay();
        if (zzab.zza()) {
            zzgdVar.zzaA().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        zzgdVar.zzaB().OooO0Oo(atomicReference, 5000L, "get user properties", new oO00o000(this, atomicReference, str, str2, z));
        List<zzlk> list = (List) atomicReference.get();
        if (list == null) {
            zzgdVar.zzaA().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        OooOO0 oooOO1 = new OooOO0(list.size());
        for (zzlk zzlkVar : list) {
            Object objZza = zzlkVar.zza();
            if (objZza != null) {
                oooOO1.put(zzlkVar.zzb, objZza);
            }
        }
        return oooOO1;
    }

    @WorkerThread
    public final void zzz() {
        zzg();
        zza();
        zzgd zzgdVar = this.f41276OooO00o;
        if (zzgdVar.OooO00o()) {
            if (zzgdVar.zzf().zzs(null, zzeg.zzZ)) {
                zzag zzagVarZzf = zzgdVar.zzf();
                zzagVarZzf.f41276OooO00o.zzay();
                Boolean boolOooO0OO = zzagVarZzf.OooO0OO("google_analytics_deferred_deep_link_enabled");
                if (boolOooO0OO != null && boolOooO0OO.booleanValue()) {
                    zzgdVar.zzaA().zzc().zza("Deferred Deep Link feature enabled.");
                    zzgdVar.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzik zzikVar = this.zza;
                            zzikVar.zzg();
                            zzgd zzgdVar2 = zzikVar.f41276OooO00o;
                            if (zzgdVar2.zzm().f41222OooOOo.zzb()) {
                                zzgdVar2.zzaA().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jZza = zzgdVar2.zzm().f41224OooOOoo.zza();
                            zzgdVar2.zzm().f41224OooOOoo.zzb(1 + jZza);
                            zzgdVar2.zzf();
                            if (jZza < 5) {
                                zzgdVar2.zzE();
                            } else {
                                zzgdVar2.zzaA().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzgdVar2.zzm().f41222OooOOo.zza(true);
                            }
                        }
                    });
                }
            }
            zzjz zzjzVarZzt = zzgdVar.zzt();
            zzjzVarZzt.zzg();
            zzjzVarZzt.zza();
            zzq zzqVarOooO0oO = zzjzVarZzt.OooO0oO(true);
            zzjzVarZzt.f41276OooO00o.zzi().zzk();
            zzjzVarZzt.OooOO0(new oO0OO0O(zzjzVarZzt, zzqVarOooO0oO));
            this.f16047OooOOO0 = false;
            o0OOO0 o0ooo0Zzm = zzgdVar.zzm();
            o0ooo0Zzm.zzg();
            String string = o0ooo0Zzm.OooO0Oo().getString("previous_os_version", null);
            o0ooo0Zzm.f41276OooO00o.zzg().OooO0OO();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = o0ooo0Zzm.OooO0Oo().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzgdVar.zzg().OooO0OO();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            OooO0OO(bundle, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou");
        }
    }
}
