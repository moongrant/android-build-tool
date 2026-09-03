package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class e9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49226OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f49227OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49228OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49229OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f49230OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49231OooO0o0;

    public e9(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RtlViewPager rtlViewPager) {
        this.f49226OooO00o = constraintLayout;
        this.f49227OooO0O0 = composeView;
        this.f49228OooO0OO = imageView;
        this.f49229OooO0Oo = linearLayout;
        this.f49231OooO0o0 = textView;
        this.f49230OooO0o = rtlViewPager;
    }

    @NonNull
    public static e9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49226OooO00o;
    }

    @NonNull
    public static e9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_moments, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) o00Oo0.OooO00o(viewInflate, R.id.composeView);
        if (composeView != null) {
            i = R.id.ivMainMomentCreate;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivMainMomentCreate);
            if (imageView != null) {
                i = R.id.llMainMomentNotice;
                LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llMainMomentNotice);
                if (linearLayout != null) {
                    i = R.id.tvMainMomentNoticeNum;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMainMomentNoticeNum);
                    if (textView != null) {
                        i = R.id.vpMainMoment;
                        RtlViewPager rtlViewPager = (RtlViewPager) o00Oo0.OooO00o(viewInflate, R.id.vpMainMoment);
                        if (rtlViewPager != null) {
                            return new e9((ConstraintLayout) viewInflate, composeView, imageView, linearLayout, textView, rtlViewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
