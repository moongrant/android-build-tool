package p255o00ooO0o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o0O0O0Oo.OooO0O0;
import o0O0OOOo.OooOo00;
import o0O0OOOo.oo0o0Oo;
import p143o00OOooo.o00O000o;
import p251o00ooO.o000Oo0;
import p286o0O0O0oO.o0OO00O;
import p286o0O0O0oO.oo000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo00o implements BaseQuickAdapter.OooOOOO, oo0o0Oo.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34369OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34370OooO0o0;

    public /* synthetic */ oo00o(Object obj, Object obj2) {
        this.f34369OooO0Oo = obj;
        this.f34370OooO0o0 = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<o00ooO.o000Oo0>] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        o00O0 this$0 = (o00O0) this.f34369OooO0Oo;
        Function2 onItemClick = (Function2) this.f34370OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onItemClick, "$onItemClick");
        if (this$0.f34363OooOO0o) {
            this$0.OooO0Oo();
        }
        Integer numValueOf = Integer.valueOf(i);
        Object obj = this$0.f34360OooO0oo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of com.code.android.yldialog.BottomListDialog.setOnItemClickListener$lambda-1");
        onItemClick.invoke(numValueOf, (o000Oo0) obj);
    }

    @Override // o0O0OOOo.oo0o0Oo.OooO00o
    public final Object apply(Object obj) {
        final oo0o0Oo oo0o0oo = (oo0o0Oo) this.f34369OooO0Oo;
        final o0OO00O o0oo00o2 = (o0OO00O) this.f34370OooO0o0;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        OooO0O0 oooO0O0 = oo0o0Oo.f35695OoooO0;
        Objects.requireNonNull(oo0o0oo);
        final ArrayList arrayList = new ArrayList();
        Long lOooOOO = oo0o0oo.OooOOO(sQLiteDatabase, o0oo00o2);
        if (lOooOOO != null) {
            oo0o0Oo.OooOo0O(sQLiteDatabase.query(d.ar, new String[]{ao.d, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lOooOOO.toString()}, null, null, null, String.valueOf(oo0o0oo.f35696Oooo.OooO0OO())), new oo0o0Oo.OooO00o() { // from class: o0O0OOOo.oo000o
                @Override // o0O0OOOo.oo0o0Oo.OooO00o
                public final Object apply(Object obj2) {
                    oo0o0Oo oo0o0oo2 = oo0o0oo;
                    List list = arrayList;
                    p286o0O0O0oO.o0OO00O o0oo00o3 = o0oo00o2;
                    Cursor cursor = (Cursor) obj2;
                    Objects.requireNonNull(oo0o0oo2);
                    while (cursor.moveToNext()) {
                        long j = cursor.getLong(0);
                        boolean z = cursor.getInt(7) != 0;
                        o0O0O0oO.oo000o.OooO00o OooO00o2 = p286o0O0O0oO.oo000o.OooO00o();
                        OooO00o2.OooO0o(cursor.getString(1));
                        OooO00o2.OooO0o0(cursor.getLong(2));
                        OooO00o2.OooO0oO(cursor.getLong(3));
                        if (z) {
                            String string = cursor.getString(4);
                            ((o0O0O0oO.o000oOoO.OooO0O0) OooO00o2).f35478OooO0OO = new p286o0O0O0oO.o00Ooo(string == null ? oo0o0Oo.f35695OoooO0 : new o0O0O0Oo.OooO0O0(string), cursor.getBlob(5));
                        } else {
                            String string2 = cursor.getString(4);
                            ((o0O0O0oO.o000oOoO.OooO0O0) OooO00o2).f35478OooO0OO = new p286o0O0O0oO.o00Ooo(string2 == null ? oo0o0Oo.f35695OoooO0 : new o0O0O0Oo.OooO0O0(string2), (byte[]) oo0o0Oo.OooOo0O(oo0o0oo2.OooO0oo().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), o0OoOo0.f35687OooO0Oo));
                        }
                        if (!cursor.isNull(6)) {
                            ((o0O0O0oO.o000oOoO.OooO0O0) OooO00o2).f35477OooO0O0 = Integer.valueOf(cursor.getInt(6));
                        }
                        list.add(new OooO0O0(j, o0oo00o3, OooO00o2.OooO0OO()));
                    }
                    return null;
                }
            });
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(((OooOo00) arrayList.get(i)).OooO0O0());
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        oo0o0Oo.OooOo0O(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new o00O000o(map));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            OooOo00 oooOo00 = (OooOo00) listIterator.next();
            if (map.containsKey(Long.valueOf(oooOo00.OooO0O0()))) {
                oo000o.OooO00o oooO00oOooOO0 = oooOo00.OooO00o().OooOO0();
                for (oo0o0Oo.OooO0O0 oooO0O1 : (Set) map.get(Long.valueOf(oooOo00.OooO0O0()))) {
                    oooO00oOooOO0.OooO0O0(oooO0O1.f35701OooO00o, oooO0O1.f35702OooO0O0);
                }
                listIterator.set(new o0O0OOOo.OooO0O0(oooOo00.OooO0O0(), oooOo00.OooO0OO(), oooO00oOooOO0.OooO0OO()));
            }
        }
        return arrayList;
    }
}
