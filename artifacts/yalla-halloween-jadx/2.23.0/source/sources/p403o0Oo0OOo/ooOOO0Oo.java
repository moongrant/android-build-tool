package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import o000O0O0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOO0Oo extends OooOO0O<TopicRecentTable> {
    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "DELETE FROM `TopicRecentTable` WHERE `topic_id` = ? AND `uid` = ?";
    }

    @Override // o000O0O0.OooOO0O
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, TopicRecentTable topicRecentTable) {
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
