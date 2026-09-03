package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.Conversation;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo extends OooOOO0<Conversation> {
    public o0oOOo(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `ConversationTable` (`uid`,`targetId`,`mid`,`sendState`,`title`,`message`,`type`,`momentType`,`unReadCount`,`draft`,`time`,`topTime`,`isVoiceAndUnread`,`isAcceptMsg`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, Conversation conversation) {
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
