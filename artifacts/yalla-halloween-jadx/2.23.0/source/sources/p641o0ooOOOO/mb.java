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
public final class mb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58428OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f58429OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final MarqueeText f58430OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58431OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58432OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58433OooO0o0;

    public mb(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull MarqueeText marqueeText, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2) {
        this.f58428OooO00o = constraintLayout;
        this.f58429OooO0O0 = view;
        this.f58430OooO0OO = marqueeText;
        this.f58431OooO0Oo = imageView;
        this.f58433OooO0o0 = imageView2;
        this.f58432OooO0o = constraintLayout2;
    }

    @NonNull
    public static mb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58428OooO00o;
    }

    @NonNull
    public static mb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_gift_tips_merge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bgContent;
        View viewOooO00o = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            i = oO00O0oO.content;
            MarqueeText marqueeText = (MarqueeText) OooOO0.OooO00o(i, viewInflate);
            if (marqueeText != null) {
                i = oO00O0oO.ivBg;
                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.ivEnd;
                    ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        i = oO00O0oO.ivStart;
                        ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            return new mb(constraintLayout, viewOooO00o, marqueeText, imageView, imageView2, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
