package p089o000o000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", i = {0, 0}, l = {207}, m = "generateNewPagingSource", n = {"this", "previousPagingSource"}, s = {"L$0", "L$1"})
public final class o0000O extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000OO<Object, Object> f28720Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o000OO f28721Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o00O00o0 f28722Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f28723Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f28724OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(o000OO<Object, Object> o000oo2, Continuation<? super o0000O> continuation) {
        super(continuation);
        this.f28720Oooo = o000oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f28723Oooo0oo = obj;
        this.f28724OoooO00 |= Integer.MIN_VALUE;
        return o000OO.OooO00o(this.f28720Oooo, null, this);
    }
}
