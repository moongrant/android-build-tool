package p121o00O0Ooo;

import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import kotlin.jvm.functions.Function1;
import o00OO000.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o000oOoO;
import p031OoooO0.o00Ooo;
import p118o00O0Oo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f36450OooO00o = new OooO00o();

    public static final class OooO00o implements OooO0o {
        @Override // p132o00O0ooo.o00O000o
        @MainThread
        public final void OooO00o(@NotNull Drawable drawable) {
        }

        @Override // p132o00O0ooo.o00O000o
        @MainThread
        public final void OooO0O0(@Nullable Drawable drawable) {
        }

        @Override // p132o00O0ooo.o00O000o
        @MainThread
        public final void OooO0OO(@Nullable Drawable drawable) {
        }

        @Override // o00OO000.OooO0o
        @Nullable
        public final Drawable OooO0Oo() {
            return null;
        }
    }

    @Composable
    @NotNull
    public static final o0000 OooO00o(@Nullable Object obj, @NotNull o00000O o00000o, @Nullable Function1 function1, @Nullable Function1 function2, @Nullable ContentScale contentScale, int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-2020614074);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020614074, i2, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:131)");
        }
        coil.request.OooO00o OooO00o2 = o000Oo0.OooO00o(obj, composer);
        Object obj2 = OooO00o2.f11640OooO0O0;
        if (obj2 instanceof coil.request.OooO00o.C0189OooO00o) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj2 instanceof ImageBitmap) {
            OooO0O0("ImageBitmap");
            throw null;
        }
        if (obj2 instanceof ImageVector) {
            OooO0O0("ImageVector");
            throw null;
        }
        if (obj2 instanceof Painter) {
            OooO0O0("Painter");
            throw null;
        }
        if (!(OooO00o2.f11641OooO0OO == null)) {
            throw new IllegalArgumentException("request.target must be null.".toString());
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new o0000(OooO00o2, o00000o);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        o0000 o0000Var = (o0000) objRememberedValue;
        o0000Var.f36427OooOO0O = function1;
        o0000Var.f36428OooOO0o = function2;
        o0000Var.f36430OooOOO0 = contentScale;
        o0000Var.f36429OooOOO = i;
        o0000Var.f36431OooOOOO = ((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
        o0000Var.f36433OooOOo.setValue(o00000o);
        o0000Var.f36434OooOOo0.setValue(OooO00o2);
        o0000Var.onRemembered();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0000Var;
    }

    public static void OooO0O0(String str) {
        throw new IllegalArgumentException(o00Ooo.OooO00o("Unsupported type: ", str, ". ", o000oOoO.OooO0O0("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
