package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class a2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43716OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f43717OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f43718OooO0OO;

    public a2(@NonNull ConstraintLayout constraintLayout, @NonNull SVGAView sVGAView, @NonNull SVGAView sVGAView2) {
        this.f43716OooO00o = constraintLayout;
        this.f43717OooO0O0 = sVGAView;
        this.f43718OooO0OO = sVGAView2;
    }

    @NonNull
    public static a2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43716OooO00o;
    }

    @NonNull
    public static a2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_vehicle_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.close;
        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.image;
            SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
            if (sVGAView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                int i2 = o0OO00O.svgaLoading;
                SVGAView sVGAView2 = (SVGAView) OooO0O0.OooO00o(i2, viewInflate);
                if (sVGAView2 != null) {
                    return new a2(constraintLayout, sVGAView, sVGAView2);
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
