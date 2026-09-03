package p617o0oo0o;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.util.BubbleUtil", f = "BubbleUtil.kt", i = {0, 0}, l = {25}, m = "loadNinePatchBubble", n = {"this", "url"}, s = {"L$0", "L$1"})
public final class o0OoOo0 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00O0O f48577Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00O0O f48578Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f48579Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f48580Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f48581OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(o00O0O o00o0o2, Continuation<? super o0OoOo0> continuation) {
        super(continuation);
        this.f48577Oooo = o00o0o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f48580Oooo0oo = obj;
        this.f48581OoooO00 |= Integer.MIN_VALUE;
        return this.f48577Oooo.OooO00o(null, this);
    }
}
