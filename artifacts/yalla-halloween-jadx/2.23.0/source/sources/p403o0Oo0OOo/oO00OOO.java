package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.RoomJoinHistory;
import java.util.TreeMap;
import o000O.OooO00o;
import o000O.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOO implements oO00O0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44623OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO00OO0O f44624OooO0O0;

    public oO00OOO(YlAppDataBase ylAppDataBase) {
        this.f44623OooO00o = ylAppDataBase;
        this.f44624OooO0O0 = new oO00OO0O(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.oO00O0oO
    public final void OooO00o(RoomJoinHistory roomJoinHistory) {
        RoomDatabase roomDatabase = this.f44623OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44624OooO0O0.OooO0o(roomJoinHistory);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.oO00O0oO
    public final RoomJoinHistory OooO0O0(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from RoomJoinHistory Where repeat = ?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f44623OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "repeat");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "barid");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "uid");
            RoomJoinHistory roomJoinHistory = null;
            if (cursorOooO0O0.moveToFirst()) {
                RoomJoinHistory roomJoinHistory2 = new RoomJoinHistory();
                if (cursorOooO0O0.isNull(iOooO00o)) {
                    roomJoinHistory2.id = null;
                } else {
                    roomJoinHistory2.id = Integer.valueOf(cursorOooO0O0.getInt(iOooO00o));
                }
                if (cursorOooO0O0.isNull(iOooO00o2)) {
                    roomJoinHistory2.repeat = null;
                } else {
                    roomJoinHistory2.repeat = cursorOooO0O0.getString(iOooO00o2);
                }
                if (cursorOooO0O0.isNull(iOooO00o3)) {
                    roomJoinHistory2.barid = null;
                } else {
                    roomJoinHistory2.barid = cursorOooO0O0.getString(iOooO00o3);
                }
                if (cursorOooO0O0.isNull(iOooO00o4)) {
                    roomJoinHistory2.uid = null;
                } else {
                    roomJoinHistory2.uid = cursorOooO0O0.getString(iOooO00o4);
                }
                roomJoinHistory = roomJoinHistory2;
            }
            return roomJoinHistory;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }
}
