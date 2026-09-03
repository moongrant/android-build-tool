package p101o000oo;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1", f = "AsyncPagingDataDiffer.kt", i = {0, 0, 0, 0, 0}, l = {185}, m = "presentNewList", n = {"this", "previousList", "newList", "onListPresentable", "lastAccessedIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
public final class o0OoOo0 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public /* synthetic */ Object f35574OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00Oo0 f35575OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000Oo0 f35576OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000Oo0 f35577OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Function0 f35578OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f35579OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f35580OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f35581OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(o00Oo0 o00oo1, Continuation continuation) {
        super(continuation);
        this.f35580OooOO0 = o00oo1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35574OooO = obj;
        this.f35581OooOO0O |= Integer.MIN_VALUE;
        return this.f35580OooOO0.OooO0Oo(null, null, 0, null, this);
    }
}
