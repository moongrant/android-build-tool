package p025Oooo0O0;

import androidx.compose.runtime.Stable;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo implements o0000O00, OooO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Mutex f1508Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO f1509Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f1510Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f1511Oooo0oo;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {327}, m = "tryAwaitRelease", n = {"this"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f1512Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o0000oo f1513Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1514Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1514Oooo0oO = obj;
            this.f1512Oooo |= Integer.MIN_VALUE;
            return o0000oo.this.o00Ooo(this);
        }
    }

    public o0000oo(@NotNull OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f1509Oooo0o = density;
        this.f1508Oooo = MutexKt.Mutex(false);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OooO0o0(int i) {
        return this.f1509Oooo0o.OooO0o0(i);
    }

    public final void OooOOO() {
        this.f1511Oooo0oo = true;
        Mutex.DefaultImpls.unlock$default(this.f1508Oooo, null, 1, null);
    }

    public final void OooOOoo() {
        this.f1510Oooo0oO = true;
        Mutex.DefaultImpls.unlock$default(this.f1508Oooo, null, 1, null);
    }

    public final void OooOo0o() {
        Mutex.DefaultImpls.tryLock$default(this.f1508Oooo, null, 1, null);
        this.f1510Oooo0oO = false;
        this.f1511Oooo0oo = false;
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long OooOoOO(float f) {
        return this.f1509Oooo0o.OooOoOO(f);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long OooOoo0(long j) {
        return this.f1509Oooo0o.OooOoo0(j);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OoooOO0(float f) {
        return this.f1509Oooo0o.OoooOO0(f);
    }

    @Override // o0000O0O.OooO
    public final float OoooOOo() {
        return this.f1509Oooo0o.OoooOOo();
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OoooOoo(float f) {
        return this.f1509Oooo0o.OoooOoo(f);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OooooOO(long j) {
        return this.f1509Oooo0o.OooooOO(j);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OoooooO(float f) {
        return this.f1509Oooo0o.OoooooO(f);
    }

    @Override // o0000O0O.OooO
    public final float getDensity() {
        return this.f1509Oooo0o.getDensity();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p025Oooo0O0.o0000O00
    @Nullable
    public final Object o00Ooo(@NotNull Continuation<? super Boolean> continuation) {
        OooO00o oooO00o;
        o0000oo o0000ooVar;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f1512Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f1512Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f1514Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f1512Oooo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.f1510Oooo0oO && !this.f1511Oooo0oo) {
                Mutex mutex = this.f1508Oooo;
                oooO00o.f1513Oooo0o = this;
                oooO00o.f1512Oooo = 1;
                if (Mutex.DefaultImpls.lock$default(mutex, null, oooO00o, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            o0000ooVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0000ooVar = oooO00o.f1513Oooo0o;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(o0000ooVar.f1510Oooo0oO);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long o00ooo(long j) {
        return this.f1509Oooo0o.o00ooo(j);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float oo000o(long j) {
        return this.f1509Oooo0o.oo000o(j);
    }
}
