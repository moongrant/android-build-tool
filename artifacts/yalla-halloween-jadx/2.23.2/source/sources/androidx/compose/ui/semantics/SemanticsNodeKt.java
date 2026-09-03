package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\"\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0000\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0007H\u0002\u001a\"\u0010\u0011\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0013H\u0000\u001a\f\u0010\u0014\u001a\u00020\u0010*\u00020\u0007H\u0002\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00078BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"outerMergingSemantics", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/LayoutNode;", "getOuterMergingSemantics", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/SemanticsModifierNode;", "role", "Landroidx/compose/ui/semantics/Role;", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRole", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;", "SemanticsNode", "layoutNode", "mergingEnabled", "", "outerSemanticsNode", "contentDescriptionFakeNodeId", "", "findClosestParentNode", "selector", "Lkotlin/Function1;", "roleFakeNodeId", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,462:1\n76#2:463\n76#2:540\n769#3:464\n700#3,8:465\n723#3,3:473\n708#3,2:476\n701#3:478\n770#3:484\n702#3,11:523\n726#3,3:534\n713#3:537\n703#3:538\n772#3:539\n693#3,15:541\n723#3,3:556\n708#3,2:559\n701#3:561\n694#3,2:567\n702#3,11:607\n726#3,3:618\n713#3:621\n703#3:622\n696#3:623\n383#4,5:479\n388#4:485\n393#4,2:487\n395#4,8:492\n403#4,9:503\n412#4,8:515\n383#4,5:562\n388#4:569\n393#4,2:571\n395#4,8:576\n403#4,9:587\n412#4,8:599\n261#5:486\n261#5:570\n234#6,3:489\n237#6,3:512\n234#6,3:573\n237#6,3:596\n1182#7:500\n1161#7,2:501\n1182#7:584\n1161#7,2:585\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n45#1:463\n438#1:540\n45#1:464\n45#1:465,8\n45#1:473,3\n45#1:476,2\n45#1:478\n45#1:484\n45#1:523,11\n45#1:534,3\n45#1:537\n45#1:538\n45#1:539\n438#1:541,15\n438#1:556,3\n438#1:559,2\n438#1:561\n438#1:567,2\n438#1:607,11\n438#1:618,3\n438#1:621\n438#1:622\n438#1:623\n45#1:479,5\n45#1:485\n45#1:487,2\n45#1:492,8\n45#1:503,9\n45#1:515,8\n438#1:562,5\n438#1:569\n438#1:571,2\n438#1:576,8\n438#1:587,9\n438#1:599,8\n45#1:486\n438#1:570\n45#1:489,3\n45#1:512,3\n438#1:573,3\n438#1:596,3\n45#1:500\n45#1:501,2\n438#1:584\n438#1:585,2\n*E\n"})
public final class SemanticsNodeKt {
    /* JADX WARN: Code duplicated, block: B:41:0x0085 A[LOOP:0: B:5:0x001b->B:41:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x008a A[EDGE_INSN: B:46:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:5:0x001b->B:41:0x0085], SYNTHETIC] */
    @NotNull
    public static final SemanticsNode SemanticsNode(@NotNull LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        NodeChain nodes = layoutNode.getNodes();
        int iM3004constructorimpl = NodeKind.m3004constructorimpl(8);
        Object obj = null;
        if ((nodes.getAggregateChildKindSet() & iM3004constructorimpl) != 0) {
            loop0: for (Modifier.Node head = nodes.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM3004constructorimpl) == 0) {
                    if ((head.getAggregateChildKindSet() & iM3004constructorimpl) != 0) {
                        break;
                        break;
                    }
                } else {
                    Modifier.Node nodePop = head;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        if (nodePop instanceof SemanticsModifierNode) {
                            obj = nodePop;
                            break loop0;
                        }
                        if (((nodePop.getKindSet() & iM3004constructorimpl) != 0) && (nodePop instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iM3004constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodePop = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != null) {
                                            mutableVector.add(nodePop);
                                            nodePop = null;
                                        }
                                        mutableVector.add(delegate);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                    if ((head.getAggregateChildKindSet() & iM3004constructorimpl) != 0) {
                        break;
                    }
                }
            }
        }
        Intrinsics.checkNotNull(obj);
        Modifier.Node node = ((SemanticsModifierNode) obj).getNode();
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        Intrinsics.checkNotNull(collapsedSemantics$ui_release);
        return new SemanticsNode(node, z, layoutNode, collapsedSemantics$ui_release);
    }

    public static /* synthetic */ SemanticsNode SemanticsNode$default(SemanticsModifierNode semanticsModifierNode, boolean z, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 4) != 0) {
            layoutNode = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode);
        }
        return SemanticsNode(semanticsModifierNode, z, layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    @Nullable
    public static final LayoutNode findClosestParentNode(@NotNull LayoutNode layoutNode, @NotNull Function1<? super LayoutNode, Boolean> selector) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (selector.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008e A[LOOP:0: B:5:0x001b->B:43:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0093 A[EDGE_INSN: B:48:0x0093->B:44:0x0093 BREAK  A[LOOP:0: B:5:0x001b->B:43:0x008e], SYNTHETIC] */
    @Nullable
    public static final SemanticsModifierNode getOuterMergingSemantics(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        NodeChain nodes = layoutNode.getNodes();
        int iM3004constructorimpl = NodeKind.m3004constructorimpl(8);
        Object obj = null;
        if ((nodes.getAggregateChildKindSet() & iM3004constructorimpl) != 0) {
            loop0: for (Modifier.Node head = nodes.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iM3004constructorimpl) == 0) {
                    if ((head.getAggregateChildKindSet() & iM3004constructorimpl) != 0) {
                        break;
                        break;
                    }
                } else {
                    Modifier.Node nodePop = head;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        if (nodePop instanceof SemanticsModifierNode) {
                            if (((SemanticsModifierNode) nodePop).getShouldMergeDescendantSemantics()) {
                                obj = nodePop;
                                break loop0;
                            }
                        } else if (((nodePop.getKindSet() & iM3004constructorimpl) != 0) && (nodePop instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iM3004constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodePop = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != null) {
                                            mutableVector.add(nodePop);
                                            nodePop = null;
                                        }
                                        mutableVector.add(delegate);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                    if ((head.getAggregateChildKindSet() & iM3004constructorimpl) != 0) {
                        break;
                    }
                }
            }
        }
        return (SemanticsModifierNode) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Role getRole(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int roleFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }

    @NotNull
    public static final SemanticsNode SemanticsNode(@NotNull SemanticsModifierNode outerSemanticsNode, boolean z, @NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(outerSemanticsNode, "outerSemanticsNode");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Modifier.Node node = outerSemanticsNode.getNode();
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        if (collapsedSemantics$ui_release == null) {
            collapsedSemantics$ui_release = new SemanticsConfiguration();
        }
        return new SemanticsNode(node, z, layoutNode, collapsedSemantics$ui_release);
    }
}
