package p511o0o0O;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00;
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
import kotlin.collections.unsigned.OooO0OO;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p190o00o0O.OooOO0;
import p205o00o0o0o.o000O;
import p414o0Oo0oO.oO0Oo0oo;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.oo0o0Oo;
import p435o0OoOOOo.o0O000;
import p435o0OoOOOo.o0O0o;
import p475o0Ooooo0.o0O00oO0;
import p541o0o0OoOO.oo00;
import p562o0oOo000.o000000;
import p650o0ooo.m5;
import p650o0ooo.o5;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51052OooO0Oo;

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
    public o00OO0O0(o00000OO o00000oo2) {
        super(0);
        this.f51052OooO0Oo = o00000oo2;
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
        o0O000 o0o001;
        Long l;
        Long l2;
        o00000OO dialog = this.f51052OooO0Oo;
        GiftPropModel giftPropModel = dialog.f50968OooOOo;
        if (giftPropModel == null) {
            return null;
        }
        giftPropModel.setLocalCount(dialog.f50967OooOOOo);
        int i = 0;
        if (OooO00o.$EnumSwitchMapping$0[dialog.f50958OooO.ordinal()] == 1) {
            o0oo0000.OooO00o.OooO0OO("102021", OooOO0.OooO00o(new Pair("Giftid", Integer.valueOf(giftPropModel.getGiftId()))));
        }
        o00OO00O o00oo00o = new o00OO00O(dialog);
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        GiftPropModel giftPropModel2 = dialog.f50968OooOOo;
        if (giftPropModel2 != null) {
            int typeUser = giftPropModel2.getTypeUser();
            if (typeUser != GiftPropTypeUser.Hot.getValue()) {
                int value = GiftPropTypeUser.Premium.getValue();
                FragmentActivity fragmentActivity = dialog.f50959OooO0oO;
                if (typeUser == value) {
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
                    if (pair != null) {
                        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                        PremiumLevel premiumLevelOf = PremiumLevel.INSTANCE.of((Integer) pair.getSecond());
                        if (!zBooleanValue || premiumLevelOf.getValue() <= 0) {
                            o000O o000o = new o000O(fragmentActivity);
                            o000o.OooOo00(o0000.OooO0OO(o000000.Nobility_commodity));
                            o000o.OooOOOO(o000000.Get_Yalla_Premium);
                            o000o.OooOo0(new oo000o(dialog, premiumLevelOf));
                            o000o.OooOo(true);
                            o000o.OooOO0o();
                        } else {
                            localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0O0().getValue())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                                o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0Oo().getValue())) {
                                    i = 1;
                                }
                            }
                            o0o001 = o0O000.f47005OooO00o;
                            if (z) {
                                LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO0OO.OooO0O0(o0O0o.Coin_NotEnough, null, 2, null, o0o001);
                            } else if (i != 0) {
                                LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO0OO.OooO0O0(o0O0o.Crystal_NotEnough, null, 2, null, o0o001);
                            } else {
                                o0O00oO0 o0o00oo4 = o0O00oO0.f47936OooO00o;
                                l = (Long) o0O00oO0.OooOOo0().getValue();
                                long jLongValue = dialog.f50966OooOOOO.getUserId().getValue().longValue();
                                if (l == null && l.longValue() == jLongValue) {
                                    o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
                                } else {
                                    o00oo00o.invoke(giftPropModel2);
                                }
                            }
                        }
                    } else {
                        localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                            o0O00oO0 o0o00oo5 = o0O00oO0.f47936OooO00o;
                            if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0O0().getValue())) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                            o0O00oO0 o0o00oo6 = o0O00oO0.f47936OooO00o;
                            if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0Oo().getValue())) {
                                i = 1;
                            }
                        }
                        o0o001 = o0O000.f47005OooO00o;
                        if (z) {
                            LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                            OooO0OO.OooO0O0(o0O0o.Coin_NotEnough, null, 2, null, o0o001);
                        } else if (i != 0) {
                            LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                            OooO0OO.OooO0O0(o0O0o.Crystal_NotEnough, null, 2, null, o0o001);
                        } else {
                            o0O00oO0 o0o00oo7 = o0O00oO0.f47936OooO00o;
                            l = (Long) o0O00oO0.OooOOo0().getValue();
                            long jLongValue2 = dialog.f50966OooOOOO.getUserId().getValue().longValue();
                            if (l == null) {
                                o00oo00o.invoke(giftPropModel2);
                            } else {
                                o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
                            }
                        }
                    }
                } else if (typeUser == GiftPropTypeUser.Wealth.getValue()) {
                    if (WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null)) {
                        o0O00oO0 o0o00oo8 = o0O00oO0.f47936OooO00o;
                        if (o0OoOo0.OooO0o0(0, (Integer) o0O00oO0.OooO0oO().getValue()) < giftPropModel2.getSendLvLimit()) {
                            String sendLvLimit = o0OoOo0.OooOO0o(Integer.valueOf(giftPropModel2.getSendLvLimit()), "");
                            Intrinsics.checkNotNullParameter(sendLvLimit, "sendLvLimit");
                            oo0o0Oo.OooO00o(fragmentActivity, new o5(sendLvLimit, o0ooOOo.f51064OooO0Oo));
                        } else {
                            localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                                o0O00oO0 o0o00oo9 = o0O00oO0.f47936OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0O0().getValue())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                                o0O00oO0 o0o00oo10 = o0O00oO0.f47936OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0Oo().getValue())) {
                                    i = 1;
                                }
                            }
                            o0o001 = o0O000.f47005OooO00o;
                            if (z) {
                                LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO0OO.OooO0O0(o0O0o.Coin_NotEnough, null, 2, null, o0o001);
                            } else if (i != 0) {
                                LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO0OO.OooO0O0(o0O0o.Crystal_NotEnough, null, 2, null, o0o001);
                            } else {
                                o0O00oO0 o0o00oo11 = o0O00oO0.f47936OooO00o;
                                l = (Long) o0O00oO0.OooOOo0().getValue();
                                long jLongValue3 = dialog.f50966OooOOOO.getUserId().getValue().longValue();
                                if (l == null) {
                                    o00oo00o.invoke(giftPropModel2);
                                } else {
                                    o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
                                }
                            }
                        }
                    } else {
                        oo0o0Oo.OooO00o(fragmentActivity, new m5(new o00oO0o(dialog)));
                    }
                } else if (typeUser == GiftPropTypeUser.Vip.getValue()) {
                    o0O00oO0 o0o00oo12 = o0O00oO0.f47936OooO00o;
                    Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
                    if (pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.VipFrozen.getValue()) {
                        o000O o000o2 = new o000O(fragmentActivity);
                        o000o2.OooOo00(o0000.OooO0OO(o000000.Vip_commodity_freeze));
                        o000o2.OooOOOO(o000000.unfreeze_vip);
                        o000o2.OooOo0(o0OOO0o.f51061OooO0Oo);
                        o000o2.OooOo(true);
                        o000o2.OooOO0o();
                    } else {
                        Pair pair3 = (Pair) o0O00oO0.OooOO0().getValue();
                        if (o0OoOo0.OooO0o0(0, pair3 != null ? (Integer) pair3.getSecond() : null) <= 0) {
                            o000O o000o3 = new o000O(fragmentActivity);
                            o000o3.OooOo00(o0000.OooO0OO(o000000.Vip_KA_commodity));
                            o000o3.OooOOOO(o000000.Get_Vip);
                            o000o3.OooOo0(o0Oo0oo.f51062OooO0Oo);
                            o000o3.OooOo(true);
                            o000o3.OooOO0o();
                        } else {
                            localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                                o0O00oO0 o0o00oo13 = o0O00oO0.f47936OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0O0().getValue())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                                o0O00oO0 o0o00oo14 = o0O00oO0.f47936OooO00o;
                                if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0Oo().getValue())) {
                                    i = 1;
                                }
                            }
                            o0o001 = o0O000.f47005OooO00o;
                            if (z) {
                                LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO0OO.OooO0O0(o0O0o.Coin_NotEnough, null, 2, null, o0o001);
                            } else if (i != 0) {
                                LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                                OooO0OO.OooO0O0(o0O0o.Crystal_NotEnough, null, 2, null, o0o001);
                            } else {
                                o0O00oO0 o0o00oo15 = o0O00oO0.f47936OooO00o;
                                l = (Long) o0O00oO0.OooOOo0().getValue();
                                long jLongValue4 = dialog.f50966OooOOOO.getUserId().getValue().longValue();
                                if (l == null) {
                                    o00oo00o.invoke(giftPropModel2);
                                } else {
                                    o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
                                }
                            }
                        }
                    }
                } else if (typeUser == GiftPropTypeUser.Flags.getValue()) {
                    localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                        o0O00oO0 o0o00oo16 = o0O00oO0.f47936OooO00o;
                        if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0O0().getValue())) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                        o0O00oO0 o0o00oo17 = o0O00oO0.f47936OooO00o;
                        if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0Oo().getValue())) {
                            i = 1;
                        }
                    }
                    o0o001 = o0O000.f47005OooO00o;
                    if (z) {
                        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                        OooO0OO.OooO0O0(o0O0o.Coin_NotEnough, null, 2, null, o0o001);
                    } else if (i != 0) {
                        LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                        OooO0OO.OooO0O0(o0O0o.Crystal_NotEnough, null, 2, null, o0o001);
                    } else {
                        o0O00oO0 o0o00oo18 = o0O00oO0.f47936OooO00o;
                        l = (Long) o0O00oO0.OooOOo0().getValue();
                        long jLongValue5 = dialog.f50966OooOOOO.getUserId().getValue().longValue();
                        if (l == null) {
                            o00oo00o.invoke(giftPropModel2);
                        } else {
                            o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
                        }
                    }
                } else if (typeUser == GiftPropTypeUser.Member.getValue()) {
                    OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
                    if (oooO00o.OooO00o().OooOOO()) {
                        o0O00oO0 o0o00oo19 = o0O00oO0.f47936OooO00o;
                        Long l3 = (Long) o0O00oO0.OooOOo0().getValue();
                        long jLongValue6 = dialog.f50966OooOOOO.getUserId().getValue().longValue();
                        if (l3 != null && l3.longValue() == jLongValue6) {
                            o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
                        } else {
                            o00oo00o.invoke(giftPropModel2);
                        }
                    } else if (!oooO00o.OooO00o().OooOO0O()) {
                        LiveEventBus.get("JoinRoomDialogFromGiftSendDialogLink").post(Boolean.FALSE);
                        o000O00.OooO0O0(o0000.OooO0OO(o000000.room_member_join_tips));
                        com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48544OooOoOO.setValue(Boolean.TRUE);
                    } else if (com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.OooO0Oo() < giftPropModel2.getSendLvLimit()) {
                        o000O o000o4 = new o000O(fragmentActivity);
                        o000o4.OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000000.room_member_min_level_XXX_tips), o0OoOo0.OooOO0o(Integer.valueOf(giftPropModel2.getSendLvLimit()), "")));
                        o000o4.OooOOOO(o000000.room_member_level_update);
                        o000o4.OooOo0(o0OO00O.f51060OooO0Oo);
                        o000o4.OooOo0o(o0000.OooO0OO(o000000.OK));
                        o000o4.OooOO0o();
                    } else {
                        localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                            o0O00oO0 o0o00oo110 = o0O00oO0.f47936OooO00o;
                            if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0O0().getValue())) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                            o0O00oO0 o0o00oo111 = o0O00oO0.f47936OooO00o;
                            if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0Oo().getValue())) {
                                i = 1;
                            }
                        }
                        o0o001 = o0O000.f47005OooO00o;
                        if (z) {
                            LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                            OooO0OO.OooO0O0(o0O0o.Coin_NotEnough, null, 2, null, o0o001);
                        } else if (i != 0) {
                            LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                            OooO0OO.OooO0O0(o0O0o.Crystal_NotEnough, null, 2, null, o0o001);
                        } else {
                            o0O00oO0 o0o00oo112 = o0O00oO0.f47936OooO00o;
                            l = (Long) o0O00oO0.OooOOo0().getValue();
                            long jLongValue7 = dialog.f50966OooOOOO.getUserId().getValue().longValue();
                            if (l == null) {
                                o00oo00o.invoke(giftPropModel2);
                            } else {
                                o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
                            }
                        }
                    }
                } else if (typeUser != GiftPropTypeUser.Backpack.getValue()) {
                    localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                        o0O00oO0 o0o00oo113 = o0O00oO0.f47936OooO00o;
                        if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0O0().getValue())) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                        o0O00oO0 o0o00oo114 = o0O00oO0.f47936OooO00o;
                        if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0Oo().getValue())) {
                            i = 1;
                        }
                    }
                    o0o001 = o0O000.f47005OooO00o;
                    if (z) {
                        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                        OooO0OO.OooO0O0(o0O0o.Coin_NotEnough, null, 2, null, o0o001);
                    } else if (i != 0) {
                        LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                        OooO0OO.OooO0O0(o0O0o.Crystal_NotEnough, null, 2, null, o0o001);
                    } else {
                        o0O00oO0 o0o00oo115 = o0O00oO0.f47936OooO00o;
                        l = (Long) o0O00oO0.OooOOo0().getValue();
                        long jLongValue8 = dialog.f50966OooOOOO.getUserId().getValue().longValue();
                        if (l == null) {
                            o00oo00o.invoke(giftPropModel2);
                        } else {
                            o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
                        }
                    }
                } else if (Intrinsics.areEqual(dialog.f50966OooOOOO, Oooo000.f50938OooO0oO)) {
                    for (oo00 oo00Var : com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O) {
                        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(oo00Var.f55307OooO0OO.getValue());
                        if (roomUserInfoModelOooO0o0 != null) {
                            long jLongValue9 = roomUserInfoModelOooO0o0.getUserId().getValue().longValue();
                            o0O00oO0 o0o00oo20 = o0O00oO0.f47936OooO00o;
                            Long l4 = (Long) o0O00oO0.OooOOo0().getValue();
                            if (l4 == null || jLongValue9 != l4.longValue()) {
                                i++;
                            }
                        }
                    }
                    if (i <= 0) {
                        o000O00.OooO0O0(o0000.OooO0OO(o000000.room_dialog_no_other_people_in_mic));
                    } else if (dialog.f50967OooOOOo * i > giftPropModel2.getGiftBackpackPropNum()) {
                        o000O00.OooO0O0(o0000.OooO0OO(o000000.You_do_not_have_enough_gifts));
                    } else {
                        o0O00oO0 o0o00oo21 = o0O00oO0.f47936OooO00o;
                        l2 = (Long) o0O00oO0.OooOOo0().getValue();
                        long jLongValue10 = dialog.f50966OooOOOO.getUserId().getValue().longValue();
                        if (l2 == null && l2.longValue() == jLongValue10) {
                            o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
                        } else {
                            o00oo00o.invoke(giftPropModel2);
                        }
                    }
                } else if (dialog.f50967OooOOOo > giftPropModel2.getGiftBackpackPropNum()) {
                    o000O00.OooO0O0(o0000.OooO0OO(o000000.You_do_not_have_enough_gifts));
                } else {
                    o0O00oO0 o0o00oo22 = o0O00oO0.f47936OooO00o;
                    l2 = (Long) o0O00oO0.OooOOo0().getValue();
                    long jLongValue11 = dialog.f50966OooOOOO.getUserId().getValue().longValue();
                    if (l2 == null) {
                        o00oo00o.invoke(giftPropModel2);
                    } else {
                        o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
                    }
                }
            } else {
                localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                    o0O00oO0 o0o00oo116 = o0O00oO0.f47936OooO00o;
                    if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0O0().getValue())) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                    o0O00oO0 o0o00oo117 = o0O00oO0.f47936OooO00o;
                    if (localCount > o0OoOo0.OooOO0((Long) o0O00oO0.OooO0Oo().getValue())) {
                        i = 1;
                    }
                }
                o0o001 = o0O000.f47005OooO00o;
                if (z) {
                    LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                    OooO0OO.OooO0O0(o0O0o.Coin_NotEnough, null, 2, null, o0o001);
                } else if (i != 0) {
                    LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                    OooO0OO.OooO0O0(o0O0o.Crystal_NotEnough, null, 2, null, o0o001);
                } else {
                    o0O00oO0 o0o00oo118 = o0O00oO0.f47936OooO00o;
                    l = (Long) o0O00oO0.OooOOo0().getValue();
                    long jLongValue12 = dialog.f50966OooOOOO.getUserId().getValue().longValue();
                    if (l == null) {
                        o00oo00o.invoke(giftPropModel2);
                    } else {
                        o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
                    }
                }
            }
        }
        if (giftPropModel.isCustomMade()) {
            oO0Oo0oo oo0oo0ooOooO0Oo = o00Ooo.OooO0Oo();
            oo0oo0ooOooO0Oo.getClass();
            oo0oo0ooOooO0Oo.OooO0o("neverShowCustomMadeGiftWarn" + o0O00oO0.OooOOo0().getValue(), true);
            ConstraintLayout customGiftWarnContainer = dialog.OooOOo0().f44504OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(customGiftWarnContainer, "customGiftWarnContainer");
            com.code.android.util.o000O.OooO0O0(customGiftWarnContainer);
        }
        return Unit.INSTANCE;
    }
}
