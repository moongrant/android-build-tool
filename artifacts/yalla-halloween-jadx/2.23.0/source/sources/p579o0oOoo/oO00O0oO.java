package p579o0oOoo;

import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00O0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f56550OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f56551OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SVGAView f56552OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f56553OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LifecycleOwner f56554OooO0o0;

    public oO00O0oO() {
        throw null;
    }

    public oO00O0oO(LifecycleOwner lifecycleOwner, SVGAView sVGAView) {
        this.f56553OooO0Oo = true;
        this.f56554OooO0o0 = null;
        this.f56554OooO0o0 = lifecycleOwner;
        this.f56552OooO0OO = sVGAView;
        this.f56550OooO00o = true;
    }

    public final void OooO00o(String str) {
        this.f56551OooO0O0 = str;
        boolean z = this.f56553OooO0Oo;
        SVGAView sVGAView = this.f56552OooO0OO;
        if (z) {
            sVGAView.setImageDrawable(null);
        }
        sVGAView.setVisibility(4);
        sVGAView.OooO0oO(false);
        if (OooOo00.OooO00o(str)) {
            return;
        }
        if (this.f56550OooO00o && "/headframe/0.png".equals(str)) {
            return;
        }
        sVGAView.setVisibility(0);
        sVGAView.f10172OooOooO = 0;
        sVGAView.setImageResource(0);
        sVGAView.OooOO0O(this.f56551OooO0O0, this.f56554OooO0o0);
        sVGAView.OooOO0o();
    }
}
