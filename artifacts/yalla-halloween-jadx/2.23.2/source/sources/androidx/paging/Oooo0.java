package androidx.paging;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o0000;
import p101o000oo.o0000O0;
import p101o000oo.o0000O00;
import p101o000oo.o0000O0O;
import p101o000oo.o000O0;
import p101o000oo.o000O0Oo;
import p101o000oo.o000OO0O;
import p101o000oo.o00O000;
import p101o000oo.o00O0O0;
import p101o000oo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPageFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher\n+ 2 Logger.kt\nandroidx/paging/LoggerKt\n*L\n1#1,256:1\n41#2,10:257\n*S KotlinDebug\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher\n*L\n227#1:257,10\n*E\n"})
public final class Oooo0<Key, Value> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<Continuation<? super o0O0O00<Key, Value>>, Object> f10269OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Key f10270OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O000 f10271OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final p101o000oo.o0O0O00<Boolean> f10272OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Flow<o0OOO0o<Value>> f10273OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final p101o000oo.o0O0O00<Unit> f10274OooO0o0;

    public static final class OooO00o<Key, Value> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o000oOoO<Key, Value> f10275OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o000000<Key, Value> f10276OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Job f10277OooO0OO;

        public OooO00o(@NotNull o000oOoO snapshot, @Nullable o000000 o000000Var, @NotNull CompletableJob job) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            Intrinsics.checkNotNullParameter(job, "job");
            this.f10275OooO00o = snapshot;
            this.f10276OooO0O0 = o000000Var;
            this.f10277OooO0OO = job;
        }
    }

    public final class OooO0O0<Key, Value> implements o0000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o000oOoO<Key, Value> f10278OooO00o;

        public OooO0O0(@VisibleForTesting @NotNull o000oOoO pageFetcherSnapshot) {
            Intrinsics.checkNotNullParameter(pageFetcherSnapshot, "pageFetcherSnapshot");
            this.f10278OooO00o = pageFetcherSnapshot;
        }

        @Override // p101o000oo.o0000
        public final void OooO00o(@NotNull o00000 viewportHint) {
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
            o000oOoO<Key, Value> o000oooo2 = this.f10278OooO00o;
            o000oooo2.getClass();
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
            OooO0o oooO0o = o000oooo2.f10389OooO0oo;
            oooO0o.getClass();
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
            oooO0o.f10240OooO00o.OooO00o(viewportHint instanceof o00000.OooO00o ? (o00000.OooO00o) viewportHint : null, new OooOO0(viewportHint));
        }
    }

    public final class OooO0OO implements oo0oOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final p101o000oo.o0O0O00<Unit> f10279OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Key, Value> f10280OooO0O0;

        public OooO0OO(@NotNull Oooo0 oooo0, p101o000oo.o0O0O00<Unit> retryEventBus) {
            Intrinsics.checkNotNullParameter(retryEventBus, "retryEventBus");
            this.f10280OooO0O0 = oooo0;
            this.f10279OooO00o = retryEventBus;
        }

        @Override // p101o000oo.oo0oOO0
        public final void OooO00o() {
            this.f10279OooO00o.OooO00o(Unit.INSTANCE);
        }

        @Override // p101o000oo.oo0oOO0
        public final void OooO0O0() {
            this.f10280OooO0O0.f10272OooO0Oo.OooO00o(Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Oooo0(@NotNull Function1 pagingSourceFactory, @Nullable Object obj, @NotNull o00O000 config) {
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f10269OooO00o = pagingSourceFactory;
        this.f10270OooO0O0 = obj;
        this.f10271OooO0OO = config;
        this.f10272OooO0Oo = new p101o000oo.o0O0O00<>(0);
        this.f10274OooO0o0 = new p101o000oo.o0O0O00<>(0);
        this.f10273OooO0o = o00O0O0.OooO00o(new PageFetcher$flow$1(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.paging.o0O0O00, java.lang.Object] */
    public static final Object OooO00o(Oooo0 oooo0, o0O0O00 o0o0o00, Continuation continuation) {
        o000O0 o000o0;
        boolean z;
        oooo0.getClass();
        if (continuation instanceof o000O0) {
            o000o0 = (o000O0) continuation;
            int i = o000o0.f35441OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000o0.f35441OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o000o0 = new o000O0(oooo0, continuation);
            }
        } else {
            o000o0 = new o000O0(oooo0, continuation);
        }
        Object objInvoke = o000o0.f35438OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000o0.f35441OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            o000o0.f35437OooO0Oo = oooo0;
            o000o0.f35439OooO0o0 = o0o0o00;
            o000o0.f35441OooO0oo = 1;
            objInvoke = oooo0.f10269OooO00o.invoke(o000o0);
            if (objInvoke != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o0o0o00 = o000o0.f35439OooO0o0;
        oooo0 = o000o0.f35437OooO0Oo;
        ResultKt.throwOnFailure(objInvoke);
        coroutine_suspended = (o0O0O00) objInvoke;
        if (coroutine_suspended instanceof OooOO0O) {
            OooOO0O oooOO0O = (OooOO0O) coroutine_suspended;
            int i3 = oooo0.f10271OooO0OO.f35508OooO00o;
            int i4 = oooOO0O.f10248OooO0O0;
            if (!(i4 == Integer.MIN_VALUE || i3 == i4)) {
                throw new IllegalStateException(androidx.compose.foundation.layout.OooO0O0.OooO00o(new StringBuilder("Page size is already set to "), oooOO0O.f10248OooO0O0, '.').toString());
            }
            oooOO0O.f10248OooO0O0 = i3;
        }
        if (!(coroutine_suspended != o0o0o00)) {
            throw new IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.".toString());
        }
        o000O0Oo onInvalidatedCallback = new o000O0Oo(oooo0);
        coroutine_suspended.getClass();
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        o0000O00<Function0<Unit>> o0000o00 = coroutine_suspended.f10442OooO00o;
        Function0<Boolean> function0 = o0000o00.f35424OooO0O0;
        if (function0 != null && function0.invoke().booleanValue()) {
            o0000o00.OooO00o();
        }
        boolean z2 = o0000o00.f35427OooO0o0;
        Function1<Function0<Unit>, Unit> function1 = o0000o00.f35423OooO00o;
        if (z2) {
            function1.invoke(onInvalidatedCallback);
        } else {
            ReentrantLock reentrantLock = o0000o00.f35425OooO0OO;
            reentrantLock.lock();
            try {
                if (o0000o00.f35427OooO0o0) {
                    Unit unit = Unit.INSTANCE;
                    z = true;
                } else {
                    o0000o00.f35426OooO0Oo.add(onInvalidatedCallback);
                    z = false;
                }
                reentrantLock.unlock();
                if (z) {
                    function1.invoke(onInvalidatedCallback);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (o0o0o00 != null) {
            o000OO0O onInvalidatedCallback2 = new o000OO0O(oooo0);
            Intrinsics.checkNotNullParameter(onInvalidatedCallback2, "onInvalidatedCallback");
            o0000O00<Function0<Unit>> o0000o01 = o0o0o00.f10442OooO00o;
            ReentrantLock reentrantLock2 = o0000o01.f35425OooO0OO;
            reentrantLock2.lock();
            try {
                o0000o01.f35426OooO0Oo.remove(onInvalidatedCallback2);
                reentrantLock2.unlock();
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        }
        if (o0o0o00 != null) {
            o0o0o00.OooO0OO();
        }
        o0000O0 o0000o1 = o0000O0O.f35428OooO00o;
        if (o0000o1 != null && o0000o1.OooO0O0(3)) {
            o0000o1.OooO00o(3, "Generated new PagingSource " + ((Object) coroutine_suspended));
        }
        return coroutine_suspended;
    }
}
