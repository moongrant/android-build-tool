package p649o0ooOOoo;

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
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ie implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ScrollView f49665OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f49666OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49667OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49668OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49669OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49670OooO0o0;

    public ie(@NonNull ScrollView scrollView, @NonNull Button button, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.f49665OooO00o = scrollView;
        this.f49666OooO0O0 = button;
        this.f49667OooO0OO = imageView;
        this.f49668OooO0Oo = linearLayout;
        this.f49670OooO0o0 = linearLayout2;
        this.f49669OooO0o = linearLayout3;
    }

    @NonNull
    public static ie OooO00o(@NonNull View view) {
        int i = R.id.nodata_layout_bt_empty;
        if (((Button) o00Oo0.OooO00o(view, R.id.nodata_layout_bt_empty)) != null) {
            i = R.id.nodata_layout_bt_error;
            Button button = (Button) o00Oo0.OooO00o(view, R.id.nodata_layout_bt_error);
            if (button != null) {
                i = R.id.nodata_layout_iv_error;
                if (((ImageView) o00Oo0.OooO00o(view, R.id.nodata_layout_iv_error)) != null) {
                    i = R.id.nodata_layout_iv_first_loading;
                    ImageView imageView = (ImageView) o00Oo0.OooO00o(view, R.id.nodata_layout_iv_first_loading);
                    if (imageView != null) {
                        i = R.id.nodata_layout_iv_no_data;
                        if (((ImageView) o00Oo0.OooO00o(view, R.id.nodata_layout_iv_no_data)) != null) {
                            ScrollView scrollView = (ScrollView) view;
                            i = R.id.nodata_layout_tv_blank_text;
                            if (((TextView) o00Oo0.OooO00o(view, R.id.nodata_layout_tv_blank_text)) != null) {
                                i = R.id.nodata_layout_tv_error;
                                if (((TextView) o00Oo0.OooO00o(view, R.id.nodata_layout_tv_error)) != null) {
                                    i = R.id.nodata_layout_v_empty;
                                    LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(view, R.id.nodata_layout_v_empty);
                                    if (linearLayout != null) {
                                        i = R.id.nodata_layout_v_error;
                                        LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(view, R.id.nodata_layout_v_error);
                                        if (linearLayout2 != null) {
                                            i = R.id.nodata_layout_v_first;
                                            LinearLayout linearLayout3 = (LinearLayout) o00Oo0.OooO00o(view, R.id.nodata_layout_v_first);
                                            if (linearLayout3 != null) {
                                                return new ie(scrollView, button, imageView, linearLayout, linearLayout2, linearLayout3);
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
    public static ie inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49665OooO00o;
    }

    @NonNull
    public static ie inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.nodata_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
