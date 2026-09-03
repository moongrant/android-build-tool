package com.yalla.yalla.common.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.VipCreateOrderResultModel;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.common.api.service.WalletService;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.manager.googlepay.GooglePaySignOrMd5;
import com.yalla.yalla.common.manager.googlepay.PayError;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.HuaWeiSubscribeRequestModel;
import com.yalla.yalla.common.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.common.model.RechargeMenuErrorModel;
import com.yalla.yalla.common.model.RechargeMenuModel;
import com.yalla.yalla.common.model.RechargeMenuType;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.util.PaySupportChannels;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p486o0o000o0.o00000;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0OOO0o;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class WalletRepo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final WalletRepo f20785OooO00o = new WalletRepo();

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {210}, m = "confirmRechargeOrderTapPay", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20786Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20788Oooo0oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20786Oooo0o = obj;
            this.f20788Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0o0(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {3, 3, 4, 4, 6, 6, 7, 7}, l = {110, 114, 116, 120, 122, 125, 133, 135, 138, 146}, m = "confirmRechargeOrder", n = {"this", DeviceRequestsHelper.DEVICE_INFO_MODEL, "this", DeviceRequestsHelper.DEVICE_INFO_MODEL, "this", DeviceRequestsHelper.DEVICE_INFO_MODEL, "this", DeviceRequestsHelper.DEVICE_INFO_MODEL}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public WalletRepo f20790Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public PayOrder f20791Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f20792Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f20793OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20792Oooo0oo = obj;
            this.f20793OoooO00 |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO00o(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {Constants.ERR_MODULE_NOT_FOUND, 159}, m = "confirmRechargeOrderGoogle", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20794Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20796Oooo0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20794Oooo0o = obj;
            this.f20796Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0O0(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {168}, m = "confirmRechargeOrderHuaWei", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20797Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20799Oooo0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20797Oooo0o = obj;
            this.f20799Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0OO(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {IZegoLiveEventCallback.StreamEvent.RetryPlayStart}, m = "confirmRechargeOrderPayssion", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20800Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20802Oooo0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20800Oooo0o = obj;
            this.f20802Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0Oo(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {187}, m = "confirmSubscribeOrderHuaWei", n = {}, s = {})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20803Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20805Oooo0oo;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20803Oooo0o = obj;
            this.f20805Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0o(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {ShopVehicleListModel.VehicleTagType_Vip300, 311}, m = "createOrderSubscribe", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20806Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20808Oooo0oo;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20806Oooo0o = obj;
            this.f20808Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0oO(0, null, 0.0d, 0, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {78}, m = "createRechargeOrderHuaWei", n = {}, s = {})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20809Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20811Oooo0oo;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20809Oooo0o = obj;
            this.f20811Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {66}, m = "createRechargeOrderGoogle", n = {}, s = {})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20812Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20814Oooo0oo;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20812Oooo0o = obj;
            this.f20814Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooO0oo(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {90}, m = "createRechargeOrderPayssion", n = {}, s = {})
    public static final class OooOOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20815Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20817Oooo0oo;

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20815Oooo0o = obj;
            this.f20817Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOO0(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {332}, m = "loadShopListChannel", n = {}, s = {})
    public static final class OooOo extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20818Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20820Oooo0oo;

        public OooOo(Continuation<? super OooOo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20818Oooo0o = obj;
            this.f20820Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOO0o(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {102}, m = "createRechargeOrderTapPay", n = {}, s = {})
    public static final class OooOo00 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20821Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20823Oooo0oo;

        public OooOo00(Continuation<? super OooOo00> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20821Oooo0o = obj;
            this.f20823Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOO0O(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {281}, m = "onConfirmOrderErrorUploadLog", n = {}, s = {})
    public static final class Oooo0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20824Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20826Oooo0oo;

        public Oooo0(Continuation<? super Oooo0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20824Oooo0o = obj;
            this.f20826Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOOO(null, null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {257}, m = "onBuyErrorUploadLog", n = {}, s = {})
    public static final class Oooo000 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20827Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20829Oooo0oo;

        public Oooo000(Continuation<? super Oooo000> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20827Oooo0o = obj;
            this.f20829Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOOO0(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.WalletRepo", f = "WalletRepo.kt", i = {}, l = {269}, m = "onConsumptionErrorUploadLog", n = {}, s = {})
    public static final class o000oOoO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20834Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20836Oooo0oo;

        public o000oOoO(Continuation<? super o000oOoO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20834Oooo0o = obj;
            this.f20836Oooo0oo |= Integer.MIN_VALUE;
            return WalletRepo.this.OooOOOO(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO(@NotNull RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation) {
        OooOOO oooOOO;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i = oooOOO.f20811Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f20811Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        OooOOO oooOOO2 = oooOOO;
        Object objCreateRechargeOrderHuaWeiPay = oooOOO2.f20809Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO2.f20811Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateRechargeOrderHuaWeiPay);
                GooglePaySignOrMd5 googlePaySignOrMd5 = GooglePaySignOrMd5.INSTANCE;
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                String strMd5 = googlePaySignOrMd5.md5(string);
                String sku = rechargeMenuCreateOrderModel.getSku();
                String strValueOf = String.valueOf(rechargeMenuCreateOrderModel.getAmount());
                String strSignForOrder = googlePaySignOrMd5.signForOrder(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue() + strValueOf, strMd5);
                p484o0o000OO.OooOOO oooOOO3 = p484o0o000OO.OooOOO.f40882OooO00o;
                WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                String unit = rechargeMenuCreateOrderModel.getUnit();
                oooOOO2.f20811Oooo0oo = 1;
                objCreateRechargeOrderHuaWeiPay = walletServiceOooO0OO.createRechargeOrderHuaWeiPay(strValueOf, strMd5, sku, strSignForOrder, unit, oooOOO2);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
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
            int i = oooO00o.f20793OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f20793OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0O0 = oooO00o.f20792Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z5 = false;
        switch (oooO00o.f20793OoooO00) {
            case 0:
                ResultKt.throwOnFailure(objOooO0O0);
                int type = payOrder.getType();
                if (type == PaySupportChannels.pay_type_googlePay.getNum()) {
                    oooO00o.f20793OoooO00 = 1;
                    objOooO0O0 = OooO0O0(payOrder, oooO00o);
                    return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
                }
                if (type == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                    if (payOrder.getIsSubscription()) {
                        oooO00o.f20793OoooO00 = 2;
                        objOooO0O0 = OooO0o(payOrder, oooO00o);
                        return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
                    }
                    oooO00o.f20793OoooO00 = 3;
                    objOooO0O0 = OooO0OO(payOrder, oooO00o);
                    return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
                }
                if (type == PaySupportChannels.pay_type_payssionPay.getNum()) {
                    oooO00o.f20790Oooo0o = this;
                    oooO00o.f20791Oooo0oO = payOrder;
                    oooO00o.f20793OoooO00 = 4;
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
                            oooO00o.f20790Oooo0o = walletRepo2;
                            oooO00o.f20791Oooo0oO = payOrder;
                            oooO00o.f20793OoooO00 = 5;
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
                                apiResult.setCode(PayError.ERROR_UNKNOWN);
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
                            oooO00o.f20790Oooo0o = null;
                            oooO00o.f20791Oooo0oO = null;
                            oooO00o.f20793OoooO00 = 6;
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
                            apiResult.setCode(PayError.ERROR_UNKNOWN);
                        }
                    }
                    return apiResult;
                }
                if (type != PaySupportChannels.pay_type_tapPay.getNum()) {
                    oooO00o.f20793OoooO00 = 10;
                    objOooO0O0 = OooO0O0(payOrder, oooO00o);
                    return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
                }
                oooO00o.f20790Oooo0o = this;
                oooO00o.f20791Oooo0oO = payOrder;
                oooO00o.f20793OoooO00 = 7;
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
                        oooO00o.f20790Oooo0o = walletRepo;
                        oooO00o.f20791Oooo0oO = payOrder;
                        oooO00o.f20793OoooO00 = 8;
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
                            apiResult.setCode(PayError.ERROR_UNKNOWN);
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
                        oooO00o.f20790Oooo0o = null;
                        oooO00o.f20791Oooo0oO = null;
                        oooO00o.f20793OoooO00 = 9;
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
                        apiResult.setCode(PayError.ERROR_UNKNOWN);
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
                payOrder = oooO00o.f20791Oooo0oO;
                walletRepo2 = oooO00o.f20790Oooo0o;
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
                        oooO00o.f20790Oooo0o = walletRepo2;
                        oooO00o.f20791Oooo0oO = payOrder;
                        oooO00o.f20793OoooO00 = 5;
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
                            apiResult.setCode(PayError.ERROR_UNKNOWN);
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
                        oooO00o.f20790Oooo0o = null;
                        oooO00o.f20791Oooo0oO = null;
                        oooO00o.f20793OoooO00 = 6;
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
                        apiResult.setCode(PayError.ERROR_UNKNOWN);
                    }
                }
                return apiResult;
            case 5:
                payOrder = oooO00o.f20791Oooo0oO;
                walletRepo2 = oooO00o.f20790Oooo0o;
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
                        oooO00o.f20790Oooo0o = null;
                        oooO00o.f20791Oooo0oO = null;
                        oooO00o.f20793OoooO00 = 6;
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
                        apiResult.setCode(PayError.ERROR_UNKNOWN);
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
                        apiResult.setCode(PayError.ERROR_UNKNOWN);
                    }
                }
                return apiResult;
            case 7:
                payOrder = oooO00o.f20791Oooo0oO;
                walletRepo = oooO00o.f20790Oooo0o;
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
                        oooO00o.f20790Oooo0o = walletRepo;
                        oooO00o.f20791Oooo0oO = payOrder;
                        oooO00o.f20793OoooO00 = 8;
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
                            apiResult.setCode(PayError.ERROR_UNKNOWN);
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
                        oooO00o.f20790Oooo0o = null;
                        oooO00o.f20791Oooo0oO = null;
                        oooO00o.f20793OoooO00 = 9;
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
                        apiResult.setCode(PayError.ERROR_UNKNOWN);
                    }
                }
                return apiResult;
            case 8:
                payOrder = oooO00o.f20791Oooo0oO;
                walletRepo = oooO00o.f20790Oooo0o;
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
                        oooO00o.f20790Oooo0o = null;
                        oooO00o.f20791Oooo0oO = null;
                        oooO00o.f20793OoooO00 = 9;
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
                        apiResult.setCode(PayError.ERROR_UNKNOWN);
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
                        apiResult.setCode(PayError.ERROR_UNKNOWN);
                    }
                }
                return apiResult;
            case 10:
                ResultKt.throwOnFailure(objOooO0O0);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0O0(@NotNull PayOrder payOrder, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f20796Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f20796Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        OooO0O0 oooO0O1 = oooO0O0;
        Object objConfirmSubscriptionOrderGoogle = oooO0O1.f20794Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O1.f20796Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objConfirmSubscriptionOrderGoogle);
                String strSignForRecharge = GooglePaySignOrMd5.INSTANCE.signForRecharge(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue() + payOrder.getOrderId(), "");
                if (payOrder.getIsSubscription()) {
                    p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                    WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                    String orderId = payOrder.getOrderId();
                    String sku = payOrder.getSku();
                    String purchaseToken = payOrder.getPurchaseToken();
                    oooO0O1.f20796Oooo0oo = 2;
                    objConfirmSubscriptionOrderGoogle = walletServiceOooO0OO.confirmSubscriptionOrderGoogle(orderId, sku, purchaseToken, strSignForRecharge, oooO0O1);
                    if (objConfirmSubscriptionOrderGoogle == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    p484o0o000OO.OooOOO oooOOO2 = p484o0o000OO.OooOOO.f40882OooO00o;
                    WalletService walletServiceOooO0OO2 = p484o0o000OO.OooOOO.OooO0OO();
                    String orderId2 = payOrder.getOrderId();
                    String sku2 = payOrder.getSku();
                    String purchaseToken2 = payOrder.getPurchaseToken();
                    oooO0O1.f20796Oooo0oo = 1;
                    objConfirmSubscriptionOrderGoogle = walletServiceOooO0OO2.confirmRechargeOrderGoogle(orderId2, sku2, purchaseToken2, strSignForRecharge, oooO0O1);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0OO(@NotNull PayOrder payOrder, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f20799Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f20799Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        OooO0OO oooO0OO2 = oooO0OO;
        Object objConfirmRechargeOrderHuaWei = oooO0OO2.f20797Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO2.f20799Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objConfirmRechargeOrderHuaWei);
                String strSignForRecharge = GooglePaySignOrMd5.INSTANCE.signForRecharge(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue() + payOrder.getOrderId(), "");
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                String orderId = payOrder.getOrderId();
                String sku = payOrder.getSku();
                String purchaseToken = payOrder.getPurchaseToken();
                oooO0OO2.f20799Oooo0oo = 1;
                objConfirmRechargeOrderHuaWei = walletServiceOooO0OO.confirmRechargeOrderHuaWei(orderId, sku, purchaseToken, strSignForRecharge, oooO0OO2);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0Oo(@NotNull PayOrder payOrder, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f20802Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f20802Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objConfirmRechargeOrderPayssion = oooO0o.f20800Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f20802Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objConfirmRechargeOrderPayssion);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                String orderId = payOrder.getOrderId();
                oooO0o.f20802Oooo0oo = 1;
                objConfirmRechargeOrderPayssion = walletServiceOooO0OO.confirmRechargeOrderPayssion(orderId, oooO0o);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    @Nullable
    public final Object OooO0o(@NotNull PayOrder payOrder, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation) {
        OooOO0 oooOO1;
        String str;
        String str2;
        ?? r22;
        String str3;
        String str4;
        ?? r4;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f20805Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f20805Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        OooOO0 oooOO2 = oooOO1;
        Object objHuaWeiSubscribePremium = oooOO2.f20803Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO2.f20805Oooo0oo;
        ?? r15 = "WebAPIException";
        String str5 = "gson.toJson(model) ?: \"\"";
        String str6 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objHuaWeiSubscribePremium);
                HuaWeiSubscribeRequestModel huaWeiSubscribeRequestModel = new HuaWeiSubscribeRequestModel();
                String strSignForSubscriptionHuaWei = GooglePaySignOrMd5.INSTANCE.signForSubscriptionHuaWei(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue() + payOrder.getOrderId(), "");
                huaWeiSubscribeRequestModel.setBuyType(0);
                huaWeiSubscribeRequestModel.setSign(strSignForSubscriptionHuaWei);
                huaWeiSubscribeRequestModel.setAccountFlag(payOrder.getHuaWeiAccountFlag());
                huaWeiSubscribeRequestModel.setOrderId(payOrder.getOrderId());
                huaWeiSubscribeRequestModel.setPurchaseToken(payOrder.getPurchaseToken());
                huaWeiSubscribeRequestModel.setProductId(payOrder.getSku());
                huaWeiSubscribeRequestModel.setSubOrderId(payOrder.getSubscriptionOrderId());
                huaWeiSubscribeRequestModel.setSubscriptionId(payOrder.getSubscriptionId());
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                String sign = huaWeiSubscribeRequestModel.getSign();
                int accountFlag = huaWeiSubscribeRequestModel.getAccountFlag();
                String orderId = huaWeiSubscribeRequestModel.getOrderId();
                String subOrderId = huaWeiSubscribeRequestModel.getSubOrderId();
                int buyType = huaWeiSubscribeRequestModel.getBuyType();
                String subscriptionId = huaWeiSubscribeRequestModel.getSubscriptionId();
                String purchaseToken = huaWeiSubscribeRequestModel.getPurchaseToken();
                String productId = huaWeiSubscribeRequestModel.getProductId();
                oooOO2.f20805Oooo0oo = 1;
                str = "";
                str6 = productId;
                str2 = "gson.toJson(model) ?: \"\"";
                str5 = null;
                r22 = "WebAPIException";
                r15 = 256;
                try {
                    objHuaWeiSubscribePremium = walletServiceOooO0OO.huaWeiSubscribePremium(sign, accountFlag, orderId, subOrderId, buyType, subscriptionId, purchaseToken, str6, 0, oooOO2);
                    if (objHuaWeiSubscribePremium == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (IOException e) {
                    e = e;
                    str4 = str2;
                    r4 = r22;
                    ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), r4, 1, "time out");
                    o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                    if (strOooO0oo == null) {
                        strOooO0oo = str;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, str4);
                    }
                    Object objOooO0O0 = o0OOO0o.OooO0O0(strOooO0oo, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O0);
                    return objOooO0O0;
                } catch (CancellationException unused) {
                    str3 = str2;
                    ApiError apiError = new ApiError(3, "canceled");
                    o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
                    if (strOooO0oo2 == null) {
                        strOooO0oo2 = str;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo2, str3);
                    }
                    Object objOooO0O1 = o0OOO0o.OooO0O0(strOooO0oo2, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O1);
                    return objOooO0O1;
                } catch (Exception e2) {
                    e = e2;
                    o00O00.OooO0o0(r22, e.getMessage());
                    e.printStackTrace();
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.getClass().getName();
                    }
                    Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                    ApiError apiError2 = new ApiError(2, message);
                    o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
                    if (strOooO0oo3 == null) {
                        strOooO0oo3 = str;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo3, str2);
                    }
                    Object objOooO0O2 = o0OOO0o.OooO0O0(strOooO0oo3, ApiResult.class);
                    Intrinsics.checkNotNull(objOooO0O2);
                    return objOooO0O2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHuaWeiSubscribePremium);
                r15 = r15;
            }
            return objHuaWeiSubscribePremium;
        } catch (IOException e3) {
            e = e3;
            str = str6;
            str4 = str5;
            r4 = r15;
        } catch (CancellationException unused2) {
            str = str6;
            str3 = str5;
        } catch (Exception e4) {
            e = e4;
            str = str6;
            str2 = str5;
            r22 = r15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0o0(@NotNull PayOrder payOrder, @NotNull Continuation<? super ApiResult<RechargeMenuConfirmOrderResultModel>> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f20788Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f20788Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objConfirmRechargeOrderTapPay = oooO.f20786Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f20788Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objConfirmRechargeOrderTapPay);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                String orderId = payOrder.getOrderId();
                oooO.f20788Oooo0oo = 1;
                objConfirmRechargeOrderTapPay = walletServiceOooO0OO.confirmRechargeOrderTapPay(orderId, oooO);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:47:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Class<com.yalla.yalla.common.model.ApiResult>] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    @Nullable
    public final Object OooO0oO(int i, @NotNull String str, double d, int i2, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ApiResult<VipCreateOrderResultModel>> continuation) {
        OooOO0O oooOO0O;
        Object obj;
        ?? r20;
        ?? r2;
        ?? r3;
        ?? r4;
        ?? r1;
        ?? r5;
        int i3;
        String message;
        String strOooO0oo;
        ?? r14;
        Object obj2;
        ?? r0;
        ?? r6 = ApiResult.class;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i4 = oooOO0O.f20808Oooo0oo;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                oooOO0O.f20808Oooo0oo = i4 - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object obj3 = oooOO0O.f20806Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = oooOO0O.f20808Oooo0oo;
        ?? r15 = "WebAPIException";
        Object obj4 = "gson.toJson(model) ?: \"\"";
        try {
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj3);
                GooglePaySignOrMd5 googlePaySignOrMd5 = GooglePaySignOrMd5.INSTANCE;
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                String strMd5 = googlePaySignOrMd5.md5(string);
                StringBuilder sb = new StringBuilder();
                sb.append(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue());
                sb.append(d);
                String strSignForOrder = googlePaySignOrMd5.signForOrder(sb.toString(), strMd5);
                try {
                    try {
                        if (i2 == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                            p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                            WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                            oooOO0O.f20808Oooo0oo = 1;
                            obj = "gson.toJson(model) ?: \"\"";
                            obj2 = null;
                            r20 = "WebAPIException";
                            OooOO0O oooOO0O2 = oooOO0O;
                            Object objCreateOrderHuaWeiSubscribe = walletServiceOooO0OO.createOrderHuaWeiSubscribe(i, str, d, strMd5, strSignForOrder, str2, str3, 5, oooOO0O2);
                            r6 = objCreateOrderHuaWeiSubscribe;
                            r14 = oooOO0O2;
                            if (objCreateOrderHuaWeiSubscribe == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            obj = "gson.toJson(model) ?: \"\"";
                            r20 = "WebAPIException";
                            p484o0o000OO.OooOOO oooOOO2 = p484o0o000OO.OooOOO.f40882OooO00o;
                            WalletService walletServiceOooO0OO2 = p484o0o000OO.OooOOO.OooO0OO();
                            i3 = 2;
                            r14 = 2;
                            try {
                                oooOO0O.f20808Oooo0oo = 2;
                                OooOO0O oooOO0O3 = oooOO0O;
                                Object objCreateOrderGoogleSubscribe = walletServiceOooO0OO2.createOrderGoogleSubscribe(i, str, d, strMd5, strSignForOrder, str2, str3, oooOO0O3);
                                r6 = objCreateOrderGoogleSubscribe;
                                obj2 = oooOO0O3;
                                obj = obj;
                                r20 = r20;
                                if (objCreateOrderGoogleSubscribe == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (Exception e) {
                                e = e;
                                o00O00.OooO0o0(r20, e.getMessage());
                                e.printStackTrace();
                                message = e.getMessage();
                                if (message == null) {
                                    message = e.getClass().getName();
                                }
                                Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                                ApiError apiError = new ApiError(i3, message);
                                o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                                strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiError);
                                if (strOooO0oo == null) {
                                    strOooO0oo = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(strOooO0oo, obj);
                                }
                                Object objOooO0O0 = o0OOO0o.OooO0O0(strOooO0oo, r6);
                                Intrinsics.checkNotNull(objOooO0O0);
                                return objOooO0O0;
                            }
                        }
                        r0 = r6;
                        r6 = r6;
                        obj4 = obj2;
                        r15 = r14;
                    } catch (Exception e2) {
                        e = e2;
                        i3 = 2;
                        o00O00.OooO0o0(r20, e.getMessage());
                        e.printStackTrace();
                        message = e.getMessage();
                        if (message == null) {
                            message = e.getClass().getName();
                        }
                        Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                        ApiError apiError2 = new ApiError(i3, message);
                        o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
                        strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiError2);
                        if (strOooO0oo == null) {
                            strOooO0oo = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(strOooO0oo, obj);
                        }
                        Object objOooO0O1 = o0OOO0o.OooO0O0(strOooO0oo, r6);
                        Intrinsics.checkNotNull(objOooO0O1);
                        return objOooO0O1;
                    }
                } catch (IOException e3) {
                    e = e3;
                    r3 = obj;
                    r4 = r20;
                    r5 = r6;
                    ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), r4, 1, "time out");
                    o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                    if (strOooO0oo2 == null) {
                        strOooO0oo2 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo2, r3);
                    }
                    Object objOooO0O2 = o0OOO0o.OooO0O0(strOooO0oo2, r5);
                    Intrinsics.checkNotNull(objOooO0O2);
                    return objOooO0O2;
                } catch (CancellationException unused) {
                    r2 = obj;
                    r1 = r6;
                    ApiError apiError3 = new ApiError(3, "canceled");
                    o0OOO0o o0ooo0o5 = o0OOO0o.f42120OooO00o;
                    String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError3);
                    if (strOooO0oo3 == null) {
                        strOooO0oo3 = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo3, r2);
                    }
                    Object objOooO0O3 = o0OOO0o.OooO0O0(strOooO0oo3, r1);
                    Intrinsics.checkNotNull(objOooO0O3);
                    return objOooO0O3;
                }
            } else {
                if (i5 != 1 && i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj3);
                r0 = obj3;
                r6 = r6;
                obj4 = obj4;
                r15 = r15;
            }
            return r0;
        } catch (IOException e4) {
            e = e4;
            r3 = obj4;
            r4 = r15;
            r5 = r6;
        } catch (CancellationException unused2) {
            r2 = obj4;
            r1 = r6;
        } catch (Exception e5) {
            e = e5;
            obj = obj4;
            r20 = r15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0oo(@NotNull RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation) {
        OooOOO0 oooOOO0;
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i = oooOOO0.f20814Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f20814Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(continuation);
        }
        OooOOO0 oooOOO1 = oooOOO0;
        Object objCreateRechargeOrderGoogle = oooOOO1.f20812Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO1.f20814Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateRechargeOrderGoogle);
                GooglePaySignOrMd5 googlePaySignOrMd5 = GooglePaySignOrMd5.INSTANCE;
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                String strMd5 = googlePaySignOrMd5.md5(string);
                String sku = rechargeMenuCreateOrderModel.getSku();
                String strValueOf = String.valueOf(rechargeMenuCreateOrderModel.getAmount());
                String strSignForOrder = googlePaySignOrMd5.signForOrder(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue() + strValueOf, strMd5);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                String unit = rechargeMenuCreateOrderModel.getUnit();
                oooOOO1.f20814Oooo0oo = 1;
                objCreateRechargeOrderGoogle = walletServiceOooO0OO.createRechargeOrderGoogle(strValueOf, strMd5, sku, strSignForOrder, unit, oooOOO1);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOO0(@NotNull RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation) {
        OooOOOO oooOOOO;
        if (continuation instanceof OooOOOO) {
            oooOOOO = (OooOOOO) continuation;
            int i = oooOOOO.f20817Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f20817Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(continuation);
            }
        } else {
            oooOOOO = new OooOOOO(continuation);
        }
        OooOOOO oooOOOO2 = oooOOOO;
        Object objCreateRechargeOrderPayssion = oooOOOO2.f20815Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOOO2.f20817Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateRechargeOrderPayssion);
                GooglePaySignOrMd5 googlePaySignOrMd5 = GooglePaySignOrMd5.INSTANCE;
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                String strMd5 = googlePaySignOrMd5.md5(string);
                String sku = rechargeMenuCreateOrderModel.getSku();
                String strValueOf = String.valueOf(rechargeMenuCreateOrderModel.getAmount());
                String str2 = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue() + strValueOf;
                String strSignForOrder = googlePaySignOrMd5.signForOrder(str2, strMd5);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                String pmId = rechargeMenuCreateOrderModel.getPmId();
                oooOOOO2.f20817Oooo0oo = 1;
                objCreateRechargeOrderPayssion = walletServiceOooO0OO.createRechargeOrderPayssion(strValueOf, pmId, strMd5, sku, strSignForOrder, str2, oooOOOO2);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOO0O(@NotNull RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, @NotNull Continuation<? super ApiResult<RechargeMenuCreateOrderResultModel>> continuation) {
        OooOo00 oooOo00;
        if (continuation instanceof OooOo00) {
            oooOo00 = (OooOo00) continuation;
            int i = oooOo00.f20823Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f20823Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(continuation);
            }
        } else {
            oooOo00 = new OooOo00(continuation);
        }
        OooOo00 oooOo01 = oooOo00;
        Object objCreateRechargeOrderTapPay = oooOo01.f20821Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo01.f20823Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateRechargeOrderTapPay);
                GooglePaySignOrMd5 googlePaySignOrMd5 = GooglePaySignOrMd5.INSTANCE;
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                String strMd5 = googlePaySignOrMd5.md5(string);
                String sku = rechargeMenuCreateOrderModel.getSku();
                String strValueOf = String.valueOf(rechargeMenuCreateOrderModel.getAmount());
                String strSignForOrder = googlePaySignOrMd5.signForOrder(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue() + strValueOf, strMd5);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                oooOo01.f20823Oooo0oo = 1;
                objCreateRechargeOrderTapPay = walletServiceOooO0OO.createRechargeOrderTapPay(strValueOf, strMd5, sku, strSignForOrder, oooOo01);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOO0o(@Nullable String str, @NotNull Continuation<? super ApiResult<RechargeMenuModel>> continuation) {
        OooOo oooOo;
        List<RechargeMenuType> data;
        if (continuation instanceof OooOo) {
            oooOo = (OooOo) continuation;
            int i = oooOo.f20820Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f20820Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(continuation);
            }
        } else {
            oooOo = new OooOo(continuation);
        }
        Object objOooO0OO = oooOo.f20818Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo.f20820Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0OO);
            o00000 o00000Var = o00000.f40902OooO00o;
            String url = o00000.f40903OooO0O0;
            Intrinsics.checkNotNullParameter(url, "url");
            o00O000o o00o000o2 = new o00O000o(url, 0);
            o00o000o2.OooO00o();
            o00o000o2.OooO0O0("sources", Boxing.boxInt(2));
            o00o000o2.OooO0O0("countryid", str);
            o00o000o2.OooO0O0("appChannelStr", p516o0o0O000.OooOo.f42064OooO00o.OooO00o());
            o00o000o2.OooO0O0("isGoogle", Boxing.boxInt(0));
            WalletRepo$loadShopListChannel$$inlined$call$1 walletRepo$loadShopListChannel$$inlined$call$1 = new WalletRepo$loadShopListChannel$$inlined$call$1(o00o000o2, null);
            oooOo.f20820Oooo0oo = 1;
            objOooO0OO = o0000O0.OooO0OO(walletRepo$loadShopListChannel$$inlined$call$1, oooOo);
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0OO);
        }
        ApiResult apiResult = (ApiResult) objOooO0OO;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOOO(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull Continuation<? super ApiResult<String>> continuation) {
        Oooo0 oooo0;
        if (continuation instanceof Oooo0) {
            oooo0 = (Oooo0) continuation;
            int i2 = oooo0.f20826Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooo0.f20826Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooo0 = new Oooo0(continuation);
            }
        } else {
            oooo0 = new Oooo0(continuation);
        }
        Object objUploadLogPayError = oooo0.f20824Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooo0.f20826Oooo0oo;
        String str4 = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objUploadLogPayError);
                RechargeMenuErrorModel rechargeMenuErrorModel = new RechargeMenuErrorModel(str3 + " OnAppConfirmOrderFailed", i, 0L, 4, null);
                rechargeMenuErrorModel.setOrderId(str);
                rechargeMenuErrorModel.setSku(str2);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                String strOooO0Oo = o0Oo0oo.OooO0Oo(rechargeMenuErrorModel);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "{\n                GsonCo…toJson(obj)\n            }");
                oooo0.f20826Oooo0oo = 1;
                objUploadLogPayError = walletServiceOooO0OO.uploadLogPayError(strOooO0Oo, oooo0);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOOO0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ApiResult<String>> continuation) {
        Oooo000 oooo000;
        if (continuation instanceof Oooo000) {
            oooo000 = (Oooo000) continuation;
            int i = oooo000.f20829Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f20829Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(continuation);
            }
        } else {
            oooo000 = new Oooo000(continuation);
        }
        Object objUploadLogPayError = oooo000.f20827Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo000.f20829Oooo0oo;
        String str4 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUploadLogPayError);
                RechargeMenuErrorModel rechargeMenuErrorModel = new RechargeMenuErrorModel(str3 + " BuyFailed", 0, 0L, 6, null);
                rechargeMenuErrorModel.setOrderId(str);
                rechargeMenuErrorModel.setSku(str2);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                String string = rechargeMenuErrorModel.toString();
                oooo000.f20829Oooo0oo = 1;
                objUploadLogPayError = walletServiceOooO0OO.uploadLogPayError(string, oooo000);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooOOOO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super ApiResult<String>> continuation) {
        o000oOoO o000oooo2;
        if (continuation instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) continuation;
            int i = o000oooo2.f20836Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oooo2.f20836Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(continuation);
            }
        } else {
            o000oooo2 = new o000oOoO(continuation);
        }
        Object objUploadLogPayError = o000oooo2.f20834Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000oooo2.f20836Oooo0oo;
        String str4 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUploadLogPayError);
                RechargeMenuErrorModel rechargeMenuErrorModel = new RechargeMenuErrorModel(str3 + " ConsumptionFailed", 0, 0L, 6, null);
                rechargeMenuErrorModel.setOrderId(str);
                rechargeMenuErrorModel.setSku(str2);
                p484o0o000OO.OooOOO oooOOO = p484o0o000OO.OooOOO.f40882OooO00o;
                WalletService walletServiceOooO0OO = p484o0o000OO.OooOOO.OooO0OO();
                String string = rechargeMenuErrorModel.toString();
                o000oooo2.f20836Oooo0oo = 1;
                objUploadLogPayError = walletServiceOooO0OO.uploadLogPayError(string, o000oooo2);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str4 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str4, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }
}
