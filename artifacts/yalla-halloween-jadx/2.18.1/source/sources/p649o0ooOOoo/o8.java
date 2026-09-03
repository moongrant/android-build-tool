package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.app.base.view.indicator.YlTableLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50148OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50149OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f50150OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f50151OooO0Oo;

    public o8(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull RtlViewPager rtlViewPager, @NonNull YlTableLayout ylTableLayout) {
        this.f50148OooO00o = linearLayoutCompat;
        this.f50149OooO0O0 = imageView;
        this.f50150OooO0OO = rtlViewPager;
        this.f50151OooO0Oo = ylTableLayout;
    }

    @NonNull
    public static o8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50148OooO00o;
    }

    @NonNull
    public static o8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.event_fragment_mine, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivSetting;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSetting);
        if (imageView != null) {
            i = R.id.vpEvent;
            RtlViewPager rtlViewPager = (RtlViewPager) o00Oo0.OooO00o(viewInflate, R.id.vpEvent);
            if (rtlViewPager != null) {
                i = R.id.ylEvent;
                YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(viewInflate, R.id.ylEvent);
                if (ylTableLayout != null) {
                    return new o8((LinearLayoutCompat) viewInflate, imageView, rtlViewPager, ylTableLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
