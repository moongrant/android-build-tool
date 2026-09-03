package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.qiniu.android.collect.ReportItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J7\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016ø\u0001\u0000J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0017\u0010#\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0%H\u0082\bJ7\u0010&\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016ø\u0001\u0000J\u001a\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u0010)\u001a\u00020\rH\u0002J\u0006\u0010*\u001a\u00020\u001fJ\b\u0010+\u001a\u00020,H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "modifierNode", "Landroidx/compose/ui/Modifier$Node;", "(Landroidx/compose/ui/Modifier$Node;)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "hasExited", "", "isIn", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerIds", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/PointerId;", "getPointerIds", "()Landroidx/compose/runtime/collection/MutableVector;", "relevantChanges", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "wasIn", "buildCache", "changes", "", "parentCoordinates", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "isInBounds", "cleanUpHits", "", "clearCache", "dispatchCancel", "dispatchFinalEventPass", "dispatchIfNeeded", ReportItem.LogTypeBlock, "Lkotlin/Function0;", "dispatchMainEventPass", "hasPositionChanged", "oldEvent", "newEvent", "markIsIn", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,557:1\n503#1,5:561\n510#1:665\n503#1,5:666\n510#1:726\n1182#2:558\n1161#2,2:559\n1182#2:587\n1161#2,2:588\n1182#2:642\n1161#2,2:643\n1182#2:692\n1161#2,2:693\n1182#2:748\n1161#2,2:749\n1182#2:822\n1161#2,2:823\n78#3:566\n78#3:621\n78#3:671\n78#3:727\n78#3:801\n383#4,6:567\n393#4,2:574\n395#4,8:579\n403#4,9:590\n412#4,8:602\n383#4,6:622\n393#4,2:629\n395#4,8:634\n403#4,9:645\n412#4,8:657\n383#4,6:672\n393#4,2:679\n395#4,8:684\n403#4,9:695\n412#4,8:707\n383#4,6:728\n393#4,2:735\n395#4,8:740\n403#4,9:751\n412#4,8:763\n383#4,6:802\n393#4,2:809\n395#4,8:814\n403#4,9:825\n412#4,8:837\n261#5:573\n261#5:628\n261#5:678\n261#5:734\n261#5:808\n234#6,3:576\n237#6,3:599\n234#6,3:631\n237#6,3:654\n234#6,3:681\n237#6,3:704\n234#6,3:737\n237#6,3:760\n234#6,3:811\n237#6,3:834\n460#7,11:610\n460#7,11:715\n48#7:771\n523#7:772\n48#7:779\n523#7:780\n460#7,11:790\n33#8,6:773\n116#8,2:781\n33#8,6:783\n118#8:789\n33#8,6:845\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n292#1:561,5\n292#1:665\n330#1:666,5\n330#1:726\n263#1:558\n263#1:559,2\n296#1:587\n296#1:588,2\n316#1:642\n316#1:643,2\n334#1:692\n334#1:693,2\n373#1:748\n373#1:749,2\n522#1:822\n522#1:823,2\n296#1:566\n316#1:621\n334#1:671\n373#1:727\n522#1:801\n296#1:567,6\n296#1:574,2\n296#1:579,8\n296#1:590,9\n296#1:602,8\n316#1:622,6\n316#1:629,2\n316#1:634,8\n316#1:645,9\n316#1:657,8\n334#1:672,6\n334#1:679,2\n334#1:684,8\n334#1:695,9\n334#1:707,8\n373#1:728,6\n373#1:735,2\n373#1:740,8\n373#1:751,9\n373#1:763,8\n522#1:802,6\n522#1:809,2\n522#1:814,8\n522#1:825,9\n522#1:837,8\n296#1:573\n316#1:628\n334#1:678\n373#1:734\n522#1:808\n296#1:576,3\n296#1:599,3\n316#1:631,3\n316#1:654,3\n334#1:681,3\n334#1:704,3\n373#1:737,3\n373#1:760,3\n522#1:811,3\n522#1:834,3\n302#1:610,11\n340#1:715,11\n383#1:771\n384#1:772\n424#1:779\n425#1:780\n521#1:790,11\n394#1:773,6\n432#1:781,2\n432#1:783,6\n432#1:789\n538#1:845,6\n*E\n"})
public final class Node extends NodeParent {

    @Nullable
    private LayoutCoordinates coordinates;
    private boolean hasExited;
    private boolean isIn;

