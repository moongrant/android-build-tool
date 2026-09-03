package p590o0oOooo0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.util.AppVirtualManager", f = "AppVirtualManager.kt", i = {}, l = {45}, m = "checkVirtualBlacklist", n = {}, s = {})
public final class oOO000 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f57170OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f57171OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOO0000 f57172OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO000(oOO0000 ooo0000, Continuation<? super oOO000> continuation) {
        super(continuation);
        this.f57172OooO0o0 = ooo0000;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f57170OooO0Oo = obj;
        this.f57171OooO0o |= Integer.MIN_VALUE;
        return oOO0000.OooO00o(this.f57172OooO0o0, this);
    }
}
