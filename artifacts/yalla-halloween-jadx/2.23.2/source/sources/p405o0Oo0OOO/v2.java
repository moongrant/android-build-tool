package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class v2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45635OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f45636OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f45637OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f45638OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f45639OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final o00O f45640OooO0o0;

    public v2(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull o00O o00o2, @NonNull ImageView imageView) {
        this.f45635OooO00o = frameLayout;
        this.f45636OooO0O0 = appBarLayout;
        this.f45637OooO0OO = composeView;
        this.f45638OooO0Oo = composeView2;
        this.f45640OooO0o0 = o00o2;
        this.f45639OooO0o = imageView;
    }

    @NonNull
    public static v2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45635OooO00o;
    }

    @NonNull
    public static v2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_vip_benfit_mall, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) OooO0O0.OooO00o(i, viewInflate);
        if (appBarLayout != null) {
            i = o0OO00O.cl_benefit;
            if (((CoordinatorLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.composeViewContent;
                ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                if (composeView != null) {
                    i = o0OO00O.composeViewTopHead;
                    ComposeView composeView2 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                    if (composeView2 != null) {
                        i = o0OO00O.ctl;
                        if (((CollapsingToolbarLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            FrameLayout frameLayout = (FrameLayout) viewInflate;
                            i = o0OO00O.headerLayout;
                            View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
                            if (viewOooO00o != null) {
                                o00O o00oOooO00o = o00O.OooO00o(viewOooO00o);
                                i = o0OO00O.ivTopShadow;
                                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                if (imageView != null) {
                                    return new v2(frameLayout, appBarLayout, composeView, composeView2, o00oOooO00o, imageView);
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
