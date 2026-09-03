package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.booking.rtlviewpager.RtlViewPager;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class f4 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57902OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f57903OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f57904OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final q4 f57905OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f57906OooO0o0;

    public f4(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull q4 q4Var, @NonNull RtlViewPager rtlViewPager) {
        this.f57902OooO00o = constraintLayout;
        this.f57903OooO0O0 = composeView;
        this.f57904OooO0OO = composeView2;
        this.f57905OooO0Oo = q4Var;
        this.f57906OooO0o0 = rtlViewPager;
    }

    @NonNull
    public static f4 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57902OooO00o;
    }

    @NonNull
    public static f4 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.composeSideTask;
        ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = oO00O0oO.composeView;
            ComposeView composeView2 = (ComposeView) OooOO0.OooO00o(i, viewInflate);
            if (composeView2 != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.ilArrears), viewInflate)) != null) {
                q4 q4VarOooO00o = q4.OooO00o(viewOooO00o);
                i = oO00O0oO.vpRoom;
                RtlViewPager rtlViewPager = (RtlViewPager) OooOO0.OooO00o(i, viewInflate);
                if (rtlViewPager != null) {
                    return new f4((ConstraintLayout) viewInflate, composeView, composeView2, q4VarOooO00o, rtlViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
