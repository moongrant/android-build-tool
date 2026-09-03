package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    public static /* synthetic */ State OooO00o(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }
        if ((i3 & 1) != 0) {
            fontFamily = null;
        }
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i3 & 4) != 0) {
            i = FontStyle.INSTANCE.m3411getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            i2 = FontSynthesis.INSTANCE.m3421getAllGVVA2EU();
        }
        return resolver.mo3381resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
    }
}
