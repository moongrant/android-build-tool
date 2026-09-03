package p432o0OoOOOo;

import OooO0O0.OooO0O0;
import android.widget.TextView;
import com.android.billingclient.api.SkuDetails;
import com.code.android.util.o0000;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.model.RechargeMenuBanType;
import com.yalla.yalla.model.RechargeMenuType;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.util.PaySupportChannels;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00000O0;
import p431o0OoOOOO.o00OO;
import p431o0OoOOOO.o00OO0OO;
import p431o0OoOOOO.o00OOO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickUI$toQuerySkuDetails$2", f = "GooglePayQuickUI.kt", i = {}, l = {118, 128}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nGooglePayQuickUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayQuickUI.kt\ncom/yalla/yalla/manager/unBlur/googlepay/quick/GooglePayQuickUI$toQuerySkuDetails$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1855#2:464\n1856#2:466\n1#3:465\n*S KotlinDebug\n*F\n+ 1 GooglePayQuickUI.kt\ncom/yalla/yalla/manager/unBlur/googlepay/quick/GooglePayQuickUI$toQuerySkuDetails$2\n*L\n119#1:464\n119#1:466\n*E\n"})
public final class o0OoO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45961OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f45962OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<String> f45963OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ List<RechargeMenuType> f45964OooO0oO;

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickUI$toQuerySkuDetails$2$2", f = "GooglePayQuickUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f45965OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<RechargeMenuType> f45966OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OOOOo o00ooooo2, List<RechargeMenuType> list, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45965OooO0Oo = o00ooooo2;
            this.f45966OooO0o0 = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45965OooO0Oo, this.f45966OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            List<RechargeMenuType> list;
            TextView textView;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OOOOo o00ooooo2 = this.f45965OooO0Oo;
            Iterator it = o00ooooo2.f45931OooOOO.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                i = 1;
                list = this.f45966OooO0o0;
                if (!zHasNext) {
                    break;
                }
                RechargeMenuBanType rechargeMenuBanType = (RechargeMenuBanType) it.next();
                Iterator<RechargeMenuType> it2 = list.iterator();
                if ((it2 == null ? 0 : 1) != 0) {
                    while (it2.hasNext()) {
                        SkuDetails skuDetails = it2.next().getSkuDetails();
                        if (skuDetails != null && Intrinsics.areEqual(rechargeMenuBanType.getCurrency(), skuDetails.OooO0O0()) && Intrinsics.areEqual(rechargeMenuBanType.getSku(), skuDetails.f9683OooO0O0.optString("productId"))) {
                            it2.remove();
                        }
                    }
                }
            }
            if (list.isEmpty()) {
                StateLayout stateLayout = o00ooooo2.f45925OooO0o0;
                if (stateLayout != null) {
                    stateLayout.setEmptyText(o0000.OooO0OO(oO00OOo0.Recharge_Page_CopyUnder_maintenance));
                }
                StateLayout stateLayout2 = o00ooooo2.f45925OooO0o0;
                if (stateLayout2 != null) {
                    stateLayout2.OooO0o0();
                }
            } else {
                StateLayout stateLayout3 = o00ooooo2.f45925OooO0o0;
                if (stateLayout3 != null) {
                    stateLayout3.setEmptyText(o0000.OooO0OO(oO00OOo0.no_data));
                }
                if (!list.isEmpty()) {
                    RechargeMenuType rechargeMenuType = null;
                    for (RechargeMenuType rechargeMenuType2 : list) {
                        if (rechargeMenuType != null) {
                            int length = (rechargeMenuType.getUnit() + rechargeMenuType.getAmount()).length();
                            SkuDetails skuDetails2 = rechargeMenuType.getSkuDetails();
                            if (skuDetails2 != null) {
                                String strOooO0O0 = skuDetails2.OooO0O0();
                                Intrinsics.checkNotNullExpressionValue(strOooO0O0, "skuDetails.priceCurrencyCode");
                                length = o00OO0OO.OooO00o(skuDetails2.OooO00o(), strOooO0O0).length();
                            }
                            int length2 = (rechargeMenuType2.getUnit() + rechargeMenuType2.getAmount()).length();
                            SkuDetails skuDetails3 = rechargeMenuType2.getSkuDetails();
                            if (skuDetails3 != null) {
                                String strOooO0O1 = skuDetails3.OooO0O0();
                                Intrinsics.checkNotNullExpressionValue(strOooO0O1, "skuDetails.priceCurrencyCode");
                                length2 = o00OO0OO.OooO00o(skuDetails3.OooO00o(), strOooO0O1).length();
                            }
                            if (length < length2) {
                            }
                        }
                        rechargeMenuType = rechargeMenuType2;
                    }
                    if (rechargeMenuType != null && (textView = o00ooooo2.f45922OooO0OO) != null) {
                        String unit = rechargeMenuType.getUnit();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        textView.setText(unit + ZegoConstants.ZegoVideoDataAuxPublishingStream + OooO0O0.OooO00o(new Object[]{Double.valueOf(rechargeMenuType.getAmount())}, 1, "%.2f", "format(format, *args)"));
                        if (rechargeMenuType.getSkuDetails() != null) {
                            SkuDetails skuDetails4 = rechargeMenuType.getSkuDetails();
                            Intrinsics.checkNotNull(skuDetails4);
                            String strOooO0O2 = skuDetails4.OooO0O0();
                            Intrinsics.checkNotNullExpressionValue(strOooO0O2, "skuDetails!!.priceCurrencyCode");
                            SkuDetails skuDetails5 = rechargeMenuType.getSkuDetails();
                            Intrinsics.checkNotNull(skuDetails5);
                            textView.setText(o00OO0OO.OooO00o(skuDetails5.OooO00o(), strOooO0O2));
                        }
                        textView.post(new o00000O0(i, textView, o00ooooo2));
                    }
                }
                o00ooooo2.OooO0Oo().OooOoO0(list);
                StateLayout stateLayout4 = o00ooooo2.f45925OooO0o0;
                if (stateLayout4 != null) {
                    stateLayout4.OooO0Oo();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(List<String> list, o00OOOOo o00ooooo2, List<RechargeMenuType> list2, Continuation<? super o0OoO00O> continuation) {
        super(2, continuation);
        this.f45963OooO0o0 = list;
        this.f45962OooO0o = o00ooooo2;
        this.f45964OooO0oO = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OoO00O(this.f45963OooO0o0, this.f45962OooO0o, this.f45964OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OoO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MainCoroutineDispatcher main;
        OooO00o oooO00o;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45961OooO0Oo;
        o00OOOOo o00ooooo2 = this.f45962OooO0o;
        List<RechargeMenuType> list = this.f45964OooO0oO;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        List<String> list2 = this.f45963OooO0o0;
        if (!list2.isEmpty()) {
            PayManager payManager = (PayManager) o00ooooo2.f45919OooO.getValue();
            int num = PaySupportChannels.pay_type_googlePay.getNum();
            this.f45961OooO0Oo = 1;
            obj = payManager.queryDetails(list2, num, false, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        main = Dispatchers.getMain();
        oooO00o = new OooO00o(o00ooooo2, list, null);
        this.f45961OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        o00OOO0O o00ooo0o = (o00OOO0O) obj;
        for (RechargeMenuType rechargeMenuType : list) {
            List list3 = (List) o00ooo0o.f45913OooO00o;
            if (list3 != null) {
                Iterator it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(rechargeMenuType.getSku(), ((o00OO) next).f45870OooO00o));
                o00OO o00oo2 = (o00OO) next;
                if (o00oo2 != null) {
                    rechargeMenuType.setSkuDetails(o00oo2.f45873OooO0Oo);
                    rechargeMenuType.setProductDetails(o00oo2.f45874OooO0o0);
                    rechargeMenuType.setAmount(o00oo2.f45871OooO0O0);
                    rechargeMenuType.setUnit(o00oo2.f45872OooO0OO);
                }
            }
        }
        main = Dispatchers.getMain();
        oooO00o = new OooO00o(o00ooooo2, list, null);
        this.f45961OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
