package o000000;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LayoutNode f26705OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0o f26706OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f26707OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f26708OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f26709OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final p036OoooOOO.o000OOo<o00000.OooO00o> f26710OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final List<LayoutNode> f26711OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o0000O0O.OooO0O0 f26712OooO0oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            iArr[LayoutNode.LayoutState.Idle.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o0ooOOo(@NotNull LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f26705OooO00o = root;
        this.f26706OooO0O0 = new OooO0o();
        this.f26708OooO0Oo = new o0O0O00();
        this.f26710OooO0o0 = new p036OoooOOO.o000OOo<>(new o00000.OooO00o[16]);
        this.f26709OooO0o = 1L;
        this.f26711OooO0oO = new ArrayList();
    }

    public final boolean OooO(@NotNull LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = OooO00o.$EnumSwitchMapping$0[layoutNode.f6158OoooOOo.ordinal()];
        if (i == 1 || i == 2) {
            return false;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if ((layoutNode.f6174o000000o || layoutNode.f6171o00000) && !z) {
            return false;
        }
        layoutNode.f6171o00000 = true;
        if (layoutNode.f6170Ooooooo) {
            LayoutNode layoutNodeOooOOoo = layoutNode.OooOOoo();
            if (!(layoutNodeOooOOoo != null && layoutNodeOooOOoo.f6171o00000)) {
                if (!(layoutNodeOooOOoo != null && layoutNodeOooOOoo.f6174o000000o)) {
                    this.f26706OooO0O0.OooO00o(layoutNode);
                }
            }
        }
        return !this.f26707OooO0OO;
    }

    public final void OooO00o() {
        p036OoooOOO.o000OOo<o00000.OooO00o> o000ooo2 = this.f26710OooO0o0;
        int i = o000ooo2.f3678OoooO0;
        if (i > 0) {
            int i2 = 0;
            o00000.OooO00o[] oooO00oArr = o000ooo2.f3677Oooo;
            do {
                oooO00oArr[i2].OooO00o();
                i2++;
            } while (i2 < i);
        }
        this.f26710OooO0o0.OooO0o0();
    }

    public final void OooO0O0(boolean z) {
        if (z) {
            o0O0O00 o0o0o00 = this.f26708OooO0Oo;
            LayoutNode rootNode = this.f26705OooO00o;
            Objects.requireNonNull(o0o0o00);
            Intrinsics.checkNotNullParameter(rootNode, "rootNode");
            o0o0o00.f26676OooO00o.OooO0o0();
            o0o0o00.f26676OooO00o.OooO0O0(rootNode);
            rootNode.f6172o000000 = true;
        }
        o0O0O00 o0o0o01 = this.f26708OooO0Oo;
        o0o0o01.f26676OooO00o.OooOOO(oo0o0Oo.f26756Oooo);
        p036OoooOOO.o000OOo<LayoutNode> o000ooo2 = o0o0o01.f26676OooO00o;
        int i = o000ooo2.f3678OoooO0;
        if (i > 0) {
            int i2 = i - 1;
            LayoutNode[] layoutNodeArr = o000ooo2.f3677Oooo;
            do {
                LayoutNode layoutNode = layoutNodeArr[i2];
                if (layoutNode.f6172o000000) {
                    o0o0o01.OooO00o(layoutNode);
                }
                i2--;
            } while (i2 >= 0);
        }
        o0o0o01.f26676OooO00o.OooO0o0();
    }

    public final boolean OooO0OO(LayoutNode layoutNode, o0000O0O.OooO0O0 oooO0O0) {
        boolean zOooo0oO = oooO0O0 != null ? layoutNode.Oooo0oO(oooO0O0) : LayoutNode.Oooo0oo(layoutNode);
        LayoutNode layoutNodeOooOOoo = layoutNode.OooOOoo();
        if (zOooo0oO && layoutNodeOooOOoo != null) {
            LayoutNode.UsageByParent usageByParent = layoutNode.f6179o00Oo0;
            if (usageByParent == LayoutNode.UsageByParent.InMeasureBlock) {
                OooOO0(layoutNodeOooOOoo, false);
            } else if (usageByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                OooO(layoutNodeOooOOoo, false);
            }
        }
        return zOooo0oO;
    }

    public final void OooO0Oo(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.f26706OooO0O0.OooO0O0()) {
            return;
        }
        if (!this.f26707OooO0OO) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(!layoutNode.f6174o000000o)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        p036OoooOOO.o000OOo<LayoutNode> o000oooOooOo0 = layoutNode.OooOo0();
        int i = o000oooOooOo0.f3678OoooO0;
        if (i > 0) {
            int i2 = 0;
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3677Oooo;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i2];
                if (layoutNode2.f6174o000000o && this.f26706OooO0O0.OooO0OO(layoutNode2)) {
                    OooO0oo(layoutNode2);
                }
                if (!layoutNode2.f6174o000000o) {
                    OooO0Oo(layoutNode2);
                }
                i2++;
            } while (i2 < i);
        }
        if (layoutNode.f6174o000000o && this.f26706OooO0O0.OooO0OO(layoutNode)) {
            OooO0oo(layoutNode);
        }
    }

    public final boolean OooO0o(@Nullable Function0<Unit> function0) {
        boolean z;
        if (!this.f26705OooO00o.OooOoo0()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.f26705OooO00o.f6170Ooooooo) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.f26707OooO0OO)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        boolean z2 = false;
        if (this.f26712OooO0oo != null) {
            this.f26707OooO0OO = true;
            try {
                if (!this.f26706OooO0O0.OooO0O0()) {
                    OooO0o oooO0o = this.f26706OooO0O0;
                    z = false;
                    while (!oooO0o.OooO0O0()) {
                        LayoutNode node = oooO0o.f26610OooO0OO.first();
                        Intrinsics.checkNotNullExpressionValue(node, "node");
                        oooO0o.OooO0OO(node);
                        boolean zOooO0oo = OooO0oo(node);
                        if (node == this.f26705OooO00o && zOooO0oo) {
                            z = true;
                        }
                    }
                    if (function0 != null) {
                        ((AndroidComposeView.OooOO0O) function0).invoke();
                    }
                } else {
                    z = false;
                }
                this.f26707OooO0OO = false;
                z2 = z;
            } catch (Throwable th) {
                this.f26707OooO0OO = false;
                throw th;
            }
        }
        OooO00o();
        return z2;
    }

    public final boolean OooO0o0(LayoutNode layoutNode) {
        return layoutNode.f6174o000000o && (layoutNode.f6179o00Oo0 == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.f6169OoooooO.OooO0O0());
    }

    public final void OooO0oO(@NotNull LayoutNode node, long j) {
        Intrinsics.checkNotNullParameter(node, "layoutNode");
        if (!(!Intrinsics.areEqual(node, this.f26705OooO00o))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.f26705OooO00o.OooOoo0()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.f26705OooO00o.f6170Ooooooo) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.f26707OooO0OO)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f26712OooO0oo != null) {
            this.f26707OooO0OO = true;
            try {
                this.f26706OooO0O0.OooO0OO(node);
                OooO0OO(node, new o0000O0O.OooO0O0(j));
                if (node.f6171o00000 && node.f6170Ooooooo) {
                    node.OoooO0();
                    o0O0O00 o0o0o00 = this.f26708OooO0Oo;
                    Objects.requireNonNull(o0o0o00);
                    Intrinsics.checkNotNullParameter(node, "node");
                    o0o0o00.f26676OooO00o.OooO0O0(node);
                    node.f6172o000000 = true;
                }
                this.f26707OooO0OO = false;
            } catch (Throwable th) {
                this.f26707OooO0OO = false;
                throw th;
            }
        }
        OooO00o();
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList, java.util.List<androidx.compose.ui.node.LayoutNode>] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.ArrayList, java.util.List, java.util.List<androidx.compose.ui.node.LayoutNode>] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.ArrayList, java.util.List<androidx.compose.ui.node.LayoutNode>] */
    public final boolean OooO0oo(LayoutNode node) {
        boolean zOooO0OO;
        o0000O0O.OooO0O0 oooO0O0;
        if (!node.f6170Ooooooo && !OooO0o0(node) && !node.f6169OoooooO.OooO0O0()) {
            return false;
        }
        if (node.f6174o000000o) {
            if (node == this.f26705OooO00o) {
                oooO0O0 = this.f26712OooO0oo;
                Intrinsics.checkNotNull(oooO0O0);
            } else {
                oooO0O0 = null;
            }
            zOooO0OO = OooO0OO(node, oooO0O0);
        } else {
            zOooO0OO = false;
        }
        if (node.f6171o00000 && node.f6170Ooooooo) {
            if (node == this.f26705OooO00o) {
                if (node.f6180o00Ooo == LayoutNode.UsageByParent.NotUsed) {
                    node.OooOO0o();
                }
                o000O000.OooO00o.C0363OooO00o c0363OooO00o = o000O000.OooO00o.f35289OooO00o;
                int iOoooOoO = node.f6183o00oO0o.OoooOoO();
                LayoutDirection layoutDirection = node.f6168Oooooo0;
                int i = o000O000.OooO00o.f35291OooO0OO;
                LayoutDirection layoutDirection2 = o000O000.OooO00o.f35290OooO0O0;
                o000O000.OooO00o.f35291OooO0OO = iOoooOoO;
                o000O000.OooO00o.f35290OooO0O0 = layoutDirection;
                o000O000.OooO00o.OooO0oO(c0363OooO00o, node.f6183o00oO0o, 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
                o000O000.OooO00o.f35291OooO0OO = i;
                o000O000.OooO00o.f35290OooO0O0 = layoutDirection2;
            } else {
                node.OoooO0();
            }
            o0O0O00 o0o0o00 = this.f26708OooO0Oo;
            Objects.requireNonNull(o0o0o00);
            Intrinsics.checkNotNullParameter(node, "node");
            o0o0o00.f26676OooO00o.OooO0O0(node);
            node.f6172o000000 = true;
        }
        if (!this.f26711OooO0oO.isEmpty()) {
            ?? r14 = this.f26711OooO0oO;
            int size = r14.size();
            for (int i2 = 0; i2 < size; i2++) {
                LayoutNode layoutNode = (LayoutNode) r14.get(i2);
                if (layoutNode.OooOoo0()) {
                    OooOO0(layoutNode, false);
                }
            }
            this.f26711OooO0oO.clear();
        }
        return zOooO0OO;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List<androidx.compose.ui.node.LayoutNode>] */
    public final boolean OooOO0(@NotNull LayoutNode layoutNode, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        int i = OooO00o.$EnumSwitchMapping$0[layoutNode.f6158OoooOOo.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            this.f26711OooO0oO.add(layoutNode);
            return false;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (layoutNode.f6174o000000o && !z) {
            return false;
        }
        layoutNode.f6174o000000o = true;
        if (layoutNode.f6170Ooooooo || OooO0o0(layoutNode)) {
            LayoutNode layoutNodeOooOOoo = layoutNode.OooOOoo();
            if (!(layoutNodeOooOOoo != null && layoutNodeOooOOoo.f6174o000000o)) {
                this.f26706OooO0O0.OooO00o(layoutNode);
            }
        }
        return !this.f26707OooO0OO;
    }

    public final void OooOO0O(long j) {
        o0000O0O.OooO0O0 oooO0O0 = this.f26712OooO0oo;
        if (oooO0O0 == null ? false : o0000O0O.OooO0O0.OooO0O0(oooO0O0.f27322OooO00o, j)) {
            return;
        }
        if (!(!this.f26707OooO0OO)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f26712OooO0oo = new o0000O0O.OooO0O0(j);
        LayoutNode layoutNode = this.f26705OooO00o;
        layoutNode.f6174o000000o = true;
        this.f26706OooO0O0.OooO00o(layoutNode);
    }
}
