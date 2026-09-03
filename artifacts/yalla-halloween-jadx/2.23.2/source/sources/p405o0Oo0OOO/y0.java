package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f45692OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45693OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45694OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45695OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45696OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45697OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45698OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45699OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f45700OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f45701OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ImageView f45702OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f45703OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f45704OooOOO0;

    public y0(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull FrameLayout frameLayout5, @NonNull FrameLayout frameLayout6, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6) {
        this.f45693OooO00o = constraintLayout;
        this.f45694OooO0O0 = frameLayout;
        this.f45695OooO0OO = frameLayout2;
        this.f45696OooO0Oo = frameLayout3;
        this.f45698OooO0o0 = frameLayout4;
        this.f45697OooO0o = frameLayout5;
        this.f45699OooO0oO = frameLayout6;
        this.f45700OooO0oo = imageView;
        this.f45692OooO = imageView2;
        this.f45701OooOO0 = imageView3;
        this.f45702OooOO0O = imageView4;
        this.f45703OooOO0o = imageView5;
        this.f45704OooOOO0 = imageView6;
    }

    @NonNull
    public static y0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45693OooO00o;
    }

    @NonNull
    public static y0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_layout_change_lucky_number, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.flLNCost2;
        FrameLayout frameLayout = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = o0OO00O.flLNCost5;
            FrameLayout frameLayout2 = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
            if (frameLayout2 != null) {
                i = o0OO00O.flLNCostFee;
                FrameLayout frameLayout3 = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
                if (frameLayout3 != null) {
                    i = o0OO00O.flRange1;
                    FrameLayout frameLayout4 = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (frameLayout4 != null) {
                        i = o0OO00O.flRange2;
                        FrameLayout frameLayout5 = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (frameLayout5 != null) {
                            i = o0OO00O.flRange3;
                            FrameLayout frameLayout6 = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (frameLayout6 != null) {
                                i = o0OO00O.ivLNCost2;
                                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                if (imageView != null) {
                                    i = o0OO00O.ivLNCost5;
                                    ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (imageView2 != null) {
                                        i = o0OO00O.ivLNCostFee;
                                        ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                        if (imageView3 != null) {
                                            i = o0OO00O.ivRange1;
                                            ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                            if (imageView4 != null) {
                                                i = o0OO00O.ivRange2;
                                                ImageView imageView5 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                if (imageView5 != null) {
                                                    i = o0OO00O.ivRange3;
                                                    ImageView imageView6 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (imageView6 != null) {
                                                        i = o0OO00O.tvLuckyNumberPrice;
                                                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                            i = o0OO00O.tvLuckyNumberRange;
                                                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                return new y0((ConstraintLayout) viewInflate, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, imageView, imageView2, imageView3, imageView4, imageView5, imageView6);
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
