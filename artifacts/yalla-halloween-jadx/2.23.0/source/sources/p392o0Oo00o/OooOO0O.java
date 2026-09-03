package p392o0Oo00o;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.zeus.Zeus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;
import p382o0OOoo0o.o00Ooo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0O extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44403OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f44404OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f44405OooO0o0;

    public OooOO0O(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44403OooO0Oo = context;
        this.f44405OooO0o0 = "NEF2iOBn1hqt2dif62bG5R8lO2jvDibGGBcCmNBbVBei25PM3O3Z0UbeRlxUGv0E";
        this.f44404OooO0o = "NEF2iOBn1hqt2dif62bG5R19XYNM/wbtUY+dYI3XyGar58LJUvL9to5Q5XU28FxY";
    }

    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        try {
            Zeus.INSTANCE.init(this.f44403OooO0Oo, o00Ooo.OooO0o() ? this.f44404OooO0o : this.f44405OooO0o0);
        } catch (Exception e) {
            OooOOO0.OooO0Oo(e.toString());
        }
    }
}
