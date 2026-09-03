package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o000;
import p101o000oo.o0000;
import p101o000oo.o0000O0;
import p101o000oo.o0000O0O;
import p101o000oo.o0000oo;
import p101o000oo.o000O000;
import p101o000oo.o00O00OO;
import p101o000oo.o00O00o0;
import p101o000oo.oo0o0O0;
import p101o000oo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nPagingDataDiffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Logger.kt\nandroidx/paging/LoggerKt\n*L\n1#1,548:1\n1#2:549\n41#3,10:550\n41#3,10:560\n41#3,10:570\n*S KotlinDebug\n*F\n+ 1 PagingDataDiffer.kt\nandroidx/paging/PagingDataDiffer\n*L\n268#1:550,10\n303#1:560,10\n324#1:570,10\n*E\n"})
public abstract class o0Oo0oo<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile boolean f10464OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final p101o000oo.o000000O f10465OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f10466OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o0000 f10467OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public oo0oOO0 f10468OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooOo00 f10469OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public o0ooOOo<T> f10470OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<Function0<Unit>> f10471OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final oo0o0O0 f10472OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile int f10473OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f10474OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final StateFlow<p101o000oo.oo0o0Oo> f10475OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f10476OooOOO0;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo<T> f10477OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0Oo0oo<T> o0oo0oo2) {
            super(0);
            this.f10477OooO0Oo = o0oo0oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableSharedFlow<Unit> mutableSharedFlow = this.f10477OooO0Oo.f10476OooOOO0;
            Unit unit = Unit.INSTANCE;
            mutableSharedFlow.tryEmit(unit);
            return unit;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo<T> f10478OooO00o;

        public OooO0O0(o0Oo0oo<T> o0oo0oo2) {
            this.f10478OooO00o = o0oo0oo2;
        }

        public final void OooO00o(int i, int i2) {
            this.f10478OooO00o.f10465OooO00o.OooO00o(i, i2);
        }

