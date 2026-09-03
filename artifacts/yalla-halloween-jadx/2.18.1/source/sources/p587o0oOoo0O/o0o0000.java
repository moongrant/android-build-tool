package p587o0oOoo0O;

import androidx.paging.compose.OooO0OO;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventSquareViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.page.EventSquarePage$EventSquareList$1", f = "EventSquarePage.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
public final class o0o0000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f47014Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventSquareViewModel f47015Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<EventModel> f47016Oooo0oo;

    public static final class OooO00o implements FlowCollector<Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO<EventModel> f47017Oooo0o;

        public OooO00o(OooO0OO<EventModel> oooO0OO) {
            this.f47017Oooo0o = oooO0OO;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Boolean bool, Continuation continuation) {
            bool.booleanValue();
            this.f47017Oooo0o.OooO0o();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0000(EventSquareViewModel eventSquareViewModel, OooO0OO<EventModel> oooO0OO, Continuation<? super o0o0000> continuation) {
        super(2, continuation);
        this.f47015Oooo0oO = eventSquareViewModel;
        this.f47016Oooo0oo = oooO0OO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0o0000(this.f47015Oooo0oO, this.f47016Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0o0000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f47014Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Boolean> refreshEvent = this.f47015Oooo0oO.getRefreshEvent();
            OooO00o oooO00o = new OooO00o(this.f47016Oooo0oo);
            this.f47014Oooo0o = 1;
            if (refreshEvent.collect(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
