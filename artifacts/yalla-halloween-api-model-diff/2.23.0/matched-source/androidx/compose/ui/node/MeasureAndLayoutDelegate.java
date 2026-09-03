package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.qiniu.android.collect.ReportItem;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001:\u0001IB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\bJ%\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b,J%\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u001dH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b.J\u0016\u0010/\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00032\u0006\u00100\u001a\u00020\bJ\u0018\u00101\u001a\u00020\b2\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020&\u0018\u000103J#\u00101\u001a\u00020&2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u001dø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0006\u00106\u001a\u00020&J\u000e\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020\u0003J\u0017\u00109\u001a\u00020&2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020&03H\u0082\bJ\u0010\u0010;\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0003H\u0002J\u000e\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020\u0015J\u001a\u0010>\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\bH\u0002J\u0010\u0010?\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0003H\u0002J\u0018\u0010@\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\bJ\u0018\u0010B\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\bJ\u000e\u0010C\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0003J\u0018\u0010D\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\bJ\u0018\u0010E\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\bJ\u001b\u0010F\u001a\u00020&2\u0006\u0010+\u001a\u00020\u001dø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0018\u0010#\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "consistencyChecker", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "duringMeasureLayout", "", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "hasPendingOnPositionedCallbacks", "getHasPendingOnPositionedCallbacks", "<set-?>", "", "measureIteration", "getMeasureIteration", "()J", "onLayoutCompletedListeners", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "onPositionedDispatcher", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "postponedMeasureRequests", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "rootConstraints", "Landroidx/compose/ui/unit/Constraints;", "canAffectParent", "getCanAffectParent", "(Landroidx/compose/ui/node/LayoutNode;)Z", "canAffectParentInLookahead", "getCanAffectParentInLookahead", "measureAffectsParent", "getMeasureAffectsParent", "callOnLayoutCompletedListeners", "", "dispatchOnPositionedCallbacks", "forceDispatch", "doLookaheadRemeasure", "layoutNode", "constraints", "doLookaheadRemeasure-sdFAvZA", "doRemeasure", "doRemeasure-sdFAvZA", "forceMeasureTheSubtree", "affectsLookahead", "measureAndLayout", "onLayout", "Lkotlin/Function0;", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "measureOnly", "onNodeDetached", "node", "performMeasureAndLayout", ReportItem.LogTypeBlock, "recurseRemeasure", "registerOnLayoutCompletedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "remeasureAndRelayoutIfNeeded", "remeasureOnly", "requestLookaheadRelayout", "forced", "requestLookaheadRemeasure", "requestOnPositionedCallback", "requestRelayout", "requestRemeasure", "updateRootConstraints", "updateRootConstraints-BRTryo0", "(J)V", "PostponedRequest", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMeasureAndLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 4 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 5 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,592:1\n404#1,8:599\n413#1,5:614\n404#1,14:619\n404#1,14:645\n1182#2:593\n1161#2,2:594\n1182#2:596\n1161#2,2:597\n175#3,2:607\n177#3,4:610\n100#4:609\n197#5:633\n197#5:683\n460#6,11:634\n728#6,2:659\n460#6,11:661\n460#6,11:672\n460#6,11:684\n*S KotlinDebug\n*F\n+ 1 MeasureAndLayoutDelegate.kt\nandroidx/compose/ui/node/MeasureAndLayoutDelegate\n*L\n341#1:599,8\n341#1:614,5\n361#1:619,14\n384#1:645,14\n68#1:593\n68#1:594,2\n89#1:596\n89#1:597,2\n343#1:607,2\n343#1:610,4\n343#1:609\n373#1:633\n531#1:683\n373#1:634,11\n420#1:659,2\n424#1:661,11\n476#1:672,11\n531#1:684,11\n*E\n"})
public final class MeasureAndLayoutDelegate {

    @Nullable
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration;

    @NotNull
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;

    @NotNull
    private final OnPositionedDispatcher onPositionedDispatcher;

    @NotNull
    private final MutableVector<PostponedRequest> postponedMeasureRequests;

