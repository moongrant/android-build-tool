package p089o000o000;

import androidx.annotation.RestrictTo;
import androidx.paging.LoadType;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000OOo<Key, Value> extends o00O00o0<Key, Value> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f28886OooO0O0;

    @DebugMetadata(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o00O00o0.OooO0O0.OooO0OO<Key, Value>>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00O00o0.OooO00o<Key> f28887Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f28888Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000OOo<Key, Value> f28889Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<Key> f28890Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000OOo<Key, Value> o000ooo2, o000oOoO<Key> o000oooo2, o00O00o0.OooO00o<Key> oooO00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f28889Oooo0oO = o000ooo2;
            this.f28890Oooo0oo = o000oooo2;
            this.f28887Oooo = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f28889Oooo0oO, this.f28890Oooo0oo, this.f28887Oooo, continuation);
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
            int i = this.f28888Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Objects.requireNonNull(this.f28889Oooo0oO);
                this.f28888Oooo0o = 1;
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Objects.requireNonNull((Oooo0) obj);
            throw null;
        }
    }

    @Override // p089o000o000.o00O00o0
    public final boolean OooO00o() {
        throw null;
    }

    @Override // p089o000o000.o00O00o0
    @Nullable
    public final Key OooO0O0(@NotNull o00O0<Key, Value> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    @Override // p089o000o000.o00O00o0
    @Nullable
    public final Object OooO0Oo(@NotNull o00O00o0.OooO00o<Key> oooO00o, @NotNull Continuation<? super o00O00o0.OooO0O0<Key, Value>> continuation) {
        LoadType loadType;
        int i;
        boolean z = oooO00o instanceof o00O00o0.OooO00o.OooO0OO;
        if (z) {
            loadType = LoadType.REFRESH;
        } else if (oooO00o instanceof o00O00o0.OooO00o.C0311OooO00o) {
            loadType = LoadType.APPEND;
        } else {
            if (!(oooO00o instanceof o00O00o0.OooO00o.OooO0O0)) {
                throw new NoWhenBranchMatchedException();
            }
            loadType = LoadType.PREPEND;
        }
        if (this.f28886OooO0O0 == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            if (z) {
                int i2 = oooO00o.f28942OooO00o;
                if (i2 % 3 == 0) {
                    i = i2 / 3;
                } else {
                    i = oooO00o.f28942OooO00o;
                }
            } else {
                i = oooO00o.f28942OooO00o;
            }
            this.f28886OooO0O0 = i;
        }
        return BuildersKt.withContext(null, new OooO00o(this, new o000oOoO(loadType, oooO00o.OooO00o()), oooO00o, null), continuation);
    }
}
