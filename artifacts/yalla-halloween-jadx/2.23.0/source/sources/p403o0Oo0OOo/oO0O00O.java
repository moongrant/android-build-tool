package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.SquareEventRoom;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.TreeMap;
import o000O.OooO00o;
import o000O.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00O implements oO0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44629OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0O000o f44630OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0O00 f44631OooO0OO;

    public oO0O00O(YlAppDataBase ylAppDataBase) {
        this.f44629OooO00o = ylAppDataBase;
        this.f44630OooO0O0 = new oO0O000o(ylAppDataBase);
        this.f44631OooO0OO = new oO0O00(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.oO0O000
    public final void OooO00o(SquareEventRoom squareEventRoom) {
        RoomDatabase roomDatabase = this.f44629OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44630OooO0O0.OooO0o(squareEventRoom);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.oO0O000
    public final void OooO0O0(long j, long j2, long j3, long j4) {
        RoomDatabase roomDatabase = this.f44629OooO00o;
        roomDatabase.OooO0O0();
        oO0O00 oo0o00 = this.f44631OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oo0o00.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j4);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        supportSQLiteStatementOooO00o.bindLong(4, j3);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            oo0o00.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.oO0O000
    public final SquareEventRoom OooO0OO(long j, long j2, long j3) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(3, "Select * from SquareEventRoomTable Where uid = ? and targetId=? and roomId=?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        roomSQLiteQueryOooO00o.bindLong(3, j3);
        RoomDatabase roomDatabase = this.f44629OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "mid");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "targetId");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, ContributionFragment.ARG_1);
            int iOooO00o5 = OooO00o.OooO00o(cursorOooO0O0, "eventCreateTime");
            SquareEventRoom squareEventRoom = null;
            String string = null;
            if (cursorOooO0O0.moveToFirst()) {
                SquareEventRoom squareEventRoom2 = new SquareEventRoom();
                if (!cursorOooO0O0.isNull(iOooO00o)) {
                    string = cursorOooO0O0.getString(iOooO00o);
                }
                squareEventRoom2.setMid(string);
                squareEventRoom2.setUserId(cursorOooO0O0.getLong(iOooO00o2));
                squareEventRoom2.setTargetId(cursorOooO0O0.getLong(iOooO00o3));
                squareEventRoom2.setRoomId(cursorOooO0O0.getLong(iOooO00o4));
                squareEventRoom2.setEventCreateTime(cursorOooO0O0.getLong(iOooO00o5));
                squareEventRoom = squareEventRoom2;
            }
            return squareEventRoom;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }
}