    @NotNull
    private final DepthSortedSetsForDifferentPasses relayoutNodes;

    @NotNull
    private final LayoutNode root;

    @Nullable
    private Constraints rootConstraints;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "node", "Landroidx/compose/ui/node/LayoutNode;", "isLookahead", "", "isForced", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "()Z", "getNode", "()Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;

        @NotNull
        private final LayoutNode node;

        public PostponedRequest(@NotNull LayoutNode node, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.isLookahead = z;
            this.isForced = z2;
        }

        @NotNull
        public final LayoutNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: isForced, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* JADX INFO: renamed from: isLookahead, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(@NotNull LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
        Owner.Companion companion = Owner.INSTANCE;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        this.consistencyChecker = companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(root, depthSortedSetsForDifferentPasses, mutableVector.asMutableList()) : null;
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        int size = mutableVector.getSize();
        if (size > 0) {
            Owner.OnLayoutCompletedListener[] content = mutableVector.getContent();
            int i = 0;
            do {
                content[i].onLayoutComplete();
                i++;
            } while (i < size);
        }
        this.onLayoutCompletedListeners.clear();
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    /* JADX INFO: renamed from: doLookaheadRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m2948doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        boolean zM2921lookaheadRemeasure_Sx5XlM$ui_release = constraints != null ? layoutNode.m2921lookaheadRemeasure_Sx5XlM$ui_release(constraints) : LayoutNode.m2917lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zM2921lookaheadRemeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot() == null) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestLookaheadRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestLookaheadRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return zM2921lookaheadRemeasure_Sx5XlM$ui_release;
    }

    /* JADX INFO: renamed from: doRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m2949doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean zM2922remeasure_Sx5XlM$ui_release = constraints != null ? layoutNode.m2922remeasure_Sx5XlM$ui_release(constraints) : LayoutNode.m2918remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zM2922remeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                requestRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return zM2922remeasure_Sx5XlM$ui_release;
    }

    private final boolean getCanAffectParent(LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui_release() && getMeasureAffectsParent(layoutNode);
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        AlignmentLines alignmentLines;
        if (!layoutNode.getLookaheadMeasurePending$ui_release()) {
            return false;
        }
        if (layoutNode.getMeasuredByParentInLookahead$ui_release() != LayoutNode.UsageByParent.InMeasureBlock) {
            AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui_release();
            if (!((lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) ? false : true)) {
                return false;
            }
        }
        return true;
    }

    private final boolean getMeasureAffectsParent(LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(function0);
    }

    private final void performMeasureAndLayout(Function0<Unit> block) {
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                block.invoke();
                InlineMarker.finallyStart(1);
                this.duringMeasureLayout = false;
                InlineMarker.finallyEnd(1);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                this.duringMeasureLayout = false;
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    private final void recurseRemeasure(LayoutNode layoutNode) {
        remeasureOnly(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode2 = content[i];
                if (getMeasureAffectsParent(layoutNode2)) {
                    recurseRemeasure(layoutNode2);
                }
                i++;
            } while (i < size);
        }
        remeasureOnly(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode, boolean affectsLookahead) {
        Constraints constraints;
        boolean zM2948doLookaheadRemeasuresdFAvZA;
        boolean zM2949doRemeasuresdFAvZA;
        int i = 0;
        if (!layoutNode.isPlaced() && !getCanAffectParent(layoutNode) && !Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && !getCanAffectParentInLookahead(layoutNode) && !layoutNode.getAlignmentLinesRequired$ui_release()) {
            return false;
        }
        if (layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getMeasurePending$ui_release()) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                Intrinsics.checkNotNull(constraints);
            } else {
                constraints = null;
            }
            zM2948doLookaheadRemeasuresdFAvZA = (layoutNode.getLookaheadMeasurePending$ui_release() && affectsLookahead) ? m2948doLookaheadRemeasuresdFAvZA(layoutNode, constraints) : false;
            zM2949doRemeasuresdFAvZA = m2949doRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            zM2949doRemeasuresdFAvZA = false;
            zM2948doLookaheadRemeasuresdFAvZA = false;
        }
        if ((zM2948doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && affectsLookahead) {
            layoutNode.lookaheadReplace$ui_release();
        }
        if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
            if (layoutNode == this.root) {
                layoutNode.place$ui_release(0, 0);
            } else {
                layoutNode.replace$ui_release();
            }
            this.onPositionedDispatcher.onNodePositioned(layoutNode);
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        if (this.postponedMeasureRequests.isNotEmpty()) {
            MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
            int size = mutableVector.getSize();
            if (size > 0) {
                PostponedRequest[] content = mutableVector.getContent();
                do {
                    PostponedRequest postponedRequest = content[i];
                    if (postponedRequest.getNode().isAttached()) {
                        if (postponedRequest.getIsLookahead()) {
                            requestLookaheadRemeasure(postponedRequest.getNode(), postponedRequest.getIsForced());
                        } else {
                            requestRemeasure(postponedRequest.getNode(), postponedRequest.getIsForced());
                        }
                    }
                    i++;
                } while (i < size);
            }
            this.postponedMeasureRequests.clear();
        }
        return zM2949doRemeasuresdFAvZA;
    }

    public static /* synthetic */ boolean remeasureAndRelayoutIfNeeded$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return measureAndLayoutDelegate.remeasureAndRelayoutIfNeeded(layoutNode, z);
    }

