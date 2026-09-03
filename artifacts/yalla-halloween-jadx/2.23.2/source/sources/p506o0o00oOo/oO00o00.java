package p506o0o00oOo;

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
import p423o0OoO0OO.o000O000;
import p437o0OoOOo0.o000OO00;
import p437o0OoOOo0.o00O0000;
import p562o0oOo000.o0OOO0o;
import p563o0oOo00O.o0O0O00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$loadSubscriptionGoodsList$2", f = "PremiumActivity.kt", i = {}, l = {818, 831}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPremiumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity$loadSubscriptionGoodsList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n1855#2:991\n1856#2:993\n1#3:992\n*S KotlinDebug\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity$loadSubscriptionGoodsList$2\n*L\n819#1:991\n819#1:993\n*E\n"})
public final class oO00o00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f50465OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50466OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ List<String> f50467OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$loadSubscriptionGoodsList$2$2", f = "PremiumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PremiumActivity f50468OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PremiumActivity premiumActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f50468OooO0Oo = premiumActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f50468OooO0Oo, continuation);
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
            PremiumActivity context = this.f50468OooO0Oo;
            ArrayList arrayList = context.f26675OooOo;
            ArrayList deleteIndex = new ArrayList();
            Iterator it = context.f26681OooOoO0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RechargeBanType rechargeBanType = (RechargeBanType) it.next();
                Iterator it2 = arrayList.iterator();
                if (it2 != null) {
                    while (it2.hasNext()) {
                        PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) it2.next();
                        o000OO00 googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
                        if (googlePaySkuDetail != null && Intrinsics.areEqual(rechargeBanType.getCurrency(), googlePaySkuDetail.f47161OooO0OO) && Intrinsics.areEqual(rechargeBanType.getSku(), googlePaySkuDetail.f47159OooO00o)) {
                            it2.remove();
                            deleteIndex.add(Integer.valueOf(premiumInfo.getIndex()));
                        }
                    }
                }
            }
            List<String> listOooo0 = context.Oooo0();
            oO00OOo0 oo00ooo0 = new oO00OOo0(context);
            Intrinsics.checkNotNullParameter(deleteIndex, "deleteIndex");
            if (listOooo0 != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = deleteIndex.iterator();
                while (it3.hasNext()) {
                    int iIntValue = ((Number) it3.next()).intValue();
                    arrayList2.add(listOooo0.get(iIntValue));
                    oo00ooo0.invoke(Integer.valueOf(iIntValue));
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    listOooo0.remove(it4.next());
                }
            }
            ArrayList arrayList3 = context.f26675OooOo;
            Intrinsics.checkNotNullParameter(context, "context");
            o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(context);
            oooO00o.OooO0O0(context.Oooo0());
            ViewPager2 viewPager = context.OooOooO().f43828OooOOO;
            Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
            oooO00o.OooO0OO(viewPager);
            oooO00o.f56262OooO0o0 = o0000.OooO00o(o0OOO0o.color_alpha_87_A1);
            oooO00o.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_alpha_38_A3);
            oooO00o.f56265OooOO0 = o0000.OooO00o(o0OOO0o.color_00d8c9);
            oooO00o.f56257OooO00o.setAdjustMode(true);
            oooO00o.f56266OooOO0O = o000O000.f46650OooO00o / 5.0f;
            oooO00o.f56267OooOO0o = o0000O0.OooO00o(2);
            YlTableLayout tlAristocracy = context.OooOooO().f43816OooO;
            Intrinsics.checkNotNullExpressionValue(tlAristocracy, "tlAristocracy");
            oooO00o.OooO00o(tlAristocracy);
            context.OooOooO().f43828OooOOO.setAdapter(new oO00o00O(context, arrayList3));
            context.OooOooO().f43828OooOOO.setOffscreenPageLimit(arrayList3.size());
            if (context.f26684OooOoo0 >= arrayList3.size()) {
                context.f26684OooOoo0 = PremiumLevel.Premium0.getValue();
            }
            context.OooOooO().f43828OooOOO.setCurrentItem(context.f26684OooOoo0);
            context.OooOooO().f43828OooOOO.registerOnPageChangeCallback(new oO0OOO00(context, arrayList3));
            PremiumActivity.OooOoO0(context, (PremiumShopModel.PremiumInfo) arrayList3.get(context.f26684OooOoo0));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00(List<String> list, PremiumActivity premiumActivity, Continuation<? super oO00o00> continuation) {
        super(2, continuation);
        this.f50467OooO0o0 = list;
        this.f50466OooO0o = premiumActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO00o00(this.f50467OooO0o0, this.f50466OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO00o00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        List<o000OO00> list;
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
        int i = this.f50465OooO0Oo;
        PremiumActivity premiumActivity = this.f50466OooO0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<String> list2 = this.f50467OooO0o0;
            if (!list2.isEmpty()) {
                PayManager payManager = premiumActivity.f26685OooOooO;
                if (payManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("payManager");
                    payManager = null;
                }
                int iOooo000 = premiumActivity.Oooo000();
                this.f50465OooO0Oo = 1;
                obj = payManager.queryDetails(list2, iOooo000, true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) ((o00O0000) obj).f47168OooO00o;
                if (list != null) {
                    for (o000OO00 o000oo01 : list) {
                        o0000O00.OooO0O0("loadSubscriptionGoodsList \nsubsGoods: " + o000oo01);
                        it = premiumActivity.f26675OooOo.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.areEqual(((PremiumShopModel.PremiumInfo) next).getSku(), o000oo01.f47159OooO00o));
                        premiumInfo = (PremiumShopModel.PremiumInfo) next;
                        if (premiumInfo != null) {
                            premiumInfo.setGooglePaySkuDetail(o000oo01);
                        }
                        it2 = premiumActivity.f26675OooOo.iterator();
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
                        } while (!Intrinsics.areEqual(sku, o000oo01.f47159OooO00o));
                        premiumInfo2 = (PremiumShopModel.PremiumInfo) next2;
                        if (premiumInfo2 != null) {
                            premiumInfo2.setGooglePaySkuDetail(o000oo01);
                        }
                    }
                }
                main = Dispatchers.getMain();
                oooO00o = new OooO00o(premiumActivity, null);
                this.f50465OooO0Oo = 2;
                if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            list = (List) ((o00O0000) obj).f47168OooO00o;
            if (list != null) {
                while (r10.hasNext()) {
                    o0000O00.OooO0O0("loadSubscriptionGoodsList \nsubsGoods: " + o000oo01);
                    it = premiumActivity.f26675OooOo.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((PremiumShopModel.PremiumInfo) next).getSku(), o000oo01.f47159OooO00o));
                    premiumInfo = (PremiumShopModel.PremiumInfo) next;
                    if (premiumInfo != null) {
                        premiumInfo.setGooglePaySkuDetail(o000oo01);
                    }
                    it2 = premiumActivity.f26675OooOo.iterator();
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
                    } while (!Intrinsics.areEqual(sku, o000oo01.f47159OooO00o));
                    premiumInfo2 = (PremiumShopModel.PremiumInfo) next2;
                    if (premiumInfo2 != null) {
                        premiumInfo2.setGooglePaySkuDetail(o000oo01);
                    }
                }
            }
            main = Dispatchers.getMain();
            oooO00o = new OooO00o(premiumActivity, null);
            this.f50465OooO0Oo = 2;
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
