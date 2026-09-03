package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.FixTextView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44666OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f44667OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44668OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FixTextView f44669OooO0Oo;

    public o0o0Oo(@NonNull FrameLayout frameLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull FixTextView fixTextView) {
        this.f44666OooO00o = frameLayout;
        this.f44667OooO0O0 = netImageView;
        this.f44668OooO0OO = imageView;
        this.f44669OooO0Oo = fixTextView;
    }

    @NonNull
    public static o0o0Oo OooO00o(@NonNull View view) {
        int i = o0OO00O.ivHeader;
        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, view);
        if (netImageView != null) {
            i = o0OO00O.ivShare;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, view);
            if (imageView != null) {
                i = o0OO00O.tvMessage;
                FixTextView fixTextView = (FixTextView) OooO0O0.OooO00o(i, view);
                if (fixTextView != null) {
                    return new o0o0Oo((FrameLayout) view, netImageView, imageView, fixTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static o0o0Oo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44666OooO00o;
    }

    @NonNull
    public static o0o0Oo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.chatline_member_share_task, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
