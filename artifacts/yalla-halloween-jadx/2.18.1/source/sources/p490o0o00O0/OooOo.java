package p490o0o00O0;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.common.db.converter.TagConverter;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.db.table.ConversationWithUser;
import com.yalla.yalla.common.db.table.Friend;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import p089o000o000.o00O00o0;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;
import p091o000o00o.o0Oo0oo;
import p092o000o0O.o00O0O;
import p093o000o0O0.o000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements p490o0o00O0.OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Oooo000 f41011OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f41012OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<Conversation> f41013OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O f41014OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO0 f41015OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOOOO f41016OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO f41017OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOo00 f41018OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C0390OooOo f41019OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Oooo0 f41020OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO00o f41021OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final TagConverter f41022OooOO0o = new TagConverter();

    public class OooO extends o000O0<FriendInfo> {
        public OooO(o0000O0 o0000o1, RoomDatabase roomDatabase, String... strArr) {
            super(o0000o1, roomDatabase, strArr);
        }

        /* JADX WARN: Code duplicated, block: B:125:0x034b  */
        /* JADX WARN: Code duplicated, block: B:126:0x034e  */
        /* JADX WARN: Code duplicated, block: B:129:0x0362  */
        /* JADX WARN: Code duplicated, block: B:130:0x0365  */
        /* JADX WARN: Code duplicated, block: B:133:0x0372  */
        /* JADX WARN: Code duplicated, block: B:134:0x0375  */
        /* JADX WARN: Code duplicated, block: B:137:0x0382  */
        /* JADX WARN: Code duplicated, block: B:138:0x0385  */
        /* JADX WARN: Code duplicated, block: B:141:0x0392  */
        /* JADX WARN: Code duplicated, block: B:142:0x0395  */
        /* JADX WARN: Code duplicated, block: B:145:0x03b0  */
        /* JADX WARN: Code duplicated, block: B:146:0x03b3  */
        /* JADX WARN: Code duplicated, block: B:149:0x03c0  */
        /* JADX WARN: Code duplicated, block: B:150:0x03c3  */
        /* JADX WARN: Code duplicated, block: B:153:0x03ed  */
        /* JADX WARN: Code duplicated, block: B:154:0x03f2  */
        /* JADX WARN: Code duplicated, block: B:158:0x043e  */
        /* JADX WARN: Code duplicated, block: B:161:0x045f  */
        /* JADX WARN: Code duplicated, block: B:162:0x0461  */
        /* JADX WARN: Code duplicated, block: B:165:0x048a  */
        /* JADX WARN: Code duplicated, block: B:166:0x048c  */
        @Override // p093o000o0O0.o000O0
        public final List<FriendInfo> OooO0o(Cursor cursor) {
            Friend friend;
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
            int i15;
            int i16;
            int i17;
            int i18;
            ArrayList arrayList;
            int i19;
            Friend friend2;
            int i20;
            int i21;
            int i22;
            int i23;
            UserInfo userInfo;
            int i24;
            int i25;
            int i26;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            int i27;
            boolean z;
            boolean z2;
            Cursor cursor2 = cursor;
            int iOooO00o = o00O0O.OooO00o(cursor2, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursor2, "friendId");
            int iOooO00o3 = o00O0O.OooO00o(cursor2, "memoName");
            int iOooO00o4 = o00O0O.OooO00o(cursor2, "time");
            int iOooO00o5 = o00O0O.OooO00o(cursor2, "inRoom");
            int iOooO00o6 = o00O0O.OooO00o(cursor2, "deleteMark");
            int iOooO00o7 = o00O0O.OooO00o(cursor2, "isCheckUserRisk");
            int iOooO00o8 = o00O0O.OooO00o(cursor2, "userId");
            int iOooO00o9 = o00O0O.OooO00o(cursor2, "userIdx");
            int iOooO00o10 = o00O0O.OooO00o(cursor2, "idLevel");
            int iOooO00o11 = o00O0O.OooO00o(cursor2, "userName");
            int iOooO00o12 = o00O0O.OooO00o(cursor2, "userAvatar");
            int iOooO00o13 = o00O0O.OooO00o(cursor2, "userFrame");
            int iOooO00o14 = o00O0O.OooO00o(cursor2, "background");
            int iOooO00o15 = o00O0O.OooO00o(cursor2, "userLevel");
            int iOooO00o16 = o00O0O.OooO00o(cursor2, "gender");
            int iOooO00o17 = o00O0O.OooO00o(cursor2, "bio");
            int iOooO00o18 = o00O0O.OooO00o(cursor2, "birthday");
            int iOooO00o19 = o00O0O.OooO00o(cursor2, "age");
            int iOooO00o20 = o00O0O.OooO00o(cursor2, "countryId");
            int iOooO00o21 = o00O0O.OooO00o(cursor2, "region");
            int iOooO00o22 = o00O0O.OooO00o(cursor2, "medal");
            int iOooO00o23 = o00O0O.OooO00o(cursor2, "visitorNum");
            int iOooO00o24 = o00O0O.OooO00o(cursor2, "followedNum");
            int iOooO00o25 = o00O0O.OooO00o(cursor2, "fansNum");
            int iOooO00o26 = o00O0O.OooO00o(cursor2, "joinRoomNum");
            int iOooO00o27 = o00O0O.OooO00o(cursor2, "role");
            int iOooO00o28 = o00O0O.OooO00o(cursor2, "regTime");
            int iOooO00o29 = o00O0O.OooO00o(cursor2, "tags");
            int iOooO00o30 = o00O0O.OooO00o(cursor2, "vip");
            int iOooO00o31 = o00O0O.OooO00o(cursor2, "vipLevel");
            int iOooO00o32 = o00O0O.OooO00o(cursor2, "kaVipState");
            int iOooO00o33 = o00O0O.OooO00o(cursor2, "kaVipLevel");
            int iOooO00o34 = o00O0O.OooO00o(cursor2, "showVIP");
            int iOooO00o35 = o00O0O.OooO00o(cursor2, "uid");
            int iOooO00o36 = o00O0O.OooO00o(cursor2, "time");
            int i28 = iOooO00o34;
            int i29 = iOooO00o12;
            ArrayList arrayList2 = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                if (cursor2.isNull(iOooO00o) && cursor2.isNull(iOooO00o2) && cursor2.isNull(iOooO00o3) && cursor2.isNull(iOooO00o4) && cursor2.isNull(iOooO00o5) && cursor2.isNull(iOooO00o6) && cursor2.isNull(iOooO00o7) && cursor2.isNull(iOooO00o35) && cursor2.isNull(iOooO00o36)) {
                    friend = null;
                } else {
                    friend = new Friend();
                    friend.setUid(cursor2.getLong(iOooO00o));
                    friend.setFriendId(cursor2.getLong(iOooO00o2));
                    friend.setMemoName(cursor2.isNull(iOooO00o3) ? null : cursor2.getString(iOooO00o3));
                    friend.setTime(cursor2.getLong(iOooO00o4));
                    friend.setInRoom(cursor2.getInt(iOooO00o5) != 0);
                    friend.setDeleteMark(cursor2.getInt(iOooO00o6) != 0);
                    friend.setCheckUserRisk(cursor2.getInt(iOooO00o7) != 0);
                    friend.setUid(cursor2.getLong(iOooO00o35));
                    friend.setTime(cursor2.getLong(iOooO00o36));
                }
                if (cursor2.isNull(iOooO00o8) && cursor2.isNull(iOooO00o9)) {
                    if (!cursor2.isNull(iOooO00o10)) {
                        iOooO00o10 = iOooO00o10;
                        i = iOooO00o35;
                        i2 = i29;
                        iOooO00o11 = iOooO00o11;
                    } else if (cursor2.isNull(iOooO00o11)) {
                        i = iOooO00o35;
                        i2 = i29;
                        if (cursor2.isNull(i2)) {
                            i3 = iOooO00o;
                            i4 = iOooO00o13;
                            if (cursor2.isNull(i4)) {
                                i5 = iOooO00o2;
                                i6 = iOooO00o14;
                                if (cursor2.isNull(i6)) {
                                    i7 = iOooO00o3;
                                    i8 = iOooO00o15;
                                    if (cursor2.isNull(i8)) {
                                        i9 = iOooO00o36;
                                        i10 = iOooO00o16;
                                        if (cursor2.isNull(i10)) {
                                            i11 = iOooO00o4;
                                            i12 = iOooO00o17;
                                            if (cursor2.isNull(i12)) {
                                                i13 = iOooO00o5;
                                                i14 = iOooO00o18;
                                                if (cursor2.isNull(i14)) {
                                                    i15 = iOooO00o6;
                                                    i16 = iOooO00o19;
                                                    if (cursor2.isNull(i16)) {
                                                        i17 = iOooO00o7;
                                                        i18 = iOooO00o20;
                                                        if (cursor2.isNull(i18)) {
                                                            arrayList = arrayList2;
                                                            i19 = iOooO00o21;
                                                            if (cursor2.isNull(i19)) {
                                                                friend2 = friend;
                                                                int i30 = iOooO00o22;
                                                                if (cursor2.isNull(i30)) {
                                                                    iOooO00o22 = i30;
                                                                    int i31 = iOooO00o23;
                                                                    if (cursor2.isNull(i31)) {
                                                                        iOooO00o23 = i31;
                                                                        int i32 = iOooO00o24;
                                                                        if (cursor2.isNull(i32)) {
                                                                            iOooO00o24 = i32;
                                                                            int i33 = iOooO00o25;
                                                                            if (cursor2.isNull(i33)) {
                                                                                iOooO00o25 = i33;
                                                                                int i34 = iOooO00o26;
                                                                                if (cursor2.isNull(i34)) {
                                                                                    iOooO00o26 = i34;
                                                                                    int i35 = iOooO00o27;
                                                                                    if (cursor2.isNull(i35)) {
                                                                                        iOooO00o27 = i35;
                                                                                        int i36 = iOooO00o28;
                                                                                        if (cursor2.isNull(i36)) {
                                                                                            iOooO00o28 = i36;
                                                                                            int i37 = iOooO00o29;
                                                                                            if (cursor2.isNull(i37)) {
                                                                                                iOooO00o29 = i37;
                                                                                                int i38 = iOooO00o30;
                                                                                                if (cursor2.isNull(i38)) {
                                                                                                    iOooO00o30 = i38;
                                                                                                    int i39 = iOooO00o31;
                                                                                                    if (cursor2.isNull(i39)) {
                                                                                                        iOooO00o31 = i39;
                                                                                                        int i40 = iOooO00o32;
                                                                                                        if (cursor2.isNull(i40)) {
                                                                                                            iOooO00o32 = i40;
                                                                                                            int i41 = iOooO00o33;
                                                                                                            if (cursor2.isNull(i41)) {
                                                                                                                iOooO00o33 = i41;
                                                                                                                int i42 = i28;
                                                                                                                if (cursor2.isNull(i42)) {
                                                                                                                    iOooO00o10 = iOooO00o10;
                                                                                                                    iOooO00o11 = iOooO00o11;
                                                                                                                    i21 = i2;
                                                                                                                    i26 = i42;
                                                                                                                    i20 = iOooO00o22;
                                                                                                                    userInfo = null;
                                                                                                                    i23 = i4;
                                                                                                                    i22 = i6;
                                                                                                                    i24 = iOooO00o31;
                                                                                                                    i25 = iOooO00o33;
                                                                                                                } else {
                                                                                                                    iOooO00o10 = iOooO00o10;
                                                                                                                    iOooO00o11 = iOooO00o11;
                                                                                                                    i28 = i42;
                                                                                                                }
                                                                                                                i28 = i26;
                                                                                                                ArrayList arrayList3 = arrayList;
                                                                                                                arrayList3.add(new FriendInfo(userInfo, friend2));
                                                                                                                cursor2 = cursor;
                                                                                                                iOooO00o33 = i25;
                                                                                                                iOooO00o31 = i24;
                                                                                                                iOooO00o20 = i18;
                                                                                                                iOooO00o21 = i19;
                                                                                                                iOooO00o2 = i5;
                                                                                                                iOooO00o7 = i17;
                                                                                                                iOooO00o13 = i23;
                                                                                                                iOooO00o = i3;
                                                                                                                i29 = i21;
                                                                                                                iOooO00o22 = i20;
                                                                                                                arrayList2 = arrayList3;
                                                                                                                iOooO00o19 = i16;
                                                                                                                iOooO00o6 = i15;
                                                                                                                iOooO00o35 = i;
                                                                                                                iOooO00o18 = i14;
                                                                                                                iOooO00o5 = i13;
                                                                                                                iOooO00o17 = i12;
                                                                                                                iOooO00o4 = i11;
                                                                                                                iOooO00o16 = i10;
                                                                                                                iOooO00o36 = i9;
                                                                                                                iOooO00o15 = i8;
                                                                                                                iOooO00o3 = i7;
                                                                                                                iOooO00o14 = i22;
                                                                                                            } else {
                                                                                                                iOooO00o10 = iOooO00o10;
                                                                                                                iOooO00o11 = iOooO00o11;
                                                                                                                iOooO00o33 = i41;
                                                                                                            }
                                                                                                        } else {
                                                                                                            iOooO00o10 = iOooO00o10;
                                                                                                            iOooO00o11 = iOooO00o11;
                                                                                                            iOooO00o32 = i40;
                                                                                                        }
                                                                                                    } else {
                                                                                                        iOooO00o10 = iOooO00o10;
                                                                                                        iOooO00o11 = iOooO00o11;
                                                                                                        iOooO00o31 = i39;
                                                                                                    }
                                                                                                } else {
                                                                                                    iOooO00o10 = iOooO00o10;
                                                                                                    iOooO00o11 = iOooO00o11;
                                                                                                    iOooO00o30 = i38;
                                                                                                }
                                                                                            } else {
                                                                                                iOooO00o10 = iOooO00o10;
                                                                                                iOooO00o11 = iOooO00o11;
                                                                                                iOooO00o29 = i37;
                                                                                            }
                                                                                        } else {
                                                                                            iOooO00o10 = iOooO00o10;
                                                                                            iOooO00o11 = iOooO00o11;
                                                                                            iOooO00o28 = i36;
                                                                                        }
                                                                                    } else {
                                                                                        iOooO00o10 = iOooO00o10;
                                                                                        iOooO00o11 = iOooO00o11;
                                                                                        iOooO00o27 = i35;
                                                                                    }
                                                                                } else {
                                                                                    iOooO00o10 = iOooO00o10;
                                                                                    iOooO00o11 = iOooO00o11;
                                                                                    iOooO00o26 = i34;
                                                                                }
                                                                            } else {
                                                                                iOooO00o10 = iOooO00o10;
                                                                                iOooO00o11 = iOooO00o11;
                                                                                iOooO00o25 = i33;
                                                                            }
                                                                        } else {
                                                                            iOooO00o10 = iOooO00o10;
                                                                            iOooO00o11 = iOooO00o11;
                                                                            iOooO00o24 = i32;
                                                                        }
                                                                    } else {
                                                                        iOooO00o10 = iOooO00o10;
                                                                        iOooO00o11 = iOooO00o11;
                                                                        iOooO00o23 = i31;
                                                                    }
                                                                } else {
                                                                    iOooO00o10 = iOooO00o10;
                                                                    iOooO00o11 = iOooO00o11;
                                                                    iOooO00o22 = i30;
                                                                }
                                                            }
                                                            userInfo = new UserInfo();
                                                            int i43 = i16;
                                                            int i44 = i18;
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
                                                            if (cursor2.isNull(i2)) {
                                                                string3 = null;
                                                            } else {
                                                                string3 = cursor2.getString(i2);
                                                            }
                                                            userInfo.setUserHeader(string3);
                                                            if (cursor2.isNull(i4)) {
                                                                string4 = null;
                                                            } else {
                                                                string4 = cursor2.getString(i4);
                                                            }
                                                            userInfo.setUserHeaderFrame(string4);
                                                            if (cursor2.isNull(i6)) {
                                                                string5 = null;
                                                            } else {
                                                                string5 = cursor2.getString(i6);
                                                            }
                                                            userInfo.setBackground(string5);
                                                            userInfo.setUserLevel(cursor2.getInt(i8));
                                                            userInfo.setSex(cursor2.getInt(i10));
                                                            if (cursor2.isNull(i12)) {
                                                                string6 = null;
                                                            } else {
                                                                string6 = cursor2.getString(i12);
                                                            }
                                                            userInfo.setBio(string6);
                                                            if (cursor2.isNull(i14)) {
                                                                string7 = null;
                                                            } else {
                                                                string7 = cursor2.getString(i14);
                                                            }
                                                            userInfo.setBirthday(string7);
                                                            i16 = i43;
                                                            userInfo.setAge(cursor2.getInt(i16));
                                                            i21 = i2;
                                                            i18 = i44;
                                                            userInfo.setCountryId(cursor2.getInt(i18));
                                                            userInfo.setRegion(cursor2.getInt(i19));
                                                            i20 = iOooO00o22;
                                                            if (cursor2.isNull(i20)) {
                                                                string8 = null;
                                                            } else {
                                                                string8 = cursor2.getString(i20);
                                                            }
                                                            userInfo.setMedal(string8);
                                                            i23 = i4;
                                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                                            userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                                            userInfo.setRole(cursor2.getInt(iOooO00o27));
                                                            int i45 = iOooO00o28;
                                                            userInfo.setRegTime(cursor2.getInt(i45));
                                                            int i46 = iOooO00o29;
                                                            iOooO00o29 = i46;
                                                            iOooO00o28 = i45;
                                                            i22 = i6;
                                                            userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i46) ? null : cursor2.getString(i46)));
                                                            i27 = iOooO00o30;
                                                            if (cursor2.getInt(i27) != 0) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            userInfo.setPremium(z);
                                                            iOooO00o30 = i27;
                                                            i24 = iOooO00o31;
                                                            userInfo.setPremiumLevel(cursor2.getInt(i24));
                                                            userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                                            i25 = iOooO00o33;
                                                            userInfo.setVipLevel(cursor2.getInt(i25));
                                                            i26 = i28;
                                                            if (cursor2.getInt(i26) != 0) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            userInfo.setShowVIP(z2);
                                                            i28 = i26;
                                                            ArrayList arrayList4 = arrayList;
                                                            arrayList4.add(new FriendInfo(userInfo, friend2));
                                                            cursor2 = cursor;
                                                            iOooO00o33 = i25;
                                                            iOooO00o31 = i24;
                                                            iOooO00o20 = i18;
                                                            iOooO00o21 = i19;
                                                            iOooO00o2 = i5;
                                                            iOooO00o7 = i17;
                                                            iOooO00o13 = i23;
                                                            iOooO00o = i3;
                                                            i29 = i21;
                                                            iOooO00o22 = i20;
                                                            arrayList2 = arrayList4;
                                                            iOooO00o19 = i16;
                                                            iOooO00o6 = i15;
                                                            iOooO00o35 = i;
                                                            iOooO00o18 = i14;
                                                            iOooO00o5 = i13;
                                                            iOooO00o17 = i12;
                                                            iOooO00o4 = i11;
                                                            iOooO00o16 = i10;
                                                            iOooO00o36 = i9;
                                                            iOooO00o15 = i8;
                                                            iOooO00o3 = i7;
                                                            iOooO00o14 = i22;
                                                        }
                                                        iOooO00o10 = iOooO00o10;
                                                        iOooO00o11 = iOooO00o11;
                                                        friend2 = friend;
                                                        userInfo = new UserInfo();
                                                        int i47 = i16;
                                                        int i48 = i18;
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
                                                        if (cursor2.isNull(i2)) {
                                                            string3 = null;
                                                        } else {
                                                            string3 = cursor2.getString(i2);
                                                        }
                                                        userInfo.setUserHeader(string3);
                                                        if (cursor2.isNull(i4)) {
                                                            string4 = null;
                                                        } else {
                                                            string4 = cursor2.getString(i4);
                                                        }
                                                        userInfo.setUserHeaderFrame(string4);
                                                        if (cursor2.isNull(i6)) {
                                                            string5 = null;
                                                        } else {
                                                            string5 = cursor2.getString(i6);
                                                        }
                                                        userInfo.setBackground(string5);
                                                        userInfo.setUserLevel(cursor2.getInt(i8));
                                                        userInfo.setSex(cursor2.getInt(i10));
                                                        if (cursor2.isNull(i12)) {
                                                            string6 = null;
                                                        } else {
                                                            string6 = cursor2.getString(i12);
                                                        }
                                                        userInfo.setBio(string6);
                                                        if (cursor2.isNull(i14)) {
                                                            string7 = null;
                                                        } else {
                                                            string7 = cursor2.getString(i14);
                                                        }
                                                        userInfo.setBirthday(string7);
                                                        i16 = i47;
                                                        userInfo.setAge(cursor2.getInt(i16));
                                                        i21 = i2;
                                                        i18 = i48;
                                                        userInfo.setCountryId(cursor2.getInt(i18));
                                                        userInfo.setRegion(cursor2.getInt(i19));
                                                        i20 = iOooO00o22;
                                                        if (cursor2.isNull(i20)) {
                                                            string8 = null;
                                                        } else {
                                                            string8 = cursor2.getString(i20);
                                                        }
                                                        userInfo.setMedal(string8);
                                                        i23 = i4;
                                                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                                        userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                                        userInfo.setRole(cursor2.getInt(iOooO00o27));
                                                        int i49 = iOooO00o28;
                                                        userInfo.setRegTime(cursor2.getInt(i49));
                                                        int i410 = iOooO00o29;
                                                        iOooO00o29 = i410;
                                                        iOooO00o28 = i49;
                                                        i22 = i6;
                                                        userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i410) ? null : cursor2.getString(i410)));
                                                        i27 = iOooO00o30;
                                                        if (cursor2.getInt(i27) != 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        userInfo.setPremium(z);
                                                        iOooO00o30 = i27;
                                                        i24 = iOooO00o31;
                                                        userInfo.setPremiumLevel(cursor2.getInt(i24));
                                                        userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                                        i25 = iOooO00o33;
                                                        userInfo.setVipLevel(cursor2.getInt(i25));
                                                        i26 = i28;
                                                        if (cursor2.getInt(i26) != 0) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        userInfo.setShowVIP(z2);
                                                        i28 = i26;
                                                        ArrayList arrayList5 = arrayList;
                                                        arrayList5.add(new FriendInfo(userInfo, friend2));
                                                        cursor2 = cursor;
                                                        iOooO00o33 = i25;
                                                        iOooO00o31 = i24;
                                                        iOooO00o20 = i18;
                                                        iOooO00o21 = i19;
                                                        iOooO00o2 = i5;
                                                        iOooO00o7 = i17;
                                                        iOooO00o13 = i23;
                                                        iOooO00o = i3;
                                                        i29 = i21;
                                                        iOooO00o22 = i20;
                                                        arrayList2 = arrayList5;
                                                        iOooO00o19 = i16;
                                                        iOooO00o6 = i15;
                                                        iOooO00o35 = i;
                                                        iOooO00o18 = i14;
                                                        iOooO00o5 = i13;
                                                        iOooO00o17 = i12;
                                                        iOooO00o4 = i11;
                                                        iOooO00o16 = i10;
                                                        iOooO00o36 = i9;
                                                        iOooO00o15 = i8;
                                                        iOooO00o3 = i7;
                                                        iOooO00o14 = i22;
                                                    }
                                                    iOooO00o10 = iOooO00o10;
                                                    iOooO00o11 = iOooO00o11;
                                                    arrayList = arrayList2;
                                                    i19 = iOooO00o21;
                                                    iOooO00o10 = iOooO00o10;
                                                    iOooO00o11 = iOooO00o11;
                                                    friend2 = friend;
                                                    userInfo = new UserInfo();
                                                    int i411 = i16;
                                                    int i412 = i18;
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
                                                    if (cursor2.isNull(i2)) {
                                                        string3 = null;
                                                    } else {
                                                        string3 = cursor2.getString(i2);
                                                    }
                                                    userInfo.setUserHeader(string3);
                                                    if (cursor2.isNull(i4)) {
                                                        string4 = null;
                                                    } else {
                                                        string4 = cursor2.getString(i4);
                                                    }
                                                    userInfo.setUserHeaderFrame(string4);
                                                    if (cursor2.isNull(i6)) {
                                                        string5 = null;
                                                    } else {
                                                        string5 = cursor2.getString(i6);
                                                    }
                                                    userInfo.setBackground(string5);
                                                    userInfo.setUserLevel(cursor2.getInt(i8));
                                                    userInfo.setSex(cursor2.getInt(i10));
                                                    if (cursor2.isNull(i12)) {
                                                        string6 = null;
                                                    } else {
                                                        string6 = cursor2.getString(i12);
                                                    }
                                                    userInfo.setBio(string6);
                                                    if (cursor2.isNull(i14)) {
                                                        string7 = null;
                                                    } else {
                                                        string7 = cursor2.getString(i14);
                                                    }
                                                    userInfo.setBirthday(string7);
                                                    i16 = i411;
                                                    userInfo.setAge(cursor2.getInt(i16));
                                                    i21 = i2;
                                                    i18 = i412;
                                                    userInfo.setCountryId(cursor2.getInt(i18));
                                                    userInfo.setRegion(cursor2.getInt(i19));
                                                    i20 = iOooO00o22;
                                                    if (cursor2.isNull(i20)) {
                                                        string8 = null;
                                                    } else {
                                                        string8 = cursor2.getString(i20);
                                                    }
                                                    userInfo.setMedal(string8);
                                                    i23 = i4;
                                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                                    userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                                    userInfo.setRole(cursor2.getInt(iOooO00o27));
                                                    int i413 = iOooO00o28;
                                                    userInfo.setRegTime(cursor2.getInt(i413));
                                                    int i414 = iOooO00o29;
                                                    iOooO00o29 = i414;
                                                    iOooO00o28 = i413;
                                                    i22 = i6;
                                                    userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i414) ? null : cursor2.getString(i414)));
                                                    i27 = iOooO00o30;
                                                    if (cursor2.getInt(i27) != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    userInfo.setPremium(z);
                                                    iOooO00o30 = i27;
                                                    i24 = iOooO00o31;
                                                    userInfo.setPremiumLevel(cursor2.getInt(i24));
                                                    userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                                    i25 = iOooO00o33;
                                                    userInfo.setVipLevel(cursor2.getInt(i25));
                                                    i26 = i28;
                                                    if (cursor2.getInt(i26) != 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    userInfo.setShowVIP(z2);
                                                    i28 = i26;
                                                    ArrayList arrayList6 = arrayList;
                                                    arrayList6.add(new FriendInfo(userInfo, friend2));
                                                    cursor2 = cursor;
                                                    iOooO00o33 = i25;
                                                    iOooO00o31 = i24;
                                                    iOooO00o20 = i18;
                                                    iOooO00o21 = i19;
                                                    iOooO00o2 = i5;
                                                    iOooO00o7 = i17;
                                                    iOooO00o13 = i23;
                                                    iOooO00o = i3;
                                                    i29 = i21;
                                                    iOooO00o22 = i20;
                                                    arrayList2 = arrayList6;
                                                    iOooO00o19 = i16;
                                                    iOooO00o6 = i15;
                                                    iOooO00o35 = i;
                                                    iOooO00o18 = i14;
                                                    iOooO00o5 = i13;
                                                    iOooO00o17 = i12;
                                                    iOooO00o4 = i11;
                                                    iOooO00o16 = i10;
                                                    iOooO00o36 = i9;
                                                    iOooO00o15 = i8;
                                                    iOooO00o3 = i7;
                                                    iOooO00o14 = i22;
                                                }
                                                iOooO00o10 = iOooO00o10;
                                                iOooO00o11 = iOooO00o11;
                                                i17 = iOooO00o7;
                                                i18 = iOooO00o20;
                                                iOooO00o10 = iOooO00o10;
                                                iOooO00o11 = iOooO00o11;
                                                arrayList = arrayList2;
                                                i19 = iOooO00o21;
                                                iOooO00o10 = iOooO00o10;
                                                iOooO00o11 = iOooO00o11;
                                                friend2 = friend;
                                                userInfo = new UserInfo();
                                                int i415 = i16;
                                                int i416 = i18;
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
                                                if (cursor2.isNull(i2)) {
                                                    string3 = null;
                                                } else {
                                                    string3 = cursor2.getString(i2);
                                                }
                                                userInfo.setUserHeader(string3);
                                                if (cursor2.isNull(i4)) {
                                                    string4 = null;
                                                } else {
                                                    string4 = cursor2.getString(i4);
                                                }
                                                userInfo.setUserHeaderFrame(string4);
                                                if (cursor2.isNull(i6)) {
                                                    string5 = null;
                                                } else {
                                                    string5 = cursor2.getString(i6);
                                                }
                                                userInfo.setBackground(string5);
                                                userInfo.setUserLevel(cursor2.getInt(i8));
                                                userInfo.setSex(cursor2.getInt(i10));
                                                if (cursor2.isNull(i12)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = cursor2.getString(i12);
                                                }
                                                userInfo.setBio(string6);
                                                if (cursor2.isNull(i14)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = cursor2.getString(i14);
                                                }
                                                userInfo.setBirthday(string7);
                                                i16 = i415;
                                                userInfo.setAge(cursor2.getInt(i16));
                                                i21 = i2;
                                                i18 = i416;
                                                userInfo.setCountryId(cursor2.getInt(i18));
                                                userInfo.setRegion(cursor2.getInt(i19));
                                                i20 = iOooO00o22;
                                                if (cursor2.isNull(i20)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = cursor2.getString(i20);
                                                }
                                                userInfo.setMedal(string8);
                                                i23 = i4;
                                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                                userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                                userInfo.setRole(cursor2.getInt(iOooO00o27));
                                                int i417 = iOooO00o28;
                                                userInfo.setRegTime(cursor2.getInt(i417));
                                                int i418 = iOooO00o29;
                                                iOooO00o29 = i418;
                                                iOooO00o28 = i417;
                                                i22 = i6;
                                                userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i418) ? null : cursor2.getString(i418)));
                                                i27 = iOooO00o30;
                                                if (cursor2.getInt(i27) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                userInfo.setPremium(z);
                                                iOooO00o30 = i27;
                                                i24 = iOooO00o31;
                                                userInfo.setPremiumLevel(cursor2.getInt(i24));
                                                userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                                i25 = iOooO00o33;
                                                userInfo.setVipLevel(cursor2.getInt(i25));
                                                i26 = i28;
                                                if (cursor2.getInt(i26) != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                userInfo.setShowVIP(z2);
                                                i28 = i26;
                                                ArrayList arrayList7 = arrayList;
                                                arrayList7.add(new FriendInfo(userInfo, friend2));
                                                cursor2 = cursor;
                                                iOooO00o33 = i25;
                                                iOooO00o31 = i24;
                                                iOooO00o20 = i18;
                                                iOooO00o21 = i19;
                                                iOooO00o2 = i5;
                                                iOooO00o7 = i17;
                                                iOooO00o13 = i23;
                                                iOooO00o = i3;
                                                i29 = i21;
                                                iOooO00o22 = i20;
                                                arrayList2 = arrayList7;
                                                iOooO00o19 = i16;
                                                iOooO00o6 = i15;
                                                iOooO00o35 = i;
                                                iOooO00o18 = i14;
                                                iOooO00o5 = i13;
                                                iOooO00o17 = i12;
                                                iOooO00o4 = i11;
                                                iOooO00o16 = i10;
                                                iOooO00o36 = i9;
                                                iOooO00o15 = i8;
                                                iOooO00o3 = i7;
                                                iOooO00o14 = i22;
                                            }
                                            iOooO00o10 = iOooO00o10;
                                            iOooO00o11 = iOooO00o11;
                                            i15 = iOooO00o6;
                                            i16 = iOooO00o19;
                                            iOooO00o10 = iOooO00o10;
                                            iOooO00o11 = iOooO00o11;
                                            i17 = iOooO00o7;
                                            i18 = iOooO00o20;
                                            iOooO00o10 = iOooO00o10;
                                            iOooO00o11 = iOooO00o11;
                                            arrayList = arrayList2;
                                            i19 = iOooO00o21;
                                            iOooO00o10 = iOooO00o10;
                                            iOooO00o11 = iOooO00o11;
                                            friend2 = friend;
                                            userInfo = new UserInfo();
                                            int i419 = i16;
                                            int i4110 = i18;
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
                                            if (cursor2.isNull(i2)) {
                                                string3 = null;
                                            } else {
                                                string3 = cursor2.getString(i2);
                                            }
                                            userInfo.setUserHeader(string3);
                                            if (cursor2.isNull(i4)) {
                                                string4 = null;
                                            } else {
                                                string4 = cursor2.getString(i4);
                                            }
                                            userInfo.setUserHeaderFrame(string4);
                                            if (cursor2.isNull(i6)) {
                                                string5 = null;
                                            } else {
                                                string5 = cursor2.getString(i6);
                                            }
                                            userInfo.setBackground(string5);
                                            userInfo.setUserLevel(cursor2.getInt(i8));
                                            userInfo.setSex(cursor2.getInt(i10));
                                            if (cursor2.isNull(i12)) {
                                                string6 = null;
                                            } else {
                                                string6 = cursor2.getString(i12);
                                            }
                                            userInfo.setBio(string6);
                                            if (cursor2.isNull(i14)) {
                                                string7 = null;
                                            } else {
                                                string7 = cursor2.getString(i14);
                                            }
                                            userInfo.setBirthday(string7);
                                            i16 = i419;
                                            userInfo.setAge(cursor2.getInt(i16));
                                            i21 = i2;
                                            i18 = i4110;
                                            userInfo.setCountryId(cursor2.getInt(i18));
                                            userInfo.setRegion(cursor2.getInt(i19));
                                            i20 = iOooO00o22;
                                            if (cursor2.isNull(i20)) {
                                                string8 = null;
                                            } else {
                                                string8 = cursor2.getString(i20);
                                            }
                                            userInfo.setMedal(string8);
                                            i23 = i4;
                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                            userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                            userInfo.setRole(cursor2.getInt(iOooO00o27));
                                            int i4111 = iOooO00o28;
                                            userInfo.setRegTime(cursor2.getInt(i4111));
                                            int i4112 = iOooO00o29;
                                            iOooO00o29 = i4112;
                                            iOooO00o28 = i4111;
                                            i22 = i6;
                                            userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i4112) ? null : cursor2.getString(i4112)));
                                            i27 = iOooO00o30;
                                            if (cursor2.getInt(i27) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            userInfo.setPremium(z);
                                            iOooO00o30 = i27;
                                            i24 = iOooO00o31;
                                            userInfo.setPremiumLevel(cursor2.getInt(i24));
                                            userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                            i25 = iOooO00o33;
                                            userInfo.setVipLevel(cursor2.getInt(i25));
                                            i26 = i28;
                                            if (cursor2.getInt(i26) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            userInfo.setShowVIP(z2);
                                            i28 = i26;
                                            ArrayList arrayList8 = arrayList;
                                            arrayList8.add(new FriendInfo(userInfo, friend2));
                                            cursor2 = cursor;
                                            iOooO00o33 = i25;
                                            iOooO00o31 = i24;
                                            iOooO00o20 = i18;
                                            iOooO00o21 = i19;
                                            iOooO00o2 = i5;
                                            iOooO00o7 = i17;
                                            iOooO00o13 = i23;
                                            iOooO00o = i3;
                                            i29 = i21;
                                            iOooO00o22 = i20;
                                            arrayList2 = arrayList8;
                                            iOooO00o19 = i16;
                                            iOooO00o6 = i15;
                                            iOooO00o35 = i;
                                            iOooO00o18 = i14;
                                            iOooO00o5 = i13;
                                            iOooO00o17 = i12;
                                            iOooO00o4 = i11;
                                            iOooO00o16 = i10;
                                            iOooO00o36 = i9;
                                            iOooO00o15 = i8;
                                            iOooO00o3 = i7;
                                            iOooO00o14 = i22;
                                        }
                                        iOooO00o10 = iOooO00o10;
                                        iOooO00o11 = iOooO00o11;
                                        i13 = iOooO00o5;
                                        i14 = iOooO00o18;
                                        iOooO00o10 = iOooO00o10;
                                        iOooO00o11 = iOooO00o11;
                                        i15 = iOooO00o6;
                                        i16 = iOooO00o19;
                                        iOooO00o10 = iOooO00o10;
                                        iOooO00o11 = iOooO00o11;
                                        i17 = iOooO00o7;
                                        i18 = iOooO00o20;
                                        iOooO00o10 = iOooO00o10;
                                        iOooO00o11 = iOooO00o11;
                                        arrayList = arrayList2;
                                        i19 = iOooO00o21;
                                        iOooO00o10 = iOooO00o10;
                                        iOooO00o11 = iOooO00o11;
                                        friend2 = friend;
                                        userInfo = new UserInfo();
                                        int i4113 = i16;
                                        int i4114 = i18;
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
                                        if (cursor2.isNull(i2)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursor2.getString(i2);
                                        }
                                        userInfo.setUserHeader(string3);
                                        if (cursor2.isNull(i4)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursor2.getString(i4);
                                        }
                                        userInfo.setUserHeaderFrame(string4);
                                        if (cursor2.isNull(i6)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursor2.getString(i6);
                                        }
                                        userInfo.setBackground(string5);
                                        userInfo.setUserLevel(cursor2.getInt(i8));
                                        userInfo.setSex(cursor2.getInt(i10));
                                        if (cursor2.isNull(i12)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursor2.getString(i12);
                                        }
                                        userInfo.setBio(string6);
                                        if (cursor2.isNull(i14)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursor2.getString(i14);
                                        }
                                        userInfo.setBirthday(string7);
                                        i16 = i4113;
                                        userInfo.setAge(cursor2.getInt(i16));
                                        i21 = i2;
                                        i18 = i4114;
                                        userInfo.setCountryId(cursor2.getInt(i18));
                                        userInfo.setRegion(cursor2.getInt(i19));
                                        i20 = iOooO00o22;
                                        if (cursor2.isNull(i20)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursor2.getString(i20);
                                        }
                                        userInfo.setMedal(string8);
                                        i23 = i4;
                                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                        userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                        userInfo.setRole(cursor2.getInt(iOooO00o27));
                                        int i4115 = iOooO00o28;
                                        userInfo.setRegTime(cursor2.getInt(i4115));
                                        int i4116 = iOooO00o29;
                                        iOooO00o29 = i4116;
                                        iOooO00o28 = i4115;
                                        i22 = i6;
                                        userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i4116) ? null : cursor2.getString(i4116)));
                                        i27 = iOooO00o30;
                                        if (cursor2.getInt(i27) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        userInfo.setPremium(z);
                                        iOooO00o30 = i27;
                                        i24 = iOooO00o31;
                                        userInfo.setPremiumLevel(cursor2.getInt(i24));
                                        userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                        i25 = iOooO00o33;
                                        userInfo.setVipLevel(cursor2.getInt(i25));
                                        i26 = i28;
                                        if (cursor2.getInt(i26) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        userInfo.setShowVIP(z2);
                                        i28 = i26;
                                        ArrayList arrayList9 = arrayList;
                                        arrayList9.add(new FriendInfo(userInfo, friend2));
                                        cursor2 = cursor;
                                        iOooO00o33 = i25;
                                        iOooO00o31 = i24;
                                        iOooO00o20 = i18;
                                        iOooO00o21 = i19;
                                        iOooO00o2 = i5;
                                        iOooO00o7 = i17;
                                        iOooO00o13 = i23;
                                        iOooO00o = i3;
                                        i29 = i21;
                                        iOooO00o22 = i20;
                                        arrayList2 = arrayList9;
                                        iOooO00o19 = i16;
                                        iOooO00o6 = i15;
                                        iOooO00o35 = i;
                                        iOooO00o18 = i14;
                                        iOooO00o5 = i13;
                                        iOooO00o17 = i12;
                                        iOooO00o4 = i11;
                                        iOooO00o16 = i10;
                                        iOooO00o36 = i9;
                                        iOooO00o15 = i8;
                                        iOooO00o3 = i7;
                                        iOooO00o14 = i22;
                                    }
                                    iOooO00o10 = iOooO00o10;
                                    iOooO00o11 = iOooO00o11;
                                    i11 = iOooO00o4;
                                    i12 = iOooO00o17;
                                    iOooO00o10 = iOooO00o10;
                                    iOooO00o11 = iOooO00o11;
                                    i13 = iOooO00o5;
                                    i14 = iOooO00o18;
                                    iOooO00o10 = iOooO00o10;
                                    iOooO00o11 = iOooO00o11;
                                    i15 = iOooO00o6;
                                    i16 = iOooO00o19;
                                    iOooO00o10 = iOooO00o10;
                                    iOooO00o11 = iOooO00o11;
                                    i17 = iOooO00o7;
                                    i18 = iOooO00o20;
                                    iOooO00o10 = iOooO00o10;
                                    iOooO00o11 = iOooO00o11;
                                    arrayList = arrayList2;
                                    i19 = iOooO00o21;
                                    iOooO00o10 = iOooO00o10;
                                    iOooO00o11 = iOooO00o11;
                                    friend2 = friend;
                                    userInfo = new UserInfo();
                                    int i4117 = i16;
                                    int i4118 = i18;
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
                                    if (cursor2.isNull(i2)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursor2.getString(i2);
                                    }
                                    userInfo.setUserHeader(string3);
                                    if (cursor2.isNull(i4)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursor2.getString(i4);
                                    }
                                    userInfo.setUserHeaderFrame(string4);
                                    if (cursor2.isNull(i6)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursor2.getString(i6);
                                    }
                                    userInfo.setBackground(string5);
                                    userInfo.setUserLevel(cursor2.getInt(i8));
                                    userInfo.setSex(cursor2.getInt(i10));
                                    if (cursor2.isNull(i12)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursor2.getString(i12);
                                    }
                                    userInfo.setBio(string6);
                                    if (cursor2.isNull(i14)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursor2.getString(i14);
                                    }
                                    userInfo.setBirthday(string7);
                                    i16 = i4117;
                                    userInfo.setAge(cursor2.getInt(i16));
                                    i21 = i2;
                                    i18 = i4118;
                                    userInfo.setCountryId(cursor2.getInt(i18));
                                    userInfo.setRegion(cursor2.getInt(i19));
                                    i20 = iOooO00o22;
                                    if (cursor2.isNull(i20)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursor2.getString(i20);
                                    }
                                    userInfo.setMedal(string8);
                                    i23 = i4;
                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                    userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                    userInfo.setRole(cursor2.getInt(iOooO00o27));
                                    int i4119 = iOooO00o28;
                                    userInfo.setRegTime(cursor2.getInt(i4119));
                                    int i41110 = iOooO00o29;
                                    iOooO00o29 = i41110;
                                    iOooO00o28 = i4119;
                                    i22 = i6;
                                    userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i41110) ? null : cursor2.getString(i41110)));
                                    i27 = iOooO00o30;
                                    if (cursor2.getInt(i27) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    userInfo.setPremium(z);
                                    iOooO00o30 = i27;
                                    i24 = iOooO00o31;
                                    userInfo.setPremiumLevel(cursor2.getInt(i24));
                                    userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                    i25 = iOooO00o33;
                                    userInfo.setVipLevel(cursor2.getInt(i25));
                                    i26 = i28;
                                    if (cursor2.getInt(i26) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    userInfo.setShowVIP(z2);
                                    i28 = i26;
                                    ArrayList arrayList10 = arrayList;
                                    arrayList10.add(new FriendInfo(userInfo, friend2));
                                    cursor2 = cursor;
                                    iOooO00o33 = i25;
                                    iOooO00o31 = i24;
                                    iOooO00o20 = i18;
                                    iOooO00o21 = i19;
                                    iOooO00o2 = i5;
                                    iOooO00o7 = i17;
                                    iOooO00o13 = i23;
                                    iOooO00o = i3;
                                    i29 = i21;
                                    iOooO00o22 = i20;
                                    arrayList2 = arrayList10;
                                    iOooO00o19 = i16;
                                    iOooO00o6 = i15;
                                    iOooO00o35 = i;
                                    iOooO00o18 = i14;
                                    iOooO00o5 = i13;
                                    iOooO00o17 = i12;
                                    iOooO00o4 = i11;
                                    iOooO00o16 = i10;
                                    iOooO00o36 = i9;
                                    iOooO00o15 = i8;
                                    iOooO00o3 = i7;
                                    iOooO00o14 = i22;
                                }
                                iOooO00o10 = iOooO00o10;
                                iOooO00o11 = iOooO00o11;
                                i9 = iOooO00o36;
                                i10 = iOooO00o16;
                                iOooO00o10 = iOooO00o10;
                                iOooO00o11 = iOooO00o11;
                                i11 = iOooO00o4;
                                i12 = iOooO00o17;
                                iOooO00o10 = iOooO00o10;
                                iOooO00o11 = iOooO00o11;
                                i13 = iOooO00o5;
                                i14 = iOooO00o18;
                                iOooO00o10 = iOooO00o10;
                                iOooO00o11 = iOooO00o11;
                                i15 = iOooO00o6;
                                i16 = iOooO00o19;
                                iOooO00o10 = iOooO00o10;
                                iOooO00o11 = iOooO00o11;
                                i17 = iOooO00o7;
                                i18 = iOooO00o20;
                                iOooO00o10 = iOooO00o10;
                                iOooO00o11 = iOooO00o11;
                                arrayList = arrayList2;
                                i19 = iOooO00o21;
                                iOooO00o10 = iOooO00o10;
                                iOooO00o11 = iOooO00o11;
                                friend2 = friend;
                                userInfo = new UserInfo();
                                int i41111 = i16;
                                int i41112 = i18;
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
                                if (cursor2.isNull(i2)) {
                                    string3 = null;
                                } else {
                                    string3 = cursor2.getString(i2);
                                }
                                userInfo.setUserHeader(string3);
                                if (cursor2.isNull(i4)) {
                                    string4 = null;
                                } else {
                                    string4 = cursor2.getString(i4);
                                }
                                userInfo.setUserHeaderFrame(string4);
                                if (cursor2.isNull(i6)) {
                                    string5 = null;
                                } else {
                                    string5 = cursor2.getString(i6);
                                }
                                userInfo.setBackground(string5);
                                userInfo.setUserLevel(cursor2.getInt(i8));
                                userInfo.setSex(cursor2.getInt(i10));
                                if (cursor2.isNull(i12)) {
                                    string6 = null;
                                } else {
                                    string6 = cursor2.getString(i12);
                                }
                                userInfo.setBio(string6);
                                if (cursor2.isNull(i14)) {
                                    string7 = null;
                                } else {
                                    string7 = cursor2.getString(i14);
                                }
                                userInfo.setBirthday(string7);
                                i16 = i41111;
                                userInfo.setAge(cursor2.getInt(i16));
                                i21 = i2;
                                i18 = i41112;
                                userInfo.setCountryId(cursor2.getInt(i18));
                                userInfo.setRegion(cursor2.getInt(i19));
                                i20 = iOooO00o22;
                                if (cursor2.isNull(i20)) {
                                    string8 = null;
                                } else {
                                    string8 = cursor2.getString(i20);
                                }
                                userInfo.setMedal(string8);
                                i23 = i4;
                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                userInfo.setRole(cursor2.getInt(iOooO00o27));
                                int i41113 = iOooO00o28;
                                userInfo.setRegTime(cursor2.getInt(i41113));
                                int i41114 = iOooO00o29;
                                iOooO00o29 = i41114;
                                iOooO00o28 = i41113;
                                i22 = i6;
                                userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i41114) ? null : cursor2.getString(i41114)));
                                i27 = iOooO00o30;
                                if (cursor2.getInt(i27) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                userInfo.setPremium(z);
                                iOooO00o30 = i27;
                                i24 = iOooO00o31;
                                userInfo.setPremiumLevel(cursor2.getInt(i24));
                                userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                i25 = iOooO00o33;
                                userInfo.setVipLevel(cursor2.getInt(i25));
                                i26 = i28;
                                if (cursor2.getInt(i26) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                userInfo.setShowVIP(z2);
                                i28 = i26;
                                ArrayList arrayList11 = arrayList;
                                arrayList11.add(new FriendInfo(userInfo, friend2));
                                cursor2 = cursor;
                                iOooO00o33 = i25;
                                iOooO00o31 = i24;
                                iOooO00o20 = i18;
                                iOooO00o21 = i19;
                                iOooO00o2 = i5;
                                iOooO00o7 = i17;
                                iOooO00o13 = i23;
                                iOooO00o = i3;
                                i29 = i21;
                                iOooO00o22 = i20;
                                arrayList2 = arrayList11;
                                iOooO00o19 = i16;
                                iOooO00o6 = i15;
                                iOooO00o35 = i;
                                iOooO00o18 = i14;
                                iOooO00o5 = i13;
                                iOooO00o17 = i12;
                                iOooO00o4 = i11;
                                iOooO00o16 = i10;
                                iOooO00o36 = i9;
                                iOooO00o15 = i8;
                                iOooO00o3 = i7;
                                iOooO00o14 = i22;
                            }
                            iOooO00o10 = iOooO00o10;
                            iOooO00o11 = iOooO00o11;
                            i7 = iOooO00o3;
                            i8 = iOooO00o15;
                            iOooO00o10 = iOooO00o10;
                            iOooO00o11 = iOooO00o11;
                            i9 = iOooO00o36;
                            i10 = iOooO00o16;
                            iOooO00o10 = iOooO00o10;
                            iOooO00o11 = iOooO00o11;
                            i11 = iOooO00o4;
                            i12 = iOooO00o17;
                            iOooO00o10 = iOooO00o10;
                            iOooO00o11 = iOooO00o11;
                            i13 = iOooO00o5;
                            i14 = iOooO00o18;
                            iOooO00o10 = iOooO00o10;
                            iOooO00o11 = iOooO00o11;
                            i15 = iOooO00o6;
                            i16 = iOooO00o19;
                            iOooO00o10 = iOooO00o10;
                            iOooO00o11 = iOooO00o11;
                            i17 = iOooO00o7;
                            i18 = iOooO00o20;
                            iOooO00o10 = iOooO00o10;
                            iOooO00o11 = iOooO00o11;
                            arrayList = arrayList2;
                            i19 = iOooO00o21;
                            iOooO00o10 = iOooO00o10;
                            iOooO00o11 = iOooO00o11;
                            friend2 = friend;
                            userInfo = new UserInfo();
                            int i41115 = i16;
                            int i41116 = i18;
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
                            if (cursor2.isNull(i2)) {
                                string3 = null;
                            } else {
                                string3 = cursor2.getString(i2);
                            }
                            userInfo.setUserHeader(string3);
                            if (cursor2.isNull(i4)) {
                                string4 = null;
                            } else {
                                string4 = cursor2.getString(i4);
                            }
                            userInfo.setUserHeaderFrame(string4);
                            if (cursor2.isNull(i6)) {
                                string5 = null;
                            } else {
                                string5 = cursor2.getString(i6);
                            }
                            userInfo.setBackground(string5);
                            userInfo.setUserLevel(cursor2.getInt(i8));
                            userInfo.setSex(cursor2.getInt(i10));
                            if (cursor2.isNull(i12)) {
                                string6 = null;
                            } else {
                                string6 = cursor2.getString(i12);
                            }
                            userInfo.setBio(string6);
                            if (cursor2.isNull(i14)) {
                                string7 = null;
                            } else {
                                string7 = cursor2.getString(i14);
                            }
                            userInfo.setBirthday(string7);
                            i16 = i41115;
                            userInfo.setAge(cursor2.getInt(i16));
                            i21 = i2;
                            i18 = i41116;
                            userInfo.setCountryId(cursor2.getInt(i18));
                            userInfo.setRegion(cursor2.getInt(i19));
                            i20 = iOooO00o22;
                            if (cursor2.isNull(i20)) {
                                string8 = null;
                            } else {
                                string8 = cursor2.getString(i20);
                            }
                            userInfo.setMedal(string8);
                            i23 = i4;
                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                            userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                            userInfo.setRole(cursor2.getInt(iOooO00o27));
                            int i41117 = iOooO00o28;
                            userInfo.setRegTime(cursor2.getInt(i41117));
                            int i41118 = iOooO00o29;
                            iOooO00o29 = i41118;
                            iOooO00o28 = i41117;
                            i22 = i6;
                            userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i41118) ? null : cursor2.getString(i41118)));
                            i27 = iOooO00o30;
                            if (cursor2.getInt(i27) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            userInfo.setPremium(z);
                            iOooO00o30 = i27;
                            i24 = iOooO00o31;
                            userInfo.setPremiumLevel(cursor2.getInt(i24));
                            userInfo.setVipState(cursor2.getInt(iOooO00o32));
                            i25 = iOooO00o33;
                            userInfo.setVipLevel(cursor2.getInt(i25));
                            i26 = i28;
                            if (cursor2.getInt(i26) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            userInfo.setShowVIP(z2);
                            i28 = i26;
                            ArrayList arrayList12 = arrayList;
                            arrayList12.add(new FriendInfo(userInfo, friend2));
                            cursor2 = cursor;
                            iOooO00o33 = i25;
                            iOooO00o31 = i24;
                            iOooO00o20 = i18;
                            iOooO00o21 = i19;
                            iOooO00o2 = i5;
                            iOooO00o7 = i17;
                            iOooO00o13 = i23;
                            iOooO00o = i3;
                            i29 = i21;
                            iOooO00o22 = i20;
                            arrayList2 = arrayList12;
                            iOooO00o19 = i16;
                            iOooO00o6 = i15;
                            iOooO00o35 = i;
                            iOooO00o18 = i14;
                            iOooO00o5 = i13;
                            iOooO00o17 = i12;
                            iOooO00o4 = i11;
                            iOooO00o16 = i10;
                            iOooO00o36 = i9;
                            iOooO00o15 = i8;
                            iOooO00o3 = i7;
                            iOooO00o14 = i22;
                        }
                        iOooO00o10 = iOooO00o10;
                        iOooO00o11 = iOooO00o11;
                        i5 = iOooO00o2;
                        i6 = iOooO00o14;
                        iOooO00o10 = iOooO00o10;
                        iOooO00o11 = iOooO00o11;
                        i7 = iOooO00o3;
                        i8 = iOooO00o15;
                        iOooO00o10 = iOooO00o10;
                        iOooO00o11 = iOooO00o11;
                        i9 = iOooO00o36;
                        i10 = iOooO00o16;
                        iOooO00o10 = iOooO00o10;
                        iOooO00o11 = iOooO00o11;
                        i11 = iOooO00o4;
                        i12 = iOooO00o17;
                        iOooO00o10 = iOooO00o10;
                        iOooO00o11 = iOooO00o11;
                        i13 = iOooO00o5;
                        i14 = iOooO00o18;
                        iOooO00o10 = iOooO00o10;
                        iOooO00o11 = iOooO00o11;
                        i15 = iOooO00o6;
                        i16 = iOooO00o19;
                        iOooO00o10 = iOooO00o10;
                        iOooO00o11 = iOooO00o11;
                        i17 = iOooO00o7;
                        i18 = iOooO00o20;
                        iOooO00o10 = iOooO00o10;
                        iOooO00o11 = iOooO00o11;
                        arrayList = arrayList2;
                        i19 = iOooO00o21;
                        iOooO00o10 = iOooO00o10;
                        iOooO00o11 = iOooO00o11;
                        friend2 = friend;
                        userInfo = new UserInfo();
                        int i41119 = i16;
                        int i411110 = i18;
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
                        if (cursor2.isNull(i2)) {
                            string3 = null;
                        } else {
                            string3 = cursor2.getString(i2);
                        }
                        userInfo.setUserHeader(string3);
                        if (cursor2.isNull(i4)) {
                            string4 = null;
                        } else {
                            string4 = cursor2.getString(i4);
                        }
                        userInfo.setUserHeaderFrame(string4);
                        if (cursor2.isNull(i6)) {
                            string5 = null;
                        } else {
                            string5 = cursor2.getString(i6);
                        }
                        userInfo.setBackground(string5);
                        userInfo.setUserLevel(cursor2.getInt(i8));
                        userInfo.setSex(cursor2.getInt(i10));
                        if (cursor2.isNull(i12)) {
                            string6 = null;
                        } else {
                            string6 = cursor2.getString(i12);
                        }
                        userInfo.setBio(string6);
                        if (cursor2.isNull(i14)) {
                            string7 = null;
                        } else {
                            string7 = cursor2.getString(i14);
                        }
                        userInfo.setBirthday(string7);
                        i16 = i41119;
                        userInfo.setAge(cursor2.getInt(i16));
                        i21 = i2;
                        i18 = i411110;
                        userInfo.setCountryId(cursor2.getInt(i18));
                        userInfo.setRegion(cursor2.getInt(i19));
                        i20 = iOooO00o22;
                        if (cursor2.isNull(i20)) {
                            string8 = null;
                        } else {
                            string8 = cursor2.getString(i20);
                        }
                        userInfo.setMedal(string8);
                        i23 = i4;
                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                        userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                        userInfo.setRole(cursor2.getInt(iOooO00o27));
                        int i411111 = iOooO00o28;
                        userInfo.setRegTime(cursor2.getInt(i411111));
                        int i411112 = iOooO00o29;
                        iOooO00o29 = i411112;
                        iOooO00o28 = i411111;
                        i22 = i6;
                        userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i411112) ? null : cursor2.getString(i411112)));
                        i27 = iOooO00o30;
                        if (cursor2.getInt(i27) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        userInfo.setPremium(z);
                        iOooO00o30 = i27;
                        i24 = iOooO00o31;
                        userInfo.setPremiumLevel(cursor2.getInt(i24));
                        userInfo.setVipState(cursor2.getInt(iOooO00o32));
                        i25 = iOooO00o33;
                        userInfo.setVipLevel(cursor2.getInt(i25));
                        i26 = i28;
                        if (cursor2.getInt(i26) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        userInfo.setShowVIP(z2);
                        i28 = i26;
                        ArrayList arrayList13 = arrayList;
                        arrayList13.add(new FriendInfo(userInfo, friend2));
                        cursor2 = cursor;
                        iOooO00o33 = i25;
                        iOooO00o31 = i24;
                        iOooO00o20 = i18;
                        iOooO00o21 = i19;
                        iOooO00o2 = i5;
                        iOooO00o7 = i17;
                        iOooO00o13 = i23;
                        iOooO00o = i3;
                        i29 = i21;
                        iOooO00o22 = i20;
                        arrayList2 = arrayList13;
                        iOooO00o19 = i16;
                        iOooO00o6 = i15;
                        iOooO00o35 = i;
                        iOooO00o18 = i14;
                        iOooO00o5 = i13;
                        iOooO00o17 = i12;
                        iOooO00o4 = i11;
                        iOooO00o16 = i10;
                        iOooO00o36 = i9;
                        iOooO00o15 = i8;
                        iOooO00o3 = i7;
                        iOooO00o14 = i22;
                    }
                    iOooO00o10 = iOooO00o10;
                    iOooO00o11 = iOooO00o11;
                    i3 = iOooO00o;
                    i4 = iOooO00o13;
                    iOooO00o10 = iOooO00o10;
                    iOooO00o11 = iOooO00o11;
                    i5 = iOooO00o2;
                    i6 = iOooO00o14;
                    iOooO00o10 = iOooO00o10;
                    iOooO00o11 = iOooO00o11;
                    i7 = iOooO00o3;
                    i8 = iOooO00o15;
                    iOooO00o10 = iOooO00o10;
                    iOooO00o11 = iOooO00o11;
                    i9 = iOooO00o36;
                    i10 = iOooO00o16;
                    iOooO00o10 = iOooO00o10;
                    iOooO00o11 = iOooO00o11;
                    i11 = iOooO00o4;
                    i12 = iOooO00o17;
                    iOooO00o10 = iOooO00o10;
                    iOooO00o11 = iOooO00o11;
                    i13 = iOooO00o5;
                    i14 = iOooO00o18;
                    iOooO00o10 = iOooO00o10;
                    iOooO00o11 = iOooO00o11;
                    i15 = iOooO00o6;
                    i16 = iOooO00o19;
                    iOooO00o10 = iOooO00o10;
                    iOooO00o11 = iOooO00o11;
                    i17 = iOooO00o7;
                    i18 = iOooO00o20;
                    iOooO00o10 = iOooO00o10;
                    iOooO00o11 = iOooO00o11;
                    arrayList = arrayList2;
                    i19 = iOooO00o21;
                    iOooO00o10 = iOooO00o10;
                    iOooO00o11 = iOooO00o11;
                    friend2 = friend;
                    userInfo = new UserInfo();
                    int i411113 = i16;
                    int i411114 = i18;
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
                    if (cursor2.isNull(i2)) {
                        string3 = null;
                    } else {
                        string3 = cursor2.getString(i2);
                    }
                    userInfo.setUserHeader(string3);
                    if (cursor2.isNull(i4)) {
                        string4 = null;
                    } else {
                        string4 = cursor2.getString(i4);
                    }
                    userInfo.setUserHeaderFrame(string4);
                    if (cursor2.isNull(i6)) {
                        string5 = null;
                    } else {
                        string5 = cursor2.getString(i6);
                    }
                    userInfo.setBackground(string5);
                    userInfo.setUserLevel(cursor2.getInt(i8));
                    userInfo.setSex(cursor2.getInt(i10));
                    if (cursor2.isNull(i12)) {
                        string6 = null;
                    } else {
                        string6 = cursor2.getString(i12);
                    }
                    userInfo.setBio(string6);
                    if (cursor2.isNull(i14)) {
                        string7 = null;
                    } else {
                        string7 = cursor2.getString(i14);
                    }
                    userInfo.setBirthday(string7);
                    i16 = i411113;
                    userInfo.setAge(cursor2.getInt(i16));
                    i21 = i2;
                    i18 = i411114;
                    userInfo.setCountryId(cursor2.getInt(i18));
                    userInfo.setRegion(cursor2.getInt(i19));
                    i20 = iOooO00o22;
                    if (cursor2.isNull(i20)) {
                        string8 = null;
                    } else {
                        string8 = cursor2.getString(i20);
                    }
                    userInfo.setMedal(string8);
                    i23 = i4;
                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                    userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                    userInfo.setRole(cursor2.getInt(iOooO00o27));
                    int i411115 = iOooO00o28;
                    userInfo.setRegTime(cursor2.getInt(i411115));
                    int i411116 = iOooO00o29;
                    iOooO00o29 = i411116;
                    iOooO00o28 = i411115;
                    i22 = i6;
                    userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i411116) ? null : cursor2.getString(i411116)));
                    i27 = iOooO00o30;
                    if (cursor2.getInt(i27) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    userInfo.setPremium(z);
                    iOooO00o30 = i27;
                    i24 = iOooO00o31;
                    userInfo.setPremiumLevel(cursor2.getInt(i24));
                    userInfo.setVipState(cursor2.getInt(iOooO00o32));
                    i25 = iOooO00o33;
                    userInfo.setVipLevel(cursor2.getInt(i25));
                    i26 = i28;
                    if (cursor2.getInt(i26) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    userInfo.setShowVIP(z2);
                    i28 = i26;
                    ArrayList arrayList14 = arrayList;
                    arrayList14.add(new FriendInfo(userInfo, friend2));
                    cursor2 = cursor;
                    iOooO00o33 = i25;
                    iOooO00o31 = i24;
                    iOooO00o20 = i18;
                    iOooO00o21 = i19;
                    iOooO00o2 = i5;
                    iOooO00o7 = i17;
                    iOooO00o13 = i23;
                    iOooO00o = i3;
                    i29 = i21;
                    iOooO00o22 = i20;
                    arrayList2 = arrayList14;
                    iOooO00o19 = i16;
                    iOooO00o6 = i15;
                    iOooO00o35 = i;
                    iOooO00o18 = i14;
                    iOooO00o5 = i13;
                    iOooO00o17 = i12;
                    iOooO00o4 = i11;
                    iOooO00o16 = i10;
                    iOooO00o36 = i9;
                    iOooO00o15 = i8;
                    iOooO00o3 = i7;
                    iOooO00o14 = i22;
                } else {
                    iOooO00o10 = iOooO00o10;
                    iOooO00o11 = iOooO00o11;
                }
                iOooO00o10 = iOooO00o10;
                iOooO00o11 = iOooO00o11;
                i = iOooO00o35;
                i2 = i29;
                iOooO00o10 = iOooO00o10;
                iOooO00o11 = iOooO00o11;
                i3 = iOooO00o;
                i4 = iOooO00o13;
                iOooO00o10 = iOooO00o10;
                iOooO00o11 = iOooO00o11;
                i5 = iOooO00o2;
                i6 = iOooO00o14;
                iOooO00o10 = iOooO00o10;
                iOooO00o11 = iOooO00o11;
                i7 = iOooO00o3;
                i8 = iOooO00o15;
                iOooO00o10 = iOooO00o10;
                iOooO00o11 = iOooO00o11;
                i9 = iOooO00o36;
                i10 = iOooO00o16;
                iOooO00o10 = iOooO00o10;
                iOooO00o11 = iOooO00o11;
                i11 = iOooO00o4;
                i12 = iOooO00o17;
                iOooO00o10 = iOooO00o10;
                iOooO00o11 = iOooO00o11;
                i13 = iOooO00o5;
                i14 = iOooO00o18;
                iOooO00o10 = iOooO00o10;
                iOooO00o11 = iOooO00o11;
                i15 = iOooO00o6;
                i16 = iOooO00o19;
                iOooO00o10 = iOooO00o10;
                iOooO00o11 = iOooO00o11;
                i17 = iOooO00o7;
                i18 = iOooO00o20;
                iOooO00o10 = iOooO00o10;
                iOooO00o11 = iOooO00o11;
                arrayList = arrayList2;
                i19 = iOooO00o21;
                iOooO00o10 = iOooO00o10;
                iOooO00o11 = iOooO00o11;
                friend2 = friend;
                userInfo = new UserInfo();
                int i411117 = i16;
                int i411118 = i18;
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
                if (cursor2.isNull(i2)) {
                    string3 = null;
                } else {
                    string3 = cursor2.getString(i2);
                }
                userInfo.setUserHeader(string3);
                if (cursor2.isNull(i4)) {
                    string4 = null;
                } else {
                    string4 = cursor2.getString(i4);
                }
                userInfo.setUserHeaderFrame(string4);
                if (cursor2.isNull(i6)) {
                    string5 = null;
                } else {
                    string5 = cursor2.getString(i6);
                }
                userInfo.setBackground(string5);
                userInfo.setUserLevel(cursor2.getInt(i8));
                userInfo.setSex(cursor2.getInt(i10));
                if (cursor2.isNull(i12)) {
                    string6 = null;
                } else {
                    string6 = cursor2.getString(i12);
                }
                userInfo.setBio(string6);
                if (cursor2.isNull(i14)) {
                    string7 = null;
                } else {
                    string7 = cursor2.getString(i14);
                }
                userInfo.setBirthday(string7);
                i16 = i411117;
                userInfo.setAge(cursor2.getInt(i16));
                i21 = i2;
                i18 = i411118;
                userInfo.setCountryId(cursor2.getInt(i18));
                userInfo.setRegion(cursor2.getInt(i19));
                i20 = iOooO00o22;
                if (cursor2.isNull(i20)) {
                    string8 = null;
                } else {
                    string8 = cursor2.getString(i20);
                }
                userInfo.setMedal(string8);
                i23 = i4;
                userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                userInfo.setRole(cursor2.getInt(iOooO00o27));
                int i411119 = iOooO00o28;
                userInfo.setRegTime(cursor2.getInt(i411119));
                int i4111110 = iOooO00o29;
                iOooO00o29 = i4111110;
                iOooO00o28 = i411119;
                i22 = i6;
                userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i4111110) ? null : cursor2.getString(i4111110)));
                i27 = iOooO00o30;
                if (cursor2.getInt(i27) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                userInfo.setPremium(z);
                iOooO00o30 = i27;
                i24 = iOooO00o31;
                userInfo.setPremiumLevel(cursor2.getInt(i24));
                userInfo.setVipState(cursor2.getInt(iOooO00o32));
                i25 = iOooO00o33;
                userInfo.setVipLevel(cursor2.getInt(i25));
                i26 = i28;
                if (cursor2.getInt(i26) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                userInfo.setShowVIP(z2);
                i28 = i26;
                ArrayList arrayList15 = arrayList;
                arrayList15.add(new FriendInfo(userInfo, friend2));
                cursor2 = cursor;
                iOooO00o33 = i25;
                iOooO00o31 = i24;
                iOooO00o20 = i18;
                iOooO00o21 = i19;
                iOooO00o2 = i5;
                iOooO00o7 = i17;
                iOooO00o13 = i23;
                iOooO00o = i3;
                i29 = i21;
                iOooO00o22 = i20;
                arrayList2 = arrayList15;
                iOooO00o19 = i16;
                iOooO00o6 = i15;
                iOooO00o35 = i;
                iOooO00o18 = i14;
                iOooO00o5 = i13;
                iOooO00o17 = i12;
                iOooO00o4 = i11;
                iOooO00o16 = i10;
                iOooO00o36 = i9;
                iOooO00o15 = i8;
                iOooO00o3 = i7;
                iOooO00o14 = i22;
            }
            return arrayList2;
        }
    }

    public class OooO00o extends o0000OO0 {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Delete from ConversationTable where uid = ?";
        }
    }

    public class OooO0O0 implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41024OooO00o;

        public OooO0O0(o0000O0 o0000o1) {
            this.f41024OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooOOO = OooOo.this.f41012OooO00o.OooOOO(this.f41024OooO00o);
            try {
                return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : Integer.valueOf(cursorOooOOO.getInt(0));
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f41024OooO00o.release();
        }
    }

    public class OooO0OO implements Callable<Conversation> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41026OooO00o;

        public OooO0OO(o0000O0 o0000o1) {
            this.f41026OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final Conversation call() throws Exception {
            Cursor cursorOooOOO = OooOo.this.f41012OooO00o.OooOOO(this.f41026OooO00o);
            try {
                int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
                int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "targetId");
                int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "mid");
                int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "sendState");
                int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, ShareConstants.WEB_DIALOG_PARAM_TITLE);
                int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "type");
                int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "momentType");
                int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "unReadCount");
                int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "draft");
                int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "time");
                int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "topTime");
                int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "isVoiceAndUnread");
                int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "isAcceptMsg");
                Conversation conversation = null;
                String string = null;
                if (cursorOooOOO.moveToFirst()) {
                    Conversation conversation2 = new Conversation();
                    conversation2.setUid(cursorOooOOO.getLong(iOooO00o));
                    conversation2.setTargetId(cursorOooOOO.getLong(iOooO00o2));
                    conversation2.setMid(cursorOooOOO.isNull(iOooO00o3) ? null : cursorOooOOO.getString(iOooO00o3));
                    conversation2.setSendState(cursorOooOOO.getInt(iOooO00o4));
                    conversation2.setTitle(cursorOooOOO.isNull(iOooO00o5) ? null : cursorOooOOO.getString(iOooO00o5));
                    conversation2.setMessage(cursorOooOOO.isNull(iOooO00o6) ? null : cursorOooOOO.getString(iOooO00o6));
                    conversation2.setType(cursorOooOOO.getInt(iOooO00o7));
                    conversation2.setMomentType(cursorOooOOO.getInt(iOooO00o8));
                    conversation2.setUnReadCount(cursorOooOOO.getInt(iOooO00o9));
                    if (!cursorOooOOO.isNull(iOooO00o10)) {
                        string = cursorOooOOO.getString(iOooO00o10);
                    }
                    conversation2.setDraft(string);
                    conversation2.setTime(cursorOooOOO.getLong(iOooO00o11));
                    conversation2.setTopTime(cursorOooOOO.getLong(iOooO00o12));
                    conversation2.setVoiceAndUnread(cursorOooOOO.getInt(iOooO00o13) != 0);
                    conversation2.setAcceptMsg(cursorOooOOO.getInt(iOooO00o14) != 0);
                    conversation = conversation2;
                }
                return conversation;
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f41026OooO00o.release();
        }
    }

    public class OooO0o extends o000O0<ConversationWithUser> {
        public OooO0o(o0000O0 o0000o1, RoomDatabase roomDatabase, String... strArr) {
            super(o0000o1, roomDatabase, strArr);
        }

        /* JADX WARN: Code duplicated, block: B:117:0x035f  */
        /* JADX WARN: Code duplicated, block: B:118:0x0365  */
        /* JADX WARN: Code duplicated, block: B:119:0x036f  */
        /* JADX WARN: Code duplicated, block: B:120:0x0379  */
        /* JADX WARN: Code duplicated, block: B:121:0x0383  */
        /* JADX WARN: Code duplicated, block: B:122:0x038d  */
        /* JADX WARN: Code duplicated, block: B:123:0x0397  */
        /* JADX WARN: Code duplicated, block: B:124:0x03a0  */
        /* JADX WARN: Code duplicated, block: B:125:0x03a9  */
        /* JADX WARN: Code duplicated, block: B:126:0x03b2  */
        /* JADX WARN: Code duplicated, block: B:127:0x03bb  */
        /* JADX WARN: Code duplicated, block: B:128:0x03c4  */
        /* JADX WARN: Code duplicated, block: B:129:0x03cd  */
        /* JADX WARN: Code duplicated, block: B:143:0x0419  */
        /* JADX WARN: Code duplicated, block: B:144:0x041c  */
        /* JADX WARN: Code duplicated, block: B:147:0x0430  */
        /* JADX WARN: Code duplicated, block: B:148:0x0433  */
        /* JADX WARN: Code duplicated, block: B:151:0x0440  */
        /* JADX WARN: Code duplicated, block: B:152:0x0443  */
        /* JADX WARN: Code duplicated, block: B:155:0x0450  */
        /* JADX WARN: Code duplicated, block: B:156:0x0453  */
        /* JADX WARN: Code duplicated, block: B:159:0x0460  */
        /* JADX WARN: Code duplicated, block: B:160:0x0463  */
        /* JADX WARN: Code duplicated, block: B:163:0x047e  */
        /* JADX WARN: Code duplicated, block: B:164:0x0481  */
        /* JADX WARN: Code duplicated, block: B:167:0x048e  */
        /* JADX WARN: Code duplicated, block: B:168:0x0491  */
        /* JADX WARN: Code duplicated, block: B:171:0x04bb  */
        /* JADX WARN: Code duplicated, block: B:172:0x04c0  */
        /* JADX WARN: Code duplicated, block: B:176:0x050c  */
        /* JADX WARN: Code duplicated, block: B:179:0x052d  */
        /* JADX WARN: Code duplicated, block: B:180:0x052f  */
        /* JADX WARN: Code duplicated, block: B:183:0x0558  */
        /* JADX WARN: Code duplicated, block: B:184:0x055a  */
        /* JADX WARN: Code duplicated, block: B:63:0x025e  */
        /* JADX WARN: Code duplicated, block: B:65:0x0268  */
        /* JADX WARN: Code duplicated, block: B:67:0x0272  */
        /* JADX WARN: Code duplicated, block: B:69:0x027c  */
        /* JADX WARN: Code duplicated, block: B:71:0x0286  */
        /* JADX WARN: Code duplicated, block: B:73:0x0290  */
        /* JADX WARN: Code duplicated, block: B:75:0x029a  */
        /* JADX WARN: Code duplicated, block: B:77:0x02a4  */
        /* JADX WARN: Code duplicated, block: B:79:0x02ae  */
        /* JADX WARN: Code duplicated, block: B:81:0x02b8  */
        /* JADX WARN: Code duplicated, block: B:83:0x02c2  */
        /* JADX WARN: Code duplicated, block: B:85:0x02cc  */
        /* JADX WARN: Code duplicated, block: B:87:0x02d8  */
        /* JADX WARN: Code duplicated, block: B:89:0x02e0  */
        @Override // p093o000o0O0.o000O0
        public final List<ConversationWithUser> OooO0o(Cursor cursor) {
            int i;
            Conversation conversation;
            int i2;
            int i3;
            int i4;
            int i5;
            Conversation conversation2;
            UserInfo userInfo;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            int i6;
            String string8;
            int i7;
            int i8;
            int i9;
            boolean z;
            int i10;
            int i11;
            int i12;
            boolean z2;
            Cursor cursor2 = cursor;
            int iOooO00o = o00O0O.OooO00o(cursor2, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursor2, "targetId");
            int iOooO00o3 = o00O0O.OooO00o(cursor2, "mid");
            int iOooO00o4 = o00O0O.OooO00o(cursor2, "sendState");
            int iOooO00o5 = o00O0O.OooO00o(cursor2, ShareConstants.WEB_DIALOG_PARAM_TITLE);
            int iOooO00o6 = o00O0O.OooO00o(cursor2, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            int iOooO00o7 = o00O0O.OooO00o(cursor2, "type");
            int iOooO00o8 = o00O0O.OooO00o(cursor2, "momentType");
            int iOooO00o9 = o00O0O.OooO00o(cursor2, "unReadCount");
            int iOooO00o10 = o00O0O.OooO00o(cursor2, "draft");
            int iOooO00o11 = o00O0O.OooO00o(cursor2, "time");
            int iOooO00o12 = o00O0O.OooO00o(cursor2, "topTime");
            int iOooO00o13 = o00O0O.OooO00o(cursor2, "isVoiceAndUnread");
            int iOooO00o14 = o00O0O.OooO00o(cursor2, "isAcceptMsg");
            int iOooO00o15 = o00O0O.OooO00o(cursor2, "userId");
            int iOooO00o16 = o00O0O.OooO00o(cursor2, "userIdx");
            int iOooO00o17 = o00O0O.OooO00o(cursor2, "idLevel");
            int iOooO00o18 = o00O0O.OooO00o(cursor2, "userName");
            int iOooO00o19 = o00O0O.OooO00o(cursor2, "userAvatar");
            int iOooO00o20 = o00O0O.OooO00o(cursor2, "userFrame");
            int iOooO00o21 = o00O0O.OooO00o(cursor2, "background");
            int iOooO00o22 = o00O0O.OooO00o(cursor2, "userLevel");
            int iOooO00o23 = o00O0O.OooO00o(cursor2, "gender");
            int iOooO00o24 = o00O0O.OooO00o(cursor2, "bio");
            int iOooO00o25 = o00O0O.OooO00o(cursor2, "birthday");
            int iOooO00o26 = o00O0O.OooO00o(cursor2, "age");
            int iOooO00o27 = o00O0O.OooO00o(cursor2, "countryId");
            int iOooO00o28 = o00O0O.OooO00o(cursor2, "region");
            int iOooO00o29 = o00O0O.OooO00o(cursor2, "medal");
            int iOooO00o30 = o00O0O.OooO00o(cursor2, "visitorNum");
            int iOooO00o31 = o00O0O.OooO00o(cursor2, "followedNum");
            int iOooO00o32 = o00O0O.OooO00o(cursor2, "fansNum");
            int iOooO00o33 = o00O0O.OooO00o(cursor2, "joinRoomNum");
            int iOooO00o34 = o00O0O.OooO00o(cursor2, "role");
            int iOooO00o35 = o00O0O.OooO00o(cursor2, "regTime");
            int iOooO00o36 = o00O0O.OooO00o(cursor2, "tags");
            int iOooO00o37 = o00O0O.OooO00o(cursor2, "vip");
            int iOooO00o38 = o00O0O.OooO00o(cursor2, "vipLevel");
            int iOooO00o39 = o00O0O.OooO00o(cursor2, "kaVipState");
            int iOooO00o40 = o00O0O.OooO00o(cursor2, "kaVipLevel");
            int iOooO00o41 = o00O0O.OooO00o(cursor2, "showVIP");
            int i13 = iOooO00o14;
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                if (cursor2.isNull(iOooO00o) && cursor2.isNull(iOooO00o2) && cursor2.isNull(iOooO00o3) && cursor2.isNull(iOooO00o4) && cursor2.isNull(iOooO00o5) && cursor2.isNull(iOooO00o6) && cursor2.isNull(iOooO00o7) && cursor2.isNull(iOooO00o8) && cursor2.isNull(iOooO00o9) && cursor2.isNull(iOooO00o10) && cursor2.isNull(iOooO00o11) && cursor2.isNull(iOooO00o12) && cursor2.isNull(iOooO00o13)) {
                    i = i13;
                    if (cursor2.isNull(i)) {
                        iOooO00o = iOooO00o;
                        conversation = null;
                    }
                    if (cursor2.isNull(iOooO00o15)) {
                        i2 = iOooO00o2;
                        i3 = iOooO00o16;
                        if (cursor2.isNull(i3)) {
                            iOooO00o3 = iOooO00o3;
                            iOooO00o17 = iOooO00o17;
                            if (cursor2.isNull(iOooO00o17)) {
                                iOooO00o4 = iOooO00o4;
                                iOooO00o18 = iOooO00o18;
                                if (cursor2.isNull(iOooO00o18)) {
                                    iOooO00o5 = iOooO00o5;
                                    iOooO00o19 = iOooO00o19;
                                    if (cursor2.isNull(iOooO00o19)) {
                                        iOooO00o6 = iOooO00o6;
                                        iOooO00o20 = iOooO00o20;
                                        if (cursor2.isNull(iOooO00o20)) {
                                            iOooO00o7 = iOooO00o7;
                                            iOooO00o21 = iOooO00o21;
                                            if (cursor2.isNull(iOooO00o21)) {
                                                iOooO00o8 = iOooO00o8;
                                                iOooO00o22 = iOooO00o22;
                                                if (cursor2.isNull(iOooO00o22)) {
                                                    iOooO00o9 = iOooO00o9;
                                                    iOooO00o23 = iOooO00o23;
                                                    if (cursor2.isNull(iOooO00o23)) {
                                                        iOooO00o10 = iOooO00o10;
                                                        iOooO00o24 = iOooO00o24;
                                                        if (cursor2.isNull(iOooO00o24)) {
                                                            iOooO00o11 = iOooO00o11;
                                                            iOooO00o25 = iOooO00o25;
                                                            if (cursor2.isNull(iOooO00o25)) {
                                                                iOooO00o12 = iOooO00o12;
                                                                iOooO00o26 = iOooO00o26;
                                                                if (cursor2.isNull(iOooO00o26)) {
                                                                    i4 = iOooO00o13;
                                                                    i5 = iOooO00o27;
                                                                    i = i;
                                                                    if (cursor2.isNull(i5)) {
                                                                        iOooO00o28 = iOooO00o28;
                                                                        if (cursor2.isNull(iOooO00o28)) {
                                                                            conversation2 = conversation;
                                                                            if (!cursor2.isNull(iOooO00o29) && cursor2.isNull(iOooO00o30) && cursor2.isNull(iOooO00o31) && cursor2.isNull(iOooO00o32) && cursor2.isNull(iOooO00o33) && cursor2.isNull(iOooO00o34) && cursor2.isNull(iOooO00o35) && cursor2.isNull(iOooO00o36) && cursor2.isNull(iOooO00o37) && cursor2.isNull(iOooO00o38) && cursor2.isNull(iOooO00o39) && cursor2.isNull(iOooO00o40)) {
                                                                                int i14 = iOooO00o41;
                                                                                if (cursor2.isNull(i14)) {
                                                                                    i12 = i14;
                                                                                    i6 = iOooO00o29;
                                                                                    userInfo = null;
                                                                                    i7 = i3;
                                                                                    i8 = iOooO00o17;
                                                                                    i10 = iOooO00o38;
                                                                                    i11 = iOooO00o40;
                                                                                } else {
                                                                                    iOooO00o41 = i14;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        conversation2 = conversation;
                                                                        iOooO00o28 = iOooO00o28;
                                                                    }
                                                                    userInfo = new UserInfo();
                                                                    int i15 = i5;
                                                                    int i16 = iOooO00o28;
                                                                    userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                                    if (cursor2.isNull(i3)) {
                                                                        string = null;
                                                                    } else {
                                                                        string = cursor2.getString(i3);
                                                                    }
                                                                    userInfo.setUserIdx(string);
                                                                    userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                                    if (cursor2.isNull(iOooO00o18)) {
                                                                        string2 = null;
                                                                    } else {
                                                                        string2 = cursor2.getString(iOooO00o18);
                                                                    }
                                                                    userInfo.setUserName(string2);
                                                                    if (cursor2.isNull(iOooO00o19)) {
                                                                        string3 = null;
                                                                    } else {
                                                                        string3 = cursor2.getString(iOooO00o19);
                                                                    }
                                                                    userInfo.setUserHeader(string3);
                                                                    if (cursor2.isNull(iOooO00o20)) {
                                                                        string4 = null;
                                                                    } else {
                                                                        string4 = cursor2.getString(iOooO00o20);
                                                                    }
                                                                    userInfo.setUserHeaderFrame(string4);
                                                                    if (cursor2.isNull(iOooO00o21)) {
                                                                        string5 = null;
                                                                    } else {
                                                                        string5 = cursor2.getString(iOooO00o21);
                                                                    }
                                                                    userInfo.setBackground(string5);
                                                                    userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                                    userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                                    if (cursor2.isNull(iOooO00o24)) {
                                                                        string6 = null;
                                                                    } else {
                                                                        string6 = cursor2.getString(iOooO00o24);
                                                                    }
                                                                    userInfo.setBio(string6);
                                                                    if (cursor2.isNull(iOooO00o25)) {
                                                                        string7 = null;
                                                                    } else {
                                                                        string7 = cursor2.getString(iOooO00o25);
                                                                    }
                                                                    userInfo.setBirthday(string7);
                                                                    userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                                    i5 = i15;
                                                                    userInfo.setCountryId(cursor2.getInt(i5));
                                                                    iOooO00o28 = i16;
                                                                    userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                                    i6 = iOooO00o29;
                                                                    if (cursor2.isNull(i6)) {
                                                                        string8 = null;
                                                                    } else {
                                                                        string8 = cursor2.getString(i6);
                                                                    }
                                                                    userInfo.setMedal(string8);
                                                                    i7 = i3;
                                                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                                    userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                                    userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                                    int i17 = iOooO00o35;
                                                                    userInfo.setRegTime(cursor2.getInt(i17));
                                                                    int i18 = iOooO00o36;
                                                                    iOooO00o36 = i18;
                                                                    iOooO00o35 = i17;
                                                                    i8 = iOooO00o17;
                                                                    userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i18) ? null : cursor2.getString(i18)));
                                                                    i9 = iOooO00o37;
                                                                    if (cursor2.getInt(i9) != 0) {
                                                                        z = true;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    userInfo.setPremium(z);
                                                                    iOooO00o37 = i9;
                                                                    i10 = iOooO00o38;
                                                                    userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                                    userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                                    i11 = iOooO00o40;
                                                                    userInfo.setVipLevel(cursor2.getInt(i11));
                                                                    i12 = iOooO00o41;
                                                                    if (cursor2.getInt(i12) != 0) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    userInfo.setShowVIP(z2);
                                                                } else {
                                                                    i4 = iOooO00o13;
                                                                    i = i;
                                                                    i5 = iOooO00o27;
                                                                    iOooO00o28 = iOooO00o28;
                                                                }
                                                                conversation2 = conversation;
                                                                userInfo = new UserInfo();
                                                                int i19 = i5;
                                                                int i110 = iOooO00o28;
                                                                userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                                if (cursor2.isNull(i3)) {
                                                                    string = null;
                                                                } else {
                                                                    string = cursor2.getString(i3);
                                                                }
                                                                userInfo.setUserIdx(string);
                                                                userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                                if (cursor2.isNull(iOooO00o18)) {
                                                                    string2 = null;
                                                                } else {
                                                                    string2 = cursor2.getString(iOooO00o18);
                                                                }
                                                                userInfo.setUserName(string2);
                                                                if (cursor2.isNull(iOooO00o19)) {
                                                                    string3 = null;
                                                                } else {
                                                                    string3 = cursor2.getString(iOooO00o19);
                                                                }
                                                                userInfo.setUserHeader(string3);
                                                                if (cursor2.isNull(iOooO00o20)) {
                                                                    string4 = null;
                                                                } else {
                                                                    string4 = cursor2.getString(iOooO00o20);
                                                                }
                                                                userInfo.setUserHeaderFrame(string4);
                                                                if (cursor2.isNull(iOooO00o21)) {
                                                                    string5 = null;
                                                                } else {
                                                                    string5 = cursor2.getString(iOooO00o21);
                                                                }
                                                                userInfo.setBackground(string5);
                                                                userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                                userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                                if (cursor2.isNull(iOooO00o24)) {
                                                                    string6 = null;
                                                                } else {
                                                                    string6 = cursor2.getString(iOooO00o24);
                                                                }
                                                                userInfo.setBio(string6);
                                                                if (cursor2.isNull(iOooO00o25)) {
                                                                    string7 = null;
                                                                } else {
                                                                    string7 = cursor2.getString(iOooO00o25);
                                                                }
                                                                userInfo.setBirthday(string7);
                                                                userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                                i5 = i19;
                                                                userInfo.setCountryId(cursor2.getInt(i5));
                                                                iOooO00o28 = i110;
                                                                userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                                i6 = iOooO00o29;
                                                                if (cursor2.isNull(i6)) {
                                                                    string8 = null;
                                                                } else {
                                                                    string8 = cursor2.getString(i6);
                                                                }
                                                                userInfo.setMedal(string8);
                                                                i7 = i3;
                                                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                                userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                                userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                                int i111 = iOooO00o35;
                                                                userInfo.setRegTime(cursor2.getInt(i111));
                                                                int i112 = iOooO00o36;
                                                                iOooO00o36 = i112;
                                                                iOooO00o35 = i111;
                                                                i8 = iOooO00o17;
                                                                userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i112) ? null : cursor2.getString(i112)));
                                                                i9 = iOooO00o37;
                                                                if (cursor2.getInt(i9) != 0) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                userInfo.setPremium(z);
                                                                iOooO00o37 = i9;
                                                                i10 = iOooO00o38;
                                                                userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                                userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                                i11 = iOooO00o40;
                                                                userInfo.setVipLevel(cursor2.getInt(i11));
                                                                i12 = iOooO00o41;
                                                                if (cursor2.getInt(i12) != 0) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                userInfo.setShowVIP(z2);
                                                            } else {
                                                                i = i;
                                                                iOooO00o28 = iOooO00o28;
                                                                i4 = iOooO00o13;
                                                                i5 = iOooO00o27;
                                                                conversation2 = conversation;
                                                                userInfo = new UserInfo();
                                                                int i113 = i5;
                                                                int i114 = iOooO00o28;
                                                                userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                                if (cursor2.isNull(i3)) {
                                                                    string = null;
                                                                } else {
                                                                    string = cursor2.getString(i3);
                                                                }
                                                                userInfo.setUserIdx(string);
                                                                userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                                if (cursor2.isNull(iOooO00o18)) {
                                                                    string2 = null;
                                                                } else {
                                                                    string2 = cursor2.getString(iOooO00o18);
                                                                }
                                                                userInfo.setUserName(string2);
                                                                if (cursor2.isNull(iOooO00o19)) {
                                                                    string3 = null;
                                                                } else {
                                                                    string3 = cursor2.getString(iOooO00o19);
                                                                }
                                                                userInfo.setUserHeader(string3);
                                                                if (cursor2.isNull(iOooO00o20)) {
                                                                    string4 = null;
                                                                } else {
                                                                    string4 = cursor2.getString(iOooO00o20);
                                                                }
                                                                userInfo.setUserHeaderFrame(string4);
                                                                if (cursor2.isNull(iOooO00o21)) {
                                                                    string5 = null;
                                                                } else {
                                                                    string5 = cursor2.getString(iOooO00o21);
                                                                }
                                                                userInfo.setBackground(string5);
                                                                userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                                userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                                if (cursor2.isNull(iOooO00o24)) {
                                                                    string6 = null;
                                                                } else {
                                                                    string6 = cursor2.getString(iOooO00o24);
                                                                }
                                                                userInfo.setBio(string6);
                                                                if (cursor2.isNull(iOooO00o25)) {
                                                                    string7 = null;
                                                                } else {
                                                                    string7 = cursor2.getString(iOooO00o25);
                                                                }
                                                                userInfo.setBirthday(string7);
                                                                userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                                i5 = i113;
                                                                userInfo.setCountryId(cursor2.getInt(i5));
                                                                iOooO00o28 = i114;
                                                                userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                                i6 = iOooO00o29;
                                                                if (cursor2.isNull(i6)) {
                                                                    string8 = null;
                                                                } else {
                                                                    string8 = cursor2.getString(i6);
                                                                }
                                                                userInfo.setMedal(string8);
                                                                i7 = i3;
                                                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                                userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                                userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                                int i115 = iOooO00o35;
                                                                userInfo.setRegTime(cursor2.getInt(i115));
                                                                int i116 = iOooO00o36;
                                                                iOooO00o36 = i116;
                                                                iOooO00o35 = i115;
                                                                i8 = iOooO00o17;
                                                                userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i116) ? null : cursor2.getString(i116)));
                                                                i9 = iOooO00o37;
                                                                if (cursor2.getInt(i9) != 0) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                userInfo.setPremium(z);
                                                                iOooO00o37 = i9;
                                                                i10 = iOooO00o38;
                                                                userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                                userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                                i11 = iOooO00o40;
                                                                userInfo.setVipLevel(cursor2.getInt(i11));
                                                                i12 = iOooO00o41;
                                                                if (cursor2.getInt(i12) != 0) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                userInfo.setShowVIP(z2);
                                                            }
                                                        } else {
                                                            i = i;
                                                            iOooO00o28 = iOooO00o28;
                                                            i4 = iOooO00o13;
                                                            i5 = iOooO00o27;
                                                            conversation2 = conversation;
                                                            userInfo = new UserInfo();
                                                            int i117 = i5;
                                                            int i118 = iOooO00o28;
                                                            userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                            if (cursor2.isNull(i3)) {
                                                                string = null;
                                                            } else {
                                                                string = cursor2.getString(i3);
                                                            }
                                                            userInfo.setUserIdx(string);
                                                            userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                            if (cursor2.isNull(iOooO00o18)) {
                                                                string2 = null;
                                                            } else {
                                                                string2 = cursor2.getString(iOooO00o18);
                                                            }
                                                            userInfo.setUserName(string2);
                                                            if (cursor2.isNull(iOooO00o19)) {
                                                                string3 = null;
                                                            } else {
                                                                string3 = cursor2.getString(iOooO00o19);
                                                            }
                                                            userInfo.setUserHeader(string3);
                                                            if (cursor2.isNull(iOooO00o20)) {
                                                                string4 = null;
                                                            } else {
                                                                string4 = cursor2.getString(iOooO00o20);
                                                            }
                                                            userInfo.setUserHeaderFrame(string4);
                                                            if (cursor2.isNull(iOooO00o21)) {
                                                                string5 = null;
                                                            } else {
                                                                string5 = cursor2.getString(iOooO00o21);
                                                            }
                                                            userInfo.setBackground(string5);
                                                            userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                            userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                            if (cursor2.isNull(iOooO00o24)) {
                                                                string6 = null;
                                                            } else {
                                                                string6 = cursor2.getString(iOooO00o24);
                                                            }
                                                            userInfo.setBio(string6);
                                                            if (cursor2.isNull(iOooO00o25)) {
                                                                string7 = null;
                                                            } else {
                                                                string7 = cursor2.getString(iOooO00o25);
                                                            }
                                                            userInfo.setBirthday(string7);
                                                            userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                            i5 = i117;
                                                            userInfo.setCountryId(cursor2.getInt(i5));
                                                            iOooO00o28 = i118;
                                                            userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                            i6 = iOooO00o29;
                                                            if (cursor2.isNull(i6)) {
                                                                string8 = null;
                                                            } else {
                                                                string8 = cursor2.getString(i6);
                                                            }
                                                            userInfo.setMedal(string8);
                                                            i7 = i3;
                                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                            userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                            userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                            int i119 = iOooO00o35;
                                                            userInfo.setRegTime(cursor2.getInt(i119));
                                                            int i1110 = iOooO00o36;
                                                            iOooO00o36 = i1110;
                                                            iOooO00o35 = i119;
                                                            i8 = iOooO00o17;
                                                            userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i1110) ? null : cursor2.getString(i1110)));
                                                            i9 = iOooO00o37;
                                                            if (cursor2.getInt(i9) != 0) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            userInfo.setPremium(z);
                                                            iOooO00o37 = i9;
                                                            i10 = iOooO00o38;
                                                            userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                            userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                            i11 = iOooO00o40;
                                                            userInfo.setVipLevel(cursor2.getInt(i11));
                                                            i12 = iOooO00o41;
                                                            if (cursor2.getInt(i12) != 0) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            userInfo.setShowVIP(z2);
                                                        }
                                                    } else {
                                                        i = i;
                                                        iOooO00o28 = iOooO00o28;
                                                        i4 = iOooO00o13;
                                                        i5 = iOooO00o27;
                                                        conversation2 = conversation;
                                                        userInfo = new UserInfo();
                                                        int i1111 = i5;
                                                        int i1112 = iOooO00o28;
                                                        userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                        if (cursor2.isNull(i3)) {
                                                            string = null;
                                                        } else {
                                                            string = cursor2.getString(i3);
                                                        }
                                                        userInfo.setUserIdx(string);
                                                        userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                        if (cursor2.isNull(iOooO00o18)) {
                                                            string2 = null;
                                                        } else {
                                                            string2 = cursor2.getString(iOooO00o18);
                                                        }
                                                        userInfo.setUserName(string2);
                                                        if (cursor2.isNull(iOooO00o19)) {
                                                            string3 = null;
                                                        } else {
                                                            string3 = cursor2.getString(iOooO00o19);
                                                        }
                                                        userInfo.setUserHeader(string3);
                                                        if (cursor2.isNull(iOooO00o20)) {
                                                            string4 = null;
                                                        } else {
                                                            string4 = cursor2.getString(iOooO00o20);
                                                        }
                                                        userInfo.setUserHeaderFrame(string4);
                                                        if (cursor2.isNull(iOooO00o21)) {
                                                            string5 = null;
                                                        } else {
                                                            string5 = cursor2.getString(iOooO00o21);
                                                        }
                                                        userInfo.setBackground(string5);
                                                        userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                        userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                        if (cursor2.isNull(iOooO00o24)) {
                                                            string6 = null;
                                                        } else {
                                                            string6 = cursor2.getString(iOooO00o24);
                                                        }
                                                        userInfo.setBio(string6);
                                                        if (cursor2.isNull(iOooO00o25)) {
                                                            string7 = null;
                                                        } else {
                                                            string7 = cursor2.getString(iOooO00o25);
                                                        }
                                                        userInfo.setBirthday(string7);
                                                        userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                        i5 = i1111;
                                                        userInfo.setCountryId(cursor2.getInt(i5));
                                                        iOooO00o28 = i1112;
                                                        userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                        i6 = iOooO00o29;
                                                        if (cursor2.isNull(i6)) {
                                                            string8 = null;
                                                        } else {
                                                            string8 = cursor2.getString(i6);
                                                        }
                                                        userInfo.setMedal(string8);
                                                        i7 = i3;
                                                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                        userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                        userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                        int i1113 = iOooO00o35;
                                                        userInfo.setRegTime(cursor2.getInt(i1113));
                                                        int i1114 = iOooO00o36;
                                                        iOooO00o36 = i1114;
                                                        iOooO00o35 = i1113;
                                                        i8 = iOooO00o17;
                                                        userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i1114) ? null : cursor2.getString(i1114)));
                                                        i9 = iOooO00o37;
                                                        if (cursor2.getInt(i9) != 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        userInfo.setPremium(z);
                                                        iOooO00o37 = i9;
                                                        i10 = iOooO00o38;
                                                        userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                        userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                        i11 = iOooO00o40;
                                                        userInfo.setVipLevel(cursor2.getInt(i11));
                                                        i12 = iOooO00o41;
                                                        if (cursor2.getInt(i12) != 0) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        userInfo.setShowVIP(z2);
                                                    }
                                                } else {
                                                    i = i;
                                                    iOooO00o28 = iOooO00o28;
                                                    i4 = iOooO00o13;
                                                    i5 = iOooO00o27;
                                                    conversation2 = conversation;
                                                    userInfo = new UserInfo();
                                                    int i1115 = i5;
                                                    int i1116 = iOooO00o28;
                                                    userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                    if (cursor2.isNull(i3)) {
                                                        string = null;
                                                    } else {
                                                        string = cursor2.getString(i3);
                                                    }
                                                    userInfo.setUserIdx(string);
                                                    userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                    if (cursor2.isNull(iOooO00o18)) {
                                                        string2 = null;
                                                    } else {
                                                        string2 = cursor2.getString(iOooO00o18);
                                                    }
                                                    userInfo.setUserName(string2);
                                                    if (cursor2.isNull(iOooO00o19)) {
                                                        string3 = null;
                                                    } else {
                                                        string3 = cursor2.getString(iOooO00o19);
                                                    }
                                                    userInfo.setUserHeader(string3);
                                                    if (cursor2.isNull(iOooO00o20)) {
                                                        string4 = null;
                                                    } else {
                                                        string4 = cursor2.getString(iOooO00o20);
                                                    }
                                                    userInfo.setUserHeaderFrame(string4);
                                                    if (cursor2.isNull(iOooO00o21)) {
                                                        string5 = null;
                                                    } else {
                                                        string5 = cursor2.getString(iOooO00o21);
                                                    }
                                                    userInfo.setBackground(string5);
                                                    userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                    userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                    if (cursor2.isNull(iOooO00o24)) {
                                                        string6 = null;
                                                    } else {
                                                        string6 = cursor2.getString(iOooO00o24);
                                                    }
                                                    userInfo.setBio(string6);
                                                    if (cursor2.isNull(iOooO00o25)) {
                                                        string7 = null;
                                                    } else {
                                                        string7 = cursor2.getString(iOooO00o25);
                                                    }
                                                    userInfo.setBirthday(string7);
                                                    userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                    i5 = i1115;
                                                    userInfo.setCountryId(cursor2.getInt(i5));
                                                    iOooO00o28 = i1116;
                                                    userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                    i6 = iOooO00o29;
                                                    if (cursor2.isNull(i6)) {
                                                        string8 = null;
                                                    } else {
                                                        string8 = cursor2.getString(i6);
                                                    }
                                                    userInfo.setMedal(string8);
                                                    i7 = i3;
                                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                    userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                    userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                    int i1117 = iOooO00o35;
                                                    userInfo.setRegTime(cursor2.getInt(i1117));
                                                    int i1118 = iOooO00o36;
                                                    iOooO00o36 = i1118;
                                                    iOooO00o35 = i1117;
                                                    i8 = iOooO00o17;
                                                    userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i1118) ? null : cursor2.getString(i1118)));
                                                    i9 = iOooO00o37;
                                                    if (cursor2.getInt(i9) != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    userInfo.setPremium(z);
                                                    iOooO00o37 = i9;
                                                    i10 = iOooO00o38;
                                                    userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                    userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                    i11 = iOooO00o40;
                                                    userInfo.setVipLevel(cursor2.getInt(i11));
                                                    i12 = iOooO00o41;
                                                    if (cursor2.getInt(i12) != 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    userInfo.setShowVIP(z2);
                                                }
                                            } else {
                                                i = i;
                                                iOooO00o28 = iOooO00o28;
                                                i4 = iOooO00o13;
                                                i5 = iOooO00o27;
                                                conversation2 = conversation;
                                                userInfo = new UserInfo();
                                                int i1119 = i5;
                                                int i11110 = iOooO00o28;
                                                userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                if (cursor2.isNull(i3)) {
                                                    string = null;
                                                } else {
                                                    string = cursor2.getString(i3);
                                                }
                                                userInfo.setUserIdx(string);
                                                userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                if (cursor2.isNull(iOooO00o18)) {
                                                    string2 = null;
                                                } else {
                                                    string2 = cursor2.getString(iOooO00o18);
                                                }
                                                userInfo.setUserName(string2);
                                                if (cursor2.isNull(iOooO00o19)) {
                                                    string3 = null;
                                                } else {
                                                    string3 = cursor2.getString(iOooO00o19);
                                                }
                                                userInfo.setUserHeader(string3);
                                                if (cursor2.isNull(iOooO00o20)) {
                                                    string4 = null;
                                                } else {
                                                    string4 = cursor2.getString(iOooO00o20);
                                                }
                                                userInfo.setUserHeaderFrame(string4);
                                                if (cursor2.isNull(iOooO00o21)) {
                                                    string5 = null;
                                                } else {
                                                    string5 = cursor2.getString(iOooO00o21);
                                                }
                                                userInfo.setBackground(string5);
                                                userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                if (cursor2.isNull(iOooO00o24)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = cursor2.getString(iOooO00o24);
                                                }
                                                userInfo.setBio(string6);
                                                if (cursor2.isNull(iOooO00o25)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = cursor2.getString(iOooO00o25);
                                                }
                                                userInfo.setBirthday(string7);
                                                userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                i5 = i1119;
                                                userInfo.setCountryId(cursor2.getInt(i5));
                                                iOooO00o28 = i11110;
                                                userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                i6 = iOooO00o29;
                                                if (cursor2.isNull(i6)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = cursor2.getString(i6);
                                                }
                                                userInfo.setMedal(string8);
                                                i7 = i3;
                                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                int i11111 = iOooO00o35;
                                                userInfo.setRegTime(cursor2.getInt(i11111));
                                                int i11112 = iOooO00o36;
                                                iOooO00o36 = i11112;
                                                iOooO00o35 = i11111;
                                                i8 = iOooO00o17;
                                                userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i11112) ? null : cursor2.getString(i11112)));
                                                i9 = iOooO00o37;
                                                if (cursor2.getInt(i9) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                userInfo.setPremium(z);
                                                iOooO00o37 = i9;
                                                i10 = iOooO00o38;
                                                userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                i11 = iOooO00o40;
                                                userInfo.setVipLevel(cursor2.getInt(i11));
                                                i12 = iOooO00o41;
                                                if (cursor2.getInt(i12) != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                userInfo.setShowVIP(z2);
                                            }
                                        } else {
                                            i = i;
                                            iOooO00o28 = iOooO00o28;
                                            i4 = iOooO00o13;
                                            i5 = iOooO00o27;
                                            conversation2 = conversation;
                                            userInfo = new UserInfo();
                                            int i11113 = i5;
                                            int i11114 = iOooO00o28;
                                            userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                            if (cursor2.isNull(i3)) {
                                                string = null;
                                            } else {
                                                string = cursor2.getString(i3);
                                            }
                                            userInfo.setUserIdx(string);
                                            userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                            if (cursor2.isNull(iOooO00o18)) {
                                                string2 = null;
                                            } else {
                                                string2 = cursor2.getString(iOooO00o18);
                                            }
                                            userInfo.setUserName(string2);
                                            if (cursor2.isNull(iOooO00o19)) {
                                                string3 = null;
                                            } else {
                                                string3 = cursor2.getString(iOooO00o19);
                                            }
                                            userInfo.setUserHeader(string3);
                                            if (cursor2.isNull(iOooO00o20)) {
                                                string4 = null;
                                            } else {
                                                string4 = cursor2.getString(iOooO00o20);
                                            }
                                            userInfo.setUserHeaderFrame(string4);
                                            if (cursor2.isNull(iOooO00o21)) {
                                                string5 = null;
                                            } else {
                                                string5 = cursor2.getString(iOooO00o21);
                                            }
                                            userInfo.setBackground(string5);
                                            userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                            userInfo.setSex(cursor2.getInt(iOooO00o23));
                                            if (cursor2.isNull(iOooO00o24)) {
                                                string6 = null;
                                            } else {
                                                string6 = cursor2.getString(iOooO00o24);
                                            }
                                            userInfo.setBio(string6);
                                            if (cursor2.isNull(iOooO00o25)) {
                                                string7 = null;
                                            } else {
                                                string7 = cursor2.getString(iOooO00o25);
                                            }
                                            userInfo.setBirthday(string7);
                                            userInfo.setAge(cursor2.getInt(iOooO00o26));
                                            i5 = i11113;
                                            userInfo.setCountryId(cursor2.getInt(i5));
                                            iOooO00o28 = i11114;
                                            userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                            i6 = iOooO00o29;
                                            if (cursor2.isNull(i6)) {
                                                string8 = null;
                                            } else {
                                                string8 = cursor2.getString(i6);
                                            }
                                            userInfo.setMedal(string8);
                                            i7 = i3;
                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                            userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                            userInfo.setRole(cursor2.getInt(iOooO00o34));
                                            int i11115 = iOooO00o35;
                                            userInfo.setRegTime(cursor2.getInt(i11115));
                                            int i11116 = iOooO00o36;
                                            iOooO00o36 = i11116;
                                            iOooO00o35 = i11115;
                                            i8 = iOooO00o17;
                                            userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i11116) ? null : cursor2.getString(i11116)));
                                            i9 = iOooO00o37;
                                            if (cursor2.getInt(i9) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            userInfo.setPremium(z);
                                            iOooO00o37 = i9;
                                            i10 = iOooO00o38;
                                            userInfo.setPremiumLevel(cursor2.getInt(i10));
                                            userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                            i11 = iOooO00o40;
                                            userInfo.setVipLevel(cursor2.getInt(i11));
                                            i12 = iOooO00o41;
                                            if (cursor2.getInt(i12) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            userInfo.setShowVIP(z2);
                                        }
                                    } else {
                                        i = i;
                                        iOooO00o28 = iOooO00o28;
                                        i4 = iOooO00o13;
                                        i5 = iOooO00o27;
                                        conversation2 = conversation;
                                        userInfo = new UserInfo();
                                        int i11117 = i5;
                                        int i11118 = iOooO00o28;
                                        userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                        if (cursor2.isNull(i3)) {
                                            string = null;
                                        } else {
                                            string = cursor2.getString(i3);
                                        }
                                        userInfo.setUserIdx(string);
                                        userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                        if (cursor2.isNull(iOooO00o18)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursor2.getString(iOooO00o18);
                                        }
                                        userInfo.setUserName(string2);
                                        if (cursor2.isNull(iOooO00o19)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursor2.getString(iOooO00o19);
                                        }
                                        userInfo.setUserHeader(string3);
                                        if (cursor2.isNull(iOooO00o20)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursor2.getString(iOooO00o20);
                                        }
                                        userInfo.setUserHeaderFrame(string4);
                                        if (cursor2.isNull(iOooO00o21)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursor2.getString(iOooO00o21);
                                        }
                                        userInfo.setBackground(string5);
                                        userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                        userInfo.setSex(cursor2.getInt(iOooO00o23));
                                        if (cursor2.isNull(iOooO00o24)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursor2.getString(iOooO00o24);
                                        }
                                        userInfo.setBio(string6);
                                        if (cursor2.isNull(iOooO00o25)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursor2.getString(iOooO00o25);
                                        }
                                        userInfo.setBirthday(string7);
                                        userInfo.setAge(cursor2.getInt(iOooO00o26));
                                        i5 = i11117;
                                        userInfo.setCountryId(cursor2.getInt(i5));
                                        iOooO00o28 = i11118;
                                        userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                        i6 = iOooO00o29;
                                        if (cursor2.isNull(i6)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursor2.getString(i6);
                                        }
                                        userInfo.setMedal(string8);
                                        i7 = i3;
                                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                        userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                        userInfo.setRole(cursor2.getInt(iOooO00o34));
                                        int i11119 = iOooO00o35;
                                        userInfo.setRegTime(cursor2.getInt(i11119));
                                        int i111110 = iOooO00o36;
                                        iOooO00o36 = i111110;
                                        iOooO00o35 = i11119;
                                        i8 = iOooO00o17;
                                        userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i111110) ? null : cursor2.getString(i111110)));
                                        i9 = iOooO00o37;
                                        if (cursor2.getInt(i9) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        userInfo.setPremium(z);
                                        iOooO00o37 = i9;
                                        i10 = iOooO00o38;
                                        userInfo.setPremiumLevel(cursor2.getInt(i10));
                                        userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                        i11 = iOooO00o40;
                                        userInfo.setVipLevel(cursor2.getInt(i11));
                                        i12 = iOooO00o41;
                                        if (cursor2.getInt(i12) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        userInfo.setShowVIP(z2);
                                    }
                                } else {
                                    i = i;
                                    iOooO00o28 = iOooO00o28;
                                    i4 = iOooO00o13;
                                    i5 = iOooO00o27;
                                    conversation2 = conversation;
                                    userInfo = new UserInfo();
                                    int i111111 = i5;
                                    int i111112 = iOooO00o28;
                                    userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                    if (cursor2.isNull(i3)) {
                                        string = null;
                                    } else {
                                        string = cursor2.getString(i3);
                                    }
                                    userInfo.setUserIdx(string);
                                    userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                    if (cursor2.isNull(iOooO00o18)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursor2.getString(iOooO00o18);
                                    }
                                    userInfo.setUserName(string2);
                                    if (cursor2.isNull(iOooO00o19)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursor2.getString(iOooO00o19);
                                    }
                                    userInfo.setUserHeader(string3);
                                    if (cursor2.isNull(iOooO00o20)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursor2.getString(iOooO00o20);
                                    }
                                    userInfo.setUserHeaderFrame(string4);
                                    if (cursor2.isNull(iOooO00o21)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursor2.getString(iOooO00o21);
                                    }
                                    userInfo.setBackground(string5);
                                    userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                    userInfo.setSex(cursor2.getInt(iOooO00o23));
                                    if (cursor2.isNull(iOooO00o24)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursor2.getString(iOooO00o24);
                                    }
                                    userInfo.setBio(string6);
                                    if (cursor2.isNull(iOooO00o25)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursor2.getString(iOooO00o25);
                                    }
                                    userInfo.setBirthday(string7);
                                    userInfo.setAge(cursor2.getInt(iOooO00o26));
                                    i5 = i111111;
                                    userInfo.setCountryId(cursor2.getInt(i5));
                                    iOooO00o28 = i111112;
                                    userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                    i6 = iOooO00o29;
                                    if (cursor2.isNull(i6)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursor2.getString(i6);
                                    }
                                    userInfo.setMedal(string8);
                                    i7 = i3;
                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                    userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                    userInfo.setRole(cursor2.getInt(iOooO00o34));
                                    int i111113 = iOooO00o35;
                                    userInfo.setRegTime(cursor2.getInt(i111113));
                                    int i111114 = iOooO00o36;
                                    iOooO00o36 = i111114;
                                    iOooO00o35 = i111113;
                                    i8 = iOooO00o17;
                                    userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i111114) ? null : cursor2.getString(i111114)));
                                    i9 = iOooO00o37;
                                    if (cursor2.getInt(i9) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    userInfo.setPremium(z);
                                    iOooO00o37 = i9;
                                    i10 = iOooO00o38;
                                    userInfo.setPremiumLevel(cursor2.getInt(i10));
                                    userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                    i11 = iOooO00o40;
                                    userInfo.setVipLevel(cursor2.getInt(i11));
                                    i12 = iOooO00o41;
                                    if (cursor2.getInt(i12) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    userInfo.setShowVIP(z2);
                                }
                            } else {
                                i = i;
                                iOooO00o28 = iOooO00o28;
                                i4 = iOooO00o13;
                                i5 = iOooO00o27;
                                conversation2 = conversation;
                                userInfo = new UserInfo();
                                int i111115 = i5;
                                int i111116 = iOooO00o28;
                                userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                if (cursor2.isNull(i3)) {
                                    string = null;
                                } else {
                                    string = cursor2.getString(i3);
                                }
                                userInfo.setUserIdx(string);
                                userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                if (cursor2.isNull(iOooO00o18)) {
                                    string2 = null;
                                } else {
                                    string2 = cursor2.getString(iOooO00o18);
                                }
                                userInfo.setUserName(string2);
                                if (cursor2.isNull(iOooO00o19)) {
                                    string3 = null;
                                } else {
                                    string3 = cursor2.getString(iOooO00o19);
                                }
                                userInfo.setUserHeader(string3);
                                if (cursor2.isNull(iOooO00o20)) {
                                    string4 = null;
                                } else {
                                    string4 = cursor2.getString(iOooO00o20);
                                }
                                userInfo.setUserHeaderFrame(string4);
                                if (cursor2.isNull(iOooO00o21)) {
                                    string5 = null;
                                } else {
                                    string5 = cursor2.getString(iOooO00o21);
                                }
                                userInfo.setBackground(string5);
                                userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                userInfo.setSex(cursor2.getInt(iOooO00o23));
                                if (cursor2.isNull(iOooO00o24)) {
                                    string6 = null;
                                } else {
                                    string6 = cursor2.getString(iOooO00o24);
                                }
                                userInfo.setBio(string6);
                                if (cursor2.isNull(iOooO00o25)) {
                                    string7 = null;
                                } else {
                                    string7 = cursor2.getString(iOooO00o25);
                                }
                                userInfo.setBirthday(string7);
                                userInfo.setAge(cursor2.getInt(iOooO00o26));
                                i5 = i111115;
                                userInfo.setCountryId(cursor2.getInt(i5));
                                iOooO00o28 = i111116;
                                userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                i6 = iOooO00o29;
                                if (cursor2.isNull(i6)) {
                                    string8 = null;
                                } else {
                                    string8 = cursor2.getString(i6);
                                }
                                userInfo.setMedal(string8);
                                i7 = i3;
                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                userInfo.setRole(cursor2.getInt(iOooO00o34));
                                int i111117 = iOooO00o35;
                                userInfo.setRegTime(cursor2.getInt(i111117));
                                int i111118 = iOooO00o36;
                                iOooO00o36 = i111118;
                                iOooO00o35 = i111117;
                                i8 = iOooO00o17;
                                userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i111118) ? null : cursor2.getString(i111118)));
                                i9 = iOooO00o37;
                                if (cursor2.getInt(i9) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                userInfo.setPremium(z);
                                iOooO00o37 = i9;
                                i10 = iOooO00o38;
                                userInfo.setPremiumLevel(cursor2.getInt(i10));
                                userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                i11 = iOooO00o40;
                                userInfo.setVipLevel(cursor2.getInt(i11));
                                i12 = iOooO00o41;
                                if (cursor2.getInt(i12) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                userInfo.setShowVIP(z2);
                            }
                        }
                        iOooO00o41 = i12;
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(new ConversationWithUser(conversation2, userInfo));
                        cursor2 = cursor;
                        arrayList = arrayList2;
                        iOooO00o40 = i11;
                        iOooO00o38 = i10;
                        iOooO00o27 = i5;
                        iOooO00o2 = i2;
                        iOooO00o3 = iOooO00o3;
                        iOooO00o13 = i4;
                        iOooO00o15 = iOooO00o15;
                        iOooO00o16 = i7;
                        iOooO00o = iOooO00o;
                        i13 = i;
                        iOooO00o29 = i6;
                        iOooO00o26 = iOooO00o26;
                        iOooO00o28 = iOooO00o28;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o25 = iOooO00o25;
                        iOooO00o11 = iOooO00o11;
                        iOooO00o24 = iOooO00o24;
                        iOooO00o10 = iOooO00o10;
                        iOooO00o23 = iOooO00o23;
                        iOooO00o9 = iOooO00o9;
                        iOooO00o22 = iOooO00o22;
                        iOooO00o8 = iOooO00o8;
                        iOooO00o21 = iOooO00o21;
                        iOooO00o7 = iOooO00o7;
                        iOooO00o20 = iOooO00o20;
                        iOooO00o6 = iOooO00o6;
                        iOooO00o19 = iOooO00o19;
                        iOooO00o5 = iOooO00o5;
                        iOooO00o18 = iOooO00o18;
                        iOooO00o4 = iOooO00o4;
                        iOooO00o17 = i8;
                    } else {
                        i2 = iOooO00o2;
                        i3 = iOooO00o16;
                    }
                    i4 = iOooO00o13;
                    i5 = iOooO00o27;
                    conversation2 = conversation;
                    userInfo = new UserInfo();
                    int i111119 = i5;
                    int i1111110 = iOooO00o28;
                    userInfo.setUserId(cursor2.getLong(iOooO00o15));
                    if (cursor2.isNull(i3)) {
                        string = null;
                    } else {
                        string = cursor2.getString(i3);
                    }
                    userInfo.setUserIdx(string);
                    userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                    if (cursor2.isNull(iOooO00o18)) {
                        string2 = null;
                    } else {
                        string2 = cursor2.getString(iOooO00o18);
                    }
                    userInfo.setUserName(string2);
                    if (cursor2.isNull(iOooO00o19)) {
                        string3 = null;
                    } else {
                        string3 = cursor2.getString(iOooO00o19);
                    }
                    userInfo.setUserHeader(string3);
                    if (cursor2.isNull(iOooO00o20)) {
                        string4 = null;
                    } else {
                        string4 = cursor2.getString(iOooO00o20);
                    }
                    userInfo.setUserHeaderFrame(string4);
                    if (cursor2.isNull(iOooO00o21)) {
                        string5 = null;
                    } else {
                        string5 = cursor2.getString(iOooO00o21);
                    }
                    userInfo.setBackground(string5);
                    userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                    userInfo.setSex(cursor2.getInt(iOooO00o23));
                    if (cursor2.isNull(iOooO00o24)) {
                        string6 = null;
                    } else {
                        string6 = cursor2.getString(iOooO00o24);
                    }
                    userInfo.setBio(string6);
                    if (cursor2.isNull(iOooO00o25)) {
                        string7 = null;
                    } else {
                        string7 = cursor2.getString(iOooO00o25);
                    }
                    userInfo.setBirthday(string7);
                    userInfo.setAge(cursor2.getInt(iOooO00o26));
                    i5 = i111119;
                    userInfo.setCountryId(cursor2.getInt(i5));
                    iOooO00o28 = i1111110;
                    userInfo.setRegion(cursor2.getInt(iOooO00o28));
                    i6 = iOooO00o29;
                    if (cursor2.isNull(i6)) {
                        string8 = null;
                    } else {
                        string8 = cursor2.getString(i6);
                    }
                    userInfo.setMedal(string8);
                    i7 = i3;
                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                    userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                    userInfo.setRole(cursor2.getInt(iOooO00o34));
                    int i1111111 = iOooO00o35;
                    userInfo.setRegTime(cursor2.getInt(i1111111));
                    int i1111112 = iOooO00o36;
                    iOooO00o36 = i1111112;
                    iOooO00o35 = i1111111;
                    i8 = iOooO00o17;
                    userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i1111112) ? null : cursor2.getString(i1111112)));
                    i9 = iOooO00o37;
                    if (cursor2.getInt(i9) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    userInfo.setPremium(z);
                    iOooO00o37 = i9;
                    i10 = iOooO00o38;
                    userInfo.setPremiumLevel(cursor2.getInt(i10));
                    userInfo.setVipState(cursor2.getInt(iOooO00o39));
                    i11 = iOooO00o40;
                    userInfo.setVipLevel(cursor2.getInt(i11));
                    i12 = iOooO00o41;
                    if (cursor2.getInt(i12) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    userInfo.setShowVIP(z2);
                    iOooO00o41 = i12;
                    ArrayList arrayList3 = arrayList;
                    arrayList3.add(new ConversationWithUser(conversation2, userInfo));
                    cursor2 = cursor;
                    arrayList = arrayList3;
                    iOooO00o40 = i11;
                    iOooO00o38 = i10;
                    iOooO00o27 = i5;
                    iOooO00o2 = i2;
                    iOooO00o3 = iOooO00o3;
                    iOooO00o13 = i4;
                    iOooO00o15 = iOooO00o15;
                    iOooO00o16 = i7;
                    iOooO00o = iOooO00o;
                    i13 = i;
                    iOooO00o29 = i6;
                    iOooO00o26 = iOooO00o26;
                    iOooO00o28 = iOooO00o28;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o25 = iOooO00o25;
                    iOooO00o11 = iOooO00o11;
                    iOooO00o24 = iOooO00o24;
                    iOooO00o10 = iOooO00o10;
                    iOooO00o23 = iOooO00o23;
                    iOooO00o9 = iOooO00o9;
                    iOooO00o22 = iOooO00o22;
                    iOooO00o8 = iOooO00o8;
                    iOooO00o21 = iOooO00o21;
                    iOooO00o7 = iOooO00o7;
                    iOooO00o20 = iOooO00o20;
                    iOooO00o6 = iOooO00o6;
                    iOooO00o19 = iOooO00o19;
                    iOooO00o5 = iOooO00o5;
                    iOooO00o18 = iOooO00o18;
                    iOooO00o4 = iOooO00o4;
                    iOooO00o17 = i8;
                } else {
                    i = i13;
                }
                conversation = new Conversation();
                int i20 = iOooO00o13;
                int i21 = i;
                conversation.setUid(cursor2.getLong(iOooO00o));
                conversation.setTargetId(cursor2.getLong(iOooO00o2));
                conversation.setMid(cursor2.isNull(iOooO00o3) ? null : cursor2.getString(iOooO00o3));
                conversation.setSendState(cursor2.getInt(iOooO00o4));
                conversation.setTitle(cursor2.isNull(iOooO00o5) ? null : cursor2.getString(iOooO00o5));
                conversation.setMessage(cursor2.isNull(iOooO00o6) ? null : cursor2.getString(iOooO00o6));
                conversation.setType(cursor2.getInt(iOooO00o7));
                conversation.setMomentType(cursor2.getInt(iOooO00o8));
                conversation.setUnReadCount(cursor2.getInt(iOooO00o9));
                conversation.setDraft(cursor2.isNull(iOooO00o10) ? null : cursor2.getString(iOooO00o10));
                conversation.setTime(cursor2.getLong(iOooO00o11));
                conversation.setTopTime(cursor2.getLong(iOooO00o12));
                iOooO00o13 = i20;
                conversation.setVoiceAndUnread(cursor2.getInt(iOooO00o13) != 0);
                i = i21;
                conversation.setAcceptMsg(cursor2.getInt(i) != 0);
                if (cursor2.isNull(iOooO00o15)) {
                    i2 = iOooO00o2;
                    i3 = iOooO00o16;
                    if (cursor2.isNull(i3)) {
                        iOooO00o3 = iOooO00o3;
                        iOooO00o17 = iOooO00o17;
                        if (cursor2.isNull(iOooO00o17)) {
                            iOooO00o4 = iOooO00o4;
                            iOooO00o18 = iOooO00o18;
                            if (cursor2.isNull(iOooO00o18)) {
                                iOooO00o5 = iOooO00o5;
                                iOooO00o19 = iOooO00o19;
                                if (cursor2.isNull(iOooO00o19)) {
                                    iOooO00o6 = iOooO00o6;
                                    iOooO00o20 = iOooO00o20;
                                    if (cursor2.isNull(iOooO00o20)) {
                                        iOooO00o7 = iOooO00o7;
                                        iOooO00o21 = iOooO00o21;
                                        if (cursor2.isNull(iOooO00o21)) {
                                            iOooO00o8 = iOooO00o8;
                                            iOooO00o22 = iOooO00o22;
                                            if (cursor2.isNull(iOooO00o22)) {
                                                iOooO00o9 = iOooO00o9;
                                                iOooO00o23 = iOooO00o23;
                                                if (cursor2.isNull(iOooO00o23)) {
                                                    iOooO00o10 = iOooO00o10;
                                                    iOooO00o24 = iOooO00o24;
                                                    if (cursor2.isNull(iOooO00o24)) {
                                                        iOooO00o11 = iOooO00o11;
                                                        iOooO00o25 = iOooO00o25;
                                                        if (cursor2.isNull(iOooO00o25)) {
                                                            iOooO00o12 = iOooO00o12;
                                                            iOooO00o26 = iOooO00o26;
                                                            if (cursor2.isNull(iOooO00o26)) {
                                                                i4 = iOooO00o13;
                                                                i5 = iOooO00o27;
                                                                i = i;
                                                                if (cursor2.isNull(i5)) {
                                                                    iOooO00o28 = iOooO00o28;
                                                                    if (cursor2.isNull(iOooO00o28)) {
                                                                        conversation2 = conversation;
                                                                        if (!cursor2.isNull(iOooO00o29)) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    conversation2 = conversation;
                                                                    iOooO00o28 = iOooO00o28;
                                                                }
                                                                userInfo = new UserInfo();
                                                                int i1111113 = i5;
                                                                int i1111114 = iOooO00o28;
                                                                userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                                if (cursor2.isNull(i3)) {
                                                                    string = null;
                                                                } else {
                                                                    string = cursor2.getString(i3);
                                                                }
                                                                userInfo.setUserIdx(string);
                                                                userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                                if (cursor2.isNull(iOooO00o18)) {
                                                                    string2 = null;
                                                                } else {
                                                                    string2 = cursor2.getString(iOooO00o18);
                                                                }
                                                                userInfo.setUserName(string2);
                                                                if (cursor2.isNull(iOooO00o19)) {
                                                                    string3 = null;
                                                                } else {
                                                                    string3 = cursor2.getString(iOooO00o19);
                                                                }
                                                                userInfo.setUserHeader(string3);
                                                                if (cursor2.isNull(iOooO00o20)) {
                                                                    string4 = null;
                                                                } else {
                                                                    string4 = cursor2.getString(iOooO00o20);
                                                                }
                                                                userInfo.setUserHeaderFrame(string4);
                                                                if (cursor2.isNull(iOooO00o21)) {
                                                                    string5 = null;
                                                                } else {
                                                                    string5 = cursor2.getString(iOooO00o21);
                                                                }
                                                                userInfo.setBackground(string5);
                                                                userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                                userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                                if (cursor2.isNull(iOooO00o24)) {
                                                                    string6 = null;
                                                                } else {
                                                                    string6 = cursor2.getString(iOooO00o24);
                                                                }
                                                                userInfo.setBio(string6);
                                                                if (cursor2.isNull(iOooO00o25)) {
                                                                    string7 = null;
                                                                } else {
                                                                    string7 = cursor2.getString(iOooO00o25);
                                                                }
                                                                userInfo.setBirthday(string7);
                                                                userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                                i5 = i1111113;
                                                                userInfo.setCountryId(cursor2.getInt(i5));
                                                                iOooO00o28 = i1111114;
                                                                userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                                i6 = iOooO00o29;
                                                                if (cursor2.isNull(i6)) {
                                                                    string8 = null;
                                                                } else {
                                                                    string8 = cursor2.getString(i6);
                                                                }
                                                                userInfo.setMedal(string8);
                                                                i7 = i3;
                                                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                                userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                                userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                                int i1111115 = iOooO00o35;
                                                                userInfo.setRegTime(cursor2.getInt(i1111115));
                                                                int i1111116 = iOooO00o36;
                                                                iOooO00o36 = i1111116;
                                                                iOooO00o35 = i1111115;
                                                                i8 = iOooO00o17;
                                                                userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i1111116) ? null : cursor2.getString(i1111116)));
                                                                i9 = iOooO00o37;
                                                                if (cursor2.getInt(i9) != 0) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                userInfo.setPremium(z);
                                                                iOooO00o37 = i9;
                                                                i10 = iOooO00o38;
                                                                userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                                userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                                i11 = iOooO00o40;
                                                                userInfo.setVipLevel(cursor2.getInt(i11));
                                                                i12 = iOooO00o41;
                                                                if (cursor2.getInt(i12) != 0) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                userInfo.setShowVIP(z2);
                                                            } else {
                                                                i4 = iOooO00o13;
                                                                i = i;
                                                                i5 = iOooO00o27;
                                                                iOooO00o28 = iOooO00o28;
                                                            }
                                                            conversation2 = conversation;
                                                            userInfo = new UserInfo();
                                                            int i1111117 = i5;
                                                            int i1111118 = iOooO00o28;
                                                            userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                            if (cursor2.isNull(i3)) {
                                                                string = null;
                                                            } else {
                                                                string = cursor2.getString(i3);
                                                            }
                                                            userInfo.setUserIdx(string);
                                                            userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                            if (cursor2.isNull(iOooO00o18)) {
                                                                string2 = null;
                                                            } else {
                                                                string2 = cursor2.getString(iOooO00o18);
                                                            }
                                                            userInfo.setUserName(string2);
                                                            if (cursor2.isNull(iOooO00o19)) {
                                                                string3 = null;
                                                            } else {
                                                                string3 = cursor2.getString(iOooO00o19);
                                                            }
                                                            userInfo.setUserHeader(string3);
                                                            if (cursor2.isNull(iOooO00o20)) {
                                                                string4 = null;
                                                            } else {
                                                                string4 = cursor2.getString(iOooO00o20);
                                                            }
                                                            userInfo.setUserHeaderFrame(string4);
                                                            if (cursor2.isNull(iOooO00o21)) {
                                                                string5 = null;
                                                            } else {
                                                                string5 = cursor2.getString(iOooO00o21);
                                                            }
                                                            userInfo.setBackground(string5);
                                                            userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                            userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                            if (cursor2.isNull(iOooO00o24)) {
                                                                string6 = null;
                                                            } else {
                                                                string6 = cursor2.getString(iOooO00o24);
                                                            }
                                                            userInfo.setBio(string6);
                                                            if (cursor2.isNull(iOooO00o25)) {
                                                                string7 = null;
                                                            } else {
                                                                string7 = cursor2.getString(iOooO00o25);
                                                            }
                                                            userInfo.setBirthday(string7);
                                                            userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                            i5 = i1111117;
                                                            userInfo.setCountryId(cursor2.getInt(i5));
                                                            iOooO00o28 = i1111118;
                                                            userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                            i6 = iOooO00o29;
                                                            if (cursor2.isNull(i6)) {
                                                                string8 = null;
                                                            } else {
                                                                string8 = cursor2.getString(i6);
                                                            }
                                                            userInfo.setMedal(string8);
                                                            i7 = i3;
                                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                            userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                            userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                            int i1111119 = iOooO00o35;
                                                            userInfo.setRegTime(cursor2.getInt(i1111119));
                                                            int i11111110 = iOooO00o36;
                                                            iOooO00o36 = i11111110;
                                                            iOooO00o35 = i1111119;
                                                            i8 = iOooO00o17;
                                                            userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i11111110) ? null : cursor2.getString(i11111110)));
                                                            i9 = iOooO00o37;
                                                            if (cursor2.getInt(i9) != 0) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            userInfo.setPremium(z);
                                                            iOooO00o37 = i9;
                                                            i10 = iOooO00o38;
                                                            userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                            userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                            i11 = iOooO00o40;
                                                            userInfo.setVipLevel(cursor2.getInt(i11));
                                                            i12 = iOooO00o41;
                                                            if (cursor2.getInt(i12) != 0) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            userInfo.setShowVIP(z2);
                                                        } else {
                                                            i = i;
                                                            iOooO00o28 = iOooO00o28;
                                                            i4 = iOooO00o13;
                                                            i5 = iOooO00o27;
                                                            conversation2 = conversation;
                                                            userInfo = new UserInfo();
                                                            int i11111111 = i5;
                                                            int i11111112 = iOooO00o28;
                                                            userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                            if (cursor2.isNull(i3)) {
                                                                string = null;
                                                            } else {
                                                                string = cursor2.getString(i3);
                                                            }
                                                            userInfo.setUserIdx(string);
                                                            userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                            if (cursor2.isNull(iOooO00o18)) {
                                                                string2 = null;
                                                            } else {
                                                                string2 = cursor2.getString(iOooO00o18);
                                                            }
                                                            userInfo.setUserName(string2);
                                                            if (cursor2.isNull(iOooO00o19)) {
                                                                string3 = null;
                                                            } else {
                                                                string3 = cursor2.getString(iOooO00o19);
                                                            }
                                                            userInfo.setUserHeader(string3);
                                                            if (cursor2.isNull(iOooO00o20)) {
                                                                string4 = null;
                                                            } else {
                                                                string4 = cursor2.getString(iOooO00o20);
                                                            }
                                                            userInfo.setUserHeaderFrame(string4);
                                                            if (cursor2.isNull(iOooO00o21)) {
                                                                string5 = null;
                                                            } else {
                                                                string5 = cursor2.getString(iOooO00o21);
                                                            }
                                                            userInfo.setBackground(string5);
                                                            userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                            userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                            if (cursor2.isNull(iOooO00o24)) {
                                                                string6 = null;
                                                            } else {
                                                                string6 = cursor2.getString(iOooO00o24);
                                                            }
                                                            userInfo.setBio(string6);
                                                            if (cursor2.isNull(iOooO00o25)) {
                                                                string7 = null;
                                                            } else {
                                                                string7 = cursor2.getString(iOooO00o25);
                                                            }
                                                            userInfo.setBirthday(string7);
                                                            userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                            i5 = i11111111;
                                                            userInfo.setCountryId(cursor2.getInt(i5));
                                                            iOooO00o28 = i11111112;
                                                            userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                            i6 = iOooO00o29;
                                                            if (cursor2.isNull(i6)) {
                                                                string8 = null;
                                                            } else {
                                                                string8 = cursor2.getString(i6);
                                                            }
                                                            userInfo.setMedal(string8);
                                                            i7 = i3;
                                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                            userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                            userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                            int i11111113 = iOooO00o35;
                                                            userInfo.setRegTime(cursor2.getInt(i11111113));
                                                            int i11111114 = iOooO00o36;
                                                            iOooO00o36 = i11111114;
                                                            iOooO00o35 = i11111113;
                                                            i8 = iOooO00o17;
                                                            userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i11111114) ? null : cursor2.getString(i11111114)));
                                                            i9 = iOooO00o37;
                                                            if (cursor2.getInt(i9) != 0) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            userInfo.setPremium(z);
                                                            iOooO00o37 = i9;
                                                            i10 = iOooO00o38;
                                                            userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                            userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                            i11 = iOooO00o40;
                                                            userInfo.setVipLevel(cursor2.getInt(i11));
                                                            i12 = iOooO00o41;
                                                            if (cursor2.getInt(i12) != 0) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            userInfo.setShowVIP(z2);
                                                        }
                                                    } else {
                                                        i = i;
                                                        iOooO00o28 = iOooO00o28;
                                                        i4 = iOooO00o13;
                                                        i5 = iOooO00o27;
                                                        conversation2 = conversation;
                                                        userInfo = new UserInfo();
                                                        int i11111115 = i5;
                                                        int i11111116 = iOooO00o28;
                                                        userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                        if (cursor2.isNull(i3)) {
                                                            string = null;
                                                        } else {
                                                            string = cursor2.getString(i3);
                                                        }
                                                        userInfo.setUserIdx(string);
                                                        userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                        if (cursor2.isNull(iOooO00o18)) {
                                                            string2 = null;
                                                        } else {
                                                            string2 = cursor2.getString(iOooO00o18);
                                                        }
                                                        userInfo.setUserName(string2);
                                                        if (cursor2.isNull(iOooO00o19)) {
                                                            string3 = null;
                                                        } else {
                                                            string3 = cursor2.getString(iOooO00o19);
                                                        }
                                                        userInfo.setUserHeader(string3);
                                                        if (cursor2.isNull(iOooO00o20)) {
                                                            string4 = null;
                                                        } else {
                                                            string4 = cursor2.getString(iOooO00o20);
                                                        }
                                                        userInfo.setUserHeaderFrame(string4);
                                                        if (cursor2.isNull(iOooO00o21)) {
                                                            string5 = null;
                                                        } else {
                                                            string5 = cursor2.getString(iOooO00o21);
                                                        }
                                                        userInfo.setBackground(string5);
                                                        userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                        userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                        if (cursor2.isNull(iOooO00o24)) {
                                                            string6 = null;
                                                        } else {
                                                            string6 = cursor2.getString(iOooO00o24);
                                                        }
                                                        userInfo.setBio(string6);
                                                        if (cursor2.isNull(iOooO00o25)) {
                                                            string7 = null;
                                                        } else {
                                                            string7 = cursor2.getString(iOooO00o25);
                                                        }
                                                        userInfo.setBirthday(string7);
                                                        userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                        i5 = i11111115;
                                                        userInfo.setCountryId(cursor2.getInt(i5));
                                                        iOooO00o28 = i11111116;
                                                        userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                        i6 = iOooO00o29;
                                                        if (cursor2.isNull(i6)) {
                                                            string8 = null;
                                                        } else {
                                                            string8 = cursor2.getString(i6);
                                                        }
                                                        userInfo.setMedal(string8);
                                                        i7 = i3;
                                                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                        userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                        userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                        int i11111117 = iOooO00o35;
                                                        userInfo.setRegTime(cursor2.getInt(i11111117));
                                                        int i11111118 = iOooO00o36;
                                                        iOooO00o36 = i11111118;
                                                        iOooO00o35 = i11111117;
                                                        i8 = iOooO00o17;
                                                        userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i11111118) ? null : cursor2.getString(i11111118)));
                                                        i9 = iOooO00o37;
                                                        if (cursor2.getInt(i9) != 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        userInfo.setPremium(z);
                                                        iOooO00o37 = i9;
                                                        i10 = iOooO00o38;
                                                        userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                        userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                        i11 = iOooO00o40;
                                                        userInfo.setVipLevel(cursor2.getInt(i11));
                                                        i12 = iOooO00o41;
                                                        if (cursor2.getInt(i12) != 0) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        userInfo.setShowVIP(z2);
                                                    }
                                                } else {
                                                    i = i;
                                                    iOooO00o28 = iOooO00o28;
                                                    i4 = iOooO00o13;
                                                    i5 = iOooO00o27;
                                                    conversation2 = conversation;
                                                    userInfo = new UserInfo();
                                                    int i11111119 = i5;
                                                    int i111111110 = iOooO00o28;
                                                    userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                    if (cursor2.isNull(i3)) {
                                                        string = null;
                                                    } else {
                                                        string = cursor2.getString(i3);
                                                    }
                                                    userInfo.setUserIdx(string);
                                                    userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                    if (cursor2.isNull(iOooO00o18)) {
                                                        string2 = null;
                                                    } else {
                                                        string2 = cursor2.getString(iOooO00o18);
                                                    }
                                                    userInfo.setUserName(string2);
                                                    if (cursor2.isNull(iOooO00o19)) {
                                                        string3 = null;
                                                    } else {
                                                        string3 = cursor2.getString(iOooO00o19);
                                                    }
                                                    userInfo.setUserHeader(string3);
                                                    if (cursor2.isNull(iOooO00o20)) {
                                                        string4 = null;
                                                    } else {
                                                        string4 = cursor2.getString(iOooO00o20);
                                                    }
                                                    userInfo.setUserHeaderFrame(string4);
                                                    if (cursor2.isNull(iOooO00o21)) {
                                                        string5 = null;
                                                    } else {
                                                        string5 = cursor2.getString(iOooO00o21);
                                                    }
                                                    userInfo.setBackground(string5);
                                                    userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                    userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                    if (cursor2.isNull(iOooO00o24)) {
                                                        string6 = null;
                                                    } else {
                                                        string6 = cursor2.getString(iOooO00o24);
                                                    }
                                                    userInfo.setBio(string6);
                                                    if (cursor2.isNull(iOooO00o25)) {
                                                        string7 = null;
                                                    } else {
                                                        string7 = cursor2.getString(iOooO00o25);
                                                    }
                                                    userInfo.setBirthday(string7);
                                                    userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                    i5 = i11111119;
                                                    userInfo.setCountryId(cursor2.getInt(i5));
                                                    iOooO00o28 = i111111110;
                                                    userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                    i6 = iOooO00o29;
                                                    if (cursor2.isNull(i6)) {
                                                        string8 = null;
                                                    } else {
                                                        string8 = cursor2.getString(i6);
                                                    }
                                                    userInfo.setMedal(string8);
                                                    i7 = i3;
                                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                    userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                    userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                    int i111111111 = iOooO00o35;
                                                    userInfo.setRegTime(cursor2.getInt(i111111111));
                                                    int i111111112 = iOooO00o36;
                                                    iOooO00o36 = i111111112;
                                                    iOooO00o35 = i111111111;
                                                    i8 = iOooO00o17;
                                                    userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i111111112) ? null : cursor2.getString(i111111112)));
                                                    i9 = iOooO00o37;
                                                    if (cursor2.getInt(i9) != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    userInfo.setPremium(z);
                                                    iOooO00o37 = i9;
                                                    i10 = iOooO00o38;
                                                    userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                    userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                    i11 = iOooO00o40;
                                                    userInfo.setVipLevel(cursor2.getInt(i11));
                                                    i12 = iOooO00o41;
                                                    if (cursor2.getInt(i12) != 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    userInfo.setShowVIP(z2);
                                                }
                                            } else {
                                                i = i;
                                                iOooO00o28 = iOooO00o28;
                                                i4 = iOooO00o13;
                                                i5 = iOooO00o27;
                                                conversation2 = conversation;
                                                userInfo = new UserInfo();
                                                int i111111113 = i5;
                                                int i111111114 = iOooO00o28;
                                                userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                                if (cursor2.isNull(i3)) {
                                                    string = null;
                                                } else {
                                                    string = cursor2.getString(i3);
                                                }
                                                userInfo.setUserIdx(string);
                                                userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                                if (cursor2.isNull(iOooO00o18)) {
                                                    string2 = null;
                                                } else {
                                                    string2 = cursor2.getString(iOooO00o18);
                                                }
                                                userInfo.setUserName(string2);
                                                if (cursor2.isNull(iOooO00o19)) {
                                                    string3 = null;
                                                } else {
                                                    string3 = cursor2.getString(iOooO00o19);
                                                }
                                                userInfo.setUserHeader(string3);
                                                if (cursor2.isNull(iOooO00o20)) {
                                                    string4 = null;
                                                } else {
                                                    string4 = cursor2.getString(iOooO00o20);
                                                }
                                                userInfo.setUserHeaderFrame(string4);
                                                if (cursor2.isNull(iOooO00o21)) {
                                                    string5 = null;
                                                } else {
                                                    string5 = cursor2.getString(iOooO00o21);
                                                }
                                                userInfo.setBackground(string5);
                                                userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                                userInfo.setSex(cursor2.getInt(iOooO00o23));
                                                if (cursor2.isNull(iOooO00o24)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = cursor2.getString(iOooO00o24);
                                                }
                                                userInfo.setBio(string6);
                                                if (cursor2.isNull(iOooO00o25)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = cursor2.getString(iOooO00o25);
                                                }
                                                userInfo.setBirthday(string7);
                                                userInfo.setAge(cursor2.getInt(iOooO00o26));
                                                i5 = i111111113;
                                                userInfo.setCountryId(cursor2.getInt(i5));
                                                iOooO00o28 = i111111114;
                                                userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                                i6 = iOooO00o29;
                                                if (cursor2.isNull(i6)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = cursor2.getString(i6);
                                                }
                                                userInfo.setMedal(string8);
                                                i7 = i3;
                                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                                userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                                userInfo.setRole(cursor2.getInt(iOooO00o34));
                                                int i111111115 = iOooO00o35;
                                                userInfo.setRegTime(cursor2.getInt(i111111115));
                                                int i111111116 = iOooO00o36;
                                                iOooO00o36 = i111111116;
                                                iOooO00o35 = i111111115;
                                                i8 = iOooO00o17;
                                                userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i111111116) ? null : cursor2.getString(i111111116)));
                                                i9 = iOooO00o37;
                                                if (cursor2.getInt(i9) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                userInfo.setPremium(z);
                                                iOooO00o37 = i9;
                                                i10 = iOooO00o38;
                                                userInfo.setPremiumLevel(cursor2.getInt(i10));
                                                userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                                i11 = iOooO00o40;
                                                userInfo.setVipLevel(cursor2.getInt(i11));
                                                i12 = iOooO00o41;
                                                if (cursor2.getInt(i12) != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                userInfo.setShowVIP(z2);
                                            }
                                        } else {
                                            i = i;
                                            iOooO00o28 = iOooO00o28;
                                            i4 = iOooO00o13;
                                            i5 = iOooO00o27;
                                            conversation2 = conversation;
                                            userInfo = new UserInfo();
                                            int i111111117 = i5;
                                            int i111111118 = iOooO00o28;
                                            userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                            if (cursor2.isNull(i3)) {
                                                string = null;
                                            } else {
                                                string = cursor2.getString(i3);
                                            }
                                            userInfo.setUserIdx(string);
                                            userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                            if (cursor2.isNull(iOooO00o18)) {
                                                string2 = null;
                                            } else {
                                                string2 = cursor2.getString(iOooO00o18);
                                            }
                                            userInfo.setUserName(string2);
                                            if (cursor2.isNull(iOooO00o19)) {
                                                string3 = null;
                                            } else {
                                                string3 = cursor2.getString(iOooO00o19);
                                            }
                                            userInfo.setUserHeader(string3);
                                            if (cursor2.isNull(iOooO00o20)) {
                                                string4 = null;
                                            } else {
                                                string4 = cursor2.getString(iOooO00o20);
                                            }
                                            userInfo.setUserHeaderFrame(string4);
                                            if (cursor2.isNull(iOooO00o21)) {
                                                string5 = null;
                                            } else {
                                                string5 = cursor2.getString(iOooO00o21);
                                            }
                                            userInfo.setBackground(string5);
                                            userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                            userInfo.setSex(cursor2.getInt(iOooO00o23));
                                            if (cursor2.isNull(iOooO00o24)) {
                                                string6 = null;
                                            } else {
                                                string6 = cursor2.getString(iOooO00o24);
                                            }
                                            userInfo.setBio(string6);
                                            if (cursor2.isNull(iOooO00o25)) {
                                                string7 = null;
                                            } else {
                                                string7 = cursor2.getString(iOooO00o25);
                                            }
                                            userInfo.setBirthday(string7);
                                            userInfo.setAge(cursor2.getInt(iOooO00o26));
                                            i5 = i111111117;
                                            userInfo.setCountryId(cursor2.getInt(i5));
                                            iOooO00o28 = i111111118;
                                            userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                            i6 = iOooO00o29;
                                            if (cursor2.isNull(i6)) {
                                                string8 = null;
                                            } else {
                                                string8 = cursor2.getString(i6);
                                            }
                                            userInfo.setMedal(string8);
                                            i7 = i3;
                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                            userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                            userInfo.setRole(cursor2.getInt(iOooO00o34));
                                            int i111111119 = iOooO00o35;
                                            userInfo.setRegTime(cursor2.getInt(i111111119));
                                            int i1111111110 = iOooO00o36;
                                            iOooO00o36 = i1111111110;
                                            iOooO00o35 = i111111119;
                                            i8 = iOooO00o17;
                                            userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i1111111110) ? null : cursor2.getString(i1111111110)));
                                            i9 = iOooO00o37;
                                            if (cursor2.getInt(i9) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            userInfo.setPremium(z);
                                            iOooO00o37 = i9;
                                            i10 = iOooO00o38;
                                            userInfo.setPremiumLevel(cursor2.getInt(i10));
                                            userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                            i11 = iOooO00o40;
                                            userInfo.setVipLevel(cursor2.getInt(i11));
                                            i12 = iOooO00o41;
                                            if (cursor2.getInt(i12) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            userInfo.setShowVIP(z2);
                                        }
                                    } else {
                                        i = i;
                                        iOooO00o28 = iOooO00o28;
                                        i4 = iOooO00o13;
                                        i5 = iOooO00o27;
                                        conversation2 = conversation;
                                        userInfo = new UserInfo();
                                        int i1111111111 = i5;
                                        int i1111111112 = iOooO00o28;
                                        userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                        if (cursor2.isNull(i3)) {
                                            string = null;
                                        } else {
                                            string = cursor2.getString(i3);
                                        }
                                        userInfo.setUserIdx(string);
                                        userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                        if (cursor2.isNull(iOooO00o18)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursor2.getString(iOooO00o18);
                                        }
                                        userInfo.setUserName(string2);
                                        if (cursor2.isNull(iOooO00o19)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursor2.getString(iOooO00o19);
                                        }
                                        userInfo.setUserHeader(string3);
                                        if (cursor2.isNull(iOooO00o20)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursor2.getString(iOooO00o20);
                                        }
                                        userInfo.setUserHeaderFrame(string4);
                                        if (cursor2.isNull(iOooO00o21)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursor2.getString(iOooO00o21);
                                        }
                                        userInfo.setBackground(string5);
                                        userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                        userInfo.setSex(cursor2.getInt(iOooO00o23));
                                        if (cursor2.isNull(iOooO00o24)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursor2.getString(iOooO00o24);
                                        }
                                        userInfo.setBio(string6);
                                        if (cursor2.isNull(iOooO00o25)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursor2.getString(iOooO00o25);
                                        }
                                        userInfo.setBirthday(string7);
                                        userInfo.setAge(cursor2.getInt(iOooO00o26));
                                        i5 = i1111111111;
                                        userInfo.setCountryId(cursor2.getInt(i5));
                                        iOooO00o28 = i1111111112;
                                        userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                        i6 = iOooO00o29;
                                        if (cursor2.isNull(i6)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursor2.getString(i6);
                                        }
                                        userInfo.setMedal(string8);
                                        i7 = i3;
                                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                        userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                        userInfo.setRole(cursor2.getInt(iOooO00o34));
                                        int i1111111113 = iOooO00o35;
                                        userInfo.setRegTime(cursor2.getInt(i1111111113));
                                        int i1111111114 = iOooO00o36;
                                        iOooO00o36 = i1111111114;
                                        iOooO00o35 = i1111111113;
                                        i8 = iOooO00o17;
                                        userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i1111111114) ? null : cursor2.getString(i1111111114)));
                                        i9 = iOooO00o37;
                                        if (cursor2.getInt(i9) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        userInfo.setPremium(z);
                                        iOooO00o37 = i9;
                                        i10 = iOooO00o38;
                                        userInfo.setPremiumLevel(cursor2.getInt(i10));
                                        userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                        i11 = iOooO00o40;
                                        userInfo.setVipLevel(cursor2.getInt(i11));
                                        i12 = iOooO00o41;
                                        if (cursor2.getInt(i12) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        userInfo.setShowVIP(z2);
                                    }
                                } else {
                                    i = i;
                                    iOooO00o28 = iOooO00o28;
                                    i4 = iOooO00o13;
                                    i5 = iOooO00o27;
                                    conversation2 = conversation;
                                    userInfo = new UserInfo();
                                    int i1111111115 = i5;
                                    int i1111111116 = iOooO00o28;
                                    userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                    if (cursor2.isNull(i3)) {
                                        string = null;
                                    } else {
                                        string = cursor2.getString(i3);
                                    }
                                    userInfo.setUserIdx(string);
                                    userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                    if (cursor2.isNull(iOooO00o18)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursor2.getString(iOooO00o18);
                                    }
                                    userInfo.setUserName(string2);
                                    if (cursor2.isNull(iOooO00o19)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursor2.getString(iOooO00o19);
                                    }
                                    userInfo.setUserHeader(string3);
                                    if (cursor2.isNull(iOooO00o20)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursor2.getString(iOooO00o20);
                                    }
                                    userInfo.setUserHeaderFrame(string4);
                                    if (cursor2.isNull(iOooO00o21)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursor2.getString(iOooO00o21);
                                    }
                                    userInfo.setBackground(string5);
                                    userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                    userInfo.setSex(cursor2.getInt(iOooO00o23));
                                    if (cursor2.isNull(iOooO00o24)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursor2.getString(iOooO00o24);
                                    }
                                    userInfo.setBio(string6);
                                    if (cursor2.isNull(iOooO00o25)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursor2.getString(iOooO00o25);
                                    }
                                    userInfo.setBirthday(string7);
                                    userInfo.setAge(cursor2.getInt(iOooO00o26));
                                    i5 = i1111111115;
                                    userInfo.setCountryId(cursor2.getInt(i5));
                                    iOooO00o28 = i1111111116;
                                    userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                    i6 = iOooO00o29;
                                    if (cursor2.isNull(i6)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursor2.getString(i6);
                                    }
                                    userInfo.setMedal(string8);
                                    i7 = i3;
                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                    userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                    userInfo.setRole(cursor2.getInt(iOooO00o34));
                                    int i1111111117 = iOooO00o35;
                                    userInfo.setRegTime(cursor2.getInt(i1111111117));
                                    int i1111111118 = iOooO00o36;
                                    iOooO00o36 = i1111111118;
                                    iOooO00o35 = i1111111117;
                                    i8 = iOooO00o17;
                                    userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i1111111118) ? null : cursor2.getString(i1111111118)));
                                    i9 = iOooO00o37;
                                    if (cursor2.getInt(i9) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    userInfo.setPremium(z);
                                    iOooO00o37 = i9;
                                    i10 = iOooO00o38;
                                    userInfo.setPremiumLevel(cursor2.getInt(i10));
                                    userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                    i11 = iOooO00o40;
                                    userInfo.setVipLevel(cursor2.getInt(i11));
                                    i12 = iOooO00o41;
                                    if (cursor2.getInt(i12) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    userInfo.setShowVIP(z2);
                                }
                            } else {
                                i = i;
                                iOooO00o28 = iOooO00o28;
                                i4 = iOooO00o13;
                                i5 = iOooO00o27;
                                conversation2 = conversation;
                                userInfo = new UserInfo();
                                int i1111111119 = i5;
                                int i11111111110 = iOooO00o28;
                                userInfo.setUserId(cursor2.getLong(iOooO00o15));
                                if (cursor2.isNull(i3)) {
                                    string = null;
                                } else {
                                    string = cursor2.getString(i3);
                                }
                                userInfo.setUserIdx(string);
                                userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                                if (cursor2.isNull(iOooO00o18)) {
                                    string2 = null;
                                } else {
                                    string2 = cursor2.getString(iOooO00o18);
                                }
                                userInfo.setUserName(string2);
                                if (cursor2.isNull(iOooO00o19)) {
                                    string3 = null;
                                } else {
                                    string3 = cursor2.getString(iOooO00o19);
                                }
                                userInfo.setUserHeader(string3);
                                if (cursor2.isNull(iOooO00o20)) {
                                    string4 = null;
                                } else {
                                    string4 = cursor2.getString(iOooO00o20);
                                }
                                userInfo.setUserHeaderFrame(string4);
                                if (cursor2.isNull(iOooO00o21)) {
                                    string5 = null;
                                } else {
                                    string5 = cursor2.getString(iOooO00o21);
                                }
                                userInfo.setBackground(string5);
                                userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                                userInfo.setSex(cursor2.getInt(iOooO00o23));
                                if (cursor2.isNull(iOooO00o24)) {
                                    string6 = null;
                                } else {
                                    string6 = cursor2.getString(iOooO00o24);
                                }
                                userInfo.setBio(string6);
                                if (cursor2.isNull(iOooO00o25)) {
                                    string7 = null;
                                } else {
                                    string7 = cursor2.getString(iOooO00o25);
                                }
                                userInfo.setBirthday(string7);
                                userInfo.setAge(cursor2.getInt(iOooO00o26));
                                i5 = i1111111119;
                                userInfo.setCountryId(cursor2.getInt(i5));
                                iOooO00o28 = i11111111110;
                                userInfo.setRegion(cursor2.getInt(iOooO00o28));
                                i6 = iOooO00o29;
                                if (cursor2.isNull(i6)) {
                                    string8 = null;
                                } else {
                                    string8 = cursor2.getString(i6);
                                }
                                userInfo.setMedal(string8);
                                i7 = i3;
                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                                userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                                userInfo.setRole(cursor2.getInt(iOooO00o34));
                                int i11111111111 = iOooO00o35;
                                userInfo.setRegTime(cursor2.getInt(i11111111111));
                                int i11111111112 = iOooO00o36;
                                iOooO00o36 = i11111111112;
                                iOooO00o35 = i11111111111;
                                i8 = iOooO00o17;
                                userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i11111111112) ? null : cursor2.getString(i11111111112)));
                                i9 = iOooO00o37;
                                if (cursor2.getInt(i9) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                userInfo.setPremium(z);
                                iOooO00o37 = i9;
                                i10 = iOooO00o38;
                                userInfo.setPremiumLevel(cursor2.getInt(i10));
                                userInfo.setVipState(cursor2.getInt(iOooO00o39));
                                i11 = iOooO00o40;
                                userInfo.setVipLevel(cursor2.getInt(i11));
                                i12 = iOooO00o41;
                                if (cursor2.getInt(i12) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                userInfo.setShowVIP(z2);
                            }
                        } else {
                            i = i;
                            iOooO00o28 = iOooO00o28;
                            i4 = iOooO00o13;
                            i5 = iOooO00o27;
                            conversation2 = conversation;
                            userInfo = new UserInfo();
                            int i11111111113 = i5;
                            int i11111111114 = iOooO00o28;
                            userInfo.setUserId(cursor2.getLong(iOooO00o15));
                            if (cursor2.isNull(i3)) {
                                string = null;
                            } else {
                                string = cursor2.getString(i3);
                            }
                            userInfo.setUserIdx(string);
                            userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                            if (cursor2.isNull(iOooO00o18)) {
                                string2 = null;
                            } else {
                                string2 = cursor2.getString(iOooO00o18);
                            }
                            userInfo.setUserName(string2);
                            if (cursor2.isNull(iOooO00o19)) {
                                string3 = null;
                            } else {
                                string3 = cursor2.getString(iOooO00o19);
                            }
                            userInfo.setUserHeader(string3);
                            if (cursor2.isNull(iOooO00o20)) {
                                string4 = null;
                            } else {
                                string4 = cursor2.getString(iOooO00o20);
                            }
                            userInfo.setUserHeaderFrame(string4);
                            if (cursor2.isNull(iOooO00o21)) {
                                string5 = null;
                            } else {
                                string5 = cursor2.getString(iOooO00o21);
                            }
                            userInfo.setBackground(string5);
                            userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                            userInfo.setSex(cursor2.getInt(iOooO00o23));
                            if (cursor2.isNull(iOooO00o24)) {
                                string6 = null;
                            } else {
                                string6 = cursor2.getString(iOooO00o24);
                            }
                            userInfo.setBio(string6);
                            if (cursor2.isNull(iOooO00o25)) {
                                string7 = null;
                            } else {
                                string7 = cursor2.getString(iOooO00o25);
                            }
                            userInfo.setBirthday(string7);
                            userInfo.setAge(cursor2.getInt(iOooO00o26));
                            i5 = i11111111113;
                            userInfo.setCountryId(cursor2.getInt(i5));
                            iOooO00o28 = i11111111114;
                            userInfo.setRegion(cursor2.getInt(iOooO00o28));
                            i6 = iOooO00o29;
                            if (cursor2.isNull(i6)) {
                                string8 = null;
                            } else {
                                string8 = cursor2.getString(i6);
                            }
                            userInfo.setMedal(string8);
                            i7 = i3;
                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                            userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                            userInfo.setRole(cursor2.getInt(iOooO00o34));
                            int i11111111115 = iOooO00o35;
                            userInfo.setRegTime(cursor2.getInt(i11111111115));
                            int i11111111116 = iOooO00o36;
                            iOooO00o36 = i11111111116;
                            iOooO00o35 = i11111111115;
                            i8 = iOooO00o17;
                            userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i11111111116) ? null : cursor2.getString(i11111111116)));
                            i9 = iOooO00o37;
                            if (cursor2.getInt(i9) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            userInfo.setPremium(z);
                            iOooO00o37 = i9;
                            i10 = iOooO00o38;
                            userInfo.setPremiumLevel(cursor2.getInt(i10));
                            userInfo.setVipState(cursor2.getInt(iOooO00o39));
                            i11 = iOooO00o40;
                            userInfo.setVipLevel(cursor2.getInt(i11));
                            i12 = iOooO00o41;
                            if (cursor2.getInt(i12) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            userInfo.setShowVIP(z2);
                        }
                    }
                    iOooO00o41 = i12;
                    ArrayList arrayList4 = arrayList;
                    arrayList4.add(new ConversationWithUser(conversation2, userInfo));
                    cursor2 = cursor;
                    arrayList = arrayList4;
                    iOooO00o40 = i11;
                    iOooO00o38 = i10;
                    iOooO00o27 = i5;
                    iOooO00o2 = i2;
                    iOooO00o3 = iOooO00o3;
                    iOooO00o13 = i4;
                    iOooO00o15 = iOooO00o15;
                    iOooO00o16 = i7;
                    iOooO00o = iOooO00o;
                    i13 = i;
                    iOooO00o29 = i6;
                    iOooO00o26 = iOooO00o26;
                    iOooO00o28 = iOooO00o28;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o25 = iOooO00o25;
                    iOooO00o11 = iOooO00o11;
                    iOooO00o24 = iOooO00o24;
                    iOooO00o10 = iOooO00o10;
                    iOooO00o23 = iOooO00o23;
                    iOooO00o9 = iOooO00o9;
                    iOooO00o22 = iOooO00o22;
                    iOooO00o8 = iOooO00o8;
                    iOooO00o21 = iOooO00o21;
                    iOooO00o7 = iOooO00o7;
                    iOooO00o20 = iOooO00o20;
                    iOooO00o6 = iOooO00o6;
                    iOooO00o19 = iOooO00o19;
                    iOooO00o5 = iOooO00o5;
                    iOooO00o18 = iOooO00o18;
                    iOooO00o4 = iOooO00o4;
                    iOooO00o17 = i8;
                } else {
                    i2 = iOooO00o2;
                    i3 = iOooO00o16;
                }
                i4 = iOooO00o13;
                i5 = iOooO00o27;
                conversation2 = conversation;
                userInfo = new UserInfo();
                int i11111111117 = i5;
                int i11111111118 = iOooO00o28;
                userInfo.setUserId(cursor2.getLong(iOooO00o15));
                if (cursor2.isNull(i3)) {
                    string = null;
                } else {
                    string = cursor2.getString(i3);
                }
                userInfo.setUserIdx(string);
                userInfo.setIdLevel(cursor2.getInt(iOooO00o17));
                if (cursor2.isNull(iOooO00o18)) {
                    string2 = null;
                } else {
                    string2 = cursor2.getString(iOooO00o18);
                }
                userInfo.setUserName(string2);
                if (cursor2.isNull(iOooO00o19)) {
                    string3 = null;
                } else {
                    string3 = cursor2.getString(iOooO00o19);
                }
                userInfo.setUserHeader(string3);
                if (cursor2.isNull(iOooO00o20)) {
                    string4 = null;
                } else {
                    string4 = cursor2.getString(iOooO00o20);
                }
                userInfo.setUserHeaderFrame(string4);
                if (cursor2.isNull(iOooO00o21)) {
                    string5 = null;
                } else {
                    string5 = cursor2.getString(iOooO00o21);
                }
                userInfo.setBackground(string5);
                userInfo.setUserLevel(cursor2.getInt(iOooO00o22));
                userInfo.setSex(cursor2.getInt(iOooO00o23));
                if (cursor2.isNull(iOooO00o24)) {
                    string6 = null;
                } else {
                    string6 = cursor2.getString(iOooO00o24);
                }
                userInfo.setBio(string6);
                if (cursor2.isNull(iOooO00o25)) {
                    string7 = null;
                } else {
                    string7 = cursor2.getString(iOooO00o25);
                }
                userInfo.setBirthday(string7);
                userInfo.setAge(cursor2.getInt(iOooO00o26));
                i5 = i11111111117;
                userInfo.setCountryId(cursor2.getInt(i5));
                iOooO00o28 = i11111111118;
                userInfo.setRegion(cursor2.getInt(iOooO00o28));
                i6 = iOooO00o29;
                if (cursor2.isNull(i6)) {
                    string8 = null;
                } else {
                    string8 = cursor2.getString(i6);
                }
                userInfo.setMedal(string8);
                i7 = i3;
                userInfo.setVisitorNum(cursor2.getInt(iOooO00o30));
                userInfo.setFollowedNum(cursor2.getInt(iOooO00o31));
                userInfo.setFansNum(cursor2.getInt(iOooO00o32));
                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o33));
                userInfo.setRole(cursor2.getInt(iOooO00o34));
                int i11111111119 = iOooO00o35;
                userInfo.setRegTime(cursor2.getInt(i11111111119));
                int i111111111110 = iOooO00o36;
                iOooO00o36 = i111111111110;
                iOooO00o35 = i11111111119;
                i8 = iOooO00o17;
                userInfo.setTags(OooOo.this.f41022OooOO0o.stringToList(cursor2.isNull(i111111111110) ? null : cursor2.getString(i111111111110)));
                i9 = iOooO00o37;
                if (cursor2.getInt(i9) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                userInfo.setPremium(z);
                iOooO00o37 = i9;
                i10 = iOooO00o38;
                userInfo.setPremiumLevel(cursor2.getInt(i10));
                userInfo.setVipState(cursor2.getInt(iOooO00o39));
                i11 = iOooO00o40;
                userInfo.setVipLevel(cursor2.getInt(i11));
                i12 = iOooO00o41;
                if (cursor2.getInt(i12) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                userInfo.setShowVIP(z2);
                iOooO00o41 = i12;
                ArrayList arrayList5 = arrayList;
                arrayList5.add(new ConversationWithUser(conversation2, userInfo));
                cursor2 = cursor;
                arrayList = arrayList5;
                iOooO00o40 = i11;
                iOooO00o38 = i10;
                iOooO00o27 = i5;
                iOooO00o2 = i2;
                iOooO00o3 = iOooO00o3;
                iOooO00o13 = i4;
                iOooO00o15 = iOooO00o15;
                iOooO00o16 = i7;
                iOooO00o = iOooO00o;
                i13 = i;
                iOooO00o29 = i6;
                iOooO00o26 = iOooO00o26;
                iOooO00o28 = iOooO00o28;
                iOooO00o12 = iOooO00o12;
                iOooO00o25 = iOooO00o25;
                iOooO00o11 = iOooO00o11;
                iOooO00o24 = iOooO00o24;
                iOooO00o10 = iOooO00o10;
                iOooO00o23 = iOooO00o23;
                iOooO00o9 = iOooO00o9;
                iOooO00o22 = iOooO00o22;
                iOooO00o8 = iOooO00o8;
                iOooO00o21 = iOooO00o21;
                iOooO00o7 = iOooO00o7;
                iOooO00o20 = iOooO00o20;
                iOooO00o6 = iOooO00o6;
                iOooO00o19 = iOooO00o19;
                iOooO00o5 = iOooO00o5;
                iOooO00o18 = iOooO00o18;
                iOooO00o4 = iOooO00o4;
                iOooO00o17 = i8;
            }
            return arrayList;
        }
    }

    public class OooOO0 extends o000OOo<Conversation> {
        public OooOO0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `ConversationTable` (`uid`,`targetId`,`mid`,`sendState`,`title`,`message`,`type`,`momentType`,`unReadCount`,`draft`,`time`,`topTime`,`isVoiceAndUnread`,`isAcceptMsg`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, Conversation conversation) {
            Conversation conversation2 = conversation;
            supportSQLiteStatement.bindLong(1, conversation2.getUid());
            supportSQLiteStatement.bindLong(2, conversation2.getTargetId());
            if (conversation2.getMid() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, conversation2.getMid());
            }
            supportSQLiteStatement.bindLong(4, conversation2.getSendState());
            if (conversation2.getTitle() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, conversation2.getTitle());
            }
            if (conversation2.getMessage() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, conversation2.getMessage());
            }
            supportSQLiteStatement.bindLong(7, conversation2.getType());
            supportSQLiteStatement.bindLong(8, conversation2.getMomentType());
            supportSQLiteStatement.bindLong(9, conversation2.getUnReadCount());
            if (conversation2.getDraft() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, conversation2.getDraft());
            }
            supportSQLiteStatement.bindLong(11, conversation2.getTime());
            supportSQLiteStatement.bindLong(12, conversation2.getTopTime());
            supportSQLiteStatement.bindLong(13, conversation2.getIsVoiceAndUnread() ? 1L : 0L);
            supportSQLiteStatement.bindLong(14, conversation2.getIsAcceptMsg() ? 1L : 0L);
        }
    }

    public class OooOO0O extends o0000OO0 {
        public OooOO0O(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update  ConversationTable set draft=? where targetId = ? and uid=?";
        }
    }

    public class OooOOO extends o0000OO0 {
        public OooOOO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update  ChatMessageTable set emoticonIsRead =? where targetId = ? and uid=? and emoticonIsRead =?";
        }
    }

    public class OooOOO0 extends o0000OO0 {
        public OooOOO0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update  ConversationTable set unReadCount=? where targetId = ? and uid=?";
        }
    }

    public class OooOOOO extends o0000OO0 {
        public OooOOOO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update  ConversationTable set isVoiceAndUnread=? where targetId = ? and uid=? and mid=?";
        }
    }

    /* JADX INFO: renamed from: o0o00O0.OooOo$OooOo, reason: collision with other inner class name */
    public class C0390OooOo extends o0000OO0 {
        public C0390OooOo(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update ConversationTable set sendState = ? where mid = ?";
        }
    }

    public class OooOo00 extends o0000OO0 {
        public OooOo00(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update ConversationTable set topTime = ? where uid=? and targetId=?";
        }
    }

    public class Oooo0 extends o0000OO0 {
        public Oooo0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update ConversationTable Set sendState = -1 Where uid = ? and sendState = 0";
        }
    }

    public class Oooo000 extends o0000OO0 {
        public Oooo000(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Delete from ConversationTable where uid = ? and targetId=?";
        }
    }

    public OooOo(RoomDatabase roomDatabase) {
        this.f41012OooO00o = roomDatabase;
        this.f41013OooO0O0 = new OooOO0(roomDatabase);
        this.f41014OooO0OO = new OooOO0O(roomDatabase);
        this.f41015OooO0Oo = new OooOOO0(roomDatabase);
        this.f41017OooO0o0 = new OooOOO(roomDatabase);
        this.f41016OooO0o = new OooOOOO(roomDatabase);
        this.f41018OooO0oO = new OooOo00(roomDatabase);
        this.f41019OooO0oo = new C0390OooOo(roomDatabase);
        this.f41011OooO = new Oooo000(roomDatabase);
        this.f41020OooOO0 = new Oooo0(roomDatabase);
        this.f41021OooOO0O = new OooO00o(roomDatabase);
    }

    @Override // p490o0o00O0.OooOo00
    public final void OooO(long j, long j2, boolean z, boolean z2) {
        this.f41012OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41017OooO0o0.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        supportSQLiteStatementOooO00o.bindLong(3, j);
        supportSQLiteStatementOooO00o.bindLong(4, z2 ? 1L : 0L);
        this.f41012OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41012OooO00o.OooOOOO();
        } finally {
            this.f41012OooO00o.OooOO0O();
            this.f41017OooO0o0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final Flow<Integer> OooO00o(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select sum(unReadCount) from ConversationTable Where uid = ?", 1);
        o0000o0OooO0o.bindLong(1, j);
        return o0Oo0oo.OooO00o(this.f41012OooO00o, new String[]{"ConversationTable"}, new OooO0O0(o0000o0OooO0o));
    }

    @Override // p490o0o00O0.OooOo00
    public final void OooO0O0(String str, int i) {
        this.f41012OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41019OooO0oo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, i);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        this.f41012OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41012OooO00o.OooOOOO();
        } finally {
            this.f41012OooO00o.OooOO0O();
            this.f41019OooO0oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final Long OooO0OO(long j, long j2) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select topTime from ConversationTable where uid = ? and targetId=?", 2);
        o0000o0OooO0o.bindLong(1, j);
        o0000o0OooO0o.bindLong(2, j2);
        this.f41012OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41012OooO00o.OooOOO(o0000o0OooO0o);
        try {
            return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : Long.valueOf(cursorOooOOO.getLong(0));
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final void OooO0Oo(long j) {
        this.f41012OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41021OooOO0O.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        this.f41012OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41012OooO00o.OooOOOO();
        } finally {
            this.f41012OooO00o.OooOO0O();
            this.f41021OooOO0O.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final void OooO0o(long j) {
        this.f41012OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41020OooOO0.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        this.f41012OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41012OooO00o.OooOOOO();
        } finally {
            this.f41012OooO00o.OooOO0O();
            this.f41020OooOO0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final void OooO0o0(long j, long j2) {
        this.f41012OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41011OooO.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        this.f41012OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41012OooO00o.OooOOOO();
        } finally {
            this.f41012OooO00o.OooOO0O();
            this.f41011OooO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final void OooO0oO(Conversation conversation) {
        this.f41012OooO00o.OooO0O0();
        this.f41012OooO00o.OooO0OO();
        try {
            this.f41013OooO0O0.OooO0oO(conversation);
            this.f41012OooO00o.OooOOOO();
        } finally {
            this.f41012OooO00o.OooOO0O();
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final o00O00o0<Integer, FriendInfo> OooO0oo(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from (FriendTable inner join UserInfoTable on FriendTable.friendId=UserInfoTable.userId)inner join ConversationTable on ConversationTable.targetId = FriendTable.friendId  Where FriendTable.uid = ? and ConversationTable.uid = ? Order by ConversationTable.topTime DESC, ConversationTable.time DESC", 2);
        o0000o0OooO0o.bindLong(1, j);
        o0000o0OooO0o.bindLong(2, j);
        return new OooO(o0000o0OooO0o, this.f41012OooO00o, "FriendTable", "UserInfoTable", "ConversationTable");
    }

    @Override // p490o0o00O0.OooOo00
    public final int OooOO0(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select count(*) from ConversationTable Where topTime > 0 and uid =? limit 5", 1);
        o0000o0OooO0o.bindLong(1, j);
        this.f41012OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41012OooO00o.OooOOO(o0000o0OooO0o);
        try {
            return cursorOooOOO.moveToFirst() ? cursorOooOOO.getInt(0) : 0;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final Flow<Conversation> OooOO0O(long j, long j2) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from ConversationTable  where targetId = ? and uid=?", 2);
        o0000o0OooO0o.bindLong(1, j2);
        o0000o0OooO0o.bindLong(2, j);
        return o0Oo0oo.OooO00o(this.f41012OooO00o, new String[]{"ConversationTable"}, new OooO0OO(o0000o0OooO0o));
    }

    @Override // p490o0o00O0.OooOo00
    public final Integer OooOO0o(long j, long j2) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select unReadCount from ConversationTable Where uid = ? and targetId=? and unReadCount > 0", 2);
        o0000o0OooO0o.bindLong(1, j);
        o0000o0OooO0o.bindLong(2, j2);
        this.f41012OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41012OooO00o.OooOOO(o0000o0OooO0o);
        try {
            return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : Integer.valueOf(cursorOooOOO.getInt(0));
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final void OooOOO(long j, long j2, int i) {
        this.f41012OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41015OooO0Oo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, i);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        supportSQLiteStatementOooO00o.bindLong(3, j);
        this.f41012OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41012OooO00o.OooOOOO();
        } finally {
            this.f41012OooO00o.OooOO0O();
            this.f41015OooO0Oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final int OooOOO0(long j, long j2, long j3) {
        this.f41012OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41018OooO0oO.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j3);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        this.f41012OooO00o.OooO0OO();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41012OooO00o.OooOOOO();
            return iExecuteUpdateDelete;
        } finally {
            this.f41012OooO00o.OooOO0O();
            this.f41018OooO0oO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final void OooOOOO(long j, long j2, String str) {
        this.f41012OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41014OooO0OO.OooO00o();
        supportSQLiteStatementOooO00o.bindString(1, str);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        supportSQLiteStatementOooO00o.bindLong(3, j);
        this.f41012OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41012OooO00o.OooOOOO();
        } finally {
            this.f41012OooO00o.OooOO0O();
            this.f41014OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.OooOo00
    public final o00O00o0<Integer, ConversationWithUser> OooOOOo(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from ConversationTable left join UserInfoTable on UserInfoTable.userId = ConversationTable.targetId Where ConversationTable.uid = ? Order by ConversationTable.topTime DESC, ConversationTable.time DESC", 1);
        o0000o0OooO0o.bindLong(1, j);
        return new OooO0o(o0000o0OooO0o, this.f41012OooO00o, "ConversationTable", "UserInfoTable");
    }

    @Override // p490o0o00O0.OooOo00
    public final void OooOOo0(long j, long j2, String str, boolean z) {
        this.f41012OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41016OooO0o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        supportSQLiteStatementOooO00o.bindLong(3, j);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(4);
        } else {
            supportSQLiteStatementOooO00o.bindString(4, str);
        }
        this.f41012OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41012OooO00o.OooOOOO();
        } finally {
            this.f41012OooO00o.OooOO0O();
            this.f41016OooO0o.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }
}