        public final void OooO0O0(@NotNull LoadType type) {
            OooOOO0.OooO0OO state = OooOOO0.OooO0OO.f10261OooO0OO;
            Intrinsics.checkNotNullParameter(type, "loadType");
            Intrinsics.checkNotNullParameter(state, "loadState");
            OooOo00 oooOo00 = this.f10478OooO00o.f10469OooO0o;
            oooOo00.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            oooOo00.OooO0OO(new o000O000(type, oooOo00));
        }
    }

    public o0Oo0oo(@NotNull p101o000oo.o000000O differCallback, @NotNull CoroutineContext mainContext, @Nullable o0OOO0o<T> o0ooo0o2) {
        o0ooOOo<T> o0ooooo;
        Oooo000.OooO0O0<T> oooO0O0Invoke;
        Intrinsics.checkNotNullParameter(differCallback, "differCallback");
        Intrinsics.checkNotNullParameter(mainContext, "mainContext");
        this.f10465OooO00o = differCallback;
        this.f10466OooO0O0 = mainContext;
        o0ooOOo<Object> o0ooooo2 = o0ooOOo.f10502OooO0o0;
        Oooo000.OooO0O0<T> oooO0O0Invoke2 = o0ooo0o2 != null ? o0ooo0o2.f10463OooO0Oo.invoke() : null;
        if (oooO0O0Invoke2 != null) {
            o0ooooo = new o0ooOOo<>(oooO0O0Invoke2);
        } else {
            o0ooooo = (o0ooOOo<T>) o0ooOOo.f10502OooO0o0;
            Intrinsics.checkNotNull(o0ooooo, "null cannot be cast to non-null type androidx.paging.PagePresenter<T of androidx.paging.PagePresenter.Companion.initial>");
        }
        this.f10470OooO0o0 = o0ooooo;
        OooOo00 oooOo00 = new OooOo00();
        if (o0ooo0o2 != null && (oooO0O0Invoke = o0ooo0o2.f10463OooO0Oo.invoke()) != null) {
            OooOOO sourceLoadStates = oooO0O0Invoke.f10291OooO0o0;
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            oooOo00.OooO0OO(new o000(oooOo00, sourceLoadStates, oooO0O0Invoke.f10290OooO0o));
        }
        this.f10469OooO0o = oooOo00;
        CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f10471OooO0oO = copyOnWriteArrayList;
        this.f10472OooO0oo = new oo0o0O0(true);
        this.f10474OooOO0O = new OooO0O0(this);
        this.f10475OooOO0o = oooOo00.f10268OooO0OO;
        this.f10476OooOOO0 = SharedFlowKt.MutableSharedFlow(0, 64, BufferOverflow.DROP_OLDEST);
        OooO00o listener = new OooO00o(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        copyOnWriteArrayList.add(listener);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public static final Object OooO00o(o0Oo0oo o0oo0oo2, List list, int i, int i2, boolean z, OooOOO oooOOO, OooOOO oooOOO2, o0000 o0000Var, Continuation continuation) {
        o00O00OO o00o00oo2;
        OooOOO oooOOO3;
        o0ooOOo o0ooooo;
        Ref.BooleanRef booleanRef;
        o0Oo0oo o0oo0oo3 = o0oo0oo2;
        boolean z2 = z;
        OooOOO sourceLoadStates = oooOOO;
        o0oo0oo2.getClass();
        if (continuation instanceof o00O00OO) {
            o00o00oo2 = (o00O00OO) continuation;
            int i3 = o00o00oo2.f35526OooOO0o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o00o00oo2.f35526OooOO0o = i3 - Integer.MIN_VALUE;
            } else {
                o00o00oo2 = new o00O00OO(o0oo0oo3, continuation);
            }
        } else {
            o00o00oo2 = new o00O00OO(o0oo0oo3, continuation);
        }
        o00O00OO o00o00oo3 = o00o00oo2;
        Object objOooO0Oo = o00o00oo3.f35524OooOO0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = o00o00oo3.f35526OooOO0o;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            if (!((z2 && sourceLoadStates == null) ? false : true)) {
                throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataDiffer without source LoadStates set.".toString());
            }
            o0oo0oo3.f10464OooO = false;
            o0ooOOo o0ooooo2 = new o0ooOOo(list, i, i2);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            o0ooOOo<T> o0ooooo3 = o0oo0oo3.f10470OooO0o0;
            int i5 = o0oo0oo3.f10473OooOO0;
            o00O00o0 o00o00o1 = new o00O00o0(o0oo0oo2, o0ooooo2, booleanRef2, o0000Var, oooOOO2, list, i, i2, oooOOO);
            o00o00oo3.f35519OooO0Oo = o0oo0oo3;
            o00o00oo3.f35521OooO0o0 = sourceLoadStates;
            o00o00oo3.f35520OooO0o = oooOOO2;
            o00o00oo3.f35522OooO0oO = o0ooooo2;
            o00o00oo3.f35523OooO0oo = booleanRef2;
            o00o00oo3.f35518OooO = z2;
            o00o00oo3.f35526OooOO0o = 1;
            objOooO0Oo = o0oo0oo2.OooO0Oo(o0ooooo3, o0ooooo2, i5, o00o00o1, o00o00oo3);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooOOO3 = oooOOO2;
            o0ooooo = o0ooooo2;
            booleanRef = booleanRef2;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = o00o00oo3.f35518OooO;
            booleanRef = o00o00oo3.f35523OooO0oo;
            o0ooooo = o00o00oo3.f35522OooO0oO;
            oooOOO3 = o00o00oo3.f35520OooO0o;
            OooOOO oooOOO4 = o00o00oo3.f35521OooO0o0;
            o0Oo0oo o0oo0oo4 = o00o00oo3.f35519OooO0Oo;
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
            OooOo00 oooOo00 = o0oo0oo3.f10469OooO0o;
            oooOo00.getClass();
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            oooOo00.OooO0OO(new o000(oooOo00, sourceLoadStates, oooOOO3));
        }
        if (num == null) {
            o0000 o0000Var2 = o0oo0oo3.f10467OooO0OO;
            if (o0000Var2 != null) {
                int i6 = o0ooooo.f10504OooO0O0 / 2;
                Integer numMinOrNull = ArraysKt.minOrNull(((o000000O) CollectionsKt.first((List) o0ooooo.f10503OooO00o)).f10377OooO00o);
                Intrinsics.checkNotNull(numMinOrNull);
                int iIntValue = numMinOrNull.intValue();
                Integer numMaxOrNull = ArraysKt.maxOrNull(((o000000O) CollectionsKt.last((List) o0ooooo.f10503OooO00o)).f10377OooO00o);
                Intrinsics.checkNotNull(numMaxOrNull);
                o0000Var2.OooO00o(new o00000.OooO0O0(i6, i6, iIntValue, numMaxOrNull.intValue()));
            }
        } else {
            o0oo0oo3.f10473OooOO0 = num.intValue();
            o0000 o0000Var3 = o0oo0oo3.f10467OooO0OO;
            if (o0000Var3 != null) {
                o0000Var3.OooO00o(o0ooooo.OooO0o0(num.intValue()));
            }
        }
        return Unit.INSTANCE;
    }

    @MainThread
    @Nullable
    public final T OooO0O0(@IntRange(from = ULong.MIN_VALUE) int i) {
        this.f10464OooO = true;
        this.f10473OooOO0 = i;
        o0000O0 o0000o1 = o0000O0O.f35428OooO00o;
        if (o0000o1 != null && o0000o1.OooO0O0(2)) {
            o0000o1.OooO00o(2, "Accessing item index[" + i + ']');
        }
        o0000 o0000Var = this.f10467OooO0OO;
        if (o0000Var != null) {
            o0000Var.OooO00o(this.f10470OooO0o0.OooO0o0(i));
        }
        o0ooOOo<T> o0ooooo = this.f10470OooO0o0;
        if (i < 0) {
            o0ooooo.getClass();
        } else if (i < o0ooooo.getSize()) {
            int i2 = i - o0ooooo.f10505OooO0OO;
            if (i2 < 0 || i2 >= o0ooooo.f10504OooO0O0) {
                return null;
            }
            return o0ooooo.OooO0Oo(i2);
        }
        StringBuilder sbOooO0O0 = androidx.appcompat.widget.o0000O0.OooO0O0("Index: ", i, ", Size: ");
        sbOooO0O0.append(o0ooooo.getSize());
        throw new IndexOutOfBoundsException(sbOooO0O0.toString());
    }

    public boolean OooO0OO() {
        return false;
    }

    @Nullable
    public abstract Object OooO0Oo(@NotNull o0ooOOo o0ooooo, @NotNull o0ooOOo o0ooooo2, int i, @NotNull o00O00o0 o00o00o1, @NotNull Continuation continuation);

    @NotNull
    public final o0000oo<T> OooO0o0() {
        o0ooOOo<T> o0ooooo = this.f10470OooO0o0;
        int i = o0ooooo.f10505OooO0OO;
        int i2 = o0ooooo.f10506OooO0Oo;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = o0ooooo.f10503OooO00o.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((o000000O) it.next()).f10378OooO0O0);
        }
        return new o0000oo<>(arrayList, i, i2);
    }
}
