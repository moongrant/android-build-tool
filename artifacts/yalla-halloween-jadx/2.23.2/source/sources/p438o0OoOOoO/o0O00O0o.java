package p438o0OoOOoO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p182o00o000O.OooOO0O;
import p183o00o000o.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O00O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f47174OooO00o = LazyKt.lazy(OooO00o.f47175OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<OooOO0O<CloudFileType>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47175OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOO0O<CloudFileType> invoke() {
            OooOO0O<CloudFileType> oooOO0O = new OooOO0O<>(new o0O00O());
            o000oOoO interceptor = new o000oOoO();
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            oooOO0O.f38413OooO0O0.add(interceptor);
            return oooOO0O;
        }
    }
}
