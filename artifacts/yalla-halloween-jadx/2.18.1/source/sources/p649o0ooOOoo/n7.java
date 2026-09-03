package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.FixTextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class n7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50070OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50071OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50072OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FixTextView f50073OooO0Oo;

    public n7(@NonNull FrameLayout frameLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull FixTextView fixTextView) {
        this.f50070OooO00o = frameLayout;
        this.f50071OooO0O0 = netImageView;
        this.f50072OooO0OO = imageView;
        this.f50073OooO0Oo = fixTextView;
    }

    @NonNull
    public static n7 OooO00o(@NonNull View view) {
        int i = R.id.ivHeader;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(view, R.id.ivHeader);
        if (netImageView != null) {
            i = R.id.ivShare;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(view, R.id.ivShare);
            if (imageView != null) {
                i = R.id.tvMessage;
                FixTextView fixTextView = (FixTextView) o00Oo0.OooO00o(view, R.id.tvMessage);
                if (fixTextView != null) {
                    return new n7((FrameLayout) view, netImageView, imageView, fixTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static n7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50070OooO00o;
    }

    @NonNull
    public static n7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.chatline_member_share_task, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
