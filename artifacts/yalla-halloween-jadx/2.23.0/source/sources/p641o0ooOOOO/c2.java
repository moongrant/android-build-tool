package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.booking.rtlviewpager.RtlViewPager;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57638OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f57639OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f57640OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f57641OooO0Oo;

    public c2(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull RtlViewPager rtlViewPager, @NonNull YlTableLayout ylTableLayout) {
        this.f57638OooO00o = linearLayoutCompat;
        this.f57639OooO0O0 = imageView;
        this.f57640OooO0OO = rtlViewPager;
        this.f57641OooO0Oo = ylTableLayout;
    }

    @NonNull
    public static c2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57638OooO00o;
    }

    @NonNull
    public static c2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.event_fragment_mine, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivSetting;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.vpEvent;
            RtlViewPager rtlViewPager = (RtlViewPager) OooOO0.OooO00o(i, viewInflate);
            if (rtlViewPager != null) {
                i = oO00O0oO.ylEvent;
                YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, viewInflate);
                if (ylTableLayout != null) {
                    return new c2((LinearLayoutCompat) viewInflate, imageView, rtlViewPager, ylTableLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
