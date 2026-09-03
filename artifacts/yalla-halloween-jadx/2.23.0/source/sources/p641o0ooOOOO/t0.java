package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.FixTextView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58830OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixTextView f58831OooO0O0;

    public t0(@NonNull FrameLayout frameLayout, @NonNull FixTextView fixTextView) {
        this.f58830OooO00o = frameLayout;
        this.f58831OooO0O0 = fixTextView;
    }

    @NonNull
    public static t0 OooO00o(@NonNull View view) {
        int i = oO00O0oO.content;
        if (((LinearLayout) OooOO0.OooO00o(i, view)) != null) {
            i = oO00O0oO.tvMessage;
            FixTextView fixTextView = (FixTextView) OooOO0.OooO00o(i, view);
            if (fixTextView != null) {
                return new t0((FrameLayout) view, fixTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static t0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58830OooO00o;
    }

    @NonNull
    public static t0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.chatline_contribution_up, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
