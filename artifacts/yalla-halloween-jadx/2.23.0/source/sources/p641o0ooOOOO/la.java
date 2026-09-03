package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class la implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58378OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f58379OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f58380OooO0OO;

    public la(@NonNull ConstraintLayout constraintLayout, @NonNull SVGAView sVGAView, @NonNull SVGAView sVGAView2) {
        this.f58378OooO00o = constraintLayout;
        this.f58379OooO0O0 = sVGAView;
        this.f58380OooO0OO = sVGAView2;
    }

    @NonNull
    public static la inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58378OooO00o;
    }

    @NonNull
    public static la inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_activity_vehicle_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.close;
        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.image;
            SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
            if (sVGAView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                int i2 = oO00O0oO.svgaLoading;
                SVGAView sVGAView2 = (SVGAView) OooOO0.OooO00o(i2, viewInflate);
                if (sVGAView2 != null) {
                    return new la(constraintLayout, sVGAView, sVGAView2);
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
