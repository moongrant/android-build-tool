package androidx.compose.animation;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.media3.common.MediaMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements androidx.media3.common.OooO0OO.OooO00o {
    public static Function2 OooO00o(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m1327setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1327setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        return companion.getSetCompositeKeyHash();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        String string = bundle.getString(androidx.media3.common.OooOOO0.f6476OooOO0O, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(androidx.media3.common.OooOOO0.f6477OooOO0o);
        androidx.media3.common.OooOOO0.OooOO0 oooOO1 = bundle2 == null ? androidx.media3.common.OooOOO0.OooOO0.f6549OooO : (androidx.media3.common.OooOOO0.OooOO0) androidx.media3.common.OooOOO0.OooOO0.f6555OooOOOO.OooO0OO(bundle2);
        Bundle bundle3 = bundle.getBundle(androidx.media3.common.OooOOO0.f6479OooOOO0);
        MediaMetadata mediaMetadata = bundle3 == null ? MediaMetadata.f6236Oooo0o0 : (MediaMetadata) MediaMetadata.f6263o00oO0O.OooO0OO(bundle3);
        Bundle bundle4 = bundle.getBundle(androidx.media3.common.OooOOO0.f6478OooOOO);
        androidx.media3.common.OooOOO0.OooO0o oooO0o = bundle4 == null ? androidx.media3.common.OooOOO0.OooO0o.f6548OooOOOo : (androidx.media3.common.OooOOO0.OooO0o) androidx.media3.common.OooOOO0.OooO0OO.f6537OooOOOO.OooO0OO(bundle4);
        Bundle bundle5 = bundle.getBundle(androidx.media3.common.OooOOO0.f6480OooOOOO);
        androidx.media3.common.OooOOO0.C0139OooOOO0 c0139OooOOO0 = bundle5 == null ? androidx.media3.common.OooOOO0.C0139OooOOO0.f6583OooO0oO : (androidx.media3.common.OooOOO0.C0139OooOOO0) androidx.media3.common.OooOOO0.C0139OooOOO0.f6586OooOO0O.OooO0OO(bundle5);
        Bundle bundle6 = bundle.getBundle(androidx.media3.common.OooOOO0.f6481OooOOOo);
        return new androidx.media3.common.OooOOO0(string, oooO0o, bundle6 == null ? null : (androidx.media3.common.OooOOO0.OooOO0O) androidx.media3.common.OooOOO0.OooOO0O.f6573OooOOoo.OooO0OO(bundle6), oooOO1, mediaMetadata, c0139OooOOO0);
    }
}
