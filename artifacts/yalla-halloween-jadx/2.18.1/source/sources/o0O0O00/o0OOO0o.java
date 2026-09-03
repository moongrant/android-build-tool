package o0O0O00;

import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.o0O00OOO;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o000OOo0;
import p043OooooO0.o00O0000;
import p047Oooooo0.o0oOOo;
import p047Oooooo0.oo00o;
import p047Oooooo0.oo0o0O0;
import p100o000oOoO.o00O0OO;
import p100o000oOoO.o00O0OOO;
import p100o000oOoO.o00OO000;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o000OO00.OooO00o f35299OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LayoutNode f35300OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00O0OOO f35301OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public o000OO00 f35302OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35303OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Map<Object, LayoutNode> f35304OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Map<LayoutNode, OooO00o> f35305OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f35306OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Map<Object, LayoutNode> f35307OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f35308OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f35309OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final String f35310OooOO0o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Object f35311OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public Function2<? super oOO00O, ? super Integer, Unit> f35312OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o00O0OO f35313OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f35314OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final ParcelableSnapshotMutableState f35315OooO0o0;

        public OooO00o(Object obj, Function2 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f35311OooO00o = obj;
            this.f35312OooO0O0 = content;
            this.f35313OooO0OO = null;
            this.f35315OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.TRUE);
        }
    }

    public final class OooO0O0 implements o000O {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public LayoutDirection f35317Oooo0o = LayoutDirection.Rtl;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public float f35318Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public float f35319Oooo0oo;

        public OooO0O0() {
        }

        @Override // o0000O0O.OooO
        public final float OooO0o0(int i) {
            return i / this.f35318Oooo0oO;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o0O0O00.o000O
        @NotNull
        public final List<o0O0O00> OooOo0O(@Nullable Object obj, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            Objects.requireNonNull(o0ooo0o2);
            Intrinsics.checkNotNullParameter(content, "content");
            o0ooo0o2.OooO0OO();
            LayoutNode.LayoutState layoutState = o0ooo0o2.f35300OooO00o.f6144OoooOO0;
            if (!(layoutState == LayoutNode.LayoutState.Measuring || layoutState == LayoutNode.LayoutState.LayingOut)) {
                throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
            }
            Map<Object, LayoutNode> map = o0ooo0o2.f35304OooO0o;
            LayoutNode layoutNodeRemove = map.get(obj);
            if (layoutNodeRemove == null) {
                layoutNodeRemove = o0ooo0o2.f35307OooO0oo.remove(obj);
                if (layoutNodeRemove != null) {
                    int i = o0ooo0o2.f35309OooOO0O;
                    if (!(i > 0)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    o0ooo0o2.f35309OooOO0O = i - 1;
                } else {
                    layoutNodeRemove = o0ooo0o2.OooO0o(obj);
                    if (layoutNodeRemove == null) {
                        int i2 = o0ooo0o2.f35303OooO0Oo;
                        LayoutNode layoutNode = new LayoutNode(true);
                        LayoutNode layoutNode2 = o0ooo0o2.f35300OooO00o;
                        layoutNode2.f6145OoooOOO = true;
                        layoutNode2.OooOo(i2, layoutNode);
                        layoutNode2.f6145OoooOOO = false;
                        layoutNodeRemove = layoutNode;
                    }
                }
                map.put(obj, layoutNodeRemove);
            }
            LayoutNode layoutNode3 = layoutNodeRemove;
            int iIndexOf = ((OoooOOO.o000OOo.OooO00o) o0ooo0o2.f35300OooO00o.OooOOo()).indexOf(layoutNode3);
            int i3 = o0ooo0o2.f35303OooO0Oo;
            if (iIndexOf >= i3) {
                if (i3 != iIndexOf) {
                    o0ooo0o2.OooO0Oo(iIndexOf, i3, 1);
                }
                o0ooo0o2.f35303OooO0Oo++;
                o0ooo0o2.OooO0o0(layoutNode3, obj, content);
                return layoutNode3.OooOOo0();
            }
            throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }

        @Override // o0000O0O.OooO
        public final long OooOoOO(float f) {
            return o0000O0O.o00Oo0.OooO0O0(f / this.f35319Oooo0oo);
        }

        @Override // o0000O0O.OooO
        public final /* synthetic */ long OooOoo0(long j) {
            return o0000O0O.OooO0o.OooO0O0(this, j);
        }

        @Override // o0O0O00.o00000O0
        public final /* synthetic */ o000000O OooOooo(int i, int i2, Map map, Function1 function1) {
            return o00000.OooO00o(this, i, i2, map, function1);
        }

        @Override // o0000O0O.OooO
        public final float OoooOO0(float f) {
            return f / getDensity();
        }

        @Override // o0000O0O.OooO
        public final float OoooOOo() {
            return this.f35319Oooo0oo;
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
            return this.f35318Oooo0oO;
        }

        @Override // o0O0O00.OooOo00
        @NotNull
        public final LayoutDirection getLayoutDirection() {
            return this.f35317Oooo0o;
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

    public o0OOO0o(@NotNull LayoutNode root, @NotNull o000OO00 slotReusePolicy) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.f35300OooO00o = root;
        this.f35302OooO0OO = slotReusePolicy;
        this.f35305OooO0o0 = new LinkedHashMap();
        this.f35304OooO0o = new LinkedHashMap();
        this.f35306OooO0oO = new OooO0O0();
        this.f35307OooO0oo = new LinkedHashMap();
        this.f35299OooO = new o000OO00.OooO00o();
        this.f35310OooOO0o = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.Map<androidx.compose.ui.node.LayoutNode, o0O0O00.o0OOO0o$OooO00o>] */
    public final void OooO00o(int i) {
        this.f35308OooOO0 = 0;
        int i2 = (((OoooOOO.o000OOo.OooO00o) this.f35300OooO00o.OooOOo()).f3665Oooo0o.f3664Oooo0oo - this.f35309OooOO0O) - 1;
        if (i <= i2) {
            this.f35299OooO.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    this.f35299OooO.f35286Oooo0o.add(OooO0O0(i3));
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f35302OooO0OO.OooO00o(this.f35299OooO);
            while (i2 >= i) {
                LayoutNode layoutNode = (LayoutNode) ((OoooOOO.o000OOo.OooO00o) this.f35300OooO00o.OooOOo()).get(i2);
                Object obj = this.f35305OooO0o0.get(layoutNode);
                Intrinsics.checkNotNull(obj);
                OooO00o oooO00o = (OooO00o) obj;
                Object obj2 = oooO00o.f35311OooO00o;
                if (this.f35299OooO.contains(obj2)) {
                    layoutNode.OoooOOO(LayoutNode.UsageByParent.NotUsed);
                    this.f35308OooOO0++;
                    oooO00o.f35315OooO0o0.setValue(Boolean.FALSE);
                } else {
                    LayoutNode layoutNode2 = this.f35300OooO00o;
                    layoutNode2.f6145OoooOOO = true;
                    this.f35305OooO0o0.remove(layoutNode);
                    o00O0OO o00o0oo2 = oooO00o.f35313OooO0OO;
                    if (o00o0oo2 != null) {
                        o00o0oo2.dispose();
                    }
                    this.f35300OooO00o.OoooO00(i2, 1);
                    layoutNode2.f6145OoooOOO = false;
                }
                this.f35304OooO0o.remove(obj2);
                i2--;
            }
        }
        OooO0OO();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.LinkedHashMap, java.util.Map<androidx.compose.ui.node.LayoutNode, o0O0O00.o0OOO0o$OooO00o>] */
    public final Object OooO0O0(int i) {
        Object obj = this.f35305OooO0o0.get((LayoutNode) ((OoooOOO.o000OOo.OooO00o) this.f35300OooO00o.OooOOo()).get(i));
        Intrinsics.checkNotNull(obj);
        return ((OooO00o) obj).f35311OooO00o;
    }

    public final void OooO0OO() {
        if (!(this.f35305OooO0o0.size() == ((OoooOOO.o000OOo.OooO00o) this.f35300OooO00o.OooOOo()).f3665Oooo0o.f3664Oooo0oo)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Inconsistency between the count of nodes tracked by the state (");
            sbOooO0o0.append(this.f35305OooO0o0.size());
            sbOooO0o0.append(") and the children count on the SubcomposeLayout (");
            throw new IllegalArgumentException(o0ooOOo.OooO00o(sbOooO0o0, ((OoooOOO.o000OOo.OooO00o) this.f35300OooO00o.OooOOo()).f3665Oooo0o.f3664Oooo0oo, "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((((OoooOOO.o000OOo.OooO00o) this.f35300OooO00o.OooOOo()).f3665Oooo0o.f3664Oooo0oo - this.f35308OooOO0) - this.f35309OooOO0O >= 0) {
            if (this.f35307OooO0oo.size() == this.f35309OooOO0O) {
                return;
            }
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Incorrect state. Precomposed children ");
            sbOooO0o1.append(this.f35309OooOO0O);
            sbOooO0o1.append(". Map size ");
            sbOooO0o1.append(this.f35307OooO0oo.size());
            throw new IllegalArgumentException(sbOooO0o1.toString().toString());
        }
        StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("Incorrect state. Total children ");
        sbOooO0o2.append(((OoooOOO.o000OOo.OooO00o) this.f35300OooO00o.OooOOo()).f3665Oooo0o.f3664Oooo0oo);
        sbOooO0o2.append(". Reusable children ");
        sbOooO0o2.append(this.f35308OooOO0);
        sbOooO0o2.append(". Precomposed children ");
        sbOooO0o2.append(this.f35309OooOO0O);
        throw new IllegalArgumentException(sbOooO0o2.toString().toString());
    }

    public final void OooO0Oo(int i, int i2, int i3) {
        LayoutNode layoutNode = this.f35300OooO00o;
        layoutNode.f6145OoooOOO = true;
        layoutNode.Oooo0(i, i2, i3);
        layoutNode.f6145OoooOOO = false;
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.LinkedHashMap, java.util.Map<androidx.compose.ui.node.LayoutNode, o0O0O00.o0OOO0o$OooO00o>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.LinkedHashMap, java.util.Map<androidx.compose.ui.node.LayoutNode, o0O0O00.o0OOO0o$OooO00o>] */
    public final LayoutNode OooO0o(Object obj) {
        int i;
        boolean z;
        LayoutNode layoutNode = null;
        if (this.f35308OooOO0 == 0) {
            return null;
        }
        int i2 = ((OoooOOO.o000OOo.OooO00o) this.f35300OooO00o.OooOOo()).f3665Oooo0o.f3664Oooo0oo - this.f35309OooOO0O;
        int i3 = i2 - this.f35308OooOO0;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            if (i5 < i3) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(OooO0O0(i5), obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object obj2 = this.f35305OooO0o0.get((LayoutNode) ((OoooOOO.o000OOo.OooO00o) this.f35300OooO00o.OooOOo()).get(i4));
                Intrinsics.checkNotNull(obj2);
                OooO00o oooO00o = (OooO00o) obj2;
                if (this.f35302OooO0OO.OooO0O0(obj, oooO00o.f35311OooO00o)) {
                    oooO00o.f35311OooO00o = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i != -1) {
            if (i5 != i3) {
                OooO0Oo(i5, i3, 1);
            }
            this.f35308OooOO0--;
            layoutNode = (LayoutNode) ((OoooOOO.o000OOo.OooO00o) this.f35300OooO00o.OooOOo()).get(i3);
            Object obj3 = this.f35305OooO0o0.get(layoutNode);
            Intrinsics.checkNotNull(obj3);
            ((OooO00o) obj3).f35315OooO0o0.setValue(Boolean.TRUE);
            synchronized (oo0o0O0.f4158OooO0OO) {
                Set<o0oOOo> set = oo0o0O0.f4155OooO.get().f4068OooO0oo;
                z = set != null && (set.isEmpty() ^ true);
            }
            if (z) {
                oo0o0O0.OooO00o();
            }
        }
        return layoutNode;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO0o0(LayoutNode container, Object obj, Function2<? super oOO00O, ? super Integer, Unit> function2) {
        Map<LayoutNode, OooO00o> map = this.f35305OooO0o0;
        OooO00o oooO00o = map.get(container);
        if (oooO00o == null) {
            OooO oooO = OooO.f35227OooO00o;
            oooO00o = new OooO00o(obj, OooO.f35228OooO0O0);
            map.put(container, oooO00o);
        }
        OooO00o oooO00o2 = oooO00o;
        o00O0OO o00o0oo2 = oooO00o2.f35313OooO0OO;
        boolean zOooOOO = o00o0oo2 != null ? o00o0oo2.OooOOO() : true;
        if (oooO00o2.f35312OooO0O0 != function2 || zOooOOO || oooO00o2.f35314OooO0Oo) {
            Intrinsics.checkNotNullParameter(function2, "<set-?>");
            oooO00o2.f35312OooO0O0 = function2;
            oo00o oo00oVarOooO0oO = oo0o0O0.OooO0oO(oo0o0O0.f4157OooO0O0.OooO00o(), null, false);
            try {
                oo00o oo00oVarOooO = oo00oVarOooO0oO.OooO();
                try {
                    LayoutNode layoutNode = this.f35300OooO00o;
                    layoutNode.f6145OoooOOO = true;
                    Function2<? super oOO00O, ? super Integer, Unit> function3 = oooO00o2.f35312OooO0O0;
                    o00O0OO o00o0ooOooO00o = oooO00o2.f35313OooO0OO;
                    o00O0OOO parent = this.f35301OooO0O0;
                    if (parent == null) {
                        throw new IllegalStateException("parent composition reference not set".toString());
                    }
                    o000OOo0 o000ooo0OooO0O0 = o00O0000.OooO0O0(-34810602, true, new oo0o0Oo(oooO00o2, function3));
                    if (o00o0ooOooO00o == null || o00o0ooOooO00o.OooO0o0()) {
                        ViewGroup.LayoutParams layoutParams = o0O00OOO.f6587OooO00o;
                        Intrinsics.checkNotNullParameter(container, "container");
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        o00o0ooOooO00o = o00OO000.OooO00o(new o000000.o0000O0(container), parent);
                    }
                    o00o0ooOooO00o.OooO(o000ooo0OooO0O0);
                    oooO00o2.f35313OooO0OO = o00o0ooOooO00o;
                    layoutNode.f6145OoooOOO = false;
                    Unit unit = Unit.INSTANCE;
                    oo00oVarOooO0oO.OooOOOo(oo00oVarOooO);
                    oo00oVarOooO0oO.OooO0OO();
                    oooO00o2.f35314OooO0Oo = false;
                } catch (Throwable th) {
                    oo00oVarOooO0oO.OooOOOo(oo00oVarOooO);
                    throw th;
                }
            } catch (Throwable th2) {
                oo00oVarOooO0oO.OooO0OO();
                throw th2;
            }
        }
    }
}
