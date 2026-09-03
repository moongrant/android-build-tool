package androidx.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import com.facebook.internal.NativeProtocol;
import com.google.common.util.concurrent.OooOO0O;
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
import p115o00O00oO.o00O0O;
import p115o00O00oO.o0OOO0o;
import p115o00O00oO.o0OoOo0;
import p117o00O0OOo.o00000;
import p117o00O0OOo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/OooO0OO;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", NativeProtocol.WEB_DIALOG_PARAMS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1})
public abstract class CoroutineWorker extends OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o00000O<OooO0OO.OooO00o> f11457OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final CompletableJob f11458OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f11459OooOO0;

    @DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0OOO0o f11460OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<o00O0O> f11461OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f11462OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f11463OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OOO0o<o00O0O> o0ooo0o2, CoroutineWorker coroutineWorker, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f11461OooO0o = o0ooo0o2;
            this.f11463OooO0oO = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f11461OooO0o, this.f11463OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11462OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f11460OooO0Oo = this.f11461OooO0o;
                this.f11462OooO0o0 = 1;
                this.f11463OooO0oO.getClass();
                throw new IllegalStateException("Not implemented");
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0OOO0o o0ooo0o2 = this.f11460OooO0Oo;
            ResultKt.throwOnFailure(obj);
            o0ooo0o2.f36156OooO0o0.OooO((R) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f11458OooO0oo = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        o00000O<OooO0OO.OooO00o> o00000o = new o00000O<>();
        Intrinsics.checkNotNullExpressionValue(o00000o, "create()");
        this.f11457OooO = o00000o;
        o00000o.OooO0oo(new Runnable() { // from class: o00O00oO.o000oOoO
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker this$0 = this.f36150OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.f11457OooO.f36334OooO0Oo instanceof o00000.OooO0O0) {
                    Job.DefaultImpls.cancel$default((Job) this$0.f11458OooO0oo, (CancellationException) null, 1, (Object) null);
                }
            }
        }, ((p119o00O0Oo0.o00O0O) this.f11478OooO0o0.f11490OooO0Oo).f36414OooO00o);
        this.f11459OooOO0 = Dispatchers.getDefault();
    }

    @Override // androidx.work.OooO0OO
    @NotNull
    public final OooOO0O<o00O0O> OooO00o() {
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(this.f11459OooOO0.plus(completableJobJob$default));
        o0OOO0o o0ooo0o2 = new o0OOO0o(completableJobJob$default);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new OooO00o(o0ooo0o2, this, null), 3, null);
        return o0ooo0o2;
    }

    @Override // androidx.work.OooO0OO
    public final void OooO0O0() {
        this.f11457OooO.cancel(false);
    }

    @Override // androidx.work.OooO0OO
    @NotNull
    public final o00000O OooO0Oo() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f11459OooOO0.plus(this.f11458OooO0oo)), null, null, new o0OoOo0(this, null), 3, null);
        return this.f11457OooO;
    }

    @Nullable
    public abstract Object OooO0oO();
}
