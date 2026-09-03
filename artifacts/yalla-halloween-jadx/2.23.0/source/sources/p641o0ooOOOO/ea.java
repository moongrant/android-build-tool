package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.ui.view.ConfigView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ea implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57854OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f57855OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ConfigView f57856OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConfigView f57857OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57858OooO0o0;

    public ea(@NonNull LinearLayout linearLayout, @NonNull StateButton stateButton, @NonNull ConfigView configView, @NonNull ConfigView configView2, @NonNull LinearLayout linearLayout2) {
        this.f57854OooO00o = linearLayout;
        this.f57855OooO0O0 = stateButton;
        this.f57856OooO0OO = configView;
        this.f57857OooO0Oo = configView2;
        this.f57858OooO0o0 = linearLayout2;
    }

    @NonNull
    public static ea inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57854OooO00o;
    }

    @NonNull
    public static ea inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_activity_notice_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.btNotice;
        StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = oO00O0oO.cvFriendRequest;
            ConfigView configView = (ConfigView) OooOO0.OooO00o(i, viewInflate);
            if (configView != null) {
                i = oO00O0oO.cvPrivateChat;
                ConfigView configView2 = (ConfigView) OooOO0.OooO00o(i, viewInflate);
                if (configView2 != null) {
                    i = oO00O0oO.llPermissionTip;
                    LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                    if (linearLayout != null) {
                        return new ea((LinearLayout) viewInflate, stateButton, configView, configView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
