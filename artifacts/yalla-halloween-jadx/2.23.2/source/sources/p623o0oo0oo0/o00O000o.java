package p623o0oo0oo0;

import androidx.compose.runtime.internal.StabilityInferred;
import dev.chrisbanes.snapper.ExperimentalSnapperApi;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
public final class o00O000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f57643OooO00o = OooO0O0.f57645OooO0Oo;

    public static final class OooO00o extends Lambda implements Function2<o00O00o0, oo00o, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f57644OooO0Oo = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(o00O00o0 o00o00o1, oo00o oo00oVar) {
            o00O00o0 layout = o00o00o1;
            oo00o item = oo00oVar;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(item, "item");
            layout.OooO0oO();
            int iOooO0o = layout.OooO0o();
            layout.OooO0oO();
            return Integer.valueOf((((iOooO0o + 0) - item.OooO0OO()) / 2) + 0);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<o00O00o0, oo00o, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f57645OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(o00O00o0 o00o00o1, oo00o oo00oVar) {
            o00O00o0 layout = o00o00o1;
            oo00o noName_1 = oo00oVar;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            layout.OooO0oO();
            return 0;
        }
    }
}
