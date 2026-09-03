package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import com.google.android.exoplayer2.Player;
import p245o00oo0o.o00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo00 implements o00O.OooO00o {
    public static Object OooO00o(Composer composer, int i, int i2) {
        composer.startReplaceableGroup(i);
        composer.startReplaceableGroup(i2);
        return composer.rememberedValue();
    }

    @Override // o00oo0o.o00O.OooO00o
    public void invoke(Object obj) {
        ((Player.OooO0OO) obj).onRenderedFirstFrame();
    }
}
