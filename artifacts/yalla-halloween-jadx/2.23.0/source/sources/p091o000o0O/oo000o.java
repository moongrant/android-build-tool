package p091o000o0O;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f35281OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f35282OooO0O0;

    public class OooO00o extends OooOOO0<o00Oo0> {
        @Override // o000O0O0.o000000
        public final String OooO0O0() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // o000O0O0.OooOOO0
        public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, o00Oo0 o00oo1) {
            o00Oo0 o00oo2 = o00oo1;
            String str = o00oo2.f35254OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = o00oo2.f35255OooO0O0;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public oo000o(RoomDatabase roomDatabase) {
        this.f35281OooO00o = roomDatabase;
        this.f35282OooO0O0 = new OooO00o(roomDatabase);
    }
}
