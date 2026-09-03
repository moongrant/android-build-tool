package p027Oooo0o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.Oooo000;
import o0O0O00.o0000O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements o0000O0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f1734Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Continuation<? super Unit> f1735Oooo0oO;

    @DebugMetadata(c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", f = "LazyListState.kt", i = {0, 0}, l = {417}, m = "waitForFirstLayout", n = {"this", "oldContinuation"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooOO0O f1737Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Continuation f1738Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f1739Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f1740OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1739Oooo0oo = obj;
            this.f1740OoooO00 |= Integer.MIN_VALUE;
            return OooOO0O.this.OooO00o(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        Continuation<? super Unit> continuation2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f1740OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f1740OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f1739Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f1740OoooO00;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.f1734Oooo0o) {
                Continuation<? super Unit> continuation3 = this.f1735Oooo0oO;
                oooO00o.f1737Oooo0o = this;
                oooO00o.f1738Oooo0oO = continuation3;
                oooO00o.f1740OoooO00 = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(oooO00o));
                this.f1735Oooo0oO = safeContinuation;
                Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(oooO00o);
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
                continuation2 = continuation3;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        continuation2 = oooO00o.f1738Oooo0oO;
        ResultKt.throwOnFailure(obj);
        if (continuation2 != null) {
            Result.Companion companion = Result.INSTANCE;
            continuation2.resumeWith(Result.m502constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // o0O0O00.o0000O0
    public final void OooOoo(@NotNull Oooo000 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (this.f1734Oooo0o) {
            return;
        }
        this.f1734Oooo0o = true;
        Continuation<? super Unit> continuation = this.f1735Oooo0oO;
        if (continuation != null) {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m502constructorimpl(Unit.INSTANCE));
        }
        this.f1735Oooo0oO = null;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
