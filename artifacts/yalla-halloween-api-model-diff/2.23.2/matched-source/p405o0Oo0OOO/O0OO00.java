package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.support.statebutton.StateButton;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class O0OO00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43695OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f43696OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f43697OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f43698OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f43699OooO0o0;

    public O0OO00(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull StateButton stateButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f43695OooO00o = linearLayout;
        this.f43696OooO0O0 = frameLayout;
        this.f43697OooO0OO = stateButton;
        this.f43698OooO0Oo = textView;
        this.f43699OooO0o0 = textView2;
    }

    @NonNull
    public static O0OO00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43695OooO00o;
    }

    @NonNull
    public static O0OO00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_activity_theme_mine, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.flRoomTheme;
        FrameLayout frameLayout = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = o0OO00O.stCreate;
            StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
            if (stateButton != null) {
                i = o0OO00O.tvCustomize;
                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView != null) {
                    i = o0OO00O.tvMine;
                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        return new O0OO00((LinearLayout) viewInflate, frameLayout, stateButton, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
