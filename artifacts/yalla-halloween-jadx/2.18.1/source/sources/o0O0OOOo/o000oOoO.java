package o0O0OOOo;

import android.database.sqlite.SQLiteDatabase;
import com.yalla.yalla.ui.view.SendMomentShareView;
import java.util.List;
import p174o00OooOO.o0O00OOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000oOoO implements oo0o0Oo.OooO00o, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ o000oOoO f35667OooO0Oo = new o000oOoO();

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        int i = SendMomentShareView.f25199OoooOO0;
    }

    @Override // o0O0OOOo.oo0o0Oo.OooO00o
    public final Object apply(Object obj) {
        o0O0O0Oo.OooO0O0 oooO0O0 = oo0o0Oo.f35695OoooO0;
        return (List) oo0o0Oo.OooOo0O(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), o0OO00O.f35683OooO0Oo);
    }
}
