package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.collect.ReportItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u00014B.\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\tJ\u0016\u0010\u001b\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0002J\u0006\u0010\u001d\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0001J)\u0010\u001f\u001a\u00020\u00052!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00130\u0003J\b\u0010!\u001a\u00020\u0013H\u0002J&\u0010\"\u001a\u00020\u0011\"\b\b\u0000\u0010#*\u00020\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u001d\u0010%\u001a\u00020\u00052\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bJ\u001c\u0010'\u001a\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010)\u001a\u00020\rJ?\u0010*\u001a\u00020\u0005\"\b\b\u0000\u0010#*\u00020\u00012\u0006\u0010\u001e\u001a\u0002H#2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010,J\u0010\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0002J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u0005H\u0002J\u0006\u00101\u001a\u00020\u0005J\u0006\u00102\u001a\u00020\u0005J\u0016\u00103\u001a\u00020\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R&\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "(Lkotlin/jvm/functions/Function1;)V", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "isPaused", "", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "readObserver", "sendingNotifications", "addChanges", "set", "clear", "scope", "clearIf", "predicate", "drainChanges", "ensureMap", "T", "onChanged", "forEachScopeMap", ReportItem.LogTypeBlock, "notifyChanges", "changes", "snapshot", "observeReads", "onValueChangedForScope", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "removeChanges", "report", "", "sendNotifications", "start", "stop", "withNoObservations", "ObservedScopeMap", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,610:1\n182#1,2:615\n184#1,2:628\n182#1,2:641\n184#1,2:654\n182#1,2:656\n184#1,2:669\n182#1,2:671\n184#1,2:684\n1182#2:611\n1161#2,2:612\n1#3:614\n460#4,11:617\n460#4,11:630\n460#4,11:643\n460#4,11:658\n460#4,11:673\n366#4,12:686\n728#4,2:698\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n66#1:615,2\n66#1:628,2\n263#1:641,2\n263#1:654,2\n273#1:656,2\n273#1:669,2\n305#1:671,2\n305#1:684,2\n174#1:611\n174#1:612,2\n66#1:617,11\n183#1:630,11\n263#1:643,11\n273#1:658,11\n305#1:673,11\n318#1:686,12\n321#1:698,2\n*E\n"})
public final class SnapshotStateObserver {
    public static final int $stable = 8;

    @NotNull
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver;

    @Nullable
    private ObserverHandle applyUnsubscribe;

    @Nullable
    private ObservedScopeMap currentMap;
    private boolean isPaused;

    @NotNull
    private final MutableVector<ObservedScopeMap> observedScopeMaps;

    @NotNull
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;

    @NotNull
    private final AtomicReference<Object> pendingChanges;

