package p590o0oOooo0;

import com.yalla.yalla.model.moment.MomentSendModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendEditUtil", f = "MomentSendEditUtil.kt", i = {0, 0}, l = {69}, m = "changePic", n = {"this", "sendPostModel"}, s = {"L$0", "L$1"})
public final class q extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public p f57255OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f57256OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public MomentSendModel f57257OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ p f57258OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f57259OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, Continuation<? super q> continuation) {
        super(continuation);
        this.f57258OooO0oO = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f57256OooO0o = obj;
        this.f57259OooO0oo |= Integer.MIN_VALUE;
        return p.OooO00o(this.f57258OooO0oO, null, this);
    }
}
