package p398o0Oo00oo;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.zeus.Zeus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p191o00o0O0.o00Oo0;
import p386o0OOooO.oo0o0Oo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000O0 extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43643OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f43644OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f43645OooO0o0;

    public o00000O0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43643OooO0Oo = context;
        this.f43645OooO0o0 = "NEF2iOBn1hqt2dif62bG5R8lO2jvDibGGBcCmNBbVBei25PM3O3Z0UbeRlxUGv0E";
        this.f43644OooO0o = "NEF2iOBn1hqt2dif62bG5R19XYNM/wbtUY+dYI3XyGar58LJUvL9to5Q5XU28FxY";
    }

    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        try {
            Zeus.INSTANCE.init(this.f43643OooO0Oo, oo0o0Oo.OooO0o() ? this.f43644OooO0o : this.f43645OooO0o0);
        } catch (Exception e) {
            o0000O00.OooO0Oo(e.toString());
        }
    }
}
