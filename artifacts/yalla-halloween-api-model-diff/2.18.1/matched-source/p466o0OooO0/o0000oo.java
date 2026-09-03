package p466o0OooO0;

import android.widget.TextView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.OooOOO0;
import com.google.android.exoplayer2.OooOo;
import com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000oo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f40518Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f40519Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f40520Oooo0oo;

    public /* synthetic */ o0000oo(Object obj, Object obj2, int i) {
        this.f40518Oooo0o = i;
        this.f40519Oooo0oO = obj;
        this.f40520Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40518Oooo0o) {
            case 0:
                OooOOO0 oooOOO0 = (OooOOO0) this.f40519Oooo0oO;
                OooOo oooOo = (OooOo) this.f40520Oooo0oo;
                Objects.requireNonNull(oooOOO0);
                try {
                    oooOOO0.OooO0OO(oooOo);
                    return;
                } catch (ExoPlaybackException e) {
                    p318o0O0oOo.o0000oo.OooO0O0("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            default:
                GooglePayQuickUI.m288xf51d7d14((TextView) this.f40519Oooo0oO, (GooglePayQuickUI) this.f40520Oooo0oo);
                return;
        }
    }
}
