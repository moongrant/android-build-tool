package p281o0O00o;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Stable
@Deprecated(message = "\naccompanist/insets is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/insets/#migration\n", replaceWith = @ReplaceWith(expression = "WindowInsets", imports = {"androidx.compose.foundation.layout.WindowInsets"}))
public interface OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f35196OooO00o = OooO00o.f35197OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f35197OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final OooO0o f35198OooO0O0 = new OooO0o();
    }

    @Stable
    @Deprecated(message = "accompanist/insets is deprecated", replaceWith = @ReplaceWith(expression = "WindowInsets", imports = {"androidx.compose.foundation.layout.WindowInsets"}))
    public interface OooO0O0 extends OooOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final OooO00o f35199OooO0O0 = OooO00o.f35200OooO00o;

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final /* synthetic */ OooO00o f35200OooO00o = new OooO00o();

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @NotNull
            public static final OooO f35201OooO0O0 = new OooO();
        }

        @NotNull
        OooOO0 OooO00o();

        @NotNull
        OooOO0 OooO0O0();

        @FloatRange(from = 0.0d, to = 1.0d)
        float OooO0OO();

        boolean OooO0Oo();

        boolean isVisible();
    }

    @NotNull
    OooO0O0 OooO00o();

    @NotNull
    OooO0O0 OooO0O0();

    @NotNull
    OooO0O0 OooO0OO();

    @NotNull
    OooO0O0 OooO0Oo();

    @NotNull
    OooO0O0 OooO0o0();
}
