package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43839OooO00o;

    public f(@NonNull LinearLayout linearLayout) {
        this.f43839OooO00o = linearLayout;
    }

    @NonNull
    public static f inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43839OooO00o;
    }

    @NonNull
    public static f inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_chat_user, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivHead;
        if (((NetImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.layoutHead;
            if (((FrameLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                int i2 = o0OO00O.svgaHats;
                if (((SVGAView) OooO0O0.OooO00o(i2, viewInflate)) != null) {
                    i2 = o0OO00O.userRankView;
                    if (((UserRankView) OooO0O0.OooO00o(i2, viewInflate)) != null) {
                        i2 = o0OO00O.userTagView;
                        if (((UserTagView) OooO0O0.OooO00o(i2, viewInflate)) != null) {
                            return new f(linearLayout);
                        }
                    }
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