    @NotNull
    private final Modifier.Node modifierNode;

    @Nullable
    private PointerEvent pointerEvent;

    @NotNull
    private final MutableVector<PointerId> pointerIds;

    @NotNull
    private final Map<PointerId, PointerInputChange> relevantChanges;
    private boolean wasIn;

    public Node(@NotNull Modifier.Node modifierNode) {
        Intrinsics.checkNotNullParameter(modifierNode, "modifierNode");
        this.modifierNode = modifierNode;
        this.pointerIds = new MutableVector<>(new PointerId[16], 0);
        this.relevantChanges = new LinkedHashMap();
        this.isIn = true;
        this.hasExited = true;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(Function0<Unit> block) {
        if (this.relevantChanges.isEmpty() || !this.modifierNode.getIsAttached()) {
            return false;
        }
        block.invoke();
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent oldEvent, PointerEvent newEvent) {
        if (oldEvent == null || oldEvent.getChanges().size() != newEvent.getChanges().size()) {
            return true;
        }
        int size = newEvent.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!Offset.m1433equalsimpl0(oldEvent.getChanges().get(i).getPosition(), newEvent.getChanges().get(i).getPosition())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x025e  */
    /* JADX WARN: Code duplicated, block: B:106:0x026c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0201  */
    /* JADX WARN: Code duplicated, block: B:94:0x0231  */
    /* JADX WARN: Code duplicated, block: B:95:0x0236  */
    /* JADX WARN: Code duplicated, block: B:97:0x023e  */
    /* JADX WARN: Code duplicated, block: B:99:0x024e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v23 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean buildCache(@org.jetbrains.annotations.NotNull java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r34, @org.jetbrains.annotations.NotNull androidx.compose.ui.layout.LayoutCoordinates r35, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InternalPointerEvent r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.buildCache(java.util.Map, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(@NotNull InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.pointerEvent;
        if (pointerEvent == null) {
            return;
        }
        this.wasIn = this.isIn;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = changes.get(i);
            if ((pointerInputChange.getPressed() || (internalPointerEvent.m2619issuesEnterExitEvent0FcD4WY(pointerInputChange.getId()) && this.isIn)) ? false : true) {
                this.pointerIds.remove(PointerId.m2669boximpl(pointerInputChange.getId()));
            }
        }
        this.isIn = false;
        this.hasExited = PointerEventType.m2639equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m2644getExit7fucELk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        /*
            r10 = this;
            androidx.compose.runtime.collection.MutableVector r0 = r10.getChildren()
            int r1 = r0.getSize()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L1b
            java.lang.Object[] r0 = r0.getContent()
            r4 = r2
        L11:
            r5 = r0[r4]
            androidx.compose.ui.input.pointer.Node r5 = (androidx.compose.ui.input.pointer.Node) r5
            r5.dispatchCancel()
            int r4 = r4 + r3
            if (r4 < r1) goto L11
        L1b:
            androidx.compose.ui.Modifier$Node r0 = r10.modifierNode
            r1 = 16
            int r4 = androidx.compose.ui.node.NodeKind.m2994constructorimpl(r1)
            r5 = 0
            r6 = r5
        L25:
            if (r0 == 0) goto L7c
            boolean r7 = r0 instanceof androidx.compose.ui.node.PointerInputModifierNode
            if (r7 == 0) goto L31
            androidx.compose.ui.node.PointerInputModifierNode r0 = (androidx.compose.ui.node.PointerInputModifierNode) r0
            r0.onCancelPointerInput()
            goto L77
        L31:
            int r7 = r0.getKindSet()
            r7 = r7 & r4
            if (r7 == 0) goto L3a
            r7 = r3
            goto L3b
        L3a:
            r7 = r2
        L3b:
            if (r7 == 0) goto L77
            boolean r7 = r0 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto L77
            r7 = r0
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate()
            r8 = r2
        L49:
            if (r7 == 0) goto L74
            int r9 = r7.getKindSet()
            r9 = r9 & r4
            if (r9 == 0) goto L54
            r9 = r3
            goto L55
        L54:
            r9 = r2
        L55:
            if (r9 == 0) goto L6f
            int r8 = r8 + 1
            if (r8 != r3) goto L5d
            r0 = r7
            goto L6f
        L5d:
            if (r6 != 0) goto L66
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r1]
            r6.<init>(r9, r2)
        L66:
            if (r0 == 0) goto L6c
            r6.add(r0)
            r0 = r5
        L6c:
            r6.add(r7)
        L6f:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild()
            goto L49
        L74:
            if (r8 != r3) goto L77
            goto L25
        L77:
            androidx.compose.ui.Modifier$Node r0 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L25
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.dispatchCancel():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InternalPointerEvent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "internalPointerEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r0 = r13.relevantChanges
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L10
            goto Lad
        L10:
            androidx.compose.ui.Modifier$Node r0 = r13.modifierNode
            boolean r0 = r0.getIsAttached()
            if (r0 != 0) goto L1a
            goto Lad
        L1a:
            androidx.compose.ui.input.pointer.PointerEvent r0 = r13.pointerEvent
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.compose.ui.layout.LayoutCoordinates r2 = r13.coordinates
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            long r2 = r2.mo2801getSizeYbymL2g()
            androidx.compose.ui.Modifier$Node r4 = r13.modifierNode
            r5 = 16
            int r6 = androidx.compose.ui.node.NodeKind.m2994constructorimpl(r5)
            r7 = 0
            r8 = r7
        L32:
            r9 = 1
            if (r4 == 0) goto L8c
            boolean r10 = r4 instanceof androidx.compose.ui.node.PointerInputModifierNode
            if (r10 == 0) goto L41
            androidx.compose.ui.node.PointerInputModifierNode r4 = (androidx.compose.ui.node.PointerInputModifierNode) r4
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r4.mo152onPointerEventH0pRuoY(r0, r9, r2)
            goto L87
        L41:
            int r10 = r4.getKindSet()
            r10 = r10 & r6
            if (r10 == 0) goto L4a
            r10 = r9
            goto L4b
        L4a:
            r10 = r1
        L4b:
            if (r10 == 0) goto L87
            boolean r10 = r4 instanceof androidx.compose.ui.node.DelegatingNode
            if (r10 == 0) goto L87
            r10 = r4
            androidx.compose.ui.node.DelegatingNode r10 = (androidx.compose.ui.node.DelegatingNode) r10
            androidx.compose.ui.Modifier$Node r10 = r10.getDelegate()
            r11 = r1
        L59:
            if (r10 == 0) goto L84
            int r12 = r10.getKindSet()
            r12 = r12 & r6
            if (r12 == 0) goto L64
            r12 = r9
            goto L65
        L64:
            r12 = r1
        L65:
            if (r12 == 0) goto L7f
            int r11 = r11 + 1
            if (r11 != r9) goto L6d
            r4 = r10
            goto L7f
        L6d:
            if (r8 != 0) goto L76
            androidx.compose.runtime.collection.MutableVector r8 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r12 = new androidx.compose.ui.Modifier.Node[r5]
            r8.<init>(r12, r1)
        L76:
            if (r4 == 0) goto L7c
            r8.add(r4)
            r4 = r7
        L7c:
            r8.add(r10)
        L7f:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild()
            goto L59
        L84:
            if (r11 != r9) goto L87
            goto L32
        L87:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r8)
            goto L32
        L8c:
            androidx.compose.ui.Modifier$Node r0 = r13.modifierNode
            boolean r0 = r0.getIsAttached()
            if (r0 == 0) goto Lac
            androidx.compose.runtime.collection.MutableVector r0 = r13.getChildren()
            int r2 = r0.getSize()
            if (r2 <= 0) goto Lac
            java.lang.Object[] r0 = r0.getContent()
        La2:
            r3 = r0[r1]
            androidx.compose.ui.input.pointer.Node r3 = (androidx.compose.ui.input.pointer.Node) r3
            r3.dispatchFinalEventPass(r14)
            int r1 = r1 + r9
            if (r1 < r2) goto La2
        Lac:
            r1 = r9
        Lad:
            r13.cleanUpHits(r14)
            r13.clearCache()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.dispatchFinalEventPass(androidx.compose.ui.input.pointer.InternalPointerEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(@org.jetbrains.annotations.NotNull java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r12, @org.jetbrains.annotations.NotNull androidx.compose.ui.layout.LayoutCoordinates r13, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InternalPointerEvent r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.dispatchMainEventPass(java.util.Map, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @NotNull
    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    @NotNull
    public final MutableVector<PointerId> getPointerIds() {
        return this.pointerIds;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    @NotNull
    public String toString() {
        return "Node(pointerInputFilter=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
