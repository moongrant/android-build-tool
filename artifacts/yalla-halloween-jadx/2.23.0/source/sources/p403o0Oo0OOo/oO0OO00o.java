package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.SimpleMessage;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00o extends OooOOO0<SimpleMessage> {
    public oO0OO00o(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `SimpleMessageTable` (`uid`,`type`,`time`,`content`,`activityNum`,`fansNum`,`visitorNum`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, SimpleMessage simpleMessage) {
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
