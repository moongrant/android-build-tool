package p490o0o00O0;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.common.db.converter.TagConverter;
import com.yalla.yalla.common.db.table.UserInfo;
import java.util.List;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo implements o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f41039OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p091o000o00o.o000OOo<UserInfo> f41040OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TagConverter f41041OooO0OO = new TagConverter();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f41042OooO0Oo;

    public class OooO00o extends p091o000o00o.o000OOo<UserInfo> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `UserInfoTable` (`userId`,`userIdx`,`idLevel`,`userName`,`userAvatar`,`userFrame`,`background`,`userLevel`,`gender`,`bio`,`birthday`,`age`,`countryId`,`region`,`medal`,`visitorNum`,`followedNum`,`fansNum`,`joinRoomNum`,`role`,`regTime`,`tags`,`vip`,`vipLevel`,`kaVipState`,`kaVipLevel`,`showVIP`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, UserInfo userInfo) {
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
            supportSQLiteStatement.bindLong(9, userInfo2.getSex());
            if (userInfo2.getBio() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, userInfo2.getBio());
            }
            if (userInfo2.getBirthday() == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, userInfo2.getBirthday());
            }
            supportSQLiteStatement.bindLong(12, userInfo2.getAge());
            supportSQLiteStatement.bindLong(13, userInfo2.getCountryId());
            supportSQLiteStatement.bindLong(14, userInfo2.getRegion());
            if (userInfo2.getMedal() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, userInfo2.getMedal());
            }
            supportSQLiteStatement.bindLong(16, userInfo2.getVisitorNum());
            supportSQLiteStatement.bindLong(17, userInfo2.getFollowedNum());
            supportSQLiteStatement.bindLong(18, userInfo2.getFansNum());
            supportSQLiteStatement.bindLong(19, userInfo2.getJoinRoomNum());
            supportSQLiteStatement.bindLong(20, userInfo2.getRole());
            supportSQLiteStatement.bindLong(21, userInfo2.getRegTime());
            String strListToString = o000OOo.this.f41041OooO0OO.listToString(userInfo2.getTags());
            if (strListToString == null) {
                supportSQLiteStatement.bindNull(22);
            } else {
                supportSQLiteStatement.bindString(22, strListToString);
            }
            supportSQLiteStatement.bindLong(23, userInfo2.isPremium() ? 1L : 0L);
            supportSQLiteStatement.bindLong(24, userInfo2.getPremiumLevel());
            supportSQLiteStatement.bindLong(25, userInfo2.getVipState());
            supportSQLiteStatement.bindLong(26, userInfo2.getVipLevel());
            supportSQLiteStatement.bindLong(27, userInfo2.getShowVIP() ? 1L : 0L);
        }
    }

    public class OooO0O0 extends o0000OO0 {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Delete from UserInfoTable Where userId = ?";
        }
    }

    public o000OOo(RoomDatabase roomDatabase) {
        this.f41039OooO00o = roomDatabase;
        this.f41040OooO0O0 = new OooO00o(roomDatabase);
        this.f41042OooO0Oo = new OooO0O0(roomDatabase);
    }

    @Override // p490o0o00O0.o0O0O00
    public final void OooO00o(long j) {
        this.f41039OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41042OooO0Oo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        this.f41039OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41039OooO00o.OooOOOO();
        } finally {
            this.f41039OooO00o.OooOO0O();
            this.f41042OooO0Oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p490o0o00O0.o0O0O00
    public final UserInfo OooO0O0(long j) throws Throwable {
        o0000O0 o0000o1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from UserInfoTable Where userId = ? limit 1", 1);
        o0000o0OooO0o.bindLong(1, j);
        this.f41039OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41039OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "userId");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "userIdx");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "idLevel");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "userName");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "userAvatar");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "userFrame");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "background");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "userLevel");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "gender");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "bio");
            int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "birthday");
            int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "age");
            int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "countryId");
            o0000o1 = o0000o0OooO0o;
            try {
                int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "region");
                try {
                    int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "medal");
                    int iOooO00o16 = o00O0O.OooO00o(cursorOooOOO, "visitorNum");
                    int iOooO00o17 = o00O0O.OooO00o(cursorOooOOO, "followedNum");
                    int iOooO00o18 = o00O0O.OooO00o(cursorOooOOO, "fansNum");
                    int iOooO00o19 = o00O0O.OooO00o(cursorOooOOO, "joinRoomNum");
                    int iOooO00o20 = o00O0O.OooO00o(cursorOooOOO, "role");
                    int iOooO00o21 = o00O0O.OooO00o(cursorOooOOO, "regTime");
                    int iOooO00o22 = o00O0O.OooO00o(cursorOooOOO, "tags");
                    int iOooO00o23 = o00O0O.OooO00o(cursorOooOOO, "vip");
                    int iOooO00o24 = o00O0O.OooO00o(cursorOooOOO, "vipLevel");
                    int iOooO00o25 = o00O0O.OooO00o(cursorOooOOO, "kaVipState");
                    int iOooO00o26 = o00O0O.OooO00o(cursorOooOOO, "kaVipLevel");
                    int iOooO00o27 = o00O0O.OooO00o(cursorOooOOO, "showVIP");
                    UserInfo userInfo = null;
                    if (cursorOooOOO.moveToFirst()) {
                        UserInfo userInfo2 = new UserInfo();
                        userInfo2.setUserId(cursorOooOOO.getLong(iOooO00o));
                        userInfo2.setUserIdx(cursorOooOOO.isNull(iOooO00o2) ? null : cursorOooOOO.getString(iOooO00o2));
                        userInfo2.setIdLevel(cursorOooOOO.getInt(iOooO00o3));
                        userInfo2.setUserName(cursorOooOOO.isNull(iOooO00o4) ? null : cursorOooOOO.getString(iOooO00o4));
                        userInfo2.setUserHeader(cursorOooOOO.isNull(iOooO00o5) ? null : cursorOooOOO.getString(iOooO00o5));
                        userInfo2.setUserHeaderFrame(cursorOooOOO.isNull(iOooO00o6) ? null : cursorOooOOO.getString(iOooO00o6));
                        userInfo2.setBackground(cursorOooOOO.isNull(iOooO00o7) ? null : cursorOooOOO.getString(iOooO00o7));
                        userInfo2.setUserLevel(cursorOooOOO.getInt(iOooO00o8));
                        userInfo2.setSex(cursorOooOOO.getInt(iOooO00o9));
                        userInfo2.setBio(cursorOooOOO.isNull(iOooO00o10) ? null : cursorOooOOO.getString(iOooO00o10));
                        userInfo2.setBirthday(cursorOooOOO.isNull(iOooO00o11) ? null : cursorOooOOO.getString(iOooO00o11));
                        userInfo2.setAge(cursorOooOOO.getInt(iOooO00o12));
                        userInfo2.setCountryId(cursorOooOOO.getInt(iOooO00o13));
                        userInfo2.setRegion(cursorOooOOO.getInt(iOooO00o14));
                        userInfo2.setMedal(cursorOooOOO.isNull(iOooO00o15) ? null : cursorOooOOO.getString(iOooO00o15));
                        userInfo2.setVisitorNum(cursorOooOOO.getInt(iOooO00o16));
                        userInfo2.setFollowedNum(cursorOooOOO.getInt(iOooO00o17));
                        userInfo2.setFansNum(cursorOooOOO.getInt(iOooO00o18));
                        userInfo2.setJoinRoomNum(cursorOooOOO.getInt(iOooO00o19));
                        userInfo2.setRole(cursorOooOOO.getInt(iOooO00o20));
                        userInfo2.setRegTime(cursorOooOOO.getInt(iOooO00o21));
                        try {
                            userInfo2.setTags(this.f41041OooO0OO.stringToList(cursorOooOOO.isNull(iOooO00o22) ? null : cursorOooOOO.getString(iOooO00o22)));
                            userInfo2.setPremium(cursorOooOOO.getInt(iOooO00o23) != 0);
                            userInfo2.setPremiumLevel(cursorOooOOO.getInt(iOooO00o24));
                            userInfo2.setVipState(cursorOooOOO.getInt(iOooO00o25));
                            userInfo2.setVipLevel(cursorOooOOO.getInt(iOooO00o26));
                            userInfo2.setShowVIP(cursorOooOOO.getInt(iOooO00o27) != 0);
                            userInfo = userInfo2;
                        } catch (Throwable th) {
                            th = th;
                            cursorOooOOO.close();
                            o0000o1.release();
                            throw th;
                        }
                    }
                    cursorOooOOO.close();
                    o0000o1.release();
                    return userInfo;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            o0000o1 = o0000o0OooO0o;
        }
    }

    @Override // p490o0o00O0.o0O0O00
    public final void OooO0OO(UserInfo userInfo) {
        this.f41039OooO00o.OooO0O0();
        this.f41039OooO00o.OooO0OO();
        try {
            this.f41040OooO0O0.OooO0oO(userInfo);
            this.f41039OooO00o.OooOOOO();
        } finally {
            this.f41039OooO00o.OooOO0O();
        }
    }

    @Override // p490o0o00O0.o0O0O00
    public final void OooO0Oo(List<? extends UserInfo> list) {
        this.f41039OooO00o.OooO0O0();
        this.f41039OooO00o.OooO0OO();
        try {
            this.f41040OooO0O0.OooO0o(list);
            this.f41039OooO00o.OooOOOO();
        } finally {
            this.f41039OooO00o.OooOO0O();
        }
    }
}
