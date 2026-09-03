package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class oO000o00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44782OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f44783OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f44784OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final oO00Oo0 f44785OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f44786OooO0o0;

    public oO000o00(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull oO00Oo0 oo00oo0, @NonNull RtlViewPager rtlViewPager) {
        this.f44782OooO00o = constraintLayout;
        this.f44783OooO0O0 = composeView;
        this.f44784OooO0OO = composeView2;
        this.f44785OooO0Oo = oo00oo0;
        this.f44786OooO0o0 = rtlViewPager;
    }

    @NonNull
    public static oO000o00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44782OooO00o;
    }

    @NonNull
    public static oO000o00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.composeSideTask;
        ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = o0OO00O.composeView;
            ComposeView composeView2 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
            if (composeView2 != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.ilArrears), viewInflate)) != null) {
                oO00Oo0 oo00oo0OooO00o = oO00Oo0.OooO00o(viewOooO00o);
                i = o0OO00O.vpRoom;
                RtlViewPager rtlViewPager = (RtlViewPager) OooO0O0.OooO00o(i, viewInflate);
                if (rtlViewPager != null) {
                    return new oO000o00((ConstraintLayout) viewInflate, composeView, composeView2, oo00oo0OooO00o, rtlViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
