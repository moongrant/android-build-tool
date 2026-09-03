package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.marquee.MarqueeText;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class rb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58765OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final MarqueeText f58766OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58767OooO0OO;

    public rb(@NonNull ConstraintLayout constraintLayout, @NonNull MarqueeText marqueeText, @NonNull ConstraintLayout constraintLayout2) {
        this.f58765OooO00o = constraintLayout;
        this.f58766OooO0O0 = marqueeText;
        this.f58767OooO0OO = constraintLayout2;
    }

    @NonNull
    public static rb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58765OooO00o;
    }

    @NonNull
    public static rb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_gift_week_star_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.content;
        MarqueeText marqueeText = (MarqueeText) OooOO0.OooO00o(i, viewInflate);
        if (marqueeText != null) {
            i = oO00O0oO.ivBg;
            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.ivEnd;
                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.ivStart;
                    if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        return new rb(constraintLayout, marqueeText, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
