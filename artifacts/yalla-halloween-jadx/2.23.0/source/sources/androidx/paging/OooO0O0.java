package androidx.paging;

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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCachedPageEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageController\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n107#2,10:283\n107#2,8:293\n116#2:306\n115#2:307\n1559#3:301\n1590#3,4:302\n*S KotlinDebug\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageController\n*L\n128#1:283,10\n138#1:293,8\n138#1:306\n138#1:307\n142#1:301\n142#1:302,4\n*E\n"})
public final class OooO0O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0OO<T> f7126OooO00o = new OooO0OO<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Mutex f7127OooO0O0 = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f7128OooO0OO = -1;

    @DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {288}, m = "getStateAsEvents", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO0O0 f7129OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f7130OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Mutex f7131OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<T> f7132OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f7133OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0O0<T> oooO0O0, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f7132OooO0oO = oooO0O0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f7130OooO0o = obj;
            this.f7133OooO0oo |= Integer.MIN_VALUE;
            return this.f7132OooO0oO.OooO00o(this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0, 0}, l = {288}, m = "record", n = {"this", "event", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class C0152OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f7134OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO0O0 f7135OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Mutex f7136OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public IndexedValue f7137OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f7138OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<T> f7139OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0152OooO0O0(OooO0O0<T> oooO0O0, Continuation<? super C0152OooO0O0> continuation) {
            super(continuation);
            this.f7139OooO0oo = oooO0O0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f7138OooO0oO = obj;
            this.f7134OooO |= Integer.MIN_VALUE;
            return this.f7139OooO0oo.OooO0O0(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super List<? extends IndexedValue<? extends Oooo000<T>>>> continuation) {
        OooO00o oooO00o;
        OooO0O0<T> oooO0O0;
        Mutex mutex;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f7133OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f7133OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        } else {
            oooO00o = new OooO00o(this, continuation);
        }
        Object obj = oooO00o.f7130OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f7133OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            oooO00o.f7129OooO0Oo = this;
            Mutex mutex2 = this.f7127OooO0O0;
            oooO00o.f7131OooO0o0 = mutex2;
            oooO00o.f7133OooO0oo = 1;
            if (mutex2.lock(null, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO0O0 = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = oooO00o.f7131OooO0o0;
            oooO0O0 = oooO00o.f7129OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        try {
            List<Oooo000<T>> listOooO0O0 = oooO0O0.f7126OooO00o.OooO0O0();
            int size = (oooO0O0.f7128OooO0OO - listOooO0O0.size()) + 1;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOooO0O0, 10));
            int i3 = 0;
            for (T t : listOooO0O0) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new IndexedValue(i3 + size, (Oooo000) t));
                i3 = i4;
            }
            return arrayList;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0O0(@NotNull IndexedValue<? extends Oooo000<T>> indexedValue, @NotNull Continuation<? super Unit> continuation) {
        C0152OooO0O0 c0152OooO0O0;
        Mutex mutex;
        OooO0O0<T> oooO0O0;
        if (continuation instanceof C0152OooO0O0) {
            c0152OooO0O0 = (C0152OooO0O0) continuation;
            int i = c0152OooO0O0.f7134OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0152OooO0O0.f7134OooO = i - Integer.MIN_VALUE;
            } else {
                c0152OooO0O0 = new C0152OooO0O0(this, continuation);
            }
        } else {
            c0152OooO0O0 = new C0152OooO0O0(this, continuation);
        }
        Object obj = c0152OooO0O0.f7138OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c0152OooO0O0.f7134OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c0152OooO0O0.f7135OooO0Oo = this;
            c0152OooO0O0.f7137OooO0o0 = indexedValue;
            mutex = this.f7127OooO0O0;
            c0152OooO0O0.f7136OooO0o = mutex;
            c0152OooO0O0.f7134OooO = 1;
            if (mutex.lock(null, c0152OooO0O0) == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO0O0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = c0152OooO0O0.f7136OooO0o;
            IndexedValue<? extends Oooo000<T>> indexedValue2 = c0152OooO0O0.f7137OooO0o0;
            oooO0O0 = c0152OooO0O0.f7135OooO0Oo;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            indexedValue = indexedValue2;
        }
        try {
            oooO0O0.f7128OooO0OO = indexedValue.getIndex();
            oooO0O0.f7126OooO00o.OooO00o(indexedValue.getValue());
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
