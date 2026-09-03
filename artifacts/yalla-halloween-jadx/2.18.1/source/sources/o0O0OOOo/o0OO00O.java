package o0O0OOOo;

import android.database.Cursor;
import android.util.Base64;
import java.util.ArrayList;
import p290o0O0OOoo.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO00O implements oo0o0Oo.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ o0OO00O f35683OooO0Oo = new o0OO00O();

    @Override // o0O0OOOo.oo0o0Oo.OooO00o
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        o0O0O0Oo.OooO0O0 oooO0O0 = oo0o0Oo.f35695OoooO0;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            o0O0O0oO.o0OO00O.OooO00o OooO00o2 = p286o0O0O0oO.o0OO00O.OooO00o();
            OooO00o2.OooO00o(cursor.getString(1));
            o0O0O0oO.o0OoOo0.OooO00o oooO00o = (o0O0O0oO.o0OoOo0.OooO00o) OooO00o2;
            oooO00o.f35510OooO0OO = o000OO.OooO0O0(cursor.getInt(2));
            String string = cursor.getString(3);
            oooO00o.f35509OooO0O0 = string == null ? null : Base64.decode(string, 0);
            arrayList.add(oooO00o.OooO0O0());
        }
        return arrayList;
    }
}
