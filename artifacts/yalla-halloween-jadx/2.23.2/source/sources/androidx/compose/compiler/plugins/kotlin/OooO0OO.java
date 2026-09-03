package androidx.compose.compiler.plugins.kotlin;

import android.os.Bundle;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements androidx.media3.common.OooO0OO.OooO00o {
    public static StringBuilder OooO00o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        int i = bundle.getInt(Oooo0.OooO0O0.f6634OooOO0O, 0);
        long j = bundle.getLong(Oooo0.OooO0O0.f6635OooOO0o, -9223372036854775807L);
        long j2 = bundle.getLong(Oooo0.OooO0O0.f6637OooOOO0, 0L);
        boolean z = bundle.getBoolean(Oooo0.OooO0O0.f6636OooOOO, false);
        Bundle bundle2 = bundle.getBundle(Oooo0.OooO0O0.f6638OooOOOO);
        AdPlaybackState adPlaybackState = bundle2 != null ? (AdPlaybackState) AdPlaybackState.f6182OooOOOo.OooO0OO(bundle2) : AdPlaybackState.f6176OooOO0;
        Oooo0.OooO0O0 oooO0O0 = new Oooo0.OooO0O0();
        oooO0O0.OooOOO0(null, null, i, j, j2, adPlaybackState, z);
        return oooO0O0;
    }
}
