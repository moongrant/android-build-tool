package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import o000O0O0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends OooOO0O<ApiErrorCodeDB> {
    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "DELETE FROM `ApiErrorCodeDB` WHERE `id` = ?";
    }

    @Override // o000O0O0.OooOO0O
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, ApiErrorCodeDB apiErrorCodeDB) {
        Integer num = apiErrorCodeDB.id;
        if (num == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindLong(1, num.intValue());
        }
    }
}
