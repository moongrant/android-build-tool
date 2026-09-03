package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class z7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f51055OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f51056OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f51057OooO0OO;

    public z7(@NonNull LinearLayout linearLayout, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f51055OooO00o = linearLayout;
        this.f51056OooO0O0 = sVGAView;
        this.f51057OooO0OO = textView;
    }

    @NonNull
    public static z7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51055OooO00o;
    }

    @NonNull
    public static z7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.svgaLoading;
        SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaLoading);
        if (sVGAView != null) {
            i = R.id.tvLoading;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvLoading);
            if (textView != null) {
                return new z7((LinearLayout) viewInflate, sVGAView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