    private final void remeasureOnly(LayoutNode layoutNode) {
        Constraints constraints;
        if (layoutNode.getMeasurePending$ui_release() || layoutNode.getLookaheadMeasurePending$ui_release()) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                Intrinsics.checkNotNull(constraints);
            } else {
                constraints = null;
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                m2948doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
            }
            m2949doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z);
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z);
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z);
    }

    public final void dispatchOnPositionedCallbacks(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode, final boolean affectsLookahead) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.relayoutNodes.isEmpty()) {
            return;
        }
        if (!this.duringMeasureLayout) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Function1<LayoutNode, Boolean> function1 = new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.node.MeasureAndLayoutDelegate$forceMeasureTheSubtree$pending$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull LayoutNode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(affectsLookahead ? it.getLookaheadMeasurePending$ui_release() : it.getMeasurePending$ui_release());
            }
        };
        if (!(!function1.invoke(layoutNode).booleanValue())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode2 = content[i];
                if (function1.invoke(layoutNode2).booleanValue() && this.relayoutNodes.remove(layoutNode2, affectsLookahead)) {
                    remeasureAndRelayoutIfNeeded(layoutNode2, affectsLookahead);
                }
                if (!function1.invoke(layoutNode2).booleanValue()) {
                    forceMeasureTheSubtree(layoutNode2, affectsLookahead);
                }
                i++;
            } while (i < size);
        }
        if (function1.invoke(layoutNode).booleanValue() && this.relayoutNodes.remove(layoutNode, affectsLookahead)) {
            remeasureAndRelayoutIfNeeded$default(this, layoutNode, false, 2, null);
        }
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (this.duringMeasureLayout) {
            return this.measureIteration;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean measureAndLayout(@Nullable Function0<Unit> onLayout) {
        boolean z;
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        boolean z2 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                if (this.relayoutNodes.isNotEmpty()) {
                    DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                    z = false;
                    while (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                        boolean z3 = !depthSortedSetsForDifferentPasses.lookaheadSet.isEmpty();
                        LayoutNode layoutNodePop = (z3 ? depthSortedSetsForDifferentPasses.lookaheadSet : depthSortedSetsForDifferentPasses.set).pop();
                        boolean zRemeasureAndRelayoutIfNeeded = remeasureAndRelayoutIfNeeded(layoutNodePop, z3);
                        if (layoutNodePop == this.root && zRemeasureAndRelayoutIfNeeded) {
                            z = true;
                        }
                    }
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                } else {
                    z = false;
                }
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                z2 = z;
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
        return z2;
    }

    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m2950measureAndLayout0kLqBqw(@NotNull LayoutNode layoutNode, long constraints) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (!(!Intrinsics.areEqual(layoutNode, this.root))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                this.relayoutNodes.remove(layoutNode);
                boolean zM2948doLookaheadRemeasuresdFAvZA = m2948doLookaheadRemeasuresdFAvZA(layoutNode, Constraints.m3721boximpl(constraints));
                m2949doRemeasuresdFAvZA(layoutNode, Constraints.m3721boximpl(constraints));
                if ((zM2948doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                    layoutNode.lookaheadReplace$ui_release();
                }
                if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
                    layoutNode.replace$ui_release();
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                }
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
    }

    public final void measureOnly() {
        if (!this.root.isAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.root.isPlaced()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                recurseRemeasure(this.root);
                this.duringMeasureLayout = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
    }

    public final void onNodeDetached(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.relayoutNodes.remove(node);
    }

    public final void registerOnLayoutCompletedListener(@NotNull Owner.OnLayoutCompletedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onLayoutCompletedListeners.add(listener);
    }

    public final boolean requestLookaheadRelayout(@NotNull LayoutNode layoutNode, boolean forced) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !forced) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker == null) {
                    return false;
                }
                layoutTreeConsistencyChecker.assertConsistent();
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (!(parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release())) {
                    if (!(parent$ui_release != null && parent$ui_release.getLookaheadLayoutPending$ui_release())) {
                        this.relayoutNodes.add(layoutNode, true);
                    }
                }
            }
            return !this.duringMeasureLayout;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 == null) {
            return false;
        }
        layoutTreeConsistencyChecker2.assertConsistent();
        return false;
    }

    public final boolean requestLookaheadRemeasure(@NotNull LayoutNode layoutNode, boolean forced) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (!(layoutNode.getLookaheadRoot() != null)) {
            throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, true, forced));
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNode.getLookaheadMeasurePending$ui_release() || forced) {
                    layoutNode.markLookaheadMeasurePending$ui_release();
                    layoutNode.markMeasurePending$ui_release();
                    if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(layoutNode)) {
                        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                        if (!(parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release())) {
                            this.relayoutNodes.add(layoutNode, true);
                        }
                    }
                    if (!this.duringMeasureLayout) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void requestOnPositionedCallback(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    public final boolean requestRelayout(@NotNull LayoutNode layoutNode, boolean forced) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (forced || !(layoutNode.getMeasurePending$ui_release() || layoutNode.getLayoutPending$ui_release())) {
                layoutNode.markLayoutPending$ui_release();
                if (layoutNode.isPlaced()) {
                    LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                    if (!(parent$ui_release != null && parent$ui_release.getLayoutPending$ui_release())) {
                        if (!(parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release())) {
                            this.relayoutNodes.add(layoutNode, false);
                        }
                    }
                }
                if (!this.duringMeasureLayout) {
                    return true;
                }
            } else {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
                if (layoutTreeConsistencyChecker2 != null) {
                    layoutTreeConsistencyChecker2.assertConsistent();
                }
            }
        }
        return false;
    }

    public final boolean requestRemeasure(@NotNull LayoutNode layoutNode, boolean forced) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, forced));
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!layoutNode.getMeasurePending$ui_release() || forced) {
                    layoutNode.markMeasurePending$ui_release();
                    if (layoutNode.isPlaced() || getCanAffectParent(layoutNode)) {
                        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                        if (!(parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release())) {
                            this.relayoutNodes.add(layoutNode, false);
                        }
                    }
                    if (!this.duringMeasureLayout) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m2951updateRootConstraintsBRTryo0(long constraints) {
        Constraints constraints2 = this.rootConstraints;
        if (constraints2 == null ? false : Constraints.m3726equalsimpl0(constraints2.getValue(), constraints)) {
            return;
        }
        if (!(!this.duringMeasureLayout)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.rootConstraints = Constraints.m3721boximpl(constraints);
        if (this.root.getLookaheadRoot() != null) {
            this.root.markLookaheadMeasurePending$ui_release();
        }
        this.root.markMeasurePending$ui_release();
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
        LayoutNode layoutNode = this.root;
        depthSortedSetsForDifferentPasses.add(layoutNode, layoutNode.getLookaheadRoot() != null);
    }
}
