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
public final class pa implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50275OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50276OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50277OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50278OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50279OooO0o0;

    public pa(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView) {
        this.f50275OooO00o = constraintLayout;
        this.f50276OooO0O0 = imageView;
        this.f50277OooO0OO = imageView2;
        this.f50278OooO0Oo = imageView3;
        this.f50279OooO0o0 = textView;
    }

    @NonNull
    public static pa inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50275OooO00o;
    }

    @NonNull
    public static pa inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_clock_dialog_anim, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivAnimBg;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivAnimBg);
        if (imageView != null) {
            i = R.id.ivCoin;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCoin);
            if (imageView2 != null) {
                i = R.id.ivCrystal;
                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCrystal);
                if (imageView3 != null) {
                    i = R.id.llAnim;
                    if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llAnim)) != null) {
                        i = R.id.tvSignDays;
                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSignDays);
                        if (textView != null) {
                            return new pa((ConstraintLayout) viewInflate, imageView, imageView2, imageView3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
