package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.UserRankView;
import com.yalla.yalla.ui.view.UserTagView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class s7 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58805OooO00o;

    public s7(@NonNull LinearLayout linearLayout) {
        this.f58805OooO00o = linearLayout;
    }

    @NonNull
    public static s7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58805OooO00o;
    }

    @NonNull
    public static s7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_chat_user, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivHead;
        if (((NetImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.layoutHead;
            if (((FrameLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                int i2 = oO00O0oO.svgaHats;
                if (((SVGAView) OooOO0.OooO00o(i2, viewInflate)) != null) {
                    i2 = oO00O0oO.userRankView;
                    if (((UserRankView) OooOO0.OooO00o(i2, viewInflate)) != null) {
                        i2 = oO00O0oO.userTagView;
                        if (((UserTagView) OooOO0.OooO00o(i2, viewInflate)) != null) {
                            return new s7(linearLayout);
                        }
                    }
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
