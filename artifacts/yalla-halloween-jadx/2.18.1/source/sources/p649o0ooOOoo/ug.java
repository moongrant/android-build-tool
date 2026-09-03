package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ug implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f50733OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50734OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50735OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50736OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50737OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50738OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50739OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50740OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50741OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f50742OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ImageView f50743OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f50744OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f50745OooOOO0;

    public ug(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull FrameLayout frameLayout5, @NonNull FrameLayout frameLayout6, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6) {
        this.f50734OooO00o = constraintLayout;
        this.f50735OooO0O0 = frameLayout;
        this.f50736OooO0OO = frameLayout2;
        this.f50737OooO0Oo = frameLayout3;
        this.f50739OooO0o0 = frameLayout4;
        this.f50738OooO0o = frameLayout5;
        this.f50740OooO0oO = frameLayout6;
        this.f50741OooO0oo = imageView;
        this.f50733OooO = imageView2;
        this.f50742OooOO0 = imageView3;
        this.f50743OooOO0O = imageView4;
        this.f50744OooOO0o = imageView5;
        this.f50745OooOOO0 = imageView6;
    }

    @NonNull
    public static ug inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50734OooO00o;
    }

    @NonNull
    public static ug inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_layout_change_lucky_number, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.flLNCost2;
        FrameLayout frameLayout = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flLNCost2);
        if (frameLayout != null) {
            i = R.id.flLNCost5;
            FrameLayout frameLayout2 = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flLNCost5);
            if (frameLayout2 != null) {
                i = R.id.flLNCostFee;
                FrameLayout frameLayout3 = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flLNCostFee);
                if (frameLayout3 != null) {
                    i = R.id.flRange1;
                    FrameLayout frameLayout4 = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flRange1);
                    if (frameLayout4 != null) {
                        i = R.id.flRange2;
                        FrameLayout frameLayout5 = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flRange2);
                        if (frameLayout5 != null) {
                            i = R.id.flRange3;
                            FrameLayout frameLayout6 = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flRange3);
                            if (frameLayout6 != null) {
                                i = R.id.ivLNCost2;
                                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLNCost2);
                                if (imageView != null) {
                                    i = R.id.ivLNCost5;
                                    ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLNCost5);
                                    if (imageView2 != null) {
                                        i = R.id.ivLNCostFee;
                                        ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLNCostFee);
                                        if (imageView3 != null) {
                                            i = R.id.ivRange1;
                                            ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivRange1);
                                            if (imageView4 != null) {
                                                i = R.id.ivRange2;
                                                ImageView imageView5 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivRange2);
                                                if (imageView5 != null) {
                                                    i = R.id.ivRange3;
                                                    ImageView imageView6 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivRange3);
                                                    if (imageView6 != null) {
                                                        i = R.id.tvLuckyNumberPrice;
                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvLuckyNumberPrice)) != null) {
                                                            i = R.id.tvLuckyNumberRange;
                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvLuckyNumberRange)) != null) {
                                                                return new ug((ConstraintLayout) viewInflate, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, imageView, imageView2, imageView3, imageView4, imageView5, imageView6);
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
