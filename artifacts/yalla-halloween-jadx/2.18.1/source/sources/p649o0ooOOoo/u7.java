package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.rbrooks.indefinitepagerindicator.IndefinitePagerIndicator;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class u7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50680OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50681OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50682OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final IndefinitePagerIndicator f50683OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f50684OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f50685OooO0o0;

    public u7(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull IndefinitePagerIndicator indefinitePagerIndicator, @NonNull View view, @NonNull ViewPager2 viewPager2) {
        this.f50680OooO00o = constraintLayout;
        this.f50681OooO0O0 = constraintLayout2;
        this.f50682OooO0OO = imageView;
        this.f50683OooO0Oo = indefinitePagerIndicator;
        this.f50685OooO0o0 = view;
        this.f50684OooO0o = viewPager2;
    }

    @NonNull
    public static u7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50680OooO00o;
    }

    @NonNull
    public static u7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_following_new_post, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.ivClosePost;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClosePost);
        if (imageView != null) {
            i = R.id.pageIndicator;
            IndefinitePagerIndicator indefinitePagerIndicator = (IndefinitePagerIndicator) o00Oo0.OooO00o(viewInflate, R.id.pageIndicator);
            if (indefinitePagerIndicator != null) {
                i = R.id.vLine;
                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.vLine);
                if (viewOooO00o != null) {
                    i = R.id.vpUserNewPost;
                    ViewPager2 viewPager2 = (ViewPager2) o00Oo0.OooO00o(viewInflate, R.id.vpUserNewPost);
                    if (viewPager2 != null) {
                        return new u7(constraintLayout, constraintLayout, imageView, indefinitePagerIndicator, viewOooO00o, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
