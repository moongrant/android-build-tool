package p517o0o0O00O;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O implements o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f42137OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<SearchHistoryTable> f42138OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f42139OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f42140OooO0Oo;

    public class OooO00o extends o000OOo<SearchHistoryTable> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `SearchHistoryTable` (`uid`,`tag`,`type`,`time`) VALUES (?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
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

    public class OooO0O0 extends o0000OO0 {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Delete from SearchHistoryTable Where uid = ? and type =?";
        }
    }

    public class OooO0OO extends o0000OO0 {
        public OooO0OO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "DELETE from SearchHistoryTable Where time in(SELECT time FROM SearchHistoryTable Where uid = ? and type =? ORDER BY time desc limit ?,?)";
        }
    }

    public class OooO0o implements Callable<List<SearchHistoryTable>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f42141OooO00o;

        public OooO0o(o0000O0 o0000o1) {
            this.f42141OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final List<SearchHistoryTable> call() throws Exception {
            Cursor cursorOooOOO = o0000O0O.this.f42137OooO00o.OooOOO(this.f42141OooO00o);
            try {
                int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
                int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, ViewHierarchyConstants.TAG_KEY);
                int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "type");
                int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "time");
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    SearchHistoryTable searchHistoryTable = new SearchHistoryTable();
                    searchHistoryTable.setUid(cursorOooOOO.getLong(iOooO00o));
                    searchHistoryTable.setTag(cursorOooOOO.isNull(iOooO00o2) ? null : cursorOooOOO.getString(iOooO00o2));
                    searchHistoryTable.setType(cursorOooOOO.getInt(iOooO00o3));
                    searchHistoryTable.setTime(cursorOooOOO.getLong(iOooO00o4));
                    arrayList.add(searchHistoryTable);
                }
                return arrayList;
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f42141OooO00o.release();
        }
    }

    public o0000O0O(RoomDatabase roomDatabase) {
        this.f42137OooO00o = roomDatabase;
        this.f42138OooO0O0 = new OooO00o(roomDatabase);
        new AtomicBoolean(false);
        this.f42139OooO0OO = new OooO0O0(roomDatabase);
        new AtomicBoolean(false);
        this.f42140OooO0Oo = new OooO0OO(roomDatabase);
    }

    @Override // p517o0o0O00O.o0000O0
    public final LiveData<List<SearchHistoryTable>> OooO00o(long j, int i) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from SearchHistoryTable Where uid = ? and type = ? Order by time DESC", 2);
        o0000o0OooO0o.bindLong(1, j);
        o0000o0OooO0o.bindLong(2, i);
        return this.f42137OooO00o.f9295OooO0o0.OooO0OO(new String[]{"SearchHistoryTable"}, new OooO0o(o0000o0OooO0o));
    }

    @Override // p517o0o0O00O.o0000O0
    public final void OooO0O0(SearchHistoryTable searchHistoryTable) {
        this.f42137OooO00o.OooO0O0();
        this.f42137OooO00o.OooO0OO();
        try {
            this.f42138OooO0O0.OooO0oO(searchHistoryTable);
            this.f42137OooO00o.OooOOOO();
        } finally {
            this.f42137OooO00o.OooOO0O();
        }
    }

    @Override // p517o0o0O00O.o0000O0
    public final void OooO0OO(long j, int i) {
        this.f42137OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f42139OooO0OO.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, i);
        this.f42137OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f42137OooO00o.OooOOOO();
        } finally {
            this.f42137OooO00o.OooOO0O();
            this.f42139OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p517o0o0O00O.o0000O0
    public final void OooO0Oo(long j, int i, int i2, int i3) {
        this.f42137OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f42140OooO0Oo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, i);
        supportSQLiteStatementOooO00o.bindLong(3, i2);
        supportSQLiteStatementOooO00o.bindLong(4, i3);
        this.f42137OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f42137OooO00o.OooOOOO();
        } finally {
            this.f42137OooO00o.OooOO0O();
            this.f42140OooO0Oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }
}
