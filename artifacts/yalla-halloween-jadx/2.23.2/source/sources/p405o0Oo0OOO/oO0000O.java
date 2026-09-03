package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44740OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44741OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final oO000Oo f44742OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44743OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f44744OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f44745OooO0o0;

    public oO0000O(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull oO000Oo oo000oo, @NonNull ConstraintLayout constraintLayout, @NonNull ViewPager2 viewPager2, @NonNull YlTableLayout ylTableLayout) {
        this.f44740OooO00o = frameLayout;
        this.f44741OooO0O0 = imageView;
        this.f44742OooO0OO = oo000oo;
        this.f44743OooO0Oo = constraintLayout;
        this.f44745OooO0o0 = viewPager2;
        this.f44744OooO0o = ylTableLayout;
    }

    @NonNull
    public static oO0000O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44740OooO00o;
    }

    @NonNull
    public static oO0000O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_activity_explore_tag_room_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivMore;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.llTags), viewInflate)) != null) {
            oO000Oo oo000ooOooO00o = oO000Oo.OooO00o(viewOooO00o);
            i = o0OO00O.topLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) OooO0O0.OooO00o(i, viewInflate);
            if (constraintLayout != null) {
                i = o0OO00O.vpMoreRoom;
                ViewPager2 viewPager2 = (ViewPager2) OooO0O0.OooO00o(i, viewInflate);
                if (viewPager2 != null) {
                    i = o0OO00O.ylMoreRoom;
                    YlTableLayout ylTableLayout = (YlTableLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (ylTableLayout != null) {
                        return new oO0000O((FrameLayout) viewInflate, imageView, oo000ooOooO00o, constraintLayout, viewPager2, ylTableLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
