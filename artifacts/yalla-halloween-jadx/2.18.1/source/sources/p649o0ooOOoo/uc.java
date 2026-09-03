package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.selectPicture.view.HackyViewPager;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class uc implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50704OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f50705OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50706OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50707OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final HackyViewPager f50708OooO0o0;

    public uc(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout2, @NonNull TextView textView2, @NonNull HackyViewPager hackyViewPager) {
        this.f50704OooO00o = frameLayout;
        this.f50705OooO0O0 = textView;
        this.f50706OooO0OO = frameLayout2;
        this.f50707OooO0Oo = textView2;
        this.f50708OooO0o0 = hackyViewPager;
    }

    @NonNull
    public static uc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50704OooO00o;
    }

    @NonNull
    public static uc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_activity_show_image, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.download;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.download);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            i = R.id.title;
            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.title);
            if (textView2 != null) {
                i = R.id.viewPager;
                HackyViewPager hackyViewPager = (HackyViewPager) o00Oo0.OooO00o(viewInflate, R.id.viewPager);
                if (hackyViewPager != null) {
                    return new uc(frameLayout, textView, frameLayout, textView2, hackyViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
