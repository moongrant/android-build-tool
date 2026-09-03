package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import com.app.base.view.ViewPagerFixed;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ac implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f48934OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f48935OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f48936OooO0OO;

    public ac(@NonNull LinearLayout linearLayout, @NonNull ComposeView composeView, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f48934OooO00o = linearLayout;
        this.f48935OooO0O0 = composeView;
        this.f48936OooO0OO = viewPagerFixed;
    }

    @NonNull
    public static ac inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f48934OooO00o;
    }

    @NonNull
    public static ac inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_fragment_message, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) o00Oo0.OooO00o(viewInflate, R.id.composeView);
        if (composeView != null) {
            i = R.id.vpMessage;
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) o00Oo0.OooO00o(viewInflate, R.id.vpMessage);
            if (viewPagerFixed != null) {
                return new ac((LinearLayout) viewInflate, composeView, viewPagerFixed);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
