package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.ReadPostTable;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O extends o0OO00O<ReadPostTable> {
    public o0O00O(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `ReadPostTable` (`cid`,`userId`,`readPostId`) VALUES (?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, ReadPostTable readPostTable) {
        ReadPostTable readPostTable2 = readPostTable;
        supportSQLiteStatement.bindLong(1, readPostTable2.getCid());
        supportSQLiteStatement.bindLong(2, readPostTable2.getUserId());
        supportSQLiteStatement.bindLong(3, readPostTable2.getReadPostId());
    }
}
