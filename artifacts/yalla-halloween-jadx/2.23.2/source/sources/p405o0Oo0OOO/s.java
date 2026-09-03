package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.youth.banner.Banner;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f45472OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45473OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Banner f45474OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f45475OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f45476OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f45477OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f45478OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f45479OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f45480OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f45481OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ImageView f45482OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f45483OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f45484OooOOO0;

    public s(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull Banner banner, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull ImageView imageView10, @NonNull ViewPager2 viewPager2) {
        this.f45473OooO00o = linearLayoutCompat;
        this.f45474OooO0O0 = banner;
        this.f45475OooO0OO = imageView;
        this.f45476OooO0Oo = imageView2;
        this.f45478OooO0o0 = imageView3;
        this.f45477OooO0o = imageView4;
        this.f45479OooO0oO = imageView5;
        this.f45480OooO0oo = imageView6;
        this.f45472OooO = imageView7;
        this.f45481OooOO0 = imageView8;
        this.f45482OooOO0O = imageView9;
        this.f45483OooOO0o = imageView10;
        this.f45484OooOOO0 = viewPager2;
    }

    @NonNull
    public static s inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45473OooO00o;
    }

    @NonNull
    public static s inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_dialog_treasure_box, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.banner;
        Banner banner = (Banner) OooO0O0.OooO00o(i, viewInflate);
        if (banner != null) {
            i = o0OO00O.ivArrow1;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0OO00O.ivArrow2;
                ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = o0OO00O.ivBox1;
                    ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView3 != null) {
                        i = o0OO00O.ivBox2;
                        ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView4 != null) {
                            i = o0OO00O.ivBox3;
                            ImageView imageView5 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (imageView5 != null) {
                                i = o0OO00O.ivBroadcast;
                                ImageView imageView6 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                if (imageView6 != null) {
                                    i = o0OO00O.ivCurrentBg1;
                                    ImageView imageView7 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (imageView7 != null) {
                                        i = o0OO00O.ivCurrentBg2;
                                        ImageView imageView8 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                        if (imageView8 != null) {
                                            i = o0OO00O.ivCurrentBg3;
                                            ImageView imageView9 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                            if (imageView9 != null) {
                                                i = o0OO00O.ivMore;
                                                ImageView imageView10 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                if (imageView10 != null) {
                                                    i = o0OO00O.viewPager;
                                                    ViewPager2 viewPager2 = (ViewPager2) OooO0O0.OooO00o(i, viewInflate);
                                                    if (viewPager2 != null) {
                                                        return new s((LinearLayoutCompat) viewInflate, banner, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, viewPager2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
