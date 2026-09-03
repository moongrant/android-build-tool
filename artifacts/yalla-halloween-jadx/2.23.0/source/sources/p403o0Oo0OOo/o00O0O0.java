package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import java.util.ArrayList;
import java.util.TreeMap;
import o000O.OooO00o;
import o000O.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 implements o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44526OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O00o0 f44527OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0 f44528OooO0OO;

    public o00O0O0(YlAppDataBase ylAppDataBase) {
        this.f44526OooO00o = ylAppDataBase;
        this.f44527OooO0O0 = new o00O00o0(ylAppDataBase);
        new oo00o(ylAppDataBase);
        this.f44528OooO0OO = new o00O0(ylAppDataBase);
        new o00O0O00(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.o00O00OO
    public final void OooO00o(ApiErrorCodeDB apiErrorCodeDB) {
        RoomDatabase roomDatabase = this.f44526OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44528OooO0OO.OooO0o0(apiErrorCodeDB);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.o00O00OO
    public final ArrayList OooO0O0() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from ApiErrorCodeDB  limit ?");
        roomSQLiteQueryOooO00o.bindLong(1, 1);
        RoomDatabase roomDatabase = this.f44526OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "Code");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "MessgeEn");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "MessgeME");
            int iOooO00o5 = OooO00o.OooO00o(cursorOooO0O0, "MessgeTr");
            int iOooO00o6 = OooO00o.OooO00o(cursorOooO0O0, "MessgeIn");
            int iOooO00o7 = OooO00o.OooO00o(cursorOooO0O0, "MessgePT");
            int iOooO00o8 = OooO00o.OooO00o(cursorOooO0O0, "MessgeES");
            int iOooO00o9 = OooO00o.OooO00o(cursorOooO0O0, "MessgeHi");
            int iOooO00o10 = OooO00o.OooO00o(cursorOooO0O0, "MessgeUr");
            ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
            while (cursorOooO0O0.moveToNext()) {
                ApiErrorCodeDB apiErrorCodeDB = new ApiErrorCodeDB();
                if (cursorOooO0O0.isNull(iOooO00o)) {
                    apiErrorCodeDB.id = null;
                } else {
                    apiErrorCodeDB.id = Integer.valueOf(cursorOooO0O0.getInt(iOooO00o));
                }
                if (cursorOooO0O0.isNull(iOooO00o2)) {
                    apiErrorCodeDB.Code = null;
                } else {
                    apiErrorCodeDB.Code = cursorOooO0O0.getString(iOooO00o2);
                }
                if (cursorOooO0O0.isNull(iOooO00o3)) {
                    apiErrorCodeDB.MessgeEn = null;
                } else {
                    apiErrorCodeDB.MessgeEn = cursorOooO0O0.getString(iOooO00o3);
                }
                if (cursorOooO0O0.isNull(iOooO00o4)) {
                    apiErrorCodeDB.MessgeME = null;
                } else {
                    apiErrorCodeDB.MessgeME = cursorOooO0O0.getString(iOooO00o4);
                }
                if (cursorOooO0O0.isNull(iOooO00o5)) {
                    apiErrorCodeDB.MessgeTr = null;
                } else {
                    apiErrorCodeDB.MessgeTr = cursorOooO0O0.getString(iOooO00o5);
                }
                if (cursorOooO0O0.isNull(iOooO00o6)) {
                    apiErrorCodeDB.MessgeIn = null;
                } else {
                    apiErrorCodeDB.MessgeIn = cursorOooO0O0.getString(iOooO00o6);
                }
                if (cursorOooO0O0.isNull(iOooO00o7)) {
                    apiErrorCodeDB.MessgePT = null;
                } else {
                    apiErrorCodeDB.MessgePT = cursorOooO0O0.getString(iOooO00o7);
                }
                if (cursorOooO0O0.isNull(iOooO00o8)) {
                    apiErrorCodeDB.MessgeES = null;
                } else {
                    apiErrorCodeDB.MessgeES = cursorOooO0O0.getString(iOooO00o8);
                }
                if (cursorOooO0O0.isNull(iOooO00o9)) {
                    apiErrorCodeDB.MessgeHi = null;
                } else {
                    apiErrorCodeDB.MessgeHi = cursorOooO0O0.getString(iOooO00o9);
                }
                if (cursorOooO0O0.isNull(iOooO00o10)) {
                    apiErrorCodeDB.MessgeUr = null;
                } else {
                    apiErrorCodeDB.MessgeUr = cursorOooO0O0.getString(iOooO00o10);
                }
                arrayList.add(apiErrorCodeDB);
            }
            return arrayList;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p403o0Oo0OOo.o00O00OO
    public final ApiErrorCodeDB OooO0OO(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from ApiErrorCodeDB Where Code=?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f44526OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "Code");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "MessgeEn");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "MessgeME");
            int iOooO00o5 = OooO00o.OooO00o(cursorOooO0O0, "MessgeTr");
            int iOooO00o6 = OooO00o.OooO00o(cursorOooO0O0, "MessgeIn");
            int iOooO00o7 = OooO00o.OooO00o(cursorOooO0O0, "MessgePT");
            int iOooO00o8 = OooO00o.OooO00o(cursorOooO0O0, "MessgeES");
            int iOooO00o9 = OooO00o.OooO00o(cursorOooO0O0, "MessgeHi");
            int iOooO00o10 = OooO00o.OooO00o(cursorOooO0O0, "MessgeUr");
            ApiErrorCodeDB apiErrorCodeDB = null;
            if (cursorOooO0O0.moveToFirst()) {
                ApiErrorCodeDB apiErrorCodeDB2 = new ApiErrorCodeDB();
                if (cursorOooO0O0.isNull(iOooO00o)) {
                    apiErrorCodeDB2.id = null;
                } else {
                    apiErrorCodeDB2.id = Integer.valueOf(cursorOooO0O0.getInt(iOooO00o));
                }
                if (cursorOooO0O0.isNull(iOooO00o2)) {
                    apiErrorCodeDB2.Code = null;
                } else {
                    apiErrorCodeDB2.Code = cursorOooO0O0.getString(iOooO00o2);
                }
                if (cursorOooO0O0.isNull(iOooO00o3)) {
                    apiErrorCodeDB2.MessgeEn = null;
                } else {
                    apiErrorCodeDB2.MessgeEn = cursorOooO0O0.getString(iOooO00o3);
                }
                if (cursorOooO0O0.isNull(iOooO00o4)) {
                    apiErrorCodeDB2.MessgeME = null;
                } else {
                    apiErrorCodeDB2.MessgeME = cursorOooO0O0.getString(iOooO00o4);
                }
                if (cursorOooO0O0.isNull(iOooO00o5)) {
                    apiErrorCodeDB2.MessgeTr = null;
                } else {
                    apiErrorCodeDB2.MessgeTr = cursorOooO0O0.getString(iOooO00o5);
                }
                if (cursorOooO0O0.isNull(iOooO00o6)) {
                    apiErrorCodeDB2.MessgeIn = null;
                } else {
                    apiErrorCodeDB2.MessgeIn = cursorOooO0O0.getString(iOooO00o6);
                }
                if (cursorOooO0O0.isNull(iOooO00o7)) {
                    apiErrorCodeDB2.MessgePT = null;
                } else {
                    apiErrorCodeDB2.MessgePT = cursorOooO0O0.getString(iOooO00o7);
                }
                if (cursorOooO0O0.isNull(iOooO00o8)) {
                    apiErrorCodeDB2.MessgeES = null;
                } else {
                    apiErrorCodeDB2.MessgeES = cursorOooO0O0.getString(iOooO00o8);
                }
                if (cursorOooO0O0.isNull(iOooO00o9)) {
                    apiErrorCodeDB2.MessgeHi = null;
                } else {
                    apiErrorCodeDB2.MessgeHi = cursorOooO0O0.getString(iOooO00o9);
                }
                if (cursorOooO0O0.isNull(iOooO00o10)) {
                    apiErrorCodeDB2.MessgeUr = null;
                } else {
                    apiErrorCodeDB2.MessgeUr = cursorOooO0O0.getString(iOooO00o10);
                }
                apiErrorCodeDB = apiErrorCodeDB2;
            }
            return apiErrorCodeDB;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }

    @Override // p403o0Oo0OOo.o00O00OO
    public final long OooO0Oo(ApiErrorCodeDB apiErrorCodeDB) {
        RoomDatabase roomDatabase = this.f44526OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            long jOooO0oO = this.f44527OooO0O0.OooO0oO(apiErrorCodeDB);
            roomDatabase.OooOOO0();
            return jOooO0oO;
        } finally {
            roomDatabase.OooOO0();
        }
    }
}
