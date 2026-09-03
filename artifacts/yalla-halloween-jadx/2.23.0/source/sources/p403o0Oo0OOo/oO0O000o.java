package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.SquareEventRoom;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000o extends OooOOO0<SquareEventRoom> {
    public oO0O000o(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `SquareEventRoomTable` (`mid`,`uid`,`targetId`,`roomId`,`eventCreateTime`) VALUES (?,?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, SquareEventRoom squareEventRoom) {
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
