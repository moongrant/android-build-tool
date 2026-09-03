package p101o000oo;

import androidx.paging.OooOOO;
import androidx.paging.o0Oo0oo;
import androidx.paging.o0ooOOo;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.PagingDataDiffer", f = "PagingDataDiffer.kt", i = {0, 0, 0, 0, 0, 0}, l = {460}, m = "presentNewList", n = {"this", "sourceLoadStates", "mediatorLoadStates", "newPresenter", "onListPresentableCalled", "dispatchLoadStates"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
public final class o00O00OO extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f35518OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0Oo0oo f35519OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOOO f35520OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOOO f35521OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0ooOOo f35522OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Ref.BooleanRef f35523OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public /* synthetic */ Object f35524OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo<Object> f35525OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f35526OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(o0Oo0oo<Object> o0oo0oo2, Continuation<? super o00O00OO> continuation) {
        super(continuation);
        this.f35525OooOO0O = o0oo0oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35524OooOO0 = obj;
        this.f35526OooOO0o |= Integer.MIN_VALUE;
        return o0Oo0oo.OooO00o(this.f35525OooOO0O, null, 0, 0, false, null, null, null, this);
    }
}
