package p407o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00Oo implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f45155OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45156OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixTextView f45157OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f45158OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f45159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f45161OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f45162OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f45163OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f45164OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final SVGAView f45165OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final View f45166OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ImageView f45167OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45168OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final SVGAView f45169OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final ImageView f45170OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final UserTagView f45171OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f45172OooOOo0;

    public oOOO00Oo(@NonNull ConstraintLayout constraintLayout, @NonNull FixTextView fixTextView, @NonNull TextView textView, @NonNull NetImageView netImageView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView, @NonNull SVGAView sVGAView, @NonNull View view2, @NonNull TextView textView5, @NonNull ImageView imageView2, @NonNull SVGAView sVGAView2, @NonNull ImageView imageView3, @NonNull TextView textView6, @NonNull UserTagView userTagView) {
        this.f45156OooO00o = constraintLayout;
        this.f45157OooO0O0 = fixTextView;
        this.f45158OooO0OO = textView;
        this.f45159OooO0Oo = netImageView;
        this.f45161OooO0o0 = textView2;
        this.f45160OooO0o = constraintLayout2;
        this.f45162OooO0oO = view;
        this.f45163OooO0oo = textView3;
        this.f45155OooO = textView4;
        this.f45164OooOO0 = imageView;
        this.f45165OooOO0O = sVGAView;
        this.f45166OooOO0o = view2;
        this.f45168OooOOO0 = textView5;
        this.f45167OooOOO = imageView2;
        this.f45169OooOOOO = sVGAView2;
        this.f45170OooOOOo = imageView3;
        this.f45172OooOOo0 = textView6;
        this.f45171OooOOo = userTagView;
    }

    @NonNull
    public static oOOO00Oo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45156OooO00o;
    }

    @NonNull
    public static oOOO00Oo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(o0OO00O.moment_reply_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0Oo0oo.content;
        FixTextView fixTextView = (FixTextView) OooO0O0.OooO00o(i, viewInflate);
        if (fixTextView != null) {
            i = o0Oo0oo.contentOriginal;
            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = o0Oo0oo.head;
                NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    i = o0Oo0oo.latest;
                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = o0Oo0oo.lineBottom;
                        View viewOooO00o2 = OooO0O0.OooO00o(i, viewInflate);
                        if (viewOooO00o2 != null) {
                            i = o0Oo0oo.popular;
                            TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView3 != null) {
                                i = o0Oo0oo.praiseCount;
                                TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView4 != null) {
                                    i = o0Oo0oo.praiseIv;
                                    ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (imageView != null) {
                                        i = o0Oo0oo.praiseSvga;
                                        SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                        if (sVGAView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0Oo0oo.praiseTag), viewInflate)) != null) {
                                            i = o0Oo0oo.rewardCount;
                                            TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView5 != null) {
                                                i = o0Oo0oo.rewardIv;
                                                ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                if (imageView2 != null) {
                                                    i = o0Oo0oo.rewardSvga;
                                                    SVGAView sVGAView2 = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (sVGAView2 != null) {
                                                        i = o0Oo0oo.role;
                                                        ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (imageView3 != null) {
                                                            i = o0Oo0oo.switchLayout;
                                                            if (((LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                i = o0Oo0oo.time;
                                                                TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                if (textView6 != null) {
                                                                    i = o0Oo0oo.userTagView;
                                                                    UserTagView userTagView = (UserTagView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (userTagView != null) {
                                                                        return new oOOO00Oo(constraintLayout, fixTextView, textView, netImageView, textView2, constraintLayout, viewOooO00o2, textView3, textView4, imageView, sVGAView, viewOooO00o, textView5, imageView2, sVGAView2, imageView3, textView6, userTagView);
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
