package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.NumberViews;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class s1 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58774OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f58775OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f58776OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58777OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NumberViews f58778OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58779OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58780OooO0oO;

    public s1(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull NetImageView netImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull NumberViews numberViews, @NonNull AppCompatTextView appCompatTextView3) {
        this.f58774OooO00o = constraintLayout;
        this.f58775OooO0O0 = view;
        this.f58776OooO0OO = netImageView;
        this.f58777OooO0Oo = appCompatTextView;
        this.f58779OooO0o0 = appCompatTextView2;
        this.f58778OooO0o = numberViews;
        this.f58780OooO0oO = appCompatTextView3;
    }

    @NonNull
    public static s1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58774OooO00o;
    }

    @NonNull
    public static s1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_room_lucky_number_open, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bottom;
        View viewOooO00o = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            i = oO00O0oO.head;
            NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = oO00O0oO.info;
                AppCompatTextView appCompatTextView = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                if (appCompatTextView != null) {
                    i = oO00O0oO.ivBigBg;
                    if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.ivBottomBg;
                        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                            i = oO00O0oO.ivTopBg;
                            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                i = oO00O0oO.ivTopFg;
                                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i = oO00O0oO.name;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                    if (appCompatTextView2 != null) {
                                        i = oO00O0oO.number;
                                        NumberViews numberViews = (NumberViews) OooOO0.OooO00o(i, viewInflate);
                                        if (numberViews != null) {
                                            i = oO00O0oO.ok;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                            if (appCompatTextView3 != null) {
                                                return new s1(constraintLayout, viewOooO00o, netImageView, appCompatTextView, appCompatTextView2, numberViews, appCompatTextView3);
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
