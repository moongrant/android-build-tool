package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.common.ui.view.ConfigView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oh implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50211OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f50212OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ConfigView f50213OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConfigView f50214OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50215OooO0o0;

    public oh(@NonNull LinearLayout linearLayout, @NonNull StateButton stateButton, @NonNull ConfigView configView, @NonNull ConfigView configView2, @NonNull LinearLayout linearLayout2) {
        this.f50211OooO00o = linearLayout;
        this.f50212OooO0O0 = stateButton;
        this.f50213OooO0OO = configView;
        this.f50214OooO0Oo = configView2;
        this.f50215OooO0o0 = linearLayout2;
    }

    @NonNull
    public static oh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50211OooO00o;
    }

    @NonNull
    public static oh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_notice_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btNotice;
        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btNotice);
        if (stateButton != null) {
            i = R.id.cvFriendRequest;
            ConfigView configView = (ConfigView) o00Oo0.OooO00o(viewInflate, R.id.cvFriendRequest);
            if (configView != null) {
                i = R.id.cvPrivateChat;
                ConfigView configView2 = (ConfigView) o00Oo0.OooO00o(viewInflate, R.id.cvPrivateChat);
                if (configView2 != null) {
                    i = R.id.llPermissionTip;
                    LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llPermissionTip);
                    if (linearLayout != null) {
                        return new oh((LinearLayout) viewInflate, stateButton, configView, configView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
