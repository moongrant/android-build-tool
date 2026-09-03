package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 extends o0OO00O<TopicRecentTable> {
    public o0OOOO00(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `TopicRecentTable` (`topic_id`,`topic_name`,`create_time`,`uid`) VALUES (?,?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, TopicRecentTable topicRecentTable) {
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
