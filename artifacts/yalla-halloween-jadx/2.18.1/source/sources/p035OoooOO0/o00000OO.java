package p035OoooOO0;

import androidx.compose.material.ripple.RippleHostView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Map<o0OOO0o, RippleHostView> f3604OooO00o = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Map<RippleHostView, o0OOO0o> f3605OooO0O0 = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<OoooOO0.o0OOO0o, androidx.compose.material.ripple.RippleHostView>] */
    public final void OooO00o(@NotNull o0OOO0o indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        RippleHostView rippleHostView = (RippleHostView) this.f3604OooO00o.get(indicationInstance);
        if (rippleHostView != null) {
            this.f3605OooO0O0.remove(rippleHostView);
        }
        this.f3604OooO00o.remove(indicationInstance);
    }
}
