package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.FriendsTableOld;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O extends OooOOO0<FriendsTableOld> {
    public o0O(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `FriendsTable` (`id`,`name`,`head`,`vip`,`vip_level`,`idx`,`uid`,`sex`,`add_from`,`time`,`role`,`sign`,`headframeurl`,`check_warn`,`memoName`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, FriendsTableOld friendsTableOld) {
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
