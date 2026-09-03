package p506o0o00oOo;

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
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$createOrderForVerifyBefore$1", f = "PremiumActivity.kt", i = {}, l = {447, 448}, m = "invokeSuspend", n = {}, s = {})
public final class oO00OOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f50454OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PremiumShopModel.PremiumInfo f50455OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50456OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$createOrderForVerifyBefore$1$1", f = "PremiumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f50457OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PremiumShopModel.PremiumInfo f50458OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PremiumActivity f50459OooO0o0;

        /* JADX INFO: renamed from: o0o00oOo.oO00OOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0465OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ PremiumActivity f50460OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0465OooO00o(PremiumActivity premiumActivity) {
                super(0);
                this.f50460OooO0Oo = premiumActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                int i = PremiumActivity.f26673Oooo0oO;
                PremiumActivity premiumActivity = this.f50460OooO0Oo;
                premiumActivity.getClass();
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(premiumActivity), Dispatchers.getIO(), null, new oO0(premiumActivity, null), 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f50457OooO0Oo = z;
            this.f50459OooO0o0 = premiumActivity;
            this.f50458OooO0o = premiumInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f50457OooO0Oo, this.f50459OooO0o0, this.f50458OooO0o, continuation);
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
            boolean z = this.f50457OooO0Oo;
            PremiumActivity premiumActivity = this.f50459OooO0o0;
            if (z) {
                o000O o000o = new o000O(premiumActivity);
                o000o.OooOo00(o0000.OooO0OO(o000000.huawei_subscription_manager_content));
                o000o.OooOo0(new C0465OooO00o(premiumActivity));
                o000o.OooOo(true);
                o000o.OooOO0o();
            } else {
                int i = PremiumActivity.f26673Oooo0oO;
                premiumActivity.OooOoo(this.f50458OooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOOo(PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo, Continuation<? super oO00OOOo> continuation) {
        super(2, continuation);
        this.f50456OooO0o0 = premiumActivity;
        this.f50455OooO0o = premiumInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO00OOOo(this.f50456OooO0o0, this.f50455OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO00OOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f50454OooO0Oo;
        PremiumActivity premiumActivity = this.f50456OooO0o0;
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
        PayManager payManager = premiumActivity.f26685OooOooO;
        if (payManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payManager");
            payManager = null;
        }
        int iOooo000 = premiumActivity.Oooo000();
        this.f50454OooO0Oo = 1;
        obj = payManager.isHasSubscription(iOooo000, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o(zBooleanValue, premiumActivity, this.f50455OooO0o, null);
        this.f50454OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
