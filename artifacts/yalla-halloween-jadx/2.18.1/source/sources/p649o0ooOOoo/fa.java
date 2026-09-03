package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.app.base.view.indicator.YlTableLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.StateLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class fa implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f49351OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49352OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ua f49353OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f49354OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f49355OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49356OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f49357OooO0oO;

    public fa(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull ua uaVar, @NonNull StateLayout stateLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ViewPager2 viewPager2, @NonNull YlTableLayout ylTableLayout) {
        this.f49351OooO00o = linearLayoutCompat;
        this.f49352OooO0O0 = imageView;
        this.f49353OooO0OO = uaVar;
        this.f49354OooO0Oo = stateLayout;
        this.f49356OooO0o0 = constraintLayout;
        this.f49355OooO0o = viewPager2;
        this.f49357OooO0oO = ylTableLayout;
    }

    @NonNull
    public static fa inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49351OooO00o;
    }

    @NonNull
    public static fa inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_activity_explore_country_room_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivMore;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivMore);
        if (imageView != null) {
            i = R.id.llCountries;
            View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.llCountries);
            if (viewOooO00o != null) {
                ua uaVarOooO00o = ua.OooO00o(viewOooO00o);
                i = R.id.stateLayout;
                StateLayout stateLayout = (StateLayout) o00Oo0.OooO00o(viewInflate, R.id.stateLayout);
                if (stateLayout != null) {
                    i = R.id.topLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.topLayout);
                    if (constraintLayout != null) {
                        i = R.id.vpMoreRoom;
                        ViewPager2 viewPager2 = (ViewPager2) o00Oo0.OooO00o(viewInflate, R.id.vpMoreRoom);
                        if (viewPager2 != null) {
                            i = R.id.ylMoreRoom;
                            YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(viewInflate, R.id.ylMoreRoom);
                            if (ylTableLayout != null) {
                                return new fa((LinearLayoutCompat) viewInflate, imageView, uaVarOooO00o, stateLayout, constraintLayout, viewPager2, ylTableLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
