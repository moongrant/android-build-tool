package o00O0000;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f30128OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<OooOO0O> f30129OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f30130OooO0OO;

    public class OooO00o extends o000OOo<OooOO0O> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, OooOO0O oooOO0O) {
            OooOO0O oooOO0O2 = oooOO0O;
            String str = oooOO0O2.f30126OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, oooOO0O2.f30127OooO0O0);
        }
    }

    public class OooO0O0 extends o0000OO0 {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public OooOOO(RoomDatabase roomDatabase) {
        this.f30128OooO00o = roomDatabase;
        this.f30129OooO0O0 = new OooO00o(roomDatabase);
        this.f30130OooO0OO = new OooO0O0(roomDatabase);
    }

    public final OooOO0O OooO00o(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        this.f30128OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f30128OooO00o.OooOOO(o0000o0OooO0o);
        try {
            return cursorOooOOO.moveToFirst() ? new OooOO0O(cursorOooOOO.getString(p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "work_spec_id")), cursorOooOOO.getInt(p092o000o0O.o00O0O.OooO00o(cursorOooOOO, "system_id"))) : null;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    public final void OooO0O0(OooOO0O oooOO0O) {
        this.f30128OooO00o.OooO0O0();
        this.f30128OooO00o.OooO0OO();
        try {
            this.f30129OooO0O0.OooO0oO(oooOO0O);
            this.f30128OooO00o.OooOOOO();
        } finally {
            this.f30128OooO00o.OooOO0O();
        }
    }

    public final void OooO0OO(String str) {
        this.f30128OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f30130OooO0OO.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        this.f30128OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f30128OooO00o.OooOOOO();
        } finally {
            this.f30128OooO00o.OooOO0O();
            this.f30130OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }
}
