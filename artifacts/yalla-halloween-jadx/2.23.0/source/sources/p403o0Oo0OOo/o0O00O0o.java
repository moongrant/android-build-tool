package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.table.Friend;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import java.util.ArrayList;
import o000O.OooO00o;
import p072o000O0oO.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o extends Oooo0<FriendInfo> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0OoO00O f44530OooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(o0OoO00O o0ooo00o2, RoomSQLiteQuery roomSQLiteQuery, RoomDatabase roomDatabase, String... strArr) {
        super(roomSQLiteQuery, roomDatabase, strArr);
        this.f44530OooO0o = o0ooo00o2;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0333  */
    /* JADX WARN: Code duplicated, block: B:116:0x0335  */
    /* JADX WARN: Code duplicated, block: B:119:0x0349  */
    /* JADX WARN: Code duplicated, block: B:120:0x034b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0358  */
    /* JADX WARN: Code duplicated, block: B:124:0x035a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0367  */
    /* JADX WARN: Code duplicated, block: B:128:0x0369  */
    /* JADX WARN: Code duplicated, block: B:131:0x0376  */
    /* JADX WARN: Code duplicated, block: B:132:0x0378  */
    /* JADX WARN: Code duplicated, block: B:135:0x038c  */
    /* JADX WARN: Code duplicated, block: B:136:0x038e  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:143:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:151:0x0432  */
    /* JADX WARN: Code duplicated, block: B:152:0x043a  */
    /* JADX WARN: Code duplicated, block: B:155:0x045b  */
    /* JADX WARN: Code duplicated, block: B:156:0x045d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0487  */
    /* JADX WARN: Code duplicated, block: B:160:0x0489  */
    /* JADX WARN: Code duplicated, block: B:163:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:164:0x04a5  */
    @Override // p072o000O0oO.Oooo0
    public final ArrayList OooO0o0(Cursor cursor) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList;
        int i15;
        Friend friend;
        int i16;
        UserInfo userInfo;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        boolean z;
        String string6;
        String string7;
        int i17;
        int i18;
        int i19;
        String string8;
        String string9;
        int i20;
        boolean z2;
        int i21;
        boolean z3;
        int i22;
        String string10;
        int i23;
        Cursor cursor2 = cursor;
        int iOooO00o = OooO00o.OooO00o(cursor2, "uid");
        int iOooO00o2 = OooO00o.OooO00o(cursor2, "friendId");
        int iOooO00o3 = OooO00o.OooO00o(cursor2, "memoName");
        int iOooO00o4 = OooO00o.OooO00o(cursor2, "time");
        int iOooO00o5 = OooO00o.OooO00o(cursor2, "inRoom");
        int iOooO00o6 = OooO00o.OooO00o(cursor2, "deleteMark");
        int iOooO00o7 = OooO00o.OooO00o(cursor2, "isCheckUserRisk");
        int iOooO00o8 = OooO00o.OooO00o(cursor2, "userId");
        int iOooO00o9 = OooO00o.OooO00o(cursor2, "userIdx");
        int iOooO00o10 = OooO00o.OooO00o(cursor2, "idLevel");
        int iOooO00o11 = OooO00o.OooO00o(cursor2, "userName");
        int iOooO00o12 = OooO00o.OooO00o(cursor2, "userAvatar");
        int iOooO00o13 = OooO00o.OooO00o(cursor2, "userFrame");
        int iOooO00o14 = OooO00o.OooO00o(cursor2, "background");
        int iOooO00o15 = OooO00o.OooO00o(cursor2, "userLevel");
        int iOooO00o16 = OooO00o.OooO00o(cursor2, "isBlackUser");
        int iOooO00o17 = OooO00o.OooO00o(cursor2, "gender");
        int iOooO00o18 = OooO00o.OooO00o(cursor2, "bio");
        int iOooO00o19 = OooO00o.OooO00o(cursor2, "birthday");
        int iOooO00o20 = OooO00o.OooO00o(cursor2, "age");
        int iOooO00o21 = OooO00o.OooO00o(cursor2, "countryId");
        int iOooO00o22 = OooO00o.OooO00o(cursor2, "region");
        int iOooO00o23 = OooO00o.OooO00o(cursor2, "medal");
        int iOooO00o24 = OooO00o.OooO00o(cursor2, "visitorNum");
        int iOooO00o25 = OooO00o.OooO00o(cursor2, "followedNum");
        int iOooO00o26 = OooO00o.OooO00o(cursor2, "fansNum");
        int iOooO00o27 = OooO00o.OooO00o(cursor2, "joinRoomNum");
        int iOooO00o28 = OooO00o.OooO00o(cursor2, "role");
        int iOooO00o29 = OooO00o.OooO00o(cursor2, "regTime");
        int iOooO00o30 = OooO00o.OooO00o(cursor2, "tags");
        int iOooO00o31 = OooO00o.OooO00o(cursor2, "vip");
        int iOooO00o32 = OooO00o.OooO00o(cursor2, "vipLevel");
        int iOooO00o33 = OooO00o.OooO00o(cursor2, "kaVipState");
        int iOooO00o34 = OooO00o.OooO00o(cursor2, "kaVipLevel");
        int iOooO00o35 = OooO00o.OooO00o(cursor2, "showVIP");
        int iOooO00o36 = OooO00o.OooO00o(cursor2, "currWealLv");
        int iOooO00o37 = OooO00o.OooO00o(cursor2, "currBadgeImg");
        int iOooO00o38 = OooO00o.OooO00o(cursor2, "currBadgeLv");
        int i24 = iOooO00o14;
        ArrayList arrayList2 = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            Friend friend2 = new Friend();
            int i25 = iOooO00o12;
            int i26 = iOooO00o13;
            friend2.setUid(cursor2.getLong(iOooO00o));
            friend2.setFriendId(cursor2.getLong(iOooO00o2));
            friend2.setMemoName(cursor2.isNull(iOooO00o3) ? null : cursor2.getString(iOooO00o3));
            int i27 = iOooO00o;
            int i28 = iOooO00o2;
            friend2.setTime(cursor2.getLong(iOooO00o4));
            friend2.setInRoom(cursor2.getInt(iOooO00o5) != 0);
            friend2.setDeleteMark(cursor2.getInt(iOooO00o6) != 0);
            friend2.setCheckUserRisk(cursor2.getInt(iOooO00o7) != 0);
            if (cursor2.isNull(iOooO00o8) && cursor2.isNull(iOooO00o9) && cursor2.isNull(iOooO00o10) && cursor2.isNull(iOooO00o11)) {
                i = i25;
                if (cursor2.isNull(i)) {
                    i2 = i26;
                    i24 = i24;
                    if (cursor2.isNull(i2) && cursor2.isNull(i24)) {
                        i3 = iOooO00o3;
                        i4 = iOooO00o15;
                        if (cursor2.isNull(i4)) {
                            i5 = iOooO00o4;
                            i6 = iOooO00o16;
                            if (cursor2.isNull(i6)) {
                                i7 = iOooO00o5;
                                i8 = iOooO00o17;
                                if (cursor2.isNull(i8)) {
                                    i9 = iOooO00o6;
                                    i10 = iOooO00o18;
                                    if (cursor2.isNull(i10)) {
                                        i11 = iOooO00o7;
                                        i12 = iOooO00o19;
                                        if (cursor2.isNull(i12)) {
                                            i13 = i27;
                                            i14 = iOooO00o20;
                                            if (cursor2.isNull(i14)) {
                                                arrayList = arrayList2;
                                                i15 = iOooO00o21;
                                                if (cursor2.isNull(i15)) {
                                                    friend = friend2;
                                                    int i29 = iOooO00o22;
                                                    if (cursor2.isNull(i29)) {
                                                        iOooO00o22 = i29;
                                                        int i30 = iOooO00o23;
                                                        if (cursor2.isNull(i30)) {
                                                            iOooO00o23 = i30;
                                                            int i31 = iOooO00o24;
                                                            if (cursor2.isNull(i31)) {
                                                                iOooO00o24 = i31;
                                                                int i32 = iOooO00o25;
                                                                if (cursor2.isNull(i32)) {
                                                                    iOooO00o25 = i32;
                                                                    int i33 = iOooO00o26;
                                                                    if (cursor2.isNull(i33)) {
                                                                        iOooO00o26 = i33;
                                                                        int i34 = iOooO00o27;
                                                                        if (cursor2.isNull(i34)) {
                                                                            iOooO00o27 = i34;
                                                                            int i35 = iOooO00o28;
                                                                            if (cursor2.isNull(i35)) {
                                                                                iOooO00o28 = i35;
                                                                                int i36 = iOooO00o29;
                                                                                if (cursor2.isNull(i36)) {
                                                                                    iOooO00o29 = i36;
                                                                                    int i37 = iOooO00o30;
                                                                                    if (cursor2.isNull(i37)) {
                                                                                        iOooO00o30 = i37;
                                                                                        int i38 = iOooO00o31;
                                                                                        if (cursor2.isNull(i38)) {
                                                                                            iOooO00o31 = i38;
                                                                                            int i39 = iOooO00o32;
                                                                                            if (cursor2.isNull(i39)) {
                                                                                                iOooO00o32 = i39;
                                                                                                int i40 = iOooO00o33;
                                                                                                if (cursor2.isNull(i40)) {
                                                                                                    iOooO00o33 = i40;
                                                                                                    int i41 = iOooO00o34;
                                                                                                    if (cursor2.isNull(i41)) {
                                                                                                        iOooO00o34 = i41;
                                                                                                        int i42 = iOooO00o35;
                                                                                                        if (cursor2.isNull(i42)) {
                                                                                                            iOooO00o35 = i42;
                                                                                                            int i43 = iOooO00o36;
                                                                                                            if (cursor2.isNull(i43)) {
                                                                                                                iOooO00o36 = i43;
                                                                                                                int i44 = iOooO00o37;
                                                                                                                if (cursor2.isNull(i44)) {
                                                                                                                    iOooO00o37 = i44;
                                                                                                                    i16 = iOooO00o38;
                                                                                                                    if (cursor2.isNull(i16)) {
                                                                                                                        i = i;
                                                                                                                        i4 = i4;
                                                                                                                        i23 = i16;
                                                                                                                        i17 = iOooO00o22;
                                                                                                                        i21 = iOooO00o32;
                                                                                                                        userInfo = null;
                                                                                                                        i18 = i2;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    iOooO00o37 = i44;
                                                                                                                }
                                                                                                            } else {
                                                                                                                iOooO00o36 = i43;
                                                                                                            }
                                                                                                        } else {
                                                                                                            iOooO00o35 = i42;
                                                                                                        }
                                                                                                    } else {
                                                                                                        iOooO00o34 = i41;
                                                                                                    }
                                                                                                } else {
                                                                                                    iOooO00o33 = i40;
                                                                                                }
                                                                                            } else {
                                                                                                iOooO00o32 = i39;
                                                                                            }
                                                                                        } else {
                                                                                            iOooO00o31 = i38;
                                                                                        }
                                                                                    } else {
                                                                                        iOooO00o30 = i37;
                                                                                    }
                                                                                } else {
                                                                                    iOooO00o29 = i36;
                                                                                }
                                                                            } else {
                                                                                iOooO00o28 = i35;
                                                                            }
                                                                        } else {
                                                                            iOooO00o27 = i34;
                                                                        }
                                                                    } else {
                                                                        iOooO00o26 = i33;
                                                                    }
                                                                } else {
                                                                    iOooO00o25 = i32;
                                                                }
                                                            } else {
                                                                iOooO00o24 = i31;
                                                            }
                                                        } else {
                                                            iOooO00o23 = i30;
                                                        }
                                                    } else {
                                                        iOooO00o22 = i29;
                                                    }
                                                    userInfo = new UserInfo();
                                                    int i45 = i10;
                                                    int i46 = i12;
                                                    userInfo.setUserId(cursor2.getLong(iOooO00o8));
                                                    if (cursor2.isNull(iOooO00o9)) {
                                                        string = null;
                                                    } else {
                                                        string = cursor2.getString(iOooO00o9);
                                                    }
                                                    userInfo.setUserIdx(string);
                                                    userInfo.setIdLevel(cursor2.getInt(iOooO00o10));
                                                    if (cursor2.isNull(iOooO00o11)) {
                                                        string2 = null;
                                                    } else {
                                                        string2 = cursor2.getString(iOooO00o11);
                                                    }
                                                    userInfo.setUserName(string2);
                                                    if (cursor2.isNull(i)) {
                                                        string3 = null;
                                                    } else {
                                                        string3 = cursor2.getString(i);
                                                    }
                                                    userInfo.setUserHeader(string3);
                                                    if (cursor2.isNull(i2)) {
                                                        string4 = null;
                                                    } else {
                                                        string4 = cursor2.getString(i2);
                                                    }
                                                    userInfo.setUserHeaderFrame(string4);
                                                    if (cursor2.isNull(i24)) {
                                                        string5 = null;
                                                    } else {
                                                        string5 = cursor2.getString(i24);
                                                    }
                                                    userInfo.setBackground(string5);
                                                    userInfo.setUserLevel(cursor2.getInt(i4));
                                                    if (cursor2.getInt(i6) != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    userInfo.setBlackUser(z);
                                                    userInfo.setSex(cursor2.getInt(i8));
                                                    i10 = i45;
                                                    if (cursor2.isNull(i10)) {
                                                        string6 = null;
                                                    } else {
                                                        string6 = cursor2.getString(i10);
                                                    }
                                                    userInfo.setBio(string6);
                                                    i12 = i46;
                                                    if (cursor2.isNull(i12)) {
                                                        string7 = null;
                                                    } else {
                                                        string7 = cursor2.getString(i12);
                                                    }
                                                    userInfo.setBirthday(string7);
                                                    userInfo.setAge(cursor2.getInt(i14));
                                                    userInfo.setCountryId(cursor2.getInt(i15));
                                                    i17 = iOooO00o22;
                                                    i18 = i2;
                                                    userInfo.setRegion(cursor2.getInt(i17));
                                                    i19 = iOooO00o23;
                                                    if (cursor2.isNull(i19)) {
                                                        string8 = null;
                                                    } else {
                                                        string8 = cursor2.getString(i19);
                                                    }
                                                    userInfo.setMedal(string8);
                                                    iOooO00o23 = i19;
                                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o24));
                                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o25));
                                                    userInfo.setFansNum(cursor2.getInt(iOooO00o26));
                                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o27));
                                                    userInfo.setRole(cursor2.getInt(iOooO00o28));
                                                    iOooO00o29 = iOooO00o29;
                                                    userInfo.setRegTime(cursor2.getInt(iOooO00o29));
                                                    iOooO00o30 = iOooO00o30;
                                                    if (cursor2.isNull(iOooO00o30)) {
                                                        string9 = null;
                                                    } else {
                                                        string9 = cursor2.getString(iOooO00o30);
                                                    }
                                                    userInfo.setTags(this.f44530OooO0o.f44561OooO.stringToList(string9));
                                                    i20 = iOooO00o31;
                                                    if (cursor2.getInt(i20) != 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    userInfo.setPremium(z2);
                                                    iOooO00o31 = i20;
                                                    i21 = iOooO00o32;
                                                    userInfo.setPremiumLevel(cursor2.getInt(i21));
                                                    userInfo.setVipState(cursor2.getInt(iOooO00o33));
                                                    int i47 = iOooO00o34;
                                                    userInfo.setVipLevel(cursor2.getInt(i47));
                                                    if (cursor2.getInt(iOooO00o35) != 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    userInfo.setShowVIP(z3);
                                                    iOooO00o34 = i47;
                                                    iOooO00o36 = iOooO00o36;
                                                    userInfo.setWealthLevel(cursor2.getInt(iOooO00o36));
                                                    i22 = iOooO00o37;
                                                    if (cursor2.isNull(i22)) {
                                                        string10 = null;
                                                    } else {
                                                        string10 = cursor2.getString(i22);
                                                    }
                                                    userInfo.setWealthBadgeWithBg(string10);
                                                    iOooO00o37 = i22;
                                                    i23 = iOooO00o38;
                                                    userInfo.setCurrBadgeLv(cursor2.getInt(i23));
                                                }
                                                iOooO00o38 = i16;
                                                userInfo = new UserInfo();
                                                int i48 = i10;
                                                int i49 = i12;
                                                userInfo.setUserId(cursor2.getLong(iOooO00o8));
                                                if (cursor2.isNull(iOooO00o9)) {
                                                    string = null;
                                                } else {
                                                    string = cursor2.getString(iOooO00o9);
                                                }
                                                userInfo.setUserIdx(string);
                                                userInfo.setIdLevel(cursor2.getInt(iOooO00o10));
                                                if (cursor2.isNull(iOooO00o11)) {
                                                    string2 = null;
                                                } else {
                                                    string2 = cursor2.getString(iOooO00o11);
                                                }
                                                userInfo.setUserName(string2);
                                                if (cursor2.isNull(i)) {
                                                    string3 = null;
                                                } else {
                                                    string3 = cursor2.getString(i);
                                                }
                                                userInfo.setUserHeader(string3);
                                                if (cursor2.isNull(i2)) {
                                                    string4 = null;
                                                } else {
                                                    string4 = cursor2.getString(i2);
                                                }
                                                userInfo.setUserHeaderFrame(string4);
                                                if (cursor2.isNull(i24)) {
                                                    string5 = null;
                                                } else {
                                                    string5 = cursor2.getString(i24);
                                                }
                                                userInfo.setBackground(string5);
                                                userInfo.setUserLevel(cursor2.getInt(i4));
                                                if (cursor2.getInt(i6) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                userInfo.setBlackUser(z);
                                                userInfo.setSex(cursor2.getInt(i8));
                                                i10 = i48;
                                                if (cursor2.isNull(i10)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = cursor2.getString(i10);
                                                }
                                                userInfo.setBio(string6);
                                                i12 = i49;
                                                if (cursor2.isNull(i12)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = cursor2.getString(i12);
                                                }
                                                userInfo.setBirthday(string7);
                                                userInfo.setAge(cursor2.getInt(i14));
                                                userInfo.setCountryId(cursor2.getInt(i15));
                                                i17 = iOooO00o22;
                                                i18 = i2;
                                                userInfo.setRegion(cursor2.getInt(i17));
                                                i19 = iOooO00o23;
                                                if (cursor2.isNull(i19)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = cursor2.getString(i19);
                                                }
                                                userInfo.setMedal(string8);
                                                iOooO00o23 = i19;
                                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o24));
                                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o25));
                                                userInfo.setFansNum(cursor2.getInt(iOooO00o26));
                                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o27));
                                                userInfo.setRole(cursor2.getInt(iOooO00o28));
                                                iOooO00o29 = iOooO00o29;
                                                userInfo.setRegTime(cursor2.getInt(iOooO00o29));
                                                iOooO00o30 = iOooO00o30;
                                                if (cursor2.isNull(iOooO00o30)) {
                                                    string9 = null;
                                                } else {
                                                    string9 = cursor2.getString(iOooO00o30);
                                                }
                                                userInfo.setTags(this.f44530OooO0o.f44561OooO.stringToList(string9));
                                                i20 = iOooO00o31;
                                                if (cursor2.getInt(i20) != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                userInfo.setPremium(z2);
                                                iOooO00o31 = i20;
                                                i21 = iOooO00o32;
                                                userInfo.setPremiumLevel(cursor2.getInt(i21));
                                                userInfo.setVipState(cursor2.getInt(iOooO00o33));
                                                int i410 = iOooO00o34;
                                                userInfo.setVipLevel(cursor2.getInt(i410));
                                                if (cursor2.getInt(iOooO00o35) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                userInfo.setShowVIP(z3);
                                                iOooO00o34 = i410;
                                                iOooO00o36 = iOooO00o36;
                                                userInfo.setWealthLevel(cursor2.getInt(iOooO00o36));
                                                i22 = iOooO00o37;
                                                if (cursor2.isNull(i22)) {
                                                    string10 = null;
                                                } else {
                                                    string10 = cursor2.getString(i22);
                                                }
                                                userInfo.setWealthBadgeWithBg(string10);
                                                iOooO00o37 = i22;
                                                i23 = iOooO00o38;
                                                userInfo.setCurrBadgeLv(cursor2.getInt(i23));
                                            }
                                            friend = friend2;
                                            i16 = iOooO00o38;
                                            iOooO00o38 = i16;
                                            userInfo = new UserInfo();
                                            int i411 = i10;
                                            int i412 = i12;
                                            userInfo.setUserId(cursor2.getLong(iOooO00o8));
                                            if (cursor2.isNull(iOooO00o9)) {
                                                string = null;
                                            } else {
                                                string = cursor2.getString(iOooO00o9);
                                            }
                                            userInfo.setUserIdx(string);
                                            userInfo.setIdLevel(cursor2.getInt(iOooO00o10));
                                            if (cursor2.isNull(iOooO00o11)) {
                                                string2 = null;
                                            } else {
                                                string2 = cursor2.getString(iOooO00o11);
                                            }
                                            userInfo.setUserName(string2);
                                            if (cursor2.isNull(i)) {
                                                string3 = null;
                                            } else {
                                                string3 = cursor2.getString(i);
                                            }
                                            userInfo.setUserHeader(string3);
                                            if (cursor2.isNull(i2)) {
                                                string4 = null;
                                            } else {
                                                string4 = cursor2.getString(i2);
                                            }
                                            userInfo.setUserHeaderFrame(string4);
                                            if (cursor2.isNull(i24)) {
                                                string5 = null;
                                            } else {
                                                string5 = cursor2.getString(i24);
                                            }
                                            userInfo.setBackground(string5);
                                            userInfo.setUserLevel(cursor2.getInt(i4));
                                            if (cursor2.getInt(i6) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            userInfo.setBlackUser(z);
                                            userInfo.setSex(cursor2.getInt(i8));
                                            i10 = i411;
                                            if (cursor2.isNull(i10)) {
                                                string6 = null;
                                            } else {
                                                string6 = cursor2.getString(i10);
                                            }
                                            userInfo.setBio(string6);
                                            i12 = i412;
                                            if (cursor2.isNull(i12)) {
                                                string7 = null;
                                            } else {
                                                string7 = cursor2.getString(i12);
                                            }
                                            userInfo.setBirthday(string7);
                                            userInfo.setAge(cursor2.getInt(i14));
                                            userInfo.setCountryId(cursor2.getInt(i15));
                                            i17 = iOooO00o22;
                                            i18 = i2;
                                            userInfo.setRegion(cursor2.getInt(i17));
                                            i19 = iOooO00o23;
                                            if (cursor2.isNull(i19)) {
                                                string8 = null;
                                            } else {
                                                string8 = cursor2.getString(i19);
                                            }
                                            userInfo.setMedal(string8);
                                            iOooO00o23 = i19;
                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o24));
                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o25));
                                            userInfo.setFansNum(cursor2.getInt(iOooO00o26));
                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o27));
                                            userInfo.setRole(cursor2.getInt(iOooO00o28));
                                            iOooO00o29 = iOooO00o29;
                                            userInfo.setRegTime(cursor2.getInt(iOooO00o29));
                                            iOooO00o30 = iOooO00o30;
                                            if (cursor2.isNull(iOooO00o30)) {
                                                string9 = null;
                                            } else {
                                                string9 = cursor2.getString(iOooO00o30);
                                            }
                                            userInfo.setTags(this.f44530OooO0o.f44561OooO.stringToList(string9));
                                            i20 = iOooO00o31;
                                            if (cursor2.getInt(i20) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            userInfo.setPremium(z2);
                                            iOooO00o31 = i20;
                                            i21 = iOooO00o32;
                                            userInfo.setPremiumLevel(cursor2.getInt(i21));
                                            userInfo.setVipState(cursor2.getInt(iOooO00o33));
                                            int i413 = iOooO00o34;
                                            userInfo.setVipLevel(cursor2.getInt(i413));
                                            if (cursor2.getInt(iOooO00o35) != 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            userInfo.setShowVIP(z3);
                                            iOooO00o34 = i413;
                                            iOooO00o36 = iOooO00o36;
                                            userInfo.setWealthLevel(cursor2.getInt(iOooO00o36));
                                            i22 = iOooO00o37;
                                            if (cursor2.isNull(i22)) {
                                                string10 = null;
                                            } else {
                                                string10 = cursor2.getString(i22);
                                            }
                                            userInfo.setWealthBadgeWithBg(string10);
                                            iOooO00o37 = i22;
                                            i23 = iOooO00o38;
                                            userInfo.setCurrBadgeLv(cursor2.getInt(i23));
                                        }
                                        arrayList = arrayList2;
                                        i15 = iOooO00o21;
                                        friend = friend2;
                                        i16 = iOooO00o38;
                                        iOooO00o38 = i16;
                                        userInfo = new UserInfo();
                                        int i414 = i10;
                                        int i415 = i12;
                                        userInfo.setUserId(cursor2.getLong(iOooO00o8));
                                        if (cursor2.isNull(iOooO00o9)) {
                                            string = null;
                                        } else {
                                            string = cursor2.getString(iOooO00o9);
                                        }
                                        userInfo.setUserIdx(string);
                                        userInfo.setIdLevel(cursor2.getInt(iOooO00o10));
                                        if (cursor2.isNull(iOooO00o11)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursor2.getString(iOooO00o11);
                                        }
                                        userInfo.setUserName(string2);
                                        if (cursor2.isNull(i)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursor2.getString(i);
                                        }
                                        userInfo.setUserHeader(string3);
                                        if (cursor2.isNull(i2)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursor2.getString(i2);
                                        }
                                        userInfo.setUserHeaderFrame(string4);
                                        if (cursor2.isNull(i24)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursor2.getString(i24);
                                        }
                                        userInfo.setBackground(string5);
                                        userInfo.setUserLevel(cursor2.getInt(i4));
                                        if (cursor2.getInt(i6) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        userInfo.setBlackUser(z);
                                        userInfo.setSex(cursor2.getInt(i8));
                                        i10 = i414;
                                        if (cursor2.isNull(i10)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursor2.getString(i10);
                                        }
                                        userInfo.setBio(string6);
                                        i12 = i415;
                                        if (cursor2.isNull(i12)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursor2.getString(i12);
                                        }
                                        userInfo.setBirthday(string7);
                                        userInfo.setAge(cursor2.getInt(i14));
                                        userInfo.setCountryId(cursor2.getInt(i15));
                                        i17 = iOooO00o22;
                                        i18 = i2;
                                        userInfo.setRegion(cursor2.getInt(i17));
                                        i19 = iOooO00o23;
                                        if (cursor2.isNull(i19)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursor2.getString(i19);
                                        }
                                        userInfo.setMedal(string8);
                                        iOooO00o23 = i19;
                                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o24));
                                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o25));
                                        userInfo.setFansNum(cursor2.getInt(iOooO00o26));
                                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o27));
                                        userInfo.setRole(cursor2.getInt(iOooO00o28));
                                        iOooO00o29 = iOooO00o29;
                                        userInfo.setRegTime(cursor2.getInt(iOooO00o29));
                                        iOooO00o30 = iOooO00o30;
                                        if (cursor2.isNull(iOooO00o30)) {
                                            string9 = null;
                                        } else {
                                            string9 = cursor2.getString(iOooO00o30);
                                        }
                                        userInfo.setTags(this.f44530OooO0o.f44561OooO.stringToList(string9));
                                        i20 = iOooO00o31;
                                        if (cursor2.getInt(i20) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        userInfo.setPremium(z2);
                                        iOooO00o31 = i20;
                                        i21 = iOooO00o32;
                                        userInfo.setPremiumLevel(cursor2.getInt(i21));
                                        userInfo.setVipState(cursor2.getInt(iOooO00o33));
                                        int i416 = iOooO00o34;
                                        userInfo.setVipLevel(cursor2.getInt(i416));
                                        if (cursor2.getInt(iOooO00o35) != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        userInfo.setShowVIP(z3);
                                        iOooO00o34 = i416;
                                        iOooO00o36 = iOooO00o36;
                                        userInfo.setWealthLevel(cursor2.getInt(iOooO00o36));
                                        i22 = iOooO00o37;
                                        if (cursor2.isNull(i22)) {
                                            string10 = null;
                                        } else {
                                            string10 = cursor2.getString(i22);
                                        }
                                        userInfo.setWealthBadgeWithBg(string10);
                                        iOooO00o37 = i22;
                                        i23 = iOooO00o38;
                                        userInfo.setCurrBadgeLv(cursor2.getInt(i23));
                                    }
                                    i13 = i27;
                                    i14 = iOooO00o20;
                                    arrayList = arrayList2;
                                    i15 = iOooO00o21;
                                    friend = friend2;
                                    i16 = iOooO00o38;
                                    iOooO00o38 = i16;
                                    userInfo = new UserInfo();
                                    int i417 = i10;
                                    int i418 = i12;
                                    userInfo.setUserId(cursor2.getLong(iOooO00o8));
                                    if (cursor2.isNull(iOooO00o9)) {
                                        string = null;
                                    } else {
                                        string = cursor2.getString(iOooO00o9);
                                    }
                                    userInfo.setUserIdx(string);
                                    userInfo.setIdLevel(cursor2.getInt(iOooO00o10));
                                    if (cursor2.isNull(iOooO00o11)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursor2.getString(iOooO00o11);
                                    }
                                    userInfo.setUserName(string2);
                                    if (cursor2.isNull(i)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursor2.getString(i);
                                    }
                                    userInfo.setUserHeader(string3);
                                    if (cursor2.isNull(i2)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursor2.getString(i2);
                                    }
                                    userInfo.setUserHeaderFrame(string4);
                                    if (cursor2.isNull(i24)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursor2.getString(i24);
                                    }
                                    userInfo.setBackground(string5);
                                    userInfo.setUserLevel(cursor2.getInt(i4));
                                    if (cursor2.getInt(i6) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    userInfo.setBlackUser(z);
                                    userInfo.setSex(cursor2.getInt(i8));
                                    i10 = i417;
                                    if (cursor2.isNull(i10)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursor2.getString(i10);
                                    }
                                    userInfo.setBio(string6);
                                    i12 = i418;
                                    if (cursor2.isNull(i12)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursor2.getString(i12);
                                    }
                                    userInfo.setBirthday(string7);
                                    userInfo.setAge(cursor2.getInt(i14));
                                    userInfo.setCountryId(cursor2.getInt(i15));
                                    i17 = iOooO00o22;
                                    i18 = i2;
                                    userInfo.setRegion(cursor2.getInt(i17));
                                    i19 = iOooO00o23;
                                    if (cursor2.isNull(i19)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursor2.getString(i19);
                                    }
                                    userInfo.setMedal(string8);
                                    iOooO00o23 = i19;
                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o24));
                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o25));
                                    userInfo.setFansNum(cursor2.getInt(iOooO00o26));
                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o27));
                                    userInfo.setRole(cursor2.getInt(iOooO00o28));
                                    iOooO00o29 = iOooO00o29;
                                    userInfo.setRegTime(cursor2.getInt(iOooO00o29));
                                    iOooO00o30 = iOooO00o30;
                                    if (cursor2.isNull(iOooO00o30)) {
                                        string9 = null;
                                    } else {
                                        string9 = cursor2.getString(iOooO00o30);
                                    }
                                    userInfo.setTags(this.f44530OooO0o.f44561OooO.stringToList(string9));
                                    i20 = iOooO00o31;
                                    if (cursor2.getInt(i20) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    userInfo.setPremium(z2);
                                    iOooO00o31 = i20;
                                    i21 = iOooO00o32;
                                    userInfo.setPremiumLevel(cursor2.getInt(i21));
                                    userInfo.setVipState(cursor2.getInt(iOooO00o33));
                                    int i419 = iOooO00o34;
                                    userInfo.setVipLevel(cursor2.getInt(i419));
                                    if (cursor2.getInt(iOooO00o35) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    userInfo.setShowVIP(z3);
                                    iOooO00o34 = i419;
                                    iOooO00o36 = iOooO00o36;
                                    userInfo.setWealthLevel(cursor2.getInt(iOooO00o36));
                                    i22 = iOooO00o37;
                                    if (cursor2.isNull(i22)) {
                                        string10 = null;
                                    } else {
                                        string10 = cursor2.getString(i22);
                                    }
                                    userInfo.setWealthBadgeWithBg(string10);
                                    iOooO00o37 = i22;
                                    i23 = iOooO00o38;
                                    userInfo.setCurrBadgeLv(cursor2.getInt(i23));
                                }
                                i11 = iOooO00o7;
                                i12 = iOooO00o19;
                                i13 = i27;
                                i14 = iOooO00o20;
                                arrayList = arrayList2;
                                i15 = iOooO00o21;
                                friend = friend2;
                                i16 = iOooO00o38;
                                iOooO00o38 = i16;
                                userInfo = new UserInfo();
                                int i4110 = i10;
                                int i4111 = i12;
                                userInfo.setUserId(cursor2.getLong(iOooO00o8));
                                if (cursor2.isNull(iOooO00o9)) {
                                    string = null;
                                } else {
                                    string = cursor2.getString(iOooO00o9);
                                }
                                userInfo.setUserIdx(string);
                                userInfo.setIdLevel(cursor2.getInt(iOooO00o10));
                                if (cursor2.isNull(iOooO00o11)) {
                                    string2 = null;
                                } else {
                                    string2 = cursor2.getString(iOooO00o11);
                                }
                                userInfo.setUserName(string2);
                                if (cursor2.isNull(i)) {
                                    string3 = null;
                                } else {
                                    string3 = cursor2.getString(i);
                                }
                                userInfo.setUserHeader(string3);
                                if (cursor2.isNull(i2)) {
                                    string4 = null;
                                } else {
                                    string4 = cursor2.getString(i2);
                                }
                                userInfo.setUserHeaderFrame(string4);
                                if (cursor2.isNull(i24)) {
                                    string5 = null;
                                } else {
                                    string5 = cursor2.getString(i24);
                                }
                                userInfo.setBackground(string5);
                                userInfo.setUserLevel(cursor2.getInt(i4));
                                if (cursor2.getInt(i6) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                userInfo.setBlackUser(z);
                                userInfo.setSex(cursor2.getInt(i8));
                                i10 = i4110;
                                if (cursor2.isNull(i10)) {
                                    string6 = null;
                                } else {
                                    string6 = cursor2.getString(i10);
                                }
                                userInfo.setBio(string6);
                                i12 = i4111;
                                if (cursor2.isNull(i12)) {
                                    string7 = null;
                                } else {
                                    string7 = cursor2.getString(i12);
                                }
                                userInfo.setBirthday(string7);
                                userInfo.setAge(cursor2.getInt(i14));
                                userInfo.setCountryId(cursor2.getInt(i15));
                                i17 = iOooO00o22;
                                i18 = i2;
                                userInfo.setRegion(cursor2.getInt(i17));
                                i19 = iOooO00o23;
                                if (cursor2.isNull(i19)) {
                                    string8 = null;
                                } else {
                                    string8 = cursor2.getString(i19);
                                }
                                userInfo.setMedal(string8);
                                iOooO00o23 = i19;
                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o24));
                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o25));
                                userInfo.setFansNum(cursor2.getInt(iOooO00o26));
                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o27));
                                userInfo.setRole(cursor2.getInt(iOooO00o28));
                                iOooO00o29 = iOooO00o29;
                                userInfo.setRegTime(cursor2.getInt(iOooO00o29));
                                iOooO00o30 = iOooO00o30;
                                if (cursor2.isNull(iOooO00o30)) {
                                    string9 = null;
                                } else {
                                    string9 = cursor2.getString(iOooO00o30);
                                }
                                userInfo.setTags(this.f44530OooO0o.f44561OooO.stringToList(string9));
                                i20 = iOooO00o31;
                                if (cursor2.getInt(i20) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                userInfo.setPremium(z2);
                                iOooO00o31 = i20;
                                i21 = iOooO00o32;
                                userInfo.setPremiumLevel(cursor2.getInt(i21));
                                userInfo.setVipState(cursor2.getInt(iOooO00o33));
                                int i4112 = iOooO00o34;
                                userInfo.setVipLevel(cursor2.getInt(i4112));
                                if (cursor2.getInt(iOooO00o35) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                userInfo.setShowVIP(z3);
                                iOooO00o34 = i4112;
                                iOooO00o36 = iOooO00o36;
                                userInfo.setWealthLevel(cursor2.getInt(iOooO00o36));
                                i22 = iOooO00o37;
                                if (cursor2.isNull(i22)) {
                                    string10 = null;
                                } else {
                                    string10 = cursor2.getString(i22);
                                }
                                userInfo.setWealthBadgeWithBg(string10);
                                iOooO00o37 = i22;
                                i23 = iOooO00o38;
                                userInfo.setCurrBadgeLv(cursor2.getInt(i23));
                            }
                            i9 = iOooO00o6;
                            i10 = iOooO00o18;
                            i11 = iOooO00o7;
                            i12 = iOooO00o19;
                            i13 = i27;
                            i14 = iOooO00o20;
                            arrayList = arrayList2;
                            i15 = iOooO00o21;
                            friend = friend2;
                            i16 = iOooO00o38;
                            iOooO00o38 = i16;
                            userInfo = new UserInfo();
                            int i4113 = i10;
                            int i4114 = i12;
                            userInfo.setUserId(cursor2.getLong(iOooO00o8));
                            if (cursor2.isNull(iOooO00o9)) {
                                string = null;
                            } else {
                                string = cursor2.getString(iOooO00o9);
                            }
                            userInfo.setUserIdx(string);
                            userInfo.setIdLevel(cursor2.getInt(iOooO00o10));
                            if (cursor2.isNull(iOooO00o11)) {
                                string2 = null;
                            } else {
                                string2 = cursor2.getString(iOooO00o11);
                            }
                            userInfo.setUserName(string2);
                            if (cursor2.isNull(i)) {
                                string3 = null;
                            } else {
                                string3 = cursor2.getString(i);
                            }
                            userInfo.setUserHeader(string3);
                            if (cursor2.isNull(i2)) {
                                string4 = null;
                            } else {
                                string4 = cursor2.getString(i2);
                            }
                            userInfo.setUserHeaderFrame(string4);
                            if (cursor2.isNull(i24)) {
                                string5 = null;
                            } else {
                                string5 = cursor2.getString(i24);
                            }
                            userInfo.setBackground(string5);
                            userInfo.setUserLevel(cursor2.getInt(i4));
                            if (cursor2.getInt(i6) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            userInfo.setBlackUser(z);
                            userInfo.setSex(cursor2.getInt(i8));
                            i10 = i4113;
                            if (cursor2.isNull(i10)) {
                                string6 = null;
                            } else {
                                string6 = cursor2.getString(i10);
                            }
                            userInfo.setBio(string6);
                            i12 = i4114;
                            if (cursor2.isNull(i12)) {
                                string7 = null;
                            } else {
                                string7 = cursor2.getString(i12);
                            }
                            userInfo.setBirthday(string7);
                            userInfo.setAge(cursor2.getInt(i14));
                            userInfo.setCountryId(cursor2.getInt(i15));
                            i17 = iOooO00o22;
                            i18 = i2;
                            userInfo.setRegion(cursor2.getInt(i17));
                            i19 = iOooO00o23;
                            if (cursor2.isNull(i19)) {
                                string8 = null;
                            } else {
                                string8 = cursor2.getString(i19);
                            }
                            userInfo.setMedal(string8);
                            iOooO00o23 = i19;
                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o24));
                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o25));
                            userInfo.setFansNum(cursor2.getInt(iOooO00o26));
                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o27));
                            userInfo.setRole(cursor2.getInt(iOooO00o28));
                            iOooO00o29 = iOooO00o29;
                            userInfo.setRegTime(cursor2.getInt(iOooO00o29));
                            iOooO00o30 = iOooO00o30;
                            if (cursor2.isNull(iOooO00o30)) {
                                string9 = null;
                            } else {
                                string9 = cursor2.getString(iOooO00o30);
                            }
                            userInfo.setTags(this.f44530OooO0o.f44561OooO.stringToList(string9));
                            i20 = iOooO00o31;
                            if (cursor2.getInt(i20) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            userInfo.setPremium(z2);
                            iOooO00o31 = i20;
                            i21 = iOooO00o32;
                            userInfo.setPremiumLevel(cursor2.getInt(i21));
                            userInfo.setVipState(cursor2.getInt(iOooO00o33));
                            int i4115 = iOooO00o34;
                            userInfo.setVipLevel(cursor2.getInt(i4115));
                            if (cursor2.getInt(iOooO00o35) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            userInfo.setShowVIP(z3);
                            iOooO00o34 = i4115;
                            iOooO00o36 = iOooO00o36;
                            userInfo.setWealthLevel(cursor2.getInt(iOooO00o36));
                            i22 = iOooO00o37;
                            if (cursor2.isNull(i22)) {
                                string10 = null;
                            } else {
                                string10 = cursor2.getString(i22);
                            }
                            userInfo.setWealthBadgeWithBg(string10);
                            iOooO00o37 = i22;
                            i23 = iOooO00o38;
                            userInfo.setCurrBadgeLv(cursor2.getInt(i23));
                        }
                        i7 = iOooO00o5;
                        i8 = iOooO00o17;
                        i9 = iOooO00o6;
                        i10 = iOooO00o18;
                        i11 = iOooO00o7;
                        i12 = iOooO00o19;
                        i13 = i27;
                        i14 = iOooO00o20;
                        arrayList = arrayList2;
                        i15 = iOooO00o21;
                        friend = friend2;
                        i16 = iOooO00o38;
                        iOooO00o38 = i16;
                        userInfo = new UserInfo();
                        int i4116 = i10;
                        int i4117 = i12;
                        userInfo.setUserId(cursor2.getLong(iOooO00o8));
                        if (cursor2.isNull(iOooO00o9)) {
                            string = null;
                        } else {
                            string = cursor2.getString(iOooO00o9);
                        }
                        userInfo.setUserIdx(string);
                        userInfo.setIdLevel(cursor2.getInt(iOooO00o10));
                        if (cursor2.isNull(iOooO00o11)) {
                            string2 = null;
                        } else {
                            string2 = cursor2.getString(iOooO00o11);
                        }
                        userInfo.setUserName(string2);
                        if (cursor2.isNull(i)) {
                            string3 = null;
                        } else {
                            string3 = cursor2.getString(i);
                        }
                        userInfo.setUserHeader(string3);
                        if (cursor2.isNull(i2)) {
                            string4 = null;
                        } else {
                            string4 = cursor2.getString(i2);
                        }
                        userInfo.setUserHeaderFrame(string4);
                        if (cursor2.isNull(i24)) {
                            string5 = null;
                        } else {
                            string5 = cursor2.getString(i24);
                        }
                        userInfo.setBackground(string5);
                        userInfo.setUserLevel(cursor2.getInt(i4));
                        if (cursor2.getInt(i6) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        userInfo.setBlackUser(z);
                        userInfo.setSex(cursor2.getInt(i8));
                        i10 = i4116;
                        if (cursor2.isNull(i10)) {
                            string6 = null;
                        } else {
                            string6 = cursor2.getString(i10);
                        }
                        userInfo.setBio(string6);
                        i12 = i4117;
                        if (cursor2.isNull(i12)) {
                            string7 = null;
                        } else {
                            string7 = cursor2.getString(i12);
                        }
                        userInfo.setBirthday(string7);
                        userInfo.setAge(cursor2.getInt(i14));
                        userInfo.setCountryId(cursor2.getInt(i15));
                        i17 = iOooO00o22;
                        i18 = i2;
                        userInfo.setRegion(cursor2.getInt(i17));
                        i19 = iOooO00o23;
                        if (cursor2.isNull(i19)) {
                            string8 = null;
                        } else {
                            string8 = cursor2.getString(i19);
                        }
                        userInfo.setMedal(string8);
                        iOooO00o23 = i19;
                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o24));
                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o25));
                        userInfo.setFansNum(cursor2.getInt(iOooO00o26));
                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o27));
                        userInfo.setRole(cursor2.getInt(iOooO00o28));
                        iOooO00o29 = iOooO00o29;
                        userInfo.setRegTime(cursor2.getInt(iOooO00o29));
                        iOooO00o30 = iOooO00o30;
                        if (cursor2.isNull(iOooO00o30)) {
                            string9 = null;
                        } else {
                            string9 = cursor2.getString(iOooO00o30);
                        }
                        userInfo.setTags(this.f44530OooO0o.f44561OooO.stringToList(string9));
                        i20 = iOooO00o31;
                        if (cursor2.getInt(i20) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        userInfo.setPremium(z2);
                        iOooO00o31 = i20;
                        i21 = iOooO00o32;
                        userInfo.setPremiumLevel(cursor2.getInt(i21));
                        userInfo.setVipState(cursor2.getInt(iOooO00o33));
                        int i4118 = iOooO00o34;
                        userInfo.setVipLevel(cursor2.getInt(i4118));
                        if (cursor2.getInt(iOooO00o35) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        userInfo.setShowVIP(z3);
                        iOooO00o34 = i4118;
                        iOooO00o36 = iOooO00o36;
                        userInfo.setWealthLevel(cursor2.getInt(iOooO00o36));
                        i22 = iOooO00o37;
                        if (cursor2.isNull(i22)) {
                            string10 = null;
                        } else {
                            string10 = cursor2.getString(i22);
                        }
                        userInfo.setWealthBadgeWithBg(string10);
                        iOooO00o37 = i22;
                        i23 = iOooO00o38;
                        userInfo.setCurrBadgeLv(cursor2.getInt(i23));
                    } else {
                        i3 = iOooO00o3;
                        i4 = iOooO00o15;
                    }
                    i5 = iOooO00o4;
                    i6 = iOooO00o16;
                    i7 = iOooO00o5;
                    i8 = iOooO00o17;
                    i9 = iOooO00o6;
                    i10 = iOooO00o18;
                    i11 = iOooO00o7;
                    i12 = iOooO00o19;
                    i13 = i27;
                    i14 = iOooO00o20;
                    arrayList = arrayList2;
                    i15 = iOooO00o21;
                    friend = friend2;
                    i16 = iOooO00o38;
                    iOooO00o38 = i16;
                    userInfo = new UserInfo();
                    int i4119 = i10;
                    int i41110 = i12;
                    userInfo.setUserId(cursor2.getLong(iOooO00o8));
                    if (cursor2.isNull(iOooO00o9)) {
                        string = null;
                    } else {
                        string = cursor2.getString(iOooO00o9);
                    }
                    userInfo.setUserIdx(string);
                    userInfo.setIdLevel(cursor2.getInt(iOooO00o10));
                    if (cursor2.isNull(iOooO00o11)) {
                        string2 = null;
                    } else {
                        string2 = cursor2.getString(iOooO00o11);
                    }
                    userInfo.setUserName(string2);
                    if (cursor2.isNull(i)) {
                        string3 = null;
                    } else {
                        string3 = cursor2.getString(i);
                    }
                    userInfo.setUserHeader(string3);
                    if (cursor2.isNull(i2)) {
                        string4 = null;
                    } else {
                        string4 = cursor2.getString(i2);
                    }
                    userInfo.setUserHeaderFrame(string4);
                    if (cursor2.isNull(i24)) {
                        string5 = null;
                    } else {
                        string5 = cursor2.getString(i24);
                    }
                    userInfo.setBackground(string5);
                    userInfo.setUserLevel(cursor2.getInt(i4));
                    if (cursor2.getInt(i6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    userInfo.setBlackUser(z);
                    userInfo.setSex(cursor2.getInt(i8));
                    i10 = i4119;
                    if (cursor2.isNull(i10)) {
                        string6 = null;
                    } else {
                        string6 = cursor2.getString(i10);
                    }
                    userInfo.setBio(string6);
                    i12 = i41110;
                    if (cursor2.isNull(i12)) {
                        string7 = null;
                    } else {
                        string7 = cursor2.getString(i12);
                    }
                    userInfo.setBirthday(string7);
                    userInfo.setAge(cursor2.getInt(i14));
                    userInfo.setCountryId(cursor2.getInt(i15));
                    i17 = iOooO00o22;
                    i18 = i2;
                    userInfo.setRegion(cursor2.getInt(i17));
                    i19 = iOooO00o23;
                    if (cursor2.isNull(i19)) {
                        string8 = null;
                    } else {
                        string8 = cursor2.getString(i19);
                    }
                    userInfo.setMedal(string8);
                    iOooO00o23 = i19;
                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o24));
                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o25));
                    userInfo.setFansNum(cursor2.getInt(iOooO00o26));
                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o27));
                    userInfo.setRole(cursor2.getInt(iOooO00o28));
                    iOooO00o29 = iOooO00o29;
                    userInfo.setRegTime(cursor2.getInt(iOooO00o29));
                    iOooO00o30 = iOooO00o30;
                    if (cursor2.isNull(iOooO00o30)) {
                        string9 = null;
                    } else {
                        string9 = cursor2.getString(iOooO00o30);
                    }
                    userInfo.setTags(this.f44530OooO0o.f44561OooO.stringToList(string9));
                    i20 = iOooO00o31;
                    if (cursor2.getInt(i20) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    userInfo.setPremium(z2);
                    iOooO00o31 = i20;
                    i21 = iOooO00o32;
                    userInfo.setPremiumLevel(cursor2.getInt(i21));
                    userInfo.setVipState(cursor2.getInt(iOooO00o33));
                    int i41111 = iOooO00o34;
                    userInfo.setVipLevel(cursor2.getInt(i41111));
                    if (cursor2.getInt(iOooO00o35) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    userInfo.setShowVIP(z3);
                    iOooO00o34 = i41111;
                    iOooO00o36 = iOooO00o36;
                    userInfo.setWealthLevel(cursor2.getInt(iOooO00o36));
                    i22 = iOooO00o37;
                    if (cursor2.isNull(i22)) {
                        string10 = null;
                    } else {
                        string10 = cursor2.getString(i22);
                    }
                    userInfo.setWealthBadgeWithBg(string10);
                    iOooO00o37 = i22;
                    i23 = iOooO00o38;
                    userInfo.setCurrBadgeLv(cursor2.getInt(i23));
                }
                ArrayList arrayList3 = arrayList;
                arrayList3.add(new FriendInfo(userInfo, friend));
                iOooO00o38 = i23;
                iOooO00o32 = i21;
                iOooO00o20 = i14;
                iOooO00o21 = i15;
                iOooO00o = i13;
                iOooO00o3 = i3;
                iOooO00o2 = i28;
                iOooO00o12 = i;
                arrayList2 = arrayList3;
                iOooO00o19 = i12;
                i24 = i24;
                iOooO00o7 = i11;
                iOooO00o13 = i18;
                iOooO00o22 = i17;
                cursor2 = cursor;
                iOooO00o18 = i10;
                iOooO00o6 = i9;
                iOooO00o17 = i8;
                iOooO00o5 = i7;
                iOooO00o16 = i6;
                iOooO00o4 = i5;
                iOooO00o15 = i4;
            } else {
                i = i25;
            }
            i2 = i26;
            i3 = iOooO00o3;
            i4 = iOooO00o15;
            i5 = iOooO00o4;
            i6 = iOooO00o16;
            i7 = iOooO00o5;
            i8 = iOooO00o17;
            i9 = iOooO00o6;
            i10 = iOooO00o18;
            i11 = iOooO00o7;
            i12 = iOooO00o19;
            i13 = i27;
            i14 = iOooO00o20;
            arrayList = arrayList2;
            i15 = iOooO00o21;
            friend = friend2;
            i16 = iOooO00o38;
            iOooO00o38 = i16;
            userInfo = new UserInfo();
            int i41112 = i10;
            int i41113 = i12;
            userInfo.setUserId(cursor2.getLong(iOooO00o8));
            if (cursor2.isNull(iOooO00o9)) {
                string = null;
            } else {
                string = cursor2.getString(iOooO00o9);
            }
            userInfo.setUserIdx(string);
            userInfo.setIdLevel(cursor2.getInt(iOooO00o10));
            if (cursor2.isNull(iOooO00o11)) {
                string2 = null;
            } else {
                string2 = cursor2.getString(iOooO00o11);
            }
            userInfo.setUserName(string2);
            if (cursor2.isNull(i)) {
                string3 = null;
            } else {
                string3 = cursor2.getString(i);
            }
            userInfo.setUserHeader(string3);
            if (cursor2.isNull(i2)) {
                string4 = null;
            } else {
                string4 = cursor2.getString(i2);
            }
            userInfo.setUserHeaderFrame(string4);
            if (cursor2.isNull(i24)) {
                string5 = null;
            } else {
                string5 = cursor2.getString(i24);
            }
            userInfo.setBackground(string5);
            userInfo.setUserLevel(cursor2.getInt(i4));
            if (cursor2.getInt(i6) != 0) {
                z = true;
            } else {
                z = false;
            }
            userInfo.setBlackUser(z);
            userInfo.setSex(cursor2.getInt(i8));
            i10 = i41112;
            if (cursor2.isNull(i10)) {
                string6 = null;
            } else {
                string6 = cursor2.getString(i10);
            }
            userInfo.setBio(string6);
            i12 = i41113;
            if (cursor2.isNull(i12)) {
                string7 = null;
            } else {
                string7 = cursor2.getString(i12);
            }
            userInfo.setBirthday(string7);
            userInfo.setAge(cursor2.getInt(i14));
            userInfo.setCountryId(cursor2.getInt(i15));
            i17 = iOooO00o22;
            i18 = i2;
            userInfo.setRegion(cursor2.getInt(i17));
            i19 = iOooO00o23;
            if (cursor2.isNull(i19)) {
                string8 = null;
            } else {
                string8 = cursor2.getString(i19);
            }
            userInfo.setMedal(string8);
            iOooO00o23 = i19;
            userInfo.setVisitorNum(cursor2.getInt(iOooO00o24));
            userInfo.setFollowedNum(cursor2.getInt(iOooO00o25));
            userInfo.setFansNum(cursor2.getInt(iOooO00o26));
            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o27));
            userInfo.setRole(cursor2.getInt(iOooO00o28));
            iOooO00o29 = iOooO00o29;
            userInfo.setRegTime(cursor2.getInt(iOooO00o29));
            iOooO00o30 = iOooO00o30;
            if (cursor2.isNull(iOooO00o30)) {
                string9 = null;
            } else {
                string9 = cursor2.getString(iOooO00o30);
            }
            userInfo.setTags(this.f44530OooO0o.f44561OooO.stringToList(string9));
            i20 = iOooO00o31;
            if (cursor2.getInt(i20) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            userInfo.setPremium(z2);
            iOooO00o31 = i20;
            i21 = iOooO00o32;
            userInfo.setPremiumLevel(cursor2.getInt(i21));
            userInfo.setVipState(cursor2.getInt(iOooO00o33));
            int i41114 = iOooO00o34;
            userInfo.setVipLevel(cursor2.getInt(i41114));
            if (cursor2.getInt(iOooO00o35) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            userInfo.setShowVIP(z3);
            iOooO00o34 = i41114;
            iOooO00o36 = iOooO00o36;
            userInfo.setWealthLevel(cursor2.getInt(iOooO00o36));
            i22 = iOooO00o37;
            if (cursor2.isNull(i22)) {
                string10 = null;
            } else {
                string10 = cursor2.getString(i22);
            }
            userInfo.setWealthBadgeWithBg(string10);
            iOooO00o37 = i22;
            i23 = iOooO00o38;
            userInfo.setCurrBadgeLv(cursor2.getInt(i23));
            ArrayList arrayList4 = arrayList;
            arrayList4.add(new FriendInfo(userInfo, friend));
            iOooO00o38 = i23;
            iOooO00o32 = i21;
            iOooO00o20 = i14;
            iOooO00o21 = i15;
            iOooO00o = i13;
            iOooO00o3 = i3;
            iOooO00o2 = i28;
            iOooO00o12 = i;
            arrayList2 = arrayList4;
            iOooO00o19 = i12;
            i24 = i24;
            iOooO00o7 = i11;
            iOooO00o13 = i18;
            iOooO00o22 = i17;
            cursor2 = cursor;
            iOooO00o18 = i10;
            iOooO00o6 = i9;
            iOooO00o17 = i8;
            iOooO00o5 = i7;
            iOooO00o16 = i6;
            iOooO00o4 = i5;
            iOooO00o15 = i4;
        }
        return arrayList2;
    }
}
