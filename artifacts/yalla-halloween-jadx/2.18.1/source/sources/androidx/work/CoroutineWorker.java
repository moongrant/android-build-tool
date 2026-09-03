package androidx.work;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p102o000oo.OooOOO;
import p102o000oo.o000oOoO;
import p236o00oOoo.o00OOO0O;
import p236o00oOoo.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", NativeProtocol.WEB_DIALOG_PARAMS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
public abstract class CoroutineWorker extends ListenableWorker {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f9716OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final CompletableJob f9717OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final o00OOOO0<ListenableWorker.OooO00o> f9718OoooO0O;

    public static final class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.f9718OoooO0O.f34032Oooo0o instanceof o00OOO0O.OooO0O0) {
                Job.DefaultImpls.cancel$default((Job) CoroutineWorker.this.f9717OoooO0, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    @DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f9720Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o000oOoO f9721Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f9722Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<OooOOO> f9723Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000oOoO<OooOOO> o000oooo2, CoroutineWorker coroutineWorker, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f9723Oooo0oo = o000oooo2;
            this.f9720Oooo = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f9723Oooo0oo, this.f9720Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f9722Oooo0oO;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000oOoO o000oooo2 = this.f9721Oooo0o;
                ResultKt.throwOnFailure(obj);
                o000oooo2.f29810Oooo0oO.OooOO0((R) obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            o000oOoO<OooOOO> o000oooo3 = this.f9723Oooo0oo;
            CoroutineWorker coroutineWorker = this.f9720Oooo;
            this.f9721Oooo0o = o000oooo3;
            this.f9722Oooo0oO = 1;
            Objects.requireNonNull(coroutineWorker);
            throw new IllegalStateException("Not implemented");
        }
    }

    @DebugMetadata(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f9724Oooo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CoroutineWorker.this.new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f9724Oooo0o;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f9724Oooo0o = 1;
                    obj = coroutineWorker.OooO0oo();
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CoroutineWorker.this.f9718OoooO0O.OooOO0((ListenableWorker.OooO00o) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.f9718OoooO0O.OooOO0O(th);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f9717OoooO0 = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        o00OOOO0<ListenableWorker.OooO00o> o00oooo1 = new o00OOOO0<>();
        Intrinsics.checkNotNullExpressionValue(o00oooo1, "create()");
        this.f9718OoooO0O = o00oooo1;
        o00oooo1.OooO00o(new OooO00o(), ((o00O000.OooO0O0) this.f9728Oooo0oO.f9751OooO0Oo).f30114OooO00o);
        this.f9716OoooO = Dispatchers.getDefault();
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final com.google.common.util.concurrent.OooO0OO<OooOOO> OooO00o() {
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(this.f9716OoooO.plus(completableJobJob$default));
        o000oOoO o000oooo2 = new o000oOoO(completableJobJob$default);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new OooO0O0(o000oooo2, this, null), 3, null);
        return o000oooo2;
    }

    @Override // androidx.work.ListenableWorker
    public final void OooO0Oo() {
        this.f9718OoooO0O.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final com.google.common.util.concurrent.OooO0OO<ListenableWorker.OooO00o> OooO0o0() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f9716OoooO.plus(this.f9717OoooO0)), null, null, new OooO0OO(null), 3, null);
        return this.f9718OoooO0O;
    }

    @Nullable
    public abstract Object OooO0oo();
}
