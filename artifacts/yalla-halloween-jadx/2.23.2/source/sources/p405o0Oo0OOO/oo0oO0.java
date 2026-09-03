package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45270OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f45271OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f45272OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f45273OooO0Oo;

    public oo0oO0(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f45270OooO00o = linearLayout;
        this.f45271OooO0O0 = view;
        this.f45272OooO0OO = view2;
        this.f45273OooO0Oo = view3;
    }

    @NonNull
    public static oo0oO0 OooO00o(@NonNull View view) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewOooO00o3;
        LinearLayout linearLayout = (LinearLayout) view;
        int i = o0OO00O.include_image_text_text_image_line_iv_1;
        if (((ImageView) OooO0O0.OooO00o(i, view)) != null) {
            i = o0OO00O.include_image_text_text_image_line_iv_2;
            if (((ImageView) OooO0O0.OooO00o(i, view)) != null) {
                i = o0OO00O.include_image_text_text_image_line_layout;
                if (((RelativeLayout) OooO0O0.OooO00o(i, view)) != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.include_image_text_text_image_line_line_b), view)) != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o0OO00O.include_image_text_text_image_line_line_b10), view)) != null && (viewOooO00o3 = OooO0O0.OooO00o((i = o0OO00O.include_image_text_text_image_line_point_red), view)) != null) {
                    i = o0OO00O.include_image_text_text_image_line_tv_1;
                    if (((TextView) OooO0O0.OooO00o(i, view)) != null) {
                        i = o0OO00O.include_image_text_text_image_line_tv_2;
                        if (((TextView) OooO0O0.OooO00o(i, view)) != null) {
                            return new oo0oO0(linearLayout, viewOooO00o, viewOooO00o2, viewOooO00o3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static oo0oO0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45270OooO00o;
    }

    @NonNull
    public static oo0oO0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.include_image_text_text_image_line, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
