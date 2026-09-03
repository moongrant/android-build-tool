package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class f3 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f43854OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43855OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f43856OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f43857OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f43858OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f43859OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f43860OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43861OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f43862OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f43863OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f43864OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f43865OooOO0o;

    public f3(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SVGAView sVGAView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ConstraintLayout constraintLayout2, @NonNull View view2, @NonNull View view3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f43855OooO00o = constraintLayout;
        this.f43856OooO0O0 = view;
        this.f43857OooO0OO = sVGAView;
        this.f43858OooO0Oo = imageView;
        this.f43860OooO0o0 = imageView2;
        this.f43859OooO0o = imageView3;
        this.f43861OooO0oO = constraintLayout2;
        this.f43862OooO0oo = view2;
        this.f43854OooO = view3;
        this.f43863OooOO0 = textView;
        this.f43864OooOO0O = textView2;
        this.f43865OooOO0o = textView3;
    }

    @NonNull
    public static f3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43855OooO00o;
    }

    @NonNull
    public static f3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_gift_wealth_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivBg;
        if (((NetImageView) OooO0O0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.ivBgContent), viewInflate)) != null) {
            i = o0OO00O.ivLevel;
            SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
            if (sVGAView != null) {
                i = o0OO00O.ivWealthLine;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.ivWealthUnlockedArrow;
                    ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView2 != null) {
                        i = o0OO00O.ivWealthUpdate;
                        ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView3 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i = o0OO00O.progressWealth;
                            View viewOooO00o3 = OooO0O0.OooO00o(i, viewInflate);
                            if (viewOooO00o3 != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o0OO00O.progressWealthBg), viewInflate)) != null) {
                                i = o0OO00O.tvFullContent;
                                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView != null) {
                                    i = o0OO00O.tvUnlockContent;
                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = o0OO00O.tvUpdateContent;
                                        TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            return new f3(constraintLayout, viewOooO00o, sVGAView, imageView, imageView2, imageView3, constraintLayout, viewOooO00o3, viewOooO00o2, textView, textView2, textView3);
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
