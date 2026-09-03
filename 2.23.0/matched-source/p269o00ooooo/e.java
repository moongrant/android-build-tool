package p269o00ooooo;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.measurement.internal.zzet;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzlj;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public zzft f41127OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Long f41128OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f41129OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0OOOo f41130OooO0Oo;

    public /* synthetic */ e(o0O0OOOo o0o0oooo) {
        this.f41130OooO0Oo = o0o0oooo;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ba  */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x01b7: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:440), block:B:65:0x01b7 */
    public final zzft OooO00o(zzft zzftVar, String str) throws Throwable {
        Cursor cursor;
        Cursor cursorRawQuery;
        Cursor cursor2;
        Pair pairCreate;
        Object obj;
        String strZzh = zzftVar.zzh();
        List listZzi = zzftVar.zzi();
        o0O0OOOo o0o0oooo = this.f41130OooO0Oo;
        o0o0oooo.f41477OooO0O0.zzu();
        Long l = (Long) zzlj.OooO0o0(zzftVar, "_eid");
        if (l != null) {
            boolean zEquals = strZzh.equals("_ep");
            zzgd zzgdVar = o0o0oooo.f41276OooO00o;
            zzlh zzlhVar = o0o0oooo.f41477OooO0O0;
            if (zEquals) {
                Preconditions.checkNotNull(l);
                zzlhVar.zzu();
                String str2 = (String) zzlj.OooO0o0(zzftVar, "_en");
                if (TextUtils.isEmpty(str2)) {
                    zzgdVar.zzaA().zzh().zzb("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.f41127OooO00o == null || this.f41128OooO0O0 == null || l.longValue() != this.f41128OooO0O0.longValue()) {
                    o0O0o0 o0o0o0Zzh = zzlhVar.zzh();
                    o0o0o0Zzh.zzg();
                    zzgd zzgdVar2 = o0o0o0Zzh.f41276OooO00o;
                    o0o0o0Zzh.OooO00o();
                    try {
                        try {
                            cursorRawQuery = o0o0o0Zzh.OooOOo().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((zzft) ((zzfs) zzlj.OooOOoo(zzft.zze(), cursorRawQuery.getBlob(0))).zzaD(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e) {
                                        zzgdVar2.zzaA().zzd().zzd("Failed to merge main event. appId, eventId", zzet.OooO0Oo(str), l, e);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        zzgdVar.zzaA().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                                        return null;
                                    }
                                    this.f41127OooO00o = (zzft) obj;
                                    this.f41129OooO0OO = ((Long) pairCreate.second).longValue();
                                    zzlhVar.zzu();
                                    this.f41128OooO0O0 = (Long) zzlj.OooO0o0(this.f41127OooO00o, "_eid");
                                } else {
                                    zzgdVar2.zzaA().zzj().zza("Main event not found");
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzgdVar2.zzaA().zzd().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                zzgdVar.zzaA().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    zzgdVar.zzaA().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                    return null;
                }
                long j = this.f41129OooO0OO - 1;
                this.f41129OooO0OO = j;
                if (j <= 0) {
                    o0O0o0 o0o0o0Zzh2 = zzlhVar.zzh();
                    o0o0o0Zzh2.zzg();
                    zzgd zzgdVar3 = o0o0o0Zzh2.f41276OooO00o;
                    zzgdVar3.zzaA().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        o0o0o0Zzh2.OooOOo().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e4) {
                        zzgdVar3.zzaA().zzd().zzb("Error clearing complex main event", e4);
                    }
                } else {
                    zzlhVar.zzh().OooO0oo(str, l, this.f41129OooO0OO, this.f41127OooO00o);
                }
                ArrayList arrayList = new ArrayList();
                for (zzfx zzfxVar : this.f41127OooO00o.zzi()) {
                    zzlhVar.zzu();
                    if (zzlj.OooO0Oo(zzftVar, zzfxVar.zzg()) == null) {
                        arrayList.add(zzfxVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    zzgdVar.zzaA().zzh().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listZzi);
                    listZzi = arrayList;
                }
                strZzh = str2;
            } else {
                this.f41128OooO0O0 = l;
                this.f41127OooO00o = zzftVar;
                zzlhVar.zzu();
                Serializable serializableOooO0o0 = zzlj.OooO0o0(zzftVar, "_epc");
                long jLongValue = ((Long) (serializableOooO0o0 != null ? serializableOooO0o0 : 0L)).longValue();
                this.f41129OooO0OO = jLongValue;
                if (jLongValue <= 0) {
                    zzgdVar.zzaA().zzh().zzb("Complex event with zero extra param count. eventName", strZzh);
                } else {
                    zzlhVar.zzh().OooO0oo(str, (Long) Preconditions.checkNotNull(l), this.f41129OooO0OO, zzftVar);
                }
            }
        }
        zzfs zzfsVar = (zzfs) zzftVar.zzbB();
        zzfsVar.zzi(strZzh);
        zzfsVar.zzg();
        zzfsVar.zzd(listZzi);
        return (zzft) zzfsVar.zzaD();
    }
}
