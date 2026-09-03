package p091o000o0O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.TreeMap;
import o000O.OooO0O0;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f35241OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f35242OooO0O0;

    public class OooO00o extends OooOOO0<OooOo> {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // o000O0O0.OooOOO0
        public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, OooOo oooOo) {
            OooOo oooOo2 = oooOo;
            String str = oooOo2.f35237OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            Long l = oooOo2.f35238OooO0O0;
            if (l == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, l.longValue());
            }
        }
    }

    public Oooo0(RoomDatabase roomDatabase) {
        this.f35241OooO00o = roomDatabase;
        this.f35242OooO0O0 = new OooO00o(roomDatabase);
    }

    public final Long OooO00o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT long_value FROM Preference where `key`=?");
        roomSQLiteQueryOooO00o.bindString(1, str);
        RoomDatabase roomDatabase = this.f35241OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            return (!cursorOooO0O0.moveToFirst() || cursorOooO0O0.isNull(0)) ? null : Long.valueOf(cursorOooO0O0.getLong(0));
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    public final void OooO0O0(OooOo oooOo) {
        RoomDatabase roomDatabase = this.f35241OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f35242OooO0O0.OooO0o(oooOo);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }
}
