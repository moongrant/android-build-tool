package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a!\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u000e\u001a!\u0010\u0013\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u000e\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0002\u001a\f\u0010\u0019\u001a\u00020\u0001*\u00020\u0002H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "clearChildFocus", "forced", "refreshFocusEvents", "clearFocus", "freeFocus", "grantFocus", "performCustomClearFocus", "Landroidx/compose/ui/focus/CustomDestinationResult;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "performCustomClearFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomEnter", "performCustomEnter-Mxy_nc0", "performCustomExit", "performCustomExit-Mxy_nc0", "performCustomRequestFocus", "performCustomRequestFocus-Mxy_nc0", "performRequestFocus", "requestFocus", "requestFocusForChild", "childNode", "requestFocusForOwner", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n1#1,299:1\n90#2:300\n90#2:369\n90#2:438\n90#2:507\n262#3:301\n230#3,5:302\n58#3:307\n59#3,8:309\n383#3,5:317\n263#3:322\n388#3:323\n393#3,2:325\n395#3,8:330\n403#3,9:341\n412#3,8:353\n68#3,7:361\n265#3:368\n262#3:370\n230#3,5:371\n58#3:376\n59#3,8:378\n383#3,5:386\n263#3:391\n388#3:392\n393#3,2:394\n395#3,8:399\n403#3,9:410\n412#3,8:422\n68#3,7:430\n265#3:437\n262#3:439\n230#3,5:440\n58#3:445\n59#3,8:447\n383#3,5:455\n263#3:460\n388#3:461\n393#3,2:463\n395#3,8:468\n403#3,9:479\n412#3,8:491\n68#3,7:499\n265#3:506\n262#3:508\n230#3,5:509\n58#3:514\n59#3,8:516\n383#3,5:524\n263#3:529\n388#3:530\n393#3,2:532\n395#3,8:537\n403#3,9:548\n412#3,8:560\n68#3,7:568\n265#3:575\n1#4:308\n1#4:377\n1#4:446\n1#4:515\n1#4:576\n261#5:324\n261#5:393\n261#5:462\n261#5:531\n234#6,3:327\n237#6,3:350\n234#6,3:396\n237#6,3:419\n234#6,3:465\n237#6,3:488\n234#6,3:534\n237#6,3:557\n1182#7:338\n1161#7,2:339\n1182#7:407\n1161#7,2:408\n1182#7:476\n1161#7,2:477\n1182#7:545\n1161#7,2:546\n105#8,12:577\n132#8,12:589\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n67#1:300\n188#1:369\n212#1:438\n255#1:507\n67#1:301\n67#1:302,5\n67#1:307\n67#1:309,8\n67#1:317,5\n67#1:322\n67#1:323\n67#1:325,2\n67#1:330,8\n67#1:341,9\n67#1:353,8\n67#1:361,7\n67#1:368\n188#1:370\n188#1:371,5\n188#1:376\n188#1:378,8\n188#1:386,5\n188#1:391\n188#1:392\n188#1:394,2\n188#1:399,8\n188#1:410,9\n188#1:422,8\n188#1:430,7\n188#1:437\n212#1:439\n212#1:440,5\n212#1:445\n212#1:447,8\n212#1:455,5\n212#1:460\n212#1:461\n212#1:463,2\n212#1:468,8\n212#1:479,9\n212#1:491,8\n212#1:499,7\n212#1:506\n255#1:508\n255#1:509,5\n255#1:514\n255#1:516,8\n255#1:524,5\n255#1:529\n255#1:530\n255#1:532,2\n255#1:537,8\n255#1:548,9\n255#1:560,8\n255#1:568,7\n255#1:575\n67#1:308\n188#1:377\n212#1:446\n255#1:515\n67#1:324\n188#1:393\n212#1:462\n255#1:531\n67#1:327,3\n67#1:350,3\n188#1:396,3\n188#1:419,3\n212#1:465,3\n212#1:488,3\n255#1:534,3\n255#1:557,3\n67#1:338\n67#1:339,2\n188#1:407\n188#1:408,2\n212#1:476\n212#1:477,2\n255#1:545\n255#1:546,2\n282#1:577,12\n293#1:589,12\n*E\n"})
public final class FocusTransactionsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean captureFocus(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            focusTargetNode.setFocusState(FocusStateImpl.Captured);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return true;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean clearChildFocus(FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z, z2);
        }
        return true;
    }

    public static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return clearChildFocus(focusTargetNode, z, z2);
    }

    public static final boolean clearFocus(@NotNull FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            focusTargetNode.setFocusState(FocusStateImpl.Inactive);
            if (z2) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
        } else {
            if (i == 2) {
                if (!z) {
                    return z;
                }
                focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                if (!z2) {
                    return z;
                }
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                return z;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!clearChildFocus(focusTargetNode, z, z2)) {
                    return false;
                }
                focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                if (z2) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                }
            }
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetNode, z, z2);
    }

    public static final boolean freeFocus(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            focusTargetNode.setFocusState(FocusStateImpl.Active);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean grantFocus(final FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.grantFocus.1
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
                focusTargetNode.fetchFocusProperties$ui_release();
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i != 3 && i != 4) {
            return true;
        }
        focusTargetNode.setFocusState(FocusStateImpl.Active);
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m1395performCustomClearFocusMxy_nc0(@NotNull FocusTargetNode performCustomClearFocus, int i) {
        Intrinsics.checkNotNullParameter(performCustomClearFocus, "$this$performCustomClearFocus");
        int i2 = WhenMappings.$EnumSwitchMapping$1[performCustomClearFocus.getFocusState().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(performCustomClearFocus);
                if (activeChild == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                CustomDestinationResult customDestinationResultM1395performCustomClearFocusMxy_nc0 = m1395performCustomClearFocusMxy_nc0(activeChild, i);
                if (customDestinationResultM1395performCustomClearFocusMxy_nc0 == CustomDestinationResult.None) {
                    customDestinationResultM1395performCustomClearFocusMxy_nc0 = null;
                }
                return customDestinationResultM1395performCustomClearFocusMxy_nc0 == null ? m1397performCustomExitMxy_nc0(performCustomClearFocus, i) : customDestinationResultM1395performCustomClearFocusMxy_nc0;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m1396performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusRequester focusRequesterInvoke = focusTargetNode.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m1363boximpl(i));
                FocusRequester.Companion companion = FocusRequester.INSTANCE;
                if (focusRequesterInvoke != companion.getDefault()) {
                    if (focusRequesterInvoke == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequesterInvoke.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return CustomDestinationResult.None;
    }

    /* JADX INFO: renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m1397performCustomExitMxy_nc0(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusRequester focusRequesterInvoke = focusTargetNode.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m1363boximpl(i));
                FocusRequester.Companion companion = FocusRequester.INSTANCE;
                if (focusRequesterInvoke != companion.getDefault()) {
                    if (focusRequesterInvoke == companion.getCancel()) {
                        return CustomDestinationResult.Cancelled;
                    }
                    return focusRequesterInvoke.focus$ui_release() ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return CustomDestinationResult.None;
    }

    @NotNull
    /* JADX INFO: renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m1398performCustomRequestFocusMxy_nc0(@NotNull FocusTargetNode performCustomRequestFocus, int i) {
        Modifier.Node nodePop;
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(performCustomRequestFocus, "$this$performCustomRequestFocus");
        int i2 = WhenMappings.$EnumSwitchMapping$1[performCustomRequestFocus.getFocusState().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return CustomDestinationResult.None;
        }
        if (i2 == 3) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(performCustomRequestFocus);
            if (activeChild != null) {
                return m1395performCustomClearFocusMxy_nc0(activeChild, i);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iM3004constructorimpl = NodeKind.m3004constructorimpl(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (!performCustomRequestFocus.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = performCustomRequestFocus.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(performCustomRequestFocus);
        loop0: while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                nodePop = null;
                break;
            }
            if ((OooO00o.OooO00o(layoutNodeRequireLayoutNode) & iM3004constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3004constructorimpl) != 0) {
                        nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if (((nodePop.getKindSet() & iM3004constructorimpl) != 0) && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                    if ((delegate$ui_release.getKindSet() & iM3004constructorimpl) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
        if (focusTargetNode == null) {
            return CustomDestinationResult.None;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i4 == 1) {
            return m1396performCustomEnterMxy_nc0(focusTargetNode, i);
        }
        if (i4 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i4 == 3) {
            return m1398performCustomRequestFocusMxy_nc0(focusTargetNode, i);
        }
        if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        CustomDestinationResult customDestinationResultM1398performCustomRequestFocusMxy_nc0 = m1398performCustomRequestFocusMxy_nc0(focusTargetNode, i);
        CustomDestinationResult customDestinationResult = customDestinationResultM1398performCustomRequestFocusMxy_nc0 == CustomDestinationResult.None ? null : customDestinationResultM1398performCustomRequestFocusMxy_nc0;
        return customDestinationResult == null ? m1396performCustomEnterMxy_nc0(focusTargetNode, i) : customDestinationResult;
    }

    public static final boolean performRequestFocus(@NotNull FocusTargetNode focusTargetNode) {
        boolean z;
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return true;
        }
        Modifier.Node node = null;
        if (i == 3) {
            z = clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode);
            if (!z) {
                return z;
            }
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return z;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iM3004constructorimpl = NodeKind.m3004constructorimpl(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (layoutNodeRequireLayoutNode != null) {
            if ((OooO00o.OooO00o(layoutNodeRequireLayoutNode) & iM3004constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3004constructorimpl) != 0) {
                        Modifier.Node nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                node = nodePop;
                                break loop0;
                            }
                            if (((nodePop.getKindSet() & iM3004constructorimpl) != 0) && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                    if ((delegate$ui_release.getKindSet() & iM3004constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
        if (focusTargetNode2 != null) {
            return requestFocusForChild(focusTargetNode2, focusTargetNode);
        }
        z = requestFocusForOwner(focusTargetNode) && grantFocus(focusTargetNode);
        if (!z) {
            return z;
        }
        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
        return z;
    }

    public static final boolean requestFocus(@NotNull FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[m1398performCustomRequestFocusMxy_nc0(focusTargetNode, FocusDirection.INSTANCE.m1375getEnterdhqQ8s()).ordinal()];
        if (i == 1) {
            return performRequestFocus(focusTargetNode);
        }
        if (i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean requestFocusForChild(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.Node node;
        Modifier.Node nodePop;
        NodeChain nodes;
        NodeChain nodes2;
        int iM3004constructorimpl = NodeKind.m3004constructorimpl(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = focusTargetNode2.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            node = null;
            if (layoutNodeRequireLayoutNode == null) {
                nodePop = null;
                break;
            }
            if ((OooO00o.OooO00o(layoutNodeRequireLayoutNode) & iM3004constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM3004constructorimpl) != 0) {
                        nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if (((nodePop.getKindSet() & iM3004constructorimpl) != 0) && (nodePop instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                    if ((delegate$ui_release.getKindSet() & iM3004constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (!Intrinsics.areEqual(nodePop, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i2 == 1) {
            boolean zGrantFocus = grantFocus(focusTargetNode2);
            if (!zGrantFocus) {
                return zGrantFocus;
            }
            focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode2);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return zGrantFocus;
        }
        if (i2 == 2) {
            return false;
        }
        if (i2 == 3) {
            if (FocusTraversalKt.getActiveChild(focusTargetNode) == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            boolean z = clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode2);
            if (z) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode2);
            }
            return z;
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iM3004constructorimpl2 = NodeKind.m3004constructorimpl(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent2 = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop4: while (layoutNodeRequireLayoutNode2 != null) {
            if ((OooO00o.OooO00o(layoutNodeRequireLayoutNode2) & iM3004constructorimpl2) != 0) {
                while (parent2 != null) {
                    if ((parent2.getKindSet() & iM3004constructorimpl2) != 0) {
                        Modifier.Node nodePop2 = parent2;
                        MutableVector mutableVector2 = null;
                        while (nodePop2 != null) {
                            if (nodePop2 instanceof FocusTargetNode) {
                                node = nodePop2;
                                break loop4;
                            }
                            if (((nodePop2.getKindSet() & iM3004constructorimpl2) != 0) && (nodePop2 instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodePop2).getDelegate(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild()) {
                                    if ((delegate$ui_release2.getKindSet() & iM3004constructorimpl2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodePop2 = delegate$ui_release2;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop2 != null) {
                                                mutableVector2.add(nodePop2);
                                                nodePop2 = null;
                                            }
                                            mutableVector2.add(delegate$ui_release2);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            nodePop2 = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                    parent2 = parent2.getParent();
                }
            }
            layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
            parent2 = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
        }
        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
        if (focusTargetNode3 == null && requestFocusForOwner(focusTargetNode)) {
            focusTargetNode.setFocusState(FocusStateImpl.Active);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            return requestFocusForChild(focusTargetNode, focusTargetNode2);
        }
        if (focusTargetNode3 == null || !requestFocusForChild(focusTargetNode3, focusTargetNode)) {
            return false;
        }
        boolean zRequestFocusForChild = requestFocusForChild(focusTargetNode, focusTargetNode2);
        if (focusTargetNode.getFocusState() == FocusStateImpl.ActiveParent) {
            return zRequestFocusForChild;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final boolean requestFocusForOwner(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner;
        NodeCoordinator coordinator = focusTargetNode.getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return owner.requestFocus();
    }
}
