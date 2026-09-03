package p468o0OooO0;

import android.widget.TextView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.OooOOO0;
import com.google.android.exoplayer2.OooOo;
import com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickUI;
import java.util.Objects;
import p319o0O0oOo.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000oo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f40537Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f40538OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f40539OoooO00;

    public /* synthetic */ o0000oo(Object obj, Object obj2, int i) {
        this.f40537Oooo = i;
        this.f40539OoooO00 = obj;
        this.f40538OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40537Oooo) {
            case 0:
                OooOOO0 oooOOO0 = (OooOOO0) this.f40539OoooO00;
                OooOo oooOo = (OooOo) this.f40538OoooO0;
                Objects.requireNonNull(oooOOO0);
                try {
                    oooOOO0.OooO0OO(oooOo);
                    return;
                } catch (ExoPlaybackException e) {
                    o0000O0.OooO0O0("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            default:
                GooglePayQuickUI.m288xf51d7d14((TextView) this.f40539OoooO00, (GooglePayQuickUI) this.f40538OoooO0);
                return;
        }
    }
}
