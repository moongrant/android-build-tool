package com.yalla.yalla.common.manager.googlepay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.OooO;
import com.android.billingclient.api.OooO00o;
import com.android.billingclient.api.OooO0O0;
import com.android.billingclient.api.OooO0OO;
import com.android.billingclient.api.OooO0o;
import com.android.billingclient.api.OooOO0;
import com.android.billingclient.api.OooOO0O;
import com.android.billingclient.api.OooOOO;
import com.android.billingclient.api.OooOOO0;
import com.android.billingclient.api.OooOOOO;
import com.android.billingclient.api.OooOo;
import com.android.billingclient.api.Oooo0;
import com.android.billingclient.api.Oooo000;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.o000O000;
import com.android.billingclient.api.o000OOo;
import com.android.billingclient.api.o000oOoO;
import com.android.billingclient.api.o00Oo0;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzu;
import com.google.android.gms.internal.play_billing.zzz;
import com.qiniu.android.collect.ReportItem;
import com.qiniu.android.http.ResponseInfo;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.manager.GooglePaySubscriptionModel;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.model.RechargeMenuPayBuyResultModel;
import com.yalla.yalla.common.util.PaySupportChannels;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
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
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p192o00o0O0.o0ooOOo;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b8\u00109J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,RP\u00106\u001a<\u0012\u0013\u0012\u00110.¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u000203\u0018\u000102¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(4\u0012\u0004\u0012\u000205\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/GooglePayManager;", "", "Lcom/yalla/yalla/common/manager/googlepay/PayResult;", "", "connectIfLost", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "skuList", "isSubscription", "Lcom/yalla/yalla/common/manager/googlepay/GooglePaySkuDetail;", "querySkuDetails", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderId", "Lcom/android/billingclient/api/SkuDetails;", "skuDetail", "Lcom/yalla/yalla/common/manager/GooglePaySubscriptionModel;", "subscription", "Lcom/yalla/yalla/common/model/RechargeMenuPayBuyResultModel;", "buy", "(Ljava/lang/String;Lcom/android/billingclient/api/SkuDetails;Lcom/yalla/yalla/common/manager/GooglePaySubscriptionModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yalla/yalla/common/db/table/PayOrder;", "payOrder", "consumeOrder", "(Lcom/yalla/yalla/common/db/table/PayOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchases", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "", "userId", "J", "getUserId", "()J", "isConnection", "Z", "Lcom/android/billingclient/api/Oooo000;", "purchasesUpdatedListener", "Lcom/android/billingclient/api/Oooo000;", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "Lkotlin/Function2;", "Lcom/android/billingclient/api/OooOOO0;", "Lkotlin/ParameterName;", "name", ReportItem.QualityKeyResult, "", "Lcom/android/billingclient/api/Purchase;", "purchases", "", "buyListener", "Lkotlin/jvm/functions/Function2;", "<init>", "(Landroid/app/Activity;J)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GooglePayManager {
    public static final int $stable = 8;

    @NotNull
    private final Activity activity;

    @NotNull
    private BillingClient billingClient;

    @Nullable
    private Function2<? super OooOOO0, ? super List<? extends Purchase>, Unit> buyListener;
    private boolean isConnection;

    @NotNull
    private final Oooo000 purchasesUpdatedListener;
    private final long userId;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.GooglePayManager$buy$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.GooglePayManager", f = "GooglePayManager.kt", i = {0, 0, 0, 0, 1, 1}, l = {144, 167}, m = "buy", n = {"this", "orderId", "skuDetail", "subscription", "this", "subscription"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    public static final class C04771 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C04771(Continuation<? super C04771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GooglePayManager.this.buy(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.GooglePayManager$consumeOrder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.GooglePayManager", f = "GooglePayManager.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {244, 249, 256}, m = "consumeOrder", n = {"this", "payOrder", "this", NativeProtocol.WEB_DIALOG_PARAMS, "this", "payOrder", NativeProtocol.WEB_DIALOG_PARAMS}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class C04781 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C04781(Continuation<? super C04781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GooglePayManager.this.consumeOrder(null, this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.GooglePayManager$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.GooglePayManager", f = "GooglePayManager.kt", i = {0, 0, 1, 1, 1}, l = {309, 316}, m = "queryPurchases", n = {"this", "isSubscription", "connected", "payOrderList", "isSubscription"}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class C04791 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C04791(Continuation<? super C04791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GooglePayManager.this.queryPurchases(false, this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.GooglePayManager$querySkuDetails$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.GooglePayManager", f = "GooglePayManager.kt", i = {0, 0, 0}, l = {101, 106}, m = "querySkuDetails", n = {"this", "skuList", "isSubscription"}, s = {"L$0", "L$1", "Z$0"})
    public static final class C04801 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C04801(Continuation<? super C04801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GooglePayManager.this.querySkuDetails(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.googlepay.GooglePayManager$querySkuDetails$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/common/manager/googlepay/PayResult;", "", "Lcom/yalla/yalla/common/manager/googlepay/GooglePaySkuDetail;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.googlepay.GooglePayManager$querySkuDetails$2", f = "GooglePayManager.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PayResult<List<GooglePaySkuDetail>>>, Object> {
        public final /* synthetic */ PayResult<Boolean> $connected;
        public final /* synthetic */ Oooo0.OooO00o $params;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Oooo0.OooO00o oooO00o, PayResult<Boolean> payResult, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$params = oooO00o;
            this.$connected = payResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GooglePayManager.this.new AnonymousClass2(this.$params, this.$connected, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super PayResult<List<GooglePaySkuDetail>>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GooglePayManager googlePayManager = GooglePayManager.this;
                Oooo0.OooO00o oooO00o = this.$params;
                final PayResult<Boolean> payResult = this.$connected;
                this.L$0 = googlePayManager;
                this.L$1 = oooO00o;
                this.L$2 = payResult;
                this.label = 1;
                final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                googlePayManager.billingClient.OooO0O0(oooO00o.OooO00o(), new o000oOoO() { // from class: com.yalla.yalla.common.manager.googlepay.GooglePayManager$querySkuDetails$2$1$1
                    @Override // com.android.billingclient.api.o000oOoO
                    public final void onSkuDetailsResponse(@NotNull OooOOO0 billingResult, @Nullable List<SkuDetails> list) {
                        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                        if (billingResult.f11236OooO00o != 0) {
                            PayResult payResult2 = new PayResult(null, null, 2, null);
                            payResult2.setError(payResult.getError());
                            Continuation<PayResult<List<GooglePaySkuDetail>>> continuation = safeContinuation;
                            Result.Companion companion = Result.INSTANCE;
                            continuation.resumeWith(Result.m502constructorimpl(payResult2));
                            return;
                        }
                        PayResult payResult3 = new PayResult(null, null, 2, null);
                        ArrayList arrayList = new ArrayList();
                        if (list != null) {
                            for (SkuDetails skuDetails : list) {
                                String strOooO0O0 = skuDetails.OooO0O0();
                                Intrinsics.checkNotNullExpressionValue(strOooO0O0, "detail.sku");
                                GooglePaySkuDetail googlePaySkuDetail = new GooglePaySkuDetail(strOooO0O0, skuDetails);
                                String strValueOf = String.valueOf((skuDetails.f11255OooO0O0.optLong("price_amount_micros") / ((long) ResponseInfo.UnknownError)) / 100.0d);
                                StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null);
                                Objects.requireNonNull(strValueOf);
                                double d = 0.0d;
                                Intrinsics.checkNotNullParameter(strValueOf, "<this>");
                                try {
                                    d = Double.parseDouble(strValueOf);
                                } catch (NumberFormatException unused) {
                                }
                                googlePaySkuDetail.setAmount(d);
                                String strOooO00o = skuDetails.OooO00o();
                                Intrinsics.checkNotNullExpressionValue(strOooO00o, "detail.priceCurrencyCode");
                                googlePaySkuDetail.setUnit(strOooO00o);
                                arrayList.add(googlePaySkuDetail);
                            }
                        }
                        payResult3.setData(arrayList);
                        Continuation<PayResult<List<GooglePaySkuDetail>>> continuation2 = safeContinuation;
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.m502constructorimpl(payResult3));
                    }
                });
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

    public GooglePayManager(@NotNull Activity activity, long j) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.userId = j;
        o0ooOOo o0ooooo2 = new o0ooOOo(this);
        this.purchasesUpdatedListener = o0ooooo2;
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        OooO0o oooO0o = new OooO0o(true, activity, o0ooooo2);
        Intrinsics.checkNotNullExpressionValue(oooO0o, "newBuilder(activity)\n   …es()\n            .build()");
        this.billingClient = oooO0o;
        if (PackManager.INSTANCE.isHaveGooglePlay(activity)) {
            this.billingClient.OooO0OO(new OooOO0() { // from class: com.yalla.yalla.common.manager.googlepay.GooglePayManager.1
                @Override // com.android.billingclient.api.OooOO0
                public void onBillingServiceDisconnected() {
                    GooglePayManager.this.isConnection = false;
                }

                @Override // com.android.billingclient.api.OooOO0
                public void onBillingSetupFinished(@NotNull OooOOO0 billingResult) {
                    Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                    GooglePayManager.this.isConnection = billingResult.f11236OooO00o == 0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object connectIfLost(Continuation<? super PayResult<Boolean>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (!PackManager.INSTANCE.isHaveGooglePlay(getActivity())) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m502constructorimpl(new PayResult(Boxing.boxBoolean(false), new PayError(PayError.ERROR_NO_SDK, PayError.INSTANCE.errorNoSdkMessage()))));
        } else if (this.isConnection) {
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m502constructorimpl(new PayResult(Boxing.boxBoolean(this.isConnection), null, 2, null)));
        } else {
            this.billingClient.OooO0OO(new OooOO0() { // from class: com.yalla.yalla.common.manager.googlepay.GooglePayManager$connectIfLost$2$1
                @Override // com.android.billingclient.api.OooOO0
                public void onBillingServiceDisconnected() {
                    this.this$0.isConnection = false;
                    if (cancellableContinuationImpl.isActive()) {
                        CancellableContinuation<PayResult<Boolean>> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion3 = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m502constructorimpl(new PayResult(Boolean.valueOf(this.this$0.isConnection), new PayError(PayError.ERROR_CONNECT_FAILED, PayError.INSTANCE.errorConnectFailedMessage()))));
                    }
                }

                @Override // com.android.billingclient.api.OooOO0
                public void onBillingSetupFinished(@NotNull OooOOO0 billingResult) {
                    Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                    this.this$0.isConnection = billingResult.f11236OooO00o == 0;
                    if (cancellableContinuationImpl.isActive()) {
                        if (this.this$0.isConnection) {
                            CancellableContinuation<PayResult<Boolean>> cancellableContinuation = cancellableContinuationImpl;
                            Result.Companion companion3 = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m502constructorimpl(new PayResult(Boolean.valueOf(this.this$0.isConnection), null, 2, null)));
                            return;
                        }
                        CancellableContinuation<PayResult<Boolean>> cancellableContinuation2 = cancellableContinuationImpl;
                        Boolean boolValueOf = Boolean.valueOf(this.this$0.isConnection);
                        int i = billingResult.f11236OooO00o;
                        String str = billingResult.f11237OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(str, "billingResult.debugMessage");
                        PayResult payResult = new PayResult(boolValueOf, new PayError(i, str));
                        Result.Companion companion4 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m502constructorimpl(payResult));
                    }
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: purchasesUpdatedListener$lambda-0, reason: not valid java name */
    public static final void m287purchasesUpdatedListener$lambda0(GooglePayManager this$0, OooOOO0 result, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        Function2<? super OooOOO0, ? super List<? extends Purchase>, Unit> function2 = this$0.buyListener;
        if (function2 != null) {
            function2.invoke(result, list);
        }
    }

    public static /* synthetic */ Object queryPurchases$default(GooglePayManager googlePayManager, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return googlePayManager.queryPurchases(z, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:226:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:228:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:231:0x0602 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:232:0x0603 A[PHI: r0
      0x0603: PHI (r0v94 java.lang.Object) = (r0v81 java.lang.Object), (r0v1 java.lang.Object) binds: [B:230:0x0600, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:233:0x0604  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object buy(@NotNull String str, @NotNull SkuDetails skuDetails, @Nullable GooglePaySubscriptionModel googlePaySubscriptionModel, @NotNull Continuation<? super PayResult<RechargeMenuPayBuyResultModel>> continuation) {
        C04771 c04771;
        String str2;
        SkuDetails skuDetails2;
        GooglePaySubscriptionModel googlePaySubscriptionModel2;
        Object objConnectIfLost;
        GooglePayManager googlePayManager;
        PayResult payResult;
        Object obj;
        GooglePaySubscriptionModel googlePaySubscriptionModel3;
        C04771 c04772;
        Activity activity;
        final OooO0o oooO0o;
        GooglePayManager googlePayManager2;
        Future futureOooO0oo;
        OooOOO0 oooOOO0;
        BillingFlowParams billingFlowParams;
        String str3;
        OooO0o oooO0o2;
        String str4;
        zzu zzuVar;
        final String str5;
        SkuDetails skuDetails3;
        OooOO0O oooOO0O;
        boolean z;
        String str6;
        String str7;
        BillingFlowParams billingFlowParams2;
        final int i;
        C04771 c04773;
        Object obj2;
        if (continuation instanceof C04771) {
            c04771 = (C04771) continuation;
            int i2 = c04771.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c04771.label = i2 - Integer.MIN_VALUE;
            } else {
                c04771 = new C04771(continuation);
            }
        } else {
            c04771 = new C04771(continuation);
        }
        Object orThrow = c04771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c04771.label;
        if (i3 != 0) {
            if (i3 == 1) {
                GooglePaySubscriptionModel googlePaySubscriptionModel4 = (GooglePaySubscriptionModel) c04771.L$3;
                SkuDetails skuDetails4 = (SkuDetails) c04771.L$2;
                String str8 = (String) c04771.L$1;
                googlePayManager = (GooglePayManager) c04771.L$0;
                ResultKt.throwOnFailure(orThrow);
                objConnectIfLost = orThrow;
                str2 = str8;
                googlePaySubscriptionModel2 = googlePaySubscriptionModel4;
                skuDetails2 = skuDetails4;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(orThrow);
            }
            return orThrow;
        }
        ResultKt.throwOnFailure(orThrow);
        c04771.L$0 = this;
        str2 = str;
        c04771.L$1 = str2;
        skuDetails2 = skuDetails;
        c04771.L$2 = skuDetails2;
        googlePaySubscriptionModel2 = googlePaySubscriptionModel;
        c04771.L$3 = googlePaySubscriptionModel2;
        c04771.label = 1;
        objConnectIfLost = connectIfLost(c04771);
        if (objConnectIfLost == coroutine_suspended) {
            return coroutine_suspended;
        }
        googlePayManager = this;
        PayResult payResult2 = (PayResult) objConnectIfLost;
        if (!Intrinsics.areEqual(payResult2.getData(), Boxing.boxBoolean(true))) {
            PayResult payResult3 = new PayResult(null, null, 2, null);
            payResult3.setError(payResult2.getError());
            return payResult3;
        }
        BillingFlowParams.OooO00o oooO00o = new BillingFlowParams.OooO00o();
        ArrayList arrayList = new ArrayList();
        arrayList.add(skuDetails2);
        oooO00o.f11211OooO0o0 = arrayList;
        oooO00o.f11207OooO00o = GooglePaySignOrMd5.INSTANCE.encryptionObfuscatedAccountId(String.valueOf(googlePayManager.userId));
        oooO00o.f11209OooO0OO = str2;
        Intrinsics.checkNotNullExpressionValue(oooO00o, "newBuilder()\n           …uscatedProfileId(orderId)");
        o00O00.OooO0O0("googlePay buy \nsubscription:" + googlePaySubscriptionModel2 + "\norderId:" + str2 + " \nskuDetail:" + skuDetails2);
        if (googlePaySubscriptionModel2 != null && (!StringsKt.isBlank(googlePaySubscriptionModel2.getOldSku())) && (!StringsKt.isBlank(googlePaySubscriptionModel2.getOldPurchaseToken()))) {
            String oldPurchaseToken = googlePaySubscriptionModel2.getOldPurchaseToken();
            int skuReplacementMode = googlePaySubscriptionModel2.getSkuReplacementMode();
            if (TextUtils.isEmpty(oldPurchaseToken) && TextUtils.isEmpty(null)) {
                throw new IllegalArgumentException("Old SKU purchase token/id must be provided.");
            }
            oooO00o.f11208OooO0O0 = oldPurchaseToken;
            oooO00o.f11210OooO0Oo = skuReplacementMode;
        }
        BillingClient billingClient = googlePayManager.billingClient;
        Activity activity2 = googlePayManager.activity;
        ArrayList arrayList2 = oooO00o.f11211OooO0o0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        if (oooO00o.f11211OooO0o0.contains(null)) {
            throw new IllegalArgumentException("SKU cannot be null.");
        }
        if (oooO00o.f11211OooO0o0.size() > 1) {
            SkuDetails skuDetails5 = (SkuDetails) oooO00o.f11211OooO0o0.get(0);
            String strOooO0OO = skuDetails5.OooO0OO();
            ArrayList arrayList3 = oooO00o.f11211OooO0o0;
            int size = arrayList3.size();
            for (int i4 = 0; i4 < size; i4++) {
                SkuDetails skuDetails6 = (SkuDetails) arrayList3.get(i4);
                if (!strOooO0OO.equals("play_pass_subs") && !skuDetails6.OooO0OO().equals("play_pass_subs") && !strOooO0OO.equals(skuDetails6.OooO0OO())) {
                    throw new IllegalArgumentException("SKUs should have the same type.");
                }
            }
            String strOooO0Oo = skuDetails5.OooO0Oo();
            ArrayList arrayList4 = oooO00o.f11211OooO0o0;
            int size2 = arrayList4.size();
            for (int i5 = 0; i5 < size2; i5++) {
                SkuDetails skuDetails7 = (SkuDetails) arrayList4.get(i5);
                if (!strOooO0OO.equals("play_pass_subs") && !skuDetails7.OooO0OO().equals("play_pass_subs") && !strOooO0Oo.equals(skuDetails7.OooO0Oo())) {
                    throw new IllegalArgumentException("All SKUs must have the same package name.");
                }
            }
        }
        BillingFlowParams billingFlowParams3 = new BillingFlowParams();
        billingFlowParams3.f11199OooO00o = !((SkuDetails) oooO00o.f11211OooO0o0.get(0)).OooO0Oo().isEmpty();
        billingFlowParams3.f11200OooO0O0 = oooO00o.f11207OooO00o;
        billingFlowParams3.f11202OooO0Oo = oooO00o.f11209OooO0OO;
        billingFlowParams3.f11201OooO0OO = oooO00o.f11208OooO0O0;
        billingFlowParams3.f11204OooO0o0 = oooO00o.f11210OooO0Oo;
        ArrayList arrayList5 = oooO00o.f11211OooO0o0;
        billingFlowParams3.f11205OooO0oO = arrayList5 != null ? new ArrayList(arrayList5) : new ArrayList();
        billingFlowParams3.f11206OooO0oo = false;
        billingFlowParams3.f11203OooO0o = zzu.zzh();
        OooO0o oooO0o3 = (OooO0o) billingClient;
        if (oooO0o3.OooO0Oo()) {
            ArrayList<SkuDetails> arrayList6 = new ArrayList();
            arrayList6.addAll(billingFlowParams3.f11205OooO0oO);
            zzu zzuVar2 = billingFlowParams3.f11203OooO0o;
            SkuDetails skuDetails8 = (SkuDetails) zzz.zza(arrayList6, null);
            OooOO0O oooOO0O2 = (OooOO0O) zzz.zza(zzuVar2, null);
            Objects.requireNonNull(skuDetails8);
            final String strOooO0O0 = skuDetails8.OooO0O0();
            final String strOooO0OO2 = skuDetails8.OooO0OO();
            payResult = payResult2;
            obj = coroutine_suspended;
            String str9 = "BillingClient";
            if (!strOooO0OO2.equals(BillingClient.SkuType.SUBS) || oooO0o3.f11224OooO0oo) {
                if (!((!billingFlowParams3.f11206OooO0oo && billingFlowParams3.f11200OooO0O0 == null && billingFlowParams3.f11202OooO0Oo == null && billingFlowParams3.f11204OooO0o0 == 0 && !billingFlowParams3.f11199OooO00o) ? false : true) || oooO0o3.f11225OooOO0) {
                    googlePaySubscriptionModel3 = googlePaySubscriptionModel2;
                    if (arrayList6.size() > 1 && !oooO0o3.f11230OooOOOO) {
                        zzb.zzn("BillingClient", "Current client doesn't support multi-item purchases.");
                        oooOOO0 = o000OOo.f11308OooOOOO;
                        oooO0o3.OooO0o(oooOOO0);
                    } else if (zzuVar2.isEmpty() || oooO0o3.f11231OooOOOo) {
                        boolean z2 = oooO0o3.f11232OooOOo;
                        if (!z2 || oooO0o3.f11225OooOO0) {
                            if (oooO0o3.f11225OooOO0) {
                                c04772 = c04771;
                                googlePayManager2 = googlePayManager;
                                final Bundle bundleZzf = zzb.zzf(billingFlowParams3, oooO0o3.f11226OooOO0O, oooO0o3.f11233OooOOo0, z2, oooO0o3.f11218OooO0O0);
                                if (arrayList6.isEmpty()) {
                                    billingFlowParams = billingFlowParams3;
                                    str3 = "BillingClient";
                                    activity = activity2;
                                    oooO0o2 = oooO0o3;
                                    str4 = "proxyPackageVersion";
                                    zzuVar = zzuVar2;
                                    str5 = strOooO0O0;
                                    skuDetails3 = skuDetails8;
                                    oooOO0O = oooOO0O2;
                                    z = true;
                                    ArrayList<String> arrayList7 = new ArrayList<>(zzuVar.size() - 1);
                                    ArrayList<String> arrayList8 = new ArrayList<>(zzuVar.size() - 1);
                                    ArrayList<String> arrayList9 = new ArrayList<>();
                                    ArrayList<String> arrayList10 = new ArrayList<>();
                                    if (zzuVar.size() > 0) {
                                        throw null;
                                    }
                                    bundleZzf.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList10);
                                    if (!arrayList9.isEmpty()) {
                                        bundleZzf.putStringArrayList("skuDetailsTokens", arrayList9);
                                    }
                                    if (!arrayList7.isEmpty()) {
                                        bundleZzf.putStringArrayList("additionalSkus", arrayList7);
                                        bundleZzf.putStringArrayList("additionalSkuTypes", arrayList8);
                                    }
                                } else {
                                    ArrayList<String> arrayList11 = new ArrayList<>();
                                    str5 = strOooO0O0;
                                    ArrayList<String> arrayList12 = new ArrayList<>();
                                    billingFlowParams = billingFlowParams3;
                                    ArrayList<String> arrayList13 = new ArrayList<>();
                                    str4 = "proxyPackageVersion";
                                    ArrayList<Integer> arrayList14 = new ArrayList<>();
                                    str3 = "BillingClient";
                                    ArrayList<String> arrayList15 = new ArrayList<>();
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    boolean z5 = false;
                                    boolean z6 = false;
                                    for (SkuDetails skuDetails9 : arrayList6) {
                                        Activity activity3 = activity2;
                                        OooOO0O oooOO0O3 = oooOO0O2;
                                        SkuDetails skuDetails10 = skuDetails8;
                                        if (!skuDetails9.f11255OooO0O0.optString("skuDetailsToken").isEmpty()) {
                                            arrayList11.add(skuDetails9.f11255OooO0O0.optString("skuDetailsToken"));
                                        }
                                        String strOptString = skuDetails9.f11255OooO0O0.optString("offerIdToken");
                                        if (strOptString.isEmpty()) {
                                            strOptString = skuDetails9.f11255OooO0O0.optString("offer_id_token");
                                        }
                                        OooO0o oooO0o4 = oooO0o3;
                                        String strOptString2 = skuDetails9.f11255OooO0O0.optString("offer_id");
                                        zzu zzuVar3 = zzuVar2;
                                        int iOptInt = skuDetails9.f11255OooO0O0.optInt("offer_type");
                                        String strOptString3 = skuDetails9.f11255OooO0O0.optString("serializedDocid");
                                        arrayList12.add(strOptString);
                                        z3 |= !TextUtils.isEmpty(strOptString);
                                        arrayList13.add(strOptString2);
                                        z4 |= !TextUtils.isEmpty(strOptString2);
                                        arrayList14.add(Integer.valueOf(iOptInt));
                                        z5 |= iOptInt != 0;
                                        z6 |= !TextUtils.isEmpty(strOptString3);
                                        arrayList15.add(strOptString3);
                                        oooOO0O2 = oooOO0O3;
                                        activity2 = activity3;
                                        skuDetails8 = skuDetails10;
                                        oooO0o3 = oooO0o4;
                                        zzuVar2 = zzuVar3;
                                    }
                                    activity = activity2;
                                    oooO0o2 = oooO0o3;
                                    zzuVar = zzuVar2;
                                    skuDetails3 = skuDetails8;
                                    oooOO0O = oooOO0O2;
                                    if (!arrayList11.isEmpty()) {
                                        bundleZzf.putStringArrayList("skuDetailsTokens", arrayList11);
                                    }
                                    if (z3) {
                                        bundleZzf.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList12);
                                    }
                                    if (z4) {
                                        bundleZzf.putStringArrayList("SKU_OFFER_ID_LIST", arrayList13);
                                    }
                                    if (z5) {
                                        bundleZzf.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList14);
                                    }
                                    if (z6) {
                                        bundleZzf.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList15);
                                    }
                                    z = true;
                                    if (arrayList6.size() > 1) {
                                        ArrayList<String> arrayList16 = new ArrayList<>(arrayList6.size() - 1);
                                        ArrayList<String> arrayList17 = new ArrayList<>(arrayList6.size() - 1);
                                        for (int i6 = 1; i6 < arrayList6.size(); i6++) {
                                            arrayList16.add(((SkuDetails) arrayList6.get(i6)).OooO0O0());
                                            arrayList17.add(((SkuDetails) arrayList6.get(i6)).OooO0OO());
                                        }
                                        bundleZzf.putStringArrayList("additionalSkus", arrayList16);
                                        bundleZzf.putStringArrayList("additionalSkuTypes", arrayList17);
                                    }
                                }
                                oooO0o = oooO0o2;
                                if (!bundleZzf.containsKey("SKU_OFFER_ID_TOKEN_LIST") || oooO0o.f11229OooOOO0) {
                                    if (!TextUtils.isEmpty(skuDetails3.OooO0Oo())) {
                                        bundleZzf.putString("skuPackageName", skuDetails3.OooO0Oo());
                                        str6 = null;
                                    } else {
                                        if (oooOO0O != null) {
                                            throw null;
                                        }
                                        str6 = null;
                                        z = false;
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        bundleZzf.putString("accountName", str6);
                                    }
                                    Intent intent = activity.getIntent();
                                    if (intent == null) {
                                        str9 = str3;
                                        zzb.zzn(str9, "Activity's intent is null.");
                                    } else {
                                        str9 = str3;
                                        if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                                            String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                                            bundleZzf.putString("proxyPackage", stringExtra);
                                            try {
                                                str7 = str4;
                                                try {
                                                    bundleZzf.putString(str7, oooO0o.f11222OooO0o0.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                                } catch (PackageManager.NameNotFoundException unused) {
                                                    bundleZzf.putString(str7, "package not found");
                                                }
                                            } catch (PackageManager.NameNotFoundException unused2) {
                                                str7 = str4;
                                            }
                                        }
                                    }
                                    if (oooO0o.f11231OooOOOo && !zzuVar.isEmpty()) {
                                        billingFlowParams2 = billingFlowParams;
                                        i = 17;
                                    } else if (oooO0o.f11228OooOOO && z) {
                                        billingFlowParams2 = billingFlowParams;
                                        i = 15;
                                    } else if (oooO0o.f11226OooOO0O) {
                                        billingFlowParams2 = billingFlowParams;
                                        i = 9;
                                    } else {
                                        billingFlowParams2 = billingFlowParams;
                                        i = billingFlowParams2.f11206OooO0oo ? 7 : 6;
                                    }
                                    final BillingFlowParams billingFlowParams4 = billingFlowParams2;
                                    futureOooO0oo = oooO0o.OooO0oo(new Callable(i, str5, strOooO0OO2, billingFlowParams4, bundleZzf) { // from class: com.android.billingclient.api.o0000oo

                                        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                                        public final /* synthetic */ int f11284OooO0O0;

                                        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
                                        public final /* synthetic */ String f11285OooO0OO;

                                        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                                        public final /* synthetic */ String f11286OooO0Oo;

                                        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                                        public final /* synthetic */ Bundle f11287OooO0o0;

                                        {
                                            this.f11287OooO0o0 = bundleZzf;
                                        }

                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            OooO0o oooO0o5 = this.f11283OooO00o;
                                            return oooO0o5.f11221OooO0o.zzg(this.f11284OooO0O0, oooO0o5.f11222OooO0o0.getPackageName(), this.f11285OooO0OO, this.f11286OooO0Oo, null, this.f11287OooO0o0);
                                        }
                                    }, 5000L, null, oooO0o.f11219OooO0OO);
                                } else {
                                    oooOOO0 = o000OOo.f11309OooOOOo;
                                    oooO0o.OooO0o(oooOOO0);
                                }
                            } else {
                                c04772 = c04771;
                                activity = activity2;
                                oooO0o = oooO0o3;
                                googlePayManager2 = googlePayManager;
                                futureOooO0oo = oooO0o.OooO0oo(new Callable() { // from class: com.android.billingclient.api.o000OO
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        OooO0o oooO0o5 = oooO0o;
                                        return oooO0o5.f11221OooO0o.zzf(3, oooO0o5.f11222OooO0o0.getPackageName(), strOooO0O0, strOooO0OO2, null);
                                    }
                                }, 5000L, null, oooO0o.f11219OooO0OO);
                            }
                            try {
                                Bundle bundle = (Bundle) futureOooO0oo.get(5000L, TimeUnit.MILLISECONDS);
                                int iZzb = zzb.zzb(bundle, str9);
                                String strZzj = zzb.zzj(bundle, str9);
                                if (iZzb != 0) {
                                    StringBuilder sb = new StringBuilder(52);
                                    sb.append("Unable to buy item, Error response code: ");
                                    sb.append(iZzb);
                                    zzb.zzn(str9, sb.toString());
                                    oooOOO0 = new OooOOO0();
                                    oooOOO0.f11236OooO00o = iZzb;
                                    oooOOO0.f11237OooO0O0 = strZzj;
                                    oooO0o.OooO0o(oooOOO0);
                                } else {
                                    Activity activity4 = activity;
                                    Intent intent2 = new Intent(activity4, (Class<?>) ProxyBillingActivity.class);
                                    intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                                    activity4.startActivity(intent2);
                                    oooOOO0 = o000OOo.f11304OooOO0O;
                                }
                            } catch (CancellationException e) {
                                e = e;
                                zzb.zzo(str9, "Time out while launching billing flow. Try to reconnect", e);
                                oooOOO0 = o000OOo.f11307OooOOO0;
                                oooO0o.OooO0o(oooOOO0);
                            } catch (TimeoutException e2) {
                                e = e2;
                                zzb.zzo(str9, "Time out while launching billing flow. Try to reconnect", e);
                                oooOOO0 = o000OOo.f11307OooOOO0;
                                oooO0o.OooO0o(oooOOO0);
                            } catch (Exception e3) {
                                zzb.zzo(str9, "Exception while launching billing flow. Try to reconnect", e3);
                                oooOOO0 = o000OOo.f11305OooOO0o;
                                oooO0o.OooO0o(oooOOO0);
                            }
                        } else {
                            zzb.zzn("BillingClient", "Current client doesn't support alternative billing.");
                            oooOOO0 = o000OOo.f11310OooOOo;
                            oooO0o3.OooO0o(oooOOO0);
                        }
                    } else {
                        zzb.zzn("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                        oooOOO0 = o000OOo.f11311OooOOo0;
                        oooO0o3.OooO0o(oooOOO0);
                    }
                } else {
                    zzb.zzn("BillingClient", "Current client doesn't support extra params for buy intent.");
                    oooOOO0 = o000OOo.f11302OooO0oo;
                    oooO0o3.OooO0o(oooOOO0);
                }
                if (oooOOO0.f11236OooO00o == 0) {
                    PayResult payResult4 = new PayResult(null, null, 2, null);
                    payResult4.setError(payResult.getError());
                    return payResult4;
                }
                c04773 = c04772;
                final GooglePayManager googlePayManager3 = googlePayManager2;
                c04773.L$0 = googlePayManager3;
                final GooglePaySubscriptionModel googlePaySubscriptionModel5 = googlePaySubscriptionModel3;
                c04773.L$1 = googlePaySubscriptionModel5;
                c04773.L$2 = null;
                c04773.L$3 = null;
                c04773.label = 2;
                final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(c04773));
                googlePayManager3.buyListener = new Function2<OooOOO0, List<? extends Purchase>, Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.GooglePayManager$buy$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(OooOOO0 oooOOO1, List<? extends Purchase> list) {
                        invoke2(oooOOO1, list);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull OooOOO0 result, @Nullable List<? extends Purchase> list) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        this.this$0.buyListener = null;
                        int i7 = result.f11236OooO00o;
                        if (i7 != 0) {
                            if (i7 == 1) {
                                Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation2 = safeContinuation;
                                Result.Companion companion = Result.INSTANCE;
                                continuation2.resumeWith(Result.m502constructorimpl(new PayResult(null, new PayError(PayError.ERROR_USER_CANCELLED, PayError.INSTANCE.errorUserCancelledMessage()))));
                                return;
                            } else {
                                if (i7 == 7) {
                                    Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation3 = safeContinuation;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    continuation3.resumeWith(Result.m502constructorimpl(new PayResult(null, new PayError(PayError.ERROR_ITEM_ALREADY_OWNED, PayError.INSTANCE.errorItemAlreadyOwnedMessage()))));
                                    return;
                                }
                                PayResult payResult5 = new PayResult(null, null, 2, null);
                                int i8 = result.f11236OooO00o;
                                String str10 = result.f11237OooO0O0;
                                Intrinsics.checkNotNullExpressionValue(str10, "result.debugMessage");
                                payResult5.setError(new PayError(i8, str10));
                                Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation4 = safeContinuation;
                                Result.Companion companion3 = Result.INSTANCE;
                                continuation4.resumeWith(Result.m502constructorimpl(payResult5));
                                return;
                            }
                        }
                        GooglePaySubscriptionModel googlePaySubscriptionModel6 = googlePaySubscriptionModel5;
                        if (googlePaySubscriptionModel6 != null && googlePaySubscriptionModel6.getAction() == GooglePaySubscriptionModel.Action.Downgrade) {
                            Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation5 = safeContinuation;
                            RechargeMenuPayBuyResultModel rechargeMenuPayBuyResultModel = new RechargeMenuPayBuyResultModel();
                            rechargeMenuPayBuyResultModel.setPurchaseToken("");
                            rechargeMenuPayBuyResultModel.setPurchaseState(1);
                            rechargeMenuPayBuyResultModel.setAcknowledged(false);
                            PayResult payResult6 = new PayResult(rechargeMenuPayBuyResultModel, null, 2, null);
                            Result.Companion companion4 = Result.INSTANCE;
                            continuation5.resumeWith(Result.m502constructorimpl(payResult6));
                            return;
                        }
                        if (list == null || list.isEmpty()) {
                            Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation6 = safeContinuation;
                            Result.Companion companion5 = Result.INSTANCE;
                            continuation6.resumeWith(Result.m502constructorimpl(new PayResult(null, new PayError(PayError.ERROR_PURCHASES_TOKEN_IS_NULL, PayError.INSTANCE.errorPurchasesTokenIsNullMessage()))));
                            return;
                        }
                        Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation7 = safeContinuation;
                        for (Purchase purchase : list) {
                            RechargeMenuPayBuyResultModel rechargeMenuPayBuyResultModel2 = new RechargeMenuPayBuyResultModel();
                            String strOooO0O1 = purchase.OooO0O0();
                            Intrinsics.checkNotNullExpressionValue(strOooO0O1, "it.purchaseToken");
                            rechargeMenuPayBuyResultModel2.setPurchaseToken(strOooO0O1);
                            rechargeMenuPayBuyResultModel2.setPurchaseState(purchase.f11251OooO0OO.optInt("purchaseState", 1) != 4 ? 1 : 2);
                            rechargeMenuPayBuyResultModel2.setAcknowledged(purchase.f11251OooO0OO.optBoolean("acknowledged", true));
                            PayResult payResult7 = new PayResult(rechargeMenuPayBuyResultModel2, null, 2, null);
                            Result.Companion companion6 = Result.INSTANCE;
                            continuation7.resumeWith(Result.m502constructorimpl(payResult7));
                        }
                    }
                };
                orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(c04773);
                }
                obj2 = obj;
                if (orThrow == obj2) {
                    return obj2;
                }
                return orThrow;
            }
            zzb.zzn("BillingClient", "Current client doesn't support subscriptions.");
            oooOOO0 = o000OOo.f11306OooOOO;
            oooO0o3.OooO0o(oooOOO0);
            googlePaySubscriptionModel3 = googlePaySubscriptionModel2;
        } else {
            oooOOO0 = o000OOo.f11305OooOO0o;
            oooO0o3.OooO0o(oooOOO0);
            obj = coroutine_suspended;
            googlePaySubscriptionModel3 = googlePaySubscriptionModel2;
            payResult = payResult2;
        }
        c04772 = c04771;
        googlePayManager2 = googlePayManager;
        if (oooOOO0.f11236OooO00o == 0) {
            PayResult payResult5 = new PayResult(null, null, 2, null);
            payResult5.setError(payResult.getError());
            return payResult5;
        }
        c04773 = c04772;
        final GooglePayManager googlePayManager4 = googlePayManager2;
        c04773.L$0 = googlePayManager4;
        final GooglePaySubscriptionModel googlePaySubscriptionModel6 = googlePaySubscriptionModel3;
        c04773.L$1 = googlePaySubscriptionModel6;
        c04773.L$2 = null;
        c04773.L$3 = null;
        c04773.label = 2;
        final Continuation<? super PayResult<RechargeMenuPayBuyResultModel>> safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(c04773));
        googlePayManager4.buyListener = new Function2<OooOOO0, List<? extends Purchase>, Unit>() { // from class: com.yalla.yalla.common.manager.googlepay.GooglePayManager$buy$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(OooOOO0 oooOOO1, List<? extends Purchase> list) {
                invoke2(oooOOO1, list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull OooOOO0 result, @Nullable List<? extends Purchase> list) {
                Intrinsics.checkNotNullParameter(result, "result");
                this.this$0.buyListener = null;
                int i7 = result.f11236OooO00o;
                if (i7 != 0) {
                    if (i7 == 1) {
                        Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation2 = safeContinuation2;
                        Result.Companion companion = Result.INSTANCE;
                        continuation2.resumeWith(Result.m502constructorimpl(new PayResult(null, new PayError(PayError.ERROR_USER_CANCELLED, PayError.INSTANCE.errorUserCancelledMessage()))));
                        return;
                    } else {
                        if (i7 == 7) {
                            Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation3 = safeContinuation2;
                            Result.Companion companion2 = Result.INSTANCE;
                            continuation3.resumeWith(Result.m502constructorimpl(new PayResult(null, new PayError(PayError.ERROR_ITEM_ALREADY_OWNED, PayError.INSTANCE.errorItemAlreadyOwnedMessage()))));
                            return;
                        }
                        PayResult payResult6 = new PayResult(null, null, 2, null);
                        int i8 = result.f11236OooO00o;
                        String str10 = result.f11237OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(str10, "result.debugMessage");
                        payResult6.setError(new PayError(i8, str10));
                        Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation4 = safeContinuation2;
                        Result.Companion companion3 = Result.INSTANCE;
                        continuation4.resumeWith(Result.m502constructorimpl(payResult6));
                        return;
                    }
                }
                GooglePaySubscriptionModel googlePaySubscriptionModel7 = googlePaySubscriptionModel6;
                if (googlePaySubscriptionModel7 != null && googlePaySubscriptionModel7.getAction() == GooglePaySubscriptionModel.Action.Downgrade) {
                    Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation5 = safeContinuation2;
                    RechargeMenuPayBuyResultModel rechargeMenuPayBuyResultModel = new RechargeMenuPayBuyResultModel();
                    rechargeMenuPayBuyResultModel.setPurchaseToken("");
                    rechargeMenuPayBuyResultModel.setPurchaseState(1);
                    rechargeMenuPayBuyResultModel.setAcknowledged(false);
                    PayResult payResult7 = new PayResult(rechargeMenuPayBuyResultModel, null, 2, null);
                    Result.Companion companion4 = Result.INSTANCE;
                    continuation5.resumeWith(Result.m502constructorimpl(payResult7));
                    return;
                }
                if (list == null || list.isEmpty()) {
                    Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation6 = safeContinuation2;
                    Result.Companion companion5 = Result.INSTANCE;
                    continuation6.resumeWith(Result.m502constructorimpl(new PayResult(null, new PayError(PayError.ERROR_PURCHASES_TOKEN_IS_NULL, PayError.INSTANCE.errorPurchasesTokenIsNullMessage()))));
                    return;
                }
                Continuation<PayResult<RechargeMenuPayBuyResultModel>> continuation7 = safeContinuation2;
                for (Purchase purchase : list) {
                    RechargeMenuPayBuyResultModel rechargeMenuPayBuyResultModel2 = new RechargeMenuPayBuyResultModel();
                    String strOooO0O1 = purchase.OooO0O0();
                    Intrinsics.checkNotNullExpressionValue(strOooO0O1, "it.purchaseToken");
                    rechargeMenuPayBuyResultModel2.setPurchaseToken(strOooO0O1);
                    rechargeMenuPayBuyResultModel2.setPurchaseState(purchase.f11251OooO0OO.optInt("purchaseState", 1) != 4 ? 1 : 2);
                    rechargeMenuPayBuyResultModel2.setAcknowledged(purchase.f11251OooO0OO.optBoolean("acknowledged", true));
                    PayResult payResult8 = new PayResult(rechargeMenuPayBuyResultModel2, null, 2, null);
                    Result.Companion companion6 = Result.INSTANCE;
                    continuation7.resumeWith(Result.m502constructorimpl(payResult8));
                }
            }
        };
        orThrow = safeContinuation2.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c04773);
        }
        obj2 = obj;
        if (orThrow == obj2) {
            return obj2;
        }
        return orThrow;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0190 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object consumeOrder(@NotNull PayOrder payOrder, @NotNull Continuation<? super Boolean> continuation) {
        C04781 c04781;
        final PayOrder payOrder2;
        Object objConnectIfLost;
        GooglePayManager googlePayManager;
        OooOOO0 oooOOO0;
        int i;
        if (continuation instanceof C04781) {
            c04781 = (C04781) continuation;
            int i2 = c04781.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c04781.label = i2 - Integer.MIN_VALUE;
            } else {
                c04781 = new C04781(continuation);
            }
        } else {
            c04781 = new C04781(continuation);
        }
        Object orThrow = c04781.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c04781.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(orThrow);
            c04781.L$0 = this;
            payOrder2 = payOrder;
            c04781.L$1 = payOrder2;
            c04781.label = 1;
            objConnectIfLost = connectIfLost(c04781);
            if (objConnectIfLost == coroutine_suspended) {
                return coroutine_suspended;
            }
            googlePayManager = this;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    ResultKt.throwOnFailure(orThrow);
                    oooOOO0 = (OooOOO0) orThrow;
                    i = oooOOO0.f11236OooO00o;
                    if (i != -3) {
                        return null;
                    }
                    return null;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(orThrow);
                oooOOO0 = (OooOOO0) orThrow;
                i = oooOOO0.f11236OooO00o;
                if (i != -3 || i == 2 || i == -1) {
                    return null;
                }
                return i != 0 ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
            }
            PayOrder payOrder3 = (PayOrder) c04781.L$1;
            googlePayManager = (GooglePayManager) c04781.L$0;
            ResultKt.throwOnFailure(orThrow);
            objConnectIfLost = orThrow;
            payOrder2 = payOrder3;
        }
        if (!Intrinsics.areEqual(((PayResult) objConnectIfLost).getData(), Boxing.boxBoolean(true))) {
            return null;
        }
        if (!payOrder2.getIsSubscription()) {
            String purchaseToken = payOrder2.getPurchaseToken();
            if (purchaseToken == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            final OooOOO oooOOO = new OooOOO(null);
            oooOOO.f11235OooO00o = purchaseToken;
            Intrinsics.checkNotNullExpressionValue(oooOOO, "newBuilder().setPurchase…er.purchaseToken).build()");
            c04781.L$0 = googlePayManager;
            c04781.L$1 = oooOOO;
            c04781.label = 2;
            final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(c04781));
            BillingClient billingClient = googlePayManager.billingClient;
            final OooOOOO oooOOOO = new OooOOOO() { // from class: com.yalla.yalla.common.manager.googlepay.GooglePayManager$consumeOrder$2$1
                @Override // com.android.billingclient.api.OooOOOO
                public final void onConsumeResponse(@NotNull OooOOO0 billingResult, @NotNull String str) {
                    Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                    Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
                    Continuation<OooOOO0> continuation2 = safeContinuation;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m502constructorimpl(billingResult));
                }
            };
            final OooO0o oooO0o = (OooO0o) billingClient;
            if (!oooO0o.OooO0Oo()) {
                oooOOOO.onConsumeResponse(o000OOo.f11305OooOO0o, oooOOO.f11235OooO00o);
            } else if (oooO0o.OooO0oo(new Callable() { // from class: com.android.billingclient.api.o0000O0O
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int iZza;
                    String strZzj;
                    OooO0o oooO0o2 = oooO0o;
                    OooOOO oooOOO2 = oooOOO;
                    OooOOOO oooOOOO2 = oooOOOO;
                    Objects.requireNonNull(oooO0o2);
                    String str = oooOOO2.f11235OooO00o;
                    try {
                        String strValueOf = String.valueOf(str);
                        zzb.zzm("BillingClient", strValueOf.length() != 0 ? "Consuming purchase with token: ".concat(strValueOf) : new String("Consuming purchase with token: "));
                        if (oooO0o2.f11226OooOO0O) {
                            Bundle bundleZze = oooO0o2.f11221OooO0o.zze(9, oooO0o2.f11222OooO0o0.getPackageName(), str, zzb.zzd(oooOOO2, oooO0o2.f11226OooOO0O, oooO0o2.f11218OooO0O0));
                            iZza = bundleZze.getInt("RESPONSE_CODE");
                            strZzj = zzb.zzj(bundleZze, "BillingClient");
                        } else {
                            iZza = oooO0o2.f11221OooO0o.zza(3, oooO0o2.f11222OooO0o0.getPackageName(), str);
                            strZzj = "";
                        }
                        OooOOO0.OooO00o OooO00o2 = OooOOO0.OooO00o();
                        OooO00o2.f11238OooO00o = iZza;
                        OooO00o2.f11239OooO0O0 = strZzj;
                        OooOOO0 oooOOO0OooO00o = OooO00o2.OooO00o();
                        if (iZza == 0) {
                            zzb.zzm("BillingClient", "Successfully consumed purchase.");
                            oooOOOO2.onConsumeResponse(oooOOO0OooO00o, str);
                            return null;
                        }
                        StringBuilder sb = new StringBuilder(63);
                        sb.append("Error consuming purchase with token. Response code: ");
                        sb.append(iZza);
                        zzb.zzn("BillingClient", sb.toString());
                        oooOOOO2.onConsumeResponse(oooOOO0OooO00o, str);
                        return null;
                    } catch (Exception e) {
                        zzb.zzo("BillingClient", "Error consuming purchase!", e);
                        oooOOOO2.onConsumeResponse(o000OOo.f11305OooOO0o, str);
                        return null;
                    }
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.o000
                @Override // java.lang.Runnable
                public final void run() {
                    oooOOOO.onConsumeResponse(o000OOo.f11307OooOOO0, oooOOO.f11235OooO00o);
                }
            }, oooO0o.OooO0o0()) == null) {
                oooOOOO.onConsumeResponse(oooO0o.OooO0oO(), oooOOO.f11235OooO00o);
            }
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(c04781);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooOOO0 = (OooOOO0) orThrow;
            i = oooOOO0.f11236OooO00o;
            if (i != -3) {
                return null;
            }
            return null;
        }
        String purchaseToken2 = payOrder2.getPurchaseToken();
        if (purchaseToken2 == null) {
            throw new IllegalArgumentException("Purchase token must be set");
        }
        final OooO0O0 oooO0O0 = new OooO0O0(null);
        oooO0O0.f11215OooO00o = purchaseToken2;
        Intrinsics.checkNotNullExpressionValue(oooO0O0, "newBuilder().setPurchase…er.purchaseToken).build()");
        c04781.L$0 = googlePayManager;
        c04781.L$1 = payOrder2;
        c04781.L$2 = oooO0O0;
        c04781.label = 3;
        final SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(c04781));
        BillingClient billingClient2 = googlePayManager.billingClient;
        final OooO0OO oooO0OO = new OooO0OO() { // from class: com.yalla.yalla.common.manager.googlepay.GooglePayManager$consumeOrder$3$1
            @Override // com.android.billingclient.api.OooO0OO
            public final void onAcknowledgePurchaseResponse(@NotNull OooOOO0 billingResult) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                if (payOrder2.getSubscriptionState() != GooglePaySubscriptionModel.Action.Downgrade.getValue()) {
                    Continuation<OooOOO0> continuation2 = safeContinuation2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m502constructorimpl(billingResult));
                    return;
                }
                OooOOO0.OooO00o OooO00o2 = OooOOO0.OooO00o();
                OooO00o2.f11238OooO00o = 0;
                OooOOO0 oooOOO0OooO00o = OooO00o2.OooO00o();
                Intrinsics.checkNotNullExpressionValue(oooOOO0OooO00o, "newBuilder().apply {\n   …                }.build()");
                Continuation<OooOOO0> continuation3 = safeContinuation2;
                Result.Companion companion2 = Result.INSTANCE;
                continuation3.resumeWith(Result.m502constructorimpl(oooOOO0OooO00o));
            }
        };
        final OooO0o oooO0o2 = (OooO0o) billingClient2;
        if (!oooO0o2.OooO0Oo()) {
            oooO0OO.onAcknowledgePurchaseResponse(o000OOo.f11305OooOO0o);
        } else if (TextUtils.isEmpty(oooO0O0.f11215OooO00o)) {
            zzb.zzn("BillingClient", "Please provide a valid purchase token.");
            oooO0OO.onAcknowledgePurchaseResponse(o000OOo.f11294OooO);
        } else if (!oooO0o2.f11226OooOO0O) {
            oooO0OO.onAcknowledgePurchaseResponse(o000OOo.f11296OooO0O0);
        } else if (oooO0o2.OooO0oo(new Callable() { // from class: com.android.billingclient.api.o0000O0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                OooO0o oooO0o3 = oooO0o2;
                OooO0O0 oooO0O1 = oooO0O0;
                OooO0OO oooO0OO2 = oooO0OO;
                Objects.requireNonNull(oooO0o3);
                try {
                    Bundle bundleZzd = oooO0o3.f11221OooO0o.zzd(9, oooO0o3.f11222OooO0o0.getPackageName(), oooO0O1.f11215OooO00o, zzb.zzc(oooO0O1, oooO0o3.f11218OooO0O0));
                    int iZzb = zzb.zzb(bundleZzd, "BillingClient");
                    String strZzj = zzb.zzj(bundleZzd, "BillingClient");
                    OooOOO0.OooO00o OooO00o2 = OooOOO0.OooO00o();
                    OooO00o2.f11238OooO00o = iZzb;
                    OooO00o2.f11239OooO0O0 = strZzj;
                    oooO0OO2.onAcknowledgePurchaseResponse(OooO00o2.OooO00o());
                    return null;
                } catch (Exception e) {
                    zzb.zzo("BillingClient", "Error acknowledge purchase!", e);
                    oooO0OO2.onAcknowledgePurchaseResponse(o000OOo.f11305OooOO0o);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.o0000O00
            @Override // java.lang.Runnable
            public final void run() {
                oooO0OO.onAcknowledgePurchaseResponse(o000OOo.f11307OooOOO0);
            }
        }, oooO0o2.OooO0o0()) == null) {
            oooO0OO.onAcknowledgePurchaseResponse(oooO0o2.OooO0oO());
        }
        orThrow = safeContinuation2.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c04781);
        }
        if (orThrow == coroutine_suspended) {
            return coroutine_suspended;
        }
        oooOOO0 = (OooOOO0) orThrow;
        i = oooOOO0.f11236OooO00o;
        if (i != -3) {
            return null;
        }
        return null;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    public final long getUserId() {
        return this.userId;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:43:0x0108  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:56:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0151  */
    /* JADX WARN: Code duplicated, block: B:62:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x0160 A[LOOP:1: B:63:0x015a->B:65:0x0160, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x016a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01df  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6 A[SYNTHETIC] */
    @Nullable
    public final Object queryPurchases(boolean z, @NotNull Continuation<? super List<PayOrder>> continuation) {
        C04791 c04791;
        boolean z2;
        Object objConnectIfLost;
        GooglePayManager googlePayManager;
        PayResult payResult;
        List arrayList;
        boolean z3;
        PayResult payResult2;
        List list;
        OooO00o OooO00o2;
        String str;
        OooO00o OooO00o3;
        String str2;
        boolean z4;
        ArrayList<String> arrayList2;
        int i;
        JSONArray jSONArrayOptJSONArray;
        int i2;
        if (continuation instanceof C04791) {
            c04791 = (C04791) continuation;
            int i3 = c04791.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c04791.label = i3 - Integer.MIN_VALUE;
            } else {
                c04791 = new C04791(continuation);
            }
        } else {
            c04791 = new C04791(continuation);
        }
        Object obj = c04791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c04791.label;
        if (i4 != 0) {
            if (i4 == 1) {
                boolean z5 = c04791.Z$0;
                googlePayManager = (GooglePayManager) c04791.L$0;
                ResultKt.throwOnFailure(obj);
                objConnectIfLost = obj;
                z2 = z5;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = c04791.Z$0;
                list = (List) c04791.L$1;
                payResult2 = (PayResult) c04791.L$0;
                ResultKt.throwOnFailure(obj);
            }
            for (Purchase purchase : ((OooOo) obj).f11241OooO0O0) {
                OooO00o2 = purchase.OooO00o();
                if (OooO00o2 != null) {
                    str = OooO00o2.f11213OooO00o;
                } else {
                    str = null;
                }
                OooO00o3 = purchase.OooO00o();
                if (OooO00o3 != null) {
                    str2 = OooO00o3.f11214OooO0O0;
                } else {
                    str2 = null;
                }
                o00O00.OooO0O0("Google补单 有丢单记录 accountId:" + str + " \torderId:" + str2);
                if (str == null) {
                    if (str2 != null || StringsKt.isBlank(str2)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        arrayList2 = new ArrayList();
                        if (purchase.f11251OooO0OO.has("productIds")) {
                            jSONArrayOptJSONArray = purchase.f11251OooO0OO.optJSONArray("productIds");
                            if (jSONArrayOptJSONArray != null) {
                                for (i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    arrayList2.add(jSONArrayOptJSONArray.optString(i2));
                                }
                            }
                        } else if (purchase.f11251OooO0OO.has("productId")) {
                            arrayList2.add(purchase.f11251OooO0OO.optString("productId"));
                        }
                        Intrinsics.checkNotNullExpressionValue(arrayList2, "item.skus");
                        for (String sku : arrayList2) {
                            PayOrder payOrder = new PayOrder();
                            payOrder.setUserId(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue());
                            payOrder.setOrderId(str2);
                            Intrinsics.checkNotNullExpressionValue(sku, "sku");
                            payOrder.setSku(sku);
                            payOrder.setType(PaySupportChannels.pay_type_googlePay.getNum());
                            payOrder.setConsume(false);
                            String strOooO0O0 = purchase.OooO0O0();
                            Intrinsics.checkNotNullExpressionValue(strOooO0O0, "item.purchaseToken");
                            payOrder.setPurchaseToken(strOooO0O0);
                            payOrder.setCreateTime(purchase.f11251OooO0OO.optLong("purchaseTime"));
                            if (purchase.f11251OooO0OO.optInt("purchaseState", 1) != 4) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            payOrder.setPurchaseState(i);
                            payOrder.setAcknowledged(purchase.f11251OooO0OO.optBoolean("acknowledged", true));
                            payOrder.setSubscription(z3);
                            payOrder.setSubscriptionState(0);
                            list.add(payOrder);
                        }
                    }
                }
            }
            z2 = z3;
            arrayList = list;
            payResult = payResult2;
            o00O00.OooO0O0("Google补单 数据 \n isSubscription:" + z2 + "\n connected:" + payResult + "\n connected.data:" + payResult.getData() + "\n payOrderList.size:" + arrayList.size() + " \npayOrderList:" + arrayList);
            return arrayList;
        }
        ResultKt.throwOnFailure(obj);
        c04791.L$0 = this;
        z2 = z;
        c04791.Z$0 = z2;
        c04791.label = 1;
        objConnectIfLost = connectIfLost(c04791);
        if (objConnectIfLost == coroutine_suspended) {
            return coroutine_suspended;
        }
        googlePayManager = this;
        payResult = (PayResult) objConnectIfLost;
        arrayList = new ArrayList();
        if (Intrinsics.areEqual(payResult.getData(), Boxing.boxBoolean(true))) {
            String str3 = z2 ? BillingClient.SkuType.SUBS : BillingClient.SkuType.INAPP;
            BillingClient billingClient = googlePayManager.billingClient;
            c04791.L$0 = payResult;
            c04791.L$1 = arrayList;
            c04791.Z$0 = z2;
            c04791.label = 2;
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            OooO oooO = new OooO(completableDeferredCompletableDeferred$default);
            OooO0o oooO0o = (OooO0o) billingClient;
            if (!oooO0o.OooO0Oo()) {
                oooO.OooO00o(o000OOo.f11305OooOO0o, zzu.zzh());
            } else if (TextUtils.isEmpty(str3)) {
                zzb.zzn("BillingClient", "Please provide a valid product type.");
                oooO.OooO00o(o000OOo.f11301OooO0oO, zzu.zzh());
            } else if (oooO0o.OooO0oo(new o00Oo0(oooO0o, str3, oooO), 30000L, new o000O000(oooO, 0), oooO0o.OooO0o0()) == null) {
                oooO.OooO00o(oooO0o.OooO0oO(), zzu.zzh());
            }
            Object objAwait = completableDeferredCompletableDeferred$default.await(c04791);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            z3 = z2;
            obj = objAwait;
            payResult2 = payResult;
            list = arrayList;
            while (r1.hasNext()) {
                OooO00o2 = purchase.OooO00o();
                if (OooO00o2 != null) {
                    str = OooO00o2.f11213OooO00o;
                } else {
                    str = null;
                }
                OooO00o3 = purchase.OooO00o();
                if (OooO00o3 != null) {
                    str2 = OooO00o3.f11214OooO0O0;
                } else {
                    str2 = null;
                }
                o00O00.OooO0O0("Google补单 有丢单记录 accountId:" + str + " \torderId:" + str2);
                if (str == null) {
                    if (str2 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (!z4) {
                        arrayList2 = new ArrayList();
                        if (purchase.f11251OooO0OO.has("productIds")) {
                            jSONArrayOptJSONArray = purchase.f11251OooO0OO.optJSONArray("productIds");
                            if (jSONArrayOptJSONArray != null) {
                                while (i2 < jSONArrayOptJSONArray.length()) {
                                    arrayList2.add(jSONArrayOptJSONArray.optString(i2));
                                }
                            }
                        } else if (purchase.f11251OooO0OO.has("productId")) {
                            arrayList2.add(purchase.f11251OooO0OO.optString("productId"));
                        }
                        Intrinsics.checkNotNullExpressionValue(arrayList2, "item.skus");
                        while (r9.hasNext()) {
                            PayOrder payOrder2 = new PayOrder();
                            payOrder2.setUserId(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue());
                            payOrder2.setOrderId(str2);
                            Intrinsics.checkNotNullExpressionValue(sku, "sku");
                            payOrder2.setSku(sku);
                            payOrder2.setType(PaySupportChannels.pay_type_googlePay.getNum());
                            payOrder2.setConsume(false);
                            String strOooO0O1 = purchase.OooO0O0();
                            Intrinsics.checkNotNullExpressionValue(strOooO0O1, "item.purchaseToken");
                            payOrder2.setPurchaseToken(strOooO0O1);
                            payOrder2.setCreateTime(purchase.f11251OooO0OO.optLong("purchaseTime"));
                            if (purchase.f11251OooO0OO.optInt("purchaseState", 1) != 4) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            payOrder2.setPurchaseState(i);
                            payOrder2.setAcknowledged(purchase.f11251OooO0OO.optBoolean("acknowledged", true));
                            payOrder2.setSubscription(z3);
                            payOrder2.setSubscriptionState(0);
                            list.add(payOrder2);
                        }
                    }
                }
            }
            z2 = z3;
            arrayList = list;
            payResult = payResult2;
        }
        o00O00.OooO0O0("Google补单 数据 \n isSubscription:" + z2 + "\n connected:" + payResult + "\n connected.data:" + payResult.getData() + "\n payOrderList.size:" + arrayList.size() + " \npayOrderList:" + arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object querySkuDetails(@NotNull List<String> list, boolean z, @NotNull Continuation<? super PayResult<List<GooglePaySkuDetail>>> continuation) throws Throwable {
        C04801 c04801;
        GooglePayManager googlePayManager;
        if (continuation instanceof C04801) {
            c04801 = (C04801) continuation;
            int i = c04801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04801.label = i - Integer.MIN_VALUE;
            } else {
                c04801 = new C04801(continuation);
            }
        } else {
            c04801 = new C04801(continuation);
        }
        Object objConnectIfLost = c04801.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04801.label;
        if (i2 != 0) {
            if (i2 == 1) {
                z = c04801.Z$0;
                list = (List) c04801.L$1;
                googlePayManager = (GooglePayManager) c04801.L$0;
                ResultKt.throwOnFailure(objConnectIfLost);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objConnectIfLost);
            }
        }
        ResultKt.throwOnFailure(objConnectIfLost);
        c04801.L$0 = this;
        c04801.L$1 = list;
        c04801.Z$0 = z;
        c04801.label = 1;
        objConnectIfLost = connectIfLost(c04801);
        if (objConnectIfLost == coroutine_suspended) {
            return coroutine_suspended;
        }
        googlePayManager = this;
        PayResult payResult = (PayResult) objConnectIfLost;
        if (!Intrinsics.areEqual(payResult.getData(), Boxing.boxBoolean(true))) {
            PayResult payResult2 = new PayResult(null, null, 2, null);
            payResult2.setError(payResult.getError());
            return payResult2;
        }
        Oooo0.OooO00o oooO00o = new Oooo0.OooO00o(null);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "newBuilder()");
        oooO00o.f11245OooO0O0 = new ArrayList(list);
        oooO00o.f11244OooO00o = z ? BillingClient.SkuType.SUBS : BillingClient.SkuType.INAPP;
        CoroutineDispatcher io2 = Dispatchers.getIO();
        AnonymousClass2 anonymousClass2 = googlePayManager.new AnonymousClass2(oooO00o, payResult, null);
        c04801.L$0 = null;
        c04801.L$1 = null;
        c04801.label = 2;
        objConnectIfLost = BuildersKt.withContext(io2, anonymousClass2, c04801);
        return objConnectIfLost == coroutine_suspended ? coroutine_suspended : objConnectIfLost;
    }
}
