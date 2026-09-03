package p496o0o00o;

import androidx.viewpager2.widget.ViewPager2;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.RechargeBanType;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o0ooOOo;
import p431o0OoOOOO.o00OO;
import p431o0OoOOOO.o00OOO0O;
import p553o0oOOoo.o0oO0O0o;
import p584o0oOooO0.oO00O0o;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$loadSubscriptionGoodsList$2", f = "PremiumActivity.kt", i = {}, l = {818, 831}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPremiumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity$loadSubscriptionGoodsList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n1855#2:991\n1856#2:993\n1#3:992\n*S KotlinDebug\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity$loadSubscriptionGoodsList$2\n*L\n819#1:991\n819#1:993\n*E\n"})
public final class oo0oOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f49201OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49202OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<String> f49203OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$loadSubscriptionGoodsList$2$2", f = "PremiumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PremiumActivity f49204OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PremiumActivity premiumActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f49204OooO0Oo = premiumActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f49204OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            PremiumActivity context = this.f49204OooO0Oo;
            ArrayList arrayList = context.f27142OooOo;
            ArrayList deleteIndex = new ArrayList();
            Iterator it = context.f27148OooOoO0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RechargeBanType rechargeBanType = (RechargeBanType) it.next();
                Iterator it2 = arrayList.iterator();
                if (it2 != null) {
                    while (it2.hasNext()) {
                        PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) it2.next();
                        o00OO googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
                        if (googlePaySkuDetail != null && Intrinsics.areEqual(rechargeBanType.getCurrency(), googlePaySkuDetail.f45872OooO0OO) && Intrinsics.areEqual(rechargeBanType.getSku(), googlePaySkuDetail.f45870OooO00o)) {
                            it2.remove();
                            deleteIndex.add(Integer.valueOf(premiumInfo.getIndex()));
                        }
                    }
                }
            }
            List<String> listOooo0O0 = context.Oooo0O0();
            o00O0O00 o00o0o01 = new o00O0O00(context);
            Intrinsics.checkNotNullParameter(deleteIndex, "deleteIndex");
            if (listOooo0O0 != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = deleteIndex.iterator();
                while (it3.hasNext()) {
                    int iIntValue = ((Number) it3.next()).intValue();
                    arrayList2.add(listOooo0O0.get(iIntValue));
                    o00o0o01.invoke(Integer.valueOf(iIntValue));
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    listOooo0O0.remove(it4.next());
                }
            }
            ArrayList arrayList3 = context.f27142OooOo;
            Intrinsics.checkNotNullParameter(context, "context");
            o0oO0O0o.OooO00o oooO00o = new o0oO0O0o.OooO00o(context);
            oooO00o.OooO0O0(context.Oooo0O0());
            ViewPager2 viewPager2 = context.OooOooo().f58626OooOOO;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "binding.viewPager");
            oooO00o.OooO0OO(viewPager2);
            oooO00o.f56022OooO0o0 = o0000.OooO00o(oO00O0o.color_alpha_87_A1);
            oooO00o.f56024OooO0oo = o0000.OooO00o(oO00O0o.color_alpha_38_A3);
            oooO00o.f56025OooOO0 = o0000.OooO00o(oO00O0o.color_00d8c9);
            oooO00o.f56017OooO00o.setAdjustMode(true);
            oooO00o.f56026OooOO0O = o0ooOOo.f45529OooO00o / 5.0f;
            oooO00o.f56027OooOO0o = o0000O0.OooO00o(2);
            YlTableLayout ylTableLayout = context.OooOooo().f58614OooO;
            Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tlAristocracy");
            oooO00o.OooO00o(ylTableLayout);
            context.OooOooo().f58626OooOOO.setAdapter(new o00OO000(context, arrayList3));
            context.OooOooo().f58626OooOOO.setOffscreenPageLimit(arrayList3.size());
            if (context.f27151OooOoo0 >= arrayList3.size()) {
                context.f27151OooOoo0 = PremiumLevel.Premium0.getValue();
            }
            context.OooOooo().f58626OooOOO.setCurrentItem(context.f27151OooOoo0);
            context.OooOooo().f58626OooOOO.registerOnPageChangeCallback(new o00O(context, arrayList3));
            PremiumActivity.OooOoO0(context, (PremiumShopModel.PremiumInfo) arrayList3.get(context.f27151OooOoo0));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(List<String> list, PremiumActivity premiumActivity, Continuation<? super oo0oOO0> continuation) {
        super(2, continuation);
        this.f49203OooO0o0 = list;
        this.f49202OooO0o = premiumActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oo0oOO0(this.f49203OooO0o0, this.f49202OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oo0oOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00be A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0057, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List<o00OO> list;
        MainCoroutineDispatcher main;
        OooO00o oooO00o;
        Iterator it;
        Object next;
        PremiumShopModel.PremiumInfo premiumInfo;
        Iterator it2;
        Object next2;
        PremiumShopModel.PremiumInfo premiumInfo2;
        PremiumShopModel.ChannelSKU channelSKU;
        String sku;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f49201OooO0Oo;
        PremiumActivity premiumActivity = this.f49202OooO0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<String> list2 = this.f49203OooO0o0;
            if (!list2.isEmpty()) {
                PayManager payManager = premiumActivity.f27152OooOooO;
                if (payManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("payManager");
                    payManager = null;
                }
                int iOooo00O = premiumActivity.Oooo00O();
                this.f49201OooO0Oo = 1;
                obj = payManager.queryDetails(list2, iOooo00O, true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) ((o00OOO0O) obj).f45913OooO00o;
                if (list != null) {
                    for (o00OO o00oo2 : list) {
                        OooOOO0.OooO0O0("loadSubscriptionGoodsList \nsubsGoods: " + o00oo2);
                        it = premiumActivity.f27142OooOo.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.areEqual(((PremiumShopModel.PremiumInfo) next).getSku(), o00oo2.f45870OooO00o));
                        premiumInfo = (PremiumShopModel.PremiumInfo) next;
                        if (premiumInfo != null) {
                            premiumInfo.setGooglePaySkuDetail(o00oo2);
                        }
                        it2 = premiumActivity.f27142OooOo.iterator();
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
                        } while (!Intrinsics.areEqual(sku, o00oo2.f45870OooO00o));
                        premiumInfo2 = (PremiumShopModel.PremiumInfo) next2;
                        if (premiumInfo2 != null) {
                            premiumInfo2.setGooglePaySkuDetail(o00oo2);
                        }
                    }
                }
                main = Dispatchers.getMain();
                oooO00o = new OooO00o(premiumActivity, null);
                this.f49201OooO0Oo = 2;
                if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            list = (List) ((o00OOO0O) obj).f45913OooO00o;
            if (list != null) {
                while (r10.hasNext()) {
                    OooOOO0.OooO0O0("loadSubscriptionGoodsList \nsubsGoods: " + o00oo2);
                    it = premiumActivity.f27142OooOo.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((PremiumShopModel.PremiumInfo) next).getSku(), o00oo2.f45870OooO00o));
                    premiumInfo = (PremiumShopModel.PremiumInfo) next;
                    if (premiumInfo != null) {
                        premiumInfo.setGooglePaySkuDetail(o00oo2);
                    }
                    it2 = premiumActivity.f27142OooOo.iterator();
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
                    } while (!Intrinsics.areEqual(sku, o00oo2.f45870OooO00o));
                    premiumInfo2 = (PremiumShopModel.PremiumInfo) next2;
                    if (premiumInfo2 != null) {
                        premiumInfo2.setGooglePaySkuDetail(o00oo2);
                    }
                }
            }
            main = Dispatchers.getMain();
            oooO00o = new OooO00o(premiumActivity, null);
            this.f49201OooO0Oo = 2;
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
