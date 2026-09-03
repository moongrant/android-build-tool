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
public final class ba implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49011OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f49012OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49013OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49014OooO0Oo;

    public ba(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f49011OooO00o = linearLayout;
        this.f49012OooO0O0 = button;
        this.f49013OooO0OO = imageView;
        this.f49014OooO0Oo = textView;
    }

    @NonNull
    public static ba inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49011OooO00o;
    }

    @NonNull
    public static ba inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_status_error, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.view_empty_holder_bt_error;
        Button button = (Button) o00Oo0.OooO00o(viewInflate, R.id.view_empty_holder_bt_error);
        if (button != null) {
            i = R.id.view_empty_holder_iv_error;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.view_empty_holder_iv_error);
            if (imageView != null) {
                i = R.id.view_empty_holder_tv_error;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.view_empty_holder_tv_error);
                if (textView != null) {
                    return new ba((LinearLayout) viewInflate, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
