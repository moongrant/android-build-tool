package p442o0OoOo0O;

import android.widget.LinearLayout;
import androidx.appcompat.widget.o0000O0O;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.room.Room;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
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
import p187o00o00o0.OooO;
import p269o00oooo0.o0O0oo0o;
import p391o0OOooo0.oo0o0Oo;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o000O0Oo;
import p435o0OoOOOo.o0O000;
import p435o0OoOOOo.o0O0o;
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000O0;
import p511o0o0O.Oooo000;
import p511o0o0O.o00000OO;
import p511o0o0O.o00O0OOO;
import p511o0o0O.o00OO;
import p541o0o0OoOO.oo00;
import p562o0oOo000.o000000;
import p575o0oOoOOO.oO0OO0O;
import p590o0oOooo0.oOOO00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomBottomProcess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomProcess.kt\ncom/yalla/yalla/mixedroom/room_bottom/RoomBottomProcess\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n1855#2,2:407\n*S KotlinDebug\n*F\n+ 1 RoomBottomProcess.kt\ncom/yalla/yalla/mixedroom/room_bottom/RoomBottomProcess\n*L\n206#1:407,2\n*E\n"})
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f47270OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00000OO f47271OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<GiftPropModel, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00000OO f47273OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00000OO o00000oo2) {
            super(1);
            this.f47273OooO0o0 = o00000oo2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GiftPropModel giftPropModel) {
            Long l;
            GiftPropModel giftPropModel2 = giftPropModel;
            o00000OO o00000oo2 = this.f47273OooO0o0;
            RoomUserInfoModel roomUserInfoModel = o00000oo2.f50966OooOOOO;
            int i = o00000oo2.f50967OooOOOo;
            o000OO o000oo2 = o000OO.this;
            o000oo2.getClass();
            if (giftPropModel2 != null) {
                o0000O0 o0000o1 = com.yalla.yalla.service.room.OooO00o.f24519OooOO0;
                if (o0000o1.f48494OooO0O0.getValue().intValue() - 1 <= 0) {
                    o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_toast_pp));
                } else {
                    RoomUserInfoModel roomUserInfoModel2 = Oooo000.f50938OooO0oO;
                    o0O000 o0o001 = o0O000.f47005OooO00o;
                    if (roomUserInfoModel == roomUserInfoModel2) {
                        boolean zIsCoin = giftPropModel2.isCoin();
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        Long l2 = 0L;
                        if (o0O00oO0.OooO0O0().getValue() != 0) {
                            T value = o0O00oO0.OooO0O0().getValue();
                            Intrinsics.checkNotNull(value);
                            l = (Long) value;
                        } else {
                            l = l2;
                        }
                        Intrinsics.checkNotNull(l);
                        long jLongValue = l.longValue();
                        if (o0O00oO0.OooO0Oo().getValue() != 0) {
                            T value2 = o0O00oO0.OooO0Oo().getValue();
                            Intrinsics.checkNotNull(value2);
                            l2 = (Long) value2;
                        }
                        Intrinsics.checkNotNull(l2);
                        long jLongValue2 = l2.longValue();
                        if (!zIsCoin) {
                            jLongValue = jLongValue2;
                        }
                        int price = giftPropModel2.getPrice();
                        int i2 = 0;
                        for (oo00 oo00Var : com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O) {
                            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(oo00Var.f55307OooO0OO.getValue());
                            if (roomUserInfoModelOooO0o0 != null) {
                                long jLongValue3 = roomUserInfoModelOooO0o0.getUserId().getValue().longValue();
                                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                                Long l3 = (Long) o0O00oO0.OooOOo0().getValue();
                                if (l3 == null || jLongValue3 != l3.longValue()) {
                                    i2++;
                                }
                            }
                        }
                        if (giftPropModel2.isBackpack()) {
                            o000oo2.OooO00o(giftPropModel2, i, i2);
                        } else {
                            int i3 = i2;
                            if (jLongValue < ((long) price) * ((long) i)) {
                                if (zIsCoin) {
                                    ApiError error = new ApiError(2003, "", null, 4, null);
                                    Intrinsics.checkNotNullParameter(error, "error");
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p381o0OOoOo0.Oooo000(error, null), 3, null);
                                } else {
                                    ApiError error2 = new ApiError(2008, "", null, 4, null);
                                    Intrinsics.checkNotNullParameter(error2, "error");
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p381o0OOoOo0.Oooo000(error2, null), 3, null);
                                }
                            } else if (i3 <= 0) {
                                o000O00.OooO0O0(o0000.OooO0OO(o000000.room_dialog_no_other_people_in_mic));
                            } else if (price * i * i3 <= jLongValue) {
                                o000oo2.OooO00o(giftPropModel2, i, i3);
                            } else if (zIsCoin) {
                                Observable<Object> observable = LiveEventBus.get("QuickRechargeDialogFromRoomGiftSendDialog");
                                o00000OO o00000oo3 = o000oo2.f47271OooO0O0;
                                observable.post(o00000oo3 != null ? o00000oo3.f38488OooO0O0 : null);
                            } else {
                                o0o001.OooO0OO(new o0O0o(o0O0o.Crystal_NotEnough, ""));
                            }
                        }
                    } else if (roomUserInfoModel == Oooo000.f50936OooO0o) {
                        o0oo0000.OooO00o.OooO0O0("102018");
                        int giftId = giftPropModel2.getGiftId();
                        int price2 = giftPropModel2.getPrice();
                        int typePay = giftPropModel2.getTypePay();
                        GiftPropTypePay giftPropTypePay = GiftPropTypePay.Coin;
                        boolean z = typePay == giftPropTypePay.getValue();
                        o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                        T value3 = (z ? o0O00oO0.OooO0O0() : o0O00oO0.OooO0Oo()).getValue();
                        Intrinsics.checkNotNull(value3);
                        Long l4 = (Long) value3;
                        Intrinsics.checkNotNull(l4);
                        long jLongValue4 = l4.longValue();
                        if (jLongValue4 >= price2) {
                            int iIntValue = o0000o1.f48494OooO0O0.getValue().intValue() - 1;
                            if (price2 * iIntValue <= jLongValue4) {
                                if (giftPropModel2.isCustomMade()) {
                                    Room.CustomGiftRequest.Builder builderNewBuilder = Room.CustomGiftRequest.newBuilder();
                                    builderNewBuilder.setTarget(0L);
                                    builderNewBuilder.setAllMicFlag(false);
                                    builderNewBuilder.setAllRoomFlag(true);
                                    builderNewBuilder.setGiftId(giftPropModel2.getGiftId());
                                    builderNewBuilder.setNumber(i);
                                    RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                                    if (roomLiveService != null) {
                                        roomLiveService.OooO0oo(1001002, builderNewBuilder.build().toByteArray());
                                    }
                                } else {
                                    GiftSendAllModel giftSendAllModel = new GiftSendAllModel(giftId, i, iIntValue);
                                    if (typePay == giftPropTypePay.getValue()) {
                                        o0000O00.OooO0O0("giftSendModel New = " + giftSendAllModel.toJSONString());
                                        RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
                                        if (roomLiveService2 != null) {
                                            roomLiveService2.OooO0oO(10048, oOOO00.OooO0OO(giftSendAllModel));
                                        }
                                    } else {
                                        o0000O00.OooO0O0("giftSendModel New = " + giftSendAllModel.toJSONString());
                                        RoomLiveService roomLiveService3 = RoomLiveService.f24596OooOo00;
                                        if (roomLiveService3 != null) {
                                            roomLiveService3.OooO0oO(10057, oOOO00.OooO0OO(giftSendAllModel));
                                        }
                                    }
                                }
                                LiveEventBus.get("SendGiftSuccess").post(giftPropModel2);
                                o00000OO o00000oo4 = o000oo2.f47271OooO0O0;
                                if (o00000oo4 != null) {
                                    o00000oo4.OooO0OO();
                                }
                            } else if (z) {
                                Observable<Object> observable2 = LiveEventBus.get("QuickRechargeDialogFromRoomGiftSendDialog");
                                o00000OO o00000oo5 = o000oo2.f47271OooO0O0;
                                observable2.post(o00000oo5 != null ? o00000oo5.f38488OooO0O0 : null);
                            } else {
                                o0o001.OooO0OO(new o0O0o(o0O0o.Crystal_NotEnough, ""));
                            }
                        } else if (z) {
                            ApiError error3 = new ApiError(2003, "", null, 4, null);
                            Intrinsics.checkNotNullParameter(error3, "error");
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p381o0OOoOo0.Oooo000(error3, null), 3, null);
                        } else {
                            ApiError error4 = new ApiError(2008, "", null, 4, null);
                            Intrinsics.checkNotNullParameter(error4, "error");
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p381o0OOoOo0.Oooo000(error4, null), 3, null);
                        }
                    } else if (OooOo00.OooO00o(roomUserInfoModel.getUserId().getValue())) {
                        o000O00.OooO0O0(o0000.OooO0OO(o000000.user_not_found));
                    } else {
                        o0O00oO0 o0o00oo4 = o0O00oO0.f47936OooO00o;
                        Long l5 = (Long) o0O00oO0.OooOOo0().getValue();
                        long jLongValue5 = roomUserInfoModel.getUserId().getValue().longValue();
                        if (l5 != null && l5.longValue() == jLongValue5) {
                            o000O00.OooO0O0(o0000.OooO0OO(o000000.gift_cannot_send_to_yourself));
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
                                o0000O00.OooO0O0("GiftBackPack：type = 1001003, backPackGift Send = ".concat(OooO.OooO00o(builderNewBuilder2)));
                                RoomLiveService roomLiveService4 = RoomLiveService.f24596OooOo00;
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
                                RoomLiveService roomLiveService5 = RoomLiveService.f24596OooOo00;
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
                                RoomLiveService roomLiveService6 = RoomLiveService.f24596OooOo00;
                                if (roomLiveService6 != null) {
                                    roomLiveService6.OooO0oo(1001002, builderNewBuilder4.build().toByteArray());
                                }
                            } else {
                                GiftSendModel giftSendModel = new GiftSendModel(roomUserInfoModel.getUserId().getValue().longValue(), giftPropModel2.getGiftId(), i);
                                if (giftPropModel2.isCoin()) {
                                    RoomLiveService roomLiveService7 = RoomLiveService.f24596OooOo00;
                                    if (roomLiveService7 != null) {
                                        roomLiveService7.OooO0oO(10009, "{\"to\":" + giftSendModel.getToId() + ",\"giftid\":" + giftSendModel.getGiftId() + ",\"number\":" + giftSendModel.getNumber() + ",\"giftURL\":" + giftSendModel.getGiftUrl() + "}");
                                    }
                                } else {
                                    RoomLiveService roomLiveService8 = RoomLiveService.f24596OooOo00;
                                    if (roomLiveService8 != null) {
                                        roomLiveService8.OooO0oO(10056, "{\"to\":" + giftSendModel.getToId() + ",\"giftid\":" + giftSendModel.getGiftId() + ",\"number\":" + giftSendModel.getNumber() + "}");
                                    }
                                }
                            }
                            LiveEventBus.get("SendGiftSuccess").post(giftPropModel2);
                            o00000OO o00000oo6 = o000oo2.f47271OooO0O0;
                            if (o00000oo6 != null) {
                                o00000oo6.OooO0OO();
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
                com.yalla.yalla.service.room.OooO00o.f24515OooO0o.OooO0Oo(webPageInfo2);
            } else {
                int i = WebActivity.f25130OooOoO0;
                WebActivity.OooO00o.OooO00o(o000OO.this.f47270OooO00o, webPageInfo2);
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
                int i = WebActivity.f25130OooOoO0;
                WebActivity.OooO00o.OooO00o(o000OO.this.f47270OooO00o, webPageInfo2);
            }
            return Unit.INSTANCE;
        }
    }

    public o000OO(@NotNull MixedRoomActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f47270OooO00o = activity;
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
            o0000O00.OooO0O0("GiftBackPack：type = 1001003, backPackGift Send = ".concat(OooO.OooO00o(builderNewBuilder)));
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
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
            RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
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
            RoomLiveService roomLiveService3 = RoomLiveService.f24596OooOo00;
            if (roomLiveService3 != null) {
                roomLiveService3.OooO0oo(1001002, builderNewBuilder3.build().toByteArray());
            }
        } else {
            GiftSendAllModel giftSendAllModel = new GiftSendAllModel(giftPropModel.getGiftId(), i, i2);
            o0000O00.OooO0O0("giftSendModel New = " + giftSendAllModel.toJSONString());
            RoomLiveService roomLiveService4 = RoomLiveService.f24596OooOo00;
            if (roomLiveService4 != null) {
                roomLiveService4.OooO0oO(1000100, oOOO00.OooO0OO(giftSendAllModel));
            }
        }
        LiveEventBus.get("SendGiftSuccess").post(giftPropModel);
        o00000OO o00000oo2 = this.f47271OooO0O0;
        if (o00000oo2 != null) {
            o00000oo2.OooO0OO();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(@Nullable RoomUserInfoModel user, int i, int i2, boolean z) {
        Map<Integer, GiftPropModel> value;
        o0O0oo0o.OooO00o().OooO0o("FIRST_SEND_GIFT", false);
        ((MutableLiveData) com.yalla.yalla.service.room.OooO00o.f24527OooOOo0.f48619OooO00o.getValue()).postValue(Boolean.FALSE);
        o00000OO o00000oo2 = this.f47271OooO0O0;
        MixedRoomActivity mixedRoomActivity = this.f47270OooO00o;
        if (o00000oo2 == null) {
            this.f47271OooO0O0 = new o00000OO(mixedRoomActivity, o00OO.f51039OooO00o, GiftPropTypeShow.InRoom);
        }
        o00000OO o00000oo3 = this.f47271OooO0O0;
        if (o00000oo3 != null) {
            o00000oo3.f50962OooOO0O = new OooO00o(o00000oo3);
            o00000oo3.f50963OooOO0o = new OooO0O0();
            o00000oo3.f50965OooOOO0 = new OooO0OO();
            if (user != null) {
                Intrinsics.checkNotNullParameter(user, "user");
                o00000oo3.OooOoOO(user);
            }
            if (i2 > 0) {
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oo0o0Oo.f43573OooO00o;
                oo0o0Oo.OooO0Oo(false);
                List<GiftPropAll> value2 = oo0o0Oo.f43576OooO0Oo.getValue();
                GiftPropModel giftPropModel = null;
                if (value2 == null || value2.isEmpty()) {
                    o00O0OOO o00o0ooo2 = o00O0OOO.f51038OooO0Oo;
                    if (o00o0ooo2 != null) {
                        o00o0ooo2.invoke();
                    }
                } else {
                    GiftPropModel giftPropModel2 = (!z || (value = oo0o0Oo.f43574OooO0O0.getValue()) == null) ? null : value.get(Integer.valueOf(i2));
                    if (giftPropModel2 == null) {
                        Map<Integer, GiftPropModel> value3 = oo0o0Oo.f43573OooO00o.getValue();
                        if (value3 != null) {
                            giftPropModel = value3.get(Integer.valueOf(i2));
                        }
                    } else {
                        giftPropModel = giftPropModel2;
                    }
                }
                if (giftPropModel != null) {
                    o00000oo3.f50968OooOOo = giftPropModel;
                    if (i > 0) {
                        o00000oo3.f50967OooOOOo = i;
                    }
                }
            }
            o00000oo3.OooOO0o();
            LiveEventBus.get("RoomMessageBox_Dismiss").post(Boolean.TRUE);
            LinearLayout linearLayout = o00000oo3.f38489OooO0OO;
            oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (!oo0ooo0oOooO0o0.OooO0O0("roomGift" + o0O00oO0.OooOOo0().getValue(), false) || mixedRoomActivity.isFinishing()) {
                return;
            }
            com.yalla.yalla.ui.view.tips.OooO00o oooO00o = new com.yalla.yalla.ui.view.tips.OooO00o(mixedRoomActivity);
            linearLayout.getViewTreeObserver().addOnPreDrawListener(new oO0OO0O(oooO00o, linearLayout));
            o000O0Oo.OooO0OO(oooO00o);
            oO0OOo0o oo0ooo0oOooO0o1 = o00Ooo.OooO0o0();
            oo0ooo0oOooO0o1.getClass();
            o0000O0O.OooO0O0("roomGift", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o1, false);
        }
    }
}
