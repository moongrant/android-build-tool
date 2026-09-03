package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserRankView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class cf implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49106OooO00o;

    public cf(@NonNull LinearLayout linearLayout) {
        this.f49106OooO00o = linearLayout;
    }

    @NonNull
    public static cf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49106OooO00o;
    }

    @NonNull
    public static cf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_chat_user, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivHead;
        if (((NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHead)) != null) {
            i = R.id.layoutHead;
            if (((FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutHead)) != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                if (((SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaHats)) == null) {
                    i = R.id.svgaHats;
                } else if (((UserRankView) o00Oo0.OooO00o(viewInflate, R.id.userRankView)) == null) {
                    i = R.id.userRankView;
                } else {
                    if (((UserTagView) o00Oo0.OooO00o(viewInflate, R.id.userTagView)) != null) {
                        return new cf(linearLayout);
                    }
                    i = R.id.userTagView;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
