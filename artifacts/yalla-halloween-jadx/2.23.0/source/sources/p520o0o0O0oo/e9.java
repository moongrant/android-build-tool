package p520o0o0O0oo;

import androidx.compose.animation.OooO;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000OO00;
import com.code.android.util.o0OoOo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.WealthLevel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypePay;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p188o00o0O.OooOO0O;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0Oo0oo;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.l5;
import p519o0o0O0oO.n5;
import p533o0o0Oo0.oo0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class e9 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53277OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeShow.values().length];
            try {
                iArr[GiftPropTypeShow.InRoom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftPropTypeShow.InChat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GiftPropTypeShow.InMomentList.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(x6 x6Var) {
        super(0);
        this.f53277OooO0Oo = x6Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0341  */
    /* JADX WARN: Code duplicated, block: B:103:0x034e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0362  */
    /* JADX WARN: Code duplicated, block: B:108:0x0368  */
    /* JADX WARN: Code duplicated, block: B:109:0x037a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x037c  */
    /* JADX WARN: Code duplicated, block: B:111:0x038e  */
    /* JADX WARN: Code duplicated, block: B:114:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:117:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:94:0x030f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0314  */
    /* JADX WARN: Code duplicated, block: B:97:0x032b  */
    /* JADX WARN: Code duplicated, block: B:99:0x033f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long localCount;
        boolean z;
        o00O0 o00o1;
        Long l;
        Long l2;
        x6 dialog = this.f53277OooO0Oo;
        GiftPropModel giftPropModel = dialog.f53384OooOOo;
        if (giftPropModel == null) {
            return null;
        }
        giftPropModel.setLocalCount(dialog.f53383OooOOOo);
        int i = 0;
        if (OooO00o.$EnumSwitchMapping$0[dialog.f53374OooO.ordinal()] == 1) {
            o0OO000.OooO0O0("102021", OooOO0O.OooO00o(new Pair("Giftid", Integer.valueOf(giftPropModel.getGiftId()))));
        }
        d9 d9Var = new d9(dialog);
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        GiftPropModel giftPropModel2 = dialog.f53384OooOOo;
        if (giftPropModel2 != null) {
            int typeUser = giftPropModel2.getTypeUser();
            if (typeUser != GiftPropTypeUser.Hot.getValue()) {
                int value = GiftPropTypeUser.Premium.getValue();
                FragmentActivity fragmentActivity = dialog.f53375OooO0oO;
                if (typeUser == value) {
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    Pair pair = (Pair) o000000O.OooOO0o().getValue();
                    if (pair != null) {
                        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                        PremiumLevel premiumLevelOf = PremiumLevel.INSTANCE.of((Integer) pair.getSecond());
                        if (!zBooleanValue || premiumLevelOf.getValue() <= 0) {
                            o0OO00O o0oo00o2 = new o0OO00O(fragmentActivity);
                            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.Nobility_commodity));
                            o0oo00o2.OooOOOO(oO00OOo0.Get_Yalla_Premium);
                            o0oo00o2.OooOo0(new k6(dialog, premiumLevelOf));
                            o0oo00o2.OooOo(true);
                            o0oo00o2.OooOO0o();
                        } else {
                            localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                                o000000O o000000o3 = o000000O.f46674OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0O0().getValue())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                                o000000O o000000o4 = o000000O.f46674OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0Oo().getValue())) {
                                    i = 1;
                                }
                            }
                            o00o1 = o00O0.f45732OooO00o;
                            if (z) {
                                LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO.OooO0O0(oOO00O.Coin_NotEnough, null, 2, null, o00o1);
                            } else if (i != 0) {
                                LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO.OooO0O0(oOO00O.Crystal_NotEnough, null, 2, null, o00o1);
                            } else {
                                o000000O o000000o5 = o000000O.f46674OooO00o;
                                l = (Long) o000000O.OooOOo0().getValue();
                                long jLongValue = dialog.f53382OooOOOO.getUserId().getValue().longValue();
                                if (l == null && l.longValue() == jLongValue) {
                                    o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                                } else {
                                    d9Var.invoke(giftPropModel2);
                                }
                            }
                        }
                    } else {
                        localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                            o000000O o000000o6 = o000000O.f46674OooO00o;
                            if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0O0().getValue())) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                            o000000O o000000o7 = o000000O.f46674OooO00o;
                            if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0Oo().getValue())) {
                                i = 1;
                            }
                        }
                        o00o1 = o00O0.f45732OooO00o;
                        if (z) {
                            LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                            OooO.OooO0O0(oOO00O.Coin_NotEnough, null, 2, null, o00o1);
                        } else if (i != 0) {
                            LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                            OooO.OooO0O0(oOO00O.Crystal_NotEnough, null, 2, null, o00o1);
                        } else {
                            o000000O o000000o8 = o000000O.f46674OooO00o;
                            l = (Long) o000000O.OooOOo0().getValue();
                            long jLongValue2 = dialog.f53382OooOOOO.getUserId().getValue().longValue();
                            if (l == null) {
                                d9Var.invoke(giftPropModel2);
                            } else {
                                o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                            }
                        }
                    }
                } else if (typeUser == GiftPropTypeUser.Wealth.getValue()) {
                    if (WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null)) {
                        o000000O o000000o9 = o000000O.f46674OooO00o;
                        if (o0OoOo0.OooO0o0(0, (Integer) o000000O.OooO0oO().getValue()) < giftPropModel2.getSendLvLimit()) {
                            String sendLvLimit = o0OoOo0.OooOO0o(Integer.valueOf(giftPropModel2.getSendLvLimit()), "");
                            Intrinsics.checkNotNullParameter(sendLvLimit, "sendLvLimit");
                            p417o0OoO0.OooO.OooO00o(fragmentActivity, new n5(sendLvLimit, m6.f53314OooO0Oo));
                        } else {
                            localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                                o000000O o000000o10 = o000000O.f46674OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0O0().getValue())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                                o000000O o000000o11 = o000000O.f46674OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0Oo().getValue())) {
                                    i = 1;
                                }
                            }
                            o00o1 = o00O0.f45732OooO00o;
                            if (z) {
                                LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO.OooO0O0(oOO00O.Coin_NotEnough, null, 2, null, o00o1);
                            } else if (i != 0) {
                                LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO.OooO0O0(oOO00O.Crystal_NotEnough, null, 2, null, o00o1);
                            } else {
                                o000000O o000000o12 = o000000O.f46674OooO00o;
                                l = (Long) o000000O.OooOOo0().getValue();
                                long jLongValue3 = dialog.f53382OooOOOO.getUserId().getValue().longValue();
                                if (l == null) {
                                    d9Var.invoke(giftPropModel2);
                                } else {
                                    o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                                }
                            }
                        }
                    } else {
                        p417o0OoO0.OooO.OooO00o(fragmentActivity, new l5(new l6(dialog)));
                    }
                } else if (typeUser == GiftPropTypeUser.Vip.getValue()) {
                    o000000O o000000o13 = o000000O.f46674OooO00o;
                    Pair pair2 = (Pair) o000000O.OooOO0().getValue();
                    if (pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.VipFrozen.getValue()) {
                        o0OO00O o0oo00o3 = new o0OO00O(fragmentActivity);
                        o0oo00o3.OooOo00(o0000.OooO0OO(oO00OOo0.Vip_commodity_freeze));
                        o0oo00o3.OooOOOO(oO00OOo0.unfreeze_vip);
                        o0oo00o3.OooOo0(n6.f53317OooO0Oo);
                        o0oo00o3.OooOo(true);
                        o0oo00o3.OooOO0o();
                    } else {
                        Pair pair3 = (Pair) o000000O.OooOO0().getValue();
                        if (o0OoOo0.OooO0o0(0, pair3 != null ? (Integer) pair3.getSecond() : null) <= 0) {
                            o0OO00O o0oo00o4 = new o0OO00O(fragmentActivity);
                            o0oo00o4.OooOo00(o0000.OooO0OO(oO00OOo0.Vip_KA_commodity));
                            o0oo00o4.OooOOOO(oO00OOo0.Get_Vip);
                            o0oo00o4.OooOo0(o6.f53320OooO0Oo);
                            o0oo00o4.OooOo(true);
                            o0oo00o4.OooOO0o();
                        } else {
                            localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                                o000000O o000000o14 = o000000O.f46674OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0O0().getValue())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                                o000000O o000000o15 = o000000O.f46674OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0Oo().getValue())) {
                                    i = 1;
                                }
                            }
                            o00o1 = o00O0.f45732OooO00o;
                            if (z) {
                                LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO.OooO0O0(oOO00O.Coin_NotEnough, null, 2, null, o00o1);
                            } else if (i != 0) {
                                LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO.OooO0O0(oOO00O.Crystal_NotEnough, null, 2, null, o00o1);
                            } else {
                                o000000O o000000o16 = o000000O.f46674OooO00o;
                                l = (Long) o000000O.OooOOo0().getValue();
                                long jLongValue4 = dialog.f53382OooOOOO.getUserId().getValue().longValue();
                                if (l == null) {
                                    d9Var.invoke(giftPropModel2);
                                } else {
                                    o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                                }
                            }
                        }
                    }
                } else if (typeUser == GiftPropTypeUser.Flags.getValue()) {
                    localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                        o000000O o000000o17 = o000000O.f46674OooO00o;
                        if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0O0().getValue())) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                        o000000O o000000o18 = o000000O.f46674OooO00o;
                        if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0Oo().getValue())) {
                            i = 1;
                        }
                    }
                    o00o1 = o00O0.f45732OooO00o;
                    if (z) {
                        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                        OooO.OooO0O0(oOO00O.Coin_NotEnough, null, 2, null, o00o1);
                    } else if (i != 0) {
                        LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                        OooO.OooO0O0(oOO00O.Crystal_NotEnough, null, 2, null, o00o1);
                    } else {
                        o000000O o000000o19 = o000000O.f46674OooO00o;
                        l = (Long) o000000O.OooOOo0().getValue();
                        long jLongValue5 = dialog.f53382OooOOOO.getUserId().getValue().longValue();
                        if (l == null) {
                            d9Var.invoke(giftPropModel2);
                        } else {
                            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                        }
                    }
                } else if (typeUser == GiftPropTypeUser.Member.getValue()) {
                    OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
                    if (oooO00o.OooO00o().OooOOO()) {
                        o000000O o000000o20 = o000000O.f46674OooO00o;
                        Long l3 = (Long) o000000O.OooOOo0().getValue();
                        long jLongValue6 = dialog.f53382OooOOOO.getUserId().getValue().longValue();
                        if (l3 != null && l3.longValue() == jLongValue6) {
                            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                        } else {
                            d9Var.invoke(giftPropModel2);
                        }
                    } else if (!oooO00o.OooO00o().OooOO0O()) {
                        LiveEventBus.get("JoinRoomDialogFromGiftSendDialogLink").post(Boolean.FALSE);
                        o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.room_member_join_tips));
                        com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47531OooOoOO.setValue(Boolean.TRUE);
                    } else if (com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.OooO0Oo() < giftPropModel2.getSendLvLimit()) {
                        o0OO00O o0oo00o5 = new o0OO00O(fragmentActivity);
                        o0oo00o5.OooOo00(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_member_min_level_XXX_tips), o0OoOo0.OooOO0o(Integer.valueOf(giftPropModel2.getSendLvLimit()), "")));
                        o0oo00o5.OooOOOO(oO00OOo0.room_member_level_update);
                        o0oo00o5.OooOo0(p6.f53323OooO0Oo);
                        o0oo00o5.OooOo0o(o0000.OooO0OO(oO00OOo0.OK));
                        o0oo00o5.OooOO0o();
                    } else {
                        localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                            o000000O o000000o110 = o000000O.f46674OooO00o;
                            if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0O0().getValue())) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                            o000000O o000000o111 = o000000O.f46674OooO00o;
                            if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0Oo().getValue())) {
                                i = 1;
                            }
                        }
                        o00o1 = o00O0.f45732OooO00o;
                        if (z) {
                            LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                            OooO.OooO0O0(oOO00O.Coin_NotEnough, null, 2, null, o00o1);
                        } else if (i != 0) {
                            LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                            OooO.OooO0O0(oOO00O.Crystal_NotEnough, null, 2, null, o00o1);
                        } else {
                            o000000O o000000o112 = o000000O.f46674OooO00o;
                            l = (Long) o000000O.OooOOo0().getValue();
                            long jLongValue7 = dialog.f53382OooOOOO.getUserId().getValue().longValue();
                            if (l == null) {
                                d9Var.invoke(giftPropModel2);
                            } else {
                                o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                            }
                        }
                    }
                } else if (typeUser != GiftPropTypeUser.Backpack.getValue()) {
                    localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                        o000000O o000000o113 = o000000O.f46674OooO00o;
                        if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0O0().getValue())) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                        o000000O o000000o114 = o000000O.f46674OooO00o;
                        if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0Oo().getValue())) {
                            i = 1;
                        }
                    }
                    o00o1 = o00O0.f45732OooO00o;
                    if (z) {
                        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                        OooO.OooO0O0(oOO00O.Coin_NotEnough, null, 2, null, o00o1);
                    } else if (i != 0) {
                        LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                        OooO.OooO0O0(oOO00O.Crystal_NotEnough, null, 2, null, o00o1);
                    } else {
                        o000000O o000000o115 = o000000O.f46674OooO00o;
                        l = (Long) o000000O.OooOOo0().getValue();
                        long jLongValue8 = dialog.f53382OooOOOO.getUserId().getValue().longValue();
                        if (l == null) {
                            d9Var.invoke(giftPropModel2);
                        } else {
                            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                        }
                    }
                } else if (Intrinsics.areEqual(dialog.f53382OooOOOO, d6.f53266OooO0oO)) {
                    for (oo0O oo0o : com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O) {
                        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(oo0o.f54838OooO0OO.getValue());
                        if (roomUserInfoModelOooO0o0 != null) {
                            long jLongValue9 = roomUserInfoModelOooO0o0.getUserId().getValue().longValue();
                            o000000O o000000o21 = o000000O.f46674OooO00o;
                            Long l4 = (Long) o000000O.OooOOo0().getValue();
                            if (l4 == null || jLongValue9 != l4.longValue()) {
                                i++;
                            }
                        }
                    }
                    if (i <= 0) {
                        o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.room_dialog_no_other_people_in_mic));
                    } else if (dialog.f53383OooOOOo * i > giftPropModel2.getGiftBackpackPropNum()) {
                        o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.You_do_not_have_enough_gifts));
                    } else {
                        o000000O o000000o22 = o000000O.f46674OooO00o;
                        l2 = (Long) o000000O.OooOOo0().getValue();
                        long jLongValue10 = dialog.f53382OooOOOO.getUserId().getValue().longValue();
                        if (l2 == null && l2.longValue() == jLongValue10) {
                            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                        } else {
                            d9Var.invoke(giftPropModel2);
                        }
                    }
                } else if (dialog.f53383OooOOOo > giftPropModel2.getGiftBackpackPropNum()) {
                    o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.You_do_not_have_enough_gifts));
                } else {
                    o000000O o000000o23 = o000000O.f46674OooO00o;
                    l2 = (Long) o000000O.OooOOo0().getValue();
                    long jLongValue11 = dialog.f53382OooOOOO.getUserId().getValue().longValue();
                    if (l2 == null) {
                        d9Var.invoke(giftPropModel2);
                    } else {
                        o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                    }
                }
            } else {
                localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                    o000000O o000000o116 = o000000O.f46674OooO00o;
                    if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0O0().getValue())) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                    o000000O o000000o117 = o000000O.f46674OooO00o;
                    if (localCount > o0OoOo0.OooOO0((Long) o000000O.OooO0Oo().getValue())) {
                        i = 1;
                    }
                }
                o00o1 = o00O0.f45732OooO00o;
                if (z) {
                    LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                    OooO.OooO0O0(oOO00O.Coin_NotEnough, null, 2, null, o00o1);
                } else if (i != 0) {
                    LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                    OooO.OooO0O0(oOO00O.Crystal_NotEnough, null, 2, null, o00o1);
                } else {
                    o000000O o000000o118 = o000000O.f46674OooO00o;
                    l = (Long) o000000O.OooOOo0().getValue();
                    long jLongValue12 = dialog.f53382OooOOOO.getUserId().getValue().longValue();
                    if (l == null) {
                        d9Var.invoke(giftPropModel2);
                    } else {
                        o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                    }
                }
            }
        }
        if (giftPropModel.isCustomMade()) {
            o0Oo0oo o0oo0ooOooO0Oo = o00Oo0.OooO0Oo();
            o0oo0ooOooO0Oo.getClass();
            o0oo0ooOooO0Oo.OooO0o("neverShowCustomMadeGiftWarn" + o000000O.OooOOo0().getValue(), true);
            ConstraintLayout constraintLayout = dialog.OooOOo().f58220OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.customGiftWarnContainer");
            o000OO00.OooO0O0(constraintLayout);
        }
        return Unit.INSTANCE;
    }
}
