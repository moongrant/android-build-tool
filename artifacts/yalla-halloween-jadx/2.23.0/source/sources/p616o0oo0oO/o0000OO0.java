package p616o0oo0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import dev.chrisbanes.snapper.ExperimentalSnapperApi;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f57100OooO00o = OooO0O0.f57102OooO0Oo;

    public static final class OooO00o extends Lambda implements Function2<o000O00, o000O00O, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f57101OooO0Oo = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(o000O00 o000o01, o000O00O o000o00o2) {
            o000O00 layout = o000o01;
            o000O00O item = o000o00o2;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(item, "item");
            layout.OooO0oO();
            int iOooO0o = layout.OooO0o();
            layout.OooO0oO();
            return Integer.valueOf((((iOooO0o + 0) - item.OooO0OO()) / 2) + 0);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<o000O00, o000O00O, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f57102OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(o000O00 o000o01, o000O00O o000o00o2) {
            o000O00 layout = o000o01;
            o000O00O noName_1 = o000o00o2;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            layout.OooO0oO();
            return 0;
        }
    }
}
