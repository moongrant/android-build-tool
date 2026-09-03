package p433o0OoOOo;

import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o0000OO0;
import com.app.base.protobuf.room.Room;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.google.firebase.messaging.o0OO00O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.GiftSendAllModel;
import com.yalla.yalla.model.GiftSendModel;
import com.yalla.yalla.model.gift.GiftPropAll;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypePay;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;
import p375o0OOoOO.o00000O0;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p417o0OoO0.oo0o0Oo;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;
import p475o0o000.o000000O;
import p520o0o0O0oo.d6;
import p520o0o0O0oo.h9;
import p520o0o0O0oo.x6;
import p520o0o0O0oo.x8;
import p533o0o0Oo0.oo0O;
import p568o0oOoO.o0OOOO0o;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomBottomProcess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomProcess.kt\ncom/yalla/yalla/mixedroom/room_bottom/RoomBottomProcess\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n1855#2,2:407\n*S KotlinDebug\n*F\n+ 1 RoomBottomProcess.kt\ncom/yalla/yalla/mixedroom/room_bottom/RoomBottomProcess\n*L\n206#1:407,2\n*E\n"})
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f46003OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public x6 f46004OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<GiftPropModel, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ x6 f46006OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(x6 x6Var) {
            super(1);
            this.f46006OooO0o0 = x6Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GiftPropModel giftPropModel) {
            Long l;
            GiftPropModel giftPropModel2 = giftPropModel;
            x6 x6Var = this.f46006OooO0o0;
            RoomUserInfoModel roomUserInfoModel = x6Var.f53382OooOOOO;
            int i = x6Var.f53383OooOOOo;
            o00OOO00 o00ooo01 = o00OOO00.this;
            o00ooo01.getClass();
            if (giftPropModel2 != null) {
                o000000O o000000o2 = com.yalla.yalla.service.room.OooO00o.f24981OooOO0;
                if (o000000o2.f47413OooO0O0.getValue().intValue() - 1 <= 0) {
                    o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_toast_pp));
                } else {
                    RoomUserInfoModel roomUserInfoModel2 = d6.f53266OooO0oO;
                    o00O0 o00o1 = o00O0.f45732OooO00o;
                    if (roomUserInfoModel == roomUserInfoModel2) {
                        boolean zIsCoin = giftPropModel2.isCoin();
                        p464o0Oooo.o000000O o000000o3 = p464o0Oooo.o000000O.f46674OooO00o;
                        Long l2 = 0L;
                        if (p464o0Oooo.o000000O.OooO0O0().getValue() != 0) {
                            T value = p464o0Oooo.o000000O.OooO0O0().getValue();
                            Intrinsics.checkNotNull(value);
                            l = (Long) value;
                        } else {
                            l = l2;
                        }
                        Intrinsics.checkNotNullExpressionValue(l, "if (Account.coin.value !…count.coin.value!! else 0");
                        long jLongValue = l.longValue();
                        if (p464o0Oooo.o000000O.OooO0Oo().getValue() != 0) {
                            T value2 = p464o0Oooo.o000000O.OooO0Oo().getValue();
                            Intrinsics.checkNotNull(value2);
                            l2 = (Long) value2;
                        }
                        Intrinsics.checkNotNullExpressionValue(l2, "if (Account.crystal.valu…nt.crystal.value!! else 0");
                        long jLongValue2 = l2.longValue();
                        if (!zIsCoin) {
                            jLongValue = jLongValue2;
                        }
                        int price = giftPropModel2.getPrice();
                        int i2 = 0;
                        for (oo0O oo0o : com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O) {
                            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(oo0o.f54838OooO0OO.getValue());
                            if (roomUserInfoModelOooO0o0 != null) {
                                long jLongValue3 = roomUserInfoModelOooO0o0.getUserId().getValue().longValue();
                                p464o0Oooo.o000000O o000000o4 = p464o0Oooo.o000000O.f46674OooO00o;
                                Long l3 = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
                                if (l3 == null || jLongValue3 != l3.longValue()) {
                                    i2++;
                                }
                            }
                        }
                        if (giftPropModel2.isBackpack()) {
                            o00ooo01.OooO00o(giftPropModel2, i, i2);
                        } else {
                            int i3 = i2;
                            if (jLongValue < ((long) price) * ((long) i)) {
                                if (zIsCoin) {
                                    ApiError error = new ApiError(2003, "", null, 4, null);
                                    Intrinsics.checkNotNullParameter(error, "error");
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
                                } else {
                                    ApiError error2 = new ApiError(2008, "", null, 4, null);
                                    Intrinsics.checkNotNullParameter(error2, "error");
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error2, null), 3, null);
                                }
                            } else if (i3 <= 0) {
                                o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.room_dialog_no_other_people_in_mic));
                            } else if (price * i * i3 <= jLongValue) {
                                o00ooo01.OooO00o(giftPropModel2, i, i3);
                            } else if (zIsCoin) {
                                Observable<Object> observable = LiveEventBus.get("QuickRechargeDialogFromRoomGiftSendDialog");
                                x6 x6Var2 = o00ooo01.f46004OooO0O0;
                                observable.post(x6Var2 != null ? x6Var2.f10134OooO0O0 : null);
                            } else {
                                o00o1.OooO0OO(new oOO00O(oOO00O.Crystal_NotEnough, ""));
                            }
                        }
                    } else if (roomUserInfoModel == d6.f53264OooO0o) {
                        o0OO000.OooO00o("102018");
                        int giftId = giftPropModel2.getGiftId();
                        int price2 = giftPropModel2.getPrice();
                        int typePay = giftPropModel2.getTypePay();
                        GiftPropTypePay giftPropTypePay = GiftPropTypePay.Coin;
                        boolean z = typePay == giftPropTypePay.getValue();
                        p464o0Oooo.o000000O o000000o5 = p464o0Oooo.o000000O.f46674OooO00o;
                        T value3 = (z ? p464o0Oooo.o000000O.OooO0O0() : p464o0Oooo.o000000O.OooO0Oo()).getValue();
                        Intrinsics.checkNotNull(value3);
                        Long l4 = (Long) value3;
                        Intrinsics.checkNotNullExpressionValue(l4, "if (isCoinGift) Account.…e Account.crystal.value!!");
                        long jLongValue4 = l4.longValue();
                        if (jLongValue4 >= price2) {
                            int iIntValue = o000000o2.f47413OooO0O0.getValue().intValue() - 1;
                            if (price2 * iIntValue <= jLongValue4) {
                                if (giftPropModel2.isCustomMade()) {
                                    Room.CustomGiftRequest.Builder builderNewBuilder = Room.CustomGiftRequest.newBuilder();
                                    builderNewBuilder.setTarget(0L);
                                    builderNewBuilder.setAllMicFlag(false);
                                    builderNewBuilder.setAllRoomFlag(true);
                                    builderNewBuilder.setGiftId(giftPropModel2.getGiftId());
                                    builderNewBuilder.setNumber(i);
                                    RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                                    if (roomLiveService != null) {
                                        roomLiveService.OooO0oo(1001002, builderNewBuilder.build().toByteArray());
                                    }
                                } else {
                                    GiftSendAllModel giftSendAllModel = new GiftSendAllModel(giftId, i, iIntValue);
                                    if (typePay == giftPropTypePay.getValue()) {
                                        OooOOO0.OooO0O0("giftSendModel New = " + giftSendAllModel.toJSONString());
                                        RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
                                        if (roomLiveService2 != null) {
                                            roomLiveService2.OooO0oO(10048, oOo00OO0.OooO0OO(giftSendAllModel));
                                        }
                                    } else {
                                        OooOOO0.OooO0O0("giftSendModel New = " + giftSendAllModel.toJSONString());
                                        RoomLiveService roomLiveService3 = RoomLiveService.f25058OooOo00;
                                        if (roomLiveService3 != null) {
                                            roomLiveService3.OooO0oO(10057, oOo00OO0.OooO0OO(giftSendAllModel));
                                        }
                                    }
                                }
                                LiveEventBus.get("SendGiftSuccess").post(giftPropModel2);
                                x6 x6Var3 = o00ooo01.f46004OooO0O0;
                                if (x6Var3 != null) {
                                    x6Var3.OooO0OO();
                                }
                            } else if (z) {
                                Observable<Object> observable2 = LiveEventBus.get("QuickRechargeDialogFromRoomGiftSendDialog");
                                x6 x6Var4 = o00ooo01.f46004OooO0O0;
                                observable2.post(x6Var4 != null ? x6Var4.f10134OooO0O0 : null);
                            } else {
                                o00o1.OooO0OO(new oOO00O(oOO00O.Crystal_NotEnough, ""));
                            }
                        } else if (z) {
                            ApiError error3 = new ApiError(2003, "", null, 4, null);
                            Intrinsics.checkNotNullParameter(error3, "error");
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error3, null), 3, null);
                        } else {
                            ApiError error4 = new ApiError(2008, "", null, 4, null);
                            Intrinsics.checkNotNullParameter(error4, "error");
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error4, null), 3, null);
                        }
                    } else if (OooOo00.OooO00o(roomUserInfoModel.getUserId().getValue())) {
                        o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.user_not_found));
                    } else {
                        p464o0Oooo.o000000O o000000o6 = p464o0Oooo.o000000O.f46674OooO00o;
                        Long l5 = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
                        long jLongValue5 = roomUserInfoModel.getUserId().getValue().longValue();
                        if (l5 != null && l5.longValue() == jLongValue5) {
                            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself));
                        } else {
                            if (giftPropModel2.isBackpack()) {
                                Room.BackPackGiftRequest.Builder builderNewBuilder2 = Room.BackPackGiftRequest.newBuilder();
                                builderNewBuilder2.setTarget(roomUserInfoModel.getUserId().getValue().longValue());
                                builderNewBuilder2.setBMic(false);
                                builderNewBuilder2.setGiftId(giftPropModel2.getGiftId());
                                builderNewBuilder2.setPerNum(i);
                                builderNewBuilder2.setTarget(builderNewBuilder2.getTarget());
                                builderNewBuilder2.setBMic(builderNewBuilder2.getBMic());
                                builderNewBuilder2.setPerNum(builderNewBuilder2.getPerNum());
                                builderNewBuilder2.setGiftId(builderNewBuilder2.getGiftId());
                                OooOOO0.OooO0O0("GiftBackPack：type = 1001003, backPackGift Send = ".concat(OooOO0.OooO00o(builderNewBuilder2)));
                                RoomLiveService roomLiveService4 = RoomLiveService.f25058OooOo00;
                                if (roomLiveService4 != null) {
                                    roomLiveService4.OooO0oo(1001003, builderNewBuilder2.build().toByteArray());
                                }
                            } else if (giftPropModel2.isBlind()) {
                                Room.BlindBoxGiftRequest.Builder builderNewBuilder3 = Room.BlindBoxGiftRequest.newBuilder();
                                builderNewBuilder3.setTarget(roomUserInfoModel.getUserId().getValue().longValue());
                                builderNewBuilder3.setBMic(false);
                                builderNewBuilder3.setGiftId(giftPropModel2.getGiftId());
                                builderNewBuilder3.setPerNum(i);
                                builderNewBuilder3.setTarget(builderNewBuilder3.getTarget());
                                builderNewBuilder3.setBMic(builderNewBuilder3.getBMic());
                                builderNewBuilder3.setPerNum(builderNewBuilder3.getPerNum());
                                builderNewBuilder3.setGiftId(builderNewBuilder3.getGiftId());
                                RoomLiveService roomLiveService5 = RoomLiveService.f25058OooOo00;
                                if (roomLiveService5 != null) {
                                    roomLiveService5.OooO0oo(1001000, builderNewBuilder3.build().toByteArray());
                                }
                            } else if (giftPropModel2.isCustomMade()) {
                                Room.CustomGiftRequest.Builder builderNewBuilder4 = Room.CustomGiftRequest.newBuilder();
                                builderNewBuilder4.setTarget(roomUserInfoModel.getUserId().getValue().longValue());
                                builderNewBuilder4.setAllMicFlag(false);
                                builderNewBuilder4.setAllRoomFlag(false);
                                builderNewBuilder4.setGiftId(giftPropModel2.getGiftId());
                                builderNewBuilder4.setNumber(i);
                                RoomLiveService roomLiveService6 = RoomLiveService.f25058OooOo00;
                                if (roomLiveService6 != null) {
                                    roomLiveService6.OooO0oo(1001002, builderNewBuilder4.build().toByteArray());
                                }
                            } else {
                                GiftSendModel giftSendModel = new GiftSendModel(roomUserInfoModel.getUserId().getValue().longValue(), giftPropModel2.getGiftId(), i);
                                if (giftPropModel2.isCoin()) {
                                    RoomLiveService roomLiveService7 = RoomLiveService.f25058OooOo00;
                                    if (roomLiveService7 != null) {
                                        roomLiveService7.OooO0oO(10009, "{\"to\":" + giftSendModel.getToId() + ",\"giftid\":" + giftSendModel.getGiftId() + ",\"number\":" + giftSendModel.getNumber() + ",\"giftURL\":" + giftSendModel.getGiftUrl() + "}");
                                    }
                                } else {
                                    RoomLiveService roomLiveService8 = RoomLiveService.f25058OooOo00;
                                    if (roomLiveService8 != null) {
                                        roomLiveService8.OooO0oO(10056, "{\"to\":" + giftSendModel.getToId() + ",\"giftid\":" + giftSendModel.getGiftId() + ",\"number\":" + giftSendModel.getNumber() + "}");
                                    }
                                }
                            }
                            LiveEventBus.get("SendGiftSuccess").post(giftPropModel2);
                            x6 x6Var5 = o00ooo01.f46004OooO0O0;
                            if (x6Var5 != null) {
                                x6Var5.OooO0OO();
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<WebPageInfo, Boolean, Unit> {
        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(WebPageInfo webPageInfo, Boolean bool) {
            WebPageInfo webPageInfo2 = webPageInfo;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(webPageInfo2, "webPageInfo");
            if (zBooleanValue) {
                com.yalla.yalla.service.room.OooO00o.f24977OooO0o.OooO0Oo(webPageInfo2);
            } else {
                int i = WebActivity.f25584OooOoO0;
                WebActivity.OooO00o.OooO00o(o00OOO00.this.f46003OooO00o, webPageInfo2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<WebPageInfo, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(WebPageInfo webPageInfo) {
            WebPageInfo webPageInfo2 = webPageInfo;
            if (webPageInfo2 != null) {
                int i = WebActivity.f25584OooOoO0;
                WebActivity.OooO00o.OooO00o(o00OOO00.this.f46003OooO00o, webPageInfo2);
            }
            return Unit.INSTANCE;
        }
    }

    public o00OOO00(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f46003OooO00o = activity;
    }

    public final void OooO00o(GiftPropModel giftPropModel, int i, int i2) {
        if (giftPropModel.isBackpack()) {
            Room.BackPackGiftRequest.Builder builderNewBuilder = Room.BackPackGiftRequest.newBuilder();
            builderNewBuilder.setTarget(0L);
            builderNewBuilder.setBMic(true);
            builderNewBuilder.setGiftId(giftPropModel.getGiftId());
            builderNewBuilder.setPerNum(i);
            builderNewBuilder.setTarget(builderNewBuilder.getTarget());
            builderNewBuilder.setBMic(builderNewBuilder.getBMic());
            builderNewBuilder.setPerNum(builderNewBuilder.getPerNum());
            builderNewBuilder.setGiftId(builderNewBuilder.getGiftId());
            OooOOO0.OooO0O0("GiftBackPack：type = 1001003, backPackGift Send = ".concat(OooOO0.OooO00o(builderNewBuilder)));
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(1001003, builderNewBuilder.build().toByteArray());
            }
        } else if (giftPropModel.isBlind()) {
            Room.BlindBoxGiftRequest.Builder builderNewBuilder2 = Room.BlindBoxGiftRequest.newBuilder();
            builderNewBuilder2.setTarget(0L);
            builderNewBuilder2.setBMic(true);
            builderNewBuilder2.setGiftId(giftPropModel.getGiftId());
            builderNewBuilder2.setPerNum(i);
            builderNewBuilder2.setTarget(builderNewBuilder2.getTarget());
            builderNewBuilder2.setBMic(builderNewBuilder2.getBMic());
            builderNewBuilder2.setPerNum(builderNewBuilder2.getPerNum());
            builderNewBuilder2.setGiftId(builderNewBuilder2.getGiftId());
            RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
            if (roomLiveService2 != null) {
                roomLiveService2.OooO0oo(1001000, builderNewBuilder2.build().toByteArray());
            }
        } else if (giftPropModel.isCustomMade()) {
            Room.CustomGiftRequest.Builder builderNewBuilder3 = Room.CustomGiftRequest.newBuilder();
            builderNewBuilder3.setTarget(0L);
            builderNewBuilder3.setAllMicFlag(true);
            builderNewBuilder3.setAllRoomFlag(false);
            builderNewBuilder3.setGiftId(giftPropModel.getGiftId());
            builderNewBuilder3.setNumber(i);
            RoomLiveService roomLiveService3 = RoomLiveService.f25058OooOo00;
            if (roomLiveService3 != null) {
                roomLiveService3.OooO0oo(1001002, builderNewBuilder3.build().toByteArray());
            }
        } else {
            GiftSendAllModel giftSendAllModel = new GiftSendAllModel(giftPropModel.getGiftId(), i, i2);
            OooOOO0.OooO0O0("giftSendModel New = " + giftSendAllModel.toJSONString());
            RoomLiveService roomLiveService4 = RoomLiveService.f25058OooOo00;
            if (roomLiveService4 != null) {
                roomLiveService4.OooO0oO(1000100, oOo00OO0.OooO0OO(giftSendAllModel));
            }
        }
        LiveEventBus.get("SendGiftSuccess").post(giftPropModel);
        x6 x6Var = this.f46004OooO0O0;
        if (x6Var != null) {
            x6Var.OooO0OO();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(@Nullable RoomUserInfoModel user, int i, int i2, boolean z) {
        Map<Integer, GiftPropModel> value;
        o0000OO0.OooO0O0().OooO0o("FIRST_SEND_GIFT", false);
        ((MutableLiveData) com.yalla.yalla.service.room.OooO00o.f24989OooOOo0.f47448OooO00o.getValue()).postValue(Boolean.FALSE);
        x6 x6Var = this.f46004OooO0O0;
        MixedRoomActivity mixedRoomActivity = this.f46003OooO00o;
        if (x6Var == null) {
            this.f46004OooO0O0 = new x6(mixedRoomActivity, h9.f53290OooO00o, GiftPropTypeShow.InRoom);
        }
        x6 x6Var2 = this.f46004OooO0O0;
        if (x6Var2 != null) {
            x6Var2.f53378OooOO0O = new OooO00o(x6Var2);
            x6Var2.f53379OooOO0o = new OooO0O0();
            x6Var2.f53381OooOOO0 = new OooO0OO();
            if (user != null) {
                Intrinsics.checkNotNullParameter(user, "user");
                x6Var2.OooOoOO(user);
            }
            if (i2 > 0) {
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = p385o0OOooOO.oOO00O.f44351OooO00o;
                p385o0OOooOO.oOO00O.OooO0Oo(false);
                List<GiftPropAll> value2 = p385o0OOooOO.oOO00O.f44354OooO0Oo.getValue();
                GiftPropModel giftPropModel = null;
                if (value2 == null || value2.isEmpty()) {
                    x8 x8Var = x8.f53412OooO0Oo;
                    if (x8Var != null) {
                        x8Var.invoke();
                    }
                } else {
                    GiftPropModel giftPropModel2 = (!z || (value = p385o0OOooOO.oOO00O.f44352OooO0O0.getValue()) == null) ? null : value.get(Integer.valueOf(i2));
                    if (giftPropModel2 == null) {
                        Map<Integer, GiftPropModel> value3 = p385o0OOooOO.oOO00O.f44351OooO00o.getValue();
                        if (value3 != null) {
                            giftPropModel = value3.get(Integer.valueOf(i2));
                        }
                    } else {
                        giftPropModel = giftPropModel2;
                    }
                }
                if (giftPropModel != null) {
                    x6Var2.f53384OooOOo = giftPropModel;
                    if (i > 0) {
                        x6Var2.f53383OooOOOo = i;
                    }
                }
            }
            x6Var2.OooOO0o();
            LiveEventBus.get("RoomMessageBox_Dismiss").post(Boolean.TRUE);
            LinearLayout linearLayout = x6Var2.f10135OooO0OO;
            o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            if (!o0o0o00OooO0o0.OooO0O0("roomGift" + p464o0Oooo.o000000O.OooOOo0().getValue(), false) || mixedRoomActivity.isFinishing()) {
                return;
            }
            com.yalla.yalla.ui.view.tips.OooO00o oooO00o = new com.yalla.yalla.ui.view.tips.OooO00o(mixedRoomActivity);
            linearLayout.getViewTreeObserver().addOnPreDrawListener(new o0OOOO0o(oooO00o, linearLayout));
            oo0o0Oo.OooO0Oo(oooO00o);
            o0O0O00 o0o0o00OooO0o1 = o00Oo0.OooO0o0();
            o0o0o00OooO0o1.getClass();
            o0OO00O.OooO00o("roomGift", p464o0Oooo.o000000O.OooOOo0().getValue(), o0o0o00OooO0o1, false);
        }
    }
}
