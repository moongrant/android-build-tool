package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o0oO extends OooOOO0<TopicRecentTable> {
    public oOo0o0oO(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `TopicRecentTable` (`topic_id`,`topic_name`,`create_time`,`uid`) VALUES (?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, TopicRecentTable topicRecentTable) {
        TopicRecentTable topicRecentTable2 = topicRecentTable;
        supportSQLiteStatement.bindLong(1, topicRecentTable2.topicId);
        String str = topicRecentTable2.topicName;
        if (str == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, str);
        }
        supportSQLiteStatement.bindLong(3, topicRecentTable2.createTime);
        String str2 = topicRecentTable2.uid;
        if (str2 == null) {
            supportSQLiteStatement.bindNull(4);
        } else {
            supportSQLiteStatement.bindString(4, str2);
        }
    }
}
