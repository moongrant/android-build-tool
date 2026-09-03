package p089o000o000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PagingDataDiffer", f = "PagingDataDiffer.kt", i = {0, 0, 0, 0, 0, 0}, l = {436}, m = "presentNewList", n = {"this", "sourceLoadStates", "mediatorLoadStates", "newPresenter", "onListPresentableCalled", "dispatchLoadStates"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
public final class oOO00O extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o000O f29077Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00O00 f29078Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o000000O f29079Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o000000O f29080Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ o00O00<Object> f29081OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f29082OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Ref.BooleanRef f29083OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public /* synthetic */ Object f29084OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f29085OoooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(o00O00<Object> o00o01, Continuation<? super oOO00O> continuation) {
        super(continuation);
        this.f29081OoooO = o00o01;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f29084OoooO0O = obj;
        this.f29085OoooOO0 |= Integer.MIN_VALUE;
        return o00O00.OooO00o(this.f29081OoooO, null, 0, 0, false, null, null, this);
    }
}
