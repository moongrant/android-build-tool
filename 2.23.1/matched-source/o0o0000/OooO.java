package o0o0000;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.http.ApiError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p205o00o0o0o.o000O;
import p383o0OOoOo0.Oooo000;
import p414o0Oo0o0O.o00oOoo;
import p437o0OoOOOo.o0O00000;
import p437o0OoOOOo.o0OoOoOo;
import p565o0oOo000.o000OOo;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO {
    public static final void OooO00o(int i, byte[] bArr) {
        MessageIM.ImError700 from;
        OooOOOO.OooO0O0("Socket MessageErrorHandler code = " + i);
        boolean z = true;
        if (i == -2) {
            String strOooO0OO = o0000.OooO0OO(o000OOo.not_network);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            }
            o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
        }
        if (i == -1) {
            String strOooO0OO2 = o0000.OooO0OO(o000OOo.not_network);
            if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o2.run();
                return;
            } else {
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o2);
                return;
            }
        }
        if (i == 400) {
            String strOooO0OO3 = o0000.OooO0OO(o000OOo.wrong_parameter);
            if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o3 = OooOo00.OooO00o(strOooO0OO3, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o3.run();
                return;
            } else {
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o3);
                return;
            }
        }
        if (i == 401) {
            String strOooO0OO4 = o0000.OooO0OO(o000OOo.error_unauthorized);
            if (strOooO0OO4 != null && !StringsKt.isBlank(strOooO0OO4)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o4 = OooOo00.OooO00o(strOooO0OO4, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o4.run();
                return;
            } else {
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o4);
                return;
            }
        }
        if (i == 500) {
            String strOooO0OO5 = o0000.OooO0OO(o000OOo.Unknown_Failure);
            if (strOooO0OO5 != null && !StringsKt.isBlank(strOooO0OO5)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o5 = OooOo00.OooO00o(strOooO0OO5, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o5.run();
                return;
            } else {
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o5);
                return;
            }
        }
        if (i == 630) {
            String strOooO0OO6 = o0000.OooO0OO(o000OOo.message_expired);
            if (strOooO0OO6 != null && !StringsKt.isBlank(strOooO0OO6)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o6 = OooOo00.OooO00o(strOooO0OO6, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o6.run();
                return;
            } else {
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o6);
                return;
            }
        }
        if (i == 700) {
            if (bArr == null || (from = MessageIM.ImError700.parseFrom(bArr)) == null) {
                return;
            }
            Intrinsics.checkNotNull(from);
            int type = from.getType();
            if (type != 1) {
                if (type != 2) {
                    return;
                }
                String msg = from.getMsg();
                Intrinsics.checkNotNullExpressionValue(msg, "getMsg(...)");
                o000O00.OooO0O0(msg);
                return;
            }
            Context context = o000O00O.f13430OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                o000O o000o = new o000O(activityOooO0O0);
                String msg2 = from.getMsg();
                Intrinsics.checkNotNullExpressionValue(msg2, "getMsg(...)");
                o000o.OooOo00(msg2);
                o000o.OooOo0(OooO0O0.f48388OooO0Oo);
                o000o.OooOO0o();
                return;
            }
            return;
        }
        if (i == 600) {
            String strOooO0OO7 = o0000.OooO0OO(o000OOo.Friends_Already);
            if (strOooO0OO7 != null && !StringsKt.isBlank(strOooO0OO7)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o7 = OooOo00.OooO00o(strOooO0OO7, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o7.run();
                return;
            } else {
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o7);
                return;
            }
        }
        if (i == 601) {
            String strOooO0OO8 = o0000.OooO0OO(o000OOo.microom_code_1003);
            if (strOooO0OO8 != null && !StringsKt.isBlank(strOooO0OO8)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o8 = OooOo00.OooO00o(strOooO0OO8, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o8.run();
                return;
            } else {
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o8);
                return;
            }
        }
        o0OoOoOo o0oooooo = o0OoOoOo.f47016OooO00o;
        switch (i) {
            case YallaTeamMessage.JumpId.MomentList_Topics /* 603 */:
                String strOooO0OO9 = o0000.OooO0OO(o000OOo.ADD_FREIND_NEED_VALIDATION);
                if (strOooO0OO9 != null && !StringsKt.isBlank(strOooO0OO9)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o9 = OooOo00.OooO00o(strOooO0OO9, "runnable");
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000O00O.f13431OooO0O0.post(o000oo0OooO00o9);
                    } else {
                        o000oo0OooO00o9.run();
                    }
                    break;
                }
                break;
            case 604:
                String strOooO0OO10 = o0000.OooO0OO(o000OOo.On_His_Blacklist);
                if (strOooO0OO10 != null && !StringsKt.isBlank(strOooO0OO10)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o10 = OooOo00.OooO00o(strOooO0OO10, "runnable");
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000O00O.f13431OooO0O0.post(o000oo0OooO00o10);
                    } else {
                        o000oo0OooO00o10.run();
                    }
                    break;
                }
                break;
            case 605:
                String strOooO0OO11 = o0000.OooO0OO(o000OOo.friend_limit);
                if (strOooO0OO11 != null && !StringsKt.isBlank(strOooO0OO11)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o11 = OooOo00.OooO00o(strOooO0OO11, "runnable");
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000O00O.f13431OooO0O0.post(o000oo0OooO00o11);
                    } else {
                        o000oo0OooO00o11.run();
                    }
                    break;
                }
                break;
            case 606:
                String strOooO0OO12 = o0000.OooO0OO(o000OOo.friend_user_limit);
                if (strOooO0OO12 != null && !StringsKt.isBlank(strOooO0OO12)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o12 = OooOo00.OooO00o(strOooO0OO12, "runnable");
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000O00O.f13431OooO0O0.post(o000oo0OooO00o12);
                    } else {
                        o000oo0OooO00o12.run();
                    }
                    break;
                }
                break;
            case 607:
                String strOooO0OO13 = o0000.OooO0OO(o000OOo.friended_too_often);
                if (strOooO0OO13 != null && !StringsKt.isBlank(strOooO0OO13)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o13 = OooOo00.OooO00o(strOooO0OO13, "runnable");
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000O00O.f13431OooO0O0.post(o000oo0OooO00o13);
                    } else {
                        o000oo0OooO00o13.run();
                    }
                    break;
                }
                break;
            case 608:
                kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_Frozen, null, 2, null, o0oooooo);
                break;
            case 609:
                kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_NotEnough, null, 2, null, o0oooooo);
                break;
            case 610:
                String strOooO0OO14 = o0000.OooO0OO(o000OOo.microom_code_1013);
                if (strOooO0OO14 != null && !StringsKt.isBlank(strOooO0OO14)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o14 = OooOo00.OooO00o(strOooO0OO14, "runnable");
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000O00O.f13431OooO0O0.post(o000oo0OooO00o14);
                    } else {
                        o000oo0OooO00o14.run();
                    }
                    break;
                }
                break;
            case 611:
                kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Other_Device_Login, null, 2, null, o0oooooo);
                break;
            case 612:
                kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_Frozen, null, 2, null, o0oooooo);
                break;
            case 613:
                kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Crystal_NotEnough, null, 2, null, o0oooooo);
                break;
            case 614:
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o00oOoo(null), 2, null);
                break;
            default:
                switch (i) {
                    case 616:
                        String strOooO0OO15 = o0000.OooO0OO(o000OOo.error_friend_add_unacceptable_word);
                        if (strOooO0OO15 != null && !StringsKt.isBlank(strOooO0OO15)) {
                            z = false;
                        }
                        if (!z) {
                            o000Oo0 o000oo0OooO00o15 = OooOo00.OooO00o(strOooO0OO15, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000O00O.f13431OooO0O0.post(o000oo0OooO00o15);
                            } else {
                                o000oo0OooO00o15.run();
                            }
                            break;
                        }
                        break;
                    case 617:
                        kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Other_Device_Login, null, 2, null, o0oooooo);
                        break;
                    case 618:
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o00oOoo(null), 2, null);
                        break;
                    case 619:
                        String strOooO0OO16 = o0000.OooO0OO(o000OOo.message_too_many_friend_request);
                        if (strOooO0OO16 != null && !StringsKt.isBlank(strOooO0OO16)) {
                            z = false;
                        }
                        if (!z) {
                            o000Oo0 o000oo0OooO00o16 = OooOo00.OooO00o(strOooO0OO16, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000O00O.f13431OooO0O0.post(o000oo0OooO00o16);
                            } else {
                                o000oo0OooO00o16.run();
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i) {
                            case 641:
                                String strOooO0OO17 = o0000.OooO0OO(o000OOo.message_send_frequently);
                                if (strOooO0OO17 != null && !StringsKt.isBlank(strOooO0OO17)) {
                                    z = false;
                                }
                                if (!z) {
                                    o000Oo0 o000oo0OooO00o17 = OooOo00.OooO00o(strOooO0OO17, "runnable");
                                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                        o000O00O.f13431OooO0O0.post(o000oo0OooO00o17);
                                    } else {
                                        o000oo0OooO00o17.run();
                                    }
                                    break;
                                }
                                break;
                            case 642:
                                String strOooO0OO18 = o0000.OooO0OO(o000OOo.message_send_limited);
                                if (strOooO0OO18 != null && !StringsKt.isBlank(strOooO0OO18)) {
                                    z = false;
                                }
                                if (!z) {
                                    o000Oo0 o000oo0OooO00o18 = OooOo00.OooO00o(strOooO0OO18, "runnable");
                                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                        o000O00O.f13431OooO0O0.post(o000oo0OooO00o18);
                                    } else {
                                        o000oo0OooO00o18.run();
                                    }
                                    break;
                                }
                                break;
                            case 643:
                                Context context2 = o000O00O.f13430OooO00o;
                                Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                                if (activityOooO0O1 != null) {
                                    o000O o000o2 = new o000O(activityOooO0O1);
                                    o000o2.OooOOoo(o000OOo.Nobility_commodity);
                                    o000o2.OooOO0o();
                                }
                                break;
                            case 644:
                                Context context3 = o000O00O.f13430OooO00o;
                                Activity activityOooO0O2 = com.code.android.util.OooO0O0.OooO0O0();
                                if (activityOooO0O2 != null) {
                                    o000O o000o3 = new o000O(activityOooO0O2);
                                    o000o3.OooOOoo(o000OOo.Vip_KA_commodity);
                                    o000o3.OooOO0o();
                                }
                                break;
                            case 645:
                                Context context4 = o000O00O.f13430OooO00o;
                                Activity activityOooO0O3 = com.code.android.util.OooO0O0.OooO0O0();
                                if (activityOooO0O3 != null) {
                                    o000O o000o4 = new o000O(activityOooO0O3);
                                    o000o4.OooOOoo(o000OOo.Vip_commodity_freeze);
                                    o000o4.OooOO0o();
                                }
                                break;
                            default:
                                switch (i) {
                                    case 650:
                                        ApiError error = new ApiError(2055, null, null, 6, null);
                                        Intrinsics.checkNotNullParameter(error, "error");
                                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
                                        break;
                                    case 651:
                                        kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Friend_Has_This_Theme, null, 2, null, o0oooooo);
                                        break;
                                    case 652:
                                        ApiError error2 = new ApiError(2048, null, null, 6, null);
                                        Intrinsics.checkNotNullParameter(error2, "error");
                                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error2, null), 3, null);
                                        break;
                                    case 653:
                                        kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Account_Has_Deleted, null, 2, null, o0oooooo);
                                        break;
                                    case 654:
                                        ApiError error3 = new ApiError(2053, null, null, 6, null);
                                        Intrinsics.checkNotNullParameter(error3, "error");
                                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error3, null), 3, null);
                                        break;
                                    case 655:
                                        String strOooO0OO19 = o0000.OooO0OO(o000OOo.face_has_expired);
                                        if (strOooO0OO19 != null && !StringsKt.isBlank(strOooO0OO19)) {
                                            z = false;
                                        }
                                        if (!z) {
                                            o000Oo0 o000oo0OooO00o19 = OooOo00.OooO00o(strOooO0OO19, "runnable");
                                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                o000oo0OooO00o19.run();
                                            } else {
                                                o000O00O.f13431OooO0O0.post(o000oo0OooO00o19);
                                            }
                                        }
                                        LiveEventBus.get("CHAT_FACE_HAS_SOLD_OUT").post("");
                                        break;
                                    case 656:
                                        String strOooO0OO20 = o0000.OooO0OO(o000OOo.face_has_sold_out);
                                        if (strOooO0OO20 != null && !StringsKt.isBlank(strOooO0OO20)) {
                                            z = false;
                                        }
                                        if (!z) {
                                            o000Oo0 o000oo0OooO00o20 = OooOo00.OooO00o(strOooO0OO20, "runnable");
                                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                o000oo0OooO00o20.run();
                                            } else {
                                                o000O00O.f13431OooO0O0.post(o000oo0OooO00o20);
                                            }
                                        }
                                        LiveEventBus.get("CHAT_FACE_HAS_SOLD_OUT").post("");
                                        break;
                                    case 657:
                                    case 658:
                                    case 659:
                                        break;
                                    default:
                                        String strOooO0OO21 = o0000.OooO0OO(o000OOo.Unknown_Failure);
                                        if (strOooO0OO21 != null && !StringsKt.isBlank(strOooO0OO21)) {
                                            z = false;
                                        }
                                        if (!z) {
                                            o000Oo0 o000oo0OooO00o21 = OooOo00.OooO00o(strOooO0OO21, "runnable");
                                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                o000O00O.f13431OooO0O0.post(o000oo0OooO00o21);
                                            } else {
                                                o000oo0OooO00o21.run();
                                            }
                                            break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
