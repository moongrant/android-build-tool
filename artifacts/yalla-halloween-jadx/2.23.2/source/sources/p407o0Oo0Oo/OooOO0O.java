package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import p110o000ooo0.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends o0Oo0oo<ApiErrorCodeDB> {
    public OooOO0O(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "DELETE FROM `ApiErrorCodeDB` WHERE `id` = ?";
    }

    @Override // p110o000ooo0.o0Oo0oo
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, ApiErrorCodeDB apiErrorCodeDB) {
        Integer num = apiErrorCodeDB.id;
        if (num == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindLong(1, num.intValue());
        }
    }
}
