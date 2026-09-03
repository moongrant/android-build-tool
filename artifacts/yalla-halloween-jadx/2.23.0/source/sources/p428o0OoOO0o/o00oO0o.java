package p428o0OoOO0o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p135o00OOOo.OooO0OO;
import p136o00OOOo0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f45726OooO00o = LazyKt.lazy(OooO00o.f45727OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<OooOO0<CloudFileType>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f45727OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOO0<CloudFileType> invoke() {
            OooOO0<CloudFileType> oooOO1 = new OooOO0<>(new o0ooOOo());
            OooO0OO interceptor = new OooO0OO();
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            oooOO1.f37363OooO0O0.add(interceptor);
            return oooOO1;
        }
    }
}
