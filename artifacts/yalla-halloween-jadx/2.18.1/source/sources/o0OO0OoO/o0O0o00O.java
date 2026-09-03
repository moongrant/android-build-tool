package o0OO0OoO;

import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzkz;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o00O implements o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zzkz f37801OooO00o;

    public o0O0o00O(zzkz zzkzVar, String str) {
        this.f37801OooO00o = zzkzVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006b A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:12:0x0061, B:13:0x0065, B:15:0x006b, B:16:0x0071, B:17:0x008d, B:20:0x0098, B:21:0x009f, B:23:0x00a1, B:24:0x00b0, B:26:0x00b2, B:28:0x00b6, B:31:0x00bd, B:32:0x00be), top: B:57:0x0061, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5 A[Catch: SQLiteException -> 0x00f0, all -> 0x016f, TryCatch #2 {SQLiteException -> 0x00f0, blocks: (B:11:0x0028, B:33:0x00c6, B:35:0x00db, B:37:0x00e1, B:39:0x00ec, B:38:0x00e5, B:43:0x00f3, B:44:0x00fb), top: B:60:0x0028, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0127 A[Catch: all -> 0x016f, PHI: r10
      0x0127: PHI (r10v18 int) = (r10v2 int), (r10v0 int) binds: [B:10:0x0026, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x016f, blocks: (B:4:0x000f, B:5:0x0011, B:46:0x0127, B:51:0x015e, B:50:0x014f, B:11:0x0028, B:33:0x00c6, B:35:0x00db, B:37:0x00e1, B:39:0x00ec, B:38:0x00e5, B:43:0x00f3, B:44:0x00fb, B:45:0x00fc), top: B:63:0x000f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x014b  */
    /* JADX WARN: Code duplicated, block: B:50:0x014f A[Catch: all -> 0x016f, TryCatch #4 {all -> 0x016f, blocks: (B:4:0x000f, B:5:0x0011, B:46:0x0127, B:51:0x015e, B:50:0x014f, B:11:0x0028, B:33:0x00c6, B:35:0x00db, B:37:0x00e1, B:39:0x00ec, B:38:0x00e5, B:43:0x00f3, B:44:0x00fb, B:45:0x00fc), top: B:63:0x000f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0097 A[SYNTHETIC] */
    @Override // o0OO0OoO.o00oO0o
    public final void OooO00o(String str, int i, Throwable th, byte[] bArr, Map map) {
        zzeu zzeuVar;
        OooOO0O oooOO0O;
        long jLongValue;
        zzkz zzkzVar = this.f37801OooO00o;
        zzkzVar.zzaz().zzg();
        zzkzVar.OooO0O0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                zzkzVar.f16304OooOo00 = false;
                zzkzVar.OooOo0o();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(zzkzVar.f16302OooOo);
        zzkzVar.f16302OooOo = null;
        if (i == 200) {
            if (th == null) {
                try {
                    zzkzVar.f16283OooO.zzc.zzb(zzkzVar.zzav().currentTimeMillis());
                    zzkzVar.f16283OooO.zzd.zzb(0L);
                    zzkzVar.OooOoO0();
                    zzkzVar.zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                    OooOO0O oooOO0O2 = zzkzVar.f16286OooO0OO;
                    zzkz.OooOooO(oooOO0O2);
                    oooOO0O2.zzw();
                    try {
                        for (Long l : list) {
                            try {
                                oooOO0O = zzkzVar.f16286OooO0OO;
                                zzkz.OooOooO(oooOO0O);
                                jLongValue = l.longValue();
                                oooOO0O.zzg();
                                oooOO0O.OooO00o();
                                try {
                                    if (oooOO0O.OooOOo().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e) {
                                    oooOO0O.f37615OooO00o.zzay().zzd().zzb("Failed to delete a bundle in a queue table", e);
                                    throw e;
                                }
                            } catch (SQLiteException e2) {
                                ArrayList arrayList = zzkzVar.f16308OooOoO0;
                                if (arrayList == null || !arrayList.contains(l)) {
                                    throw e2;
                                }
                            }
                        }
                        OooOO0O oooOO0O3 = zzkzVar.f16286OooO0OO;
                        zzkz.OooOooO(oooOO0O3);
                        oooOO0O3.OooO0Oo();
                        OooOO0O oooOO0O4 = zzkzVar.f16286OooO0OO;
                        zzkz.OooOooO(oooOO0O4);
                        oooOO0O4.OooOooo();
                        zzkzVar.f16308OooOoO0 = null;
                        zzeuVar = zzkzVar.f16285OooO0O0;
                        zzkz.OooOooO(zzeuVar);
                        if (zzeuVar.zza() || !zzkzVar.OooOoOO()) {
                            zzkzVar.f16307OooOoO = -1L;
                            zzkzVar.OooOoO0();
                        } else {
                            zzkzVar.OooOOOo();
                        }
                        zzkzVar.f16297OooOOOO = 0L;
                    } catch (Throwable th3) {
                        OooOO0O oooOO0O5 = zzkzVar.f16286OooO0OO;
                        zzkz.OooOooO(oooOO0O5);
                        oooOO0O5.OooOooo();
                        throw th3;
                    }
                } catch (SQLiteException e3) {
                    zzkzVar.zzay().zzd().zzb("Database error while trying to delete uploaded bundles", e3);
                    zzkzVar.f16297OooOOOO = zzkzVar.zzav().elapsedRealtime();
                    zzkzVar.zzay().zzj().zzb("Disable upload, time", Long.valueOf(zzkzVar.f16297OooOOOO));
                }
            } else {
                zzkzVar.zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                zzkzVar.f16283OooO.zzd.zzb(zzkzVar.zzav().currentTimeMillis());
                if (i != 503 || i == 429) {
                    zzkzVar.f16283OooO.zzb.zzb(zzkzVar.zzav().currentTimeMillis());
                }
                OooOO0O oooOO0O6 = zzkzVar.f16286OooO0OO;
                zzkz.OooOooO(oooOO0O6);
                oooOO0O6.Oooo000(list);
                zzkzVar.OooOoO0();
            }
        } else if (i == 204) {
            i = IZegoLiveEventCallback.StreamEvent.RetryPlaySuccess;
            if (th == null) {
                zzkzVar.f16283OooO.zzc.zzb(zzkzVar.zzav().currentTimeMillis());
                zzkzVar.f16283OooO.zzd.zzb(0L);
                zzkzVar.OooOoO0();
                zzkzVar.zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                OooOO0O oooOO0O7 = zzkzVar.f16286OooO0OO;
                zzkz.OooOooO(oooOO0O7);
                oooOO0O7.zzw();
                while (r10.hasNext()) {
                    oooOO0O = zzkzVar.f16286OooO0OO;
                    zzkz.OooOooO(oooOO0O);
                    jLongValue = l.longValue();
                    oooOO0O.zzg();
                    oooOO0O.OooO00o();
                    if (oooOO0O.OooOOo().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                OooOO0O oooOO0O8 = zzkzVar.f16286OooO0OO;
                zzkz.OooOooO(oooOO0O8);
                oooOO0O8.OooO0Oo();
                OooOO0O oooOO0O9 = zzkzVar.f16286OooO0OO;
                zzkz.OooOooO(oooOO0O9);
                oooOO0O9.OooOooo();
                zzkzVar.f16308OooOoO0 = null;
                zzeuVar = zzkzVar.f16285OooO0O0;
                zzkz.OooOooO(zzeuVar);
                if (zzeuVar.zza()) {
                    zzkzVar.f16307OooOoO = -1L;
                    zzkzVar.OooOoO0();
                } else {
                    zzkzVar.f16307OooOoO = -1L;
                    zzkzVar.OooOoO0();
                }
                zzkzVar.f16297OooOOOO = 0L;
            } else {
                zzkzVar.zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
                zzkzVar.f16283OooO.zzd.zzb(zzkzVar.zzav().currentTimeMillis());
                if (i != 503) {
                    zzkzVar.f16283OooO.zzb.zzb(zzkzVar.zzav().currentTimeMillis());
                } else {
                    zzkzVar.f16283OooO.zzb.zzb(zzkzVar.zzav().currentTimeMillis());
                }
                OooOO0O oooOO0O10 = zzkzVar.f16286OooO0OO;
                zzkz.OooOooO(oooOO0O10);
                oooOO0O10.Oooo000(list);
                zzkzVar.OooOoO0();
            }
        } else {
            zzkzVar.zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            zzkzVar.f16283OooO.zzd.zzb(zzkzVar.zzav().currentTimeMillis());
            if (i != 503) {
                zzkzVar.f16283OooO.zzb.zzb(zzkzVar.zzav().currentTimeMillis());
            } else {
                zzkzVar.f16283OooO.zzb.zzb(zzkzVar.zzav().currentTimeMillis());
            }
            OooOO0O oooOO0O11 = zzkzVar.f16286OooO0OO;
            zzkz.OooOooO(oooOO0O11);
            oooOO0O11.Oooo000(list);
            zzkzVar.OooOoO0();
        }
        zzkzVar.f16304OooOo00 = false;
        zzkzVar.OooOo0o();
    }
}
