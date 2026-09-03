package com.yalla.yalla.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.api.old.service.WalletService;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.model.HuaWeiSubscribeRequestModel;
import com.yalla.yalla.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.model.RechargeMenuErrorModel;
import com.yalla.yalla.model.RechargeMenuModel;
import com.yalla.yalla.model.RechargeMenuType;
import com.yalla.yalla.model.VipCreateOrderResultModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.util.PaySupportChannels;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039OoooOoo.o00O0OO0;
import p382o0OOoOo.o00oO0o;
import p382o0OOoOo.o0ooOOo;
import p382o0OOoOo.oo000o;
import p410o0Oo0Oo0.o00O0O;
import p439o0OoOOo0.o000O;
import p474o0OoooOO.oo0oO0;
import p587o0oOooO.oO000OOo;
import p587o0oOooO.oOo00o0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nWalletRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletRepo.kt\ncom/yalla/yalla/repository/WalletRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 5 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,339:1\n62#2:340\n62#2:345\n62#2:580\n1855#3:341\n1855#3,2:342\n1856#3:344\n18#4,7:346\n25#4,10:354\n18#4,7:364\n25#4,10:372\n18#4,7:382\n25#4,10:390\n18#4,7:400\n25#4,10:408\n18#4,7:418\n25#4,10:426\n18#4,7:436\n25#4,10:444\n18#4,7:454\n25#4,10:462\n18#4,7:472\n25#4,10:480\n18#4,7:490\n25#4,10:498\n18#4,7:508\n25#4,10:516\n18#4,7:526\n25#4,10:534\n18#4,7:544\n25#4,10:552\n18#4,7:562\n25#4,10:570\n109#5:353\n109#5:371\n109#5:389\n109#5:407\n109#5:425\n109#5:443\n109#5:461\n109#5:479\n109#5:497\n109#5:515\n109#5:533\n109#5:551\n109#5:569\n*S KotlinDebug\n*F\n+ 1 WalletRepo.kt\ncom/yalla/yalla/repository/WalletRepo\n*L\n38#1:340\n57#1:345\n337#1:580\n40#1:341\n41#1:342,2\n40#1:344\n63#1:346,7\n63#1:354,10\n75#1:364,7\n75#1:372,10\n87#1:382,7\n87#1:390,10\n99#1:400,7\n99#1:408,10\n161#1:418,7\n161#1:426,10\n173#1:436,7\n173#1:444,10\n181#1:454,7\n181#1:462,10\n209#1:472,7\n209#1:480,10\n216#1:490,7\n216#1:498,10\n258#1:508,7\n258#1:516,10\n270#1:526,7\n270#1:534,10\n282#1:544,7\n282#1:552,10\n302#1:562,7\n302#1:570,10\n63#1:353\n75#1:371\n87#1:389\n99#1:407\n161#1:425\n173#1:443\n181#1:461\n209#1:479\n216#1:497\n258#1:515\n270#1:533\n282#1:551\n302#1:569\n*E\n"})
public final class WalletRepo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final WalletRepo f24384OooO00o = new WalletRepo();

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {217}, m = "confirmRechargeOrderTapPay", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24385OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24386OooO0o;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24385OooO0Oo = obj;
            this.f24386OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0o0(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {3, 3, 4, 4, 6, 6, 7, 7}, l = {113, 118, 120, 125, 127, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 139, ZegoConstants.RoomError.SessionError, 144, Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED}, m = "confirmRechargeOrder", n = {"this", DeviceRequestsHelper.DEVICE_INFO_MODEL, "this", DeviceRequestsHelper.DEVICE_INFO_MODEL, "this", DeviceRequestsHelper.DEVICE_INFO_MODEL, "this", DeviceRequestsHelper.DEVICE_INFO_MODEL}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public WalletRepo f24388OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f24389OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public PayOrder f24390OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f24392OooO0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24389OooO0o = obj;
            this.f24392OooO0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO00o(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {164, 166}, m = "confirmRechargeOrderGoogle", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24393OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24394OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24393OooO0Oo = obj;
            this.f24394OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0O0(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {175}, m = "confirmRechargeOrderHuaWei", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24396OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24397OooO0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24396OooO0Oo = obj;
            this.f24397OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0OO(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {210}, m = "confirmRechargeOrderPayssion", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24399OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24400OooO0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24399OooO0Oo = obj;
            this.f24400OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0Oo(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {194}, m = "confirmSubscribeOrderHuaWei", n = {}, s = {})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24402OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24403OooO0o;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24402OooO0Oo = obj;
            this.f24403OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0o(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {307, 319}, m = "createOrderSubscribe", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24405OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24406OooO0o;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24405OooO0Oo = obj;
            this.f24406OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0oO(0, null, 0.0d, 0, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {81}, m = "createRechargeOrderHuaWei", n = {}, s = {})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24408OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24409OooO0o;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24408OooO0Oo = obj;
            this.f24409OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {69}, m = "createRechargeOrderGoogle", n = {}, s = {})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24411OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24412OooO0o;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24411OooO0Oo = obj;
            this.f24412OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0oo(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {93}, m = "createRechargeOrderPayssion", n = {}, s = {})
    public static final class OooOOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24414OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24415OooO0o;

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24414OooO0Oo = obj;
            this.f24415OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOO0(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {340}, m = "loadShopListChannel", n = {}, s = {})
    public static final class OooOo extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24417OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24418OooO0o;

        public OooOo(Continuation<? super OooOo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24417OooO0Oo = obj;
            this.f24418OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOOO0(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {105}, m = "createRechargeOrderTapPay", n = {}, s = {})
    public static final class OooOo00 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24420OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24421OooO0o;

        public OooOo00(Continuation<? super OooOo00> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24420OooO0Oo = obj;
            this.f24421OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOO0O(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {288}, m = "onConfirmOrderErrorUploadLog", n = {}, s = {})
    public static final class Oooo0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24423OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24424OooO0o;

        public Oooo0(Continuation<? super Oooo0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24423OooO0Oo = obj;
            this.f24424OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOOOo(null, null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {264}, m = "onBuyErrorUploadLog", n = {}, s = {})
    public static final class Oooo000 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24426OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24427OooO0o;

        public Oooo000(Continuation<? super Oooo000> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24426OooO0Oo = obj;
            this.f24427OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOOOO(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {276}, m = "onConsumptionErrorUploadLog", n = {}, s = {})
    public static final class o000oOoO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24433OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24434OooO0o;

        public o000oOoO(Continuation<? super o000oOoO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24433OooO0Oo = obj;
            this.f24434OooO0o |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOOo0(null, null, null, this);
        }
    }

    @Nullable
    public static Unit OooOO0o(@NotNull String str) {
        o00O0O.OooO00o().OooOoO().OooO00o(str);
        return Unit.INSTANCE;
    }

    @Nullable
    public static Object OooOOO(@NotNull Continuation continuation) {
        Intrinsics.checkNotNullParameter("/Webservers/Recharge/RechargeConfigList", "<this>");
        String url = oo000o.OooO0o0(4, "/Webservers/Recharge/RechargeConfigList");
        Intrinsics.checkNotNullParameter(url, "url");
        o0ooOOo o0ooooo = new o0ooOOo(url, 0);
        o0ooooo.OooO00o();
        o0ooooo.OooO0O0(Boxing.boxInt(2), "sources");
        return com.code.android.util.OooOOO.OooO0Oo(new WalletRepo$loadShopListGoogle$$inlined$call$1(o0ooooo, null), continuation);
    }

    @Nullable
    public static Unit OooOOo(@NotNull PayOrder payOrder) {
        o00O0O.OooO00o().OooOoO().OooO0OO(payOrder.getOrderId(), payOrder.getIsConsume());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO(@NotNull RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation) {
        OooOOO oooOOO;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i = oooOOO.f24409OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f24409OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        OooOOO oooOOO2 = oooOOO;
        Object objCreateRechargeOrderHuaWeiPay = oooOOO2.f24408OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO2.f24409OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateRechargeOrderHuaWeiPay);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                String strOooO0O0 = o000O.OooO0O0(string);
                String sku = rechargeMenuCreateOrderModel.getSku();
                String strValueOf = String.valueOf(rechargeMenuCreateOrderModel.getAmount());
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                String strOooO0OO = o000O.OooO0OO(oo0oO0.OooOOo0().getValue() + strValueOf, strOooO0O0);
                WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                String unit = rechargeMenuCreateOrderModel.getUnit();
                oooOOO2.f24409OooO0o = 1;
                objCreateRechargeOrderHuaWeiPay = walletServiceOooO00o.createRechargeOrderHuaWeiPay(strValueOf, strOooO0O0, sku, strOooO0OO, unit, oooOOO2);
                if (objCreateRechargeOrderHuaWeiPay == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateRechargeOrderHuaWeiPay);
            }
            return objCreateRechargeOrderHuaWeiPay;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x017d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0180  */
    /* JADX WARN: Code duplicated, block: B:110:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x0197  */
    /* JADX WARN: Code duplicated, block: B:116:0x019f  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:126:0x01bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:130:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x012a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:89:0x0142  */
    /* JADX WARN: Code duplicated, block: B:98:0x0166  */
    @Nullable
    public final Object OooO00o(@NotNull PayOrder payOrder, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation) {
        OooO00o oooO00o;
        WalletRepo walletRepo;
        WalletRepo walletRepo2;
        ApiResult apiResult;
        RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel;
        boolean z;
        Integer state;
        RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel2;
        boolean z2;
        Integer state2;
        RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel3;
        Integer state3;
        RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel4;
        boolean z3;
        Integer state4;
        RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel5;
        boolean z4;
        Integer state5;
        RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel6;
        Integer state6;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f24392OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f24392OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0O0 = oooO00o.f24389OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z5 = false;
        switch (oooO00o.f24392OooO0oo) {
            case 0:
                ResultKt.throwOnFailure(objOooO0O0);
                int type = payOrder.getType();
                if (type == PaySupportChannels.pay_type_googlePay.getNum()) {
                    oooO00o.f24392OooO0oo = 1;
                    objOooO0O0 = OooO0O0(payOrder, oooO00o);
                    return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
                }
                if (type == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                    if (payOrder.getIsSubscription()) {
                        oooO00o.f24392OooO0oo = 2;
                        objOooO0O0 = OooO0o(payOrder, oooO00o);
                        return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
                    }
                    oooO00o.f24392OooO0oo = 3;
                    objOooO0O0 = OooO0OO(payOrder, oooO00o);
                    return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
                }
                if (type == PaySupportChannels.pay_type_payssionPay.getNum()) {
                    oooO00o.f24388OooO0Oo = this;
                    oooO00o.f24390OooO0o0 = payOrder;
                    oooO00o.f24392OooO0oo = 4;
                    objOooO0O0 = OooO0Oo(payOrder, oooO00o);
                    if (objOooO0O0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    walletRepo2 = this;
                    apiResult = (ApiResult) objOooO0O0;
                    if (apiResult.isSuccess()) {
                        rechargeMenuConfirmOrderResultModel = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                        if (rechargeMenuConfirmOrderResultModel == null && (state = rechargeMenuConfirmOrderResultModel.getState()) != null && state.intValue() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            oooO00o.f24388OooO0Oo = walletRepo2;
                            oooO00o.f24390OooO0o0 = payOrder;
                            oooO00o.f24392OooO0oo = 5;
                            objOooO0O0 = walletRepo2.OooO0Oo(payOrder, oooO00o);
                            if (objOooO0O0 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            apiResult = (ApiResult) objOooO0O0;
                        }
                        if (apiResult.isSuccess()) {
                            rechargeMenuConfirmOrderResultModel3 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                            if (rechargeMenuConfirmOrderResultModel3 != null && (state3 = rechargeMenuConfirmOrderResultModel3.getState()) != null && state3.intValue() == 1) {
                                z5 = true;
                            }
                            if (!z5) {
                                apiResult.setCode(-103);
                            }
                        }
                        return apiResult;
                    }
                    if (apiResult.isSuccess()) {
                        rechargeMenuConfirmOrderResultModel2 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                        if (rechargeMenuConfirmOrderResultModel2 == null && (state2 = rechargeMenuConfirmOrderResultModel2.getState()) != null && state2.intValue() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            oooO00o.f24388OooO0Oo = null;
                            oooO00o.f24390OooO0o0 = null;
                            oooO00o.f24392OooO0oo = 6;
                            objOooO0O0 = walletRepo2.OooO0Oo(payOrder, oooO00o);
                            if (objOooO0O0 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            apiResult = (ApiResult) objOooO0O0;
                        }
                        return apiResult;
                    }
                    if (apiResult.isSuccess()) {
                        rechargeMenuConfirmOrderResultModel3 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                        if (rechargeMenuConfirmOrderResultModel3 != null) {
                            z5 = true;
                        }
                        if (!z5) {
                            apiResult.setCode(-103);
                        }
                    }
                    return apiResult;
                }
                if (type != PaySupportChannels.pay_type_tapPay.getNum()) {
                    oooO00o.f24392OooO0oo = 10;
                    objOooO0O0 = OooO0O0(payOrder, oooO00o);
                    return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
                }
                oooO00o.f24388OooO0Oo = this;
                oooO00o.f24390OooO0o0 = payOrder;
                oooO00o.f24392OooO0oo = 7;
                objOooO0O0 = OooO0o0(payOrder, oooO00o);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                walletRepo = this;
                apiResult = (ApiResult) objOooO0O0;
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel4 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel4 == null && (state4 = rechargeMenuConfirmOrderResultModel4.getState()) != null && state4.intValue() == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        oooO00o.f24388OooO0Oo = walletRepo;
                        oooO00o.f24390OooO0o0 = payOrder;
                        oooO00o.f24392OooO0oo = 8;
                        objOooO0O0 = walletRepo.OooO0o0(payOrder, oooO00o);
                        if (objOooO0O0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) objOooO0O0;
                    }
                    if (apiResult.isSuccess()) {
                        rechargeMenuConfirmOrderResultModel6 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                        if (rechargeMenuConfirmOrderResultModel6 != null && (state6 = rechargeMenuConfirmOrderResultModel6.getState()) != null && state6.intValue() == 1) {
                            z5 = true;
                        }
                        if (!z5) {
                            apiResult.setCode(-103);
                        }
                    }
                    return apiResult;
                }
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel5 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel5 == null && (state5 = rechargeMenuConfirmOrderResultModel5.getState()) != null && state5.intValue() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        oooO00o.f24388OooO0Oo = null;
                        oooO00o.f24390OooO0o0 = null;
                        oooO00o.f24392OooO0oo = 9;
                        objOooO0O0 = walletRepo.OooO0o0(payOrder, oooO00o);
                        if (objOooO0O0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) objOooO0O0;
                    }
                    return apiResult;
                }
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel6 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel6 != null) {
                        z5 = true;
                    }
                    if (!z5) {
                        apiResult.setCode(-103);
                    }
                }
                return apiResult;
            case 1:
                ResultKt.throwOnFailure(objOooO0O0);
            case 2:
                ResultKt.throwOnFailure(objOooO0O0);
            case 3:
                ResultKt.throwOnFailure(objOooO0O0);
            case 4:
                payOrder = oooO00o.f24390OooO0o0;
                walletRepo2 = oooO00o.f24388OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
                apiResult = (ApiResult) objOooO0O0;
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        oooO00o.f24388OooO0Oo = walletRepo2;
                        oooO00o.f24390OooO0o0 = payOrder;
                        oooO00o.f24392OooO0oo = 5;
                        objOooO0O0 = walletRepo2.OooO0Oo(payOrder, oooO00o);
                        if (objOooO0O0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) objOooO0O0;
                    }
                    if (apiResult.isSuccess()) {
                        rechargeMenuConfirmOrderResultModel3 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                        if (rechargeMenuConfirmOrderResultModel3 != null) {
                            z5 = true;
                        }
                        if (!z5) {
                            apiResult.setCode(-103);
                        }
                    }
                    return apiResult;
                }
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel2 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel2 == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        oooO00o.f24388OooO0Oo = null;
                        oooO00o.f24390OooO0o0 = null;
                        oooO00o.f24392OooO0oo = 6;
                        objOooO0O0 = walletRepo2.OooO0Oo(payOrder, oooO00o);
                        if (objOooO0O0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) objOooO0O0;
                    }
                    return apiResult;
                }
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel3 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel3 != null) {
                        z5 = true;
                    }
                    if (!z5) {
                        apiResult.setCode(-103);
                    }
                }
                return apiResult;
            case 5:
                payOrder = oooO00o.f24390OooO0o0;
                walletRepo2 = oooO00o.f24388OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
                apiResult = (ApiResult) objOooO0O0;
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel2 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel2 == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        oooO00o.f24388OooO0Oo = null;
                        oooO00o.f24390OooO0o0 = null;
                        oooO00o.f24392OooO0oo = 6;
                        objOooO0O0 = walletRepo2.OooO0Oo(payOrder, oooO00o);
                        if (objOooO0O0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) objOooO0O0;
                    }
                    return apiResult;
                }
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel3 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel3 != null) {
                        z5 = true;
                    }
                    if (!z5) {
                        apiResult.setCode(-103);
                    }
                }
                return apiResult;
            case 6:
                ResultKt.throwOnFailure(objOooO0O0);
                apiResult = (ApiResult) objOooO0O0;
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel3 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel3 != null) {
                        z5 = true;
                    }
                    if (!z5) {
                        apiResult.setCode(-103);
                    }
                }
                return apiResult;
            case 7:
                payOrder = oooO00o.f24390OooO0o0;
                walletRepo = oooO00o.f24388OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
                apiResult = (ApiResult) objOooO0O0;
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel4 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel4 == null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        oooO00o.f24388OooO0Oo = walletRepo;
                        oooO00o.f24390OooO0o0 = payOrder;
                        oooO00o.f24392OooO0oo = 8;
                        objOooO0O0 = walletRepo.OooO0o0(payOrder, oooO00o);
                        if (objOooO0O0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) objOooO0O0;
                    }
                    if (apiResult.isSuccess()) {
                        rechargeMenuConfirmOrderResultModel6 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                        if (rechargeMenuConfirmOrderResultModel6 != null) {
                            z5 = true;
                        }
                        if (!z5) {
                            apiResult.setCode(-103);
                        }
                    }
                    return apiResult;
                }
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel5 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel5 == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        oooO00o.f24388OooO0Oo = null;
                        oooO00o.f24390OooO0o0 = null;
                        oooO00o.f24392OooO0oo = 9;
                        objOooO0O0 = walletRepo.OooO0o0(payOrder, oooO00o);
                        if (objOooO0O0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) objOooO0O0;
                    }
                    return apiResult;
                }
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel6 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel6 != null) {
                        z5 = true;
                    }
                    if (!z5) {
                        apiResult.setCode(-103);
                    }
                }
                return apiResult;
            case 8:
                payOrder = oooO00o.f24390OooO0o0;
                walletRepo = oooO00o.f24388OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
                apiResult = (ApiResult) objOooO0O0;
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel5 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel5 == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        oooO00o.f24388OooO0Oo = null;
                        oooO00o.f24390OooO0o0 = null;
                        oooO00o.f24392OooO0oo = 9;
                        objOooO0O0 = walletRepo.OooO0o0(payOrder, oooO00o);
                        if (objOooO0O0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) objOooO0O0;
                    }
                    return apiResult;
                }
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel6 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel6 != null) {
                        z5 = true;
                    }
                    if (!z5) {
                        apiResult.setCode(-103);
                    }
                }
                return apiResult;
            case 9:
                ResultKt.throwOnFailure(objOooO0O0);
                apiResult = (ApiResult) objOooO0O0;
                if (apiResult.isSuccess()) {
                    rechargeMenuConfirmOrderResultModel6 = (RechargeMenuConfirmOrderResultModel) apiResult.getData();
                    if (rechargeMenuConfirmOrderResultModel6 != null) {
                        z5 = true;
                    }
                    if (!z5) {
                        apiResult.setCode(-103);
                    }
                }
                return apiResult;
            case 10:
                ResultKt.throwOnFailure(objOooO0O0);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0O0(@NotNull PayOrder payOrder, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f24394OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f24394OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        OooO0O0 oooO0O1 = oooO0O0;
        Object objConfirmSubscriptionOrderGoogle = oooO0O1.f24393OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O1.f24394OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objConfirmSubscriptionOrderGoogle);
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                String strOooO0Oo = o000O.OooO0Oo(oo0oO0.OooOOo0().getValue() + payOrder.getOrderId());
                if (payOrder.getIsSubscription()) {
                    WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                    String orderId = payOrder.getOrderId();
                    String sku = payOrder.getSku();
                    String purchaseToken = payOrder.getPurchaseToken();
                    oooO0O1.f24394OooO0o = 2;
                    objConfirmSubscriptionOrderGoogle = walletServiceOooO00o.confirmSubscriptionOrderGoogle(orderId, sku, purchaseToken, strOooO0Oo, oooO0O1);
                    if (objConfirmSubscriptionOrderGoogle == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    WalletService walletServiceOooO00o2 = p384o0OOoo.OooOO0O.OooO00o();
                    String orderId2 = payOrder.getOrderId();
                    String sku2 = payOrder.getSku();
                    String purchaseToken2 = payOrder.getPurchaseToken();
                    oooO0O1.f24394OooO0o = 1;
                    objConfirmSubscriptionOrderGoogle = walletServiceOooO00o2.confirmRechargeOrderGoogle(orderId2, sku2, purchaseToken2, strOooO0Oo, oooO0O1);
                    if (objConfirmSubscriptionOrderGoogle == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objConfirmSubscriptionOrderGoogle);
            }
            return objConfirmSubscriptionOrderGoogle;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            if (strOooO0oo == null) {
                strOooO0oo = "";
            }
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo);
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            if (strOooO0oo2 == null) {
                strOooO0oo2 = "";
            }
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2);
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            if (strOooO0oo3 == null) {
                strOooO0oo3 = "";
            }
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3);
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0OO(@NotNull PayOrder payOrder, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f24397OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f24397OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        OooO0OO oooO0OO2 = oooO0OO;
        Object objConfirmRechargeOrderHuaWei = oooO0OO2.f24396OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO2.f24397OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objConfirmRechargeOrderHuaWei);
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                String strOooO0Oo = o000O.OooO0Oo(oo0oO0.OooOOo0().getValue() + payOrder.getOrderId());
                WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                String orderId = payOrder.getOrderId();
                String sku = payOrder.getSku();
                String purchaseToken = payOrder.getPurchaseToken();
                oooO0OO2.f24397OooO0o = 1;
                objConfirmRechargeOrderHuaWei = walletServiceOooO00o.confirmRechargeOrderHuaWei(orderId, sku, purchaseToken, strOooO0Oo, oooO0OO2);
                if (objConfirmRechargeOrderHuaWei == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objConfirmRechargeOrderHuaWei);
            }
            return objConfirmRechargeOrderHuaWei;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            if (strOooO0oo == null) {
                strOooO0oo = "";
            }
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo);
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            if (strOooO0oo2 == null) {
                strOooO0oo2 = "";
            }
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2);
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            if (strOooO0oo3 == null) {
                strOooO0oo3 = "";
            }
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3);
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0Oo(@NotNull PayOrder payOrder, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f24400OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f24400OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objConfirmRechargeOrderPayssion = oooO0o.f24399OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f24400OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objConfirmRechargeOrderPayssion);
                WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                String orderId = payOrder.getOrderId();
                oooO0o.f24400OooO0o = 1;
                objConfirmRechargeOrderPayssion = walletServiceOooO00o.confirmRechargeOrderPayssion(orderId, oooO0o);
                if (objConfirmRechargeOrderPayssion == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objConfirmRechargeOrderPayssion);
            }
            return objConfirmRechargeOrderPayssion;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0o(@NotNull PayOrder payOrder, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation) {
        OooOO0 oooOO1;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f24403OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f24403OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        OooOO0 oooOO2 = oooOO1;
        Object objHuaWeiSubscribePremium = oooOO2.f24402OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO2.f24403OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objHuaWeiSubscribePremium);
                HuaWeiSubscribeRequestModel huaWeiSubscribeRequestModel = new HuaWeiSubscribeRequestModel();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                String strOooO0o0 = o000O.OooO0o0(oo0oO0.OooOOo0().getValue() + payOrder.getOrderId());
                huaWeiSubscribeRequestModel.setBuyType(0);
                huaWeiSubscribeRequestModel.setSign(strOooO0o0);
                huaWeiSubscribeRequestModel.setAccountFlag(payOrder.getHuaWeiAccountFlag());
                huaWeiSubscribeRequestModel.setOrderId(payOrder.getOrderId());
                huaWeiSubscribeRequestModel.setPurchaseToken(payOrder.getPurchaseToken());
                huaWeiSubscribeRequestModel.setProductId(payOrder.getSku());
                huaWeiSubscribeRequestModel.setSubOrderId(payOrder.getSubscriptionOrderId());
                huaWeiSubscribeRequestModel.setSubscriptionId(payOrder.getSubscriptionId());
                WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                String sign = huaWeiSubscribeRequestModel.getSign();
                int accountFlag = huaWeiSubscribeRequestModel.getAccountFlag();
                String orderId = huaWeiSubscribeRequestModel.getOrderId();
                String subOrderId = huaWeiSubscribeRequestModel.getSubOrderId();
                int buyType = huaWeiSubscribeRequestModel.getBuyType();
                String subscriptionId = huaWeiSubscribeRequestModel.getSubscriptionId();
                String purchaseToken = huaWeiSubscribeRequestModel.getPurchaseToken();
                String productId = huaWeiSubscribeRequestModel.getProductId();
                oooOO2.f24403OooO0o = 1;
                objHuaWeiSubscribePremium = walletServiceOooO00o.huaWeiSubscribePremium(sign, accountFlag, orderId, subOrderId, buyType, subscriptionId, purchaseToken, productId, 0, oooOO2);
                if (objHuaWeiSubscribePremium == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHuaWeiSubscribePremium);
            }
            return objHuaWeiSubscribePremium;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            if (strOooO0oo == null) {
                strOooO0oo = "";
            }
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo);
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            if (strOooO0oo2 == null) {
                strOooO0oo2 = "";
            }
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2);
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            if (strOooO0oo3 == null) {
                strOooO0oo3 = "";
            }
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3);
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0o0(@NotNull PayOrder payOrder, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f24386OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f24386OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objConfirmRechargeOrderTapPay = oooO.f24385OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f24386OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objConfirmRechargeOrderTapPay);
                WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                String orderId = payOrder.getOrderId();
                oooO.f24386OooO0o = 1;
                objConfirmRechargeOrderTapPay = walletServiceOooO00o.confirmRechargeOrderTapPay(orderId, oooO);
                if (objConfirmRechargeOrderTapPay == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objConfirmRechargeOrderTapPay);
            }
            return objConfirmRechargeOrderTapPay;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0oO(int i, @NotNull String str, double d, int i2, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ApiResult<VipCreateOrderResultModel>> continuation) {
        OooOO0O oooOO0O;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i3 = oooOO0O.f24406OooO0o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooOO0O.f24406OooO0o = i3 - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        OooOO0O oooOO0O2 = oooOO0O;
        Object objCreateOrderGoogleSubscribe = oooOO0O2.f24405OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooOO0O2.f24406OooO0o;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objCreateOrderGoogleSubscribe);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                String strOooO0O0 = o000O.OooO0O0(string);
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                Object value = oo0oO0.OooOOo0().getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                sb.append(d);
                String strOooO0OO = o000O.OooO0OO(sb.toString(), strOooO0O0);
                if (i2 == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                    WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                    oooOO0O2.f24406OooO0o = 1;
                    objCreateOrderGoogleSubscribe = walletServiceOooO00o.createOrderHuaWeiSubscribe(i, str, d, strOooO0O0, strOooO0OO, str2, str3, 5, oooOO0O2);
                    if (objCreateOrderGoogleSubscribe == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    WalletService walletServiceOooO00o2 = p384o0OOoo.OooOO0O.OooO00o();
                    oooOO0O2.f24406OooO0o = 2;
                    objCreateOrderGoogleSubscribe = walletServiceOooO00o2.createOrderGoogleSubscribe(i, str, d, strOooO0O0, strOooO0OO, str2, str3, oooOO0O2);
                    if (objCreateOrderGoogleSubscribe == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateOrderGoogleSubscribe);
            }
            return objCreateOrderGoogleSubscribe;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0oo(@NotNull RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation) {
        OooOOO0 oooOOO0;
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i = oooOOO0.f24412OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f24412OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(continuation);
        }
        OooOOO0 oooOOO1 = oooOOO0;
        Object objCreateRechargeOrderGoogle = oooOOO1.f24411OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO1.f24412OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateRechargeOrderGoogle);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                String strOooO0O0 = o000O.OooO0O0(string);
                String sku = rechargeMenuCreateOrderModel.getSku();
                String strValueOf = String.valueOf(rechargeMenuCreateOrderModel.getAmount());
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                String strOooO0OO = o000O.OooO0OO(oo0oO0.OooOOo0().getValue() + strValueOf, strOooO0O0);
                WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                String unit = rechargeMenuCreateOrderModel.getUnit();
                oooOOO1.f24412OooO0o = 1;
                objCreateRechargeOrderGoogle = walletServiceOooO00o.createRechargeOrderGoogle(strValueOf, strOooO0O0, sku, strOooO0OO, unit, oooOOO1);
                if (objCreateRechargeOrderGoogle == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateRechargeOrderGoogle);
            }
            return objCreateRechargeOrderGoogle;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOO0(@NotNull RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation) {
        OooOOOO oooOOOO;
        if (continuation instanceof OooOOOO) {
            oooOOOO = (OooOOOO) continuation;
            int i = oooOOOO.f24415OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f24415OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(continuation);
            }
        } else {
            oooOOOO = new OooOOOO(continuation);
        }
        OooOOOO oooOOOO2 = oooOOOO;
        Object objCreateRechargeOrderPayssion = oooOOOO2.f24414OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOOO2.f24415OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateRechargeOrderPayssion);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                String strOooO0O0 = o000O.OooO0O0(string);
                String sku = rechargeMenuCreateOrderModel.getSku();
                String strValueOf = String.valueOf(rechargeMenuCreateOrderModel.getAmount());
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                String str = oo0oO0.OooOOo0().getValue() + strValueOf;
                String strOooO0OO = o000O.OooO0OO(str, strOooO0O0);
                WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                String pmId = rechargeMenuCreateOrderModel.getPmId();
                oooOOOO2.f24415OooO0o = 1;
                objCreateRechargeOrderPayssion = walletServiceOooO00o.createRechargeOrderPayssion(strValueOf, pmId, strOooO0O0, sku, strOooO0OO, str, oooOOOO2);
                if (objCreateRechargeOrderPayssion == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateRechargeOrderPayssion);
            }
            return objCreateRechargeOrderPayssion;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOO0O(@NotNull RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation) {
        OooOo00 oooOo00;
        if (continuation instanceof OooOo00) {
            oooOo00 = (OooOo00) continuation;
            int i = oooOo00.f24421OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f24421OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(continuation);
            }
        } else {
            oooOo00 = new OooOo00(continuation);
        }
        OooOo00 oooOo01 = oooOo00;
        Object objCreateRechargeOrderTapPay = oooOo01.f24420OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo01.f24421OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateRechargeOrderTapPay);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                String strOooO0O0 = o000O.OooO0O0(string);
                String sku = rechargeMenuCreateOrderModel.getSku();
                String strValueOf = String.valueOf(rechargeMenuCreateOrderModel.getAmount());
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                String strOooO0OO = o000O.OooO0OO(oo0oO0.OooOOo0().getValue() + strValueOf, strOooO0O0);
                WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                oooOo01.f24421OooO0o = 1;
                objCreateRechargeOrderTapPay = walletServiceOooO00o.createRechargeOrderTapPay(strValueOf, strOooO0O0, sku, strOooO0OO, oooOo01);
                if (objCreateRechargeOrderTapPay == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreateRechargeOrderTapPay);
            }
            return objCreateRechargeOrderTapPay;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOOO0(@Nullable String str, @NotNull Continuation<? super ApiResult<RechargeMenuModel>> continuation) {
        OooOo oooOo;
        List<RechargeMenuType> data;
        if (continuation instanceof OooOo) {
            oooOo = (OooOo) continuation;
            int i = oooOo.f24418OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f24418OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(continuation);
            }
        } else {
            oooOo = new OooOo(continuation);
        }
        Object objOooO0Oo = oooOo.f24417OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo.f24418OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            Intrinsics.checkNotNullParameter("/Webservers/Recharge/RechargeConfigListAll", "<this>");
            String url = oo000o.OooO0o0(4, "/Webservers/Recharge/RechargeConfigListAll");
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO00o();
            o0ooooo.OooO0O0(Boxing.boxInt(2), "sources");
            o0ooooo.OooO0O0(str, "countryid");
            o0ooooo.OooO0O0(oO000OOo.OooO00o(oO000OOo.f56671OooO00o), "appChannelStr");
            o0ooooo.OooO0O0(Boxing.boxInt(0), "isGoogle");
            WalletRepo$loadShopListChannel$$inlined$call$1 walletRepo$loadShopListChannel$$inlined$call$1 = new WalletRepo$loadShopListChannel$$inlined$call$1(o0ooooo, null);
            oooOo.f24418OooO0o = 1;
            objOooO0Oo = com.code.android.util.OooOOO.OooO0Oo(walletRepo$loadShopListChannel$$inlined$call$1, oooOo);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        RechargeMenuModel rechargeMenuModel = (RechargeMenuModel) apiResult.getData();
        if (rechargeMenuModel != null && (data = rechargeMenuModel.getData()) != null) {
            for (RechargeMenuType rechargeMenuType : data) {
                Iterator<T> it = rechargeMenuType.getShoplist().iterator();
                while (it.hasNext()) {
                    ((RechargeMenuType) it.next()).setPmId(rechargeMenuType.getPm_id());
                }
            }
        }
        return apiResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOOOO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ApiResult<String>> continuation) {
        Oooo000 oooo000;
        if (continuation instanceof Oooo000) {
            oooo000 = (Oooo000) continuation;
            int i = oooo000.f24427OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f24427OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(continuation);
            }
        } else {
            oooo000 = new Oooo000(continuation);
        }
        Object objUploadLogPayError = oooo000.f24426OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo000.f24427OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUploadLogPayError);
                RechargeMenuErrorModel rechargeMenuErrorModel = new RechargeMenuErrorModel(str3 + " BuyFailed", 0, 0L, 6, null);
                rechargeMenuErrorModel.setOrderId(str);
                rechargeMenuErrorModel.setSku(str2);
                WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                String string = rechargeMenuErrorModel.toString();
                oooo000.f24427OooO0o = 1;
                objUploadLogPayError = walletServiceOooO00o.uploadLogPayError(string, oooo000);
                if (objUploadLogPayError == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUploadLogPayError);
            }
            return objUploadLogPayError;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOOOo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull Continuation<? super ApiResult<String>> continuation) {
        Oooo0 oooo0;
        if (continuation instanceof Oooo0) {
            oooo0 = (Oooo0) continuation;
            int i2 = oooo0.f24424OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooo0.f24424OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(continuation);
            }
        } else {
            oooo0 = new Oooo0(continuation);
        }
        Object objUploadLogPayError = oooo0.f24423OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooo0.f24424OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objUploadLogPayError);
                RechargeMenuErrorModel rechargeMenuErrorModel = new RechargeMenuErrorModel(str3 + " OnAppConfirmOrderFailed", i, 0L, 4, null);
                rechargeMenuErrorModel.setOrderId(str);
                rechargeMenuErrorModel.setSku(str2);
                WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                String strOooO00o = oOo00o0o.OooO00o(rechargeMenuErrorModel);
                oooo0.f24424OooO0o = 1;
                objUploadLogPayError = walletServiceOooO00o.uploadLogPayError(strOooO00o, oooo0);
                if (objUploadLogPayError == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUploadLogPayError);
            }
            return objUploadLogPayError;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOOo0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ApiResult<String>> continuation) {
        o000oOoO o000oooo2;
        if (continuation instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) continuation;
            int i = o000oooo2.f24434OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oooo2.f24434OooO0o = i - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(continuation);
            }
        } else {
            o000oooo2 = new o000oOoO(continuation);
        }
        Object objUploadLogPayError = o000oooo2.f24433OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000oooo2.f24434OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUploadLogPayError);
                RechargeMenuErrorModel rechargeMenuErrorModel = new RechargeMenuErrorModel(str3 + " ConsumptionFailed", 0, 0L, 6, null);
                rechargeMenuErrorModel.setOrderId(str);
                rechargeMenuErrorModel.setSku(str2);
                WalletService walletServiceOooO00o = p384o0OOoo.OooOO0O.OooO00o();
                String string = rechargeMenuErrorModel.toString();
                o000oooo2.f24434OooO0o = 1;
                objUploadLogPayError = walletServiceOooO00o.uploadLogPayError(string, o000oooo2);
                if (objUploadLogPayError == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUploadLogPayError);
            }
            return objUploadLogPayError;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }
}
