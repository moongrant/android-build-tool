package p590o0oOooo0;

import com.yalla.yalla.model.moment.MomentSendModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendEditUtil", f = "MomentSendEditUtil.kt", i = {0, 0}, l = {97}, m = "sendEdit", n = {"this", "sendEditPostModel"}, s = {"L$0", "L$1"})
public final class t extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public p f57276OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f57277OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public MomentSendModel f57278OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ p f57279OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f57280OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p pVar, Continuation<? super t> continuation) {
        super(continuation);
        this.f57279OooO0oO = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f57277OooO0o = obj;
        this.f57280OooO0oo |= Integer.MIN_VALUE;
        return p.OooO0O0(this.f57279OooO0oO, null, this);
    }
}
