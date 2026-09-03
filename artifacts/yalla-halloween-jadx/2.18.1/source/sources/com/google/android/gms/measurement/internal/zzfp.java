package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzeg;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzgs;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzu;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import o0OO0OoO.OooO;
import o0OO0OoO.OooO00o;
import o0OO0OoO.OooO0o;
import o0OO0OoO.OooOO0O;
import o0OO0OoO.o00000;
import o0OO0OoO.o000000;
import o0OO0OoO.o000000O;
import o0OO0OoO.o000O;
import o0OO0OoO.oo0OOoo;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfp extends oo0OOoo implements OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Oooo0 f16171OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Oooo0 f16172OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    public final Oooo0 f16173OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @VisibleForTesting
    public final Oooo0 f16174OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @VisibleForTesting
    public final Oooo0 f16175OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Oooo0 f16176OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @VisibleForTesting
    public final o000000 f16177OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o000000O f16178OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Oooo0 f16179OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Oooo0 f16180OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Oooo0 f16181OooOOO0;

    public zzfp(zzkz zzkzVar) {
        super(zzkzVar);
        this.f16172OooO0Oo = new Oooo0();
        this.f16174OooO0o0 = new Oooo0();
        this.f16173OooO0o = new Oooo0();
        this.f16175OooO0oO = new Oooo0();
        this.f16176OooO0oo = new Oooo0();
        this.f16179OooOO0o = new Oooo0();
        this.f16181OooOOO0 = new Oooo0();
        this.f16180OooOOO = new Oooo0();
        this.f16171OooO = new Oooo0();
        this.f16177OooOO0 = new o000000(this);
        this.f16178OooOO0O = new o000000O(this);
    }

    public static final Map OooO0oO(zzfe zzfeVar) {
        Oooo0 oooo0 = new Oooo0();
        if (zzfeVar != null) {
            for (com.google.android.gms.internal.measurement.zzfi zzfiVar : zzfeVar.zzn()) {
                oooo0.put(zzfiVar.zzb(), zzfiVar.zzc());
            }
        }
        return oooo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final zzfe OooO(String str) {
        OooO00o();
        zzg();
        Preconditions.checkNotEmpty(str);
        OooO0o0(str);
        return (zzfe) this.f16176OooO0oo.getOrDefault(str, null);
    }

    @Override // o0OO0OoO.oo0OOoo
    public final void OooO0O0() {
    }

    @WorkerThread
    public final zzfe OooO0OO(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfe.zzg();
        }
        try {
            zzfe zzfeVar = (zzfe) ((zzfd) zzlb.OooOOoo(zzfe.zze(), bArr)).zzaE();
            this.f37615OooO00o.zzay().zzj().zzc("Parsed config. version, gmp_app_id", zzfeVar.zzs() ? Long.valueOf(zzfeVar.zzc()) : null, zzfeVar.zzr() ? zzfeVar.zzh() : null);
            return zzfeVar;
        } catch (com.google.android.gms.internal.measurement.zzko e) {
            this.f37615OooO00o.zzay().zzk().zzc("Unable to merge remote config. appId", zzeo.OooO0o0(str), e);
            return zzfe.zzg();
        } catch (RuntimeException e2) {
            this.f37615OooO00o.zzay().zzk().zzc("Unable to merge remote config. appId", zzeo.OooO0o0(str), e2);
            return zzfe.zzg();
        }
    }

    public final void OooO0Oo(String str, zzfd zzfdVar) {
        HashSet hashSet = new HashSet();
        Oooo0 oooo0 = new Oooo0();
        Oooo0 oooo1 = new Oooo0();
        Oooo0 oooo2 = new Oooo0();
        if (zzfdVar != null) {
            zzow.zzc();
            if (this.f37615OooO00o.zzf().zzs(null, zzeb.zzal)) {
                Iterator it = zzfdVar.zzg().iterator();
                while (it.hasNext()) {
                    hashSet.add(((com.google.android.gms.internal.measurement.zzfa) it.next()).zzb());
                }
            }
            for (int i = 0; i < zzfdVar.zza(); i++) {
                com.google.android.gms.internal.measurement.zzfb zzfbVar = (com.google.android.gms.internal.measurement.zzfb) zzfdVar.zzb(i).zzby();
                if (zzfbVar.zzc().isEmpty()) {
                    OooO00o.OooO0O0(this.f37615OooO00o, "EventConfig contained null event name");
                } else {
                    String strZzc = zzfbVar.zzc();
                    String strZzb = zzgv.zzb(zzfbVar.zzc());
                    if (!TextUtils.isEmpty(strZzb)) {
                        zzfbVar.zzb(strZzb);
                        zzfdVar.zzd(i, zzfbVar);
                    }
                    if (zzfbVar.zzf() && zzfbVar.zzd()) {
                        oooo0.put(strZzc, Boolean.TRUE);
                    }
                    if (zzfbVar.zzg() && zzfbVar.zze()) {
                        oooo1.put(zzfbVar.zzc(), Boolean.TRUE);
                    }
                    if (zzfbVar.zzh()) {
                        if (zzfbVar.zza() < 2 || zzfbVar.zza() > 65535) {
                            this.f37615OooO00o.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        } else {
                            oooo2.put(zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        }
                    }
                }
            }
        }
        this.f16174OooO0o0.put(str, hashSet);
        this.f16173OooO0o.put(str, oooo0);
        this.f16175OooO0oO.put(str, oooo1);
        this.f16171OooO.put(str, oooo2);
    }

    @WorkerThread
    public final void OooO0o(final String str, zzfe zzfeVar) {
        if (zzfeVar.zza() == 0) {
            this.f16177OooOO0.remove(str);
            return;
        }
        this.f37615OooO00o.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzfeVar.zza()));
        zzgs zzgsVar = (zzgs) zzfeVar.zzm().get(0);
        try {
            zzc zzcVar = new zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzn("internal.remoteConfig", new o00000(this.zza, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzfp zzfpVar = this.zza;
                    final String str2 = str;
                    return new zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfi
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzfp zzfpVar2 = zzfpVar;
                            String str3 = str2;
                            o000O o000oOooOo00 = zzfpVar2.f37794OooO0O0.zzi().OooOo00(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put(ak.f20239o, str3);
                            zzfpVar2.f37615OooO00o.zzf().zzh();
                            map.put("gmp_version", 73000L);
                            if (o000oOooOo00 != null) {
                                String strOooo0oo = o000oOooOo00.Oooo0oo();
                                if (strOooo0oo != null) {
                                    map.put("app_version", strOooo0oo);
                                }
                                map.put("app_version_int", Long.valueOf(o000oOooOo00.OooOoOO()));
                                map.put("dynamite_version", Long.valueOf(o000oOooOo00.OooOooO()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(this.zza.f16178OooOO0O);
                }
            });
            zzcVar.zzc(zzgsVar);
            this.f16177OooOO0.put(str, zzcVar);
            this.f37615OooO00o.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgsVar.zza().zza()));
            Iterator it = zzgsVar.zza().zzd().iterator();
            while (it.hasNext()) {
                this.f37615OooO00o.zzay().zzj().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zzgq) it.next()).zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.f37615OooO00o.zzay().zzd().zzb("Failed to load EES program. appId", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX WARN: Code duplicated, block: B:38:0x0128  */
    @WorkerThread
    public final void OooO0o0(String str) {
        SQLiteException e;
        Cursor cursorQuery;
        OooO oooO;
        OooO00o();
        zzg();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        if (this.f16176OooO0oo.getOrDefault(str, null) == 0) {
            OooOO0O oooOO0OZzi = this.f37794OooO0O0.zzi();
            Preconditions.checkNotEmpty(str);
            oooOO0OZzi.zzg();
            oooOO0OZzi.OooO00o();
            try {
                cursorQuery = oooOO0OZzi.OooOOo().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            String string2 = oooOO0OZzi.f37615OooO00o.zzf().zzs(null, zzeb.zzaw) ? cursorQuery.getString(2) : null;
                            if (cursorQuery.moveToNext()) {
                                oooOO0OZzi.f37615OooO00o.zzay().zzd().zzb("Got multiple records for app config, expected one. appId", zzeo.OooO0o0(str));
                            }
                            if (blob != null) {
                                oooO = new OooO(blob, string, string2);
                                cursorQuery.close();
                            }
                            if (oooO != null) {
                                zzfd zzfdVar = (zzfd) OooO0OO(str, oooO.f37473OooO00o).zzby();
                                OooO0Oo(str, zzfdVar);
                                this.f16172OooO0Oo.put(str, OooO0oO((zzfe) zzfdVar.zzaE()));
                                this.f16176OooO0oo.put(str, (zzfe) zzfdVar.zzaE());
                                OooO0o(str, (zzfe) zzfdVar.zzaE());
                                this.f16179OooOO0o.put(str, zzfdVar.zze());
                                this.f16181OooOOO0.put(str, oooO.f37474OooO0O0);
                                this.f16180OooOOO.put(str, oooO.f37475OooO0OO);
                                return;
                            }
                            this.f16172OooO0Oo.put(str, null);
                            this.f16173OooO0o.put(str, null);
                            this.f16174OooO0o0.put(str, null);
                            this.f16175OooO0oO.put(str, null);
                            this.f16176OooO0oo.put(str, null);
                            this.f16179OooOO0o.put(str, null);
                            this.f16181OooOOO0.put(str, null);
                            this.f16180OooOOO.put(str, null);
                            this.f16171OooO.put(str, null);
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        oooOO0OZzi.f37615OooO00o.zzay().zzd().zzc("Error querying remote config. appId", zzeo.OooO0o0(str), e);
                        if (cursorQuery != null) {
                        }
                        oooO = null;
                        if (oooO != null) {
                            zzfd zzfdVar2 = (zzfd) OooO0OO(str, oooO.f37473OooO00o).zzby();
                            OooO0Oo(str, zzfdVar2);
                            this.f16172OooO0Oo.put(str, OooO0oO((zzfe) zzfdVar2.zzaE()));
                            this.f16176OooO0oo.put(str, (zzfe) zzfdVar2.zzaE());
                            OooO0o(str, (zzfe) zzfdVar2.zzaE());
                            this.f16179OooOO0o.put(str, zzfdVar2.zze());
                            this.f16181OooOOO0.put(str, oooO.f37474OooO0O0);
                            this.f16180OooOOO.put(str, oooO.f37475OooO0OO);
                            return;
                        }
                        this.f16172OooO0Oo.put(str, null);
                        this.f16173OooO0o.put(str, null);
                        this.f16174OooO0o0.put(str, null);
                        this.f16175OooO0oO.put(str, null);
                        this.f16176OooO0oo.put(str, null);
                        this.f16179OooOO0o.put(str, null);
                        this.f16181OooOOO0.put(str, null);
                        this.f16180OooOOO.put(str, null);
                        this.f16171OooO.put(str, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            cursorQuery.close();
            oooO = null;
            if (oooO != null) {
                zzfd zzfdVar3 = (zzfd) OooO0OO(str, oooO.f37473OooO00o).zzby();
                OooO0Oo(str, zzfdVar3);
                this.f16172OooO0Oo.put(str, OooO0oO((zzfe) zzfdVar3.zzaE()));
                this.f16176OooO0oo.put(str, (zzfe) zzfdVar3.zzaE());
                OooO0o(str, (zzfe) zzfdVar3.zzaE());
                this.f16179OooOO0o.put(str, zzfdVar3.zze());
                this.f16181OooOOO0.put(str, oooO.f37474OooO0O0);
                this.f16180OooOOO.put(str, oooO.f37475OooO0OO);
                return;
            }
            this.f16172OooO0Oo.put(str, null);
            this.f16173OooO0o.put(str, null);
            this.f16174OooO0o0.put(str, null);
            this.f16175OooO0oO.put(str, null);
            this.f16176OooO0oo.put(str, null);
            this.f16179OooOO0o.put(str, null);
            this.f16181OooOOO0.put(str, null);
            this.f16180OooOOO.put(str, null);
            this.f16171OooO.put(str, null);
        }
    }

    @WorkerThread
    public final int OooO0oo(String str, String str2) {
        Integer num;
        zzg();
        OooO0o0(str);
        Map map = (Map) this.f16171OooO.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final String OooOO0(String str) {
        zzg();
        OooO0o0(str);
        return (String) this.f16179OooOO0o.getOrDefault(str, null);
    }

    @WorkerThread
    public final boolean OooOO0O(String str) {
        zzg();
        zzfe zzfeVarOooO = OooO(str);
        if (zzfeVarOooO == null) {
            return false;
        }
        return zzfeVarOooO.zzq();
    }

    public final boolean OooOO0o(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    @WorkerThread
    public final boolean OooOOO(String str, String str2) {
        Boolean bool;
        zzg();
        OooO0o0(str);
        if (OooOO0o(str) && zzlh.OooOoo0(str2)) {
            return true;
        }
        if (OooOOOO(str) && zzlh.OooOoo(str2)) {
            return true;
        }
        Map map = (Map) this.f16173OooO0o.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public final boolean OooOOO0(String str, String str2) {
        Boolean bool;
        zzg();
        OooO0o0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f16175OooO0oO.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean OooOOOO(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    @WorkerThread
    public final boolean OooOOOo(String str, byte[] bArr, String str2, String str3) {
        zzfp zzfpVar;
        byte[] bArrZzbv;
        Iterator it;
        String str4;
        zzfd zzfdVar;
        String str5;
        zzeg zzegVar;
        boolean z;
        OooO00o();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzfd zzfdVar2 = (zzfd) OooO0OO(str, bArr).zzby();
        int i = 0;
        if (zzfdVar2 == null) {
            return false;
        }
        OooO0Oo(str, zzfdVar2);
        OooO0o(str, (zzfe) zzfdVar2.zzaE());
        this.f16176OooO0oo.put(str, (zzfe) zzfdVar2.zzaE());
        this.f16179OooOO0o.put(str, zzfdVar2.zze());
        this.f16181OooOOO0.put(str, str2);
        this.f16180OooOOO.put(str, str3);
        this.f16172OooO0Oo.put(str, OooO0oO((zzfe) zzfdVar2.zzaE()));
        OooOO0O oooOO0OZzi = this.f37794OooO0O0.zzi();
        ArrayList<com.google.android.gms.internal.measurement.zzeh> arrayList = new ArrayList(zzfdVar2.zzf());
        Objects.requireNonNull(oooOO0OZzi);
        String str6 = "app_id=? and audience_id=?";
        Preconditions.checkNotNull(arrayList);
        int i2 = 0;
        while (i2 < arrayList.size()) {
            zzeg zzegVar2 = (zzeg) ((com.google.android.gms.internal.measurement.zzeh) arrayList.get(i2)).zzby();
            if (zzegVar2.zza() != 0) {
                zzegVar = zzegVar2;
                while (i < zzegVar.zza()) {
                    com.google.android.gms.internal.measurement.zzei zzeiVar = (com.google.android.gms.internal.measurement.zzei) zzegVar.zze(i).zzby();
                    com.google.android.gms.internal.measurement.zzei zzeiVar2 = (com.google.android.gms.internal.measurement.zzei) zzeiVar.clone();
                    String strZzb = zzgv.zzb(zzeiVar.zze());
                    if (strZzb != null) {
                        zzeiVar2.zzb(strZzb);
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = z;
                    int i3 = 0;
                    while (i3 < zzeiVar.zza()) {
                        zzel zzelVarZzd = zzeiVar.zzd(i3);
                        com.google.android.gms.internal.measurement.zzei zzeiVar3 = zzeiVar;
                        zzfd zzfdVar3 = zzfdVar2;
                        String str7 = str6;
                        String strZzb2 = zzij.zzb(zzelVarZzd.zze(), zzgw.zza, zzgw.zzb);
                        if (strZzb2 != null) {
                            com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) zzelVarZzd.zzby();
                            zzekVar.zza(strZzb2);
                            zzeiVar2.zzc(i3, (zzel) zzekVar.zzaE());
                            z2 = true;
                        }
                        i3++;
                        zzeiVar = zzeiVar3;
                        zzfdVar2 = zzfdVar3;
                        str6 = str7;
                    }
                    zzfd zzfdVar4 = zzfdVar2;
                    String str8 = str6;
                    if (z2) {
                        zzegVar.zzc(i, zzeiVar2);
                        arrayList.set(i2, (com.google.android.gms.internal.measurement.zzeh) zzegVar2.zzaE());
                        zzegVar = zzegVar2;
                    }
                    i++;
                    zzfdVar2 = zzfdVar4;
                    str6 = str8;
                }
                zzfdVar = zzfdVar2;
                str5 = str6;
            } else {
                zzfdVar = zzfdVar2;
                str5 = str6;
                zzegVar = zzegVar2;
            }
            if (zzegVar.zzb() != 0) {
                for (int i4 = 0; i4 < zzegVar.zzb(); i4++) {
                    zzes zzesVarZzf = zzegVar.zzf(i4);
                    String strZzb3 = zzij.zzb(zzesVarZzf.zze(), zzgx.zza, zzgx.zzb);
                    if (strZzb3 != null) {
                        com.google.android.gms.internal.measurement.zzer zzerVar = (com.google.android.gms.internal.measurement.zzer) zzesVarZzf.zzby();
                        zzerVar.zza(strZzb3);
                        zzegVar.zzd(i4, zzerVar);
                        arrayList.set(i2, (com.google.android.gms.internal.measurement.zzeh) zzegVar2.zzaE());
                        zzegVar = zzegVar2;
                    }
                }
            }
            i2++;
            zzfdVar2 = zzfdVar;
            str6 = str5;
            i = 0;
        }
        zzfd zzfdVar5 = zzfdVar2;
        String str9 = str6;
        oooOO0OZzi.OooO00o();
        oooOO0OZzi.zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(arrayList);
        SQLiteDatabase sQLiteDatabaseOooOOo = oooOO0OZzi.OooOOo();
        sQLiteDatabaseOooOOo.beginTransaction();
        try {
            oooOO0OZzi.OooO00o();
            oooOO0OZzi.zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseOooOOo2 = oooOO0OZzi.OooOOo();
            sQLiteDatabaseOooOOo2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseOooOOo2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.google.android.gms.internal.measurement.zzeh zzehVar = (com.google.android.gms.internal.measurement.zzeh) it2.next();
                oooOO0OZzi.OooO00o();
                oooOO0OZzi.zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzehVar);
                if (zzehVar.zzk()) {
                    int iZza = zzehVar.zza();
                    Iterator it3 = zzehVar.zzg().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzej) it3.next()).zzp()) {
                                oooOO0OZzi.f37615OooO00o.zzay().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzeo.OooO0o0(str), Integer.valueOf(iZza));
                                break;
                            }
                        } else {
                            Iterator it4 = zzehVar.zzh().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = zzehVar.zzg().iterator();
                                    while (true) {
                                        String str10 = "audience_id";
                                        it = it2;
                                        if (!it5.hasNext()) {
                                            Iterator it6 = zzehVar.zzh().iterator();
                                            while (true) {
                                                if (!it6.hasNext()) {
                                                    str4 = str9;
                                                    break;
                                                }
                                                zzes zzesVar = (zzes) it6.next();
                                                oooOO0OZzi.OooO00o();
                                                oooOO0OZzi.zzg();
                                                Preconditions.checkNotEmpty(str);
                                                Preconditions.checkNotNull(zzesVar);
                                                if (zzesVar.zze().isEmpty()) {
                                                    oooOO0OZzi.f37615OooO00o.zzay().zzk().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzeo.OooO0o0(str), Integer.valueOf(iZza), String.valueOf(zzesVar.zzj() ? Integer.valueOf(zzesVar.zza()) : null));
                                                } else {
                                                    byte[] bArrZzbv2 = zzesVar.zzbv();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put("app_id", str);
                                                    Iterator it7 = it6;
                                                    contentValues.put(str10, Integer.valueOf(iZza));
                                                    contentValues.put("filter_id", zzesVar.zzj() ? Integer.valueOf(zzesVar.zza()) : null);
                                                    String str11 = str10;
                                                    contentValues.put("property_name", zzesVar.zze());
                                                    contentValues.put("session_scoped", zzesVar.zzk() ? Boolean.valueOf(zzesVar.zzi()) : null);
                                                    contentValues.put("data", bArrZzbv2);
                                                    try {
                                                        if (oooOO0OZzi.OooOOo().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            oooOO0OZzi.f37615OooO00o.zzay().zzd().zzb("Failed to insert property filter (got -1). appId", zzeo.OooO0o0(str));
                                                        } else {
                                                            it6 = it7;
                                                            str10 = str11;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        oooOO0OZzi.f37615OooO00o.zzay().zzd().zzc("Error storing property filter. appId", zzeo.OooO0o0(str), e);
                                                    }
                                                }
                                            }
                                        } else {
                                            com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) it5.next();
                                            oooOO0OZzi.OooO00o();
                                            oooOO0OZzi.zzg();
                                            Preconditions.checkNotEmpty(str);
                                            Preconditions.checkNotNull(zzejVar);
                                            if (!zzejVar.zzg().isEmpty()) {
                                                byte[] bArrZzbv3 = zzejVar.zzbv();
                                                Iterator it8 = it5;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iZza));
                                                contentValues2.put("filter_id", zzejVar.zzp() ? Integer.valueOf(zzejVar.zzb()) : null);
                                                contentValues2.put("event_name", zzejVar.zzg());
                                                contentValues2.put("session_scoped", zzejVar.zzq() ? Boolean.valueOf(zzejVar.zzn()) : null);
                                                contentValues2.put("data", bArrZzbv3);
                                                try {
                                                    if (oooOO0OZzi.OooOOo().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        oooOO0OZzi.f37615OooO00o.zzay().zzd().zzb("Failed to insert event filter (got -1). appId", zzeo.OooO0o0(str));
                                                    }
                                                    it2 = it;
                                                    it5 = it8;
                                                } catch (SQLiteException e2) {
                                                    oooOO0OZzi.f37615OooO00o.zzay().zzd().zzc("Error storing event filter. appId", zzeo.OooO0o0(str), e2);
                                                    oooOO0OZzi.OooO00o();
                                                    oooOO0OZzi.zzg();
                                                    Preconditions.checkNotEmpty(str);
                                                    SQLiteDatabase sQLiteDatabaseOooOOo3 = oooOO0OZzi.OooOOo();
                                                    str4 = str9;
                                                    sQLiteDatabaseOooOOo3.delete("property_filters", str4, new String[]{str, String.valueOf(iZza)});
                                                    sQLiteDatabaseOooOOo3.delete("event_filters", str4, new String[]{str, String.valueOf(iZza)});
                                                    str9 = str4;
                                                    it2 = it;
                                                    break;
                                                }
                                            } else {
                                                oooOO0OZzi.f37615OooO00o.zzay().zzk().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzeo.OooO0o0(str), Integer.valueOf(iZza), String.valueOf(zzejVar.zzp() ? Integer.valueOf(zzejVar.zzb()) : null));
                                            }
                                        }
                                        oooOO0OZzi.OooO00o();
                                        oooOO0OZzi.zzg();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase sQLiteDatabaseOooOOo4 = oooOO0OZzi.OooOOo();
                                        str4 = str9;
                                        sQLiteDatabaseOooOOo4.delete("property_filters", str4, new String[]{str, String.valueOf(iZza)});
                                        sQLiteDatabaseOooOOo4.delete("event_filters", str4, new String[]{str, String.valueOf(iZza)});
                                        break;
                                    }
                                    str9 = str4;
                                    it2 = it;
                                    break;
                                }
                                if (!((zzes) it4.next()).zzj()) {
                                    oooOO0OZzi.f37615OooO00o.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", zzeo.OooO0o0(str), Integer.valueOf(iZza));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    oooOO0OZzi.f37615OooO00o.zzay().zzk().zzb("Audience with no ID. appId", zzeo.OooO0o0(str));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (com.google.android.gms.internal.measurement.zzeh zzehVar2 : arrayList) {
                arrayList2.add(zzehVar2.zzk() ? Integer.valueOf(zzehVar2.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            oooOO0OZzi.OooO00o();
            oooOO0OZzi.zzg();
            SQLiteDatabase sQLiteDatabaseOooOOo5 = oooOO0OZzi.OooOOo();
            try {
                long jOooOOO0 = oooOO0OZzi.OooOOO0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(RecyclerView.MAX_SCROLL_DURATION, oooOO0OZzi.f37615OooO00o.zzf().zze(str, zzeb.zzE)));
                if (jOooOOO0 > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder();
                            sb.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb.append("(" + strJoin + ")");
                            sb.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseOooOOo5.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(iMax)});
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
                oooOO0OZzi.f37615OooO00o.zzay().zzd().zzc("Database error querying filters. appId", zzeo.OooO0o0(str), e3);
            }
            sQLiteDatabaseOooOOo.setTransactionSuccessful();
            sQLiteDatabaseOooOOo.endTransaction();
            try {
                zzfdVar5.zzc();
                bArrZzbv = ((zzfe) zzfdVar5.zzaE()).zzbv();
                zzfpVar = this;
            } catch (RuntimeException e4) {
                zzfpVar = this;
                zzfpVar.f37615OooO00o.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeo.OooO0o0(str), e4);
                bArrZzbv = bArr;
            }
            OooOO0O oooOO0OZzi2 = zzfpVar.f37794OooO0O0.zzi();
            Preconditions.checkNotEmpty(str);
            oooOO0OZzi2.zzg();
            oooOO0OZzi2.OooO00o();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrZzbv);
            contentValues3.put("config_last_modified_time", str2);
            if (oooOO0OZzi2.f37615OooO00o.zzf().zzs(null, zzeb.zzaw)) {
                contentValues3.put("e_tag", str3);
            }
            try {
                if (oooOO0OZzi2.OooOOo().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    oooOO0OZzi2.f37615OooO00o.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzeo.OooO0o0(str));
                }
            } catch (SQLiteException e5) {
                oooOO0OZzi2.f37615OooO00o.zzay().zzd().zzc("Error storing remote config. appId", zzeo.OooO0o0(str), e5);
            }
            zzfpVar.f16176OooO0oo.put(str, (zzfe) zzfdVar5.zzaE());
            return true;
        } catch (Throwable th) {
            sQLiteDatabaseOooOOo.endTransaction();
            throw th;
        }
    }

    @Override // o0OO0OoO.OooO0o
    @WorkerThread
    public final String zza(String str, String str2) {
        zzg();
        OooO0o0(str);
        Map map = (Map) this.f16172OooO0Oo.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzo(String str) {
        zzfe zzfeVar;
        return (TextUtils.isEmpty(str) || (zzfeVar = (zzfe) this.f16176OooO0oo.getOrDefault(str, null)) == null || zzfeVar.zza() == 0) ? false : true;
    }
}
