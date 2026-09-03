package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;
import com.app.base.view.indicator.YlTableLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class zh implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f51108OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f51109OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f51110OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Button f51111OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Button f51112OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f51113OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f51114OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f51115OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f51116OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f51117OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f51118OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f51119OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f51120OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f51121OooOOO0;

    public zh(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull UserPremiumView userPremiumView, @NonNull LinearLayout linearLayout2, @NonNull NetImageView netImageView, @NonNull StateLayout stateLayout, @NonNull YlTableLayout ylTableLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ViewPager2 viewPager2) {
        this.f51109OooO00o = linearLayout;
        this.f51110OooO0O0 = button;
        this.f51111OooO0OO = button2;
        this.f51112OooO0Oo = button3;
        this.f51114OooO0o0 = userPremiumView;
        this.f51113OooO0o = linearLayout2;
        this.f51115OooO0oO = netImageView;
        this.f51116OooO0oo = stateLayout;
        this.f51108OooO = ylTableLayout;
        this.f51117OooOO0 = textView;
        this.f51118OooOO0O = textView2;
        this.f51119OooOO0o = textView3;
        this.f51121OooOOO0 = textView4;
        this.f51120OooOOO = viewPager2;
    }

    @NonNull
    public static zh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51109OooO00o;
    }

    @NonNull
    public static zh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_vip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ari_ll;
        if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ari_ll)) != null) {
            i = R.id.btEnOpen;
            Button button = (Button) o00Oo0.OooO00o(viewInflate, R.id.btEnOpen);
            if (button != null) {
                i = R.id.btOpen;
                Button button2 = (Button) o00Oo0.OooO00o(viewInflate, R.id.btOpen);
                if (button2 != null) {
                    i = R.id.btSubscription;
                    Button button3 = (Button) o00Oo0.OooO00o(viewInflate, R.id.btSubscription);
                    if (button3 != null) {
                        i = R.id.ivVip;
                        UserPremiumView userPremiumView = (UserPremiumView) o00Oo0.OooO00o(viewInflate, R.id.ivVip);
                        if (userPremiumView != null) {
                            i = R.id.ll_ari;
                            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_ari);
                            if (linearLayout != null) {
                                i = R.id.sdv_header;
                                NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.sdv_header);
                                if (netImageView != null) {
                                    i = R.id.stateLayout;
                                    StateLayout stateLayout = (StateLayout) o00Oo0.OooO00o(viewInflate, R.id.stateLayout);
                                    if (stateLayout != null) {
                                        i = R.id.tl_aristocracy;
                                        YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(viewInflate, R.id.tl_aristocracy);
                                        if (ylTableLayout != null) {
                                            i = R.id.tv_ari;
                                            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_ari);
                                            if (textView != null) {
                                                i = R.id.tv_bottom;
                                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_bottom);
                                                if (textView2 != null) {
                                                    i = R.id.tv_time;
                                                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_time);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_top;
                                                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_top);
                                                        if (textView4 != null) {
                                                            i = R.id.viewPager;
                                                            ViewPager2 viewPager2 = (ViewPager2) o00Oo0.OooO00o(viewInflate, R.id.viewPager);
                                                            if (viewPager2 != null) {
                                                                return new zh((LinearLayout) viewInflate, button, button2, button3, userPremiumView, linearLayout, netImageView, stateLayout, ylTableLayout, textView, textView2, textView3, textView4, viewPager2);
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
