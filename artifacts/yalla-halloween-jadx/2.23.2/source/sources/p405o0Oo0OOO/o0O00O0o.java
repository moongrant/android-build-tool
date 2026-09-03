package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44446OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f44447OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f44448OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44449OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NumberViews f44450OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44451OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44452OooO0oO;

    public o0O00O0o(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull NetImageView netImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull NumberViews numberViews, @NonNull AppCompatTextView appCompatTextView3) {
        this.f44446OooO00o = constraintLayout;
        this.f44447OooO0O0 = view;
        this.f44448OooO0OO = netImageView;
        this.f44449OooO0Oo = appCompatTextView;
        this.f44451OooO0o0 = appCompatTextView2;
        this.f44450OooO0o = numberViews;
        this.f44452OooO0oO = appCompatTextView3;
    }

    @NonNull
    public static o0O00O0o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44446OooO00o;
    }

    @NonNull
    public static o0O00O0o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.dialog_room_lucky_number_open, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bottom;
        View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            i = o0OO00O.head;
            NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = o0OO00O.info;
                AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                if (appCompatTextView != null) {
                    i = o0OO00O.ivBigBg;
                    if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.ivBottomBg;
                        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.ivTopBg;
                            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                i = o0OO00O.ivTopFg;
                                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i = o0OO00O.name;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (appCompatTextView2 != null) {
                                        i = o0OO00O.number;
                                        NumberViews numberViews = (NumberViews) OooO0O0.OooO00o(i, viewInflate);
                                        if (numberViews != null) {
                                            i = o0OO00O.ok;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (appCompatTextView3 != null) {
                                                return new o0O00O0o(constraintLayout, viewOooO00o, netImageView, appCompatTextView, appCompatTextView2, numberViews, appCompatTextView3);
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
