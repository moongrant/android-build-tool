package p109o000ooo;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import coil.request.ViewTargetRequestDelegate;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p112o000oooo.o00O0;
import p321o0O0ooO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final View f35823OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Job f35824OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o000000 f35825OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public ViewTargetRequestDelegate f35826OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f35827OooO0oo;

    @DebugMetadata(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o000000O.this.new OooO00o(continuation);
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
            o000000O o000000o2 = o000000O.this;
            ViewTargetRequestDelegate viewTargetRequestDelegate = o000000o2.f35826OooO0oO;
            if (viewTargetRequestDelegate != null) {
                Job.DefaultImpls.cancel$default(viewTargetRequestDelegate.f8632OooO0oo, (CancellationException) null, 1, (Object) null);
                o00O0<?> o00o1 = viewTargetRequestDelegate.f8629OooO0o;
                boolean z = o00o1 instanceof LifecycleObserver;
                Lifecycle lifecycle = viewTargetRequestDelegate.f8631OooO0oO;
                if (z) {
                    lifecycle.removeObserver((LifecycleObserver) o00o1);
                }
                lifecycle.removeObserver(viewTargetRequestDelegate);
            }
            o000000o2.f35826OooO0oO = null;
            return Unit.INSTANCE;
        }
    }

    public o000000O(@NotNull View view) {
        this.f35823OooO0Oo = view;
    }

    public final synchronized void OooO00o() {
        Job job = this.f35824OooO0o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f35824OooO0o = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), null, new OooO00o(null), 2, null);
        this.f35825OooO0o0 = null;
    }

    @NotNull
    public final synchronized o000000 OooO0O0(@NotNull Deferred<? extends o00oO0o> deferred) {
        o000000 o000000Var = this.f35825OooO0o0;
        if (o000000Var != null) {
            Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) && this.f35827OooO0oo) {
                this.f35827OooO0oo = false;
                o000000Var.f35822OooO0O0 = deferred;
                return o000000Var;
            }
        }
        Job job = this.f35824OooO0o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f35824OooO0o = null;
        o000000 o000000Var2 = new o000000(this.f35823OooO0Oo, deferred);
        this.f35825OooO0o0 = o000000Var2;
        return o000000Var2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public final void onViewAttachedToWindow(@NotNull View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f35826OooO0oO;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f35827OooO0oo = true;
        viewTargetRequestDelegate.f8628OooO0Oo.OooO0O0(viewTargetRequestDelegate.f8630OooO0o0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public final void onViewDetachedFromWindow(@NotNull View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f35826OooO0oO;
        if (viewTargetRequestDelegate != null) {
            Job.DefaultImpls.cancel$default(viewTargetRequestDelegate.f8632OooO0oo, (CancellationException) null, 1, (Object) null);
            o00O0<?> o00o1 = viewTargetRequestDelegate.f8629OooO0o;
            boolean z = o00o1 instanceof LifecycleObserver;
            Lifecycle lifecycle = viewTargetRequestDelegate.f8631OooO0oO;
            if (z) {
                lifecycle.removeObserver((LifecycleObserver) o00o1);
            }
            lifecycle.removeObserver(viewTargetRequestDelegate);
        }
    }
}
