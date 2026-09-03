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
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.UserTagView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00Oo implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f45142OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45143OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f45144OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixTextView f45145OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f45146OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f45147OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f45148OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SVGAView f45149OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f45150OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f45151OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final SVGAView f45152OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f45153OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final UserTagView f45154OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45155OooOOO0;

    public oOOO00Oo(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull FixTextView fixTextView, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull SVGAView sVGAView, @NonNull View view, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull SVGAView sVGAView2, @NonNull ImageView imageView4, @NonNull TextView textView3, @NonNull UserTagView userTagView) {
        this.f45143OooO00o = constraintLayout;
        this.f45144OooO0O0 = imageView;
        this.f45145OooO0OO = fixTextView;
        this.f45146OooO0Oo = netImageView;
        this.f45148OooO0o0 = textView;
        this.f45147OooO0o = imageView2;
        this.f45149OooO0oO = sVGAView;
        this.f45150OooO0oo = view;
        this.f45142OooO = textView2;
        this.f45151OooOO0 = imageView3;
        this.f45152OooOO0O = sVGAView2;
        this.f45153OooOO0o = imageView4;
        this.f45155OooOOO0 = textView3;
        this.f45154OooOOO = userTagView;
    }

    @NonNull
    public static oOOO00Oo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45143OooO00o;
    }

    @NonNull
    public static oOOO00Oo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_reply_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bgSon;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.contentSon;
            FixTextView fixTextView = (FixTextView) OooO0O0.OooO00o(i, viewInflate);
            if (fixTextView != null) {
                i = o0OO00O.headSon;
                NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i = o0OO00O.praiseCountSon;
                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = o0OO00O.praiseIvSon;
                        ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            i = o0OO00O.praiseSvgaSon;
                            SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                            if (sVGAView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.praiseTagSon), viewInflate)) != null) {
                                i = o0OO00O.rewardCountSon;
                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView2 != null) {
                                    i = o0OO00O.rewardIvSon;
                                    ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (imageView3 != null) {
                                        i = o0OO00O.rewardSvgaSon;
                                        SVGAView sVGAView2 = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                        if (sVGAView2 != null) {
                                            i = o0OO00O.roleSon;
                                            ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                            if (imageView4 != null) {
                                                i = o0OO00O.timeSon;
                                                TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView3 != null) {
                                                    i = o0OO00O.userTagViewSon;
                                                    UserTagView userTagView = (UserTagView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (userTagView != null) {
                                                        return new oOOO00Oo(constraintLayout, imageView, fixTextView, netImageView, textView, imageView2, sVGAView, viewOooO00o, textView2, imageView3, sVGAView2, imageView4, textView3, userTagView);
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
