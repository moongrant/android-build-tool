package p439o0OoOOo0;

import android.app.Activity;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.OooOOOO;
import com.android.billingclient.api.OooOo;
import com.android.billingclient.api.OooOo00;
import com.android.billingclient.api.Oooo000;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.o00Oo0;
import com.android.billingclient.api.o00Ooo;
import com.android.billingclient.api.o0OOO0o;
import com.android.billingclient.api.o0ooOOo;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.NativeProtocol;
import com.qiniu.android.http.ResponseInfo;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.manager.unBlur.GooglePaySubscriptionModel;
import com.yalla.yalla.model.RechargeMenuPayBuyResultModel;
import com.yalla.yalla.model.RechargeMenuToPayModel;
import com.yalla.yalla.util.PaySupportChannels;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o000OOo;
import p587o0oOooO.oO00000o;
import p587o0oOooO.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGooglePayManagerV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n314#2,11:379\n1855#3:390\n1855#3,2:391\n1856#3:393\n*S KotlinDebug\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4\n*L\n73#1:379,11\n337#1:390\n347#1:391,2\n337#1:393\n*E\n"})
public class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Activity f47087OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f47088OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f47089OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final com.android.billingclient.api.OooO0o f47090OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function2<? super OooOo00, ? super List<? extends Purchase>, Unit> f47091OooO0o0;

    public static final class OooO implements Oooo000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Continuation<OooOo00> f47092OooO00o;

        public OooO(SafeContinuation safeContinuation) {
            this.f47092OooO00o = safeContinuation;
        }

        @Override // com.android.billingclient.api.Oooo000
        public final void OooO00o(@NotNull OooOo00 billingResult, @NotNull String str) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
            this.f47092OooO00o.resumeWith(Result.m4215constructorimpl(billingResult));
        }
    }

    public static final class OooO00o implements OooOOOO {
        public OooO00o() {
        }

        @Override // com.android.billingclient.api.OooOOOO
        public final void onBillingServiceDisconnected() {
            o000O00O.this.f47089OooO0OO = false;
        }

        @Override // com.android.billingclient.api.OooOOOO
        public final void onBillingSetupFinished(@NotNull OooOo00 billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            o000O00O.this.f47089OooO0OO = billingResult.f12757OooO00o == 0;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV4", f = "GooglePayManagerV4.kt", i = {0, 0, 0, 0, 1, 1}, l = {164, 186}, m = "buyV4", n = {"this", "orderId", DeviceRequestsHelper.DEVICE_INFO_MODEL, "subscription", "this", "subscription"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000O00O f47095OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public RechargeMenuToPayModel f47096OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f47097OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public GooglePaySubscriptionModel f47098OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f47099OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f47100OooOO0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47099OooO0oo = obj;
            this.f47100OooOO0 |= Integer.MIN_VALUE;
            return o000O00O.this.OooO00o(null, null, null, this);
        }
    }

    @SourceDebugExtension({"SMAP\nGooglePayManagerV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4$buyV4$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1855#2,2:379\n*S KotlinDebug\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4$buyV4$4$1\n*L\n200#1:379,2\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function2<OooOo00, List<? extends Purchase>, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Continuation<o00O0000<RechargeMenuPayBuyResultModel>> f47102OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ GooglePaySubscriptionModel f47103OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(GooglePaySubscriptionModel googlePaySubscriptionModel, SafeContinuation safeContinuation) {
            super(2);
            this.f47103OooO0o0 = googlePaySubscriptionModel;
            this.f47102OooO0o = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(OooOo00 oooOo00, List<? extends Purchase> list) {
            OooOo00 result = oooOo00;
            List<? extends Purchase> list2 = list;
            Intrinsics.checkNotNullParameter(result, "result");
            o000O00O.this.f47091OooO0o0 = null;
            int i = result.f12757OooO00o;
            Continuation<o00O0000<RechargeMenuPayBuyResultModel>> continuation = this.f47102OooO0o;
            if (i == 0) {
                GooglePaySubscriptionModel googlePaySubscriptionModel = this.f47103OooO0o0;
                if (googlePaySubscriptionModel != null && googlePaySubscriptionModel.f22945OooO0OO == GooglePaySubscriptionModel.Action.Downgrade) {
                    RechargeMenuPayBuyResultModel rechargeMenuPayBuyResultModel = new RechargeMenuPayBuyResultModel();
                    rechargeMenuPayBuyResultModel.setPurchaseToken("");
                    rechargeMenuPayBuyResultModel.setPurchaseState(1);
                    rechargeMenuPayBuyResultModel.setAcknowledged(false);
                    continuation.resumeWith(Result.m4215constructorimpl(new o00O0000(rechargeMenuPayBuyResultModel, null)));
                } else if (list2 == null || list2.isEmpty()) {
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m4215constructorimpl(new o00O0000(null, new o000OOo0(-104, o0000.OooO0OO(o000OOo.Pay_Purchases_Token_Is_Null)))));
                } else {
                    for (Purchase purchase : list2) {
                        RechargeMenuPayBuyResultModel rechargeMenuPayBuyResultModel2 = new RechargeMenuPayBuyResultModel();
                        String strOooO0OO = purchase.OooO0OO();
                        Intrinsics.checkNotNullExpressionValue(strOooO0OO, "getPurchaseToken(...)");
                        rechargeMenuPayBuyResultModel2.setPurchaseToken(strOooO0OO);
                        rechargeMenuPayBuyResultModel2.setPurchaseState(purchase.OooO0O0());
                        rechargeMenuPayBuyResultModel2.setAcknowledged(purchase.f12783OooO0OO.optBoolean("acknowledged", true));
                        continuation.resumeWith(Result.m4215constructorimpl(new o00O0000(rechargeMenuPayBuyResultModel2, null)));
                    }
                }
            } else if (i == 1) {
                Result.Companion companion2 = Result.INSTANCE;
                continuation.resumeWith(Result.m4215constructorimpl(new o00O0000(null, new o000OOo0(-106, o0000.OooO0OO(o000OOo.Pay_User_Cancelled_Payment)))));
            } else if (i != 7) {
                o00O0000 o00o0001 = new o00O0000(null, null);
                String str = result.f12758OooO0O0;
                Intrinsics.checkNotNullExpressionValue(str, "getDebugMessage(...)");
                o00o0001.f47169OooO0O0 = new o000OOo0(i, str);
                continuation.resumeWith(Result.m4215constructorimpl(o00o0001));
            } else {
                Result.Companion companion3 = Result.INSTANCE;
                continuation.resumeWith(Result.m4215constructorimpl(new o00O0000(null, new o000OOo0(-105, o0000.OooO0OO(o000OOo.Pay_Commodity_Already_Owned)))));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV4", f = "GooglePayManagerV4.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {263, 268, 275}, m = "consumeOrderV4", n = {"this", "payOrder", "this", NativeProtocol.WEB_DIALOG_PARAMS, "this", "payOrder", NativeProtocol.WEB_DIALOG_PARAMS}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000O00O f47104OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f47105OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f47106OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f47108OooO0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47105OooO0o = obj;
            this.f47108OooO0oo |= Integer.MIN_VALUE;
            return o000O00O.this.OooO0OO(null, this);
        }
    }

    public static final class OooOO0 implements com.android.billingclient.api.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ PayOrder f47109OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Continuation<OooOo00> f47110OooO0O0;

        public OooOO0(PayOrder payOrder, SafeContinuation safeContinuation) {
            this.f47109OooO00o = payOrder;
            this.f47110OooO0O0 = safeContinuation;
        }

        @Override // com.android.billingclient.api.OooO0OO
        public final void OooO00o(@NotNull OooOo00 billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            int subscriptionState = this.f47109OooO00o.getSubscriptionState();
            int value = GooglePaySubscriptionModel.Action.Downgrade.getValue();
            Continuation<OooOo00> continuation = this.f47110OooO0O0;
            if (subscriptionState != value) {
                continuation.resumeWith(Result.m4215constructorimpl(billingResult));
                return;
            }
            OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0();
            oooO00oOooO0O0.f12759OooO00o = 0;
            OooOo00 oooOo00OooO00o = oooO00oOooO0O0.OooO00o();
            Intrinsics.checkNotNullExpressionValue(oooOo00OooO00o, "build(...)");
            continuation.resumeWith(Result.m4215constructorimpl(oooOo00OooO00o));
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV4", f = "GooglePayManagerV4.kt", i = {0, 0, 0}, l = {114, 119}, m = "queryDetailsV4", n = {"this", "skuList", "isSubscription"}, s = {"L$0", "L$1", "Z$0"})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f47111OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000O00O f47112OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f47113OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public List f47114OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f47115OooO0oO;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47115OooO0oO = obj;
            this.f47111OooO |= Integer.MIN_VALUE;
            return o000O00O.this.OooO0Oo(null, false, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV4", f = "GooglePayManagerV4.kt", i = {0, 0, 1, 1, 1}, l = {328, 335}, m = "queryPurchasesV4", n = {"this", "isSubscription", "connected", "payOrderList", "isSubscription"}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f47117OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f47118OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f47119OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ArrayList f47120OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f47121OooO0oO;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47121OooO0oO = obj;
            this.f47117OooO |= Integer.MIN_VALUE;
            return o000O00O.this.OooO0o0(false, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV4$queryDetailsV4$2", f = "GooglePayManagerV4.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o00O0000<List<o000OO00>>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f47123OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo.OooO00o f47124OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0000<Boolean> f47126OooO0oO;

        @SourceDebugExtension({"SMAP\nGooglePayManagerV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4$queryDetailsV4$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1855#2,2:379\n*S KotlinDebug\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4$queryDetailsV4$2$1$1\n*L\n125#1:379,2\n*E\n"})
        public static final class OooO00o implements o0OOO0o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ Continuation<o00O0000<List<o000OO00>>> f47127OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ o00O0000<Boolean> f47128OooO0O0;

            public OooO00o(SafeContinuation safeContinuation, o00O0000 o00o0001) {
                this.f47127OooO00o = safeContinuation;
                this.f47128OooO0O0 = o00o0001;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object, java.util.ArrayList] */
            @Override // com.android.billingclient.api.o0OOO0o
            public final void onSkuDetailsResponse(@NotNull OooOo00 billingResult, @Nullable List<SkuDetails> list) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                int i = billingResult.f12757OooO00o;
                Continuation<o00O0000<List<o000OO00>>> continuation = this.f47127OooO00o;
                if (i != 0) {
                    o00O0000 o00o0001 = new o00O0000(null, null);
                    o00o0001.f47169OooO0O0 = this.f47128OooO0O0.f47169OooO0O0;
                    continuation.resumeWith(Result.m4215constructorimpl(o00o0001));
                    return;
                }
                o00O0000 o00o0002 = new o00O0000(null, null);
                ?? arrayList = new ArrayList();
                if (list != null) {
                    for (SkuDetails skuDetails : list) {
                        String strOptString = skuDetails.f12785OooO0O0.optString("productId");
                        Intrinsics.checkNotNullExpressionValue(strOptString, "getSku(...)");
                        o000OO00 o000oo01 = new o000OO00(strOptString);
                        String strValueOf = String.valueOf((skuDetails.OooO00o() / ((long) ResponseInfo.UnknownError)) / 100.0d);
                        StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null);
                        strValueOf.getClass();
                        o000oo01.f47160OooO0O0 = o0OoOo0.OooO0OO(strValueOf, 0.0d);
                        String strOooO0O0 = skuDetails.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(strOooO0O0, "getPriceCurrencyCode(...)");
                        Intrinsics.checkNotNullParameter(strOooO0O0, "<set-?>");
                        o000oo01.f47161OooO0OO = strOooO0O0;
                        o000oo01.f47162OooO0Oo = skuDetails;
                        o000oo01.f47163OooO0o0 = null;
                        arrayList.add(o000oo01);
                    }
                }
                o00o0002.f47168OooO00o = arrayList;
                p597o0oo00O.OooOOOO.OooO("GooglePay 商品详情 V4：querySkuDetailsAsync \npayResult = " + o00o0002 + ", \nskuDetailsContent = " + p187o00o00o0.OooO.OooO00o(list) + ", \ngooglePaySkuDetailsContent = " + p187o00o00o0.OooO.OooO00o(arrayList));
                continuation.resumeWith(Result.m4215constructorimpl(o00o0002));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o0ooOOo.OooO00o oooO00o, o00O0000<Boolean> o00o0001, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f47124OooO0o = oooO00o;
            this.f47126OooO0oO = o00o0001;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o000O00O.this.new OooOOO0(this.f47124OooO0o, this.f47126OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o00O0000<List<o000OO00>>> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f47123OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000O00O o000o00o2 = o000O00O.this;
                o0ooOOo.OooO00o oooO00o = this.f47124OooO0o;
                o00O0000<Boolean> o00o0001 = this.f47126OooO0oO;
                this.f47123OooO0Oo = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                o000o00o2.f47090OooO0Oo.OooO00o(oooO00o.OooO00o(), new OooO00o(safeContinuation, o00o0001));
                obj = safeContinuation.getOrThrow();
                if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public o000O00O(@NotNull Activity activity, long j) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f47087OooO00o = activity;
        this.f47088OooO0O0 = j;
        o00Ooo o00ooo2 = new o00Ooo() { // from class: o0OoOOo0.o000O00
            @Override // com.android.billingclient.api.o00Ooo
            public final void onPurchasesUpdated(OooOo00 result, List list) {
                o000O00O this$0 = this.f47086OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                Function2<? super OooOo00, ? super List<? extends Purchase>, Unit> function2 = this$0.f47091OooO0o0;
                if (function2 != null) {
                    function2.invoke(result, list);
                }
            }
        };
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        com.android.billingclient.api.OooO0o oooO0o = new com.android.billingclient.api.OooO0o(true, activity, o00ooo2);
        Intrinsics.checkNotNullExpressionValue(oooO0o, "build(...)");
        this.f47090OooO0Oo = oooO0o;
        if (p431o0OoOO.o00Ooo.OooO0O0(activity)) {
            oooO0o.OooO0o(new OooO00o());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO00o(@NotNull String str, @NotNull RechargeMenuToPayModel rechargeMenuToPayModel, @Nullable GooglePaySubscriptionModel googlePaySubscriptionModel, @NotNull Continuation<? super o00O0000<RechargeMenuPayBuyResultModel>> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        String str2;
        RechargeMenuToPayModel rechargeMenuToPayModel2;
        GooglePaySubscriptionModel googlePaySubscriptionModel2;
        Object objOooO0O0;
        o000O00O o000o00o2;
        int i;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i2 = oooO0O0.f47100OooOO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f47100OooOO0 = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object orThrow = oooO0O0.f47099OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0O0.f47100OooOO0;
        if (i3 != 0) {
            if (i3 == 1) {
                GooglePaySubscriptionModel googlePaySubscriptionModel3 = oooO0O0.f47098OooO0oO;
                RechargeMenuToPayModel rechargeMenuToPayModel3 = oooO0O0.f47096OooO0o;
                String str3 = (String) oooO0O0.f47097OooO0o0;
                o000o00o2 = oooO0O0.f47095OooO0Oo;
                ResultKt.throwOnFailure(orThrow);
                objOooO0O0 = orThrow;
                str2 = str3;
                googlePaySubscriptionModel2 = googlePaySubscriptionModel3;
                rechargeMenuToPayModel2 = rechargeMenuToPayModel3;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(orThrow);
            }
        }
        ResultKt.throwOnFailure(orThrow);
        if (rechargeMenuToPayModel.getSkuDetails() == null) {
            o00O0000 o00o0001 = new o00O0000(null, null);
            o00o0001.f47169OooO0O0 = new o000OOo0(-113, o0000.OooO0OO(o000OOo.Pay_Params_Is_Null));
            return o00o0001;
        }
        oooO0O0.f47095OooO0Oo = this;
        str2 = str;
        oooO0O0.f47097OooO0o0 = str2;
        rechargeMenuToPayModel2 = rechargeMenuToPayModel;
        oooO0O0.f47096OooO0o = rechargeMenuToPayModel2;
        googlePaySubscriptionModel2 = googlePaySubscriptionModel;
        oooO0O0.f47098OooO0oO = googlePaySubscriptionModel2;
        oooO0O0.f47100OooOO0 = 1;
        objOooO0O0 = OooO0O0(oooO0O0);
        if (objOooO0O0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        o000o00o2 = this;
        o00O0000 o00o0002 = (o00O0000) objOooO0O0;
        if (!Intrinsics.areEqual(o00o0002.f47168OooO00o, Boxing.boxBoolean(true))) {
            o00O0000 o00o0003 = new o00O0000(null, null);
            o00o0003.f47169OooO0O0 = o00o0002.f47169OooO0O0;
            return o00o0003;
        }
        BillingFlowParams.OooO00o oooO00o = new BillingFlowParams.OooO00o();
        String content = String.valueOf(o000o00o2.f47088OooO0O0);
        Intrinsics.checkNotNullParameter(content, "content");
        oooO00o.f12712OooO00o = Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(content, oO00OO0O.OooO00o(), oO00000o.f56665OooO00o, (String) null, 4, (Object) null));
        oooO00o.f12713OooO0O0 = str2;
        SkuDetails skuDetails = rechargeMenuToPayModel2.getSkuDetails();
        Intrinsics.checkNotNull(skuDetails);
        ArrayList arrayList = new ArrayList();
        arrayList.add(skuDetails);
        oooO00o.f12715OooO0Oo = arrayList;
        Intrinsics.checkNotNullExpressionValue(oooO00o, "setSkuDetails(...)");
        p597o0oo00O.OooOOOO.OooO0O0("GooglePay 购买订阅 V4 \nsubscription:" + googlePaySubscriptionModel2 + "\norderId:" + str2 + " \nskuDetail:" + rechargeMenuToPayModel2.getSkuDetails());
        if (googlePaySubscriptionModel2 != null && (!StringsKt.isBlank(googlePaySubscriptionModel2.f22943OooO00o)) && (!StringsKt.isBlank(googlePaySubscriptionModel2.f22944OooO0O0))) {
            String str4 = googlePaySubscriptionModel2.f22944OooO0O0;
            int i4 = GooglePaySubscriptionModel.OooO00o.$EnumSwitchMapping$0[googlePaySubscriptionModel2.f22945OooO0OO.ordinal()];
            if (i4 != 1) {
                i = i4 != 2 ? 1 : 4;
            } else {
                i = 2;
            }
            boolean z = (TextUtils.isEmpty(str4) && TextUtils.isEmpty(null)) ? false : true;
            boolean zIsEmpty = true ^ TextUtils.isEmpty(null);
            if (z && zIsEmpty) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!z && !zIsEmpty) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            BillingFlowParams.OooO0OO oooO0OO = new BillingFlowParams.OooO0OO();
            oooO0OO.f12721OooO00o = str4;
            oooO0OO.f12722OooO0O0 = i;
            BillingFlowParams.OooO0OO.OooO00o oooO00o2 = new BillingFlowParams.OooO0OO.OooO00o();
            oooO00o2.f12723OooO00o = oooO0OO.f12721OooO00o;
            oooO00o2.f12725OooO0OO = oooO0OO.f12722OooO0O0;
            oooO00o.f12716OooO0o0 = oooO00o2;
        }
        if (o000o00o2.f47090OooO0Oo.OooO0o0(o000o00o2.f47087OooO00o, oooO00o.OooO00o()).f12757OooO00o != 0) {
            o00O0000 o00o0004 = new o00O0000(null, null);
            o00o0004.f47169OooO0O0 = o00o0002.f47169OooO0O0;
            return o00o0004;
        }
        oooO0O0.f47095OooO0Oo = o000o00o2;
        oooO0O0.f47097OooO0o0 = googlePaySubscriptionModel2;
        oooO0O0.f47096OooO0o = null;
        oooO0O0.f47098OooO0oO = null;
        oooO0O0.f47100OooOO0 = 2;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(oooO0O0));
        o000o00o2.f47091OooO0o0 = o000o00o2.new OooO0OO(googlePaySubscriptionModel2, safeContinuation);
        orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(oooO0O0);
        }
        return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
    }

    @Nullable
    public final Object OooO0O0(@NotNull ContinuationImpl continuationImpl) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuationImpl), 1);
        cancellableContinuationImpl.initCancellability();
        if (p431o0OoOO.o00Ooo.OooO0O0(this.f47087OooO00o)) {
            boolean z = this.f47089OooO0OO;
            if (z) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m4215constructorimpl(new o00O0000(Boxing.boxBoolean(z), null)));
            } else {
                this.f47090OooO0Oo.OooO0o(new o000O0(this, cancellableContinuationImpl));
            }
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m4215constructorimpl(new o00O0000(Boxing.boxBoolean(false), new o000OOo0(-101, o0000.OooO0OO(o000OOo.Pay_SDK_Does_Not_Exist)))));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x010e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(@NotNull PayOrder payOrder, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        OooO0o oooO0o;
        o000O00O o000o00o2;
        OooOo00 oooOo00;
        int i;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i2 = oooO0o.f47108OooO0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0o.f47108OooO0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objOooO0O0 = oooO0o.f47105OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0o.f47108OooO0oo;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO0o.f47104OooO0Oo = this;
            oooO0o.f47106OooO0o0 = payOrder;
            oooO0o.f47108OooO0oo = 1;
            objOooO0O0 = OooO0O0(oooO0o);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            o000o00o2 = this;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    ResultKt.throwOnFailure(objOooO0O0);
                    oooOo00 = (OooOo00) objOooO0O0;
                    i = oooOo00.f12757OooO00o;
                    if (i != -3) {
                        if (i != 0) {
                        }
                    }
                    return null;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0O0);
                oooOo00 = (OooOo00) objOooO0O0;
                i = oooOo00.f12757OooO00o;
                if (i != -3 && i != 2 && i != -1) {
                    return i != 0 ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
                }
                return null;
            }
            payOrder = (PayOrder) oooO0o.f47106OooO0o0;
            o000o00o2 = oooO0o.f47104OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        if (Intrinsics.areEqual(((o00O0000) objOooO0O0).f47168OooO00o, Boxing.boxBoolean(true))) {
            if (payOrder.getIsSubscription()) {
                new com.android.billingclient.api.OooO0O0.OooO00o();
                String purchaseToken = payOrder.getPurchaseToken();
                if (purchaseToken == null) {
                    throw new IllegalArgumentException("Purchase token must be set");
                }
                com.android.billingclient.api.OooO0O0 oooO0O0 = new com.android.billingclient.api.OooO0O0(0);
                oooO0O0.f12729OooO00o = purchaseToken;
                Intrinsics.checkNotNullExpressionValue(oooO0O0, "build(...)");
                oooO0o.f47104OooO0Oo = o000o00o2;
                oooO0o.f47106OooO0o0 = payOrder;
                oooO0o.getClass();
                oooO0o.f47108OooO0oo = 3;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(oooO0o));
                o000o00o2.f47090OooO0Oo.OooO0O0(oooO0O0, new OooOO0(payOrder, safeContinuation));
                objOooO0O0 = safeContinuation.getOrThrow();
                if (objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(oooO0o);
                }
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOo00 = (OooOo00) objOooO0O0;
                i = oooOo00.f12757OooO00o;
                if (i != -3) {
                    if (i != 0) {
                    }
                }
            } else {
                new OooOo.OooO00o();
                String purchaseToken2 = payOrder.getPurchaseToken();
                if (purchaseToken2 == null) {
                    throw new IllegalArgumentException("Purchase token must be set");
                }
                OooOo oooOo = new OooOo(0);
                oooOo.f12756OooO00o = purchaseToken2;
                Intrinsics.checkNotNullExpressionValue(oooOo, "build(...)");
                oooO0o.f47104OooO0Oo = o000o00o2;
                oooO0o.f47106OooO0o0 = oooOo;
                oooO0o.f47108OooO0oo = 2;
                SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(oooO0o));
                o000o00o2.f47090OooO0Oo.OooO0OO(oooOo, new OooO(safeContinuation2));
                objOooO0O0 = safeContinuation2.getOrThrow();
                if (objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(oooO0o);
                }
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOo00 = (OooOo00) objOooO0O0;
                i = oooOo00.f12757OooO00o;
                if (i != -3) {
                    if (i != 0) {
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0Oo(@NotNull List<String> list, boolean z, @NotNull Continuation<? super o00O0000<List<o000OO00>>> continuation) throws Throwable {
        OooOO0O oooOO0O;
        o000O00O o000o00o2;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i = oooOO0O.f47111OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f47111OooO = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object objOooO0O0 = oooOO0O.f47115OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO0O.f47111OooO;
        if (i2 != 0) {
            if (i2 == 1) {
                z = oooOO0O.f47113OooO0o;
                list = oooOO0O.f47114OooO0o0;
                o000o00o2 = oooOO0O.f47112OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0O0);
            }
        }
        ResultKt.throwOnFailure(objOooO0O0);
        oooOO0O.f47112OooO0Oo = this;
        oooOO0O.f47114OooO0o0 = list;
        oooOO0O.f47113OooO0o = z;
        oooOO0O.f47111OooO = 1;
        objOooO0O0 = OooO0O0(oooOO0O);
        if (objOooO0O0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        o000o00o2 = this;
        o00O0000 o00o0001 = (o00O0000) objOooO0O0;
        if (!Intrinsics.areEqual(o00o0001.f47168OooO00o, Boxing.boxBoolean(true))) {
            o00O0000 o00o0002 = new o00O0000(null, null);
            o00o0002.f47169OooO0O0 = o00o0001.f47169OooO0O0;
            return o00o0002;
        }
        o0ooOOo.OooO00o oooO00o = new o0ooOOo.OooO00o(0);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "newBuilder(...)");
        oooO00o.f12866OooO0O0 = new ArrayList(list);
        oooO00o.f12865OooO00o = z ? "subs" : "inapp";
        CoroutineDispatcher io2 = Dispatchers.getIO();
        OooOOO0 oooOOO0 = o000o00o2.new OooOOO0(oooO00o, o00o0001, null);
        oooOO0O.f47112OooO0Oo = null;
        oooOO0O.f47114OooO0o0 = null;
        oooOO0O.f47111OooO = 2;
        objOooO0O0 = BuildersKt.withContext(io2, oooOOO0, oooOO0O);
        return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9 A[LOOP:1: B:51:0x00f3->B:53:0x00f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o0(boolean z, @NotNull Continuation<? super List<PayOrder>> continuation) throws Throwable {
        OooOOO oooOOO;
        o000O00O o000o00o2;
        o00O0000 o00o0001;
        ArrayList arrayList;
        ArrayList arrayList2;
        o00O0000 o00o0002;
        com.android.billingclient.api.OooO00o OooO00o2;
        String str;
        com.android.billingclient.api.OooO00o OooO00o3;
        String str2;
        boolean z2;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i = oooOOO.f47117OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f47117OooO = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        Object objOooO0O0 = oooOOO.f47121OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO.f47117OooO;
        if (i2 != 0) {
            if (i2 == 1) {
                z = oooOOO.f47119OooO0o;
                o000o00o2 = (o000O00O) oooOOO.f47118OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = oooOOO.f47119OooO0o;
                arrayList2 = oooOOO.f47120OooO0o0;
                o00o0002 = (o00O0000) oooOOO.f47118OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
            }
            for (Purchase purchase : ((o00Oo0) objOooO0O0).f12851OooO0O0) {
                OooO00o2 = purchase.OooO00o();
                if (OooO00o2 != null) {
                    str = OooO00o2.f12727OooO00o;
                } else {
                    str = null;
                }
                OooO00o3 = purchase.OooO00o();
                if (OooO00o3 != null) {
                    str2 = OooO00o3.f12728OooO0O0;
                } else {
                    str2 = null;
                }
                p597o0oo00O.OooOOOO.OooO0O0("GooglePay 补单V4 有丢单记录 accountId:" + str + " \torderId:" + str2);
                if (str == null) {
                    if (str2 != null || StringsKt.isBlank(str2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        ArrayList<String> arrayListOooO0Oo = purchase.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(arrayListOooO0Oo, "getSkus(...)");
                        for (String str3 : arrayListOooO0Oo) {
                            PayOrder payOrder = new PayOrder();
                            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                            payOrder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                            payOrder.setOrderId(str2);
                            Intrinsics.checkNotNull(str3);
                            payOrder.setSku(str3);
                            payOrder.setType(PaySupportChannels.pay_type_googlePay.getNum());
                            payOrder.setConsume(false);
                            String strOooO0OO = purchase.OooO0OO();
                            Intrinsics.checkNotNullExpressionValue(strOooO0OO, "getPurchaseToken(...)");
                            payOrder.setPurchaseToken(strOooO0OO);
                            JSONObject jSONObject = purchase.f12783OooO0OO;
                            payOrder.setCreateTime(jSONObject.optLong("purchaseTime"));
                            payOrder.setPurchaseState(purchase.OooO0O0());
                            payOrder.setAcknowledged(jSONObject.optBoolean("acknowledged", true));
                            payOrder.setSubscription(z);
                            payOrder.setSubscriptionState(0);
                            arrayList2.add(payOrder);
                        }
                    }
                }
            }
            o00o0001 = o00o0002;
            arrayList = arrayList2;
            p597o0oo00O.OooOOOO.OooO0O0("GooglePay 补单V4 数据 \n isSubscription:" + z + "\n connected:" + o00o0001 + "\n connected.data:" + o00o0001.f47168OooO00o + "\n payOrderList.size:" + arrayList.size() + " \npayOrderList:" + arrayList);
            return arrayList;
        }
        ResultKt.throwOnFailure(objOooO0O0);
        oooOOO.f47118OooO0Oo = this;
        oooOOO.f47119OooO0o = z;
        oooOOO.f47117OooO = 1;
        objOooO0O0 = OooO0O0(oooOOO);
        if (objOooO0O0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        o000o00o2 = this;
        o00o0001 = (o00O0000) objOooO0O0;
        arrayList = new ArrayList();
        if (Intrinsics.areEqual(o00o0001.f47168OooO00o, Boxing.boxBoolean(true))) {
            String str4 = z ? "subs" : "inapp";
            com.android.billingclient.api.OooO0o oooO0o = o000o00o2.f47090OooO0Oo;
            oooOOO.f47118OooO0Oo = o00o0001;
            oooOOO.f47120OooO0o0 = arrayList;
            oooOOO.f47119OooO0o = z;
            oooOOO.f47117OooO = 2;
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            oooO0o.OooOO0O(str4, new com.android.billingclient.api.OooOOO0(completableDeferredCompletableDeferred$default));
            Object objAwait = completableDeferredCompletableDeferred$default.await(oooOOO);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList2 = arrayList;
            o00o0002 = o00o0001;
            objOooO0O0 = objAwait;
            while (r15.hasNext()) {
                OooO00o2 = purchase.OooO00o();
                if (OooO00o2 != null) {
                    str = OooO00o2.f12727OooO00o;
                } else {
                    str = null;
                }
                OooO00o3 = purchase.OooO00o();
                if (OooO00o3 != null) {
                    str2 = OooO00o3.f12728OooO0O0;
                } else {
                    str2 = null;
                }
                p597o0oo00O.OooOOOO.OooO0O0("GooglePay 补单V4 有丢单记录 accountId:" + str + " \torderId:" + str2);
                if (str == null) {
                    if (str2 != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        ArrayList<String> arrayListOooO0Oo2 = purchase.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(arrayListOooO0Oo2, "getSkus(...)");
                        while (r7.hasNext()) {
                            PayOrder payOrder2 = new PayOrder();
                            oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                            payOrder2.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                            payOrder2.setOrderId(str2);
                            Intrinsics.checkNotNull(str3);
                            payOrder2.setSku(str3);
                            payOrder2.setType(PaySupportChannels.pay_type_googlePay.getNum());
                            payOrder2.setConsume(false);
                            String strOooO0OO2 = purchase.OooO0OO();
                            Intrinsics.checkNotNullExpressionValue(strOooO0OO2, "getPurchaseToken(...)");
                            payOrder2.setPurchaseToken(strOooO0OO2);
                            JSONObject jSONObject2 = purchase.f12783OooO0OO;
                            payOrder2.setCreateTime(jSONObject2.optLong("purchaseTime"));
                            payOrder2.setPurchaseState(purchase.OooO0O0());
                            payOrder2.setAcknowledged(jSONObject2.optBoolean("acknowledged", true));
                            payOrder2.setSubscription(z);
                            payOrder2.setSubscriptionState(0);
                            arrayList2.add(payOrder2);
                        }
                    }
                }
            }
            o00o0001 = o00o0002;
            arrayList = arrayList2;
        }
        p597o0oo00O.OooOOOO.OooO0O0("GooglePay 补单V4 数据 \n isSubscription:" + z + "\n connected:" + o00o0001 + "\n connected.data:" + o00o0001.f47168OooO00o + "\n payOrderList.size:" + arrayList.size() + " \npayOrderList:" + arrayList);
        return arrayList;
    }
}
