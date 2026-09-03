package p060o0000o;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.motion.widget.OooO0OO;
import com.facebook.appevents.codeless.CodelessLoggingEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f27814Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f27815Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f27816Oooo0oo;

    public /* synthetic */ o0Oo0oo(Object obj, Object obj2, int i) {
        this.f27814Oooo0o = i;
        this.f27815Oooo0oO = obj;
        this.f27816Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27814Oooo0o) {
            case 0:
                OooO0OO oooO0OO = (OooO0OO) this.f27815Oooo0oO;
                View[] viewArr = (View[]) this.f27816Oooo0oo;
                if (oooO0OO.f7336OooOOOo != -1) {
                    for (View view : viewArr) {
                        view.setTag(oooO0OO.f7336OooOOOo, Long.valueOf(System.nanoTime()));
                    }
                }
                if (oooO0OO.f7338OooOOo0 != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(oooO0OO.f7338OooOOo0, null);
                    }
                }
                break;
            default:
                CodelessLoggingEventListener.m133logEvent$lambda0((String) this.f27815Oooo0oO, (Bundle) this.f27816Oooo0oo);
                break;
        }
    }
}
