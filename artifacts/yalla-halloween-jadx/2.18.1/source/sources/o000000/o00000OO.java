package o000000;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p047Oooooo0.o00OOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OOO0 f26627OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function1<LayoutNode, Unit> f26628OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function1<LayoutNode, Unit> f26629OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function1<LayoutNode, Unit> f26630OooO0Oo;

    public static final class OooO00o extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f26631Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            Intrinsics.checkNotNullParameter(layoutNode2, "layoutNode");
            if (layoutNode2.OooOoo0()) {
                layoutNode2.OoooO0O(false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f26632Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            Intrinsics.checkNotNullParameter(layoutNode2, "layoutNode");
            if (layoutNode2.OooOoo0()) {
                layoutNode2.OoooO0O(false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f26633Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            Intrinsics.checkNotNullParameter(layoutNode2, "layoutNode");
            if (layoutNode2.OooOoo0()) {
                layoutNode2.OoooOO0(false);
            }
            return Unit.INSTANCE;
        }
    }

    public o00000OO(@NotNull Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.f26627OooO00o = new o00OOO0(onChangedExecutor);
        this.f26628OooO0O0 = OooO0OO.f26633Oooo0o;
        this.f26629OooO0OO = OooO00o.f26631Oooo0o;
        this.f26630OooO0Oo = OooO0O0.f26632Oooo0o;
    }

    public final <T extends o00000O0> void OooO00o(@NotNull T target, @NotNull Function1<? super T, Unit> onChanged, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f26627OooO00o.OooO0O0(target, onChanged, block);
    }
}
