package p407o0Oo0OOO;

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
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class Oo0000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43697OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f43698OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f43699OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f43700OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f43701OooO0o0;

    public Oo0000(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull StateButton stateButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f43697OooO00o = linearLayout;
        this.f43698OooO0O0 = frameLayout;
        this.f43699OooO0OO = stateButton;
        this.f43700OooO0Oo = textView;
        this.f43701OooO0o0 = textView2;
    }

    @NonNull
    public static Oo0000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43697OooO00o;
    }

    @NonNull
    public static Oo0000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o0OO00O.room_activity_theme_mine, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0Oo0oo.flRoomTheme;
        FrameLayout frameLayout = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = o0Oo0oo.stCreate;
            StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
            if (stateButton != null) {
                i = o0Oo0oo.tvCustomize;
                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView != null) {
                    i = o0Oo0oo.tvMine;
                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        return new Oo0000((LinearLayout) viewInflate, frameLayout, stateButton, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
