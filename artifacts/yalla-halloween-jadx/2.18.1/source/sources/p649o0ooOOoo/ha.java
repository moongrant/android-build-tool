package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.RoomMemberConveneCardView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ha implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f49532OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final DrawerLayout f49533OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f49534OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final DrawerLayout f49535OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49536OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49537OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ViewStub f49538OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final RoomMemberConveneCardView f49539OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ViewStub f49540OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ViewStub f49541OooOO0;

    public ha(@NonNull DrawerLayout drawerLayout, @NonNull ComposeView composeView, @NonNull DrawerLayout drawerLayout2, @NonNull FrameLayout frameLayout, @NonNull ViewStub viewStub, @NonNull FrameLayout frameLayout2, @NonNull RoomMemberConveneCardView roomMemberConveneCardView, @NonNull ViewStub viewStub2, @NonNull ImageView imageView, @NonNull ViewStub viewStub3) {
        this.f49533OooO00o = drawerLayout;
        this.f49534OooO0O0 = composeView;
        this.f49535OooO0OO = drawerLayout2;
        this.f49536OooO0Oo = frameLayout;
        this.f49538OooO0o0 = viewStub;
        this.f49537OooO0o = frameLayout2;
        this.f49539OooO0oO = roomMemberConveneCardView;
        this.f49540OooO0oo = viewStub2;
        this.f49532OooO = imageView;
        this.f49541OooOO0 = viewStub3;
    }

    @NonNull
    public static ha inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49533OooO00o;
    }

    @NonNull
    public static ha inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) o00Oo0.OooO00o(viewInflate, R.id.composeView);
        if (composeView != null) {
            DrawerLayout drawerLayout = (DrawerLayout) viewInflate;
            i = R.id.flMain;
            FrameLayout frameLayout = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flMain);
            if (frameLayout != null) {
                i = R.id.loginViewStub;
                ViewStub viewStub = (ViewStub) o00Oo0.OooO00o(viewInflate, R.id.loginViewStub);
                if (viewStub != null) {
                    i = R.id.main_container;
                    FrameLayout frameLayout2 = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.main_container);
                    if (frameLayout2 != null) {
                        i = R.id.roomMemberConveneCardView;
                        RoomMemberConveneCardView roomMemberConveneCardView = (RoomMemberConveneCardView) o00Oo0.OooO00o(viewInflate, R.id.roomMemberConveneCardView);
                        if (roomMemberConveneCardView != null) {
                            i = R.id.termsServiceStub;
                            ViewStub viewStub2 = (ViewStub) o00Oo0.OooO00o(viewInflate, R.id.termsServiceStub);
                            if (viewStub2 != null) {
                                i = R.id.vToolbarBackground;
                                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.vToolbarBackground);
                                if (imageView != null) {
                                    i = R.id.vsDrawer;
                                    ViewStub viewStub3 = (ViewStub) o00Oo0.OooO00o(viewInflate, R.id.vsDrawer);
                                    if (viewStub3 != null) {
                                        return new ha(drawerLayout, composeView, drawerLayout, frameLayout, viewStub, frameLayout2, roomMemberConveneCardView, viewStub2, imageView, viewStub3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
