package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import com.yalla.yalla.ui.view.room.RoomMemberConveneCardView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class q3 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58654OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f58655OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f58656OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58657OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58658OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ViewStub f58659OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final RoomMemberConveneCardView f58660OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ViewStub f58661OooO0oo;

    public q3(@NonNull FrameLayout frameLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull FrameLayout frameLayout2, @NonNull ViewStub viewStub, @NonNull FrameLayout frameLayout3, @NonNull RoomMemberConveneCardView roomMemberConveneCardView, @NonNull ViewStub viewStub2) {
        this.f58654OooO00o = frameLayout;
        this.f58655OooO0O0 = composeView;
        this.f58656OooO0OO = composeView2;
        this.f58657OooO0Oo = frameLayout2;
        this.f58659OooO0o0 = viewStub;
        this.f58658OooO0o = frameLayout3;
        this.f58660OooO0oO = roomMemberConveneCardView;
        this.f58661OooO0oo = viewStub2;
    }

    @NonNull
    public static q3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58654OooO00o;
    }

    @NonNull
    public static q3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.composeView;
        ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = oO00O0oO.composeViewTopBg;
            ComposeView composeView2 = (ComposeView) OooOO0.OooO00o(i, viewInflate);
            if (composeView2 != null) {
                i = oO00O0oO.flMain;
                FrameLayout frameLayout = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
                if (frameLayout != null) {
                    i = oO00O0oO.loginViewStub;
                    ViewStub viewStub = (ViewStub) OooOO0.OooO00o(i, viewInflate);
                    if (viewStub != null) {
                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                        i = oO00O0oO.roomMemberConveneCardView;
                        RoomMemberConveneCardView roomMemberConveneCardView = (RoomMemberConveneCardView) OooOO0.OooO00o(i, viewInflate);
                        if (roomMemberConveneCardView != null) {
                            i = oO00O0oO.termsServiceStub;
                            ViewStub viewStub2 = (ViewStub) OooOO0.OooO00o(i, viewInflate);
                            if (viewStub2 != null) {
                                return new q3(frameLayout2, composeView, composeView2, frameLayout, viewStub, frameLayout2, roomMemberConveneCardView, viewStub2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
