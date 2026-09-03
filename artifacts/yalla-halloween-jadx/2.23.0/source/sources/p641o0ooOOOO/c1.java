package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.FixTextView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57634OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f57635OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57636OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FixTextView f57637OooO0Oo;

    public c1(@NonNull FrameLayout frameLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull FixTextView fixTextView) {
        this.f57634OooO00o = frameLayout;
        this.f57635OooO0O0 = netImageView;
        this.f57636OooO0OO = imageView;
        this.f57637OooO0Oo = fixTextView;
    }

    @NonNull
    public static c1 OooO00o(@NonNull View view) {
        int i = oO00O0oO.ivHeader;
        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, view);
        if (netImageView != null) {
            i = oO00O0oO.ivShare;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, view);
            if (imageView != null) {
                i = oO00O0oO.tvMessage;
                FixTextView fixTextView = (FixTextView) OooOO0.OooO00o(i, view);
                if (fixTextView != null) {
                    return new c1((FrameLayout) view, netImageView, imageView, fixTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static c1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57634OooO00o;
    }

    @NonNull
    public static c1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.chatline_member_share_task, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
