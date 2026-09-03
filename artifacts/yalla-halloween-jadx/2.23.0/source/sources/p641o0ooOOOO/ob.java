package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ob implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58550OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f58551OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58552OooO0OO;

    public ob(@NonNull ConstraintLayout constraintLayout, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f58550OooO00o = constraintLayout;
        this.f58551OooO0O0 = sVGAView;
        this.f58552OooO0OO = textView;
    }

    @NonNull
    public static ob inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58550OooO00o;
    }

    @NonNull
    public static ob inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_gift_type_custom_made_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivArrow;
        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.ivBg;
            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                int i2 = oO00O0oO.svgaView;
                SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i2, viewInflate);
                if (sVGAView != null) {
                    i2 = oO00O0oO.tvInfo;
                    TextView textView = (TextView) OooOO0.OooO00o(i2, viewInflate);
                    if (textView != null) {
                        return new ob(constraintLayout, sVGAView, textView);
                    }
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
