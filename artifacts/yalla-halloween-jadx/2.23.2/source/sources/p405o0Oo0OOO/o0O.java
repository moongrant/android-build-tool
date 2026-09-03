package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.booking.rtlviewpager.RtlViewPager;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44383OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f44384OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f44385OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44386OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f44387OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44388OooO0o0;

    public o0O(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RtlViewPager rtlViewPager) {
        this.f44383OooO00o = constraintLayout;
        this.f44384OooO0O0 = composeView;
        this.f44385OooO0OO = composeView2;
        this.f44386OooO0Oo = linearLayout;
        this.f44388OooO0o0 = textView;
        this.f44387OooO0o = rtlViewPager;
    }

    @NonNull
    public static o0O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44383OooO00o;
    }

    @NonNull
    public static o0O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.fragment_moments, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.composeMomentCreate;
        ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = o0OO00O.composeView;
            ComposeView composeView2 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
            if (composeView2 != null) {
                i = o0OO00O.llMainMomentNotice;
                LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                if (linearLayout != null) {
                    i = o0OO00O.tvMomentNotice;
                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = o0OO00O.vpMainMoment;
                        RtlViewPager rtlViewPager = (RtlViewPager) OooO0O0.OooO00o(i, viewInflate);
                        if (rtlViewPager != null) {
                            return new o0O((ConstraintLayout) viewInflate, composeView, composeView2, linearLayout, textView, rtlViewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
