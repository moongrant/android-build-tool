package p407o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.YlAppDataBase;
import java.util.TreeMap;
import o00.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0O implements o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f45789OooO00o;

    public o00O0O0O(YlAppDataBase ylAppDataBase) {
        this.f45789OooO00o = ylAppDataBase;
        new o00O00o0(ylAppDataBase);
        new oo00o(ylAppDataBase);
        new o00O0(ylAppDataBase);
        new o00O0O00(ylAppDataBase);
        new o00O0O0(ylAppDataBase);
    }

    @Override // p407o0Oo0Oo.o00O00OO
    public final String OooO00o(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select memoName from FriendsTable where uid = ? and id = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        RoomDatabase roomDatabase = this.f45789OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : cursorOooO0O0.getString(0);
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }
}
