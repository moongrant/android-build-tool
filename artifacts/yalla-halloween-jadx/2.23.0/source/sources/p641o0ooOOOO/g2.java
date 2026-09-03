package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import p081o000OoOO.OooO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class g2 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ComposeView f57956OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f57957OooO0O0;

    public g2(@NonNull ComposeView composeView, @NonNull ComposeView composeView2) {
        this.f57956OooO00o = composeView;
        this.f57957OooO0O0 = composeView2;
    }

    @NonNull
    public static g2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57956OooO00o;
    }

    @NonNull
    public static g2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.fragment_compose, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) viewInflate;
        return new g2(composeView, composeView);
    }
}
