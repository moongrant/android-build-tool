package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class yb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59415OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f59416OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f59417OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f59418OooO0Oo;

    public yb(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f59415OooO00o = constraintLayout;
        this.f59416OooO0O0 = netImageView;
        this.f59417OooO0OO = sVGAView;
        this.f59418OooO0Oo = textView;
    }

    @NonNull
    public static yb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59415OooO00o;
    }

    @NonNull
    public static yb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_room_user_vip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bg;
        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i2 = oO00O0oO.svga;
            SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i2, viewInflate);
            if (sVGAView != null) {
                i2 = oO00O0oO.tvVip;
                TextView textView = (TextView) OooOO0.OooO00o(i2, viewInflate);
                if (textView != null) {
                    return new yb(constraintLayout, netImageView, sVGAView, textView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
