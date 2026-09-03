package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.Conversation;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends o0OO00O<Conversation> {
    public o00000OO(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `ConversationTable` (`uid`,`targetId`,`mid`,`sendState`,`title`,`message`,`type`,`momentType`,`unReadCount`,`draft`,`time`,`topTime`,`isVoiceAndUnread`,`isAcceptMsg`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, Conversation conversation) {
        Conversation conversation2 = conversation;
        supportSQLiteStatement.bindLong(1, conversation2.getUid());
        supportSQLiteStatement.bindLong(2, conversation2.getTargetId());
        if (conversation2.getMid() == null) {
            supportSQLiteStatement.bindNull(3);
        } else {
            supportSQLiteStatement.bindString(3, conversation2.getMid());
        }
        supportSQLiteStatement.bindLong(4, conversation2.getSendState());
        if (conversation2.getTitle() == null) {
            supportSQLiteStatement.bindNull(5);
        } else {
            supportSQLiteStatement.bindString(5, conversation2.getTitle());
        }
        if (conversation2.getMessage() == null) {
            supportSQLiteStatement.bindNull(6);
        } else {
            supportSQLiteStatement.bindString(6, conversation2.getMessage());
        }
        supportSQLiteStatement.bindLong(7, conversation2.getType());
        supportSQLiteStatement.bindLong(8, conversation2.getMomentType());
        supportSQLiteStatement.bindLong(9, conversation2.getUnReadCount());
        if (conversation2.getDraft() == null) {
            supportSQLiteStatement.bindNull(10);
        } else {
            supportSQLiteStatement.bindString(10, conversation2.getDraft());
        }
        supportSQLiteStatement.bindLong(11, conversation2.getTime());
        supportSQLiteStatement.bindLong(12, conversation2.getTopTime());
        supportSQLiteStatement.bindLong(13, conversation2.getIsVoiceAndUnread() ? 1L : 0L);
        supportSQLiteStatement.bindLong(14, conversation2.getIsAcceptMsg() ? 1L : 0L);
    }
}
