package p490o0o00O0;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.common.db.converter.TagConverter;
import com.yalla.yalla.common.db.table.Friend;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.Flow;
import p089o000o000.o00O00o0;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;
import p091o000o00o.o0Oo0oo;
import p092o000o0O.o00O0O;
import p093o000o0O0.o000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Oooo000 f41044OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f41045OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<Friend> f41046OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O f41047OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO0 f41048OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOOOO f41049OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO f41050OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOo00 f41051OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOo f41052OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final TagConverter f41053OooOO0 = new TagConverter();

    public class OooO implements Callable<String> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41054OooO00o;

        public OooO(o0000O0 o0000o1) {
            this.f41054OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final String call() throws Exception {
            Cursor cursorOooOOO = o000oOoO.this.f41045OooO00o.OooOOO(this.f41054OooO00o);
            try {
                return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : cursorOooOOO.getString(0);
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f41054OooO00o.release();
        }
    }

    public class OooO00o implements Callable<Friend> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41056OooO00o;

        public OooO00o(o0000O0 o0000o1) {
            this.f41056OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final Friend call() throws Exception {
            Cursor cursorOooOOO = o000oOoO.this.f41045OooO00o.OooOOO(this.f41056OooO00o);
            try {
                int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
                int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "friendId");
                int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "memoName");
                int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "time");
                int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "inRoom");
                int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "deleteMark");
                int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "isCheckUserRisk");
                Friend friend = null;
                String string = null;
                if (cursorOooOOO.moveToFirst()) {
                    Friend friend2 = new Friend();
                    friend2.setUid(cursorOooOOO.getLong(iOooO00o));
                    friend2.setFriendId(cursorOooOOO.getLong(iOooO00o2));
                    if (!cursorOooOOO.isNull(iOooO00o3)) {
                        string = cursorOooOOO.getString(iOooO00o3);
                    }
                    friend2.setMemoName(string);
                    friend2.setTime(cursorOooOOO.getLong(iOooO00o4));
                    boolean z = true;
                    friend2.setInRoom(cursorOooOOO.getInt(iOooO00o5) != 0);
                    friend2.setDeleteMark(cursorOooOOO.getInt(iOooO00o6) != 0);
                    if (cursorOooOOO.getInt(iOooO00o7) == 0) {
                        z = false;
                    }
                    friend2.setCheckUserRisk(z);
                    friend = friend2;
                }
                return friend;
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f41056OooO00o.release();
        }
    }

    public class OooO0O0 extends o000O0<FriendInfo> {
        public OooO0O0(o0000O0 o0000o1, RoomDatabase roomDatabase, String... strArr) {
            super(o0000o1, roomDatabase, strArr);
        }

        /* JADX WARN: Code duplicated, block: B:119:0x0313  */
        /* JADX WARN: Code duplicated, block: B:120:0x0316  */
        /* JADX WARN: Code duplicated, block: B:123:0x032a  */
        /* JADX WARN: Code duplicated, block: B:124:0x032d  */
        /* JADX WARN: Code duplicated, block: B:127:0x033a  */
        /* JADX WARN: Code duplicated, block: B:128:0x033d  */
        /* JADX WARN: Code duplicated, block: B:131:0x034a  */
        /* JADX WARN: Code duplicated, block: B:132:0x034d  */
        /* JADX WARN: Code duplicated, block: B:135:0x035a  */
        /* JADX WARN: Code duplicated, block: B:136:0x035d  */
        /* JADX WARN: Code duplicated, block: B:139:0x0378  */
        /* JADX WARN: Code duplicated, block: B:140:0x037b  */
        /* JADX WARN: Code duplicated, block: B:143:0x0388  */
        /* JADX WARN: Code duplicated, block: B:144:0x038b  */
        /* JADX WARN: Code duplicated, block: B:147:0x03b5  */
        /* JADX WARN: Code duplicated, block: B:148:0x03ba  */
        /* JADX WARN: Code duplicated, block: B:152:0x0406  */
        /* JADX WARN: Code duplicated, block: B:155:0x0427  */
        /* JADX WARN: Code duplicated, block: B:156:0x0429  */
        /* JADX WARN: Code duplicated, block: B:159:0x0452  */
        /* JADX WARN: Code duplicated, block: B:160:0x0454  */
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
            ArrayList arrayList;
            int i15;
            Friend friend2;
            int i16;
            int i17;
            int i18;
            int i19;
            UserInfo userInfo;
            int i20;
            int i21;
            int i22;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            int i23;
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
            int i24 = iOooO00o14;
            ArrayList arrayList2 = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                if (cursor2.isNull(iOooO00o) && cursor2.isNull(iOooO00o2) && cursor2.isNull(iOooO00o3) && cursor2.isNull(iOooO00o4) && cursor2.isNull(iOooO00o5) && cursor2.isNull(iOooO00o6) && cursor2.isNull(iOooO00o7)) {
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
                }
                if (cursor2.isNull(iOooO00o8) && cursor2.isNull(iOooO00o9) && cursor2.isNull(iOooO00o10) && cursor2.isNull(iOooO00o11)) {
                    if (!cursor2.isNull(iOooO00o12)) {
                        iOooO00o12 = iOooO00o12;
                        i = iOooO00o;
                        i2 = i24;
                        iOooO00o13 = iOooO00o13;
                    } else if (cursor2.isNull(iOooO00o13)) {
                        i = iOooO00o;
                        i2 = i24;
                        if (cursor2.isNull(i2)) {
                            i3 = iOooO00o2;
                            i4 = iOooO00o15;
                            if (cursor2.isNull(i4)) {
                                i5 = iOooO00o3;
                                i6 = iOooO00o16;
                                if (cursor2.isNull(i6)) {
                                    i7 = iOooO00o4;
                                    i8 = iOooO00o17;
                                    if (cursor2.isNull(i8)) {
                                        i9 = iOooO00o5;
                                        i10 = iOooO00o18;
                                        if (cursor2.isNull(i10)) {
                                            i11 = iOooO00o6;
                                            i12 = iOooO00o19;
                                            if (cursor2.isNull(i12)) {
                                                i13 = iOooO00o7;
                                                i14 = iOooO00o20;
                                                if (cursor2.isNull(i14)) {
                                                    arrayList = arrayList2;
                                                    i15 = iOooO00o21;
                                                    if (cursor2.isNull(i15)) {
                                                        friend2 = friend;
                                                        int i25 = iOooO00o22;
                                                        if (cursor2.isNull(i25)) {
                                                            iOooO00o22 = i25;
                                                            int i26 = iOooO00o23;
                                                            if (cursor2.isNull(i26)) {
                                                                iOooO00o23 = i26;
                                                                int i27 = iOooO00o24;
                                                                if (cursor2.isNull(i27)) {
                                                                    iOooO00o24 = i27;
                                                                    int i28 = iOooO00o25;
                                                                    if (cursor2.isNull(i28)) {
                                                                        iOooO00o25 = i28;
                                                                        int i29 = iOooO00o26;
                                                                        if (cursor2.isNull(i29)) {
                                                                            iOooO00o26 = i29;
                                                                            int i30 = iOooO00o27;
                                                                            if (cursor2.isNull(i30)) {
                                                                                iOooO00o27 = i30;
                                                                                int i31 = iOooO00o28;
                                                                                if (cursor2.isNull(i31)) {
                                                                                    iOooO00o28 = i31;
                                                                                    int i32 = iOooO00o29;
                                                                                    if (cursor2.isNull(i32)) {
                                                                                        iOooO00o29 = i32;
                                                                                        int i33 = iOooO00o30;
                                                                                        if (cursor2.isNull(i33)) {
                                                                                            iOooO00o30 = i33;
                                                                                            int i34 = iOooO00o31;
                                                                                            if (cursor2.isNull(i34)) {
                                                                                                iOooO00o31 = i34;
                                                                                                int i35 = iOooO00o32;
                                                                                                if (cursor2.isNull(i35)) {
                                                                                                    iOooO00o32 = i35;
                                                                                                    int i36 = iOooO00o33;
                                                                                                    if (cursor2.isNull(i36)) {
                                                                                                        iOooO00o33 = i36;
                                                                                                        int i37 = iOooO00o34;
                                                                                                        if (cursor2.isNull(i37)) {
                                                                                                            iOooO00o12 = iOooO00o12;
                                                                                                            iOooO00o13 = iOooO00o13;
                                                                                                            i17 = i2;
                                                                                                            i22 = i37;
                                                                                                            i16 = iOooO00o22;
                                                                                                            userInfo = null;
                                                                                                            i19 = i4;
                                                                                                            i18 = i6;
                                                                                                            i20 = iOooO00o31;
                                                                                                            i21 = iOooO00o33;
                                                                                                        } else {
                                                                                                            iOooO00o12 = iOooO00o12;
                                                                                                            iOooO00o13 = iOooO00o13;
                                                                                                            iOooO00o34 = i37;
                                                                                                        }
                                                                                                        iOooO00o34 = i22;
                                                                                                        ArrayList arrayList3 = arrayList;
                                                                                                        arrayList3.add(new FriendInfo(userInfo, friend2));
                                                                                                        cursor2 = cursor;
                                                                                                        iOooO00o33 = i21;
                                                                                                        iOooO00o31 = i20;
                                                                                                        iOooO00o20 = i14;
                                                                                                        iOooO00o21 = i15;
                                                                                                        iOooO00o3 = i5;
                                                                                                        iOooO00o7 = i13;
                                                                                                        iOooO00o15 = i19;
                                                                                                        iOooO00o2 = i3;
                                                                                                        i24 = i17;
                                                                                                        iOooO00o22 = i16;
                                                                                                        arrayList2 = arrayList3;
                                                                                                        iOooO00o19 = i12;
                                                                                                        iOooO00o6 = i11;
                                                                                                        iOooO00o = i;
                                                                                                        iOooO00o18 = i10;
                                                                                                        iOooO00o5 = i9;
                                                                                                        iOooO00o17 = i8;
                                                                                                        iOooO00o4 = i7;
                                                                                                        iOooO00o16 = i18;
                                                                                                    } else {
                                                                                                        iOooO00o12 = iOooO00o12;
                                                                                                        iOooO00o13 = iOooO00o13;
                                                                                                        iOooO00o33 = i36;
                                                                                                    }
                                                                                                } else {
                                                                                                    iOooO00o12 = iOooO00o12;
                                                                                                    iOooO00o13 = iOooO00o13;
                                                                                                    iOooO00o32 = i35;
                                                                                                }
                                                                                            } else {
                                                                                                iOooO00o12 = iOooO00o12;
                                                                                                iOooO00o13 = iOooO00o13;
                                                                                                iOooO00o31 = i34;
                                                                                            }
                                                                                        } else {
                                                                                            iOooO00o12 = iOooO00o12;
                                                                                            iOooO00o13 = iOooO00o13;
                                                                                            iOooO00o30 = i33;
                                                                                        }
                                                                                    } else {
                                                                                        iOooO00o12 = iOooO00o12;
                                                                                        iOooO00o13 = iOooO00o13;
                                                                                        iOooO00o29 = i32;
                                                                                    }
                                                                                } else {
                                                                                    iOooO00o12 = iOooO00o12;
                                                                                    iOooO00o13 = iOooO00o13;
                                                                                    iOooO00o28 = i31;
                                                                                }
                                                                            } else {
                                                                                iOooO00o12 = iOooO00o12;
                                                                                iOooO00o13 = iOooO00o13;
                                                                                iOooO00o27 = i30;
                                                                            }
                                                                        } else {
                                                                            iOooO00o12 = iOooO00o12;
                                                                            iOooO00o13 = iOooO00o13;
                                                                            iOooO00o26 = i29;
                                                                        }
                                                                    } else {
                                                                        iOooO00o12 = iOooO00o12;
                                                                        iOooO00o13 = iOooO00o13;
                                                                        iOooO00o25 = i28;
                                                                    }
                                                                } else {
                                                                    iOooO00o12 = iOooO00o12;
                                                                    iOooO00o13 = iOooO00o13;
                                                                    iOooO00o24 = i27;
                                                                }
                                                            } else {
                                                                iOooO00o12 = iOooO00o12;
                                                                iOooO00o13 = iOooO00o13;
                                                                iOooO00o23 = i26;
                                                            }
                                                        } else {
                                                            iOooO00o12 = iOooO00o12;
                                                            iOooO00o13 = iOooO00o13;
                                                            iOooO00o22 = i25;
                                                        }
                                                    }
                                                    userInfo = new UserInfo();
                                                    int i38 = i12;
                                                    int i39 = i14;
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
                                                    if (cursor2.isNull(iOooO00o12)) {
                                                        string3 = null;
                                                    } else {
                                                        string3 = cursor2.getString(iOooO00o12);
                                                    }
                                                    userInfo.setUserHeader(string3);
                                                    if (cursor2.isNull(iOooO00o13)) {
                                                        string4 = null;
                                                    } else {
                                                        string4 = cursor2.getString(iOooO00o13);
                                                    }
                                                    userInfo.setUserHeaderFrame(string4);
                                                    if (cursor2.isNull(i2)) {
                                                        string5 = null;
                                                    } else {
                                                        string5 = cursor2.getString(i2);
                                                    }
                                                    userInfo.setBackground(string5);
                                                    userInfo.setUserLevel(cursor2.getInt(i4));
                                                    userInfo.setSex(cursor2.getInt(i6));
                                                    if (cursor2.isNull(i8)) {
                                                        string6 = null;
                                                    } else {
                                                        string6 = cursor2.getString(i8);
                                                    }
                                                    userInfo.setBio(string6);
                                                    if (cursor2.isNull(i10)) {
                                                        string7 = null;
                                                    } else {
                                                        string7 = cursor2.getString(i10);
                                                    }
                                                    userInfo.setBirthday(string7);
                                                    i12 = i38;
                                                    userInfo.setAge(cursor2.getInt(i12));
                                                    i17 = i2;
                                                    i14 = i39;
                                                    userInfo.setCountryId(cursor2.getInt(i14));
                                                    userInfo.setRegion(cursor2.getInt(i15));
                                                    i16 = iOooO00o22;
                                                    if (cursor2.isNull(i16)) {
                                                        string8 = null;
                                                    } else {
                                                        string8 = cursor2.getString(i16);
                                                    }
                                                    userInfo.setMedal(string8);
                                                    i19 = i4;
                                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                                    userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                                    userInfo.setRole(cursor2.getInt(iOooO00o27));
                                                    int i40 = iOooO00o28;
                                                    userInfo.setRegTime(cursor2.getInt(i40));
                                                    int i41 = iOooO00o29;
                                                    iOooO00o29 = i41;
                                                    iOooO00o28 = i40;
                                                    i18 = i6;
                                                    userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i41) ? null : cursor2.getString(i41)));
                                                    i23 = iOooO00o30;
                                                    if (cursor2.getInt(i23) != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    userInfo.setPremium(z);
                                                    iOooO00o30 = i23;
                                                    i20 = iOooO00o31;
                                                    userInfo.setPremiumLevel(cursor2.getInt(i20));
                                                    userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                                    i21 = iOooO00o33;
                                                    userInfo.setVipLevel(cursor2.getInt(i21));
                                                    i22 = iOooO00o34;
                                                    if (cursor2.getInt(i22) != 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    userInfo.setShowVIP(z2);
                                                    iOooO00o34 = i22;
                                                    ArrayList arrayList4 = arrayList;
                                                    arrayList4.add(new FriendInfo(userInfo, friend2));
                                                    cursor2 = cursor;
                                                    iOooO00o33 = i21;
                                                    iOooO00o31 = i20;
                                                    iOooO00o20 = i14;
                                                    iOooO00o21 = i15;
                                                    iOooO00o3 = i5;
                                                    iOooO00o7 = i13;
                                                    iOooO00o15 = i19;
                                                    iOooO00o2 = i3;
                                                    i24 = i17;
                                                    iOooO00o22 = i16;
                                                    arrayList2 = arrayList4;
                                                    iOooO00o19 = i12;
                                                    iOooO00o6 = i11;
                                                    iOooO00o = i;
                                                    iOooO00o18 = i10;
                                                    iOooO00o5 = i9;
                                                    iOooO00o17 = i8;
                                                    iOooO00o4 = i7;
                                                    iOooO00o16 = i18;
                                                }
                                                iOooO00o12 = iOooO00o12;
                                                iOooO00o13 = iOooO00o13;
                                                friend2 = friend;
                                                userInfo = new UserInfo();
                                                int i310 = i12;
                                                int i311 = i14;
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
                                                if (cursor2.isNull(iOooO00o12)) {
                                                    string3 = null;
                                                } else {
                                                    string3 = cursor2.getString(iOooO00o12);
                                                }
                                                userInfo.setUserHeader(string3);
                                                if (cursor2.isNull(iOooO00o13)) {
                                                    string4 = null;
                                                } else {
                                                    string4 = cursor2.getString(iOooO00o13);
                                                }
                                                userInfo.setUserHeaderFrame(string4);
                                                if (cursor2.isNull(i2)) {
                                                    string5 = null;
                                                } else {
                                                    string5 = cursor2.getString(i2);
                                                }
                                                userInfo.setBackground(string5);
                                                userInfo.setUserLevel(cursor2.getInt(i4));
                                                userInfo.setSex(cursor2.getInt(i6));
                                                if (cursor2.isNull(i8)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = cursor2.getString(i8);
                                                }
                                                userInfo.setBio(string6);
                                                if (cursor2.isNull(i10)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = cursor2.getString(i10);
                                                }
                                                userInfo.setBirthday(string7);
                                                i12 = i310;
                                                userInfo.setAge(cursor2.getInt(i12));
                                                i17 = i2;
                                                i14 = i311;
                                                userInfo.setCountryId(cursor2.getInt(i14));
                                                userInfo.setRegion(cursor2.getInt(i15));
                                                i16 = iOooO00o22;
                                                if (cursor2.isNull(i16)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = cursor2.getString(i16);
                                                }
                                                userInfo.setMedal(string8);
                                                i19 = i4;
                                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                                userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                                userInfo.setRole(cursor2.getInt(iOooO00o27));
                                                int i42 = iOooO00o28;
                                                userInfo.setRegTime(cursor2.getInt(i42));
                                                int i43 = iOooO00o29;
                                                iOooO00o29 = i43;
                                                iOooO00o28 = i42;
                                                i18 = i6;
                                                userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i43) ? null : cursor2.getString(i43)));
                                                i23 = iOooO00o30;
                                                if (cursor2.getInt(i23) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                userInfo.setPremium(z);
                                                iOooO00o30 = i23;
                                                i20 = iOooO00o31;
                                                userInfo.setPremiumLevel(cursor2.getInt(i20));
                                                userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                                i21 = iOooO00o33;
                                                userInfo.setVipLevel(cursor2.getInt(i21));
                                                i22 = iOooO00o34;
                                                if (cursor2.getInt(i22) != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                userInfo.setShowVIP(z2);
                                                iOooO00o34 = i22;
                                                ArrayList arrayList5 = arrayList;
                                                arrayList5.add(new FriendInfo(userInfo, friend2));
                                                cursor2 = cursor;
                                                iOooO00o33 = i21;
                                                iOooO00o31 = i20;
                                                iOooO00o20 = i14;
                                                iOooO00o21 = i15;
                                                iOooO00o3 = i5;
                                                iOooO00o7 = i13;
                                                iOooO00o15 = i19;
                                                iOooO00o2 = i3;
                                                i24 = i17;
                                                iOooO00o22 = i16;
                                                arrayList2 = arrayList5;
                                                iOooO00o19 = i12;
                                                iOooO00o6 = i11;
                                                iOooO00o = i;
                                                iOooO00o18 = i10;
                                                iOooO00o5 = i9;
                                                iOooO00o17 = i8;
                                                iOooO00o4 = i7;
                                                iOooO00o16 = i18;
                                            }
                                            iOooO00o12 = iOooO00o12;
                                            iOooO00o13 = iOooO00o13;
                                            arrayList = arrayList2;
                                            i15 = iOooO00o21;
                                            iOooO00o12 = iOooO00o12;
                                            iOooO00o13 = iOooO00o13;
                                            friend2 = friend;
                                            userInfo = new UserInfo();
                                            int i312 = i12;
                                            int i313 = i14;
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
                                            if (cursor2.isNull(iOooO00o12)) {
                                                string3 = null;
                                            } else {
                                                string3 = cursor2.getString(iOooO00o12);
                                            }
                                            userInfo.setUserHeader(string3);
                                            if (cursor2.isNull(iOooO00o13)) {
                                                string4 = null;
                                            } else {
                                                string4 = cursor2.getString(iOooO00o13);
                                            }
                                            userInfo.setUserHeaderFrame(string4);
                                            if (cursor2.isNull(i2)) {
                                                string5 = null;
                                            } else {
                                                string5 = cursor2.getString(i2);
                                            }
                                            userInfo.setBackground(string5);
                                            userInfo.setUserLevel(cursor2.getInt(i4));
                                            userInfo.setSex(cursor2.getInt(i6));
                                            if (cursor2.isNull(i8)) {
                                                string6 = null;
                                            } else {
                                                string6 = cursor2.getString(i8);
                                            }
                                            userInfo.setBio(string6);
                                            if (cursor2.isNull(i10)) {
                                                string7 = null;
                                            } else {
                                                string7 = cursor2.getString(i10);
                                            }
                                            userInfo.setBirthday(string7);
                                            i12 = i312;
                                            userInfo.setAge(cursor2.getInt(i12));
                                            i17 = i2;
                                            i14 = i313;
                                            userInfo.setCountryId(cursor2.getInt(i14));
                                            userInfo.setRegion(cursor2.getInt(i15));
                                            i16 = iOooO00o22;
                                            if (cursor2.isNull(i16)) {
                                                string8 = null;
                                            } else {
                                                string8 = cursor2.getString(i16);
                                            }
                                            userInfo.setMedal(string8);
                                            i19 = i4;
                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                            userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                            userInfo.setRole(cursor2.getInt(iOooO00o27));
                                            int i44 = iOooO00o28;
                                            userInfo.setRegTime(cursor2.getInt(i44));
                                            int i45 = iOooO00o29;
                                            iOooO00o29 = i45;
                                            iOooO00o28 = i44;
                                            i18 = i6;
                                            userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i45) ? null : cursor2.getString(i45)));
                                            i23 = iOooO00o30;
                                            if (cursor2.getInt(i23) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            userInfo.setPremium(z);
                                            iOooO00o30 = i23;
                                            i20 = iOooO00o31;
                                            userInfo.setPremiumLevel(cursor2.getInt(i20));
                                            userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                            i21 = iOooO00o33;
                                            userInfo.setVipLevel(cursor2.getInt(i21));
                                            i22 = iOooO00o34;
                                            if (cursor2.getInt(i22) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            userInfo.setShowVIP(z2);
                                            iOooO00o34 = i22;
                                            ArrayList arrayList6 = arrayList;
                                            arrayList6.add(new FriendInfo(userInfo, friend2));
                                            cursor2 = cursor;
                                            iOooO00o33 = i21;
                                            iOooO00o31 = i20;
                                            iOooO00o20 = i14;
                                            iOooO00o21 = i15;
                                            iOooO00o3 = i5;
                                            iOooO00o7 = i13;
                                            iOooO00o15 = i19;
                                            iOooO00o2 = i3;
                                            i24 = i17;
                                            iOooO00o22 = i16;
                                            arrayList2 = arrayList6;
                                            iOooO00o19 = i12;
                                            iOooO00o6 = i11;
                                            iOooO00o = i;
                                            iOooO00o18 = i10;
                                            iOooO00o5 = i9;
                                            iOooO00o17 = i8;
                                            iOooO00o4 = i7;
                                            iOooO00o16 = i18;
                                        }
                                        iOooO00o12 = iOooO00o12;
                                        iOooO00o13 = iOooO00o13;
                                        i13 = iOooO00o7;
                                        i14 = iOooO00o20;
                                        iOooO00o12 = iOooO00o12;
                                        iOooO00o13 = iOooO00o13;
                                        arrayList = arrayList2;
                                        i15 = iOooO00o21;
                                        iOooO00o12 = iOooO00o12;
                                        iOooO00o13 = iOooO00o13;
                                        friend2 = friend;
                                        userInfo = new UserInfo();
                                        int i314 = i12;
                                        int i315 = i14;
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
                                        if (cursor2.isNull(iOooO00o12)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursor2.getString(iOooO00o12);
                                        }
                                        userInfo.setUserHeader(string3);
                                        if (cursor2.isNull(iOooO00o13)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursor2.getString(iOooO00o13);
                                        }
                                        userInfo.setUserHeaderFrame(string4);
                                        if (cursor2.isNull(i2)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursor2.getString(i2);
                                        }
                                        userInfo.setBackground(string5);
                                        userInfo.setUserLevel(cursor2.getInt(i4));
                                        userInfo.setSex(cursor2.getInt(i6));
                                        if (cursor2.isNull(i8)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursor2.getString(i8);
                                        }
                                        userInfo.setBio(string6);
                                        if (cursor2.isNull(i10)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursor2.getString(i10);
                                        }
                                        userInfo.setBirthday(string7);
                                        i12 = i314;
                                        userInfo.setAge(cursor2.getInt(i12));
                                        i17 = i2;
                                        i14 = i315;
                                        userInfo.setCountryId(cursor2.getInt(i14));
                                        userInfo.setRegion(cursor2.getInt(i15));
                                        i16 = iOooO00o22;
                                        if (cursor2.isNull(i16)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursor2.getString(i16);
                                        }
                                        userInfo.setMedal(string8);
                                        i19 = i4;
                                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                        userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                        userInfo.setRole(cursor2.getInt(iOooO00o27));
                                        int i46 = iOooO00o28;
                                        userInfo.setRegTime(cursor2.getInt(i46));
                                        int i47 = iOooO00o29;
                                        iOooO00o29 = i47;
                                        iOooO00o28 = i46;
                                        i18 = i6;
                                        userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i47) ? null : cursor2.getString(i47)));
                                        i23 = iOooO00o30;
                                        if (cursor2.getInt(i23) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        userInfo.setPremium(z);
                                        iOooO00o30 = i23;
                                        i20 = iOooO00o31;
                                        userInfo.setPremiumLevel(cursor2.getInt(i20));
                                        userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                        i21 = iOooO00o33;
                                        userInfo.setVipLevel(cursor2.getInt(i21));
                                        i22 = iOooO00o34;
                                        if (cursor2.getInt(i22) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        userInfo.setShowVIP(z2);
                                        iOooO00o34 = i22;
                                        ArrayList arrayList7 = arrayList;
                                        arrayList7.add(new FriendInfo(userInfo, friend2));
                                        cursor2 = cursor;
                                        iOooO00o33 = i21;
                                        iOooO00o31 = i20;
                                        iOooO00o20 = i14;
                                        iOooO00o21 = i15;
                                        iOooO00o3 = i5;
                                        iOooO00o7 = i13;
                                        iOooO00o15 = i19;
                                        iOooO00o2 = i3;
                                        i24 = i17;
                                        iOooO00o22 = i16;
                                        arrayList2 = arrayList7;
                                        iOooO00o19 = i12;
                                        iOooO00o6 = i11;
                                        iOooO00o = i;
                                        iOooO00o18 = i10;
                                        iOooO00o5 = i9;
                                        iOooO00o17 = i8;
                                        iOooO00o4 = i7;
                                        iOooO00o16 = i18;
                                    }
                                    iOooO00o12 = iOooO00o12;
                                    iOooO00o13 = iOooO00o13;
                                    i11 = iOooO00o6;
                                    i12 = iOooO00o19;
                                    iOooO00o12 = iOooO00o12;
                                    iOooO00o13 = iOooO00o13;
                                    i13 = iOooO00o7;
                                    i14 = iOooO00o20;
                                    iOooO00o12 = iOooO00o12;
                                    iOooO00o13 = iOooO00o13;
                                    arrayList = arrayList2;
                                    i15 = iOooO00o21;
                                    iOooO00o12 = iOooO00o12;
                                    iOooO00o13 = iOooO00o13;
                                    friend2 = friend;
                                    userInfo = new UserInfo();
                                    int i316 = i12;
                                    int i317 = i14;
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
                                    if (cursor2.isNull(iOooO00o12)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursor2.getString(iOooO00o12);
                                    }
                                    userInfo.setUserHeader(string3);
                                    if (cursor2.isNull(iOooO00o13)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursor2.getString(iOooO00o13);
                                    }
                                    userInfo.setUserHeaderFrame(string4);
                                    if (cursor2.isNull(i2)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursor2.getString(i2);
                                    }
                                    userInfo.setBackground(string5);
                                    userInfo.setUserLevel(cursor2.getInt(i4));
                                    userInfo.setSex(cursor2.getInt(i6));
                                    if (cursor2.isNull(i8)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursor2.getString(i8);
                                    }
                                    userInfo.setBio(string6);
                                    if (cursor2.isNull(i10)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursor2.getString(i10);
                                    }
                                    userInfo.setBirthday(string7);
                                    i12 = i316;
                                    userInfo.setAge(cursor2.getInt(i12));
                                    i17 = i2;
                                    i14 = i317;
                                    userInfo.setCountryId(cursor2.getInt(i14));
                                    userInfo.setRegion(cursor2.getInt(i15));
                                    i16 = iOooO00o22;
                                    if (cursor2.isNull(i16)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursor2.getString(i16);
                                    }
                                    userInfo.setMedal(string8);
                                    i19 = i4;
                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                    userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                    userInfo.setRole(cursor2.getInt(iOooO00o27));
                                    int i48 = iOooO00o28;
                                    userInfo.setRegTime(cursor2.getInt(i48));
                                    int i49 = iOooO00o29;
                                    iOooO00o29 = i49;
                                    iOooO00o28 = i48;
                                    i18 = i6;
                                    userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i49) ? null : cursor2.getString(i49)));
                                    i23 = iOooO00o30;
                                    if (cursor2.getInt(i23) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    userInfo.setPremium(z);
                                    iOooO00o30 = i23;
                                    i20 = iOooO00o31;
                                    userInfo.setPremiumLevel(cursor2.getInt(i20));
                                    userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                    i21 = iOooO00o33;
                                    userInfo.setVipLevel(cursor2.getInt(i21));
                                    i22 = iOooO00o34;
                                    if (cursor2.getInt(i22) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    userInfo.setShowVIP(z2);
                                    iOooO00o34 = i22;
                                    ArrayList arrayList8 = arrayList;
                                    arrayList8.add(new FriendInfo(userInfo, friend2));
                                    cursor2 = cursor;
                                    iOooO00o33 = i21;
                                    iOooO00o31 = i20;
                                    iOooO00o20 = i14;
                                    iOooO00o21 = i15;
                                    iOooO00o3 = i5;
                                    iOooO00o7 = i13;
                                    iOooO00o15 = i19;
                                    iOooO00o2 = i3;
                                    i24 = i17;
                                    iOooO00o22 = i16;
                                    arrayList2 = arrayList8;
                                    iOooO00o19 = i12;
                                    iOooO00o6 = i11;
                                    iOooO00o = i;
                                    iOooO00o18 = i10;
                                    iOooO00o5 = i9;
                                    iOooO00o17 = i8;
                                    iOooO00o4 = i7;
                                    iOooO00o16 = i18;
                                }
                                iOooO00o12 = iOooO00o12;
                                iOooO00o13 = iOooO00o13;
                                i9 = iOooO00o5;
                                i10 = iOooO00o18;
                                iOooO00o12 = iOooO00o12;
                                iOooO00o13 = iOooO00o13;
                                i11 = iOooO00o6;
                                i12 = iOooO00o19;
                                iOooO00o12 = iOooO00o12;
                                iOooO00o13 = iOooO00o13;
                                i13 = iOooO00o7;
                                i14 = iOooO00o20;
                                iOooO00o12 = iOooO00o12;
                                iOooO00o13 = iOooO00o13;
                                arrayList = arrayList2;
                                i15 = iOooO00o21;
                                iOooO00o12 = iOooO00o12;
                                iOooO00o13 = iOooO00o13;
                                friend2 = friend;
                                userInfo = new UserInfo();
                                int i318 = i12;
                                int i319 = i14;
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
                                if (cursor2.isNull(iOooO00o12)) {
                                    string3 = null;
                                } else {
                                    string3 = cursor2.getString(iOooO00o12);
                                }
                                userInfo.setUserHeader(string3);
                                if (cursor2.isNull(iOooO00o13)) {
                                    string4 = null;
                                } else {
                                    string4 = cursor2.getString(iOooO00o13);
                                }
                                userInfo.setUserHeaderFrame(string4);
                                if (cursor2.isNull(i2)) {
                                    string5 = null;
                                } else {
                                    string5 = cursor2.getString(i2);
                                }
                                userInfo.setBackground(string5);
                                userInfo.setUserLevel(cursor2.getInt(i4));
                                userInfo.setSex(cursor2.getInt(i6));
                                if (cursor2.isNull(i8)) {
                                    string6 = null;
                                } else {
                                    string6 = cursor2.getString(i8);
                                }
                                userInfo.setBio(string6);
                                if (cursor2.isNull(i10)) {
                                    string7 = null;
                                } else {
                                    string7 = cursor2.getString(i10);
                                }
                                userInfo.setBirthday(string7);
                                i12 = i318;
                                userInfo.setAge(cursor2.getInt(i12));
                                i17 = i2;
                                i14 = i319;
                                userInfo.setCountryId(cursor2.getInt(i14));
                                userInfo.setRegion(cursor2.getInt(i15));
                                i16 = iOooO00o22;
                                if (cursor2.isNull(i16)) {
                                    string8 = null;
                                } else {
                                    string8 = cursor2.getString(i16);
                                }
                                userInfo.setMedal(string8);
                                i19 = i4;
                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                userInfo.setRole(cursor2.getInt(iOooO00o27));
                                int i410 = iOooO00o28;
                                userInfo.setRegTime(cursor2.getInt(i410));
                                int i411 = iOooO00o29;
                                iOooO00o29 = i411;
                                iOooO00o28 = i410;
                                i18 = i6;
                                userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i411) ? null : cursor2.getString(i411)));
                                i23 = iOooO00o30;
                                if (cursor2.getInt(i23) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                userInfo.setPremium(z);
                                iOooO00o30 = i23;
                                i20 = iOooO00o31;
                                userInfo.setPremiumLevel(cursor2.getInt(i20));
                                userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                i21 = iOooO00o33;
                                userInfo.setVipLevel(cursor2.getInt(i21));
                                i22 = iOooO00o34;
                                if (cursor2.getInt(i22) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                userInfo.setShowVIP(z2);
                                iOooO00o34 = i22;
                                ArrayList arrayList9 = arrayList;
                                arrayList9.add(new FriendInfo(userInfo, friend2));
                                cursor2 = cursor;
                                iOooO00o33 = i21;
                                iOooO00o31 = i20;
                                iOooO00o20 = i14;
                                iOooO00o21 = i15;
                                iOooO00o3 = i5;
                                iOooO00o7 = i13;
                                iOooO00o15 = i19;
                                iOooO00o2 = i3;
                                i24 = i17;
                                iOooO00o22 = i16;
                                arrayList2 = arrayList9;
                                iOooO00o19 = i12;
                                iOooO00o6 = i11;
                                iOooO00o = i;
                                iOooO00o18 = i10;
                                iOooO00o5 = i9;
                                iOooO00o17 = i8;
                                iOooO00o4 = i7;
                                iOooO00o16 = i18;
                            }
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            i7 = iOooO00o4;
                            i8 = iOooO00o17;
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            i9 = iOooO00o5;
                            i10 = iOooO00o18;
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            i11 = iOooO00o6;
                            i12 = iOooO00o19;
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            i13 = iOooO00o7;
                            i14 = iOooO00o20;
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            arrayList = arrayList2;
                            i15 = iOooO00o21;
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            friend2 = friend;
                            userInfo = new UserInfo();
                            int i3110 = i12;
                            int i3111 = i14;
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
                            if (cursor2.isNull(iOooO00o12)) {
                                string3 = null;
                            } else {
                                string3 = cursor2.getString(iOooO00o12);
                            }
                            userInfo.setUserHeader(string3);
                            if (cursor2.isNull(iOooO00o13)) {
                                string4 = null;
                            } else {
                                string4 = cursor2.getString(iOooO00o13);
                            }
                            userInfo.setUserHeaderFrame(string4);
                            if (cursor2.isNull(i2)) {
                                string5 = null;
                            } else {
                                string5 = cursor2.getString(i2);
                            }
                            userInfo.setBackground(string5);
                            userInfo.setUserLevel(cursor2.getInt(i4));
                            userInfo.setSex(cursor2.getInt(i6));
                            if (cursor2.isNull(i8)) {
                                string6 = null;
                            } else {
                                string6 = cursor2.getString(i8);
                            }
                            userInfo.setBio(string6);
                            if (cursor2.isNull(i10)) {
                                string7 = null;
                            } else {
                                string7 = cursor2.getString(i10);
                            }
                            userInfo.setBirthday(string7);
                            i12 = i3110;
                            userInfo.setAge(cursor2.getInt(i12));
                            i17 = i2;
                            i14 = i3111;
                            userInfo.setCountryId(cursor2.getInt(i14));
                            userInfo.setRegion(cursor2.getInt(i15));
                            i16 = iOooO00o22;
                            if (cursor2.isNull(i16)) {
                                string8 = null;
                            } else {
                                string8 = cursor2.getString(i16);
                            }
                            userInfo.setMedal(string8);
                            i19 = i4;
                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                            userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                            userInfo.setRole(cursor2.getInt(iOooO00o27));
                            int i412 = iOooO00o28;
                            userInfo.setRegTime(cursor2.getInt(i412));
                            int i413 = iOooO00o29;
                            iOooO00o29 = i413;
                            iOooO00o28 = i412;
                            i18 = i6;
                            userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i413) ? null : cursor2.getString(i413)));
                            i23 = iOooO00o30;
                            if (cursor2.getInt(i23) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            userInfo.setPremium(z);
                            iOooO00o30 = i23;
                            i20 = iOooO00o31;
                            userInfo.setPremiumLevel(cursor2.getInt(i20));
                            userInfo.setVipState(cursor2.getInt(iOooO00o32));
                            i21 = iOooO00o33;
                            userInfo.setVipLevel(cursor2.getInt(i21));
                            i22 = iOooO00o34;
                            if (cursor2.getInt(i22) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            userInfo.setShowVIP(z2);
                            iOooO00o34 = i22;
                            ArrayList arrayList10 = arrayList;
                            arrayList10.add(new FriendInfo(userInfo, friend2));
                            cursor2 = cursor;
                            iOooO00o33 = i21;
                            iOooO00o31 = i20;
                            iOooO00o20 = i14;
                            iOooO00o21 = i15;
                            iOooO00o3 = i5;
                            iOooO00o7 = i13;
                            iOooO00o15 = i19;
                            iOooO00o2 = i3;
                            i24 = i17;
                            iOooO00o22 = i16;
                            arrayList2 = arrayList10;
                            iOooO00o19 = i12;
                            iOooO00o6 = i11;
                            iOooO00o = i;
                            iOooO00o18 = i10;
                            iOooO00o5 = i9;
                            iOooO00o17 = i8;
                            iOooO00o4 = i7;
                            iOooO00o16 = i18;
                        }
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        i5 = iOooO00o3;
                        i6 = iOooO00o16;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        i7 = iOooO00o4;
                        i8 = iOooO00o17;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        i9 = iOooO00o5;
                        i10 = iOooO00o18;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        i11 = iOooO00o6;
                        i12 = iOooO00o19;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        i13 = iOooO00o7;
                        i14 = iOooO00o20;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        arrayList = arrayList2;
                        i15 = iOooO00o21;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        friend2 = friend;
                        userInfo = new UserInfo();
                        int i3112 = i12;
                        int i3113 = i14;
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
                        if (cursor2.isNull(iOooO00o12)) {
                            string3 = null;
                        } else {
                            string3 = cursor2.getString(iOooO00o12);
                        }
                        userInfo.setUserHeader(string3);
                        if (cursor2.isNull(iOooO00o13)) {
                            string4 = null;
                        } else {
                            string4 = cursor2.getString(iOooO00o13);
                        }
                        userInfo.setUserHeaderFrame(string4);
                        if (cursor2.isNull(i2)) {
                            string5 = null;
                        } else {
                            string5 = cursor2.getString(i2);
                        }
                        userInfo.setBackground(string5);
                        userInfo.setUserLevel(cursor2.getInt(i4));
                        userInfo.setSex(cursor2.getInt(i6));
                        if (cursor2.isNull(i8)) {
                            string6 = null;
                        } else {
                            string6 = cursor2.getString(i8);
                        }
                        userInfo.setBio(string6);
                        if (cursor2.isNull(i10)) {
                            string7 = null;
                        } else {
                            string7 = cursor2.getString(i10);
                        }
                        userInfo.setBirthday(string7);
                        i12 = i3112;
                        userInfo.setAge(cursor2.getInt(i12));
                        i17 = i2;
                        i14 = i3113;
                        userInfo.setCountryId(cursor2.getInt(i14));
                        userInfo.setRegion(cursor2.getInt(i15));
                        i16 = iOooO00o22;
                        if (cursor2.isNull(i16)) {
                            string8 = null;
                        } else {
                            string8 = cursor2.getString(i16);
                        }
                        userInfo.setMedal(string8);
                        i19 = i4;
                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                        userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                        userInfo.setRole(cursor2.getInt(iOooO00o27));
                        int i414 = iOooO00o28;
                        userInfo.setRegTime(cursor2.getInt(i414));
                        int i415 = iOooO00o29;
                        iOooO00o29 = i415;
                        iOooO00o28 = i414;
                        i18 = i6;
                        userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i415) ? null : cursor2.getString(i415)));
                        i23 = iOooO00o30;
                        if (cursor2.getInt(i23) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        userInfo.setPremium(z);
                        iOooO00o30 = i23;
                        i20 = iOooO00o31;
                        userInfo.setPremiumLevel(cursor2.getInt(i20));
                        userInfo.setVipState(cursor2.getInt(iOooO00o32));
                        i21 = iOooO00o33;
                        userInfo.setVipLevel(cursor2.getInt(i21));
                        i22 = iOooO00o34;
                        if (cursor2.getInt(i22) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        userInfo.setShowVIP(z2);
                        iOooO00o34 = i22;
                        ArrayList arrayList11 = arrayList;
                        arrayList11.add(new FriendInfo(userInfo, friend2));
                        cursor2 = cursor;
                        iOooO00o33 = i21;
                        iOooO00o31 = i20;
                        iOooO00o20 = i14;
                        iOooO00o21 = i15;
                        iOooO00o3 = i5;
                        iOooO00o7 = i13;
                        iOooO00o15 = i19;
                        iOooO00o2 = i3;
                        i24 = i17;
                        iOooO00o22 = i16;
                        arrayList2 = arrayList11;
                        iOooO00o19 = i12;
                        iOooO00o6 = i11;
                        iOooO00o = i;
                        iOooO00o18 = i10;
                        iOooO00o5 = i9;
                        iOooO00o17 = i8;
                        iOooO00o4 = i7;
                        iOooO00o16 = i18;
                    }
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i3 = iOooO00o2;
                    i4 = iOooO00o15;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i5 = iOooO00o3;
                    i6 = iOooO00o16;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i7 = iOooO00o4;
                    i8 = iOooO00o17;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i9 = iOooO00o5;
                    i10 = iOooO00o18;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i11 = iOooO00o6;
                    i12 = iOooO00o19;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i13 = iOooO00o7;
                    i14 = iOooO00o20;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    arrayList = arrayList2;
                    i15 = iOooO00o21;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    friend2 = friend;
                    userInfo = new UserInfo();
                    int i3114 = i12;
                    int i3115 = i14;
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
                    if (cursor2.isNull(iOooO00o12)) {
                        string3 = null;
                    } else {
                        string3 = cursor2.getString(iOooO00o12);
                    }
                    userInfo.setUserHeader(string3);
                    if (cursor2.isNull(iOooO00o13)) {
                        string4 = null;
                    } else {
                        string4 = cursor2.getString(iOooO00o13);
                    }
                    userInfo.setUserHeaderFrame(string4);
                    if (cursor2.isNull(i2)) {
                        string5 = null;
                    } else {
                        string5 = cursor2.getString(i2);
                    }
                    userInfo.setBackground(string5);
                    userInfo.setUserLevel(cursor2.getInt(i4));
                    userInfo.setSex(cursor2.getInt(i6));
                    if (cursor2.isNull(i8)) {
                        string6 = null;
                    } else {
                        string6 = cursor2.getString(i8);
                    }
                    userInfo.setBio(string6);
                    if (cursor2.isNull(i10)) {
                        string7 = null;
                    } else {
                        string7 = cursor2.getString(i10);
                    }
                    userInfo.setBirthday(string7);
                    i12 = i3114;
                    userInfo.setAge(cursor2.getInt(i12));
                    i17 = i2;
                    i14 = i3115;
                    userInfo.setCountryId(cursor2.getInt(i14));
                    userInfo.setRegion(cursor2.getInt(i15));
                    i16 = iOooO00o22;
                    if (cursor2.isNull(i16)) {
                        string8 = null;
                    } else {
                        string8 = cursor2.getString(i16);
                    }
                    userInfo.setMedal(string8);
                    i19 = i4;
                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                    userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                    userInfo.setRole(cursor2.getInt(iOooO00o27));
                    int i416 = iOooO00o28;
                    userInfo.setRegTime(cursor2.getInt(i416));
                    int i417 = iOooO00o29;
                    iOooO00o29 = i417;
                    iOooO00o28 = i416;
                    i18 = i6;
                    userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i417) ? null : cursor2.getString(i417)));
                    i23 = iOooO00o30;
                    if (cursor2.getInt(i23) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    userInfo.setPremium(z);
                    iOooO00o30 = i23;
                    i20 = iOooO00o31;
                    userInfo.setPremiumLevel(cursor2.getInt(i20));
                    userInfo.setVipState(cursor2.getInt(iOooO00o32));
                    i21 = iOooO00o33;
                    userInfo.setVipLevel(cursor2.getInt(i21));
                    i22 = iOooO00o34;
                    if (cursor2.getInt(i22) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    userInfo.setShowVIP(z2);
                    iOooO00o34 = i22;
                    ArrayList arrayList12 = arrayList;
                    arrayList12.add(new FriendInfo(userInfo, friend2));
                    cursor2 = cursor;
                    iOooO00o33 = i21;
                    iOooO00o31 = i20;
                    iOooO00o20 = i14;
                    iOooO00o21 = i15;
                    iOooO00o3 = i5;
                    iOooO00o7 = i13;
                    iOooO00o15 = i19;
                    iOooO00o2 = i3;
                    i24 = i17;
                    iOooO00o22 = i16;
                    arrayList2 = arrayList12;
                    iOooO00o19 = i12;
                    iOooO00o6 = i11;
                    iOooO00o = i;
                    iOooO00o18 = i10;
                    iOooO00o5 = i9;
                    iOooO00o17 = i8;
                    iOooO00o4 = i7;
                    iOooO00o16 = i18;
                } else {
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                }
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i = iOooO00o;
                i2 = i24;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i3 = iOooO00o2;
                i4 = iOooO00o15;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i5 = iOooO00o3;
                i6 = iOooO00o16;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i7 = iOooO00o4;
                i8 = iOooO00o17;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i9 = iOooO00o5;
                i10 = iOooO00o18;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i11 = iOooO00o6;
                i12 = iOooO00o19;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i13 = iOooO00o7;
                i14 = iOooO00o20;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                arrayList = arrayList2;
                i15 = iOooO00o21;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                friend2 = friend;
                userInfo = new UserInfo();
                int i3116 = i12;
                int i3117 = i14;
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
                if (cursor2.isNull(iOooO00o12)) {
                    string3 = null;
                } else {
                    string3 = cursor2.getString(iOooO00o12);
                }
                userInfo.setUserHeader(string3);
                if (cursor2.isNull(iOooO00o13)) {
                    string4 = null;
                } else {
                    string4 = cursor2.getString(iOooO00o13);
                }
                userInfo.setUserHeaderFrame(string4);
                if (cursor2.isNull(i2)) {
                    string5 = null;
                } else {
                    string5 = cursor2.getString(i2);
                }
                userInfo.setBackground(string5);
                userInfo.setUserLevel(cursor2.getInt(i4));
                userInfo.setSex(cursor2.getInt(i6));
                if (cursor2.isNull(i8)) {
                    string6 = null;
                } else {
                    string6 = cursor2.getString(i8);
                }
                userInfo.setBio(string6);
                if (cursor2.isNull(i10)) {
                    string7 = null;
                } else {
                    string7 = cursor2.getString(i10);
                }
                userInfo.setBirthday(string7);
                i12 = i3116;
                userInfo.setAge(cursor2.getInt(i12));
                i17 = i2;
                i14 = i3117;
                userInfo.setCountryId(cursor2.getInt(i14));
                userInfo.setRegion(cursor2.getInt(i15));
                i16 = iOooO00o22;
                if (cursor2.isNull(i16)) {
                    string8 = null;
                } else {
                    string8 = cursor2.getString(i16);
                }
                userInfo.setMedal(string8);
                i19 = i4;
                userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                userInfo.setRole(cursor2.getInt(iOooO00o27));
                int i418 = iOooO00o28;
                userInfo.setRegTime(cursor2.getInt(i418));
                int i419 = iOooO00o29;
                iOooO00o29 = i419;
                iOooO00o28 = i418;
                i18 = i6;
                userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i419) ? null : cursor2.getString(i419)));
                i23 = iOooO00o30;
                if (cursor2.getInt(i23) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                userInfo.setPremium(z);
                iOooO00o30 = i23;
                i20 = iOooO00o31;
                userInfo.setPremiumLevel(cursor2.getInt(i20));
                userInfo.setVipState(cursor2.getInt(iOooO00o32));
                i21 = iOooO00o33;
                userInfo.setVipLevel(cursor2.getInt(i21));
                i22 = iOooO00o34;
                if (cursor2.getInt(i22) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                userInfo.setShowVIP(z2);
                iOooO00o34 = i22;
                ArrayList arrayList13 = arrayList;
                arrayList13.add(new FriendInfo(userInfo, friend2));
                cursor2 = cursor;
                iOooO00o33 = i21;
                iOooO00o31 = i20;
                iOooO00o20 = i14;
                iOooO00o21 = i15;
                iOooO00o3 = i5;
                iOooO00o7 = i13;
                iOooO00o15 = i19;
                iOooO00o2 = i3;
                i24 = i17;
                iOooO00o22 = i16;
                arrayList2 = arrayList13;
                iOooO00o19 = i12;
                iOooO00o6 = i11;
                iOooO00o = i;
                iOooO00o18 = i10;
                iOooO00o5 = i9;
                iOooO00o17 = i8;
                iOooO00o4 = i7;
                iOooO00o16 = i18;
            }
            return arrayList2;
        }
    }

    public class OooO0OO extends o000O0<FriendInfo> {
        public OooO0OO(o0000O0 o0000o1, RoomDatabase roomDatabase, String... strArr) {
            super(o0000o1, roomDatabase, strArr);
        }

        /* JADX WARN: Code duplicated, block: B:119:0x0313  */
        /* JADX WARN: Code duplicated, block: B:120:0x0316  */
        /* JADX WARN: Code duplicated, block: B:123:0x032a  */
        /* JADX WARN: Code duplicated, block: B:124:0x032d  */
        /* JADX WARN: Code duplicated, block: B:127:0x033a  */
        /* JADX WARN: Code duplicated, block: B:128:0x033d  */
        /* JADX WARN: Code duplicated, block: B:131:0x034a  */
        /* JADX WARN: Code duplicated, block: B:132:0x034d  */
        /* JADX WARN: Code duplicated, block: B:135:0x035a  */
        /* JADX WARN: Code duplicated, block: B:136:0x035d  */
        /* JADX WARN: Code duplicated, block: B:139:0x0378  */
        /* JADX WARN: Code duplicated, block: B:140:0x037b  */
        /* JADX WARN: Code duplicated, block: B:143:0x0388  */
        /* JADX WARN: Code duplicated, block: B:144:0x038b  */
        /* JADX WARN: Code duplicated, block: B:147:0x03b5  */
        /* JADX WARN: Code duplicated, block: B:148:0x03ba  */
        /* JADX WARN: Code duplicated, block: B:152:0x0406  */
        /* JADX WARN: Code duplicated, block: B:155:0x0427  */
        /* JADX WARN: Code duplicated, block: B:156:0x0429  */
        /* JADX WARN: Code duplicated, block: B:159:0x0452  */
        /* JADX WARN: Code duplicated, block: B:160:0x0454  */
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
            ArrayList arrayList;
            int i15;
            Friend friend2;
            int i16;
            int i17;
            int i18;
            int i19;
            UserInfo userInfo;
            int i20;
            int i21;
            int i22;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            int i23;
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
            int i24 = iOooO00o14;
            ArrayList arrayList2 = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                if (cursor2.isNull(iOooO00o) && cursor2.isNull(iOooO00o2) && cursor2.isNull(iOooO00o3) && cursor2.isNull(iOooO00o4) && cursor2.isNull(iOooO00o5) && cursor2.isNull(iOooO00o6) && cursor2.isNull(iOooO00o7)) {
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
                }
                if (cursor2.isNull(iOooO00o8) && cursor2.isNull(iOooO00o9) && cursor2.isNull(iOooO00o10) && cursor2.isNull(iOooO00o11)) {
                    if (!cursor2.isNull(iOooO00o12)) {
                        iOooO00o12 = iOooO00o12;
                        i = iOooO00o;
                        i2 = i24;
                        iOooO00o13 = iOooO00o13;
                    } else if (cursor2.isNull(iOooO00o13)) {
                        i = iOooO00o;
                        i2 = i24;
                        if (cursor2.isNull(i2)) {
                            i3 = iOooO00o2;
                            i4 = iOooO00o15;
                            if (cursor2.isNull(i4)) {
                                i5 = iOooO00o3;
                                i6 = iOooO00o16;
                                if (cursor2.isNull(i6)) {
                                    i7 = iOooO00o4;
                                    i8 = iOooO00o17;
                                    if (cursor2.isNull(i8)) {
                                        i9 = iOooO00o5;
                                        i10 = iOooO00o18;
                                        if (cursor2.isNull(i10)) {
                                            i11 = iOooO00o6;
                                            i12 = iOooO00o19;
                                            if (cursor2.isNull(i12)) {
                                                i13 = iOooO00o7;
                                                i14 = iOooO00o20;
                                                if (cursor2.isNull(i14)) {
                                                    arrayList = arrayList2;
                                                    i15 = iOooO00o21;
                                                    if (cursor2.isNull(i15)) {
                                                        friend2 = friend;
                                                        int i25 = iOooO00o22;
                                                        if (cursor2.isNull(i25)) {
                                                            iOooO00o22 = i25;
                                                            int i26 = iOooO00o23;
                                                            if (cursor2.isNull(i26)) {
                                                                iOooO00o23 = i26;
                                                                int i27 = iOooO00o24;
                                                                if (cursor2.isNull(i27)) {
                                                                    iOooO00o24 = i27;
                                                                    int i28 = iOooO00o25;
                                                                    if (cursor2.isNull(i28)) {
                                                                        iOooO00o25 = i28;
                                                                        int i29 = iOooO00o26;
                                                                        if (cursor2.isNull(i29)) {
                                                                            iOooO00o26 = i29;
                                                                            int i30 = iOooO00o27;
                                                                            if (cursor2.isNull(i30)) {
                                                                                iOooO00o27 = i30;
                                                                                int i31 = iOooO00o28;
                                                                                if (cursor2.isNull(i31)) {
                                                                                    iOooO00o28 = i31;
                                                                                    int i32 = iOooO00o29;
                                                                                    if (cursor2.isNull(i32)) {
                                                                                        iOooO00o29 = i32;
                                                                                        int i33 = iOooO00o30;
                                                                                        if (cursor2.isNull(i33)) {
                                                                                            iOooO00o30 = i33;
                                                                                            int i34 = iOooO00o31;
                                                                                            if (cursor2.isNull(i34)) {
                                                                                                iOooO00o31 = i34;
                                                                                                int i35 = iOooO00o32;
                                                                                                if (cursor2.isNull(i35)) {
                                                                                                    iOooO00o32 = i35;
                                                                                                    int i36 = iOooO00o33;
                                                                                                    if (cursor2.isNull(i36)) {
                                                                                                        iOooO00o33 = i36;
                                                                                                        int i37 = iOooO00o34;
                                                                                                        if (cursor2.isNull(i37)) {
                                                                                                            iOooO00o12 = iOooO00o12;
                                                                                                            iOooO00o13 = iOooO00o13;
                                                                                                            i17 = i2;
                                                                                                            i22 = i37;
                                                                                                            i16 = iOooO00o22;
                                                                                                            userInfo = null;
                                                                                                            i19 = i4;
                                                                                                            i18 = i6;
                                                                                                            i20 = iOooO00o31;
                                                                                                            i21 = iOooO00o33;
                                                                                                        } else {
                                                                                                            iOooO00o12 = iOooO00o12;
                                                                                                            iOooO00o13 = iOooO00o13;
                                                                                                            iOooO00o34 = i37;
                                                                                                        }
                                                                                                        iOooO00o34 = i22;
                                                                                                        ArrayList arrayList3 = arrayList;
                                                                                                        arrayList3.add(new FriendInfo(userInfo, friend2));
                                                                                                        cursor2 = cursor;
                                                                                                        iOooO00o33 = i21;
                                                                                                        iOooO00o31 = i20;
                                                                                                        iOooO00o20 = i14;
                                                                                                        iOooO00o21 = i15;
                                                                                                        iOooO00o3 = i5;
                                                                                                        iOooO00o7 = i13;
                                                                                                        iOooO00o15 = i19;
                                                                                                        iOooO00o2 = i3;
                                                                                                        i24 = i17;
                                                                                                        iOooO00o22 = i16;
                                                                                                        arrayList2 = arrayList3;
                                                                                                        iOooO00o19 = i12;
                                                                                                        iOooO00o6 = i11;
                                                                                                        iOooO00o = i;
                                                                                                        iOooO00o18 = i10;
                                                                                                        iOooO00o5 = i9;
                                                                                                        iOooO00o17 = i8;
                                                                                                        iOooO00o4 = i7;
                                                                                                        iOooO00o16 = i18;
                                                                                                    } else {
                                                                                                        iOooO00o12 = iOooO00o12;
                                                                                                        iOooO00o13 = iOooO00o13;
                                                                                                        iOooO00o33 = i36;
                                                                                                    }
                                                                                                } else {
                                                                                                    iOooO00o12 = iOooO00o12;
                                                                                                    iOooO00o13 = iOooO00o13;
                                                                                                    iOooO00o32 = i35;
                                                                                                }
                                                                                            } else {
                                                                                                iOooO00o12 = iOooO00o12;
                                                                                                iOooO00o13 = iOooO00o13;
                                                                                                iOooO00o31 = i34;
                                                                                            }
                                                                                        } else {
                                                                                            iOooO00o12 = iOooO00o12;
                                                                                            iOooO00o13 = iOooO00o13;
                                                                                            iOooO00o30 = i33;
                                                                                        }
                                                                                    } else {
                                                                                        iOooO00o12 = iOooO00o12;
                                                                                        iOooO00o13 = iOooO00o13;
                                                                                        iOooO00o29 = i32;
                                                                                    }
                                                                                } else {
                                                                                    iOooO00o12 = iOooO00o12;
                                                                                    iOooO00o13 = iOooO00o13;
                                                                                    iOooO00o28 = i31;
                                                                                }
                                                                            } else {
                                                                                iOooO00o12 = iOooO00o12;
                                                                                iOooO00o13 = iOooO00o13;
                                                                                iOooO00o27 = i30;
                                                                            }
                                                                        } else {
                                                                            iOooO00o12 = iOooO00o12;
                                                                            iOooO00o13 = iOooO00o13;
                                                                            iOooO00o26 = i29;
                                                                        }
                                                                    } else {
                                                                        iOooO00o12 = iOooO00o12;
                                                                        iOooO00o13 = iOooO00o13;
                                                                        iOooO00o25 = i28;
                                                                    }
                                                                } else {
                                                                    iOooO00o12 = iOooO00o12;
                                                                    iOooO00o13 = iOooO00o13;
                                                                    iOooO00o24 = i27;
                                                                }
                                                            } else {
                                                                iOooO00o12 = iOooO00o12;
                                                                iOooO00o13 = iOooO00o13;
                                                                iOooO00o23 = i26;
                                                            }
                                                        } else {
                                                            iOooO00o12 = iOooO00o12;
                                                            iOooO00o13 = iOooO00o13;
                                                            iOooO00o22 = i25;
                                                        }
                                                    }
                                                    userInfo = new UserInfo();
                                                    int i38 = i12;
                                                    int i39 = i14;
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
                                                    if (cursor2.isNull(iOooO00o12)) {
                                                        string3 = null;
                                                    } else {
                                                        string3 = cursor2.getString(iOooO00o12);
                                                    }
                                                    userInfo.setUserHeader(string3);
                                                    if (cursor2.isNull(iOooO00o13)) {
                                                        string4 = null;
                                                    } else {
                                                        string4 = cursor2.getString(iOooO00o13);
                                                    }
                                                    userInfo.setUserHeaderFrame(string4);
                                                    if (cursor2.isNull(i2)) {
                                                        string5 = null;
                                                    } else {
                                                        string5 = cursor2.getString(i2);
                                                    }
                                                    userInfo.setBackground(string5);
                                                    userInfo.setUserLevel(cursor2.getInt(i4));
                                                    userInfo.setSex(cursor2.getInt(i6));
                                                    if (cursor2.isNull(i8)) {
                                                        string6 = null;
                                                    } else {
                                                        string6 = cursor2.getString(i8);
                                                    }
                                                    userInfo.setBio(string6);
                                                    if (cursor2.isNull(i10)) {
                                                        string7 = null;
                                                    } else {
                                                        string7 = cursor2.getString(i10);
                                                    }
                                                    userInfo.setBirthday(string7);
                                                    i12 = i38;
                                                    userInfo.setAge(cursor2.getInt(i12));
                                                    i17 = i2;
                                                    i14 = i39;
                                                    userInfo.setCountryId(cursor2.getInt(i14));
                                                    userInfo.setRegion(cursor2.getInt(i15));
                                                    i16 = iOooO00o22;
                                                    if (cursor2.isNull(i16)) {
                                                        string8 = null;
                                                    } else {
                                                        string8 = cursor2.getString(i16);
                                                    }
                                                    userInfo.setMedal(string8);
                                                    i19 = i4;
                                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                                    userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                                    userInfo.setRole(cursor2.getInt(iOooO00o27));
                                                    int i40 = iOooO00o28;
                                                    userInfo.setRegTime(cursor2.getInt(i40));
                                                    int i41 = iOooO00o29;
                                                    iOooO00o29 = i41;
                                                    iOooO00o28 = i40;
                                                    i18 = i6;
                                                    userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i41) ? null : cursor2.getString(i41)));
                                                    i23 = iOooO00o30;
                                                    if (cursor2.getInt(i23) != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    userInfo.setPremium(z);
                                                    iOooO00o30 = i23;
                                                    i20 = iOooO00o31;
                                                    userInfo.setPremiumLevel(cursor2.getInt(i20));
                                                    userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                                    i21 = iOooO00o33;
                                                    userInfo.setVipLevel(cursor2.getInt(i21));
                                                    i22 = iOooO00o34;
                                                    if (cursor2.getInt(i22) != 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    userInfo.setShowVIP(z2);
                                                    iOooO00o34 = i22;
                                                    ArrayList arrayList4 = arrayList;
                                                    arrayList4.add(new FriendInfo(userInfo, friend2));
                                                    cursor2 = cursor;
                                                    iOooO00o33 = i21;
                                                    iOooO00o31 = i20;
                                                    iOooO00o20 = i14;
                                                    iOooO00o21 = i15;
                                                    iOooO00o3 = i5;
                                                    iOooO00o7 = i13;
                                                    iOooO00o15 = i19;
                                                    iOooO00o2 = i3;
                                                    i24 = i17;
                                                    iOooO00o22 = i16;
                                                    arrayList2 = arrayList4;
                                                    iOooO00o19 = i12;
                                                    iOooO00o6 = i11;
                                                    iOooO00o = i;
                                                    iOooO00o18 = i10;
                                                    iOooO00o5 = i9;
                                                    iOooO00o17 = i8;
                                                    iOooO00o4 = i7;
                                                    iOooO00o16 = i18;
                                                }
                                                iOooO00o12 = iOooO00o12;
                                                iOooO00o13 = iOooO00o13;
                                                friend2 = friend;
                                                userInfo = new UserInfo();
                                                int i310 = i12;
                                                int i311 = i14;
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
                                                if (cursor2.isNull(iOooO00o12)) {
                                                    string3 = null;
                                                } else {
                                                    string3 = cursor2.getString(iOooO00o12);
                                                }
                                                userInfo.setUserHeader(string3);
                                                if (cursor2.isNull(iOooO00o13)) {
                                                    string4 = null;
                                                } else {
                                                    string4 = cursor2.getString(iOooO00o13);
                                                }
                                                userInfo.setUserHeaderFrame(string4);
                                                if (cursor2.isNull(i2)) {
                                                    string5 = null;
                                                } else {
                                                    string5 = cursor2.getString(i2);
                                                }
                                                userInfo.setBackground(string5);
                                                userInfo.setUserLevel(cursor2.getInt(i4));
                                                userInfo.setSex(cursor2.getInt(i6));
                                                if (cursor2.isNull(i8)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = cursor2.getString(i8);
                                                }
                                                userInfo.setBio(string6);
                                                if (cursor2.isNull(i10)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = cursor2.getString(i10);
                                                }
                                                userInfo.setBirthday(string7);
                                                i12 = i310;
                                                userInfo.setAge(cursor2.getInt(i12));
                                                i17 = i2;
                                                i14 = i311;
                                                userInfo.setCountryId(cursor2.getInt(i14));
                                                userInfo.setRegion(cursor2.getInt(i15));
                                                i16 = iOooO00o22;
                                                if (cursor2.isNull(i16)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = cursor2.getString(i16);
                                                }
                                                userInfo.setMedal(string8);
                                                i19 = i4;
                                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                                userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                                userInfo.setRole(cursor2.getInt(iOooO00o27));
                                                int i42 = iOooO00o28;
                                                userInfo.setRegTime(cursor2.getInt(i42));
                                                int i43 = iOooO00o29;
                                                iOooO00o29 = i43;
                                                iOooO00o28 = i42;
                                                i18 = i6;
                                                userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i43) ? null : cursor2.getString(i43)));
                                                i23 = iOooO00o30;
                                                if (cursor2.getInt(i23) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                userInfo.setPremium(z);
                                                iOooO00o30 = i23;
                                                i20 = iOooO00o31;
                                                userInfo.setPremiumLevel(cursor2.getInt(i20));
                                                userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                                i21 = iOooO00o33;
                                                userInfo.setVipLevel(cursor2.getInt(i21));
                                                i22 = iOooO00o34;
                                                if (cursor2.getInt(i22) != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                userInfo.setShowVIP(z2);
                                                iOooO00o34 = i22;
                                                ArrayList arrayList5 = arrayList;
                                                arrayList5.add(new FriendInfo(userInfo, friend2));
                                                cursor2 = cursor;
                                                iOooO00o33 = i21;
                                                iOooO00o31 = i20;
                                                iOooO00o20 = i14;
                                                iOooO00o21 = i15;
                                                iOooO00o3 = i5;
                                                iOooO00o7 = i13;
                                                iOooO00o15 = i19;
                                                iOooO00o2 = i3;
                                                i24 = i17;
                                                iOooO00o22 = i16;
                                                arrayList2 = arrayList5;
                                                iOooO00o19 = i12;
                                                iOooO00o6 = i11;
                                                iOooO00o = i;
                                                iOooO00o18 = i10;
                                                iOooO00o5 = i9;
                                                iOooO00o17 = i8;
                                                iOooO00o4 = i7;
                                                iOooO00o16 = i18;
                                            }
                                            iOooO00o12 = iOooO00o12;
                                            iOooO00o13 = iOooO00o13;
                                            arrayList = arrayList2;
                                            i15 = iOooO00o21;
                                            iOooO00o12 = iOooO00o12;
                                            iOooO00o13 = iOooO00o13;
                                            friend2 = friend;
                                            userInfo = new UserInfo();
                                            int i312 = i12;
                                            int i313 = i14;
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
                                            if (cursor2.isNull(iOooO00o12)) {
                                                string3 = null;
                                            } else {
                                                string3 = cursor2.getString(iOooO00o12);
                                            }
                                            userInfo.setUserHeader(string3);
                                            if (cursor2.isNull(iOooO00o13)) {
                                                string4 = null;
                                            } else {
                                                string4 = cursor2.getString(iOooO00o13);
                                            }
                                            userInfo.setUserHeaderFrame(string4);
                                            if (cursor2.isNull(i2)) {
                                                string5 = null;
                                            } else {
                                                string5 = cursor2.getString(i2);
                                            }
                                            userInfo.setBackground(string5);
                                            userInfo.setUserLevel(cursor2.getInt(i4));
                                            userInfo.setSex(cursor2.getInt(i6));
                                            if (cursor2.isNull(i8)) {
                                                string6 = null;
                                            } else {
                                                string6 = cursor2.getString(i8);
                                            }
                                            userInfo.setBio(string6);
                                            if (cursor2.isNull(i10)) {
                                                string7 = null;
                                            } else {
                                                string7 = cursor2.getString(i10);
                                            }
                                            userInfo.setBirthday(string7);
                                            i12 = i312;
                                            userInfo.setAge(cursor2.getInt(i12));
                                            i17 = i2;
                                            i14 = i313;
                                            userInfo.setCountryId(cursor2.getInt(i14));
                                            userInfo.setRegion(cursor2.getInt(i15));
                                            i16 = iOooO00o22;
                                            if (cursor2.isNull(i16)) {
                                                string8 = null;
                                            } else {
                                                string8 = cursor2.getString(i16);
                                            }
                                            userInfo.setMedal(string8);
                                            i19 = i4;
                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                            userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                            userInfo.setRole(cursor2.getInt(iOooO00o27));
                                            int i44 = iOooO00o28;
                                            userInfo.setRegTime(cursor2.getInt(i44));
                                            int i45 = iOooO00o29;
                                            iOooO00o29 = i45;
                                            iOooO00o28 = i44;
                                            i18 = i6;
                                            userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i45) ? null : cursor2.getString(i45)));
                                            i23 = iOooO00o30;
                                            if (cursor2.getInt(i23) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            userInfo.setPremium(z);
                                            iOooO00o30 = i23;
                                            i20 = iOooO00o31;
                                            userInfo.setPremiumLevel(cursor2.getInt(i20));
                                            userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                            i21 = iOooO00o33;
                                            userInfo.setVipLevel(cursor2.getInt(i21));
                                            i22 = iOooO00o34;
                                            if (cursor2.getInt(i22) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            userInfo.setShowVIP(z2);
                                            iOooO00o34 = i22;
                                            ArrayList arrayList6 = arrayList;
                                            arrayList6.add(new FriendInfo(userInfo, friend2));
                                            cursor2 = cursor;
                                            iOooO00o33 = i21;
                                            iOooO00o31 = i20;
                                            iOooO00o20 = i14;
                                            iOooO00o21 = i15;
                                            iOooO00o3 = i5;
                                            iOooO00o7 = i13;
                                            iOooO00o15 = i19;
                                            iOooO00o2 = i3;
                                            i24 = i17;
                                            iOooO00o22 = i16;
                                            arrayList2 = arrayList6;
                                            iOooO00o19 = i12;
                                            iOooO00o6 = i11;
                                            iOooO00o = i;
                                            iOooO00o18 = i10;
                                            iOooO00o5 = i9;
                                            iOooO00o17 = i8;
                                            iOooO00o4 = i7;
                                            iOooO00o16 = i18;
                                        }
                                        iOooO00o12 = iOooO00o12;
                                        iOooO00o13 = iOooO00o13;
                                        i13 = iOooO00o7;
                                        i14 = iOooO00o20;
                                        iOooO00o12 = iOooO00o12;
                                        iOooO00o13 = iOooO00o13;
                                        arrayList = arrayList2;
                                        i15 = iOooO00o21;
                                        iOooO00o12 = iOooO00o12;
                                        iOooO00o13 = iOooO00o13;
                                        friend2 = friend;
                                        userInfo = new UserInfo();
                                        int i314 = i12;
                                        int i315 = i14;
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
                                        if (cursor2.isNull(iOooO00o12)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursor2.getString(iOooO00o12);
                                        }
                                        userInfo.setUserHeader(string3);
                                        if (cursor2.isNull(iOooO00o13)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursor2.getString(iOooO00o13);
                                        }
                                        userInfo.setUserHeaderFrame(string4);
                                        if (cursor2.isNull(i2)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursor2.getString(i2);
                                        }
                                        userInfo.setBackground(string5);
                                        userInfo.setUserLevel(cursor2.getInt(i4));
                                        userInfo.setSex(cursor2.getInt(i6));
                                        if (cursor2.isNull(i8)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursor2.getString(i8);
                                        }
                                        userInfo.setBio(string6);
                                        if (cursor2.isNull(i10)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursor2.getString(i10);
                                        }
                                        userInfo.setBirthday(string7);
                                        i12 = i314;
                                        userInfo.setAge(cursor2.getInt(i12));
                                        i17 = i2;
                                        i14 = i315;
                                        userInfo.setCountryId(cursor2.getInt(i14));
                                        userInfo.setRegion(cursor2.getInt(i15));
                                        i16 = iOooO00o22;
                                        if (cursor2.isNull(i16)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursor2.getString(i16);
                                        }
                                        userInfo.setMedal(string8);
                                        i19 = i4;
                                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                        userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                        userInfo.setRole(cursor2.getInt(iOooO00o27));
                                        int i46 = iOooO00o28;
                                        userInfo.setRegTime(cursor2.getInt(i46));
                                        int i47 = iOooO00o29;
                                        iOooO00o29 = i47;
                                        iOooO00o28 = i46;
                                        i18 = i6;
                                        userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i47) ? null : cursor2.getString(i47)));
                                        i23 = iOooO00o30;
                                        if (cursor2.getInt(i23) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        userInfo.setPremium(z);
                                        iOooO00o30 = i23;
                                        i20 = iOooO00o31;
                                        userInfo.setPremiumLevel(cursor2.getInt(i20));
                                        userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                        i21 = iOooO00o33;
                                        userInfo.setVipLevel(cursor2.getInt(i21));
                                        i22 = iOooO00o34;
                                        if (cursor2.getInt(i22) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        userInfo.setShowVIP(z2);
                                        iOooO00o34 = i22;
                                        ArrayList arrayList7 = arrayList;
                                        arrayList7.add(new FriendInfo(userInfo, friend2));
                                        cursor2 = cursor;
                                        iOooO00o33 = i21;
                                        iOooO00o31 = i20;
                                        iOooO00o20 = i14;
                                        iOooO00o21 = i15;
                                        iOooO00o3 = i5;
                                        iOooO00o7 = i13;
                                        iOooO00o15 = i19;
                                        iOooO00o2 = i3;
                                        i24 = i17;
                                        iOooO00o22 = i16;
                                        arrayList2 = arrayList7;
                                        iOooO00o19 = i12;
                                        iOooO00o6 = i11;
                                        iOooO00o = i;
                                        iOooO00o18 = i10;
                                        iOooO00o5 = i9;
                                        iOooO00o17 = i8;
                                        iOooO00o4 = i7;
                                        iOooO00o16 = i18;
                                    }
                                    iOooO00o12 = iOooO00o12;
                                    iOooO00o13 = iOooO00o13;
                                    i11 = iOooO00o6;
                                    i12 = iOooO00o19;
                                    iOooO00o12 = iOooO00o12;
                                    iOooO00o13 = iOooO00o13;
                                    i13 = iOooO00o7;
                                    i14 = iOooO00o20;
                                    iOooO00o12 = iOooO00o12;
                                    iOooO00o13 = iOooO00o13;
                                    arrayList = arrayList2;
                                    i15 = iOooO00o21;
                                    iOooO00o12 = iOooO00o12;
                                    iOooO00o13 = iOooO00o13;
                                    friend2 = friend;
                                    userInfo = new UserInfo();
                                    int i316 = i12;
                                    int i317 = i14;
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
                                    if (cursor2.isNull(iOooO00o12)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursor2.getString(iOooO00o12);
                                    }
                                    userInfo.setUserHeader(string3);
                                    if (cursor2.isNull(iOooO00o13)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursor2.getString(iOooO00o13);
                                    }
                                    userInfo.setUserHeaderFrame(string4);
                                    if (cursor2.isNull(i2)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursor2.getString(i2);
                                    }
                                    userInfo.setBackground(string5);
                                    userInfo.setUserLevel(cursor2.getInt(i4));
                                    userInfo.setSex(cursor2.getInt(i6));
                                    if (cursor2.isNull(i8)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursor2.getString(i8);
                                    }
                                    userInfo.setBio(string6);
                                    if (cursor2.isNull(i10)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursor2.getString(i10);
                                    }
                                    userInfo.setBirthday(string7);
                                    i12 = i316;
                                    userInfo.setAge(cursor2.getInt(i12));
                                    i17 = i2;
                                    i14 = i317;
                                    userInfo.setCountryId(cursor2.getInt(i14));
                                    userInfo.setRegion(cursor2.getInt(i15));
                                    i16 = iOooO00o22;
                                    if (cursor2.isNull(i16)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursor2.getString(i16);
                                    }
                                    userInfo.setMedal(string8);
                                    i19 = i4;
                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                    userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                    userInfo.setRole(cursor2.getInt(iOooO00o27));
                                    int i48 = iOooO00o28;
                                    userInfo.setRegTime(cursor2.getInt(i48));
                                    int i49 = iOooO00o29;
                                    iOooO00o29 = i49;
                                    iOooO00o28 = i48;
                                    i18 = i6;
                                    userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i49) ? null : cursor2.getString(i49)));
                                    i23 = iOooO00o30;
                                    if (cursor2.getInt(i23) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    userInfo.setPremium(z);
                                    iOooO00o30 = i23;
                                    i20 = iOooO00o31;
                                    userInfo.setPremiumLevel(cursor2.getInt(i20));
                                    userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                    i21 = iOooO00o33;
                                    userInfo.setVipLevel(cursor2.getInt(i21));
                                    i22 = iOooO00o34;
                                    if (cursor2.getInt(i22) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    userInfo.setShowVIP(z2);
                                    iOooO00o34 = i22;
                                    ArrayList arrayList8 = arrayList;
                                    arrayList8.add(new FriendInfo(userInfo, friend2));
                                    cursor2 = cursor;
                                    iOooO00o33 = i21;
                                    iOooO00o31 = i20;
                                    iOooO00o20 = i14;
                                    iOooO00o21 = i15;
                                    iOooO00o3 = i5;
                                    iOooO00o7 = i13;
                                    iOooO00o15 = i19;
                                    iOooO00o2 = i3;
                                    i24 = i17;
                                    iOooO00o22 = i16;
                                    arrayList2 = arrayList8;
                                    iOooO00o19 = i12;
                                    iOooO00o6 = i11;
                                    iOooO00o = i;
                                    iOooO00o18 = i10;
                                    iOooO00o5 = i9;
                                    iOooO00o17 = i8;
                                    iOooO00o4 = i7;
                                    iOooO00o16 = i18;
                                }
                                iOooO00o12 = iOooO00o12;
                                iOooO00o13 = iOooO00o13;
                                i9 = iOooO00o5;
                                i10 = iOooO00o18;
                                iOooO00o12 = iOooO00o12;
                                iOooO00o13 = iOooO00o13;
                                i11 = iOooO00o6;
                                i12 = iOooO00o19;
                                iOooO00o12 = iOooO00o12;
                                iOooO00o13 = iOooO00o13;
                                i13 = iOooO00o7;
                                i14 = iOooO00o20;
                                iOooO00o12 = iOooO00o12;
                                iOooO00o13 = iOooO00o13;
                                arrayList = arrayList2;
                                i15 = iOooO00o21;
                                iOooO00o12 = iOooO00o12;
                                iOooO00o13 = iOooO00o13;
                                friend2 = friend;
                                userInfo = new UserInfo();
                                int i318 = i12;
                                int i319 = i14;
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
                                if (cursor2.isNull(iOooO00o12)) {
                                    string3 = null;
                                } else {
                                    string3 = cursor2.getString(iOooO00o12);
                                }
                                userInfo.setUserHeader(string3);
                                if (cursor2.isNull(iOooO00o13)) {
                                    string4 = null;
                                } else {
                                    string4 = cursor2.getString(iOooO00o13);
                                }
                                userInfo.setUserHeaderFrame(string4);
                                if (cursor2.isNull(i2)) {
                                    string5 = null;
                                } else {
                                    string5 = cursor2.getString(i2);
                                }
                                userInfo.setBackground(string5);
                                userInfo.setUserLevel(cursor2.getInt(i4));
                                userInfo.setSex(cursor2.getInt(i6));
                                if (cursor2.isNull(i8)) {
                                    string6 = null;
                                } else {
                                    string6 = cursor2.getString(i8);
                                }
                                userInfo.setBio(string6);
                                if (cursor2.isNull(i10)) {
                                    string7 = null;
                                } else {
                                    string7 = cursor2.getString(i10);
                                }
                                userInfo.setBirthday(string7);
                                i12 = i318;
                                userInfo.setAge(cursor2.getInt(i12));
                                i17 = i2;
                                i14 = i319;
                                userInfo.setCountryId(cursor2.getInt(i14));
                                userInfo.setRegion(cursor2.getInt(i15));
                                i16 = iOooO00o22;
                                if (cursor2.isNull(i16)) {
                                    string8 = null;
                                } else {
                                    string8 = cursor2.getString(i16);
                                }
                                userInfo.setMedal(string8);
                                i19 = i4;
                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                                userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                                userInfo.setRole(cursor2.getInt(iOooO00o27));
                                int i410 = iOooO00o28;
                                userInfo.setRegTime(cursor2.getInt(i410));
                                int i411 = iOooO00o29;
                                iOooO00o29 = i411;
                                iOooO00o28 = i410;
                                i18 = i6;
                                userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i411) ? null : cursor2.getString(i411)));
                                i23 = iOooO00o30;
                                if (cursor2.getInt(i23) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                userInfo.setPremium(z);
                                iOooO00o30 = i23;
                                i20 = iOooO00o31;
                                userInfo.setPremiumLevel(cursor2.getInt(i20));
                                userInfo.setVipState(cursor2.getInt(iOooO00o32));
                                i21 = iOooO00o33;
                                userInfo.setVipLevel(cursor2.getInt(i21));
                                i22 = iOooO00o34;
                                if (cursor2.getInt(i22) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                userInfo.setShowVIP(z2);
                                iOooO00o34 = i22;
                                ArrayList arrayList9 = arrayList;
                                arrayList9.add(new FriendInfo(userInfo, friend2));
                                cursor2 = cursor;
                                iOooO00o33 = i21;
                                iOooO00o31 = i20;
                                iOooO00o20 = i14;
                                iOooO00o21 = i15;
                                iOooO00o3 = i5;
                                iOooO00o7 = i13;
                                iOooO00o15 = i19;
                                iOooO00o2 = i3;
                                i24 = i17;
                                iOooO00o22 = i16;
                                arrayList2 = arrayList9;
                                iOooO00o19 = i12;
                                iOooO00o6 = i11;
                                iOooO00o = i;
                                iOooO00o18 = i10;
                                iOooO00o5 = i9;
                                iOooO00o17 = i8;
                                iOooO00o4 = i7;
                                iOooO00o16 = i18;
                            }
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            i7 = iOooO00o4;
                            i8 = iOooO00o17;
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            i9 = iOooO00o5;
                            i10 = iOooO00o18;
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            i11 = iOooO00o6;
                            i12 = iOooO00o19;
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            i13 = iOooO00o7;
                            i14 = iOooO00o20;
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            arrayList = arrayList2;
                            i15 = iOooO00o21;
                            iOooO00o12 = iOooO00o12;
                            iOooO00o13 = iOooO00o13;
                            friend2 = friend;
                            userInfo = new UserInfo();
                            int i3110 = i12;
                            int i3111 = i14;
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
                            if (cursor2.isNull(iOooO00o12)) {
                                string3 = null;
                            } else {
                                string3 = cursor2.getString(iOooO00o12);
                            }
                            userInfo.setUserHeader(string3);
                            if (cursor2.isNull(iOooO00o13)) {
                                string4 = null;
                            } else {
                                string4 = cursor2.getString(iOooO00o13);
                            }
                            userInfo.setUserHeaderFrame(string4);
                            if (cursor2.isNull(i2)) {
                                string5 = null;
                            } else {
                                string5 = cursor2.getString(i2);
                            }
                            userInfo.setBackground(string5);
                            userInfo.setUserLevel(cursor2.getInt(i4));
                            userInfo.setSex(cursor2.getInt(i6));
                            if (cursor2.isNull(i8)) {
                                string6 = null;
                            } else {
                                string6 = cursor2.getString(i8);
                            }
                            userInfo.setBio(string6);
                            if (cursor2.isNull(i10)) {
                                string7 = null;
                            } else {
                                string7 = cursor2.getString(i10);
                            }
                            userInfo.setBirthday(string7);
                            i12 = i3110;
                            userInfo.setAge(cursor2.getInt(i12));
                            i17 = i2;
                            i14 = i3111;
                            userInfo.setCountryId(cursor2.getInt(i14));
                            userInfo.setRegion(cursor2.getInt(i15));
                            i16 = iOooO00o22;
                            if (cursor2.isNull(i16)) {
                                string8 = null;
                            } else {
                                string8 = cursor2.getString(i16);
                            }
                            userInfo.setMedal(string8);
                            i19 = i4;
                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                            userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                            userInfo.setRole(cursor2.getInt(iOooO00o27));
                            int i412 = iOooO00o28;
                            userInfo.setRegTime(cursor2.getInt(i412));
                            int i413 = iOooO00o29;
                            iOooO00o29 = i413;
                            iOooO00o28 = i412;
                            i18 = i6;
                            userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i413) ? null : cursor2.getString(i413)));
                            i23 = iOooO00o30;
                            if (cursor2.getInt(i23) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            userInfo.setPremium(z);
                            iOooO00o30 = i23;
                            i20 = iOooO00o31;
                            userInfo.setPremiumLevel(cursor2.getInt(i20));
                            userInfo.setVipState(cursor2.getInt(iOooO00o32));
                            i21 = iOooO00o33;
                            userInfo.setVipLevel(cursor2.getInt(i21));
                            i22 = iOooO00o34;
                            if (cursor2.getInt(i22) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            userInfo.setShowVIP(z2);
                            iOooO00o34 = i22;
                            ArrayList arrayList10 = arrayList;
                            arrayList10.add(new FriendInfo(userInfo, friend2));
                            cursor2 = cursor;
                            iOooO00o33 = i21;
                            iOooO00o31 = i20;
                            iOooO00o20 = i14;
                            iOooO00o21 = i15;
                            iOooO00o3 = i5;
                            iOooO00o7 = i13;
                            iOooO00o15 = i19;
                            iOooO00o2 = i3;
                            i24 = i17;
                            iOooO00o22 = i16;
                            arrayList2 = arrayList10;
                            iOooO00o19 = i12;
                            iOooO00o6 = i11;
                            iOooO00o = i;
                            iOooO00o18 = i10;
                            iOooO00o5 = i9;
                            iOooO00o17 = i8;
                            iOooO00o4 = i7;
                            iOooO00o16 = i18;
                        }
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        i5 = iOooO00o3;
                        i6 = iOooO00o16;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        i7 = iOooO00o4;
                        i8 = iOooO00o17;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        i9 = iOooO00o5;
                        i10 = iOooO00o18;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        i11 = iOooO00o6;
                        i12 = iOooO00o19;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        i13 = iOooO00o7;
                        i14 = iOooO00o20;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        arrayList = arrayList2;
                        i15 = iOooO00o21;
                        iOooO00o12 = iOooO00o12;
                        iOooO00o13 = iOooO00o13;
                        friend2 = friend;
                        userInfo = new UserInfo();
                        int i3112 = i12;
                        int i3113 = i14;
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
                        if (cursor2.isNull(iOooO00o12)) {
                            string3 = null;
                        } else {
                            string3 = cursor2.getString(iOooO00o12);
                        }
                        userInfo.setUserHeader(string3);
                        if (cursor2.isNull(iOooO00o13)) {
                            string4 = null;
                        } else {
                            string4 = cursor2.getString(iOooO00o13);
                        }
                        userInfo.setUserHeaderFrame(string4);
                        if (cursor2.isNull(i2)) {
                            string5 = null;
                        } else {
                            string5 = cursor2.getString(i2);
                        }
                        userInfo.setBackground(string5);
                        userInfo.setUserLevel(cursor2.getInt(i4));
                        userInfo.setSex(cursor2.getInt(i6));
                        if (cursor2.isNull(i8)) {
                            string6 = null;
                        } else {
                            string6 = cursor2.getString(i8);
                        }
                        userInfo.setBio(string6);
                        if (cursor2.isNull(i10)) {
                            string7 = null;
                        } else {
                            string7 = cursor2.getString(i10);
                        }
                        userInfo.setBirthday(string7);
                        i12 = i3112;
                        userInfo.setAge(cursor2.getInt(i12));
                        i17 = i2;
                        i14 = i3113;
                        userInfo.setCountryId(cursor2.getInt(i14));
                        userInfo.setRegion(cursor2.getInt(i15));
                        i16 = iOooO00o22;
                        if (cursor2.isNull(i16)) {
                            string8 = null;
                        } else {
                            string8 = cursor2.getString(i16);
                        }
                        userInfo.setMedal(string8);
                        i19 = i4;
                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                        userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                        userInfo.setRole(cursor2.getInt(iOooO00o27));
                        int i414 = iOooO00o28;
                        userInfo.setRegTime(cursor2.getInt(i414));
                        int i415 = iOooO00o29;
                        iOooO00o29 = i415;
                        iOooO00o28 = i414;
                        i18 = i6;
                        userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i415) ? null : cursor2.getString(i415)));
                        i23 = iOooO00o30;
                        if (cursor2.getInt(i23) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        userInfo.setPremium(z);
                        iOooO00o30 = i23;
                        i20 = iOooO00o31;
                        userInfo.setPremiumLevel(cursor2.getInt(i20));
                        userInfo.setVipState(cursor2.getInt(iOooO00o32));
                        i21 = iOooO00o33;
                        userInfo.setVipLevel(cursor2.getInt(i21));
                        i22 = iOooO00o34;
                        if (cursor2.getInt(i22) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        userInfo.setShowVIP(z2);
                        iOooO00o34 = i22;
                        ArrayList arrayList11 = arrayList;
                        arrayList11.add(new FriendInfo(userInfo, friend2));
                        cursor2 = cursor;
                        iOooO00o33 = i21;
                        iOooO00o31 = i20;
                        iOooO00o20 = i14;
                        iOooO00o21 = i15;
                        iOooO00o3 = i5;
                        iOooO00o7 = i13;
                        iOooO00o15 = i19;
                        iOooO00o2 = i3;
                        i24 = i17;
                        iOooO00o22 = i16;
                        arrayList2 = arrayList11;
                        iOooO00o19 = i12;
                        iOooO00o6 = i11;
                        iOooO00o = i;
                        iOooO00o18 = i10;
                        iOooO00o5 = i9;
                        iOooO00o17 = i8;
                        iOooO00o4 = i7;
                        iOooO00o16 = i18;
                    }
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i3 = iOooO00o2;
                    i4 = iOooO00o15;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i5 = iOooO00o3;
                    i6 = iOooO00o16;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i7 = iOooO00o4;
                    i8 = iOooO00o17;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i9 = iOooO00o5;
                    i10 = iOooO00o18;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i11 = iOooO00o6;
                    i12 = iOooO00o19;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    i13 = iOooO00o7;
                    i14 = iOooO00o20;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    arrayList = arrayList2;
                    i15 = iOooO00o21;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                    friend2 = friend;
                    userInfo = new UserInfo();
                    int i3114 = i12;
                    int i3115 = i14;
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
                    if (cursor2.isNull(iOooO00o12)) {
                        string3 = null;
                    } else {
                        string3 = cursor2.getString(iOooO00o12);
                    }
                    userInfo.setUserHeader(string3);
                    if (cursor2.isNull(iOooO00o13)) {
                        string4 = null;
                    } else {
                        string4 = cursor2.getString(iOooO00o13);
                    }
                    userInfo.setUserHeaderFrame(string4);
                    if (cursor2.isNull(i2)) {
                        string5 = null;
                    } else {
                        string5 = cursor2.getString(i2);
                    }
                    userInfo.setBackground(string5);
                    userInfo.setUserLevel(cursor2.getInt(i4));
                    userInfo.setSex(cursor2.getInt(i6));
                    if (cursor2.isNull(i8)) {
                        string6 = null;
                    } else {
                        string6 = cursor2.getString(i8);
                    }
                    userInfo.setBio(string6);
                    if (cursor2.isNull(i10)) {
                        string7 = null;
                    } else {
                        string7 = cursor2.getString(i10);
                    }
                    userInfo.setBirthday(string7);
                    i12 = i3114;
                    userInfo.setAge(cursor2.getInt(i12));
                    i17 = i2;
                    i14 = i3115;
                    userInfo.setCountryId(cursor2.getInt(i14));
                    userInfo.setRegion(cursor2.getInt(i15));
                    i16 = iOooO00o22;
                    if (cursor2.isNull(i16)) {
                        string8 = null;
                    } else {
                        string8 = cursor2.getString(i16);
                    }
                    userInfo.setMedal(string8);
                    i19 = i4;
                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                    userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                    userInfo.setRole(cursor2.getInt(iOooO00o27));
                    int i416 = iOooO00o28;
                    userInfo.setRegTime(cursor2.getInt(i416));
                    int i417 = iOooO00o29;
                    iOooO00o29 = i417;
                    iOooO00o28 = i416;
                    i18 = i6;
                    userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i417) ? null : cursor2.getString(i417)));
                    i23 = iOooO00o30;
                    if (cursor2.getInt(i23) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    userInfo.setPremium(z);
                    iOooO00o30 = i23;
                    i20 = iOooO00o31;
                    userInfo.setPremiumLevel(cursor2.getInt(i20));
                    userInfo.setVipState(cursor2.getInt(iOooO00o32));
                    i21 = iOooO00o33;
                    userInfo.setVipLevel(cursor2.getInt(i21));
                    i22 = iOooO00o34;
                    if (cursor2.getInt(i22) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    userInfo.setShowVIP(z2);
                    iOooO00o34 = i22;
                    ArrayList arrayList12 = arrayList;
                    arrayList12.add(new FriendInfo(userInfo, friend2));
                    cursor2 = cursor;
                    iOooO00o33 = i21;
                    iOooO00o31 = i20;
                    iOooO00o20 = i14;
                    iOooO00o21 = i15;
                    iOooO00o3 = i5;
                    iOooO00o7 = i13;
                    iOooO00o15 = i19;
                    iOooO00o2 = i3;
                    i24 = i17;
                    iOooO00o22 = i16;
                    arrayList2 = arrayList12;
                    iOooO00o19 = i12;
                    iOooO00o6 = i11;
                    iOooO00o = i;
                    iOooO00o18 = i10;
                    iOooO00o5 = i9;
                    iOooO00o17 = i8;
                    iOooO00o4 = i7;
                    iOooO00o16 = i18;
                } else {
                    iOooO00o12 = iOooO00o12;
                    iOooO00o13 = iOooO00o13;
                }
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i = iOooO00o;
                i2 = i24;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i3 = iOooO00o2;
                i4 = iOooO00o15;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i5 = iOooO00o3;
                i6 = iOooO00o16;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i7 = iOooO00o4;
                i8 = iOooO00o17;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i9 = iOooO00o5;
                i10 = iOooO00o18;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i11 = iOooO00o6;
                i12 = iOooO00o19;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                i13 = iOooO00o7;
                i14 = iOooO00o20;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                arrayList = arrayList2;
                i15 = iOooO00o21;
                iOooO00o12 = iOooO00o12;
                iOooO00o13 = iOooO00o13;
                friend2 = friend;
                userInfo = new UserInfo();
                int i3116 = i12;
                int i3117 = i14;
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
                if (cursor2.isNull(iOooO00o12)) {
                    string3 = null;
                } else {
                    string3 = cursor2.getString(iOooO00o12);
                }
                userInfo.setUserHeader(string3);
                if (cursor2.isNull(iOooO00o13)) {
                    string4 = null;
                } else {
                    string4 = cursor2.getString(iOooO00o13);
                }
                userInfo.setUserHeaderFrame(string4);
                if (cursor2.isNull(i2)) {
                    string5 = null;
                } else {
                    string5 = cursor2.getString(i2);
                }
                userInfo.setBackground(string5);
                userInfo.setUserLevel(cursor2.getInt(i4));
                userInfo.setSex(cursor2.getInt(i6));
                if (cursor2.isNull(i8)) {
                    string6 = null;
                } else {
                    string6 = cursor2.getString(i8);
                }
                userInfo.setBio(string6);
                if (cursor2.isNull(i10)) {
                    string7 = null;
                } else {
                    string7 = cursor2.getString(i10);
                }
                userInfo.setBirthday(string7);
                i12 = i3116;
                userInfo.setAge(cursor2.getInt(i12));
                i17 = i2;
                i14 = i3117;
                userInfo.setCountryId(cursor2.getInt(i14));
                userInfo.setRegion(cursor2.getInt(i15));
                i16 = iOooO00o22;
                if (cursor2.isNull(i16)) {
                    string8 = null;
                } else {
                    string8 = cursor2.getString(i16);
                }
                userInfo.setMedal(string8);
                i19 = i4;
                userInfo.setVisitorNum(cursor2.getInt(iOooO00o23));
                userInfo.setFollowedNum(cursor2.getInt(iOooO00o24));
                userInfo.setFansNum(cursor2.getInt(iOooO00o25));
                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o26));
                userInfo.setRole(cursor2.getInt(iOooO00o27));
                int i418 = iOooO00o28;
                userInfo.setRegTime(cursor2.getInt(i418));
                int i419 = iOooO00o29;
                iOooO00o29 = i419;
                iOooO00o28 = i418;
                i18 = i6;
                userInfo.setTags(o000oOoO.this.f41053OooOO0.stringToList(cursor2.isNull(i419) ? null : cursor2.getString(i419)));
                i23 = iOooO00o30;
                if (cursor2.getInt(i23) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                userInfo.setPremium(z);
                iOooO00o30 = i23;
                i20 = iOooO00o31;
                userInfo.setPremiumLevel(cursor2.getInt(i20));
                userInfo.setVipState(cursor2.getInt(iOooO00o32));
                i21 = iOooO00o33;
                userInfo.setVipLevel(cursor2.getInt(i21));
                i22 = iOooO00o34;
                if (cursor2.getInt(i22) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                userInfo.setShowVIP(z2);
                iOooO00o34 = i22;
                ArrayList arrayList13 = arrayList;
                arrayList13.add(new FriendInfo(userInfo, friend2));
                cursor2 = cursor;
                iOooO00o33 = i21;
                iOooO00o31 = i20;
                iOooO00o20 = i14;
                iOooO00o21 = i15;
                iOooO00o3 = i5;
                iOooO00o7 = i13;
                iOooO00o15 = i19;
                iOooO00o2 = i3;
                i24 = i17;
                iOooO00o22 = i16;
                arrayList2 = arrayList13;
                iOooO00o19 = i12;
                iOooO00o6 = i11;
                iOooO00o = i;
                iOooO00o18 = i10;
                iOooO00o5 = i9;
                iOooO00o17 = i8;
                iOooO00o4 = i7;
                iOooO00o16 = i18;
            }
            return arrayList2;
        }
    }

    public class OooO0o implements Callable<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41060OooO00o;

        public OooO0o(o0000O0 o0000o1) {
            this.f41060OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws Exception {
            Cursor cursorOooOOO = o000oOoO.this.f41045OooO00o.OooOOO(this.f41060OooO00o);
            try {
                return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : Integer.valueOf(cursorOooOOO.getInt(0));
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f41060OooO00o.release();
        }
    }

    public class OooOO0 extends o000OOo<Friend> {
        public OooOO0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `FriendTable` (`uid`,`friendId`,`memoName`,`time`,`inRoom`,`deleteMark`,`isCheckUserRisk`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, Friend friend) {
            Friend friend2 = friend;
            supportSQLiteStatement.bindLong(1, friend2.getUid());
            supportSQLiteStatement.bindLong(2, friend2.getFriendId());
            if (friend2.getMemoName() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, friend2.getMemoName());
            }
            supportSQLiteStatement.bindLong(4, friend2.getTime());
            supportSQLiteStatement.bindLong(5, friend2.getInRoom() ? 1L : 0L);
            supportSQLiteStatement.bindLong(6, friend2.getDeleteMark() ? 1L : 0L);
            supportSQLiteStatement.bindLong(7, friend2.getIsCheckUserRisk() ? 1L : 0L);
        }
    }

    public class OooOO0O extends o0000OO0 {
        public OooOO0O(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update FriendTable SET isCheckUserRisk = ? Where uid = ? and friendId = ?";
        }
    }

    public class OooOOO extends o0000OO0 {
        public OooOOO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update FriendTable set inRoom = 0 Where uid = ?";
        }
    }

    public class OooOOO0 extends o0000OO0 {
        public OooOOO0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Delete from FriendTable Where uid = ? and friendId = ?";
        }
    }

    public class OooOOOO extends o0000OO0 {
        public OooOOOO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Delete from FriendTable Where uid = ? and deleteMark = 1";
        }
    }

    public class OooOo extends o0000OO0 {
        public OooOo(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update FriendTable set inRoom = ? Where uid = ? and friendId = ?";
        }
    }

    public class OooOo00 extends o0000OO0 {
        public OooOo00(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update FriendTable set deleteMark = 1 Where uid = ?";
        }
    }

    public class Oooo000 extends o0000OO0 {
        public Oooo000(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "Update FriendTable set memoName = ? Where uid = ? and friendId = ?";
        }
    }

    public o000oOoO(RoomDatabase roomDatabase) {
        this.f41045OooO00o = roomDatabase;
        this.f41046OooO0O0 = new OooOO0(roomDatabase);
        this.f41047OooO0OO = new OooOO0O(roomDatabase);
        this.f41048OooO0Oo = new OooOOO0(roomDatabase);
        this.f41050OooO0o0 = new OooOOO(roomDatabase);
        new AtomicBoolean(false);
        this.f41049OooO0o = new OooOOOO(roomDatabase);
        this.f41051OooO0oO = new OooOo00(roomDatabase);
        this.f41052OooO0oo = new OooOo(roomDatabase);
        this.f41044OooO = new Oooo000(roomDatabase);
    }

    @Override // p490o0o00O0.Oooo0
    public final void OooO(List<? extends Friend> list) {
        this.f41045OooO00o.OooO0O0();
        this.f41045OooO00o.OooO0OO();
        try {
            this.f41046OooO0O0.OooO0o(list);
            this.f41045OooO00o.OooOOOO();
        } finally {
            this.f41045OooO00o.OooOO0O();
        }
    }

    @Override // p490o0o00O0.Oooo0
    public final Flow<String> OooO00o(long j, long j2) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select memoName from FriendTable where uid = ? and friendId = ?", 2);
        o0000o0OooO0o.bindLong(1, j);
        o0000o0OooO0o.bindLong(2, j2);
        return o0Oo0oo.OooO00o(this.f41045OooO00o, new String[]{"FriendTable"}, new OooO(o0000o0OooO0o));
    }

    @Override // p490o0o00O0.Oooo0
    public final String OooO0O0(long j, long j2) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select memoName from FriendTable where uid = ? and friendId = ?", 2);
        o0000o0OooO0o.bindLong(1, j);
        o0000o0OooO0o.bindLong(2, j2);
        this.f41045OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41045OooO00o.OooOOO(o0000o0OooO0o);
        try {
            return (!cursorOooOOO.moveToFirst() || cursorOooOOO.isNull(0)) ? null : cursorOooOOO.getString(0);
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p490o0o00O0.Oooo0
    public final void OooO0OO(long j) {
        this.f41045OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41050OooO0o0.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        this.f41045OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41045OooO00o.OooOOOO();
        } finally {
            this.f41045OooO00o.OooOO0O();
            this.f41050OooO0o0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.Oooo0
    public final Friend OooO0Oo(long j, long j2) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendTable Where uid = ? and friendId = ? order by time", 2);
        boolean z = true;
        o0000o0OooO0o.bindLong(1, j);
        o0000o0OooO0o.bindLong(2, j2);
        this.f41045OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41045OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "friendId");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "memoName");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "inRoom");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "deleteMark");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "isCheckUserRisk");
            Friend friend = null;
            String string = null;
            if (cursorOooOOO.moveToFirst()) {
                Friend friend2 = new Friend();
                friend2.setUid(cursorOooOOO.getLong(iOooO00o));
                friend2.setFriendId(cursorOooOOO.getLong(iOooO00o2));
                if (!cursorOooOOO.isNull(iOooO00o3)) {
                    string = cursorOooOOO.getString(iOooO00o3);
                }
                friend2.setMemoName(string);
                friend2.setTime(cursorOooOOO.getLong(iOooO00o4));
                friend2.setInRoom(cursorOooOOO.getInt(iOooO00o5) != 0);
                friend2.setDeleteMark(cursorOooOOO.getInt(iOooO00o6) != 0);
                if (cursorOooOOO.getInt(iOooO00o7) == 0) {
                    z = false;
                }
                friend2.setCheckUserRisk(z);
                friend = friend2;
            }
            return friend;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p490o0o00O0.Oooo0
    public final void OooO0o(Friend friend) {
        this.f41045OooO00o.OooO0O0();
        this.f41045OooO00o.OooO0OO();
        try {
            this.f41046OooO0O0.OooO0oO(friend);
            this.f41045OooO00o.OooOOOO();
        } finally {
            this.f41045OooO00o.OooOO0O();
        }
    }

    @Override // p490o0o00O0.Oooo0
    public final o00O00o0<Integer, FriendInfo> OooO0o0(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendTable inner join UserInfoTable on UserInfoTable.userId = FriendTable.friendId Where FriendTable.uid = ? Order by FriendTable.inRoom DESC, FriendTable.time DESC", 1);
        o0000o0OooO0o.bindLong(1, j);
        return new OooO0O0(o0000o0OooO0o, this.f41045OooO00o, "FriendTable", "UserInfoTable");
    }

    @Override // p490o0o00O0.Oooo0
    public final void OooO0oO(long j) {
        this.f41045OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41049OooO0o.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        this.f41045OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41045OooO00o.OooOOOO();
        } finally {
            this.f41045OooO00o.OooOO0O();
            this.f41049OooO0o.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.Oooo0
    public final void OooO0oo(long j, long j2, boolean z) {
        this.f41045OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41052OooO0oo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        this.f41045OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41045OooO00o.OooOOOO();
        } finally {
            this.f41045OooO00o.OooOO0O();
            this.f41052OooO0oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x034e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0351 A[Catch: all -> 0x04db, TryCatch #0 {all -> 0x04db, blocks: (B:16:0x008f, B:17:0x0144, B:19:0x014a, B:21:0x0154, B:23:0x015a, B:25:0x0160, B:27:0x0166, B:29:0x016c, B:31:0x0172, B:52:0x01d2, B:54:0x01d8, B:56:0x01de, B:58:0x01e4, B:60:0x01ec, B:62:0x01f4, B:64:0x01fa, B:66:0x0204, B:68:0x020e, B:70:0x0218, B:72:0x0222, B:74:0x022c, B:76:0x0236, B:78:0x0240, B:80:0x024a, B:82:0x0254, B:84:0x025e, B:86:0x0268, B:88:0x0272, B:90:0x027c, B:92:0x0286, B:94:0x0290, B:96:0x029a, B:98:0x02a4, B:100:0x02ae, B:102:0x02b8, B:104:0x02c2, B:132:0x0338, B:136:0x0355, B:140:0x036c, B:144:0x037c, B:148:0x038c, B:152:0x039c, B:156:0x03ba, B:160:0x03ca, B:164:0x03fd, B:168:0x0454, B:172:0x046e, B:176:0x049d, B:177:0x04a0, B:167:0x044f, B:163:0x03f5, B:159:0x03c6, B:155:0x03b6, B:151:0x0398, B:147:0x0388, B:143:0x0378, B:139:0x0368, B:135:0x0351, B:35:0x0180, B:39:0x01a4, B:43:0x01b7, B:47:0x01c3, B:51:0x01cf, B:38:0x01a0), top: B:187:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0365  */
    /* JADX WARN: Code duplicated, block: B:139:0x0368 A[Catch: all -> 0x04db, TryCatch #0 {all -> 0x04db, blocks: (B:16:0x008f, B:17:0x0144, B:19:0x014a, B:21:0x0154, B:23:0x015a, B:25:0x0160, B:27:0x0166, B:29:0x016c, B:31:0x0172, B:52:0x01d2, B:54:0x01d8, B:56:0x01de, B:58:0x01e4, B:60:0x01ec, B:62:0x01f4, B:64:0x01fa, B:66:0x0204, B:68:0x020e, B:70:0x0218, B:72:0x0222, B:74:0x022c, B:76:0x0236, B:78:0x0240, B:80:0x024a, B:82:0x0254, B:84:0x025e, B:86:0x0268, B:88:0x0272, B:90:0x027c, B:92:0x0286, B:94:0x0290, B:96:0x029a, B:98:0x02a4, B:100:0x02ae, B:102:0x02b8, B:104:0x02c2, B:132:0x0338, B:136:0x0355, B:140:0x036c, B:144:0x037c, B:148:0x038c, B:152:0x039c, B:156:0x03ba, B:160:0x03ca, B:164:0x03fd, B:168:0x0454, B:172:0x046e, B:176:0x049d, B:177:0x04a0, B:167:0x044f, B:163:0x03f5, B:159:0x03c6, B:155:0x03b6, B:151:0x0398, B:147:0x0388, B:143:0x0378, B:139:0x0368, B:135:0x0351, B:35:0x0180, B:39:0x01a4, B:43:0x01b7, B:47:0x01c3, B:51:0x01cf, B:38:0x01a0), top: B:187:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0375  */
    /* JADX WARN: Code duplicated, block: B:143:0x0378 A[Catch: all -> 0x04db, TryCatch #0 {all -> 0x04db, blocks: (B:16:0x008f, B:17:0x0144, B:19:0x014a, B:21:0x0154, B:23:0x015a, B:25:0x0160, B:27:0x0166, B:29:0x016c, B:31:0x0172, B:52:0x01d2, B:54:0x01d8, B:56:0x01de, B:58:0x01e4, B:60:0x01ec, B:62:0x01f4, B:64:0x01fa, B:66:0x0204, B:68:0x020e, B:70:0x0218, B:72:0x0222, B:74:0x022c, B:76:0x0236, B:78:0x0240, B:80:0x024a, B:82:0x0254, B:84:0x025e, B:86:0x0268, B:88:0x0272, B:90:0x027c, B:92:0x0286, B:94:0x0290, B:96:0x029a, B:98:0x02a4, B:100:0x02ae, B:102:0x02b8, B:104:0x02c2, B:132:0x0338, B:136:0x0355, B:140:0x036c, B:144:0x037c, B:148:0x038c, B:152:0x039c, B:156:0x03ba, B:160:0x03ca, B:164:0x03fd, B:168:0x0454, B:172:0x046e, B:176:0x049d, B:177:0x04a0, B:167:0x044f, B:163:0x03f5, B:159:0x03c6, B:155:0x03b6, B:151:0x0398, B:147:0x0388, B:143:0x0378, B:139:0x0368, B:135:0x0351, B:35:0x0180, B:39:0x01a4, B:43:0x01b7, B:47:0x01c3, B:51:0x01cf, B:38:0x01a0), top: B:187:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0385  */
    /* JADX WARN: Code duplicated, block: B:147:0x0388 A[Catch: all -> 0x04db, TryCatch #0 {all -> 0x04db, blocks: (B:16:0x008f, B:17:0x0144, B:19:0x014a, B:21:0x0154, B:23:0x015a, B:25:0x0160, B:27:0x0166, B:29:0x016c, B:31:0x0172, B:52:0x01d2, B:54:0x01d8, B:56:0x01de, B:58:0x01e4, B:60:0x01ec, B:62:0x01f4, B:64:0x01fa, B:66:0x0204, B:68:0x020e, B:70:0x0218, B:72:0x0222, B:74:0x022c, B:76:0x0236, B:78:0x0240, B:80:0x024a, B:82:0x0254, B:84:0x025e, B:86:0x0268, B:88:0x0272, B:90:0x027c, B:92:0x0286, B:94:0x0290, B:96:0x029a, B:98:0x02a4, B:100:0x02ae, B:102:0x02b8, B:104:0x02c2, B:132:0x0338, B:136:0x0355, B:140:0x036c, B:144:0x037c, B:148:0x038c, B:152:0x039c, B:156:0x03ba, B:160:0x03ca, B:164:0x03fd, B:168:0x0454, B:172:0x046e, B:176:0x049d, B:177:0x04a0, B:167:0x044f, B:163:0x03f5, B:159:0x03c6, B:155:0x03b6, B:151:0x0398, B:147:0x0388, B:143:0x0378, B:139:0x0368, B:135:0x0351, B:35:0x0180, B:39:0x01a4, B:43:0x01b7, B:47:0x01c3, B:51:0x01cf, B:38:0x01a0), top: B:187:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0395  */
    /* JADX WARN: Code duplicated, block: B:151:0x0398 A[Catch: all -> 0x04db, TryCatch #0 {all -> 0x04db, blocks: (B:16:0x008f, B:17:0x0144, B:19:0x014a, B:21:0x0154, B:23:0x015a, B:25:0x0160, B:27:0x0166, B:29:0x016c, B:31:0x0172, B:52:0x01d2, B:54:0x01d8, B:56:0x01de, B:58:0x01e4, B:60:0x01ec, B:62:0x01f4, B:64:0x01fa, B:66:0x0204, B:68:0x020e, B:70:0x0218, B:72:0x0222, B:74:0x022c, B:76:0x0236, B:78:0x0240, B:80:0x024a, B:82:0x0254, B:84:0x025e, B:86:0x0268, B:88:0x0272, B:90:0x027c, B:92:0x0286, B:94:0x0290, B:96:0x029a, B:98:0x02a4, B:100:0x02ae, B:102:0x02b8, B:104:0x02c2, B:132:0x0338, B:136:0x0355, B:140:0x036c, B:144:0x037c, B:148:0x038c, B:152:0x039c, B:156:0x03ba, B:160:0x03ca, B:164:0x03fd, B:168:0x0454, B:172:0x046e, B:176:0x049d, B:177:0x04a0, B:167:0x044f, B:163:0x03f5, B:159:0x03c6, B:155:0x03b6, B:151:0x0398, B:147:0x0388, B:143:0x0378, B:139:0x0368, B:135:0x0351, B:35:0x0180, B:39:0x01a4, B:43:0x01b7, B:47:0x01c3, B:51:0x01cf, B:38:0x01a0), top: B:187:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:154:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:155:0x03b6 A[Catch: all -> 0x04db, TryCatch #0 {all -> 0x04db, blocks: (B:16:0x008f, B:17:0x0144, B:19:0x014a, B:21:0x0154, B:23:0x015a, B:25:0x0160, B:27:0x0166, B:29:0x016c, B:31:0x0172, B:52:0x01d2, B:54:0x01d8, B:56:0x01de, B:58:0x01e4, B:60:0x01ec, B:62:0x01f4, B:64:0x01fa, B:66:0x0204, B:68:0x020e, B:70:0x0218, B:72:0x0222, B:74:0x022c, B:76:0x0236, B:78:0x0240, B:80:0x024a, B:82:0x0254, B:84:0x025e, B:86:0x0268, B:88:0x0272, B:90:0x027c, B:92:0x0286, B:94:0x0290, B:96:0x029a, B:98:0x02a4, B:100:0x02ae, B:102:0x02b8, B:104:0x02c2, B:132:0x0338, B:136:0x0355, B:140:0x036c, B:144:0x037c, B:148:0x038c, B:152:0x039c, B:156:0x03ba, B:160:0x03ca, B:164:0x03fd, B:168:0x0454, B:172:0x046e, B:176:0x049d, B:177:0x04a0, B:167:0x044f, B:163:0x03f5, B:159:0x03c6, B:155:0x03b6, B:151:0x0398, B:147:0x0388, B:143:0x0378, B:139:0x0368, B:135:0x0351, B:35:0x0180, B:39:0x01a4, B:43:0x01b7, B:47:0x01c3, B:51:0x01cf, B:38:0x01a0), top: B:187:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:158:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x03c6 A[Catch: all -> 0x04db, TryCatch #0 {all -> 0x04db, blocks: (B:16:0x008f, B:17:0x0144, B:19:0x014a, B:21:0x0154, B:23:0x015a, B:25:0x0160, B:27:0x0166, B:29:0x016c, B:31:0x0172, B:52:0x01d2, B:54:0x01d8, B:56:0x01de, B:58:0x01e4, B:60:0x01ec, B:62:0x01f4, B:64:0x01fa, B:66:0x0204, B:68:0x020e, B:70:0x0218, B:72:0x0222, B:74:0x022c, B:76:0x0236, B:78:0x0240, B:80:0x024a, B:82:0x0254, B:84:0x025e, B:86:0x0268, B:88:0x0272, B:90:0x027c, B:92:0x0286, B:94:0x0290, B:96:0x029a, B:98:0x02a4, B:100:0x02ae, B:102:0x02b8, B:104:0x02c2, B:132:0x0338, B:136:0x0355, B:140:0x036c, B:144:0x037c, B:148:0x038c, B:152:0x039c, B:156:0x03ba, B:160:0x03ca, B:164:0x03fd, B:168:0x0454, B:172:0x046e, B:176:0x049d, B:177:0x04a0, B:167:0x044f, B:163:0x03f5, B:159:0x03c6, B:155:0x03b6, B:151:0x0398, B:147:0x0388, B:143:0x0378, B:139:0x0368, B:135:0x0351, B:35:0x0180, B:39:0x01a4, B:43:0x01b7, B:47:0x01c3, B:51:0x01cf, B:38:0x01a0), top: B:187:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:162:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:163:0x03f5 A[Catch: all -> 0x04db, TryCatch #0 {all -> 0x04db, blocks: (B:16:0x008f, B:17:0x0144, B:19:0x014a, B:21:0x0154, B:23:0x015a, B:25:0x0160, B:27:0x0166, B:29:0x016c, B:31:0x0172, B:52:0x01d2, B:54:0x01d8, B:56:0x01de, B:58:0x01e4, B:60:0x01ec, B:62:0x01f4, B:64:0x01fa, B:66:0x0204, B:68:0x020e, B:70:0x0218, B:72:0x0222, B:74:0x022c, B:76:0x0236, B:78:0x0240, B:80:0x024a, B:82:0x0254, B:84:0x025e, B:86:0x0268, B:88:0x0272, B:90:0x027c, B:92:0x0286, B:94:0x0290, B:96:0x029a, B:98:0x02a4, B:100:0x02ae, B:102:0x02b8, B:104:0x02c2, B:132:0x0338, B:136:0x0355, B:140:0x036c, B:144:0x037c, B:148:0x038c, B:152:0x039c, B:156:0x03ba, B:160:0x03ca, B:164:0x03fd, B:168:0x0454, B:172:0x046e, B:176:0x049d, B:177:0x04a0, B:167:0x044f, B:163:0x03f5, B:159:0x03c6, B:155:0x03b6, B:151:0x0398, B:147:0x0388, B:143:0x0378, B:139:0x0368, B:135:0x0351, B:35:0x0180, B:39:0x01a4, B:43:0x01b7, B:47:0x01c3, B:51:0x01cf, B:38:0x01a0), top: B:187:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:167:0x044f A[Catch: all -> 0x04db, TryCatch #0 {all -> 0x04db, blocks: (B:16:0x008f, B:17:0x0144, B:19:0x014a, B:21:0x0154, B:23:0x015a, B:25:0x0160, B:27:0x0166, B:29:0x016c, B:31:0x0172, B:52:0x01d2, B:54:0x01d8, B:56:0x01de, B:58:0x01e4, B:60:0x01ec, B:62:0x01f4, B:64:0x01fa, B:66:0x0204, B:68:0x020e, B:70:0x0218, B:72:0x0222, B:74:0x022c, B:76:0x0236, B:78:0x0240, B:80:0x024a, B:82:0x0254, B:84:0x025e, B:86:0x0268, B:88:0x0272, B:90:0x027c, B:92:0x0286, B:94:0x0290, B:96:0x029a, B:98:0x02a4, B:100:0x02ae, B:102:0x02b8, B:104:0x02c2, B:132:0x0338, B:136:0x0355, B:140:0x036c, B:144:0x037c, B:148:0x038c, B:152:0x039c, B:156:0x03ba, B:160:0x03ca, B:164:0x03fd, B:168:0x0454, B:172:0x046e, B:176:0x049d, B:177:0x04a0, B:167:0x044f, B:163:0x03f5, B:159:0x03c6, B:155:0x03b6, B:151:0x0398, B:147:0x0388, B:143:0x0378, B:139:0x0368, B:135:0x0351, B:35:0x0180, B:39:0x01a4, B:43:0x01b7, B:47:0x01c3, B:51:0x01cf, B:38:0x01a0), top: B:187:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:170:0x046b  */
    /* JADX WARN: Code duplicated, block: B:171:0x046d  */
    /* JADX WARN: Code duplicated, block: B:174:0x049a  */
    /* JADX WARN: Code duplicated, block: B:175:0x049c  */
    @Override // p490o0o00O0.Oooo0
    public final List<FriendInfo> OooOO0(long j, String str) throws Throwable {
        o0000O0 o0000o1;
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
        ArrayList arrayList;
        int i15;
        Friend friend2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        UserInfo userInfo;
        int i21;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        int i22;
        boolean z;
        int i23;
        boolean z2;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendTable inner join UserInfoTable on UserInfoTable.userId = FriendTable.friendId Where FriendTable.uid = ? and (FriendTable.memoName like '%' || ? || '%' or UserInfoTable.userName like '%' || ? || '%' or UserInfoTable.userIdx like '%' || ? || '%') Order by FriendTable.inRoom DESC, FriendTable.time DESC", 4);
        o0000o0OooO0o.bindLong(1, j);
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
        if (str == null) {
            o0000o0OooO0o.bindNull(4);
        } else {
            o0000o0OooO0o.bindString(4, str);
        }
        this.f41045OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41045OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "friendId");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "memoName");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "inRoom");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "deleteMark");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "isCheckUserRisk");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "userId");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "userIdx");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "idLevel");
            int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "userName");
            int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "userAvatar");
            int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "userFrame");
            o0000o1 = o0000o0OooO0o;
            try {
                int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "background");
                int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "userLevel");
                int iOooO00o16 = o00O0O.OooO00o(cursorOooOOO, "gender");
                int iOooO00o17 = o00O0O.OooO00o(cursorOooOOO, "bio");
                int iOooO00o18 = o00O0O.OooO00o(cursorOooOOO, "birthday");
                int iOooO00o19 = o00O0O.OooO00o(cursorOooOOO, "age");
                int iOooO00o20 = o00O0O.OooO00o(cursorOooOOO, "countryId");
                int iOooO00o21 = o00O0O.OooO00o(cursorOooOOO, "region");
                int iOooO00o22 = o00O0O.OooO00o(cursorOooOOO, "medal");
                int iOooO00o23 = o00O0O.OooO00o(cursorOooOOO, "visitorNum");
                int iOooO00o24 = o00O0O.OooO00o(cursorOooOOO, "followedNum");
                int iOooO00o25 = o00O0O.OooO00o(cursorOooOOO, "fansNum");
                int iOooO00o26 = o00O0O.OooO00o(cursorOooOOO, "joinRoomNum");
                int iOooO00o27 = o00O0O.OooO00o(cursorOooOOO, "role");
                int iOooO00o28 = o00O0O.OooO00o(cursorOooOOO, "regTime");
                int iOooO00o29 = o00O0O.OooO00o(cursorOooOOO, "tags");
                int iOooO00o30 = o00O0O.OooO00o(cursorOooOOO, "vip");
                int iOooO00o31 = o00O0O.OooO00o(cursorOooOOO, "vipLevel");
                int iOooO00o32 = o00O0O.OooO00o(cursorOooOOO, "kaVipState");
                int iOooO00o33 = o00O0O.OooO00o(cursorOooOOO, "kaVipLevel");
                int iOooO00o34 = o00O0O.OooO00o(cursorOooOOO, "showVIP");
                int i24 = iOooO00o14;
                ArrayList arrayList2 = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    if (cursorOooOOO.isNull(iOooO00o) && cursorOooOOO.isNull(iOooO00o2) && cursorOooOOO.isNull(iOooO00o3) && cursorOooOOO.isNull(iOooO00o4) && cursorOooOOO.isNull(iOooO00o5) && cursorOooOOO.isNull(iOooO00o6) && cursorOooOOO.isNull(iOooO00o7)) {
                        friend = null;
                    } else {
                        friend = new Friend();
                        friend.setUid(cursorOooOOO.getLong(iOooO00o));
                        friend.setFriendId(cursorOooOOO.getLong(iOooO00o2));
                        friend.setMemoName(cursorOooOOO.isNull(iOooO00o3) ? null : cursorOooOOO.getString(iOooO00o3));
                        friend.setTime(cursorOooOOO.getLong(iOooO00o4));
                        friend.setInRoom(cursorOooOOO.getInt(iOooO00o5) != 0);
                        friend.setDeleteMark(cursorOooOOO.getInt(iOooO00o6) != 0);
                        friend.setCheckUserRisk(cursorOooOOO.getInt(iOooO00o7) != 0);
                    }
                    if (cursorOooOOO.isNull(iOooO00o8) && cursorOooOOO.isNull(iOooO00o9) && cursorOooOOO.isNull(iOooO00o10)) {
                        if (!cursorOooOOO.isNull(iOooO00o11)) {
                            iOooO00o11 = iOooO00o11;
                            i = iOooO00o;
                            i2 = i24;
                            iOooO00o12 = iOooO00o12;
                        } else if (cursorOooOOO.isNull(iOooO00o12) && cursorOooOOO.isNull(iOooO00o13)) {
                            i = iOooO00o;
                            i2 = i24;
                            if (cursorOooOOO.isNull(i2)) {
                                i3 = iOooO00o2;
                                i4 = iOooO00o15;
                                if (cursorOooOOO.isNull(i4)) {
                                    i5 = iOooO00o3;
                                    i6 = iOooO00o16;
                                    if (cursorOooOOO.isNull(i6)) {
                                        i7 = iOooO00o4;
                                        i8 = iOooO00o17;
                                        if (cursorOooOOO.isNull(i8)) {
                                            i9 = iOooO00o5;
                                            i10 = iOooO00o18;
                                            if (cursorOooOOO.isNull(i10)) {
                                                i11 = iOooO00o6;
                                                i12 = iOooO00o19;
                                                if (cursorOooOOO.isNull(i12)) {
                                                    i13 = iOooO00o7;
                                                    i14 = iOooO00o20;
                                                    if (cursorOooOOO.isNull(i14)) {
                                                        arrayList = arrayList2;
                                                        i15 = iOooO00o21;
                                                        if (cursorOooOOO.isNull(i15)) {
                                                            friend2 = friend;
                                                            int i25 = iOooO00o22;
                                                            if (cursorOooOOO.isNull(i25)) {
                                                                iOooO00o22 = i25;
                                                                int i26 = iOooO00o23;
                                                                if (cursorOooOOO.isNull(i26)) {
                                                                    iOooO00o23 = i26;
                                                                    int i27 = iOooO00o24;
                                                                    if (cursorOooOOO.isNull(i27)) {
                                                                        iOooO00o24 = i27;
                                                                        int i28 = iOooO00o25;
                                                                        if (cursorOooOOO.isNull(i28)) {
                                                                            iOooO00o25 = i28;
                                                                            int i29 = iOooO00o26;
                                                                            if (cursorOooOOO.isNull(i29)) {
                                                                                iOooO00o26 = i29;
                                                                                int i30 = iOooO00o27;
                                                                                if (cursorOooOOO.isNull(i30)) {
                                                                                    iOooO00o27 = i30;
                                                                                    int i31 = iOooO00o28;
                                                                                    if (cursorOooOOO.isNull(i31)) {
                                                                                        iOooO00o28 = i31;
                                                                                        int i32 = iOooO00o29;
                                                                                        if (cursorOooOOO.isNull(i32)) {
                                                                                            iOooO00o29 = i32;
                                                                                            int i33 = iOooO00o30;
                                                                                            if (cursorOooOOO.isNull(i33)) {
                                                                                                iOooO00o30 = i33;
                                                                                                int i34 = iOooO00o31;
                                                                                                if (cursorOooOOO.isNull(i34)) {
                                                                                                    iOooO00o31 = i34;
                                                                                                    int i35 = iOooO00o32;
                                                                                                    if (cursorOooOOO.isNull(i35)) {
                                                                                                        iOooO00o32 = i35;
                                                                                                        int i36 = iOooO00o33;
                                                                                                        if (cursorOooOOO.isNull(i36)) {
                                                                                                            iOooO00o33 = i36;
                                                                                                            i16 = iOooO00o34;
                                                                                                            if (cursorOooOOO.isNull(i16)) {
                                                                                                                iOooO00o11 = iOooO00o11;
                                                                                                                iOooO00o12 = iOooO00o12;
                                                                                                                i18 = i2;
                                                                                                                iOooO00o34 = i16;
                                                                                                                i17 = iOooO00o22;
                                                                                                                userInfo = null;
                                                                                                                i19 = i15;
                                                                                                                i20 = iOooO00o31;
                                                                                                                i21 = iOooO00o33;
                                                                                                            } else {
                                                                                                                iOooO00o11 = iOooO00o11;
                                                                                                                iOooO00o12 = iOooO00o12;
                                                                                                            }
                                                                                                        } else {
                                                                                                            iOooO00o11 = iOooO00o11;
                                                                                                            iOooO00o12 = iOooO00o12;
                                                                                                            iOooO00o33 = i36;
                                                                                                        }
                                                                                                        iOooO00o33 = i21;
                                                                                                        arrayList2 = arrayList;
                                                                                                        arrayList2.add(new FriendInfo(userInfo, friend2));
                                                                                                        iOooO00o31 = i20;
                                                                                                        iOooO00o20 = i14;
                                                                                                        iOooO00o7 = i13;
                                                                                                        iOooO00o21 = i19;
                                                                                                        iOooO00o13 = iOooO00o13;
                                                                                                        iOooO00o = i;
                                                                                                        iOooO00o22 = i17;
                                                                                                        iOooO00o19 = i12;
                                                                                                        iOooO00o6 = i11;
                                                                                                        iOooO00o18 = i10;
                                                                                                        iOooO00o5 = i9;
                                                                                                        iOooO00o17 = i8;
                                                                                                        iOooO00o4 = i7;
                                                                                                        iOooO00o16 = i6;
                                                                                                        iOooO00o3 = i5;
                                                                                                        iOooO00o15 = i4;
                                                                                                        iOooO00o2 = i3;
                                                                                                        i24 = i18;
                                                                                                    } else {
                                                                                                        iOooO00o11 = iOooO00o11;
                                                                                                        iOooO00o12 = iOooO00o12;
                                                                                                        iOooO00o32 = i35;
                                                                                                    }
                                                                                                } else {
                                                                                                    iOooO00o11 = iOooO00o11;
                                                                                                    iOooO00o12 = iOooO00o12;
                                                                                                    iOooO00o31 = i34;
                                                                                                }
                                                                                            } else {
                                                                                                iOooO00o11 = iOooO00o11;
                                                                                                iOooO00o12 = iOooO00o12;
                                                                                                iOooO00o30 = i33;
                                                                                            }
                                                                                        } else {
                                                                                            iOooO00o11 = iOooO00o11;
                                                                                            iOooO00o12 = iOooO00o12;
                                                                                            iOooO00o29 = i32;
                                                                                        }
                                                                                    } else {
                                                                                        iOooO00o11 = iOooO00o11;
                                                                                        iOooO00o12 = iOooO00o12;
                                                                                        iOooO00o28 = i31;
                                                                                    }
                                                                                } else {
                                                                                    iOooO00o11 = iOooO00o11;
                                                                                    iOooO00o12 = iOooO00o12;
                                                                                    iOooO00o27 = i30;
                                                                                }
                                                                            } else {
                                                                                iOooO00o11 = iOooO00o11;
                                                                                iOooO00o12 = iOooO00o12;
                                                                                iOooO00o26 = i29;
                                                                            }
                                                                        } else {
                                                                            iOooO00o11 = iOooO00o11;
                                                                            iOooO00o12 = iOooO00o12;
                                                                            iOooO00o25 = i28;
                                                                        }
                                                                    } else {
                                                                        iOooO00o11 = iOooO00o11;
                                                                        iOooO00o12 = iOooO00o12;
                                                                        iOooO00o24 = i27;
                                                                    }
                                                                } else {
                                                                    iOooO00o11 = iOooO00o11;
                                                                    iOooO00o12 = iOooO00o12;
                                                                    iOooO00o23 = i26;
                                                                }
                                                            } else {
                                                                iOooO00o11 = iOooO00o11;
                                                                iOooO00o12 = iOooO00o12;
                                                                iOooO00o22 = i25;
                                                            }
                                                            userInfo = new UserInfo();
                                                            int i37 = i12;
                                                            int i38 = i14;
                                                            userInfo.setUserId(cursorOooOOO.getLong(iOooO00o8));
                                                            if (cursorOooOOO.isNull(iOooO00o9)) {
                                                                string = null;
                                                            } else {
                                                                string = cursorOooOOO.getString(iOooO00o9);
                                                            }
                                                            userInfo.setUserIdx(string);
                                                            userInfo.setIdLevel(cursorOooOOO.getInt(iOooO00o10));
                                                            if (cursorOooOOO.isNull(iOooO00o11)) {
                                                                string2 = null;
                                                            } else {
                                                                string2 = cursorOooOOO.getString(iOooO00o11);
                                                            }
                                                            userInfo.setUserName(string2);
                                                            if (cursorOooOOO.isNull(iOooO00o12)) {
                                                                string3 = null;
                                                            } else {
                                                                string3 = cursorOooOOO.getString(iOooO00o12);
                                                            }
                                                            userInfo.setUserHeader(string3);
                                                            if (cursorOooOOO.isNull(iOooO00o13)) {
                                                                string4 = null;
                                                            } else {
                                                                string4 = cursorOooOOO.getString(iOooO00o13);
                                                            }
                                                            userInfo.setUserHeaderFrame(string4);
                                                            if (cursorOooOOO.isNull(i2)) {
                                                                string5 = null;
                                                            } else {
                                                                string5 = cursorOooOOO.getString(i2);
                                                            }
                                                            userInfo.setBackground(string5);
                                                            userInfo.setUserLevel(cursorOooOOO.getInt(i4));
                                                            userInfo.setSex(cursorOooOOO.getInt(i6));
                                                            if (cursorOooOOO.isNull(i8)) {
                                                                string6 = null;
                                                            } else {
                                                                string6 = cursorOooOOO.getString(i8);
                                                            }
                                                            userInfo.setBio(string6);
                                                            if (cursorOooOOO.isNull(i10)) {
                                                                string7 = null;
                                                            } else {
                                                                string7 = cursorOooOOO.getString(i10);
                                                            }
                                                            userInfo.setBirthday(string7);
                                                            i12 = i37;
                                                            userInfo.setAge(cursorOooOOO.getInt(i12));
                                                            i18 = i2;
                                                            i14 = i38;
                                                            userInfo.setCountryId(cursorOooOOO.getInt(i14));
                                                            userInfo.setRegion(cursorOooOOO.getInt(i15));
                                                            i17 = iOooO00o22;
                                                            if (cursorOooOOO.isNull(i17)) {
                                                                string8 = null;
                                                            } else {
                                                                string8 = cursorOooOOO.getString(i17);
                                                            }
                                                            userInfo.setMedal(string8);
                                                            i19 = i15;
                                                            int i39 = iOooO00o23;
                                                            userInfo.setVisitorNum(cursorOooOOO.getInt(i39));
                                                            iOooO00o23 = i39;
                                                            int i40 = iOooO00o24;
                                                            userInfo.setFollowedNum(cursorOooOOO.getInt(i40));
                                                            iOooO00o24 = i40;
                                                            int i41 = iOooO00o25;
                                                            userInfo.setFansNum(cursorOooOOO.getInt(i41));
                                                            iOooO00o25 = i41;
                                                            int i42 = iOooO00o26;
                                                            userInfo.setJoinRoomNum(cursorOooOOO.getInt(i42));
                                                            iOooO00o26 = i42;
                                                            int i43 = iOooO00o27;
                                                            userInfo.setRole(cursorOooOOO.getInt(i43));
                                                            iOooO00o27 = i43;
                                                            int i44 = iOooO00o28;
                                                            userInfo.setRegTime(cursorOooOOO.getInt(i44));
                                                            int i45 = iOooO00o29;
                                                            iOooO00o29 = i45;
                                                            iOooO00o28 = i44;
                                                            userInfo.setTags(this.f41053OooOO0.stringToList(cursorOooOOO.isNull(i45) ? null : cursorOooOOO.getString(i45)));
                                                            i22 = iOooO00o30;
                                                            if (cursorOooOOO.getInt(i22) != 0) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            userInfo.setPremium(z);
                                                            iOooO00o30 = i22;
                                                            i20 = iOooO00o31;
                                                            userInfo.setPremiumLevel(cursorOooOOO.getInt(i20));
                                                            int i46 = iOooO00o32;
                                                            userInfo.setVipState(cursorOooOOO.getInt(i46));
                                                            iOooO00o32 = i46;
                                                            i21 = iOooO00o33;
                                                            userInfo.setVipLevel(cursorOooOOO.getInt(i21));
                                                            i23 = iOooO00o34;
                                                            iOooO00o34 = i23;
                                                            if (cursorOooOOO.getInt(i23) != 0) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            userInfo.setShowVIP(z2);
                                                            iOooO00o33 = i21;
                                                            arrayList2 = arrayList;
                                                            arrayList2.add(new FriendInfo(userInfo, friend2));
                                                            iOooO00o31 = i20;
                                                            iOooO00o20 = i14;
                                                            iOooO00o7 = i13;
                                                            iOooO00o21 = i19;
                                                            iOooO00o13 = iOooO00o13;
                                                            iOooO00o = i;
                                                            iOooO00o22 = i17;
                                                            iOooO00o19 = i12;
                                                            iOooO00o6 = i11;
                                                            iOooO00o18 = i10;
                                                            iOooO00o5 = i9;
                                                            iOooO00o17 = i8;
                                                            iOooO00o4 = i7;
                                                            iOooO00o16 = i6;
                                                            iOooO00o3 = i5;
                                                            iOooO00o15 = i4;
                                                            iOooO00o2 = i3;
                                                            i24 = i18;
                                                        }
                                                        iOooO00o34 = i16;
                                                        userInfo = new UserInfo();
                                                        int i310 = i12;
                                                        int i311 = i14;
                                                        userInfo.setUserId(cursorOooOOO.getLong(iOooO00o8));
                                                        if (cursorOooOOO.isNull(iOooO00o9)) {
                                                            string = null;
                                                        } else {
                                                            string = cursorOooOOO.getString(iOooO00o9);
                                                        }
                                                        userInfo.setUserIdx(string);
                                                        userInfo.setIdLevel(cursorOooOOO.getInt(iOooO00o10));
                                                        if (cursorOooOOO.isNull(iOooO00o11)) {
                                                            string2 = null;
                                                        } else {
                                                            string2 = cursorOooOOO.getString(iOooO00o11);
                                                        }
                                                        userInfo.setUserName(string2);
                                                        if (cursorOooOOO.isNull(iOooO00o12)) {
                                                            string3 = null;
                                                        } else {
                                                            string3 = cursorOooOOO.getString(iOooO00o12);
                                                        }
                                                        userInfo.setUserHeader(string3);
                                                        if (cursorOooOOO.isNull(iOooO00o13)) {
                                                            string4 = null;
                                                        } else {
                                                            string4 = cursorOooOOO.getString(iOooO00o13);
                                                        }
                                                        userInfo.setUserHeaderFrame(string4);
                                                        if (cursorOooOOO.isNull(i2)) {
                                                            string5 = null;
                                                        } else {
                                                            string5 = cursorOooOOO.getString(i2);
                                                        }
                                                        userInfo.setBackground(string5);
                                                        userInfo.setUserLevel(cursorOooOOO.getInt(i4));
                                                        userInfo.setSex(cursorOooOOO.getInt(i6));
                                                        if (cursorOooOOO.isNull(i8)) {
                                                            string6 = null;
                                                        } else {
                                                            string6 = cursorOooOOO.getString(i8);
                                                        }
                                                        userInfo.setBio(string6);
                                                        if (cursorOooOOO.isNull(i10)) {
                                                            string7 = null;
                                                        } else {
                                                            string7 = cursorOooOOO.getString(i10);
                                                        }
                                                        userInfo.setBirthday(string7);
                                                        i12 = i310;
                                                        userInfo.setAge(cursorOooOOO.getInt(i12));
                                                        i18 = i2;
                                                        i14 = i311;
                                                        userInfo.setCountryId(cursorOooOOO.getInt(i14));
                                                        userInfo.setRegion(cursorOooOOO.getInt(i15));
                                                        i17 = iOooO00o22;
                                                        if (cursorOooOOO.isNull(i17)) {
                                                            string8 = null;
                                                        } else {
                                                            string8 = cursorOooOOO.getString(i17);
                                                        }
                                                        userInfo.setMedal(string8);
                                                        i19 = i15;
                                                        int i312 = iOooO00o23;
                                                        userInfo.setVisitorNum(cursorOooOOO.getInt(i312));
                                                        iOooO00o23 = i312;
                                                        int i47 = iOooO00o24;
                                                        userInfo.setFollowedNum(cursorOooOOO.getInt(i47));
                                                        iOooO00o24 = i47;
                                                        int i48 = iOooO00o25;
                                                        userInfo.setFansNum(cursorOooOOO.getInt(i48));
                                                        iOooO00o25 = i48;
                                                        int i49 = iOooO00o26;
                                                        userInfo.setJoinRoomNum(cursorOooOOO.getInt(i49));
                                                        iOooO00o26 = i49;
                                                        int i410 = iOooO00o27;
                                                        userInfo.setRole(cursorOooOOO.getInt(i410));
                                                        iOooO00o27 = i410;
                                                        int i411 = iOooO00o28;
                                                        userInfo.setRegTime(cursorOooOOO.getInt(i411));
                                                        int i412 = iOooO00o29;
                                                        iOooO00o29 = i412;
                                                        iOooO00o28 = i411;
                                                        userInfo.setTags(this.f41053OooOO0.stringToList(cursorOooOOO.isNull(i412) ? null : cursorOooOOO.getString(i412)));
                                                        i22 = iOooO00o30;
                                                        if (cursorOooOOO.getInt(i22) != 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        userInfo.setPremium(z);
                                                        iOooO00o30 = i22;
                                                        i20 = iOooO00o31;
                                                        userInfo.setPremiumLevel(cursorOooOOO.getInt(i20));
                                                        int i413 = iOooO00o32;
                                                        userInfo.setVipState(cursorOooOOO.getInt(i413));
                                                        iOooO00o32 = i413;
                                                        i21 = iOooO00o33;
                                                        userInfo.setVipLevel(cursorOooOOO.getInt(i21));
                                                        i23 = iOooO00o34;
                                                        iOooO00o34 = i23;
                                                        if (cursorOooOOO.getInt(i23) != 0) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        userInfo.setShowVIP(z2);
                                                        iOooO00o33 = i21;
                                                        arrayList2 = arrayList;
                                                        arrayList2.add(new FriendInfo(userInfo, friend2));
                                                        iOooO00o31 = i20;
                                                        iOooO00o20 = i14;
                                                        iOooO00o7 = i13;
                                                        iOooO00o21 = i19;
                                                        iOooO00o13 = iOooO00o13;
                                                        iOooO00o = i;
                                                        iOooO00o22 = i17;
                                                        iOooO00o19 = i12;
                                                        iOooO00o6 = i11;
                                                        iOooO00o18 = i10;
                                                        iOooO00o5 = i9;
                                                        iOooO00o17 = i8;
                                                        iOooO00o4 = i7;
                                                        iOooO00o16 = i6;
                                                        iOooO00o3 = i5;
                                                        iOooO00o15 = i4;
                                                        iOooO00o2 = i3;
                                                        i24 = i18;
                                                    }
                                                    iOooO00o11 = iOooO00o11;
                                                    iOooO00o12 = iOooO00o12;
                                                    friend2 = friend;
                                                    i16 = iOooO00o34;
                                                    iOooO00o34 = i16;
                                                    userInfo = new UserInfo();
                                                    int i313 = i12;
                                                    int i314 = i14;
                                                    userInfo.setUserId(cursorOooOOO.getLong(iOooO00o8));
                                                    if (cursorOooOOO.isNull(iOooO00o9)) {
                                                        string = null;
                                                    } else {
                                                        string = cursorOooOOO.getString(iOooO00o9);
                                                    }
                                                    userInfo.setUserIdx(string);
                                                    userInfo.setIdLevel(cursorOooOOO.getInt(iOooO00o10));
                                                    if (cursorOooOOO.isNull(iOooO00o11)) {
                                                        string2 = null;
                                                    } else {
                                                        string2 = cursorOooOOO.getString(iOooO00o11);
                                                    }
                                                    userInfo.setUserName(string2);
                                                    if (cursorOooOOO.isNull(iOooO00o12)) {
                                                        string3 = null;
                                                    } else {
                                                        string3 = cursorOooOOO.getString(iOooO00o12);
                                                    }
                                                    userInfo.setUserHeader(string3);
                                                    if (cursorOooOOO.isNull(iOooO00o13)) {
                                                        string4 = null;
                                                    } else {
                                                        string4 = cursorOooOOO.getString(iOooO00o13);
                                                    }
                                                    userInfo.setUserHeaderFrame(string4);
                                                    if (cursorOooOOO.isNull(i2)) {
                                                        string5 = null;
                                                    } else {
                                                        string5 = cursorOooOOO.getString(i2);
                                                    }
                                                    userInfo.setBackground(string5);
                                                    userInfo.setUserLevel(cursorOooOOO.getInt(i4));
                                                    userInfo.setSex(cursorOooOOO.getInt(i6));
                                                    if (cursorOooOOO.isNull(i8)) {
                                                        string6 = null;
                                                    } else {
                                                        string6 = cursorOooOOO.getString(i8);
                                                    }
                                                    userInfo.setBio(string6);
                                                    if (cursorOooOOO.isNull(i10)) {
                                                        string7 = null;
                                                    } else {
                                                        string7 = cursorOooOOO.getString(i10);
                                                    }
                                                    userInfo.setBirthday(string7);
                                                    i12 = i313;
                                                    userInfo.setAge(cursorOooOOO.getInt(i12));
                                                    i18 = i2;
                                                    i14 = i314;
                                                    userInfo.setCountryId(cursorOooOOO.getInt(i14));
                                                    userInfo.setRegion(cursorOooOOO.getInt(i15));
                                                    i17 = iOooO00o22;
                                                    if (cursorOooOOO.isNull(i17)) {
                                                        string8 = null;
                                                    } else {
                                                        string8 = cursorOooOOO.getString(i17);
                                                    }
                                                    userInfo.setMedal(string8);
                                                    i19 = i15;
                                                    int i315 = iOooO00o23;
                                                    userInfo.setVisitorNum(cursorOooOOO.getInt(i315));
                                                    iOooO00o23 = i315;
                                                    int i414 = iOooO00o24;
                                                    userInfo.setFollowedNum(cursorOooOOO.getInt(i414));
                                                    iOooO00o24 = i414;
                                                    int i415 = iOooO00o25;
                                                    userInfo.setFansNum(cursorOooOOO.getInt(i415));
                                                    iOooO00o25 = i415;
                                                    int i416 = iOooO00o26;
                                                    userInfo.setJoinRoomNum(cursorOooOOO.getInt(i416));
                                                    iOooO00o26 = i416;
                                                    int i417 = iOooO00o27;
                                                    userInfo.setRole(cursorOooOOO.getInt(i417));
                                                    iOooO00o27 = i417;
                                                    int i418 = iOooO00o28;
                                                    userInfo.setRegTime(cursorOooOOO.getInt(i418));
                                                    int i419 = iOooO00o29;
                                                    iOooO00o29 = i419;
                                                    iOooO00o28 = i418;
                                                    userInfo.setTags(this.f41053OooOO0.stringToList(cursorOooOOO.isNull(i419) ? null : cursorOooOOO.getString(i419)));
                                                    i22 = iOooO00o30;
                                                    if (cursorOooOOO.getInt(i22) != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    userInfo.setPremium(z);
                                                    iOooO00o30 = i22;
                                                    i20 = iOooO00o31;
                                                    userInfo.setPremiumLevel(cursorOooOOO.getInt(i20));
                                                    int i4110 = iOooO00o32;
                                                    userInfo.setVipState(cursorOooOOO.getInt(i4110));
                                                    iOooO00o32 = i4110;
                                                    i21 = iOooO00o33;
                                                    userInfo.setVipLevel(cursorOooOOO.getInt(i21));
                                                    i23 = iOooO00o34;
                                                    iOooO00o34 = i23;
                                                    if (cursorOooOOO.getInt(i23) != 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    userInfo.setShowVIP(z2);
                                                    iOooO00o33 = i21;
                                                    arrayList2 = arrayList;
                                                    arrayList2.add(new FriendInfo(userInfo, friend2));
                                                    iOooO00o31 = i20;
                                                    iOooO00o20 = i14;
                                                    iOooO00o7 = i13;
                                                    iOooO00o21 = i19;
                                                    iOooO00o13 = iOooO00o13;
                                                    iOooO00o = i;
                                                    iOooO00o22 = i17;
                                                    iOooO00o19 = i12;
                                                    iOooO00o6 = i11;
                                                    iOooO00o18 = i10;
                                                    iOooO00o5 = i9;
                                                    iOooO00o17 = i8;
                                                    iOooO00o4 = i7;
                                                    iOooO00o16 = i6;
                                                    iOooO00o3 = i5;
                                                    iOooO00o15 = i4;
                                                    iOooO00o2 = i3;
                                                    i24 = i18;
                                                }
                                                iOooO00o11 = iOooO00o11;
                                                iOooO00o12 = iOooO00o12;
                                                arrayList = arrayList2;
                                                i15 = iOooO00o21;
                                                iOooO00o11 = iOooO00o11;
                                                iOooO00o12 = iOooO00o12;
                                                friend2 = friend;
                                                i16 = iOooO00o34;
                                                iOooO00o34 = i16;
                                                userInfo = new UserInfo();
                                                int i316 = i12;
                                                int i317 = i14;
                                                userInfo.setUserId(cursorOooOOO.getLong(iOooO00o8));
                                                if (cursorOooOOO.isNull(iOooO00o9)) {
                                                    string = null;
                                                } else {
                                                    string = cursorOooOOO.getString(iOooO00o9);
                                                }
                                                userInfo.setUserIdx(string);
                                                userInfo.setIdLevel(cursorOooOOO.getInt(iOooO00o10));
                                                if (cursorOooOOO.isNull(iOooO00o11)) {
                                                    string2 = null;
                                                } else {
                                                    string2 = cursorOooOOO.getString(iOooO00o11);
                                                }
                                                userInfo.setUserName(string2);
                                                if (cursorOooOOO.isNull(iOooO00o12)) {
                                                    string3 = null;
                                                } else {
                                                    string3 = cursorOooOOO.getString(iOooO00o12);
                                                }
                                                userInfo.setUserHeader(string3);
                                                if (cursorOooOOO.isNull(iOooO00o13)) {
                                                    string4 = null;
                                                } else {
                                                    string4 = cursorOooOOO.getString(iOooO00o13);
                                                }
                                                userInfo.setUserHeaderFrame(string4);
                                                if (cursorOooOOO.isNull(i2)) {
                                                    string5 = null;
                                                } else {
                                                    string5 = cursorOooOOO.getString(i2);
                                                }
                                                userInfo.setBackground(string5);
                                                userInfo.setUserLevel(cursorOooOOO.getInt(i4));
                                                userInfo.setSex(cursorOooOOO.getInt(i6));
                                                if (cursorOooOOO.isNull(i8)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = cursorOooOOO.getString(i8);
                                                }
                                                userInfo.setBio(string6);
                                                if (cursorOooOOO.isNull(i10)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = cursorOooOOO.getString(i10);
                                                }
                                                userInfo.setBirthday(string7);
                                                i12 = i316;
                                                userInfo.setAge(cursorOooOOO.getInt(i12));
                                                i18 = i2;
                                                i14 = i317;
                                                userInfo.setCountryId(cursorOooOOO.getInt(i14));
                                                userInfo.setRegion(cursorOooOOO.getInt(i15));
                                                i17 = iOooO00o22;
                                                if (cursorOooOOO.isNull(i17)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = cursorOooOOO.getString(i17);
                                                }
                                                userInfo.setMedal(string8);
                                                i19 = i15;
                                                int i318 = iOooO00o23;
                                                userInfo.setVisitorNum(cursorOooOOO.getInt(i318));
                                                iOooO00o23 = i318;
                                                int i4111 = iOooO00o24;
                                                userInfo.setFollowedNum(cursorOooOOO.getInt(i4111));
                                                iOooO00o24 = i4111;
                                                int i4112 = iOooO00o25;
                                                userInfo.setFansNum(cursorOooOOO.getInt(i4112));
                                                iOooO00o25 = i4112;
                                                int i4113 = iOooO00o26;
                                                userInfo.setJoinRoomNum(cursorOooOOO.getInt(i4113));
                                                iOooO00o26 = i4113;
                                                int i4114 = iOooO00o27;
                                                userInfo.setRole(cursorOooOOO.getInt(i4114));
                                                iOooO00o27 = i4114;
                                                int i4115 = iOooO00o28;
                                                userInfo.setRegTime(cursorOooOOO.getInt(i4115));
                                                int i4116 = iOooO00o29;
                                                iOooO00o29 = i4116;
                                                iOooO00o28 = i4115;
                                                userInfo.setTags(this.f41053OooOO0.stringToList(cursorOooOOO.isNull(i4116) ? null : cursorOooOOO.getString(i4116)));
                                                i22 = iOooO00o30;
                                                if (cursorOooOOO.getInt(i22) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                userInfo.setPremium(z);
                                                iOooO00o30 = i22;
                                                i20 = iOooO00o31;
                                                userInfo.setPremiumLevel(cursorOooOOO.getInt(i20));
                                                int i4117 = iOooO00o32;
                                                userInfo.setVipState(cursorOooOOO.getInt(i4117));
                                                iOooO00o32 = i4117;
                                                i21 = iOooO00o33;
                                                userInfo.setVipLevel(cursorOooOOO.getInt(i21));
                                                i23 = iOooO00o34;
                                                iOooO00o34 = i23;
                                                if (cursorOooOOO.getInt(i23) != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                userInfo.setShowVIP(z2);
                                                iOooO00o33 = i21;
                                                arrayList2 = arrayList;
                                                arrayList2.add(new FriendInfo(userInfo, friend2));
                                                iOooO00o31 = i20;
                                                iOooO00o20 = i14;
                                                iOooO00o7 = i13;
                                                iOooO00o21 = i19;
                                                iOooO00o13 = iOooO00o13;
                                                iOooO00o = i;
                                                iOooO00o22 = i17;
                                                iOooO00o19 = i12;
                                                iOooO00o6 = i11;
                                                iOooO00o18 = i10;
                                                iOooO00o5 = i9;
                                                iOooO00o17 = i8;
                                                iOooO00o4 = i7;
                                                iOooO00o16 = i6;
                                                iOooO00o3 = i5;
                                                iOooO00o15 = i4;
                                                iOooO00o2 = i3;
                                                i24 = i18;
                                            }
                                            iOooO00o11 = iOooO00o11;
                                            iOooO00o12 = iOooO00o12;
                                            i13 = iOooO00o7;
                                            i14 = iOooO00o20;
                                            iOooO00o11 = iOooO00o11;
                                            iOooO00o12 = iOooO00o12;
                                            arrayList = arrayList2;
                                            i15 = iOooO00o21;
                                            iOooO00o11 = iOooO00o11;
                                            iOooO00o12 = iOooO00o12;
                                            friend2 = friend;
                                            i16 = iOooO00o34;
                                            iOooO00o34 = i16;
                                            userInfo = new UserInfo();
                                            int i319 = i12;
                                            int i3110 = i14;
                                            userInfo.setUserId(cursorOooOOO.getLong(iOooO00o8));
                                            if (cursorOooOOO.isNull(iOooO00o9)) {
                                                string = null;
                                            } else {
                                                string = cursorOooOOO.getString(iOooO00o9);
                                            }
                                            userInfo.setUserIdx(string);
                                            userInfo.setIdLevel(cursorOooOOO.getInt(iOooO00o10));
                                            if (cursorOooOOO.isNull(iOooO00o11)) {
                                                string2 = null;
                                            } else {
                                                string2 = cursorOooOOO.getString(iOooO00o11);
                                            }
                                            userInfo.setUserName(string2);
                                            if (cursorOooOOO.isNull(iOooO00o12)) {
                                                string3 = null;
                                            } else {
                                                string3 = cursorOooOOO.getString(iOooO00o12);
                                            }
                                            userInfo.setUserHeader(string3);
                                            if (cursorOooOOO.isNull(iOooO00o13)) {
                                                string4 = null;
                                            } else {
                                                string4 = cursorOooOOO.getString(iOooO00o13);
                                            }
                                            userInfo.setUserHeaderFrame(string4);
                                            if (cursorOooOOO.isNull(i2)) {
                                                string5 = null;
                                            } else {
                                                string5 = cursorOooOOO.getString(i2);
                                            }
                                            userInfo.setBackground(string5);
                                            userInfo.setUserLevel(cursorOooOOO.getInt(i4));
                                            userInfo.setSex(cursorOooOOO.getInt(i6));
                                            if (cursorOooOOO.isNull(i8)) {
                                                string6 = null;
                                            } else {
                                                string6 = cursorOooOOO.getString(i8);
                                            }
                                            userInfo.setBio(string6);
                                            if (cursorOooOOO.isNull(i10)) {
                                                string7 = null;
                                            } else {
                                                string7 = cursorOooOOO.getString(i10);
                                            }
                                            userInfo.setBirthday(string7);
                                            i12 = i319;
                                            userInfo.setAge(cursorOooOOO.getInt(i12));
                                            i18 = i2;
                                            i14 = i3110;
                                            userInfo.setCountryId(cursorOooOOO.getInt(i14));
                                            userInfo.setRegion(cursorOooOOO.getInt(i15));
                                            i17 = iOooO00o22;
                                            if (cursorOooOOO.isNull(i17)) {
                                                string8 = null;
                                            } else {
                                                string8 = cursorOooOOO.getString(i17);
                                            }
                                            userInfo.setMedal(string8);
                                            i19 = i15;
                                            int i3111 = iOooO00o23;
                                            userInfo.setVisitorNum(cursorOooOOO.getInt(i3111));
                                            iOooO00o23 = i3111;
                                            int i4118 = iOooO00o24;
                                            userInfo.setFollowedNum(cursorOooOOO.getInt(i4118));
                                            iOooO00o24 = i4118;
                                            int i4119 = iOooO00o25;
                                            userInfo.setFansNum(cursorOooOOO.getInt(i4119));
                                            iOooO00o25 = i4119;
                                            int i41110 = iOooO00o26;
                                            userInfo.setJoinRoomNum(cursorOooOOO.getInt(i41110));
                                            iOooO00o26 = i41110;
                                            int i41111 = iOooO00o27;
                                            userInfo.setRole(cursorOooOOO.getInt(i41111));
                                            iOooO00o27 = i41111;
                                            int i41112 = iOooO00o28;
                                            userInfo.setRegTime(cursorOooOOO.getInt(i41112));
                                            int i41113 = iOooO00o29;
                                            iOooO00o29 = i41113;
                                            iOooO00o28 = i41112;
                                            userInfo.setTags(this.f41053OooOO0.stringToList(cursorOooOOO.isNull(i41113) ? null : cursorOooOOO.getString(i41113)));
                                            i22 = iOooO00o30;
                                            if (cursorOooOOO.getInt(i22) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            userInfo.setPremium(z);
                                            iOooO00o30 = i22;
                                            i20 = iOooO00o31;
                                            userInfo.setPremiumLevel(cursorOooOOO.getInt(i20));
                                            int i41114 = iOooO00o32;
                                            userInfo.setVipState(cursorOooOOO.getInt(i41114));
                                            iOooO00o32 = i41114;
                                            i21 = iOooO00o33;
                                            userInfo.setVipLevel(cursorOooOOO.getInt(i21));
                                            i23 = iOooO00o34;
                                            iOooO00o34 = i23;
                                            if (cursorOooOOO.getInt(i23) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            userInfo.setShowVIP(z2);
                                            iOooO00o33 = i21;
                                            arrayList2 = arrayList;
                                            arrayList2.add(new FriendInfo(userInfo, friend2));
                                            iOooO00o31 = i20;
                                            iOooO00o20 = i14;
                                            iOooO00o7 = i13;
                                            iOooO00o21 = i19;
                                            iOooO00o13 = iOooO00o13;
                                            iOooO00o = i;
                                            iOooO00o22 = i17;
                                            iOooO00o19 = i12;
                                            iOooO00o6 = i11;
                                            iOooO00o18 = i10;
                                            iOooO00o5 = i9;
                                            iOooO00o17 = i8;
                                            iOooO00o4 = i7;
                                            iOooO00o16 = i6;
                                            iOooO00o3 = i5;
                                            iOooO00o15 = i4;
                                            iOooO00o2 = i3;
                                            i24 = i18;
                                        }
                                        iOooO00o11 = iOooO00o11;
                                        iOooO00o12 = iOooO00o12;
                                        i11 = iOooO00o6;
                                        i12 = iOooO00o19;
                                        iOooO00o11 = iOooO00o11;
                                        iOooO00o12 = iOooO00o12;
                                        i13 = iOooO00o7;
                                        i14 = iOooO00o20;
                                        iOooO00o11 = iOooO00o11;
                                        iOooO00o12 = iOooO00o12;
                                        arrayList = arrayList2;
                                        i15 = iOooO00o21;
                                        iOooO00o11 = iOooO00o11;
                                        iOooO00o12 = iOooO00o12;
                                        friend2 = friend;
                                        i16 = iOooO00o34;
                                        iOooO00o34 = i16;
                                        userInfo = new UserInfo();
                                        int i3112 = i12;
                                        int i3113 = i14;
                                        userInfo.setUserId(cursorOooOOO.getLong(iOooO00o8));
                                        if (cursorOooOOO.isNull(iOooO00o9)) {
                                            string = null;
                                        } else {
                                            string = cursorOooOOO.getString(iOooO00o9);
                                        }
                                        userInfo.setUserIdx(string);
                                        userInfo.setIdLevel(cursorOooOOO.getInt(iOooO00o10));
                                        if (cursorOooOOO.isNull(iOooO00o11)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorOooOOO.getString(iOooO00o11);
                                        }
                                        userInfo.setUserName(string2);
                                        if (cursorOooOOO.isNull(iOooO00o12)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorOooOOO.getString(iOooO00o12);
                                        }
                                        userInfo.setUserHeader(string3);
                                        if (cursorOooOOO.isNull(iOooO00o13)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorOooOOO.getString(iOooO00o13);
                                        }
                                        userInfo.setUserHeaderFrame(string4);
                                        if (cursorOooOOO.isNull(i2)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorOooOOO.getString(i2);
                                        }
                                        userInfo.setBackground(string5);
                                        userInfo.setUserLevel(cursorOooOOO.getInt(i4));
                                        userInfo.setSex(cursorOooOOO.getInt(i6));
                                        if (cursorOooOOO.isNull(i8)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursorOooOOO.getString(i8);
                                        }
                                        userInfo.setBio(string6);
                                        if (cursorOooOOO.isNull(i10)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursorOooOOO.getString(i10);
                                        }
                                        userInfo.setBirthday(string7);
                                        i12 = i3112;
                                        userInfo.setAge(cursorOooOOO.getInt(i12));
                                        i18 = i2;
                                        i14 = i3113;
                                        userInfo.setCountryId(cursorOooOOO.getInt(i14));
                                        userInfo.setRegion(cursorOooOOO.getInt(i15));
                                        i17 = iOooO00o22;
                                        if (cursorOooOOO.isNull(i17)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursorOooOOO.getString(i17);
                                        }
                                        userInfo.setMedal(string8);
                                        i19 = i15;
                                        int i3114 = iOooO00o23;
                                        userInfo.setVisitorNum(cursorOooOOO.getInt(i3114));
                                        iOooO00o23 = i3114;
                                        int i41115 = iOooO00o24;
                                        userInfo.setFollowedNum(cursorOooOOO.getInt(i41115));
                                        iOooO00o24 = i41115;
                                        int i41116 = iOooO00o25;
                                        userInfo.setFansNum(cursorOooOOO.getInt(i41116));
                                        iOooO00o25 = i41116;
                                        int i41117 = iOooO00o26;
                                        userInfo.setJoinRoomNum(cursorOooOOO.getInt(i41117));
                                        iOooO00o26 = i41117;
                                        int i41118 = iOooO00o27;
                                        userInfo.setRole(cursorOooOOO.getInt(i41118));
                                        iOooO00o27 = i41118;
                                        int i41119 = iOooO00o28;
                                        userInfo.setRegTime(cursorOooOOO.getInt(i41119));
                                        int i411110 = iOooO00o29;
                                        iOooO00o29 = i411110;
                                        iOooO00o28 = i41119;
                                        userInfo.setTags(this.f41053OooOO0.stringToList(cursorOooOOO.isNull(i411110) ? null : cursorOooOOO.getString(i411110)));
                                        i22 = iOooO00o30;
                                        if (cursorOooOOO.getInt(i22) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        userInfo.setPremium(z);
                                        iOooO00o30 = i22;
                                        i20 = iOooO00o31;
                                        userInfo.setPremiumLevel(cursorOooOOO.getInt(i20));
                                        int i411111 = iOooO00o32;
                                        userInfo.setVipState(cursorOooOOO.getInt(i411111));
                                        iOooO00o32 = i411111;
                                        i21 = iOooO00o33;
                                        userInfo.setVipLevel(cursorOooOOO.getInt(i21));
                                        i23 = iOooO00o34;
                                        iOooO00o34 = i23;
                                        if (cursorOooOOO.getInt(i23) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        userInfo.setShowVIP(z2);
                                        iOooO00o33 = i21;
                                        arrayList2 = arrayList;
                                        arrayList2.add(new FriendInfo(userInfo, friend2));
                                        iOooO00o31 = i20;
                                        iOooO00o20 = i14;
                                        iOooO00o7 = i13;
                                        iOooO00o21 = i19;
                                        iOooO00o13 = iOooO00o13;
                                        iOooO00o = i;
                                        iOooO00o22 = i17;
                                        iOooO00o19 = i12;
                                        iOooO00o6 = i11;
                                        iOooO00o18 = i10;
                                        iOooO00o5 = i9;
                                        iOooO00o17 = i8;
                                        iOooO00o4 = i7;
                                        iOooO00o16 = i6;
                                        iOooO00o3 = i5;
                                        iOooO00o15 = i4;
                                        iOooO00o2 = i3;
                                        i24 = i18;
                                    }
                                    iOooO00o11 = iOooO00o11;
                                    iOooO00o12 = iOooO00o12;
                                    i9 = iOooO00o5;
                                    i10 = iOooO00o18;
                                    iOooO00o11 = iOooO00o11;
                                    iOooO00o12 = iOooO00o12;
                                    i11 = iOooO00o6;
                                    i12 = iOooO00o19;
                                    iOooO00o11 = iOooO00o11;
                                    iOooO00o12 = iOooO00o12;
                                    i13 = iOooO00o7;
                                    i14 = iOooO00o20;
                                    iOooO00o11 = iOooO00o11;
                                    iOooO00o12 = iOooO00o12;
                                    arrayList = arrayList2;
                                    i15 = iOooO00o21;
                                    iOooO00o11 = iOooO00o11;
                                    iOooO00o12 = iOooO00o12;
                                    friend2 = friend;
                                    i16 = iOooO00o34;
                                    iOooO00o34 = i16;
                                    userInfo = new UserInfo();
                                    int i3115 = i12;
                                    int i3116 = i14;
                                    userInfo.setUserId(cursorOooOOO.getLong(iOooO00o8));
                                    if (cursorOooOOO.isNull(iOooO00o9)) {
                                        string = null;
                                    } else {
                                        string = cursorOooOOO.getString(iOooO00o9);
                                    }
                                    userInfo.setUserIdx(string);
                                    userInfo.setIdLevel(cursorOooOOO.getInt(iOooO00o10));
                                    if (cursorOooOOO.isNull(iOooO00o11)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorOooOOO.getString(iOooO00o11);
                                    }
                                    userInfo.setUserName(string2);
                                    if (cursorOooOOO.isNull(iOooO00o12)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorOooOOO.getString(iOooO00o12);
                                    }
                                    userInfo.setUserHeader(string3);
                                    if (cursorOooOOO.isNull(iOooO00o13)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorOooOOO.getString(iOooO00o13);
                                    }
                                    userInfo.setUserHeaderFrame(string4);
                                    if (cursorOooOOO.isNull(i2)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorOooOOO.getString(i2);
                                    }
                                    userInfo.setBackground(string5);
                                    userInfo.setUserLevel(cursorOooOOO.getInt(i4));
                                    userInfo.setSex(cursorOooOOO.getInt(i6));
                                    if (cursorOooOOO.isNull(i8)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursorOooOOO.getString(i8);
                                    }
                                    userInfo.setBio(string6);
                                    if (cursorOooOOO.isNull(i10)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursorOooOOO.getString(i10);
                                    }
                                    userInfo.setBirthday(string7);
                                    i12 = i3115;
                                    userInfo.setAge(cursorOooOOO.getInt(i12));
                                    i18 = i2;
                                    i14 = i3116;
                                    userInfo.setCountryId(cursorOooOOO.getInt(i14));
                                    userInfo.setRegion(cursorOooOOO.getInt(i15));
                                    i17 = iOooO00o22;
                                    if (cursorOooOOO.isNull(i17)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursorOooOOO.getString(i17);
                                    }
                                    userInfo.setMedal(string8);
                                    i19 = i15;
                                    int i3117 = iOooO00o23;
                                    userInfo.setVisitorNum(cursorOooOOO.getInt(i3117));
                                    iOooO00o23 = i3117;
                                    int i411112 = iOooO00o24;
                                    userInfo.setFollowedNum(cursorOooOOO.getInt(i411112));
                                    iOooO00o24 = i411112;
                                    int i411113 = iOooO00o25;
                                    userInfo.setFansNum(cursorOooOOO.getInt(i411113));
                                    iOooO00o25 = i411113;
                                    int i411114 = iOooO00o26;
                                    userInfo.setJoinRoomNum(cursorOooOOO.getInt(i411114));
                                    iOooO00o26 = i411114;
                                    int i411115 = iOooO00o27;
                                    userInfo.setRole(cursorOooOOO.getInt(i411115));
                                    iOooO00o27 = i411115;
                                    int i411116 = iOooO00o28;
                                    userInfo.setRegTime(cursorOooOOO.getInt(i411116));
                                    int i411117 = iOooO00o29;
                                    iOooO00o29 = i411117;
                                    iOooO00o28 = i411116;
                                    userInfo.setTags(this.f41053OooOO0.stringToList(cursorOooOOO.isNull(i411117) ? null : cursorOooOOO.getString(i411117)));
                                    i22 = iOooO00o30;
                                    if (cursorOooOOO.getInt(i22) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    userInfo.setPremium(z);
                                    iOooO00o30 = i22;
                                    i20 = iOooO00o31;
                                    userInfo.setPremiumLevel(cursorOooOOO.getInt(i20));
                                    int i411118 = iOooO00o32;
                                    userInfo.setVipState(cursorOooOOO.getInt(i411118));
                                    iOooO00o32 = i411118;
                                    i21 = iOooO00o33;
                                    userInfo.setVipLevel(cursorOooOOO.getInt(i21));
                                    i23 = iOooO00o34;
                                    iOooO00o34 = i23;
                                    if (cursorOooOOO.getInt(i23) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    userInfo.setShowVIP(z2);
                                    iOooO00o33 = i21;
                                    arrayList2 = arrayList;
                                    arrayList2.add(new FriendInfo(userInfo, friend2));
                                    iOooO00o31 = i20;
                                    iOooO00o20 = i14;
                                    iOooO00o7 = i13;
                                    iOooO00o21 = i19;
                                    iOooO00o13 = iOooO00o13;
                                    iOooO00o = i;
                                    iOooO00o22 = i17;
                                    iOooO00o19 = i12;
                                    iOooO00o6 = i11;
                                    iOooO00o18 = i10;
                                    iOooO00o5 = i9;
                                    iOooO00o17 = i8;
                                    iOooO00o4 = i7;
                                    iOooO00o16 = i6;
                                    iOooO00o3 = i5;
                                    iOooO00o15 = i4;
                                    iOooO00o2 = i3;
                                    i24 = i18;
                                }
                                iOooO00o11 = iOooO00o11;
                                iOooO00o12 = iOooO00o12;
                                i7 = iOooO00o4;
                                i8 = iOooO00o17;
                                iOooO00o11 = iOooO00o11;
                                iOooO00o12 = iOooO00o12;
                                i9 = iOooO00o5;
                                i10 = iOooO00o18;
                                iOooO00o11 = iOooO00o11;
                                iOooO00o12 = iOooO00o12;
                                i11 = iOooO00o6;
                                i12 = iOooO00o19;
                                iOooO00o11 = iOooO00o11;
                                iOooO00o12 = iOooO00o12;
                                i13 = iOooO00o7;
                                i14 = iOooO00o20;
                                iOooO00o11 = iOooO00o11;
                                iOooO00o12 = iOooO00o12;
                                arrayList = arrayList2;
                                i15 = iOooO00o21;
                                iOooO00o11 = iOooO00o11;
                                iOooO00o12 = iOooO00o12;
                                friend2 = friend;
                                i16 = iOooO00o34;
                                iOooO00o34 = i16;
                                userInfo = new UserInfo();
                                int i3118 = i12;
                                int i3119 = i14;
                                userInfo.setUserId(cursorOooOOO.getLong(iOooO00o8));
                                if (cursorOooOOO.isNull(iOooO00o9)) {
                                    string = null;
                                } else {
                                    string = cursorOooOOO.getString(iOooO00o9);
                                }
                                userInfo.setUserIdx(string);
                                userInfo.setIdLevel(cursorOooOOO.getInt(iOooO00o10));
                                if (cursorOooOOO.isNull(iOooO00o11)) {
                                    string2 = null;
                                } else {
                                    string2 = cursorOooOOO.getString(iOooO00o11);
                                }
                                userInfo.setUserName(string2);
                                if (cursorOooOOO.isNull(iOooO00o12)) {
                                    string3 = null;
                                } else {
                                    string3 = cursorOooOOO.getString(iOooO00o12);
                                }
                                userInfo.setUserHeader(string3);
                                if (cursorOooOOO.isNull(iOooO00o13)) {
                                    string4 = null;
                                } else {
                                    string4 = cursorOooOOO.getString(iOooO00o13);
                                }
                                userInfo.setUserHeaderFrame(string4);
                                if (cursorOooOOO.isNull(i2)) {
                                    string5 = null;
                                } else {
                                    string5 = cursorOooOOO.getString(i2);
                                }
                                userInfo.setBackground(string5);
                                userInfo.setUserLevel(cursorOooOOO.getInt(i4));
                                userInfo.setSex(cursorOooOOO.getInt(i6));
                                if (cursorOooOOO.isNull(i8)) {
                                    string6 = null;
                                } else {
                                    string6 = cursorOooOOO.getString(i8);
                                }
                                userInfo.setBio(string6);
                                if (cursorOooOOO.isNull(i10)) {
                                    string7 = null;
                                } else {
                                    string7 = cursorOooOOO.getString(i10);
                                }
                                userInfo.setBirthday(string7);
                                i12 = i3118;
                                userInfo.setAge(cursorOooOOO.getInt(i12));
                                i18 = i2;
                                i14 = i3119;
                                userInfo.setCountryId(cursorOooOOO.getInt(i14));
                                userInfo.setRegion(cursorOooOOO.getInt(i15));
                                i17 = iOooO00o22;
                                if (cursorOooOOO.isNull(i17)) {
                                    string8 = null;
                                } else {
                                    string8 = cursorOooOOO.getString(i17);
                                }
                                userInfo.setMedal(string8);
                                i19 = i15;
                                int i31110 = iOooO00o23;
                                userInfo.setVisitorNum(cursorOooOOO.getInt(i31110));
                                iOooO00o23 = i31110;
                                int i411119 = iOooO00o24;
                                userInfo.setFollowedNum(cursorOooOOO.getInt(i411119));
                                iOooO00o24 = i411119;
                                int i4111110 = iOooO00o25;
                                userInfo.setFansNum(cursorOooOOO.getInt(i4111110));
                                iOooO00o25 = i4111110;
                                int i4111111 = iOooO00o26;
                                userInfo.setJoinRoomNum(cursorOooOOO.getInt(i4111111));
                                iOooO00o26 = i4111111;
                                int i4111112 = iOooO00o27;
                                userInfo.setRole(cursorOooOOO.getInt(i4111112));
                                iOooO00o27 = i4111112;
                                int i4111113 = iOooO00o28;
                                userInfo.setRegTime(cursorOooOOO.getInt(i4111113));
                                int i4111114 = iOooO00o29;
                                iOooO00o29 = i4111114;
                                iOooO00o28 = i4111113;
                                userInfo.setTags(this.f41053OooOO0.stringToList(cursorOooOOO.isNull(i4111114) ? null : cursorOooOOO.getString(i4111114)));
                                i22 = iOooO00o30;
                                if (cursorOooOOO.getInt(i22) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                userInfo.setPremium(z);
                                iOooO00o30 = i22;
                                i20 = iOooO00o31;
                                userInfo.setPremiumLevel(cursorOooOOO.getInt(i20));
                                int i4111115 = iOooO00o32;
                                userInfo.setVipState(cursorOooOOO.getInt(i4111115));
                                iOooO00o32 = i4111115;
                                i21 = iOooO00o33;
                                userInfo.setVipLevel(cursorOooOOO.getInt(i21));
                                i23 = iOooO00o34;
                                iOooO00o34 = i23;
                                if (cursorOooOOO.getInt(i23) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                userInfo.setShowVIP(z2);
                                iOooO00o33 = i21;
                                arrayList2 = arrayList;
                                arrayList2.add(new FriendInfo(userInfo, friend2));
                                iOooO00o31 = i20;
                                iOooO00o20 = i14;
                                iOooO00o7 = i13;
                                iOooO00o21 = i19;
                                iOooO00o13 = iOooO00o13;
                                iOooO00o = i;
                                iOooO00o22 = i17;
                                iOooO00o19 = i12;
                                iOooO00o6 = i11;
                                iOooO00o18 = i10;
                                iOooO00o5 = i9;
                                iOooO00o17 = i8;
                                iOooO00o4 = i7;
                                iOooO00o16 = i6;
                                iOooO00o3 = i5;
                                iOooO00o15 = i4;
                                iOooO00o2 = i3;
                                i24 = i18;
                            }
                            iOooO00o11 = iOooO00o11;
                            iOooO00o12 = iOooO00o12;
                            i5 = iOooO00o3;
                            i6 = iOooO00o16;
                            iOooO00o11 = iOooO00o11;
                            iOooO00o12 = iOooO00o12;
                            i7 = iOooO00o4;
                            i8 = iOooO00o17;
                            iOooO00o11 = iOooO00o11;
                            iOooO00o12 = iOooO00o12;
                            i9 = iOooO00o5;
                            i10 = iOooO00o18;
                            iOooO00o11 = iOooO00o11;
                            iOooO00o12 = iOooO00o12;
                            i11 = iOooO00o6;
                            i12 = iOooO00o19;
                            iOooO00o11 = iOooO00o11;
                            iOooO00o12 = iOooO00o12;
                            i13 = iOooO00o7;
                            i14 = iOooO00o20;
                            iOooO00o11 = iOooO00o11;
                            iOooO00o12 = iOooO00o12;
                            arrayList = arrayList2;
                            i15 = iOooO00o21;
                            iOooO00o11 = iOooO00o11;
                            iOooO00o12 = iOooO00o12;
                            friend2 = friend;
                            i16 = iOooO00o34;
                            iOooO00o34 = i16;
                            userInfo = new UserInfo();
                            int i31111 = i12;
                            int i31112 = i14;
                            userInfo.setUserId(cursorOooOOO.getLong(iOooO00o8));
                            if (cursorOooOOO.isNull(iOooO00o9)) {
                                string = null;
                            } else {
                                string = cursorOooOOO.getString(iOooO00o9);
                            }
                            userInfo.setUserIdx(string);
                            userInfo.setIdLevel(cursorOooOOO.getInt(iOooO00o10));
                            if (cursorOooOOO.isNull(iOooO00o11)) {
                                string2 = null;
                            } else {
                                string2 = cursorOooOOO.getString(iOooO00o11);
                            }
                            userInfo.setUserName(string2);
                            if (cursorOooOOO.isNull(iOooO00o12)) {
                                string3 = null;
                            } else {
                                string3 = cursorOooOOO.getString(iOooO00o12);
                            }
                            userInfo.setUserHeader(string3);
                            if (cursorOooOOO.isNull(iOooO00o13)) {
                                string4 = null;
                            } else {
                                string4 = cursorOooOOO.getString(iOooO00o13);
                            }
                            userInfo.setUserHeaderFrame(string4);
                            if (cursorOooOOO.isNull(i2)) {
                                string5 = null;
                            } else {
                                string5 = cursorOooOOO.getString(i2);
                            }
                            userInfo.setBackground(string5);
                            userInfo.setUserLevel(cursorOooOOO.getInt(i4));
                            userInfo.setSex(cursorOooOOO.getInt(i6));
                            if (cursorOooOOO.isNull(i8)) {
                                string6 = null;
                            } else {
                                string6 = cursorOooOOO.getString(i8);
                            }
                            userInfo.setBio(string6);
                            if (cursorOooOOO.isNull(i10)) {
                                string7 = null;
                            } else {
                                string7 = cursorOooOOO.getString(i10);
                            }
                            userInfo.setBirthday(string7);
                            i12 = i31111;
                            userInfo.setAge(cursorOooOOO.getInt(i12));
                            i18 = i2;
                            i14 = i31112;
                            userInfo.setCountryId(cursorOooOOO.getInt(i14));
                            userInfo.setRegion(cursorOooOOO.getInt(i15));
                            i17 = iOooO00o22;
                            if (cursorOooOOO.isNull(i17)) {
                                string8 = null;
                            } else {
                                string8 = cursorOooOOO.getString(i17);
                            }
                            userInfo.setMedal(string8);
                            i19 = i15;
                            int i31113 = iOooO00o23;
                            userInfo.setVisitorNum(cursorOooOOO.getInt(i31113));
                            iOooO00o23 = i31113;
                            int i4111116 = iOooO00o24;
                            userInfo.setFollowedNum(cursorOooOOO.getInt(i4111116));
                            iOooO00o24 = i4111116;
                            int i4111117 = iOooO00o25;
                            userInfo.setFansNum(cursorOooOOO.getInt(i4111117));
                            iOooO00o25 = i4111117;
                            int i4111118 = iOooO00o26;
                            userInfo.setJoinRoomNum(cursorOooOOO.getInt(i4111118));
                            iOooO00o26 = i4111118;
                            int i4111119 = iOooO00o27;
                            userInfo.setRole(cursorOooOOO.getInt(i4111119));
                            iOooO00o27 = i4111119;
                            int i41111110 = iOooO00o28;
                            userInfo.setRegTime(cursorOooOOO.getInt(i41111110));
                            int i41111111 = iOooO00o29;
                            iOooO00o29 = i41111111;
                            iOooO00o28 = i41111110;
                            userInfo.setTags(this.f41053OooOO0.stringToList(cursorOooOOO.isNull(i41111111) ? null : cursorOooOOO.getString(i41111111)));
                            i22 = iOooO00o30;
                            if (cursorOooOOO.getInt(i22) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            userInfo.setPremium(z);
                            iOooO00o30 = i22;
                            i20 = iOooO00o31;
                            userInfo.setPremiumLevel(cursorOooOOO.getInt(i20));
                            int i41111112 = iOooO00o32;
                            userInfo.setVipState(cursorOooOOO.getInt(i41111112));
                            iOooO00o32 = i41111112;
                            i21 = iOooO00o33;
                            userInfo.setVipLevel(cursorOooOOO.getInt(i21));
                            i23 = iOooO00o34;
                            iOooO00o34 = i23;
                            if (cursorOooOOO.getInt(i23) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            userInfo.setShowVIP(z2);
                            iOooO00o33 = i21;
                            arrayList2 = arrayList;
                            arrayList2.add(new FriendInfo(userInfo, friend2));
                            iOooO00o31 = i20;
                            iOooO00o20 = i14;
                            iOooO00o7 = i13;
                            iOooO00o21 = i19;
                            iOooO00o13 = iOooO00o13;
                            iOooO00o = i;
                            iOooO00o22 = i17;
                            iOooO00o19 = i12;
                            iOooO00o6 = i11;
                            iOooO00o18 = i10;
                            iOooO00o5 = i9;
                            iOooO00o17 = i8;
                            iOooO00o4 = i7;
                            iOooO00o16 = i6;
                            iOooO00o3 = i5;
                            iOooO00o15 = i4;
                            iOooO00o2 = i3;
                            i24 = i18;
                        }
                        iOooO00o11 = iOooO00o11;
                        iOooO00o12 = iOooO00o12;
                        i3 = iOooO00o2;
                        i4 = iOooO00o15;
                        iOooO00o11 = iOooO00o11;
                        iOooO00o12 = iOooO00o12;
                        i5 = iOooO00o3;
                        i6 = iOooO00o16;
                        iOooO00o11 = iOooO00o11;
                        iOooO00o12 = iOooO00o12;
                        i7 = iOooO00o4;
                        i8 = iOooO00o17;
                        iOooO00o11 = iOooO00o11;
                        iOooO00o12 = iOooO00o12;
                        i9 = iOooO00o5;
                        i10 = iOooO00o18;
                        iOooO00o11 = iOooO00o11;
                        iOooO00o12 = iOooO00o12;
                        i11 = iOooO00o6;
                        i12 = iOooO00o19;
                        iOooO00o11 = iOooO00o11;
                        iOooO00o12 = iOooO00o12;
                        i13 = iOooO00o7;
                        i14 = iOooO00o20;
                        iOooO00o11 = iOooO00o11;
                        iOooO00o12 = iOooO00o12;
                        arrayList = arrayList2;
                        i15 = iOooO00o21;
                        iOooO00o11 = iOooO00o11;
                        iOooO00o12 = iOooO00o12;
                        friend2 = friend;
                        i16 = iOooO00o34;
                        iOooO00o34 = i16;
                        userInfo = new UserInfo();
                        int i31114 = i12;
                        int i31115 = i14;
                        userInfo.setUserId(cursorOooOOO.getLong(iOooO00o8));
                        if (cursorOooOOO.isNull(iOooO00o9)) {
                            string = null;
                        } else {
                            string = cursorOooOOO.getString(iOooO00o9);
                        }
                        userInfo.setUserIdx(string);
                        userInfo.setIdLevel(cursorOooOOO.getInt(iOooO00o10));
                        if (cursorOooOOO.isNull(iOooO00o11)) {
                            string2 = null;
                        } else {
                            string2 = cursorOooOOO.getString(iOooO00o11);
                        }
                        userInfo.setUserName(string2);
                        if (cursorOooOOO.isNull(iOooO00o12)) {
                            string3 = null;
                        } else {
                            string3 = cursorOooOOO.getString(iOooO00o12);
                        }
                        userInfo.setUserHeader(string3);
                        if (cursorOooOOO.isNull(iOooO00o13)) {
                            string4 = null;
                        } else {
                            string4 = cursorOooOOO.getString(iOooO00o13);
                        }
                        userInfo.setUserHeaderFrame(string4);
                        if (cursorOooOOO.isNull(i2)) {
                            string5 = null;
                        } else {
                            string5 = cursorOooOOO.getString(i2);
                        }
                        userInfo.setBackground(string5);
                        userInfo.setUserLevel(cursorOooOOO.getInt(i4));
                        userInfo.setSex(cursorOooOOO.getInt(i6));
                        if (cursorOooOOO.isNull(i8)) {
                            string6 = null;
                        } else {
                            string6 = cursorOooOOO.getString(i8);
                        }
                        userInfo.setBio(string6);
                        if (cursorOooOOO.isNull(i10)) {
                            string7 = null;
                        } else {
                            string7 = cursorOooOOO.getString(i10);
                        }
                        userInfo.setBirthday(string7);
                        i12 = i31114;
                        userInfo.setAge(cursorOooOOO.getInt(i12));
                        i18 = i2;
                        i14 = i31115;
                        userInfo.setCountryId(cursorOooOOO.getInt(i14));
                        userInfo.setRegion(cursorOooOOO.getInt(i15));
                        i17 = iOooO00o22;
                        if (cursorOooOOO.isNull(i17)) {
                            string8 = null;
                        } else {
                            string8 = cursorOooOOO.getString(i17);
                        }
                        userInfo.setMedal(string8);
                        i19 = i15;
                        int i31116 = iOooO00o23;
                        userInfo.setVisitorNum(cursorOooOOO.getInt(i31116));
                        iOooO00o23 = i31116;
                        int i41111113 = iOooO00o24;
                        userInfo.setFollowedNum(cursorOooOOO.getInt(i41111113));
                        iOooO00o24 = i41111113;
                        int i41111114 = iOooO00o25;
                        userInfo.setFansNum(cursorOooOOO.getInt(i41111114));
                        iOooO00o25 = i41111114;
                        int i41111115 = iOooO00o26;
                        userInfo.setJoinRoomNum(cursorOooOOO.getInt(i41111115));
                        iOooO00o26 = i41111115;
                        int i41111116 = iOooO00o27;
                        userInfo.setRole(cursorOooOOO.getInt(i41111116));
                        iOooO00o27 = i41111116;
                        int i41111117 = iOooO00o28;
                        userInfo.setRegTime(cursorOooOOO.getInt(i41111117));
                        int i41111118 = iOooO00o29;
                        iOooO00o29 = i41111118;
                        iOooO00o28 = i41111117;
                        userInfo.setTags(this.f41053OooOO0.stringToList(cursorOooOOO.isNull(i41111118) ? null : cursorOooOOO.getString(i41111118)));
                        i22 = iOooO00o30;
                        if (cursorOooOOO.getInt(i22) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        userInfo.setPremium(z);
                        iOooO00o30 = i22;
                        i20 = iOooO00o31;
                        userInfo.setPremiumLevel(cursorOooOOO.getInt(i20));
                        int i41111119 = iOooO00o32;
                        userInfo.setVipState(cursorOooOOO.getInt(i41111119));
                        iOooO00o32 = i41111119;
                        i21 = iOooO00o33;
                        userInfo.setVipLevel(cursorOooOOO.getInt(i21));
                        i23 = iOooO00o34;
                        iOooO00o34 = i23;
                        if (cursorOooOOO.getInt(i23) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        userInfo.setShowVIP(z2);
                        iOooO00o33 = i21;
                        arrayList2 = arrayList;
                        arrayList2.add(new FriendInfo(userInfo, friend2));
                        iOooO00o31 = i20;
                        iOooO00o20 = i14;
                        iOooO00o7 = i13;
                        iOooO00o21 = i19;
                        iOooO00o13 = iOooO00o13;
                        iOooO00o = i;
                        iOooO00o22 = i17;
                        iOooO00o19 = i12;
                        iOooO00o6 = i11;
                        iOooO00o18 = i10;
                        iOooO00o5 = i9;
                        iOooO00o17 = i8;
                        iOooO00o4 = i7;
                        iOooO00o16 = i6;
                        iOooO00o3 = i5;
                        iOooO00o15 = i4;
                        iOooO00o2 = i3;
                        i24 = i18;
                    } else {
                        iOooO00o11 = iOooO00o11;
                        iOooO00o12 = iOooO00o12;
                    }
                    iOooO00o11 = iOooO00o11;
                    iOooO00o12 = iOooO00o12;
                    iOooO00o11 = iOooO00o11;
                    iOooO00o12 = iOooO00o12;
                    i = iOooO00o;
                    i2 = i24;
                    iOooO00o11 = iOooO00o11;
                    iOooO00o12 = iOooO00o12;
                    i3 = iOooO00o2;
                    i4 = iOooO00o15;
                    iOooO00o11 = iOooO00o11;
                    iOooO00o12 = iOooO00o12;
                    i5 = iOooO00o3;
                    i6 = iOooO00o16;
                    iOooO00o11 = iOooO00o11;
                    iOooO00o12 = iOooO00o12;
                    i7 = iOooO00o4;
                    i8 = iOooO00o17;
                    iOooO00o11 = iOooO00o11;
                    iOooO00o12 = iOooO00o12;
                    i9 = iOooO00o5;
                    i10 = iOooO00o18;
                    iOooO00o11 = iOooO00o11;
                    iOooO00o12 = iOooO00o12;
                    i11 = iOooO00o6;
                    i12 = iOooO00o19;
                    iOooO00o11 = iOooO00o11;
                    iOooO00o12 = iOooO00o12;
                    i13 = iOooO00o7;
                    i14 = iOooO00o20;
                    iOooO00o11 = iOooO00o11;
                    iOooO00o12 = iOooO00o12;
                    arrayList = arrayList2;
                    i15 = iOooO00o21;
                    iOooO00o11 = iOooO00o11;
                    iOooO00o12 = iOooO00o12;
                    friend2 = friend;
                    i16 = iOooO00o34;
                    iOooO00o34 = i16;
                    userInfo = new UserInfo();
                    int i31117 = i12;
                    int i31118 = i14;
                    userInfo.setUserId(cursorOooOOO.getLong(iOooO00o8));
                    if (cursorOooOOO.isNull(iOooO00o9)) {
                        string = null;
                    } else {
                        string = cursorOooOOO.getString(iOooO00o9);
                    }
                    userInfo.setUserIdx(string);
                    userInfo.setIdLevel(cursorOooOOO.getInt(iOooO00o10));
                    if (cursorOooOOO.isNull(iOooO00o11)) {
                        string2 = null;
                    } else {
                        string2 = cursorOooOOO.getString(iOooO00o11);
                    }
                    userInfo.setUserName(string2);
                    if (cursorOooOOO.isNull(iOooO00o12)) {
                        string3 = null;
                    } else {
                        string3 = cursorOooOOO.getString(iOooO00o12);
                    }
                    userInfo.setUserHeader(string3);
                    if (cursorOooOOO.isNull(iOooO00o13)) {
                        string4 = null;
                    } else {
                        string4 = cursorOooOOO.getString(iOooO00o13);
                    }
                    userInfo.setUserHeaderFrame(string4);
                    if (cursorOooOOO.isNull(i2)) {
                        string5 = null;
                    } else {
                        string5 = cursorOooOOO.getString(i2);
                    }
                    userInfo.setBackground(string5);
                    userInfo.setUserLevel(cursorOooOOO.getInt(i4));
                    userInfo.setSex(cursorOooOOO.getInt(i6));
                    if (cursorOooOOO.isNull(i8)) {
                        string6 = null;
                    } else {
                        string6 = cursorOooOOO.getString(i8);
                    }
                    userInfo.setBio(string6);
                    if (cursorOooOOO.isNull(i10)) {
                        string7 = null;
                    } else {
                        string7 = cursorOooOOO.getString(i10);
                    }
                    userInfo.setBirthday(string7);
                    i12 = i31117;
                    userInfo.setAge(cursorOooOOO.getInt(i12));
                    i18 = i2;
                    i14 = i31118;
                    userInfo.setCountryId(cursorOooOOO.getInt(i14));
                    userInfo.setRegion(cursorOooOOO.getInt(i15));
                    i17 = iOooO00o22;
                    if (cursorOooOOO.isNull(i17)) {
                        string8 = null;
                    } else {
                        string8 = cursorOooOOO.getString(i17);
                    }
                    userInfo.setMedal(string8);
                    i19 = i15;
                    int i31119 = iOooO00o23;
                    userInfo.setVisitorNum(cursorOooOOO.getInt(i31119));
                    iOooO00o23 = i31119;
                    int i411111110 = iOooO00o24;
                    userInfo.setFollowedNum(cursorOooOOO.getInt(i411111110));
                    iOooO00o24 = i411111110;
                    int i411111111 = iOooO00o25;
                    userInfo.setFansNum(cursorOooOOO.getInt(i411111111));
                    iOooO00o25 = i411111111;
                    int i411111112 = iOooO00o26;
                    userInfo.setJoinRoomNum(cursorOooOOO.getInt(i411111112));
                    iOooO00o26 = i411111112;
                    int i411111113 = iOooO00o27;
                    userInfo.setRole(cursorOooOOO.getInt(i411111113));
                    iOooO00o27 = i411111113;
                    int i411111114 = iOooO00o28;
                    userInfo.setRegTime(cursorOooOOO.getInt(i411111114));
                    int i411111115 = iOooO00o29;
                    iOooO00o29 = i411111115;
                    iOooO00o28 = i411111114;
                    userInfo.setTags(this.f41053OooOO0.stringToList(cursorOooOOO.isNull(i411111115) ? null : cursorOooOOO.getString(i411111115)));
                    i22 = iOooO00o30;
                    if (cursorOooOOO.getInt(i22) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    userInfo.setPremium(z);
                    iOooO00o30 = i22;
                    i20 = iOooO00o31;
                    userInfo.setPremiumLevel(cursorOooOOO.getInt(i20));
                    int i411111116 = iOooO00o32;
                    userInfo.setVipState(cursorOooOOO.getInt(i411111116));
                    iOooO00o32 = i411111116;
                    i21 = iOooO00o33;
                    userInfo.setVipLevel(cursorOooOOO.getInt(i21));
                    i23 = iOooO00o34;
                    iOooO00o34 = i23;
                    if (cursorOooOOO.getInt(i23) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    userInfo.setShowVIP(z2);
                    iOooO00o33 = i21;
                    arrayList2 = arrayList;
                    arrayList2.add(new FriendInfo(userInfo, friend2));
                    iOooO00o31 = i20;
                    iOooO00o20 = i14;
                    iOooO00o7 = i13;
                    iOooO00o21 = i19;
                    iOooO00o13 = iOooO00o13;
                    iOooO00o = i;
                    iOooO00o22 = i17;
                    iOooO00o19 = i12;
                    iOooO00o6 = i11;
                    iOooO00o18 = i10;
                    iOooO00o5 = i9;
                    iOooO00o17 = i8;
                    iOooO00o4 = i7;
                    iOooO00o16 = i6;
                    iOooO00o3 = i5;
                    iOooO00o15 = i4;
                    iOooO00o2 = i3;
                    i24 = i18;
                }
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList2;
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

    @Override // p490o0o00O0.Oooo0
    public final Flow<Integer> OooOO0O(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select count() from FriendTable Where uid = ?", 1);
        o0000o0OooO0o.bindLong(1, j);
        return o0Oo0oo.OooO00o(this.f41045OooO00o, new String[]{"FriendTable"}, new OooO0o(o0000o0OooO0o));
    }

    @Override // p490o0o00O0.Oooo0
    public final Friend OooOO0o(long j) {
        boolean z = true;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendTable Where uid = ? order by time Desc", 1);
        o0000o0OooO0o.bindLong(1, j);
        this.f41045OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f41045OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "uid");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "friendId");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "memoName");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "time");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "inRoom");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "deleteMark");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "isCheckUserRisk");
            Friend friend = null;
            String string = null;
            if (cursorOooOOO.moveToFirst()) {
                Friend friend2 = new Friend();
                friend2.setUid(cursorOooOOO.getLong(iOooO00o));
                friend2.setFriendId(cursorOooOOO.getLong(iOooO00o2));
                if (!cursorOooOOO.isNull(iOooO00o3)) {
                    string = cursorOooOOO.getString(iOooO00o3);
                }
                friend2.setMemoName(string);
                friend2.setTime(cursorOooOOO.getLong(iOooO00o4));
                friend2.setInRoom(cursorOooOOO.getInt(iOooO00o5) != 0);
                friend2.setDeleteMark(cursorOooOOO.getInt(iOooO00o6) != 0);
                if (cursorOooOOO.getInt(iOooO00o7) == 0) {
                    z = false;
                }
                friend2.setCheckUserRisk(z);
                friend = friend2;
            }
            return friend;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p490o0o00O0.Oooo0
    public final void OooOOO(long j, long j2) {
        this.f41045OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41048OooO0Oo.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        supportSQLiteStatementOooO00o.bindLong(2, j2);
        this.f41045OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41045OooO00o.OooOOOO();
        } finally {
            this.f41045OooO00o.OooOO0O();
            this.f41048OooO0Oo.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.Oooo0
    public final void OooOOO0(long j, long j2, boolean z) {
        this.f41045OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41047OooO0OO.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        this.f41045OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41045OooO00o.OooOOOO();
        } finally {
            this.f41045OooO00o.OooOO0O();
            this.f41047OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.Oooo0
    public final void OooOOOO(long j) {
        this.f41045OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41051OooO0oO.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, j);
        this.f41045OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41045OooO00o.OooOOOO();
        } finally {
            this.f41045OooO00o.OooOO0O();
            this.f41051OooO0oO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p490o0o00O0.Oooo0
    public final o00O00o0<Integer, FriendInfo> OooOOOo(long j, String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendTable inner join UserInfoTable on UserInfoTable.userId = FriendTable.friendId Where FriendTable.uid = ? and (FriendTable.memoName like '%' || ? || '%' or UserInfoTable.userName like '%' || ? || '%' or UserInfoTable.userIdx like '%' || ? || '%') Order by FriendTable.inRoom DESC, FriendTable.time DESC", 4);
        o0000o0OooO0o.bindLong(1, j);
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
        if (str == null) {
            o0000o0OooO0o.bindNull(4);
        } else {
            o0000o0OooO0o.bindString(4, str);
        }
        return new OooO0OO(o0000o0OooO0o, this.f41045OooO00o, "FriendTable", "UserInfoTable");
    }

    @Override // p490o0o00O0.Oooo0
    public final Flow<Friend> OooOOo(long j, long j2) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from FriendTable Where uid = ? and friendId = ? order by time", 2);
        o0000o0OooO0o.bindLong(1, j);
        o0000o0OooO0o.bindLong(2, j2);
        return o0Oo0oo.OooO00o(this.f41045OooO00o, new String[]{"FriendTable"}, new OooO00o(o0000o0OooO0o));
    }

    @Override // p490o0o00O0.Oooo0
    public final void OooOOo0(long j, long j2, String str) {
        this.f41045OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f41044OooO.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        supportSQLiteStatementOooO00o.bindLong(2, j);
        supportSQLiteStatementOooO00o.bindLong(3, j2);
        this.f41045OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f41045OooO00o.OooOOOO();
        } finally {
            this.f41045OooO00o.OooOO0O();
            this.f41044OooO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }
}
