package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import o000O0O0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o000 extends OooOO0O<SearchHistoryTable> {
    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "DELETE FROM `SearchHistoryTable` WHERE `uid` = ? AND `tag` = ? AND `type` = ?";
    }

    @Override // o000O0O0.OooOO0O
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, SearchHistoryTable searchHistoryTable) {
        SearchHistoryTable searchHistoryTable2 = searchHistoryTable;
        supportSQLiteStatement.bindLong(1, searchHistoryTable2.getUid());
        if (searchHistoryTable2.getTag() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, searchHistoryTable2.getTag());
        }
        supportSQLiteStatement.bindLong(3, searchHistoryTable2.getType());
    }
}
