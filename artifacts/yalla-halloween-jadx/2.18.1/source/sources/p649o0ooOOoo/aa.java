package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class aa implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f48928OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f48929OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f48930OooO0OO;

    public aa(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f48928OooO00o = linearLayout;
        this.f48929OooO0O0 = imageView;
        this.f48930OooO0OO = textView;
    }

    @NonNull
    public static aa inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f48928OooO00o;
    }

    @NonNull
    public static aa inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_status_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.view_empty_holder_bt_empty;
        if (((Button) o00Oo0.OooO00o(viewInflate, R.id.view_empty_holder_bt_empty)) != null) {
            i = R.id.view_empty_holder_iv_no_data;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.view_empty_holder_iv_no_data);
            if (imageView != null) {
                i = R.id.view_empty_holder_tv_blank_text;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.view_empty_holder_tv_blank_text);
                if (textView != null) {
                    return new aa((LinearLayout) viewInflate, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
