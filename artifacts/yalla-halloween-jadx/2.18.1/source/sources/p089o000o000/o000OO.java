package p089o000o000;

import androidx.annotation.VisibleForTesting;
import androidx.paging.PageFetcher$flow$1;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO<Key, Value> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<Continuation<? super o00O00o0<Key, Value>>, Object> f28873OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Key f28874OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O0000 f28875OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Oooo000<Boolean> f28876OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Flow<o0O0ooO<Value>> f28877OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Oooo000<Unit> f28878OooO0o0;

    public static final class OooO00o<Key, Value> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o000O000<Key, Value> f28879OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o00O0<Key, Value> f28880OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Job f28881OooO0OO;

        public OooO00o(@NotNull o000O000<Key, Value> snapshot, @Nullable o00O0<Key, Value> o00o1, @NotNull Job job) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            Intrinsics.checkNotNullParameter(job, "job");
            this.f28879OooO00o = snapshot;
            this.f28880OooO0O0 = o00o1;
            this.f28881OooO0OO = job;
        }
    }

    public final class OooO0O0<Key, Value> implements o00OO000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o000O000<Key, Value> f28882OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Oooo000<Unit> f28883OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o000OO<Key, Value> f28884OooO0OO;

        public OooO0O0(@VisibleForTesting(otherwise = 2) @NotNull o000OO o000oo2, @NotNull o000O000<Key, Value> pageFetcherSnapshot, Oooo000<Unit> retryEventBus) {
            Intrinsics.checkNotNullParameter(pageFetcherSnapshot, "pageFetcherSnapshot");
            Intrinsics.checkNotNullParameter(retryEventBus, "retryEventBus");
            this.f28884OooO0OO = o000oo2;
            this.f28882OooO00o = pageFetcherSnapshot;
            this.f28883OooO0O0 = retryEventBus;
        }

        @Override // p089o000o000.o00OO000
        public final void OooO00o() {
            this.f28883OooO0O0.OooO00o(Unit.INSTANCE);
        }

        @Override // p089o000o000.o00OO000
        public final void OooO0O0(@NotNull o00OO0O0 viewportHint) {
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
            o000O000<Key, Value> o000o001 = this.f28882OooO00o;
            Objects.requireNonNull(o000o001);
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
            o0ooOOo o0ooooo2 = o000o001.f28793OooO0oo;
            Objects.requireNonNull(o0ooooo2);
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
            o0ooooo2.f29070OooO00o.OooO00o(viewportHint instanceof o00OO0O0.OooO00o ? (o00OO0O0.OooO00o) viewportHint : null, new o0Oo0oo(viewportHint));
        }

        @Override // p089o000o000.o00OO000
        public final void refresh() {
            this.f28884OooO0OO.f28876OooO0Oo.OooO00o(Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o000OO(@NotNull Function1 pagingSourceFactory, @Nullable Object obj, @NotNull o00O0000 config) {
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f28873OooO00o = pagingSourceFactory;
        this.f28874OooO0O0 = obj;
        this.f28875OooO0OO = config;
        this.f28876OooO0Oo = new Oooo000<>();
        this.f28878OooO0o0 = new Oooo000<>();
        this.f28877OooO0o = o00O0O0O.OooO00o(new PageFetcher$flow$1(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, o000o000.o00O00o0] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object OooO00o(o000OO o000oo2, o00O00o0 o00o00o1, Continuation continuation) {
        o0000O o0000o2;
        Objects.requireNonNull(o000oo2);
        if (continuation instanceof o0000O) {
            o0000o2 = (o0000O) continuation;
            int i = o0000o2.f28724OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0000o2.f28724OoooO00 = i - Integer.MIN_VALUE;
            } else {
                o0000o2 = new o0000O(o000oo2, continuation);
            }
        } else {
            o0000o2 = new o0000O(o000oo2, continuation);
        }
        Object objInvoke = o0000o2.f28723Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0000o2.f28724OoooO00;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function1<Continuation<? super o00O00o0<Key, Value>>, Object> function1 = o000oo2.f28873OooO00o;
            o0000o2.f28721Oooo0o = o000oo2;
            o0000o2.f28722Oooo0oO = o00o00o1;
            o0000o2.f28724OoooO00 = 1;
            objInvoke = function1.invoke(o0000o2);
            if (objInvoke != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o00o00o1 = o0000o2.f28722Oooo0oO;
        o000oo2 = o0000o2.f28721Oooo0o;
        ResultKt.throwOnFailure(objInvoke);
        coroutine_suspended = (o00O00o0) objInvoke;
        if (coroutine_suspended instanceof o000OOo) {
            o000OOo o000ooo2 = (o000OOo) coroutine_suspended;
            int i3 = o000oo2.f28875OooO0OO.f28925OooO00o;
            int i4 = o000ooo2.f28886OooO0O0;
            if (!(i4 == Integer.MIN_VALUE || i3 == i4)) {
                throw new IllegalStateException(o0O0ooO.OooO00o(OooO00o.OooO00o.OooO0o0("Page size is already set to "), o000ooo2.f28886OooO0O0, '.').toString());
            }
            o000ooo2.f28886OooO0O0 = i3;
        }
        if (!(coroutine_suspended != o00o00o1)) {
            throw new IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.".toString());
        }
        Function0<Unit> onInvalidatedCallback = new o0000OO0(o000oo2);
        Objects.requireNonNull(coroutine_suspended);
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        oo0o0Oo<Function0<Unit>> oo0o0oo = coroutine_suspended.f28941OooO00o;
        Function0<Boolean> function0 = oo0o0oo.f29109OooO0O0;
        if (function0 != null && function0.invoke().booleanValue()) {
            oo0o0oo.OooO00o();
        }
        if (oo0o0oo.f29112OooO0o0) {
            oo0o0oo.f29108OooO00o.invoke(onInvalidatedCallback);
        } else {
            ReentrantLock reentrantLock = oo0o0oo.f29110OooO0OO;
            reentrantLock.lock();
            try {
                if (oo0o0oo.f29112OooO0o0) {
                    Unit unit = Unit.INSTANCE;
                } else {
                    oo0o0oo.f29111OooO0Oo.add((T) onInvalidatedCallback);
                    z = false;
                }
                reentrantLock.unlock();
                if (z) {
                    oo0o0oo.f29108OooO00o.invoke(onInvalidatedCallback);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (o00o00o1 != null) {
            o000 onInvalidatedCallback2 = new o000(o000oo2);
            Intrinsics.checkNotNullParameter(onInvalidatedCallback2, "onInvalidatedCallback");
            oo0o0Oo<Function0<Unit>> oo0o0oo2 = o00o00o1.f28941OooO00o;
            ReentrantLock reentrantLock2 = oo0o0oo2.f29110OooO0OO;
            reentrantLock2.lock();
            try {
                oo0o0oo2.f29111OooO0Oo.remove(onInvalidatedCallback2);
                reentrantLock2.unlock();
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        }
        if (o00o00o1 != null) {
            o00o00o1.OooO0OO();
        }
        return coroutine_suspended;
    }
}
