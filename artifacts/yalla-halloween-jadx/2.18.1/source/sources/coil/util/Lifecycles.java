package coil.util;

import androidx.annotation.MainThread;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO0O0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: coil.util.-Lifecycles, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "-Lifecycles")
public final class Lifecycles {

    /* JADX INFO: renamed from: coil.util.-Lifecycles$OooO00o */
    @DebugMetadata(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", i = {0, 0}, l = {44}, m = "observeStarted", n = {"$this$observeStarted", "observer"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f9948Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Lifecycle f9949Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Ref.ObjectRef f9950Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f9951Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9951Oooo0oo = obj;
            this.f9948Oooo |= Integer.MIN_VALUE;
            return Lifecycles.OooO00o(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.lifecycle.LifecycleObserver, coil.util.-Lifecycles$observeStarted$2$1, java.lang.Object] */
    @MainThread
    @Nullable
    public static final Object OooO00o(@NotNull Lifecycle lifecycle, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        OooO00o oooO00o;
        Lifecycle lifecycle2;
        Ref.ObjectRef objectRef;
        Throwable th;
        Lifecycle lifecycle3;
        LifecycleObserver lifecycleObserver;
        LifecycleObserver lifecycleObserver2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f9948Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f9948Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f9951Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f9948Oooo;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = oooO00o.f9950Oooo0oO;
            lifecycle2 = oooO00o.f9949Oooo0o;
            try {
                ResultKt.throwOnFailure(obj);
                lifecycle3 = lifecycle2;
                lifecycleObserver2 = (LifecycleObserver) objectRef.element;
                if (lifecycleObserver2 != null) {
                    lifecycle3.removeObserver(lifecycleObserver2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                lifecycleObserver = (LifecycleObserver) objectRef.element;
                if (lifecycleObserver != null) {
                    lifecycle2.removeObserver(lifecycleObserver);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            oooO00o.f9949Oooo0o = lifecycle;
            oooO00o.f9950Oooo0oO = objectRef2;
            oooO00o.f9948Oooo = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO00o), 1);
            cancellableContinuationImpl.initCancellability();
            ?? r3 = new DefaultLifecycleObserver() { // from class: coil.util.-Lifecycles$observeStarted$2$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
                public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                    OooO0O0.OooO00o(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
                public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                    OooO0O0.OooO0O0(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
                public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                    OooO0O0.OooO0OO(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
                public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                    OooO0O0.OooO0Oo(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
                public final void onStart(@NotNull LifecycleOwner owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                    Unit unit = Unit.INSTANCE;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m502constructorimpl(unit));
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
                public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                    OooO0O0.OooO0o(this, lifecycleOwner);
                }
            };
            objectRef2.element = r3;
            Intrinsics.checkNotNull(r3);
            lifecycle.addObserver(r3);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooO00o);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            lifecycle3 = lifecycle;
            objectRef = objectRef2;
            lifecycleObserver2 = (LifecycleObserver) objectRef.element;
            if (lifecycleObserver2 != null) {
                lifecycle3.removeObserver(lifecycleObserver2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            th = th3;
            lifecycleObserver = (LifecycleObserver) objectRef.element;
            if (lifecycleObserver != null) {
                lifecycle2.removeObserver(lifecycleObserver);
            }
            throw th;
        }
    }
}
