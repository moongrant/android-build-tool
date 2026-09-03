package p566o0oOo00O;

import androidx.viewpager2.widget.ViewPager2;
import com.app.base.view.indicator.YlTableLayout;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.common.manager.googlepay.GooglePaySkuDetail;
import com.yalla.yalla.common.manager.googlepay.PayResult;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.RechargeBanType;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.ArrayList;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p183o00o000O.OooO0O0;
import p254o00ooO0O.o000O0O0;
import p515o0o0O00.o00O00;
import p522o0o0O0o.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$loadSubscriptionGoodsList$2", f = "PremiumActivity.kt", i = {}, l = {817, 830}, m = "invokeSuspend", n = {}, s = {})
public final class o00O000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f45245Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ List<String> f45246Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45247Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$loadSubscriptionGoodsList$2$2", f = "PremiumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PremiumActivity f45248Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PremiumActivity premiumActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45248Oooo0o = premiumActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45248Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RechargeBanType>] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            PremiumActivity premiumActivity = this.f45248Oooo0o;
            ?? r0 = premiumActivity.f23366OooooOo;
            ArrayList deleteIndex = new ArrayList();
            Iterator it = premiumActivity.f23368Oooooo0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RechargeBanType rechargeBanType = (RechargeBanType) it.next();
                Iterator it2 = r0.iterator();
                if (it2 != null) {
                    while (it2.hasNext()) {
                        PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) it2.next();
                        GooglePaySkuDetail googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
                        if (googlePaySkuDetail != null && Intrinsics.areEqual(rechargeBanType.getCurrency(), googlePaySkuDetail.getUnit()) && Intrinsics.areEqual(rechargeBanType.getSku(), googlePaySkuDetail.getSku())) {
                            it2.remove();
                            deleteIndex.add(Integer.valueOf(premiumInfo.getIndex()));
                        }
                    }
                }
            }
            List<String> listOooo0o = premiumActivity.Oooo0o();
            o00 o00Var = new o00(premiumActivity);
            Intrinsics.checkNotNullParameter(deleteIndex, "deleteIndex");
            if (listOooo0o != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = deleteIndex.iterator();
                while (it3.hasNext()) {
                    int iIntValue = ((Number) it3.next()).intValue();
                    arrayList.add(listOooo0o.get(iIntValue));
                    o00Var.invoke(Integer.valueOf(iIntValue));
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    listOooo0o.remove(it4.next());
                }
            }
            PremiumActivity context = this.f45248Oooo0o;
            ?? r1 = context.f23366OooooOo;
            Intrinsics.checkNotNullParameter(context, "context");
            OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(context);
            oooO00o.OooO0O0(context.Oooo0o());
            ViewPager2 viewPager2 = context.Oooo00o().f51120OooOOO;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "binding.viewPager");
            oooO00o.OooO0Oo(viewPager2);
            oooO00o.f32981OooO0o = o000O0O0.OooO00o(R.color.color_alpha_87_A1);
            oooO00o.f32983OooO0oO = o000O0O0.OooO00o(R.color.color_alpha_38_A3);
            oooO00o.f32976OooO = o000O0O0.OooO00o(R.color.color_00d8c9);
            oooO00o.f32978OooO0O0.setAdjustMode(true);
            oooO00o.f32985OooOO0 = o000O0Oo.f42985OooO00o / 5.0f;
            oooO00o.f32986OooOO0O = OooOo00.OooO00o(2);
            YlTableLayout ylTableLayout = context.Oooo00o().f51108OooO;
            Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tlAristocracy");
            oooO00o.OooO00o(ylTableLayout);
            context.Oooo00o().f51120OooOOO.setAdapter(new o00O00(context, r1));
            context.Oooo00o().f51120OooOOO.setOffscreenPageLimit(r1.size());
            if (context.f23370Ooooooo >= r1.size()) {
                context.f23370Ooooooo = PremiumLevel.Premium0.getValue();
            }
            context.Oooo00o().f51120OooOOO.setCurrentItem(context.f23370Ooooooo);
            context.Oooo00o().f51120OooOOO.registerOnPageChangeCallback(new o00O000o(context, r1));
            PremiumActivity premiumActivity2 = this.f45248Oooo0o;
            PremiumActivity.OooOooO(premiumActivity2, (PremiumShopModel.PremiumInfo) premiumActivity2.f23366OooooOo.get(premiumActivity2.f23370Ooooooo));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(List<String> list, PremiumActivity premiumActivity, Continuation<? super o00O000> continuation) {
        super(2, continuation);
        this.f45246Oooo0oO = list;
        this.f45247Oooo0oo = premiumActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O000(this.f45246Oooo0oO, this.f45247Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x005f, please report this as an issue */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List<GooglePaySkuDetail> list;
        MainCoroutineDispatcher main;
        OooO00o oooO00o;
        PremiumActivity premiumActivity;
        Iterator it;
        Object next;
        PremiumShopModel.PremiumInfo premiumInfo;
        Iterator it2;
        Object next2;
        PremiumShopModel.PremiumInfo premiumInfo2;
        PremiumShopModel.ChannelSKU channelSKU;
        String sku;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45245Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.f45246Oooo0oO.isEmpty()) {
                PayManager payManager = this.f45247Oooo0oo.f23381ooOO;
                if (payManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("payManager");
                    payManager = null;
                }
                List<String> list2 = this.f45246Oooo0oO;
                int iOooo0O0 = this.f45247Oooo0oo.Oooo0O0();
                this.f45245Oooo0o = 1;
                obj = payManager.querySkuDetails(list2, iOooo0O0, true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) ((PayResult) obj).getData();
                if (list != null) {
                    premiumActivity = this.f45247Oooo0oo;
                    for (GooglePaySkuDetail googlePaySkuDetail : list) {
                        o00O00.OooO0O0("loadSubscriptionGoodsList \nsubsGoods: " + googlePaySkuDetail);
                        it = premiumActivity.f23366OooooOo.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.areEqual(((PremiumShopModel.PremiumInfo) next).getSku(), googlePaySkuDetail.getSku()));
                        premiumInfo = (PremiumShopModel.PremiumInfo) next;
                        if (premiumInfo != null) {
                            premiumInfo.setGooglePaySkuDetail(googlePaySkuDetail);
                        }
                        it2 = premiumActivity.f23366OooooOo.iterator();
                        do {
                            if (it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            channelSKU = ((PremiumShopModel.PremiumInfo) next2).getChannelSKU();
                            if (channelSKU != null) {
                                sku = channelSKU.getSku();
                            } else {
                                sku = null;
                            }
                        } while (!Intrinsics.areEqual(sku, googlePaySkuDetail.getSku()));
                        premiumInfo2 = (PremiumShopModel.PremiumInfo) next2;
                        if (premiumInfo2 != null) {
                            premiumInfo2.setGooglePaySkuDetail(googlePaySkuDetail);
                        }
                    }
                }
                main = Dispatchers.getMain();
                oooO00o = new OooO00o(this.f45247Oooo0oo, null);
                this.f45245Oooo0o = 2;
                if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            list = (List) ((PayResult) obj).getData();
            if (list != null) {
                premiumActivity = this.f45247Oooo0oo;
                while (r10.hasNext()) {
                    o00O00.OooO0O0("loadSubscriptionGoodsList \nsubsGoods: " + googlePaySkuDetail);
                    it = premiumActivity.f23366OooooOo.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((PremiumShopModel.PremiumInfo) next).getSku(), googlePaySkuDetail.getSku()));
                    premiumInfo = (PremiumShopModel.PremiumInfo) next;
                    if (premiumInfo != null) {
                        premiumInfo.setGooglePaySkuDetail(googlePaySkuDetail);
                    }
                    it2 = premiumActivity.f23366OooooOo.iterator();
                    do {
                        if (it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        channelSKU = ((PremiumShopModel.PremiumInfo) next2).getChannelSKU();
                        if (channelSKU != null) {
                            sku = channelSKU.getSku();
                        } else {
                            sku = null;
                        }
                    } while (!Intrinsics.areEqual(sku, googlePaySkuDetail.getSku()));
                    premiumInfo2 = (PremiumShopModel.PremiumInfo) next2;
                    if (premiumInfo2 != null) {
                        premiumInfo2.setGooglePaySkuDetail(googlePaySkuDetail);
                    }
                }
            }
            main = Dispatchers.getMain();
            oooO00o = new OooO00o(this.f45247Oooo0oo, null);
            this.f45245Oooo0o = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
