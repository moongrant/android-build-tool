package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ch implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49109OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49110OooO0O0;

    public ch(@NonNull FrameLayout frameLayout, @NonNull NetImageView netImageView) {
        this.f49109OooO00o = frameLayout;
        this.f49110OooO0O0 = netImageView;
    }

    @NonNull
    public static ch OooO00o(@NonNull View view) {
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(view, R.id.ivMicGif);
        if (netImageView != null) {
            return new ch((FrameLayout) view, netImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.ivMicGif)));
    }

    @NonNull
    public static ch inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49109OooO00o;
    }

    @NonNull
    public static ch inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_popupwindow_mic_emoji, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
