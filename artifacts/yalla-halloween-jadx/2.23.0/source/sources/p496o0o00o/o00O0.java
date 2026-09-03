package p496o0o00o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.o0000;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$createOrderForVerifyBefore$1", f = "PremiumActivity.kt", i = {}, l = {447, 448}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f49002OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PremiumShopModel.PremiumInfo f49003OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49004OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$createOrderForVerifyBefore$1$1", f = "PremiumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f49005OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PremiumShopModel.PremiumInfo f49006OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PremiumActivity f49007OooO0o0;

        /* JADX INFO: renamed from: o0o00o.o00O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0486OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ PremiumActivity f49008OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0486OooO00o(PremiumActivity premiumActivity) {
                super(0);
                this.f49008OooO0Oo = premiumActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                int i = PremiumActivity.f27140Oooo0oO;
                PremiumActivity premiumActivity = this.f49008OooO0Oo;
                premiumActivity.getClass();
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(premiumActivity), Dispatchers.getIO(), null, new o00OOO0O(premiumActivity, null), 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f49005OooO0Oo = z;
            this.f49007OooO0o0 = premiumActivity;
            this.f49006OooO0o = premiumInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f49005OooO0Oo, this.f49007OooO0o0, this.f49006OooO0o, continuation);
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
            boolean z = this.f49005OooO0Oo;
            PremiumActivity premiumActivity = this.f49007OooO0o0;
            if (z) {
                o0OO00O o0oo00o2 = new o0OO00O(premiumActivity);
                o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.huawei_subscription_manager_content));
                o0oo00o2.OooOo0(new C0486OooO00o(premiumActivity));
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOO0o();
            } else {
                int i = PremiumActivity.f27140Oooo0oO;
                premiumActivity.OooOooO(this.f49006OooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo, Continuation<? super o00O0> continuation) {
        super(2, continuation);
        this.f49004OooO0o0 = premiumActivity;
        this.f49003OooO0o = premiumInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0(this.f49004OooO0o0, this.f49003OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f49002OooO0Oo;
        PremiumActivity premiumActivity = this.f49004OooO0o0;
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
        PayManager payManager = premiumActivity.f27152OooOooO;
        if (payManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payManager");
            payManager = null;
        }
        int iOooo00O = premiumActivity.Oooo00O();
        this.f49002OooO0Oo = 1;
        obj = payManager.isHasSubscription(iOooo00O, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o(zBooleanValue, premiumActivity, this.f49003OooO0o, null);
        this.f49002OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
