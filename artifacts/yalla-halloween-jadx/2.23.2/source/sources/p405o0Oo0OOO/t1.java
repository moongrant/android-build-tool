package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.ui.view.ConfigView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45552OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f45553OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ConfigView f45554OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConfigView f45555OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45556OooO0o0;

    public t1(@NonNull LinearLayout linearLayout, @NonNull StateButton stateButton, @NonNull ConfigView configView, @NonNull ConfigView configView2, @NonNull LinearLayout linearLayout2) {
        this.f45552OooO00o = linearLayout;
        this.f45553OooO0O0 = stateButton;
        this.f45554OooO0OO = configView;
        this.f45555OooO0Oo = configView2;
        this.f45556OooO0o0 = linearLayout2;
    }

    @NonNull
    public static t1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45552OooO00o;
    }

    @NonNull
    public static t1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_notice_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btNotice;
        StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = o0OO00O.cvFriendRequest;
            ConfigView configView = (ConfigView) OooO0O0.OooO00o(i, viewInflate);
            if (configView != null) {
                i = o0OO00O.cvPrivateChat;
                ConfigView configView2 = (ConfigView) OooO0O0.OooO00o(i, viewInflate);
                if (configView2 != null) {
                    i = o0OO00O.llPermissionTip;
                    LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (linearLayout != null) {
                        return new t1((LinearLayout) viewInflate, stateButton, configView, configView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
