package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class i9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49646OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f49647OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f49648OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f49649OooO0Oo;

    public i9(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f49646OooO00o = linearLayout;
        this.f49647OooO0O0 = view;
        this.f49648OooO0OO = view2;
        this.f49649OooO0Oo = view3;
    }

    @NonNull
    public static i9 OooO00o(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.include_image_text_text_image_line_iv_1;
        if (((ImageView) o00Oo0.OooO00o(view, R.id.include_image_text_text_image_line_iv_1)) != null) {
            i = R.id.include_image_text_text_image_line_iv_2;
            if (((ImageView) o00Oo0.OooO00o(view, R.id.include_image_text_text_image_line_iv_2)) != null) {
                i = R.id.include_image_text_text_image_line_layout;
                if (((RelativeLayout) o00Oo0.OooO00o(view, R.id.include_image_text_text_image_line_layout)) != null) {
                    i = R.id.include_image_text_text_image_line_line_b;
                    View viewOooO00o = o00Oo0.OooO00o(view, R.id.include_image_text_text_image_line_line_b);
                    if (viewOooO00o != null) {
                        i = R.id.include_image_text_text_image_line_line_b10;
                        View viewOooO00o2 = o00Oo0.OooO00o(view, R.id.include_image_text_text_image_line_line_b10);
                        if (viewOooO00o2 != null) {
                            i = R.id.include_image_text_text_image_line_point_red;
                            View viewOooO00o3 = o00Oo0.OooO00o(view, R.id.include_image_text_text_image_line_point_red);
                            if (viewOooO00o3 != null) {
                                i = R.id.include_image_text_text_image_line_tv_1;
                                if (((TextView) o00Oo0.OooO00o(view, R.id.include_image_text_text_image_line_tv_1)) != null) {
                                    i = R.id.include_image_text_text_image_line_tv_2;
                                    if (((TextView) o00Oo0.OooO00o(view, R.id.include_image_text_text_image_line_tv_2)) != null) {
                                        return new i9(linearLayout, viewOooO00o, viewOooO00o2, viewOooO00o3);
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
    public static i9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49646OooO00o;
    }

    @NonNull
    public static i9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.include_image_text_text_image_line, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
