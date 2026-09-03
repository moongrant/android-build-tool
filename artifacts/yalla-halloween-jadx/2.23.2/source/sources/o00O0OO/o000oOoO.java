package o00O0OO;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f36210OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f36211OooO0O0;

    public class OooO00o extends p110o000ooo0.o0OO00O<Oooo000> {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p110o000ooo0.o0OO00O
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, Oooo000 oooo000) {
            Oooo000 oooo001 = oooo000;
            String str = oooo001.f36208OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = oooo001.f36209OooO0O0;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public o000oOoO(RoomDatabase roomDatabase) {
        this.f36210OooO00o = roomDatabase;
        this.f36211OooO0O0 = new OooO00o(roomDatabase);
    }

    @Override // o00O0OO.Oooo0
    public final ArrayList OooO00o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT name FROM workname WHERE work_spec_id=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f36210OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
            while (cursorOooO0O0.moveToNext()) {
                arrayList.add(cursorOooO0O0.isNull(0) ? null : cursorOooO0O0.getString(0));
            }
            return arrayList;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // o00O0OO.Oooo0
    public final void OooO0O0(Oooo000 oooo000) {
        RoomDatabase roomDatabase = this.f36210OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f36211OooO0O0.OooO0oO(oooo000);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }
}
