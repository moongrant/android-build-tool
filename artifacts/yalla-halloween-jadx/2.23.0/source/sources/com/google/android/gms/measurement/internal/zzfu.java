package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzgr;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import p188o00o0O.OooOO0;
import p269o00ooooo.o0O0o0;
import p269o00ooooo.o0O0o000;
import p269o00ooooo.o0OOOO00;
import p269o00ooooo.o0OOOO0o;
import p269o00ooooo.o0OOo000;
import p269o00ooooo.oO0O0OoO;
import p269o00ooooo.oOOO0O0o;
import p269o00ooooo.oo0OOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfu extends oOOO0O0o implements oo0OOoo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOO0 f15967OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0 f15968OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    public final OooOO0 f15969OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @VisibleForTesting
    public final OooOO0 f15970OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @VisibleForTesting
    public final OooOO0 f15971OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0 f15972OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @VisibleForTesting
    public final o0OOOO00 f15973OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0OOOO0o f15974OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOO0 f15975OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooOO0 f15976OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooOO0 f15977OooOOO0;

    public zzfu(zzlh zzlhVar) {
        super(zzlhVar);
        this.f15968OooO0Oo = new OooOO0();
        this.f15970OooO0o0 = new OooOO0();
        this.f15969OooO0o = new OooOO0();
        this.f15971OooO0oO = new OooOO0();
        this.f15972OooO0oo = new OooOO0();
        this.f15975OooOO0o = new OooOO0();
        this.f15977OooOOO0 = new OooOO0();
        this.f15976OooOOO = new OooOO0();
        this.f15967OooO = new OooOO0();
        this.f15973OooOO0 = new o0OOOO00(this);
        this.f15974OooOO0O = new o0OOOO0o(this);
    }

    public static final OooOO0 OooO0oO(com.google.android.gms.internal.measurement.zzff zzffVar) {
        OooOO0 oooOO1 = new OooOO0();
        if (zzffVar != null) {
            for (zzfj zzfjVar : zzffVar.zzp()) {
                oooOO1.put(zzfjVar.zzb(), zzfjVar.zzc());
            }
        }
        return oooOO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final com.google.android.gms.internal.measurement.zzff OooO(String str) {
        OooO00o();
        zzg();
        Preconditions.checkNotEmpty(str);
        OooO0o0(str);
        return (com.google.android.gms.internal.measurement.zzff) this.f15972OooO0oo.getOrDefault(str, null);
    }

    @Override // p269o00ooooo.oOOO0O0o
    public final void OooO0O0() {
    }

    @WorkerThread
    public final com.google.android.gms.internal.measurement.zzff OooO0OO(String str, byte[] bArr) {
        zzgd zzgdVar = this.f41276OooO00o;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzlj.OooOOoo(com.google.android.gms.internal.measurement.zzff.zze(), bArr)).zzaD();
            zzgdVar.zzaA().zzj().zzc("Parsed config. version, gmp_app_id", zzffVar.zzu() ? Long.valueOf(zzffVar.zzc()) : null, zzffVar.zzt() ? zzffVar.zzh() : null);
            return zzffVar;
        } catch (com.google.android.gms.internal.measurement.zzll e) {
            zzgdVar.zzaA().zzk().zzc("Unable to merge remote config. appId", zzet.OooO0Oo(str), e);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        } catch (RuntimeException e2) {
            zzgdVar.zzaA().zzk().zzc("Unable to merge remote config. appId", zzet.OooO0Oo(str), e2);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
    }

    public final void OooO0Oo(String str, com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        HashSet hashSet = new HashSet();
        OooOO0 oooOO1 = new OooOO0();
        OooOO0 oooOO2 = new OooOO0();
        OooOO0 oooOO3 = new OooOO0();
        Iterator it = zzfeVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((zzfb) it.next()).zzb());
        }
        for (int i = 0; i < zzfeVar.zza(); i++) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) zzfeVar.zzb(i).zzbB();
            boolean zIsEmpty = zzfcVar.zzc().isEmpty();
            zzgd zzgdVar = this.f41276OooO00o;
            if (zIsEmpty) {
                zzgdVar.zzaA().zzk().zza("EventConfig contained null event name");
            } else {
                String strZzc = zzfcVar.zzc();
                String strZzb = zzhc.zzb(zzfcVar.zzc());
                if (!TextUtils.isEmpty(strZzb)) {
                    zzfcVar.zzb(strZzb);
                    zzfeVar.zzd(i, zzfcVar);
                }
                if (zzfcVar.zzf() && zzfcVar.zzd()) {
                    oooOO1.put(strZzc, Boolean.TRUE);
                }
                if (zzfcVar.zzg() && zzfcVar.zze()) {
                    oooOO2.put(zzfcVar.zzc(), Boolean.TRUE);
                }
                if (zzfcVar.zzh()) {
                    if (zzfcVar.zza() < 2 || zzfcVar.zza() > 65535) {
                        zzgdVar.zzaA().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    } else {
                        oooOO3.put(zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    }
                }
            }
        }
        this.f15970OooO0o0.put(str, hashSet);
        this.f15969OooO0o.put(str, oooOO1);
        this.f15971OooO0oO.put(str, oooOO2);
        this.f15967OooO.put(str, oooOO3);
    }

    @WorkerThread
    public final void OooO0o(final String str, com.google.android.gms.internal.measurement.zzff zzffVar) {
        int iZza = zzffVar.zza();
        o0OOOO00 o0oooo01 = this.f15973OooOO0;
        if (iZza == 0) {
            o0oooo01.remove(str);
            return;
        }
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzaA().zzj().zzb("EES programs found", Integer.valueOf(zzffVar.zza()));
        zzgt zzgtVar = (zzgt) zzffVar.zzo().get(0);
        try {
            zzc zzcVar = new zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzn("internal.remoteConfig", new o0OOo000(this.zza, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzfu zzfuVar = this.zza;
                    final String str2 = str;
                    return new zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfn
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzfu zzfuVar2 = zzfuVar;
                            String str3 = str2;
                            oO0O0OoO oo0o0oooOooOOoo = zzfuVar2.f41477OooO0O0.zzh().OooOOoo(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            zzfuVar2.f41276OooO00o.zzf().zzh();
                            map.put("gmp_version", 79000L);
                            if (oo0o0oooOooOOoo != null) {
                                String strOooOoO0 = oo0o0oooOooOOoo.OooOoO0();
                                if (strOooOoO0 != null) {
                                    map.put("app_version", strOooOoO0);
                                }
                                map.put("app_version_int", Long.valueOf(oo0o0oooOooOOoo.OooOo00()));
                                oo0o0oooOooOOoo.f41349OooO00o.zzaB().zzg();
                                map.put("dynamite_version", Long.valueOf(oo0o0oooOooOOoo.f41366OooOOoo));
                            }
                            return map;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(this.zza.f15974OooOO0O);
                }
            });
            zzcVar.zzc(zzgtVar);
            o0oooo01.put(str, zzcVar);
            zzgdVar.zzaA().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgtVar.zza().zza()));
            Iterator it = zzgtVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzgdVar.zzaA().zzj().zzb("EES program activity", ((zzgr) it.next()).zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            zzgdVar.zzaA().zzd().zzb("Failed to load EES program. appId", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0113: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:276), block:B:33:0x0113 */
    @WorkerThread
    public final void OooO0o0(String str) {
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursor2;
        o0O0o000 o0o0o000;
        OooOO0 oooOO1;
        OooOO0 oooOO2;
        OooOO0 oooOO3;
        OooOO0 oooOO4;
        OooO00o();
        zzg();
        Preconditions.checkNotEmpty(str);
        OooOO0 oooOO5 = this.f15972OooO0oo;
        if (oooOO5.getOrDefault(str, null) == 0) {
            o0O0o0 o0o0o0Zzh = this.f41477OooO0O0.zzh();
            Preconditions.checkNotEmpty(str);
            o0o0o0Zzh.zzg();
            zzgd zzgdVar = o0o0o0Zzh.f41276OooO00o;
            o0o0o0Zzh.OooO00o();
            try {
                try {
                    cursorQuery = o0o0o0Zzh.OooOOo().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            String string2 = cursorQuery.getString(2);
                            if (cursorQuery.moveToNext()) {
                                zzgdVar.zzaA().zzd().zzb("Got multiple records for app config, expected one. appId", zzet.OooO0Oo(str));
                            }
                            if (blob != null) {
                                o0o0o000 = new o0O0o000(string, string2, blob);
                                cursorQuery.close();
                            }
                            oooOO1 = this.f15976OooOOO;
                            oooOO2 = this.f15977OooOOO0;
                            oooOO3 = this.f15975OooOO0o;
                            oooOO4 = this.f15968OooO0Oo;
                            if (o0o0o000 != null) {
                                com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) OooO0OO(str, o0o0o000.f41173OooO00o).zzbB();
                                OooO0Oo(str, zzfeVar);
                                oooOO4.put(str, OooO0oO((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD()));
                                oooOO5.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
                                OooO0o(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
                                oooOO3.put(str, zzfeVar.zze());
                                oooOO2.put(str, o0o0o000.f41174OooO0O0);
                                oooOO1.put(str, o0o0o000.f41175OooO0OO);
                                return;
                            }
                            oooOO4.put(str, null);
                            this.f15969OooO0o.put(str, null);
                            this.f15970OooO0o0.put(str, null);
                            this.f15971OooO0oO.put(str, null);
                            oooOO5.put(str, null);
                            oooOO3.put(str, null);
                            oooOO2.put(str, null);
                            oooOO1.put(str, null);
                            this.f15967OooO.put(str, null);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        zzgdVar.zzaA().zzd().zzc("Error querying remote config. appId", zzet.OooO0Oo(str), e);
                        if (cursorQuery != null) {
                        }
                        o0o0o000 = null;
                        oooOO1 = this.f15976OooOOO;
                        oooOO2 = this.f15977OooOOO0;
                        oooOO3 = this.f15975OooOO0o;
                        oooOO4 = this.f15968OooO0Oo;
                        if (o0o0o000 != null) {
                            com.google.android.gms.internal.measurement.zzfe zzfeVar2 = (com.google.android.gms.internal.measurement.zzfe) OooO0OO(str, o0o0o000.f41173OooO00o).zzbB();
                            OooO0Oo(str, zzfeVar2);
                            oooOO4.put(str, OooO0oO((com.google.android.gms.internal.measurement.zzff) zzfeVar2.zzaD()));
                            oooOO5.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar2.zzaD());
                            OooO0o(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar2.zzaD());
                            oooOO3.put(str, zzfeVar2.zze());
                            oooOO2.put(str, o0o0o000.f41174OooO0O0);
                            oooOO1.put(str, o0o0o000.f41175OooO0OO);
                            return;
                        }
                        oooOO4.put(str, null);
                        this.f15969OooO0o.put(str, null);
                        this.f15970OooO0o0.put(str, null);
                        this.f15971OooO0oO.put(str, null);
                        oooOO5.put(str, null);
                        oooOO3.put(str, null);
                        oooOO2.put(str, null);
                        oooOO1.put(str, null);
                        this.f15967OooO.put(str, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            cursorQuery.close();
            o0o0o000 = null;
            oooOO1 = this.f15976OooOOO;
            oooOO2 = this.f15977OooOOO0;
            oooOO3 = this.f15975OooOO0o;
            oooOO4 = this.f15968OooO0Oo;
            if (o0o0o000 != null) {
                com.google.android.gms.internal.measurement.zzfe zzfeVar3 = (com.google.android.gms.internal.measurement.zzfe) OooO0OO(str, o0o0o000.f41173OooO00o).zzbB();
                OooO0Oo(str, zzfeVar3);
                oooOO4.put(str, OooO0oO((com.google.android.gms.internal.measurement.zzff) zzfeVar3.zzaD()));
                oooOO5.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar3.zzaD());
                OooO0o(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar3.zzaD());
                oooOO3.put(str, zzfeVar3.zze());
                oooOO2.put(str, o0o0o000.f41174OooO0O0);
                oooOO1.put(str, o0o0o000.f41175OooO0OO);
                return;
            }
            oooOO4.put(str, null);
            this.f15969OooO0o.put(str, null);
            this.f15970OooO0o0.put(str, null);
            this.f15971OooO0oO.put(str, null);
            oooOO5.put(str, null);
            oooOO3.put(str, null);
            oooOO2.put(str, null);
            oooOO1.put(str, null);
            this.f15967OooO.put(str, null);
        }
    }

    @WorkerThread
    public final int OooO0oo(String str, String str2) {
        Integer num;
        zzg();
        OooO0o0(str);
        Map map = (Map) this.f15967OooO.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @WorkerThread
    public final boolean OooOO0(String str, String str2) {
        Boolean bool;
        zzg();
        OooO0o0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f15971OooO0oO.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public final boolean OooOO0O(String str, String str2) {
        Boolean bool;
        zzg();
        OooO0o0(str);
        if ("1".equals(zza(str, "measurement.upload.blacklist_internal")) && zzlp.OooOoOO(str2)) {
            return true;
        }
        if ("1".equals(zza(str, "measurement.upload.blacklist_public")) && zzlp.OooOoo0(str2)) {
            return true;
        }
        Map map = (Map) this.f15969OooO0o.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public final void OooOO0o(String str, String str2, byte[] bArr, String str3) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        zzgd zzgdVar;
        byte[] bArrZzbx;
        String str4;
        com.google.android.gms.internal.measurement.zzfe zzfeVar;
        boolean z;
        OooO00o();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfe zzfeVar2 = (com.google.android.gms.internal.measurement.zzfe) OooO0OO(str, bArr).zzbB();
        OooO0Oo(str, zzfeVar2);
        OooO0o(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar2.zzaD());
        OooOO0 oooOO1 = this.f15972OooO0oo;
        oooOO1.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar2.zzaD());
        this.f15975OooOO0o.put(str, zzfeVar2.zze());
        this.f15977OooOOO0.put(str, str2);
        this.f15976OooOOO.put(str, str3);
        this.f15968OooO0Oo.put(str, OooO0oO((com.google.android.gms.internal.measurement.zzff) zzfeVar2.zzaD()));
        zzlh zzlhVar = this.f41477OooO0O0;
        o0O0o0 o0o0o0Zzh = zzlhVar.zzh();
        ArrayList<com.google.android.gms.internal.measurement.zzei> arrayList = new ArrayList(zzfeVar2.zzf());
        o0o0o0Zzh.getClass();
        String str5 = "app_id=? and audience_id=?";
        Preconditions.checkNotNull(arrayList);
        int i = 0;
        while (i < arrayList.size()) {
            com.google.android.gms.internal.measurement.zzeh zzehVar = (com.google.android.gms.internal.measurement.zzeh) ((com.google.android.gms.internal.measurement.zzei) arrayList.get(i)).zzbB();
            if (zzehVar.zza() != 0) {
                int i2 = 0;
                while (i2 < zzehVar.zza()) {
                    com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) zzehVar.zze(i2).zzbB();
                    com.google.android.gms.internal.measurement.zzej zzejVar2 = (com.google.android.gms.internal.measurement.zzej) zzejVar.clone();
                    String strZzb = zzhc.zzb(zzejVar.zze());
                    if (strZzb != null) {
                        zzejVar2.zzb(strZzb);
                        z = true;
                    } else {
                        z = false;
                    }
                    zzlh zzlhVar2 = zzlhVar;
                    int i3 = 0;
                    while (i3 < zzejVar.zza()) {
                        com.google.android.gms.internal.measurement.zzem zzemVarZzd = zzejVar.zzd(i3);
                        com.google.android.gms.internal.measurement.zzej zzejVar3 = zzejVar;
                        com.google.android.gms.internal.measurement.zzfe zzfeVar3 = zzfeVar2;
                        String str6 = str5;
                        String strZzb2 = zziq.zzb(zzemVarZzd.zze(), zzhd.zza, zzhd.zzb);
                        if (strZzb2 != null) {
                            zzel zzelVar = (zzel) zzemVarZzd.zzbB();
                            zzelVar.zza(strZzb2);
                            zzejVar2.zzc(i3, (com.google.android.gms.internal.measurement.zzem) zzelVar.zzaD());
                            z = true;
                        }
                        i3++;
                        zzejVar = zzejVar3;
                        zzfeVar2 = zzfeVar3;
                        str5 = str6;
                    }
                    com.google.android.gms.internal.measurement.zzfe zzfeVar4 = zzfeVar2;
                    String str7 = str5;
                    if (z) {
                        zzehVar.zzc(i2, zzejVar2);
                        arrayList.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaD());
                    }
                    i2++;
                    zzlhVar = zzlhVar2;
                    zzfeVar2 = zzfeVar4;
                    str5 = str7;
                }
                zzfeVar = zzfeVar2;
            } else {
                zzfeVar = zzfeVar2;
            }
            zzlh zzlhVar3 = zzlhVar;
            String str8 = str5;
            if (zzehVar.zzb() != 0) {
                for (int i4 = 0; i4 < zzehVar.zzb(); i4++) {
                    com.google.android.gms.internal.measurement.zzet zzetVarZzf = zzehVar.zzf(i4);
                    String strZzb3 = zziq.zzb(zzetVarZzf.zze(), zzhe.zza, zzhe.zzb);
                    if (strZzb3 != null) {
                        zzes zzesVar = (zzes) zzetVarZzf.zzbB();
                        zzesVar.zza(strZzb3);
                        zzehVar.zzd(i4, zzesVar);
                        arrayList.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaD());
                    }
                }
            }
            i++;
            oooOO1 = oooOO1;
            zzlhVar = zzlhVar3;
            zzfeVar2 = zzfeVar;
            str5 = str8;
        }
        com.google.android.gms.internal.measurement.zzfe zzfeVar5 = zzfeVar2;
        OooOO0 oooOO2 = oooOO1;
        zzlh zzlhVar4 = zzlhVar;
        String str9 = str5;
        o0o0o0Zzh.OooO00o();
        o0o0o0Zzh.zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(arrayList);
        SQLiteDatabase sQLiteDatabaseOooOOo = o0o0o0Zzh.OooOOo();
        sQLiteDatabaseOooOOo.beginTransaction();
        try {
            o0o0o0Zzh.OooO00o();
            o0o0o0Zzh.zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseOooOOo2 = o0o0o0Zzh.OooOOo();
            sQLiteDatabaseOooOOo2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseOooOOo2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                zzgdVar = o0o0o0Zzh.f41276OooO00o;
                if (!zHasNext) {
                    break;
                }
                com.google.android.gms.internal.measurement.zzei zzeiVar = (com.google.android.gms.internal.measurement.zzei) it.next();
                o0o0o0Zzh.OooO00o();
                o0o0o0Zzh.zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzeiVar);
                if (zzeiVar.zzk()) {
                    int iZza = zzeiVar.zza();
                    Iterator it2 = zzeiVar.zzg().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzek) it2.next()).zzp()) {
                                zzgdVar.zzaA().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzet.OooO0Oo(str), Integer.valueOf(iZza));
                                break;
                            }
                        } else {
                            Iterator it3 = zzeiVar.zzh().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!((com.google.android.gms.internal.measurement.zzet) it3.next()).zzj()) {
                                        zzgdVar.zzaA().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", zzet.OooO0Oo(str), Integer.valueOf(iZza));
                                        break;
                                    }
                                } else {
                                    Iterator it4 = zzeiVar.zzg().iterator();
                                    while (true) {
                                        Iterator it5 = it;
                                        String str10 = "app_id";
                                        try {
                                            if (!it4.hasNext()) {
                                                sQLiteDatabase = sQLiteDatabaseOooOOo;
                                                Iterator it6 = zzeiVar.zzh().iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzet zzetVar = (com.google.android.gms.internal.measurement.zzet) it6.next();
                                                        o0o0o0Zzh.OooO00o();
                                                        o0o0o0Zzh.zzg();
                                                        Preconditions.checkNotEmpty(str);
                                                        Preconditions.checkNotNull(zzetVar);
                                                        if (zzetVar.zze().isEmpty()) {
                                                            zzgdVar.zzaA().zzk().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzet.OooO0Oo(str), Integer.valueOf(iZza), String.valueOf(zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null));
                                                        } else {
                                                            byte[] bArrZzbx2 = zzetVar.zzbx();
                                                            ContentValues contentValues = new ContentValues();
                                                            contentValues.put(str10, str);
                                                            Iterator it7 = it6;
                                                            contentValues.put("audience_id", Integer.valueOf(iZza));
                                                            contentValues.put("filter_id", zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null);
                                                            String str11 = str10;
                                                            contentValues.put("property_name", zzetVar.zze());
                                                            contentValues.put("session_scoped", zzetVar.zzk() ? Boolean.valueOf(zzetVar.zzi()) : null);
                                                            contentValues.put("data", bArrZzbx2);
                                                            try {
                                                                if (o0o0o0Zzh.OooOOo().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                    zzgdVar.zzaA().zzd().zzb("Failed to insert property filter (got -1). appId", zzet.OooO0Oo(str));
                                                                } else {
                                                                    it6 = it7;
                                                                    str10 = str11;
                                                                }
                                                            } catch (SQLiteException e) {
                                                                zzgdVar.zzaA().zzd().zzc("Error storing property filter. appId", zzet.OooO0Oo(str), e);
                                                            }
                                                        }
                                                    } else {
                                                        str4 = str9;
                                                    }
                                                    str9 = str4;
                                                    it = it5;
                                                    sQLiteDatabaseOooOOo = sQLiteDatabase;
                                                    break;
                                                }
                                            }
                                            com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                            o0o0o0Zzh.OooO00o();
                                            o0o0o0Zzh.zzg();
                                            Preconditions.checkNotEmpty(str);
                                            Preconditions.checkNotNull(zzekVar);
                                            if (!zzekVar.zzg().isEmpty()) {
                                                Iterator it8 = it4;
                                                byte[] bArrZzbx3 = zzekVar.zzbx();
                                                sQLiteDatabase = sQLiteDatabaseOooOOo;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iZza));
                                                contentValues2.put("filter_id", zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null);
                                                contentValues2.put("event_name", zzekVar.zzg());
                                                contentValues2.put("session_scoped", zzekVar.zzq() ? Boolean.valueOf(zzekVar.zzn()) : null);
                                                contentValues2.put("data", bArrZzbx3);
                                                try {
                                                    if (o0o0o0Zzh.OooOOo().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        zzgdVar.zzaA().zzd().zzb("Failed to insert event filter (got -1). appId", zzet.OooO0Oo(str));
                                                    }
                                                    it = it5;
                                                    it4 = it8;
                                                    sQLiteDatabaseOooOOo = sQLiteDatabase;
                                                } catch (SQLiteException e2) {
                                                    zzgdVar.zzaA().zzd().zzc("Error storing event filter. appId", zzet.OooO0Oo(str), e2);
                                                    o0o0o0Zzh.OooO00o();
                                                    o0o0o0Zzh.zzg();
                                                    Preconditions.checkNotEmpty(str);
                                                    SQLiteDatabase sQLiteDatabaseOooOOo3 = o0o0o0Zzh.OooOOo();
                                                    str4 = str9;
                                                    sQLiteDatabaseOooOOo3.delete("property_filters", str4, new String[]{str, String.valueOf(iZza)});
                                                    sQLiteDatabaseOooOOo3.delete("event_filters", str4, new String[]{str, String.valueOf(iZza)});
                                                    str9 = str4;
                                                    it = it5;
                                                    sQLiteDatabaseOooOOo = sQLiteDatabase;
                                                    break;
                                                }
                                            } else {
                                                zzgdVar.zzaA().zzk().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzet.OooO0Oo(str), Integer.valueOf(iZza), String.valueOf(zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null));
                                                sQLiteDatabase = sQLiteDatabaseOooOOo;
                                            }
                                            o0o0o0Zzh.OooO00o();
                                            o0o0o0Zzh.zzg();
                                            Preconditions.checkNotEmpty(str);
                                            SQLiteDatabase sQLiteDatabaseOooOOo4 = o0o0o0Zzh.OooOOo();
                                            str4 = str9;
                                            sQLiteDatabaseOooOOo4.delete("property_filters", str4, new String[]{str, String.valueOf(iZza)});
                                            sQLiteDatabaseOooOOo4.delete("event_filters", str4, new String[]{str, String.valueOf(iZza)});
                                            str9 = str4;
                                            it = it5;
                                            sQLiteDatabaseOooOOo = sQLiteDatabase;
                                            break;
                                            break;
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    zzgdVar.zzaA().zzk().zzb("Audience with no ID. appId", zzet.OooO0Oo(str));
                }
                th = th;
                sQLiteDatabase.endTransaction();
                throw th;
            }
            sQLiteDatabase = sQLiteDatabaseOooOOo;
            ArrayList arrayList2 = new ArrayList();
            for (com.google.android.gms.internal.measurement.zzei zzeiVar2 : arrayList) {
                arrayList2.add(zzeiVar2.zzk() ? Integer.valueOf(zzeiVar2.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            o0o0o0Zzh.OooO00o();
            o0o0o0Zzh.zzg();
            SQLiteDatabase sQLiteDatabaseOooOOo5 = o0o0o0Zzh.OooOOo();
            try {
                long jOooOOO0 = o0o0o0Zzh.OooOOO0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, zzgdVar.zzf().zze(str, zzeg.zzF)));
                if (jOooOOO0 > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            sQLiteDatabaseOooOOo5.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList3) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (SQLiteException e3) {
                zzgdVar.zzaA().zzd().zzc("Database error querying filters. appId", zzet.OooO0Oo(str), e3);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                zzfeVar5.zzc();
                bArrZzbx = ((com.google.android.gms.internal.measurement.zzff) zzfeVar5.zzaD()).zzbx();
            } catch (RuntimeException e4) {
                this.f41276OooO00o.zzaA().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzet.OooO0Oo(str), e4);
                bArrZzbx = bArr;
            }
            o0O0o0 o0o0o0Zzh2 = zzlhVar4.zzh();
            Preconditions.checkNotEmpty(str);
            o0o0o0Zzh2.zzg();
            zzgd zzgdVar2 = o0o0o0Zzh2.f41276OooO00o;
            o0o0o0Zzh2.OooO00o();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrZzbx);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (o0o0o0Zzh2.OooOOo().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    zzgdVar2.zzaA().zzd().zzb("Failed to update remote config (got 0). appId", zzet.OooO0Oo(str));
                }
            } catch (SQLiteException e5) {
                zzgdVar2.zzaA().zzd().zzc("Error storing remote config. appId", zzet.OooO0Oo(str), e5);
            }
            oooOO2.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar5.zzaD());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseOooOOo;
        }
    }

    @Override // p269o00ooooo.oo0OOoo
    @WorkerThread
    public final String zza(String str, String str2) {
        zzg();
        OooO0o0(str);
        Map map = (Map) this.f15968OooO0Oo.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzo(String str) {
        com.google.android.gms.internal.measurement.zzff zzffVar;
        return (TextUtils.isEmpty(str) || (zzffVar = (com.google.android.gms.internal.measurement.zzff) this.f15972OooO0oo.getOrDefault(str, null)) == null || zzffVar.zza() == 0) ? false : true;
    }
}
