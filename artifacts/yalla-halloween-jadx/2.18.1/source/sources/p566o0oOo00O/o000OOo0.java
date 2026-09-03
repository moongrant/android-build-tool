package p566o0oOo00O;

import androidx.lifecycle.LifecycleOwnerKt;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.Objects;
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
import p255o00ooO0o.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$createOrderForVerifyBefore$1", f = "PremiumActivity.kt", i = {}, l = {449, 450}, m = "invokeSuspend", n = {}, s = {})
public final class o000OOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f45226Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45227Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ PremiumShopModel.PremiumInfo f45228Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$createOrderForVerifyBefore$1$1", f = "PremiumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f45229Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PremiumActivity f45230Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ PremiumShopModel.PremiumInfo f45231Oooo0oo;

        /* JADX INFO: renamed from: o0oOo00O.o000OOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0411OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ PremiumActivity f45232Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0411OooO00o(PremiumActivity premiumActivity) {
                super(0);
                this.f45232Oooo0o = premiumActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                PremiumActivity premiumActivity = this.f45232Oooo0o;
                PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
                Objects.requireNonNull(premiumActivity);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(premiumActivity), Dispatchers.getIO(), null, new o00O0O00(premiumActivity, null), 2, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45229Oooo0o = z;
            this.f45230Oooo0oO = premiumActivity;
            this.f45231Oooo0oo = premiumInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45229Oooo0o, this.f45230Oooo0oO, this.f45231Oooo0oo, continuation);
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
            if (this.f45229Oooo0o) {
                oo0oOO0 oo0ooo0 = new oo0oOO0(this.f45230Oooo0oO);
                PremiumActivity premiumActivity = this.f45230Oooo0oO;
                oo0ooo0.OooOo0O(OooOOO.OooO0OO(R.string.huawei_subscription_manager_content));
                oo0ooo0.OooOo0o(new C0411OooO00o(premiumActivity));
                oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
                oo0ooo0.OooOOO0();
            } else {
                PremiumActivity premiumActivity2 = this.f45230Oooo0oO;
                PremiumShopModel.PremiumInfo premiumInfo = this.f45231Oooo0oo;
                PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
                premiumActivity2.Oooo00O(premiumInfo);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo, Continuation<? super o000OOo0> continuation) {
        super(2, continuation);
        this.f45227Oooo0oO = premiumActivity;
        this.f45228Oooo0oo = premiumInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OOo0(this.f45227Oooo0oO, this.f45228Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45226Oooo0o;
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
        PayManager payManager = this.f45227Oooo0oO.f23381ooOO;
        if (payManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payManager");
            payManager = null;
        }
        int iOooo0O0 = this.f45227Oooo0oO.Oooo0O0();
        this.f45226Oooo0o = 1;
        obj = payManager.isHasSubscription(iOooo0O0, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o(zBooleanValue, this.f45227Oooo0oO, this.f45228Oooo0oo, null);
        this.f45226Oooo0o = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
