package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.view.banner.BannerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class q8 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f50350OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50351OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final BannerView f50352OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final BannerView f50353OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final BannerView f50354OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final BannerView f50355OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final BannerView f50356OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f50357OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f50358OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final View f50359OooOO0;

    public q8(@NonNull ConstraintLayout constraintLayout, @NonNull BannerView bannerView, @NonNull BannerView bannerView2, @NonNull BannerView bannerView3, @NonNull BannerView bannerView4, @NonNull BannerView bannerView5, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4) {
        this.f50351OooO00o = constraintLayout;
        this.f50352OooO0O0 = bannerView;
        this.f50353OooO0OO = bannerView2;
        this.f50354OooO0Oo = bannerView3;
        this.f50356OooO0o0 = bannerView4;
        this.f50355OooO0o = bannerView5;
        this.f50357OooO0oO = view;
        this.f50358OooO0oo = view2;
        this.f50350OooO = view3;
        this.f50359OooOO0 = view4;
    }

    @NonNull
    public static q8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50351OooO00o;
    }

    @NonNull
    public static q8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.explor_header_top, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.bv_gift_received;
        BannerView bannerView = (BannerView) o00Oo0.OooO00o(viewInflate, R.id.bv_gift_received);
        if (bannerView != null) {
            i = R.id.bv_gift_send;
            BannerView bannerView2 = (BannerView) o00Oo0.OooO00o(viewInflate, R.id.bv_gift_send);
            if (bannerView2 != null) {
                i = R.id.bv_room;
                BannerView bannerView3 = (BannerView) o00Oo0.OooO00o(viewInflate, R.id.bv_room);
                if (bannerView3 != null) {
                    i = R.id.bv_top_title;
                    BannerView bannerView4 = (BannerView) o00Oo0.OooO00o(viewInflate, R.id.bv_top_title);
                    if (bannerView4 != null) {
                        i = R.id.bv_total;
                        BannerView bannerView5 = (BannerView) o00Oo0.OooO00o(viewInflate, R.id.bv_total);
                        if (bannerView5 != null) {
                            i = R.id.imageView;
                            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.imageView)) != null) {
                                i = R.id.tv_title;
                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_title)) != null) {
                                    i = R.id.tv_top;
                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_top)) != null) {
                                        i = R.id.v_click_top_gift_received;
                                        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.v_click_top_gift_received);
                                        if (viewOooO00o != null) {
                                            i = R.id.v_click_top_gift_send;
                                            View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.v_click_top_gift_send);
                                            if (viewOooO00o2 != null) {
                                                i = R.id.v_click_top_room;
                                                View viewOooO00o3 = o00Oo0.OooO00o(viewInflate, R.id.v_click_top_room);
                                                if (viewOooO00o3 != null) {
                                                    i = R.id.v_click_top_total;
                                                    View viewOooO00o4 = o00Oo0.OooO00o(viewInflate, R.id.v_click_top_total);
                                                    if (viewOooO00o4 != null) {
                                                        i = R.id.v_top_gift_received;
                                                        if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.v_top_gift_received)) != null) {
                                                            i = R.id.v_top_gift_send;
                                                            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.v_top_gift_send)) != null) {
                                                                i = R.id.v_top_room;
                                                                if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.v_top_room)) != null) {
                                                                    i = R.id.v_top_total;
                                                                    if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.v_top_total)) != null) {
                                                                        return new q8((ConstraintLayout) viewInflate, bannerView, bannerView2, bannerView3, bannerView4, bannerView5, viewOooO00o, viewOooO00o2, viewOooO00o3, viewOooO00o4);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
