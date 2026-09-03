package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44867OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f44868OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f44869OooO0OO;

    public oO0O00O(@NonNull LinearLayout linearLayout, @NonNull ComposeView composeView, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f44867OooO00o = linearLayout;
        this.f44868OooO0O0 = composeView;
        this.f44869OooO0OO = viewPagerFixed;
    }

    @NonNull
    public static oO0O00O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44867OooO00o;
    }

    @NonNull
    public static oO0O00O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_fragment_message, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.composeView;
        ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = o0OO00O.vpMessage;
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooO0O0.OooO00o(i, viewInflate);
            if (viewPagerFixed != null) {
                return new oO0O00O((LinearLayout) viewInflate, composeView, viewPagerFixed);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
