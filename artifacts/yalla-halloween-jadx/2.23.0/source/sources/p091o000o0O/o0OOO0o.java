package p091o000o0O;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import o000O0O0.OooOOO0;
import o000O0O0.o000000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f35258OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f35259OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO f35260OooO0OO;

    public class OooO00o extends OooOOO0<o00oO0o> {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // o000O0O0.OooOOO0
        public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, o00oO0o o00oo0o2) throws Throwable {
            o00oo0o2.getClass();
            supportSQLiteStatement.bindNull(1);
            byte[] bArrOooO0O0 = androidx.work.OooO0O0.OooO0O0(null);
            if (bArrOooO0O0 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindBlob(2, bArrOooO0O0);
            }
        }
    }

    public class OooO0O0 extends o000000 {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class OooO0OO extends o000000 {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o0OOO0o(RoomDatabase roomDatabase) {
        this.f35258OooO00o = roomDatabase;
        new OooO00o(roomDatabase);
        this.f35259OooO0O0 = new OooO0O0(roomDatabase);
        this.f35260OooO0OO = new OooO0OO(roomDatabase);
    }
}
