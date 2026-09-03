package p271o00ooooo;

import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzez;
import com.google.android.gms.measurement.internal.zzlh;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements oO0OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzlh f40526OooO00o;

    public m0(zzlh zzlhVar, String str) {
        this.f40526OooO00o = zzlhVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #0 {all -> 0x00f1, blocks: (B:13:0x0060, B:14:0x0064, B:16:0x006a, B:17:0x0070, B:18:0x008c, B:21:0x0097, B:22:0x009e, B:24:0x00a0, B:25:0x00af, B:27:0x00b1, B:29:0x00b5, B:32:0x00bc, B:33:0x00bd), top: B:58:0x0060, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4 A[Catch: SQLiteException -> 0x00ef, all -> 0x016e, TryCatch #3 {SQLiteException -> 0x00ef, blocks: (B:12:0x0027, B:34:0x00c5, B:36:0x00da, B:38:0x00e0, B:40:0x00eb, B:39:0x00e4, B:44:0x00f2, B:45:0x00fa), top: B:63:0x0027, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0126 A[Catch: all -> 0x016e, PHI: r10
      0x0126: PHI (r10v18 int) = (r10v2 int), (r10v0 int) binds: [B:11:0x0025, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x016e, blocks: (B:4:0x000f, B:5:0x0011, B:47:0x0126, B:52:0x015d, B:51:0x014e, B:12:0x0027, B:34:0x00c5, B:36:0x00da, B:38:0x00e0, B:40:0x00eb, B:39:0x00e4, B:44:0x00f2, B:45:0x00fa, B:46:0x00fb), top: B:64:0x000f, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x014a  */
    /* JADX WARN: Code duplicated, block: B:51:0x014e A[Catch: all -> 0x016e, TryCatch #4 {all -> 0x016e, blocks: (B:4:0x000f, B:5:0x0011, B:47:0x0126, B:52:0x015d, B:51:0x014e, B:12:0x0027, B:34:0x00c5, B:36:0x00da, B:38:0x00e0, B:40:0x00eb, B:39:0x00e4, B:44:0x00f2, B:45:0x00fa, B:46:0x00fb), top: B:64:0x000f, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0096 A[SYNTHETIC] */
    @Override // p271o00ooooo.oO0OOO00
    public final void OooO00o(String str, int i, Throwable th, byte[] bArr, Map map) {
        zzez zzezVar;
        oO00O0o oo00o0o;
        long jLongValue;
        zzlh zzlhVar = this.f40526OooO00o;
        zzlhVar.zzaB().zzg();
        zzlhVar.OooO0O0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                zzlhVar.f15625OooOo00 = false;
                zzlhVar.OooOo0O();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(zzlhVar.f15623OooOo);
        zzlhVar.f15623OooOo = null;
        if (i == 200) {
            if (th == null) {
                try {
                    zzlhVar.f15604OooO.zzc.zzb(zzlhVar.zzax().currentTimeMillis());
                    zzlhVar.f15604OooO.zzd.zzb(0L);
                    zzlhVar.OooOo();
                    zzlhVar.zzaA().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                    oO00O0o oo00o0o2 = zzlhVar.f15607OooO0OO;
                    zzlh.OooOoo(oo00o0o2);
                    oo00o0o2.zzw();
                    try {
                        for (Long l : list) {
                            try {
                                oo00o0o = zzlhVar.f15607OooO0OO;
                                zzlh.OooOoo(oo00o0o);
                                jLongValue = l.longValue();
                                oo00o0o.zzg();
                                oo00o0o.OooO00o();
                                try {
                                    if (oo00o0o.OooOOo().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e) {
                                    oo00o0o.f40788OooO00o.zzaA().zzd().zzb("Failed to delete a bundle in a queue table", e);
                                    throw e;
                                }
                            } catch (SQLiteException e2) {
                                ArrayList arrayList = zzlhVar.f15629OooOoO0;
                                if (arrayList == null || !arrayList.contains(l)) {
                                    throw e2;
                                }
                            }
                        }
                        oO00O0o oo00o0o3 = zzlhVar.f15607OooO0OO;
                        zzlh.OooOoo(oo00o0o3);
                        oo00o0o3.OooO0Oo();
                        oO00O0o oo00o0o4 = zzlhVar.f15607OooO0OO;
                        zzlh.OooOoo(oo00o0o4);
                        oo00o0o4.zzx();
                        zzlhVar.f15629OooOoO0 = null;
                        zzezVar = zzlhVar.f15606OooO0O0;
                        zzlh.OooOoo(zzezVar);
                        if (zzezVar.zza() || !zzlhVar.OooOoO()) {
                            zzlhVar.f15628OooOoO = -1L;
                            zzlhVar.OooOo();
                        } else {
                            zzlhVar.OooOOOO();
                        }
                        zzlhVar.f15618OooOOOO = 0L;
                    } catch (Throwable th3) {
                        oO00O0o oo00o0o5 = zzlhVar.f15607OooO0OO;
                        zzlh.OooOoo(oo00o0o5);
                        oo00o0o5.zzx();
                        throw th3;
                    }
                } catch (SQLiteException e3) {
                    zzlhVar.zzaA().zzd().zzb("Database error while trying to delete uploaded bundles", e3);
                    zzlhVar.f15618OooOOOO = zzlhVar.zzax().elapsedRealtime();
                    zzlhVar.zzaA().zzj().zzb("Disable upload, time", Long.valueOf(zzlhVar.f15618OooOOOO));
                }
            } else {
                zzlhVar.zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                zzlhVar.f15604OooO.zzd.zzb(zzlhVar.zzax().currentTimeMillis());
                if (i != 503 || i == 429) {
                    zzlhVar.f15604OooO.zzb.zzb(zzlhVar.zzax().currentTimeMillis());
                }
                oO00O0o oo00o0o6 = zzlhVar.f15607OooO0OO;
                zzlh.OooOoo(oo00o0o6);
                oo00o0o6.OooOooO(list);
                zzlhVar.OooOo();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                zzlhVar.f15604OooO.zzc.zzb(zzlhVar.zzax().currentTimeMillis());
                zzlhVar.f15604OooO.zzd.zzb(0L);
                zzlhVar.OooOo();
                zzlhVar.zzaA().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                oO00O0o oo00o0o7 = zzlhVar.f15607OooO0OO;
                zzlh.OooOoo(oo00o0o7);
                oo00o0o7.zzw();
                while (r10.hasNext()) {
                    oo00o0o = zzlhVar.f15607OooO0OO;
                    zzlh.OooOoo(oo00o0o);
                    jLongValue = l.longValue();
                    oo00o0o.zzg();
                    oo00o0o.OooO00o();
                    if (oo00o0o.OooOOo().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                oO00O0o oo00o0o8 = zzlhVar.f15607OooO0OO;
                zzlh.OooOoo(oo00o0o8);
                oo00o0o8.OooO0Oo();
                oO00O0o oo00o0o9 = zzlhVar.f15607OooO0OO;
                zzlh.OooOoo(oo00o0o9);
                oo00o0o9.zzx();
                zzlhVar.f15629OooOoO0 = null;
                zzezVar = zzlhVar.f15606OooO0O0;
                zzlh.OooOoo(zzezVar);
                if (zzezVar.zza()) {
                    zzlhVar.f15628OooOoO = -1L;
                    zzlhVar.OooOo();
                } else {
                    zzlhVar.f15628OooOoO = -1L;
                    zzlhVar.OooOo();
                }
                zzlhVar.f15618OooOOOO = 0L;
            } else {
                zzlhVar.zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                zzlhVar.f15604OooO.zzd.zzb(zzlhVar.zzax().currentTimeMillis());
                if (i != 503) {
                    zzlhVar.f15604OooO.zzb.zzb(zzlhVar.zzax().currentTimeMillis());
                } else {
                    zzlhVar.f15604OooO.zzb.zzb(zzlhVar.zzax().currentTimeMillis());
                }
                oO00O0o oo00o0o10 = zzlhVar.f15607OooO0OO;
                zzlh.OooOoo(oo00o0o10);
                oo00o0o10.OooOooO(list);
                zzlhVar.OooOo();
            }
        } else {
            zzlhVar.zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            zzlhVar.f15604OooO.zzd.zzb(zzlhVar.zzax().currentTimeMillis());
            if (i != 503) {
                zzlhVar.f15604OooO.zzb.zzb(zzlhVar.zzax().currentTimeMillis());
            } else {
                zzlhVar.f15604OooO.zzb.zzb(zzlhVar.zzax().currentTimeMillis());
            }
            oO00O0o oo00o0o11 = zzlhVar.f15607OooO0OO;
            zzlh.OooOoo(oo00o0o11);
            oo00o0o11.OooOooO(list);
            zzlhVar.OooOo();
        }
        zzlhVar.f15625OooOo00 = false;
        zzlhVar.OooOo0O();
    }
}
