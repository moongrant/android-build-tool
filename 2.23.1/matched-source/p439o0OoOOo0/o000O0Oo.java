package p439o0OoOOo0;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.OooOO0O;
import com.android.billingclient.api.OooOOO;
import com.android.billingclient.api.OooOo;
import com.android.billingclient.api.OooOo00;
import com.android.billingclient.api.Oooo0;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.o000O0o;
import com.android.billingclient.api.o00Oo0;
import com.android.billingclient.api.o00oO0o;
import com.android.billingclient.api.o0OoOo0;
import com.android.billingclient.api.oo000o;
import com.code.android.util.o0000;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzm;
import com.google.android.gms.internal.play_billing.zzu;
import com.qiniu.android.http.ResponseInfo;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.manager.unBlur.GooglePaySubscriptionModel;
import com.yalla.yalla.model.RechargeMenuPayBuyResultModel;
import com.yalla.yalla.model.RechargeMenuToPayModel;
import com.yalla.yalla.util.PaySupportChannels;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o000OOo;
import p587o0oOooO.oO00000o;
import p587o0oOooO.oO00OO0O;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGooglePayManagerV5.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayManagerV5.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,358:1\n1855#2,2:359\n1855#2,2:361\n1855#2,2:363\n1855#2:365\n1855#2,2:366\n1856#2:368\n*S KotlinDebug\n*F\n+ 1 GooglePayManagerV5.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV5\n*L\n60#1:359,2\n76#1:361,2\n144#1:363,2\n325#1:365\n331#1:366,2\n325#1:368\n*E\n"})
public final class o000O0Oo extends o000O00O {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f47129OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<o000OO00> f47130OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ProductDetails f47131OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Ref.ObjectRef objectRef, ProductDetails productDetails, ArrayList arrayList) {
            super(0);
            this.f47129OooO0Oo = objectRef;
            this.f47131OooO0o0 = productDetails;
            this.f47130OooO0o = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ProductDetails.OooO0o oooO0o;
            ProductDetails.OooO0OO oooO0OO;
            ArrayList arrayList;
            this.f47129OooO0Oo.element = "订阅";
            ProductDetails productDetails = this.f47131OooO0o0;
            ArrayList arrayList2 = productDetails.f12769OooO0oO;
            if (arrayList2 != null && (oooO0o = (ProductDetails.OooO0o) arrayList2.get(0)) != null && (oooO0OO = oooO0o.f12777OooO0O0) != null && (arrayList = oooO0OO.f12775OooO00o) != null) {
                o000OO0O listener = new o000OO0O(productDetails, this.f47130OooO0o);
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                Intrinsics.checkNotNullParameter(listener, "listener");
                if (!arrayList.isEmpty()) {
                    listener.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV5", f = "GooglePayManagerV5.kt", i = {1, 1, 1, 1, 2, 2}, l = {133, 138, 179}, m = "buyV5", n = {"this", "orderId", DeviceRequestsHelper.DEVICE_INFO_MODEL, "subscription", "this", "subscription"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000O0Oo f47133OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public RechargeMenuToPayModel f47134OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f47135OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public GooglePaySubscriptionModel f47136OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f47137OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f47138OooOO0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47137OooO0oo = obj;
            this.f47138OooOO0 |= Integer.MIN_VALUE;
            return o000O0Oo.this.OooO0o(null, null, null, this);
        }
    }

