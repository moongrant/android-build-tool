package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOoOOO0 extends OooOOO0<SearchHistoryTable> {
    public oOOoOOO0(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `SearchHistoryTable` (`uid`,`tag`,`type`,`time`) VALUES (?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, SearchHistoryTable searchHistoryTable) {
        SearchHistoryTable searchHistoryTable2 = searchHistoryTable;
        supportSQLiteStatement.bindLong(1, searchHistoryTable2.getUid());
        if (searchHistoryTable2.getTag() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, searchHistoryTable2.getTag());
        }
        supportSQLiteStatement.bindLong(3, searchHistoryTable2.getType());
        supportSQLiteStatement.bindLong(4, searchHistoryTable2.getTime());
    }
}
