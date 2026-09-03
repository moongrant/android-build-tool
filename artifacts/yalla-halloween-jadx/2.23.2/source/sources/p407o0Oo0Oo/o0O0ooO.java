package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO extends o0OO00O<FriendRequestMessage> {
    public o0O0ooO(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `FriendRequestMessageTable` (`uid`,`targetUserId`,`mid`,`state`,`message`,`time`,`isRead`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, FriendRequestMessage friendRequestMessage) {
        FriendRequestMessage friendRequestMessage2 = friendRequestMessage;
        supportSQLiteStatement.bindLong(1, friendRequestMessage2.getUid());
        supportSQLiteStatement.bindLong(2, friendRequestMessage2.getTargetUserId());
        if (friendRequestMessage2.getMid() == null) {
            supportSQLiteStatement.bindNull(3);
        } else {
            supportSQLiteStatement.bindString(3, friendRequestMessage2.getMid());
        }
        supportSQLiteStatement.bindLong(4, friendRequestMessage2.getState());
        if (friendRequestMessage2.getMessage() == null) {
            supportSQLiteStatement.bindNull(5);
        } else {
            supportSQLiteStatement.bindString(5, friendRequestMessage2.getMessage());
        }
        supportSQLiteStatement.bindLong(6, friendRequestMessage2.getTime());
        supportSQLiteStatement.bindLong(7, friendRequestMessage2.getIsRead() ? 1L : 0L);
    }
}
