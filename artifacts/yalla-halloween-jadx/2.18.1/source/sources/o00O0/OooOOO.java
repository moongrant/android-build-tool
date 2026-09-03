package o00O0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "coil.fetch.HttpFetcher", f = "HttpFetcher.kt", i = {0, 0, 0}, l = {125}, m = "fetch$suspendImpl", n = {"this", "url", "$this$await$iv"}, s = {"L$0", "L$1", "L$2"})
public final class OooOOO extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public /* synthetic */ Object f30073Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooOOOO f30074Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o00OO000 f30075Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o0O0ooO f30076Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f30077OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<Object> f30078OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(OooOOOO<Object> oooOOOO, Continuation<? super OooOOO> continuation) {
        super(continuation);
        this.f30078OoooO00 = oooOOOO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f30073Oooo = obj;
        this.f30077OoooO0 |= Integer.MIN_VALUE;
        return OooOOOO.OooO0Oo(this.f30078OoooO00, null, null, this);
    }
}
