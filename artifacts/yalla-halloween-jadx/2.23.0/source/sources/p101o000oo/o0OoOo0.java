package p101o000oo;

import coil.request.OooO00o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {122, 126, 144}, m = "execute", n = {"this", "request", "mappedData", "eventListener", "options", "components", "fetchResult", "this", "request", "eventListener", "options", "fetchResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class o0OoOo0 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Ref.ObjectRef f35568OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Oooo0 f35569OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Object f35570OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f35571OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Object f35572OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Ref.ObjectRef f35573OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Ref.ObjectRef f35574OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Ref.ObjectRef f35575OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public /* synthetic */ Object f35576OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f35577OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f35578OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(Oooo0 oooo0, Continuation<? super o0OoOo0> continuation) {
        super(continuation);
        this.f35578OooOOO0 = oooo0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35576OooOO0o = obj;
        this.f35577OooOOO |= Integer.MIN_VALUE;
        return Oooo0.OooO0OO(this.f35578OooOOO0, null, null, null, null, this);
    }
}
