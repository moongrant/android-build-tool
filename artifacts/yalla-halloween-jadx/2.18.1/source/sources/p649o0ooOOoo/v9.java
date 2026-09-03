package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class v9 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f50789OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50790OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50791OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50792OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50793OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50794OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50795OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f50796OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f50797OooO0oo;

    public v9(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view) {
        this.f50790OooO00o = constraintLayout;
        this.f50791OooO0O0 = imageView;
        this.f50792OooO0OO = imageView2;
        this.f50793OooO0Oo = imageView3;
        this.f50795OooO0o0 = linearLayout;
        this.f50794OooO0o = linearLayout2;
        this.f50796OooO0oO = textView;
        this.f50797OooO0oo = textView2;
        this.f50789OooO = view;
    }

    @NonNull
    public static v9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50790OooO00o;
    }

    @NonNull
    public static v9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_send_moment_location_power, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivAddress;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivAddress);
        if (imageView != null) {
            i = R.id.ivAddressCancel;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivAddressCancel);
            if (imageView2 != null) {
                i = R.id.ivPower;
                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPower);
                if (imageView3 != null) {
                    i = R.id.layoutAddress;
                    LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutAddress);
                    if (linearLayout != null) {
                        i = R.id.layoutPower;
                        LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutPower);
                        if (linearLayout2 != null) {
                            i = R.id.tvAddress;
                            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvAddress);
                            if (textView != null) {
                                i = R.id.tvPower;
                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvPower);
                                if (textView2 != null) {
                                    i = R.id.viewAddressLine;
                                    View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.viewAddressLine);
                                    if (viewOooO00o != null) {
                                        return new v9((ConstraintLayout) viewInflate, imageView, imageView2, imageView3, linearLayout, linearLayout2, textView, textView2, viewOooO00o);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
