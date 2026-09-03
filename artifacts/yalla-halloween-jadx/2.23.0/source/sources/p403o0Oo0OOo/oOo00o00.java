package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o00 extends OooOOO0<YallaTeamMessage> {
    public oOo00o00(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `YallaTeamMessageTable` (`uid`,`mid`,`message`,`buriedPointSource`,`buriedPointMessageId`,`type`,`messageType`,`jumpType`,`jumpId`,`coverImage`,`detailImage`,`title`,`detailTitle`,`time`,`isRead`,`surveyMessageId`,`surveyIsSubmit`,`surveyScore`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, YallaTeamMessage yallaTeamMessage) {
        YallaTeamMessage yallaTeamMessage2 = yallaTeamMessage;
        supportSQLiteStatement.bindLong(1, yallaTeamMessage2.getUid());
        if (yallaTeamMessage2.getMid() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, yallaTeamMessage2.getMid());
        }
        if (yallaTeamMessage2.getMessage() == null) {
            supportSQLiteStatement.bindNull(3);
        } else {
            supportSQLiteStatement.bindString(3, yallaTeamMessage2.getMessage());
        }
        if (yallaTeamMessage2.getBuriedPointSource() == null) {
            supportSQLiteStatement.bindNull(4);
        } else {
            supportSQLiteStatement.bindString(4, yallaTeamMessage2.getBuriedPointSource());
        }
        if (yallaTeamMessage2.getBuriedPointMessageId() == null) {
            supportSQLiteStatement.bindNull(5);
        } else {
            supportSQLiteStatement.bindString(5, yallaTeamMessage2.getBuriedPointMessageId());
        }
        supportSQLiteStatement.bindLong(6, yallaTeamMessage2.getType());
        supportSQLiteStatement.bindLong(7, yallaTeamMessage2.getMessageType());
        supportSQLiteStatement.bindLong(8, yallaTeamMessage2.getJumpType());
        if (yallaTeamMessage2.getJumpId() == null) {
            supportSQLiteStatement.bindNull(9);
        } else {
            supportSQLiteStatement.bindString(9, yallaTeamMessage2.getJumpId());
        }
        if (yallaTeamMessage2.getCoverImage() == null) {
            supportSQLiteStatement.bindNull(10);
        } else {
            supportSQLiteStatement.bindString(10, yallaTeamMessage2.getCoverImage());
        }
        if (yallaTeamMessage2.getDetailImage() == null) {
            supportSQLiteStatement.bindNull(11);
        } else {
            supportSQLiteStatement.bindString(11, yallaTeamMessage2.getDetailImage());
        }
        if (yallaTeamMessage2.getTitle() == null) {
            supportSQLiteStatement.bindNull(12);
        } else {
            supportSQLiteStatement.bindString(12, yallaTeamMessage2.getTitle());
        }
        if (yallaTeamMessage2.getDetailTitle() == null) {
            supportSQLiteStatement.bindNull(13);
        } else {
            supportSQLiteStatement.bindString(13, yallaTeamMessage2.getDetailTitle());
        }
        supportSQLiteStatement.bindLong(14, yallaTeamMessage2.getTime());
        supportSQLiteStatement.bindLong(15, yallaTeamMessage2.getIsRead() ? 1L : 0L);
        YallaTeamMessage.SatisfactionSurvey satisfactionSurvey = yallaTeamMessage2.getSatisfactionSurvey();
        if (satisfactionSurvey != null) {
            supportSQLiteStatement.bindLong(16, satisfactionSurvey.getMessageId());
            supportSQLiteStatement.bindLong(17, satisfactionSurvey.getIsSubmit() ? 1L : 0L);
            supportSQLiteStatement.bindLong(18, satisfactionSurvey.getScore());
        } else {
            supportSQLiteStatement.bindNull(16);
            supportSQLiteStatement.bindNull(17);
            supportSQLiteStatement.bindNull(18);
        }
    }
}
