package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ve implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50811OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50812OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f50813OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50814OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50815OooO0o0;

    public ve(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull StateButton stateButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f50811OooO00o = linearLayout;
        this.f50812OooO0O0 = frameLayout;
        this.f50813OooO0OO = stateButton;
        this.f50814OooO0Oo = textView;
        this.f50815OooO0o0 = textView2;
    }

    @NonNull
    public static ve inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50811OooO00o;
    }

    @NonNull
    public static ve inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_theme_mine, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.flRoomTheme;
        FrameLayout frameLayout = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flRoomTheme);
        if (frameLayout != null) {
            i = R.id.stCreate;
            StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.stCreate);
            if (stateButton != null) {
                i = R.id.tvCustomize;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvCustomize);
                if (textView != null) {
                    i = R.id.tvMine;
                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMine);
                    if (textView2 != null) {
                        return new ve((LinearLayout) viewInflate, frameLayout, stateButton, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
