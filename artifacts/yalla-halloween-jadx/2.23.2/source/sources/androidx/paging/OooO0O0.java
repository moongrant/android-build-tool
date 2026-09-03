package androidx.paging;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCachedPageEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageController\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n107#2,10:283\n107#2,8:293\n116#2:306\n115#2:307\n1559#3:301\n1590#3,4:302\n*S KotlinDebug\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageController\n*L\n128#1:283,10\n138#1:293,8\n138#1:306\n138#1:307\n142#1:301\n142#1:302,4\n*E\n"})
public final class OooO0O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0OO<T> f10220OooO00o = new OooO0OO<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Mutex f10221OooO0O0 = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f10222OooO0OO = -1;

    @DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0}, l = {288}, m = "getStateAsEvents", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO0O0 f10223OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f10224OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Mutex f10225OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<T> f10226OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f10227OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0O0<T> oooO0O0, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f10226OooO0oO = oooO0O0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10224OooO0o = obj;
            this.f10227OooO0oo |= Integer.MIN_VALUE;
            return this.f10226OooO0oO.OooO00o(this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @DebugMetadata(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", i = {0, 0, 0}, l = {288}, m = "record", n = {"this", "event", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class C0171OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f10228OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO0O0 f10229OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Mutex f10230OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public IndexedValue f10231OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f10232OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<T> f10233OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0171OooO0O0(OooO0O0<T> oooO0O0, Continuation<? super C0171OooO0O0> continuation) {
            super(continuation);
            this.f10233OooO0oo = oooO0O0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10232OooO0oO = obj;
            this.f10228OooO |= Integer.MIN_VALUE;
            return this.f10233OooO0oo.OooO0O0(null, this);
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
            int i = oooO00o.f10227OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f10227OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        } else {
            oooO00o = new OooO00o(this, continuation);
        }
        Object obj = oooO00o.f10224OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f10227OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            oooO00o.f10223OooO0Oo = this;
            Mutex mutex2 = this.f10221OooO0O0;
            oooO00o.f10225OooO0o0 = mutex2;
            oooO00o.f10227OooO0oo = 1;
            if (mutex2.lock(null, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO0O0 = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = oooO00o.f10225OooO0o0;
            oooO0O0 = oooO00o.f10223OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        try {
            List<Oooo000<T>> listOooO0O0 = oooO0O0.f10220OooO00o.OooO0O0();
            int size = (oooO0O0.f10222OooO0OO - listOooO0O0.size()) + 1;
            ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(listOooO0O0));
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
        C0171OooO0O0 c0171OooO0O0;
        Mutex mutex;
        OooO0O0<T> oooO0O0;
        if (continuation instanceof C0171OooO0O0) {
            c0171OooO0O0 = (C0171OooO0O0) continuation;
            int i = c0171OooO0O0.f10228OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0171OooO0O0.f10228OooO = i - Integer.MIN_VALUE;
            } else {
                c0171OooO0O0 = new C0171OooO0O0(this, continuation);
            }
        } else {
            c0171OooO0O0 = new C0171OooO0O0(this, continuation);
        }
        Object obj = c0171OooO0O0.f10232OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c0171OooO0O0.f10228OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c0171OooO0O0.f10229OooO0Oo = this;
            c0171OooO0O0.f10231OooO0o0 = indexedValue;
            mutex = this.f10221OooO0O0;
            c0171OooO0O0.f10230OooO0o = mutex;
            c0171OooO0O0.f10228OooO = 1;
            if (mutex.lock(null, c0171OooO0O0) == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO0O0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = c0171OooO0O0.f10230OooO0o;
            IndexedValue<? extends Oooo000<T>> indexedValue2 = c0171OooO0O0.f10231OooO0o0;
            oooO0O0 = c0171OooO0O0.f10229OooO0Oo;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            indexedValue = indexedValue2;
        }
        try {
            oooO0O0.f10222OooO0OO = indexedValue.getIndex();
            oooO0O0.f10220OooO00o.OooO00o(indexedValue.getValue());
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
