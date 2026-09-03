package p517o0o0O00O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.RoomHistory;
import java.util.ArrayList;
import java.util.List;
import p091o000o00o.o0000O0;
import p091o000o00o.o000OOo;
import p091o000o00o.o0O0O00;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO implements o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f42131OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<RoomHistory> f42132OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00<RoomHistory> f42133OooO0OO;

    public class OooO00o extends o000OOo<RoomHistory> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `RoomHistory` (`id`,`repeat`,`barid`,`uid`,`time`,`baridx`,`barname`,`barlevel`,`barimage`,`roomserverip`,`isencrypt`,`notice`,`labelname`,`istop`,`countryid`,`isofficial`,`bartype`,`medal`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, RoomHistory roomHistory) {
            RoomHistory roomHistory2 = roomHistory;
            Integer num = roomHistory2.id;
            if (num == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, num.intValue());
            }
            String str = roomHistory2.repeat;
            if (str == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str);
            }
            String str2 = roomHistory2.barid;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            String str3 = roomHistory2.uid;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
            supportSQLiteStatement.bindLong(5, roomHistory2.time);
            String str4 = roomHistory2.baridx;
            if (str4 == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, str4);
            }
            String str5 = roomHistory2.barname;
            if (str5 == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, str5);
            }
            String str6 = roomHistory2.barlevel;
            if (str6 == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, str6);
            }
            String str7 = roomHistory2.barimage;
            if (str7 == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, str7);
            }
            String str8 = roomHistory2.roomserverip;
            if (str8 == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, str8);
            }
            String str9 = roomHistory2.isencrypt;
            if (str9 == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, str9);
            }
            String str10 = roomHistory2.notice;
            if (str10 == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, str10);
            }
            String str11 = roomHistory2.labelname;
            if (str11 == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, str11);
            }
            supportSQLiteStatement.bindLong(14, roomHistory2.istop);
            String str12 = roomHistory2.countryid;
            if (str12 == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, str12);
            }
            supportSQLiteStatement.bindLong(16, roomHistory2.isofficial);
            String str13 = roomHistory2.bartype;
            if (str13 == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindString(17, str13);
            }
            String str14 = roomHistory2.medal;
            if (str14 == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, str14);
            }
        }
    }

    public class OooO0O0 extends o0O0O00<RoomHistory> {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "DELETE FROM `RoomHistory` WHERE `id` = ?";
        }

        @Override // p091o000o00o.o0O0O00
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, RoomHistory roomHistory) {
            Integer num = roomHistory.id;
            if (num == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, num.intValue());
            }
        }
    }

    public o00000OO(RoomDatabase roomDatabase) {
        this.f42131OooO00o = roomDatabase;
        this.f42132OooO0O0 = new OooO00o(roomDatabase);
        this.f42133OooO0OO = new OooO0O0(roomDatabase);
    }

    @Override // p517o0o0O00O.o00000O
    public final List<RoomHistory> OooO00o(String str) throws Throwable {
        o0000O0 o0000o1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from RoomHistory Where uid = ? Order by time DESC", 1);
        o0000o0OooO0o.bindString(1, str);
        this.f42131OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42131OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "repeat");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "barid");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "baridx");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "barname");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "barlevel");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "barimage");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "roomserverip");
            int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "isencrypt");
            int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "notice");
            int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "labelname");
            int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "istop");
            o0000o1 = o0000o0OooO0o;
            try {
                int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "countryid");
                int iOooO00o16 = o00O0O.OooO00o(cursorOooOOO, "isofficial");
                int iOooO00o17 = o00O0O.OooO00o(cursorOooOOO, "bartype");
                int iOooO00o18 = o00O0O.OooO00o(cursorOooOOO, "medal");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    RoomHistory roomHistory = new RoomHistory();
                    ArrayList arrayList2 = arrayList;
                    if (cursorOooOOO.isNull(iOooO00o)) {
                        roomHistory.id = null;
                    } else {
                        roomHistory.id = Integer.valueOf(cursorOooOOO.getInt(iOooO00o));
                    }
                    if (cursorOooOOO.isNull(iOooO00o2)) {
                        roomHistory.repeat = null;
                    } else {
                        roomHistory.repeat = cursorOooOOO.getString(iOooO00o2);
                    }
                    if (cursorOooOOO.isNull(iOooO00o3)) {
                        roomHistory.barid = null;
                    } else {
                        roomHistory.barid = cursorOooOOO.getString(iOooO00o3);
                    }
                    if (cursorOooOOO.isNull(iOooO00o4)) {
                        roomHistory.uid = null;
                    } else {
                        roomHistory.uid = cursorOooOOO.getString(iOooO00o4);
                    }
                    int i2 = iOooO00o2;
                    roomHistory.time = cursorOooOOO.getLong(iOooO00o5);
                    if (cursorOooOOO.isNull(iOooO00o6)) {
                        roomHistory.baridx = null;
                    } else {
                        roomHistory.baridx = cursorOooOOO.getString(iOooO00o6);
                    }
                    if (cursorOooOOO.isNull(iOooO00o7)) {
                        roomHistory.barname = null;
                    } else {
                        roomHistory.barname = cursorOooOOO.getString(iOooO00o7);
                    }
                    if (cursorOooOOO.isNull(iOooO00o8)) {
                        roomHistory.barlevel = null;
                    } else {
                        roomHistory.barlevel = cursorOooOOO.getString(iOooO00o8);
                    }
                    if (cursorOooOOO.isNull(iOooO00o9)) {
                        roomHistory.barimage = null;
                    } else {
                        roomHistory.barimage = cursorOooOOO.getString(iOooO00o9);
                    }
                    if (cursorOooOOO.isNull(iOooO00o10)) {
                        roomHistory.roomserverip = null;
                    } else {
                        roomHistory.roomserverip = cursorOooOOO.getString(iOooO00o10);
                    }
                    if (cursorOooOOO.isNull(iOooO00o11)) {
                        roomHistory.isencrypt = null;
                    } else {
                        roomHistory.isencrypt = cursorOooOOO.getString(iOooO00o11);
                    }
                    if (cursorOooOOO.isNull(iOooO00o12)) {
                        roomHistory.notice = null;
                    } else {
                        roomHistory.notice = cursorOooOOO.getString(iOooO00o12);
                    }
                    if (cursorOooOOO.isNull(iOooO00o13)) {
                        roomHistory.labelname = null;
                    } else {
                        roomHistory.labelname = cursorOooOOO.getString(iOooO00o13);
                    }
                    int i3 = i;
                    roomHistory.istop = cursorOooOOO.getInt(i3);
                    int i4 = iOooO00o15;
                    if (cursorOooOOO.isNull(i4)) {
                        roomHistory.countryid = null;
                    } else {
                        roomHistory.countryid = cursorOooOOO.getString(i4);
                    }
                    i = i3;
                    iOooO00o16 = iOooO00o16;
                    roomHistory.isofficial = cursorOooOOO.getInt(iOooO00o16);
                    iOooO00o17 = iOooO00o17;
                    if (cursorOooOOO.isNull(iOooO00o17)) {
                        roomHistory.bartype = null;
                    } else {
                        roomHistory.bartype = cursorOooOOO.getString(iOooO00o17);
                    }
                    int i5 = iOooO00o18;
                    if (cursorOooOOO.isNull(i5)) {
                        roomHistory.medal = null;
                    } else {
                        roomHistory.medal = cursorOooOOO.getString(i5);
                    }
                    arrayList = arrayList2;
                    arrayList.add(roomHistory);
                    iOooO00o18 = i5;
                    iOooO00o = iOooO00o;
                    iOooO00o15 = i4;
                    iOooO00o2 = i2;
                }
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorOooOOO.close();
                o0000o1.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0000o1 = o0000o0OooO0o;
        }
    }

    @Override // p517o0o0O00O.o00000O
    public final void OooO0O0(RoomHistory roomHistory) {
        this.f42131OooO00o.OooO0O0();
        this.f42131OooO00o.OooO0OO();
        try {
            this.f42132OooO0O0.OooO0oO(roomHistory);
            this.f42131OooO00o.OooOOOO();
        } finally {
            this.f42131OooO00o.OooOO0O();
        }
    }

    @Override // p517o0o0O00O.o00000O
    public final void OooO0OO(RoomHistory roomHistory) {
        this.f42131OooO00o.OooO0O0();
        this.f42131OooO00o.OooO0OO();
        try {
            this.f42133OooO0OO.OooO0o(roomHistory);
            this.f42131OooO00o.OooOOOO();
        } finally {
            this.f42131OooO00o.OooOO0O();
        }
    }
}
