package o000O00O;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PagingDataDiffer", f = "PagingDataDiffer.kt", i = {0, 0, 0, 0, 0, 0}, l = {460}, m = "presentNewList", n = {"this", "sourceLoadStates", "mediatorLoadStates", "newPresenter", "onListPresentableCalled", "dispatchLoadStates"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
public final class o000OO0O extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f34553OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public androidx.paging.o0Oo0oo f34554OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public androidx.paging.OooOOO f34555OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public androidx.paging.OooOOO f34556OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public androidx.paging.o0ooOOo f34557OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Ref.BooleanRef f34558OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public /* synthetic */ Object f34559OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.o0Oo0oo<Object> f34560OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f34561OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(androidx.paging.o0Oo0oo<Object> o0oo0oo2, Continuation<? super o000OO0O> continuation) {
        super(continuation);
        this.f34560OooOO0O = o0oo0oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34559OooOO0 = obj;
        this.f34561OooOO0o |= Integer.MIN_VALUE;
        return androidx.paging.o0Oo0oo.OooO00o(this.f34560OooOO0O, null, 0, 0, false, null, null, null, this);
    }
}
