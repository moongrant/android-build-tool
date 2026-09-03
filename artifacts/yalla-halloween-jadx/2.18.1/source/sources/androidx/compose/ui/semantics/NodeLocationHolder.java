package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000000.OooOOO;
import o000000.oo000o;
import o00000O0.oo0o0Oo;
import o00O0O.OooOO0O;
import o0O0O00.Oooo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class NodeLocationHolder implements Comparable<NodeLocationHolder> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f6649Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final LayoutNode f6650Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final LayoutNode f6651Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public final OooOO0O f6652Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public static final OooO00o f6648OoooO00 = new OooO00o();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public static ComparisonStrategy f6647OoooO0 = ComparisonStrategy.Stripe;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "", "Stripe", "Location", "ui_release"}, k = 1, mv = {1, 6, 0})
    public enum ComparisonStrategy {
        Stripe,
        Location
    }

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f6653Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooOO0O oooOO0O) {
            super(1);
            this.f6653Oooo0o = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            oo000o oo000oVarOooO0OO = oo0o0Oo.OooO0OO(it);
            return Boolean.valueOf(oo000oVarOooO0OO.OooOoO() && !Intrinsics.areEqual(this.f6653Oooo0o, Oooo0.OooO0O0(oo000oVarOooO0OO)));
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<LayoutNode, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f6654Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooOO0O oooOO0O) {
            super(1);
            this.f6654Oooo0o = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(LayoutNode layoutNode) {
            LayoutNode it = layoutNode;
            Intrinsics.checkNotNullParameter(it, "it");
            oo000o oo000oVarOooO0OO = oo0o0Oo.OooO0OO(it);
            return Boolean.valueOf(oo000oVarOooO0OO.OooOoO() && !Intrinsics.areEqual(this.f6654Oooo0o, Oooo0.OooO0O0(oo000oVarOooO0OO)));
        }
    }

    public NodeLocationHolder(@NotNull LayoutNode subtreeRoot, @NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(subtreeRoot, "subtreeRoot");
        Intrinsics.checkNotNullParameter(node, "node");
        this.f6650Oooo0o = subtreeRoot;
        this.f6651Oooo0oO = node;
        this.f6649Oooo = subtreeRoot.f6152OooooO0;
        OooOOO oooOOO = subtreeRoot.f6165o00Ooo;
        oo000o oo000oVarOooO0OO = oo0o0Oo.OooO0OO(node);
        this.f6652Oooo0oo = (oooOOO.OooOoO() && oo000oVarOooO0OO.OooOoO()) ? oooOOO.Oooo(oo000oVarOooO0OO, true) : null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull NodeLocationHolder other) {
        Intrinsics.checkNotNullParameter(other, "other");
        OooOO0O oooOO0O = this.f6652Oooo0oo;
        if (oooOO0O == null) {
            return 1;
        }
        OooOO0O oooOO0O2 = other.f6652Oooo0oo;
        if (oooOO0O2 == null) {
            return -1;
        }
        if (f6647OoooO0 == ComparisonStrategy.Stripe) {
            if (oooOO0O.f30407OooO0Oo - oooOO0O2.f30405OooO0O0 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return -1;
            }
            if (oooOO0O.f30405OooO0O0 - oooOO0O2.f30407OooO0Oo >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return 1;
            }
        }
        if (this.f6649Oooo == LayoutDirection.Ltr) {
            float f = oooOO0O.f30404OooO00o - oooOO0O2.f30404OooO00o;
            if (!(f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                return f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? -1 : 1;
            }
        } else {
            float f2 = oooOO0O.f30406OooO0OO - oooOO0O2.f30406OooO0OO;
            if (!(f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                return f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : -1;
            }
        }
        float f3 = oooOO0O.f30405OooO0O0;
        float f4 = oooOO0O2.f30405OooO0O0;
        float f5 = f3 - f4;
        if (!(f5 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            return f5 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? -1 : 1;
        }
        float f6 = (oooOO0O.f30407OooO0Oo - f3) - (oooOO0O2.f30407OooO0Oo - f4);
        if (!(f6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            return f6 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : -1;
        }
        float f7 = (oooOO0O.f30406OooO0OO - oooOO0O.f30404OooO00o) - (oooOO0O2.f30406OooO0OO - oooOO0O2.f30404OooO00o);
        if (!(f7 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            return f7 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : -1;
        }
        OooOO0O oooOO0OOooO0O0 = Oooo0.OooO0O0(oo0o0Oo.OooO0OO(this.f6651Oooo0oO));
        OooOO0O oooOO0OOooO0O1 = Oooo0.OooO0O0(oo0o0Oo.OooO0OO(other.f6651Oooo0oO));
        LayoutNode layoutNodeOooO00o = oo0o0Oo.OooO00o(this.f6651Oooo0oO, new OooO0O0(oooOO0OOooO0O0));
        LayoutNode layoutNodeOooO00o2 = oo0o0Oo.OooO00o(other.f6651Oooo0oO, new OooO0OO(oooOO0OOooO0O1));
        if (layoutNodeOooO00o == null || layoutNodeOooO00o2 == null) {
            return layoutNodeOooO00o != null ? 1 : -1;
        }
        return new NodeLocationHolder(this.f6650Oooo0o, layoutNodeOooO00o).compareTo(new NodeLocationHolder(other.f6650Oooo0o, layoutNodeOooO00o2));
    }
}
