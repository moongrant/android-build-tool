package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.code.android.uikit.svga.SVGAView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class t3 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45564OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f45565OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f45566OooO0OO;

    public t3(@NonNull ConstraintLayout constraintLayout, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f45564OooO00o = constraintLayout;
        this.f45565OooO0O0 = sVGAView;
        this.f45566OooO0OO = textView;
    }

    @NonNull
    public static t3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45564OooO00o;
    }

    @NonNull
    public static t3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_user_wealth_tag, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.guideline1;
        if (((Guideline) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.guideline2;
            if (((Guideline) OooO0O0.OooO00o(i, viewInflate)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                int i2 = o0OO00O.svga;
                SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i2, viewInflate);
                if (sVGAView != null) {
                    i2 = o0OO00O.tvLevel;
                    TextView textView = (TextView) OooO0O0.OooO00o(i2, viewInflate);
                    if (textView != null) {
                        return new t3(constraintLayout, sVGAView, textView);
                    }
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
