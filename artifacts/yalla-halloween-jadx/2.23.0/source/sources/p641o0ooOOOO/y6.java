package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class y6 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f59394OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f59395OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f59396OooO0OO;

    public y6(@NonNull FrameLayout frameLayout, @NonNull ComposeView composeView, @NonNull View view) {
        this.f59394OooO00o = frameLayout;
        this.f59395OooO0O0 = composeView;
        this.f59396OooO0OO = view;
    }

    @NonNull
    public static y6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59394OooO00o;
    }

    @NonNull
    public static y6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_view_layout_moment_message_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = oO00O0oO.composeView;
        ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
        if (composeView == null || (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.viewShade), viewInflate)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
        return new y6(frameLayout, composeView, viewOooO00o);
    }
}
