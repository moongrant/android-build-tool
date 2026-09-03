package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class p3 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58580OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58581OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final e4 f58582OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58583OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f58584OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f58585OooO0o0;

    public p3(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull e4 e4Var, @NonNull ConstraintLayout constraintLayout, @NonNull ViewPager2 viewPager2, @NonNull YlTableLayout ylTableLayout) {
        this.f58580OooO00o = frameLayout;
        this.f58581OooO0O0 = imageView;
        this.f58582OooO0OO = e4Var;
        this.f58583OooO0Oo = constraintLayout;
        this.f58585OooO0o0 = viewPager2;
        this.f58584OooO0o = ylTableLayout;
    }

    @NonNull
    public static p3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58580OooO00o;
    }

    @NonNull
    public static p3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_activity_explore_tag_room_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivMore;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.llTags), viewInflate)) != null) {
            e4 e4VarOooO00o = e4.OooO00o(viewOooO00o);
            i = oO00O0oO.topLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
            if (constraintLayout != null) {
                i = oO00O0oO.vpMoreRoom;
                ViewPager2 viewPager2 = (ViewPager2) OooOO0.OooO00o(i, viewInflate);
                if (viewPager2 != null) {
                    i = oO00O0oO.ylMoreRoom;
                    YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, viewInflate);
                    if (ylTableLayout != null) {
                        return new p3((FrameLayout) viewInflate, imageView, e4VarOooO00o, constraintLayout, viewPager2, ylTableLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
