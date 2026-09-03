package p517o0o0O00O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.FriendsTableOld;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;
import p091o000o00o.o0O0O00;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f42166OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<FriendsTableOld> f42167OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00<FriendsTableOld> f42168OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f42169OooO0Oo;

    public class OooO00o extends o000OOo<FriendsTableOld> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `FriendsTable` (`id`,`name`,`head`,`vip`,`vip_level`,`idx`,`uid`,`sex`,`add_from`,`time`,`role`,`sign`,`headframeurl`,`check_warn`,`memoName`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, FriendsTableOld friendsTableOld) {
            FriendsTableOld friendsTableOld2 = friendsTableOld;
            String str = friendsTableOld2.userid;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = friendsTableOld2.username;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
            String str3 = friendsTableOld2.headphoto;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str3);
            }
            String str4 = friendsTableOld2.uservip;
            if (str4 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str4);
            }
            String str5 = friendsTableOld2.supervip;
            if (str5 == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, str5);
            }
            String str6 = friendsTableOld2.standbyone;
            if (str6 == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, str6);
            }
            String str7 = friendsTableOld2.standbytwo;
            if (str7 == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, str7);
            }
            String str8 = friendsTableOld2.standbythree;
            if (str8 == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, str8);
            }
            String str9 = friendsTableOld2.standbyfour;
            if (str9 == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, str9);
            }
            supportSQLiteStatement.bindLong(10, friendsTableOld2.ctime);
            supportSQLiteStatement.bindLong(11, friendsTableOld2.role);
            String str10 = friendsTableOld2.sign;
            if (str10 == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, str10);
            }
            String str11 = friendsTableOld2.headframeurl;
            if (str11 == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, str11);
            }
            supportSQLiteStatement.bindLong(14, friendsTableOld2.isCheckWarn ? 1L : 0L);
            String str12 = friendsTableOld2.memoName;
            if (str12 == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, str12);
            }
        }
    }

    public class OooO0O0 extends o0O0O00<FriendsTableOld> {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "DELETE FROM `FriendsTable` WHERE `id` = ? AND `uid` = ?";
        }

        @Override // p091o000o00o.o0O0O00
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, FriendsTableOld friendsTableOld) {
            FriendsTableOld friendsTableOld2 = friendsTableOld;
            String str = friendsTableOld2.userid;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = friendsTableOld2.standbytwo;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }
    }

    public class OooO0OO extends o0000OO0 {
        public OooO0OO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Delete from FriendsTable Where uid = ?";
        }
    }

    public oo0o0Oo(RoomDatabase roomDatabase) {
        this.f42166OooO00o = roomDatabase;
        this.f42167OooO0O0 = new OooO00o(roomDatabase);
        this.f42168OooO0OO = new OooO0O0(roomDatabase);
        new AtomicBoolean(false);
        this.f42169OooO0Oo = new OooO0OO(roomDatabase);
        new AtomicBoolean(false);
    }

    @Override // p517o0o0O00O.o0OO00O
    public final List<FriendsTableOld> OooO00o(String str) throws Throwable {
        o0000O0 o0000o1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendsTable Where uid = ? Order by time DESC", 1);
        o0000o0OooO0o.bindString(1, str);
        this.f42166OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42166OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "name");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "head");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "vip");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "vip_level");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "idx");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "sex");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "add_from");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "role");
            int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "sign");
            int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "headframeurl");
            int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "check_warn");
            o0000o1 = o0000o0OooO0o;
            try {
                int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "memoName");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    FriendsTableOld friendsTableOld = new FriendsTableOld();
                    ArrayList arrayList2 = arrayList;
                    if (cursorOooOOO.isNull(iOooO00o)) {
                        friendsTableOld.userid = null;
                    } else {
                        friendsTableOld.userid = cursorOooOOO.getString(iOooO00o);
                    }
                    if (cursorOooOOO.isNull(iOooO00o2)) {
                        friendsTableOld.username = null;
                    } else {
                        friendsTableOld.username = cursorOooOOO.getString(iOooO00o2);
                    }
                    if (cursorOooOOO.isNull(iOooO00o3)) {
                        friendsTableOld.headphoto = null;
                    } else {
                        friendsTableOld.headphoto = cursorOooOOO.getString(iOooO00o3);
                    }
                    if (cursorOooOOO.isNull(iOooO00o4)) {
                        friendsTableOld.uservip = null;
                    } else {
                        friendsTableOld.uservip = cursorOooOOO.getString(iOooO00o4);
                    }
                    if (cursorOooOOO.isNull(iOooO00o5)) {
                        friendsTableOld.supervip = null;
                    } else {
                        friendsTableOld.supervip = cursorOooOOO.getString(iOooO00o5);
                    }
                    if (cursorOooOOO.isNull(iOooO00o6)) {
                        friendsTableOld.standbyone = null;
                    } else {
                        friendsTableOld.standbyone = cursorOooOOO.getString(iOooO00o6);
                    }
                    if (cursorOooOOO.isNull(iOooO00o7)) {
                        friendsTableOld.standbytwo = null;
                    } else {
                        friendsTableOld.standbytwo = cursorOooOOO.getString(iOooO00o7);
                    }
                    if (cursorOooOOO.isNull(iOooO00o8)) {
                        friendsTableOld.standbythree = null;
                    } else {
                        friendsTableOld.standbythree = cursorOooOOO.getString(iOooO00o8);
                    }
                    if (cursorOooOOO.isNull(iOooO00o9)) {
                        friendsTableOld.standbyfour = null;
                    } else {
                        friendsTableOld.standbyfour = cursorOooOOO.getString(iOooO00o9);
                    }
                    int i2 = iOooO00o2;
                    int i3 = iOooO00o3;
                    friendsTableOld.ctime = cursorOooOOO.getLong(iOooO00o10);
                    friendsTableOld.role = cursorOooOOO.getInt(iOooO00o11);
                    if (cursorOooOOO.isNull(iOooO00o12)) {
                        friendsTableOld.sign = null;
                    } else {
                        friendsTableOld.sign = cursorOooOOO.getString(iOooO00o12);
                    }
                    if (cursorOooOOO.isNull(iOooO00o13)) {
                        friendsTableOld.headframeurl = null;
                    } else {
                        friendsTableOld.headframeurl = cursorOooOOO.getString(iOooO00o13);
                    }
                    int i4 = i;
                    friendsTableOld.isCheckWarn = cursorOooOOO.getInt(i4) != 0;
                    int i5 = iOooO00o15;
                    if (cursorOooOOO.isNull(i5)) {
                        friendsTableOld.memoName = null;
                    } else {
                        friendsTableOld.memoName = cursorOooOOO.getString(i5);
                    }
                    arrayList2.add(friendsTableOld);
                    i = i4;
                    iOooO00o2 = i2;
                    arrayList = arrayList2;
                    iOooO00o = iOooO00o;
                    iOooO00o15 = i5;
                    iOooO00o3 = i3;
                }
                ArrayList arrayList3 = arrayList;
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList3;
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

    @Override // p517o0o0O00O.o0OO00O
    public final List<FriendsTableOld> OooO0O0(String str) throws Throwable {
        o0000O0 o0000o1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendsTable Where uid = ? and add_from = 1 Order by time DESC", 1);
        o0000o0OooO0o.bindString(1, str);
        this.f42166OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42166OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "name");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "head");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "vip");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "vip_level");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "idx");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "sex");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "add_from");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "role");
            int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "sign");
            int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "headframeurl");
            int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "check_warn");
            o0000o1 = o0000o0OooO0o;
            try {
                int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "memoName");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    FriendsTableOld friendsTableOld = new FriendsTableOld();
                    ArrayList arrayList2 = arrayList;
                    if (cursorOooOOO.isNull(iOooO00o)) {
                        friendsTableOld.userid = null;
                    } else {
                        friendsTableOld.userid = cursorOooOOO.getString(iOooO00o);
                    }
                    if (cursorOooOOO.isNull(iOooO00o2)) {
                        friendsTableOld.username = null;
                    } else {
                        friendsTableOld.username = cursorOooOOO.getString(iOooO00o2);
                    }
                    if (cursorOooOOO.isNull(iOooO00o3)) {
                        friendsTableOld.headphoto = null;
                    } else {
                        friendsTableOld.headphoto = cursorOooOOO.getString(iOooO00o3);
                    }
                    if (cursorOooOOO.isNull(iOooO00o4)) {
                        friendsTableOld.uservip = null;
                    } else {
                        friendsTableOld.uservip = cursorOooOOO.getString(iOooO00o4);
                    }
                    if (cursorOooOOO.isNull(iOooO00o5)) {
                        friendsTableOld.supervip = null;
                    } else {
                        friendsTableOld.supervip = cursorOooOOO.getString(iOooO00o5);
                    }
                    if (cursorOooOOO.isNull(iOooO00o6)) {
                        friendsTableOld.standbyone = null;
                    } else {
                        friendsTableOld.standbyone = cursorOooOOO.getString(iOooO00o6);
                    }
                    if (cursorOooOOO.isNull(iOooO00o7)) {
                        friendsTableOld.standbytwo = null;
                    } else {
                        friendsTableOld.standbytwo = cursorOooOOO.getString(iOooO00o7);
                    }
                    if (cursorOooOOO.isNull(iOooO00o8)) {
                        friendsTableOld.standbythree = null;
                    } else {
                        friendsTableOld.standbythree = cursorOooOOO.getString(iOooO00o8);
                    }
                    if (cursorOooOOO.isNull(iOooO00o9)) {
                        friendsTableOld.standbyfour = null;
                    } else {
                        friendsTableOld.standbyfour = cursorOooOOO.getString(iOooO00o9);
                    }
                    int i2 = iOooO00o2;
                    int i3 = iOooO00o3;
                    friendsTableOld.ctime = cursorOooOOO.getLong(iOooO00o10);
                    friendsTableOld.role = cursorOooOOO.getInt(iOooO00o11);
                    if (cursorOooOOO.isNull(iOooO00o12)) {
                        friendsTableOld.sign = null;
                    } else {
                        friendsTableOld.sign = cursorOooOOO.getString(iOooO00o12);
                    }
                    if (cursorOooOOO.isNull(iOooO00o13)) {
                        friendsTableOld.headframeurl = null;
                    } else {
                        friendsTableOld.headframeurl = cursorOooOOO.getString(iOooO00o13);
                    }
                    int i4 = i;
                    friendsTableOld.isCheckWarn = cursorOooOOO.getInt(i4) != 0;
                    int i5 = iOooO00o15;
                    if (cursorOooOOO.isNull(i5)) {
                        friendsTableOld.memoName = null;
                    } else {
                        friendsTableOld.memoName = cursorOooOOO.getString(i5);
                    }
                    arrayList2.add(friendsTableOld);
                    i = i4;
                    iOooO00o2 = i2;
                    arrayList = arrayList2;
                    iOooO00o = iOooO00o;
                    iOooO00o15 = i5;
                    iOooO00o3 = i3;
                }
                ArrayList arrayList3 = arrayList;
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList3;
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

    @Override // p517o0o0O00O.o0OO00O
    public final void OooO0OO(String str) {
        this.f42166OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f42169OooO0Oo.OooO00o();
        supportSQLiteStatementOooO00o.bindString(1, str);
        this.f42166OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f42166OooO00o.OooOOOO();
        } finally {
            this.f42166OooO00o.OooOO0O();
            this.f42169OooO0Oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p517o0o0O00O.o0OO00O
    public final List<FriendsTableOld> OooO0Oo(String str, String str2) throws Throwable {
        o0000O0 o0000o1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendsTable where (name like ? or idx like ? or memoName like ?) and uid = ?", 4);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        if (str == null) {
            o0000o0OooO0o.bindNull(2);
        } else {
            o0000o0OooO0o.bindString(2, str);
        }
        if (str == null) {
            o0000o0OooO0o.bindNull(3);
        } else {
            o0000o0OooO0o.bindString(3, str);
        }
        o0000o0OooO0o.bindString(4, str2);
        this.f42166OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42166OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "name");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "head");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "vip");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "vip_level");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "idx");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "sex");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "add_from");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "role");
            int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "sign");
            int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "headframeurl");
            int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "check_warn");
            o0000o1 = o0000o0OooO0o;
            try {
                int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "memoName");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    FriendsTableOld friendsTableOld = new FriendsTableOld();
                    ArrayList arrayList2 = arrayList;
                    if (cursorOooOOO.isNull(iOooO00o)) {
                        friendsTableOld.userid = null;
                    } else {
                        friendsTableOld.userid = cursorOooOOO.getString(iOooO00o);
                    }
                    if (cursorOooOOO.isNull(iOooO00o2)) {
                        friendsTableOld.username = null;
                    } else {
                        friendsTableOld.username = cursorOooOOO.getString(iOooO00o2);
                    }
                    if (cursorOooOOO.isNull(iOooO00o3)) {
                        friendsTableOld.headphoto = null;
                    } else {
                        friendsTableOld.headphoto = cursorOooOOO.getString(iOooO00o3);
                    }
                    if (cursorOooOOO.isNull(iOooO00o4)) {
                        friendsTableOld.uservip = null;
                    } else {
                        friendsTableOld.uservip = cursorOooOOO.getString(iOooO00o4);
                    }
                    if (cursorOooOOO.isNull(iOooO00o5)) {
                        friendsTableOld.supervip = null;
                    } else {
                        friendsTableOld.supervip = cursorOooOOO.getString(iOooO00o5);
                    }
                    if (cursorOooOOO.isNull(iOooO00o6)) {
                        friendsTableOld.standbyone = null;
                    } else {
                        friendsTableOld.standbyone = cursorOooOOO.getString(iOooO00o6);
                    }
                    if (cursorOooOOO.isNull(iOooO00o7)) {
                        friendsTableOld.standbytwo = null;
                    } else {
                        friendsTableOld.standbytwo = cursorOooOOO.getString(iOooO00o7);
                    }
                    if (cursorOooOOO.isNull(iOooO00o8)) {
                        friendsTableOld.standbythree = null;
                    } else {
                        friendsTableOld.standbythree = cursorOooOOO.getString(iOooO00o8);
                    }
                    if (cursorOooOOO.isNull(iOooO00o9)) {
                        friendsTableOld.standbyfour = null;
                    } else {
                        friendsTableOld.standbyfour = cursorOooOOO.getString(iOooO00o9);
                    }
                    int i2 = iOooO00o2;
                    int i3 = iOooO00o3;
                    friendsTableOld.ctime = cursorOooOOO.getLong(iOooO00o10);
                    friendsTableOld.role = cursorOooOOO.getInt(iOooO00o11);
                    if (cursorOooOOO.isNull(iOooO00o12)) {
                        friendsTableOld.sign = null;
                    } else {
                        friendsTableOld.sign = cursorOooOOO.getString(iOooO00o12);
                    }
                    if (cursorOooOOO.isNull(iOooO00o13)) {
                        friendsTableOld.headframeurl = null;
                    } else {
                        friendsTableOld.headframeurl = cursorOooOOO.getString(iOooO00o13);
                    }
                    int i4 = i;
                    friendsTableOld.isCheckWarn = cursorOooOOO.getInt(i4) != 0;
                    int i5 = iOooO00o15;
                    if (cursorOooOOO.isNull(i5)) {
                        friendsTableOld.memoName = null;
                    } else {
                        friendsTableOld.memoName = cursorOooOOO.getString(i5);
                    }
                    arrayList2.add(friendsTableOld);
                    i = i4;
                    iOooO00o2 = i2;
                    arrayList = arrayList2;
                    iOooO00o = iOooO00o;
                    iOooO00o15 = i5;
                    iOooO00o3 = i3;
                }
                ArrayList arrayList3 = arrayList;
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList3;
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

    @Override // p517o0o0O00O.o0OO00O
    public final void OooO0o(FriendsTableOld friendsTableOld) {
        this.f42166OooO00o.OooO0O0();
        this.f42166OooO00o.OooO0OO();
        try {
            this.f42167OooO0O0.OooO0oO(friendsTableOld);
            this.f42166OooO00o.OooOOOO();
        } finally {
            this.f42166OooO00o.OooOO0O();
        }
    }

    @Override // p517o0o0O00O.o0OO00O
    public final int OooO0o0(FriendsTableOld friendsTableOld) {
        this.f42166OooO00o.OooO0O0();
        this.f42166OooO00o.OooO0OO();
        try {
            int iOooO0o = this.f42168OooO0OO.OooO0o(friendsTableOld) + 0;
            this.f42166OooO00o.OooOOOO();
            return iOooO0o;
        } finally {
            this.f42166OooO00o.OooOO0O();
        }
    }

    @Override // p517o0o0O00O.o0OO00O
    public final FriendsTableOld OooO0oO(String str, String str2) throws Throwable {
        o0000O0 o0000o1;
        FriendsTableOld friendsTableOld;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendsTable Where id = ? and uid = ?", 2);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        o0000o0OooO0o.bindString(2, str2);
        this.f42166OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42166OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "name");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "head");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "vip");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "vip_level");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "idx");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "sex");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "add_from");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "role");
            int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "sign");
            int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "headframeurl");
            int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "check_warn");
            o0000o1 = o0000o0OooO0o;
            try {
                int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "memoName");
                if (cursorOooOOO.moveToFirst()) {
                    friendsTableOld = new FriendsTableOld();
                    if (cursorOooOOO.isNull(iOooO00o)) {
                        friendsTableOld.userid = null;
                    } else {
                        friendsTableOld.userid = cursorOooOOO.getString(iOooO00o);
                    }
                    if (cursorOooOOO.isNull(iOooO00o2)) {
                        friendsTableOld.username = null;
                    } else {
                        friendsTableOld.username = cursorOooOOO.getString(iOooO00o2);
                    }
                    if (cursorOooOOO.isNull(iOooO00o3)) {
                        friendsTableOld.headphoto = null;
                    } else {
                        friendsTableOld.headphoto = cursorOooOOO.getString(iOooO00o3);
                    }
                    if (cursorOooOOO.isNull(iOooO00o4)) {
                        friendsTableOld.uservip = null;
                    } else {
                        friendsTableOld.uservip = cursorOooOOO.getString(iOooO00o4);
                    }
                    if (cursorOooOOO.isNull(iOooO00o5)) {
                        friendsTableOld.supervip = null;
                    } else {
                        friendsTableOld.supervip = cursorOooOOO.getString(iOooO00o5);
                    }
                    if (cursorOooOOO.isNull(iOooO00o6)) {
                        friendsTableOld.standbyone = null;
                    } else {
                        friendsTableOld.standbyone = cursorOooOOO.getString(iOooO00o6);
                    }
                    if (cursorOooOOO.isNull(iOooO00o7)) {
                        friendsTableOld.standbytwo = null;
                    } else {
                        friendsTableOld.standbytwo = cursorOooOOO.getString(iOooO00o7);
                    }
                    if (cursorOooOOO.isNull(iOooO00o8)) {
                        friendsTableOld.standbythree = null;
                    } else {
                        friendsTableOld.standbythree = cursorOooOOO.getString(iOooO00o8);
                    }
                    if (cursorOooOOO.isNull(iOooO00o9)) {
                        friendsTableOld.standbyfour = null;
                    } else {
                        friendsTableOld.standbyfour = cursorOooOOO.getString(iOooO00o9);
                    }
                    friendsTableOld.ctime = cursorOooOOO.getLong(iOooO00o10);
                    friendsTableOld.role = cursorOooOOO.getInt(iOooO00o11);
                    if (cursorOooOOO.isNull(iOooO00o12)) {
                        friendsTableOld.sign = null;
                    } else {
                        friendsTableOld.sign = cursorOooOOO.getString(iOooO00o12);
                    }
                    if (cursorOooOOO.isNull(iOooO00o13)) {
                        friendsTableOld.headframeurl = null;
                    } else {
                        friendsTableOld.headframeurl = cursorOooOOO.getString(iOooO00o13);
                    }
                    friendsTableOld.isCheckWarn = cursorOooOOO.getInt(iOooO00o14) != 0;
                    if (cursorOooOOO.isNull(iOooO00o15)) {
                        friendsTableOld.memoName = null;
                    } else {
                        friendsTableOld.memoName = cursorOooOOO.getString(iOooO00o15);
                    }
                } else {
                    friendsTableOld = null;
                }
                cursorOooOOO.close();
                o0000o1.release();
                return friendsTableOld;
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

    @Override // p517o0o0O00O.o0OO00O
    public final String OooO0oo(long j, long j2) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select memoName from FriendsTable where uid = ? and id = ?", 2);
        o0000o0OooO0o.bindLong(1, j);
        o0000o0OooO0o.bindLong(2, j2);
        this.f42166OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42166OooO00o.OooOOO(o0000o0OooO0o);
        try {
            return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : cursorOooOOO.getString(0);
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }
}
