package p579o0oOoo;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.util.AppVirtualManager", f = "AppVirtualManager.kt", i = {}, l = {45}, m = "checkVirtualBlacklist", n = {}, s = {})
public final class oO00000 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f56522OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f56523OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o f56524OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000(o oVar, Continuation<? super oO00000> continuation) {
        super(continuation);
        this.f56524OooO0o0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f56522OooO0Oo = obj;
        this.f56523OooO0o |= Integer.MIN_VALUE;
        return o.OooO00o(this.f56524OooO0o0, this);
    }
}
