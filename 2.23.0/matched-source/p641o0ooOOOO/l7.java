package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.support.statebutton.StateButton;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class l7 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58367OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58368OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f58369OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58370OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f58371OooO0o0;

    public l7(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull StateButton stateButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f58367OooO00o = linearLayout;
        this.f58368OooO0O0 = frameLayout;
        this.f58369OooO0OO = stateButton;
        this.f58370OooO0Oo = textView;
        this.f58371OooO0o0 = textView2;
    }

    @NonNull
    public static l7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58367OooO00o;
    }

    @NonNull
    public static l7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_activity_theme_mine, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.flRoomTheme;
        FrameLayout frameLayout = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = oO00O0oO.stCreate;
            StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
            if (stateButton != null) {
                i = oO00O0oO.tvCustomize;
                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView != null) {
                    i = oO00O0oO.tvMine;
                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        return new l7((LinearLayout) viewInflate, frameLayout, stateButton, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
