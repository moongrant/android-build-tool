package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.app.base.view.ViewPagerFixed;
import com.app.base.view.indicator.YlTableLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class hi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f49631OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f49632OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f49633OooO0OO;

    public hi(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull YlTableLayout ylTableLayout, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f49631OooO00o = linearLayoutCompat;
        this.f49632OooO0O0 = ylTableLayout;
        this.f49633OooO0OO = viewPagerFixed;
    }

    @NonNull
    public static hi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49631OooO00o;
    }

    @NonNull
    public static hi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_fragment_badge_rank, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.tlRank;
        YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(viewInflate, R.id.tlRank);
        if (ylTableLayout != null) {
            i = R.id.vpRank;
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) o00Oo0.OooO00o(viewInflate, R.id.vpRank);
            if (viewPagerFixed != null) {
                return new hi((LinearLayoutCompat) viewInflate, ylTableLayout, viewPagerFixed);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
