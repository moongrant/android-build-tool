package o00O0000;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import p091o000o00o.o0000O0;
import p091o000o00o.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f30124OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<OooO0o> f30125OooO0O0;

    public class OooO00o extends o000OOo<OooO0o> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, OooO0o oooO0o) {
            OooO0o oooO0o2 = oooO0o;
            String str = oooO0o2.f30122OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            Long l = oooO0o2.f30123OooO0O0;
            if (l == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, l.longValue());
            }
        }
    }

    public OooOO0(RoomDatabase roomDatabase) {
        this.f30124OooO00o = roomDatabase;
        this.f30125OooO0O0 = new OooO00o(roomDatabase);
    }

    public final Long OooO00o(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT long_value FROM Preference where `key`=?", 1);
        o0000o0OooO0o.bindString(1, str);
        this.f30124OooO00o.OooO0O0();
        Long lValueOf = null;
        Cursor cursorOooOOO = this.f30124OooO00o.OooOOO(o0000o0OooO0o);
        try {
            if (cursorOooOOO.moveToFirst() && !cursorOooOOO.isNull(0)) {
                lValueOf = Long.valueOf(cursorOooOOO.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    public final void OooO0O0(OooO0o oooO0o) {
        this.f30124OooO00o.OooO0O0();
        this.f30124OooO00o.OooO0OO();
        try {
            this.f30125OooO0O0.OooO0oO(oooO0o);
            this.f30124OooO00o.OooOOOO();
        } finally {
            this.f30124OooO00o.OooOO0O();
        }
    }
}
