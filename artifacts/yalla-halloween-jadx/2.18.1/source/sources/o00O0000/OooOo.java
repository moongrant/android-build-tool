package o00O0000;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import p091o000o00o.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo implements OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f30133OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<OooOOOO> f30134OooO0O0;

    public class OooO00o extends o000OOo<OooOOOO> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, OooOOOO oooOOOO) {
            OooOOOO oooOOOO2 = oooOOOO;
            String str = oooOOOO2.f30131OooO00o;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = oooOOOO2.f30132OooO0O0;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public OooOo(RoomDatabase roomDatabase) {
        this.f30133OooO00o = roomDatabase;
        this.f30134OooO0O0 = new OooO00o(roomDatabase);
    }
}
