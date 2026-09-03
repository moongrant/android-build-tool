package p437o0OoOo0;

import android.view.View;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.motion.widget.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46065OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f46066OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46067OooO0o0;

    public /* synthetic */ Oooo000(int i, Object obj, Object obj2) {
        this.f46065OooO0Oo = i;
        this.f46067OooO0o0 = obj;
        this.f46066OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f46065OooO0Oo;
        Object obj = this.f46066OooO0o;
        Object obj2 = this.f46067OooO0o0;
        switch (i) {
            case 0:
                PreviewView.this.f4145OooOOO.OooO00o((SurfaceRequest) obj);
                break;
            default:
                OooO0OO oooO0OO = (OooO0OO) obj2;
                View[] viewArr = (View[]) obj;
                if (oooO0OO.f4761OooOOOo != -1) {
                    for (View view : viewArr) {
                        view.setTag(oooO0OO.f4761OooOOOo, Long.valueOf(System.nanoTime()));
                    }
                }
                if (oooO0OO.f4763OooOOo0 != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(oooO0OO.f4763OooOOo0, null);
                    }
                }
                break;
        }
    }
}
