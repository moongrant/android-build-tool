package p506o0o00oOo;

import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$toConsumeOrder$1", f = "PremiumActivity.kt", i = {}, l = {659, 660}, m = "invokeSuspend", n = {}, s = {})
public final class oOo0000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f50548OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PayOrder f50549OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50550OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$toConsumeOrder$1$1", f = "PremiumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Boolean f50551OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PremiumActivity f50552OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f50553OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Boolean bool, PayOrder payOrder, PremiumActivity premiumActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f50551OooO0Oo = bool;
            this.f50553OooO0o0 = payOrder;
            this.f50552OooO0o = premiumActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f50551OooO0Oo, this.f50553OooO0o0, this.f50552OooO0o, continuation);
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
            boolean zAreEqual = Intrinsics.areEqual(this.f50551OooO0Oo, Boxing.boxBoolean(true));
            PayOrder payOrder = this.f50553OooO0o0;
            PremiumActivity premiumActivity = this.f50552OooO0o;
            if (zAreEqual) {
                payOrder.setConsume(true);
                int i = PremiumActivity.f26673Oooo0oO;
                premiumActivity.Oooo0O0().updateOrderToDB(payOrder);
                premiumActivity.f26686OooOooo = 0;
                PremiumActivity.OooOo(premiumActivity, payOrder);
            } else {
                int i2 = PremiumActivity.f26673Oooo0oO;
                premiumActivity.Oooo0O0().onConsumptionErrorUploadLog(payOrder);
                premiumActivity.getClass();
                Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
                premiumActivity.OooOo0();
                premiumActivity.f26686OooOooo++;
                PremiumActivity.OooOoO(premiumActivity, payOrder);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0000O(PremiumActivity premiumActivity, PayOrder payOrder, Continuation<? super oOo0000O> continuation) {
        super(2, continuation);
        this.f50550OooO0o0 = premiumActivity;
        this.f50549OooO0o = payOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOo0000O(this.f50550OooO0o0, this.f50549OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOo0000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f50548OooO0Oo;
        PayOrder payOrder = this.f50549OooO0o;
        PremiumActivity premiumActivity = this.f50550OooO0o0;
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
        this.f50548OooO0Oo = 1;
        obj = payManager.consumeOrder(payOrder, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o((Boolean) obj, payOrder, premiumActivity, null);
        this.f50548OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
