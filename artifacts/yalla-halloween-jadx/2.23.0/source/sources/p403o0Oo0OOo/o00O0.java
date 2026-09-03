package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import o000O0O0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0 extends OooOO0O<ApiErrorCodeDB> {
    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "UPDATE OR ABORT `ApiErrorCodeDB` SET `id` = ?,`Code` = ?,`MessgeEn` = ?,`MessgeME` = ?,`MessgeTr` = ?,`MessgeIn` = ?,`MessgePT` = ?,`MessgeES` = ?,`MessgeHi` = ?,`MessgeUr` = ? WHERE `id` = ?";
    }

    @Override // o000O0O0.OooOO0O
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, ApiErrorCodeDB apiErrorCodeDB) {
        ApiErrorCodeDB apiErrorCodeDB2 = apiErrorCodeDB;
        Integer num = apiErrorCodeDB2.id;
        if (num == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindLong(1, num.intValue());
        }
        String str = apiErrorCodeDB2.Code;
        if (str == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, str);
        }
        String str2 = apiErrorCodeDB2.MessgeEn;
        if (str2 == null) {
            supportSQLiteStatement.bindNull(3);
        } else {
            supportSQLiteStatement.bindString(3, str2);
        }
        String str3 = apiErrorCodeDB2.MessgeME;
        if (str3 == null) {
            supportSQLiteStatement.bindNull(4);
        } else {
            supportSQLiteStatement.bindString(4, str3);
        }
        String str4 = apiErrorCodeDB2.MessgeTr;
        if (str4 == null) {
            supportSQLiteStatement.bindNull(5);
        } else {
            supportSQLiteStatement.bindString(5, str4);
        }
        String str5 = apiErrorCodeDB2.MessgeIn;
        if (str5 == null) {
            supportSQLiteStatement.bindNull(6);
        } else {
            supportSQLiteStatement.bindString(6, str5);
        }
        String str6 = apiErrorCodeDB2.MessgePT;
        if (str6 == null) {
            supportSQLiteStatement.bindNull(7);
        } else {
            supportSQLiteStatement.bindString(7, str6);
        }
        String str7 = apiErrorCodeDB2.MessgeES;
        if (str7 == null) {
            supportSQLiteStatement.bindNull(8);
        } else {
            supportSQLiteStatement.bindString(8, str7);
        }
        String str8 = apiErrorCodeDB2.MessgeHi;
        if (str8 == null) {
            supportSQLiteStatement.bindNull(9);
        } else {
            supportSQLiteStatement.bindString(9, str8);
        }
        String str9 = apiErrorCodeDB2.MessgeUr;
        if (str9 == null) {
            supportSQLiteStatement.bindNull(10);
        } else {
            supportSQLiteStatement.bindString(10, str9);
        }
        Integer num2 = apiErrorCodeDB2.id;
        if (num2 == null) {
            supportSQLiteStatement.bindNull(11);
        } else {
            supportSQLiteStatement.bindLong(11, num2.intValue());
        }
    }
}
