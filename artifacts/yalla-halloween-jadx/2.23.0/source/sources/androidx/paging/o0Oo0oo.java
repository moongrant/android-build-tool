package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o0000O0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ResultKt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o000O00O.o000O0O0;
import o000O00O.o000OO0O;
import o000O00O.o00O00;
import o000O00O.o00oOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nPagingDataDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Logger.kt\nandroidx/paging/LoggerKt\n*L\n1#1,548:1\n1#2:549\n41#3,10:550\n41#3,10:560\n41#3,10:570\n*S KotlinDebug\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer\n*L\n268#1:550,10\n303#1:560,10\n324#1:570,10\n*E\n"})
public abstract class o0Oo0oo<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile boolean f7370OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O00O.o0OoOo0 f7371OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f7372OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o000O00O.o0ooOOo f7373OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00O00 f7374OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooOo00 f7375OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public o0ooOOo<T> f7376OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<Function0<Unit>> f7377OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o00oOoo f7378OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile int f7379OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f7380OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final StateFlow<o000O00O.OooOo> f7381OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f7382OooOOO0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo<T> f7383OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0Oo0oo<T> o0oo0oo2) {
            super(0);
            this.f7383OooO0Oo = o0oo0oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableSharedFlow<Unit> mutableSharedFlow = this.f7383OooO0Oo.f7382OooOOO0;
            Unit unit = Unit.INSTANCE;
            mutableSharedFlow.tryEmit(unit);
            return unit;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo<T> f7384OooO00o;

        public OooO0O0(o0Oo0oo<T> o0oo0oo2) {
            this.f7384OooO00o = o0oo0oo2;
        }

        public final void OooO00o(int i, int i2) {
            this.f7384OooO00o.f7371OooO00o.OooO00o(i, i2);
        }

