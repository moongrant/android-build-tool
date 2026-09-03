package androidx.media3.ui;

import android.widget.FrameLayout;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9633OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f9634OooO0o0;

    public /* synthetic */ OooOO0O(FrameLayout frameLayout, int i) {
        this.f9633OooO0Oo = i;
        this.f9634OooO0o0 = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9633OooO0Oo;
        FrameLayout frameLayout = this.f9634OooO0o0;
        switch (i) {
            case 0:
                float[] fArr = PlayerControlView.f9644o0OOO0o;
                ((PlayerControlView) frameLayout).OooOOOO();
                break;
            default:
                ((SearchView) frameLayout).OooO0Oo();
                break;
        }
    }
}
