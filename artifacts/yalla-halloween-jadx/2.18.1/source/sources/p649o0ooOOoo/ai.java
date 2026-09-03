package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.ViewPagerFixed;
import com.app.base.view.indicator.YlTableLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ai implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f48965OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f48966OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f48967OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f48968OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f48969OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f48970OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f48971OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f48972OooO0oo;

    public ai(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull YlTableLayout ylTableLayout, @NonNull TextView textView2, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f48965OooO00o = frameLayout;
        this.f48966OooO0O0 = frameLayout2;
        this.f48967OooO0OO = imageView;
        this.f48968OooO0Oo = textView;
        this.f48970OooO0o0 = imageView2;
        this.f48969OooO0o = ylTableLayout;
        this.f48971OooO0oO = textView2;
        this.f48972OooO0oo = viewPagerFixed;
    }

    @NonNull
    public static ai inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f48965OooO00o;
    }

    @NonNull
    public static ai inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_wallet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.fl_recharge_header;
        FrameLayout frameLayout = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.fl_recharge_header);
        if (frameLayout != null) {
            i = R.id.header_bg;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.header_bg);
            if (imageView != null) {
                i = R.id.recharge_enter;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.recharge_enter);
                if (textView != null) {
                    i = R.id.recharge_header;
                    if (((RelativeLayout) o00Oo0.OooO00o(viewInflate, R.id.recharge_header)) != null) {
                        i = R.id.recharge_image;
                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.recharge_image);
                        if (imageView2 != null) {
                            i = R.id.tabLayout;
                            YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(viewInflate, R.id.tabLayout);
                            if (ylTableLayout != null) {
                                i = R.id.tv_coins;
                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_coins);
                                if (textView2 != null) {
                                    i = R.id.viewPager;
                                    ViewPagerFixed viewPagerFixed = (ViewPagerFixed) o00Oo0.OooO00o(viewInflate, R.id.viewPager);
                                    if (viewPagerFixed != null) {
                                        return new ai((FrameLayout) viewInflate, frameLayout, imageView, textView, imageView2, ylTableLayout, textView2, viewPagerFixed);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
