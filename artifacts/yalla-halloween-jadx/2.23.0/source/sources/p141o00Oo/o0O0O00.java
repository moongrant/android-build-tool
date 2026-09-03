package p141o00Oo;

import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.io.ConstantsKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O00 {
    @Composable
    @NotNull
    public static o0Oo0oo OooO00o(long j, long j2, long j3, @Nullable Composer composer, int i, int i2) {
        long jM1715compositeOverOWjLjI;
        composer.startReplaceableGroup(1614817291);
        long jM1023getPrimary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1023getPrimary0d7_KjU() : j;
        if ((i2 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            jM1715compositeOverOWjLjI = ColorKt.m1715compositeOverOWjLjI(Color.m1669copywmQWz5c$default(materialTheme.getColors(composer, i3).m1022getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, i3).m1027getSurface0d7_KjU());
        } else {
            jM1715compositeOverOWjLjI = 0;
        }
        long jM1023getPrimary0d7_KjU2 = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1023getPrimary0d7_KjU() : j2;
        long jM1669copywmQWz5c$default = (i2 & 8) != 0 ? Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU2, 0.24f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM1669copywmQWz5c$default2 = (i2 & 16) != 0 ? Color.m1669copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1022getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        long jM1669copywmQWz5c$default3 = (i2 & 32) != 0 ? Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default2, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        long jM1669copywmQWz5c$default4 = (i2 & 64) != 0 ? Color.m1669copywmQWz5c$default(ColorsKt.m1041contentColorForek8zF_U(jM1023getPrimary0d7_KjU2, composer, 0), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        long jM1669copywmQWz5c$default5 = (i2 & 128) != 0 ? Color.m1669copywmQWz5c$default(jM1023getPrimary0d7_KjU2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        long jM1669copywmQWz5c$default6 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default4, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        long jM1669copywmQWz5c$default7 = (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? Color.m1669copywmQWz5c$default(jM1669copywmQWz5c$default3, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1614817291, 0, i, "com.code.android.uikit.slider.core.SliderDefaults.colors (CustomSlider.kt:490)");
        }
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(jM1023getPrimary0d7_KjU, jM1715compositeOverOWjLjI, jM1023getPrimary0d7_KjU2, jM1669copywmQWz5c$default, jM1669copywmQWz5c$default2, jM1669copywmQWz5c$default3, jM1669copywmQWz5c$default4, jM1669copywmQWz5c$default5, jM1669copywmQWz5c$default6, jM1669copywmQWz5c$default7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0oo0oo2;
    }
}
