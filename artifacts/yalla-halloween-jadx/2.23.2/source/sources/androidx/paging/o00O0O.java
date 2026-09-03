package androidx.paging;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 13, 14, 15, 15}, l = {645, 658, 125, 670, 128, 682, 695, 125, 707, 128, 719, 732, 125, 744, 128, 756}, m = "emit", n = {"this", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "this_$iv", "loadType", "this_$iv", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv", "loadType", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$4", "L$0", "L$3", "L$4", "L$5", "L$0", "L$3", "L$0", "L$3", "L$4", "L$2", "L$3", "L$4", "L$2", "L$3", "L$2", "L$3", "L$4", "L$2", "L$2", "L$3"})
public final class o00O0O extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Object f10407OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f10408OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Object f10409OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object f10410OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Object f10411OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Object f10412OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Object f10413OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o000oOoO f10414OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public /* synthetic */ Object f10415OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f10416OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0.OooO0OO.OooO00o<Object> f10417OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(o0OoOo0.OooO0OO.OooO00o<Object> oooO00o, Continuation<? super o00O0O> continuation) {
        super(continuation);
        this.f10417OooOOO0 = oooO00o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f10415OooOO0o = obj;
        this.f10416OooOOO |= Integer.MIN_VALUE;
        return this.f10417OooOOO0.OooO00o(this);
    }
}
