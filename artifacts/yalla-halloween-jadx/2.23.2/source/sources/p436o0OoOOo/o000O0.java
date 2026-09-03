package p436o0OoOOo;

import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.ui.vm.WalletCoinVM;
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
import p650o0ooo.o0OOO00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickUI$toConsumeOrder$1", f = "GooglePayQuickUI.kt", i = {}, l = {316, 317}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f47056OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PayOrder f47057OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000 f47058OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickUI$toConsumeOrder$1$1", f = "GooglePayQuickUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Boolean f47059OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0000 f47060OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f47061OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Boolean bool, PayOrder payOrder, o0000 o0000Var, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f47059OooO0Oo = bool;
            this.f47061OooO0o0 = payOrder;
            this.f47060OooO0o = o0000Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f47059OooO0Oo, this.f47061OooO0o0, this.f47060OooO0o, continuation);
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
            boolean zAreEqual = Intrinsics.areEqual(this.f47059OooO0Oo, Boxing.boxBoolean(true));
            PayOrder payOrder = this.f47061OooO0o0;
            o0000 o0000Var = this.f47060OooO0o;
            if (zAreEqual) {
                payOrder.setConsume(true);
                o0000Var.OooO0o0().updateOrderToDB(payOrder);
                o0000Var.f47035OooOOO0 = 0;
                o0000.OooO00o(payOrder, o0000Var);
            } else {
                ((WalletCoinVM) o0000Var.f47030OooO0oo.getValue()).onConsumptionErrorUploadLog(payOrder);
                ((o0OOO00) o0000Var.f47024OooO0O0.getValue()).dismiss();
                o0000Var.f47035OooOOO0++;
                o0000.OooO0O0(payOrder, o0000Var);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(o0000 o0000Var, PayOrder payOrder, Continuation<? super o000O0> continuation) {
        super(2, continuation);
        this.f47058OooO0o0 = o0000Var;
        this.f47057OooO0o = payOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O0(this.f47058OooO0o0, this.f47057OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f47056OooO0Oo;
        PayOrder payOrder = this.f47057OooO0o;
        o0000 o0000Var = this.f47058OooO0o0;
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
        PayManager payManager = (PayManager) o0000Var.f47022OooO.getValue();
        this.f47056OooO0Oo = 1;
        obj = payManager.consumeOrder(payOrder, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o((Boolean) obj, payOrder, o0000Var, null);
        this.f47056OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
