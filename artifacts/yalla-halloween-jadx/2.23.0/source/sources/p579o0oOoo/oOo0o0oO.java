package p579o0oOoo;

import com.yalla.yalla.model.moment.MomentSendModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendEditUtil", f = "MomentSendEditUtil.kt", i = {0, 0}, l = {69}, m = "changePic", n = {"this", "sendPostModel"}, s = {"L$0", "L$1"})
public final class oOo0o0oO extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oO0O0Oo0 f56713OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f56714OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public MomentSendModel f56715OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oO0O0Oo0 f56716OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f56717OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o0oO(oO0O0Oo0 oo0o0oo0, Continuation<? super oOo0o0oO> continuation) {
        super(continuation);
        this.f56716OooO0oO = oo0o0oo0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f56714OooO0o = obj;
        this.f56717OooO0oo |= Integer.MIN_VALUE;
        return oO0O0Oo0.OooO00o(this.f56716OooO0oO, null, this);
    }
}
