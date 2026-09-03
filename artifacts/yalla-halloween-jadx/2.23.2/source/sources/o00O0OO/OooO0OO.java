package o00O0OO;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f36193OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f36194OooO0O0;

    public class OooO00o extends p110o000ooo0.o0OO00O<o00O0OO.OooO00o> {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p110o000ooo0.o0OO00O
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, o00O0OO.OooO00o oooO00o) {
            o00O0OO.OooO00o oooO00o2 = oooO00o;
            String str = oooO00o2.f36191OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = oooO00o2.f36192OooO0O0;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public OooO0OO(RoomDatabase roomDatabase) {
        this.f36193OooO00o = roomDatabase;
        this.f36194OooO0O0 = new OooO00o(roomDatabase);
    }

    @Override // o00O0OO.OooO0O0
    public final ArrayList OooO00o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f36193OooO00o;
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

    @Override // o00O0OO.OooO0O0
    public final boolean OooO0O0(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f36193OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            boolean z = false;
            if (cursorOooO0O0.moveToFirst()) {
                z = cursorOooO0O0.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // o00O0OO.OooO0O0
    public final void OooO0OO(o00O0OO.OooO00o oooO00o) {
        RoomDatabase roomDatabase = this.f36193OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f36194OooO0O0.OooO0oO(oooO00o);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // o00O0OO.OooO0O0
    public final boolean OooO0Oo(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f36193OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = o00.OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            boolean z = false;
            if (cursorOooO0O0.moveToFirst()) {
                z = cursorOooO0O0.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }
}
