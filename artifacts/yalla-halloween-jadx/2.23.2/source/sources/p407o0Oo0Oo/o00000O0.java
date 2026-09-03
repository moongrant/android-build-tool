package p407o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.db.table.Conversation;
import com.yalla.yalla.data.db.table.ConversationWithUser;
import com.yalla.yalla.data.db.table.UserInfo;
import java.util.ArrayList;
import o00.OooO00o;
import p111o000oooO.oOO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends oOO00O<ConversationWithUser> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00000 f45758OooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(o00000 o00000Var, RoomSQLiteQuery roomSQLiteQuery, RoomDatabase roomDatabase, String... strArr) {
        super(roomSQLiteQuery, roomDatabase, strArr);
        this.f45758OooO0o = o00000Var;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x03da  */
    /* JADX WARN: Code duplicated, block: B:127:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:130:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:131:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:135:0x0401  */
    /* JADX WARN: Code duplicated, block: B:138:0x040e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0410  */
    /* JADX WARN: Code duplicated, block: B:142:0x041d  */
    /* JADX WARN: Code duplicated, block: B:143:0x041f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0433  */
    /* JADX WARN: Code duplicated, block: B:147:0x0436  */
    /* JADX WARN: Code duplicated, block: B:150:0x0448  */
    /* JADX WARN: Code duplicated, block: B:151:0x044a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0459  */
    /* JADX WARN: Code duplicated, block: B:155:0x045b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0487  */
    /* JADX WARN: Code duplicated, block: B:159:0x048b  */
    /* JADX WARN: Code duplicated, block: B:162:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:163:0x04de  */
    /* JADX WARN: Code duplicated, block: B:166:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:167:0x0502  */
    /* JADX WARN: Code duplicated, block: B:170:0x052c  */
    /* JADX WARN: Code duplicated, block: B:171:0x052f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0547  */
    /* JADX WARN: Code duplicated, block: B:175:0x054b  */
    @Override // p111o000oooO.oOO00O
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
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        ArrayList arrayList;
        int i25;
        Conversation conversation;
        int i26;
        UserInfo userInfo;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        boolean z;
        String string6;
        String string7;
        int i27;
        int i28;
        int i29;
        int i30;
        String string8;
        String string9;
        int i31;
        boolean z2;
        int i32;
        boolean z3;
        int i33;
        String string10;
        int i34;
        Cursor cursor2 = cursor;
        int iOooO00o = OooO00o.OooO00o(cursor2, "uid");
        int iOooO00o2 = OooO00o.OooO00o(cursor2, "targetId");
        int iOooO00o3 = OooO00o.OooO00o(cursor2, "mid");
        int iOooO00o4 = OooO00o.OooO00o(cursor2, "sendState");
        int iOooO00o5 = OooO00o.OooO00o(cursor2, ShareConstants.WEB_DIALOG_PARAM_TITLE);
        int iOooO00o6 = OooO00o.OooO00o(cursor2, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        int iOooO00o7 = OooO00o.OooO00o(cursor2, "type");
        int iOooO00o8 = OooO00o.OooO00o(cursor2, "momentType");
        int iOooO00o9 = OooO00o.OooO00o(cursor2, "unReadCount");
        int iOooO00o10 = OooO00o.OooO00o(cursor2, "draft");
        int iOooO00o11 = OooO00o.OooO00o(cursor2, "time");
        int iOooO00o12 = OooO00o.OooO00o(cursor2, "topTime");
        int iOooO00o13 = OooO00o.OooO00o(cursor2, "isVoiceAndUnread");
        int iOooO00o14 = OooO00o.OooO00o(cursor2, "isAcceptMsg");
        int iOooO00o15 = OooO00o.OooO00o(cursor2, "userId");
        int iOooO00o16 = OooO00o.OooO00o(cursor2, "userIdx");
        int iOooO00o17 = OooO00o.OooO00o(cursor2, "idLevel");
        int iOooO00o18 = OooO00o.OooO00o(cursor2, "userName");
        int iOooO00o19 = OooO00o.OooO00o(cursor2, "userAvatar");
        int iOooO00o20 = OooO00o.OooO00o(cursor2, "userFrame");
        int iOooO00o21 = OooO00o.OooO00o(cursor2, "background");
        int iOooO00o22 = OooO00o.OooO00o(cursor2, "userLevel");
        int iOooO00o23 = OooO00o.OooO00o(cursor2, "isBlackUser");
        int iOooO00o24 = OooO00o.OooO00o(cursor2, "gender");
        int iOooO00o25 = OooO00o.OooO00o(cursor2, "bio");
        int iOooO00o26 = OooO00o.OooO00o(cursor2, "birthday");
        int iOooO00o27 = OooO00o.OooO00o(cursor2, "age");
        int iOooO00o28 = OooO00o.OooO00o(cursor2, "countryId");
        int iOooO00o29 = OooO00o.OooO00o(cursor2, "region");
        int iOooO00o30 = OooO00o.OooO00o(cursor2, "medal");
        int iOooO00o31 = OooO00o.OooO00o(cursor2, "visitorNum");
        int iOooO00o32 = OooO00o.OooO00o(cursor2, "followedNum");
        int iOooO00o33 = OooO00o.OooO00o(cursor2, "fansNum");
        int iOooO00o34 = OooO00o.OooO00o(cursor2, "joinRoomNum");
        int iOooO00o35 = OooO00o.OooO00o(cursor2, "role");
        int iOooO00o36 = OooO00o.OooO00o(cursor2, "regTime");
        int iOooO00o37 = OooO00o.OooO00o(cursor2, "tags");
        int iOooO00o38 = OooO00o.OooO00o(cursor2, "vip");
        int iOooO00o39 = OooO00o.OooO00o(cursor2, "vipLevel");
        int iOooO00o40 = OooO00o.OooO00o(cursor2, "kaVipState");
        int iOooO00o41 = OooO00o.OooO00o(cursor2, "kaVipLevel");
        int iOooO00o42 = OooO00o.OooO00o(cursor2, "showVIP");
        int iOooO00o43 = OooO00o.OooO00o(cursor2, "currWealLv");
        int iOooO00o44 = OooO00o.OooO00o(cursor2, "currBadgeImg");
        int iOooO00o45 = OooO00o.OooO00o(cursor2, "currBadgeLv");
        int i35 = iOooO00o14;
        ArrayList arrayList2 = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            Conversation conversation2 = new Conversation();
            int i36 = iOooO00o12;
            int i37 = iOooO00o13;
            conversation2.setUid(cursor2.getLong(iOooO00o));
            conversation2.setTargetId(cursor2.getLong(iOooO00o2));
            conversation2.setMid(cursor2.isNull(iOooO00o3) ? null : cursor2.getString(iOooO00o3));
            conversation2.setSendState(cursor2.getInt(iOooO00o4));
            conversation2.setTitle(cursor2.isNull(iOooO00o5) ? null : cursor2.getString(iOooO00o5));
            conversation2.setMessage(cursor2.isNull(iOooO00o6) ? null : cursor2.getString(iOooO00o6));
            conversation2.setType(cursor2.getInt(iOooO00o7));
            conversation2.setMomentType(cursor2.getInt(iOooO00o8));
            conversation2.setUnReadCount(cursor2.getInt(iOooO00o9));
            conversation2.setDraft(cursor2.isNull(iOooO00o10) ? null : cursor2.getString(iOooO00o10));
            int i38 = iOooO00o;
            int i39 = iOooO00o2;
            conversation2.setTime(cursor2.getLong(iOooO00o11));
            int i40 = iOooO00o3;
            conversation2.setTopTime(cursor2.getLong(i36));
            conversation2.setVoiceAndUnread(cursor2.getInt(i37) != 0);
            int i41 = i35;
            conversation2.setAcceptMsg(cursor2.getInt(i41) != 0);
            int i42 = iOooO00o15;
            if (cursor2.isNull(i42)) {
                i = i36;
                i2 = iOooO00o16;
                if (cursor2.isNull(i2)) {
                    i3 = i37;
                    i4 = iOooO00o17;
                    if (cursor2.isNull(i4)) {
                        i5 = i41;
                        i6 = iOooO00o18;
                        if (cursor2.isNull(i6)) {
                            i7 = iOooO00o4;
                            i8 = iOooO00o19;
                            if (cursor2.isNull(i8)) {
                                i9 = iOooO00o5;
                                i10 = iOooO00o20;
                                if (cursor2.isNull(i10)) {
                                    i11 = iOooO00o6;
                                    i12 = iOooO00o21;
                                    if (cursor2.isNull(i12)) {
                                        i13 = iOooO00o7;
                                        i14 = iOooO00o22;
                                        if (cursor2.isNull(i14)) {
                                            i15 = iOooO00o8;
                                            i16 = iOooO00o23;
                                            if (cursor2.isNull(i16)) {
                                                i17 = iOooO00o9;
                                                i18 = iOooO00o24;
                                                if (cursor2.isNull(i18)) {
                                                    i19 = iOooO00o10;
                                                    i20 = iOooO00o25;
                                                    if (cursor2.isNull(i20)) {
                                                        i21 = iOooO00o11;
                                                        i22 = iOooO00o26;
                                                        if (cursor2.isNull(i22)) {
                                                            i23 = i38;
                                                            i24 = iOooO00o27;
                                                            if (cursor2.isNull(i24)) {
                                                                arrayList = arrayList2;
                                                                i25 = iOooO00o28;
                                                                if (cursor2.isNull(i25)) {
                                                                    conversation = conversation2;
                                                                    int i43 = iOooO00o29;
                                                                    if (cursor2.isNull(i43)) {
                                                                        iOooO00o29 = i43;
                                                                        int i44 = iOooO00o30;
                                                                        if (cursor2.isNull(i44)) {
                                                                            iOooO00o30 = i44;
                                                                            int i45 = iOooO00o31;
                                                                            if (cursor2.isNull(i45)) {
                                                                                iOooO00o31 = i45;
                                                                                int i46 = iOooO00o32;
                                                                                if (cursor2.isNull(i46)) {
                                                                                    iOooO00o32 = i46;
                                                                                    int i47 = iOooO00o33;
                                                                                    if (cursor2.isNull(i47)) {
                                                                                        iOooO00o33 = i47;
                                                                                        int i48 = iOooO00o34;
                                                                                        if (cursor2.isNull(i48)) {
                                                                                            iOooO00o34 = i48;
                                                                                            int i49 = iOooO00o35;
                                                                                            if (cursor2.isNull(i49)) {
                                                                                                iOooO00o35 = i49;
                                                                                                int i50 = iOooO00o36;
                                                                                                if (cursor2.isNull(i50)) {
                                                                                                    iOooO00o36 = i50;
                                                                                                    int i51 = iOooO00o37;
                                                                                                    if (cursor2.isNull(i51)) {
                                                                                                        iOooO00o37 = i51;
                                                                                                        int i52 = iOooO00o38;
                                                                                                        if (cursor2.isNull(i52)) {
                                                                                                            iOooO00o38 = i52;
                                                                                                            int i53 = iOooO00o39;
                                                                                                            if (cursor2.isNull(i53)) {
                                                                                                                iOooO00o39 = i53;
                                                                                                                int i54 = iOooO00o40;
                                                                                                                if (cursor2.isNull(i54)) {
                                                                                                                    iOooO00o40 = i54;
                                                                                                                    int i55 = iOooO00o41;
                                                                                                                    if (cursor2.isNull(i55)) {
                                                                                                                        iOooO00o41 = i55;
                                                                                                                        int i56 = iOooO00o42;
                                                                                                                        if (cursor2.isNull(i56)) {
                                                                                                                            iOooO00o42 = i56;
                                                                                                                            int i57 = iOooO00o43;
                                                                                                                            if (cursor2.isNull(i57)) {
                                                                                                                                iOooO00o43 = i57;
                                                                                                                                int i58 = iOooO00o44;
                                                                                                                                if (cursor2.isNull(i58)) {
                                                                                                                                    iOooO00o44 = i58;
                                                                                                                                    i26 = iOooO00o45;
                                                                                                                                    if (cursor2.isNull(i26)) {
                                                                                                                                        i27 = i2;
                                                                                                                                        i6 = i6;
                                                                                                                                        i34 = i26;
                                                                                                                                        i28 = iOooO00o29;
                                                                                                                                        i32 = iOooO00o39;
                                                                                                                                        userInfo = null;
                                                                                                                                        i29 = i4;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    iOooO00o44 = i58;
                                                                                                                                }
                                                                                                                                ArrayList arrayList3 = arrayList;
                                                                                                                                arrayList3.add(new ConversationWithUser(conversation, userInfo));
                                                                                                                                iOooO00o45 = i34;
                                                                                                                                iOooO00o39 = i32;
                                                                                                                                iOooO00o27 = i24;
                                                                                                                                iOooO00o28 = i25;
                                                                                                                                iOooO00o12 = i;
                                                                                                                                i35 = i5;
                                                                                                                                iOooO00o = i23;
                                                                                                                                iOooO00o17 = i29;
                                                                                                                                iOooO00o3 = i40;
                                                                                                                                iOooO00o2 = i39;
                                                                                                                                iOooO00o29 = i28;
                                                                                                                                arrayList2 = arrayList3;
                                                                                                                                iOooO00o26 = i22;
                                                                                                                                iOooO00o15 = i42;
                                                                                                                                iOooO00o13 = i3;
                                                                                                                                iOooO00o11 = i21;
                                                                                                                                iOooO00o16 = i27;
                                                                                                                                cursor2 = cursor;
                                                                                                                                iOooO00o25 = i20;
                                                                                                                                iOooO00o10 = i19;
                                                                                                                                iOooO00o24 = i18;
                                                                                                                                iOooO00o9 = i17;
                                                                                                                                iOooO00o23 = i16;
                                                                                                                                iOooO00o8 = i15;
                                                                                                                                iOooO00o22 = i14;
                                                                                                                                iOooO00o7 = i13;
                                                                                                                                iOooO00o21 = i12;
                                                                                                                                iOooO00o6 = i11;
                                                                                                                                iOooO00o20 = i10;
                                                                                                                                iOooO00o5 = i9;
                                                                                                                                iOooO00o19 = i8;
                                                                                                                                iOooO00o4 = i7;
                                                                                                                                iOooO00o18 = i6;
                                                                                                                            } else {
                                                                                                                                iOooO00o43 = i57;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            iOooO00o42 = i56;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        iOooO00o41 = i55;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    iOooO00o40 = i54;
                                                                                                                }
                                                                                                            } else {
                                                                                                                iOooO00o39 = i53;
                                                                                                            }
                                                                                                        } else {
                                                                                                            iOooO00o38 = i52;
                                                                                                        }
                                                                                                    } else {
                                                                                                        iOooO00o37 = i51;
                                                                                                    }
                                                                                                } else {
                                                                                                    iOooO00o36 = i50;
                                                                                                }
                                                                                            } else {
                                                                                                iOooO00o35 = i49;
                                                                                            }
                                                                                        } else {
                                                                                            iOooO00o34 = i48;
                                                                                        }
                                                                                    } else {
                                                                                        iOooO00o33 = i47;
                                                                                    }
                                                                                } else {
                                                                                    iOooO00o32 = i46;
                                                                                }
                                                                            } else {
                                                                                iOooO00o31 = i45;
                                                                            }
                                                                        } else {
                                                                            iOooO00o30 = i44;
                                                                        }
                                                                    } else {
                                                                        iOooO00o29 = i43;
                                                                    }
                                                                    userInfo = new UserInfo();
                                                                    int i59 = i22;
                                                                    int i60 = i24;
                                                                    userInfo.setUserId(cursor2.getLong(i42));
                                                                    if (cursor2.isNull(i2)) {
                                                                        string = null;
                                                                    } else {
                                                                        string = cursor2.getString(i2);
                                                                    }
                                                                    userInfo.setUserIdx(string);
                                                                    userInfo.setIdLevel(cursor2.getInt(i4));
                                                                    if (cursor2.isNull(i6)) {
                                                                        string2 = null;
                                                                    } else {
                                                                        string2 = cursor2.getString(i6);
                                                                    }
                                                                    userInfo.setUserName(string2);
                                                                    if (cursor2.isNull(i8)) {
                                                                        string3 = null;
                                                                    } else {
                                                                        string3 = cursor2.getString(i8);
                                                                    }
                                                                    userInfo.setUserHeader(string3);
                                                                    if (cursor2.isNull(i10)) {
                                                                        string4 = null;
                                                                    } else {
                                                                        string4 = cursor2.getString(i10);
                                                                    }
                                                                    userInfo.setUserHeaderFrame(string4);
                                                                    if (cursor2.isNull(i12)) {
                                                                        string5 = null;
                                                                    } else {
                                                                        string5 = cursor2.getString(i12);
                                                                    }
                                                                    userInfo.setBackground(string5);
                                                                    userInfo.setUserLevel(cursor2.getInt(i14));
                                                                    if (cursor2.getInt(i16) != 0) {
                                                                        z = true;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    userInfo.setBlackUser(z);
                                                                    userInfo.setSex(cursor2.getInt(i18));
                                                                    if (cursor2.isNull(i20)) {
                                                                        string6 = null;
                                                                    } else {
                                                                        string6 = cursor2.getString(i20);
                                                                    }
                                                                    userInfo.setBio(string6);
                                                                    i22 = i59;
                                                                    if (cursor2.isNull(i22)) {
                                                                        string7 = null;
                                                                    } else {
                                                                        string7 = cursor2.getString(i22);
                                                                    }
                                                                    userInfo.setBirthday(string7);
                                                                    i27 = i2;
                                                                    i24 = i60;
                                                                    userInfo.setAge(cursor2.getInt(i24));
                                                                    userInfo.setCountryId(cursor2.getInt(i25));
                                                                    i28 = iOooO00o29;
                                                                    i29 = i4;
                                                                    userInfo.setRegion(cursor2.getInt(i28));
                                                                    i30 = iOooO00o30;
                                                                    if (cursor2.isNull(i30)) {
                                                                        string8 = null;
                                                                    } else {
                                                                        string8 = cursor2.getString(i30);
                                                                    }
                                                                    userInfo.setMedal(string8);
                                                                    iOooO00o30 = i30;
                                                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                                                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                                                                    userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                                                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                                                                    userInfo.setRole(cursor2.getInt(iOooO00o35));
                                                                    iOooO00o36 = iOooO00o36;
                                                                    userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                                                                    iOooO00o37 = iOooO00o37;
                                                                    if (cursor2.isNull(iOooO00o37)) {
                                                                        string9 = null;
                                                                    } else {
                                                                        string9 = cursor2.getString(iOooO00o37);
                                                                    }
                                                                    userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                                                                    i31 = iOooO00o38;
                                                                    if (cursor2.getInt(i31) != 0) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    userInfo.setPremium(z2);
                                                                    iOooO00o38 = i31;
                                                                    i32 = iOooO00o39;
                                                                    userInfo.setPremiumLevel(cursor2.getInt(i32));
                                                                    userInfo.setVipState(cursor2.getInt(iOooO00o40));
                                                                    int i61 = iOooO00o41;
                                                                    userInfo.setVipLevel(cursor2.getInt(i61));
                                                                    if (cursor2.getInt(iOooO00o42) != 0) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = false;
                                                                    }
                                                                    userInfo.setShowVIP(z3);
                                                                    iOooO00o41 = i61;
                                                                    iOooO00o43 = iOooO00o43;
                                                                    userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                                                                    i33 = iOooO00o44;
                                                                    if (cursor2.isNull(i33)) {
                                                                        string10 = null;
                                                                    } else {
                                                                        string10 = cursor2.getString(i33);
                                                                    }
                                                                    userInfo.setWealthBadgeWithBg(string10);
                                                                    iOooO00o44 = i33;
                                                                    i34 = iOooO00o45;
                                                                    userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                                                                    ArrayList arrayList4 = arrayList;
                                                                    arrayList4.add(new ConversationWithUser(conversation, userInfo));
                                                                    iOooO00o45 = i34;
                                                                    iOooO00o39 = i32;
                                                                    iOooO00o27 = i24;
                                                                    iOooO00o28 = i25;
                                                                    iOooO00o12 = i;
                                                                    i35 = i5;
                                                                    iOooO00o = i23;
                                                                    iOooO00o17 = i29;
                                                                    iOooO00o3 = i40;
                                                                    iOooO00o2 = i39;
                                                                    iOooO00o29 = i28;
                                                                    arrayList2 = arrayList4;
                                                                    iOooO00o26 = i22;
                                                                    iOooO00o15 = i42;
                                                                    iOooO00o13 = i3;
                                                                    iOooO00o11 = i21;
                                                                    iOooO00o16 = i27;
                                                                    cursor2 = cursor;
                                                                    iOooO00o25 = i20;
                                                                    iOooO00o10 = i19;
                                                                    iOooO00o24 = i18;
                                                                    iOooO00o9 = i17;
                                                                    iOooO00o23 = i16;
                                                                    iOooO00o8 = i15;
                                                                    iOooO00o22 = i14;
                                                                    iOooO00o7 = i13;
                                                                    iOooO00o21 = i12;
                                                                    iOooO00o6 = i11;
                                                                    iOooO00o20 = i10;
                                                                    iOooO00o5 = i9;
                                                                    iOooO00o19 = i8;
                                                                    iOooO00o4 = i7;
                                                                    iOooO00o18 = i6;
                                                                }
                                                                iOooO00o45 = i26;
                                                                userInfo = new UserInfo();
                                                                int i510 = i22;
                                                                int i62 = i24;
                                                                userInfo.setUserId(cursor2.getLong(i42));
                                                                if (cursor2.isNull(i2)) {
                                                                    string = null;
                                                                } else {
                                                                    string = cursor2.getString(i2);
                                                                }
                                                                userInfo.setUserIdx(string);
                                                                userInfo.setIdLevel(cursor2.getInt(i4));
                                                                if (cursor2.isNull(i6)) {
                                                                    string2 = null;
                                                                } else {
                                                                    string2 = cursor2.getString(i6);
                                                                }
                                                                userInfo.setUserName(string2);
                                                                if (cursor2.isNull(i8)) {
                                                                    string3 = null;
                                                                } else {
                                                                    string3 = cursor2.getString(i8);
                                                                }
                                                                userInfo.setUserHeader(string3);
                                                                if (cursor2.isNull(i10)) {
                                                                    string4 = null;
                                                                } else {
                                                                    string4 = cursor2.getString(i10);
                                                                }
                                                                userInfo.setUserHeaderFrame(string4);
                                                                if (cursor2.isNull(i12)) {
                                                                    string5 = null;
                                                                } else {
                                                                    string5 = cursor2.getString(i12);
                                                                }
                                                                userInfo.setBackground(string5);
                                                                userInfo.setUserLevel(cursor2.getInt(i14));
                                                                if (cursor2.getInt(i16) != 0) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                userInfo.setBlackUser(z);
                                                                userInfo.setSex(cursor2.getInt(i18));
                                                                if (cursor2.isNull(i20)) {
                                                                    string6 = null;
                                                                } else {
                                                                    string6 = cursor2.getString(i20);
                                                                }
                                                                userInfo.setBio(string6);
                                                                i22 = i510;
                                                                if (cursor2.isNull(i22)) {
                                                                    string7 = null;
                                                                } else {
                                                                    string7 = cursor2.getString(i22);
                                                                }
                                                                userInfo.setBirthday(string7);
                                                                i27 = i2;
                                                                i24 = i62;
                                                                userInfo.setAge(cursor2.getInt(i24));
                                                                userInfo.setCountryId(cursor2.getInt(i25));
                                                                i28 = iOooO00o29;
                                                                i29 = i4;
                                                                userInfo.setRegion(cursor2.getInt(i28));
                                                                i30 = iOooO00o30;
                                                                if (cursor2.isNull(i30)) {
                                                                    string8 = null;
                                                                } else {
                                                                    string8 = cursor2.getString(i30);
                                                                }
                                                                userInfo.setMedal(string8);
                                                                iOooO00o30 = i30;
                                                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                                                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                                                                userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                                                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                                                                userInfo.setRole(cursor2.getInt(iOooO00o35));
                                                                iOooO00o36 = iOooO00o36;
                                                                userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                                                                iOooO00o37 = iOooO00o37;
                                                                if (cursor2.isNull(iOooO00o37)) {
                                                                    string9 = null;
                                                                } else {
                                                                    string9 = cursor2.getString(iOooO00o37);
                                                                }
                                                                userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                                                                i31 = iOooO00o38;
                                                                if (cursor2.getInt(i31) != 0) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                userInfo.setPremium(z2);
                                                                iOooO00o38 = i31;
                                                                i32 = iOooO00o39;
                                                                userInfo.setPremiumLevel(cursor2.getInt(i32));
                                                                userInfo.setVipState(cursor2.getInt(iOooO00o40));
                                                                int i63 = iOooO00o41;
                                                                userInfo.setVipLevel(cursor2.getInt(i63));
                                                                if (cursor2.getInt(iOooO00o42) != 0) {
                                                                    z3 = true;
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                                userInfo.setShowVIP(z3);
                                                                iOooO00o41 = i63;
                                                                iOooO00o43 = iOooO00o43;
                                                                userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                                                                i33 = iOooO00o44;
                                                                if (cursor2.isNull(i33)) {
                                                                    string10 = null;
                                                                } else {
                                                                    string10 = cursor2.getString(i33);
                                                                }
                                                                userInfo.setWealthBadgeWithBg(string10);
                                                                iOooO00o44 = i33;
                                                                i34 = iOooO00o45;
                                                                userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                                                                ArrayList arrayList5 = arrayList;
                                                                arrayList5.add(new ConversationWithUser(conversation, userInfo));
                                                                iOooO00o45 = i34;
                                                                iOooO00o39 = i32;
                                                                iOooO00o27 = i24;
                                                                iOooO00o28 = i25;
                                                                iOooO00o12 = i;
                                                                i35 = i5;
                                                                iOooO00o = i23;
                                                                iOooO00o17 = i29;
                                                                iOooO00o3 = i40;
                                                                iOooO00o2 = i39;
                                                                iOooO00o29 = i28;
                                                                arrayList2 = arrayList5;
                                                                iOooO00o26 = i22;
                                                                iOooO00o15 = i42;
                                                                iOooO00o13 = i3;
                                                                iOooO00o11 = i21;
                                                                iOooO00o16 = i27;
                                                                cursor2 = cursor;
                                                                iOooO00o25 = i20;
                                                                iOooO00o10 = i19;
                                                                iOooO00o24 = i18;
                                                                iOooO00o9 = i17;
                                                                iOooO00o23 = i16;
                                                                iOooO00o8 = i15;
                                                                iOooO00o22 = i14;
                                                                iOooO00o7 = i13;
                                                                iOooO00o21 = i12;
                                                                iOooO00o6 = i11;
                                                                iOooO00o20 = i10;
                                                                iOooO00o5 = i9;
                                                                iOooO00o19 = i8;
                                                                iOooO00o4 = i7;
                                                                iOooO00o18 = i6;
                                                            }
                                                            conversation = conversation2;
                                                            i26 = iOooO00o45;
                                                            iOooO00o45 = i26;
                                                            userInfo = new UserInfo();
                                                            int i511 = i22;
                                                            int i64 = i24;
                                                            userInfo.setUserId(cursor2.getLong(i42));
                                                            if (cursor2.isNull(i2)) {
                                                                string = null;
                                                            } else {
                                                                string = cursor2.getString(i2);
                                                            }
                                                            userInfo.setUserIdx(string);
                                                            userInfo.setIdLevel(cursor2.getInt(i4));
                                                            if (cursor2.isNull(i6)) {
                                                                string2 = null;
                                                            } else {
                                                                string2 = cursor2.getString(i6);
                                                            }
                                                            userInfo.setUserName(string2);
                                                            if (cursor2.isNull(i8)) {
                                                                string3 = null;
                                                            } else {
                                                                string3 = cursor2.getString(i8);
                                                            }
                                                            userInfo.setUserHeader(string3);
                                                            if (cursor2.isNull(i10)) {
                                                                string4 = null;
                                                            } else {
                                                                string4 = cursor2.getString(i10);
                                                            }
                                                            userInfo.setUserHeaderFrame(string4);
                                                            if (cursor2.isNull(i12)) {
                                                                string5 = null;
                                                            } else {
                                                                string5 = cursor2.getString(i12);
                                                            }
                                                            userInfo.setBackground(string5);
                                                            userInfo.setUserLevel(cursor2.getInt(i14));
                                                            if (cursor2.getInt(i16) != 0) {
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            userInfo.setBlackUser(z);
                                                            userInfo.setSex(cursor2.getInt(i18));
                                                            if (cursor2.isNull(i20)) {
                                                                string6 = null;
                                                            } else {
                                                                string6 = cursor2.getString(i20);
                                                            }
                                                            userInfo.setBio(string6);
                                                            i22 = i511;
                                                            if (cursor2.isNull(i22)) {
                                                                string7 = null;
                                                            } else {
                                                                string7 = cursor2.getString(i22);
                                                            }
                                                            userInfo.setBirthday(string7);
                                                            i27 = i2;
                                                            i24 = i64;
                                                            userInfo.setAge(cursor2.getInt(i24));
                                                            userInfo.setCountryId(cursor2.getInt(i25));
                                                            i28 = iOooO00o29;
                                                            i29 = i4;
                                                            userInfo.setRegion(cursor2.getInt(i28));
                                                            i30 = iOooO00o30;
                                                            if (cursor2.isNull(i30)) {
                                                                string8 = null;
                                                            } else {
                                                                string8 = cursor2.getString(i30);
                                                            }
                                                            userInfo.setMedal(string8);
                                                            iOooO00o30 = i30;
                                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                                                            userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                                                            userInfo.setRole(cursor2.getInt(iOooO00o35));
                                                            iOooO00o36 = iOooO00o36;
                                                            userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                                                            iOooO00o37 = iOooO00o37;
                                                            if (cursor2.isNull(iOooO00o37)) {
                                                                string9 = null;
                                                            } else {
                                                                string9 = cursor2.getString(iOooO00o37);
                                                            }
                                                            userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                                                            i31 = iOooO00o38;
                                                            if (cursor2.getInt(i31) != 0) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            userInfo.setPremium(z2);
                                                            iOooO00o38 = i31;
                                                            i32 = iOooO00o39;
                                                            userInfo.setPremiumLevel(cursor2.getInt(i32));
                                                            userInfo.setVipState(cursor2.getInt(iOooO00o40));
                                                            int i65 = iOooO00o41;
                                                            userInfo.setVipLevel(cursor2.getInt(i65));
                                                            if (cursor2.getInt(iOooO00o42) != 0) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            userInfo.setShowVIP(z3);
                                                            iOooO00o41 = i65;
                                                            iOooO00o43 = iOooO00o43;
                                                            userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                                                            i33 = iOooO00o44;
                                                            if (cursor2.isNull(i33)) {
                                                                string10 = null;
                                                            } else {
                                                                string10 = cursor2.getString(i33);
                                                            }
                                                            userInfo.setWealthBadgeWithBg(string10);
                                                            iOooO00o44 = i33;
                                                            i34 = iOooO00o45;
                                                            userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                                                            ArrayList arrayList6 = arrayList;
                                                            arrayList6.add(new ConversationWithUser(conversation, userInfo));
                                                            iOooO00o45 = i34;
                                                            iOooO00o39 = i32;
                                                            iOooO00o27 = i24;
                                                            iOooO00o28 = i25;
                                                            iOooO00o12 = i;
                                                            i35 = i5;
                                                            iOooO00o = i23;
                                                            iOooO00o17 = i29;
                                                            iOooO00o3 = i40;
                                                            iOooO00o2 = i39;
                                                            iOooO00o29 = i28;
                                                            arrayList2 = arrayList6;
                                                            iOooO00o26 = i22;
                                                            iOooO00o15 = i42;
                                                            iOooO00o13 = i3;
                                                            iOooO00o11 = i21;
                                                            iOooO00o16 = i27;
                                                            cursor2 = cursor;
                                                            iOooO00o25 = i20;
                                                            iOooO00o10 = i19;
                                                            iOooO00o24 = i18;
                                                            iOooO00o9 = i17;
                                                            iOooO00o23 = i16;
                                                            iOooO00o8 = i15;
                                                            iOooO00o22 = i14;
                                                            iOooO00o7 = i13;
                                                            iOooO00o21 = i12;
                                                            iOooO00o6 = i11;
                                                            iOooO00o20 = i10;
                                                            iOooO00o5 = i9;
                                                            iOooO00o19 = i8;
                                                            iOooO00o4 = i7;
                                                            iOooO00o18 = i6;
                                                        }
                                                        arrayList = arrayList2;
                                                        i25 = iOooO00o28;
                                                        conversation = conversation2;
                                                        i26 = iOooO00o45;
                                                        iOooO00o45 = i26;
                                                        userInfo = new UserInfo();
                                                        int i512 = i22;
                                                        int i66 = i24;
                                                        userInfo.setUserId(cursor2.getLong(i42));
                                                        if (cursor2.isNull(i2)) {
                                                            string = null;
                                                        } else {
                                                            string = cursor2.getString(i2);
                                                        }
                                                        userInfo.setUserIdx(string);
                                                        userInfo.setIdLevel(cursor2.getInt(i4));
                                                        if (cursor2.isNull(i6)) {
                                                            string2 = null;
                                                        } else {
                                                            string2 = cursor2.getString(i6);
                                                        }
                                                        userInfo.setUserName(string2);
                                                        if (cursor2.isNull(i8)) {
                                                            string3 = null;
                                                        } else {
                                                            string3 = cursor2.getString(i8);
                                                        }
                                                        userInfo.setUserHeader(string3);
                                                        if (cursor2.isNull(i10)) {
                                                            string4 = null;
                                                        } else {
                                                            string4 = cursor2.getString(i10);
                                                        }
                                                        userInfo.setUserHeaderFrame(string4);
                                                        if (cursor2.isNull(i12)) {
                                                            string5 = null;
                                                        } else {
                                                            string5 = cursor2.getString(i12);
                                                        }
                                                        userInfo.setBackground(string5);
                                                        userInfo.setUserLevel(cursor2.getInt(i14));
                                                        if (cursor2.getInt(i16) != 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        userInfo.setBlackUser(z);
                                                        userInfo.setSex(cursor2.getInt(i18));
                                                        if (cursor2.isNull(i20)) {
                                                            string6 = null;
                                                        } else {
                                                            string6 = cursor2.getString(i20);
                                                        }
                                                        userInfo.setBio(string6);
                                                        i22 = i512;
                                                        if (cursor2.isNull(i22)) {
                                                            string7 = null;
                                                        } else {
                                                            string7 = cursor2.getString(i22);
                                                        }
                                                        userInfo.setBirthday(string7);
                                                        i27 = i2;
                                                        i24 = i66;
                                                        userInfo.setAge(cursor2.getInt(i24));
                                                        userInfo.setCountryId(cursor2.getInt(i25));
                                                        i28 = iOooO00o29;
                                                        i29 = i4;
                                                        userInfo.setRegion(cursor2.getInt(i28));
                                                        i30 = iOooO00o30;
                                                        if (cursor2.isNull(i30)) {
                                                            string8 = null;
                                                        } else {
                                                            string8 = cursor2.getString(i30);
                                                        }
                                                        userInfo.setMedal(string8);
                                                        iOooO00o30 = i30;
                                                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                                                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                                                        userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                                                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                                                        userInfo.setRole(cursor2.getInt(iOooO00o35));
                                                        iOooO00o36 = iOooO00o36;
                                                        userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                                                        iOooO00o37 = iOooO00o37;
                                                        if (cursor2.isNull(iOooO00o37)) {
                                                            string9 = null;
                                                        } else {
                                                            string9 = cursor2.getString(iOooO00o37);
                                                        }
                                                        userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                                                        i31 = iOooO00o38;
                                                        if (cursor2.getInt(i31) != 0) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        userInfo.setPremium(z2);
                                                        iOooO00o38 = i31;
                                                        i32 = iOooO00o39;
                                                        userInfo.setPremiumLevel(cursor2.getInt(i32));
                                                        userInfo.setVipState(cursor2.getInt(iOooO00o40));
                                                        int i67 = iOooO00o41;
                                                        userInfo.setVipLevel(cursor2.getInt(i67));
                                                        if (cursor2.getInt(iOooO00o42) != 0) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        userInfo.setShowVIP(z3);
                                                        iOooO00o41 = i67;
                                                        iOooO00o43 = iOooO00o43;
                                                        userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                                                        i33 = iOooO00o44;
                                                        if (cursor2.isNull(i33)) {
                                                            string10 = null;
                                                        } else {
                                                            string10 = cursor2.getString(i33);
                                                        }
                                                        userInfo.setWealthBadgeWithBg(string10);
                                                        iOooO00o44 = i33;
                                                        i34 = iOooO00o45;
                                                        userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                                                        ArrayList arrayList7 = arrayList;
                                                        arrayList7.add(new ConversationWithUser(conversation, userInfo));
                                                        iOooO00o45 = i34;
                                                        iOooO00o39 = i32;
                                                        iOooO00o27 = i24;
                                                        iOooO00o28 = i25;
                                                        iOooO00o12 = i;
                                                        i35 = i5;
                                                        iOooO00o = i23;
                                                        iOooO00o17 = i29;
                                                        iOooO00o3 = i40;
                                                        iOooO00o2 = i39;
                                                        iOooO00o29 = i28;
                                                        arrayList2 = arrayList7;
                                                        iOooO00o26 = i22;
                                                        iOooO00o15 = i42;
                                                        iOooO00o13 = i3;
                                                        iOooO00o11 = i21;
                                                        iOooO00o16 = i27;
                                                        cursor2 = cursor;
                                                        iOooO00o25 = i20;
                                                        iOooO00o10 = i19;
                                                        iOooO00o24 = i18;
                                                        iOooO00o9 = i17;
                                                        iOooO00o23 = i16;
                                                        iOooO00o8 = i15;
                                                        iOooO00o22 = i14;
                                                        iOooO00o7 = i13;
                                                        iOooO00o21 = i12;
                                                        iOooO00o6 = i11;
                                                        iOooO00o20 = i10;
                                                        iOooO00o5 = i9;
                                                        iOooO00o19 = i8;
                                                        iOooO00o4 = i7;
                                                        iOooO00o18 = i6;
                                                    }
                                                    i23 = i38;
                                                    i24 = iOooO00o27;
                                                    arrayList = arrayList2;
                                                    i25 = iOooO00o28;
                                                    conversation = conversation2;
                                                    i26 = iOooO00o45;
                                                    iOooO00o45 = i26;
                                                    userInfo = new UserInfo();
                                                    int i513 = i22;
                                                    int i68 = i24;
                                                    userInfo.setUserId(cursor2.getLong(i42));
                                                    if (cursor2.isNull(i2)) {
                                                        string = null;
                                                    } else {
                                                        string = cursor2.getString(i2);
                                                    }
                                                    userInfo.setUserIdx(string);
                                                    userInfo.setIdLevel(cursor2.getInt(i4));
                                                    if (cursor2.isNull(i6)) {
                                                        string2 = null;
                                                    } else {
                                                        string2 = cursor2.getString(i6);
                                                    }
                                                    userInfo.setUserName(string2);
                                                    if (cursor2.isNull(i8)) {
                                                        string3 = null;
                                                    } else {
                                                        string3 = cursor2.getString(i8);
                                                    }
                                                    userInfo.setUserHeader(string3);
                                                    if (cursor2.isNull(i10)) {
                                                        string4 = null;
                                                    } else {
                                                        string4 = cursor2.getString(i10);
                                                    }
                                                    userInfo.setUserHeaderFrame(string4);
                                                    if (cursor2.isNull(i12)) {
                                                        string5 = null;
                                                    } else {
                                                        string5 = cursor2.getString(i12);
                                                    }
                                                    userInfo.setBackground(string5);
                                                    userInfo.setUserLevel(cursor2.getInt(i14));
                                                    if (cursor2.getInt(i16) != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    userInfo.setBlackUser(z);
                                                    userInfo.setSex(cursor2.getInt(i18));
                                                    if (cursor2.isNull(i20)) {
                                                        string6 = null;
                                                    } else {
                                                        string6 = cursor2.getString(i20);
                                                    }
                                                    userInfo.setBio(string6);
                                                    i22 = i513;
                                                    if (cursor2.isNull(i22)) {
                                                        string7 = null;
                                                    } else {
                                                        string7 = cursor2.getString(i22);
                                                    }
                                                    userInfo.setBirthday(string7);
                                                    i27 = i2;
                                                    i24 = i68;
                                                    userInfo.setAge(cursor2.getInt(i24));
                                                    userInfo.setCountryId(cursor2.getInt(i25));
                                                    i28 = iOooO00o29;
                                                    i29 = i4;
                                                    userInfo.setRegion(cursor2.getInt(i28));
                                                    i30 = iOooO00o30;
                                                    if (cursor2.isNull(i30)) {
                                                        string8 = null;
                                                    } else {
                                                        string8 = cursor2.getString(i30);
                                                    }
                                                    userInfo.setMedal(string8);
                                                    iOooO00o30 = i30;
                                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                                                    userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                                                    userInfo.setRole(cursor2.getInt(iOooO00o35));
                                                    iOooO00o36 = iOooO00o36;
                                                    userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                                                    iOooO00o37 = iOooO00o37;
                                                    if (cursor2.isNull(iOooO00o37)) {
                                                        string9 = null;
                                                    } else {
                                                        string9 = cursor2.getString(iOooO00o37);
                                                    }
                                                    userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                                                    i31 = iOooO00o38;
                                                    if (cursor2.getInt(i31) != 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    userInfo.setPremium(z2);
                                                    iOooO00o38 = i31;
                                                    i32 = iOooO00o39;
                                                    userInfo.setPremiumLevel(cursor2.getInt(i32));
                                                    userInfo.setVipState(cursor2.getInt(iOooO00o40));
                                                    int i69 = iOooO00o41;
                                                    userInfo.setVipLevel(cursor2.getInt(i69));
                                                    if (cursor2.getInt(iOooO00o42) != 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    userInfo.setShowVIP(z3);
                                                    iOooO00o41 = i69;
                                                    iOooO00o43 = iOooO00o43;
                                                    userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                                                    i33 = iOooO00o44;
                                                    if (cursor2.isNull(i33)) {
                                                        string10 = null;
                                                    } else {
                                                        string10 = cursor2.getString(i33);
                                                    }
                                                    userInfo.setWealthBadgeWithBg(string10);
                                                    iOooO00o44 = i33;
                                                    i34 = iOooO00o45;
                                                    userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                                                    ArrayList arrayList8 = arrayList;
                                                    arrayList8.add(new ConversationWithUser(conversation, userInfo));
                                                    iOooO00o45 = i34;
                                                    iOooO00o39 = i32;
                                                    iOooO00o27 = i24;
                                                    iOooO00o28 = i25;
                                                    iOooO00o12 = i;
                                                    i35 = i5;
                                                    iOooO00o = i23;
                                                    iOooO00o17 = i29;
                                                    iOooO00o3 = i40;
                                                    iOooO00o2 = i39;
                                                    iOooO00o29 = i28;
                                                    arrayList2 = arrayList8;
                                                    iOooO00o26 = i22;
                                                    iOooO00o15 = i42;
                                                    iOooO00o13 = i3;
                                                    iOooO00o11 = i21;
                                                    iOooO00o16 = i27;
                                                    cursor2 = cursor;
                                                    iOooO00o25 = i20;
                                                    iOooO00o10 = i19;
                                                    iOooO00o24 = i18;
                                                    iOooO00o9 = i17;
                                                    iOooO00o23 = i16;
                                                    iOooO00o8 = i15;
                                                    iOooO00o22 = i14;
                                                    iOooO00o7 = i13;
                                                    iOooO00o21 = i12;
                                                    iOooO00o6 = i11;
                                                    iOooO00o20 = i10;
                                                    iOooO00o5 = i9;
                                                    iOooO00o19 = i8;
                                                    iOooO00o4 = i7;
                                                    iOooO00o18 = i6;
                                                }
                                                i21 = iOooO00o11;
                                                i22 = iOooO00o26;
                                                i23 = i38;
                                                i24 = iOooO00o27;
                                                arrayList = arrayList2;
                                                i25 = iOooO00o28;
                                                conversation = conversation2;
                                                i26 = iOooO00o45;
                                                iOooO00o45 = i26;
                                                userInfo = new UserInfo();
                                                int i514 = i22;
                                                int i610 = i24;
                                                userInfo.setUserId(cursor2.getLong(i42));
                                                if (cursor2.isNull(i2)) {
                                                    string = null;
                                                } else {
                                                    string = cursor2.getString(i2);
                                                }
                                                userInfo.setUserIdx(string);
                                                userInfo.setIdLevel(cursor2.getInt(i4));
                                                if (cursor2.isNull(i6)) {
                                                    string2 = null;
                                                } else {
                                                    string2 = cursor2.getString(i6);
                                                }
                                                userInfo.setUserName(string2);
                                                if (cursor2.isNull(i8)) {
                                                    string3 = null;
                                                } else {
                                                    string3 = cursor2.getString(i8);
                                                }
                                                userInfo.setUserHeader(string3);
                                                if (cursor2.isNull(i10)) {
                                                    string4 = null;
                                                } else {
                                                    string4 = cursor2.getString(i10);
                                                }
                                                userInfo.setUserHeaderFrame(string4);
                                                if (cursor2.isNull(i12)) {
                                                    string5 = null;
                                                } else {
                                                    string5 = cursor2.getString(i12);
                                                }
                                                userInfo.setBackground(string5);
                                                userInfo.setUserLevel(cursor2.getInt(i14));
                                                if (cursor2.getInt(i16) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                userInfo.setBlackUser(z);
                                                userInfo.setSex(cursor2.getInt(i18));
                                                if (cursor2.isNull(i20)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = cursor2.getString(i20);
                                                }
                                                userInfo.setBio(string6);
                                                i22 = i514;
                                                if (cursor2.isNull(i22)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = cursor2.getString(i22);
                                                }
                                                userInfo.setBirthday(string7);
                                                i27 = i2;
                                                i24 = i610;
                                                userInfo.setAge(cursor2.getInt(i24));
                                                userInfo.setCountryId(cursor2.getInt(i25));
                                                i28 = iOooO00o29;
                                                i29 = i4;
                                                userInfo.setRegion(cursor2.getInt(i28));
                                                i30 = iOooO00o30;
                                                if (cursor2.isNull(i30)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = cursor2.getString(i30);
                                                }
                                                userInfo.setMedal(string8);
                                                iOooO00o30 = i30;
                                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                                                userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                                                userInfo.setRole(cursor2.getInt(iOooO00o35));
                                                iOooO00o36 = iOooO00o36;
                                                userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                                                iOooO00o37 = iOooO00o37;
                                                if (cursor2.isNull(iOooO00o37)) {
                                                    string9 = null;
                                                } else {
                                                    string9 = cursor2.getString(iOooO00o37);
                                                }
                                                userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                                                i31 = iOooO00o38;
                                                if (cursor2.getInt(i31) != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                userInfo.setPremium(z2);
                                                iOooO00o38 = i31;
                                                i32 = iOooO00o39;
                                                userInfo.setPremiumLevel(cursor2.getInt(i32));
                                                userInfo.setVipState(cursor2.getInt(iOooO00o40));
                                                int i611 = iOooO00o41;
                                                userInfo.setVipLevel(cursor2.getInt(i611));
                                                if (cursor2.getInt(iOooO00o42) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                userInfo.setShowVIP(z3);
                                                iOooO00o41 = i611;
                                                iOooO00o43 = iOooO00o43;
                                                userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                                                i33 = iOooO00o44;
                                                if (cursor2.isNull(i33)) {
                                                    string10 = null;
                                                } else {
                                                    string10 = cursor2.getString(i33);
                                                }
                                                userInfo.setWealthBadgeWithBg(string10);
                                                iOooO00o44 = i33;
                                                i34 = iOooO00o45;
                                                userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                                                ArrayList arrayList9 = arrayList;
                                                arrayList9.add(new ConversationWithUser(conversation, userInfo));
                                                iOooO00o45 = i34;
                                                iOooO00o39 = i32;
                                                iOooO00o27 = i24;
                                                iOooO00o28 = i25;
                                                iOooO00o12 = i;
                                                i35 = i5;
                                                iOooO00o = i23;
                                                iOooO00o17 = i29;
                                                iOooO00o3 = i40;
                                                iOooO00o2 = i39;
                                                iOooO00o29 = i28;
                                                arrayList2 = arrayList9;
                                                iOooO00o26 = i22;
                                                iOooO00o15 = i42;
                                                iOooO00o13 = i3;
                                                iOooO00o11 = i21;
                                                iOooO00o16 = i27;
                                                cursor2 = cursor;
                                                iOooO00o25 = i20;
                                                iOooO00o10 = i19;
                                                iOooO00o24 = i18;
                                                iOooO00o9 = i17;
                                                iOooO00o23 = i16;
                                                iOooO00o8 = i15;
                                                iOooO00o22 = i14;
                                                iOooO00o7 = i13;
                                                iOooO00o21 = i12;
                                                iOooO00o6 = i11;
                                                iOooO00o20 = i10;
                                                iOooO00o5 = i9;
                                                iOooO00o19 = i8;
                                                iOooO00o4 = i7;
                                                iOooO00o18 = i6;
                                            }
                                            i19 = iOooO00o10;
                                            i20 = iOooO00o25;
                                            i21 = iOooO00o11;
                                            i22 = iOooO00o26;
                                            i23 = i38;
                                            i24 = iOooO00o27;
                                            arrayList = arrayList2;
                                            i25 = iOooO00o28;
                                            conversation = conversation2;
                                            i26 = iOooO00o45;
                                            iOooO00o45 = i26;
                                            userInfo = new UserInfo();
                                            int i515 = i22;
                                            int i612 = i24;
                                            userInfo.setUserId(cursor2.getLong(i42));
                                            if (cursor2.isNull(i2)) {
                                                string = null;
                                            } else {
                                                string = cursor2.getString(i2);
                                            }
                                            userInfo.setUserIdx(string);
                                            userInfo.setIdLevel(cursor2.getInt(i4));
                                            if (cursor2.isNull(i6)) {
                                                string2 = null;
                                            } else {
                                                string2 = cursor2.getString(i6);
                                            }
                                            userInfo.setUserName(string2);
                                            if (cursor2.isNull(i8)) {
                                                string3 = null;
                                            } else {
                                                string3 = cursor2.getString(i8);
                                            }
                                            userInfo.setUserHeader(string3);
                                            if (cursor2.isNull(i10)) {
                                                string4 = null;
                                            } else {
                                                string4 = cursor2.getString(i10);
                                            }
                                            userInfo.setUserHeaderFrame(string4);
                                            if (cursor2.isNull(i12)) {
                                                string5 = null;
                                            } else {
                                                string5 = cursor2.getString(i12);
                                            }
                                            userInfo.setBackground(string5);
                                            userInfo.setUserLevel(cursor2.getInt(i14));
                                            if (cursor2.getInt(i16) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            userInfo.setBlackUser(z);
                                            userInfo.setSex(cursor2.getInt(i18));
                                            if (cursor2.isNull(i20)) {
                                                string6 = null;
                                            } else {
                                                string6 = cursor2.getString(i20);
                                            }
                                            userInfo.setBio(string6);
                                            i22 = i515;
                                            if (cursor2.isNull(i22)) {
                                                string7 = null;
                                            } else {
                                                string7 = cursor2.getString(i22);
                                            }
                                            userInfo.setBirthday(string7);
                                            i27 = i2;
                                            i24 = i612;
                                            userInfo.setAge(cursor2.getInt(i24));
                                            userInfo.setCountryId(cursor2.getInt(i25));
                                            i28 = iOooO00o29;
                                            i29 = i4;
                                            userInfo.setRegion(cursor2.getInt(i28));
                                            i30 = iOooO00o30;
                                            if (cursor2.isNull(i30)) {
                                                string8 = null;
                                            } else {
                                                string8 = cursor2.getString(i30);
                                            }
                                            userInfo.setMedal(string8);
                                            iOooO00o30 = i30;
                                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                                            userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                                            userInfo.setRole(cursor2.getInt(iOooO00o35));
                                            iOooO00o36 = iOooO00o36;
                                            userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                                            iOooO00o37 = iOooO00o37;
                                            if (cursor2.isNull(iOooO00o37)) {
                                                string9 = null;
                                            } else {
                                                string9 = cursor2.getString(iOooO00o37);
                                            }
                                            userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                                            i31 = iOooO00o38;
                                            if (cursor2.getInt(i31) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            userInfo.setPremium(z2);
                                            iOooO00o38 = i31;
                                            i32 = iOooO00o39;
                                            userInfo.setPremiumLevel(cursor2.getInt(i32));
                                            userInfo.setVipState(cursor2.getInt(iOooO00o40));
                                            int i613 = iOooO00o41;
                                            userInfo.setVipLevel(cursor2.getInt(i613));
                                            if (cursor2.getInt(iOooO00o42) != 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            userInfo.setShowVIP(z3);
                                            iOooO00o41 = i613;
                                            iOooO00o43 = iOooO00o43;
                                            userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                                            i33 = iOooO00o44;
                                            if (cursor2.isNull(i33)) {
                                                string10 = null;
                                            } else {
                                                string10 = cursor2.getString(i33);
                                            }
                                            userInfo.setWealthBadgeWithBg(string10);
                                            iOooO00o44 = i33;
                                            i34 = iOooO00o45;
                                            userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                                            ArrayList arrayList10 = arrayList;
                                            arrayList10.add(new ConversationWithUser(conversation, userInfo));
                                            iOooO00o45 = i34;
                                            iOooO00o39 = i32;
                                            iOooO00o27 = i24;
                                            iOooO00o28 = i25;
                                            iOooO00o12 = i;
                                            i35 = i5;
                                            iOooO00o = i23;
                                            iOooO00o17 = i29;
                                            iOooO00o3 = i40;
                                            iOooO00o2 = i39;
                                            iOooO00o29 = i28;
                                            arrayList2 = arrayList10;
                                            iOooO00o26 = i22;
                                            iOooO00o15 = i42;
                                            iOooO00o13 = i3;
                                            iOooO00o11 = i21;
                                            iOooO00o16 = i27;
                                            cursor2 = cursor;
                                            iOooO00o25 = i20;
                                            iOooO00o10 = i19;
                                            iOooO00o24 = i18;
                                            iOooO00o9 = i17;
                                            iOooO00o23 = i16;
                                            iOooO00o8 = i15;
                                            iOooO00o22 = i14;
                                            iOooO00o7 = i13;
                                            iOooO00o21 = i12;
                                            iOooO00o6 = i11;
                                            iOooO00o20 = i10;
                                            iOooO00o5 = i9;
                                            iOooO00o19 = i8;
                                            iOooO00o4 = i7;
                                            iOooO00o18 = i6;
                                        }
                                        i17 = iOooO00o9;
                                        i18 = iOooO00o24;
                                        i19 = iOooO00o10;
                                        i20 = iOooO00o25;
                                        i21 = iOooO00o11;
                                        i22 = iOooO00o26;
                                        i23 = i38;
                                        i24 = iOooO00o27;
                                        arrayList = arrayList2;
                                        i25 = iOooO00o28;
                                        conversation = conversation2;
                                        i26 = iOooO00o45;
                                        iOooO00o45 = i26;
                                        userInfo = new UserInfo();
                                        int i516 = i22;
                                        int i614 = i24;
                                        userInfo.setUserId(cursor2.getLong(i42));
                                        if (cursor2.isNull(i2)) {
                                            string = null;
                                        } else {
                                            string = cursor2.getString(i2);
                                        }
                                        userInfo.setUserIdx(string);
                                        userInfo.setIdLevel(cursor2.getInt(i4));
                                        if (cursor2.isNull(i6)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursor2.getString(i6);
                                        }
                                        userInfo.setUserName(string2);
                                        if (cursor2.isNull(i8)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursor2.getString(i8);
                                        }
                                        userInfo.setUserHeader(string3);
                                        if (cursor2.isNull(i10)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursor2.getString(i10);
                                        }
                                        userInfo.setUserHeaderFrame(string4);
                                        if (cursor2.isNull(i12)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursor2.getString(i12);
                                        }
                                        userInfo.setBackground(string5);
                                        userInfo.setUserLevel(cursor2.getInt(i14));
                                        if (cursor2.getInt(i16) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        userInfo.setBlackUser(z);
                                        userInfo.setSex(cursor2.getInt(i18));
                                        if (cursor2.isNull(i20)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursor2.getString(i20);
                                        }
                                        userInfo.setBio(string6);
                                        i22 = i516;
                                        if (cursor2.isNull(i22)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursor2.getString(i22);
                                        }
                                        userInfo.setBirthday(string7);
                                        i27 = i2;
                                        i24 = i614;
                                        userInfo.setAge(cursor2.getInt(i24));
                                        userInfo.setCountryId(cursor2.getInt(i25));
                                        i28 = iOooO00o29;
                                        i29 = i4;
                                        userInfo.setRegion(cursor2.getInt(i28));
                                        i30 = iOooO00o30;
                                        if (cursor2.isNull(i30)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursor2.getString(i30);
                                        }
                                        userInfo.setMedal(string8);
                                        iOooO00o30 = i30;
                                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                                        userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                                        userInfo.setRole(cursor2.getInt(iOooO00o35));
                                        iOooO00o36 = iOooO00o36;
                                        userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                                        iOooO00o37 = iOooO00o37;
                                        if (cursor2.isNull(iOooO00o37)) {
                                            string9 = null;
                                        } else {
                                            string9 = cursor2.getString(iOooO00o37);
                                        }
                                        userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                                        i31 = iOooO00o38;
                                        if (cursor2.getInt(i31) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        userInfo.setPremium(z2);
                                        iOooO00o38 = i31;
                                        i32 = iOooO00o39;
                                        userInfo.setPremiumLevel(cursor2.getInt(i32));
                                        userInfo.setVipState(cursor2.getInt(iOooO00o40));
                                        int i615 = iOooO00o41;
                                        userInfo.setVipLevel(cursor2.getInt(i615));
                                        if (cursor2.getInt(iOooO00o42) != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        userInfo.setShowVIP(z3);
                                        iOooO00o41 = i615;
                                        iOooO00o43 = iOooO00o43;
                                        userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                                        i33 = iOooO00o44;
                                        if (cursor2.isNull(i33)) {
                                            string10 = null;
                                        } else {
                                            string10 = cursor2.getString(i33);
                                        }
                                        userInfo.setWealthBadgeWithBg(string10);
                                        iOooO00o44 = i33;
                                        i34 = iOooO00o45;
                                        userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                                        ArrayList arrayList11 = arrayList;
                                        arrayList11.add(new ConversationWithUser(conversation, userInfo));
                                        iOooO00o45 = i34;
                                        iOooO00o39 = i32;
                                        iOooO00o27 = i24;
                                        iOooO00o28 = i25;
                                        iOooO00o12 = i;
                                        i35 = i5;
                                        iOooO00o = i23;
                                        iOooO00o17 = i29;
                                        iOooO00o3 = i40;
                                        iOooO00o2 = i39;
                                        iOooO00o29 = i28;
                                        arrayList2 = arrayList11;
                                        iOooO00o26 = i22;
                                        iOooO00o15 = i42;
                                        iOooO00o13 = i3;
                                        iOooO00o11 = i21;
                                        iOooO00o16 = i27;
                                        cursor2 = cursor;
                                        iOooO00o25 = i20;
                                        iOooO00o10 = i19;
                                        iOooO00o24 = i18;
                                        iOooO00o9 = i17;
                                        iOooO00o23 = i16;
                                        iOooO00o8 = i15;
                                        iOooO00o22 = i14;
                                        iOooO00o7 = i13;
                                        iOooO00o21 = i12;
                                        iOooO00o6 = i11;
                                        iOooO00o20 = i10;
                                        iOooO00o5 = i9;
                                        iOooO00o19 = i8;
                                        iOooO00o4 = i7;
                                        iOooO00o18 = i6;
                                    }
                                    i15 = iOooO00o8;
                                    i16 = iOooO00o23;
                                    i17 = iOooO00o9;
                                    i18 = iOooO00o24;
                                    i19 = iOooO00o10;
                                    i20 = iOooO00o25;
                                    i21 = iOooO00o11;
                                    i22 = iOooO00o26;
                                    i23 = i38;
                                    i24 = iOooO00o27;
                                    arrayList = arrayList2;
                                    i25 = iOooO00o28;
                                    conversation = conversation2;
                                    i26 = iOooO00o45;
                                    iOooO00o45 = i26;
                                    userInfo = new UserInfo();
                                    int i517 = i22;
                                    int i616 = i24;
                                    userInfo.setUserId(cursor2.getLong(i42));
                                    if (cursor2.isNull(i2)) {
                                        string = null;
                                    } else {
                                        string = cursor2.getString(i2);
                                    }
                                    userInfo.setUserIdx(string);
                                    userInfo.setIdLevel(cursor2.getInt(i4));
                                    if (cursor2.isNull(i6)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursor2.getString(i6);
                                    }
                                    userInfo.setUserName(string2);
                                    if (cursor2.isNull(i8)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursor2.getString(i8);
                                    }
                                    userInfo.setUserHeader(string3);
                                    if (cursor2.isNull(i10)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursor2.getString(i10);
                                    }
                                    userInfo.setUserHeaderFrame(string4);
                                    if (cursor2.isNull(i12)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursor2.getString(i12);
                                    }
                                    userInfo.setBackground(string5);
                                    userInfo.setUserLevel(cursor2.getInt(i14));
                                    if (cursor2.getInt(i16) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    userInfo.setBlackUser(z);
                                    userInfo.setSex(cursor2.getInt(i18));
                                    if (cursor2.isNull(i20)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursor2.getString(i20);
                                    }
                                    userInfo.setBio(string6);
                                    i22 = i517;
                                    if (cursor2.isNull(i22)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursor2.getString(i22);
                                    }
                                    userInfo.setBirthday(string7);
                                    i27 = i2;
                                    i24 = i616;
                                    userInfo.setAge(cursor2.getInt(i24));
                                    userInfo.setCountryId(cursor2.getInt(i25));
                                    i28 = iOooO00o29;
                                    i29 = i4;
                                    userInfo.setRegion(cursor2.getInt(i28));
                                    i30 = iOooO00o30;
                                    if (cursor2.isNull(i30)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursor2.getString(i30);
                                    }
                                    userInfo.setMedal(string8);
                                    iOooO00o30 = i30;
                                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                                    userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                                    userInfo.setRole(cursor2.getInt(iOooO00o35));
                                    iOooO00o36 = iOooO00o36;
                                    userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                                    iOooO00o37 = iOooO00o37;
                                    if (cursor2.isNull(iOooO00o37)) {
                                        string9 = null;
                                    } else {
                                        string9 = cursor2.getString(iOooO00o37);
                                    }
                                    userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                                    i31 = iOooO00o38;
                                    if (cursor2.getInt(i31) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    userInfo.setPremium(z2);
                                    iOooO00o38 = i31;
                                    i32 = iOooO00o39;
                                    userInfo.setPremiumLevel(cursor2.getInt(i32));
                                    userInfo.setVipState(cursor2.getInt(iOooO00o40));
                                    int i617 = iOooO00o41;
                                    userInfo.setVipLevel(cursor2.getInt(i617));
                                    if (cursor2.getInt(iOooO00o42) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    userInfo.setShowVIP(z3);
                                    iOooO00o41 = i617;
                                    iOooO00o43 = iOooO00o43;
                                    userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                                    i33 = iOooO00o44;
                                    if (cursor2.isNull(i33)) {
                                        string10 = null;
                                    } else {
                                        string10 = cursor2.getString(i33);
                                    }
                                    userInfo.setWealthBadgeWithBg(string10);
                                    iOooO00o44 = i33;
                                    i34 = iOooO00o45;
                                    userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                                    ArrayList arrayList12 = arrayList;
                                    arrayList12.add(new ConversationWithUser(conversation, userInfo));
                                    iOooO00o45 = i34;
                                    iOooO00o39 = i32;
                                    iOooO00o27 = i24;
                                    iOooO00o28 = i25;
                                    iOooO00o12 = i;
                                    i35 = i5;
                                    iOooO00o = i23;
                                    iOooO00o17 = i29;
                                    iOooO00o3 = i40;
                                    iOooO00o2 = i39;
                                    iOooO00o29 = i28;
                                    arrayList2 = arrayList12;
                                    iOooO00o26 = i22;
                                    iOooO00o15 = i42;
                                    iOooO00o13 = i3;
                                    iOooO00o11 = i21;
                                    iOooO00o16 = i27;
                                    cursor2 = cursor;
                                    iOooO00o25 = i20;
                                    iOooO00o10 = i19;
                                    iOooO00o24 = i18;
                                    iOooO00o9 = i17;
                                    iOooO00o23 = i16;
                                    iOooO00o8 = i15;
                                    iOooO00o22 = i14;
                                    iOooO00o7 = i13;
                                    iOooO00o21 = i12;
                                    iOooO00o6 = i11;
                                    iOooO00o20 = i10;
                                    iOooO00o5 = i9;
                                    iOooO00o19 = i8;
                                    iOooO00o4 = i7;
                                    iOooO00o18 = i6;
                                }
                                i13 = iOooO00o7;
                                i14 = iOooO00o22;
                                i15 = iOooO00o8;
                                i16 = iOooO00o23;
                                i17 = iOooO00o9;
                                i18 = iOooO00o24;
                                i19 = iOooO00o10;
                                i20 = iOooO00o25;
                                i21 = iOooO00o11;
                                i22 = iOooO00o26;
                                i23 = i38;
                                i24 = iOooO00o27;
                                arrayList = arrayList2;
                                i25 = iOooO00o28;
                                conversation = conversation2;
                                i26 = iOooO00o45;
                                iOooO00o45 = i26;
                                userInfo = new UserInfo();
                                int i518 = i22;
                                int i618 = i24;
                                userInfo.setUserId(cursor2.getLong(i42));
                                if (cursor2.isNull(i2)) {
                                    string = null;
                                } else {
                                    string = cursor2.getString(i2);
                                }
                                userInfo.setUserIdx(string);
                                userInfo.setIdLevel(cursor2.getInt(i4));
                                if (cursor2.isNull(i6)) {
                                    string2 = null;
                                } else {
                                    string2 = cursor2.getString(i6);
                                }
                                userInfo.setUserName(string2);
                                if (cursor2.isNull(i8)) {
                                    string3 = null;
                                } else {
                                    string3 = cursor2.getString(i8);
                                }
                                userInfo.setUserHeader(string3);
                                if (cursor2.isNull(i10)) {
                                    string4 = null;
                                } else {
                                    string4 = cursor2.getString(i10);
                                }
                                userInfo.setUserHeaderFrame(string4);
                                if (cursor2.isNull(i12)) {
                                    string5 = null;
                                } else {
                                    string5 = cursor2.getString(i12);
                                }
                                userInfo.setBackground(string5);
                                userInfo.setUserLevel(cursor2.getInt(i14));
                                if (cursor2.getInt(i16) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                userInfo.setBlackUser(z);
                                userInfo.setSex(cursor2.getInt(i18));
                                if (cursor2.isNull(i20)) {
                                    string6 = null;
                                } else {
                                    string6 = cursor2.getString(i20);
                                }
                                userInfo.setBio(string6);
                                i22 = i518;
                                if (cursor2.isNull(i22)) {
                                    string7 = null;
                                } else {
                                    string7 = cursor2.getString(i22);
                                }
                                userInfo.setBirthday(string7);
                                i27 = i2;
                                i24 = i618;
                                userInfo.setAge(cursor2.getInt(i24));
                                userInfo.setCountryId(cursor2.getInt(i25));
                                i28 = iOooO00o29;
                                i29 = i4;
                                userInfo.setRegion(cursor2.getInt(i28));
                                i30 = iOooO00o30;
                                if (cursor2.isNull(i30)) {
                                    string8 = null;
                                } else {
                                    string8 = cursor2.getString(i30);
                                }
                                userInfo.setMedal(string8);
                                iOooO00o30 = i30;
                                userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                                userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                                userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                                userInfo.setRole(cursor2.getInt(iOooO00o35));
                                iOooO00o36 = iOooO00o36;
                                userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                                iOooO00o37 = iOooO00o37;
                                if (cursor2.isNull(iOooO00o37)) {
                                    string9 = null;
                                } else {
                                    string9 = cursor2.getString(iOooO00o37);
                                }
                                userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                                i31 = iOooO00o38;
                                if (cursor2.getInt(i31) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                userInfo.setPremium(z2);
                                iOooO00o38 = i31;
                                i32 = iOooO00o39;
                                userInfo.setPremiumLevel(cursor2.getInt(i32));
                                userInfo.setVipState(cursor2.getInt(iOooO00o40));
                                int i619 = iOooO00o41;
                                userInfo.setVipLevel(cursor2.getInt(i619));
                                if (cursor2.getInt(iOooO00o42) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                userInfo.setShowVIP(z3);
                                iOooO00o41 = i619;
                                iOooO00o43 = iOooO00o43;
                                userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                                i33 = iOooO00o44;
                                if (cursor2.isNull(i33)) {
                                    string10 = null;
                                } else {
                                    string10 = cursor2.getString(i33);
                                }
                                userInfo.setWealthBadgeWithBg(string10);
                                iOooO00o44 = i33;
                                i34 = iOooO00o45;
                                userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                                ArrayList arrayList13 = arrayList;
                                arrayList13.add(new ConversationWithUser(conversation, userInfo));
                                iOooO00o45 = i34;
                                iOooO00o39 = i32;
                                iOooO00o27 = i24;
                                iOooO00o28 = i25;
                                iOooO00o12 = i;
                                i35 = i5;
                                iOooO00o = i23;
                                iOooO00o17 = i29;
                                iOooO00o3 = i40;
                                iOooO00o2 = i39;
                                iOooO00o29 = i28;
                                arrayList2 = arrayList13;
                                iOooO00o26 = i22;
                                iOooO00o15 = i42;
                                iOooO00o13 = i3;
                                iOooO00o11 = i21;
                                iOooO00o16 = i27;
                                cursor2 = cursor;
                                iOooO00o25 = i20;
                                iOooO00o10 = i19;
                                iOooO00o24 = i18;
                                iOooO00o9 = i17;
                                iOooO00o23 = i16;
                                iOooO00o8 = i15;
                                iOooO00o22 = i14;
                                iOooO00o7 = i13;
                                iOooO00o21 = i12;
                                iOooO00o6 = i11;
                                iOooO00o20 = i10;
                                iOooO00o5 = i9;
                                iOooO00o19 = i8;
                                iOooO00o4 = i7;
                                iOooO00o18 = i6;
                            }
                            i11 = iOooO00o6;
                            i12 = iOooO00o21;
                            i13 = iOooO00o7;
                            i14 = iOooO00o22;
                            i15 = iOooO00o8;
                            i16 = iOooO00o23;
                            i17 = iOooO00o9;
                            i18 = iOooO00o24;
                            i19 = iOooO00o10;
                            i20 = iOooO00o25;
                            i21 = iOooO00o11;
                            i22 = iOooO00o26;
                            i23 = i38;
                            i24 = iOooO00o27;
                            arrayList = arrayList2;
                            i25 = iOooO00o28;
                            conversation = conversation2;
                            i26 = iOooO00o45;
                            iOooO00o45 = i26;
                            userInfo = new UserInfo();
                            int i519 = i22;
                            int i6110 = i24;
                            userInfo.setUserId(cursor2.getLong(i42));
                            if (cursor2.isNull(i2)) {
                                string = null;
                            } else {
                                string = cursor2.getString(i2);
                            }
                            userInfo.setUserIdx(string);
                            userInfo.setIdLevel(cursor2.getInt(i4));
                            if (cursor2.isNull(i6)) {
                                string2 = null;
                            } else {
                                string2 = cursor2.getString(i6);
                            }
                            userInfo.setUserName(string2);
                            if (cursor2.isNull(i8)) {
                                string3 = null;
                            } else {
                                string3 = cursor2.getString(i8);
                            }
                            userInfo.setUserHeader(string3);
                            if (cursor2.isNull(i10)) {
                                string4 = null;
                            } else {
                                string4 = cursor2.getString(i10);
                            }
                            userInfo.setUserHeaderFrame(string4);
                            if (cursor2.isNull(i12)) {
                                string5 = null;
                            } else {
                                string5 = cursor2.getString(i12);
                            }
                            userInfo.setBackground(string5);
                            userInfo.setUserLevel(cursor2.getInt(i14));
                            if (cursor2.getInt(i16) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            userInfo.setBlackUser(z);
                            userInfo.setSex(cursor2.getInt(i18));
                            if (cursor2.isNull(i20)) {
                                string6 = null;
                            } else {
                                string6 = cursor2.getString(i20);
                            }
                            userInfo.setBio(string6);
                            i22 = i519;
                            if (cursor2.isNull(i22)) {
                                string7 = null;
                            } else {
                                string7 = cursor2.getString(i22);
                            }
                            userInfo.setBirthday(string7);
                            i27 = i2;
                            i24 = i6110;
                            userInfo.setAge(cursor2.getInt(i24));
                            userInfo.setCountryId(cursor2.getInt(i25));
                            i28 = iOooO00o29;
                            i29 = i4;
                            userInfo.setRegion(cursor2.getInt(i28));
                            i30 = iOooO00o30;
                            if (cursor2.isNull(i30)) {
                                string8 = null;
                            } else {
                                string8 = cursor2.getString(i30);
                            }
                            userInfo.setMedal(string8);
                            iOooO00o30 = i30;
                            userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                            userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                            userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                            userInfo.setRole(cursor2.getInt(iOooO00o35));
                            iOooO00o36 = iOooO00o36;
                            userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                            iOooO00o37 = iOooO00o37;
                            if (cursor2.isNull(iOooO00o37)) {
                                string9 = null;
                            } else {
                                string9 = cursor2.getString(iOooO00o37);
                            }
                            userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                            i31 = iOooO00o38;
                            if (cursor2.getInt(i31) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            userInfo.setPremium(z2);
                            iOooO00o38 = i31;
                            i32 = iOooO00o39;
                            userInfo.setPremiumLevel(cursor2.getInt(i32));
                            userInfo.setVipState(cursor2.getInt(iOooO00o40));
                            int i6111 = iOooO00o41;
                            userInfo.setVipLevel(cursor2.getInt(i6111));
                            if (cursor2.getInt(iOooO00o42) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            userInfo.setShowVIP(z3);
                            iOooO00o41 = i6111;
                            iOooO00o43 = iOooO00o43;
                            userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                            i33 = iOooO00o44;
                            if (cursor2.isNull(i33)) {
                                string10 = null;
                            } else {
                                string10 = cursor2.getString(i33);
                            }
                            userInfo.setWealthBadgeWithBg(string10);
                            iOooO00o44 = i33;
                            i34 = iOooO00o45;
                            userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                            ArrayList arrayList14 = arrayList;
                            arrayList14.add(new ConversationWithUser(conversation, userInfo));
                            iOooO00o45 = i34;
                            iOooO00o39 = i32;
                            iOooO00o27 = i24;
                            iOooO00o28 = i25;
                            iOooO00o12 = i;
                            i35 = i5;
                            iOooO00o = i23;
                            iOooO00o17 = i29;
                            iOooO00o3 = i40;
                            iOooO00o2 = i39;
                            iOooO00o29 = i28;
                            arrayList2 = arrayList14;
                            iOooO00o26 = i22;
                            iOooO00o15 = i42;
                            iOooO00o13 = i3;
                            iOooO00o11 = i21;
                            iOooO00o16 = i27;
                            cursor2 = cursor;
                            iOooO00o25 = i20;
                            iOooO00o10 = i19;
                            iOooO00o24 = i18;
                            iOooO00o9 = i17;
                            iOooO00o23 = i16;
                            iOooO00o8 = i15;
                            iOooO00o22 = i14;
                            iOooO00o7 = i13;
                            iOooO00o21 = i12;
                            iOooO00o6 = i11;
                            iOooO00o20 = i10;
                            iOooO00o5 = i9;
                            iOooO00o19 = i8;
                            iOooO00o4 = i7;
                            iOooO00o18 = i6;
                        }
                        i9 = iOooO00o5;
                        i10 = iOooO00o20;
                        i11 = iOooO00o6;
                        i12 = iOooO00o21;
                        i13 = iOooO00o7;
                        i14 = iOooO00o22;
                        i15 = iOooO00o8;
                        i16 = iOooO00o23;
                        i17 = iOooO00o9;
                        i18 = iOooO00o24;
                        i19 = iOooO00o10;
                        i20 = iOooO00o25;
                        i21 = iOooO00o11;
                        i22 = iOooO00o26;
                        i23 = i38;
                        i24 = iOooO00o27;
                        arrayList = arrayList2;
                        i25 = iOooO00o28;
                        conversation = conversation2;
                        i26 = iOooO00o45;
                        iOooO00o45 = i26;
                        userInfo = new UserInfo();
                        int i5110 = i22;
                        int i6112 = i24;
                        userInfo.setUserId(cursor2.getLong(i42));
                        if (cursor2.isNull(i2)) {
                            string = null;
                        } else {
                            string = cursor2.getString(i2);
                        }
                        userInfo.setUserIdx(string);
                        userInfo.setIdLevel(cursor2.getInt(i4));
                        if (cursor2.isNull(i6)) {
                            string2 = null;
                        } else {
                            string2 = cursor2.getString(i6);
                        }
                        userInfo.setUserName(string2);
                        if (cursor2.isNull(i8)) {
                            string3 = null;
                        } else {
                            string3 = cursor2.getString(i8);
                        }
                        userInfo.setUserHeader(string3);
                        if (cursor2.isNull(i10)) {
                            string4 = null;
                        } else {
                            string4 = cursor2.getString(i10);
                        }
                        userInfo.setUserHeaderFrame(string4);
                        if (cursor2.isNull(i12)) {
                            string5 = null;
                        } else {
                            string5 = cursor2.getString(i12);
                        }
                        userInfo.setBackground(string5);
                        userInfo.setUserLevel(cursor2.getInt(i14));
                        if (cursor2.getInt(i16) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        userInfo.setBlackUser(z);
                        userInfo.setSex(cursor2.getInt(i18));
                        if (cursor2.isNull(i20)) {
                            string6 = null;
                        } else {
                            string6 = cursor2.getString(i20);
                        }
                        userInfo.setBio(string6);
                        i22 = i5110;
                        if (cursor2.isNull(i22)) {
                            string7 = null;
                        } else {
                            string7 = cursor2.getString(i22);
                        }
                        userInfo.setBirthday(string7);
                        i27 = i2;
                        i24 = i6112;
                        userInfo.setAge(cursor2.getInt(i24));
                        userInfo.setCountryId(cursor2.getInt(i25));
                        i28 = iOooO00o29;
                        i29 = i4;
                        userInfo.setRegion(cursor2.getInt(i28));
                        i30 = iOooO00o30;
                        if (cursor2.isNull(i30)) {
                            string8 = null;
                        } else {
                            string8 = cursor2.getString(i30);
                        }
                        userInfo.setMedal(string8);
                        iOooO00o30 = i30;
                        userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                        userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                        userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                        userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                        userInfo.setRole(cursor2.getInt(iOooO00o35));
                        iOooO00o36 = iOooO00o36;
                        userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                        iOooO00o37 = iOooO00o37;
                        if (cursor2.isNull(iOooO00o37)) {
                            string9 = null;
                        } else {
                            string9 = cursor2.getString(iOooO00o37);
                        }
                        userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                        i31 = iOooO00o38;
                        if (cursor2.getInt(i31) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        userInfo.setPremium(z2);
                        iOooO00o38 = i31;
                        i32 = iOooO00o39;
                        userInfo.setPremiumLevel(cursor2.getInt(i32));
                        userInfo.setVipState(cursor2.getInt(iOooO00o40));
                        int i6113 = iOooO00o41;
                        userInfo.setVipLevel(cursor2.getInt(i6113));
                        if (cursor2.getInt(iOooO00o42) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        userInfo.setShowVIP(z3);
                        iOooO00o41 = i6113;
                        iOooO00o43 = iOooO00o43;
                        userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                        i33 = iOooO00o44;
                        if (cursor2.isNull(i33)) {
                            string10 = null;
                        } else {
                            string10 = cursor2.getString(i33);
                        }
                        userInfo.setWealthBadgeWithBg(string10);
                        iOooO00o44 = i33;
                        i34 = iOooO00o45;
                        userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                        ArrayList arrayList15 = arrayList;
                        arrayList15.add(new ConversationWithUser(conversation, userInfo));
                        iOooO00o45 = i34;
                        iOooO00o39 = i32;
                        iOooO00o27 = i24;
                        iOooO00o28 = i25;
                        iOooO00o12 = i;
                        i35 = i5;
                        iOooO00o = i23;
                        iOooO00o17 = i29;
                        iOooO00o3 = i40;
                        iOooO00o2 = i39;
                        iOooO00o29 = i28;
                        arrayList2 = arrayList15;
                        iOooO00o26 = i22;
                        iOooO00o15 = i42;
                        iOooO00o13 = i3;
                        iOooO00o11 = i21;
                        iOooO00o16 = i27;
                        cursor2 = cursor;
                        iOooO00o25 = i20;
                        iOooO00o10 = i19;
                        iOooO00o24 = i18;
                        iOooO00o9 = i17;
                        iOooO00o23 = i16;
                        iOooO00o8 = i15;
                        iOooO00o22 = i14;
                        iOooO00o7 = i13;
                        iOooO00o21 = i12;
                        iOooO00o6 = i11;
                        iOooO00o20 = i10;
                        iOooO00o5 = i9;
                        iOooO00o19 = i8;
                        iOooO00o4 = i7;
                        iOooO00o18 = i6;
                    }
                    i7 = iOooO00o4;
                    i8 = iOooO00o19;
                    i9 = iOooO00o5;
                    i10 = iOooO00o20;
                    i11 = iOooO00o6;
                    i12 = iOooO00o21;
                    i13 = iOooO00o7;
                    i14 = iOooO00o22;
                    i15 = iOooO00o8;
                    i16 = iOooO00o23;
                    i17 = iOooO00o9;
                    i18 = iOooO00o24;
                    i19 = iOooO00o10;
                    i20 = iOooO00o25;
                    i21 = iOooO00o11;
                    i22 = iOooO00o26;
                    i23 = i38;
                    i24 = iOooO00o27;
                    arrayList = arrayList2;
                    i25 = iOooO00o28;
                    conversation = conversation2;
                    i26 = iOooO00o45;
                    iOooO00o45 = i26;
                    userInfo = new UserInfo();
                    int i5111 = i22;
                    int i6114 = i24;
                    userInfo.setUserId(cursor2.getLong(i42));
                    if (cursor2.isNull(i2)) {
                        string = null;
                    } else {
                        string = cursor2.getString(i2);
                    }
                    userInfo.setUserIdx(string);
                    userInfo.setIdLevel(cursor2.getInt(i4));
                    if (cursor2.isNull(i6)) {
                        string2 = null;
                    } else {
                        string2 = cursor2.getString(i6);
                    }
                    userInfo.setUserName(string2);
                    if (cursor2.isNull(i8)) {
                        string3 = null;
                    } else {
                        string3 = cursor2.getString(i8);
                    }
                    userInfo.setUserHeader(string3);
                    if (cursor2.isNull(i10)) {
                        string4 = null;
                    } else {
                        string4 = cursor2.getString(i10);
                    }
                    userInfo.setUserHeaderFrame(string4);
                    if (cursor2.isNull(i12)) {
                        string5 = null;
                    } else {
                        string5 = cursor2.getString(i12);
                    }
                    userInfo.setBackground(string5);
                    userInfo.setUserLevel(cursor2.getInt(i14));
                    if (cursor2.getInt(i16) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    userInfo.setBlackUser(z);
                    userInfo.setSex(cursor2.getInt(i18));
                    if (cursor2.isNull(i20)) {
                        string6 = null;
                    } else {
                        string6 = cursor2.getString(i20);
                    }
                    userInfo.setBio(string6);
                    i22 = i5111;
                    if (cursor2.isNull(i22)) {
                        string7 = null;
                    } else {
                        string7 = cursor2.getString(i22);
                    }
                    userInfo.setBirthday(string7);
                    i27 = i2;
                    i24 = i6114;
                    userInfo.setAge(cursor2.getInt(i24));
                    userInfo.setCountryId(cursor2.getInt(i25));
                    i28 = iOooO00o29;
                    i29 = i4;
                    userInfo.setRegion(cursor2.getInt(i28));
                    i30 = iOooO00o30;
                    if (cursor2.isNull(i30)) {
                        string8 = null;
                    } else {
                        string8 = cursor2.getString(i30);
                    }
                    userInfo.setMedal(string8);
                    iOooO00o30 = i30;
                    userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                    userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                    userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                    userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                    userInfo.setRole(cursor2.getInt(iOooO00o35));
                    iOooO00o36 = iOooO00o36;
                    userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                    iOooO00o37 = iOooO00o37;
                    if (cursor2.isNull(iOooO00o37)) {
                        string9 = null;
                    } else {
                        string9 = cursor2.getString(iOooO00o37);
                    }
                    userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                    i31 = iOooO00o38;
                    if (cursor2.getInt(i31) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    userInfo.setPremium(z2);
                    iOooO00o38 = i31;
                    i32 = iOooO00o39;
                    userInfo.setPremiumLevel(cursor2.getInt(i32));
                    userInfo.setVipState(cursor2.getInt(iOooO00o40));
                    int i6115 = iOooO00o41;
                    userInfo.setVipLevel(cursor2.getInt(i6115));
                    if (cursor2.getInt(iOooO00o42) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    userInfo.setShowVIP(z3);
                    iOooO00o41 = i6115;
                    iOooO00o43 = iOooO00o43;
                    userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                    i33 = iOooO00o44;
                    if (cursor2.isNull(i33)) {
                        string10 = null;
                    } else {
                        string10 = cursor2.getString(i33);
                    }
                    userInfo.setWealthBadgeWithBg(string10);
                    iOooO00o44 = i33;
                    i34 = iOooO00o45;
                    userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                    ArrayList arrayList16 = arrayList;
                    arrayList16.add(new ConversationWithUser(conversation, userInfo));
                    iOooO00o45 = i34;
                    iOooO00o39 = i32;
                    iOooO00o27 = i24;
                    iOooO00o28 = i25;
                    iOooO00o12 = i;
                    i35 = i5;
                    iOooO00o = i23;
                    iOooO00o17 = i29;
                    iOooO00o3 = i40;
                    iOooO00o2 = i39;
                    iOooO00o29 = i28;
                    arrayList2 = arrayList16;
                    iOooO00o26 = i22;
                    iOooO00o15 = i42;
                    iOooO00o13 = i3;
                    iOooO00o11 = i21;
                    iOooO00o16 = i27;
                    cursor2 = cursor;
                    iOooO00o25 = i20;
                    iOooO00o10 = i19;
                    iOooO00o24 = i18;
                    iOooO00o9 = i17;
                    iOooO00o23 = i16;
                    iOooO00o8 = i15;
                    iOooO00o22 = i14;
                    iOooO00o7 = i13;
                    iOooO00o21 = i12;
                    iOooO00o6 = i11;
                    iOooO00o20 = i10;
                    iOooO00o5 = i9;
                    iOooO00o19 = i8;
                    iOooO00o4 = i7;
                    iOooO00o18 = i6;
                }
                i5 = i41;
                i6 = iOooO00o18;
                i7 = iOooO00o4;
                i8 = iOooO00o19;
                i9 = iOooO00o5;
                i10 = iOooO00o20;
                i11 = iOooO00o6;
                i12 = iOooO00o21;
                i13 = iOooO00o7;
                i14 = iOooO00o22;
                i15 = iOooO00o8;
                i16 = iOooO00o23;
                i17 = iOooO00o9;
                i18 = iOooO00o24;
                i19 = iOooO00o10;
                i20 = iOooO00o25;
                i21 = iOooO00o11;
                i22 = iOooO00o26;
                i23 = i38;
                i24 = iOooO00o27;
                arrayList = arrayList2;
                i25 = iOooO00o28;
                conversation = conversation2;
                i26 = iOooO00o45;
                iOooO00o45 = i26;
                userInfo = new UserInfo();
                int i5112 = i22;
                int i6116 = i24;
                userInfo.setUserId(cursor2.getLong(i42));
                if (cursor2.isNull(i2)) {
                    string = null;
                } else {
                    string = cursor2.getString(i2);
                }
                userInfo.setUserIdx(string);
                userInfo.setIdLevel(cursor2.getInt(i4));
                if (cursor2.isNull(i6)) {
                    string2 = null;
                } else {
                    string2 = cursor2.getString(i6);
                }
                userInfo.setUserName(string2);
                if (cursor2.isNull(i8)) {
                    string3 = null;
                } else {
                    string3 = cursor2.getString(i8);
                }
                userInfo.setUserHeader(string3);
                if (cursor2.isNull(i10)) {
                    string4 = null;
                } else {
                    string4 = cursor2.getString(i10);
                }
                userInfo.setUserHeaderFrame(string4);
                if (cursor2.isNull(i12)) {
                    string5 = null;
                } else {
                    string5 = cursor2.getString(i12);
                }
                userInfo.setBackground(string5);
                userInfo.setUserLevel(cursor2.getInt(i14));
                if (cursor2.getInt(i16) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                userInfo.setBlackUser(z);
                userInfo.setSex(cursor2.getInt(i18));
                if (cursor2.isNull(i20)) {
                    string6 = null;
                } else {
                    string6 = cursor2.getString(i20);
                }
                userInfo.setBio(string6);
                i22 = i5112;
                if (cursor2.isNull(i22)) {
                    string7 = null;
                } else {
                    string7 = cursor2.getString(i22);
                }
                userInfo.setBirthday(string7);
                i27 = i2;
                i24 = i6116;
                userInfo.setAge(cursor2.getInt(i24));
                userInfo.setCountryId(cursor2.getInt(i25));
                i28 = iOooO00o29;
                i29 = i4;
                userInfo.setRegion(cursor2.getInt(i28));
                i30 = iOooO00o30;
                if (cursor2.isNull(i30)) {
                    string8 = null;
                } else {
                    string8 = cursor2.getString(i30);
                }
                userInfo.setMedal(string8);
                iOooO00o30 = i30;
                userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
                userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
                userInfo.setFansNum(cursor2.getInt(iOooO00o33));
                userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
                userInfo.setRole(cursor2.getInt(iOooO00o35));
                iOooO00o36 = iOooO00o36;
                userInfo.setRegTime(cursor2.getInt(iOooO00o36));
                iOooO00o37 = iOooO00o37;
                if (cursor2.isNull(iOooO00o37)) {
                    string9 = null;
                } else {
                    string9 = cursor2.getString(iOooO00o37);
                }
                userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
                i31 = iOooO00o38;
                if (cursor2.getInt(i31) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                userInfo.setPremium(z2);
                iOooO00o38 = i31;
                i32 = iOooO00o39;
                userInfo.setPremiumLevel(cursor2.getInt(i32));
                userInfo.setVipState(cursor2.getInt(iOooO00o40));
                int i6117 = iOooO00o41;
                userInfo.setVipLevel(cursor2.getInt(i6117));
                if (cursor2.getInt(iOooO00o42) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                userInfo.setShowVIP(z3);
                iOooO00o41 = i6117;
                iOooO00o43 = iOooO00o43;
                userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
                i33 = iOooO00o44;
                if (cursor2.isNull(i33)) {
                    string10 = null;
                } else {
                    string10 = cursor2.getString(i33);
                }
                userInfo.setWealthBadgeWithBg(string10);
                iOooO00o44 = i33;
                i34 = iOooO00o45;
                userInfo.setCurrBadgeLv(cursor2.getInt(i34));
                ArrayList arrayList17 = arrayList;
                arrayList17.add(new ConversationWithUser(conversation, userInfo));
                iOooO00o45 = i34;
                iOooO00o39 = i32;
                iOooO00o27 = i24;
                iOooO00o28 = i25;
                iOooO00o12 = i;
                i35 = i5;
                iOooO00o = i23;
                iOooO00o17 = i29;
                iOooO00o3 = i40;
                iOooO00o2 = i39;
                iOooO00o29 = i28;
                arrayList2 = arrayList17;
                iOooO00o26 = i22;
                iOooO00o15 = i42;
                iOooO00o13 = i3;
                iOooO00o11 = i21;
                iOooO00o16 = i27;
                cursor2 = cursor;
                iOooO00o25 = i20;
                iOooO00o10 = i19;
                iOooO00o24 = i18;
                iOooO00o9 = i17;
                iOooO00o23 = i16;
                iOooO00o8 = i15;
                iOooO00o22 = i14;
                iOooO00o7 = i13;
                iOooO00o21 = i12;
                iOooO00o6 = i11;
                iOooO00o20 = i10;
                iOooO00o5 = i9;
                iOooO00o19 = i8;
                iOooO00o4 = i7;
                iOooO00o18 = i6;
            } else {
                i = i36;
                i2 = iOooO00o16;
            }
            i3 = i37;
            i4 = iOooO00o17;
            i5 = i41;
            i6 = iOooO00o18;
            i7 = iOooO00o4;
            i8 = iOooO00o19;
            i9 = iOooO00o5;
            i10 = iOooO00o20;
            i11 = iOooO00o6;
            i12 = iOooO00o21;
            i13 = iOooO00o7;
            i14 = iOooO00o22;
            i15 = iOooO00o8;
            i16 = iOooO00o23;
            i17 = iOooO00o9;
            i18 = iOooO00o24;
            i19 = iOooO00o10;
            i20 = iOooO00o25;
            i21 = iOooO00o11;
            i22 = iOooO00o26;
            i23 = i38;
            i24 = iOooO00o27;
            arrayList = arrayList2;
            i25 = iOooO00o28;
            conversation = conversation2;
            i26 = iOooO00o45;
            iOooO00o45 = i26;
            userInfo = new UserInfo();
            int i5113 = i22;
            int i6118 = i24;
            userInfo.setUserId(cursor2.getLong(i42));
            if (cursor2.isNull(i2)) {
                string = null;
            } else {
                string = cursor2.getString(i2);
            }
            userInfo.setUserIdx(string);
            userInfo.setIdLevel(cursor2.getInt(i4));
            if (cursor2.isNull(i6)) {
                string2 = null;
            } else {
                string2 = cursor2.getString(i6);
            }
            userInfo.setUserName(string2);
            if (cursor2.isNull(i8)) {
                string3 = null;
            } else {
                string3 = cursor2.getString(i8);
            }
            userInfo.setUserHeader(string3);
            if (cursor2.isNull(i10)) {
                string4 = null;
            } else {
                string4 = cursor2.getString(i10);
            }
            userInfo.setUserHeaderFrame(string4);
            if (cursor2.isNull(i12)) {
                string5 = null;
            } else {
                string5 = cursor2.getString(i12);
            }
            userInfo.setBackground(string5);
            userInfo.setUserLevel(cursor2.getInt(i14));
            if (cursor2.getInt(i16) != 0) {
                z = true;
            } else {
                z = false;
            }
            userInfo.setBlackUser(z);
            userInfo.setSex(cursor2.getInt(i18));
            if (cursor2.isNull(i20)) {
                string6 = null;
            } else {
                string6 = cursor2.getString(i20);
            }
            userInfo.setBio(string6);
            i22 = i5113;
            if (cursor2.isNull(i22)) {
                string7 = null;
            } else {
                string7 = cursor2.getString(i22);
            }
            userInfo.setBirthday(string7);
            i27 = i2;
            i24 = i6118;
            userInfo.setAge(cursor2.getInt(i24));
            userInfo.setCountryId(cursor2.getInt(i25));
            i28 = iOooO00o29;
            i29 = i4;
            userInfo.setRegion(cursor2.getInt(i28));
            i30 = iOooO00o30;
            if (cursor2.isNull(i30)) {
                string8 = null;
            } else {
                string8 = cursor2.getString(i30);
            }
            userInfo.setMedal(string8);
            iOooO00o30 = i30;
            userInfo.setVisitorNum(cursor2.getInt(iOooO00o31));
            userInfo.setFollowedNum(cursor2.getInt(iOooO00o32));
            userInfo.setFansNum(cursor2.getInt(iOooO00o33));
            userInfo.setJoinRoomNum(cursor2.getInt(iOooO00o34));
            userInfo.setRole(cursor2.getInt(iOooO00o35));
            iOooO00o36 = iOooO00o36;
            userInfo.setRegTime(cursor2.getInt(iOooO00o36));
            iOooO00o37 = iOooO00o37;
            if (cursor2.isNull(iOooO00o37)) {
                string9 = null;
            } else {
                string9 = cursor2.getString(iOooO00o37);
            }
            userInfo.setTags(this.f45758OooO0o.f45752OooOO0o.stringToList(string9));
            i31 = iOooO00o38;
            if (cursor2.getInt(i31) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            userInfo.setPremium(z2);
            iOooO00o38 = i31;
            i32 = iOooO00o39;
            userInfo.setPremiumLevel(cursor2.getInt(i32));
            userInfo.setVipState(cursor2.getInt(iOooO00o40));
            int i6119 = iOooO00o41;
            userInfo.setVipLevel(cursor2.getInt(i6119));
            if (cursor2.getInt(iOooO00o42) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            userInfo.setShowVIP(z3);
            iOooO00o41 = i6119;
            iOooO00o43 = iOooO00o43;
            userInfo.setWealthLevel(cursor2.getInt(iOooO00o43));
            i33 = iOooO00o44;
            if (cursor2.isNull(i33)) {
                string10 = null;
            } else {
                string10 = cursor2.getString(i33);
            }
            userInfo.setWealthBadgeWithBg(string10);
            iOooO00o44 = i33;
            i34 = iOooO00o45;
            userInfo.setCurrBadgeLv(cursor2.getInt(i34));
            ArrayList arrayList18 = arrayList;
            arrayList18.add(new ConversationWithUser(conversation, userInfo));
            iOooO00o45 = i34;
            iOooO00o39 = i32;
            iOooO00o27 = i24;
            iOooO00o28 = i25;
            iOooO00o12 = i;
            i35 = i5;
            iOooO00o = i23;
            iOooO00o17 = i29;
            iOooO00o3 = i40;
            iOooO00o2 = i39;
            iOooO00o29 = i28;
            arrayList2 = arrayList18;
            iOooO00o26 = i22;
            iOooO00o15 = i42;
            iOooO00o13 = i3;
            iOooO00o11 = i21;
            iOooO00o16 = i27;
            cursor2 = cursor;
            iOooO00o25 = i20;
            iOooO00o10 = i19;
            iOooO00o24 = i18;
            iOooO00o9 = i17;
            iOooO00o23 = i16;
            iOooO00o8 = i15;
            iOooO00o22 = i14;
            iOooO00o7 = i13;
            iOooO00o21 = i12;
            iOooO00o6 = i11;
            iOooO00o20 = i10;
            iOooO00o5 = i9;
            iOooO00o19 = i8;
            iOooO00o4 = i7;
            iOooO00o18 = i6;
        }
        return arrayList2;
    }
}
