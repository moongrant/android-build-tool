package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import p110o000ooo0.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO0o extends o0Oo0oo<TopicRecentTable> {
    public o0OOOO0o(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "DELETE FROM `TopicRecentTable` WHERE `topic_id` = ? AND `uid` = ?";
    }

    @Override // p110o000ooo0.o0Oo0oo
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, TopicRecentTable topicRecentTable) {
        TopicRecentTable topicRecentTable2 = topicRecentTable;
        supportSQLiteStatement.bindLong(1, topicRecentTable2.topicId);
        String str = topicRecentTable2.uid;
        if (str == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, str);
        }
    }
}
