package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class n8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50074OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f50075OooO0O0;

    public n8(@NonNull FrameLayout frameLayout, @NonNull ComposeView composeView) {
        this.f50074OooO00o = frameLayout;
        this.f50075OooO0O0 = composeView;
    }

    @NonNull
    public static n8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50074OooO00o;
    }

    @NonNull
    public static n8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.event_fragment_display_child, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ComposeView composeView = (ComposeView) o00Oo0.OooO00o(viewInflate, R.id.displayChildComposeView);
        if (composeView != null) {
            return new n8((FrameLayout) viewInflate, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.displayChildComposeView)));
    }
}
