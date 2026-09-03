package o0O0O00;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O0OOO;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OO00 f35275OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o0OOO0o f35276OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function2<LayoutNode, o000O0O0, Unit> f35277OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function2<LayoutNode, o00O0OOO, Unit> f35278OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Function2<LayoutNode, Function2<? super o000O, ? super o0000O0O.OooO0O0, ? extends o000000O>, Unit> f35279OooO0o0;

    public interface OooO00o {
        int OooO00o();

        void OooO0O0(int i, long j);

        void dispose();
    }

    public static final class OooO0O0 extends Lambda implements Function2<LayoutNode, o00O0OOO, Unit> {
        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, o00O0OOO o00o0ooo2) {
            o00O0OOO it = o00o0ooo2;
            Intrinsics.checkNotNullParameter(layoutNode, "$this$null");
            Intrinsics.checkNotNullParameter(it, "it");
            o000O0O0.this.OooO00o().f35301OooO0O0 = it;
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<LayoutNode, Function2<? super o000O, ? super o0000O0O.OooO0O0, ? extends o000000O>, Unit> {
        public OooO0OO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, Function2<? super o000O, ? super o0000O0O.OooO0O0, ? extends o000000O> function2) {
            LayoutNode layoutNode2 = layoutNode;
            Function2<? super o000O, ? super o0000O0O.OooO0O0, ? extends o000000O> block = function2;
            Intrinsics.checkNotNullParameter(layoutNode2, "$this$null");
            Intrinsics.checkNotNullParameter(block, "it");
            o0OOO0o o0ooo0oOooO00o = o000O0O0.this.OooO00o();
            Intrinsics.checkNotNullParameter(block, "block");
            layoutNode2.OooO0Oo(new o0Oo0oo(o0ooo0oOooO00o, block, o0ooo0oOooO00o.f35310OooOO0o));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<LayoutNode, o000O0O0, Unit> {
        public OooO0o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LayoutNode layoutNode, o000O0O0 o000o0o1) {
            LayoutNode layoutNode2 = layoutNode;
            o000O0O0 it = o000o0o1;
            Intrinsics.checkNotNullParameter(layoutNode2, "$this$null");
            Intrinsics.checkNotNullParameter(it, "it");
            o000O0O0 o000o0o2 = o000O0O0.this;
            o0OOO0o o0ooo0o2 = layoutNode2.f6178oo000o;
            if (o0ooo0o2 == null) {
                o0ooo0o2 = new o0OOO0o(layoutNode2, o000o0o2.f35275OooO00o);
                layoutNode2.f6178oo000o = o0ooo0o2;
            }
            o000o0o2.f35276OooO0O0 = o0ooo0o2;
            o000O0O0.this.OooO00o().OooO0OO();
            o0OOO0o o0ooo0oOooO00o = o000O0O0.this.OooO00o();
            o000OO00 value = o000O0O0.this.f35275OooO00o;
            Intrinsics.checkNotNullParameter(value, "value");
            if (o0ooo0oOooO00o.f35302OooO0OO != value) {
                o0ooo0oOooO00o.f35302OooO0OO = value;
                o0ooo0oOooO00o.OooO00o(0);
            }
            return Unit.INSTANCE;
        }
    }

    public o000O0O0(@NotNull o000OO00 slotReusePolicy) {
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.f35275OooO00o = slotReusePolicy;
        this.f35277OooO0OO = new OooO0o();
        this.f35278OooO0Oo = new OooO0O0();
        this.f35279OooO0o0 = new OooO0OO();
    }

    public final o0OOO0o OooO00o() {
        o0OOO0o o0ooo0o2 = this.f35276OooO0O0;
        if (o0ooo0o2 != null) {
            return o0ooo0o2;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NotNull
    public final OooO00o OooO0O0(@Nullable Object obj, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        o0OOO0o o0ooo0oOooO00o = OooO00o();
        Intrinsics.checkNotNullParameter(content, "content");
        o0ooo0oOooO00o.OooO0OO();
        if (!o0ooo0oOooO00o.f35304OooO0o.containsKey(obj)) {
            Map<Object, LayoutNode> map = o0ooo0oOooO00o.f35307OooO0oo;
            LayoutNode layoutNodeOooO0o = map.get(obj);
            if (layoutNodeOooO0o == null) {
                layoutNodeOooO0o = o0ooo0oOooO00o.OooO0o(obj);
                if (layoutNodeOooO0o != null) {
                    o0ooo0oOooO00o.OooO0Oo(((OoooOOO.o000OOo.OooO00o) o0ooo0oOooO00o.f35300OooO00o.OooOOo()).indexOf(layoutNodeOooO0o), ((OoooOOO.o000OOo.OooO00o) o0ooo0oOooO00o.f35300OooO00o.OooOOo()).f3665Oooo0o.f3664Oooo0oo, 1);
                    o0ooo0oOooO00o.f35309OooOO0O++;
                } else {
                    int i = ((OoooOOO.o000OOo.OooO00o) o0ooo0oOooO00o.f35300OooO00o.OooOOo()).f3665Oooo0o.f3664Oooo0oo;
                    LayoutNode layoutNode = new LayoutNode(true);
                    LayoutNode layoutNode2 = o0ooo0oOooO00o.f35300OooO00o;
                    layoutNode2.f6145OoooOOO = true;
                    layoutNode2.OooOo(i, layoutNode);
                    layoutNode2.f6145OoooOOO = false;
                    o0ooo0oOooO00o.f35309OooOO0O++;
                    layoutNodeOooO0o = layoutNode;
                }
                map.put(obj, layoutNodeOooO0o);
            }
            o0ooo0oOooO00o.OooO0o0(layoutNodeOooO0o, obj, content);
        }
        return new o0OO00O(o0ooo0oOooO00o, obj);
    }

    public o000O0O0() {
        this(o0000oo.f35261OooO00o);
    }
}
