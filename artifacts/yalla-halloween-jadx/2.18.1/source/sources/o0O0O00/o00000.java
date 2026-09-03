package o0O0O00;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000 {

    public static final class OooO00o implements o000000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f35249OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f35250OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Map<o0O0O00.OooO00o, Integer> f35251OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f35252OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<o000O000.OooO00o, Unit> f35253OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00000O0 f35254OooO0o0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(int i, int i2, Map<o0O0O00.OooO00o, Integer> map, o00000O0 o00000o1, Function1<? super o000O000.OooO00o, Unit> function1) {
            this.f35252OooO0Oo = i;
            this.f35254OooO0o0 = o00000o1;
            this.f35253OooO0o = function1;
            this.f35249OooO00o = i;
            this.f35250OooO0O0 = i2;
            this.f35251OooO0OO = map;
        }

        @Override // o0O0O00.o000000O
        public final void OooO0OO() {
            o000O000.OooO00o.C0363OooO00o c0363OooO00o = o000O000.OooO00o.f35268OooO00o;
            int i = this.f35252OooO0Oo;
            LayoutDirection layoutDirection = this.f35254OooO0o0.getLayoutDirection();
            Function1<o000O000.OooO00o, Unit> function1 = this.f35253OooO0o;
            int i2 = o000O000.OooO00o.f35270OooO0OO;
            LayoutDirection layoutDirection2 = o000O000.OooO00o.f35269OooO0O0;
            o000O000.OooO00o.f35270OooO0OO = i;
            o000O000.OooO00o.f35269OooO0O0 = layoutDirection;
            function1.invoke(c0363OooO00o);
            o000O000.OooO00o.f35270OooO0OO = i2;
            o000O000.OooO00o.f35269OooO0O0 = layoutDirection2;
        }

        @Override // o0O0O00.o000000O
        @NotNull
        public final Map<o0O0O00.OooO00o, Integer> OooO0o0() {
            return this.f35251OooO0OO;
        }

        @Override // o0O0O00.o000000O
        public final int getHeight() {
            return this.f35250OooO0O0;
        }

        @Override // o0O0O00.o000000O
        public final int getWidth() {
            return this.f35249OooO00o;
        }
    }

    @NotNull
    public static o000000O OooO00o(o00000O0 o00000o1, int i, int i2, @NotNull Map alignmentLines, @NotNull Function1 placementBlock) {
        Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
        Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
        return new OooO00o(i, i2, alignmentLines, o00000o1, placementBlock);
    }
}
