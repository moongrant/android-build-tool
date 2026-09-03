package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.code.android.uikit.svga.SVGAView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ec implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57866OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f57867OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f57868OooO0OO;

    public ec(@NonNull ConstraintLayout constraintLayout, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f57866OooO00o = constraintLayout;
        this.f57867OooO0O0 = sVGAView;
        this.f57868OooO0OO = textView;
    }

    @NonNull
    public static ec inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57866OooO00o;
    }

    @NonNull
    public static ec inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_user_wealth_tag, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.guideline1;
        if (((Guideline) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.guideline2;
            if (((Guideline) OooOO0.OooO00o(i, viewInflate)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                int i2 = oO00O0oO.svga;
                SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i2, viewInflate);
                if (sVGAView != null) {
                    i2 = oO00O0oO.tvLevel;
                    TextView textView = (TextView) OooOO0.OooO00o(i2, viewInflate);
                    if (textView != null) {
                        return new ec(constraintLayout, sVGAView, textView);
                    }
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
