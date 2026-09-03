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
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ub implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50697OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50698OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50699OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50700OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50701OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50702OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50703OooO0oO;

    public ub(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4) {
        this.f50697OooO00o = constraintLayout;
        this.f50698OooO0O0 = netImageView;
        this.f50699OooO0OO = imageView;
        this.f50700OooO0Oo = appCompatTextView;
        this.f50702OooO0o0 = appCompatTextView2;
        this.f50701OooO0o = appCompatTextView3;
        this.f50703OooO0oO = appCompatTextView4;
    }

    @NonNull
    public static ub inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50697OooO00o;
    }

    @NonNull
    public static ub inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_dialog_share_events, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivEvent;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivEvent);
        if (netImageView != null) {
            i = R.id.ivEventTime;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivEventTime);
            if (imageView != null) {
                i = R.id.tvEventId;
                AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvEventId);
                if (appCompatTextView != null) {
                    i = R.id.tvEventRoom;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvEventRoom);
                    if (appCompatTextView2 != null) {
                        i = R.id.tvEventTime;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvEventTime);
                        if (appCompatTextView3 != null) {
                            i = R.id.tvEventTitle;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvEventTitle);
                            if (appCompatTextView4 != null) {
                                return new ub((ConstraintLayout) viewInflate, netImageView, imageView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
