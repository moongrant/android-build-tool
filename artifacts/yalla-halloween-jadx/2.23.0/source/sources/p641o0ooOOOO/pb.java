package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.marquee.MarqueeText;
import com.yalla.netimage.NetImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class pb implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final MarqueeText f58628OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58629OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58630OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f58631OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f58632OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f58633OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f58634OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f58635OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58636OooO0oo;

    public pb(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull NetImageView netImageView3, @NonNull NetImageView netImageView4, @NonNull NetImageView netImageView5, @NonNull ImageView imageView2, @NonNull MarqueeText marqueeText) {
        this.f58629OooO00o = constraintLayout;
        this.f58630OooO0O0 = imageView;
        this.f58631OooO0OO = netImageView;
        this.f58632OooO0Oo = netImageView2;
        this.f58634OooO0o0 = netImageView3;
        this.f58633OooO0o = netImageView4;
        this.f58635OooO0oO = netImageView5;
        this.f58636OooO0oo = imageView2;
        this.f58628OooO = marqueeText;
    }

    @NonNull
    public static pb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58629OooO00o;
    }

    @NonNull
    public static pb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_gift_type_not_up_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivArrow;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.ivBg;
            NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = oO00O0oO.ivFg;
                NetImageView netImageView2 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                if (netImageView2 != null) {
                    i = oO00O0oO.ivFgEnd;
                    NetImageView netImageView3 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                    if (netImageView3 != null) {
                        i = oO00O0oO.ivFgStart;
                        NetImageView netImageView4 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                        if (netImageView4 != null) {
                            i = oO00O0oO.ivFlags;
                            NetImageView netImageView5 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                            if (netImageView5 != null) {
                                i = oO00O0oO.ivType;
                                ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                if (imageView2 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i = oO00O0oO.tvInfo;
                                    MarqueeText marqueeText = (MarqueeText) OooOO0.OooO00o(i, viewInflate);
                                    if (marqueeText != null) {
                                        return new pb(constraintLayout, imageView, netImageView, netImageView2, netImageView3, netImageView4, netImageView5, imageView2, marqueeText);
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
