package p616o0oo0oO;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import dev.chrisbanes.snapper.ExperimentalSnapperApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final SpringSpec f57107OooO00o = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f57108OooO0O0 = OooO00o.f57109OooO0Oo;

    public static final class OooO00o extends Lambda implements Function1<o000O00, Float> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f57109OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(o000O00 o000o01) {
            o000O00 it = o000o01;
            Intrinsics.checkNotNullParameter(it, "it");
            return Float.valueOf(Float.MAX_VALUE);
        }
    }
}
