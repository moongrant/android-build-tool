package p405o0Oo0OOO;

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
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f45122OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45123OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixTextView f45124OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f45125OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f45126OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45127OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f45128OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f45129OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f45130OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f45131OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final SVGAView f45132OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final View f45133OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ImageView f45134OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45135OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final SVGAView f45136OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final ImageView f45137OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final UserTagView f45138OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f45139OooOOo0;

    public oOOO00(@NonNull ConstraintLayout constraintLayout, @NonNull FixTextView fixTextView, @NonNull TextView textView, @NonNull NetImageView netImageView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView, @NonNull SVGAView sVGAView, @NonNull View view2, @NonNull TextView textView5, @NonNull ImageView imageView2, @NonNull SVGAView sVGAView2, @NonNull ImageView imageView3, @NonNull TextView textView6, @NonNull UserTagView userTagView) {
        this.f45123OooO00o = constraintLayout;
        this.f45124OooO0O0 = fixTextView;
        this.f45125OooO0OO = textView;
        this.f45126OooO0Oo = netImageView;
        this.f45128OooO0o0 = textView2;
        this.f45127OooO0o = constraintLayout2;
        this.f45129OooO0oO = view;
        this.f45130OooO0oo = textView3;
        this.f45122OooO = textView4;
        this.f45131OooOO0 = imageView;
        this.f45132OooOO0O = sVGAView;
        this.f45133OooOO0o = view2;
        this.f45135OooOOO0 = textView5;
        this.f45134OooOOO = imageView2;
        this.f45136OooOOOO = sVGAView2;
        this.f45137OooOOOo = imageView3;
        this.f45139OooOOo0 = textView6;
        this.f45138OooOOo = userTagView;
    }

    @NonNull
    public static oOOO00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45123OooO00o;
    }

    @NonNull
    public static oOOO00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_reply_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.content;
        FixTextView fixTextView = (FixTextView) OooO0O0.OooO00o(i, viewInflate);
        if (fixTextView != null) {
            i = o0OO00O.contentOriginal;
            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = o0OO00O.head;
                NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    i = o0OO00O.latest;
                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = o0OO00O.lineBottom;
                        View viewOooO00o2 = OooO0O0.OooO00o(i, viewInflate);
                        if (viewOooO00o2 != null) {
                            i = o0OO00O.popular;
                            TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView3 != null) {
                                i = o0OO00O.praiseCount;
                                TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView4 != null) {
                                    i = o0OO00O.praiseIv;
                                    ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (imageView != null) {
                                        i = o0OO00O.praiseSvga;
                                        SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                        if (sVGAView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.praiseTag), viewInflate)) != null) {
                                            i = o0OO00O.rewardCount;
                                            TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView5 != null) {
                                                i = o0OO00O.rewardIv;
                                                ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                if (imageView2 != null) {
                                                    i = o0OO00O.rewardSvga;
                                                    SVGAView sVGAView2 = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (sVGAView2 != null) {
                                                        i = o0OO00O.role;
                                                        ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (imageView3 != null) {
                                                            i = o0OO00O.switchLayout;
                                                            if (((LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                i = o0OO00O.time;
                                                                TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                if (textView6 != null) {
                                                                    i = o0OO00O.userTagView;
                                                                    UserTagView userTagView = (UserTagView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (userTagView != null) {
                                                                        return new oOOO00(constraintLayout, fixTextView, textView, netImageView, textView2, constraintLayout, viewOooO00o2, textView3, textView4, imageView, sVGAView, viewOooO00o, textView5, imageView2, sVGAView2, imageView3, textView6, userTagView);
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
