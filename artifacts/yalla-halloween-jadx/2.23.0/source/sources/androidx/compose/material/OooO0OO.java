package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO {
    public static SkippableUpdater OooO00o(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, Density density, Composer composer3, LayoutDirection layoutDirection, Composer composer4, ViewConfiguration viewConfiguration, Composer composer5, Composer composer6) {
        Updater.m1316setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1316setimpl(composer2, density, companion.getSetDensity());
        Updater.m1316setimpl(composer3, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1316setimpl(composer4, viewConfiguration, companion.getSetViewConfiguration());
        composer5.enableReusing();
        return SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer6));
    }
}