    @SourceDebugExtension({"SMAP\nGooglePayManagerV5.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayManagerV5.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV5$buyV5$5$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,358:1\n1855#2,2:359\n*S KotlinDebug\n*F\n+ 1 GooglePayManagerV5.kt\ncom/yalla/yalla/manager/unBlur/googlepay/GooglePayManagerV5$buyV5$5$1\n*L\n193#1:359,2\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<OooOo00, List<? extends Purchase>, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Continuation<o00O0000<RechargeMenuPayBuyResultModel>> f47140OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ GooglePaySubscriptionModel f47141OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(GooglePaySubscriptionModel googlePaySubscriptionModel, SafeContinuation safeContinuation) {
            super(2);
            this.f47141OooO0o0 = googlePaySubscriptionModel;
            this.f47140OooO0o = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(OooOo00 oooOo00, List<? extends Purchase> list) {
            OooOo00 result = oooOo00;
            List<? extends Purchase> list2 = list;
            Intrinsics.checkNotNullParameter(result, "result");
            o000O0Oo.this.f47091OooO0o0 = null;
            int i = result.f12757OooO00o;
            Continuation<o00O0000<RechargeMenuPayBuyResultModel>> continuation = this.f47140OooO0o;
            if (i == 0) {
                GooglePaySubscriptionModel googlePaySubscriptionModel = this.f47141OooO0o0;
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
                String str = result.f12758OooO0O0;
                Intrinsics.checkNotNullExpressionValue(str, "getDebugMessage(...)");
                continuation.resumeWith(Result.m4215constructorimpl(new o00O0000(null, new o000OOo0(i, str))));
            } else {
                Result.Companion companion3 = Result.INSTANCE;
                continuation.resumeWith(Result.m4215constructorimpl(new o00O0000(null, new o000OOo0(-105, o0000.OooO0OO(o000OOo.Pay_Commodity_Already_Owned)))));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV5", f = "GooglePayManagerV5.kt", i = {1, 1}, l = {264, 266, 278, 283}, m = "consumeOrderV5", n = {"this", "payOrder"}, s = {"L$0", "L$1"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000O0Oo f47142OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f47143OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public PayOrder f47144OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f47146OooO0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47143OooO0o = obj;
            this.f47146OooO0oo |= Integer.MIN_VALUE;
            return o000O0Oo.this.OooO0oO(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV5", f = "GooglePayManagerV5.kt", i = {1, 1, 1, 2}, l = {54, 56, 70}, m = "queryDetailsV5", n = {"this", "skuList", "isSubscription", "connected"}, s = {"L$0", "L$1", "Z$0", "L$0"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f47147OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f47148OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f47149OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public List f47150OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f47151OooO0oO;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47151OooO0oO = obj;
            this.f47147OooO |= Integer.MIN_VALUE;
            return o000O0Oo.this.OooO(null, false, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.GooglePayManagerV5", f = "GooglePayManagerV5.kt", i = {1, 1, 2, 2, 2}, l = {310, 312, 317}, m = "queryPurchasesV5", n = {"this", "isSubscription", "connected", "payOrderList", "isSubscription"}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f47153OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f47154OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f47155OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public ArrayList f47156OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f47157OooO0oO;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47157OooO0oO = obj;
            this.f47153OooO |= Integer.MIN_VALUE;
            return o000O0Oo.this.OooOO0(false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(@NotNull Activity ac, long j) {
        super(ac, j);
        Intrinsics.checkNotNullParameter(ac, "ac");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    public static boolean OooO0oo(o000O0Oo o000o0oo2) {
        byte b;
        OooOo00 oooOo00;
        com.android.billingclient.api.OooO0o oooO0o = o000o0oo2.f47090OooO0Oo;
        if (oooO0o.OooO0Oo()) {
            switch (BillingClient.FeatureType.PRODUCT_DETAILS.hashCode()) {
                case -422092961:
                    if (!BillingClient.FeatureType.PRODUCT_DETAILS.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 96321:
                    if (!BillingClient.FeatureType.PRODUCT_DETAILS.equals("aaa")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 97314:
                    if (!BillingClient.FeatureType.PRODUCT_DETAILS.equals(BillingClient.FeatureType.IN_APP_MESSAGING)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 98307:
                    if (!BillingClient.FeatureType.PRODUCT_DETAILS.equals("ccc")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 99300:
                    if (!BillingClient.FeatureType.PRODUCT_DETAILS.equals("ddd")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 100293:
                    if (!BillingClient.FeatureType.PRODUCT_DETAILS.equals("eee")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 101286:
                    if (!BillingClient.FeatureType.PRODUCT_DETAILS.equals(BillingClient.FeatureType.PRODUCT_DETAILS)) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 207616302:
                    if (!BillingClient.FeatureType.PRODUCT_DETAILS.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 1987365622:
                    if (!BillingClient.FeatureType.PRODUCT_DETAILS.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    oooOo00 = !oooO0o.f12738OooO0oo ? com.android.billingclient.api.o0000.f12802OooOOO : com.android.billingclient.api.o0000.f12800OooOO0O;
                    break;
                case 1:
                    oooOo00 = !oooO0o.f12730OooO ? com.android.billingclient.api.o0000.f12804OooOOOO : com.android.billingclient.api.o0000.f12800OooOO0O;
                    break;
                case 2:
                    oooOo00 = !oooO0o.f12741OooOO0o ? com.android.billingclient.api.o0000.f12805OooOOOo : com.android.billingclient.api.o0000.f12800OooOO0O;
                    break;
                case 3:
                    oooOo00 = !oooO0o.f12744OooOOOO ? com.android.billingclient.api.o0000.f12809OooOo0 : com.android.billingclient.api.o0000.f12800OooOO0O;
                    break;
                case 4:
                    oooOo00 = !oooO0o.f12747OooOOo0 ? com.android.billingclient.api.o0000.f12807OooOOo0 : com.android.billingclient.api.o0000.f12800OooOO0O;
                    break;
                case 5:
                    oooOo00 = !oooO0o.f12745OooOOOo ? com.android.billingclient.api.o0000.f12808OooOOoo : com.android.billingclient.api.o0000.f12800OooOO0O;
                    break;
                case 6:
                case 7:
                    oooOo00 = !oooO0o.f12746OooOOo ? com.android.billingclient.api.o0000.f12806OooOOo : com.android.billingclient.api.o0000.f12800OooOO0O;
                    break;
                case 8:
                    oooOo00 = !oooO0o.f12748OooOOoo ? com.android.billingclient.api.o0000.f12810OooOo00 : com.android.billingclient.api.o0000.f12800OooOO0O;
                    break;
                default:
                    zzb.zzo("BillingClient", "Unsupported feature: ".concat(BillingClient.FeatureType.PRODUCT_DETAILS));
                    oooOo00 = com.android.billingclient.api.o0000.f12811OooOo0O;
                    break;
            }
        } else {
            oooOo00 = com.android.billingclient.api.o0000.f12801OooOO0o;
        }
        Intrinsics.checkNotNullExpressionValue(oooOo00, "isFeatureSupported(...)");
        int i = oooOo00.f12757OooO00o;
        boolean z = i == 0;
        if (!z) {
            OooOOOO.OooO("GooglePay 检查否支持 V5 isFeatureSupported responseCode = " + i);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7 A[LOOP:1: B:35:0x009e->B:39:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2 A[LOOP:2: B:45:0x00dc->B:47:0x00e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:58:0x0144  */
    /* JADX WARN: Code duplicated, block: B:59:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x016e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0180 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0181  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0252  */
    /* JADX WARN: Code duplicated, block: B:88:0x025a  */
    /* JADX WARN: Code duplicated, block: B:96:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v21, types: [T, java.util.ArrayList] */
    @Nullable
    public final Object OooO(@NotNull List<String> list, boolean z, @NotNull Continuation<? super o00O0000<List<o000OO00>>> continuation) throws Throwable {
        OooO0o oooO0o;
        o000O0Oo o000o0oo2;
        o00O0000 o00o0001;
        ArrayList<oo000o.OooO0O0> arrayList;
        String str;
        oo000o.OooO00o oooO00o;
        boolean zEquals;
        boolean zEquals2;
        final com.android.billingclient.api.OooO0o oooO0o2;
        final oo000o oo000oVar;
        final OooOO0O oooOO0O;
        Object objAwait;
        o00O0000 o00o0002;
        oo000o.OooO0O0.OooO00o oooO00o2;
        List<String> list2 = list;
        boolean z2 = z;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f47147OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f47147OooO = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objOooO0O0 = oooO0o.f47151OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f47147OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            if (!OooO0oo(this)) {
                oooO0o.f47147OooO = 1;
                objOooO0O0 = OooO0Oo(list2, z2, oooO0o);
                return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
            }
            oooO0o.f47148OooO0Oo = this;
            oooO0o.f47150OooO0o0 = list2;
            oooO0o.f47149OooO0o = z2;
            oooO0o.f47147OooO = 2;
            objOooO0O0 = OooO0O0(oooO0o);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            o000o0oo2 = this;
            o00o0001 = (o00O0000) objOooO0O0;
            if (Intrinsics.areEqual(o00o0001.f47168OooO00o, Boxing.boxBoolean(true))) {
                o00O0000 o00o0003 = new o00O0000(null, null);
                o00o0003.f47169OooO0O0 = o00o0001.f47169OooO0O0;
                return o00o0003;
            }
            arrayList = new ArrayList();
            if (z2) {
                str = "subs";
            } else {
                str = "inapp";
            }
            for (String str2 : list2) {
                oooO00o2 = new oo000o.OooO0O0.OooO00o();
                oooO00o2.f12871OooO00o = str2;
                oooO00o2.f12872OooO0O0 = str;
                if (str2 != null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                oo000o.OooO0O0 oooO0O0 = new oo000o.OooO0O0(oooO00o2);
                Intrinsics.checkNotNullExpressionValue(oooO0O0, "build(...)");
                arrayList.add(oooO0O0);
            }
            oooO00o = new oo000o.OooO00o();
            if (!arrayList.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            zEquals = false;
            zEquals2 = false;
            for (oo000o.OooO0O0 oooO0O1 : arrayList) {
                zEquals |= oooO0O1.f12870OooO0O0.equals("inapp");
                zEquals2 |= oooO0O1.f12870OooO0O0.equals("subs");
            }
            if (!zEquals) {
            }
            oooO00o.f12868OooO00o = zzu.zzk(arrayList);
            Intrinsics.checkNotNullExpressionValue(oooO00o, "setProductList(...)");
            oooO0o2 = o000o0oo2.f47090OooO0Oo;
            oo000oVar = new oo000o(oooO00o);
            Intrinsics.checkNotNullExpressionValue(oo000oVar, "build(...)");
            oooO0o.f47148OooO0Oo = o00o0001;
            oooO0o.f47150OooO0o0 = null;
            oooO0o.f47147OooO = 3;
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            oooOO0O = new OooOO0O(completableDeferredCompletableDeferred$default);
            if (!oooO0o2.OooO0Oo()) {
                oooOO0O.OooO00o(com.android.billingclient.api.o0000.f12801OooOO0o, new ArrayList());
            } else if (!oooO0o2.f12748OooOOoo) {
                zzb.zzo("BillingClient", "Querying product details is not supported.");
                oooOO0O.OooO00o(com.android.billingclient.api.o0000.f12810OooOo00, new ArrayList());
            } else if (oooO0o2.OooOO0(new Callable() { // from class: com.android.billingclient.api.o000O000
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strZzk;
                    OooO0o oooO0o3 = oooO0o2;
                    oo000o oo000oVar2 = oo000oVar;
                    o000oOoO o000oooo2 = oooOO0O;
                    oooO0o3.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    String strOooO00o = oo000oVar2.OooO00o();
                    zzu zzuVar = oo000oVar2.f12867OooO00o;
                    int size = zzuVar.size();
                    int iZzb = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            strZzk = "";
                            break;
                        }
                        int i4 = i3 + 20;
                        ArrayList arrayList3 = new ArrayList(zzuVar.subList(i3, i4 > size ? size : i4));
                        ArrayList<String> arrayList4 = new ArrayList<>();
                        int size2 = arrayList3.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            arrayList4.add(((oo000o.OooO0O0) arrayList3.get(i5)).f12869OooO00o);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
                        bundle.putString("playBillingLibraryVersion", oooO0o3.f12732OooO0O0);
                        try {
                            Bundle bundleZzl = oooO0o3.f12735OooO0o.zzl(17, oooO0o3.f12736OooO0o0.getPackageName(), strOooO00o, bundle, zzb.zzg(oooO0o3.f12732OooO0O0, arrayList3, null));
                            if (bundleZzl != null) {
                                if (bundleZzl.containsKey("DETAILS_LIST")) {
                                    ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList == null) {
                                        zzb.zzo("BillingClient", "queryProductDetailsAsync got null response list");
                                    } else {
                                        for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                                            try {
                                                ProductDetails productDetails = new ProductDetails(stringArrayList.get(i6));
                                                zzb.zzn("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                                arrayList2.add(productDetails);
                                            } catch (JSONException e) {
                                                zzb.zzp("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                                                strZzk = "Error trying to decode SkuDetails.";
                                            }
                                        }
                                        i3 = i4;
                                    }
                                } else {
                                    iZzb = zzb.zzb(bundleZzl, "BillingClient");
                                    strZzk = zzb.zzk(bundleZzl, "BillingClient");
                                    if (iZzb != 0) {
                                        zzb.zzo("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb);
                                        break;
                                    }
                                    zzb.zzo("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                }
                                iZzb = 6;
                                break;
                            }
                            zzb.zzo("BillingClient", "queryProductDetailsAsync got empty product details response.");
                            iZzb = 4;
                            strZzk = "Item is unavailable for purchase.";
                            break;
                        } catch (Exception e2) {
                            zzb.zzp("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
                            strZzk = "An internal error occurred.";
                        }
                    }
                    OooOo00 oooOo00 = new OooOo00();
                    oooOo00.f12757OooO00o = iZzb;
                    oooOo00.f12758OooO0O0 = strZzk;
                    ((OooOO0O) o000oooo2).OooO00o(oooOo00, arrayList2);
                    return null;
                }
            }, 30000L, new o000O0o(oooOO0O, 0), oooO0o2.OooO0oO()) == null) {
                oooOO0O.OooO00o(oooO0o2.OooO(), new ArrayList());
            }
            objAwait = completableDeferredCompletableDeferred$default.await(oooO0o);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            objOooO0O0 = objAwait;
            o00o0002 = o00o0001;
        } else {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objOooO0O0);
            }
            if (i2 == 2) {
                boolean z3 = oooO0o.f47149OooO0o;
                List<String> list3 = oooO0o.f47150OooO0o0;
                o000o0oo2 = (o000O0Oo) oooO0o.f47148OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
                z2 = z3;
                list2 = list3;
                o00o0001 = (o00O0000) objOooO0O0;
                if (Intrinsics.areEqual(o00o0001.f47168OooO00o, Boxing.boxBoolean(true))) {
                    o00O0000 o00o0004 = new o00O0000(null, null);
                    o00o0004.f47169OooO0O0 = o00o0001.f47169OooO0O0;
                    return o00o0004;
                }
                arrayList = new ArrayList();
                if (z2) {
                    str = "subs";
                } else {
                    str = "inapp";
                }
                while (r1.hasNext()) {
                    oooO00o2 = new oo000o.OooO0O0.OooO00o();
                    oooO00o2.f12871OooO00o = str2;
                    oooO00o2.f12872OooO0O0 = str;
                    if (str2 != null) {
                        throw new IllegalArgumentException("Product id must be provided.");
                    }
                    oo000o.OooO0O0 oooO0O2 = new oo000o.OooO0O0(oooO00o2);
                    Intrinsics.checkNotNullExpressionValue(oooO0O2, "build(...)");
                    arrayList.add(oooO0O2);
                }
                oooO00o = new oo000o.OooO00o();
                if (!arrayList.isEmpty()) {
                    throw new IllegalArgumentException("Product list cannot be empty.");
                }
                zEquals = false;
                zEquals2 = false;
                while (r2.hasNext()) {
                    zEquals |= oooO0O1.f12870OooO0O0.equals("inapp");
                    zEquals2 |= oooO0O1.f12870OooO0O0.equals("subs");
                }
                if (!zEquals && zEquals2) {
                    throw new IllegalArgumentException("All products should be of the same product type.");
                }
                oooO00o.f12868OooO00o = zzu.zzk(arrayList);
                Intrinsics.checkNotNullExpressionValue(oooO00o, "setProductList(...)");
                oooO0o2 = o000o0oo2.f47090OooO0Oo;
                oo000oVar = new oo000o(oooO00o);
                Intrinsics.checkNotNullExpressionValue(oo000oVar, "build(...)");
                oooO0o.f47148OooO0Oo = o00o0001;
                oooO0o.f47150OooO0o0 = null;
                oooO0o.f47147OooO = 3;
                CompletableDeferred completableDeferredCompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                oooOO0O = new OooOO0O(completableDeferredCompletableDeferred$default2);
                if (!oooO0o2.OooO0Oo()) {
                    oooOO0O.OooO00o(com.android.billingclient.api.o0000.f12801OooOO0o, new ArrayList());
                } else if (!oooO0o2.f12748OooOOoo) {
                    zzb.zzo("BillingClient", "Querying product details is not supported.");
                    oooOO0O.OooO00o(com.android.billingclient.api.o0000.f12810OooOo00, new ArrayList());
                } else if (oooO0o2.OooOO0(new Callable() { // from class: com.android.billingclient.api.o000O000
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String strZzk;
                        OooO0o oooO0o3 = oooO0o2;
                        oo000o oo000oVar2 = oo000oVar;
                        o000oOoO o000oooo2 = oooOO0O;
                        oooO0o3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        String strOooO00o = oo000oVar2.OooO00o();
                        zzu zzuVar = oo000oVar2.f12867OooO00o;
                        int size = zzuVar.size();
                        int iZzb = 0;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                strZzk = "";
                                break;
                            }
                            int i4 = i3 + 20;
                            ArrayList arrayList3 = new ArrayList(zzuVar.subList(i3, i4 > size ? size : i4));
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            int size2 = arrayList3.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                arrayList4.add(((oo000o.OooO0O0) arrayList3.get(i5)).f12869OooO00o);
                            }
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
                            bundle.putString("playBillingLibraryVersion", oooO0o3.f12732OooO0O0);
                            try {
                                Bundle bundleZzl = oooO0o3.f12735OooO0o.zzl(17, oooO0o3.f12736OooO0o0.getPackageName(), strOooO00o, bundle, zzb.zzg(oooO0o3.f12732OooO0O0, arrayList3, null));
                                if (bundleZzl != null) {
                                    if (bundleZzl.containsKey("DETAILS_LIST")) {
                                        ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                                        if (stringArrayList == null) {
                                            zzb.zzo("BillingClient", "queryProductDetailsAsync got null response list");
                                        } else {
                                            for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                                                try {
                                                    ProductDetails productDetails = new ProductDetails(stringArrayList.get(i6));
                                                    zzb.zzn("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                                    arrayList2.add(productDetails);
                                                } catch (JSONException e) {
                                                    zzb.zzp("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                                                    strZzk = "Error trying to decode SkuDetails.";
                                                }
                                            }
                                            i3 = i4;
                                        }
                                    } else {
                                        iZzb = zzb.zzb(bundleZzl, "BillingClient");
                                        strZzk = zzb.zzk(bundleZzl, "BillingClient");
                                        if (iZzb != 0) {
                                            zzb.zzo("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb);
                                            break;
                                        }
                                        zzb.zzo("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                    }
                                    iZzb = 6;
                                    break;
                                }
                                zzb.zzo("BillingClient", "queryProductDetailsAsync got empty product details response.");
                                iZzb = 4;
                                strZzk = "Item is unavailable for purchase.";
                                break;
                            } catch (Exception e2) {
                                zzb.zzp("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e2);
                                strZzk = "An internal error occurred.";
                            }
                        }
                        OooOo00 oooOo00 = new OooOo00();
                        oooOo00.f12757OooO00o = iZzb;
                        oooOo00.f12758OooO0O0 = strZzk;
                        ((OooOO0O) o000oooo2).OooO00o(oooOo00, arrayList2);
                        return null;
                    }
                }, 30000L, new o000O0o(oooOO0O, 0), oooO0o2.OooO0oO()) == null) {
                    oooOO0O.OooO00o(oooO0o2.OooO(), new ArrayList());
                }
                objAwait = completableDeferredCompletableDeferred$default2.await(oooO0o);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objOooO0O0 = objAwait;
                o00o0002 = o00o0001;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00o0002 = (o00O0000) oooO0o.f47148OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
            }
        }
        o0OoOo0 o0oooo1 = (o0OoOo0) objOooO0O0;
        if (o0oooo1.f12861OooO00o.f12757OooO00o != 0) {
            o00O0000 o00o0005 = new o00O0000(null, null);
            o00o0005.f47169OooO0O0 = o00o0002.f47169OooO0O0;
            return o00o0005;
        }
        o00O0000 o00o0006 = new o00O0000(null, null);
        ?? arrayList2 = new ArrayList();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        List<ProductDetails> list4 = o0oooo1.f12862OooO0O0;
        if (list4 != null) {
            for (ProductDetails productDetails : list4) {
                ArrayList arrayList3 = productDetails.f12769OooO0oO;
                if (arrayList3 != null) {
                    Intrinsics.checkNotNull(arrayList3);
                    OooO listener = new OooO(objectRef, productDetails, arrayList2);
                    Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    if (!arrayList3.isEmpty()) {
                        listener.invoke();
                    }
                }
                ProductDetails.OooO00o OooO00o2 = productDetails.OooO00o();
                if (OooO00o2 != null) {
                    objectRef.element = "内购";
                    String str3 = productDetails.f12765OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(str3, "getProductId(...)");
                    o000OO00 o000oo01 = new o000OO00(str3);
                    String strValueOf = String.valueOf((OooO00o2.f12770OooO00o / ((long) ResponseInfo.UnknownError)) / 100.0d);
                    StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null);
                    strValueOf.getClass();
                    o000oo01.f47160OooO0O0 = com.code.android.util.o0OoOo0.OooO0OO(strValueOf, 0.0d);
                    String str4 = OooO00o2.f12771OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(str4, "getPriceCurrencyCode(...)");
                    Intrinsics.checkNotNullParameter(str4, "<set-?>");
                    o000oo01.f47161OooO0OO = str4;
                    o000oo01.f47162OooO0Oo = null;
                    o000oo01.f47163OooO0o0 = productDetails;
                    arrayList2.add(o000oo01);
                }
            }
        }
        o00o0006.f47168OooO00o = arrayList2;
        OooOOOO.OooO0O0("GooglePay 商品详情 V5：queryProductDetailsAsync " + objectRef.element + "\npayResult = " + o00o0006 + ZegoConstants.ZegoVideoDataAuxPublishingStream);
        return o00o0006;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:83:0x0220  */
    /* JADX WARN: Code duplicated, block: B:85:0x0225 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0227  */
    /* JADX WARN: Code duplicated, block: B:89:0x022f  */
    @Nullable
    public final Object OooO0o(@NotNull String str, @NotNull RechargeMenuToPayModel rechargeMenuToPayModel, @Nullable GooglePaySubscriptionModel googlePaySubscriptionModel, @NotNull Continuation<? super o00O0000<RechargeMenuPayBuyResultModel>> continuation) {
        OooO00o oooO00o;
        o000O0Oo o000o0oo2;
        o00O0000 o00o0001;
        BillingFlowParams.OooO0O0.OooO00o oooO00o2;
        ProductDetails productDetails;
        ProductDetails productDetails2;
        BillingFlowParams.OooO00o oooO00o3;
        OooOo00 oooOo00OooO0o0;
        String str2;
        int i;
        boolean z;
        ArrayList<ProductDetails.OooO0o> arrayList;
        String str3;
        String str4 = str;
        RechargeMenuToPayModel rechargeMenuToPayModel2 = rechargeMenuToPayModel;
        GooglePaySubscriptionModel googlePaySubscriptionModel2 = googlePaySubscriptionModel;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i2 = oooO00o.f47138OooOO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO00o.f47138OooOO0 = i2 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0O0 = oooO00o.f47137OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO00o.f47138OooOO0;
        int i4 = 2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            if (!OooO0oo(this)) {
                oooO00o.f47138OooOO0 = 1;
                objOooO0O0 = OooO00o(str4, rechargeMenuToPayModel2, googlePaySubscriptionModel2, oooO00o);
                return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
            }
            if (rechargeMenuToPayModel.getProductDetails() == null) {
                o00O0000 o00o0002 = new o00O0000(null, null);
                o00o0002.f47169OooO0O0 = new o000OOo0(-113, o0000.OooO0OO(o000OOo.Pay_Params_Is_Null));
                return o00o0002;
            }
            oooO00o.f47133OooO0Oo = this;
            oooO00o.f47135OooO0o0 = str4;
            oooO00o.f47134OooO0o = rechargeMenuToPayModel2;
            oooO00o.f47136OooO0oO = googlePaySubscriptionModel2;
            oooO00o.f47138OooOO0 = 2;
            objOooO0O0 = OooO0O0(oooO00o);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            o000o0oo2 = this;
            o00o0001 = (o00O0000) objOooO0O0;
            if (Intrinsics.areEqual(o00o0001.f47168OooO00o, Boxing.boxBoolean(true))) {
                return new o00O0000(null, o00o0001.f47169OooO0O0);
            }
            ArrayList arrayList2 = new ArrayList();
            oooO00o2 = new BillingFlowParams.OooO0O0.OooO00o();
            productDetails = rechargeMenuToPayModel2.getProductDetails();
            Intrinsics.checkNotNull(productDetails);
            oooO00o2.f12719OooO00o = productDetails;
            if (productDetails.OooO00o() != null) {
                productDetails.OooO00o().getClass();
                oooO00o2.f12720OooO0O0 = productDetails.OooO00o().f12772OooO0OO;
            }
            productDetails2 = rechargeMenuToPayModel2.getProductDetails();
            if (productDetails2 != null) {
                Intrinsics.checkNotNull(arrayList);
                for (ProductDetails.OooO0o oooO0o : arrayList) {
                    if (oooO0o == null) {
                    }
                }
            }
            zzm.zzc(oooO00o2.f12719OooO00o, "ProductDetails is required for constructing ProductDetailsParams.");
            zzm.zzc(oooO00o2.f12720OooO0O0, "offerToken is required for constructing ProductDetailsParams.");
            BillingFlowParams.OooO0O0 oooO0O0 = new BillingFlowParams.OooO0O0(oooO00o2);
            Intrinsics.checkNotNullExpressionValue(oooO0O0, "build(...)");
            arrayList2.add(oooO0O0);
            oooO00o3 = new BillingFlowParams.OooO00o();
            String content = String.valueOf(o000o0oo2.f47088OooO0O0);
            Intrinsics.checkNotNullParameter(content, "content");
            oooO00o3.f12712OooO00o = Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(content, oO00OO0O.OooO00o(), oO00000o.f56665OooO00o, (String) null, 4, (Object) null));
            oooO00o3.f12713OooO0O0 = str4;
            oooO00o3.f12714OooO0OO = new ArrayList(arrayList2);
            Intrinsics.checkNotNullExpressionValue(oooO00o3, "setProductDetailsParamsList(...)");
            oooOo00OooO0o0 = o000o0oo2.f47090OooO0Oo.OooO0o0(o000o0oo2.f47087OooO00o, oooO00o3.OooO00o());
            Intrinsics.checkNotNullExpressionValue(oooOo00OooO0o0, "launchBillingFlow(...)");
            OooOOOO.OooO0O0("GooglePay 购买订阅 V5 \norderId:" + str4 + " \nproductDetails:" + rechargeMenuToPayModel2.getProductDetails() + "\nsubscription:" + googlePaySubscriptionModel2 + "\nbillingResult:" + oooOo00OooO0o0);
            if (googlePaySubscriptionModel2 != null) {
                str2 = googlePaySubscriptionModel2.f22944OooO0O0;
                i = GooglePaySubscriptionModel.OooO00o.$EnumSwitchMapping$0[googlePaySubscriptionModel2.f22945OooO0OO.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        i4 = 1;
                    } else {
                        i4 = 4;
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    z = true;
                } else {
                    z = true;
                }
                boolean zIsEmpty = true ^ TextUtils.isEmpty(null);
                if (!z) {
                }
                if (z) {
                }
                BillingFlowParams.OooO0OO oooO0OO = new BillingFlowParams.OooO0OO();
                oooO0OO.f12721OooO00o = str2;
                oooO0OO.f12722OooO0O0 = i4;
                BillingFlowParams.OooO0OO.OooO00o oooO00o4 = new BillingFlowParams.OooO0OO.OooO00o();
                oooO00o4.f12723OooO00o = oooO0OO.f12721OooO00o;
                oooO00o4.f12725OooO0OO = oooO0OO.f12722OooO0O0;
                oooO00o3.f12716OooO0o0 = oooO00o4;
            }
            if (oooOo00OooO0o0.f12757OooO00o == 0) {
                return new o00O0000(null, o00o0001.f47169OooO0O0);
            }
            oooO00o.f47133OooO0Oo = o000o0oo2;
            oooO00o.f47135OooO0o0 = googlePaySubscriptionModel2;
            oooO00o.f47134OooO0o = null;
            oooO00o.f47136OooO0oO = null;
            oooO00o.f47138OooOO0 = 3;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(oooO00o));
            o000o0oo2.f47091OooO0o0 = o000o0oo2.new OooO0O0(googlePaySubscriptionModel2, safeContinuation);
            objOooO0O0 = safeContinuation.getOrThrow();
            if (objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooO00o);
            }
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 == 1) {
                ResultKt.throwOnFailure(objOooO0O0);
            }
            if (i3 == 2) {
                GooglePaySubscriptionModel googlePaySubscriptionModel3 = oooO00o.f47136OooO0oO;
                rechargeMenuToPayModel2 = oooO00o.f47134OooO0o;
                String str5 = (String) oooO00o.f47135OooO0o0;
                o000o0oo2 = oooO00o.f47133OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
                googlePaySubscriptionModel2 = googlePaySubscriptionModel3;
                str4 = str5;
                o00o0001 = (o00O0000) objOooO0O0;
                if (Intrinsics.areEqual(o00o0001.f47168OooO00o, Boxing.boxBoolean(true))) {
                    return new o00O0000(null, o00o0001.f47169OooO0O0);
                }
                ArrayList arrayList3 = new ArrayList();
                oooO00o2 = new BillingFlowParams.OooO0O0.OooO00o();
                productDetails = rechargeMenuToPayModel2.getProductDetails();
                Intrinsics.checkNotNull(productDetails);
                oooO00o2.f12719OooO00o = productDetails;
                if (productDetails.OooO00o() != null) {
                    productDetails.OooO00o().getClass();
                    oooO00o2.f12720OooO0O0 = productDetails.OooO00o().f12772OooO0OO;
                }
                productDetails2 = rechargeMenuToPayModel2.getProductDetails();
                if (productDetails2 != null && (arrayList = productDetails2.f12769OooO0oO) != null) {
                    Intrinsics.checkNotNull(arrayList);
                    while (r14.hasNext()) {
                        if (oooO0o == null && (str3 = oooO0o.f12776OooO00o) != null) {
                            oooO00o2.f12720OooO0O0 = str3;
                        }
                    }
                }
                zzm.zzc(oooO00o2.f12719OooO00o, "ProductDetails is required for constructing ProductDetailsParams.");
                zzm.zzc(oooO00o2.f12720OooO0O0, "offerToken is required for constructing ProductDetailsParams.");
                BillingFlowParams.OooO0O0 oooO0O1 = new BillingFlowParams.OooO0O0(oooO00o2);
                Intrinsics.checkNotNullExpressionValue(oooO0O1, "build(...)");
                arrayList3.add(oooO0O1);
                oooO00o3 = new BillingFlowParams.OooO00o();
                String content2 = String.valueOf(o000o0oo2.f47088OooO0O0);
                Intrinsics.checkNotNullParameter(content2, "content");
                oooO00o3.f12712OooO00o = Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(content2, oO00OO0O.OooO00o(), oO00000o.f56665OooO00o, (String) null, 4, (Object) null));
                oooO00o3.f12713OooO0O0 = str4;
                oooO00o3.f12714OooO0OO = new ArrayList(arrayList3);
                Intrinsics.checkNotNullExpressionValue(oooO00o3, "setProductDetailsParamsList(...)");
                oooOo00OooO0o0 = o000o0oo2.f47090OooO0Oo.OooO0o0(o000o0oo2.f47087OooO00o, oooO00o3.OooO00o());
                Intrinsics.checkNotNullExpressionValue(oooOo00OooO0o0, "launchBillingFlow(...)");
                OooOOOO.OooO0O0("GooglePay 购买订阅 V5 \norderId:" + str4 + " \nproductDetails:" + rechargeMenuToPayModel2.getProductDetails() + "\nsubscription:" + googlePaySubscriptionModel2 + "\nbillingResult:" + oooOo00OooO0o0);
                if (googlePaySubscriptionModel2 != null && (!StringsKt.isBlank(googlePaySubscriptionModel2.f22943OooO00o)) && (!StringsKt.isBlank(googlePaySubscriptionModel2.f22944OooO0O0))) {
                    str2 = googlePaySubscriptionModel2.f22944OooO0O0;
                    i = GooglePaySubscriptionModel.OooO00o.$EnumSwitchMapping$0[googlePaySubscriptionModel2.f22945OooO0OO.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            i4 = 1;
                        } else {
                            i4 = 4;
                        }
                    }
                    if (TextUtils.isEmpty(str2) || !TextUtils.isEmpty(null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean zIsEmpty2 = true ^ TextUtils.isEmpty(null);
                    if (!z && zIsEmpty2) {
                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                    }
                    if (z && !zIsEmpty2) {
                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                    }
                    BillingFlowParams.OooO0OO oooO0OO2 = new BillingFlowParams.OooO0OO();
                    oooO0OO2.f12721OooO00o = str2;
                    oooO0OO2.f12722OooO0O0 = i4;
                    BillingFlowParams.OooO0OO.OooO00o oooO00o5 = new BillingFlowParams.OooO0OO.OooO00o();
                    oooO00o5.f12723OooO00o = oooO0OO2.f12721OooO00o;
                    oooO00o5.f12725OooO0OO = oooO0OO2.f12722OooO0O0;
                    oooO00o3.f12716OooO0o0 = oooO00o5;
                }
                if (oooOo00OooO0o0.f12757OooO00o == 0) {
                    return new o00O0000(null, o00o0001.f47169OooO0O0);
                }
                oooO00o.f47133OooO0Oo = o000o0oo2;
                oooO00o.f47135OooO0o0 = googlePaySubscriptionModel2;
                oooO00o.f47134OooO0o = null;
                oooO00o.f47136OooO0oO = null;
                oooO00o.f47138OooOO0 = 3;
                SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt.intercepted(oooO00o));
                o000o0oo2.f47091OooO0o0 = o000o0oo2.new OooO0O0(googlePaySubscriptionModel2, safeContinuation2);
                objOooO0O0 = safeContinuation2.getOrThrow();
                if (objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(oooO00o);
                }
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0O0);
            }
        }
        return objOooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oO(@NotNull PayOrder payOrder, @NotNull Continuation<? super Boolean> continuation) {
        OooO0OO oooO0OO;
        o000O0Oo o000o0oo2;
        String purchaseToken;
        String purchaseToken2;
        OooOo00 oooOo00;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f47146OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f47146OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objOooO0O0 = oooO0OO.f47143OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f47146OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            if (!OooO0oo(this)) {
                oooO0OO.f47146OooO0oo = 1;
                objOooO0O0 = OooO0OO(payOrder, oooO0OO);
                return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
            }
            oooO0OO.f47142OooO0Oo = this;
            oooO0OO.f47144OooO0o0 = payOrder;
            oooO0OO.f47146OooO0oo = 2;
            objOooO0O0 = OooO0O0(oooO0OO);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            o000o0oo2 = this;
            if (Intrinsics.areEqual(((o00O0000) objOooO0O0).f47168OooO00o, Boxing.boxBoolean(true))) {
                return null;
            }
            if (payOrder.getIsSubscription()) {
                new OooOo.OooO00o();
                purchaseToken = payOrder.getPurchaseToken();
                if (purchaseToken != null) {
                    throw new IllegalArgumentException("Purchase token must be set");
                }
                OooOo oooOo = new OooOo(0);
                oooOo.f12756OooO00o = purchaseToken;
                Intrinsics.checkNotNullExpressionValue(oooOo, "build(...)");
                com.android.billingclient.api.OooO0o oooO0o = o000o0oo2.f47090OooO0Oo;
                oooO0OO.f47142OooO0Oo = null;
                oooO0OO.f47144OooO0o0 = null;
                oooO0OO.f47146OooO0oo = 4;
                CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                oooO0o.OooO0OO(oooOo, new com.android.billingclient.api.OooOO0(completableDeferredCompletableDeferred$default));
                objOooO0O0 = completableDeferredCompletableDeferred$default.await(oooO0OO);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOo00 = ((Oooo0) objOooO0O0).f12761OooO00o;
                OooOOOO.OooO("GooglePay consumeOrderV5 consumePurchase \nbillingResult = " + oooOo00);
            } else if (payOrder.getSubscriptionState() == GooglePaySubscriptionModel.Action.Downgrade.getValue()) {
                oooOo00 = new OooOo00();
                oooOo00.f12757OooO00o = 0;
                oooOo00.f12758OooO0O0 = "";
                Intrinsics.checkNotNull(oooOo00);
            } else {
                new com.android.billingclient.api.OooO0O0.OooO00o();
                purchaseToken2 = payOrder.getPurchaseToken();
                if (purchaseToken2 != null) {
                    throw new IllegalArgumentException("Purchase token must be set");
                }
                com.android.billingclient.api.OooO0O0 oooO0O0 = new com.android.billingclient.api.OooO0O0(0);
                oooO0O0.f12729OooO00o = purchaseToken2;
                Intrinsics.checkNotNullExpressionValue(oooO0O0, "build(...)");
                com.android.billingclient.api.OooO0o oooO0o2 = o000o0oo2.f47090OooO0Oo;
                oooO0OO.f47142OooO0Oo = null;
                oooO0OO.f47144OooO0o0 = null;
                oooO0OO.f47146OooO0oo = 3;
                CompletableDeferred completableDeferredCompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                oooO0o2.OooO0O0(oooO0O0, new com.android.billingclient.api.OooO(completableDeferredCompletableDeferred$default2));
                objOooO0O0 = completableDeferredCompletableDeferred$default2.await(oooO0OO);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOo00 = (OooOo00) objOooO0O0;
            }
        } else {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objOooO0O0);
            }
            if (i2 == 2) {
                payOrder = oooO0OO.f47144OooO0o0;
                o000o0oo2 = oooO0OO.f47142OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
                if (Intrinsics.areEqual(((o00O0000) objOooO0O0).f47168OooO00o, Boxing.boxBoolean(true))) {
                    return null;
                }
                if (payOrder.getIsSubscription()) {
                    new OooOo.OooO00o();
                    purchaseToken = payOrder.getPurchaseToken();
                    if (purchaseToken != null) {
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                    OooOo oooOo2 = new OooOo(0);
                    oooOo2.f12756OooO00o = purchaseToken;
                    Intrinsics.checkNotNullExpressionValue(oooOo2, "build(...)");
                    com.android.billingclient.api.OooO0o oooO0o3 = o000o0oo2.f47090OooO0Oo;
                    oooO0OO.f47142OooO0Oo = null;
                    oooO0OO.f47144OooO0o0 = null;
                    oooO0OO.f47146OooO0oo = 4;
                    CompletableDeferred completableDeferredCompletableDeferred$default3 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    oooO0o3.OooO0OO(oooOo2, new com.android.billingclient.api.OooOO0(completableDeferredCompletableDeferred$default3));
                    objOooO0O0 = completableDeferredCompletableDeferred$default3.await(oooO0OO);
                    if (objOooO0O0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooOo00 = ((Oooo0) objOooO0O0).f12761OooO00o;
                    OooOOOO.OooO("GooglePay consumeOrderV5 consumePurchase \nbillingResult = " + oooOo00);
                } else if (payOrder.getSubscriptionState() == GooglePaySubscriptionModel.Action.Downgrade.getValue()) {
                    oooOo00 = new OooOo00();
                    oooOo00.f12757OooO00o = 0;
                    oooOo00.f12758OooO0O0 = "";
                    Intrinsics.checkNotNull(oooOo00);
                } else {
                    new com.android.billingclient.api.OooO0O0.OooO00o();
                    purchaseToken2 = payOrder.getPurchaseToken();
                    if (purchaseToken2 != null) {
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                    com.android.billingclient.api.OooO0O0 oooO0O1 = new com.android.billingclient.api.OooO0O0(0);
                    oooO0O1.f12729OooO00o = purchaseToken2;
                    Intrinsics.checkNotNullExpressionValue(oooO0O1, "build(...)");
                    com.android.billingclient.api.OooO0o oooO0o4 = o000o0oo2.f47090OooO0Oo;
                    oooO0OO.f47142OooO0Oo = null;
                    oooO0OO.f47144OooO0o0 = null;
                    oooO0OO.f47146OooO0oo = 3;
                    CompletableDeferred completableDeferredCompletableDeferred$default4 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    oooO0o4.OooO0O0(oooO0O1, new com.android.billingclient.api.OooO(completableDeferredCompletableDeferred$default4));
                    objOooO0O0 = completableDeferredCompletableDeferred$default4.await(oooO0OO);
                    if (objOooO0O0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooOo00 = (OooOo00) objOooO0O0;
                }
            } else if (i2 == 3) {
                ResultKt.throwOnFailure(objOooO0O0);
                oooOo00 = (OooOo00) objOooO0O0;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0O0);
                oooOo00 = ((Oooo0) objOooO0O0).f12761OooO00o;
                OooOOOO.OooO("GooglePay consumeOrderV5 consumePurchase \nbillingResult = " + oooOo00);
            }
        }
        int i3 = oooOo00.f12757OooO00o;
        if (i3 == -3 || i3 == 2 || i3 == -1) {
            return null;
        }
        return i3 != 0 ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x0107  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0119  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f A[LOOP:1: B:61:0x0129->B:63:0x012f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooOO0(boolean z, @NotNull Continuation<? super List<PayOrder>> continuation) throws Throwable {
        OooOO0 oooOO1;
        o000O0Oo o000o0oo2;
        o00O0000 o00o0001;
        ArrayList arrayList;
        String str;
        Object objAwait;
        ArrayList arrayList2;
        o00O0000 o00o0002;
        o00Oo0 o00oo1;
        List<Purchase> list;
        com.android.billingclient.api.OooO00o OooO00o2;
        String str2;
        com.android.billingclient.api.OooO00o OooO00o3;
        String str3;
        boolean z2;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f47153OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f47153OooO = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        Object objOooO0O0 = oooOO1.f47157OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO1.f47153OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            if (!OooO0oo(this)) {
                oooOO1.f47153OooO = 1;
                objOooO0O0 = OooO0o0(z, oooOO1);
                return objOooO0O0 == coroutine_suspended ? coroutine_suspended : objOooO0O0;
            }
            oooOO1.f47154OooO0Oo = this;
            oooOO1.f47155OooO0o = z;
            oooOO1.f47153OooO = 2;
            objOooO0O0 = OooO0O0(oooOO1);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            o000o0oo2 = this;
            o00o0001 = (o00O0000) objOooO0O0;
            arrayList = new ArrayList();
            if (Intrinsics.areEqual(o00o0001.f47168OooO00o, Boxing.boxBoolean(true))) {
                com.android.billingclient.api.OooO0o oooO0o = o000o0oo2.f47090OooO0Oo;
                o00oO0o.OooO00o oooO00o = new o00oO0o.OooO00o();
                if (z) {
                    str = "subs";
                } else {
                    str = "inapp";
                }
                oooO00o.f12853OooO00o = str;
                o00oO0o o00oo0o2 = new o00oO0o(oooO00o);
                Intrinsics.checkNotNullExpressionValue(o00oo0o2, "build(...)");
                oooOO1.f47154OooO0Oo = o00o0001;
                oooOO1.f47156OooO0o0 = arrayList;
                oooOO1.f47155OooO0o = z;
                oooOO1.f47153OooO = 3;
                CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                OooOOO oooOOO = new OooOOO(completableDeferredCompletableDeferred$default);
                oooO0o.getClass();
                oooO0o.OooOO0O(o00oo0o2.f12852OooO00o, oooOOO);
                objAwait = completableDeferredCompletableDeferred$default.await(oooOO1);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList2 = arrayList;
                o00o0002 = o00o0001;
                objOooO0O0 = objAwait;
                o00oo1 = (o00Oo0) objOooO0O0;
                OooOo00 oooOo00 = o00oo1.f12850OooO00o;
                StringBuilder sb = new StringBuilder("GooglePay 补单V5 有丢单记录1 \n billingResult:");
                sb.append(oooOo00);
                sb.append(" \n purchaseList:");
                list = o00oo1.f12851OooO0O0;
                sb.append(list);
                OooOOOO.OooO0O0(sb.toString());
                if (o00oo1.f12850OooO00o.f12757OooO00o == 0) {
                    for (Purchase purchase : list) {
                        OooO00o2 = purchase.OooO00o();
                        if (OooO00o2 != null) {
                            str2 = OooO00o2.f12727OooO00o;
                        } else {
                            str2 = null;
                        }
                        OooO00o3 = purchase.OooO00o();
                        if (OooO00o3 != null) {
                            str3 = OooO00o3.f12728OooO0O0;
                        } else {
                            str3 = null;
                        }
                        if (str2 == null) {
                            if (str3 != null) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (!z2) {
                                ArrayList<String> arrayListOooO0Oo = purchase.OooO0Oo();
                                Intrinsics.checkNotNullExpressionValue(arrayListOooO0Oo, "getProducts(...)");
                                for (String str4 : arrayListOooO0Oo) {
                                    PayOrder payOrder = new PayOrder();
                                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                                    payOrder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                                    payOrder.setOrderId(str3);
                                    Intrinsics.checkNotNull(str4);
                                    payOrder.setSku(str4);
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
                }
                o00o0001 = o00o0002;
                arrayList = arrayList2;
            }
        } else {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objOooO0O0);
            }
            if (i2 == 2) {
                z = oooOO1.f47155OooO0o;
                o000o0oo2 = (o000O0Oo) oooOO1.f47154OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
                o00o0001 = (o00O0000) objOooO0O0;
                arrayList = new ArrayList();
                if (Intrinsics.areEqual(o00o0001.f47168OooO00o, Boxing.boxBoolean(true))) {
                    com.android.billingclient.api.OooO0o oooO0o2 = o000o0oo2.f47090OooO0Oo;
                    o00oO0o.OooO00o oooO00o2 = new o00oO0o.OooO00o();
                    if (z) {
                        str = "subs";
                    } else {
                        str = "inapp";
                    }
                    oooO00o2.f12853OooO00o = str;
                    o00oO0o o00oo0o3 = new o00oO0o(oooO00o2);
                    Intrinsics.checkNotNullExpressionValue(o00oo0o3, "build(...)");
                    oooOO1.f47154OooO0Oo = o00o0001;
                    oooOO1.f47156OooO0o0 = arrayList;
                    oooOO1.f47155OooO0o = z;
                    oooOO1.f47153OooO = 3;
                    CompletableDeferred completableDeferredCompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    OooOOO oooOOO2 = new OooOOO(completableDeferredCompletableDeferred$default2);
                    oooO0o2.getClass();
                    oooO0o2.OooOO0O(o00oo0o3.f12852OooO00o, oooOOO2);
                    objAwait = completableDeferredCompletableDeferred$default2.await(oooOO1);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList2 = arrayList;
                    o00o0002 = o00o0001;
                    objOooO0O0 = objAwait;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = oooOO1.f47155OooO0o;
                arrayList2 = oooOO1.f47156OooO0o0;
                o00o0002 = (o00O0000) oooOO1.f47154OooO0Oo;
                ResultKt.throwOnFailure(objOooO0O0);
            }
            o00oo1 = (o00Oo0) objOooO0O0;
            OooOo00 oooOo01 = o00oo1.f12850OooO00o;
            StringBuilder sb2 = new StringBuilder("GooglePay 补单V5 有丢单记录1 \n billingResult:");
            sb2.append(oooOo01);
            sb2.append(" \n purchaseList:");
            list = o00oo1.f12851OooO0O0;
            sb2.append(list);
            OooOOOO.OooO0O0(sb2.toString());
            if (o00oo1.f12850OooO00o.f12757OooO00o == 0) {
                while (r15.hasNext()) {
                    OooO00o2 = purchase.OooO00o();
                    if (OooO00o2 != null) {
                        str2 = OooO00o2.f12727OooO00o;
                    } else {
                        str2 = null;
                    }
                    OooO00o3 = purchase.OooO00o();
                    if (OooO00o3 != null) {
                        str3 = OooO00o3.f12728OooO0O0;
                    } else {
                        str3 = null;
                    }
                    if (str2 == null) {
                        if (str3 != null || StringsKt.isBlank(str3)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            ArrayList<String> arrayListOooO0Oo2 = purchase.OooO0Oo();
                            Intrinsics.checkNotNullExpressionValue(arrayListOooO0Oo2, "getProducts(...)");
                            while (r7.hasNext()) {
                                PayOrder payOrder2 = new PayOrder();
                                oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                                payOrder2.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                                payOrder2.setOrderId(str3);
                                Intrinsics.checkNotNull(str4);
                                payOrder2.setSku(str4);
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
            }
            o00o0001 = o00o0002;
            arrayList = arrayList2;
        }
        OooOOOO.OooO0O0("GooglePay 补单V5 有丢单记录2 \n isSubscription:" + z + "\n connected:" + o00o0001 + "\n payOrderList:" + arrayList);
        return arrayList;
    }
}
