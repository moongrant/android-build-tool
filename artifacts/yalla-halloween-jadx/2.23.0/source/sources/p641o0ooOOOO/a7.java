package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class a7 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ScrollView f57486OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f57487OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57488OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57489OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57490OooO0o0;

    public a7(@NonNull ScrollView scrollView, @NonNull Button button, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.f57486OooO00o = scrollView;
        this.f57487OooO0O0 = button;
        this.f57488OooO0OO = linearLayout;
        this.f57489OooO0Oo = linearLayout2;
        this.f57490OooO0o0 = linearLayout3;
    }

    @NonNull
    public static a7 OooO00o(@NonNull View view) {
        int i = oO00O0oO.nodata_layout_bt_empty;
        if (((Button) OooOO0.OooO00o(i, view)) != null) {
            i = oO00O0oO.nodata_layout_bt_error;
            Button button = (Button) OooOO0.OooO00o(i, view);
            if (button != null) {
                i = oO00O0oO.nodata_layout_iv_error;
                if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
                    i = oO00O0oO.nodata_layout_iv_first_loading;
                    if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
                        i = oO00O0oO.nodata_layout_iv_no_data;
                        if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
                            ScrollView scrollView = (ScrollView) view;
                            i = oO00O0oO.nodata_layout_tv_blank_text;
                            if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                                i = oO00O0oO.nodata_layout_tv_error;
                                if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                                    i = oO00O0oO.nodata_layout_v_empty;
                                    LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, view);
                                    if (linearLayout != null) {
                                        i = oO00O0oO.nodata_layout_v_error;
                                        LinearLayout linearLayout2 = (LinearLayout) OooOO0.OooO00o(i, view);
                                        if (linearLayout2 != null) {
                                            i = oO00O0oO.nodata_layout_v_first;
                                            LinearLayout linearLayout3 = (LinearLayout) OooOO0.OooO00o(i, view);
                                            if (linearLayout3 != null) {
                                                return new a7(scrollView, button, linearLayout, linearLayout2, linearLayout3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static a7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57486OooO00o;
    }

    @NonNull
    public static a7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.nodata_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
