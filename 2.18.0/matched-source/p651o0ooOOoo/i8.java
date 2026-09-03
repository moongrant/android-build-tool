package p651o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.dialog.HollowGuideView;
import com.weieyu.yalla.R;
import p105o000oo0O.o00O0O;
import p105o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class i8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49663OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final HollowGuideView f49664OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49665OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49666OooO0Oo;

    public i8(@NonNull FrameLayout frameLayout, @NonNull HollowGuideView hollowGuideView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout) {
        this.f49663OooO00o = frameLayout;
        this.f49664OooO0O0 = hollowGuideView;
        this.f49665OooO0OO = imageView;
        this.f49666OooO0Oo = linearLayout;
    }

    @NonNull
    public static i8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p105o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49663OooO00o;
    }

    @NonNull
    public static i8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_switch_language_top, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.hollowGuideView;
        HollowGuideView hollowGuideView = (HollowGuideView) o00Oo0.OooO00o(viewInflate, R.id.hollowGuideView);
        if (hollowGuideView != null) {
            i = R.id.iv_switch;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_switch);
            if (imageView != null) {
                i = R.id.llContent;
                LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llContent);
                if (linearLayout != null) {
                    i = R.id.tv_switch;
                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_switch)) != null) {
                        return new i8((FrameLayout) viewInflate, hollowGuideView, imageView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
