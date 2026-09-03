package o000O00O;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1", f = "AsyncPagingDataDiffer.kt", i = {0, 0, 0, 0, 0}, l = {185}, m = "presentNewList", n = {"this", "previousList", "newList", "onListPresentable", "lastAccessedIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
public final class OooO0O0 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public /* synthetic */ Object f34435OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o f34436OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00000O f34437OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00000O f34438OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Function0 f34439OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f34440OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f34441OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f34442OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO0o oooO0o, Continuation continuation) {
        super(continuation);
        this.f34441OooOO0 = oooO0o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34435OooO = obj;
        this.f34442OooOO0O |= Integer.MIN_VALUE;
        return this.f34441OooOO0.OooO0Oo(null, null, 0, null, this);
    }
}
