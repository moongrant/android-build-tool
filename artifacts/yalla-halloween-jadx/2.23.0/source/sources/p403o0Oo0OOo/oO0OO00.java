package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.UserInfo;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00 extends OooOOO0<UserInfo> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0o0 f44632OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00(oO0Oo0o0 oo0oo0o0, YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
        this.f44632OooO0Oo = oo0oo0o0;
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `UserInfoTable` (`userId`,`userIdx`,`idLevel`,`userName`,`userAvatar`,`userFrame`,`background`,`userLevel`,`isBlackUser`,`gender`,`bio`,`birthday`,`age`,`countryId`,`region`,`medal`,`visitorNum`,`followedNum`,`fansNum`,`joinRoomNum`,`role`,`regTime`,`tags`,`vip`,`vipLevel`,`kaVipState`,`kaVipLevel`,`showVIP`,`currWealLv`,`currBadgeImg`,`currBadgeLv`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, UserInfo userInfo) {
        UserInfo userInfo2 = userInfo;
        supportSQLiteStatement.bindLong(1, userInfo2.getUserId());
        if (userInfo2.getUserIdx() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, userInfo2.getUserIdx());
        }
        supportSQLiteStatement.bindLong(3, userInfo2.getIdLevel());
        if (userInfo2.getUserName() == null) {
            supportSQLiteStatement.bindNull(4);
        } else {
            supportSQLiteStatement.bindString(4, userInfo2.getUserName());
        }
        if (userInfo2.getUserHeader() == null) {
            supportSQLiteStatement.bindNull(5);
        } else {
            supportSQLiteStatement.bindString(5, userInfo2.getUserHeader());
        }
        if (userInfo2.getUserHeaderFrame() == null) {
            supportSQLiteStatement.bindNull(6);
        } else {
            supportSQLiteStatement.bindString(6, userInfo2.getUserHeaderFrame());
        }
        if (userInfo2.getBackground() == null) {
            supportSQLiteStatement.bindNull(7);
        } else {
            supportSQLiteStatement.bindString(7, userInfo2.getBackground());
        }
        supportSQLiteStatement.bindLong(8, userInfo2.getUserLevel());
        supportSQLiteStatement.bindLong(9, userInfo2.getIsBlackUser() ? 1L : 0L);
        supportSQLiteStatement.bindLong(10, userInfo2.getSex());
        if (userInfo2.getBio() == null) {
            supportSQLiteStatement.bindNull(11);
        } else {
            supportSQLiteStatement.bindString(11, userInfo2.getBio());
        }
        if (userInfo2.getBirthday() == null) {
            supportSQLiteStatement.bindNull(12);
        } else {
            supportSQLiteStatement.bindString(12, userInfo2.getBirthday());
        }
        supportSQLiteStatement.bindLong(13, userInfo2.getAge());
        supportSQLiteStatement.bindLong(14, userInfo2.getCountryId());
        supportSQLiteStatement.bindLong(15, userInfo2.getRegion());
        if (userInfo2.getMedal() == null) {
            supportSQLiteStatement.bindNull(16);
        } else {
            supportSQLiteStatement.bindString(16, userInfo2.getMedal());
        }
        supportSQLiteStatement.bindLong(17, userInfo2.getVisitorNum());
        supportSQLiteStatement.bindLong(18, userInfo2.getFollowedNum());
        supportSQLiteStatement.bindLong(19, userInfo2.getFansNum());
        supportSQLiteStatement.bindLong(20, userInfo2.getJoinRoomNum());
        supportSQLiteStatement.bindLong(21, userInfo2.getRole());
        supportSQLiteStatement.bindLong(22, userInfo2.getRegTime());
        String strListToString = this.f44632OooO0Oo.f44639OooO0OO.listToString(userInfo2.getTags());
        if (strListToString == null) {
            supportSQLiteStatement.bindNull(23);
        } else {
            supportSQLiteStatement.bindString(23, strListToString);
        }
        supportSQLiteStatement.bindLong(24, userInfo2.isPremium() ? 1L : 0L);
        supportSQLiteStatement.bindLong(25, userInfo2.getPremiumLevel());
        supportSQLiteStatement.bindLong(26, userInfo2.getVipState());
        supportSQLiteStatement.bindLong(27, userInfo2.getVipLevel());
        supportSQLiteStatement.bindLong(28, userInfo2.getShowVIP() ? 1L : 0L);
        supportSQLiteStatement.bindLong(29, userInfo2.getWealthLevel());
        if (userInfo2.getWealthBadgeWithBg() == null) {
            supportSQLiteStatement.bindNull(30);
        } else {
            supportSQLiteStatement.bindString(30, userInfo2.getWealthBadgeWithBg());
        }
        supportSQLiteStatement.bindLong(31, userInfo2.getCurrBadgeLv());
    }
}
