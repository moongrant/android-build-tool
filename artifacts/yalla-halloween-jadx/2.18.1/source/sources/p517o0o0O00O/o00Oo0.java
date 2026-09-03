package p517o0o0O00O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p091o000o00o.o0000O0;
import p091o000o00o.o000OOo;
import p091o000o00o.o0O0O00;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f42150OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<ApiErrorCodeDB> f42151OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00<ApiErrorCodeDB> f42152OooO0OO;

    public class OooO00o extends o000OOo<ApiErrorCodeDB> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `ApiErrorCodeDB` (`id`,`Code`,`MessgeEn`,`MessgeME`,`MessgeTr`,`MessgeIn`,`MessgePT`,`MessgeES`,`MessgeHi`,`MessgeUr`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, ApiErrorCodeDB apiErrorCodeDB) {
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
        }
    }

    public class OooO0O0 extends o0O0O00<ApiErrorCodeDB> {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "UPDATE OR ABORT `ApiErrorCodeDB` SET `id` = ?,`Code` = ?,`MessgeEn` = ?,`MessgeME` = ?,`MessgeTr` = ?,`MessgeIn` = ?,`MessgePT` = ?,`MessgeES` = ?,`MessgeHi` = ?,`MessgeUr` = ? WHERE `id` = ?";
        }

        @Override // p091o000o00o.o0O0O00
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, ApiErrorCodeDB apiErrorCodeDB) {
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

    public o00Oo0(RoomDatabase roomDatabase) {
        this.f42150OooO00o = roomDatabase;
        this.f42151OooO0O0 = new OooO00o(roomDatabase);
        new AtomicBoolean(false);
        this.f42152OooO0OO = new OooO0O0(roomDatabase);
        new AtomicBoolean(false);
    }

    @Override // p517o0o0O00O.o00O0O
    public final void OooO00o(ApiErrorCodeDB apiErrorCodeDB) {
        this.f42150OooO00o.OooO0O0();
        this.f42150OooO00o.OooO0OO();
        try {
            this.f42152OooO0OO.OooO0o(apiErrorCodeDB);
            this.f42150OooO00o.OooOOOO();
        } finally {
            this.f42150OooO00o.OooOO0O();
        }
    }

    @Override // p517o0o0O00O.o00O0O
    public final List OooO0O0() {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from ApiErrorCodeDB  limit ?", 1);
        o0000o0OooO0o.bindLong(1, 1);
        this.f42150OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42150OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "Code");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "MessgeEn");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "MessgeME");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "MessgeTr");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "MessgeIn");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "MessgePT");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "MessgeES");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "MessgeHi");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "MessgeUr");
            ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
            while (cursorOooOOO.moveToNext()) {
                ApiErrorCodeDB apiErrorCodeDB = new ApiErrorCodeDB();
                if (cursorOooOOO.isNull(iOooO00o)) {
                    apiErrorCodeDB.id = null;
                } else {
                    apiErrorCodeDB.id = Integer.valueOf(cursorOooOOO.getInt(iOooO00o));
                }
                if (cursorOooOOO.isNull(iOooO00o2)) {
                    apiErrorCodeDB.Code = null;
                } else {
                    apiErrorCodeDB.Code = cursorOooOOO.getString(iOooO00o2);
                }
                if (cursorOooOOO.isNull(iOooO00o3)) {
                    apiErrorCodeDB.MessgeEn = null;
                } else {
                    apiErrorCodeDB.MessgeEn = cursorOooOOO.getString(iOooO00o3);
                }
                if (cursorOooOOO.isNull(iOooO00o4)) {
                    apiErrorCodeDB.MessgeME = null;
                } else {
                    apiErrorCodeDB.MessgeME = cursorOooOOO.getString(iOooO00o4);
                }
                if (cursorOooOOO.isNull(iOooO00o5)) {
                    apiErrorCodeDB.MessgeTr = null;
                } else {
                    apiErrorCodeDB.MessgeTr = cursorOooOOO.getString(iOooO00o5);
                }
                if (cursorOooOOO.isNull(iOooO00o6)) {
                    apiErrorCodeDB.MessgeIn = null;
                } else {
                    apiErrorCodeDB.MessgeIn = cursorOooOOO.getString(iOooO00o6);
                }
                if (cursorOooOOO.isNull(iOooO00o7)) {
                    apiErrorCodeDB.MessgePT = null;
                } else {
                    apiErrorCodeDB.MessgePT = cursorOooOOO.getString(iOooO00o7);
                }
                if (cursorOooOOO.isNull(iOooO00o8)) {
                    apiErrorCodeDB.MessgeES = null;
                } else {
                    apiErrorCodeDB.MessgeES = cursorOooOOO.getString(iOooO00o8);
                }
                if (cursorOooOOO.isNull(iOooO00o9)) {
                    apiErrorCodeDB.MessgeHi = null;
                } else {
                    apiErrorCodeDB.MessgeHi = cursorOooOOO.getString(iOooO00o9);
                }
                if (cursorOooOOO.isNull(iOooO00o10)) {
                    apiErrorCodeDB.MessgeUr = null;
                } else {
                    apiErrorCodeDB.MessgeUr = cursorOooOOO.getString(iOooO00o10);
                }
                arrayList.add(apiErrorCodeDB);
            }
            return arrayList;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p517o0o0O00O.o00O0O
    public final long OooO0OO(ApiErrorCodeDB apiErrorCodeDB) {
        this.f42150OooO00o.OooO0O0();
        this.f42150OooO00o.OooO0OO();
        try {
            long jOooO0oo = this.f42151OooO0O0.OooO0oo(apiErrorCodeDB);
            this.f42150OooO00o.OooOOOO();
            return jOooO0oo;
        } finally {
            this.f42150OooO00o.OooOO0O();
        }
    }

    @Override // p517o0o0O00O.o00O0O
    public final ApiErrorCodeDB OooO0Oo(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from ApiErrorCodeDB Where Code=?", 1);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        this.f42150OooO00o.OooO0O0();
        ApiErrorCodeDB apiErrorCodeDB = null;
        Cursor cursorOooOOO = this.f42150OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "Code");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "MessgeEn");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "MessgeME");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "MessgeTr");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "MessgeIn");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "MessgePT");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "MessgeES");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "MessgeHi");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "MessgeUr");
            if (cursorOooOOO.moveToFirst()) {
                ApiErrorCodeDB apiErrorCodeDB2 = new ApiErrorCodeDB();
                if (cursorOooOOO.isNull(iOooO00o)) {
                    apiErrorCodeDB2.id = null;
                } else {
                    apiErrorCodeDB2.id = Integer.valueOf(cursorOooOOO.getInt(iOooO00o));
                }
                if (cursorOooOOO.isNull(iOooO00o2)) {
                    apiErrorCodeDB2.Code = null;
                } else {
                    apiErrorCodeDB2.Code = cursorOooOOO.getString(iOooO00o2);
                }
                if (cursorOooOOO.isNull(iOooO00o3)) {
                    apiErrorCodeDB2.MessgeEn = null;
                } else {
                    apiErrorCodeDB2.MessgeEn = cursorOooOOO.getString(iOooO00o3);
                }
                if (cursorOooOOO.isNull(iOooO00o4)) {
                    apiErrorCodeDB2.MessgeME = null;
                } else {
                    apiErrorCodeDB2.MessgeME = cursorOooOOO.getString(iOooO00o4);
                }
                if (cursorOooOOO.isNull(iOooO00o5)) {
                    apiErrorCodeDB2.MessgeTr = null;
                } else {
                    apiErrorCodeDB2.MessgeTr = cursorOooOOO.getString(iOooO00o5);
                }
                if (cursorOooOOO.isNull(iOooO00o6)) {
                    apiErrorCodeDB2.MessgeIn = null;
                } else {
                    apiErrorCodeDB2.MessgeIn = cursorOooOOO.getString(iOooO00o6);
                }
                if (cursorOooOOO.isNull(iOooO00o7)) {
                    apiErrorCodeDB2.MessgePT = null;
                } else {
                    apiErrorCodeDB2.MessgePT = cursorOooOOO.getString(iOooO00o7);
                }
                if (cursorOooOOO.isNull(iOooO00o8)) {
                    apiErrorCodeDB2.MessgeES = null;
                } else {
                    apiErrorCodeDB2.MessgeES = cursorOooOOO.getString(iOooO00o8);
                }
                if (cursorOooOOO.isNull(iOooO00o9)) {
                    apiErrorCodeDB2.MessgeHi = null;
                } else {
                    apiErrorCodeDB2.MessgeHi = cursorOooOOO.getString(iOooO00o9);
                }
                if (cursorOooOOO.isNull(iOooO00o10)) {
                    apiErrorCodeDB2.MessgeUr = null;
                } else {
                    apiErrorCodeDB2.MessgeUr = cursorOooOOO.getString(iOooO00o10);
                }
                apiErrorCodeDB = apiErrorCodeDB2;
            }
            return apiErrorCodeDB;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }
}
