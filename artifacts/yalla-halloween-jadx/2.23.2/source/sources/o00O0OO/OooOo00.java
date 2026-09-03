package o00O0OO;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import p110o000ooo0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f36204OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f36205OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f36206OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f36207OooO0Oo;

    public class OooO00o extends p110o000ooo0.o0OO00O<OooOOO> {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // p110o000ooo0.o0OO00O
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, OooOOO oooOOO) {
            OooOOO oooOOO2 = oooOOO;
            String str = oooOOO2.f36199OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, oooOOO2.f36200OooO0O0);
            supportSQLiteStatement.bindLong(3, oooOOO2.f36201OooO0OO);
        }
    }

    public class OooO0O0 extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    public class OooO0OO extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public OooOo00(RoomDatabase roomDatabase) {
        this.f36204OooO00o = roomDatabase;
        this.f36205OooO0O0 = new OooO00o(roomDatabase);
        this.f36206OooO0OO = new OooO0O0(roomDatabase);
        this.f36207OooO0Oo = new OooO0OO(roomDatabase);
    }

    @Override // o00O0OO.OooOOOO
    public final void OooO00o(OooOo id) {
        Intrinsics.checkNotNullParameter(id, "id");
        OooO0oO(id.f36203OooO0O0, id.f36202OooO00o);
    }

    @Override // o00O0OO.OooOOOO
    public final ArrayList OooO0O0() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        RoomDatabase roomDatabase = this.f36204OooO00o;
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

    @Override // o00O0OO.OooOOOO
    public final OooOOO OooO0OO(OooOo id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return OooO0o(id.f36203OooO0O0, id.f36202OooO00o);
    }

    @Override // o00O0OO.OooOOOO
    public final void OooO0Oo(String str) {
        RoomDatabase roomDatabase = this.f36204OooO00o;
        roomDatabase.OooO0O0();
        OooO0OO oooO0OO = this.f36207OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO0OO.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            oooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    public final OooOOO OooO0o(int i, String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        roomSQLiteQueryOooO00o.bindLong(2, i);
        RoomDatabase roomDatabase = this.f36204OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = o00.OooO00o.OooO00o(cursorOooO0O0, "work_spec_id");
            int iOooO00o2 = o00.OooO00o.OooO00o(cursorOooO0O0, "generation");
            int iOooO00o3 = o00.OooO00o.OooO00o(cursorOooO0O0, "system_id");
            OooOOO oooOOO = null;
            String string = null;
            if (cursorOooO0O0.moveToFirst()) {
                if (!cursorOooO0O0.isNull(iOooO00o)) {
                    string = cursorOooO0O0.getString(iOooO00o);
                }
                oooOOO = new OooOOO(string, cursorOooO0O0.getInt(iOooO00o2), cursorOooO0O0.getInt(iOooO00o3));
            }
            return oooOOO;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // o00O0OO.OooOOOO
    public final void OooO0o0(OooOOO oooOOO) {
        RoomDatabase roomDatabase = this.f36204OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f36205OooO0O0.OooO0oO(oooOOO);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    public final void OooO0oO(int i, String str) {
        RoomDatabase roomDatabase = this.f36204OooO00o;
        roomDatabase.OooO0O0();
        OooO0O0 oooO0O0 = this.f36206OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO0O0.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        supportSQLiteStatementOooO00o.bindLong(2, i);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            oooO0O0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }
}
