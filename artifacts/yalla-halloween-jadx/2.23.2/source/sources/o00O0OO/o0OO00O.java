package o00O0OO;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import p110o000ooo0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O implements o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f36248OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f36249OooO0O0;

    public class OooO00o extends p110o000ooo0.o0OO00O<o0OOO0o> {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p110o000ooo0.o0OO00O
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, o0OOO0o o0ooo0o2) {
            o0OOO0o o0ooo0o3 = o0ooo0o2;
            String str = o0ooo0o3.f36250OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = o0ooo0o3.f36251OooO0O0;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public class OooO0O0 extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public o0OO00O(RoomDatabase roomDatabase) {
        this.f36248OooO00o = roomDatabase;
        this.f36249OooO0O0 = new OooO00o(roomDatabase);
        new OooO0O0(roomDatabase);
    }

    @Override // o00O0OO.o0Oo0oo
    public final ArrayList OooO00o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f36248OooO00o;
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

    @Override // o00O0OO.o0Oo0oo
    public final void OooO0O0(String id, Set<String> tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            OooO0OO(new o0OOO0o((String) it.next(), id));
        }
    }

    public final void OooO0OO(o0OOO0o o0ooo0o2) {
        RoomDatabase roomDatabase = this.f36248OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f36249OooO0O0.OooO0oO(o0ooo0o2);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }
}
