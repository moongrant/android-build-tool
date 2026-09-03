package p162o00OoOOo;

import OooO00o.OooO00o;
import android.os.Looper;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o00000O;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.protobuf.room.Room;
import com.app.base.view.dialog.giftDialog.GiftSendAllModel;
import com.app.base.view.dialog.giftDialog.GiftSendModel;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropTypePay;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import p074o000O0oo.OooOOO;
import p142o00OOooO.o000OO00;
import p146o00Oo000.OooO0O0;
import p159o00OoOO.o00;
import p159o00OoOO.o000O00O;
import p189o00o00oO.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o00oOoo;
import p254o00ooO0O.o0O0ooO;
import p391o0OOooOo.o0O00000;
import p497o0o00Oo.OooOOO0;
import p499o0o00OoO.o0OO00O;
import p501o0o00o.o000;
import p501o0o00o.o00000;
import p501o0o00o.o00OO00O;
import p515o0o0O00.o00O00;
import p530o0o0OOO.o00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MixedRoomActivity f32506OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000 f32507OooO0O0 = null;

    public o0OoOoOo(MixedRoomActivity mixedRoomActivity) {
        this.f32506OooO00o = mixedRoomActivity;
    }

    public final void OooO00o(GiftPropModel giftPropModel) {
        LiveEventBus.get("SendGiftSuccess").post(giftPropModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(RoomUserInfoModel user, int i, int i2) {
        MixedRoomActivity mixedRoomActivity;
        int i3 = 0;
        o00000O.OooO0O0().OooO0oo("FIRST_SEND_GIFT", false);
        o00O o00o2 = o00O.f43140OooO00o;
        ((MutableLiveData) o00O.f43188OoooOo0.getValue()).postValue(Boolean.FALSE);
        if (this.f32507OooO0O0 == null) {
            this.f32507OooO0O0 = new o000(this.f32506OooO00o, o00OO00O.f41507OooO00o, GiftPropTypeShow.InRoom);
        }
        o000 o000Var = this.f32507OooO0O0;
        o000Var.f41398OooOO0O = new Function0() { // from class: o00OoOOo.o0oOOo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                o0OoOoOo o0oooooo2 = this.f32508Oooo0o;
                o000 o000Var2 = o0oooooo2.f32507OooO0O0;
                RoomUserInfoModel roomUserInfoModel = o000Var2.f41406OooOOoo;
                GiftPropModel giftPropModel = o000Var2.f41410OooOo0O;
                int i4 = o000Var2.f41409OooOo00;
                if (giftPropModel == null) {
                    return null;
                }
                o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
                boolean z = true;
                if (oooOO1.OooO00o() - 1 <= 0) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.gift_toast_pp);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (z) {
                        return null;
                    }
                    o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                        return null;
                    }
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    return null;
                }
                o00000.OooO00o oooO00o = o00000.f41437OooO0o0;
                if (roomUserInfoModel == o00000.f41439OooO0oo) {
                    boolean zIsCoin = giftPropModel.isCoin();
                    p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
                    oooOOO.OooO0OO();
                    long jLongValue = oooOOO.OooO0OO().getValue() != null ? oooOOO.OooO0OO().getValue().longValue() : 0L;
                    long jLongValue2 = oooOOO.OooO0o().getValue() != null ? oooOOO.OooO0o().getValue().longValue() : 0L;
                    if (!zIsCoin) {
                        jLongValue = jLongValue2;
                    }
                    int price = giftPropModel.getPrice();
                    if (jLongValue < ((long) price) * ((long) i4)) {
                        if (zIsCoin) {
                            ApiError error = new ApiError(2003, "");
                            Intrinsics.checkNotNullParameter(error, "error");
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                            return null;
                        }
                        ApiError error2 = new ApiError(2008, "");
                        Intrinsics.checkNotNullParameter(error2, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error2, null), 3, null);
                        return null;
                    }
                    int i5 = 0;
                    for (int i6 = 0; i6 < o000O00O.OooO().f32431OoooO.size(); i6++) {
                        RoomUserInfoModel roomUserInfoModel2 = o000O00O.OooO().f32431OoooO.get(i6).user;
                        if (roomUserInfoModel2 != null && roomUserInfoModel2.getUserId() != p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue().longValue()) {
                            i5++;
                        }
                    }
                    if (i5 <= 0) {
                        String strOooO0OO2 = o000O0O0.OooO0OO(R.string.room_dialog_no_other_people_in_mic);
                        ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                        if (strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) {
                            return null;
                        }
                        o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O1.run();
                            return null;
                        }
                        o00O000 o00o002 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                        return null;
                    }
                    if (price * i4 * i5 > jLongValue) {
                        if (zIsCoin) {
                            LiveEventBus.get("QuickRechargeDialogFromRoomGiftSendDialog").post(o0oooooo2.f32507OooO0O0.f34200OooO0O0);
                            return null;
                        }
                        CommonErrorHandler.INSTANCE.post(new CommonError(CommonError.Crystal_NotEnough, ""));
                        return null;
                    }
                    if (giftPropModel.isBlind()) {
                        Room.BlindBoxGiftRequest.Builder builderNewBuilder = Room.BlindBoxGiftRequest.newBuilder();
                        builderNewBuilder.setTarget(0L);
                        builderNewBuilder.setBMic(true);
                        builderNewBuilder.setGiftId(giftPropModel.getGiftId());
                        builderNewBuilder.setPerNum(1);
                        p159o00OoOO.o00O000.OooO().OooOo0O(builderNewBuilder);
                    } else if (giftPropModel.isCustomMade()) {
                        Room.CustomGiftRequest.Builder builderNewBuilder2 = Room.CustomGiftRequest.newBuilder();
                        builderNewBuilder2.setTarget(0L);
                        builderNewBuilder2.setAllMicFlag(true);
                        builderNewBuilder2.setAllRoomFlag(false);
                        builderNewBuilder2.setGiftId(giftPropModel.getGiftId());
                        builderNewBuilder2.setNumber(i4);
                        p159o00OoOO.o00O000.OooO().OooOo0o(builderNewBuilder2);
                    } else {
                        GiftSendAllModel giftSendAllModel = new GiftSendAllModel(giftPropModel.getGiftId(), i4, i5);
                        Objects.requireNonNull(p159o00OoOO.o00O000.OooO());
                        if (p159o00OoOO.o00O000.f32468OooO00o != null) {
                            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("giftSendModel New = ");
                            sbOooO0o0.append(giftSendAllModel.toJSONString());
                            o00O00.OooO0O0(sbOooO0o0.toString());
                            p159o00OoOO.o00O000.f32468OooO00o.OooO0o(1000100, o0Oo0oo.OooO0Oo(giftSendAllModel));
                        }
                    }
                    o0oooooo2.OooO00o(giftPropModel);
                    o0oooooo2.f32507OooO0O0.OooO0Oo();
                    return null;
                }
                if (roomUserInfoModel == o00000.f41438OooO0oO) {
                    OooOo.OooO0O0("102018");
                    int giftId = giftPropModel.getGiftId();
                    int price2 = giftPropModel.getPrice();
                    int typePay = giftPropModel.getTypePay();
                    GiftPropTypePay giftPropTypePay = GiftPropTypePay.Coin;
                    boolean z2 = typePay == giftPropTypePay.getValue();
                    p498o0o00Oo0.OooOOO oooOOO2 = p498o0o00Oo0.OooOOO.f41216OooO00o;
                    long jLongValue3 = (z2 ? oooOOO2.OooO0OO() : oooOOO2.OooO0o()).getValue().longValue();
                    if (jLongValue3 < price2) {
                        if (z2) {
                            ApiError error3 = new ApiError(2003, "");
                            Intrinsics.checkNotNullParameter(error3, "error");
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error3, null), 3, null);
                            return null;
                        }
                        ApiError error4 = new ApiError(2008, "");
                        Intrinsics.checkNotNullParameter(error4, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error4, null), 3, null);
                        return null;
                    }
                    int iOooO00o = oooOO1.OooO00o() - 1;
                    if (price2 * iOooO00o > jLongValue3) {
                        if (z2) {
                            LiveEventBus.get("QuickRechargeDialogFromRoomGiftSendDialog").post(o0oooooo2.f32507OooO0O0.f34200OooO0O0);
                            return null;
                        }
                        CommonErrorHandler.INSTANCE.post(new CommonError(CommonError.Crystal_NotEnough, ""));
                        return null;
                    }
                    if (giftPropModel.isCustomMade()) {
                        Room.CustomGiftRequest.Builder builderNewBuilder3 = Room.CustomGiftRequest.newBuilder();
                        builderNewBuilder3.setTarget(0L);
                        builderNewBuilder3.setAllMicFlag(false);
                        builderNewBuilder3.setAllRoomFlag(true);
                        builderNewBuilder3.setGiftId(giftPropModel.getGiftId());
                        builderNewBuilder3.setNumber(i4);
                        p159o00OoOO.o00O000.OooO().OooOo0o(builderNewBuilder3);
                    } else {
                        GiftSendAllModel giftSendAllModel2 = new GiftSendAllModel(giftId, i4, iOooO00o);
                        if (typePay == giftPropTypePay.getValue()) {
                            Objects.requireNonNull(p159o00OoOO.o00O000.OooO());
                            if (p159o00OoOO.o00O000.f32468OooO00o != null) {
                                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("giftSendModel New = ");
                                sbOooO0o1.append(giftSendAllModel2.toJSONString());
                                o00O00.OooO0O0(sbOooO0o1.toString());
                                p159o00OoOO.o00O000.f32468OooO00o.OooO0o(10048, o0Oo0oo.OooO0Oo(giftSendAllModel2));
                            }
                        } else {
                            Objects.requireNonNull(p159o00OoOO.o00O000.OooO());
                            if (p159o00OoOO.o00O000.f32468OooO00o != null) {
                                StringBuilder sbOooO0o2 = OooO00o.OooO0o0("giftSendModel New = ");
                                sbOooO0o2.append(giftSendAllModel2.toJSONString());
                                o00O00.OooO0O0(sbOooO0o2.toString());
                                p159o00OoOO.o00O000.f32468OooO00o.OooO0o(10057, o0Oo0oo.OooO0Oo(giftSendAllModel2));
                            }
                        }
                    }
                    o0oooooo2.OooO00o(giftPropModel);
                    o0oooooo2.f32507OooO0O0.OooO0Oo();
                    return null;
                }
                if (OooO0OO.OooO00o(Long.valueOf(roomUserInfoModel.getUserId()))) {
                    String strOooO0OO3 = o000O0O0.OooO0OO(R.string.user_not_found);
                    ToastUtil toastUtil3 = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3)) {
                        return null;
                    }
                    o0O0ooO o0o0oooOooO0O2 = OooOOO.OooO0O0(toastUtil3, strOooO0OO3, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O2.run();
                        return null;
                    }
                    o00O000 o00o003 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O2);
                    return null;
                }
                if (p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue().longValue() == roomUserInfoModel.getUserId()) {
                    String strOooO0OO4 = o000O0O0.OooO0OO(R.string.gift_cannot_send_to_yourself);
                    ToastUtil toastUtil4 = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO4 == null || StringsKt.isBlank(strOooO0OO4)) {
                        return null;
                    }
                    o0O0ooO o0o0oooOooO0O3 = OooOOO.OooO0O0(toastUtil4, strOooO0OO4, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O3.run();
                        return null;
                    }
                    o00O000 o00o004 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O3);
                    return null;
                }
                if (giftPropModel.isBlind()) {
                    Room.BlindBoxGiftRequest.Builder builderNewBuilder4 = Room.BlindBoxGiftRequest.newBuilder();
                    builderNewBuilder4.setTarget(roomUserInfoModel.getUserId());
                    builderNewBuilder4.setBMic(false);
                    builderNewBuilder4.setGiftId(giftPropModel.getGiftId());
                    builderNewBuilder4.setPerNum(i4);
                    p159o00OoOO.o00O000.OooO().OooOo0O(builderNewBuilder4);
                } else if (giftPropModel.isCustomMade()) {
                    Room.CustomGiftRequest.Builder builderNewBuilder5 = Room.CustomGiftRequest.newBuilder();
                    builderNewBuilder5.setTarget(roomUserInfoModel.getUserId());
                    builderNewBuilder5.setAllMicFlag(false);
                    builderNewBuilder5.setAllRoomFlag(false);
                    builderNewBuilder5.setGiftId(giftPropModel.getGiftId());
                    builderNewBuilder5.setNumber(i4);
                    p159o00OoOO.o00O000.OooO().OooOo0o(builderNewBuilder5);
                } else {
                    GiftSendModel giftSendModel = new GiftSendModel(roomUserInfoModel.getUserId(), giftPropModel.getGiftId(), i4);
                    o0O00000.OooO0OO("InRoom_gift_send");
                    if (giftPropModel.isCoin()) {
                        Objects.requireNonNull(p159o00OoOO.o00O000.OooO());
                        o00 o00Var = p159o00OoOO.o00O000.f32468OooO00o;
                        if (o00Var != null) {
                            StringBuilder sbOooO0o3 = OooO00o.OooO0o0("{\"to\":");
                            sbOooO0o3.append(giftSendModel.getToId());
                            sbOooO0o3.append(",\"giftid\":");
                            sbOooO0o3.append(giftSendModel.getGiftId());
                            sbOooO0o3.append(",\"number\":");
                            sbOooO0o3.append(giftSendModel.getNumber());
                            sbOooO0o3.append(",\"giftURL\":");
                            sbOooO0o3.append(giftSendModel.getGiftUrl());
                            sbOooO0o3.append("}");
                            o00Var.OooO0o(10009, sbOooO0o3.toString());
                        }
                    } else {
                        Objects.requireNonNull(p159o00OoOO.o00O000.OooO());
                        o00 o00Var2 = p159o00OoOO.o00O000.f32468OooO00o;
                        if (o00Var2 != null) {
                            StringBuilder sbOooO0o4 = OooO00o.OooO0o0("{\"to\":");
                            sbOooO0o4.append(giftSendModel.getToId());
                            sbOooO0o4.append(",\"giftid\":");
                            sbOooO0o4.append(giftSendModel.getGiftId());
                            sbOooO0o4.append(",\"number\":");
                            sbOooO0o4.append(giftSendModel.getNumber());
                            sbOooO0o4.append("}");
                            o00Var2.OooO0o(10056, sbOooO0o4.toString());
                        }
                    }
                }
                o0oooooo2.OooO00o(giftPropModel);
                o0oooooo2.f32507OooO0O0.OooO0Oo();
                return null;
            }
        };
        o000Var.f41399OooOO0o = new o0(this, i3);
        o000Var.f41401OooOOO0 = new o0O00000(this, i3);
        if (user != null) {
            Intrinsics.checkNotNullParameter(user, "user");
            o000Var.OooOooO(user);
        }
        if (i > 0) {
            this.f32507OooO0O0.OooOoo0(i);
        }
        if (i2 > 0) {
            o000 o000Var2 = this.f32507OooO0O0;
            Objects.requireNonNull(o000Var2);
            oo0O.OooO0OO oooO0OO = oo0O.OooO0OO.f53327OooO00o;
            if (oooO0OO.OooO0OO()) {
                o00oOoo.OooO0O0(o000O0O0.OooO0OO(R.string.network_failed));
            } else {
                o000Var2.f41410OooOo0O = oooO0OO.OooO0O0(i2);
            }
        }
        this.f32507OooO0O0.OooOOO0();
        LinearLayout linearLayout = this.f32507OooO0O0.f34201OooO0OO;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o0OO00O o0oo00oOooO0o0 = OooOOO0.OooO0o0();
        StringBuilder sbOooO00o = o000OO00.OooO00o(o0oo00oOooO0o0, "roomGift");
        sbOooO00o.append(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue());
        if (!o0oo00oOooO0o0.OooO00o(sbOooO00o.toString(), false) || (mixedRoomActivity = this.f32506OooO00o) == null || mixedRoomActivity.isFinishing()) {
            return;
        }
        com.app.base.view.tips.OooO00o oooO00o = new com.app.base.view.tips.OooO00o(this.f32506OooO00o);
        linearLayout.getViewTreeObserver().addOnPreDrawListener(new o0O0O00(oooO00o, linearLayout));
        OooO0O0.OooOOO0(oooO00o, this.f32506OooO00o);
        OooOOO0.OooO0o0().OooOo00(false);
    }
}
