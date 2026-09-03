package p028Oooo0oO;

import android.animation.AnimatorSet;
import androidx.camera.core.OooOOOO;
import androidx.camera.video.internal.audio.OooO0o;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.o00oO0o;
import com.google.android.material.search.o0OOO0o;
import com.opensource.svgaplayer.OooO0OO;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0OOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1153OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1154OooO0o0;

    public /* synthetic */ o00O0OOO(Object obj, int i) {
        this.f1153OooO0Oo = i;
        this.f1154OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1153OooO0Oo) {
            case 0:
                ((OooOOOO) this.f1154OooO0o0).OooOOo0();
                return;
            case 1:
                OooO0o oooO0o = (OooO0o) this.f1154OooO0o0;
                oooO0o.f4091OooOO0O.set(false);
                oooO0o.f4088OooO0oO.release();
                synchronized (oooO0o.f4087OooO0o0) {
                    oooO0o.f4086OooO0o = null;
                    oooO0o.f4084OooO0OO.clear();
                    break;
                }
                return;
            case 2:
                o0OOO0o o0ooo0o2 = (o0OOO0o) this.f1154OooO0o0;
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = o0ooo0o2.f17564OooO0OO;
                clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
                AnimatorSet animatorSetOooO0oO = o0ooo0o2.OooO0oO(true);
                animatorSetOooO0oO.addListener(new o00oO0o(o0ooo0o2));
                animatorSetOooO0oO.start();
                return;
            default:
                OooO0OO.OooO0O0 oooO0O0 = (OooO0OO.OooO0O0) this.f1154OooO0o0;
                AtomicInteger atomicInteger = OooO0OO.f21241OooO0OO;
                if (oooO0O0 != null) {
                    oooO0O0.onError();
                    return;
                }
                return;
        }
    }
}
