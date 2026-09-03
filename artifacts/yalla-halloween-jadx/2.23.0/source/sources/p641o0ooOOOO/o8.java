package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o8 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58531OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58532OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58533OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58534OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f58535OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58536OooO0o0;

    public o8(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ViewPager2 viewPager2) {
        this.f58531OooO00o = linearLayout;
        this.f58532OooO0O0 = imageView;
        this.f58533OooO0OO = imageView2;
        this.f58534OooO0Oo = imageView3;
        this.f58536OooO0o0 = imageView4;
        this.f58535OooO0o = viewPager2;
    }

    @NonNull
    public static o8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58531OooO00o;
    }

    @NonNull
    public static o8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_fragment_guess_gift_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.firstGift;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.fourthGift;
            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                i = oO00O0oO.secondGift;
                ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView3 != null) {
                    i = oO00O0oO.thirdGift;
                    ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView4 != null) {
                        i = oO00O0oO.vpGuessList;
                        ViewPager2 viewPager2 = (ViewPager2) OooOO0.OooO00o(i, viewInflate);
                        if (viewPager2 != null) {
                            return new o8((LinearLayout) viewInflate, imageView, imageView2, imageView3, imageView4, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
