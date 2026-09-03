package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.app.base.view.indicator.YlTableLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ga implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49441OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49442OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final va f49443OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49444OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f49445OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f49446OooO0o0;

    public ga(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull va vaVar, @NonNull ConstraintLayout constraintLayout, @NonNull ViewPager2 viewPager2, @NonNull YlTableLayout ylTableLayout) {
        this.f49441OooO00o = frameLayout;
        this.f49442OooO0O0 = imageView;
        this.f49443OooO0OO = vaVar;
        this.f49444OooO0Oo = constraintLayout;
        this.f49446OooO0o0 = viewPager2;
        this.f49445OooO0o = ylTableLayout;
    }

    @NonNull
    public static ga inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49441OooO00o;
    }

    @NonNull
    public static ga inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_activity_explore_tag_room_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivMore;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivMore);
        if (imageView != null) {
            i = R.id.llTags;
            View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.llTags);
            if (viewOooO00o != null) {
                va vaVarOooO00o = va.OooO00o(viewOooO00o);
                i = R.id.topLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.topLayout);
                if (constraintLayout != null) {
                    i = R.id.vpMoreRoom;
                    ViewPager2 viewPager2 = (ViewPager2) o00Oo0.OooO00o(viewInflate, R.id.vpMoreRoom);
                    if (viewPager2 != null) {
                        i = R.id.ylMoreRoom;
                        YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(viewInflate, R.id.ylMoreRoom);
                        if (ylTableLayout != null) {
                            return new ga((FrameLayout) viewInflate, imageView, vaVarOooO00o, constraintLayout, viewPager2, ylTableLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
