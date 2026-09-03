package p431o0OoOOOO;

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
import p427o0OoOO00.oo000o;
import p464o0Oooo.o000000O;
import p579o0oOoo.o0o0000;
import p579o0oOoo.oO000Oo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGooglePayManagerV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n314#2,11:379\n1855#3:390\n1855#3,2:391\n1856#3:393\n*S KotlinDebug\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4\n*L\n73#1:379,11\n337#1:390\n347#1:391,2\n337#1:393\n*E\n"})
public class o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Activity f45828OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f45829OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f45830OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final com.android.billingclient.api.OooO0o f45831OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function2<? super OooOo00, ? super List<? extends Purchase>, Unit> f45832OooO0o0;

    public static final class OooO implements Oooo000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Continuation<OooOo00> f45833OooO00o;

        public OooO(SafeContinuation safeContinuation) {
            this.f45833OooO00o = safeContinuation;
        }

        @Override // com.android.billingclient.api.Oooo000
        public final void OooO00o(@NotNull OooOo00 billingResult, @NotNull String str) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
            this.f45833OooO00o.resumeWith(Result.m4213constructorimpl(billingResult));
        }
    }

    public static final class OooO00o implements OooOOOO {
        public OooO00o() {
        }

        @Override // com.android.billingclient.api.OooOOOO
        public final void onBillingServiceDisconnected() {
            o00O.this.f45830OooO0OO = false;
        }

        @Override // com.android.billingclient.api.OooOOOO
        public final void onBillingSetupFinished(@NotNull OooOo00 billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            o00O.this.f45830OooO0OO = billingResult.f9655OooO00o == 0;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV4", f = "GooglePayManagerV4.kt", i = {0, 0, 0, 0, 1, 1}, l = {164, 186}, m = "buyV4", n = {"this", "orderId", DeviceRequestsHelper.DEVICE_INFO_MODEL, "subscription", "this", "subscription"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O f45836OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public RechargeMenuToPayModel f45837OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f45838OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public GooglePaySubscriptionModel f45839OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f45840OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f45841OooOO0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45840OooO0oo = obj;
            this.f45841OooOO0 |= Integer.MIN_VALUE;
            return o00O.this.OooO00o(null, null, null, this);
        }
    }

    @SourceDebugExtension({"SMAP\nGooglePayManagerV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4$buyV4$4$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1855#2,2:379\n*S KotlinDebug\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4$buyV4$4$1\n*L\n200#1:379,2\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function2<OooOo00, List<? extends Purchase>, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Continuation<o00OOO0O<RechargeMenuPayBuyResultModel>> f45843OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ GooglePaySubscriptionModel f45844OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(GooglePaySubscriptionModel googlePaySubscriptionModel, SafeContinuation safeContinuation) {
            super(2);
            this.f45844OooO0o0 = googlePaySubscriptionModel;
            this.f45843OooO0o = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(OooOo00 oooOo00, List<? extends Purchase> list) {
            OooOo00 result = oooOo00;
            List<? extends Purchase> list2 = list;
            Intrinsics.checkNotNullParameter(result, "result");
            o00O.this.f45832OooO0o0 = null;
            int i = result.f9655OooO00o;
            Continuation<o00OOO0O<RechargeMenuPayBuyResultModel>> continuation = this.f45843OooO0o;
            if (i == 0) {
                GooglePaySubscriptionModel googlePaySubscriptionModel = this.f45844OooO0o0;
                if (googlePaySubscriptionModel != null && googlePaySubscriptionModel.f23409OooO0OO == GooglePaySubscriptionModel.Action.Downgrade) {
                    RechargeMenuPayBuyResultModel rechargeMenuPayBuyResultModel = new RechargeMenuPayBuyResultModel();
                    rechargeMenuPayBuyResultModel.setPurchaseToken("");
                    rechargeMenuPayBuyResultModel.setPurchaseState(1);
                    rechargeMenuPayBuyResultModel.setAcknowledged(false);
                    continuation.resumeWith(Result.m4213constructorimpl(new o00OOO0O(rechargeMenuPayBuyResultModel, null)));
                } else if (list2 == null || list2.isEmpty()) {
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m4213constructorimpl(new o00OOO0O(null, new o00OOO00(-104, o0000.OooO0OO(oO00OOo0.Pay_Purchases_Token_Is_Null)))));
                } else {
                    for (Purchase purchase : list2) {
                        RechargeMenuPayBuyResultModel rechargeMenuPayBuyResultModel2 = new RechargeMenuPayBuyResultModel();
                        String strOooO0OO = purchase.OooO0OO();
                        Intrinsics.checkNotNullExpressionValue(strOooO0OO, "it.purchaseToken");
                        rechargeMenuPayBuyResultModel2.setPurchaseToken(strOooO0OO);
                        rechargeMenuPayBuyResultModel2.setPurchaseState(purchase.OooO0O0());
                        rechargeMenuPayBuyResultModel2.setAcknowledged(purchase.f9681OooO0OO.optBoolean("acknowledged", true));
                        continuation.resumeWith(Result.m4213constructorimpl(new o00OOO0O(rechargeMenuPayBuyResultModel2, null)));
                    }
                }
            } else if (i == 1) {
                Result.Companion companion2 = Result.INSTANCE;
                continuation.resumeWith(Result.m4213constructorimpl(new o00OOO0O(null, new o00OOO00(-106, o0000.OooO0OO(oO00OOo0.Pay_User_Cancelled_Payment)))));
            } else if (i != 7) {
                o00OOO0O o00ooo0o = new o00OOO0O(null, null);
                String str = result.f9656OooO0O0;
                Intrinsics.checkNotNullExpressionValue(str, "result.debugMessage");
                o00ooo0o.f45914OooO0O0 = new o00OOO00(i, str);
                continuation.resumeWith(Result.m4213constructorimpl(o00ooo0o));
            } else {
                Result.Companion companion3 = Result.INSTANCE;
                continuation.resumeWith(Result.m4213constructorimpl(new o00OOO0O(null, new o00OOO00(-105, o0000.OooO0OO(oO00OOo0.Pay_Commodity_Already_Owned)))));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV4", f = "GooglePayManagerV4.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {263, 268, 275}, m = "consumeOrderV4", n = {"this", "payOrder", "this", NativeProtocol.WEB_DIALOG_PARAMS, "this", "payOrder", NativeProtocol.WEB_DIALOG_PARAMS}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O f45845OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f45846OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f45847OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f45849OooO0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45846OooO0o = obj;
            this.f45849OooO0oo |= Integer.MIN_VALUE;
            return o00O.this.OooO0OO(null, this);
        }
    }

    public static final class OooOO0 implements com.android.billingclient.api.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ PayOrder f45850OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Continuation<OooOo00> f45851OooO0O0;

        public OooOO0(PayOrder payOrder, SafeContinuation safeContinuation) {
            this.f45850OooO00o = payOrder;
            this.f45851OooO0O0 = safeContinuation;
        }

        @Override // com.android.billingclient.api.OooO0OO
        public final void OooO00o(@NotNull OooOo00 billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            int subscriptionState = this.f45850OooO00o.getSubscriptionState();
            int value = GooglePaySubscriptionModel.Action.Downgrade.getValue();
            Continuation<OooOo00> continuation = this.f45851OooO0O0;
            if (subscriptionState != value) {
                continuation.resumeWith(Result.m4213constructorimpl(billingResult));
                return;
            }
            OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0();
            oooO00oOooO0O0.f9657OooO00o = 0;
            OooOo00 oooOo00OooO00o = oooO00oOooO0O0.OooO00o();
            Intrinsics.checkNotNullExpressionValue(oooOo00OooO00o, "newBuilder().apply {\n   …                }.build()");
            continuation.resumeWith(Result.m4213constructorimpl(oooOo00OooO00o));
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV4", f = "GooglePayManagerV4.kt", i = {0, 0, 0}, l = {114, 119}, m = "queryDetailsV4", n = {"this", "skuList", "isSubscription"}, s = {"L$0", "L$1", "Z$0"})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f45852OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O f45853OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f45854OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public List f45855OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f45856OooO0oO;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45856OooO0oO = obj;
            this.f45852OooO |= Integer.MIN_VALUE;
            return o00O.this.OooO0Oo(null, false, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV4", f = "GooglePayManagerV4.kt", i = {0, 0, 1, 1, 1}, l = {328, 335}, m = "queryPurchasesV4", n = {"this", "isSubscription", "connected", "payOrderList", "isSubscription"}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f45858OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f45859OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f45860OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ArrayList f45861OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f45862OooO0oO;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45862OooO0oO = obj;
            this.f45858OooO |= Integer.MIN_VALUE;
            return o00O.this.OooO0o0(false, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV4$queryDetailsV4$2", f = "GooglePayManagerV4.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o00OOO0O<List<o00OO>>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f45864OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo.OooO00o f45865OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOO0O<Boolean> f45867OooO0oO;

        @SourceDebugExtension({"SMAP\nGooglePayManagerV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4$queryDetailsV4$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1855#2,2:379\n*S KotlinDebug\n*F\n+ 1 GooglePayManagerV4.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV4$queryDetailsV4$2$1$1\n*L\n125#1:379,2\n*E\n"})
        public static final class OooO00o implements o0OOO0o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ Continuation<o00OOO0O<List<o00OO>>> f45868OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ o00OOO0O<Boolean> f45869OooO0O0;

            public OooO00o(SafeContinuation safeContinuation, o00OOO0O o00ooo0o) {
                this.f45868OooO00o = safeContinuation;
                this.f45869OooO0O0 = o00ooo0o;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object, java.util.ArrayList] */
            @Override // com.android.billingclient.api.o0OOO0o
            public final void onSkuDetailsResponse(@NotNull OooOo00 billingResult, @Nullable List<SkuDetails> list) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                int i = billingResult.f9655OooO00o;
                Continuation<o00OOO0O<List<o00OO>>> continuation = this.f45868OooO00o;
                if (i != 0) {
                    o00OOO0O o00ooo0o = new o00OOO0O(null, null);
                    o00ooo0o.f45914OooO0O0 = this.f45869OooO0O0.f45914OooO0O0;
                    continuation.resumeWith(Result.m4213constructorimpl(o00ooo0o));
                    return;
                }
                o00OOO0O o00ooo0o2 = new o00OOO0O(null, null);
                ?? arrayList = new ArrayList();
                if (list != null) {
                    for (SkuDetails skuDetails : list) {
                        String strOptString = skuDetails.f9683OooO0O0.optString("productId");
                        Intrinsics.checkNotNullExpressionValue(strOptString, "detail.sku");
                        o00OO o00oo2 = new o00OO(strOptString);
                        String strValueOf = String.valueOf((skuDetails.OooO00o() / ((long) ResponseInfo.UnknownError)) / 100.0d);
                        StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null);
                        strValueOf.getClass();
                        o00oo2.f45871OooO0O0 = o0OoOo0.OooO0OO(strValueOf, 0.0d);
                        String strOooO0O0 = skuDetails.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(strOooO0O0, "detail.priceCurrencyCode");
                        Intrinsics.checkNotNullParameter(strOooO0O0, "<set-?>");
                        o00oo2.f45872OooO0OO = strOooO0O0;
                        o00oo2.f45873OooO0Oo = skuDetails;
                        o00oo2.f45874OooO0o0 = null;
                        arrayList.add(o00oo2);
                    }
                }
                o00ooo0o2.f45913OooO00o = arrayList;
                p592o0oo00O.OooOOO0.OooO("GooglePay 商品详情 V4：querySkuDetailsAsync \npayResult = " + o00ooo0o2 + ", \nskuDetailsContent = " + p140o00OOooo.OooOO0.OooO00o(list) + ", \ngooglePaySkuDetailsContent = " + p140o00OOooo.OooOO0.OooO00o(arrayList));
                continuation.resumeWith(Result.m4213constructorimpl(o00ooo0o2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o0ooOOo.OooO00o oooO00o, o00OOO0O<Boolean> o00ooo0o, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f45865OooO0o = oooO00o;
            this.f45867OooO0oO = o00ooo0o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o00O.this.new OooOOO0(this.f45865OooO0o, this.f45867OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o00OOO0O<List<o00OO>>> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45864OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00O o00o2 = o00O.this;
                o0ooOOo.OooO00o oooO00o = this.f45865OooO0o;
                o00OOO0O<Boolean> o00ooo0o = this.f45867OooO0oO;
                this.f45864OooO0Oo = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                o00o2.f45831OooO0Oo.OooO00o(oooO00o.OooO00o(), new OooO00o(safeContinuation, o00ooo0o));
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

    public o00O(@NotNull Activity activity, long j) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f45828OooO00o = activity;
        this.f45829OooO0O0 = j;
        o00Ooo o00ooo2 = new o00Ooo() { // from class: o0OoOOOO.oo0oOO0
            @Override // com.android.billingclient.api.o00Ooo
            public final void onPurchasesUpdated(OooOo00 result, List list) {
                o00O this$0 = this.f45915OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                Function2<? super OooOo00, ? super List<? extends Purchase>, Unit> function2 = this$0.f45832OooO0o0;
                if (function2 != null) {
                    function2.invoke(result, list);
                }
            }
        };
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        com.android.billingclient.api.OooO0o oooO0o = new com.android.billingclient.api.OooO0o(true, activity, o00ooo2);
        Intrinsics.checkNotNullExpressionValue(oooO0o, "newBuilder(activity)\n   …chases()\n        .build()");
        this.f45831OooO0Oo = oooO0o;
        if (oo000o.OooO0O0(activity)) {
            oooO0o.OooO0o(new OooO00o());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO00o(@NotNull String str, @NotNull RechargeMenuToPayModel rechargeMenuToPayModel, @Nullable GooglePaySubscriptionModel googlePaySubscriptionModel, @NotNull Continuation<? super o00OOO0O<RechargeMenuPayBuyResultModel>> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        String str2;
        RechargeMenuToPayModel rechargeMenuToPayModel2;
        GooglePaySubscriptionModel googlePaySubscriptionModel2;
        Object objOooO0O0;
        o00O o00o2;
        int i;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i2 = oooO0O0.f45841OooOO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f45841OooOO0 = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object orThrow = oooO0O0.f45840OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0O0.f45841OooOO0;
        if (i3 != 0) {
            if (i3 == 1) {
                GooglePaySubscriptionModel googlePaySubscriptionModel3 = oooO0O0.f45839OooO0oO;
                RechargeMenuToPayModel rechargeMenuToPayModel3 = oooO0O0.f45837OooO0o;
                String str3 = (String) oooO0O0.f45838OooO0o0;
                o00o2 = oooO0O0.f45836OooO0Oo;
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
            o00OOO0O o00ooo0o = new o00OOO0O(null, null);
            o00ooo0o.f45914OooO0O0 = new o00OOO00(-113, o0000.OooO0OO(oO00OOo0.Pay_Params_Is_Null));
            return o00ooo0o;
        }
        oooO0O0.f45836OooO0Oo = this;
        str2 = str;
        oooO0O0.f45838OooO0o0 = str2;
        rechargeMenuToPayModel2 = rechargeMenuToPayModel;
        oooO0O0.f45837OooO0o = rechargeMenuToPayModel2;
        googlePaySubscriptionModel2 = googlePaySubscriptionModel;
        oooO0O0.f45839OooO0oO = googlePaySubscriptionModel2;
        oooO0O0.f45841OooOO0 = 1;
        objOooO0O0 = OooO0O0(oooO0O0);
        if (objOooO0O0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        o00o2 = this;
        o00OOO0O o00ooo0o2 = (o00OOO0O) objOooO0O0;
        if (!Intrinsics.areEqual(o00ooo0o2.f45913OooO00o, Boxing.boxBoolean(true))) {
            o00OOO0O o00ooo0o3 = new o00OOO0O(null, null);
            o00ooo0o3.f45914OooO0O0 = o00ooo0o2.f45914OooO0O0;
            return o00ooo0o3;
        }
        BillingFlowParams.OooO00o oooO00o = new BillingFlowParams.OooO00o();
        String content = String.valueOf(o00o2.f45829OooO0O0);
        Intrinsics.checkNotNullParameter(content, "content");
        oooO00o.f9610OooO00o = Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(content, oO000Oo.OooO00o(), o0o0000.f56518OooO00o, (String) null, 4, (Object) null));
        oooO00o.f9611OooO0O0 = str2;
        SkuDetails skuDetails = rechargeMenuToPayModel2.getSkuDetails();
        Intrinsics.checkNotNull(skuDetails);
        ArrayList arrayList = new ArrayList();
        arrayList.add(skuDetails);
        oooO00o.f9613OooO0Oo = arrayList;
        Intrinsics.checkNotNullExpressionValue(oooO00o, "newBuilder()\n           …tails(model.skuDetails!!)");
        p592o0oo00O.OooOOO0.OooO0O0("GooglePay 购买订阅 V4 \nsubscription:" + googlePaySubscriptionModel2 + "\norderId:" + str2 + " \nskuDetail:" + rechargeMenuToPayModel2.getSkuDetails());
        if (googlePaySubscriptionModel2 != null && (!StringsKt.isBlank(googlePaySubscriptionModel2.f23407OooO00o)) && (!StringsKt.isBlank(googlePaySubscriptionModel2.f23408OooO0O0))) {
            String str4 = googlePaySubscriptionModel2.f23408OooO0O0;
            int i4 = GooglePaySubscriptionModel.OooO00o.$EnumSwitchMapping$0[googlePaySubscriptionModel2.f23409OooO0OO.ordinal()];
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
            oooO0OO.f9619OooO00o = str4;
            oooO0OO.f9620OooO0O0 = i;
            BillingFlowParams.OooO0OO.OooO00o oooO00o2 = new BillingFlowParams.OooO0OO.OooO00o();
            oooO00o2.f9621OooO00o = oooO0OO.f9619OooO00o;
            oooO00o2.f9623OooO0OO = oooO0OO.f9620OooO0O0;
            oooO00o.f9614OooO0o0 = oooO00o2;
        }
        if (o00o2.f45831OooO0Oo.OooO0o0(o00o2.f45828OooO00o, oooO00o.OooO00o()).f9655OooO00o != 0) {
            o00OOO0O o00ooo0o4 = new o00OOO0O(null, null);
            o00ooo0o4.f45914OooO0O0 = o00ooo0o2.f45914OooO0O0;
            return o00ooo0o4;
        }
        oooO0O0.f45836OooO0Oo = o00o2;
        oooO0O0.f45838OooO0o0 = googlePaySubscriptionModel2;
        oooO0O0.f45837OooO0o = null;
        oooO0O0.f45839OooO0oO = null;
        oooO0O0.f45841OooOO0 = 2;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(oooO0O0));
        o00o2.f45832OooO0o0 = o00o2.new OooO0OO(googlePaySubscriptionModel2, safeContinuation);
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
        if (oo000o.OooO0O0(this.f45828OooO00o)) {
            boolean z = this.f45830OooO0OO;
            if (z) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m4213constructorimpl(new o00OOO0O(Boxing.boxBoolean(z), null)));
            } else {
                this.f45831OooO0Oo.OooO0o(new o00OO000(this, cancellableContinuationImpl));
            }
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m4213constructorimpl(new o00OOO0O(Boxing.boxBoolean(false), new o00OOO00(-101, o0000.OooO0OO(oO00OOo0.Pay_SDK_Does_Not_Exist)))));
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
        o00O o00o2;
        OooOo00 oooOo00;
        int i;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i2 = oooO0o.f45849OooO0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0o.f45849OooO0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objOooO0O0 = oooO0o.f45846OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0o.f45849OooO0oo;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO0o.f45845OooO0Oo = this;
            oooO0o.f45847OooO0o0 = payOrder;
            oooO0o.f45849OooO0oo = 1;
            objOooO0O0 = OooO0O0(oooO0o);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00o2 = this;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    ResultKt.throwOnFailure(objOooO0O0);
                    oooOo00 = (OooOo00) objOooO0O0;
                    i = oooOo00.f9655OooO00o;
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
                i = oooOo00.f9655OooO00o;
                if (i != -3 && i != 2 && i != -1) {
                    return i != 0 ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
                }
                return null;
            }
            payOrder = (PayOrder) oooO0o.f45847OooO0o0;
            o00o2 = oooO0o.f45845OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        if (Intrinsics.areEqual(((o00OOO0O) objOooO0O0).f45913OooO00o, Boxing.boxBoolean(true))) {
            if (payOrder.getIsSubscription()) {
                new com.android.billingclient.api.OooO0O0.OooO00o();
                String purchaseToken = payOrder.getPurchaseToken();
                if (purchaseToken == null) {
                    throw new IllegalArgumentException("Purchase token must be set");
                }
                com.android.billingclient.api.OooO0O0 oooO0O0 = new com.android.billingclient.api.OooO0O0(0);
                oooO0O0.f9627OooO00o = purchaseToken;
                Intrinsics.checkNotNullExpressionValue(oooO0O0, "newBuilder().setPurchase…er.purchaseToken).build()");
                oooO0o.f45845OooO0Oo = o00o2;
                oooO0o.f45847OooO0o0 = payOrder;
                oooO0o.getClass();
                oooO0o.f45849OooO0oo = 3;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(oooO0o));
                o00o2.f45831OooO0Oo.OooO0O0(oooO0O0, new OooOO0(payOrder, safeContinuation));
                objOooO0O0 = safeContinuation.getOrThrow();
                if (objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(oooO0o);
                }
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOo00 = (OooOo00) objOooO0O0;
                i = oooOo00.f9655OooO00o;
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
                oooOo.f9654OooO00o = purchaseToken2;
                Intrinsics.checkNotNullExpressionValue(oooOo, "newBuilder().setPurchase…er.purchaseToken).build()");
                oooO0o.f45845OooO0Oo = o00o2;
                oooO0o.f45847OooO0o0 = oooOo;
                oooO0o.f45849OooO0oo = 2;
                SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(oooO0o));
                o00o2.f45831OooO0Oo.OooO0OO(oooOo, new OooO(safeContinuation2));
                objOooO0O0 = safeContinuation2.getOrThrow();
                if (objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(oooO0o);
                }
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOo00 = (OooOo00) objOooO0O0;
                i = oooOo00.f9655OooO00o;
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
    public final Object OooO0Oo(@NotNull List<String> list, boolean z, @NotNull Continuation<? super o00OOO0O<List<o00OO>>> continuation) throws Throwable {
        OooOO0O oooOO0O;
        o00O o00o2;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i = oooOO0O.f45852OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f45852OooO = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object objOooO0O0 = oooOO0O.f45856OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO0O.f45852OooO;
        if (i2 != 0) {
            if (i2 == 1) {
                z = oooOO0O.f45854OooO0o;
                list = oooOO0O.f45855OooO0o0;
                o00o2 = oooOO0O.f45853OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0O0);
            }
        }
        ResultKt.throwOnFailure(objOooO0O0);
        oooOO0O.f45853OooO0Oo = this;
        oooOO0O.f45855OooO0o0 = list;
        oooOO0O.f45854OooO0o = z;
        oooOO0O.f45852OooO = 1;
        objOooO0O0 = OooO0O0(oooOO0O);
        if (objOooO0O0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        o00o2 = this;
        o00OOO0O o00ooo0o = (o00OOO0O) objOooO0O0;
        if (!Intrinsics.areEqual(o00ooo0o.f45913OooO00o, Boxing.boxBoolean(true))) {
            o00OOO0O o00ooo0o2 = new o00OOO0O(null, null);
            o00ooo0o2.f45914OooO0O0 = o00ooo0o.f45914OooO0O0;
            return o00ooo0o2;
        }
        o0ooOOo.OooO00o oooO00o = new o0ooOOo.OooO00o(0);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "newBuilder()");
        oooO00o.f9763OooO0O0 = new ArrayList(list);
        oooO00o.f9762OooO00o = z ? "subs" : "inapp";
        CoroutineDispatcher io2 = Dispatchers.getIO();
        OooOOO0 oooOOO0 = o00o2.new OooOOO0(oooO00o, o00ooo0o, null);
        oooOO0O.f45853OooO0Oo = null;
        oooOO0O.f45855OooO0o0 = null;
        oooOO0O.f45852OooO = 2;
        objOooO0O0 = BuildersKt.withContext(io2, oooOOO0, oooOO0O);
        return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8 A[LOOP:1: B:51:0x00f2->B:53:0x00f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o0(boolean z, @NotNull Continuation<? super List<PayOrder>> continuation) throws Throwable {
        OooOOO oooOOO;
        o00O o00o2;
        o00OOO0O o00ooo0o;
        ArrayList arrayList;
        ArrayList arrayList2;
        o00OOO0O o00ooo0o2;
        com.android.billingclient.api.OooO00o OooO00o2;
        String str;
        com.android.billingclient.api.OooO00o OooO00o3;
        String str2;
        boolean z2;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i = oooOOO.f45858OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f45858OooO = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        Object objOooO0O0 = oooOOO.f45862OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO.f45858OooO;
        if (i2 != 0) {
            if (i2 == 1) {
                z = oooOOO.f45860OooO0o;
                o00o2 = (o00O) oooOOO.f45859OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = oooOOO.f45860OooO0o;
                arrayList2 = oooOOO.f45861OooO0o0;
                o00ooo0o2 = (o00OOO0O) oooOOO.f45859OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
            }
            for (Purchase purchase : ((o00Oo0) objOooO0O0).f9751OooO0O0) {
                OooO00o2 = purchase.OooO00o();
                if (OooO00o2 != null) {
                    str = OooO00o2.f9625OooO00o;
                } else {
                    str = null;
                }
                OooO00o3 = purchase.OooO00o();
                if (OooO00o3 != null) {
                    str2 = OooO00o3.f9626OooO0O0;
                } else {
                    str2 = null;
                }
                p592o0oo00O.OooOOO0.OooO0O0("GooglePay 补单V4 有丢单记录 accountId:" + str + " \torderId:" + str2);
                if (str == null) {
                    if (str2 != null || StringsKt.isBlank(str2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        ArrayList<String> arrayListOooO0Oo = purchase.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(arrayListOooO0Oo, "item.skus");
                        for (String sku : arrayListOooO0Oo) {
                            PayOrder payOrder = new PayOrder();
                            o000000O o000000o2 = o000000O.f46674OooO00o;
                            payOrder.setUserId(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
                            payOrder.setOrderId(str2);
                            Intrinsics.checkNotNullExpressionValue(sku, "sku");
                            payOrder.setSku(sku);
                            payOrder.setType(PaySupportChannels.pay_type_googlePay.getNum());
                            payOrder.setConsume(false);
                            String strOooO0OO = purchase.OooO0OO();
                            Intrinsics.checkNotNullExpressionValue(strOooO0OO, "item.purchaseToken");
                            payOrder.setPurchaseToken(strOooO0OO);
                            JSONObject jSONObject = purchase.f9681OooO0OO;
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
            o00ooo0o = o00ooo0o2;
            arrayList = arrayList2;
            p592o0oo00O.OooOOO0.OooO0O0("GooglePay 补单V4 数据 \n isSubscription:" + z + "\n connected:" + o00ooo0o + "\n connected.data:" + o00ooo0o.f45913OooO00o + "\n payOrderList.size:" + arrayList.size() + " \npayOrderList:" + arrayList);
            return arrayList;
        }
        ResultKt.throwOnFailure(objOooO0O0);
        oooOOO.f45859OooO0Oo = this;
        oooOOO.f45860OooO0o = z;
        oooOOO.f45858OooO = 1;
        objOooO0O0 = OooO0O0(oooOOO);
        if (objOooO0O0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        o00o2 = this;
        o00ooo0o = (o00OOO0O) objOooO0O0;
        arrayList = new ArrayList();
        if (Intrinsics.areEqual(o00ooo0o.f45913OooO00o, Boxing.boxBoolean(true))) {
            String str3 = z ? "subs" : "inapp";
            com.android.billingclient.api.OooO0o oooO0o = o00o2.f45831OooO0Oo;
            oooOOO.f45859OooO0Oo = o00ooo0o;
            oooOOO.f45861OooO0o0 = arrayList;
            oooOOO.f45860OooO0o = z;
            oooOOO.f45858OooO = 2;
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            oooO0o.OooOO0O(str3, new com.android.billingclient.api.OooOOO0(completableDeferredCompletableDeferred$default));
            Object objAwait = completableDeferredCompletableDeferred$default.await(oooOOO);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList2 = arrayList;
            o00ooo0o2 = o00ooo0o;
            objOooO0O0 = objAwait;
            while (r15.hasNext()) {
                OooO00o2 = purchase.OooO00o();
                if (OooO00o2 != null) {
                    str = OooO00o2.f9625OooO00o;
                } else {
                    str = null;
                }
                OooO00o3 = purchase.OooO00o();
                if (OooO00o3 != null) {
                    str2 = OooO00o3.f9626OooO0O0;
                } else {
                    str2 = null;
                }
                p592o0oo00O.OooOOO0.OooO0O0("GooglePay 补单V4 有丢单记录 accountId:" + str + " \torderId:" + str2);
                if (str == null) {
                    if (str2 != null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        ArrayList<String> arrayListOooO0Oo2 = purchase.OooO0Oo();
                        Intrinsics.checkNotNullExpressionValue(arrayListOooO0Oo2, "item.skus");
                        while (r7.hasNext()) {
                            PayOrder payOrder2 = new PayOrder();
                            o000000O o000000o3 = o000000O.f46674OooO00o;
                            payOrder2.setUserId(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
                            payOrder2.setOrderId(str2);
                            Intrinsics.checkNotNullExpressionValue(sku, "sku");
                            payOrder2.setSku(sku);
                            payOrder2.setType(PaySupportChannels.pay_type_googlePay.getNum());
                            payOrder2.setConsume(false);
                            String strOooO0OO2 = purchase.OooO0OO();
                            Intrinsics.checkNotNullExpressionValue(strOooO0OO2, "item.purchaseToken");
                            payOrder2.setPurchaseToken(strOooO0OO2);
                            JSONObject jSONObject2 = purchase.f9681OooO0OO;
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
            o00ooo0o = o00ooo0o2;
            arrayList = arrayList2;
        }
        p592o0oo00O.OooOOO0.OooO0O0("GooglePay 补单V4 数据 \n isSubscription:" + z + "\n connected:" + o00ooo0o + "\n connected.data:" + o00ooo0o.f45913OooO00o + "\n payOrderList.size:" + arrayList.size() + " \npayOrderList:" + arrayList);
        return arrayList;
    }
}
