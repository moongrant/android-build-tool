package p198o00o0Oo;

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
public final class o0oOO {
    @Composable
    @NotNull
    public static o00OOOO0 OooO00o(long j, long j2, long j3, @Nullable Composer composer, int i, int i2) {
        long jM1726compositeOverOWjLjI;
        composer.startReplaceableGroup(1614817291);
        long jM1039getPrimary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1039getPrimary0d7_KjU() : j;
        if ((i2 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            jM1726compositeOverOWjLjI = ColorKt.m1726compositeOverOWjLjI(Color.m1680copywmQWz5c$default(materialTheme.getColors(composer, i3).m1038getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, i3).m1043getSurface0d7_KjU());
        } else {
            jM1726compositeOverOWjLjI = 0;
        }
        long jM1039getPrimary0d7_KjU2 = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1039getPrimary0d7_KjU() : j2;
        long jM1680copywmQWz5c$default = (i2 & 8) != 0 ? Color.m1680copywmQWz5c$default(jM1039getPrimary0d7_KjU2, 0.24f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM1680copywmQWz5c$default2 = (i2 & 16) != 0 ? Color.m1680copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1038getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        long jM1680copywmQWz5c$default3 = (i2 & 32) != 0 ? Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        long jM1680copywmQWz5c$default4 = (i2 & 64) != 0 ? Color.m1680copywmQWz5c$default(ColorsKt.m1057contentColorForek8zF_U(jM1039getPrimary0d7_KjU2, composer, 0), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        long jM1680copywmQWz5c$default5 = (i2 & 128) != 0 ? Color.m1680copywmQWz5c$default(jM1039getPrimary0d7_KjU2, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        long jM1680copywmQWz5c$default6 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default4, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        long jM1680copywmQWz5c$default7 = (i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default3, 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : 0L;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1614817291, 0, i, "com.code.android.uikit.slider.core.SliderDefaults.colors (CustomSlider.kt:506)");
        }
        o00OOOO0 o00oooo1 = new o00OOOO0(jM1039getPrimary0d7_KjU, jM1726compositeOverOWjLjI, jM1039getPrimary0d7_KjU2, jM1680copywmQWz5c$default, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default3, jM1680copywmQWz5c$default4, jM1680copywmQWz5c$default5, jM1680copywmQWz5c$default6, jM1680copywmQWz5c$default7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o00oooo1;
    }
}
