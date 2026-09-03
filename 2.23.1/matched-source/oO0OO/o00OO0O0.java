package oO0OO;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.WealthLevel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypePay;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p416o0Oo0oO.oO0Oo0oo;
import p437o0OoOOOo.o0O00000;
import p437o0OoOOOo.o0OoOoOo;
import p474o0OoooOO.oo0oO0;
import p541o0o0Oo0o.o0OO0;
import p593o0oOoooO.h0;
import p675oO0Oo.i7;
import p675oO0Oo.k7;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f58963OooO0Oo;

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
        this.f58963OooO0Oo = o00000oo2;
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
        o0OoOoOo o0oooooo;
        Long l;
        Long l2;
        o00000OO dialog = this.f58963OooO0Oo;
        GiftPropModel giftPropModel = dialog.f58879OooOOo;
        if (giftPropModel == null) {
            return null;
        }
        giftPropModel.setLocalCount(dialog.f58878OooOOOo);
        int i = 0;
        if (OooO00o.$EnumSwitchMapping$0[dialog.f58869OooO.ordinal()] == 1) {
            h0.OooO0OO("102021", p190o00o0O.OooOO0.OooO00o(new Pair("Giftid", Integer.valueOf(giftPropModel.getGiftId()))));
        }
        o00OO00O o00oo00o = new o00OO00O(dialog);
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        GiftPropModel giftPropModel2 = dialog.f58879OooOOo;
        if (giftPropModel2 != null) {
            int typeUser = giftPropModel2.getTypeUser();
            if (typeUser != GiftPropTypeUser.Hot.getValue()) {
                int value = GiftPropTypeUser.Premium.getValue();
                FragmentActivity fragmentActivity = dialog.f58870OooO0oO;
                if (typeUser == value) {
                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                    Pair pair = (Pair) oo0oO0.OooOO0o().getValue();
                    if (pair != null) {
                        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                        PremiumLevel premiumLevelOf = PremiumLevel.INSTANCE.of((Integer) pair.getSecond());
                        if (!zBooleanValue || premiumLevelOf.getValue() <= 0) {
                            p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(fragmentActivity);
                            o000o.OooOo00(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Nobility_commodity));
                            o000o.OooOOOO(p565o0oOo000.o000OOo.Get_Yalla_Premium);
                            o000o.OooOo0(new oo000o(dialog, premiumLevelOf));
                            o000o.OooOo(true);
                            o000o.OooOO0o();
                        } else {
                            localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                                oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                                if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0O0().getValue())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                                oo0oO0 oo0oo2 = oo0oO0.f47967OooO00o;
                                if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0Oo().getValue())) {
                                    i = 1;
                                }
                            }
                            o0oooooo = o0OoOoOo.f47016OooO00o;
                            if (z) {
                                LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                                kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_NotEnough, null, 2, null, o0oooooo);
                            } else if (i != 0) {
                                LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                                kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Crystal_NotEnough, null, 2, null, o0oooooo);
                            } else {
                                oo0oO0 oo0oo3 = oo0oO0.f47967OooO00o;
                                l = (Long) oo0oO0.OooOOo0().getValue();
                                long jLongValue = dialog.f58877OooOOOO.getUserId().getValue().longValue();
                                if (l == null && l.longValue() == jLongValue) {
                                    com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_cannot_send_to_yourself));
                                } else {
                                    o00oo00o.invoke(giftPropModel2);
                                }
                            }
                        }
                    } else {
                        localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                            oo0oO0 oo0oo4 = oo0oO0.f47967OooO00o;
                            if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0O0().getValue())) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                            oo0oO0 oo0oo5 = oo0oO0.f47967OooO00o;
                            if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0Oo().getValue())) {
                                i = 1;
                            }
                        }
                        o0oooooo = o0OoOoOo.f47016OooO00o;
                        if (z) {
                            LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                            kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_NotEnough, null, 2, null, o0oooooo);
                        } else if (i != 0) {
                            LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                            kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Crystal_NotEnough, null, 2, null, o0oooooo);
                        } else {
                            oo0oO0 oo0oo6 = oo0oO0.f47967OooO00o;
                            l = (Long) oo0oO0.OooOOo0().getValue();
                            long jLongValue2 = dialog.f58877OooOOOO.getUserId().getValue().longValue();
                            if (l == null) {
                                o00oo00o.invoke(giftPropModel2);
                            } else {
                                com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_cannot_send_to_yourself));
                            }
                        }
                    }
                } else if (typeUser == GiftPropTypeUser.Wealth.getValue()) {
                    if (WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null)) {
                        oo0oO0 oo0oo7 = oo0oO0.f47967OooO00o;
                        if (com.code.android.util.o0OoOo0.OooO0o0(0, (Integer) oo0oO0.OooO0oO().getValue()) < giftPropModel2.getSendLvLimit()) {
                            String sendLvLimit = com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(giftPropModel2.getSendLvLimit()), "");
                            Intrinsics.checkNotNullParameter(sendLvLimit, "sendLvLimit");
                            p425o0OoO0OO.oo0o0Oo.OooO00o(fragmentActivity, new k7(sendLvLimit, o0ooOOo.f58975OooO0Oo));
                        } else {
                            localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                                oo0oO0 oo0oo8 = oo0oO0.f47967OooO00o;
                                if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0O0().getValue())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                                oo0oO0 oo0oo9 = oo0oO0.f47967OooO00o;
                                if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0Oo().getValue())) {
                                    i = 1;
                                }
                            }
                            o0oooooo = o0OoOoOo.f47016OooO00o;
                            if (z) {
                                LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                                kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_NotEnough, null, 2, null, o0oooooo);
                            } else if (i != 0) {
                                LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                                kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Crystal_NotEnough, null, 2, null, o0oooooo);
                            } else {
                                oo0oO0 oo0oo10 = oo0oO0.f47967OooO00o;
                                l = (Long) oo0oO0.OooOOo0().getValue();
                                long jLongValue3 = dialog.f58877OooOOOO.getUserId().getValue().longValue();
                                if (l == null) {
                                    o00oo00o.invoke(giftPropModel2);
                                } else {
                                    com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_cannot_send_to_yourself));
                                }
                            }
                        }
                    } else {
                        p425o0OoO0OO.oo0o0Oo.OooO00o(fragmentActivity, new i7(new o00oO0o(dialog)));
                    }
                } else if (typeUser == GiftPropTypeUser.Vip.getValue()) {
                    oo0oO0 oo0oo11 = oo0oO0.f47967OooO00o;
                    Pair pair2 = (Pair) oo0oO0.OooOO0().getValue();
                    if (pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.VipFrozen.getValue()) {
                        p205o00o0o0o.o000O o000o2 = new p205o00o0o0o.o000O(fragmentActivity);
                        o000o2.OooOo00(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Vip_commodity_freeze));
                        o000o2.OooOOOO(p565o0oOo000.o000OOo.unfreeze_vip);
                        o000o2.OooOo0(o0OOO0o.f58972OooO0Oo);
                        o000o2.OooOo(true);
                        o000o2.OooOO0o();
                    } else {
                        Pair pair3 = (Pair) oo0oO0.OooOO0().getValue();
                        if (com.code.android.util.o0OoOo0.OooO0o0(0, pair3 != null ? (Integer) pair3.getSecond() : null) <= 0) {
                            p205o00o0o0o.o000O o000o3 = new p205o00o0o0o.o000O(fragmentActivity);
                            o000o3.OooOo00(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.Vip_KA_commodity));
                            o000o3.OooOOOO(p565o0oOo000.o000OOo.Get_Vip);
                            o000o3.OooOo0(o0Oo0oo.f58973OooO0Oo);
                            o000o3.OooOo(true);
                            o000o3.OooOO0o();
                        } else {
                            localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                                oo0oO0 oo0oo12 = oo0oO0.f47967OooO00o;
                                if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0O0().getValue())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                                oo0oO0 oo0oo13 = oo0oO0.f47967OooO00o;
                                if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0Oo().getValue())) {
                                    i = 1;
                                }
                            }
                            o0oooooo = o0OoOoOo.f47016OooO00o;
                            if (z) {
                                LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                                kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_NotEnough, null, 2, null, o0oooooo);
                            } else if (i != 0) {
                                LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                                kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Crystal_NotEnough, null, 2, null, o0oooooo);
                            } else {
                                oo0oO0 oo0oo14 = oo0oO0.f47967OooO00o;
                                l = (Long) oo0oO0.OooOOo0().getValue();
                                long jLongValue4 = dialog.f58877OooOOOO.getUserId().getValue().longValue();
                                if (l == null) {
                                    o00oo00o.invoke(giftPropModel2);
                                } else {
                                    com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_cannot_send_to_yourself));
                                }
                            }
                        }
                    }
                } else if (typeUser == GiftPropTypeUser.Flags.getValue()) {
                    localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                        oo0oO0 oo0oo15 = oo0oO0.f47967OooO00o;
                        if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0O0().getValue())) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                        oo0oO0 oo0oo16 = oo0oO0.f47967OooO00o;
                        if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0Oo().getValue())) {
                            i = 1;
                        }
                    }
                    o0oooooo = o0OoOoOo.f47016OooO00o;
                    if (z) {
                        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                        kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_NotEnough, null, 2, null, o0oooooo);
                    } else if (i != 0) {
                        LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                        kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Crystal_NotEnough, null, 2, null, o0oooooo);
                    } else {
                        oo0oO0 oo0oo17 = oo0oO0.f47967OooO00o;
                        l = (Long) oo0oO0.OooOOo0().getValue();
                        long jLongValue5 = dialog.f58877OooOOOO.getUserId().getValue().longValue();
                        if (l == null) {
                            o00oo00o.invoke(giftPropModel2);
                        } else {
                            com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_cannot_send_to_yourself));
                        }
                    }
                } else if (typeUser == GiftPropTypeUser.Member.getValue()) {
                    com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO;
                    if (oooO00o.OooO00o().OooOOO()) {
                        oo0oO0 oo0oo18 = oo0oO0.f47967OooO00o;
                        Long l3 = (Long) oo0oO0.OooOOo0().getValue();
                        long jLongValue6 = dialog.f58877OooOOOO.getUserId().getValue().longValue();
                        if (l3 != null && l3.longValue() == jLongValue6) {
                            com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_cannot_send_to_yourself));
                        } else {
                            o00oo00o.invoke(giftPropModel2);
                        }
                    } else if (!oooO00o.OooO00o().OooOO0O()) {
                        LiveEventBus.get("JoinRoomDialogFromGiftSendDialogLink").post(Boolean.FALSE);
                        com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_member_join_tips));
                        com.yalla.yalla.service.room.OooO00o.f24532OooOOOO.f48492OooOoOO.setValue(Boolean.TRUE);
                    } else if (com.yalla.yalla.service.room.OooO00o.f24532OooOOOO.OooO0Oo() < giftPropModel2.getSendLvLimit()) {
                        p205o00o0o0o.o000O o000o4 = new p205o00o0o0o.o000O(fragmentActivity);
                        o000o4.OooOo00(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_member_min_level_XXX_tips), com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(giftPropModel2.getSendLvLimit()), "")));
                        o000o4.OooOOOO(p565o0oOo000.o000OOo.room_member_level_update);
                        o000o4.OooOo0(o0OO00O.f58971OooO0Oo);
                        o000o4.OooOo0o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.OK));
                        o000o4.OooOO0o();
                    } else {
                        localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                            oo0oO0 oo0oo19 = oo0oO0.f47967OooO00o;
                            if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0O0().getValue())) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                            oo0oO0 oo0oo110 = oo0oO0.f47967OooO00o;
                            if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0Oo().getValue())) {
                                i = 1;
                            }
                        }
                        o0oooooo = o0OoOoOo.f47016OooO00o;
                        if (z) {
                            LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                            kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_NotEnough, null, 2, null, o0oooooo);
                        } else if (i != 0) {
                            LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                            kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Crystal_NotEnough, null, 2, null, o0oooooo);
                        } else {
                            oo0oO0 oo0oo111 = oo0oO0.f47967OooO00o;
                            l = (Long) oo0oO0.OooOOo0().getValue();
                            long jLongValue7 = dialog.f58877OooOOOO.getUserId().getValue().longValue();
                            if (l == null) {
                                o00oo00o.invoke(giftPropModel2);
                            } else {
                                com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_cannot_send_to_yourself));
                            }
                        }
                    }
                } else if (typeUser != GiftPropTypeUser.Backpack.getValue()) {
                    localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                        oo0oO0 oo0oo112 = oo0oO0.f47967OooO00o;
                        if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0O0().getValue())) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                        oo0oO0 oo0oo113 = oo0oO0.f47967OooO00o;
                        if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0Oo().getValue())) {
                            i = 1;
                        }
                    }
                    o0oooooo = o0OoOoOo.f47016OooO00o;
                    if (z) {
                        LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                        kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_NotEnough, null, 2, null, o0oooooo);
                    } else if (i != 0) {
                        LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                        kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Crystal_NotEnough, null, 2, null, o0oooooo);
                    } else {
                        oo0oO0 oo0oo114 = oo0oO0.f47967OooO00o;
                        l = (Long) oo0oO0.OooOOo0().getValue();
                        long jLongValue8 = dialog.f58877OooOOOO.getUserId().getValue().longValue();
                        if (l == null) {
                            o00oo00o.invoke(giftPropModel2);
                        } else {
                            com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_cannot_send_to_yourself));
                        }
                    }
                } else if (Intrinsics.areEqual(dialog.f58877OooOOOO, Oooo000.f58850OooO0oO)) {
                    for (o0OO0 o0oo1 : com.yalla.yalla.service.room.OooO00o.f24525OooO0oO.f48536OooOO0O) {
                        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
                        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(o0oo1.f54750OooO0OO.getValue());
                        if (roomUserInfoModelOooO0o0 != null) {
                            long jLongValue9 = roomUserInfoModelOooO0o0.getUserId().getValue().longValue();
                            oo0oO0 oo0oo20 = oo0oO0.f47967OooO00o;
                            Long l4 = (Long) oo0oO0.OooOOo0().getValue();
                            if (l4 == null || jLongValue9 != l4.longValue()) {
                                i++;
                            }
                        }
                    }
                    if (i <= 0) {
                        com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.room_dialog_no_other_people_in_mic));
                    } else if (dialog.f58878OooOOOo * i > giftPropModel2.getGiftBackpackPropNum()) {
                        com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.You_do_not_have_enough_gifts));
                    } else {
                        oo0oO0 oo0oo21 = oo0oO0.f47967OooO00o;
                        l2 = (Long) oo0oO0.OooOOo0().getValue();
                        long jLongValue10 = dialog.f58877OooOOOO.getUserId().getValue().longValue();
                        if (l2 == null && l2.longValue() == jLongValue10) {
                            com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_cannot_send_to_yourself));
                        } else {
                            o00oo00o.invoke(giftPropModel2);
                        }
                    }
                } else if (dialog.f58878OooOOOo > giftPropModel2.getGiftBackpackPropNum()) {
                    com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.You_do_not_have_enough_gifts));
                } else {
                    oo0oO0 oo0oo22 = oo0oO0.f47967OooO00o;
                    l2 = (Long) oo0oO0.OooOOo0().getValue();
                    long jLongValue11 = dialog.f58877OooOOOO.getUserId().getValue().longValue();
                    if (l2 == null) {
                        o00oo00o.invoke(giftPropModel2);
                    } else {
                        com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_cannot_send_to_yourself));
                    }
                }
            } else {
                localCount = ((long) giftPropModel2.getLocalCount()) * ((long) giftPropModel2.getPrice());
                if (giftPropModel2.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                    oo0oO0 oo0oo115 = oo0oO0.f47967OooO00o;
                    if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0O0().getValue())) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (giftPropModel2.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                    oo0oO0 oo0oo116 = oo0oO0.f47967OooO00o;
                    if (localCount > com.code.android.util.o0OoOo0.OooOO0((Long) oo0oO0.OooO0Oo().getValue())) {
                        i = 1;
                    }
                }
                o0oooooo = o0OoOoOo.f47016OooO00o;
                if (z) {
                    LiveEventBus.get("QuickRechargeDialogFromGiftSendDialog").post(Boolean.FALSE);
                    kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Coin_NotEnough, null, 2, null, o0oooooo);
                } else if (i != 0) {
                    LiveEventBus.get("ReceiveCrystalDialogFromGiftSendDialog").post(Boolean.FALSE);
                    kotlin.collections.unsigned.OooO0O0.OooO0O0(o0O00000.Crystal_NotEnough, null, 2, null, o0oooooo);
                } else {
                    oo0oO0 oo0oo117 = oo0oO0.f47967OooO00o;
                    l = (Long) oo0oO0.OooOOo0().getValue();
                    long jLongValue12 = dialog.f58877OooOOOO.getUserId().getValue().longValue();
                    if (l == null) {
                        o00oo00o.invoke(giftPropModel2);
                    } else {
                        com.code.android.util.o000O00.OooO0O0(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.gift_cannot_send_to_yourself));
                    }
                }
            }
        }
        if (giftPropModel.isCustomMade()) {
            oO0Oo0oo oo0oo0ooOooO0Oo = p417o0Oo0oO0.o00Oo0.OooO0Oo();
            oo0oo0ooOooO0Oo.getClass();
            oo0oo0ooOooO0Oo.OooO0o("neverShowCustomMadeGiftWarn" + oo0oO0.OooOOo0().getValue(), true);
            ConstraintLayout customGiftWarnContainer = dialog.OooOOo0().f44494OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(customGiftWarnContainer, "customGiftWarnContainer");
            com.code.android.util.o000O.OooO0O0(customGiftWarnContainer);
        }
        return Unit.INSTANCE;
    }
}
