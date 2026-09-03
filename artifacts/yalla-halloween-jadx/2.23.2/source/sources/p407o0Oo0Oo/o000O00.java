package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.Friend;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 extends o0OO00O<Friend> {
    public o000O00(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `FriendTable` (`uid`,`friendId`,`memoName`,`time`,`inRoom`,`deleteMark`,`isCheckUserRisk`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, Friend friend) {
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
