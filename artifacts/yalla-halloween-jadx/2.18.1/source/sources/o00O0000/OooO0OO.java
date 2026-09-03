package o00O0000;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import p091o000o00o.o0000O0;
import p091o000o00o.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f30120OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<o00O0000.OooO00o> f30121OooO0O0;

    public class OooO00o extends o000OOo<o00O0000.OooO00o> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, o00O0000.OooO00o oooO00o) {
            o00O0000.OooO00o oooO00o2 = oooO00o;
            String str = oooO00o2.f30118OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = oooO00o2.f30119OooO0O0;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public OooO0OO(RoomDatabase roomDatabase) {
        this.f30120OooO00o = roomDatabase;
        this.f30121OooO0O0 = new OooO00o(roomDatabase);
    }

    public final List<String> OooO00o(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        this.f30120OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30120OooO00o.OooOOO(o0000o0OooO0o);
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

    public final boolean OooO0O0(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        this.f30120OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30120OooO00o.OooOOO(o0000o0OooO0o);
        try {
            boolean z = false;
            if (cursorOooOOO.moveToFirst()) {
                z = cursorOooOOO.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }
}
