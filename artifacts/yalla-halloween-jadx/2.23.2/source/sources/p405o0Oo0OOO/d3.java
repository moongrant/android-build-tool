package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class d3 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43787OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f43788OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f43789OooO0OO;

    public d3(@NonNull ConstraintLayout constraintLayout, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f43787OooO00o = constraintLayout;
        this.f43788OooO0O0 = sVGAView;
        this.f43789OooO0OO = textView;
    }

    @NonNull
    public static d3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43787OooO00o;
    }

    @NonNull
    public static d3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_gift_type_custom_made_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivArrow;
        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.ivBg;
            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                int i2 = o0OO00O.svgaView;
                SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i2, viewInflate);
                if (sVGAView != null) {
                    i2 = o0OO00O.tvInfo;
                    TextView textView = (TextView) OooO0O0.OooO00o(i2, viewInflate);
                    if (textView != null) {
                        return new d3(constraintLayout, sVGAView, textView);
                    }
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
