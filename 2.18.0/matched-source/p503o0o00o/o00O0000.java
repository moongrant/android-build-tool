package p503o0o00o;

import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.DialogLinkFrom;
import com.yalla.yalla.model.DialogLinkItem;
import com.yalla.yalla.model.DialogLinkManage;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropTypePay;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.GiftPropTypeUser;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p021OooOooo.o000oOoO;
import p190o00o00oO.oo0o0Oo;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p256o00ooO0o.oo0oOO0;
import p500o0o00Oo0.OooOOO;
import p524o0o0O0o.oOO00O;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000O000 f41511Oooo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeShow.values().length];
            iArr[GiftPropTypeShow.InRoom.ordinal()] = 1;
            iArr[GiftPropTypeShow.InChat.ordinal()] = 2;
            iArr[GiftPropTypeShow.InMomentList.ordinal()] = 3;
            iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(o000O000 o000o001) {
        super(0);
        this.f41511Oooo = o000o001;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0211  */
    /* JADX WARN: Code duplicated, block: B:70:0x0229  */
    /* JADX WARN: Code duplicated, block: B:73:0x023f  */
    /* JADX WARN: Code duplicated, block: B:76:0x024c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0262  */
    /* JADX WARN: Code duplicated, block: B:82:0x0266  */
    /* JADX WARN: Code duplicated, block: B:83:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0283  */
    /* JADX WARN: Code duplicated, block: B:85:0x029e  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z;
        boolean z2;
        o000O000 o000o001 = this.f41511Oooo;
        GiftPropModel giftPropModel = o000o001.f41469OooOo0O;
        if (giftPropModel != null) {
            giftPropModel.setLocalCount(o000o001.f41468OooOo00);
        }
        o000O000 o000o002 = this.f41511Oooo;
        GiftPropModel giftPropModel2 = o000o002.f41469OooOo0O;
        boolean z3 = false;
        if (giftPropModel2 != null && OooO00o.$EnumSwitchMapping$0[o000o002.f41453OooO.ordinal()] == 1) {
            OooOo.OooO0OO("102021", o000oOoO.OooO00o(new Pair("Giftid", Integer.valueOf(giftPropModel2.getGiftId()))));
        }
        o000O000 o000o003 = this.f41511Oooo;
        FragmentActivity activity = o000o003.f41454OooO0oO;
        GiftPropModel giftPropModel3 = o000o003.f41469OooOo0O;
        o00 o00Var = new o00(o000o003);
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (giftPropModel3 == null) {
            o00Var.invoke(giftPropModel3);
        } else {
            int typeUser = giftPropModel3.getTypeUser();
            if (typeUser == GiftPropTypeUser.Hot.getValue()) {
                long localCount = ((long) giftPropModel3.getLocalCount()) * ((long) giftPropModel3.getPrice());
                if (giftPropModel3.getTypePay() == GiftPropTypePay.Coin.getValue() || localCount <= oOO00O.OooO0o(OooOOO.f41235OooO00o.OooO0OO().getValue())) {
                    z = false;
                } else {
                    z = true;
                }
                if (giftPropModel3.getTypePay() == GiftPropTypePay.Crystal.getValue() || localCount <= oOO00O.OooO0o(OooOOO.f41235OooO00o.OooO0o().getValue())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z) {
                    DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getQuickRechargeDialogFromGiftSendDialog(), DialogLinkFrom.QuickRechargeDialogFromGiftSendDialog, false, false, 4, null);
                    oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                    o00Var.invoke(null);
                } else if (z2) {
                    DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getReceiveCrystalDialogFromGiftSendDialog(), DialogLinkFrom.ReceiveCrystalDialogFromGiftSendDialog, false, false, 4, null);
                    oo0o0Oo.OooO0O0(CommonError.Crystal_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                    o00Var.invoke(null);
                } else {
                    o00Var.invoke(giftPropModel3);
                }
            } else if (typeUser == GiftPropTypeUser.Premium.getValue()) {
                Pair<Boolean, Integer> value = OooOOO.f41235OooO00o.OooOOO0().getValue();
                if (value != null) {
                    boolean zBooleanValue = value.getFirst().booleanValue();
                    PremiumLevel premiumLevelOooO00o = PremiumLevel.INSTANCE.OooO00o(value.getSecond());
                    if (!zBooleanValue || premiumLevelOooO00o.getValue() <= 0) {
                        oo0oOO0 oo0ooo0 = new oo0oOO0(activity);
                        oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.Nobility_commodity));
                        oo0ooo0.OooOOOo(R.string.Get_Yalla_Premium);
                        oo0ooo0.OooOo0o(new o00OO0OO(premiumLevelOooO00o));
                        oo0ooo0.OooOoOO(true);
                        oo0ooo0.OooOOO0();
                        o00Var.invoke(null);
                    } else {
                        long localCount2 = ((long) giftPropModel3.getLocalCount()) * ((long) giftPropModel3.getPrice());
                        if (giftPropModel3.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (giftPropModel3.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z) {
                            DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getQuickRechargeDialogFromGiftSendDialog(), DialogLinkFrom.QuickRechargeDialogFromGiftSendDialog, false, false, 4, null);
                            oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                            o00Var.invoke(null);
                        } else if (z2) {
                            DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getReceiveCrystalDialogFromGiftSendDialog(), DialogLinkFrom.ReceiveCrystalDialogFromGiftSendDialog, false, false, 4, null);
                            oo0o0Oo.OooO0O0(CommonError.Crystal_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                            o00Var.invoke(null);
                        } else {
                            o00Var.invoke(giftPropModel3);
                        }
                    }
                } else {
                    long localCount3 = ((long) giftPropModel3.getLocalCount()) * ((long) giftPropModel3.getPrice());
                    if (giftPropModel3.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (giftPropModel3.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getQuickRechargeDialogFromGiftSendDialog(), DialogLinkFrom.QuickRechargeDialogFromGiftSendDialog, false, false, 4, null);
                        oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                        o00Var.invoke(null);
                    } else if (z2) {
                        DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getReceiveCrystalDialogFromGiftSendDialog(), DialogLinkFrom.ReceiveCrystalDialogFromGiftSendDialog, false, false, 4, null);
                        oo0o0Oo.OooO0O0(CommonError.Crystal_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                        o00Var.invoke(null);
                    } else {
                        o00Var.invoke(giftPropModel3);
                    }
                }
            } else if (typeUser == GiftPropTypeUser.Vip.getValue()) {
                OooOOO oooOOO = OooOOO.f41235OooO00o;
                Pair<Integer, Integer> value2 = oooOOO.OooO().getValue();
                if (value2 != null && value2.getFirst().intValue() == VipState.VipFrozen.getValue()) {
                    oo0oOO0 oo0ooo1 = new oo0oOO0(activity);
                    oo0ooo1.OooOo0O(o000O0O0.OooO0OO(R.string.Vip_commodity_freeze));
                    oo0ooo1.OooOOOo(R.string.unfreeze_vip);
                    oo0ooo1.OooOo0o(oo0O.f41552Oooo);
                    oo0ooo1.OooOoOO(true);
                    oo0ooo1.OooOOO0();
                    o00Var.invoke(null);
                } else {
                    Pair<Integer, Integer> value3 = oooOOO.OooO().getValue();
                    if (oOO00O.OooO0Oo(value3 != null ? value3.getSecond() : null, 0) <= 0) {
                        oo0oOO0 oo0ooo2 = new oo0oOO0(activity);
                        oo0ooo2.OooOo0O(o000O0O0.OooO0OO(R.string.Vip_KA_commodity));
                        oo0ooo2.OooOOOo(R.string.Get_Vip);
                        oo0ooo2.OooOo0o(o00OO.f41523Oooo);
                        oo0ooo2.OooOoOO(true);
                        oo0ooo2.OooOOO0();
                        o00Var.invoke(null);
                    } else {
                        long localCount4 = ((long) giftPropModel3.getLocalCount()) * ((long) giftPropModel3.getPrice());
                        if (giftPropModel3.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (giftPropModel3.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z) {
                            DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getQuickRechargeDialogFromGiftSendDialog(), DialogLinkFrom.QuickRechargeDialogFromGiftSendDialog, false, false, 4, null);
                            oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                            o00Var.invoke(null);
                        } else if (z2) {
                            DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getReceiveCrystalDialogFromGiftSendDialog(), DialogLinkFrom.ReceiveCrystalDialogFromGiftSendDialog, false, false, 4, null);
                            oo0o0Oo.OooO0O0(CommonError.Crystal_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                            o00Var.invoke(null);
                        } else {
                            o00Var.invoke(giftPropModel3);
                        }
                    }
                }
            } else if (typeUser == GiftPropTypeUser.National.getValue() || typeUser != GiftPropTypeUser.Member.getValue()) {
                long localCount5 = ((long) giftPropModel3.getLocalCount()) * ((long) giftPropModel3.getPrice());
                if (giftPropModel3.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                    z = false;
                } else {
                    z = false;
                }
                if (giftPropModel3.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z) {
                    DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getQuickRechargeDialogFromGiftSendDialog(), DialogLinkFrom.QuickRechargeDialogFromGiftSendDialog, false, false, 4, null);
                    oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                    o00Var.invoke(null);
                } else if (z2) {
                    DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getReceiveCrystalDialogFromGiftSendDialog(), DialogLinkFrom.ReceiveCrystalDialogFromGiftSendDialog, false, false, 4, null);
                    oo0o0Oo.OooO0O0(CommonError.Crystal_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                    o00Var.invoke(null);
                } else {
                    o00Var.invoke(giftPropModel3);
                }
            } else {
                o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
                if (oooO00o.OooO00o().OooOOo0()) {
                    o00Var.invoke(giftPropModel3);
                } else if (!oooO00o.OooO00o().OooOOO()) {
                    DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getJoinRoomDialogFromGiftSendDialogLink(), DialogLinkFrom.JoinRoomDialogFromGiftSendDialog, false, false, 4, null);
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.room_member_join_tips);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                    o00OO000.f43199OooOooO.setValue(Boolean.TRUE);
                    o00Var.invoke(null);
                } else if (o00OO000.f43171OooO00o.OooO0o0() < giftPropModel3.getSendLvLimit()) {
                    oo0oOO0 oo0ooo3 = new oo0oOO0(activity);
                    oo0ooo3.OooOo0O(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_member_min_level_XXX_tips), OooO.OooO0oo(Integer.valueOf(giftPropModel3.getSendLvLimit()), "")));
                    oo0ooo3.OooOOOo(R.string.room_member_level_update);
                    oo0ooo3.OooOo0o(o00OOO00.f41530Oooo);
                    oo0ooo3.OooOoO0(o000O0O0.OooO0OO(R.string.OK));
                    oo0ooo3.OooOOO0();
                } else {
                    long localCount6 = ((long) giftPropModel3.getLocalCount()) * ((long) giftPropModel3.getPrice());
                    if (giftPropModel3.getTypePay() == GiftPropTypePay.Coin.getValue()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (giftPropModel3.getTypePay() == GiftPropTypePay.Crystal.getValue()) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getQuickRechargeDialogFromGiftSendDialog(), DialogLinkFrom.QuickRechargeDialogFromGiftSendDialog, false, false, 4, null);
                        oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                        o00Var.invoke(null);
                    } else if (z2) {
                        DialogLinkItem.postPut$default(DialogLinkManage.INSTANCE.getReceiveCrystalDialogFromGiftSendDialog(), DialogLinkFrom.ReceiveCrystalDialogFromGiftSendDialog, false, false, 4, null);
                        oo0o0Oo.OooO0O0(CommonError.Crystal_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
                        o00Var.invoke(null);
                    } else {
                        o00Var.invoke(giftPropModel3);
                    }
                }
            }
        }
        GiftPropModel giftPropModel4 = this.f41511Oooo.f41469OooOo0O;
        if (giftPropModel4 != null && giftPropModel4.isCustomMade()) {
            z3 = true;
        }
        if (z3) {
            o000O000.OooOOOO(this.f41511Oooo);
        }
        return Unit.INSTANCE;
    }
}
