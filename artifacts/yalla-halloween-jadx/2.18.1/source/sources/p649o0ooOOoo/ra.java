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
public final class ra implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50433OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50434OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50435OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50436OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50437OooO0o0;

    public ra(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f50433OooO00o = constraintLayout;
        this.f50434OooO0O0 = linearLayout;
        this.f50435OooO0OO = imageView;
        this.f50436OooO0Oo = textView;
        this.f50437OooO0o0 = textView2;
    }

    @NonNull
    public static ra inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50433OooO00o;
    }

    @NonNull
    public static ra inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_clock_dialog_root, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.cLHead;
        if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.cLHead)) != null) {
            i = R.id.flCenter;
            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.flCenter);
            if (linearLayout != null) {
                i = R.id.ivDismiss;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivDismiss);
                if (imageView != null) {
                    i = R.id.tvContent;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvContent);
                    if (textView != null) {
                        i = R.id.tvTitle;
                        TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTitle);
                        if (textView2 != null) {
                            return new ra((ConstraintLayout) viewInflate, linearLayout, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
