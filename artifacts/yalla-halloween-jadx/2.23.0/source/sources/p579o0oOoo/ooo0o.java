package p579o0oOoo;

import com.yalla.yalla.model.moment.MomentSendModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendEditUtil", f = "MomentSendEditUtil.kt", i = {0, 0}, l = {97}, m = "sendEdit", n = {"this", "sendEditPostModel"}, s = {"L$0", "L$1"})
public final class ooo0o extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oO0O0Oo0 f56724OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f56725OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public MomentSendModel f56726OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oO0O0Oo0 f56727OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f56728OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0o(oO0O0Oo0 oo0o0oo0, Continuation<? super ooo0o> continuation) {
        super(continuation);
        this.f56727OooO0oO = oo0o0oo0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f56725OooO0o = obj;
        this.f56728OooO0oo |= Integer.MIN_VALUE;
        return oO0O0Oo0.OooO0O0(this.f56727OooO0oO, null, this);
    }
}
