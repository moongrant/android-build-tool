package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.RoomHistory;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends o0OO00O<RoomHistory> {
    public o0oO0Ooo(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `RoomHistory` (`id`,`repeat`,`barid`,`uid`,`time`,`baridx`,`barname`,`barlevel`,`barimage`,`roomserverip`,`isencrypt`,`notice`,`labelname`,`istop`,`countryid`,`isofficial`,`bartype`,`medal`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
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
