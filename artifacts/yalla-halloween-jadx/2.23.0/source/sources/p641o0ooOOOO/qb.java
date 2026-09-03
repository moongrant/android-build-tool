package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class qb implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f58688OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58689OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f58690OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f58691OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58692OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58693OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58694OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58695OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f58696OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58697OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f58698OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58699OooOO0o;

    public qb(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SVGAView sVGAView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ConstraintLayout constraintLayout2, @NonNull View view2, @NonNull View view3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f58689OooO00o = constraintLayout;
        this.f58690OooO0O0 = view;
        this.f58691OooO0OO = sVGAView;
        this.f58692OooO0Oo = imageView;
        this.f58694OooO0o0 = imageView2;
        this.f58693OooO0o = imageView3;
        this.f58695OooO0oO = constraintLayout2;
        this.f58696OooO0oo = view2;
        this.f58688OooO = view3;
        this.f58697OooOO0 = textView;
        this.f58698OooOO0O = textView2;
        this.f58699OooOO0o = textView3;
    }

    @NonNull
    public static qb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58689OooO00o;
    }

    @NonNull
    public static qb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_gift_wealth_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivBg;
        if (((NetImageView) OooOO0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.ivBgContent), viewInflate)) != null) {
            i = oO00O0oO.ivLevel;
            SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
            if (sVGAView != null) {
                i = oO00O0oO.ivWealthLine;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.ivWealthUnlockedArrow;
                    ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView2 != null) {
                        i = oO00O0oO.ivWealthUpdate;
                        ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView3 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i = oO00O0oO.progressWealth;
                            View viewOooO00o3 = OooOO0.OooO00o(i, viewInflate);
                            if (viewOooO00o3 != null && (viewOooO00o2 = OooOO0.OooO00o((i = oO00O0oO.progressWealthBg), viewInflate)) != null) {
                                i = oO00O0oO.tvFullContent;
                                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView != null) {
                                    i = oO00O0oO.tvUnlockContent;
                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = oO00O0oO.tvUpdateContent;
                                        TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            return new qb(constraintLayout, viewOooO00o, sVGAView, imageView, imageView2, imageView3, constraintLayout, viewOooO00o3, viewOooO00o2, textView, textView2, textView3);
                                        }
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
