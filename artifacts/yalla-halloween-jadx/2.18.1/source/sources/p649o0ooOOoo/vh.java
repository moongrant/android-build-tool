package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class vh implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50823OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f50824OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f50825OooO0OO;

    public vh(@NonNull ConstraintLayout constraintLayout, @NonNull SVGAView sVGAView, @NonNull SVGAView sVGAView2) {
        this.f50823OooO00o = constraintLayout;
        this.f50824OooO0O0 = sVGAView;
        this.f50825OooO0OO = sVGAView2;
    }

    @NonNull
    public static vh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50823OooO00o;
    }

    @NonNull
    public static vh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_vehicle_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.close;
        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.close)) != null) {
            i = R.id.image;
            SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.image);
            if (sVGAView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                SVGAView sVGAView2 = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaLoading);
                if (sVGAView2 != null) {
                    return new vh(constraintLayout, sVGAView, sVGAView2);
                }
                i = R.id.svgaLoading;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
