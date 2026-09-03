package p407o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.SquareEventRoom;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.TreeMap;
import o00.OooO00o;
import o00.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOooO0 implements o0OO00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f45858OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO0 f45859OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OO0O0 f45860OooO0OO;

    public o0OOooO0(YlAppDataBase ylAppDataBase) {
        this.f45858OooO00o = ylAppDataBase;
        this.f45859OooO0O0 = new o0OO0(ylAppDataBase);
        this.f45860OooO0OO = new o0OO0O0(ylAppDataBase);
    }

    @Override // p407o0Oo0Oo.o0OO00o0
    public final void OooO00o(SquareEventRoom squareEventRoom) {
        RoomDatabase roomDatabase = this.f45858OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f45859OooO0O0.OooO0oO(squareEventRoom);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p407o0Oo0Oo.o0OO00o0
    public final void OooO0O0(long j, long j2, long j3, long j4) {
        RoomDatabase roomDatabase = this.f45858OooO00o;
        roomDatabase.OooO0O0();
        o0OO0O0 o0oo0o1 = this.f45860OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0oo0o1.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j4);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        supportSQLiteStatementOooO00o.bindLong(4, j3);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0oo0o1.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o0OO00o0
    public final SquareEventRoom OooO0OO(long j, long j2, long j3) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(3, "Select * from SquareEventRoomTable Where uid = ? and targetId=? and roomId=?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, j2);
        roomSQLiteQueryOooO00o.bindLong(3, j3);
        RoomDatabase roomDatabase = this.f45858OooO00o;
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
