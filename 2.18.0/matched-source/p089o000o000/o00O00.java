package p089o000o000;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o00000O0;
import androidx.paging.LoadType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class o00O00<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile int f28924OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f28925OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f28926OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public o000O<T> f28927OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00OO000 f28928OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<Function0<Unit>> f28929OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00000OO f28930OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00O0OO f28931OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile boolean f28932OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO0OO f28933OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Flow<OooOo> f28934OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f28935OooOO0o;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00O00<T> f28936Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O00<T> o00o01) {
            super(0);
            this.f28936Oooo = o00o01;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableSharedFlow<Unit> mutableSharedFlow = this.f28936Oooo.f28935OooOO0o;
            Unit unit = Unit.INSTANCE;
            mutableSharedFlow.tryEmit(unit);
            return unit;
        }
    }

    @DebugMetadata(c = "androidx.paging.PagingDataDiffer$collectFrom$2", f = "PagingDataDiffer.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f28937Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0O0ooO<T> f28938OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00O00<T> f28939OoooO00;

        public static final class OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ o00O00<T> f28940Oooo;

            public OooO00o(o00O00<T> o00o01) {
                this.f28940Oooo = o00o01;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                o00O00<T> o00o01 = this.f28940Oooo;
                Object objWithContext = BuildersKt.withContext(o00o01.f28926OooO0O0, new o00O00O((o0000O0O) obj, o00o01, null), continuation);
                return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O00<T> o00o01, o0O0ooO<T> o0o0ooo, Continuation<? super OooO0O0> continuation) {
            super(1, continuation);
            this.f28939OoooO00 = o00o01;
            this.f28938OoooO0 = o0o0ooo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f28939OoooO00, this.f28938OoooO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28937Oooo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00O00<T> o00o01 = this.f28939OoooO00;
                o0O0ooO<T> o0o0ooo = this.f28938OoooO0;
                o00o01.f28928OooO0Oo = o0o0ooo.f29085OooO0O0;
                Flow<o0000O0O<T>> flow = o0o0ooo.f29084OooO00o;
                OooO00o oooO00o = new OooO00o(o00o01);
                this.f28937Oooo = 1;
                if (flow.collect(oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o00O00<T> f28941OooO00o;

        public OooO0OO(o00O00<T> o00o01) {
            this.f28941OooO00o = o00o01;
        }

        public final void OooO00o(int i, int i2) {
            this.f28941OooO00o.f28925OooO00o.OooO0OO(i, i2);
        }

        public final void OooO0O0(int i, int i2) {
            this.f28941OooO00o.f28925OooO00o.OooO00o(i, i2);
        }

        public final void OooO0OO(int i, int i2) {
            this.f28941OooO00o.f28925OooO00o.OooO0O0(i, i2);
        }

        public final void OooO0Oo(@NotNull LoadType type) {
            o000000 o000000Var;
            o000000.OooO0OO state = o000000.OooO0OO.f28718OooO0OO;
            Intrinsics.checkNotNullParameter(type, "loadType");
            Intrinsics.checkNotNullParameter(state, "loadState");
            o00000OO o00000oo2 = this.f28941OooO00o.f28930OooO0o0;
            Objects.requireNonNull(o00000oo2);
            Intrinsics.checkNotNullParameter(type, "type");
            o000000O o000000o2 = o00000oo2.f28735OooO0o;
            if (o000000o2 != null) {
                Intrinsics.checkNotNullParameter(type, "loadType");
                int i = o000000O.OooO0O0.$EnumSwitchMapping$0[type.ordinal()];
                if (i == 1) {
                    o000000Var = o000000o2.f28723OooO0OO;
                } else if (i == 2) {
                    o000000Var = o000000o2.f28722OooO0O0;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o000000Var = o000000o2.f28721OooO00o;
                }
            } else {
                o000000Var = null;
            }
            if (Intrinsics.areEqual(o000000Var, state)) {
                return;
            }
            o00000OO o00000oo3 = this.f28941OooO00o.f28930OooO0o0;
            Objects.requireNonNull(o00000oo3);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            o00000oo3.f28731OooO00o = true;
            o000000O o000000o3 = o00000oo3.f28735OooO0o;
            o000000O o000000oOooO0O0 = o000000o3.OooO0O0(type);
            o00000oo3.f28735OooO0o = o000000oOooO0O0;
            Intrinsics.areEqual(o000000oOooO0O0, o000000o3);
            o00000oo3.OooO0OO();
        }

        public final void OooO0o0(@NotNull o000000O source, @Nullable o000000O o000000o2) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f28941OooO00o.OooO0OO(source, o000000o2);
        }
    }

    public o00O00(@NotNull o0OoOo0 differCallback, @NotNull CoroutineContext mainContext) {
        Intrinsics.checkNotNullParameter(differCallback, "differCallback");
        Intrinsics.checkNotNullParameter(mainContext, "mainContext");
        this.f28925OooO00o = differCallback;
        this.f28926OooO0O0 = mainContext;
        o000O.OooO00o oooO00o = o000O.f28778OooO0o0;
        this.f28927OooO0OO = (o000O<T>) o000O.f28777OooO0o;
        o00000OO o00000oo2 = new o00000OO();
        this.f28930OooO0o0 = o00000oo2;
        CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f28929OooO0o = copyOnWriteArrayList;
        this.f28931OooO0oO = new o00O0OO(false, 1, null);
        this.f28933OooOO0 = new OooO0OO(this);
        this.f28934OooOO0O = o00000oo2.f28730OooO;
        this.f28935OooOO0o = SharedFlowKt.MutableSharedFlow(0, 64, BufferOverflow.DROP_OLDEST);
        OooO00o listener = new OooO00o(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        copyOnWriteArrayList.add(listener);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(o00O00 o00o01, List list, int i, int i2, boolean z, o000000O o000000o2, o000000O o000000o3, Continuation continuation) {
        oOO00O ooo00o;
        o00O00 o00o02;
        Ref.BooleanRef booleanRef;
        o000O o000o;
        Objects.requireNonNull(o00o01);
        if (continuation instanceof oOO00O) {
            ooo00o = (oOO00O) continuation;
            int i3 = ooo00o.f29103OoooOOo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ooo00o.f29103OoooOOo = i3 - Integer.MIN_VALUE;
            } else {
                ooo00o = new oOO00O(o00o01, continuation);
            }
        } else {
            ooo00o = new oOO00O(o00o01, continuation);
        }
        oOO00O ooo00o2 = ooo00o;
        Object obj = ooo00o2.f29104o000oOoO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = ooo00o2.f29103OoooOOo;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!((z && o000000o2 == null) ? false : true)) {
                throw new IllegalArgumentException("Cannot dispatch LoadStates in PagingDataDiffer without source LoadStates set.".toString());
            }
            o00o01.f28932OooO0oo = false;
            o000O o000o2 = new o000O(list, i, i2);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            o000O<T> o000o3 = o00o01.f28927OooO0OO;
            int i5 = o00o01.f28924OooO;
            o00O00OO o00o00oo2 = new o00O00OO(o00o01, o000o2, booleanRef2);
            ooo00o2.f29096Oooo = o00o01;
            ooo00o2.f29099OoooO00 = o000000o2;
            ooo00o2.f29098OoooO0 = o000000o3;
            ooo00o2.f29100OoooO0O = o000o2;
            ooo00o2.f29097OoooO = booleanRef2;
            ooo00o2.f29101OoooOO0 = z;
            ooo00o2.f29103OoooOOo = 1;
            Object objOooO0o = o00o01.OooO0o(o000o3, o000o2, i5, o00o00oo2, ooo00o2);
            if (objOooO0o == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00o02 = o00o01;
            booleanRef = booleanRef2;
            o000o = o000o2;
            obj = objOooO0o;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = ooo00o2.f29101OoooOO0;
            booleanRef = ooo00o2.f29097OoooO;
            o000o = ooo00o2.f29100OoooO0O;
            o000000o3 = ooo00o2.f29098OoooO0;
            o000000o2 = ooo00o2.f29099OoooO00;
            o00o02 = ooo00o2.f29096Oooo;
            ResultKt.throwOnFailure(obj);
        }
        Integer num = (Integer) obj;
        if (!booleanRef.element) {
            throw new IllegalStateException("Missing call to onListPresentable after new list was presented. If you are seeing\n this exception, it is generally an indication of an issue with Paging.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106".toString());
        }
        if (z) {
            Intrinsics.checkNotNull(o000000o2);
            o00o02.OooO0OO(o000000o2, o000000o3);
        }
        if (num == null) {
            o00OO000 o00oo001 = o00o02.f28928OooO0Oo;
            if (o00oo001 != null) {
                int i6 = o000o.f28780OooO0O0 / 2;
                o00oo001.OooO0O0(new o00OO0O0.OooO0O0(i6, i6, o000o.OooO0oo(), o000o.OooO()));
            }
        } else {
            o00o02.f28924OooO = num.intValue();
            o00OO000 o00oo002 = o00o02.f28928OooO0Oo;
            if (o00oo002 != null) {
                o00oo002.OooO0O0(o000o.OooO0o0(num.intValue()));
            }
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object OooO0O0(@NotNull o0O0ooO<T> o0o0ooo, @NotNull Continuation<? super Unit> continuation) {
        Object objOooO00o = this.f28931OooO0oO.OooO00o(0, new OooO0O0(this, o0o0ooo, null), continuation);
        return objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO00o : Unit.INSTANCE;
    }

    public final void OooO0OO(@NotNull o000000O sourceLoadStates, @Nullable o000000O o000000o2) {
        Intrinsics.checkNotNullParameter(sourceLoadStates, "source");
        if (Intrinsics.areEqual(this.f28930OooO0o0.f28735OooO0o, sourceLoadStates) && Intrinsics.areEqual(this.f28930OooO0o0.f28737OooO0oO, o000000o2)) {
            return;
        }
        o00000OO o00000oo2 = this.f28930OooO0o0;
        Objects.requireNonNull(o00000oo2);
        Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
        o00000oo2.f28731OooO00o = true;
        o00000oo2.f28735OooO0o = sourceLoadStates;
        o00000oo2.f28737OooO0oO = o000000o2;
        o00000oo2.OooO0OO();
    }

    @Nullable
    public final T OooO0Oo(@IntRange(from = ULong.MIN_VALUE) int i) {
        this.f28932OooO0oo = true;
        this.f28924OooO = i;
        o00OO000 o00oo001 = this.f28928OooO0Oo;
        if (o00oo001 != null) {
            o00oo001.OooO0O0(this.f28927OooO0OO.OooO0o0(i));
        }
        o000O<T> o000o = this.f28927OooO0OO;
        Objects.requireNonNull(o000o);
        if (i < 0 || i >= o000o.getSize()) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("Index: ", i, ", Size: ");
            sbOooO00o.append(o000o.getSize());
            throw new IndexOutOfBoundsException(sbOooO00o.toString());
        }
        int i2 = i - o000o.f28781OooO0OO;
        if (i2 < 0 || i2 >= o000o.f28780OooO0O0) {
            return null;
        }
        return o000o.OooO0Oo(i2);
    }

    @Nullable
    public abstract Object OooO0o(@NotNull o0000O00<T> o0000o00, @NotNull o0000O00<T> o0000o01, int i, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Integer> continuation);

    public boolean OooO0o0() {
        return false;
    }

    @NotNull
    public final o0O0O00<T> OooO0oO() {
        o000O<T> o000o = this.f28927OooO0OO;
        int i = o000o.f28781OooO0OO;
        int i2 = o000o.f28782OooO0Oo;
        List<o00O<T>> list = o000o.f28779OooO00o;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((o00O) it.next()).f28917OooO0O0);
        }
        return new o0O0O00<>(i, i2, arrayList);
    }
}
