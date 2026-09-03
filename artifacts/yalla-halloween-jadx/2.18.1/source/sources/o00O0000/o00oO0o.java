package o00O0000;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import p091o000o00o.o0000O0;
import p091o000o00o.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o implements oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f30149OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<o00Ooo> f30150OooO0O0;

    public class OooO00o extends o000OOo<o00Ooo> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, o00Ooo o00ooo2) {
            o00Ooo o00ooo3 = o00ooo2;
            String str = o00ooo3.f30147OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = o00ooo3.f30148OooO0O0;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public o00oO0o(RoomDatabase roomDatabase) {
        this.f30149OooO00o = roomDatabase;
        this.f30150OooO0O0 = new OooO00o(roomDatabase);
    }

    public final List<String> OooO00o(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        this.f30149OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30149OooO00o.OooOOO(o0000o0OooO0o);
        try {
            ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
            while (cursorOooOOO.moveToNext()) {
                arrayList.add(cursorOooOOO.getString(0));
            }
            cursorOooOOO.close();
            o0000o0OooO0o.release();
            return arrayList;
        } catch (Throwable th) {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
            throw th;
        }
    }
}
