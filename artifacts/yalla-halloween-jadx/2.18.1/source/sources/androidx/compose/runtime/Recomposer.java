package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.oo0o0Oo;
import p037OoooOOo.o00000OO;
import p041Ooooo00.o00Ooo;
import p046Oooooo.o0Oo0oo;
import p047Oooooo0.o00O0;
import p047Oooooo0.oo00o;
import p047Oooooo0.oo0o0O0;
import p100o000oOoO.o00O000o;
import p100o000oOoO.o00O0OOO;
import p100o000oOoO.o0O;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0O00O0o;
import p100o000oOoO.o0O0o0;
import p100o000oOoO.o0O0o00O;
import p100o000oOoO.o0OoO00O;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class Recomposer extends o00O0OOO {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public static final MutableStateFlow<o00000OO<OooO0O0>> f5962OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f5963OooOOo0 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final List<oo0O> f5964OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O000o f5965OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CompletableJob f5966OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f5967OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Object f5968OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Throwable f5969OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Job f5970OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final List<oo0O> f5971OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final List<Set<Object>> f5972OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final List<oo0O> f5973OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final List<o0O00O> f5974OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Map<o0OoO00O<Object>, List<o0O00O>> f5975OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public CancellableContinuation<? super Unit> f5976OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Map<o0O00O, o0O00O0o> f5977OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<State> f5978OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f5979OooOOOo;

    public static final class OooO00o {
        public static final void OooO00o(OooO0O0 oooO0O0) {
            MutableStateFlow<o00000OO<OooO0O0>> mutableStateFlow;
            o00000OO<OooO0O0> value;
            o00000OO<OooO0O0> o00000ooRemove;
            OooO00o oooO00o = Recomposer.f5963OooOOo0;
            do {
                mutableStateFlow = Recomposer.f5962OooOOo;
                value = mutableStateFlow.getValue();
                o00000ooRemove = value.remove(oooO0O0);
                if (value == o00000ooRemove) {
                    return;
                }
            } while (!mutableStateFlow.compareAndSet(value, o00000ooRemove));
        }
    }

    public final class OooO0O0 {
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            CancellableContinuation<Unit> cancellableContinuationOooOo0O;
            Recomposer recomposer = Recomposer.this;
            synchronized (recomposer.f5968OooO0Oo) {
                cancellableContinuationOooOo0O = recomposer.OooOo0O();
                if (recomposer.f5978OooOOOO.getValue().compareTo(State.ShuttingDown) <= 0) {
                    throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", recomposer.f5969OooO0o);
                }
            }
            if (cancellableContinuationOooOo0O != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationOooOo0O.resumeWith(Result.m502constructorimpl(Unit.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Throwable, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable th2 = th;
            CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th2);
            Recomposer recomposer = Recomposer.this;
            synchronized (recomposer.f5968OooO0Oo) {
                Job job = recomposer.f5970OooO0o0;
                if (job != null) {
                    recomposer.f5978OooOOOO.setValue(State.ShuttingDown);
                    job.cancel(CancellationException);
                    recomposer.f5976OooOOO = null;
                    job.invokeOnCompletion(new androidx.compose.runtime.OooO00o(recomposer, th2));
                } else {
                    recomposer.f5969OooO0o = CancellationException;
                    recomposer.f5978OooOOOO.setValue(State.ShutDown);
                    Unit unit = Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 6, 0})
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    static {
        o00Ooo.OooO00o oooO00o = o00Ooo.f3764Oooo;
        f5962OooOOo = StateFlowKt.MutableStateFlow(o00Ooo.f3765OoooO00);
    }

    public Recomposer(@NotNull CoroutineContext effectCoroutineContext) {
        Intrinsics.checkNotNullParameter(effectCoroutineContext, "effectCoroutineContext");
        o00O000o o00o000o2 = new o00O000o(new OooO0OO());
        this.f5965OooO00o = o00o000o2;
        CompletableJob completableJobJob = JobKt.Job((Job) effectCoroutineContext.get(Job.INSTANCE));
        completableJobJob.invokeOnCompletion(new OooO0o());
        this.f5966OooO0O0 = completableJobJob;
        this.f5967OooO0OO = effectCoroutineContext.plus(o00o000o2).plus(completableJobJob);
        this.f5968OooO0Oo = new Object();
        this.f5971OooO0oO = new ArrayList();
        this.f5972OooO0oo = new ArrayList();
        this.f5964OooO = new ArrayList();
        this.f5973OooOO0 = new ArrayList();
        this.f5974OooOO0O = new ArrayList();
        this.f5975OooOO0o = new LinkedHashMap();
        this.f5977OooOOO0 = new LinkedHashMap();
        this.f5978OooOOOO = StateFlowKt.MutableStateFlow(State.Inactive);
        this.f5979OooOOOo = new OooO0O0();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.LinkedHashMap, java.util.Map<o000oOoO.o0OoO00O<java.lang.Object>, java.util.List<o000oOoO.o0O00O>>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.Map<o000oOoO.o0OoO00O<java.lang.Object>, java.util.List<o000oOoO.o0O00O>>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.LinkedHashMap, java.util.Map<o000oOoO.o0O00O, o000oOoO.o0O00O0o>] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.LinkedHashMap, java.util.Map<o000oOoO.o0O00O, o000oOoO.o0O00O0o>] */
    public static final void OooOOOo(Recomposer recomposer) {
        int i;
        List listEmptyList;
        synchronized (recomposer.f5968OooO0Oo) {
            if (!recomposer.f5975OooOO0o.isEmpty()) {
                List listFlatten = CollectionsKt.flatten(recomposer.f5975OooOO0o.values());
                recomposer.f5975OooOO0o.clear();
                ArrayList arrayList = new ArrayList(listFlatten.size());
                int size = listFlatten.size();
                for (int i2 = 0; i2 < size; i2++) {
                    o0O00O o0o00o2 = (o0O00O) listFlatten.get(i2);
                    arrayList.add(TuplesKt.to(o0o00o2, recomposer.f5977OooOOO0.get(o0o00o2)));
                }
                recomposer.f5977OooOOO0.clear();
                listEmptyList = arrayList;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        int size2 = listEmptyList.size();
        for (i = 0; i < size2; i++) {
            Pair pair = (Pair) listEmptyList.get(i);
            o0O00O o0o00o3 = (o0O00O) pair.component1();
            o0O00O0o o0o00o0o = (o0O00O0o) pair.component2();
            if (o0o00o0o != null) {
                o0o00o3.f29531OooO0OO.OooOOO0(o0o00o0o);
            }
        }
    }

    public static final oo0O OooOOo(Recomposer recomposer, oo0O oo0o, oo0o0Oo oo0o0oo) {
        p047Oooooo0.o00O000o o00o000oOooOoO;
        if (oo0o.OooOO0() || oo0o.OooO0o0()) {
            return null;
        }
        o0O0o0 o0o0o0 = new o0O0o0(oo0o);
        o0O o0o = new o0O(oo0o, oo0o0oo);
        oo00o oo00oVarOooO = oo0o0O0.OooO();
        p047Oooooo0.o00O000o o00o000o2 = oo00oVarOooO instanceof p047Oooooo0.o00O000o ? (p047Oooooo0.o00O000o) oo00oVarOooO : null;
        if (o00o000o2 == null || (o00o000oOooOoO = o00o000o2.OooOoO(o0o0o0, o0o)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            oo00o oo00oVarOooO2 = o00o000oOooOoO.OooO();
            boolean z = true;
            try {
                if (!oo0o0oo.OooO0O0()) {
                    z = false;
                }
                if (z) {
                    oo0o.OooO0o(new o0O0o00O(oo0o0oo, oo0o));
                }
                boolean zOooOOo0 = oo0o.OooOOo0();
                o00o000oOooOoO.OooOOOo(oo00oVarOooO2);
                recomposer.OooOo00(o00o000oOooOoO);
                if (!zOooOOo0) {
                    oo0o = null;
                }
                return oo0o;
            } catch (Throwable th) {
                o00o000oOooOoO.OooOOOo(oo00oVarOooO2);
                throw th;
            }
        } catch (Throwable th2) {
            recomposer.OooOo00(o00o000oOooOoO);
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    public static final boolean OooOOo0(Recomposer recomposer) {
        return (recomposer.f5964OooO.isEmpty() ^ true) || recomposer.f5965OooO00o.OooO00o();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.util.Set<java.lang.Object>>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List, java.util.List<java.util.Set<java.lang.Object>>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<java.util.Set<java.lang.Object>>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List, java.util.List<o000oOoO.oo0O>] */
    public static final void OooOOoo(Recomposer recomposer) {
        if (!recomposer.f5972OooO0oo.isEmpty()) {
            ?? r0 = recomposer.f5972OooO0oo;
            int size = r0.size();
            for (int i = 0; i < size; i++) {
                Set<? extends Object> set = (Set) r0.get(i);
                ?? r5 = recomposer.f5971OooO0oO;
                int size2 = r5.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((oo0O) r5.get(i2)).OooO0oO(set);
                }
            }
            recomposer.f5972OooO0oo.clear();
            if (recomposer.OooOo0O() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<o000oOoO.o0O00O>] */
    public static final void OooOo(List<o0O00O> list, Recomposer recomposer, oo0O oo0o) {
        list.clear();
        synchronized (recomposer.f5968OooO0Oo) {
            Iterator it = recomposer.f5974OooOO0O.iterator();
            while (it.hasNext()) {
                o0O00O o0o00o2 = (o0O00O) it.next();
                if (Intrinsics.areEqual(o0o00o2.f29531OooO0OO, oo0o)) {
                    list.add(o0o00o2);
                    it.remove();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p100o000oOoO.o00O0OOO
    public final void OooO(@NotNull o0O00O reference, @NotNull o0O00O0o data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(data, "data");
        synchronized (this.f5968OooO0Oo) {
            this.f5977OooOOO0.put(reference, data);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List, java.util.List<o000oOoO.o0O00O>] */
    @Override // p100o000oOoO.o00O0OOO
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void OooO00o(@NotNull oo0O composition, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content) {
        p047Oooooo0.o00O000o o00o000oOooOoO;
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(content, "content");
        boolean zOooOO0 = composition.OooOO0();
        o0O0o0 o0o0o0 = new o0O0o0(composition);
        o0O o0o = new o0O(composition, null);
        oo00o oo00oVarOooO = oo0o0O0.OooO();
        p047Oooooo0.o00O000o o00o000o2 = oo00oVarOooO instanceof p047Oooooo0.o00O000o ? (p047Oooooo0.o00O000o) oo00oVarOooO : null;
        if (o00o000o2 == null || (o00o000oOooOoO = o00o000o2.OooOoO(o0o0o0, o0o)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            oo00o oo00oVarOooO2 = o00o000oOooOoO.OooO();
            try {
                composition.OooO00o(content);
                Unit unit = Unit.INSTANCE;
                o00o000oOooOoO.OooOOOo(oo00oVarOooO2);
                OooOo00(o00o000oOooOoO);
                if (!zOooOO0) {
                    oo0o0O0.OooO().OooOO0o();
                }
                synchronized (this.f5968OooO0Oo) {
                    if (this.f5978OooOOOO.getValue().compareTo(State.ShuttingDown) > 0 && !this.f5971OooO0oO.contains(composition)) {
                        this.f5971OooO0oO.add(composition);
                    }
                }
                synchronized (this.f5968OooO0Oo) {
                    ?? r1 = this.f5974OooOO0O;
                    int size = r1.size();
                    boolean z = false;
                    for (int i = 0; i < size; i++) {
                        if (Intrinsics.areEqual(((o0O00O) r1.get(i)).f29531OooO0OO, composition)) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        Unit unit2 = Unit.INSTANCE;
                        ArrayList arrayList = new ArrayList();
                        OooOo(arrayList, this, composition);
                        while (!arrayList.isEmpty()) {
                            OooOoO0(arrayList, null);
                            OooOo(arrayList, this, composition);
                        }
                    }
                }
                composition.OooO0oo();
                composition.OooO0OO();
                if (zOooOO0) {
                    return;
                }
                oo0o0O0.OooO().OooOO0o();
            } catch (Throwable th) {
                o00o000oOooOoO.OooOOOo(oo00oVarOooO2);
                throw th;
            }
        } catch (Throwable th2) {
            OooOo00(o00o000oOooOoO);
            throw th2;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p100o000oOoO.o00O0OOO
    public final void OooO0O0(@NotNull o0O00O reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.f5968OooO0Oo) {
            Map<o0OoO00O<Object>, List<o0O00O>> map = this.f5975OooOO0o;
            o0OoO00O<Object> o0ooo00o2 = reference.f29529OooO00o;
            Intrinsics.checkNotNullParameter(map, "<this>");
            Collection arrayList = map.get(o0ooo00o2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(o0ooo00o2, (List<o0O00O>) arrayList);
            }
            ((List) arrayList).add(reference);
        }
    }

    @Override // p100o000oOoO.o00O0OOO
    public final boolean OooO0Oo() {
        return false;
    }

    @Override // p100o000oOoO.o00O0OOO
    public final int OooO0o() {
        return 1000;
    }

    @Override // p100o000oOoO.o00O0OOO
    @NotNull
    public final CoroutineContext OooO0oO() {
        return this.f5967OooO0OO;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    @Override // p100o000oOoO.o00O0OOO
    public final void OooO0oo(@NotNull oo0O composition) {
        CancellableContinuation<Unit> cancellableContinuationOooOo0O;
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.f5968OooO0Oo) {
            if (this.f5964OooO.contains(composition)) {
                cancellableContinuationOooOo0O = null;
            } else {
                this.f5964OooO.add(composition);
                cancellableContinuationOooOo0O = OooOo0O();
            }
        }
        if (cancellableContinuationOooOo0O != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationOooOo0O.resumeWith(Result.m502constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // p100o000oOoO.o00O0OOO
    @Nullable
    public final o0O00O0o OooOO0(@NotNull o0O00O reference) {
        o0O00O0o o0o00o0oRemove;
        Intrinsics.checkNotNullParameter(reference, "reference");
        synchronized (this.f5968OooO0Oo) {
            o0o00o0oRemove = this.f5977OooOOO0.remove(reference);
        }
        return o0o00o0oRemove;
    }

    @Override // p100o000oOoO.o00O0OOO
    public final void OooOO0O(@NotNull Set<o0Oo0oo> table) {
        Intrinsics.checkNotNullParameter(table, "table");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    @Override // p100o000oOoO.o00O0OOO
    public final void OooOOOO(@NotNull oo0O composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        synchronized (this.f5968OooO0Oo) {
            this.f5971OooO0oO.remove(composition);
            this.f5964OooO.remove(composition);
            this.f5973OooOO0.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void OooOo0() {
        synchronized (this.f5968OooO0Oo) {
            if (this.f5978OooOOOO.getValue().compareTo(State.Idle) >= 0) {
                this.f5978OooOOOO.setValue(State.ShuttingDown);
            }
            Unit unit = Unit.INSTANCE;
        }
        Job.DefaultImpls.cancel$default((Job) this.f5966OooO0O0, (CancellationException) null, 1, (Object) null);
    }

    public final void OooOo00(p047Oooooo0.o00O000o o00o000o2) {
        try {
            if (o00o000o2.OooOo0() instanceof o00O0.OooO00o) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
            o00o000o2.OooO0OO();
        } catch (Throwable th) {
            o00o000o2.OooO0OO();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList, java.util.List<o000oOoO.o0O00O>] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList, java.util.List<java.util.Set<java.lang.Object>>] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.ArrayList, java.util.List<java.util.Set<java.lang.Object>>] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.ArrayList, java.util.List<o000oOoO.o0O00O>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<java.util.Set<java.lang.Object>>] */
    public final CancellableContinuation<Unit> OooOo0O() {
        State state;
        if (this.f5978OooOOOO.getValue().compareTo(State.ShuttingDown) <= 0) {
            this.f5971OooO0oO.clear();
            this.f5972OooO0oo.clear();
            this.f5964OooO.clear();
            this.f5973OooOO0.clear();
            this.f5974OooOO0O.clear();
            CancellableContinuation<? super Unit> cancellableContinuation = this.f5976OooOOO;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.f5976OooOOO = null;
            return null;
        }
        if (this.f5970OooO0o0 == null) {
            this.f5972OooO0oo.clear();
            this.f5964OooO.clear();
            state = this.f5965OooO00o.OooO00o() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = ((this.f5964OooO.isEmpty() ^ true) || (this.f5972OooO0oo.isEmpty() ^ true) || (this.f5973OooOO0.isEmpty() ^ true) || (this.f5974OooOO0O.isEmpty() ^ true) || this.f5965OooO00o.OooO00o()) ? State.PendingWork : State.Idle;
        }
        this.f5978OooOOOO.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.f5976OooOOO;
        this.f5976OooOOO = null;
        return cancellableContinuation2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<java.util.Set<java.lang.Object>>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
    public final boolean OooOo0o() {
        boolean z;
        synchronized (this.f5968OooO0Oo) {
            z = true;
            if (!(!this.f5972OooO0oo.isEmpty()) && !(!this.f5964OooO.isEmpty()) && !this.f5965OooO00o.OooO00o()) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.LinkedHashMap, java.util.Map, java.util.Map<o000oOoO.o0OoO00O<java.lang.Object>, java.util.List<o000oOoO.o0O00O>>] */
    public final List<oo0O> OooOoO0(List<o0O00O> list, oo0o0Oo<Object> oo0o0oo) {
        p047Oooooo0.o00O000o o00o000oOooOoO;
        ArrayList arrayList;
        Object obj;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o0O00O o0o00o2 = list.get(i);
            oo0O oo0o = o0o00o2.f29531OooO0OO;
            Object arrayList2 = map.get(oo0o);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(oo0o, arrayList2);
            }
            ((ArrayList) arrayList2).add(o0o00o2);
        }
        for (Map.Entry entry : map.entrySet()) {
            oo0O oo0o2 = (oo0O) entry.getKey();
            List list2 = (List) entry.getValue();
            p100o000oOoO.oo0o0O0.OooO0oO(!oo0o2.OooOO0());
            o0O0o0 o0o0o0 = new o0O0o0(oo0o2);
            o0O o0o = new o0O(oo0o2, oo0o0oo);
            oo00o oo00oVarOooO = oo0o0O0.OooO();
            p047Oooooo0.o00O000o o00o000o2 = oo00oVarOooO instanceof p047Oooooo0.o00O000o ? (p047Oooooo0.o00O000o) oo00oVarOooO : null;
            if (o00o000o2 == null || (o00o000oOooOoO = o00o000o2.OooOoO(o0o0o0, o0o)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            try {
                oo00o oo00oVarOooO2 = o00o000oOooOoO.OooO();
                try {
                    synchronized (this.f5968OooO0Oo) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            o0O00O o0o00o3 = (o0O00O) list2.get(i2);
                            ?? r15 = this.f5975OooOO0o;
                            o0OoO00O<Object> o0ooo00o2 = o0o00o3.f29529OooO00o;
                            Intrinsics.checkNotNullParameter(r15, "<this>");
                            List list3 = (List) r15.get(o0ooo00o2);
                            if (list3 != null) {
                                Object objRemoveFirst = CollectionsKt.removeFirst(list3);
                                if (list3.isEmpty()) {
                                    r15.remove(o0ooo00o2);
                                }
                                obj = objRemoveFirst;
                            } else {
                                obj = null;
                            }
                            arrayList.add(TuplesKt.to(o0o00o3, obj));
                        }
                    }
                    oo0o2.OooOO0O(arrayList);
                    Unit unit = Unit.INSTANCE;
                    o00o000oOooOoO.OooOOOo(oo00oVarOooO2);
                    OooOo00(o00o000oOooOoO);
                } catch (Throwable th) {
                    o00o000oOooOoO.OooOOOo(oo00oVarOooO2);
                    throw th;
                }
            } catch (Throwable th2) {
                OooOo00(o00o000oOooOoO);
                throw th2;
            }
        }
        return CollectionsKt.toList(map.keySet());
    }
}
