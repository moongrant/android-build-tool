package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\rJ%\u0010\u000f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\b2\u0006\u0010\u0010\u001a\u0002H\u0011H\u0002¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusEventNodes", "", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "focusPropertiesNodes", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "focusTargetNodes", "Landroidx/compose/ui/focus/FocusTargetNode;", "invalidateNodes", "scheduleInvalidation", "node", "T", "(Ljava/util/Set;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusInvalidationManager {

    @NotNull
    private Set<FocusEventModifierNode> focusEventNodes;

    @NotNull
    private Set<FocusPropertiesModifierNode> focusPropertiesNodes;

    @NotNull
    private Set<FocusTargetNode> focusTargetNodes;

    @NotNull
    private final Function0<Unit> invalidateNodes;

    @NotNull
    private final Function1<Function0<Unit>, Unit> onRequestApplyChangesListener;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(@NotNull Function1<? super Function0<Unit>, Unit> onRequestApplyChangesListener) {
        Intrinsics.checkNotNullParameter(onRequestApplyChangesListener, "onRequestApplyChangesListener");
        this.onRequestApplyChangesListener = onRequestApplyChangesListener;
        this.focusTargetNodes = new LinkedHashSet();
        this.focusEventNodes = new LinkedHashSet();
        this.focusPropertiesNodes = new LinkedHashSet();
        this.invalidateNodes = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusInvalidationManager$invalidateNodes$1
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
                Iterator it;
                FocusState focusState;
                Iterator it2;
                Set set = this.this$0.focusPropertiesNodes;
                FocusInvalidationManager focusInvalidationManager = this.this$0;
                Iterator it3 = set.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    int i = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    int i2 = 16;
                    int i3 = 0;
                    int i4 = 1;
                    if (!zHasNext) {
                        this.this$0.focusPropertiesNodes.clear();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Set set2 = this.this$0.focusEventNodes;
                        FocusInvalidationManager focusInvalidationManager2 = this.this$0;
                        Iterator it4 = set2.iterator();
                        while (it4.hasNext()) {
                            FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) it4.next();
                            if (focusEventModifierNode.getNode().getIsAttached()) {
                                int iM3004constructorimpl = NodeKind.m3004constructorimpl(i);
                                int i5 = i3;
                                MutableVector mutableVector = null;
                                FocusTargetNode focusTargetNode = null;
                                Modifier.Node node = focusEventModifierNode.getNode();
                                int i6 = i4;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                        if (focusTargetNode == null) {
                                            i4 = i5;
                                        }
                                        if (focusInvalidationManager2.focusTargetNodes.contains(focusTargetNode2)) {
                                            linkedHashSet.add(focusTargetNode2);
                                            i6 = i3;
                                        }
                                        it2 = it4;
                                        i5 = i4;
                                        focusTargetNode = focusTargetNode2;
                                    } else if (((node.getKindSet() & iM3004constructorimpl) != 0 ? i4 : i3) == 0 || !(node instanceof DelegatingNode)) {
                                        it2 = it4;
                                    } else {
                                        Modifier.Node delegate = ((DelegatingNode) node).getDelegate();
                                        it2 = it4;
                                        int i7 = i3;
                                        while (delegate != null) {
                                            if (((delegate.getKindSet() & iM3004constructorimpl) != 0 ? i4 : i3) != 0) {
                                                i7++;
                                                if (i7 == i4) {
                                                    node = delegate;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(new Modifier.Node[i2], i3);
                                                    }
                                                    if (node != null) {
                                                        mutableVector.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                            delegate = delegate.getChild();
                                            i4 = 1;
                                        }
                                        if (i7 == i4) {
                                        }
                                        it4 = it2;
                                    }
                                    node = DelegatableNodeKt.pop(mutableVector);
                                    i4 = 1;
                                    it4 = it2;
                                }
                                it = it4;
                                if (!focusEventModifierNode.getNode().getIsAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node".toString());
                                }
                                MutableVector mutableVector2 = new MutableVector(new Modifier.Node[i2], i3);
                                Modifier.Node child = focusEventModifierNode.getNode().getChild();
                                if (child == null) {
                                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusEventModifierNode.getNode());
                                } else {
                                    mutableVector2.add(child);
                                }
                                while (mutableVector2.isNotEmpty()) {
                                    Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                                    if ((nodePop.getAggregateChildKindSet() & iM3004constructorimpl) == 0) {
                                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop);
                                    } else {
                                        while (true) {
                                            if (nodePop != null) {
                                                if ((nodePop.getKindSet() & iM3004constructorimpl) != 0) {
                                                    MutableVector mutableVector3 = null;
                                                    while (nodePop != null) {
                                                        if (nodePop instanceof FocusTargetNode) {
                                                            FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodePop;
                                                            if (focusTargetNode != null) {
                                                                i5 = 1;
                                                            }
                                                            if (focusInvalidationManager2.focusTargetNodes.contains(focusTargetNode3)) {
                                                                linkedHashSet.add(focusTargetNode3);
                                                                i6 = i3;
                                                            }
                                                            focusTargetNode = focusTargetNode3;
                                                        } else {
                                                            if (((nodePop.getKindSet() & iM3004constructorimpl) != 0 ? 1 : i3) != 0 && (nodePop instanceof DelegatingNode)) {
                                                                Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate();
                                                                MutableVector mutableVector4 = mutableVector3;
                                                                Modifier.Node node2 = nodePop;
                                                                int i8 = i3;
                                                                while (delegate2 != null) {
                                                                    if (((delegate2.getKindSet() & iM3004constructorimpl) != 0 ? 1 : i3) != 0) {
                                                                        i8++;
                                                                        if (i8 == 1) {
                                                                            i3 = 0;
                                                                            node2 = delegate2;
                                                                        } else {
                                                                            if (mutableVector4 == null) {
                                                                                mutableVector4 = new MutableVector(new Modifier.Node[i2], 0);
                                                                                i3 = 0;
                                                                            } else {
                                                                                i3 = 0;
                                                                            }
                                                                            if (node2 != null) {
                                                                                mutableVector4.add(node2);
                                                                                node2 = null;
                                                                            }
                                                                            mutableVector4.add(delegate2);
                                                                        }
                                                                    }
                                                                    delegate2 = delegate2.getChild();
                                                                    i2 = 16;
                                                                }
                                                                if (i8 == 1) {
                                                                    nodePop = node2;
                                                                    mutableVector3 = mutableVector4;
                                                                } else {
                                                                    mutableVector3 = mutableVector4;
                                                                }
                                                            }
                                                            i2 = 16;
                                                        }
                                                        nodePop = DelegatableNodeKt.pop(mutableVector3);
                                                        i2 = 16;
                                                    }
                                                    break;
                                                }
                                                nodePop = nodePop.getChild();
                                                i2 = 16;
                                            }
                                        }
                                    }
                                    i2 = 16;
                                }
                                if (i6 != 0) {
                                    if (i5 != 0) {
                                        focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                    } else if (focusTargetNode == null || (focusState = focusTargetNode.getFocusState()) == null) {
                                        focusState = FocusStateImpl.Inactive;
                                    }
                                    focusEventModifierNode.onFocusEvent(focusState);
                                }
                                i4 = 1;
                            } else {
                                focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                                it = it4;
                            }
                            i = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                            i2 = 16;
                            it4 = it;
                        }
                        this.this$0.focusEventNodes.clear();
                        for (FocusTargetNode focusTargetNode4 : this.this$0.focusTargetNodes) {
                            if (focusTargetNode4.getIsAttached()) {
                                FocusStateImpl focusState2 = focusTargetNode4.getFocusState();
                                focusTargetNode4.invalidateFocus$ui_release();
                                if (focusState2 != focusTargetNode4.getFocusState() || linkedHashSet.contains(focusTargetNode4)) {
                                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode4);
                                }
                            }
                        }
                        this.this$0.focusTargetNodes.clear();
                        linkedHashSet.clear();
                        if (!this.this$0.focusPropertiesNodes.isEmpty()) {
                            throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
                        }
                        if (!this.this$0.focusEventNodes.isEmpty()) {
                            throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                        }
                        if (!this.this$0.focusTargetNodes.isEmpty()) {
                            throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                        }
                        return;
                    }
                    FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) it3.next();
                    if (focusPropertiesModifierNode.getNode().getIsAttached()) {
                        int iM3004constructorimpl2 = NodeKind.m3004constructorimpl(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                        Modifier.Node node3 = focusPropertiesModifierNode.getNode();
                        MutableVector mutableVector5 = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                focusInvalidationManager.focusTargetNodes.add((FocusTargetNode) node3);
                            } else if (((node3.getKindSet() & iM3004constructorimpl2) != 0) && (node3 instanceof DelegatingNode)) {
                                int i9 = 0;
                                for (Modifier.Node delegate3 = ((DelegatingNode) node3).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                                    if ((delegate3.getKindSet() & iM3004constructorimpl2) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            node3 = delegate3;
                                        } else {
                                            if (mutableVector5 == null) {
                                                mutableVector5 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                mutableVector5.add(node3);
                                                node3 = null;
                                            }
                                            mutableVector5.add(delegate3);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.pop(mutableVector5);
                        }
                        if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                        MutableVector mutableVector6 = new MutableVector(new Modifier.Node[16], 0);
                        Modifier.Node child2 = focusPropertiesModifierNode.getNode().getChild();
                        if (child2 == null) {
                            DelegatableNodeKt.addLayoutNodeChildren(mutableVector6, focusPropertiesModifierNode.getNode());
                        } else {
                            mutableVector6.add(child2);
                        }
                        while (mutableVector6.isNotEmpty()) {
                            Modifier.Node nodePop2 = (Modifier.Node) mutableVector6.removeAt(mutableVector6.getSize() - 1);
                            if ((nodePop2.getAggregateChildKindSet() & iM3004constructorimpl2) == 0) {
                                DelegatableNodeKt.addLayoutNodeChildren(mutableVector6, nodePop2);
                            } else {
                                while (nodePop2 != null) {
                                    if ((nodePop2.getKindSet() & iM3004constructorimpl2) != 0) {
                                        MutableVector mutableVector7 = null;
                                        while (nodePop2 != null) {
                                            if (nodePop2 instanceof FocusTargetNode) {
                                                focusInvalidationManager.focusTargetNodes.add((FocusTargetNode) nodePop2);
                                            } else if (((nodePop2.getKindSet() & iM3004constructorimpl2) != 0) && (nodePop2 instanceof DelegatingNode)) {
                                                int i10 = 0;
                                                for (Modifier.Node delegate4 = ((DelegatingNode) nodePop2).getDelegate(); delegate4 != null; delegate4 = delegate4.getChild()) {
                                                    if ((delegate4.getKindSet() & iM3004constructorimpl2) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            nodePop2 = delegate4;
                                                        } else {
                                                            if (mutableVector7 == null) {
                                                                mutableVector7 = new MutableVector(new Modifier.Node[16], 0);
                                                            }
                                                            if (nodePop2 != null) {
                                                                mutableVector7.add(nodePop2);
                                                                nodePop2 = null;
                                                            }
                                                            mutableVector7.add(delegate4);
                                                        }
                                                    }
                                                }
                                                if (i10 == 1) {
                                                }
                                            }
                                            nodePop2 = DelegatableNodeKt.pop(mutableVector7);
                                        }
                                        break;
                                    }
                                    nodePop2 = nodePop2.getChild();
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    public final void scheduleInvalidation(@NotNull FocusTargetNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        scheduleInvalidation(this.focusTargetNodes, node);
    }

    public final void scheduleInvalidation(@NotNull FocusEventModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        scheduleInvalidation(this.focusEventNodes, node);
    }

    public final void scheduleInvalidation(@NotNull FocusPropertiesModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        scheduleInvalidation(this.focusPropertiesNodes, node);
    }

    private final <T> void scheduleInvalidation(Set<T> set, T t) {
        if (set.add(t)) {
            if (this.focusPropertiesNodes.size() + this.focusEventNodes.size() + this.focusTargetNodes.size() == 1) {
                this.onRequestApplyChangesListener.invoke(this.invalidateNodes);
            }
        }
    }
}
