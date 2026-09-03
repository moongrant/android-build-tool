package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.SimpleMessage;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000 extends o0OO00O<SimpleMessage> {
    public o0OO000(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `SimpleMessageTable` (`uid`,`type`,`time`,`content`,`activityNum`,`fansNum`,`visitorNum`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, SimpleMessage simpleMessage) {
        SimpleMessage simpleMessage2 = simpleMessage;
        supportSQLiteStatement.bindLong(1, simpleMessage2.getUid());
        supportSQLiteStatement.bindLong(2, simpleMessage2.getType());
        supportSQLiteStatement.bindLong(3, simpleMessage2.getTime());
        SimpleMessage.ActivityMessage activityMessage = simpleMessage2.getActivityMessage();
        if (activityMessage != null) {
            if (activityMessage.getContent() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, activityMessage.getContent());
            }
            supportSQLiteStatement.bindLong(5, activityMessage.getActivityNum());
        } else {
            supportSQLiteStatement.bindNull(4);
            supportSQLiteStatement.bindNull(5);
        }
        SimpleMessage.FansMessage fansMessage = simpleMessage2.getFansMessage();
        if (fansMessage != null) {
            supportSQLiteStatement.bindLong(6, fansMessage.getFansNum());
        } else {
            supportSQLiteStatement.bindNull(6);
        }
        SimpleMessage.VisitorMessage visitorMessage = simpleMessage2.getVisitorMessage();
        if (visitorMessage != null) {
            supportSQLiteStatement.bindLong(7, visitorMessage.getVisitorNum());
        } else {
            supportSQLiteStatement.bindNull(7);
        }
    }
}
