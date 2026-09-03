package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.SquareEventRoom;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0 extends o0OO00O<SquareEventRoom> {
    public o0OO0(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `SquareEventRoomTable` (`mid`,`uid`,`targetId`,`roomId`,`eventCreateTime`) VALUES (?,?,?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
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
