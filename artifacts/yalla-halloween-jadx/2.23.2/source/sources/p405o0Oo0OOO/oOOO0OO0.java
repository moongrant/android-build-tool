package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0OO0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ScrollView f45166OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f45167OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45168OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45169OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45170OooO0o0;

    public oOOO0OO0(@NonNull ScrollView scrollView, @NonNull Button button, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.f45166OooO00o = scrollView;
        this.f45167OooO0O0 = button;
        this.f45168OooO0OO = linearLayout;
        this.f45169OooO0Oo = linearLayout2;
        this.f45170OooO0o0 = linearLayout3;
    }

    @NonNull
    public static oOOO0OO0 OooO00o(@NonNull View view) {
        int i = o0OO00O.nodata_layout_bt_empty;
        if (((Button) OooO0O0.OooO00o(i, view)) != null) {
            i = o0OO00O.nodata_layout_bt_error;
            Button button = (Button) OooO0O0.OooO00o(i, view);
            if (button != null) {
                i = o0OO00O.nodata_layout_iv_error;
                if (((ImageView) OooO0O0.OooO00o(i, view)) != null) {
                    i = o0OO00O.nodata_layout_iv_first_loading;
                    if (((ImageView) OooO0O0.OooO00o(i, view)) != null) {
                        i = o0OO00O.nodata_layout_iv_no_data;
                        if (((ImageView) OooO0O0.OooO00o(i, view)) != null) {
                            ScrollView scrollView = (ScrollView) view;
                            i = o0OO00O.nodata_layout_tv_blank_text;
                            if (((TextView) OooO0O0.OooO00o(i, view)) != null) {
                                i = o0OO00O.nodata_layout_tv_error;
                                if (((TextView) OooO0O0.OooO00o(i, view)) != null) {
                                    i = o0OO00O.nodata_layout_v_empty;
                                    LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, view);
                                    if (linearLayout != null) {
                                        i = o0OO00O.nodata_layout_v_error;
                                        LinearLayout linearLayout2 = (LinearLayout) OooO0O0.OooO00o(i, view);
                                        if (linearLayout2 != null) {
                                            i = o0OO00O.nodata_layout_v_first;
                                            LinearLayout linearLayout3 = (LinearLayout) OooO0O0.OooO00o(i, view);
                                            if (linearLayout3 != null) {
                                                return new oOOO0OO0(scrollView, button, linearLayout, linearLayout2, linearLayout3);
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
    public static oOOO0OO0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45166OooO00o;
    }

    @NonNull
    public static oOOO0OO0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.nodata_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
