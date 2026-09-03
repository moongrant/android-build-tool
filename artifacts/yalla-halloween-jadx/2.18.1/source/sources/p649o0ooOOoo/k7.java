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
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class k7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49826OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49827OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixTextView f49828OooO0OO;

    public k7(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FixTextView fixTextView) {
        this.f49826OooO00o = frameLayout;
        this.f49827OooO0O0 = imageView;
        this.f49828OooO0OO = fixTextView;
    }

    @NonNull
    public static k7 OooO00o(@NonNull View view) {
        int i = R.id.iv;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(view, R.id.iv);
        if (imageView != null) {
            i = R.id.tvMessage;
            FixTextView fixTextView = (FixTextView) o00Oo0.OooO00o(view, R.id.tvMessage);
            if (fixTextView != null) {
                return new k7((FrameLayout) view, imageView, fixTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static k7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49826OooO00o;
    }

    @NonNull
    public static k7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.chatline_invite_member_task, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
