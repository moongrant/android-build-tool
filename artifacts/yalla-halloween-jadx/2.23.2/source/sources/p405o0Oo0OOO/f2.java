package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class f2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f43846OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f43847OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f43848OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f43849OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f43850OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f43851OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f43852OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f43853OooO0oo;

    public f2(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull YlTableLayout ylTableLayout, @NonNull TextView textView2, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f43846OooO00o = frameLayout;
        this.f43847OooO0O0 = frameLayout2;
        this.f43848OooO0OO = imageView;
        this.f43849OooO0Oo = textView;
        this.f43851OooO0o0 = imageView2;
        this.f43850OooO0o = ylTableLayout;
        this.f43852OooO0oO = textView2;
        this.f43853OooO0oo = viewPagerFixed;
    }

    @NonNull
    public static f2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43846OooO00o;
    }

    @NonNull
    public static f2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_wallet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.flRechargeHeader;
        FrameLayout frameLayout = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = o0OO00O.headerBg;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0OO00O.rechargeEnter;
                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView != null) {
                    i = o0OO00O.rechargeHeader;
                    if (((RelativeLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.rechargeImage;
                        ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            i = o0OO00O.tabLayout;
                            YlTableLayout ylTableLayout = (YlTableLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (ylTableLayout != null) {
                                i = o0OO00O.tvCoins;
                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView2 != null) {
                                    i = o0OO00O.viewPager;
                                    ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooO0O0.OooO00o(i, viewInflate);
                                    if (viewPagerFixed != null) {
                                        return new f2((FrameLayout) viewInflate, frameLayout, imageView, textView, imageView2, ylTableLayout, textView2, viewPagerFixed);
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
