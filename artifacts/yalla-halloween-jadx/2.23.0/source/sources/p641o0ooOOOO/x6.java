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
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.UserTagView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class x6 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f59276OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59277OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f59278OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixTextView f59279OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f59280OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f59281OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f59282OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SVGAView f59283OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f59284OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f59285OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final SVGAView f59286OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f59287OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final UserTagView f59288OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f59289OooOOO0;

    public x6(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull FixTextView fixTextView, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull SVGAView sVGAView, @NonNull View view, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull SVGAView sVGAView2, @NonNull ImageView imageView4, @NonNull TextView textView3, @NonNull UserTagView userTagView) {
        this.f59277OooO00o = constraintLayout;
        this.f59278OooO0O0 = imageView;
        this.f59279OooO0OO = fixTextView;
        this.f59280OooO0Oo = netImageView;
        this.f59282OooO0o0 = textView;
        this.f59281OooO0o = imageView2;
        this.f59283OooO0oO = sVGAView;
        this.f59284OooO0oo = view;
        this.f59276OooO = textView2;
        this.f59285OooOO0 = imageView3;
        this.f59286OooOO0O = sVGAView2;
        this.f59287OooOO0o = imageView4;
        this.f59289OooOOO0 = textView3;
        this.f59288OooOOO = userTagView;
    }

    @NonNull
    public static x6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59277OooO00o;
    }

    @NonNull
    public static x6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_reply_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bgSon;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.contentSon;
            FixTextView fixTextView = (FixTextView) OooOO0.OooO00o(i, viewInflate);
            if (fixTextView != null) {
                i = oO00O0oO.headSon;
                NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i = oO00O0oO.praiseCountSon;
                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = oO00O0oO.praiseIvSon;
                        ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            i = oO00O0oO.praiseSvgaSon;
                            SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                            if (sVGAView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.praiseTagSon), viewInflate)) != null) {
                                i = oO00O0oO.rewardCountSon;
                                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView2 != null) {
                                    i = oO00O0oO.rewardIvSon;
                                    ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                    if (imageView3 != null) {
                                        i = oO00O0oO.rewardSvgaSon;
                                        SVGAView sVGAView2 = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                        if (sVGAView2 != null) {
                                            i = oO00O0oO.roleSon;
                                            ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                            if (imageView4 != null) {
                                                i = oO00O0oO.timeSon;
                                                TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView3 != null) {
                                                    i = oO00O0oO.userTagViewSon;
                                                    UserTagView userTagView = (UserTagView) OooOO0.OooO00o(i, viewInflate);
                                                    if (userTagView != null) {
                                                        return new x6(constraintLayout, imageView, fixTextView, netImageView, textView, imageView2, sVGAView, viewOooO00o, textView2, imageView3, sVGAView2, imageView4, textView3, userTagView);
                                                    }
                                                }
                                            }
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
