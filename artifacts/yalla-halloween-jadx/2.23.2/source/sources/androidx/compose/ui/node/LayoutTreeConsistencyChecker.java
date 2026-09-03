package androidx.compose.ui.node;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\f\u0010\u0012\u001a\u00020\r*\u00020\u0003H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "postponedMeasureRequests", "", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;Ljava/util/List;)V", "assertConsistent", "", "isTreeConsistent", "", "node", "logTree", "", "nodeToString", "consistentLayoutState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,142:1\n33#2,6:143\n116#2,2:149\n33#2,6:151\n118#2:157\n116#2,2:158\n33#2,6:160\n118#2:166\n33#2,6:167\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n44#1:143,6\n59#1:149,2\n59#1:151,6\n59#1:157\n83#1:158,2\n83#1:160,6\n83#1:166\n135#1:167,6\n*E\n"})
public final class LayoutTreeConsistencyChecker {

    @NotNull
    private final List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests;

    @NotNull
    private final DepthSortedSetsForDifferentPasses relayoutNodes;

    @NotNull
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(@NotNull LayoutNode root, @NotNull DepthSortedSetsForDifferentPasses relayoutNodes, @NotNull List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(relayoutNodes, "relayoutNodes");
        Intrinsics.checkNotNullParameter(postponedMeasureRequests, "postponedMeasureRequests");
        this.root = root;
        this.relayoutNodes = relayoutNodes;
        this.postponedMeasureRequests = postponedMeasureRequests;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x005b A[EDGE_INSN: B:129:0x005b->B:30:0x005b BREAK  A[LOOP:1: B:19:0x0038->B:28:0x0057], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057 A[LOOP:1: B:19:0x0038->B:28:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    private final boolean consistentLayoutState(LayoutNode layoutNode) {
        boolean z;
        boolean z2;
        List<MeasureAndLayoutDelegate.PostponedRequest> list;
        int size;
        int i;
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest;
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest2;
        boolean z3;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest3 = null;
        LayoutNode.LayoutState layoutState$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null;
        if (layoutNode.isPlaced()) {
            if (layoutNode.getMeasurePending$ui_release()) {
                list = this.postponedMeasureRequests;
                size = list.size();
                i = 0;
                while (true) {
                    if (i < size) {
                        postponedRequest = null;
                        break;
                    }
                    postponedRequest = list.get(i);
                    postponedRequest2 = postponedRequest;
                    if (Intrinsics.areEqual(postponedRequest2.getNode(), layoutNode) || postponedRequest2.getIsLookahead()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        break;
                    }
                    i++;
                }
                if (postponedRequest != null) {
                    return true;
                }
            }
            if (layoutNode.getMeasurePending$ui_release()) {
                if (!this.relayoutNodes.contains(layoutNode)) {
                    if (parent$ui_release == null && parent$ui_release.getMeasurePending$ui_release()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (parent$ui_release == null && parent$ui_release.getLookaheadMeasurePending$ui_release()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2 && layoutState$ui_release != LayoutNode.LayoutState.Measuring) {
                            return false;
                        }
                    }
                }
                return true;
            }
            if (layoutNode.getLayoutPending$ui_release()) {
                return !this.relayoutNodes.contains(layoutNode) || parent$ui_release == null || parent$ui_release.getMeasurePending$ui_release() || parent$ui_release.getLayoutPending$ui_release() || layoutState$ui_release == LayoutNode.LayoutState.Measuring || layoutState$ui_release == LayoutNode.LayoutState.LayingOut;
            }
        } else if (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
            if (parent$ui_release != null && parent$ui_release.isPlaced()) {
                if (layoutNode.getMeasurePending$ui_release()) {
                    list = this.postponedMeasureRequests;
                    size = list.size();
                    i = 0;
                    while (true) {
                        if (i < size) {
                            postponedRequest = null;
                            break;
                        }
                        postponedRequest = list.get(i);
                        postponedRequest2 = postponedRequest;
                        if (Intrinsics.areEqual(postponedRequest2.getNode(), layoutNode)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            break;
                            break;
                        }
                        i++;
                    }
                    if (postponedRequest != null) {
                        return true;
                    }
                }
                if (layoutNode.getMeasurePending$ui_release()) {
                    if (!this.relayoutNodes.contains(layoutNode)) {
                        if (parent$ui_release == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            if (parent$ui_release == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
                if (layoutNode.getLayoutPending$ui_release()) {
                    if (this.relayoutNodes.contains(layoutNode)) {
                    }
                }
            }
        }
        if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                List<MeasureAndLayoutDelegate.PostponedRequest> list2 = this.postponedMeasureRequests;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest4 = list2.get(i2);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest5 = postponedRequest4;
                    if (Intrinsics.areEqual(postponedRequest5.getNode(), layoutNode) && postponedRequest5.getIsLookahead()) {
                        postponedRequest3 = postponedRequest4;
                        break;
                    }
                }
                if (postponedRequest3 != null) {
                    return true;
                }
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                if (!this.relayoutNodes.contains(layoutNode, true)) {
                    if (!(parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release()) && layoutState$ui_release != LayoutNode.LayoutState.LookaheadMeasuring) {
                        if (!(parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) || !Intrinsics.areEqual(layoutNode.getLookaheadRoot(), layoutNode)) {
                            return false;
                        }
                    }
                }
                return true;
            }
            if (layoutNode.getLookaheadLayoutPending$ui_release()) {
                return this.relayoutNodes.contains(layoutNode, true) || parent$ui_release == null || parent$ui_release.getLookaheadMeasurePending$ui_release() || parent$ui_release.getLookaheadLayoutPending$ui_release() || layoutState$ui_release == LayoutNode.LayoutState.LookaheadMeasuring || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut || (parent$ui_release.getLayoutPending$ui_release() && Intrinsics.areEqual(layoutNode.getLookaheadRoot(), layoutNode));
            }
        }
        return true;
    }

    private final boolean isTreeConsistent(LayoutNode node) {
        if (!consistentLayoutState(node)) {
            return false;
        }
        List<LayoutNode> children$ui_release = node.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            if (!isTreeConsistent(children$ui_release.get(i))) {
                return false;
            }
        }
        return true;
    }

    private final String logTree() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        logTree$printSubTree(this, sb, this.root, 0);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        return string;
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i) {
        String strNodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        if (strNodeToString.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(strNodeToString);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            i++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb, children$ui_release.get(i3), i);
        }
    }

    private final String nodeToString(LayoutNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(node);
        sb.append("[" + node.getLayoutState$ui_release() + ']');
        if (!node.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + node.getMeasuredByParent$ui_release() + ']');
        if (!consistentLayoutState(node)) {
            sb.append("[INCONSISTENT]");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "with(StringBuilder()) {\n…     toString()\n        }");
        return string;
    }

    public final void assertConsistent() {
        if (!isTreeConsistent(this.root)) {
            System.out.println((Object) logTree());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}
