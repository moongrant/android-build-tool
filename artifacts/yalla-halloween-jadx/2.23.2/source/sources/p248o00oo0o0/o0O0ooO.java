package p248o00oo0o0;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0ooO implements o00O000o.OooO00o {
    @Override // o00oo0o0.o00O000o.OooO00o
    public final void OooO00o(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
