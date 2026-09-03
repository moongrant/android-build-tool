package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o3 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58505OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58506OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final d4 f58507OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f58508OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f58509OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58510OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f58511OooO0oO;

    public o3(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull d4 d4Var, @NonNull StateLayout stateLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ViewPager2 viewPager2, @NonNull YlTableLayout ylTableLayout) {
        this.f58505OooO00o = linearLayoutCompat;
        this.f58506OooO0O0 = imageView;
        this.f58507OooO0OO = d4Var;
        this.f58508OooO0Oo = stateLayout;
        this.f58510OooO0o0 = constraintLayout;
        this.f58509OooO0o = viewPager2;
        this.f58511OooO0oO = ylTableLayout;
    }

    @NonNull
    public static o3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58505OooO00o;
    }

    @NonNull
    public static o3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_activity_explore_country_room_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivMore;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.llCountries), viewInflate)) != null) {
            d4 d4VarOooO00o = d4.OooO00o(viewOooO00o);
            i = oO00O0oO.stateLayout;
            StateLayout stateLayout = (StateLayout) OooOO0.OooO00o(i, viewInflate);
            if (stateLayout != null) {
                i = oO00O0oO.topLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
                if (constraintLayout != null) {
                    i = oO00O0oO.vpMoreRoom;
                    ViewPager2 viewPager2 = (ViewPager2) OooOO0.OooO00o(i, viewInflate);
                    if (viewPager2 != null) {
                        i = oO00O0oO.ylMoreRoom;
                        YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, viewInflate);
                        if (ylTableLayout != null) {
                            return new o3((LinearLayoutCompat) viewInflate, imageView, d4VarOooO00o, stateLayout, constraintLayout, viewPager2, ylTableLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
