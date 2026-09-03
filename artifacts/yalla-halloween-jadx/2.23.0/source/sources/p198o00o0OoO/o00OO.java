package p198o00o0OoO;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OO implements o00OOO0O.OooO00o {
    @Override // o00o0OoO.o00OOO0O.OooO00o
    public final void OooO00o(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
