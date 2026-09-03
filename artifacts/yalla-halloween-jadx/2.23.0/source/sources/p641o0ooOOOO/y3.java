package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class y3 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59379OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f59380OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f59381OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f59382OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f59383OooO0o0;

    public y3(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView) {
        this.f59379OooO00o = constraintLayout;
        this.f59380OooO0O0 = imageView;
        this.f59381OooO0OO = imageView2;
        this.f59382OooO0Oo = imageView3;
        this.f59383OooO0o0 = textView;
    }

    @NonNull
    public static y3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59379OooO00o;
    }

    @NonNull
    public static y3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_clock_dialog_anim, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivAnimBg;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.ivCoin;
            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                i = oO00O0oO.ivCrystal;
                ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView3 != null) {
                    i = oO00O0oO.llAnim;
                    if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.tvSignDays;
                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            return new y3((ConstraintLayout) viewInflate, imageView, imageView2, imageView3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
