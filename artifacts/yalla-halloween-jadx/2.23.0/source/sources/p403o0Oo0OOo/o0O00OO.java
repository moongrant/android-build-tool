package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.Friend;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO extends OooOOO0<Friend> {
    public o0O00OO(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `FriendTable` (`uid`,`friendId`,`memoName`,`time`,`inRoom`,`deleteMark`,`isCheckUserRisk`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, Friend friend) {
        Friend friend2 = friend;
        supportSQLiteStatement.bindLong(1, friend2.getUid());
        supportSQLiteStatement.bindLong(2, friend2.getFriendId());
        if (friend2.getMemoName() == null) {
            supportSQLiteStatement.bindNull(3);
        } else {
            supportSQLiteStatement.bindString(3, friend2.getMemoName());
        }
        supportSQLiteStatement.bindLong(4, friend2.getTime());
        supportSQLiteStatement.bindLong(5, friend2.getInRoom() ? 1L : 0L);
        supportSQLiteStatement.bindLong(6, friend2.getDeleteMark() ? 1L : 0L);
        supportSQLiteStatement.bindLong(7, friend2.getIsCheckUserRisk() ? 1L : 0L);
    }
}
