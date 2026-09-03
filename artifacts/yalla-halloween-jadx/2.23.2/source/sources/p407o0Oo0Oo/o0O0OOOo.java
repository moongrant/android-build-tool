package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends o0OO00O<SearchHistoryTable> {
    public o0O0OOOo(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `SearchHistoryTable` (`uid`,`tag`,`type`,`time`) VALUES (?,?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, SearchHistoryTable searchHistoryTable) {
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
