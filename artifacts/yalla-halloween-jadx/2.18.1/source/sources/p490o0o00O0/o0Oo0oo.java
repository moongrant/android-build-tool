package p490o0o00O0;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.app.base.fragment.ContributionFragment;
import com.yalla.yalla.common.db.table.SquareEventRoom;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f41077OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<SquareEventRoom> f41078OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f41079OooO0OO;

    public class OooO00o extends o000OOo<SquareEventRoom> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `SquareEventRoomTable` (`mid`,`uid`,`targetId`,`roomId`,`eventCreateTime`) VALUES (?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, SquareEventRoom squareEventRoom) {
            SquareEventRoom squareEventRoom2 = squareEventRoom;
            if (squareEventRoom2.getMid() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, squareEventRoom2.getMid());
            }
            supportSQLiteStatement.bindLong(2, squareEventRoom2.getUserId());
            supportSQLiteStatement.bindLong(3, squareEventRoom2.getTargetId());
            supportSQLiteStatement.bindLong(4, squareEventRoom2.getRoomId());
            supportSQLiteStatement.bindLong(5, squareEventRoom2.getEventCreateTime());
        }
    }

    public class OooO0O0 extends o0000OO0 {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "UPDATE SquareEventRoomTable SET eventCreateTime = ? WHERE uid = ? and targetId=? and roomId=?";
        }
    }

    public o0Oo0oo(RoomDatabase roomDatabase) {
        this.f41077OooO00o = roomDatabase;
        this.f41078OooO0O0 = new OooO00o(roomDatabase);
        this.f41079OooO0OO = new OooO0O0(roomDatabase);
    }

    @Override // p490o0o00O0.o0OOO0o
    public final void OooO00o(SquareEventRoom squareEventRoom) {
        this.f41077OooO00o.OooO0O0();
        this.f41077OooO00o.OooO0OO();
        try {
            this.f41078OooO0O0.OooO0oO(squareEventRoom);
            this.f41077OooO00o.OooOOOO();
        } finally {
            this.f41077OooO00o.OooOO0O();
        }
    }

    @Override // p490o0o00O0.o0OOO0o
    public final SquareEventRoom OooO0O0(long j, long j2, long j3) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from SquareEventRoomTable Where uid = ? and targetId=? and roomId=?", 3);
        o0000o0OooO0o.bindLong(1, j);
        o0000o0OooO0o.bindLong(2, j2);
        o0000o0OooO0o.bindLong(3, j3);
        this.f41077OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41077OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "mid");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "targetId");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, ContributionFragment.ARG_1);
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "eventCreateTime");
            SquareEventRoom squareEventRoom = null;
            String string = null;
            if (cursorOooOOO.moveToFirst()) {
                SquareEventRoom squareEventRoom2 = new SquareEventRoom();
                if (!cursorOooOOO.isNull(iOooO00o)) {
                    string = cursorOooOOO.getString(iOooO00o);
                }
                squareEventRoom2.setMid(string);
                squareEventRoom2.setUserId(cursorOooOOO.getLong(iOooO00o2));
                squareEventRoom2.setTargetId(cursorOooOOO.getLong(iOooO00o3));
                squareEventRoom2.setRoomId(cursorOooOOO.getLong(iOooO00o4));
                squareEventRoom2.setEventCreateTime(cursorOooOOO.getLong(iOooO00o5));
                squareEventRoom = squareEventRoom2;
            }
            return squareEventRoom;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p490o0o00O0.o0OOO0o
    public final void OooO0OO(long j, long j2, long j3, long j4) {
        this.f41077OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41079OooO0OO.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j4);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        supportSQLiteStatementOooO00o.bindLong(4, j3);
        this.f41077OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41077OooO00o.OooOOOO();
        } finally {
            this.f41077OooO00o.OooOO0O();
            this.f41079OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }
}
