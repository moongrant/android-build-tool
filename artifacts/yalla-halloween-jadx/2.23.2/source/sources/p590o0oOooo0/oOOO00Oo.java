package p590o0oOooo0;

import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f57225OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f57226OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SVGAView f57227OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f57228OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LifecycleOwner f57229OooO0o0;

    public oOOO00Oo() {
        throw null;
    }

    public oOOO00Oo(LifecycleOwner lifecycleOwner, SVGAView sVGAView) {
        this.f57228OooO0Oo = true;
        this.f57229OooO0o0 = null;
        this.f57229OooO0o0 = lifecycleOwner;
        this.f57227OooO0OO = sVGAView;
        this.f57225OooO00o = true;
    }

    public final void OooO00o(String str) {
        this.f57226OooO0O0 = str;
        boolean z = this.f57228OooO0Oo;
        SVGAView sVGAView = this.f57227OooO0OO;
        if (z) {
            sVGAView.setImageDrawable(null);
        }
        sVGAView.setVisibility(4);
        sVGAView.OooO0oO(false);
        if (OooOo00.OooO00o(str)) {
            return;
        }
        if (this.f57225OooO00o && "/headframe/0.png".equals(str)) {
            return;
        }
        sVGAView.setVisibility(0);
        sVGAView.f13232OooOooO = 0;
        sVGAView.setImageResource(0);
        sVGAView.OooOO0O(this.f57226OooO0O0, this.f57229OooO0o0);
        sVGAView.OooOO0o();
    }
}
