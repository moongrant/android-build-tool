package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.RoomHistory;
import java.util.ArrayList;
import java.util.TreeMap;
import o000O.OooO00o;
import o000O.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00OO0 implements oO0O0OoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44651OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO00O0o0 f44652OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO00O0o f44653OooO0OO;

    public oOo00OO0(YlAppDataBase ylAppDataBase) {
        this.f44651OooO00o = ylAppDataBase;
        this.f44652OooO0O0 = new oO00O0o0(ylAppDataBase);
        this.f44653OooO0OO = new oO00O0o(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.oO0O0OoO
    public final ArrayList OooO00o(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from RoomHistory Where uid = ? Order by time DESC");
        roomSQLiteQueryOooO00o.bindString(1, str);
        RoomDatabase roomDatabase = this.f44651OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "repeat");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "barid");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o5 = OooO00o.OooO00o(cursorOooO0O0, "time");
            int iOooO00o6 = OooO00o.OooO00o(cursorOooO0O0, "baridx");
            int iOooO00o7 = OooO00o.OooO00o(cursorOooO0O0, "barname");
            int iOooO00o8 = OooO00o.OooO00o(cursorOooO0O0, "barlevel");
            int iOooO00o9 = OooO00o.OooO00o(cursorOooO0O0, "barimage");
            int iOooO00o10 = OooO00o.OooO00o(cursorOooO0O0, "roomserverip");
            int iOooO00o11 = OooO00o.OooO00o(cursorOooO0O0, "isencrypt");
            int iOooO00o12 = OooO00o.OooO00o(cursorOooO0O0, "notice");
            int iOooO00o13 = OooO00o.OooO00o(cursorOooO0O0, "labelname");
            int iOooO00o14 = OooO00o.OooO00o(cursorOooO0O0, "istop");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = OooO00o.OooO00o(cursorOooO0O0, "countryid");
                int iOooO00o16 = OooO00o.OooO00o(cursorOooO0O0, "isofficial");
                int iOooO00o17 = OooO00o.OooO00o(cursorOooO0O0, "bartype");
                int iOooO00o18 = OooO00o.OooO00o(cursorOooO0O0, "medal");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    RoomHistory roomHistory = new RoomHistory();
                    ArrayList arrayList2 = arrayList;
                    if (cursorOooO0O0.isNull(iOooO00o)) {
                        roomHistory.id = null;
                    } else {
                        roomHistory.id = Integer.valueOf(cursorOooO0O0.getInt(iOooO00o));
                    }
                    if (cursorOooO0O0.isNull(iOooO00o2)) {
                        roomHistory.repeat = null;
                    } else {
                        roomHistory.repeat = cursorOooO0O0.getString(iOooO00o2);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o3)) {
                        roomHistory.barid = null;
                    } else {
                        roomHistory.barid = cursorOooO0O0.getString(iOooO00o3);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o4)) {
                        roomHistory.uid = null;
                    } else {
                        roomHistory.uid = cursorOooO0O0.getString(iOooO00o4);
                    }
                    int i2 = iOooO00o2;
                    int i3 = iOooO00o3;
                    roomHistory.time = cursorOooO0O0.getLong(iOooO00o5);
                    if (cursorOooO0O0.isNull(iOooO00o6)) {
                        roomHistory.baridx = null;
                    } else {
                        roomHistory.baridx = cursorOooO0O0.getString(iOooO00o6);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o7)) {
                        roomHistory.barname = null;
                    } else {
                        roomHistory.barname = cursorOooO0O0.getString(iOooO00o7);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o8)) {
                        roomHistory.barlevel = null;
                    } else {
                        roomHistory.barlevel = cursorOooO0O0.getString(iOooO00o8);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o9)) {
                        roomHistory.barimage = null;
                    } else {
                        roomHistory.barimage = cursorOooO0O0.getString(iOooO00o9);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o10)) {
                        roomHistory.roomserverip = null;
                    } else {
                        roomHistory.roomserverip = cursorOooO0O0.getString(iOooO00o10);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o11)) {
                        roomHistory.isencrypt = null;
                    } else {
                        roomHistory.isencrypt = cursorOooO0O0.getString(iOooO00o11);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o12)) {
                        roomHistory.notice = null;
                    } else {
                        roomHistory.notice = cursorOooO0O0.getString(iOooO00o12);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o13)) {
                        roomHistory.labelname = null;
                    } else {
                        roomHistory.labelname = cursorOooO0O0.getString(iOooO00o13);
                    }
                    int i4 = i;
                    roomHistory.istop = cursorOooO0O0.getInt(i4);
                    int i5 = iOooO00o15;
                    if (cursorOooO0O0.isNull(i5)) {
                        roomHistory.countryid = null;
                    } else {
                        roomHistory.countryid = cursorOooO0O0.getString(i5);
                    }
                    int i6 = iOooO00o16;
                    roomHistory.isofficial = cursorOooO0O0.getInt(i6);
                    int i7 = iOooO00o17;
                    if (cursorOooO0O0.isNull(i7)) {
                        roomHistory.bartype = null;
                    } else {
                        roomHistory.bartype = cursorOooO0O0.getString(i7);
                    }
                    int i8 = iOooO00o18;
                    if (cursorOooO0O0.isNull(i8)) {
                        roomHistory.medal = null;
                    } else {
                        roomHistory.medal = cursorOooO0O0.getString(i8);
                    }
                    arrayList = arrayList2;
                    arrayList.add(roomHistory);
                    i = i4;
                    iOooO00o2 = i2;
                    iOooO00o16 = i6;
                    iOooO00o17 = i7;
                    iOooO00o18 = i8;
                    iOooO00o = iOooO00o;
                    iOooO00o15 = i5;
                    iOooO00o3 = i3;
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
        }
    }

    @Override // p403o0Oo0OOo.oO0O0OoO
    public final RoomHistory OooO0O0(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomHistory roomHistory;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from RoomHistory Where uid = ? Order by time DESC Limit 1");
        roomSQLiteQueryOooO00o.bindString(1, str);
        RoomDatabase roomDatabase = this.f44651OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "repeat");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "barid");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o5 = OooO00o.OooO00o(cursorOooO0O0, "time");
            int iOooO00o6 = OooO00o.OooO00o(cursorOooO0O0, "baridx");
            int iOooO00o7 = OooO00o.OooO00o(cursorOooO0O0, "barname");
            int iOooO00o8 = OooO00o.OooO00o(cursorOooO0O0, "barlevel");
            int iOooO00o9 = OooO00o.OooO00o(cursorOooO0O0, "barimage");
            int iOooO00o10 = OooO00o.OooO00o(cursorOooO0O0, "roomserverip");
            int iOooO00o11 = OooO00o.OooO00o(cursorOooO0O0, "isencrypt");
            int iOooO00o12 = OooO00o.OooO00o(cursorOooO0O0, "notice");
            int iOooO00o13 = OooO00o.OooO00o(cursorOooO0O0, "labelname");
            int iOooO00o14 = OooO00o.OooO00o(cursorOooO0O0, "istop");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = OooO00o.OooO00o(cursorOooO0O0, "countryid");
                int iOooO00o16 = OooO00o.OooO00o(cursorOooO0O0, "isofficial");
                int iOooO00o17 = OooO00o.OooO00o(cursorOooO0O0, "bartype");
                int iOooO00o18 = OooO00o.OooO00o(cursorOooO0O0, "medal");
                if (cursorOooO0O0.moveToFirst()) {
                    roomHistory = new RoomHistory();
                    if (cursorOooO0O0.isNull(iOooO00o)) {
                        roomHistory.id = null;
                    } else {
                        roomHistory.id = Integer.valueOf(cursorOooO0O0.getInt(iOooO00o));
                    }
                    if (cursorOooO0O0.isNull(iOooO00o2)) {
                        roomHistory.repeat = null;
                    } else {
                        roomHistory.repeat = cursorOooO0O0.getString(iOooO00o2);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o3)) {
                        roomHistory.barid = null;
                    } else {
                        roomHistory.barid = cursorOooO0O0.getString(iOooO00o3);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o4)) {
                        roomHistory.uid = null;
                    } else {
                        roomHistory.uid = cursorOooO0O0.getString(iOooO00o4);
                    }
                    roomHistory.time = cursorOooO0O0.getLong(iOooO00o5);
                    if (cursorOooO0O0.isNull(iOooO00o6)) {
                        roomHistory.baridx = null;
                    } else {
                        roomHistory.baridx = cursorOooO0O0.getString(iOooO00o6);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o7)) {
                        roomHistory.barname = null;
                    } else {
                        roomHistory.barname = cursorOooO0O0.getString(iOooO00o7);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o8)) {
                        roomHistory.barlevel = null;
                    } else {
                        roomHistory.barlevel = cursorOooO0O0.getString(iOooO00o8);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o9)) {
                        roomHistory.barimage = null;
                    } else {
                        roomHistory.barimage = cursorOooO0O0.getString(iOooO00o9);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o10)) {
                        roomHistory.roomserverip = null;
                    } else {
                        roomHistory.roomserverip = cursorOooO0O0.getString(iOooO00o10);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o11)) {
                        roomHistory.isencrypt = null;
                    } else {
                        roomHistory.isencrypt = cursorOooO0O0.getString(iOooO00o11);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o12)) {
                        roomHistory.notice = null;
                    } else {
                        roomHistory.notice = cursorOooO0O0.getString(iOooO00o12);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o13)) {
                        roomHistory.labelname = null;
                    } else {
                        roomHistory.labelname = cursorOooO0O0.getString(iOooO00o13);
                    }
                    roomHistory.istop = cursorOooO0O0.getInt(iOooO00o14);
                    if (cursorOooO0O0.isNull(iOooO00o15)) {
                        roomHistory.countryid = null;
                    } else {
                        roomHistory.countryid = cursorOooO0O0.getString(iOooO00o15);
                    }
                    roomHistory.isofficial = cursorOooO0O0.getInt(iOooO00o16);
                    if (cursorOooO0O0.isNull(iOooO00o17)) {
                        roomHistory.bartype = null;
                    } else {
                        roomHistory.bartype = cursorOooO0O0.getString(iOooO00o17);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o18)) {
                        roomHistory.medal = null;
                    } else {
                        roomHistory.medal = cursorOooO0O0.getString(iOooO00o18);
                    }
                } else {
                    roomHistory = null;
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return roomHistory;
            } catch (Throwable th) {
                th = th;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
        }
    }

    @Override // p403o0Oo0OOo.oO0O0OoO
    public final void OooO0OO(RoomHistory roomHistory) {
        RoomDatabase roomDatabase = this.f44651OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44652OooO0O0.OooO0o(roomHistory);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.oO0O0OoO
    public final void OooO0Oo(RoomHistory roomHistory) {
        RoomDatabase roomDatabase = this.f44651OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44653OooO0OO.OooO0o0(roomHistory);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }
}
