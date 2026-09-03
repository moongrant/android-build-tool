package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class j9 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f58186OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58187OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58188OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58189OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58190OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58191OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58192OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58193OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58194OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f58195OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ImageView f58196OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58197OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f58198OooOOO0;

    public j9(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull FrameLayout frameLayout5, @NonNull FrameLayout frameLayout6, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6) {
        this.f58187OooO00o = constraintLayout;
        this.f58188OooO0O0 = frameLayout;
        this.f58189OooO0OO = frameLayout2;
        this.f58190OooO0Oo = frameLayout3;
        this.f58192OooO0o0 = frameLayout4;
        this.f58191OooO0o = frameLayout5;
        this.f58193OooO0oO = frameLayout6;
        this.f58194OooO0oo = imageView;
        this.f58186OooO = imageView2;
        this.f58195OooOO0 = imageView3;
        this.f58196OooOO0O = imageView4;
        this.f58197OooOO0o = imageView5;
        this.f58198OooOOO0 = imageView6;
    }

    @NonNull
    public static j9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58187OooO00o;
    }

    @NonNull
    public static j9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_layout_change_lucky_number, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.flLNCost2;
        FrameLayout frameLayout = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = oO00O0oO.flLNCost5;
            FrameLayout frameLayout2 = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
            if (frameLayout2 != null) {
                i = oO00O0oO.flLNCostFee;
                FrameLayout frameLayout3 = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
                if (frameLayout3 != null) {
                    i = oO00O0oO.flRange1;
                    FrameLayout frameLayout4 = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
                    if (frameLayout4 != null) {
                        i = oO00O0oO.flRange2;
                        FrameLayout frameLayout5 = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
                        if (frameLayout5 != null) {
                            i = oO00O0oO.flRange3;
                            FrameLayout frameLayout6 = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
                            if (frameLayout6 != null) {
                                i = oO00O0oO.ivLNCost2;
                                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                if (imageView != null) {
                                    i = oO00O0oO.ivLNCost5;
                                    ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                    if (imageView2 != null) {
                                        i = oO00O0oO.ivLNCostFee;
                                        ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                        if (imageView3 != null) {
                                            i = oO00O0oO.ivRange1;
                                            ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                            if (imageView4 != null) {
                                                i = oO00O0oO.ivRange2;
                                                ImageView imageView5 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                                if (imageView5 != null) {
                                                    i = oO00O0oO.ivRange3;
                                                    ImageView imageView6 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                                    if (imageView6 != null) {
                                                        i = oO00O0oO.tvLuckyNumberPrice;
                                                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                            i = oO00O0oO.tvLuckyNumberRange;
                                                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                return new j9((ConstraintLayout) viewInflate, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, imageView, imageView2, imageView3, imageView4, imageView5, imageView6);
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
