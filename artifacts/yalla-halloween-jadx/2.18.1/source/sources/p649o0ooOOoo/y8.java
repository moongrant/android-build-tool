package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.ViewPagerFixed;
import com.app.base.view.indicator.YlTableLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class y8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50995OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50996OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f50997OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f50998OooO0Oo;

    public y8(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull YlTableLayout ylTableLayout, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f50995OooO00o = linearLayout;
        this.f50996OooO0O0 = imageView;
        this.f50997OooO0OO = ylTableLayout;
        this.f50998OooO0Oo = viewPagerFixed;
    }

    @NonNull
    public static y8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50995OooO00o;
    }

    @NonNull
    public static y8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_main_moment_topic, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivSearch;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSearch);
        if (imageView != null) {
            i = R.id.tlMomentTopic;
            YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(viewInflate, R.id.tlMomentTopic);
            if (ylTableLayout != null) {
                i = R.id.vpMomentTopic;
                ViewPagerFixed viewPagerFixed = (ViewPagerFixed) o00Oo0.OooO00o(viewInflate, R.id.vpMomentTopic);
                if (viewPagerFixed != null) {
                    return new y8((LinearLayout) viewInflate, imageView, ylTableLayout, viewPagerFixed);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
