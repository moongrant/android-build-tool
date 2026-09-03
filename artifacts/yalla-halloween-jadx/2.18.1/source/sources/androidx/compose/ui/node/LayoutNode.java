package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.oOO00O;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import o000000.o00000;
import o000000.o00000O0;
import o000000.o00000OO;
import o000000.o0000Ooo;
import o000000.o0000oo;
import o000000.o000oOoO;
import o000000.o00Ooo;
import o000000.o0OO00O;
import o000000.o0OOO0o;
import o000000.o0Oo0oo;
import o000000.o0OoOo0;
import o000000.oo000o;
import o00000O0.OooOo;
import o00000O0.Oooo000;
import o0000O0O.o00Oo0;
import o0O0O00.o000;
import o0O0O00.o000000;
import o0O0O00.o000000O;
import o0O0O00.o0000O;
import o0O0O00.o0000O0;
import o0O0O00.o000O00;
import o0O0O00.o000O000;
import o0O0O00.o000OO;
import o0O0O00.o000Oo0;
import o0O0O00.o0O0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o0o0Oo;
import p100o000oOoO.o0O00OO;
import p442o0OoOo0.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutNode implements o0O0O00, o000Oo0, o00000O0, o000000.OooO00o, o00000.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public o000OOo<LayoutNode> f6136Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean f6137Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f6138Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o000OOo<LayoutNode> f6139Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f6140OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public LayoutNode f6141OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f6142OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public o00000 f6143OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public LayoutState f6144OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f6145OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final o000OOo<LayoutNode> f6146OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f6147OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public o000000 f6148OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o000000.OooOOOO f6149OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public o0000O0O.OooO f6150Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final OooOOOO f6151Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public LayoutDirection f6152OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public o00OOOOo f6153OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f6154OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f6155Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f6156Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f6157OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f6158Ooooooo;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public boolean f6159o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    @NotNull
    public final Comparator<LayoutNode> f6160o000000O;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public boolean f6161o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public o000OOo<o0OOO0o> f6162o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @NotNull
    public UsageByParent f6163o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f6164o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @NotNull
    public final o000000.OooOOO f6165o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @NotNull
    public final o000000.o000OOo f6166o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f6167o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @Nullable
    public oo000o f6168o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public float f6169o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f6170o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    @Nullable
    public o000OOo<Pair<oo000o, o0000O0>> f6171o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super o00000, Unit> f6172o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    @Nullable
    public Function1<? super o00000, Unit> f6173o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public UsageByParent f6174o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @NotNull
    public final o0OO00O f6175o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @NotNull
    public o0OO00O f6176o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    @NotNull
    public o00OOOO0 f6177o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @Nullable
    public o0O0O00.o0OOO0o f6178oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f6179oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public UsageByParent f6180ooOO;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    @NotNull
    public static final OooOO0 f6131o000000o = new OooOO0();

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f6130o00000 = new OooO0OO();

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    @NotNull
    public static final Function0<LayoutNode> f6133o00000O0 = OooO00o.f6181Oooo0o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f6132o00000O = new OooO0O0();

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    @NotNull
    public static final p076o000OOo.OooOo00 f6134o00000OO = p076o000OOo.OooOOO0.OooO00o(OooO0o.f6182Oooo0o);

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    @NotNull
    public static final OooO f6135o00000Oo = new OooO();

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "Measuring", "LayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 6, 0})
    public enum LayoutState {
        Measuring,
        LayingOut,
        Idle
    }

    public static final class OooO implements p076o000OOo.OooOOO {
        @Override // p048OoooooO.o00OOOO0
        public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
            return o0o0Oo.OooO00o(this, o00oooo1);
        }

        @Override // p048OoooooO.o00OOOO0
        public final Object Oooo(Object obj, Function2 operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.invoke(obj, this);
        }

        @Override // p048OoooooO.o00OOOO0
        public final /* synthetic */ boolean OooooOo(Function1 function1) {
            return p048OoooooO.o00OOOOo.OooO00o(this, function1);
        }

        @Override // p076o000OOo.OooOOO
        @NotNull
        public final p076o000OOo.OooOo00 getKey() {
            return LayoutNode.f6134o00000OO;
        }

        @Override // p076o000OOo.OooOOO
        public final Object getValue() {
            throw new IllegalStateException("Sentinel ModifierLocal shouldn't be read".toString());
        }

        @Override // p048OoooooO.o00OOOO0
        public final Object o0Oo0oo(Object obj, Function2 operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.invoke(this, obj);
        }
    }

    public static final class OooO00o extends Lambda implements Function0<LayoutNode> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f6181Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LayoutNode invoke() {
            return new LayoutNode(false, 1, null);
        }
    }

    public static final class OooO0O0 implements o00OOOOo {
        @Override // androidx.compose.ui.platform.o00OOOOo
        public final long OooO00o() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.o00OOOOo
        public final void OooO0O0() {
        }

        @Override // androidx.compose.ui.platform.o00OOOOo
        public final long OooO0OO() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.o00OOOOo
        public final long OooO0Oo() {
            o0000O0O.OooOo00.OooO00o oooO00o = o0000O0O.OooOo00.f27313OooO0O0;
            return o0000O0O.OooOo00.f27314OooO0OO;
        }

        @Override // androidx.compose.ui.platform.o00OOOOo
        public final float OooO0o0() {
            return 16.0f;
        }
    }

    public static final class OooO0OO extends OooOO0O {
        public OooO0OO() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // o0O0O00.o000000
        public final o000000O OooO00o(o0O0O00.o00000O0 measure, List measurables, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    public static final class OooO0o extends Lambda implements Function0 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f6182Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            throw new IllegalStateException("default value for sentinel shouldn't be read".toString());
        }
    }

    public static final class OooOO0 {
    }

    public static abstract class OooOO0O implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f6183OooO00o;

        public OooOO0O(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f6183OooO00o = error;
        }

        @Override // o0O0O00.o000000
        public final int OooO0O0(o0O0O00.OooOo00 oooOo00, List measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f6183OooO00o.toString());
        }

        @Override // o0O0O00.o000000
        public final int OooO0OO(o0O0O00.OooOo00 oooOo00, List measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f6183OooO00o.toString());
        }

        @Override // o0O0O00.o000000
        public final int OooO0Oo(o0O0O00.OooOo00 oooOo00, List measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f6183OooO00o.toString());
        }

        @Override // o0O0O00.o000000
        public final int OooO0o0(o0O0O00.OooOo00 oooOo00, List measurables, int i) {
            Intrinsics.checkNotNullParameter(oooOo00, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.f6183OooO00o.toString());
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            LayoutNode layoutNode = LayoutNode.this;
            int i = 0;
            layoutNode.f6158Ooooooo = 0;
            o000OOo<LayoutNode> o000oooOooOo0 = layoutNode.OooOo0();
            int i2 = o000oooOooOo0.f3664Oooo0oo;
            if (i2 > 0) {
                LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
                int i3 = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArr[i3];
                    layoutNode2.f6157OoooooO = layoutNode2.f6155Oooooo;
                    layoutNode2.f6155Oooooo = Integer.MAX_VALUE;
                    layoutNode2.f6154OooooOo.f26681OooO0Oo = false;
                    if (layoutNode2.f6174o0OoOo0 == UsageByParent.InLayoutBlock) {
                        layoutNode2.OoooOOO(UsageByParent.NotUsed);
                    }
                    i3++;
                } while (i3 < i2);
            }
            LayoutNode.this.f6165o00Ooo.o00000().OooO0OO();
            o000OOo<LayoutNode> o000oooOooOo1 = LayoutNode.this.OooOo0();
            LayoutNode layoutNode3 = LayoutNode.this;
            int i4 = o000oooOooOo1.f3664Oooo0oo;
            if (i4 > 0) {
                LayoutNode[] layoutNodeArr2 = o000oooOooOo1.f3662Oooo0o;
                do {
                    LayoutNode layoutNode4 = layoutNodeArr2[i];
                    if (layoutNode4.f6157OoooooO != layoutNode4.f6155Oooooo) {
                        layoutNode3.Oooo0o0();
                        layoutNode3.OooOoO0();
                        if (layoutNode4.f6155Oooooo == Integer.MAX_VALUE) {
                            layoutNode4.Oooo00o();
                        }
                    }
                    o0OoOo0 o0oooo1 = layoutNode4.f6154OooooOo;
                    o0oooo1.f26683OooO0o0 = o0oooo1.f26681OooO0Oo;
                    i++;
                } while (i < i4);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooOOO0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            iArr[LayoutState.Idle.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooOOOO implements o0O0O00.o00000O0, o0000O0O.OooO {
        public OooOOOO() {
        }

        @Override // o0000O0O.OooO
        public final float OooO0o0(int i) {
            return i / getDensity();
        }

        @Override // o0000O0O.OooO
        public final long OooOoOO(float f) {
            return o00Oo0.OooO0O0(f / OoooOOo());
        }

        @Override // o0000O0O.OooO
        public final /* synthetic */ long OooOoo0(long j) {
            return o0000O0O.OooO0o.OooO0O0(this, j);
        }

        @Override // o0O0O00.o00000O0
        public final /* synthetic */ o000000O OooOooo(int i, int i2, Map map, Function1 function1) {
            return o0O0O00.o00000.OooO00o(this, i, i2, map, function1);
        }

        @Override // o0000O0O.OooO
        public final float OoooOO0(float f) {
            return f / getDensity();
        }

        @Override // o0000O0O.OooO
        public final float OoooOOo() {
            return LayoutNode.this.f6150Ooooo00.OoooOOo();
        }

        @Override // o0000O0O.OooO
        public final float OoooOoo(float f) {
            return getDensity() * f;
        }

        @Override // o0000O0O.OooO
        public final int OooooOO(long j) {
            return MathKt.roundToInt(oo000o(j));
        }

        @Override // o0000O0O.OooO
        public final /* synthetic */ int OoooooO(float f) {
            return o0000O0O.OooO0o.OooO00o(this, f);
        }

        @Override // o0000O0O.OooO
        public final float getDensity() {
            return LayoutNode.this.f6150Ooooo00.getDensity();
        }

        @Override // o0O0O00.OooOo00
        @NotNull
        public final LayoutDirection getLayoutDirection() {
            return LayoutNode.this.f6152OooooO0;
        }

        @Override // o0000O0O.OooO
        public final /* synthetic */ long o00ooo(long j) {
            return o0000O0O.OooO0o.OooO0Oo(this, j);
        }

        @Override // o0000O0O.OooO
        public final /* synthetic */ float oo000o(long j) {
            return o0000O0O.OooO0o.OooO0OO(this, j);
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<o00OOOO0.OooO0O0, oo000o, oo000o> {
        public OooOo00() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final oo000o invoke(o00OOOO0.OooO0O0 oooO0O0, oo000o oo000oVar) {
            int i;
            o00OOOO0.OooO0O0 modifier = oooO0O0;
            oo000o layoutNodeWrapper = oo000oVar;
            Intrinsics.checkNotNullParameter(modifier, "mod");
            Intrinsics.checkNotNullParameter(layoutNodeWrapper, "toWrap");
            if (modifier instanceof o000O00) {
                ((o000O00) modifier).o000oOoO(LayoutNode.this);
            }
            o000000.o00Oo0<?, ?>[] o00oo0Arr = layoutNodeWrapper.f26713OooooOO;
            Intrinsics.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            if (modifier instanceof o00O0O) {
                o000000.OooOO0 oooOO1 = new o000000.OooOO0(layoutNodeWrapper, (o00O0O) modifier);
                oooOO1.f26654Oooo0oo = o00oo0Arr[0];
                o00oo0Arr[0] = oooOO1;
            }
            if (modifier instanceof p418o0Oo0oo.o000000O) {
                o0000Ooo o0000ooo = new o0000Ooo(layoutNodeWrapper, (p418o0Oo0oo.o000000O) modifier);
                o0000ooo.f26654Oooo0oo = o00oo0Arr[1];
                o00oo0Arr[1] = o0000ooo;
            }
            if (modifier instanceof Oooo000) {
                OooOo oooOo = new OooOo(layoutNodeWrapper, (Oooo000) modifier);
                oooOo.f26654Oooo0oo = o00oo0Arr[2];
                o00oo0Arr[2] = oooOo;
            }
            if (modifier instanceof o000) {
                o0000oo o0000ooVar = new o0000oo(layoutNodeWrapper, modifier);
                o0000ooVar.f26654Oooo0oo = o00oo0Arr[3];
                o00oo0Arr[3] = o0000ooVar;
            }
            if (modifier instanceof o0000O0) {
                LayoutNode layoutNode = LayoutNode.this;
                o000OOo<Pair<oo000o, o0000O0>> o000ooo2 = layoutNode.f6171o0OO00O;
                if (o000ooo2 == null) {
                    o000OOo<Pair<oo000o, o0000O0>> o000ooo3 = new o000OOo<>(new Pair[16]);
                    layoutNode.f6171o0OO00O = o000ooo3;
                    o000ooo2 = o000ooo3;
                }
                o000ooo2.OooO0O0(TuplesKt.to(layoutNodeWrapper, modifier));
            }
            oo000o layoutNodeWrapper2 = layoutNodeWrapper;
            if (modifier instanceof o0O0O00.oo000o) {
                LayoutNode layoutNode2 = LayoutNode.this;
                o0O0O00.oo000o oo000oVar2 = (o0O0O00.oo000o) modifier;
                o0OOO0o o0ooo0oOooOOO0 = null;
                if (!layoutNode2.f6162o000oOoO.OooO()) {
                    o000OOo<o0OOO0o> o000ooo4 = layoutNode2.f6162o000oOoO;
                    int i2 = o000ooo4.f3664Oooo0oo;
                    int i3 = -1;
                    if (i2 <= 0) {
                        i = -1;
                        break;
                    }
                    i = i2 - 1;
                    o0OOO0o[] o0ooo0oArr = o000ooo4.f3662Oooo0o;
                    while (true) {
                        o0OOO0o o0ooo0o2 = o0ooo0oArr[i];
                        if (o0ooo0o2.f26667o00ooo && o0ooo0o2.f26666o00o0O == oo000oVar2) {
                            break;
                        }
                        i--;
                        if (i < 0) {
                            i = -1;
                            break;
                        }
                    }
                    if (i < 0) {
                        o000OOo<o0OOO0o> o000ooo5 = layoutNode2.f6162o000oOoO;
                        int i4 = o000ooo5.f3664Oooo0oo;
                        if (i4 > 0) {
                            int i5 = i4 - 1;
                            o0OOO0o[] o0ooo0oArr2 = o000ooo5.f3662Oooo0o;
                            do {
                                if (!o0ooo0oArr2[i5].f26667o00ooo) {
                                    i3 = i5;
                                    break;
                                }
                                i5--;
                            } while (i5 >= 0);
                        }
                        i = i3;
                    }
                    if (i >= 0) {
                        o0ooo0oOooOOO0 = layoutNode2.f6162o000oOoO.OooOOO0(i);
                        Objects.requireNonNull(o0ooo0oOooOOO0);
                        Intrinsics.checkNotNullParameter(oo000oVar2, "<set-?>");
                        o0ooo0oOooOOO0.f26666o00o0O = oo000oVar2;
                        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "<set-?>");
                        o0ooo0oOooOOO0.f26665o00Ooo = layoutNodeWrapper;
                    }
                }
                o0OOO0o o0ooo0o3 = o0ooo0oOooOOO0 == null ? new o0OOO0o(layoutNodeWrapper, oo000oVar2) : o0ooo0oOooOOO0;
                o000000.o000000 o000000Var = o0ooo0o3.f26715Oooooo;
                if (o000000Var != null) {
                    o000000Var.invalidate();
                }
                o0ooo0o3.f26665o00Ooo.f26701OoooO0 = o0ooo0o3;
                layoutNodeWrapper2 = o0ooo0o3;
            }
            o000000.o00Oo0<?, ?>[] o00oo0Arr2 = layoutNodeWrapper2.f26713OooooOO;
            Intrinsics.checkNotNullParameter(layoutNodeWrapper2, "layoutNodeWrapper");
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            if (modifier instanceof o000OO) {
                o0000oo o0000ooVar2 = new o0000oo(layoutNodeWrapper2, modifier);
                o0000ooVar2.f26654Oooo0oo = o00oo0Arr2[4];
                o00oo0Arr2[4] = o0000ooVar2;
            }
            if (modifier instanceof o0000O) {
                o0000oo o0000ooVar3 = new o0000oo(layoutNodeWrapper2, modifier);
                o0000ooVar3.f26654Oooo0oo = o00oo0Arr2[5];
                o00oo0Arr2[5] = o0000ooVar3;
            }
            return layoutNodeWrapper2;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 6, 0})
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    public LayoutNode() {
        this(false, 1, null);
    }

    public LayoutNode(boolean z) {
        this.f6137Oooo0o = z;
        this.f6139Oooo0oo = new o000OOo<>(new LayoutNode[16]);
        this.f6144OoooOO0 = LayoutState.Idle;
        this.f6162o000oOoO = new o000OOo<>(new o0OOO0o[16]);
        this.f6146OoooOOo = new o000OOo<>(new LayoutNode[16]);
        this.f6147OoooOo0 = true;
        this.f6148OoooOoO = f6130o00000;
        this.f6149OoooOoo = new o000000.OooOOOO(this);
        this.f6150Ooooo00 = o0000O0O.OooOO0O.OooO00o();
        this.f6151Ooooo0o = new OooOOOO();
        this.f6152OooooO0 = LayoutDirection.Ltr;
        this.f6153OooooOO = f6132o00000O;
        this.f6154OooooOo = new o0OoOo0(this);
        this.f6155Oooooo = Integer.MAX_VALUE;
        this.f6157OoooooO = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.f6174o0OoOo0 = usageByParent;
        this.f6180ooOO = usageByParent;
        this.f6163o00O0O = usageByParent;
        o000000.OooOOO oooOOO = new o000000.OooOOO(this);
        this.f6165o00Ooo = oooOOO;
        this.f6166o00o0O = new o000000.o000OOo(this, oooOOO);
        this.f6167o00oO0O = true;
        o0OO00O o0oo00o2 = new o0OO00O(this, f6135o00000Oo);
        this.f6175o0ooOO0 = o0oo00o2;
        this.f6176o0ooOOo = o0oo00o2;
        this.f6177o0ooOoO = o00OOOO0.OooO00o.f4198Oooo0o;
        this.f6160o000000O = new Comparator() { // from class: o000000.OooOo00
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                float f = layoutNode.f6169o00ooo;
                float f2 = layoutNode2.f6169o00ooo;
                return (f > f2 ? 1 : (f == f2 ? 0 : -1)) == 0 ? Intrinsics.compare(layoutNode.f6155Oooooo, layoutNode2.f6155Oooooo) : Float.compare(f, f2);
            }
        };
    }

    public static final o0OO00O OooO(LayoutNode layoutNode, p076o000OOo.OooOOO oooOOO, o0OO00O o0oo00o2) {
        Objects.requireNonNull(layoutNode);
        o0OO00O o0oo00o3 = o0oo00o2.f26661Oooo0oo;
        while (o0oo00o3 != null && o0oo00o3.f26660Oooo0oO != oooOOO) {
            o0oo00o3 = o0oo00o3.f26661Oooo0oo;
        }
        if (o0oo00o3 == null) {
            o0oo00o3 = new o0OO00O(layoutNode, oooOOO);
        } else {
            o0OO00O o0oo00o4 = o0oo00o3.f26658Oooo;
            if (o0oo00o4 != null) {
                o0oo00o4.f26661Oooo0oo = o0oo00o3.f26661Oooo0oo;
            }
            o0OO00O o0oo00o5 = o0oo00o3.f26661Oooo0oo;
            if (o0oo00o5 != null) {
                o0oo00o5.f26658Oooo = o0oo00o4;
            }
        }
        o0oo00o3.f26661Oooo0oo = o0oo00o2.f26661Oooo0oo;
        o0OO00O o0oo00o6 = o0oo00o2.f26661Oooo0oo;
        if (o0oo00o6 != null) {
            o0oo00o6.f26658Oooo = o0oo00o3;
        }
        o0oo00o2.f26661Oooo0oo = o0oo00o3;
        o0oo00o3.f26658Oooo = o0oo00o2;
        return o0oo00o3;
    }

    public static final void OooO0oo(LayoutNode layoutNode, p076o000OOo.OooOO0O oooOO0O, o0OO00O o0oo00o2, o000OOo o000ooo2) {
        int i;
        o0Oo0oo o0oo0oo2;
        Objects.requireNonNull(layoutNode);
        int i2 = o000ooo2.f3664Oooo0oo;
        if (i2 <= 0) {
            i = -1;
            break;
        }
        Object[] objArr = o000ooo2.f3662Oooo0o;
        i = 0;
        while (true) {
            if (((o0Oo0oo) objArr[i]).f26673Oooo0oO == oooOO0O) {
                break;
            }
            i++;
            if (i >= i2) {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            o0oo0oo2 = new o0Oo0oo(o0oo00o2, oooOO0O);
        } else {
            o0oo0oo2 = (o0Oo0oo) o000ooo2.OooOOO0(i);
            Objects.requireNonNull(o0oo0oo2);
            Intrinsics.checkNotNullParameter(o0oo00o2, "<set-?>");
            o0oo0oo2.f26672Oooo0o = o0oo00o2;
        }
        o0oo00o2.f26662OoooO0.OooO0O0(o0oo0oo2);
    }

    public static boolean Oooo0oo(LayoutNode layoutNode) {
        o000000.o000OOo o000ooo2 = layoutNode.f6166o00o0O;
        return layoutNode.Oooo0oO(o000ooo2.f26637OoooO0O ? new o0000O0O.OooO0O0(o000ooo2.f35264Oooo) : null);
    }

    @Override // o000000.o00000.OooO00o
    public final void OooO00o() {
        for (o000000.o00Oo0 o00oo1 = this.f6165o00Ooo.f26713OooooOO[4]; o00oo1 != null; o00oo1 = o00oo1.f26654Oooo0oo) {
            ((o000OO) ((o0000oo) o00oo1).f26653Oooo0oO).Oooo00O(this.f6165o00Ooo);
        }
    }

    @Override // o000000.OooO00o
    public final void OooO0O0(@NotNull o00OOOO0 value) {
        LayoutNode layoutNodeOooOOoo;
        LayoutNode layoutNodeOooOOoo2;
        o00000 o00000Var;
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, this.f6177o0ooOoO)) {
            return;
        }
        if (!Intrinsics.areEqual(this.f6177o0ooOoO, o00OOOO0.OooO00o.f4198Oooo0o) && !(!this.f6137Oooo0o)) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.f6177o0ooOoO = value;
        boolean zOoooOOo = OoooOOo();
        oo000o oo000oVar = this.f6166o00o0O.f26635OoooO0;
        o000000.OooOOO oooOOO = this.f6165o00Ooo;
        while (!Intrinsics.areEqual(oo000oVar, oooOOO)) {
            o0OOO0o o0ooo0o2 = (o0OOO0o) oo000oVar;
            this.f6162o000oOoO.OooO0O0(o0ooo0o2);
            oo000oVar = o0ooo0o2.f26665o00Ooo;
        }
        oo000o oo000oVarO00000Oo = this.f6166o00o0O.f26635OoooO0;
        Objects.requireNonNull(this.f6165o00Ooo);
        while (true) {
            if (Intrinsics.areEqual(oo000oVarO00000Oo, (Object) null) || oo000oVarO00000Oo == null) {
                break;
            }
            o000000.o00Oo0[] o00oo0Arr = oo000oVarO00000Oo.f26713OooooOO;
            for (o000000.o00Oo0 o00oo1 : o00oo0Arr) {
                for (; o00oo1 != null; o00oo1 = o00oo1.f26654Oooo0oo) {
                    if (o00oo1.f26651Oooo) {
                        o00oo1.OooO0O0();
                    }
                }
            }
            int length = o00oo0Arr.length;
            for (int i = 0; i < length; i++) {
                o00oo0Arr[i] = null;
            }
            oo000oVarO00000Oo = oo000oVarO00000Oo.o00000Oo();
        }
        o000OOo<o0OOO0o> o000ooo2 = this.f6162o000oOoO;
        int i2 = o000ooo2.f3664Oooo0oo;
        if (i2 > 0) {
            o0OOO0o[] o0ooo0oArr = o000ooo2.f3662Oooo0o;
            int i3 = 0;
            do {
                o0ooo0oArr[i3].f26667o00ooo = false;
                i3++;
            } while (i3 < i2);
        }
        value.Oooo(Unit.INSTANCE, new o000000.Oooo000(this));
        oo000o oo000oVar2 = this.f6166o00o0O.f26635OoooO0;
        if (o00000O0.o00Oo0.OooO0Oo(this) != null && OooOoo0()) {
            o00000 o00000Var2 = this.f6143OoooO0O;
            Intrinsics.checkNotNull(o00000Var2);
            o00000Var2.OooOOO();
        }
        boolean zBooleanValue = ((Boolean) this.f6177o0ooOoO.o0Oo0oo(Boolean.FALSE, new o000000.OooOo(this.f6171o0OO00O))).booleanValue();
        o000OOo<Pair<oo000o, o0000O0>> o000ooo3 = this.f6171o0OO00O;
        if (o000ooo3 != null) {
            o000ooo3.OooO0o0();
        }
        o000000.o000000 o000000Var = this.f6165o00Ooo.f26715Oooooo;
        if (o000000Var != null) {
            o000000Var.invalidate();
        }
        oo000o oo000oVar3 = (oo000o) this.f6177o0ooOoO.o0Oo0oo(this.f6165o00Ooo, new OooOo00());
        o000OOo o000ooo4 = new o000OOo(new o0Oo0oo[16]);
        for (o0OO00O o0oo00o2 = this.f6175o0ooOO0; o0oo00o2 != null; o0oo00o2 = o0oo00o2.f26661Oooo0oo) {
            o000ooo4.OooO0OO(o000ooo4.f3664Oooo0oo, o0oo00o2.f26662OoooO0);
            o0oo00o2.f26662OoooO0.OooO0o0();
        }
        o0OO00O o0oo00o3 = (o0OO00O) value.Oooo(this.f6175o0ooOO0, new o000oOoO(this, o000ooo4));
        this.f6176o0ooOOo = o0oo00o3;
        o0oo00o3.f26661Oooo0oo = null;
        if (OooOoo0()) {
            int i4 = o000ooo4.f3664Oooo0oo;
            if (i4 > 0) {
                Object[] objArr = o000ooo4.f3662Oooo0o;
                int i5 = 0;
                do {
                    o0Oo0oo o0oo0oo2 = (o0Oo0oo) objArr[i5];
                    o0oo0oo2.f26673Oooo0oO.OooOooO(o0Oo0oo.f26669OoooO0);
                    o0oo0oo2.f26671Oooo = false;
                    i5++;
                } while (i5 < i4);
            }
            for (o0OO00O o0oo00o4 = o0oo00o3.f26661Oooo0oo; o0oo00o4 != null; o0oo00o4 = o0oo00o4.f26661Oooo0oo) {
                o0oo00o4.OooO00o();
            }
            for (o0OO00O o0oo00o5 = this.f6175o0ooOO0; o0oo00o5 != null; o0oo00o5 = o0oo00o5.f26661Oooo0oo) {
                o0oo00o5.f26663OoooO00 = true;
                o00000 o00000Var3 = o0oo00o5.f26659Oooo0o.f6143OoooO0O;
                if (o00000Var3 != null) {
                    o00000Var3.OooOO0o(o0oo00o5);
                }
                o000OOo<o0Oo0oo> o000ooo5 = o0oo00o5.f26662OoooO0;
                int i6 = o000ooo5.f3664Oooo0oo;
                if (i6 > 0) {
                    o0Oo0oo[] o0oo0ooArr = o000ooo5.f3662Oooo0o;
                    int i7 = 0;
                    do {
                        o0Oo0oo o0oo0oo3 = o0oo0ooArr[i7];
                        o0oo0oo3.f26671Oooo = true;
                        o00000 o00000Var4 = o0oo0oo3.f26672Oooo0o.f26659Oooo0o.f6143OoooO0O;
                        if (o00000Var4 != null) {
                            o00000Var4.OooOO0o(o0oo0oo3);
                        }
                        i7++;
                    } while (i7 < i6);
                }
            }
        }
        LayoutNode layoutNodeOooOOoo3 = OooOOoo();
        oo000oVar3.f26701OoooO0 = layoutNodeOooOOoo3 != null ? layoutNodeOooOOoo3.f6165o00Ooo : null;
        o000000.o000OOo o000ooo6 = this.f6166o00o0O;
        Objects.requireNonNull(o000ooo6);
        Intrinsics.checkNotNullParameter(oo000oVar3, "<set-?>");
        o000ooo6.f26635OoooO0 = oo000oVar3;
        if (OooOoo0()) {
            o000OOo<o0OOO0o> o000ooo7 = this.f6162o000oOoO;
            int i8 = o000ooo7.f3664Oooo0oo;
            if (i8 > 0) {
                o0OOO0o[] o0ooo0oArr2 = o000ooo7.f3662Oooo0o;
                int i9 = 0;
                do {
                    o0ooo0oArr2[i9].oo0o0Oo();
                    i9++;
                } while (i9 < i8);
            }
            Objects.requireNonNull(this.f6165o00Ooo);
            for (oo000o oo000oVarO00000Oo2 = this.f6166o00o0O.f26635OoooO0; !Intrinsics.areEqual(oo000oVarO00000Oo2, (Object) null) && oo000oVarO00000Oo2 != null; oo000oVarO00000Oo2 = oo000oVarO00000Oo2.o00000Oo()) {
                if (oo000oVarO00000Oo2.OooOoO()) {
                    for (o000000.o00Oo0 o00oo2 : oo000oVarO00000Oo2.f26713OooooOO) {
                        for (; o00oo2 != null; o00oo2 = o00oo2.f26654Oooo0oo) {
                            o00oo2.OooO00o();
                        }
                    }
                } else {
                    oo000oVarO00000Oo2.o0OOO0o();
                }
            }
        }
        this.f6162o000oOoO.OooO0o0();
        Objects.requireNonNull(this.f6165o00Ooo);
        for (oo000o oo000oVarO00000Oo3 = this.f6166o00o0O.f26635OoooO0; !Intrinsics.areEqual(oo000oVarO00000Oo3, (Object) null) && oo000oVarO00000Oo3 != null; oo000oVarO00000Oo3 = oo000oVarO00000Oo3.o00000Oo()) {
            oo000oVarO00000Oo3.o0000O0();
        }
        if (!Intrinsics.areEqual(oo000oVar2, this.f6165o00Ooo) || !Intrinsics.areEqual(oo000oVar3, this.f6165o00Ooo)) {
            OoooOO0(false);
        } else if (this.f6144OoooOO0 == LayoutState.Idle && !this.f6161o000OOo && zBooleanValue) {
            OoooOO0(false);
        } else if (o000000.OooOO0O.OooO00o(this.f6165o00Ooo.f26713OooooOO, 4) && (o00000Var = this.f6143OoooO0O) != null) {
            o00000Var.OooO0OO(this);
        }
        o000000.o000OOo o000ooo8 = this.f6166o00o0O;
        Object obj = o000ooo8.f26641OoooOo0;
        o000ooo8.f26641OoooOo0 = o000ooo8.f26635OoooO0.Oooo0o();
        if (!Intrinsics.areEqual(obj, this.f6166o00o0O.f26641OoooOo0) && (layoutNodeOooOOoo2 = OooOOoo()) != null) {
            layoutNodeOooOOoo2.OoooOO0(false);
        }
        if ((zOoooOOo || OoooOOo()) && (layoutNodeOooOOoo = OooOOoo()) != null) {
            layoutNodeOooOOoo.OooOoO0();
        }
    }

    @Override // o000000.OooO00o
    public final void OooO0OO(@NotNull o0000O0O.OooO value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.f6150Ooooo00, value)) {
            return;
        }
        this.f6150Ooooo00 = value;
        OoooOO0(false);
        LayoutNode layoutNodeOooOOoo = OooOOoo();
        if (layoutNodeOooOOoo != null) {
            layoutNodeOooOOoo.OooOoO0();
        }
        OooOoO();
    }

    @Override // o000000.OooO00o
    public final void OooO0Oo(@NotNull o000000 measurePolicy) {
        Intrinsics.checkNotNullParameter(measurePolicy, "value");
        if (Intrinsics.areEqual(this.f6148OoooOoO, measurePolicy)) {
            return;
        }
        this.f6148OoooOoO = measurePolicy;
        o000000.OooOOOO oooOOOO = this.f6149OoooOoo;
        Objects.requireNonNull(oooOOOO);
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        o0O00OO<o000000> o0o00oo2 = oooOOOO.f26616OooO0O0;
        if (o0o00oo2 != null) {
            Intrinsics.checkNotNull(o0o00oo2);
            o0o00oo2.setValue(measurePolicy);
        } else {
            oooOOOO.f26617OooO0OO = measurePolicy;
        }
        OoooOO0(false);
    }

    @Override // o000000.OooO00o
    public final void OooO0o(@NotNull o00OOOOo o00ooooo2) {
        Intrinsics.checkNotNullParameter(o00ooooo2, "<set-?>");
        this.f6153OooooOO = o00ooooo2;
    }

    @Override // o0O0O00.o000Oo0
    public final void OooO0o0() {
        OoooOO0(false);
        o000000.o000OOo o000ooo2 = this.f6166o00o0O;
        o0000O0O.OooO0O0 oooO0O0 = o000ooo2.f26637OoooO0O ? new o0000O0O.OooO0O0(o000ooo2.f35264Oooo) : null;
        if (oooO0O0 != null) {
            o00000 o00000Var = this.f6143OoooO0O;
            if (o00000Var != null) {
                o00000Var.OooO0O0(this, oooO0O0.f27302OooO00o);
                return;
            }
            return;
        }
        o00000 o00000Var2 = this.f6143OoooO0O;
        if (o00000Var2 != null) {
            o00000Var2.OooO00o(true);
        }
    }

    @Override // o000000.OooO00o
    public final void OooO0oO(@NotNull LayoutDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f6152OooooO0 != value) {
            this.f6152OooooO0 = value;
            OoooOO0(false);
            LayoutNode layoutNodeOooOOoo = OooOOoo();
            if (layoutNodeOooOOoo != null) {
                layoutNodeOooOOoo.OooOoO0();
            }
            OooOoO();
        }
    }

    public final void OooOO0(@NotNull o00000 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!(this.f6143OoooO0O == null)) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + OooOOO0(0)).toString());
        }
        LayoutNode layoutNode = this.f6141OoooO0;
        if (!(layoutNode == null || Intrinsics.areEqual(layoutNode.f6143OoooO0O, owner))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attaching to a different owner(");
            sb.append(owner);
            sb.append(") than the parent's owner(");
            LayoutNode layoutNodeOooOOoo = OooOOoo();
            sb.append(layoutNodeOooOOoo != null ? layoutNodeOooOOoo.f6143OoooO0O : null);
            sb.append("). This tree: ");
            sb.append(OooOOO0(0));
            sb.append(" Parent tree: ");
            LayoutNode layoutNode2 = this.f6141OoooO0;
            sb.append(layoutNode2 != null ? layoutNode2.OooOOO0(0) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        LayoutNode layoutNodeOooOOoo2 = OooOOoo();
        if (layoutNodeOooOOoo2 == null) {
            this.f6156Oooooo0 = true;
        }
        this.f6143OoooO0O = owner;
        this.f6140OoooO = (layoutNodeOooOOoo2 != null ? layoutNodeOooOOoo2.f6140OoooO : -1) + 1;
        if (o00000O0.o00Oo0.OooO0Oo(this) != null) {
            owner.OooOOO();
        }
        owner.OooOOo0(this);
        o000OOo<LayoutNode> o000ooo2 = this.f6139Oooo0oo;
        int i = o000ooo2.f3664Oooo0oo;
        if (i > 0) {
            LayoutNode[] layoutNodeArr = o000ooo2.f3662Oooo0o;
            int i2 = 0;
            do {
                layoutNodeArr[i2].OooOO0(owner);
                i2++;
            } while (i2 < i);
        }
        OoooOO0(false);
        if (layoutNodeOooOOoo2 != null) {
            layoutNodeOooOOoo2.OoooOO0(false);
        }
        Objects.requireNonNull(this.f6165o00Ooo);
        for (oo000o oo000oVarO00000Oo = this.f6166o00o0O.f26635OoooO0; !Intrinsics.areEqual(oo000oVarO00000Oo, (Object) null) && oo000oVarO00000Oo != null; oo000oVarO00000Oo = oo000oVarO00000Oo.o00000Oo()) {
            oo000oVarO00000Oo.o0OOO0o();
        }
        for (o0OO00O o0oo00o2 = this.f6175o0ooOO0; o0oo00o2 != null; o0oo00o2 = o0oo00o2.f26661Oooo0oo) {
            o0oo00o2.f26663OoooO00 = true;
            o0oo00o2.OooO0OO(o0oo00o2.f26660Oooo0oO.getKey(), false);
            o000OOo<o0Oo0oo> o000ooo3 = o0oo00o2.f26662OoooO0;
            int i3 = o000ooo3.f3664Oooo0oo;
            if (i3 > 0) {
                o0Oo0oo[] o0oo0ooArr = o000ooo3.f3662Oooo0o;
                int i4 = 0;
                do {
                    o0Oo0oo o0oo0oo2 = o0oo0ooArr[i4];
                    o0oo0oo2.f26671Oooo = true;
                    o0oo0oo2.OooO0O0();
                    i4++;
                } while (i4 < i3);
            }
        }
        Function1<? super o00000, Unit> function1 = this.f6172o0OOO0o;
        if (function1 != null) {
            function1.invoke(owner);
        }
    }

    public final void OooOO0O() {
        this.f6163o00O0O = this.f6180ooOO;
        this.f6180ooOO = UsageByParent.NotUsed;
        o000OOo<LayoutNode> o000oooOooOo0 = OooOo0();
        int i = o000oooOooOo0.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
            do {
                LayoutNode layoutNode = layoutNodeArr[i2];
                if (layoutNode.f6180ooOO != UsageByParent.NotUsed) {
                    layoutNode.OooOO0O();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void OooOO0o() {
        this.f6163o00O0O = this.f6180ooOO;
        this.f6180ooOO = UsageByParent.NotUsed;
        o000OOo<LayoutNode> o000oooOooOo0 = OooOo0();
        int i = o000oooOooOo0.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
            do {
                LayoutNode layoutNode = layoutNodeArr[i2];
                if (layoutNode.f6180ooOO == UsageByParent.InLayoutBlock) {
                    layoutNode.OooOO0o();
                }
                i2++;
            } while (i2 < i);
        }
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOOO(int i) {
        return this.f6166o00o0O.OooOOO(i);
    }

    public final String OooOOO0(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        o000OOo<LayoutNode> o000oooOooOo0 = OooOo0();
        int i3 = o000oooOooOo0.f3664Oooo0oo;
        if (i3 > 0) {
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
            int i4 = 0;
            do {
                sb.append(layoutNodeArr[i4].OooOOO0(i + 1));
                i4++;
            } while (i4 < i3);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "tree.toString()");
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final void OooOOOO() {
        o00000 o00000Var = this.f6143OoooO0O;
        if (o00000Var == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNodeOooOOoo = OooOOoo();
            sbOooO0o0.append(layoutNodeOooOOoo != null ? layoutNodeOooOOoo.OooOOO0(0) : null);
            throw new IllegalStateException(sbOooO0o0.toString().toString());
        }
        LayoutNode layoutNodeOooOOoo2 = OooOOoo();
        if (layoutNodeOooOOoo2 != null) {
            layoutNodeOooOOoo2.OooOoO0();
            layoutNodeOooOOoo2.OoooOO0(false);
        }
        o0OoOo0 o0oooo1 = this.f6154OooooOo;
        o0oooo1.f26679OooO0O0 = true;
        o0oooo1.f26680OooO0OO = false;
        o0oooo1.f26683OooO0o0 = false;
        o0oooo1.f26681OooO0Oo = false;
        o0oooo1.f26682OooO0o = false;
        o0oooo1.f26684OooO0oO = false;
        o0oooo1.f26685OooO0oo = null;
        Function1<? super o00000, Unit> function1 = this.f6173o0Oo0oo;
        if (function1 != null) {
            function1.invoke(o00000Var);
        }
        for (o0OO00O o0oo00o2 = this.f6175o0ooOO0; o0oo00o2 != null; o0oo00o2 = o0oo00o2.f26661Oooo0oo) {
            o0oo00o2.OooO00o();
        }
        Objects.requireNonNull(this.f6165o00Ooo);
        for (oo000o oo000oVarO00000Oo = this.f6166o00o0O.f26635OoooO0; !Intrinsics.areEqual(oo000oVarO00000Oo, (Object) null) && oo000oVarO00000Oo != null; oo000oVarO00000Oo = oo000oVarO00000Oo.o00000Oo()) {
            oo000oVarO00000Oo.oo0o0Oo();
        }
        if (o00000O0.o00Oo0.OooO0Oo(this) != null) {
            o00000Var.OooOOO();
        }
        o00000Var.OooO0oo(this);
        this.f6143OoooO0O = null;
        this.f6140OoooO = 0;
        o000OOo<LayoutNode> o000ooo2 = this.f6139Oooo0oo;
        int i = o000ooo2.f3664Oooo0oo;
        if (i > 0) {
            LayoutNode[] layoutNodeArr = o000ooo2.f3662Oooo0o;
            int i2 = 0;
            do {
                layoutNodeArr[i2].OooOOOO();
                i2++;
            } while (i2 < i);
        }
        this.f6155Oooooo = Integer.MAX_VALUE;
        this.f6157OoooooO = Integer.MAX_VALUE;
        this.f6156Oooooo0 = false;
    }

    public final void OooOOOo(@NotNull p145o00Oo0.o0O0O00 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f6166o00o0O.f26635OoooO0.o000OOo(canvas);
    }

    @NotNull
    public final List<LayoutNode> OooOOo() {
        o000OOo<LayoutNode> o000ooo2 = this.f6139Oooo0oo;
        List<LayoutNode> list = o000ooo2.f3663Oooo0oO;
        if (list != null) {
            return list;
        }
        o000OOo.OooO00o oooO00o = new o000OOo.OooO00o(o000ooo2);
        o000ooo2.f3663Oooo0oO = oooO00o;
        return oooO00o;
    }

    @NotNull
    public final List<LayoutNode> OooOOo0() {
        o000OOo<LayoutNode> o000oooOooOo0 = OooOo0();
        List<LayoutNode> list = o000oooOooOo0.f3663Oooo0oO;
        if (list != null) {
            return list;
        }
        o000OOo.OooO00o oooO00o = new o000OOo.OooO00o(o000oooOooOo0);
        o000oooOooOo0.f3663Oooo0oO = oooO00o;
        return oooO00o;
    }

    @Nullable
    public final LayoutNode OooOOoo() {
        LayoutNode layoutNode = this.f6141OoooO0;
        if (!(layoutNode != null && layoutNode.f6137Oooo0o)) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.OooOOoo();
        }
        return null;
    }

    public final void OooOo(int i, @NotNull LayoutNode instance) {
        o000OOo<LayoutNode> o000ooo2;
        int i2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i3 = 0;
        o000000.OooOOO oooOOO = null;
        if (!(instance.f6141OoooO0 == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(instance);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(OooOOO0(0));
            sb.append(" Other tree: ");
            LayoutNode layoutNode = instance.f6141OoooO0;
            sb.append(layoutNode != null ? layoutNode.OooOOO0(0) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (!(instance.f6143OoooO0O == null)) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + OooOOO0(0) + " Other tree: " + instance.OooOOO0(0)).toString());
        }
        instance.f6141OoooO0 = this;
        this.f6139Oooo0oo.OooO00o(i, instance);
        Oooo0o0();
        if (instance.f6137Oooo0o) {
            if (!(!this.f6137Oooo0o)) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
            }
            this.f6138Oooo0oO++;
        }
        OooOoOO();
        oo000o oo000oVar = instance.f6166o00o0O.f26635OoooO0;
        if (this.f6137Oooo0o) {
            LayoutNode layoutNode2 = this.f6141OoooO0;
            if (layoutNode2 != null) {
                oooOOO = layoutNode2.f6165o00Ooo;
            }
        } else {
            oooOOO = this.f6165o00Ooo;
        }
        oo000oVar.f26701OoooO0 = oooOOO;
        if (instance.f6137Oooo0o && (i2 = (o000ooo2 = instance.f6139Oooo0oo).f3664Oooo0oo) > 0) {
            LayoutNode[] layoutNodeArr = o000ooo2.f3662Oooo0o;
            do {
                layoutNodeArr[i3].f6166o00o0O.f26635OoooO0.f26701OoooO0 = this.f6165o00Ooo;
                i3++;
            } while (i3 < i2);
        }
        o00000 o00000Var = this.f6143OoooO0O;
        if (o00000Var != null) {
            instance.OooOO0(o00000Var);
        }
    }

    @NotNull
    public final o000OOo<LayoutNode> OooOo0() {
        if (this.f6138Oooo0oO == 0) {
            return this.f6139Oooo0oo;
        }
        if (this.f6142OoooO00) {
            int i = 0;
            this.f6142OoooO00 = false;
            o000OOo<LayoutNode> o000ooo2 = this.f6136Oooo;
            if (o000ooo2 == null) {
                o000OOo<LayoutNode> o000ooo3 = new o000OOo<>(new LayoutNode[16]);
                this.f6136Oooo = o000ooo3;
                o000ooo2 = o000ooo3;
            }
            o000ooo2.OooO0o0();
            o000OOo<LayoutNode> o000ooo4 = this.f6139Oooo0oo;
            int i2 = o000ooo4.f3664Oooo0oo;
            if (i2 > 0) {
                LayoutNode[] layoutNodeArr = o000ooo4.f3662Oooo0o;
                do {
                    LayoutNode layoutNode = layoutNodeArr[i];
                    if (layoutNode.f6137Oooo0o) {
                        o000ooo2.OooO0OO(o000ooo2.f3664Oooo0oo, layoutNode.OooOo0());
                    } else {
                        o000ooo2.OooO0O0(layoutNode);
                    }
                    i++;
                } while (i < i2);
            }
        }
        o000OOo<LayoutNode> o000ooo5 = this.f6136Oooo;
        Intrinsics.checkNotNull(o000ooo5);
        return o000ooo5;
    }

    @NotNull
    public final o000OOo<LayoutNode> OooOo00() {
        if (this.f6147OoooOo0) {
            this.f6146OoooOOo.OooO0o0();
            o000OOo<LayoutNode> o000ooo2 = this.f6146OoooOOo;
            o000ooo2.OooO0OO(o000ooo2.f3664Oooo0oo, OooOo0());
            this.f6146OoooOOo.OooOOO(this.f6160o000000O);
            this.f6147OoooOo0 = false;
        }
        return this.f6146OoooOOo;
    }

    public final void OooOo0O(long j, @NotNull o000000.OooOOO0<p418o0Oo0oo.o000000> hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        long jO000000o = this.f6166o00o0O.f26635OoooO0.o000000o(j);
        oo000o oo000oVar = this.f6166o00o0O.f26635OoooO0;
        oo000o.OooO oooO = oo000o.f26694OoooooO;
        oo000oVar.o00000oO(oo000o.f26696o00O0O, jO000000o, hitTestResult, z, z2);
    }

    public final void OooOo0o(long j, @NotNull o000000.OooOOO0 hitSemanticsEntities, boolean z) {
        Intrinsics.checkNotNullParameter(hitSemanticsEntities, "hitSemanticsEntities");
        long jO000000o = this.f6166o00o0O.f26635OoooO0.o000000o(j);
        oo000o oo000oVar = this.f6166o00o0O.f26635OoooO0;
        oo000o.OooO oooO = oo000o.f26694OoooooO;
        oo000oVar.o00000oO(oo000o.f26697o00Oo0, jO000000o, hitSemanticsEntities, true, z);
    }

    public final void OooOoO() {
        oo000o oo000oVar = this.f6166o00o0O.f26635OoooO0;
        o000000.OooOOO oooOOO = this.f6165o00Ooo;
        while (!Intrinsics.areEqual(oo000oVar, oooOOO)) {
            o0OOO0o o0ooo0o2 = (o0OOO0o) oo000oVar;
            o000000.o000000 o000000Var = o0ooo0o2.f26715Oooooo;
            if (o000000Var != null) {
                o000000Var.invalidate();
            }
            oo000oVar = o0ooo0o2.f26665o00Ooo;
        }
        o000000.o000000 o000000Var2 = this.f6165o00Ooo.f26715Oooooo;
        if (o000000Var2 != null) {
            o000000Var2.invalidate();
        }
    }

    public final void OooOoO0() {
        if (this.f6167o00oO0O) {
            oo000o oo000oVar = this.f6165o00Ooo;
            oo000o oo000oVar2 = this.f6166o00o0O.f26635OoooO0.f26701OoooO0;
            this.f6168o00oO0o = null;
            while (!Intrinsics.areEqual(oo000oVar, oo000oVar2)) {
                if ((oo000oVar != null ? oo000oVar.f26715Oooooo : null) != null) {
                    this.f6168o00oO0o = oo000oVar;
                    break;
                }
                oo000oVar = oo000oVar != null ? oo000oVar.f26701OoooO0 : null;
            }
        }
        oo000o oo000oVar3 = this.f6168o00oO0o;
        if (oo000oVar3 != null && oo000oVar3.f26715Oooooo == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (oo000oVar3 != null) {
            oo000oVar3.o0000();
            return;
        }
        LayoutNode layoutNodeOooOOoo = OooOOoo();
        if (layoutNodeOooOOoo != null) {
            layoutNodeOooOOoo.OooOoO0();
        }
    }

    public final void OooOoOO() {
        LayoutNode layoutNodeOooOOoo;
        if (this.f6138Oooo0oO > 0) {
            this.f6142OoooO00 = true;
        }
        if (!this.f6137Oooo0o || (layoutNodeOooOOoo = OooOOoo()) == null) {
            return;
        }
        layoutNodeOooOOoo.f6142OoooO00 = true;
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOoo(int i) {
        return this.f6166o00o0O.OooOoo(i);
    }

    public final boolean OooOoo0() {
        return this.f6143OoooO0O != null;
    }

    @Override // o0O0O00.OooOOOO
    public final int OooOooO(int i) {
        return this.f6166o00o0O.OooOooO(i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooOooo() {
        o000OOo<LayoutNode> o000oooOooOo0;
        int i;
        this.f6154OooooOo.OooO0Oo();
        if (this.f6159o000000 && (i = (o000oooOooOo0 = OooOo0()).f3664Oooo0oo) > 0) {
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
            int i2 = 0;
            do {
                LayoutNode layoutNode = layoutNodeArr[i2];
                if (layoutNode.f6161o000OOo && layoutNode.f6174o0OoOo0 == UsageByParent.InMeasureBlock && Oooo0oo(layoutNode)) {
                    OoooOO0(false);
                }
                i2++;
            } while (i2 < i);
        }
        if (this.f6159o000000) {
            this.f6159o000000 = false;
            this.f6144OoooOO0 = LayoutState.LayingOut;
            o00000OO snapshotObserver = o00Ooo.OooO00o(this).getF6257o0OoOo0();
            OooOOO block = new OooOOO();
            Objects.requireNonNull(snapshotObserver);
            Intrinsics.checkNotNullParameter(this, "node");
            Intrinsics.checkNotNullParameter(block, "block");
            snapshotObserver.OooO00o(this, snapshotObserver.f26629OooO0OO, block);
            this.f6144OoooOO0 = LayoutState.Idle;
        }
        o0OoOo0 o0oooo1 = this.f6154OooooOo;
        if (o0oooo1.f26681OooO0Oo) {
            o0oooo1.f26683OooO0o0 = true;
        }
        if (o0oooo1.f26679OooO0O0 && o0oooo1.OooO0O0()) {
            o0OoOo0 o0oooo2 = this.f6154OooooOo;
            o0oooo2.f26677OooO.clear();
            o000OOo<LayoutNode> o000oooOooOo1 = o0oooo2.f26678OooO00o.OooOo0();
            int i3 = o000oooOooOo1.f3664Oooo0oo;
            if (i3 > 0) {
                LayoutNode[] layoutNodeArr2 = o000oooOooOo1.f3662Oooo0o;
                int i4 = 0;
                do {
                    LayoutNode layoutNode2 = layoutNodeArr2[i4];
                    if (layoutNode2.f6156Oooooo0) {
                        if (layoutNode2.f6154OooooOo.f26679OooO0O0) {
                            layoutNode2.OooOooo();
                        }
                        for (Map.Entry<o0O0O00.OooO00o, Integer> entry : layoutNode2.f6154OooooOo.f26677OooO.entrySet()) {
                            o0OoOo0.OooO0OO(o0oooo2, entry.getKey(), entry.getValue().intValue(), layoutNode2.f6165o00Ooo);
                        }
                        oo000o oo000oVar = layoutNode2.f6165o00Ooo.f26701OoooO0;
                        Intrinsics.checkNotNull(oo000oVar);
                        while (!Intrinsics.areEqual(oo000oVar, o0oooo2.f26678OooO00o.f6165o00Ooo)) {
                            for (o0O0O00.OooO00o oooO00o : oo000oVar.o00000().OooO0o0().keySet()) {
                                o0OoOo0.OooO0OO(o0oooo2, oooO00o, oo000oVar.OooOo0o(oooO00o), oo000oVar);
                            }
                            oo000oVar = oo000oVar.f26701OoooO0;
                            Intrinsics.checkNotNull(oo000oVar);
                        }
                    }
                    i4++;
                } while (i4 < i3);
            }
            o0oooo2.f26677OooO.putAll(o0oooo2.f26678OooO00o.f6165o00Ooo.o00000().OooO0o0());
            o0oooo2.f26679OooO0O0 = false;
        }
    }

    public final void Oooo() {
        for (int i = this.f6139Oooo0oo.f3664Oooo0oo - 1; -1 < i; i--) {
            Oooo0OO(this.f6139Oooo0oo.f3662Oooo0o[i]);
        }
        this.f6139Oooo0oo.OooO0o0();
    }

    public final void Oooo0(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            this.f6139Oooo0oo.OooO00o(i > i2 ? i2 + i4 : (i2 + i3) - 2, this.f6139Oooo0oo.OooOOO0(i > i2 ? i + i4 : i));
        }
        Oooo0o0();
        OooOoOO();
        OoooOO0(false);
    }

    @Override // o0O0O00.o0O0O00
    @NotNull
    public final o000O000 Oooo000(long j) {
        if (this.f6180ooOO == UsageByParent.NotUsed) {
            OooOO0O();
        }
        o000000.o000OOo o000ooo2 = this.f6166o00o0O;
        o000ooo2.Oooo000(j);
        return o000ooo2;
    }

    public final void Oooo00O() {
        this.f6156Oooooo0 = true;
        Objects.requireNonNull(this.f6165o00Ooo);
        for (oo000o oo000oVarO00000Oo = this.f6166o00o0O.f26635OoooO0; !Intrinsics.areEqual(oo000oVarO00000Oo, (Object) null) && oo000oVarO00000Oo != null; oo000oVarO00000Oo = oo000oVarO00000Oo.o00000Oo()) {
            if (oo000oVarO00000Oo.f26716Oooooo0) {
                oo000oVarO00000Oo.o0000();
            }
        }
        o000OOo<LayoutNode> o000oooOooOo0 = OooOo0();
        int i = o000oooOooOo0.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
            do {
                LayoutNode layoutNode = layoutNodeArr[i2];
                if (layoutNode.f6155Oooooo != Integer.MAX_VALUE) {
                    layoutNode.Oooo00O();
                    if (OooOOO0.$EnumSwitchMapping$0[layoutNode.f6144OoooOO0.ordinal()] != 1) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unexpected state ");
                        sbOooO0o0.append(layoutNode.f6144OoooOO0);
                        throw new IllegalStateException(sbOooO0o0.toString());
                    }
                    if (layoutNode.f6161o000OOo) {
                        layoutNode.OoooOO0(true);
                    } else if (layoutNode.f6159o000000) {
                        layoutNode.OoooO0O(true);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void Oooo00o() {
        if (this.f6156Oooooo0) {
            int i = 0;
            this.f6156Oooooo0 = false;
            o000OOo<LayoutNode> o000oooOooOo0 = OooOo0();
            int i2 = o000oooOooOo0.f3664Oooo0oo;
            if (i2 > 0) {
                LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
                do {
                    layoutNodeArr[i].Oooo00o();
                    i++;
                } while (i < i2);
            }
        }
    }

    public final void Oooo0O0() {
        o0OoOo0 o0oooo1 = this.f6154OooooOo;
        if (o0oooo1.f26679OooO0O0) {
            return;
        }
        o0oooo1.f26679OooO0O0 = true;
        LayoutNode layoutNodeOooOOoo = OooOOoo();
        if (layoutNodeOooOOoo == null) {
            return;
        }
        o0OoOo0 o0oooo2 = this.f6154OooooOo;
        if (o0oooo2.f26680OooO0OO) {
            layoutNodeOooOOoo.OoooOO0(false);
        } else if (o0oooo2.f26683OooO0o0) {
            layoutNodeOooOOoo.OoooO0O(false);
        }
        if (this.f6154OooooOo.f26682OooO0o) {
            OoooOO0(false);
        }
        if (this.f6154OooooOo.f26684OooO0oO) {
            layoutNodeOooOOoo.OoooO0O(false);
        }
        layoutNodeOooOOoo.Oooo0O0();
    }

    public final void Oooo0OO(LayoutNode layoutNode) {
        if (this.f6143OoooO0O != null) {
            layoutNode.OooOOOO();
        }
        layoutNode.f6141OoooO0 = null;
        layoutNode.f6166o00o0O.f26635OoooO0.f26701OoooO0 = null;
        if (layoutNode.f6137Oooo0o) {
            this.f6138Oooo0oO--;
            o000OOo<LayoutNode> o000ooo2 = layoutNode.f6139Oooo0oo;
            int i = o000ooo2.f3664Oooo0oo;
            if (i > 0) {
                int i2 = 0;
                LayoutNode[] layoutNodeArr = o000ooo2.f3662Oooo0o;
                do {
                    layoutNodeArr[i2].f6166o00o0O.f26635OoooO0.f26701OoooO0 = null;
                    i2++;
                } while (i2 < i);
            }
        }
        OooOoOO();
        Oooo0o0();
    }

    @Override // o0O0O00.OooOOOO
    @Nullable
    public final Object Oooo0o() {
        return this.f6166o00o0O.f26641OoooOo0;
    }

    public final void Oooo0o0() {
        if (!this.f6137Oooo0o) {
            this.f6147OoooOo0 = true;
            return;
        }
        LayoutNode layoutNodeOooOOoo = OooOOoo();
        if (layoutNodeOooOOoo != null) {
            layoutNodeOooOOoo.Oooo0o0();
        }
    }

    public final boolean Oooo0oO(@Nullable o0000O0O.OooO0O0 oooO0O0) {
        if (oooO0O0 == null) {
            return false;
        }
        if (this.f6180ooOO == UsageByParent.NotUsed) {
            OooOO0O();
        }
        return this.f6166o00o0O.o0ooOoO(oooO0O0.f27302OooO00o);
    }

    @Override // o0O0O00.OooOOOO
    public final int OoooO(int i) {
        return this.f6166o00o0O.OoooO(i);
    }

    public final void OoooO0() {
        if (this.f6180ooOO == UsageByParent.NotUsed) {
            OooOO0o();
        }
        try {
            this.f6170o0O0O00 = true;
            o000000.o000OOo o000ooo2 = this.f6166o00o0O;
            if (!o000ooo2.f26634OoooO) {
                throw new IllegalStateException("Check failed.".toString());
            }
            o000ooo2.OooooOo(o000ooo2.f26642o000oOoO, o000ooo2.f26640OoooOOo, o000ooo2.f26639OoooOOO);
            this.f6170o0O0O00 = false;
        } catch (Throwable th) {
            this.f6170o0O0O00 = false;
            throw th;
        }
    }

    public final void OoooO00(int i, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO00o("count (", i2, ") must be greater than 0").toString());
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            Oooo0OO(this.f6139Oooo0oo.OooOOO0(i3));
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void OoooO0O(boolean z) {
        o00000 o00000Var;
        if (this.f6137Oooo0o || (o00000Var = this.f6143OoooO0O) == null) {
            return;
        }
        o00000Var.OooO(this, z);
    }

    public final void OoooOO0(boolean z) {
        o00000 o00000Var;
        LayoutNode layoutNodeOooOOoo;
        if (this.f6145OoooOOO || this.f6137Oooo0o || (o00000Var = this.f6143OoooO0O) == null) {
            return;
        }
        o00000Var.OooOOOo(this, z);
        o000000.o000OOo o000ooo2 = this.f6166o00o0O;
        LayoutNode layoutNodeOooOOoo2 = o000ooo2.f26636OoooO00.OooOOoo();
        UsageByParent usageByParent = o000ooo2.f26636OoooO00.f6180ooOO;
        if (layoutNodeOooOOoo2 == null || usageByParent == UsageByParent.NotUsed) {
            return;
        }
        while (layoutNodeOooOOoo2.f6180ooOO == usageByParent && (layoutNodeOooOOoo = layoutNodeOooOOoo2.OooOOoo()) != null) {
            layoutNodeOooOOoo2 = layoutNodeOooOOoo;
        }
        int i = o000000.o000OOo.OooO00o.$EnumSwitchMapping$1[usageByParent.ordinal()];
        if (i == 1) {
            layoutNodeOooOOoo2.OoooOO0(z);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            layoutNodeOooOOoo2.OoooO0O(z);
        }
    }

    public final void OoooOOO(@NotNull UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.f6174o0OoOo0 = usageByParent;
    }

    public final boolean OoooOOo() {
        Objects.requireNonNull(this.f6165o00Ooo);
        for (oo000o oo000oVarO00000Oo = this.f6166o00o0O.f26635OoooO0; !Intrinsics.areEqual(oo000oVarO00000Oo, (Object) null) && oo000oVarO00000Oo != null; oo000oVarO00000Oo = oo000oVarO00000Oo.o00000Oo()) {
            if (oo000oVarO00000Oo.f26715Oooooo != null) {
                return false;
            }
            if (o000000.OooOO0O.OooO00o(oo000oVarO00000Oo.f26713OooooOO, 0)) {
                return true;
            }
        }
        return true;
    }

    @Override // o000000.o00000O0
    public final boolean isValid() {
        return OooOoo0();
    }

    public final void o000oOoO() {
        o000OOo<LayoutNode> o000oooOooOo0 = OooOo0();
        int i = o000oooOooOo0.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
            do {
                LayoutNode layoutNode = layoutNodeArr[i2];
                UsageByParent usageByParent = layoutNode.f6163o00O0O;
                layoutNode.f6180ooOO = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.o000oOoO();
                }
                i2++;
            } while (i2 < i);
        }
    }

    @NotNull
    public final String toString() {
        return oOO00O.OooO00o(this) + " children: " + ((o000OOo.OooO00o) OooOOo0()).f3665Oooo0o.f3664Oooo0oo + " measurePolicy: " + this.f6148OoooOoO;
    }

    public /* synthetic */ LayoutNode(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(false);
    }
}
