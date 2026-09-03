package o0OO0OoO;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.measurement.internal.zzeo;
import com.google.android.gms.measurement.internal.zzlb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public zzfs f37858OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Long f37859OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f37860OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f37861OooO0Oo;

    public /* synthetic */ o0OOooO0(OooO0OO oooO0OO) {
        this.f37861OooO0Oo = oooO0OO;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01e2  */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01df: MOVE (r5 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:66:0x01df */
    public final zzfs OooO00o(String str, zzfs zzfsVar) {
        Cursor cursor;
        Cursor cursorRawQuery;
        Cursor cursor2;
        Pair pairCreate;
        Object obj;
        String strZzh = zzfsVar.zzh();
        List listZzi = zzfsVar.zzi();
        this.f37861OooO0Oo.f37812OooO0O0.zzu();
        Long l = (Long) zzlb.OooO0o0(zzfsVar, "_eid");
        if (l != null) {
            if (strZzh.equals("_ep")) {
                Preconditions.checkNotNull(l);
                this.f37861OooO0Oo.f37812OooO0O0.zzu();
                String str2 = (String) zzlb.OooO0o0(zzfsVar, "_en");
                if (TextUtils.isEmpty(str2)) {
                    this.f37861OooO0Oo.f37591OooO00o.zzay().zzh().zzb("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.f37858OooO00o == null || this.f37859OooO0O0 == null || l.longValue() != this.f37859OooO0O0.longValue()) {
                    OooOO0O oooOO0OZzi = this.f37861OooO0Oo.f37812OooO0O0.zzi();
                    oooOO0OZzi.zzg();
                    oooOO0OZzi.OooO00o();
                    try {
                        try {
                            cursorRawQuery = oooOO0OZzi.OooOOo().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((zzfs) ((zzfr) zzlb.OooOOoo(zzfs.zze(), cursorRawQuery.getBlob(0))).zzaE(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e) {
                                        oooOO0OZzi.f37591OooO00o.zzay().zzd().zzd("Failed to merge main event. appId, eventId", zzeo.OooO0o0(str), l, e);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                } else {
                                    oooOO0OZzi.f37591OooO00o.zzay().zzj().zza("Main event not found");
                                    cursorRawQuery.close();
                                    pairCreate = null;
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                oooOO0OZzi.f37591OooO00o.zzay().zzd().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.f37861OooO0Oo.f37591OooO00o.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
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
                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                        this.f37861OooO0Oo.f37591OooO00o.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                    this.f37858OooO00o = (zzfs) obj;
                    this.f37860OooO0OO = ((Long) pairCreate.second).longValue();
                    this.f37861OooO0Oo.f37812OooO0O0.zzu();
                    this.f37859OooO0O0 = (Long) zzlb.OooO0o0(this.f37858OooO00o, "_eid");
                }
                long j = this.f37860OooO0OO - 1;
                this.f37860OooO0OO = j;
                if (j <= 0) {
                    OooOO0O oooOO0OZzi2 = this.f37861OooO0Oo.f37812OooO0O0.zzi();
                    oooOO0OZzi2.zzg();
                    oooOO0OZzi2.f37591OooO00o.zzay().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        oooOO0OZzi2.OooOOo().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e4) {
                        oooOO0OZzi2.f37591OooO00o.zzay().zzd().zzb("Error clearing complex main event", e4);
                    }
                } else {
                    this.f37861OooO0Oo.f37812OooO0O0.zzi().OooO0oo(str, l, this.f37860OooO0OO, this.f37858OooO00o);
                }
                ArrayList arrayList = new ArrayList();
                for (zzfw zzfwVar : this.f37858OooO00o.zzi()) {
                    this.f37861OooO0Oo.f37812OooO0O0.zzu();
                    if (zzlb.OooO0Oo(zzfsVar, zzfwVar.zzg()) == null) {
                        arrayList.add(zzfwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f37861OooO0Oo.f37591OooO00o.zzay().zzh().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listZzi);
                    listZzi = arrayList;
                }
                strZzh = str2;
            } else {
                this.f37859OooO0O0 = l;
                this.f37858OooO00o = zzfsVar;
                this.f37861OooO0Oo.f37812OooO0O0.zzu();
                Object objOooO0o0 = zzlb.OooO0o0(zzfsVar, "_epc");
                long jLongValue = ((Long) (objOooO0o0 != null ? objOooO0o0 : 0L)).longValue();
                this.f37860OooO0OO = jLongValue;
                if (jLongValue <= 0) {
                    this.f37861OooO0Oo.f37591OooO00o.zzay().zzh().zzb("Complex event with zero extra param count. eventName", strZzh);
                } else {
                    this.f37861OooO0Oo.f37812OooO0O0.zzi().OooO0oo(str, (Long) Preconditions.checkNotNull(l), this.f37860OooO0OO, zzfsVar);
                }
            }
        }
        zzfr zzfrVar = (zzfr) zzfsVar.zzby();
        zzfrVar.zzi(strZzh);
        zzfrVar.zzg();
        zzfrVar.zzd(listZzi);
        return (zzfs) zzfrVar.zzaE();
    }
}
