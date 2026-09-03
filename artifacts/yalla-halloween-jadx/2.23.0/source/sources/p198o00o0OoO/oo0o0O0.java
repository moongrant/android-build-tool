package p198o00o0OoO;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import p191o00o0O0O.o0Oo0oo;
import p245o00oo0o.o00O;
import p247o00oo0oO.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo0o0O0 implements o00OO00O.OooO00o, o00O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39115OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f39116OooO0o0;

    public /* synthetic */ oo0o0O0(Object obj, Object obj2) {
        this.f39115OooO0Oo = obj;
        this.f39116OooO0o0 = obj2;
    }

    @Override // o00o0OoO.o00OO00O.OooO00o
    public final Object apply(Object obj) {
        o00OO00O o00oo00o = (o00OO00O) this.f39115OooO0Oo;
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) this.f39116OooO0o0;
        o00oo00o.getClass();
        Long lOooOo00 = o00OO00O.OooOo00((SQLiteDatabase) obj, o0oo0oo2);
        if (lOooOo00 == null) {
            return Boolean.FALSE;
        }
        Cursor cursorRawQuery = o00oo00o.OooOOo().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lOooOo00.toString()});
        try {
            return Boolean.valueOf(cursorRawQuery.moveToNext());
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        o0oOOo o0oooo = (o0oOOo) this.f39116OooO0o0;
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.onVideoSizeChanged(o0oooo);
        int i = o0oooo.f40864OooO0Oo;
        analyticsListener.o000OOo();
    }
}
