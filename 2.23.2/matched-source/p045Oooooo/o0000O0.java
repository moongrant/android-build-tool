package p045Oooooo;

import android.graphics.SurfaceTexture;
import androidx.camera.video.internal.BufferProvider;
import com.google.common.util.concurrent.OooOO0O;
import com.yy.yyeva.view.EvaAnimViewV3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import o000OO.OooOOO0;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOo;
import p033OoooO0O.o00oO0o;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1875OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1876OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1877OooO0o0;

    public /* synthetic */ o0000O0(int i, Object obj, Object obj2) {
        this.f1875OooO0Oo = i;
        this.f1877OooO0o0 = obj;
        this.f1876OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1875OooO0Oo;
        Object obj = this.f1876OooO0o;
        Object obj2 = this.f1877OooO0o0;
        switch (i) {
            case 0:
                final o0000Ooo.OooO0OO oooO0OO = (o0000Ooo.OooO0OO) obj2;
                o000Oo0.OooO00o oooO00o = (o000Oo0.OooO00o) obj;
                BufferProvider.State state = oooO0OO.f1930OooO0O0;
                if (state == BufferProvider.State.ACTIVE) {
                    o0000Ooo o0000ooo = o0000Ooo.this;
                    final OooOO0O<o000OO0O> oooOO0OOooO00o = o0000ooo.OooO00o();
                    OooOo.OooO0o(true, oooOO0OOooO00o, oooO00o, o00oO0o.OooO00o());
                    oooO00o.OooO00o(new Runnable() { // from class: Oooooo.o000OO
                        @Override // java.lang.Runnable
                        public final void run() {
                            o0000Ooo.OooO0OO oooO0OO2 = oooO0OO;
                            oooO0OO2.getClass();
                            OooOO0O oooOO0O = oooOO0OOooO00o;
                            if (oooOO0O.cancel(true)) {
                                return;
                            }
                            OooOOO0.OooO0o(null, oooOO0O.isDone());
                            try {
                                ((o000OO0O) oooOO0O.get()).cancel();
                            } catch (InterruptedException | CancellationException | ExecutionException e) {
                                o00O0O0.OooO0oo(o0000Ooo.this.f1887OooO00o, "Unable to cancel the input buffer: " + e);
                            }
                        }
                    }, o00oO0o.OooO00o());
                    oooO0OO.f1931OooO0OO.add(oooOO0OOooO00o);
                    oooOO0OOooO00o.OooO0oo(new o0000O(0, oooO0OO, oooOO0OOooO00o), o0000ooo.f1894OooO0oo);
                } else if (state != BufferProvider.State.INACTIVE) {
                    oooO00o.OooO0OO(new IllegalStateException("Unknown state: " + oooO0OO.f1930OooO0O0));
                } else {
                    oooO00o.OooO0OO(new IllegalStateException("BufferProvider is not active."));
                }
                break;
            default:
                EvaAnimViewV3.onSurfaceTextureAvailable$lambda$6((EvaAnimViewV3) obj2, (SurfaceTexture) obj);
                break;
        }
    }
}
