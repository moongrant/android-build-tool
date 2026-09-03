package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class r2 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58713OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f58714OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f58715OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f58716OooO0Oo;

    public r2(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f58713OooO00o = linearLayout;
        this.f58714OooO0O0 = view;
        this.f58715OooO0OO = view2;
        this.f58716OooO0Oo = view3;
    }

    @NonNull
    public static r2 OooO00o(@NonNull View view) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewOooO00o3;
        LinearLayout linearLayout = (LinearLayout) view;
        int i = oO00O0oO.include_image_text_text_image_line_iv_1;
        if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
            i = oO00O0oO.include_image_text_text_image_line_iv_2;
            if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
                i = oO00O0oO.include_image_text_text_image_line_layout;
                if (((RelativeLayout) OooOO0.OooO00o(i, view)) != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.include_image_text_text_image_line_line_b), view)) != null && (viewOooO00o2 = OooOO0.OooO00o((i = oO00O0oO.include_image_text_text_image_line_line_b10), view)) != null && (viewOooO00o3 = OooOO0.OooO00o((i = oO00O0oO.include_image_text_text_image_line_point_red), view)) != null) {
                    i = oO00O0oO.include_image_text_text_image_line_tv_1;
                    if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                        i = oO00O0oO.include_image_text_text_image_line_tv_2;
                        if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                            return new r2(linearLayout, viewOooO00o, viewOooO00o2, viewOooO00o3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static r2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58713OooO00o;
    }

    @NonNull
    public static r2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.include_image_text_text_image_line, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
