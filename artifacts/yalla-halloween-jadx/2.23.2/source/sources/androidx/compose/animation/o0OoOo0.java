package androidx.compose.animation;

import android.os.Bundle;
import androidx.media3.common.Player;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OoOo0 implements androidx.media3.common.OooO0OO.OooO00o {
    public static int OooO00o(float f, int i, int i2) {
        return (Float.floatToIntBits(f) + i) * i2;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        int i = bundle.getInt(Player.OooO0o.f6708OooOOO0, 0);
        Bundle bundle2 = bundle.getBundle(Player.OooO0o.f6707OooOOO);
        return new Player.OooO0o(null, i, bundle2 == null ? null : (androidx.media3.common.OooOOO0) androidx.media3.common.OooOOO0.f6482OooOOo0.OooO0OO(bundle2), null, bundle.getInt(Player.OooO0o.f6709OooOOOO, 0), bundle.getLong(Player.OooO0o.f6710OooOOOo, 0L), bundle.getLong(Player.OooO0o.f6712OooOOo0, 0L), bundle.getInt(Player.OooO0o.f6711OooOOo, -1), bundle.getInt(Player.OooO0o.f6713OooOOoo, -1));
    }
}
