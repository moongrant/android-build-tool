package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.collect.ReportItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0094\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010U\u001a\u00020\u001cH\u0002J\u001e\u0010V\u001a\u00020\u001c2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020/0X2\u0006\u0010Y\u001a\u00020\u0010H\u0002J\b\u0010Z\u001a\u00020\u001cH\u0016Jc\u0010[\u001a\u00020\u001c2Y\u0010\u0013\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0015j\u0002`\u001d0\u0014H\u0002J\b\u0010\\\u001a\u00020\u001cH\u0016J\b\u0010]\u001a\u00020\u001cH\u0016J\b\u0010^\u001a\u00020\u001cH\u0002J \u0010_\u001a\u00020\u001c2\u0011\u0010`\u001a\r\u0012\u0004\u0012\u00020\u001c0\u001f¢\u0006\u0002\b H\u0016¢\u0006\u0002\u0010$J3\u0010a\u001a\u0002Hb\"\u0004\b\u0000\u0010b2\b\u0010c\u001a\u0004\u0018\u00010\u00012\u0006\u0010d\u001a\u00020;2\f\u0010e\u001a\b\u0012\u0004\u0012\u0002Hb0\u001fH\u0016¢\u0006\u0002\u0010fJ\b\u0010g\u001a\u00020\u001cH\u0016J\u0010\u0010h\u001a\u00020\u001c2\u0006\u0010i\u001a\u00020jH\u0016J\b\u0010k\u001a\u00020\u001cH\u0002J\b\u0010l\u001a\u00020\u001cH\u0002J\"\u0010m\u001a\u0002Hn\"\u0004\b\u0000\u0010n2\f\u0010e\u001a\b\u0012\u0004\u0012\u0002Hn0\u001fH\u0082\b¢\u0006\u0002\u0010oJK\u0010p\u001a\u0002Hn\"\u0004\b\u0000\u0010n25\u0010e\u001a1\u0012'\u0012%\u0012\u0004\u0012\u00020*\u0012\f\u0012\n\u0012\u0004\u0012\u00020/\u0018\u00010>0=¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002Hn0qH\u0082\b¢\u0006\u0002\u0010rJ$\u0010s\u001a\u00020\u001c2\u001a\u0010t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020v\u0012\u0006\u0012\u0004\u0018\u00010v0u0)H\u0016J\u001a\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020*2\b\u0010z\u001a\u0004\u0018\u00010/H\u0016J\b\u0010{\u001a\u00020\u001cH\u0016J\"\u0010|\u001a\u00020x2\u0006\u0010y\u001a\u00020*2\u0006\u0010}\u001a\u00020~2\b\u0010z\u001a\u0004\u0018\u00010/H\u0002J\u000f\u0010\u007f\u001a\u00020\u001c2\u0007\u0010\u0080\u0001\u001a\u00020;J\u0012\u0010\u0081\u0001\u001a\u00020\u001c2\u0007\u0010\u0082\u0001\u001a\u00020/H\u0002J\u0017\u0010\u0083\u0001\u001a\u00020\u00102\f\u0010W\u001a\b\u0012\u0004\u0012\u00020/0XH\u0016J\u0017\u0010\u0084\u0001\u001a\u00020\u001c2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001fH\u0016J\t\u0010\u0085\u0001\u001a\u00020\u0010H\u0016J\u0011\u0010\u0086\u0001\u001a\u00020\u001c2\u0006\u0010y\u001a\u00020*H\u0016J\u0017\u0010\u0087\u0001\u001a\u00020\u001c2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020/0XH\u0016J\u0012\u0010\u0088\u0001\u001a\u00020\u001c2\u0007\u0010\u0082\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0089\u0001\u001a\u00020\u001c2\u0007\u0010\u0082\u0001\u001a\u00020/H\u0016J\u001b\u0010\u008a\u0001\u001a\u00020\u001c2\n\u0010i\u001a\u0006\u0012\u0002\b\u000303H\u0000¢\u0006\u0003\b\u008b\u0001J\u001f\u0010\u008c\u0001\u001a\u00020\u001c2\u0006\u0010z\u001a\u00020/2\u0006\u0010y\u001a\u00020*H\u0000¢\u0006\u0003\b\u008d\u0001J!\u0010\u008e\u0001\u001a\u00020\u001c2\u0011\u0010`\u001a\r\u0012\u0004\u0012\u00020\u001c0\u001f¢\u0006\u0002\b H\u0016¢\u0006\u0002\u0010$J\u001d\u0010\u008f\u0001\u001a\u0016\u0012\u0004\u0012\u00020*\u0012\f\u0012\n\u0012\u0004\u0012\u00020/\u0018\u00010>0=H\u0002J#\u0010\u0090\u0001\u001a\u0002Hn\"\u0004\b\u0000\u0010n2\f\u0010e\u001a\b\u0012\u0004\u0012\u0002Hn0\u001fH\u0082\b¢\u0006\u0002\u0010oJ\u001b\u0010\u0091\u0001\u001a\u00020\u00102\u0006\u0010y\u001a\u00020*2\b\u0010z\u001a\u0004\u0018\u00010/H\u0002J\u0011\u0010\u0092\u0001\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020RH\u0002J\t\u0010\u0093\u0001\u001a\u00020\u001cH\u0016JE\u0010V\u001a\u0016\u0012\u0004\u0012\u00020*\u0018\u00010\fj\n\u0012\u0004\u0012\u00020*\u0018\u0001`\u000e*\u0016\u0012\u0004\u0012\u00020*\u0018\u00010\fj\n\u0012\u0004\u0012\u00020*\u0018\u0001`\u000e2\u0007\u0010\u0082\u0001\u001a\u00020/2\u0006\u0010Y\u001a\u00020\u0010H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012Ra\u0010\u0013\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0015j\u0002`\u001d0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u001c0\u001f¢\u0006\u0002\b X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001e\u0010-\u001a\u0012\u0012\u0004\u0012\u00020*0\fj\b\u0012\u0004\u0012\u00020*`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020/0)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0018\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030302X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0012R\u0014\u00107\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0012R\u0010\u00109\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010<\u001a\u0016\u0012\u0004\u0012\u00020*\u0012\f\u0012\n\u0012\u0004\u0012\u00020/\u0018\u00010>0=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0012R\u0014\u0010@\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0012R\u0011\u0010A\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0012Ra\u0010B\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u0015j\u0002`\u001d0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020*02X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020*02X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020/0)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0012\"\u0004\bJ\u0010KR\"\u0010L\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010/0Mj\n\u0012\u0006\u0012\u0004\u0018\u00010/`NX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020RX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010T¨\u0006\u0095\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "_recomposeContext", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "areChildrenComposing", "", "getAreChildrenComposing", "()Z", "changes", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "composable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "conditionalScopes", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getConditionalScopes$runtime_release", "()Ljava/util/List;", "conditionallyInvalidatedScopes", "derivedStateDependencies", "", "getDerivedStateDependencies$runtime_release", "derivedStates", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "Landroidx/compose/runtime/DerivedState;", "disposed", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges", "invalidationDelegate", "invalidationDelegateGroup", "", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "isComposing", "isDisposed", "isRoot", "lateChanges", "lock", "observations", "observationsProcessed", "observedObjects", "getObservedObjects$runtime_release", "pendingInvalidScopes", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "abandonChanges", "addPendingInvalidationsLocked", "values", "", "forgetConditionalScopes", "applyChanges", "applyChangesInLocked", "applyLateChanges", "changesApplied", "cleanUpDerivedStateObservations", "composeContent", "content", "delegateInvalidations", "R", "to", "groupIndex", ReportItem.LogTypeBlock, "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "dispose", "disposeUnusedMovableContent", "state", "Landroidx/compose/runtime/MovableContentState;", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "guardChanges", "T", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "guardInvalidationsLocked", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "insertMovableContent", "references", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "instance", "invalidateAll", "invalidateChecked", "anchor", "Landroidx/compose/runtime/Anchor;", "invalidateGroupsWithKey", "key", "invalidateScopeOfLocked", AppMeasurementSdk.ConditionalUserProperty.VALUE, "observesAnyOf", "prepareCompose", "recompose", "recomposeScopeReleased", "recordModificationsOf", "recordReadOf", "recordWriteOf", "removeDerivedStateObservation", "removeDerivedStateObservation$runtime_release", "removeObservation", "removeObservation$runtime_release", "setContent", "takeInvalidations", "trackAbandonedValues", "tryImminentInvalidation", "validateRecomposeScopeAnchors", "verifyConsistent", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 7 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 8 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 11 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 12 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1277:1\n891#1,2:1291\n1045#1,3:1293\n881#1,6:1297\n1048#1,7:1303\n893#1,4:1310\n891#1,2:1541\n1045#1,3:1543\n881#1,6:1546\n1048#1,7:1552\n893#1,4:1559\n891#1,2:1572\n1045#1,10:1574\n893#1,4:1584\n891#1,2:1666\n1045#1,10:1668\n893#1,4:1678\n891#1,2:1683\n1045#1,10:1685\n893#1,4:1695\n891#1,2:1700\n1045#1,10:1702\n893#1,4:1712\n1045#1,10:1716\n70#2:1278\n70#2:1280\n70#2:1296\n70#2:1314\n70#2:1323\n70#2:1324\n70#2:1528\n70#2:1540\n70#2:1665\n70#2:1682\n70#2:1699\n70#2:1726\n70#2:1729\n70#2:1730\n70#2:1731\n1#3:1279\n1#3:1742\n93#4,2:1281\n33#4,4:1283\n95#4,2:1287\n38#4:1289\n97#4:1290\n110#4,2:1563\n33#4,6:1565\n112#4:1571\n33#4,6:1603\n33#4,6:1745\n162#5,8:1315\n162#5,8:1588\n162#5,4:1599\n167#5,3:1609\n80#6,3:1325\n84#6:1335\n80#6,3:1343\n84#6:1353\n228#6:1366\n244#6,8:1367\n229#6:1375\n230#6:1395\n252#6,17:1396\n231#6:1413\n228#6:1414\n244#6,8:1415\n229#6:1423\n230#6:1443\n252#6,17:1444\n231#6:1461\n228#6:1462\n244#6,8:1463\n229#6:1471\n230#6:1491\n252#6,17:1492\n231#6:1509\n80#6,3:1517\n84#6:1527\n80#6,3:1529\n84#6:1539\n228#6:1616\n244#6,8:1617\n229#6:1625\n230#6:1645\n252#6,17:1646\n231#6:1663\n108#7,7:1328\n108#7,5:1338\n108#7,7:1346\n114#7:1354\n108#7,7:1357\n269#7,19:1376\n269#7,19:1424\n269#7,19:1472\n108#7,7:1520\n108#7,7:1532\n269#7,19:1626\n384#8,2:1336\n387#8:1355\n389#8:1365\n1855#9:1356\n1856#9:1364\n1271#10,7:1510\n46#11,3:1596\n50#11:1612\n46#11,3:1613\n50#11:1664\n13579#12,2:1727\n11653#12,9:1732\n13579#12:1741\n13580#12:1743\n11662#12:1744\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n584#1:1291,2\n584#1:1293,3\n587#1:1297,6\n584#1:1303,7\n584#1:1310,4\n779#1:1541,2\n779#1:1543,3\n780#1:1546,6\n779#1:1552,7\n779#1:1559,4\n793#1:1572,2\n793#1:1574,10\n793#1:1584,4\n848#1:1666,2\n848#1:1668,10\n848#1:1678,4\n857#1:1683,2\n857#1:1685,10\n857#1:1695,4\n867#1:1700,2\n867#1:1702,10\n867#1:1712,4\n892#1:1716,10\n515#1:1278\n524#1:1280\n585#1:1296\n595#1:1314\n637#1:1323\n658#1:1324\n767#1:1528\n777#1:1540\n847#1:1665\n856#1:1682\n866#1:1699\n906#1:1726\n912#1:1729\n947#1:1730\n970#1:1731\n1032#1:1742\n531#1:1281,2\n531#1:1283,4\n531#1:1287,2\n531#1:1289\n531#1:1290\n792#1:1563,2\n792#1:1565,6\n792#1:1571\n817#1:1603,6\n1033#1:1745,6\n622#1:1315,8\n801#1:1588,8\n815#1:1599,4\n815#1:1609,3\n681#1:1325,3\n681#1:1335\n706#1:1343,3\n706#1:1353\n714#1:1366\n714#1:1367,8\n714#1:1375\n714#1:1395\n714#1:1396,17\n714#1:1413\n721#1:1414\n721#1:1415,8\n721#1:1423\n721#1:1443\n721#1:1444,17\n721#1:1461\n728#1:1462\n728#1:1463,8\n728#1:1471\n728#1:1491\n728#1:1492,17\n728#1:1509\n759#1:1517,3\n759#1:1527\n772#1:1529,3\n772#1:1539\n834#1:1616\n834#1:1617,8\n834#1:1625\n834#1:1645\n834#1:1646,17\n834#1:1663\n681#1:1328,7\n700#1:1338,5\n706#1:1346,7\n700#1:1354\n706#1:1357,7\n714#1:1376,19\n721#1:1424,19\n728#1:1472,19\n759#1:1520,7\n772#1:1532,7\n834#1:1626,19\n700#1:1336,2\n700#1:1355\n700#1:1365\n700#1:1356\n700#1:1364\n730#1:1510,7\n811#1:1596,3\n811#1:1612\n832#1:1613,3\n832#1:1664\n907#1:1727,2\n1032#1:1732,9\n1032#1:1741\n1032#1:1743\n1032#1:1744\n*E\n"})
public final class CompositionImpl implements ControlledComposition, RecomposeScopeOwner {

