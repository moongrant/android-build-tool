package o00O0OO;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.work.impl.WorkDatabase;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f36197OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f36198OooO0O0;

    public OooOO0O(WorkDatabase workDatabase) {
        this.f36197OooO00o = workDatabase;
        this.f36198OooO0O0 = new OooOO0(workDatabase);
    }

    @Override // o00O0OO.OooO
    public final void OooO00o(OooO0o oooO0o) {
        RoomDatabase roomDatabase = this.f36197OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f36198OooO0O0.OooO0oO(oooO0o);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // o00O0OO.OooO
    public final Long OooO0O0(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT long_value FROM Preference where `key`=?");
        roomSQLiteQueryOooO00o.bindString(1, str);
        RoomDatabase roomDatabase = this.f36197OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Long.valueOf(cursorOooO0O0.getLong(0));
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }
}
