package o0O0O00;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo extends LayoutNode.OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f35320OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Function2<o000O, o0000O0O.OooO0O0, o000000O> f35321OooO0OO;

    public static final class OooO00o implements o000000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o000000O f35322OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o f35323OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ int f35324OooO0OO;

        public OooO00o(o000000O o000000o2, o0OOO0o o0ooo0o2, int i) {
            this.f35322OooO00o = o000000o2;
            this.f35323OooO0O0 = o0ooo0o2;
            this.f35324OooO0OO = i;
        }

        @Override // o0O0O00.o000000O
        public final void OooO0OO() {
            this.f35323OooO0O0.f35303OooO0Oo = this.f35324OooO0OO;
            this.f35322OooO00o.OooO0OO();
            o0OOO0o o0ooo0o2 = this.f35323OooO0O0;
            o0ooo0o2.OooO00o(o0ooo0o2.f35303OooO0Oo);
        }

        @Override // o0O0O00.o000000O
        @NotNull
        public final Map<o0O0O00.OooO00o, Integer> OooO0o0() {
            return this.f35322OooO00o.OooO0o0();
        }

        @Override // o0O0O00.o000000O
        public final int getHeight() {
            return this.f35322OooO00o.getHeight();
        }

        @Override // o0O0O00.o000000O
        public final int getWidth() {
            return this.f35322OooO00o.getWidth();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0Oo0oo(o0OOO0o o0ooo0o2, Function2<? super o000O, ? super o0000O0O.OooO0O0, ? extends o000000O> function2, String str) {
        super(str);
        this.f35320OooO0O0 = o0ooo0o2;
        this.f35321OooO0OO = function2;
    }

    @Override // o0O0O00.o000000
    @NotNull
    public final o000000O OooO00o(@NotNull o00000O0 measure, @NotNull List<? extends o0O0O00> measurables, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        o0OOO0o.OooO0O0 oooO0O0 = this.f35320OooO0O0.f35306OooO0oO;
        LayoutDirection layoutDirection = measure.getLayoutDirection();
        Objects.requireNonNull(oooO0O0);
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        oooO0O0.f35317Oooo0o = layoutDirection;
        this.f35320OooO0O0.f35306OooO0oO.f35318Oooo0oO = measure.getDensity();
        this.f35320OooO0O0.f35306OooO0oO.f35319Oooo0oo = measure.OoooOOo();
        o0OOO0o o0ooo0o2 = this.f35320OooO0O0;
        o0ooo0o2.f35303OooO0Oo = 0;
        o000000O o000000oInvoke = this.f35321OooO0OO.invoke(o0ooo0o2.f35306OooO0oO, new o0000O0O.OooO0O0(j));
        o0OOO0o o0ooo0o3 = this.f35320OooO0O0;
        return new OooO00o(o000000oInvoke, o0ooo0o3, o0ooo0o3.f35303OooO0Oo);
    }
}