    @Nullable
    private final CoroutineContext _recomposeContext;

    @NotNull
    private final HashSet<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;

    @NotNull
    private Function2<? super Composer, ? super Integer, Unit> composable;

    @NotNull
    private final ComposerImpl composer;

    @NotNull
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;

    @NotNull
    private final IdentityScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;

    @Nullable
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;

    @NotNull
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;

    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges;

    @NotNull
    private final Object lock;

    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observations;

    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observationsProcessed;

    @NotNull
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;

    @NotNull
    private final AtomicReference<Object> pendingModifications;

    @NotNull
    private final SlotTable slotTable;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0016\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "deactivating", "", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "forgetting", "releasing", "remembering", "sideEffects", "Lkotlin/Function0;", "", "instance", "dispatchAbandons", "dispatchRememberObservers", "dispatchSideEffects", "sideEffect", "effect", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1277:1\n46#2,5:1278\n46#2,5:1283\n46#2,3:1288\n50#2:1297\n46#2,5:1298\n46#2,3:1303\n50#2:1312\n46#2,5:1313\n33#3,6:1291\n33#3,6:1306\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1111#1:1278,5\n1122#1:1283,5\n1134#1:1288,3\n1134#1:1297\n1147#1:1298,5\n1159#1:1303,3\n1159#1:1312\n1170#1:1313,5\n1135#1:1291,6\n1160#1:1306,6\n*E\n"})
    public static final class RememberEventDispatcher implements RememberManager {

