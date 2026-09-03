package p633o0ooO00o;

import androidx.compose.runtime.internal.StabilityInferred;
import dev.chrisbanes.snapper.ExperimentalSnapperApi;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
public final class oO00o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO00o00O f48832OooO00o = new oO00o00O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Function2<oOo000Oo, oOo0000O, Integer> f48833OooO0O0 = OooO0O0.f48836Oooo0o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Function2<oOo000Oo, oOo0000O, Integer> f48834OooO0OO = OooO00o.f48835Oooo0o;

    public static final class OooO00o extends Lambda implements Function2<oOo000Oo, oOo0000O, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f48835Oooo0o = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(oOo000Oo ooo000oo, oOo0000O ooo0000o) {
            oOo000Oo layout = ooo000oo;
            oOo0000O item = ooo0000o;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(item, "item");
            layout.OooO0oO();
            int iOooO0o = layout.OooO0o();
            layout.OooO0oO();
            return Integer.valueOf((((iOooO0o + 0) - item.OooO0OO()) / 2) + 0);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOo000Oo, oOo0000O, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f48836Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(oOo000Oo ooo000oo, oOo0000O ooo0000o) {
            oOo000Oo layout = ooo000oo;
            oOo0000O noName_1 = ooo0000o;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            layout.OooO0oO();
            return 0;
        }
    }
}
