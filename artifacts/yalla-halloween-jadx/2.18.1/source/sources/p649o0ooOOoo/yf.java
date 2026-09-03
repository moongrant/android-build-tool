package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class yf implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f51036OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f51037OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f51038OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f51039OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f51040OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f51041OooO0o0;

    public yf(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ViewPager2 viewPager2) {
        this.f51036OooO00o = linearLayout;
        this.f51037OooO0O0 = imageView;
        this.f51038OooO0OO = imageView2;
        this.f51039OooO0Oo = imageView3;
        this.f51041OooO0o0 = imageView4;
        this.f51040OooO0o = viewPager2;
    }

    @NonNull
    public static yf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51036OooO00o;
    }

    @NonNull
    public static yf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_fragment_guess_gift_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.firstGift;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.firstGift);
        if (imageView != null) {
            i = R.id.fourthGift;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.fourthGift);
            if (imageView2 != null) {
                i = R.id.secondGift;
                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.secondGift);
                if (imageView3 != null) {
                    i = R.id.thirdGift;
                    ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.thirdGift);
                    if (imageView4 != null) {
                        i = R.id.vpGuessList;
                        ViewPager2 viewPager2 = (ViewPager2) o00Oo0.OooO00o(viewInflate, R.id.vpGuessList);
                        if (viewPager2 != null) {
                            return new yf((LinearLayout) viewInflate, imageView, imageView2, imageView3, imageView4, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
