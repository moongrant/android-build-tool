package p038OoooOoO;

import android.database.Cursor;
import androidx.media3.common.OooO;
import androidx.media3.common.Player;
import androidx.media3.session.o000OO0O;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import p080o000OoO.o00000O0;
import p233o00oOoOO.o0OoOoOo;
import p248o00oo0o0.o000OO00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO implements o0000O.OooO00o, o00000O0.OooO0O0, o00000O0.OooO00o, o000OO00.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1607OooO0Oo;

    public /* synthetic */ o000OO(Object obj) {
        this.f1607OooO0Oo = obj;
    }

    @Override // o000OoO.o00000O0.OooO0O0
    public final void OooO0O0(Object obj, OooO oooO) {
        androidx.media3.exoplayer.OooO oooO2 = (androidx.media3.exoplayer.OooO) this.f1607OooO0Oo;
        int i = androidx.media3.exoplayer.OooO.f7121Ooooooo;
        oooO2.getClass();
        ((Player.OooO0OO) obj).onEvents(oooO2.f7126OooO0o, new Player.OooO0O0(oooO));
    }

    @Override // o00oo0o0.o000OO00.OooO00o
    public final Object apply(Object obj) {
        o000OO00 o000oo01 = (o000OO00) this.f1607OooO0Oo;
        Cursor cursor = (Cursor) obj;
        o0OoOoOo o0oooooo = o000OO00.f40194OooO;
        o000oo01.getClass();
        while (cursor.moveToNext()) {
            o000oo01.OooOOo(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((o000OO0O.OooO0OO) this.f1607OooO0Oo).getClass();
        throw null;
    }
}
