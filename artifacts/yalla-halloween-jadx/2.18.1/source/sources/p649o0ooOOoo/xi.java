package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.framework.view.marqueeText.MarqueeText;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class xi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50985OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50986OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f50987OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f50988OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f50989OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50990OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final MarqueeText f50991OooO0oO;

    public xi(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull NetImageView netImageView3, @NonNull ImageView imageView2, @NonNull MarqueeText marqueeText) {
        this.f50985OooO00o = constraintLayout;
        this.f50986OooO0O0 = imageView;
        this.f50987OooO0OO = netImageView;
        this.f50988OooO0Oo = netImageView2;
        this.f50990OooO0o0 = netImageView3;
        this.f50989OooO0o = imageView2;
        this.f50991OooO0oO = marqueeText;
    }

    @NonNull
    public static xi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50985OooO00o;
    }

    @NonNull
    public static xi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_gift_type_not_up_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivArrow;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivArrow);
        if (imageView != null) {
            i = R.id.ivBg;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBg);
            if (netImageView != null) {
                i = R.id.ivFg;
                NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivFg);
                if (netImageView2 != null) {
                    i = R.id.ivNational;
                    NetImageView netImageView3 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivNational);
                    if (netImageView3 != null) {
                        i = R.id.ivType;
                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivType);
                        if (imageView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i = R.id.tvInfo;
                            MarqueeText marqueeText = (MarqueeText) o00Oo0.OooO00o(viewInflate, R.id.tvInfo);
                            if (marqueeText != null) {
                                return new xi(constraintLayout, imageView, netImageView, netImageView2, netImageView3, imageView2, marqueeText);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
