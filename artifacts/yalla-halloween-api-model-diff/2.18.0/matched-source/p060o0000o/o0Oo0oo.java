package p060o0000o;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.motion.widget.OooO0OO;
import com.facebook.appevents.codeless.CodelessLoggingEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f27834Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f27835OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f27836OoooO00;

    public /* synthetic */ o0Oo0oo(Object obj, Object obj2, int i) {
        this.f27834Oooo = i;
        this.f27836OoooO00 = obj;
        this.f27835OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27834Oooo) {
            case 0:
                OooO0OO oooO0OO = (OooO0OO) this.f27836OoooO00;
                View[] viewArr = (View[]) this.f27835OoooO0;
                if (oooO0OO.f7351OooOOOo != -1) {
                    for (View view : viewArr) {
                        view.setTag(oooO0OO.f7351OooOOOo, Long.valueOf(System.nanoTime()));
                    }
                }
                if (oooO0OO.f7353OooOOo0 != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(oooO0OO.f7353OooOOo0, null);
                    }
                }
                break;
            default:
                CodelessLoggingEventListener.m133logEvent$lambda0((String) this.f27836OoooO00, (Bundle) this.f27835OoooO0);
                break;
        }
    }
}