        public final void OooO0O0(@NotNull LoadType type) {
            OooOOO0.OooO0OO state = OooOOO0.OooO0OO.f7167OooO0OO;
            Intrinsics.checkNotNullParameter(type, "loadType");
            Intrinsics.checkNotNullParameter(state, "loadState");
            OooOo00 oooOo00 = this.f7384OooO00o.f7375OooO0o;
            oooOo00.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            oooOo00.OooO0OO(new o000O00O.o00000(type, oooOo00));
        }
    }

    public o0Oo0oo(@NotNull o000O00O.o0OoOo0 differCallback, @NotNull CoroutineContext mainContext, @Nullable o0OOO0o<T> o0ooo0o2) {
        o0ooOOo<T> o0ooooo;
        Oooo000.OooO0O0<T> oooO0O0Invoke;
        Intrinsics.checkNotNullParameter(differCallback, "differCallback");
        Intrinsics.checkNotNullParameter(mainContext, "mainContext");
        this.f7371OooO00o = differCallback;
        this.f7372OooO0O0 = mainContext;
        o0ooOOo<Object> o0ooooo2 = o0ooOOo.f7408OooO0o0;
        Oooo000.OooO0O0<T> oooO0O0Invoke2 = o0ooo0o2 != null ? o0ooo0o2.f7369OooO0Oo.invoke() : null;
        if (oooO0O0Invoke2 != null) {
            o0ooooo = new o0ooOOo<>(oooO0O0Invoke2);
        } else {
            o0ooooo = (o0ooOOo<T>) o0ooOOo.f7408OooO0o0;
            Intrinsics.checkNotNull(o0ooooo, "null cannot be cast to non-null type androidx.paging.PagePresenter<T of androidx.paging.PagePresenter.Companion.initial>");
        }
        this.f7376OooO0o0 = o0ooooo;
        OooOo00 oooOo00 = new OooOo00();
        if (o0ooo0o2 != null && (oooO0O0Invoke = o0ooo0o2.f7369OooO0Oo.invoke()) != null) {
            OooOOO sourceLoadStates = oooO0O0Invoke.f7197OooO0o0;
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            oooOo00.OooO0OO(new o000O00O.o000000O(oooOo00, sourceLoadStates, oooO0O0Invoke.f7196OooO0o));
        }
        this.f7375OooO0o = oooOo00;
        CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f7377OooO0oO = copyOnWriteArrayList;
        this.f7378OooO0oo = new o00oOoo(true);
        this.f7380OooOO0O = new OooO0O0(this);
        this.f7381OooOO0o = oooOo00.f7174OooO0OO;
        this.f7382OooOOO0 = SharedFlowKt.MutableSharedFlow(0, 64, BufferOverflow.DROP_OLDEST);
        OooO00o listener = new OooO00o(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        copyOnWriteArrayList.add(listener);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public static final Object OooO00o(o0Oo0oo o0oo0oo2, List list, int i, int i2, boolean z, OooOOO oooOOO, OooOOO oooOOO2, o000O00O.o0ooOOo o0ooooo, Continuation continuation) {
        o000OO0O o000oo0o2;
        OooOOO oooOOO3;
        o0ooOOo o0ooooo2;
        Ref.BooleanRef booleanRef;
        o0Oo0oo o0oo0oo3 = o0oo0oo2;
        boolean z2 = z;
        OooOOO sourceLoadStates = oooOOO;
        o0oo0oo2.getClass();
        if (continuation instanceof o000OO0O) {
            o000oo0o2 = (o000OO0O) continuation;
            int i3 = o000oo0o2.f34561OooOO0o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o000oo0o2.f34561OooOO0o = i3 - Integer.MIN_VALUE;
            } else {
                o000oo0o2 = new o000OO0O(o0oo0oo3, continuation);
            }
        } else {
            o000oo0o2 = new o000OO0O(o0oo0oo3, continuation);
        }
        o000OO0O o000oo0o3 = o000oo0o2;
        Object objOooO0Oo = o000oo0o3.f34559OooOO0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = o000oo0o3.f34561OooOO0o;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            if (!((z2 && sourceLoadStates == null) ? false : true)) {
                throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataDiffer without source LoadStates set.".toString());
            }
            o0oo0oo3.f7370OooO = false;
            o0ooOOo o0ooooo3 = new o0ooOOo(list, i, i2);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            o0ooOOo<T> o0ooooo4 = o0oo0oo3.f7376OooO0o0;
            int i5 = o0oo0oo3.f7379OooOO0;
            o000O0O0 o000o0o1 = new o000O0O0(o0oo0oo2, o0ooooo3, booleanRef2, o0ooooo, oooOOO2, list, i, i2, oooOOO);
            o000oo0o3.f34554OooO0Oo = o0oo0oo3;
            o000oo0o3.f34556OooO0o0 = sourceLoadStates;
            o000oo0o3.f34555OooO0o = oooOOO2;
            o000oo0o3.f34557OooO0oO = o0ooooo3;
            o000oo0o3.f34558OooO0oo = booleanRef2;
            o000oo0o3.f34553OooO = z2;
            o000oo0o3.f34561OooOO0o = 1;
            objOooO0Oo = o0oo0oo2.OooO0Oo(o0ooooo4, o0ooooo3, i5, o000o0o1, o000oo0o3);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooOOO3 = oooOOO2;
            o0ooooo2 = o0ooooo3;
            booleanRef = booleanRef2;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = o000oo0o3.f34553OooO;
            booleanRef = o000oo0o3.f34558OooO0oo;
            o0ooooo2 = o000oo0o3.f34557OooO0oO;
            oooOOO3 = o000oo0o3.f34555OooO0o;
            OooOOO oooOOO4 = o000oo0o3.f34556OooO0o0;
            o0Oo0oo o0oo0oo4 = o000oo0o3.f34554OooO0Oo;
            ResultKt.throwOnFailure(objOooO0Oo);
            z2 = z3;
            sourceLoadStates = oooOOO4;
            o0oo0oo3 = o0oo0oo4;
        }
        Integer num = (Integer) objOooO0Oo;
        if (!booleanRef.element) {
            throw new IllegalStateException("Missing call to onListPresentable after new list was presented. If you are seeing\n this exception, it is generally an indication of an issue with Paging.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106".toString());
        }
        if (z2) {
            Intrinsics.checkNotNull(sourceLoadStates);
            o0oo0oo3.getClass();
            Intrinsics.checkNotNullParameter(sourceLoadStates, "source");
            OooOo00 oooOo00 = o0oo0oo3.f7375OooO0o;
            oooOo00.getClass();
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            oooOo00.OooO0OO(new o000O00O.o000000O(oooOo00, sourceLoadStates, oooOOO3));
        }
        if (num == null) {
            o000O00O.o0ooOOo o0ooooo5 = o0oo0oo3.f7373OooO0OO;
            if (o0ooooo5 != null) {
                int i6 = o0ooooo2.f7410OooO0O0 / 2;
                Integer numMinOrNull = ArraysKt.minOrNull(((o000000O) CollectionsKt.first((List) o0ooooo2.f7409OooO00o)).f7283OooO00o);
                Intrinsics.checkNotNull(numMinOrNull);
                int iIntValue = numMinOrNull.intValue();
                Integer numMaxOrNull = ArraysKt.maxOrNull(((o000000O) CollectionsKt.last((List) o0ooooo2.f7409OooO00o)).f7283OooO00o);
                Intrinsics.checkNotNull(numMaxOrNull);
                o0ooooo5.OooO00o(new o00000.OooO0O0(i6, i6, iIntValue, numMaxOrNull.intValue()));
            }
        } else {
            o0oo0oo3.f7379OooOO0 = num.intValue();
            o000O00O.o0ooOOo o0ooooo6 = o0oo0oo3.f7373OooO0OO;
            if (o0ooooo6 != null) {
                o0ooooo6.OooO00o(o0ooooo2.OooO0o0(num.intValue()));
            }
        }
        return Unit.INSTANCE;
    }

    @MainThread
    @Nullable
    public final T OooO0O0(@IntRange(from = ULong.MIN_VALUE) int i) {
        this.f7370OooO = true;
        this.f7379OooOO0 = i;
        o000O00O.o0OO00O o0oo00o2 = o000O00O.oo0o0Oo.f34666OooO00o;
        if (o0oo00o2 != null && o0oo00o2.OooO0O0(2)) {
            o0oo00o2.OooO00o(2, "Accessing item index[" + i + ']');
        }
        o000O00O.o0ooOOo o0ooooo = this.f7373OooO0OO;
        if (o0ooooo != null) {
            o0ooooo.OooO00o(this.f7376OooO0o0.OooO0o0(i));
        }
        o0ooOOo<T> o0ooooo2 = this.f7376OooO0o0;
        if (i < 0) {
            o0ooooo2.getClass();
        } else if (i < o0ooooo2.getSize()) {
            int i2 = i - o0ooooo2.f7411OooO0OO;
            if (i2 < 0 || i2 >= o0ooooo2.f7410OooO0O0) {
                return null;
            }
            return o0ooooo2.OooO0Oo(i2);
        }
        StringBuilder sbOooO00o = o0000O0.OooO00o("Index: ", i, ", Size: ");
        sbOooO00o.append(o0ooooo2.getSize());
        throw new IndexOutOfBoundsException(sbOooO00o.toString());
    }

    public boolean OooO0OO() {
        return false;
    }

    @Nullable
    public abstract Object OooO0Oo(@NotNull o0ooOOo o0ooooo, @NotNull o0ooOOo o0ooooo2, int i, @NotNull o000O0O0 o000o0o1, @NotNull Continuation continuation);

    @NotNull
    public final o000O00O.o0Oo0oo<T> OooO0o0() {
        o0ooOOo<T> o0ooooo = this.f7376OooO0o0;
        int i = o0ooooo.f7411OooO0OO;
        int i2 = o0ooooo.f7412OooO0Oo;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = o0ooooo.f7409OooO00o.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((o000000O) it.next()).f7284OooO0O0);
        }
        return new o000O00O.o0Oo0oo<>(arrayList, i, i2);
    }
}
