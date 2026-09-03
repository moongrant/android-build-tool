package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
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
public final class w6 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f59153OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59154OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixTextView f59155OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f59156OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f59157OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59158OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f59159OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f59160OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f59161OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f59162OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final SVGAView f59163OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final View f59164OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ImageView f59165OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f59166OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final SVGAView f59167OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final ImageView f59168OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final UserTagView f59169OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f59170OooOOo0;

    public w6(@NonNull ConstraintLayout constraintLayout, @NonNull FixTextView fixTextView, @NonNull TextView textView, @NonNull NetImageView netImageView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView, @NonNull SVGAView sVGAView, @NonNull View view2, @NonNull TextView textView5, @NonNull ImageView imageView2, @NonNull SVGAView sVGAView2, @NonNull ImageView imageView3, @NonNull TextView textView6, @NonNull UserTagView userTagView) {
        this.f59154OooO00o = constraintLayout;
        this.f59155OooO0O0 = fixTextView;
        this.f59156OooO0OO = textView;
        this.f59157OooO0Oo = netImageView;
        this.f59159OooO0o0 = textView2;
        this.f59158OooO0o = constraintLayout2;
        this.f59160OooO0oO = view;
        this.f59161OooO0oo = textView3;
        this.f59153OooO = textView4;
        this.f59162OooOO0 = imageView;
        this.f59163OooOO0O = sVGAView;
        this.f59164OooOO0o = view2;
        this.f59166OooOOO0 = textView5;
        this.f59165OooOOO = imageView2;
        this.f59167OooOOOO = sVGAView2;
        this.f59168OooOOOo = imageView3;
        this.f59170OooOOo0 = textView6;
        this.f59169OooOOo = userTagView;
    }

    @NonNull
    public static w6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59154OooO00o;
    }

    @NonNull
    public static w6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_reply_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.content;
        FixTextView fixTextView = (FixTextView) OooOO0.OooO00o(i, viewInflate);
        if (fixTextView != null) {
            i = oO00O0oO.contentOriginal;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = oO00O0oO.head;
                NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    i = oO00O0oO.latest;
                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = oO00O0oO.lineBottom;
                        View viewOooO00o2 = OooOO0.OooO00o(i, viewInflate);
                        if (viewOooO00o2 != null) {
                            i = oO00O0oO.popular;
                            TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView3 != null) {
                                i = oO00O0oO.praiseCount;
                                TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView4 != null) {
                                    i = oO00O0oO.praiseIv;
                                    ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                    if (imageView != null) {
                                        i = oO00O0oO.praiseSvga;
                                        SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                        if (sVGAView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.praiseTag), viewInflate)) != null) {
                                            i = oO00O0oO.rewardCount;
                                            TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView5 != null) {
                                                i = oO00O0oO.rewardIv;
                                                ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                                if (imageView2 != null) {
                                                    i = oO00O0oO.rewardSvga;
                                                    SVGAView sVGAView2 = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                                    if (sVGAView2 != null) {
                                                        i = oO00O0oO.role;
                                                        ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                                        if (imageView3 != null) {
                                                            i = oO00O0oO.switchLayout;
                                                            if (((LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                i = oO00O0oO.time;
                                                                TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                if (textView6 != null) {
                                                                    i = oO00O0oO.userTagView;
                                                                    UserTagView userTagView = (UserTagView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (userTagView != null) {
                                                                        return new w6(constraintLayout, fixTextView, textView, netImageView, textView2, constraintLayout, viewOooO00o2, textView3, textView4, imageView, sVGAView, viewOooO00o, textView5, imageView2, sVGAView2, imageView3, textView6, userTagView);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
