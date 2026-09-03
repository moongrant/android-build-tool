package p448o0OoOoo;

import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventSquareViewModel;
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
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.event.ui.page.EventSquarePage$EventSquareList$1", f = "EventSquarePage.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class o00OO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f47423OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<EventModel> f47424OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventSquareViewModel f47425OooO0o0;

    public static final class OooO00o<T> implements FlowCollector {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOOOO<EventModel> f47426OooO0Oo;

        public OooO00o(OooOOOO<EventModel> oooOOOO) {
            this.f47426OooO0Oo = oooOOOO;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            ((Boolean) obj).booleanValue();
            this.f47426OooO0Oo.OooO0Oo();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(EventSquareViewModel eventSquareViewModel, OooOOOO<EventModel> oooOOOO, Continuation<? super o00OO00O> continuation) {
        super(2, continuation);
        this.f47425OooO0o0 = eventSquareViewModel;
        this.f47424OooO0o = oooOOOO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OO00O(this.f47425OooO0o0, this.f47424OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00OO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f47423OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Boolean> refreshEvent = this.f47425OooO0o0.getRefreshEvent();
            OooO00o oooO00o = new OooO00o(this.f47424OooO0o);
            this.f47423OooO0Oo = 1;
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
