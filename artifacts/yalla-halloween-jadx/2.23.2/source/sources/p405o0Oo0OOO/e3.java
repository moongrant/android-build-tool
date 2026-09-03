package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.marquee.MarqueeText;
import com.yalla.netimage.NetImageView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class e3 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final MarqueeText f43830OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43831OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f43832OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f43833OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f43834OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f43835OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f43836OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f43837OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f43838OooO0oo;

    public e3(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull NetImageView netImageView3, @NonNull NetImageView netImageView4, @NonNull NetImageView netImageView5, @NonNull ImageView imageView2, @NonNull MarqueeText marqueeText) {
        this.f43831OooO00o = constraintLayout;
        this.f43832OooO0O0 = imageView;
        this.f43833OooO0OO = netImageView;
        this.f43834OooO0Oo = netImageView2;
        this.f43836OooO0o0 = netImageView3;
        this.f43835OooO0o = netImageView4;
        this.f43837OooO0oO = netImageView5;
        this.f43838OooO0oo = imageView2;
        this.f43830OooO = marqueeText;
    }

    @NonNull
    public static e3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43831OooO00o;
    }

    @NonNull
    public static e3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_gift_type_not_up_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivArrow;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.ivBg;
            NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = o0OO00O.ivFg;
                NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                if (netImageView2 != null) {
                    i = o0OO00O.ivFgEnd;
                    NetImageView netImageView3 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (netImageView3 != null) {
                        i = o0OO00O.ivFgStart;
                        NetImageView netImageView4 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (netImageView4 != null) {
                            i = o0OO00O.ivFlags;
                            NetImageView netImageView5 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (netImageView5 != null) {
                                i = o0OO00O.ivType;
                                ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                if (imageView2 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i = o0OO00O.tvInfo;
                                    MarqueeText marqueeText = (MarqueeText) OooO0O0.OooO00o(i, viewInflate);
                                    if (marqueeText != null) {
                                        return new e3(constraintLayout, imageView, netImageView, netImageView2, netImageView3, netImageView4, netImageView5, imageView2, marqueeText);
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
