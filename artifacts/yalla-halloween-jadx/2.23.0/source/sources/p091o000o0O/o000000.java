package p091o000o0O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.TreeMap;
import o000O.OooO0O0;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 implements o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f35243OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f35244OooO0O0;

    public class OooO00o extends OooOOO0<o0O0O00> {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // o000O0O0.OooOOO0
        public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, o0O0O00 o0o0o00) {
            o0O0O00 o0o0o01 = o0o0o00;
            String str = o0o0o01.f35256OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = o0o0o01.f35257OooO0O0;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public o000000(RoomDatabase roomDatabase) {
        this.f35243OooO00o = roomDatabase;
        this.f35244OooO0O0 = new OooO00o(roomDatabase);
    }

    public final ArrayList OooO00o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f35243OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
            while (cursorOooO0O0.moveToNext()) {
                arrayList.add(cursorOooO0O0.getString(0));
            }
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
            return arrayList;
        } catch (Throwable th) {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
            throw th;
        }
    }
}
