package p269o00ooooo;

import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzez;
import com.google.android.gms.measurement.internal.zzlh;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOOoo00 implements o0OOooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzlh f41483OooO00o;

    public oOOOoo00(zzlh zzlhVar, String str) {
        this.f41483OooO00o = zzlhVar;
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
    @Override // p269o00ooooo.o0OOooO0
    public final void OooO00o(String str, int i, Throwable th, byte[] bArr, Map map) {
        zzez zzezVar;
        o0O0o0 o0o0o0;
        long jLongValue;
        zzlh zzlhVar = this.f41483OooO00o;
        zzlhVar.zzaB().zzg();
        zzlhVar.OooO0O0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                zzlhVar.f16101OooOo00 = false;
                zzlhVar.OooOo0O();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(zzlhVar.f16099OooOo);
        zzlhVar.f16099OooOo = null;
        if (i == 200) {
            if (th == null) {
                try {
                    zzlhVar.f16080OooO.zzc.zzb(zzlhVar.zzax().currentTimeMillis());
                    zzlhVar.f16080OooO.zzd.zzb(0L);
                    zzlhVar.OooOo();
                    zzlhVar.zzaA().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                    o0O0o0 o0o0o1 = zzlhVar.f16083OooO0OO;
                    zzlh.OooOoo(o0o0o1);
                    o0o0o1.zzw();
                    try {
                        for (Long l : list) {
                            try {
                                o0o0o0 = zzlhVar.f16083OooO0OO;
                                zzlh.OooOoo(o0o0o0);
                                jLongValue = l.longValue();
                                o0o0o0.zzg();
                                o0o0o0.OooO00o();
                                try {
                                    if (o0o0o0.OooOOo().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e) {
                                    o0o0o0.f41276OooO00o.zzaA().zzd().zzb("Failed to delete a bundle in a queue table", e);
                                    throw e;
                                }
                            } catch (SQLiteException e2) {
                                ArrayList arrayList = zzlhVar.f16105OooOoO0;
                                if (arrayList == null || !arrayList.contains(l)) {
                                    throw e2;
                                }
                            }
                        }
                        o0O0o0 o0o0o2 = zzlhVar.f16083OooO0OO;
                        zzlh.OooOoo(o0o0o2);
                        o0o0o2.OooO0Oo();
                        o0O0o0 o0o0o3 = zzlhVar.f16083OooO0OO;
                        zzlh.OooOoo(o0o0o3);
                        o0o0o3.zzx();
                        zzlhVar.f16105OooOoO0 = null;
                        zzezVar = zzlhVar.f16082OooO0O0;
                        zzlh.OooOoo(zzezVar);
                        if (zzezVar.zza() || !zzlhVar.OooOoO()) {
                            zzlhVar.f16104OooOoO = -1L;
                            zzlhVar.OooOo();
                        } else {
                            zzlhVar.OooOOOO();
                        }
                        zzlhVar.f16094OooOOOO = 0L;
                    } catch (Throwable th3) {
                        o0O0o0 o0o0o4 = zzlhVar.f16083OooO0OO;
                        zzlh.OooOoo(o0o0o4);
                        o0o0o4.zzx();
                        throw th3;
                    }
                } catch (SQLiteException e3) {
                    zzlhVar.zzaA().zzd().zzb("Database error while trying to delete uploaded bundles", e3);
                    zzlhVar.f16094OooOOOO = zzlhVar.zzax().elapsedRealtime();
                    zzlhVar.zzaA().zzj().zzb("Disable upload, time", Long.valueOf(zzlhVar.f16094OooOOOO));
                }
            } else {
                zzlhVar.zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                zzlhVar.f16080OooO.zzd.zzb(zzlhVar.zzax().currentTimeMillis());
                if (i != 503 || i == 429) {
                    zzlhVar.f16080OooO.zzb.zzb(zzlhVar.zzax().currentTimeMillis());
                }
                o0O0o0 o0o0o5 = zzlhVar.f16083OooO0OO;
                zzlh.OooOoo(o0o0o5);
                o0o0o5.OooOooO(list);
                zzlhVar.OooOo();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                zzlhVar.f16080OooO.zzc.zzb(zzlhVar.zzax().currentTimeMillis());
                zzlhVar.f16080OooO.zzd.zzb(0L);
                zzlhVar.OooOo();
                zzlhVar.zzaA().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                o0O0o0 o0o0o6 = zzlhVar.f16083OooO0OO;
                zzlh.OooOoo(o0o0o6);
                o0o0o6.zzw();
                while (r10.hasNext()) {
                    o0o0o0 = zzlhVar.f16083OooO0OO;
                    zzlh.OooOoo(o0o0o0);
                    jLongValue = l.longValue();
                    o0o0o0.zzg();
                    o0o0o0.OooO00o();
                    if (o0o0o0.OooOOo().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                o0O0o0 o0o0o7 = zzlhVar.f16083OooO0OO;
                zzlh.OooOoo(o0o0o7);
                o0o0o7.OooO0Oo();
                o0O0o0 o0o0o8 = zzlhVar.f16083OooO0OO;
                zzlh.OooOoo(o0o0o8);
                o0o0o8.zzx();
                zzlhVar.f16105OooOoO0 = null;
                zzezVar = zzlhVar.f16082OooO0O0;
                zzlh.OooOoo(zzezVar);
                if (zzezVar.zza()) {
                    zzlhVar.f16104OooOoO = -1L;
                    zzlhVar.OooOo();
                } else {
                    zzlhVar.f16104OooOoO = -1L;
                    zzlhVar.OooOo();
                }
                zzlhVar.f16094OooOOOO = 0L;
            } else {
                zzlhVar.zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                zzlhVar.f16080OooO.zzd.zzb(zzlhVar.zzax().currentTimeMillis());
                if (i != 503) {
                    zzlhVar.f16080OooO.zzb.zzb(zzlhVar.zzax().currentTimeMillis());
                } else {
                    zzlhVar.f16080OooO.zzb.zzb(zzlhVar.zzax().currentTimeMillis());
                }
                o0O0o0 o0o0o9 = zzlhVar.f16083OooO0OO;
                zzlh.OooOoo(o0o0o9);
                o0o0o9.OooOooO(list);
                zzlhVar.OooOo();
            }
        } else {
            zzlhVar.zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            zzlhVar.f16080OooO.zzd.zzb(zzlhVar.zzax().currentTimeMillis());
            if (i != 503) {
                zzlhVar.f16080OooO.zzb.zzb(zzlhVar.zzax().currentTimeMillis());
            } else {
                zzlhVar.f16080OooO.zzb.zzb(zzlhVar.zzax().currentTimeMillis());
            }
            o0O0o0 o0o0o10 = zzlhVar.f16083OooO0OO;
            zzlh.OooOoo(o0o0o10);
            o0o0o10.OooOooO(list);
            zzlhVar.OooOo();
        }
        zzlhVar.f16101OooOo00 = false;
        zzlhVar.OooOo0O();
    }
}