        @NotNull
        private final Set<RememberObserver> abandoning;

        @Nullable
        private List<ComposeNodeLifecycleCallback> deactivating;

        @NotNull
        private final List<RememberObserver> forgetting;

        @Nullable
        private List<ComposeNodeLifecycleCallback> releasing;

        @NotNull
        private final List<RememberObserver> remembering;

        @NotNull
        private final List<Function0<Unit>> sideEffects;

        public RememberEventDispatcher(@NotNull Set<RememberObserver> abandoning) {
            Intrinsics.checkNotNullParameter(abandoning, "abandoning");
            this.abandoning = abandoning;
            this.remembering = new ArrayList();
            this.forgetting = new ArrayList();
            this.sideEffects = new ArrayList();
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(@NotNull ComposeNodeLifecycleCallback instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            List arrayList = this.deactivating;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.deactivating = arrayList;
            }
            arrayList.add(instance);
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        RememberObserver next = it.next();
                        it.remove();
                        next.onAbandoned();
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
        }

        public final void dispatchRememberObservers() {
            List<ComposeNodeLifecycleCallback> list = this.deactivating;
            if (!(list == null || list.isEmpty())) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        list.get(size).onDeactivate();
                    }
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection);
                    list.clear();
                } catch (Throwable th) {
                    Trace.INSTANCE.endSection(objBeginSection);
                    throw th;
                }
            }
            if (!this.forgetting.isEmpty()) {
                Object objBeginSection2 = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    for (int size2 = this.forgetting.size() - 1; -1 < size2; size2--) {
                        RememberObserver rememberObserver = this.forgetting.get(size2);
                        if (!this.abandoning.contains(rememberObserver)) {
                            rememberObserver.onForgotten();
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection2);
                } catch (Throwable th2) {
                    Trace.INSTANCE.endSection(objBeginSection2);
                    throw th2;
                }
            }
            if (!this.remembering.isEmpty()) {
                Object objBeginSection3 = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    List<RememberObserver> list2 = this.remembering;
                    int size3 = list2.size();
                    for (int i = 0; i < size3; i++) {
                        RememberObserver rememberObserver2 = list2.get(i);
                        this.abandoning.remove(rememberObserver2);
                        rememberObserver2.onRemembered();
                    }
                    Unit unit3 = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection3);
                } catch (Throwable th3) {
                    Trace.INSTANCE.endSection(objBeginSection3);
                    throw th3;
                }
            }
            List<ComposeNodeLifecycleCallback> list3 = this.releasing;
            if (list3 == null || list3.isEmpty()) {
                return;
            }
            Object objBeginSection4 = Trace.INSTANCE.beginSection("Compose:releases");
            try {
                for (int size4 = list3.size() - 1; -1 < size4; size4--) {
                    list3.get(size4).onRelease();
                }
                Unit unit4 = Unit.INSTANCE;
                Trace.INSTANCE.endSection(objBeginSection4);
                list3.clear();
            } catch (Throwable th4) {
                Trace.INSTANCE.endSection(objBeginSection4);
                throw th4;
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    List<Function0<Unit>> list = this.sideEffects;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke();
                    }
                    this.sideEffects.clear();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(@NotNull RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int iLastIndexOf = this.remembering.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.forgetting.add(instance);
            } else {
                this.remembering.remove(iLastIndexOf);
                this.abandoning.remove(instance);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(@NotNull ComposeNodeLifecycleCallback instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            List arrayList = this.releasing;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.releasing = arrayList;
            }
            arrayList.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(@NotNull RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int iLastIndexOf = this.forgetting.lastIndexOf(instance);
            if (iLastIndexOf < 0) {
                this.remembering.add(instance);
            } else {
                this.forgetting.remove(iLastIndexOf);
                this.abandoning.remove(instance);
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(@NotNull Function0<Unit> effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.sideEffects.add(effect);
        }
    }

    public CompositionImpl(@NotNull CompositionContext parent, @NotNull Applier<?> applier, @Nullable CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.parent = parent;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new IdentityScopeMap<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new IdentityScopeMap<>();
        ArrayList arrayList = new ArrayList();
        this.changes = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.lateChanges = arrayList2;
        this.observationsProcessed = new IdentityScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, parent, slotTable, hashSet, arrayList, arrayList2, this);
        parent.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = parent instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m1295getLambda1$runtime_release();
    }

    private final void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    private final HashSet<RecomposeScopeImpl> addPendingInvalidationsLocked(HashSet<RecomposeScopeImpl> hashSet, Object obj, boolean z) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
        int iFind = identityScopeMap.find(obj);
        if (iFind >= 0) {
            IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
            Object[] values = identityArraySetScopeSetAt.getValues();
            int size = identityArraySetScopeSetAt.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = values[i];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
                if (!this.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                    if (!recomposeScopeImpl.isConditional() || z) {
                        if (hashSet == null) {
                            hashSet = new HashSet<>();
                        }
                        hashSet.add(recomposeScopeImpl);
                    } else {
                        this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                    }
                }
            }
        }
        return hashSet;
    }

    private final void applyChangesInLocked(List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        try {
            if (changes.isEmpty()) {
                if (this.lateChanges.isEmpty()) {
                    rememberEventDispatcher.dispatchAbandons();
                    return;
                }
                return;
            }
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:applyChanges");
            try {
                this.applier.onBeginChanges();
                SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                try {
                    Applier<?> applier = this.applier;
                    int size = changes.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        changes.get(i2).invoke(applier, slotWriterOpenWriter, rememberEventDispatcher);
                    }
                    changes.clear();
                    Unit unit = Unit.INSTANCE;
                    slotWriterOpenWriter.close();
                    this.applier.onEndChanges();
                    Trace trace = Trace.INSTANCE;
                    trace.endSection(objBeginSection);
                    rememberEventDispatcher.dispatchRememberObservers();
                    rememberEventDispatcher.dispatchSideEffects();
                    if (this.pendingInvalidScopes) {
                        Object objBeginSection2 = trace.beginSection("Compose:unobserve");
                        try {
                            this.pendingInvalidScopes = false;
                            IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
                            int[] valueOrder = identityScopeMap.getValueOrder();
                            IdentityArraySet<RecomposeScopeImpl>[] scopeSets = identityScopeMap.getScopeSets();
                            Object[] values = identityScopeMap.getValues();
                            int size2 = identityScopeMap.getSize();
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < size2) {
                                int i5 = valueOrder[i3];
                                IdentityArraySet<RecomposeScopeImpl> identityArraySet = scopeSets[i5];
                                Intrinsics.checkNotNull(identityArraySet);
                                Object[] values2 = identityArraySet.getValues();
                                int size3 = identityArraySet.size();
                                int i6 = i;
                                while (i < size3) {
                                    IdentityArraySet<RecomposeScopeImpl>[] identityArraySetArr = scopeSets;
                                    Object obj = values2[i];
                                    int i7 = size2;
                                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    if (!(!((RecomposeScopeImpl) obj).getValid())) {
                                        if (i6 != i) {
                                            values2[i6] = obj;
                                        }
                                        i6++;
                                    }
                                    i++;
                                    scopeSets = identityArraySetArr;
                                    size2 = i7;
                                }
                                IdentityArraySet<RecomposeScopeImpl>[] identityArraySetArr2 = scopeSets;
                                int i8 = size2;
                                for (int i9 = i6; i9 < size3; i9++) {
                                    values2[i9] = null;
                                }
                                ((IdentityArraySet) identityArraySet).size = i6;
                                if (identityArraySet.size() > 0) {
                                    if (i4 != i3) {
                                        int i10 = valueOrder[i4];
                                        valueOrder[i4] = i5;
                                        valueOrder[i3] = i10;
                                    }
                                    i4++;
                                }
                                i3++;
                                scopeSets = identityArraySetArr2;
                                size2 = i8;
                                i = 0;
                            }
                            int size4 = identityScopeMap.getSize();
                            for (int i11 = i4; i11 < size4; i11++) {
                                values[valueOrder[i11]] = null;
                            }
                            identityScopeMap.setSize(i4);
                            cleanUpDerivedStateObservations();
                            Unit unit2 = Unit.INSTANCE;
                            Trace.INSTANCE.endSection(objBeginSection2);
                        } catch (Throwable th) {
                            Trace.INSTANCE.endSection(objBeginSection2);
                            throw th;
                        }
                    }
                    if (this.lateChanges.isEmpty()) {
                        rememberEventDispatcher.dispatchAbandons();
                    }
                } catch (Throwable th2) {
                    slotWriterOpenWriter.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th3;
            }
        } catch (Throwable th4) {
            if (this.lateChanges.isEmpty()) {
                rememberEventDispatcher.dispatchAbandons();
            }
            throw th4;
        }
    }

    private final void cleanUpDerivedStateObservations() {
        IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
        int[] valueOrder = identityScopeMap.getValueOrder();
        IdentityArraySet<DerivedState<?>>[] scopeSets = identityScopeMap.getScopeSets();
        Object[] values = identityScopeMap.getValues();
        int size = identityScopeMap.getSize();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int i3 = valueOrder[i];
            IdentityArraySet<DerivedState<?>> identityArraySet = scopeSets[i3];
            Intrinsics.checkNotNull(identityArraySet);
            Object[] values2 = identityArraySet.getValues();
            int size2 = identityArraySet.size();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size2) {
                Object obj = values2[i4];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                IdentityArraySet<DerivedState<?>>[] identityArraySetArr = scopeSets;
                if (!(!this.observations.contains((DerivedState) obj))) {
                    if (i5 != i4) {
                        values2[i5] = obj;
                    }
                    i5++;
                }
                i4++;
                scopeSets = identityArraySetArr;
            }
            IdentityArraySet<DerivedState<?>>[] identityArraySetArr2 = scopeSets;
            for (int i6 = i5; i6 < size2; i6++) {
                values2[i6] = null;
            }
            ((IdentityArraySet) identityArraySet).size = i5;
            if (identityArraySet.size() > 0) {
                if (i2 != i) {
                    int i7 = valueOrder[i2];
                    valueOrder[i2] = i3;
                    valueOrder[i] = i7;
                }
                i2++;
            }
            i++;
            scopeSets = identityArraySetArr2;
        }
        int size3 = identityScopeMap.getSize();
        for (int i8 = i2; i8 < size3; i8++) {
            values[valueOrder[i8]] = null;
        }
        identityScopeMap.setSize(i2);
        if (!this.conditionallyInvalidatedScopes.isEmpty()) {
            Iterator<RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator()");
            while (it.hasNext()) {
                if (!it.next().isConditional()) {
                    it.remove();
                }
            }
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    private final <T> T guardChanges(Function0<? extends T> block) throws Exception {
        try {
            try {
                T tInvoke = block.invoke();
                InlineMarker.finallyStart(1);
                return tInvoke;
            } finally {
                InlineMarker.finallyStart(1);
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                InlineMarker.finallyEnd(1);
            }
        } catch (Exception e) {
            abandonChanges();
            throw e;
        }
    }

    private final <T> T guardInvalidationsLocked(Function1<? super IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>>, ? extends T> block) throws Exception {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
        try {
            return block.invoke(identityArrayMapTakeInvalidations);
        } catch (Exception e) {
            this.invalidations = identityArrayMapTakeInvalidations;
            throw e;
        }
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
        synchronized (this.lock) {
            CompositionImpl compositionImpl = this.invalidationDelegate;
            if (compositionImpl == null || !this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                compositionImpl = null;
            }
            if (compositionImpl == null) {
                if (tryImminentInvalidation(scope, instance)) {
                    return InvalidationResult.IMMINENT;
                }
                if (instance == null) {
                    this.invalidations.set(scope, null);
                } else {
                    CompositionKt.addValue(this.invalidations, scope, instance);
                }
            }
            if (compositionImpl != null) {
                return compositionImpl.invalidateChecked(scope, anchor, instance);
            }
            this.parent.invalidate$runtime_release(this);
            return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
        }
    }

    private final void invalidateScopeOfLocked(Object value) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
        int iFind = identityScopeMap.find(value);
        if (iFind >= 0) {
            IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
            Object[] values = identityArraySetScopeSetAt.getValues();
            int size = identityArraySetScopeSetAt.size();
            for (int i = 0; i < size; i++) {
                Object obj = values[i];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                if (recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(value, recomposeScopeImpl);
                }
            }
        }
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> block) {
        try {
            T tInvoke = block.invoke();
            InlineMarker.finallyStart(1);
            return tInvoke;
        } finally {
            InlineMarker.finallyStart(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            InlineMarker.finallyEnd(1);
        }
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl scope, Object instance) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, instance);
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e) {
                    abandonChanges();
                    throw e;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (!this.lateChanges.isEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e) {
                    abandonChanges();
                    throw e;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e) {
                    abandonChanges();
                    throw e;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) throws Exception {
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
                try {
                    this.composer.composeContent$runtime_release(identityArrayMapTakeInvalidations, content);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    this.invalidations = identityArrayMapTakeInvalidations;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            } catch (Exception e2) {
                abandonChanges();
                throw e2;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(@Nullable ControlledComposition to, int groupIndex, @NotNull Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (to == null || Intrinsics.areEqual(to, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (!this.disposed) {
                this.disposed = true;
                this.composable = ComposableSingletons$CompositionKt.INSTANCE.m1296getLambda2$runtime_release();
                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                if (deferredChanges$runtime_release != null) {
                    applyChangesInLocked(deferredChanges$runtime_release);
                }
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || (true ^ this.abandonSet.isEmpty())) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z) {
                        this.applier.onBeginChanges();
                        SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                        try {
                            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                            Unit unit = Unit.INSTANCE;
                            slotWriterOpenWriter.close();
                            this.applier.clear();
                            this.applier.onEndChanges();
                            rememberEventDispatcher.dispatchRememberObservers();
                        } catch (Throwable th) {
                            slotWriterOpenWriter.close();
                            throw th;
                        }
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            Unit unit2 = Unit.INSTANCE;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(@NotNull MovableContentState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter slotWriterOpenWriter = state.getSlotTable().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
            Unit unit = Unit.INSTANCE;
            slotWriterOpenWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th) {
            slotWriterOpenWriter.close();
            throw th;
        }
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    @NotNull
    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return CollectionsKt.toList(this.conditionallyInvalidatedScopes);
    }

    @NotNull
    public final List<Object> getDerivedStateDependencies$runtime_release() {
        return ArraysKt.filterNotNull(this.derivedStates.getValues());
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = this.invalidations.getSize() > 0;
        }
        return z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @NotNull
    public final List<Object> getObservedObjects$runtime_release() {
        return ArraysKt.filterNotNull(this.observations.getValues());
    }

    /* JADX INFO: renamed from: getPendingInvalidScopes$runtime_release, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    @NotNull
    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : coroutineContext;
    }

    @NotNull
    /* JADX INFO: renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) throws Exception {
        Intrinsics.checkNotNullParameter(references, "references");
        int size = references.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Intrinsics.areEqual(references.get(i).getFirst().getComposition(), this)) {
                break;
            } else {
                i++;
            }
        }
        ComposerKt.runtimeCheck(z);
        try {
            this.composer.insertMovableContentReferences(references);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            } catch (Exception e) {
                abandonChanges();
                throw e;
            }
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    @NotNull
    public InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
        CompositionImpl compositionImpl;
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (this.slotTable.ownsAnchor(anchor)) {
            return !scope.getCanRecompose() ? InvalidationResult.IGNORED : invalidateChecked(scope, anchor, instance);
        }
        synchronized (this.lock) {
            compositionImpl = this.invalidationDelegate;
        }
        return compositionImpl != null && compositionImpl.tryImminentInvalidation(scope, instance) ? InvalidationResult.IMMINENT : InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            for (Object obj : this.slotTable.getSlots()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void invalidateGroupsWithKey(int key) {
        List<RecomposeScopeImpl> listInvalidateGroupsWithKey$runtime_release;
        boolean z;
        synchronized (this.lock) {
            listInvalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(key);
        }
        boolean z2 = true;
        if (listInvalidateGroupsWithKey$runtime_release != null) {
            int size = listInvalidateGroupsWithKey$runtime_release.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                if (listInvalidateGroupsWithKey$runtime_release.get(i).invalidateForResult(null) == InvalidationResult.IGNORED) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2 && this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    /* JADX INFO: renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(@NotNull Set<? extends Object> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        for (Object obj : values) {
            if (this.observations.contains(obj) || this.derivedStates.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.composer.prepareCompose$runtime_release(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zRecompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            try {
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMapTakeInvalidations = takeInvalidations();
                try {
                    zRecompose$runtime_release = this.composer.recompose$runtime_release(identityArrayMapTakeInvalidations);
                    if (!zRecompose$runtime_release) {
                        drainPendingModificationsLocked();
                    }
                } catch (Exception e) {
                    this.invalidations = identityArrayMapTakeInvalidations;
                    throw e;
                }
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                    }
                    throw th;
                } catch (Exception e2) {
                    abandonChanges();
                    throw e2;
                }
            }
        }
        return zRecompose$runtime_release;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(@NotNull RecomposeScopeImpl scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.pendingInvalidScopes = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set<? extends Object> values) {
        Object obj;
        boolean z;
        Object objPlus;
        Intrinsics.checkNotNullParameter(values, "values");
        do {
            obj = this.pendingModifications.get();
            z = true;
            if (obj == null ? true : Intrinsics.areEqual(obj, CompositionKt.PendingApplyNoModifications)) {
                objPlus = values;
            } else if (obj instanceof Set) {
                objPlus = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objPlus = ArraysKt.plus((Set<? extends Object>[]) obj, values);
            }
            AtomicReference<Object> atomicReference = this.pendingModifications;
            while (!atomicReference.compareAndSet(obj, objPlus)) {
                if (atomicReference.get() != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(@NotNull Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        Intrinsics.checkNotNullParameter(value, "value");
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        if (currentRecomposeScope$runtime_release.recordRead(value)) {
            return;
        }
        this.observations.add(value, currentRecomposeScope$runtime_release);
        if (value instanceof DerivedState) {
            this.derivedStates.removeScope(value);
            for (Object obj : ((DerivedState) value).getCurrentRecord().getDependencies()) {
                if (obj == null) {
                    return;
                }
                this.derivedStates.add(obj, value);
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            invalidateScopeOfLocked(value);
            IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
            int iFind = identityScopeMap.find(value);
            if (iFind >= 0) {
                IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
                Object[] values = identityArraySetScopeSetAt.getValues();
                int size = identityArraySetScopeSetAt.size();
                for (int i = 0; i < size; i++) {
                    Object obj = values[i];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    invalidateScopeOfLocked((DerivedState) obj);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeDerivedStateObservation$runtime_release(@NotNull DerivedState<?> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.observations.contains(state)) {
            return;
        }
        this.derivedStates.removeScope(state);
    }

    public final void removeObservation$runtime_release(@NotNull Object instance, @NotNull RecomposeScopeImpl scope) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.observations.remove(instance, scope);
    }

    public final void setComposable(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(!this.disposed)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.pendingInvalidScopes = z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime_release();
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:50:0x0100  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    private final void addPendingInvalidationsLocked(Set<? extends Object> values, boolean forgetConditionalScopes) {
        HashSet<RecomposeScopeImpl> hashSetAddPendingInvalidationsLocked;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        if (values instanceof IdentityArraySet) {
            IdentityArraySet identityArraySet = (IdentityArraySet) values;
            Object[] values2 = identityArraySet.getValues();
            int size = identityArraySet.size();
            hashSetAddPendingInvalidationsLocked = null;
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = values2[i2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).invalidateForResult(null);
                } else {
                    hashSetAddPendingInvalidationsLocked = addPendingInvalidationsLocked(hashSetAddPendingInvalidationsLocked, obj, forgetConditionalScopes);
                    IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
                    int iFind = identityScopeMap.find(obj);
                    if (iFind >= 0) {
                        IdentityArraySet identityArraySetScopeSetAt = identityScopeMap.scopeSetAt(iFind);
                        Object[] values3 = identityArraySetScopeSetAt.getValues();
                        int size2 = identityArraySetScopeSetAt.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            Object obj2 = values3[i3];
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            hashSetAddPendingInvalidationsLocked = addPendingInvalidationsLocked(hashSetAddPendingInvalidationsLocked, (DerivedState) obj2, forgetConditionalScopes);
                        }
                    }
                }
            }
        } else {
            hashSetAddPendingInvalidationsLocked = null;
            for (Object obj3 : values) {
                if (obj3 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj3).invalidateForResult(null);
                } else {
                    HashSet<RecomposeScopeImpl> hashSetAddPendingInvalidationsLocked2 = addPendingInvalidationsLocked(hashSetAddPendingInvalidationsLocked, obj3, forgetConditionalScopes);
                    IdentityScopeMap<DerivedState<?>> identityScopeMap2 = this.derivedStates;
                    int iFind2 = identityScopeMap2.find(obj3);
                    if (iFind2 >= 0) {
                        IdentityArraySet identityArraySetScopeSetAt2 = identityScopeMap2.scopeSetAt(iFind2);
                        Object[] values4 = identityArraySetScopeSetAt2.getValues();
                        int size3 = identityArraySetScopeSetAt2.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            Object obj4 = values4[i4];
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            hashSetAddPendingInvalidationsLocked2 = addPendingInvalidationsLocked(hashSetAddPendingInvalidationsLocked2, (DerivedState) obj4, forgetConditionalScopes);
                        }
                    }
                    hashSetAddPendingInvalidationsLocked = hashSetAddPendingInvalidationsLocked2;
                }
            }
        }
        if (forgetConditionalScopes) {
            boolean z4 = true;
            if (!this.conditionallyInvalidatedScopes.isEmpty()) {
                IdentityScopeMap<RecomposeScopeImpl> identityScopeMap3 = this.observations;
                int[] valueOrder = identityScopeMap3.getValueOrder();
                IdentityArraySet<RecomposeScopeImpl>[] scopeSets = identityScopeMap3.getScopeSets();
                Object[] values5 = identityScopeMap3.getValues();
                int size4 = identityScopeMap3.getSize();
                int i5 = 0;
                int i6 = 0;
                while (i5 < size4) {
                    int i7 = valueOrder[i5];
                    IdentityArraySet<RecomposeScopeImpl> identityArraySet2 = scopeSets[i7];
                    Intrinsics.checkNotNull(identityArraySet2);
                    Object[] values6 = identityArraySet2.getValues();
                    int size5 = identityArraySet2.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < size5) {
                        Object obj5 = values6[i8];
                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        IdentityArraySet<RecomposeScopeImpl>[] identityArraySetArr = scopeSets;
                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj5;
                        int i10 = size4;
                        if (this.conditionallyInvalidatedScopes.contains(recomposeScopeImpl)) {
                            z = true;
                        } else {
                            if (hashSetAddPendingInvalidationsLocked != null) {
                                z = true;
                                z3 = hashSetAddPendingInvalidationsLocked.contains(recomposeScopeImpl);
                                if (z3) {
                                    z2 = false;
                                }
                                if (!z2) {
                                    i = i9;
                                    if (i != i8) {
                                        values6[i] = obj5;
                                    }
                                    i9 = i + 1;
                                }
                                i8++;
                                scopeSets = identityArraySetArr;
                                z4 = z;
                                size4 = i10;
                            } else {
                                z = true;
                            }
                            if (z3) {
                                z2 = false;
                            }
                            if (!z2) {
                                i = i9;
                                if (i != i8) {
                                    values6[i] = obj5;
                                }
                                i9 = i + 1;
                            }
                            i8++;
                            scopeSets = identityArraySetArr;
                            z4 = z;
                            size4 = i10;
                        }
                        z2 = z;
                        if (!z2) {
                            i = i9;
                            if (i != i8) {
                                values6[i] = obj5;
                            }
                            i9 = i + 1;
                        }
                        i8++;
                        scopeSets = identityArraySetArr;
                        z4 = z;
                        size4 = i10;
                    }
                    IdentityArraySet<RecomposeScopeImpl>[] identityArraySetArr2 = scopeSets;
                    int i11 = size4;
                    int i12 = i9;
                    boolean z5 = z4;
                    for (int i13 = i12; i13 < size5; i13++) {
                        values6[i13] = null;
                    }
                    ((IdentityArraySet) identityArraySet2).size = i12;
                    if (identityArraySet2.size() > 0) {
                        if (i6 != i5) {
                            int i14 = valueOrder[i6];
                            valueOrder[i6] = i7;
                            valueOrder[i5] = i14;
                        }
                        i6++;
                    }
                    i5++;
                    scopeSets = identityArraySetArr2;
                    z4 = z5;
                    size4 = i11;
                }
                int size6 = identityScopeMap3.getSize();
                for (int i15 = i6; i15 < size6; i15++) {
                    values5[valueOrder[i15]] = null;
                }
                identityScopeMap3.setSize(i6);
                this.conditionallyInvalidatedScopes.clear();
                cleanUpDerivedStateObservations();
                return;
            }
        }
        if (hashSetAddPendingInvalidationsLocked != null) {
            IdentityScopeMap<RecomposeScopeImpl> identityScopeMap4 = this.observations;
            int[] valueOrder2 = identityScopeMap4.getValueOrder();
            IdentityArraySet<RecomposeScopeImpl>[] scopeSets2 = identityScopeMap4.getScopeSets();
            Object[] values7 = identityScopeMap4.getValues();
            int size7 = identityScopeMap4.getSize();
            int i16 = 0;
            int i17 = 0;
            while (i16 < size7) {
                int i18 = valueOrder2[i16];
                IdentityArraySet<RecomposeScopeImpl> identityArraySet3 = scopeSets2[i18];
                Intrinsics.checkNotNull(identityArraySet3);
                Object[] values8 = identityArraySet3.getValues();
                int size8 = identityArraySet3.size();
                int i19 = 0;
                int i20 = 0;
                while (i19 < size8) {
                    Object obj6 = values8[i19];
                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    IdentityArraySet<RecomposeScopeImpl>[] identityArraySetArr3 = scopeSets2;
                    if (!hashSetAddPendingInvalidationsLocked.contains((RecomposeScopeImpl) obj6)) {
                        if (i20 != i19) {
                            values8[i20] = obj6;
                        }
                        i20++;
                    }
                    i19++;
                    scopeSets2 = identityArraySetArr3;
                }
                IdentityArraySet<RecomposeScopeImpl>[] identityArraySetArr4 = scopeSets2;
                for (int i21 = i20; i21 < size8; i21++) {
                    values8[i21] = null;
                }
                ((IdentityArraySet) identityArraySet3).size = i20;
                if (identityArraySet3.size() > 0) {
                    if (i17 != i16) {
                        int i22 = valueOrder2[i17];
                        valueOrder2[i17] = i18;
                        valueOrder2[i16] = i22;
                    }
                    i17++;
                }
                i16++;
                scopeSets2 = identityArraySetArr4;
            }
            int size9 = identityScopeMap4.getSize();
            for (int i23 = i17; i23 < size9; i23++) {
                values7[valueOrder2[i23]] = null;
            }
            identityScopeMap4.setSize(i17);
            cleanUpDerivedStateObservations();
        }
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }
}
