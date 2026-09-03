package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 extends OooOOO0<FriendRequestMessage> {
    public o0O0OOO0(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `FriendRequestMessageTable` (`uid`,`targetUserId`,`mid`,`state`,`message`,`time`,`isRead`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, FriendRequestMessage friendRequestMessage) {
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
