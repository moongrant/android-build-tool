package o00O0OO;

import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends p110o000ooo0.o0OO00O<OooO0o> {
    public OooOO0(WorkDatabase workDatabase) {
        super(workDatabase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, OooO0o oooO0o) {
        OooO0o oooO0o2 = oooO0o;
        String str = oooO0o2.f36195OooO00o;
        if (str == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindString(1, str);
        }
        Long l = oooO0o2.f36196OooO0O0;
        if (l == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindLong(2, l.longValue());
        }
    }
}
