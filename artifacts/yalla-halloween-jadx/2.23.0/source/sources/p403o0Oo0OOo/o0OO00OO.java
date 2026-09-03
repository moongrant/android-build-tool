package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.YlAppDataBase;
import java.util.TreeMap;
import o000O.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO implements o0O0oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44545OooO00o;

    public o0OO00OO(YlAppDataBase ylAppDataBase) {
        this.f44545OooO00o = ylAppDataBase;
        new o0O(ylAppDataBase);
        new o0OO000(ylAppDataBase);
        new o0OO000o(ylAppDataBase);
        new oo0oO0(ylAppDataBase);
        new oo0ooO(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.o0O0oo00
    public final String OooO00o(long j, long j2) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select memoName from FriendsTable where uid = ? and id = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        RoomDatabase roomDatabase = this.f44545OooO00o;
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
