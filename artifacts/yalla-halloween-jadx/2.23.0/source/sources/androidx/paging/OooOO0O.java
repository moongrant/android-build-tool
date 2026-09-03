package androidx.paging;

import androidx.annotation.RestrictTo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nLegacyPagingSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPagingSource.kt\nandroidx/paging/LegacyPagingSource\n+ 2 PagingState.kt\nandroidx/paging/PagingState\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n142#2,8:149\n1#3:157\n*S KotlinDebug\n*F\n+ 1 LegacyPagingSource.kt\nandroidx/paging/LegacyPagingSource\n*L\n128#1:149,8\n*E\n"})
public final class OooOO0O<Key, Value> extends o0O0O00<Key, Value> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f7154OooO0O0;

    @DebugMetadata(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o0O0O00.OooO0O0.OooO0OO<Key, Value>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7155OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000O00O.o000oOoO<Key> f7156OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooOO0O<Key, Value> f7157OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O00.OooO00o<Key> f7158OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOO0O<Key, Value> oooOO0O, o000O00O.o000oOoO<Key> o000oooo2, o0O0O00.OooO00o<Key> oooO00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f7157OooO0o0 = oooOO0O;
            this.f7156OooO0o = o000oooo2;
            this.f7158OooO0oO = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f7157OooO0o0, this.f7156OooO0o, this.f7158OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Object obj) {
            ((OooO00o) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7155OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f7157OooO0o0.getClass();
                this.f7155OooO0Oo = 1;
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((o000O00O.Oooo0) obj).getClass();
            throw null;
        }
    }

    @Override // androidx.paging.o0O0O00
    public final boolean OooO00o() {
        throw null;
    }

    @Override // androidx.paging.o0O0O00
    @Nullable
    public final Key OooO0O0(@NotNull o000000<Key, Value> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        throw null;
    }

    @Override // androidx.paging.o0O0O00
    @Nullable
    public final Object OooO0Oo(@NotNull o0O0O00.OooO00o<Key> oooO00o, @NotNull Continuation<? super o0O0O00.OooO0O0<Key, Value>> continuation) {
        LoadType loadType;
        boolean z = oooO00o instanceof o0O0O00.OooO00o.OooO0OO;
        if (z) {
            loadType = LoadType.REFRESH;
        } else if (oooO00o instanceof o0O0O00.OooO00o.C0155OooO00o) {
            loadType = LoadType.APPEND;
        } else {
            if (!(oooO00o instanceof o0O0O00.OooO00o.OooO0O0)) {
                throw new NoWhenBranchMatchedException();
            }
            loadType = LoadType.PREPEND;
        }
        if (this.f7154OooO0O0 == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            int i = oooO00o.f7349OooO00o;
            if (z && i % 3 == 0) {
                i /= 3;
            }
            this.f7154OooO0O0 = i;
        }
        return BuildersKt.withContext(null, new OooO00o(this, new o000O00O.o000oOoO(loadType, oooO00o.OooO00o()), oooO00o, null), continuation);
    }
}
