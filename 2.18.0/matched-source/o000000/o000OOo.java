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
    @NotNull
    public final LayoutNode f26653OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public oo000o f26654OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f26655OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f26656OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public long f26657OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public Function1<? super p146o00Oo0.o0000, Unit> f26658OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f26659OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public Object f26660Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f26661o000oOoO;

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

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ float f26663OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f26664OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<p146o00Oo0.o0000, Unit> f26665OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(long j, float f, Function1<? super p146o00Oo0.o0000, Unit> function1) {
            super(0);
            this.f26664OoooO00 = j;
            this.f26663OoooO0 = f;
            this.f26665OoooO0O = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000OOo o000ooo2 = o000OOo.this;
            long j = this.f26664OoooO00;
            float f = this.f26663OoooO0;
            Function1<p146o00Oo0.o0000, Unit> function1 = this.f26665OoooO0O;
            Objects.requireNonNull(o000ooo2);
            o000O000.OooO00o.C0363OooO00o c0363OooO00o = o000O000.OooO00o.f35289OooO00o;
            if (function1 == null) {
                c0363OooO00o.OooO0o0(o000ooo2.f26654OoooOO0, j, f);
            } else {
                c0363OooO00o.OooOO0o(o000ooo2.f26654OoooOO0, j, f, function1);
            }
            return Unit.INSTANCE;
        }
    }

    public o000OOo(@NotNull LayoutNode layoutNode, @NotNull oo000o outerWrapper) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(outerWrapper, "outerWrapper");
        this.f26653OoooO = layoutNode;
        this.f26654OoooOO0 = outerWrapper;
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27330OooO0O0;
        this.f26657OoooOo0 = o0000O0O.OooOo.f27331OooO0OO;
    }

    @Override // o0O0O00.OooOo00
    public final int OooOOO(int i) {
        o0ooOO0();
        return this.f26654OoooOO0.OooOOO(i);
    }

    @Override // o0O0O00.o00000O
    public final int OooOo0o(@NotNull o0O0O00.OooO00o alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LayoutNode layoutNodeOooOOoo = this.f26653OoooO.OooOOoo();
        if ((layoutNodeOooOOoo != null ? layoutNodeOooOOoo.f6158OoooOOo : null) == LayoutNode.LayoutState.Measuring) {
            this.f26653OoooO.f6169OoooooO.f26699OooO0OO = true;
        } else {
            LayoutNode layoutNodeOooOOoo2 = this.f26653OoooO.OooOOoo();
            if ((layoutNodeOooOOoo2 != null ? layoutNodeOooOOoo2.f6158OoooOOo : null) == LayoutNode.LayoutState.LayingOut) {
                this.f26653OoooO.f6169OoooooO.f26700OooO0Oo = true;
            }
        }
        this.f26656OoooOOo = true;
        int iOooOo0o = this.f26654OoooOO0.OooOo0o(alignmentLine);
        this.f26656OoooOOo = false;
        return iOooOo0o;
    }

    @Override // o0O0O00.OooOo00
    public final int OooOoo(int i) {
        o0ooOO0();
        return this.f26654OoooOO0.OooOoo(i);
    }

    @Override // o0O0O00.OooOo00
    public final int OooOooO(int i) {
        o0ooOO0();
        return this.f26654OoooOO0.OooOooO(i);
    }

    @Override // o0O0O00.o0O0O00
    @NotNull
    public final o000O000 Oooo000(long j) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode layoutNodeOooOOoo = this.f26653OoooO.OooOOoo();
        if (layoutNodeOooOOoo != null) {
            LayoutNode layoutNode = this.f26653OoooO;
            if (!(layoutNode.f6179o00Oo0 == LayoutNode.UsageByParent.NotUsed || layoutNode.f6184o00ooo)) {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("measure() may not be called multiple times on the same Measurable. Current state ");
                sbOooO0O0.append(this.f26653OoooO.f6179o00Oo0);
                sbOooO0O0.append(". Parent state ");
                sbOooO0O0.append(layoutNodeOooOOoo.f6158OoooOOo);
                sbOooO0O0.append('.');
                throw new IllegalStateException(sbOooO0O0.toString().toString());
            }
            int i = OooO00o.$EnumSwitchMapping$0[layoutNodeOooOOoo.f6158OoooOOo.ordinal()];
            if (i == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else {
                if (i != 2) {
                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Measurable could be only measured from the parent's measure or layout block.Parents state is ");
                    sbOooO0O1.append(layoutNodeOooOOoo.f6158OoooOOo);
                    throw new IllegalStateException(sbOooO0O1.toString());
                }
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            layoutNode.OoooOOO(usageByParent);
        } else {
            this.f26653OoooO.OoooOOO(LayoutNode.UsageByParent.NotUsed);
        }
        o0ooOoO(j);
        return this;
    }

    @Override // o0O0O00.o000O000, o0O0O00.OooOo00
    @Nullable
    public final Object Oooo0o() {
        return this.f26660Ooooo00;
    }

    @Override // o0O0O00.OooOo00
    public final int OoooO(int i) {
        o0ooOO0();
        return this.f26654OoooOO0.OoooO(i);
    }

    @Override // o0O0O00.o000O000
    public final int OoooOOO() {
        return this.f26654OoooOO0.OoooOOO();
    }

    @Override // o0O0O00.o000O000
    public final int OoooOoO() {
        return this.f26654OoooOO0.OoooOoO();
    }

    @Override // o0O0O00.o000O000
    public final void OooooOo(long j, float f, @Nullable Function1<? super p146o00Oo0.o0000, Unit> function1) {
        this.f26657OoooOo0 = j;
        this.f26659OoooOoo = f;
        this.f26658OoooOoO = function1;
        oo000o oo000oVar = this.f26654OoooOO0;
        oo000o oo000oVar2 = oo000oVar.f26720OoooOO0;
        if (oo000oVar2 != null && oo000oVar2.f26730OooooOo) {
            o000O000.OooO00o.C0363OooO00o c0363OooO00o = o000O000.OooO00o.f35289OooO00o;
            if (function1 == null) {
                c0363OooO00o.OooO0o0(oo000oVar, j, f);
                return;
            } else {
                c0363OooO00o.OooOO0o(oo000oVar, j, f, function1);
                return;
            }
        }
        this.f26655OoooOOO = true;
        LayoutNode layoutNode = this.f26653OoooO;
        layoutNode.f6169OoooooO.f26703OooO0oO = false;
        o00000OO snapshotObserver = o00Ooo.OooO00o(layoutNode).getF6262o00Oo0();
        LayoutNode node = this.f26653OoooO;
        OooO0O0 block = new OooO0O0(j, f, function1);
        Objects.requireNonNull(snapshotObserver);
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        snapshotObserver.OooO00o(node, snapshotObserver.f26649OooO0Oo, block);
    }

    public final void o0ooOO0() {
        LayoutNode.UsageByParent usageByParent;
        this.f26653OoooO.OoooOO0(false);
        LayoutNode layoutNodeOooOOoo = this.f26653OoooO.OooOOoo();
        if (layoutNodeOooOOoo != null) {
            LayoutNode layoutNode = this.f26653OoooO;
            if (layoutNode.f6180o00Ooo == LayoutNode.UsageByParent.NotUsed) {
                int i = OooO00o.$EnumSwitchMapping$0[layoutNodeOooOOoo.f6158OoooOOo.ordinal()];
                if (i != 1) {
                    usageByParent = i != 2 ? layoutNodeOooOOoo.f6180o00Ooo : LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                }
                Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
                layoutNode.f6180o00Ooo = usageByParent;
            }
        }
    }

    public final boolean o0ooOoO(long j) {
        o00000 o00000VarOooO00o = o00Ooo.OooO00o(this.f26653OoooO);
        LayoutNode layoutNodeOooOOoo = this.f26653OoooO.OooOOoo();
        LayoutNode layoutNode = this.f26653OoooO;
        boolean z = true;
        layoutNode.f6184o00ooo = layoutNode.f6184o00ooo || (layoutNodeOooOOoo != null && layoutNodeOooOOoo.f6184o00ooo);
        if (!layoutNode.f6174o000000o && o0000O0O.OooO0O0.OooO0O0(this.f35288OoooO0O, j)) {
            o00000VarOooO00o.OooO0oO(this.f26653OoooO);
            this.f26653OoooO.o000oOoO();
            return false;
        }
        LayoutNode layoutNode2 = this.f26653OoooO;
        layoutNode2.f6169OoooooO.f26701OooO0o = false;
        p036OoooOOO.o000OOo<LayoutNode> o000oooOooOo0 = layoutNode2.OooOo0();
        int i = o000oooOooOo0.f3678OoooO0;
        if (i > 0) {
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3677Oooo;
            int i2 = 0;
            do {
                layoutNodeArr[i2].f6169OoooooO.f26699OooO0OO = false;
                i2++;
            } while (i2 < i);
        }
        this.f26661o000oOoO = true;
        long j2 = this.f26654OoooOO0.f35286OoooO0;
        if (!o0000O0O.OooO0O0.OooO0O0(this.f35288OoooO0O, j)) {
            this.f35288OoooO0O = j;
            Oooooo();
        }
        LayoutNode node = this.f26653OoooO;
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        node.f6158OoooOOo = layoutState;
        node.f6174o000000o = false;
        o00000OO snapshotObserver = o00Ooo.OooO00o(node).getF6262o00Oo0();
        Oooo0 block = new Oooo0(node, j);
        Objects.requireNonNull(snapshotObserver);
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        snapshotObserver.OooO00o(node, snapshotObserver.f26647OooO0O0, block);
        if (node.f6158OoooOOo == layoutState) {
            node.f6171o00000 = true;
            node.f6158OoooOOo = LayoutNode.LayoutState.Idle;
        }
        if (o0000O0O.o000oOoO.OooO00o(this.f26654OoooOO0.f35286OoooO0, j2)) {
            oo000o oo000oVar = this.f26654OoooOO0;
            if (oo000oVar.f35285Oooo == this.f35285Oooo && oo000oVar.f35287OoooO00 == this.f35287OoooO00) {
                z = false;
            }
        }
        oo000o oo000oVar2 = this.f26654OoooOO0;
        o0OoOo0(o0000O0O.o0OoOo0.OooO00o(oo000oVar2.f35285Oooo, oo000oVar2.f35287OoooO00));
        return z;
    }
}
