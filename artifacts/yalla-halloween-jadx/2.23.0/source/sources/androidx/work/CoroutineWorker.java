package androidx.work;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
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
import p084o000Ooo0.OooOO0O;
import p084o000Ooo0.OooOOO0;
import p084o000Ooo0.Oooo0;
import p094o000o0Oo.o0000O00;
import p094o000o0Oo.o0000Ooo;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", NativeProtocol.WEB_DIALOG_PARAMS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
public abstract class CoroutineWorker extends ListenableWorker {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final CompletableJob f8363OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o0000O00<ListenableWorker.OooO00o> f8364OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f8365OooOO0O;

    public static final class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.f8364OooOO0.f35363OooO0Oo instanceof o0000Ooo.OooO0O0) {
                Job.DefaultImpls.cancel$default((Job) CoroutineWorker.this.f8363OooO, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    @DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Oooo0 f8367OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<OooOOO0> f8368OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f8369OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f8370OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<OooOOO0> oooo0, CoroutineWorker coroutineWorker, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f8368OooO0o = oooo0;
            this.f8370OooO0oO = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f8368OooO0o, this.f8370OooO0oO, continuation);
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
            int i = this.f8369OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f8367OooO0Oo = this.f8368OooO0o;
                this.f8369OooO0o0 = 1;
                this.f8370OooO0oO.getClass();
                throw new IllegalStateException("Not implemented");
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Oooo0 oooo0 = this.f8367OooO0Oo;
            ResultKt.throwOnFailure(obj);
            oooo0.f35107OooO0o0.OooO0oo((R) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f8363OooO = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        o0000O00<ListenableWorker.OooO00o> o0000o00 = new o0000O00<>();
        Intrinsics.checkNotNullExpressionValue(o0000o00, "create()");
        this.f8364OooOO0 = o0000o00;
        o0000o00.OooO(new OooO00o(), ((o0000O0O) this.f8373OooO0o0.f8396OooO0Oo).f35389OooO00o);
        this.f8365OooOO0O = Dispatchers.getDefault();
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final com.google.common.util.concurrent.OooO00o<OooOOO0> OooO00o() {
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(this.f8365OooOO0O.plus(completableJobJob$default));
        Oooo0 oooo0 = new Oooo0(completableJobJob$default);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new OooO0O0(oooo0, this, null), 3, null);
        return oooo0;
    }

    @Override // androidx.work.ListenableWorker
    public final void OooO0Oo() {
        this.f8364OooOO0.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final o0000O00 OooO0o0() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f8365OooOO0O.plus(this.f8363OooO)), null, null, new OooOO0O(this, null), 3, null);
        return this.f8364OooOO0;
    }

    @Nullable
    public abstract Object OooO0oo();
}
