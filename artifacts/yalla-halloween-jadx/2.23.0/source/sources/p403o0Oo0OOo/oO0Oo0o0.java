package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.converter.TagConverter;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.user.UserInfoModel;
import java.util.List;
import java.util.TreeMap;
import o000O.OooO00o;
import o000O.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0o0 implements ooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44637OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0OO00 f44638OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TagConverter f44639OooO0OO = new TagConverter();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO0OO0O f44640OooO0Oo;

    public oO0Oo0o0(YlAppDataBase ylAppDataBase) {
        this.f44637OooO00o = ylAppDataBase;
        this.f44638OooO0O0 = new oO0OO00(this, ylAppDataBase);
        this.f44640OooO0Oo = new oO0OO0O(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.ooo0o
    public final void OooO00o(long j) {
        RoomDatabase roomDatabase = this.f44637OooO00o;
        roomDatabase.OooO0O0();
        oO0OO0O oo0oo0o = this.f44640OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = oo0oo0o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
            oo0oo0o.OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p403o0Oo0OOo.ooo0o
    public final UserInfo OooO0O0(long j) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from UserInfoTable Where userId = ? limit 1");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        RoomDatabase roomDatabase = this.f44637OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "userId");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "userIdx");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "idLevel");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "userName");
            int iOooO00o5 = OooO00o.OooO00o(cursorOooO0O0, "userAvatar");
            int iOooO00o6 = OooO00o.OooO00o(cursorOooO0O0, "userFrame");
            int iOooO00o7 = OooO00o.OooO00o(cursorOooO0O0, "background");
            int iOooO00o8 = OooO00o.OooO00o(cursorOooO0O0, "userLevel");
            int iOooO00o9 = OooO00o.OooO00o(cursorOooO0O0, "isBlackUser");
            int iOooO00o10 = OooO00o.OooO00o(cursorOooO0O0, "gender");
            int iOooO00o11 = OooO00o.OooO00o(cursorOooO0O0, "bio");
            int iOooO00o12 = OooO00o.OooO00o(cursorOooO0O0, "birthday");
            int iOooO00o13 = OooO00o.OooO00o(cursorOooO0O0, "age");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o14 = OooO00o.OooO00o(cursorOooO0O0, "countryId");
                try {
                    int iOooO00o15 = OooO00o.OooO00o(cursorOooO0O0, "region");
                    int iOooO00o16 = OooO00o.OooO00o(cursorOooO0O0, "medal");
                    int iOooO00o17 = OooO00o.OooO00o(cursorOooO0O0, "visitorNum");
                    int iOooO00o18 = OooO00o.OooO00o(cursorOooO0O0, "followedNum");
                    int iOooO00o19 = OooO00o.OooO00o(cursorOooO0O0, "fansNum");
                    int iOooO00o20 = OooO00o.OooO00o(cursorOooO0O0, "joinRoomNum");
                    int iOooO00o21 = OooO00o.OooO00o(cursorOooO0O0, "role");
                    int iOooO00o22 = OooO00o.OooO00o(cursorOooO0O0, "regTime");
                    int iOooO00o23 = OooO00o.OooO00o(cursorOooO0O0, "tags");
                    int iOooO00o24 = OooO00o.OooO00o(cursorOooO0O0, "vip");
                    int iOooO00o25 = OooO00o.OooO00o(cursorOooO0O0, "vipLevel");
                    int iOooO00o26 = OooO00o.OooO00o(cursorOooO0O0, "kaVipState");
                    int iOooO00o27 = OooO00o.OooO00o(cursorOooO0O0, "kaVipLevel");
                    int iOooO00o28 = OooO00o.OooO00o(cursorOooO0O0, "showVIP");
                    int iOooO00o29 = OooO00o.OooO00o(cursorOooO0O0, "currWealLv");
                    int iOooO00o30 = OooO00o.OooO00o(cursorOooO0O0, "currBadgeImg");
                    int iOooO00o31 = OooO00o.OooO00o(cursorOooO0O0, "currBadgeLv");
                    UserInfo userInfo = null;
                    String string = null;
                    if (cursorOooO0O0.moveToFirst()) {
                        UserInfo userInfo2 = new UserInfo();
                        userInfo2.setUserId(cursorOooO0O0.getLong(iOooO00o));
                        userInfo2.setUserIdx(cursorOooO0O0.isNull(iOooO00o2) ? null : cursorOooO0O0.getString(iOooO00o2));
                        userInfo2.setIdLevel(cursorOooO0O0.getInt(iOooO00o3));
                        userInfo2.setUserName(cursorOooO0O0.isNull(iOooO00o4) ? null : cursorOooO0O0.getString(iOooO00o4));
                        userInfo2.setUserHeader(cursorOooO0O0.isNull(iOooO00o5) ? null : cursorOooO0O0.getString(iOooO00o5));
                        userInfo2.setUserHeaderFrame(cursorOooO0O0.isNull(iOooO00o6) ? null : cursorOooO0O0.getString(iOooO00o6));
                        userInfo2.setBackground(cursorOooO0O0.isNull(iOooO00o7) ? null : cursorOooO0O0.getString(iOooO00o7));
                        userInfo2.setUserLevel(cursorOooO0O0.getInt(iOooO00o8));
                        userInfo2.setBlackUser(cursorOooO0O0.getInt(iOooO00o9) != 0);
                        userInfo2.setSex(cursorOooO0O0.getInt(iOooO00o10));
                        userInfo2.setBio(cursorOooO0O0.isNull(iOooO00o11) ? null : cursorOooO0O0.getString(iOooO00o11));
                        userInfo2.setBirthday(cursorOooO0O0.isNull(iOooO00o12) ? null : cursorOooO0O0.getString(iOooO00o12));
                        userInfo2.setAge(cursorOooO0O0.getInt(iOooO00o13));
                        userInfo2.setCountryId(cursorOooO0O0.getInt(iOooO00o14));
                        userInfo2.setRegion(cursorOooO0O0.getInt(iOooO00o15));
                        userInfo2.setMedal(cursorOooO0O0.isNull(iOooO00o16) ? null : cursorOooO0O0.getString(iOooO00o16));
                        userInfo2.setVisitorNum(cursorOooO0O0.getInt(iOooO00o17));
                        userInfo2.setFollowedNum(cursorOooO0O0.getInt(iOooO00o18));
                        userInfo2.setFansNum(cursorOooO0O0.getInt(iOooO00o19));
                        userInfo2.setJoinRoomNum(cursorOooO0O0.getInt(iOooO00o20));
                        userInfo2.setRole(cursorOooO0O0.getInt(iOooO00o21));
                        userInfo2.setRegTime(cursorOooO0O0.getInt(iOooO00o22));
                        try {
                            userInfo2.setTags(this.f44639OooO0OO.stringToList(cursorOooO0O0.isNull(iOooO00o23) ? null : cursorOooO0O0.getString(iOooO00o23)));
                            userInfo2.setPremium(cursorOooO0O0.getInt(iOooO00o24) != 0);
                            userInfo2.setPremiumLevel(cursorOooO0O0.getInt(iOooO00o25));
                            userInfo2.setVipState(cursorOooO0O0.getInt(iOooO00o26));
                            userInfo2.setVipLevel(cursorOooO0O0.getInt(iOooO00o27));
                            userInfo2.setShowVIP(cursorOooO0O0.getInt(iOooO00o28) != 0);
                            userInfo2.setWealthLevel(cursorOooO0O0.getInt(iOooO00o29));
                            if (!cursorOooO0O0.isNull(iOooO00o30)) {
                                string = cursorOooO0O0.getString(iOooO00o30);
                            }
                            userInfo2.setWealthBadgeWithBg(string);
                            userInfo2.setCurrBadgeLv(cursorOooO0O0.getInt(iOooO00o31));
                            userInfo = userInfo2;
                        } catch (Throwable th) {
                            th = th;
                            cursorOooO0O0.close();
                            roomSQLiteQuery.release();
                            throw th;
                        }
                    }
                    cursorOooO0O0.close();
                    roomSQLiteQuery.release();
                    return userInfo;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
        }
    }

    @Override // p403o0Oo0OOo.ooo0o
    public final void OooO0OO(UserInfoModel userInfoModel) {
        RoomDatabase roomDatabase = this.f44637OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44638OooO0O0.OooO0o(userInfoModel);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.ooo0o
    public final void OooO0Oo(List<? extends UserInfo> list) {
        RoomDatabase roomDatabase = this.f44637OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44638OooO0O0.OooO0o0(list);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }
}
