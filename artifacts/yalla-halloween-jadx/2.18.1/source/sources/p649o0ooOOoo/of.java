package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.weieyu.yalla.R;
import com.youth.banner.Banner;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class of implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f50188OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50189OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Banner f50190OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50191OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50192OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f50193OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f50194OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f50195OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50196OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f50197OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ImageView f50198OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f50199OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f50200OooOOO0;

    public of(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull Banner banner, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull ImageView imageView8, @NonNull ImageView imageView9, @NonNull ImageView imageView10, @NonNull ViewPager2 viewPager2) {
        this.f50189OooO00o = linearLayoutCompat;
        this.f50190OooO0O0 = banner;
        this.f50191OooO0OO = imageView;
        this.f50192OooO0Oo = imageView2;
        this.f50194OooO0o0 = imageView3;
        this.f50193OooO0o = imageView4;
        this.f50195OooO0oO = imageView5;
        this.f50196OooO0oo = imageView6;
        this.f50188OooO = imageView7;
        this.f50197OooOO0 = imageView8;
        this.f50198OooOO0O = imageView9;
        this.f50199OooOO0o = imageView10;
        this.f50200OooOOO0 = viewPager2;
    }

    @NonNull
    public static of inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50189OooO00o;
    }

    @NonNull
    public static of inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_treasure_box, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.banner;
        Banner banner = (Banner) o00Oo0.OooO00o(viewInflate, R.id.banner);
        if (banner != null) {
            i = R.id.ivArrow1;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivArrow1);
            if (imageView != null) {
                i = R.id.ivArrow2;
                ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivArrow2);
                if (imageView2 != null) {
                    i = R.id.ivBox1;
                    ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBox1);
                    if (imageView3 != null) {
                        i = R.id.ivBox2;
                        ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBox2);
                        if (imageView4 != null) {
                            i = R.id.ivBox3;
                            ImageView imageView5 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBox3);
                            if (imageView5 != null) {
                                i = R.id.ivBroadcast;
                                ImageView imageView6 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBroadcast);
                                if (imageView6 != null) {
                                    i = R.id.ivCurrentBg1;
                                    ImageView imageView7 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCurrentBg1);
                                    if (imageView7 != null) {
                                        i = R.id.ivCurrentBg2;
                                        ImageView imageView8 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCurrentBg2);
                                        if (imageView8 != null) {
                                            i = R.id.ivCurrentBg3;
                                            ImageView imageView9 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCurrentBg3);
                                            if (imageView9 != null) {
                                                i = R.id.ivMore;
                                                ImageView imageView10 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivMore);
                                                if (imageView10 != null) {
                                                    i = R.id.viewPager;
                                                    ViewPager2 viewPager2 = (ViewPager2) o00Oo0.OooO00o(viewInflate, R.id.viewPager);
                                                    if (viewPager2 != null) {
                                                        return new of((LinearLayoutCompat) viewInflate, banner, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, viewPager2);
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
