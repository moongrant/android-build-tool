package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.ReadPostTable;
import java.util.TreeMap;
import o000O.OooO00o;
import o000O.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000o00 implements oO000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44621OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO000Oo f44622OooO0O0;

    public oO000o00(YlAppDataBase ylAppDataBase) {
        this.f44621OooO00o = ylAppDataBase;
        this.f44622OooO0O0 = new oO000Oo(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.oO000Oo0
    public final void OooO00o(ReadPostTable readPostTable) {
        RoomDatabase roomDatabase = this.f44621OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44622OooO0O0.OooO0o(readPostTable);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.oO000Oo0
    public final ReadPostTable OooO0O0(long j, long j2) {
        ReadPostTable readPostTable;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from ReadPostTable Where cid = ? and userId = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        RoomDatabase roomDatabase = this.f44621OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "cid");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "userId");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "readPostId");
            if (cursorOooO0O0.moveToFirst()) {
                readPostTable = new ReadPostTable();
                readPostTable.setCid(cursorOooO0O0.getLong(iOooO00o));
                readPostTable.setUserId(cursorOooO0O0.getLong(iOooO00o2));
                readPostTable.setReadPostId(cursorOooO0O0.getLong(iOooO00o3));
            } else {
                readPostTable = null;
            }
            return readPostTable;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }
}
