package p566o0oOo00O;

import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.Objects;
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

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$toConsumeOrder$1", f = "PremiumActivity.kt", i = {}, l = {659, 660}, m = "invokeSuspend", n = {}, s = {})
public final class oo00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f45390Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45391Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ PayOrder f45392Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$toConsumeOrder$1$1", f = "PremiumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Boolean f45393Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PayOrder f45394Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ PremiumActivity f45395Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Boolean bool, PayOrder payOrder, PremiumActivity premiumActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45393Oooo0o = bool;
            this.f45394Oooo0oO = payOrder;
            this.f45395Oooo0oo = premiumActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45393Oooo0o, this.f45394Oooo0oO, this.f45395Oooo0oo, continuation);
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
            if (Intrinsics.areEqual(this.f45393Oooo0o, Boxing.boxBoolean(true))) {
                this.f45394Oooo0oO.setConsume(true);
                PremiumActivity premiumActivity = this.f45395Oooo0oo;
                PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
                premiumActivity.Oooo0oO().updateOrderToDB(this.f45394Oooo0oO);
                PremiumActivity premiumActivity2 = this.f45395Oooo0oo;
                premiumActivity2.f23371o00O0O = 0;
                PremiumActivity.OooOoo(premiumActivity2, this.f45394Oooo0oO);
            } else {
                PremiumActivity premiumActivity3 = this.f45395Oooo0oo;
                PremiumActivity.OooO00o oooO00o2 = PremiumActivity.f23360o0ooOOo;
                premiumActivity3.Oooo0oO().onConsumptionErrorUploadLog(this.f45394Oooo0oO);
                PremiumActivity premiumActivity4 = this.f45395Oooo0oo;
                Objects.requireNonNull(premiumActivity4);
                Intrinsics.checkNotNull(premiumActivity4, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
                premiumActivity4.OooOoO();
                PremiumActivity premiumActivity5 = this.f45395Oooo0oo;
                premiumActivity5.f23371o00O0O++;
                PremiumActivity.OooOooo(premiumActivity5, this.f45394Oooo0oO);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(PremiumActivity premiumActivity, PayOrder payOrder, Continuation<? super oo00o> continuation) {
        super(2, continuation);
        this.f45391Oooo0oO = premiumActivity;
        this.f45392Oooo0oo = payOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oo00o(this.f45391Oooo0oO, this.f45392Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oo00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45390Oooo0o;
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
        PayManager payManager = this.f45391Oooo0oO.f23381ooOO;
        if (payManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payManager");
            payManager = null;
        }
        PayOrder payOrder = this.f45392Oooo0oo;
        this.f45390Oooo0o = 1;
        obj = payManager.consumeOrder(payOrder, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o((Boolean) obj, this.f45392Oooo0oo, this.f45391Oooo0oO, null);
        this.f45390Oooo0o = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
