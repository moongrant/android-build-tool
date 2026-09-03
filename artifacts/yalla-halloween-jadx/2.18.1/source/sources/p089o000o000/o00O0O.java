package p089o000o000;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00Oo0<T> f28954OooO00o = new o00Oo0<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Mutex f28955OooO0O0 = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f28956OooO0OO = -1;

    @DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {278}, m = "getStateAsEvents", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00O0O<T> f28957Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00O0O f28958Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Mutex f28959Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f28960Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f28961OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O0O<T> o00o0o2, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f28957Oooo = o00o0o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28960Oooo0oo = obj;
            this.f28961OoooO00 |= Integer.MIN_VALUE;
            return this.f28957Oooo.OooO00o(this);
        }
    }

    @DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0, 0}, l = {278}, m = "record", n = {"this", "event", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f28962Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00O0O f28963Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public IndexedValue f28964Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Mutex f28965Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f28966OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00O0O<T> f28967OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O0O<T> o00o0o2, Continuation<? super OooO0O0> continuation) {
            super(continuation);
            this.f28967OoooO00 = o00o0o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28962Oooo = obj;
            this.f28966OoooO0 |= Integer.MIN_VALUE;
            return this.f28967OoooO00.OooO0O0(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super List<? extends IndexedValue<? extends o0000O0O<T>>>> continuation) {
        OooO00o oooO00o;
        o00O0O<T> o00o0o2;
        Mutex mutex;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f28961OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f28961OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        } else {
            oooO00o = new OooO00o(this, continuation);
        }
        Object obj = oooO00o.f28960Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f28961OoooO00;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.f28955OooO0O0;
            oooO00o.f28958Oooo0o = this;
            oooO00o.f28959Oooo0oO = mutex2;
            oooO00o.f28961OoooO00 = 1;
            if (mutex2.lock(null, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00o0o2 = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = oooO00o.f28959Oooo0oO;
            o00o0o2 = oooO00o.f28958Oooo0o;
            ResultKt.throwOnFailure(obj);
        }
        try {
            List<o0000O0O<T>> listOooO0O0 = o00o0o2.f28954OooO00o.OooO0O0();
            int size = (o00o0o2.f28956OooO0OO - listOooO0O0.size()) + 1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOooO0O0, 10));
            int i3 = 0;
            for (T t : listOooO0O0) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new IndexedValue(i3 + size, (o0000O0O) t));
                i3 = i4;
            }
            return arrayList;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0O0(@NotNull IndexedValue<? extends o0000O0O<T>> indexedValue, @NotNull Continuation<? super Unit> continuation) {
        OooO0O0 oooO0O0;
        Mutex mutex;
        o00O0O<T> o00o0o2;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f28966OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f28966OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(this, continuation);
        }
        Object obj = oooO0O0.f28962Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f28966OoooO0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.f28955OooO0O0;
            oooO0O0.f28963Oooo0o = this;
            oooO0O0.f28964Oooo0oO = indexedValue;
            oooO0O0.f28965Oooo0oo = mutex;
            oooO0O0.f28966OoooO0 = 1;
            if (mutex.lock(null, oooO0O0) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00o0o2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = oooO0O0.f28965Oooo0oo;
            IndexedValue<? extends o0000O0O<T>> indexedValue2 = oooO0O0.f28964Oooo0oO;
            o00o0o2 = oooO0O0.f28963Oooo0o;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            indexedValue = indexedValue2;
        }
        try {
            o00o0o2.f28956OooO0OO = indexedValue.getIndex();
            o00o0o2.f28954OooO00o.OooO00o(indexedValue.getValue());
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
