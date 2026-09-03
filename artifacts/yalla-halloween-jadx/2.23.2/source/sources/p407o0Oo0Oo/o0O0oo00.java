package p407o0Oo0Oo;

import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import java.util.TreeMap;
import p110o000ooo0.o000O000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 implements o0O0OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f45830OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0OOOo f45831OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0o000 f45832OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0o0 f45833OooO0Oo;

    public o0O0oo00(YlAppDataBase ylAppDataBase) {
        this.f45830OooO00o = ylAppDataBase;
        this.f45831OooO0O0 = new o0O0OOOo(ylAppDataBase);
        new oo0OOoo(ylAppDataBase);
        this.f45832OooO0OO = new o0O0o000(ylAppDataBase);
        new o0O0o00O(ylAppDataBase);
        this.f45833OooO0Oo = new o0O0o0(ylAppDataBase);
    }

    @Override // p407o0Oo0Oo.o0O0OOO0
    public final void OooO00o(SearchHistoryTable searchHistoryTable) {
        RoomDatabase roomDatabase = this.f45830OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f45831OooO0O0.OooO0oO(searchHistoryTable);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p407o0Oo0Oo.o0O0OOO0
    public final void OooO0O0(long j, int i, int i2, int i3) {
        RoomDatabase roomDatabase = this.f45830OooO00o;
        roomDatabase.OooO0O0();
        o0O0o0 o0o0o0 = this.f45833OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o0o0.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, i);
        supportSQLiteStatementOooO00o.bindLong(3, i2);
        supportSQLiteStatementOooO00o.bindLong(4, i3);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0o0o0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o0O0OOO0
    public final void OooO0OO(int i, long j) {
        RoomDatabase roomDatabase = this.f45830OooO00o;
        roomDatabase.OooO0O0();
        o0O0o000 o0o0o000 = this.f45832OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o0o000.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, i);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0o0o000.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o0O0OOO0
    public final o000O000 OooO0Oo(int i, long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "Select * from SearchHistoryTable Where uid = ? and type = ? Order by time DESC");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, i);
        return this.f45830OooO00o.f10983OooO0o0.OooO0O0(new String[]{"SearchHistoryTable"}, new o0oOo0O0(this, roomSQLiteQueryOooO00o));
    }
}
