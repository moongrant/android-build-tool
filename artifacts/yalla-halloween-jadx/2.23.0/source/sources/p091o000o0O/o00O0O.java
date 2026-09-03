package p091o000o0O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.TreeMap;
import o000O0O0.OooOOO0;
import o000O0O0.o000000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f35251OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f35252OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f35253OooO0OO;

    public class OooO00o extends OooOOO0<o000oOoO> {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // o000O0O0.OooOOO0
        public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, o000oOoO o000oooo2) {
            o000oOoO o000oooo3 = o000oooo2;
            String str = o000oooo3.f35249OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, o000oooo3.f35250OooO0O0);
        }
    }

    public class OooO0O0 extends o000000 {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public o00O0O(RoomDatabase roomDatabase) {
        this.f35251OooO00o = roomDatabase;
        this.f35252OooO0O0 = new OooO00o(roomDatabase);
        this.f35253OooO0OO = new OooO0O0(roomDatabase);
    }

    public final o000oOoO OooO00o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f35251OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o000O.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return cursorOooO0O0.moveToFirst() ? new o000oOoO(cursorOooO0O0.getString(o000O.OooO00o.OooO00o(cursorOooO0O0, "work_spec_id")), cursorOooO0O0.getInt(o000O.OooO00o.OooO00o(cursorOooO0O0, "system_id"))) : null;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    public final void OooO0O0(String str) {
        RoomDatabase roomDatabase = this.f35251OooO00o;
        roomDatabase.OooO0O0();
        OooO0O0 oooO0O0 = this.f35253OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO0O0.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            oooO0O0.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }
}
