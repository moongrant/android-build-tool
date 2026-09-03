package p168o00Ooo0;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.ui.view.SVGAView;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f32646OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public SVGAView f32647OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public LifecycleOwner f32649OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f32648OooO0Oo = true;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f32645OooO00o = true;

    public o00O0O(LifecycleOwner lifecycleOwner, SVGAView sVGAView) {
        this.f32649OooO0o0 = lifecycleOwner;
        this.f32647OooO0OO = sVGAView;
    }

    public final void OooO00o(String str) {
        this.f32646OooO0O0 = str;
        if (this.f32648OooO0Oo) {
            this.f32647OooO0OO.setImageDrawable(null);
        }
        this.f32647OooO0OO.setVisibility(4);
        this.f32647OooO0OO.OooO0o0(false);
        if (OooO0OO.OooO00o(str)) {
            return;
        }
        if (this.f32645OooO00o && "/headframe/0.png".equals(str)) {
            return;
        }
        this.f32647OooO0OO.setVisibility(0);
        SVGAView sVGAView = this.f32647OooO0OO;
        sVGAView.f21010OooooO0 = 0;
        sVGAView.OooO0oo(this.f32646OooO0O0, this.f32649OooO0o0);
        sVGAView.OooO();
    }
}
