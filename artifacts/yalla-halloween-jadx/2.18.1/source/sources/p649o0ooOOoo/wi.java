package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class wi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50908OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f50909OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50910OooO0OO;

    public wi(@NonNull ConstraintLayout constraintLayout, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f50908OooO00o = constraintLayout;
        this.f50909OooO0O0 = sVGAView;
        this.f50910OooO0OO = textView;
    }

    @NonNull
    public static wi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50908OooO00o;
    }

    @NonNull
    public static wi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_gift_type_custom_made_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivArrow;
        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivArrow)) != null) {
            i = R.id.ivBg;
            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBg)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaView);
                if (sVGAView != null) {
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvInfo);
                    if (textView != null) {
                        return new wi(constraintLayout, sVGAView, textView);
                    }
                    i = R.id.tvInfo;
                } else {
                    i = R.id.svgaView;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
