package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.youth.banner.Banner;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class e8 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f57831OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57832OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Banner f57833OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57834OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f57835OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f57836OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f57837OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f57838OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f57839OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f57840OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ImageView f57841OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f57842OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f57843OooOOO0;

    public e8(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull Banner banner, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull ImageView imageView10, @NonNull ViewPager2 viewPager2) {
        this.f57832OooO00o = linearLayoutCompat;
        this.f57833OooO0O0 = banner;
        this.f57834OooO0OO = imageView;
        this.f57835OooO0Oo = imageView2;
        this.f57837OooO0o0 = imageView3;
        this.f57836OooO0o = imageView4;
        this.f57838OooO0oO = imageView5;
        this.f57839OooO0oo = imageView6;
        this.f57831OooO = imageView7;
        this.f57840OooOO0 = imageView8;
        this.f57841OooOO0O = imageView9;
        this.f57842OooOO0o = imageView10;
        this.f57843OooOOO0 = viewPager2;
    }

    @NonNull
    public static e8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57832OooO00o;
    }

    @NonNull
    public static e8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_dialog_treasure_box, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.banner;
        Banner banner = (Banner) OooOO0.OooO00o(i, viewInflate);
        if (banner != null) {
            i = oO00O0oO.ivArrow1;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oO00O0oO.ivArrow2;
                ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = oO00O0oO.ivBox1;
                    ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView3 != null) {
                        i = oO00O0oO.ivBox2;
                        ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView4 != null) {
                            i = oO00O0oO.ivBox3;
                            ImageView imageView5 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                            if (imageView5 != null) {
                                i = oO00O0oO.ivBroadcast;
                                ImageView imageView6 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                if (imageView6 != null) {
                                    i = oO00O0oO.ivCurrentBg1;
                                    ImageView imageView7 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                    if (imageView7 != null) {
                                        i = oO00O0oO.ivCurrentBg2;
                                        ImageView imageView8 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                        if (imageView8 != null) {
                                            i = oO00O0oO.ivCurrentBg3;
                                            ImageView imageView9 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                            if (imageView9 != null) {
                                                i = oO00O0oO.ivMore;
                                                ImageView imageView10 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                                if (imageView10 != null) {
                                                    i = oO00O0oO.viewPager;
                                                    ViewPager2 viewPager2 = (ViewPager2) OooOO0.OooO00o(i, viewInflate);
                                                    if (viewPager2 != null) {
                                                        return new e8((LinearLayoutCompat) viewInflate, banner, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, viewPager2);
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
