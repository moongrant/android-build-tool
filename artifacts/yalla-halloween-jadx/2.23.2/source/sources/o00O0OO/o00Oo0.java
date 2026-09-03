package o00O0OO;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import p110o000ooo0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f36212OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f36213OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO f36214OooO0OO;

    public class OooO00o extends p110o000ooo0.o0OO00O<o0OoOo0> {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p110o000ooo0.o0OO00O
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, o0OoOo0 o0oooo1) throws Throwable {
            o0oooo1.getClass();
            supportSQLiteStatement.bindNull(1);
            byte[] bArrOooO0OO = androidx.work.OooO0O0.OooO0OO(null);
            if (bArrOooO0OO == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindBlob(2, bArrOooO0OO);
            }
        }
    }

    public class OooO0O0 extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class OooO0OO extends o000Oo0 {
        @Override // p110o000ooo0.o000Oo0
        public final String OooO0OO() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o00Oo0(RoomDatabase roomDatabase) {
        this.f36212OooO00o = roomDatabase;
        new OooO00o(roomDatabase);
        this.f36213OooO0O0 = new OooO0O0(roomDatabase);
        this.f36214OooO0OO = new OooO0OO(roomDatabase);
    }

    @Override // o00O0OO.o00O0O
    public final void OooO00o(String str) {
        RoomDatabase roomDatabase = this.f36212OooO00o;
        roomDatabase.OooO0O0();
        OooO0O0 oooO0O0 = this.f36213OooO0O0;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO0O0.OooO00o();
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
            oooO0O0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // o00O0OO.o00O0O
    public final void OooO0O0() {
        RoomDatabase roomDatabase = this.f36212OooO00o;
        roomDatabase.OooO0O0();
        OooO0OO oooO0OO = this.f36214OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO0OO.OooO00o();
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            oooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }
}
