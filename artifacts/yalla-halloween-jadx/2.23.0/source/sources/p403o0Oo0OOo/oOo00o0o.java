package p403o0Oo0OOo;

import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import java.util.TreeMap;
import o000O0O0.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o0o implements oO00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44654OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oOOoOOO0 f44655OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO00o00 f44656OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO00o00O f44657OooO0Oo;

    public oOo00o0o(YlAppDataBase ylAppDataBase) {
        this.f44654OooO00o = ylAppDataBase;
        this.f44655OooO0O0 = new oOOoOOO0(ylAppDataBase);
        new oO00o000(ylAppDataBase);
        this.f44656OooO0OO = new oO00o00(ylAppDataBase);
        new oO0OOO00(ylAppDataBase);
        this.f44657OooO0Oo = new oO00o00O(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.oO00Oo0
    public final void OooO00o(SearchHistoryTable searchHistoryTable) {
        RoomDatabase roomDatabase = this.f44654OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44655OooO0O0.OooO0o(searchHistoryTable);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.oO00Oo0
    public final void OooO0O0(long j, int i, int i2, int i3) {
        RoomDatabase roomDatabase = this.f44654OooO00o;
        roomDatabase.OooO0O0();
        oO00o00O oo00o00o = this.f44657OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oo00o00o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, i);
        supportSQLiteStatementOooO00o.bindLong(3, i2);
        supportSQLiteStatementOooO00o.bindLong(4, i3);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            oo00o00o.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.oO00Oo0
    public final void OooO0OO(int i, long j) {
        RoomDatabase roomDatabase = this.f44654OooO00o;
        roomDatabase.OooO0O0();
        oO00o00 oo00o00 = this.f44656OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oo00o00.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, i);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            oo00o00.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.oO00Oo0
    public final o0O0O00 OooO0Oo(int i, long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from SearchHistoryTable Where uid = ? and type = ? Order by time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, i);
        return this.f44654OooO00o.f7889OooO0o0.OooO0O0(new String[]{"SearchHistoryTable"}, new oO00o0(this, roomSQLiteQueryOooO00o));
    }
}
