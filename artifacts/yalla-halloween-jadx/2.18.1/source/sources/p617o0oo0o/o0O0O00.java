package p617o0oo0o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o0O0O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026Oooo0OO.o00000O;
import p026Oooo0OO.o00000OO;
import p026Oooo0OO.o0000O;
import p026Oooo0OO.o0000Ooo;
import p026Oooo0OO.o000O00;
import p026Oooo0OO.o000O0o;
import p026Oooo0OO.o000Oo0;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.util.HorizontalPagerExt$HorizontalPagerAutoLooping$2$1", f = "HorizontalPagerExt.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f48564Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f48565Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f48566Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.util.HorizontalPagerExt$HorizontalPagerAutoLooping$2$1$1", f = "HorizontalPagerExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o0000O, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f48567Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f48568Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O00OO<Boolean> o0o00oo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f48568Oooo0oO = o0o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f48568Oooo0oO, continuation);
            oooO00o.f48567Oooo0o = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0000O o0000o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0000o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0000O o0000o2 = (o0000O) this.f48567Oooo0o;
            if (o0000o2 instanceof o000Oo0) {
                o000000O.OooO00o(this.f48568Oooo0oO, true);
            } else if ((o0000o2 instanceof o000O00) || (o0000o2 instanceof o000O0o)) {
                o000000O.OooO00o(this.f48568Oooo0oO, false);
            } else if (o0000o2 instanceof o00000OO) {
                o000000O.OooO00o(this.f48568Oooo0oO, true);
            } else if ((o0000o2 instanceof o0000Ooo) || (o0000o2 instanceof o00000O)) {
                o000000O.OooO00o(this.f48568Oooo0oO, false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(OooOO0 oooOO1, o0O00OO<Boolean> o0o00oo2, Continuation<? super o0O0O00> continuation) {
        super(2, continuation);
        this.f48565Oooo0oO = oooOO1;
        this.f48566Oooo0oo = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0O00(this.f48565Oooo0oO, this.f48566Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48564Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<o0000O> mutableSharedFlow = this.f48565Oooo0oO.f35353OooO00o.f1869OooO0OO.f1721OooO00o;
            OooO00o oooO00o = new OooO00o(this.f48566Oooo0oo, null);
            this.f48564Oooo0o = 1;
            if (FlowKt.collectLatest(mutableSharedFlow, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
