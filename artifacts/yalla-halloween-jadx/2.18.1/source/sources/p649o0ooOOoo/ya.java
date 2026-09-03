package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ya implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f51002OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f51003OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f51004OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final jb f51005OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f51006OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f51007OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SVGAView f51008OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f51009OooO0oo;

    public ya(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull jb jbVar, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull SVGAView sVGAView, @NonNull RtlViewPager rtlViewPager) {
        this.f51002OooO00o = constraintLayout;
        this.f51003OooO0O0 = composeView;
        this.f51004OooO0OO = composeView2;
        this.f51005OooO0Oo = jbVar;
        this.f51007OooO0o0 = imageView;
        this.f51006OooO0o = netImageView;
        this.f51008OooO0oO = sVGAView;
        this.f51009OooO0oo = rtlViewPager;
    }

    @NonNull
    public static ya inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51002OooO00o;
    }

    @NonNull
    public static ya inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) o00Oo0.OooO00o(viewInflate, R.id.composeView);
        if (composeView != null) {
            i = R.id.debugComposeView;
            ComposeView composeView2 = (ComposeView) o00Oo0.OooO00o(viewInflate, R.id.debugComposeView);
            if (composeView2 != null) {
                i = R.id.ilArrears;
                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.ilArrears);
                if (viewOooO00o != null) {
                    jb jbVarOooO00o = jb.OooO00o(viewOooO00o);
                    i = R.id.ivCheck;
                    ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCheck);
                    if (imageView != null) {
                        i = R.id.ivUserReturnReward;
                        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivUserReturnReward);
                        if (netImageView != null) {
                            i = R.id.llCheck;
                            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llCheck)) != null) {
                                i = R.id.sivCheck;
                                SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.sivCheck);
                                if (sVGAView != null) {
                                    i = R.id.vpRoom;
                                    RtlViewPager rtlViewPager = (RtlViewPager) o00Oo0.OooO00o(viewInflate, R.id.vpRoom);
                                    if (rtlViewPager != null) {
                                        return new ya((ConstraintLayout) viewInflate, composeView, composeView2, jbVarOooO00o, imageView, netImageView, sVGAView, rtlViewPager);
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
