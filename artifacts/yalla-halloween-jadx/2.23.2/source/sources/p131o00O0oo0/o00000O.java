package p131o00O0oo0;

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
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132o00O0ooo.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final View f36791OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Job f36792OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o00000O0 f36793OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public ViewTargetRequestDelegate f36794OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f36795OooO0oo;

    @DebugMetadata(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o00000O.this.new OooO00o(continuation);
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
            o00000O o00000o = o00000O.this;
            ViewTargetRequestDelegate viewTargetRequestDelegate = o00000o.f36794OooO0oO;
            if (viewTargetRequestDelegate != null) {
                Job.DefaultImpls.cancel$default(viewTargetRequestDelegate.f11722OooO0oo, (CancellationException) null, 1, (Object) null);
                o00O00<?> o00o01 = viewTargetRequestDelegate.f11719OooO0o;
                boolean z = o00o01 instanceof LifecycleObserver;
                Lifecycle lifecycle = viewTargetRequestDelegate.f11721OooO0oO;
                if (z) {
                    lifecycle.removeObserver((LifecycleObserver) o00o01);
                }
                lifecycle.removeObserver(viewTargetRequestDelegate);
            }
            o00000o.f36794OooO0oO = null;
            return Unit.INSTANCE;
        }
    }

    public o00000O(@NotNull View view) {
        this.f36791OooO0Oo = view;
    }

    public final synchronized void OooO00o() {
        Job job = this.f36792OooO0o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f36792OooO0o = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), null, new OooO00o(null), 2, null);
        this.f36793OooO0o0 = null;
    }

    @NotNull
    public final synchronized o00000O0 OooO0O0(@NotNull Deferred<? extends o0Oo0oo> deferred) {
        o00000O0 o00000o1 = this.f36793OooO0o0;
        if (o00000o1 != null) {
            Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) && this.f36795OooO0oo) {
                this.f36795OooO0oo = false;
                o00000o1.f36798OooO0O0 = deferred;
                return o00000o1;
            }
        }
        Job job = this.f36792OooO0o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f36792OooO0o = null;
        o00000O0 o00000o2 = new o00000O0(this.f36791OooO0Oo, deferred);
        this.f36793OooO0o0 = o00000o2;
        return o00000o2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public final void onViewAttachedToWindow(@NotNull View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f36794OooO0oO;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f36795OooO0oo = true;
        viewTargetRequestDelegate.f11718OooO0Oo.OooO0O0(viewTargetRequestDelegate.f11720OooO0o0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public final void onViewDetachedFromWindow(@NotNull View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f36794OooO0oO;
        if (viewTargetRequestDelegate != null) {
            Job.DefaultImpls.cancel$default(viewTargetRequestDelegate.f11722OooO0oo, (CancellationException) null, 1, (Object) null);
            o00O00<?> o00o01 = viewTargetRequestDelegate.f11719OooO0o;
            boolean z = o00o01 instanceof LifecycleObserver;
            Lifecycle lifecycle = viewTargetRequestDelegate.f11721OooO0oO;
            if (z) {
                lifecycle.removeObserver((LifecycleObserver) o00o01);
            }
            lifecycle.removeObserver(viewTargetRequestDelegate);
        }
    }
}
