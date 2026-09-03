package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import com.yalla.yalla.ui.view.room.RoomMemberConveneCardView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000Oo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44746OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f44747OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f44748OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44749OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44750OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ViewStub f44751OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final RoomMemberConveneCardView f44752OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ViewStub f44753OooO0oo;

    public oO0000Oo(@NonNull FrameLayout frameLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull FrameLayout frameLayout2, @NonNull ViewStub viewStub, @NonNull FrameLayout frameLayout3, @NonNull RoomMemberConveneCardView roomMemberConveneCardView, @NonNull ViewStub viewStub2) {
        this.f44746OooO00o = frameLayout;
        this.f44747OooO0O0 = composeView;
        this.f44748OooO0OO = composeView2;
        this.f44749OooO0Oo = frameLayout2;
        this.f44751OooO0o0 = viewStub;
        this.f44750OooO0o = frameLayout3;
        this.f44752OooO0oO = roomMemberConveneCardView;
        this.f44753OooO0oo = viewStub2;
    }

    @NonNull
    public static oO0000Oo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44746OooO00o;
    }

    @NonNull
    public static oO0000Oo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.composeView;
        ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = o0OO00O.composeViewTopBg;
            ComposeView composeView2 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
            if (composeView2 != null) {
                i = o0OO00O.flMain;
                FrameLayout frameLayout = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
                if (frameLayout != null) {
                    i = o0OO00O.loginViewStub;
                    ViewStub viewStub = (ViewStub) OooO0O0.OooO00o(i, viewInflate);
                    if (viewStub != null) {
                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                        i = o0OO00O.roomMemberConveneCardView;
                        RoomMemberConveneCardView roomMemberConveneCardView = (RoomMemberConveneCardView) OooO0O0.OooO00o(i, viewInflate);
                        if (roomMemberConveneCardView != null) {
                            i = o0OO00O.termsServiceStub;
                            ViewStub viewStub2 = (ViewStub) OooO0O0.OooO00o(i, viewInflate);
                            if (viewStub2 != null) {
                                return new oO0000Oo(frameLayout2, composeView, composeView2, frameLayout, viewStub, frameLayout2, roomMemberConveneCardView, viewStub2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
