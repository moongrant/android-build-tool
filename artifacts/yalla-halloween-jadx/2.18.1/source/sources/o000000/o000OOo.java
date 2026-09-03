package o000000;

import androidx.compose.ui.node.LayoutNode;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo extends o000O000 implements o0O0O00.o0O0O00 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f26634OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public oo000o f26635OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final LayoutNode f26636OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f26637OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f26638OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public Function1<? super p145o00Oo0.o0000, Unit> f26639OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f26640OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public Object f26641OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public long f26642o000oOoO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<p145o00Oo0.o0000, Unit> f26643Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f26645Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f26646Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(long j, float f, Function1<? super p145o00Oo0.o0000, Unit> function1) {
            super(0);
            this.f26645Oooo0oO = j;
            this.f26646Oooo0oo = f;
            this.f26643Oooo = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000OOo o000ooo2 = o000OOo.this;
            long j = this.f26645Oooo0oO;
            float f = this.f26646Oooo0oo;
            Function1<p145o00Oo0.o0000, Unit> function1 = this.f26643Oooo;
            Objects.requireNonNull(o000ooo2);
            o000O000.OooO00o.C0363OooO00o c0363OooO00o = o000O000.OooO00o.f35268OooO00o;
            if (function1 == null) {
                c0363OooO00o.OooO0o0(o000ooo2.f26635OoooO0, j, f);
            } else {
                c0363OooO00o.OooOO0o(o000ooo2.f26635OoooO0, j, f, function1);
            }
            return Unit.INSTANCE;
        }
    }

    public o000OOo(@NotNull LayoutNode layoutNode, @NotNull oo000o outerWrapper) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(outerWrapper, "outerWrapper");
        this.f26636OoooO00 = layoutNode;
        this.f26635OoooO0 = outerWrapper;
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
        this.f26642o000oOoO = o0000O0O.OooOo.f27311OooO0OO;
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOOO(int i) {
        o0ooOO0();
        return this.f26635OoooO0.OooOOO(i);
    }

    @Override // o0O0O00.o00000O
    public final int OooOo0o(@NotNull o0O0O00.OooO00o alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LayoutNode layoutNodeOooOOoo = this.f26636OoooO00.OooOOoo();
        if ((layoutNodeOooOOoo != null ? layoutNodeOooOOoo.f6144OoooOO0 : null) == LayoutNode.LayoutState.Measuring) {
            this.f26636OoooO00.f6154OooooOo.f26680OooO0OO = true;
        } else {
            LayoutNode layoutNodeOooOOoo2 = this.f26636OoooO00.OooOOoo();
            if ((layoutNodeOooOOoo2 != null ? layoutNodeOooOOoo2.f6144OoooOO0 : null) == LayoutNode.LayoutState.LayingOut) {
                this.f26636OoooO00.f6154OooooOo.f26681OooO0Oo = true;
            }
        }
        this.f26638OoooOO0 = true;
        int iOooOo0o = this.f26635OoooO0.OooOo0o(alignmentLine);
        this.f26638OoooOO0 = false;
        return iOooOo0o;
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOoo(int i) {
        o0ooOO0();
        return this.f26635OoooO0.OooOoo(i);
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOooO(int i) {
        o0ooOO0();
        return this.f26635OoooO0.OooOooO(i);
    }

    @Override // o0O0O00.o0O0O00
    @NotNull
    public final o000O000 Oooo000(long j) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode layoutNodeOooOOoo = this.f26636OoooO00.OooOOoo();
        if (layoutNodeOooOOoo != null) {
            LayoutNode layoutNode = this.f26636OoooO00;
            if (!(layoutNode.f6174o0OoOo0 == LayoutNode.UsageByParent.NotUsed || layoutNode.f6164o00Oo0)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("measure() may not be called multiple times on the same Measurable. Current state ");
                sbOooO0o0.append(this.f26636OoooO00.f6174o0OoOo0);
                sbOooO0o0.append(". Parent state ");
                sbOooO0o0.append(layoutNodeOooOOoo.f6144OoooOO0);
                sbOooO0o0.append('.');
                throw new IllegalStateException(sbOooO0o0.toString().toString());
            }
            int i = OooO00o.$EnumSwitchMapping$0[layoutNodeOooOOoo.f6144OoooOO0.ordinal()];
            if (i == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i != 2) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Measurable could be only measured from the parent's measure or layout block.Parents state is ");
                    sbOooO0o1.append(layoutNodeOooOOoo.f6144OoooOO0);
                    throw new IllegalStateException(sbOooO0o1.toString());
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            layoutNode.OoooOOO(usageByParent);
        } else {
            this.f26636OoooO00.OoooOOO(LayoutNode.UsageByParent.NotUsed);
        }
        o0ooOoO(j);
        return this;
    }

    @Override // o0O0O00.o000O000, o0O0O00.OooOOOO
    @Nullable
    public final Object Oooo0o() {
        return this.f26641OoooOo0;
    }

    @Override // o0O0O00.OooOOOO
    public final int OoooO(int i) {
        o0ooOO0();
        return this.f26635OoooO0.OoooO(i);
    }

    @Override // o0O0O00.o000O000
    public final int OoooOOO() {
        return this.f26635OoooO0.OoooOOO();
    }

    @Override // o0O0O00.o000O000
    public final int OoooOoO() {
        return this.f26635OoooO0.OoooOoO();
    }

    @Override // o0O0O00.o000O000
    public final void OooooOo(long j, float f, @Nullable Function1<? super p145o00Oo0.o0000, Unit> function1) {
        this.f26642o000oOoO = j;
        this.f26640OoooOOo = f;
        this.f26639OoooOOO = function1;
        oo000o oo000oVar = this.f26635OoooO0;
        oo000o oo000oVar2 = oo000oVar.f26701OoooO0;
        if (oo000oVar2 != null && oo000oVar2.f26711Ooooo0o) {
            o000O000.OooO00o.C0363OooO00o c0363OooO00o = o000O000.OooO00o.f35268OooO00o;
            if (function1 == null) {
                c0363OooO00o.OooO0o0(oo000oVar, j, f);
                return;
            } else {
                c0363OooO00o.OooOO0o(oo000oVar, j, f, function1);
                return;
            }
        }
        this.f26634OoooO = true;
        LayoutNode layoutNode = this.f26636OoooO00;
        layoutNode.f6154OooooOo.f26684OooO0oO = false;
        o00000OO snapshotObserver = o00Ooo.OooO00o(layoutNode).getF6257o0OoOo0();
        LayoutNode node = this.f26636OoooO00;
        OooO0O0 block = new OooO0O0(j, f, function1);
        Objects.requireNonNull(snapshotObserver);
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        snapshotObserver.OooO00o(node, snapshotObserver.f26630OooO0Oo, block);
    }

    public final void o0ooOO0() {
        LayoutNode.UsageByParent usageByParent;
        this.f26636OoooO00.OoooOO0(false);
        LayoutNode layoutNodeOooOOoo = this.f26636OoooO00.OooOOoo();
        if (layoutNodeOooOOoo != null) {
            LayoutNode layoutNode = this.f26636OoooO00;
            if (layoutNode.f6180ooOO == LayoutNode.UsageByParent.NotUsed) {
                int i = OooO00o.$EnumSwitchMapping$0[layoutNodeOooOOoo.f6144OoooOO0.ordinal()];
                if (i != 1) {
                    usageByParent = i != 2 ? layoutNodeOooOOoo.f6180ooOO : LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
                layoutNode.f6180ooOO = usageByParent;
            }
        }
    }

    public final boolean o0ooOoO(long j) {
        o00000 o00000VarOooO00o = o00Ooo.OooO00o(this.f26636OoooO00);
        LayoutNode layoutNodeOooOOoo = this.f26636OoooO00.OooOOoo();
        LayoutNode layoutNode = this.f26636OoooO00;
        boolean z = true;
        layoutNode.f6164o00Oo0 = layoutNode.f6164o00Oo0 || (layoutNodeOooOOoo != null && layoutNodeOooOOoo.f6164o00Oo0);
        if (!layoutNode.f6161o000OOo && o0000O0O.OooO0O0.OooO0O0(this.f35264Oooo, j)) {
            o00000VarOooO00o.OooO0oO(this.f26636OoooO00);
            this.f26636OoooO00.o000oOoO();
            return false;
        }
        LayoutNode layoutNode2 = this.f26636OoooO00;
        layoutNode2.f6154OooooOo.f26682OooO0o = false;
        p036OoooOOO.o000OOo<LayoutNode> o000oooOooOo0 = layoutNode2.OooOo0();
        int i = o000oooOooOo0.f3664Oooo0oo;
        if (i > 0) {
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
            int i2 = 0;
            do {
                layoutNodeArr[i2].f6154OooooOo.f26680OooO0OO = false;
                i2++;
            } while (i2 < i);
        }
        this.f26637OoooO0O = true;
        long j2 = this.f26635OoooO0.f35267Oooo0oo;
        if (!o0000O0O.OooO0O0.OooO0O0(this.f35264Oooo, j)) {
            this.f35264Oooo = j;
            Oooooo();
        }
        LayoutNode node = this.f26636OoooO00;
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        node.f6144OoooOO0 = layoutState;
        node.f6161o000OOo = false;
        o00000OO snapshotObserver = o00Ooo.OooO00o(node).getF6257o0OoOo0();
        Oooo0 block = new Oooo0(node, j);
        Objects.requireNonNull(snapshotObserver);
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        snapshotObserver.OooO00o(node, snapshotObserver.f26628OooO0O0, block);
        if (node.f6144OoooOO0 == layoutState) {
            node.f6159o000000 = true;
            node.f6144OoooOO0 = LayoutNode.LayoutState.Idle;
        }
        if (o0000O0O.o000oOoO.OooO00o(this.f26635OoooO0.f35267Oooo0oo, j2)) {
            oo000o oo000oVar = this.f26635OoooO0;
            if (oo000oVar.f35265Oooo0o == this.f35265Oooo0o && oo000oVar.f35266Oooo0oO == this.f35266Oooo0oO) {
                z = false;
            }
        }
        oo000o oo000oVar2 = this.f26635OoooO0;
        o0OoOo0(o0000O0O.o0OoOo0.OooO00o(oo000oVar2.f35265Oooo0o, oo000oVar2.f35266Oooo0oO));
        return z;
    }
}
