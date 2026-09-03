package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.NumberViews;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class d8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49148OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f49149OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f49150OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49151OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NumberViews f49152OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49153OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49154OooO0oO;

    public d8(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull NetImageView netImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull NumberViews numberViews, @NonNull AppCompatTextView appCompatTextView3) {
        this.f49148OooO00o = constraintLayout;
        this.f49149OooO0O0 = view;
        this.f49150OooO0OO = netImageView;
        this.f49151OooO0Oo = appCompatTextView;
        this.f49153OooO0o0 = appCompatTextView2;
        this.f49152OooO0o = numberViews;
        this.f49154OooO0oO = appCompatTextView3;
    }

    @NonNull
    public static d8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49148OooO00o;
    }

    @NonNull
    public static d8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_room_lucky_number_open, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.bottom;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.bottom);
        if (viewOooO00o != null) {
            i = R.id.head;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.head);
            if (netImageView != null) {
                i = R.id.info;
                AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.info);
                if (appCompatTextView != null) {
                    i = R.id.ivBigBg;
                    if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBigBg)) != null) {
                        i = R.id.ivBottomBg;
                        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBottomBg)) != null) {
                            i = R.id.ivTopBg;
                            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivTopBg)) != null) {
                                i = R.id.ivTopFg;
                                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivTopFg)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i = R.id.name;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.name);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.number;
                                        NumberViews numberViews = (NumberViews) o00Oo0.OooO00o(viewInflate, R.id.number);
                                        if (numberViews != null) {
                                            i = R.id.ok;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.ok);
                                            if (appCompatTextView3 != null) {
                                                return new d8(constraintLayout, viewOooO00o, netImageView, appCompatTextView, appCompatTextView2, numberViews, appCompatTextView3);
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
