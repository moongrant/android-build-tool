package p121o00O0Ooo;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import coil.request.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f36479OooO00o = Constraints.INSTANCE.m3751fixedJhjzzOo(0, 0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f36480OooO0O0 = 0;

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final OooO00o OooO00o(@Nullable Object obj, @Nullable Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1151830858, 8, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        if (obj instanceof OooO00o) {
            return (OooO00o) obj;
        }
        OooO00o.C0189OooO00o c0189OooO00o = new OooO00o.C0189OooO00o((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        c0189OooO00o.f11680OooO0OO = obj;
        return c0189OooO00o.OooO00o();
    }
}