    @NotNull
    private final Function1<Object, Unit> readObserver;
    private boolean sendingNotifications;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@NotNull Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.onChangedExecutor = onChangedExecutor;
        this.pendingChanges = new AtomicReference<>(null);
        this.applyObserver = new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
                invoke2(set, snapshot);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Set<? extends Object> applied, @NotNull Snapshot snapshot) {
                Intrinsics.checkNotNullParameter(applied, "applied");
                Intrinsics.checkNotNullParameter(snapshot, "<anonymous parameter 1>");
                this.this$0.addChanges(applied);
                if (this.this$0.drainChanges()) {
                    this.this$0.sendNotifications();
                }
            }
        };
        this.readObserver = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object state) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (this.this$0.isPaused) {
                    return;
                }
                MutableVector mutableVector = this.this$0.observedScopeMaps;
                SnapshotStateObserver snapshotStateObserver = this.this$0;
                synchronized (mutableVector) {
                    SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                    Intrinsics.checkNotNull(observedScopeMap);
                    observedScopeMap.recordRead(state);
                    Unit unit = Unit.INSTANCE;
                }
            }
        };
        this.observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        boolean z;
        Set<? extends Object> setPlus;
        do {
            Object obj = this.pendingChanges.get();
            z = true;
            if (obj == null) {
                setPlus = set;
            } else if (obj instanceof Set) {
                setPlus = CollectionsKt.listOf((Object[]) new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                setPlus = CollectionsKt.plus((Collection) obj, (Iterable) CollectionsKt.listOf(set));
            }
            AtomicReference<Object> atomicReference = this.pendingChanges;
            while (!atomicReference.compareAndSet(obj, setPlus)) {
                if (atomicReference.get() != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMaps) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> setRemoveChanges = removeChanges();
            if (setRemoveChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMaps) {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        z2 = content[i].recordInvalidation(setRemoveChanges) || z2;
                        i++;
                    } while (i < size);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(Function1<? super T, Unit> onChanged) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        int size = mutableVector.getSize();
        if (size <= 0) {
            observedScopeMap = null;
            break;
        }
        ObservedScopeMap[] content = mutableVector.getContent();
        int i = 0;
        while (true) {
            observedScopeMap = content[i];
            if (observedScopeMap.getOnChanged() == onChanged) {
                break;
            }
            i++;
            if (i >= size) {
                observedScopeMap = null;
                break;
            }
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        Intrinsics.checkNotNull(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onChanged, 1));
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    private final void forEachScopeMap(Function1<? super ObservedScopeMap, Unit> block) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i = 0;
                    do {
                        block.invoke(content[i]);
                        i++;
                    } while (i < size);
                }
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } finally {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
            }
        }
    }

    private final Set<Object> removeChanges() {
        boolean z;
        Set<Object> set;
        do {
            Object obj = this.pendingChanges.get();
            Object objSubList = null;
            if (obj == null) {
                return null;
            }
            z = false;
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
            AtomicReference<Object> atomicReference = this.pendingChanges;
            do {
                if (atomicReference.compareAndSet(obj, objSubList)) {
                    z = true;
                    break;
                }
            } while (atomicReference.get() == obj);
        } while (!z);
        return set;
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver.sendNotifications.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                do {
                    MutableVector mutableVector = SnapshotStateObserver.this.observedScopeMaps;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (mutableVector) {
                        if (!snapshotStateObserver.sendingNotifications) {
                            snapshotStateObserver.sendingNotifications = true;
                            try {
                                MutableVector mutableVector2 = snapshotStateObserver.observedScopeMaps;
                                int size = mutableVector2.getSize();
                                if (size > 0) {
                                    Object[] content = mutableVector2.getContent();
                                    int i = 0;
                                    do {
                                        ((ObservedScopeMap) content[i]).notifyInvalidatedScopes();
                                        i++;
                                    } while (i < size);
                                }
                                snapshotStateObserver.sendingNotifications = false;
                            } catch (Throwable th) {
                                snapshotStateObserver.sendingNotifications = false;
                                throw th;
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } while (SnapshotStateObserver.this.drainChanges());
            }
        });
    }

    public final void clear(@NotNull Object scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ObservedScopeMap[] content = mutableVector.getContent();
                int i = 0;
                do {
                    content[i].clearScopeObservations(scope);
                    i++;
                } while (i < size);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clearIf(@NotNull Function1<Object, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ObservedScopeMap[] content = mutableVector.getContent();
                int i = 0;
                do {
                    content[i].removeScopeIf(predicate);
                    i++;
                } while (i < size);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void notifyChanges(@NotNull Set<? extends Object> changes, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.applyObserver.invoke(changes, snapshot);
    }

    public final <T> void observeReads(@NotNull T scope, @NotNull Function1<? super T, Unit> onValueChangedForScope, @NotNull Function0<Unit> block) {
        ObservedScopeMap observedScopeMapEnsureMap;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onValueChangedForScope, "onValueChangedForScope");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.observedScopeMaps) {
            observedScopeMapEnsureMap = ensureMap(onValueChangedForScope);
        }
        boolean z = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        try {
            this.isPaused = false;
            this.currentMap = observedScopeMapEnsureMap;
            observedScopeMapEnsureMap.observe(scope, this.readObserver, block);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    @Deprecated(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void withNoObservations(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z;
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001f\u001a\u00020\u0004J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0001H\u0002J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0001J\u0006\u0010#\u001a\u00020\u0004J0\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040'J\u0014\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010+J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0001J(\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\bH\u0002J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u0001H\u0002J)\u00100\u001a\u00020\u00042!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020)0\u0003J\u0012\u00104\u001a\u00020\u00042\n\u00105\u001a\u0006\u0012\u0002\b\u00030\rR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R6\u0010\u0017\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "onChanged", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "currentScope", "currentScopeReads", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "currentToken", "", "dependencyToDerivedStates", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "Landroidx/compose/runtime/DerivedState;", "deriveStateScopeCount", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "invalidated", "Landroidx/compose/runtime/collection/IdentityArraySet;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "scopeToValues", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "valueToScopes", "clear", "clearObsoleteStateReads", "scope", "clearScopeObservations", "notifyInvalidatedScopes", "observe", "readObserver", ReportItem.LogTypeBlock, "Lkotlin/Function0;", "recordInvalidation", "", "changes", "", "recordRead", AppMeasurementSdk.ConditionalUserProperty.VALUE, "recordedValues", "removeObservation", "removeScopeIf", "predicate", "Lkotlin/ParameterName;", "name", "rereadDerivedState", "derivedState", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n+ 6 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 7 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 8 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 9 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,610:1\n1182#2:611\n1161#2,2:612\n377#3,6:614\n383#3,2:621\n48#4:620\n460#4,11:756\n137#5,22:623\n172#5,8:645\n172#5,8:660\n125#6,7:653\n132#6,15:668\n384#7,2:683\n387#7:723\n389#7:755\n108#8,5:685\n108#8,5:693\n108#8,7:701\n114#8:709\n108#8,7:714\n114#8:722\n108#8,5:725\n108#8,7:733\n114#8:741\n108#8,7:746\n108#8,7:770\n108#8,7:778\n80#9,3:690\n80#9,3:698\n84#9:708\n84#9:710\n80#9,3:711\n84#9:721\n80#9,3:730\n84#9:740\n84#9:742\n80#9,3:743\n84#9:753\n80#9,3:767\n84#9:777\n1855#10:724\n1856#10:754\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n368#1:611\n368#1:612,2\n466#1:614,6\n466#1:621,2\n466#1:620\n575#1:756,11\n479#1:623,22\n493#1:645,8\n505#1:660,8\n502#1:653,7\n502#1:668,15\n543#1:683,2\n543#1:723\n543#1:755\n543#1:685,5\n546#1:693,5\n557#1:701,7\n546#1:709\n568#1:714,7\n543#1:722\n546#1:725,5\n557#1:733,7\n546#1:741\n568#1:746,7\n588#1:770,7\n605#1:778,7\n546#1:690,3\n557#1:698,3\n557#1:708\n546#1:710\n568#1:711,3\n568#1:721\n557#1:730,3\n557#1:740\n546#1:742\n568#1:743,3\n568#1:753\n588#1:767,3\n588#1:777\n543#1:724\n543#1:754\n*E\n"})
    public static final class ObservedScopeMap {

        @Nullable
        private Object currentScope;

        @Nullable
        private IdentityArrayIntMap currentScopeReads;
        private int currentToken;

        @NotNull
        private final IdentityScopeMap<DerivedState<?>> dependencyToDerivedStates;
        private int deriveStateScopeCount;

        @NotNull
        private final DerivedStateObserver derivedStateObserver;

        @NotNull
        private final IdentityArraySet<Object> invalidated;

        @NotNull
        private final Function1<Object, Unit> onChanged;

        @NotNull
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues;

        @NotNull
        private final IdentityArrayMap<Object, IdentityArrayIntMap> scopeToValues;

        @NotNull
        private final MutableVector<DerivedState<?>> statesToReread;

        @NotNull
        private final IdentityScopeMap<Object> valueToScopes;

        public ObservedScopeMap(@NotNull Function1<Object, Unit> onChanged) {
            Intrinsics.checkNotNullParameter(onChanged, "onChanged");
            this.onChanged = onChanged;
            this.currentToken = -1;
            this.valueToScopes = new IdentityScopeMap<>();
            this.scopeToValues = new IdentityArrayMap<>(0, 1, null);
            this.invalidated = new IdentityArraySet<>();
            this.statesToReread = new MutableVector<>(new DerivedState[16], 0);
            this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
                @Override // androidx.compose.runtime.DerivedStateObserver
                public void done(@NotNull DerivedState<?> derivedState) {
                    Intrinsics.checkNotNullParameter(derivedState, "derivedState");
                    this.this$0.deriveStateScopeCount--;
                }

                @Override // androidx.compose.runtime.DerivedStateObserver
                public void start(@NotNull DerivedState<?> derivedState) {
                    Intrinsics.checkNotNullParameter(derivedState, "derivedState");
                    this.this$0.deriveStateScopeCount++;
                }
            };
            this.dependencyToDerivedStates = new IdentityScopeMap<>();
            this.recordedDerivedStateValues = new HashMap<>();
        }

        private final void clearObsoleteStateReads(Object scope) {
            int i = this.currentToken;
            IdentityArrayIntMap identityArrayIntMap = this.currentScopeReads;
            if (identityArrayIntMap != null) {
                Object[] keys = identityArrayIntMap.getKeys();
                int[] values = identityArrayIntMap.getValues();
                int size = identityArrayIntMap.getSize();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj = keys[i3];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i4 = values[i3];
                    boolean z = i4 != i;
                    if (z) {
                        removeObservation(scope, obj);
                    }
                    if (!z) {
                        if (i2 != i3) {
                            keys[i2] = obj;
                            values[i2] = i4;
                        }
                        i2++;
                    }
                }
                for (int i5 = i2; i5 < size; i5++) {
                    keys[i5] = null;
                }
                identityArrayIntMap.size = i2;
            }
        }

        private final void removeObservation(Object scope, Object value) {
            this.valueToScopes.remove(value, scope);
            if (!(value instanceof DerivedState) || this.valueToScopes.contains(value)) {
                return;
            }
            this.dependencyToDerivedStates.removeScope(value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.clear();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(@NotNull Object scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            IdentityArrayIntMap identityArrayIntMapRemove = this.scopeToValues.remove(scope);
            if (identityArrayIntMapRemove == null) {
                return;
            }
            Object[] keys = identityArrayIntMapRemove.getKeys();
            int[] values = identityArrayIntMapRemove.getValues();
            int size = identityArrayIntMapRemove.getSize();
            for (int i = 0; i < size; i++) {
                Object obj = keys[i];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                int i2 = values[i];
                removeObservation(scope, obj);
            }
        }

        @NotNull
        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        @NotNull
        public final Function1<Object, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final void notifyInvalidatedScopes() {
            IdentityArraySet<Object> identityArraySet = this.invalidated;
            Function1<Object, Unit> function1 = this.onChanged;
            Object[] values = identityArraySet.getValues();
            int size = identityArraySet.size();
            for (int i = 0; i < size; i++) {
                Object obj = values[i];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                function1.invoke(obj);
            }
            identityArraySet.clear();
        }

        public final void observe(@NotNull Object scope, @NotNull Function1<Object, Unit> readObserver, @NotNull Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(readObserver, "readObserver");
            Intrinsics.checkNotNullParameter(block, "block");
            Object obj = this.currentScope;
            IdentityArrayIntMap identityArrayIntMap = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.get(scope);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                mutableVectorDerivedStateObservers.add(derivedStateObserver);
                Snapshot.INSTANCE.observe(readObserver, null, block);
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                Object obj2 = this.currentScope;
                Intrinsics.checkNotNull(obj2);
                clearObsoleteStateReads(obj2);
                this.currentScope = obj;
                this.currentScopeReads = identityArrayIntMap;
                this.currentToken = i;
            } catch (Throwable th) {
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        public final boolean recordInvalidation(@NotNull Set<? extends Object> changes) {
            boolean z;
            int iFind;
            int i;
            Object[] objArr;
            int iFind2;
            Intrinsics.checkNotNullParameter(changes, "changes");
            IdentityScopeMap<DerivedState<?>> identityScopeMap = this.dependencyToDerivedStates;
            HashMap<DerivedState<?>, Object> map = this.recordedDerivedStateValues;
            IdentityScopeMap<Object> identityScopeMap2 = this.valueToScopes;
            IdentityArraySet<Object> identityArraySet = this.invalidated;
            if (changes instanceof IdentityArraySet) {
                IdentityArraySet identityArraySet2 = (IdentityArraySet) changes;
                Object[] values = identityArraySet2.getValues();
                int size = identityArraySet2.size();
                int i2 = 0;
                z = false;
                while (i2 < size) {
                    Object obj = values[i2];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (!identityScopeMap.contains(obj) || (iFind2 = identityScopeMap.find(obj)) < 0) {
                        i = size;
                        objArr = values;
                    } else {
                        IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind2);
                        Object[] values2 = identityArraySetScopeSetAt.getValues();
                        int size2 = identityArraySetScopeSetAt.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = values2[i3];
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            DerivedState<?> derivedState = (DerivedState) obj2;
                            Intrinsics.checkNotNull(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                            int i4 = size;
                            Object obj3 = map.get(derivedState);
                            SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                            if (policy == null) {
                                policy = SnapshotStateKt.structuralEqualityPolicy();
                            }
                            Object[] objArr2 = values;
                            boolean z2 = z;
                            if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), obj3)) {
                                this.statesToReread.add(derivedState);
                            } else {
                                int iFind3 = identityScopeMap2.find(derivedState);
                                if (iFind3 >= 0) {
                                    IdentityArraySet identityArraySetScopeSetAt2 = identityScopeMap2.scopeSetAt(iFind3);
                                    Object[] values3 = identityArraySetScopeSetAt2.getValues();
                                    int size3 = identityArraySetScopeSetAt2.size();
                                    z = z2;
                                    int i5 = 0;
                                    while (i5 < size3) {
                                        Object obj4 = values3[i5];
                                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        identityArraySet.add(obj4);
                                        i5++;
                                        z = true;
                                    }
                                }
                                i3++;
                                size = i4;
                                values = objArr2;
                            }
                            z = z2;
                            i3++;
                            size = i4;
                            values = objArr2;
                        }
                        i = size;
                        objArr = values;
                    }
                    int iFind4 = identityScopeMap2.find(obj);
                    if (iFind4 >= 0) {
                        IdentityArraySet identityArraySetScopeSetAt3 = identityScopeMap2.scopeSetAt(iFind4);
                        Object[] values4 = identityArraySetScopeSetAt3.getValues();
                        int size4 = identityArraySetScopeSetAt3.size();
                        int i6 = 0;
                        while (i6 < size4) {
                            Object obj5 = values4[i6];
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            identityArraySet.add(obj5);
                            i6++;
                            z = true;
                        }
                    }
                    i2++;
                    size = i;
                    values = objArr;
                }
            } else {
                Iterator it = changes.iterator();
                z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (identityScopeMap.contains(next) && (iFind = identityScopeMap.find(next)) >= 0) {
                        IdentityArraySet identityArraySetScopeSetAt4 = identityScopeMap.scopeSetAt(iFind);
                        Object[] values5 = identityArraySetScopeSetAt4.getValues();
                        int size5 = identityArraySetScopeSetAt4.size();
                        int i7 = 0;
                        while (i7 < size5) {
                            Object obj6 = values5[i7];
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            DerivedState<?> derivedState2 = (DerivedState) obj6;
                            Intrinsics.checkNotNull(derivedState2, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                            Object obj7 = map.get(derivedState2);
                            SnapshotMutationPolicy<?> policy2 = derivedState2.getPolicy();
                            if (policy2 == null) {
                                policy2 = SnapshotStateKt.structuralEqualityPolicy();
                            }
                            Iterator it2 = it;
                            if (policy2.equivalent(derivedState2.getCurrentRecord().getCurrentValue(), obj7)) {
                                this.statesToReread.add(derivedState2);
                            } else {
                                int iFind5 = identityScopeMap2.find(derivedState2);
                                if (iFind5 >= 0) {
                                    IdentityArraySet identityArraySetScopeSetAt5 = identityScopeMap2.scopeSetAt(iFind5);
                                    Object[] values6 = identityArraySetScopeSetAt5.getValues();
                                    int size6 = identityArraySetScopeSetAt5.size();
                                    int i8 = 0;
                                    while (i8 < size6) {
                                        Object obj8 = values6[i8];
                                        Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        identityArraySet.add(obj8);
                                        i8++;
                                        z = true;
                                    }
                                }
                            }
                            i7++;
                            it = it2;
                        }
                    }
                    Iterator it3 = it;
                    int iFind6 = identityScopeMap2.find(next);
                    if (iFind6 >= 0) {
                        IdentityArraySet identityArraySetScopeSetAt6 = identityScopeMap2.scopeSetAt(iFind6);
                        Object[] values7 = identityArraySetScopeSetAt6.getValues();
                        int size7 = identityArraySetScopeSetAt6.size();
                        int i9 = 0;
                        while (i9 < size7) {
                            Object obj9 = values7[i9];
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            identityArraySet.add(obj9);
                            i9++;
                            z = true;
                        }
                    }
                    it = it3;
                }
            }
            if (this.statesToReread.isNotEmpty()) {
                MutableVector<DerivedState<?>> mutableVector = this.statesToReread;
                int size8 = mutableVector.getSize();
                if (size8 > 0) {
                    DerivedState<?>[] content = mutableVector.getContent();
                    int i10 = 0;
                    do {
                        rereadDerivedState(content[i10]);
                        i10++;
                    } while (i10 < size8);
                }
                this.statesToReread.clear();
            }
            return z;
        }

        public final void recordRead(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Object obj = this.currentScope;
            Intrinsics.checkNotNull(obj);
            int i = this.currentToken;
            IdentityArrayIntMap identityArrayIntMap = this.currentScopeReads;
            if (identityArrayIntMap == null) {
                identityArrayIntMap = new IdentityArrayIntMap();
                this.currentScopeReads = identityArrayIntMap;
                this.scopeToValues.set(obj, identityArrayIntMap);
                Unit unit = Unit.INSTANCE;
            }
            recordRead(value, i, obj, identityArrayIntMap);
        }

        public final void removeScopeIf(@NotNull Function1<Object, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            IdentityArrayMap<Object, IdentityArrayIntMap> identityArrayMap = this.scopeToValues;
            int size = identityArrayMap.getSize();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = identityArrayMap.getKeys()[i2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                IdentityArrayIntMap identityArrayIntMap = (IdentityArrayIntMap) identityArrayMap.getValues()[i2];
                Boolean boolInvoke = predicate.invoke(obj);
                if (boolInvoke.booleanValue()) {
                    Object[] keys = identityArrayIntMap.getKeys();
                    int[] values = identityArrayIntMap.getValues();
                    int size2 = identityArrayIntMap.getSize();
                    for (int i3 = 0; i3 < size2; i3++) {
                        Object obj2 = keys[i3];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i4 = values[i3];
                        removeObservation(obj, obj2);
                    }
                }
                if (!boolInvoke.booleanValue()) {
                    if (i != i2) {
                        identityArrayMap.getKeys()[i] = obj;
                        identityArrayMap.getValues()[i] = identityArrayMap.getValues()[i2];
                    }
                    i++;
                }
            }
            if (identityArrayMap.getSize() > i) {
                int size3 = identityArrayMap.getSize();
                for (int i5 = i; i5 < size3; i5++) {
                    identityArrayMap.getKeys()[i5] = null;
                    identityArrayMap.getValues()[i5] = null;
                }
                ((IdentityArrayMap) identityArrayMap).size = i;
            }
        }

        public final void rereadDerivedState(@NotNull DerivedState<?> derivedState) {
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            IdentityArrayMap<Object, IdentityArrayIntMap> identityArrayMap = this.scopeToValues;
            int id = SnapshotKt.currentSnapshot().getId();
            IdentityScopeMap<Object> identityScopeMap = this.valueToScopes;
            int iFind = identityScopeMap.find(derivedState);
            if (iFind >= 0) {
                IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
                Object[] values = identityArraySetScopeSetAt.getValues();
                int size = identityArraySetScopeSetAt.size();
                for (int i = 0; i < size; i++) {
                    Object obj = values[i];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    IdentityArrayIntMap identityArrayIntMap = identityArrayMap.get(obj);
                    if (identityArrayIntMap == null) {
                        identityArrayIntMap = new IdentityArrayIntMap();
                        identityArrayMap.set(obj, identityArrayIntMap);
                        Unit unit = Unit.INSTANCE;
                    }
                    recordRead(derivedState, id, obj, identityArrayIntMap);
                }
            }
        }

        private final void recordRead(Object value, int currentToken, Object currentScope, IdentityArrayIntMap recordedValues) {
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int iAdd = recordedValues.add(value, currentToken);
            if ((value instanceof DerivedState) && iAdd != currentToken) {
                DerivedState.Record currentRecord = ((DerivedState) value).getCurrentRecord();
                this.recordedDerivedStateValues.put(value, currentRecord.getCurrentValue());
                Object[] dependencies = currentRecord.getDependencies();
                IdentityScopeMap<DerivedState<?>> identityScopeMap = this.dependencyToDerivedStates;
                identityScopeMap.removeScope(value);
                for (Object obj : dependencies) {
                    if (obj == null) {
                        break;
                    }
                    identityScopeMap.add(obj, value);
                }
            }
            if (iAdd == -1) {
                this.valueToScopes.add(value, currentScope);
            }
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ObservedScopeMap[] content = mutableVector.getContent();
                int i = 0;
                do {
                    content[i].clear();
                    i++;
                } while (i < size);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
