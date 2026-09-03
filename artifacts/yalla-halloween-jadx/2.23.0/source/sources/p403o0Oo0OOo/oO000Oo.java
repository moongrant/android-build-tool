package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.ReadPostTable;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo extends OooOOO0<ReadPostTable> {
    public oO000Oo(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `ReadPostTable` (`cid`,`userId`,`readPostId`) VALUES (?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, ReadPostTable readPostTable) {
        ReadPostTable readPostTable2 = readPostTable;
        supportSQLiteStatement.bindLong(1, readPostTable2.getCid());
        supportSQLiteStatement.bindLong(2, readPostTable2.getUserId());
        supportSQLiteStatement.bindLong(3, readPostTable2.getReadPostId());
    }
}
