package p432o0OoOOOo;

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
import p519o0o0O0oO.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickUI$toConsumeOrder$1", f = "GooglePayQuickUI.kt", i = {}, l = {316, 317}, m = "invokeSuspend", n = {}, s = {})
public final class o0O000o0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PayOrder f45953OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f45954OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickUI$toConsumeOrder$1$1", f = "GooglePayQuickUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Boolean f45955OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f45956OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f45957OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Boolean bool, PayOrder payOrder, o00OOOOo o00ooooo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45955OooO0Oo = bool;
            this.f45957OooO0o0 = payOrder;
            this.f45956OooO0o = o00ooooo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45955OooO0Oo, this.f45957OooO0o0, this.f45956OooO0o, continuation);
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
            boolean zAreEqual = Intrinsics.areEqual(this.f45955OooO0Oo, Boxing.boxBoolean(true));
            PayOrder payOrder = this.f45957OooO0o0;
            o00OOOOo o00ooooo2 = this.f45956OooO0o;
            if (zAreEqual) {
                payOrder.setConsume(true);
                o00ooooo2.OooO0o0().updateOrderToDB(payOrder);
                o00ooooo2.f45932OooOOO0 = 0;
                o00OOOOo.OooO00o(payOrder, o00ooooo2);
            } else {
                ((WalletCoinVM) o00ooooo2.f45927OooO0oo.getValue()).onConsumptionErrorUploadLog(payOrder);
                ((oO00O0oO) o00ooooo2.f45921OooO0O0.getValue()).dismiss();
                o00ooooo2.f45932OooOOO0++;
                o00OOOOo.OooO0O0(payOrder, o00ooooo2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(o00OOOOo o00ooooo2, PayOrder payOrder, Continuation<? super o0O000o0> continuation) {
        super(2, continuation);
        this.f45954OooO0o0 = o00ooooo2;
        this.f45953OooO0o = payOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O000o0(this.f45954OooO0o0, this.f45953OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O000o0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45952OooO0Oo;
        PayOrder payOrder = this.f45953OooO0o;
        o00OOOOo o00ooooo2 = this.f45954OooO0o0;
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
        PayManager payManager = (PayManager) o00ooooo2.f45919OooO.getValue();
        this.f45952OooO0Oo = 1;
        obj = payManager.consumeOrder(payOrder, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o((Boolean) obj, payOrder, o00ooooo2, null);
        this.f45952OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
