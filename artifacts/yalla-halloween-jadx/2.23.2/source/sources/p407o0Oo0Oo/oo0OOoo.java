package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import p110o000ooo0.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0OOoo extends o0Oo0oo<SearchHistoryTable> {
    public oo0OOoo(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "DELETE FROM `SearchHistoryTable` WHERE `uid` = ? AND `tag` = ? AND `type` = ?";
    }

    @Override // p110o000ooo0.o0Oo0oo
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, SearchHistoryTable searchHistoryTable) {
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
