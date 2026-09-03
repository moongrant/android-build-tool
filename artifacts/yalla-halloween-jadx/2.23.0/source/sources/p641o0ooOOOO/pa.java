package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class pa implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f58614OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58615OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f58616OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Button f58617OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Button f58618OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58619OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f58620OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f58621OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f58622OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58623OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f58624OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58625OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f58626OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58627OooOOO0;

    public pa(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull UserPremiumView userPremiumView, @NonNull LinearLayout linearLayout2, @NonNull NetImageView netImageView, @NonNull StateLayout stateLayout, @NonNull YlTableLayout ylTableLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ViewPager2 viewPager2) {
        this.f58615OooO00o = linearLayout;
        this.f58616OooO0O0 = button;
        this.f58617OooO0OO = button2;
        this.f58618OooO0Oo = button3;
        this.f58620OooO0o0 = userPremiumView;
        this.f58619OooO0o = linearLayout2;
        this.f58621OooO0oO = netImageView;
        this.f58622OooO0oo = stateLayout;
        this.f58614OooO = ylTableLayout;
        this.f58623OooOO0 = textView;
        this.f58624OooOO0O = textView2;
        this.f58625OooOO0o = textView3;
        this.f58627OooOOO0 = textView4;
        this.f58626OooOOO = viewPager2;
    }

    @NonNull
    public static pa inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58615OooO00o;
    }

    @NonNull
    public static pa inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_activity_vip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ari_ll;
        if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.btEnOpen;
            Button button = (Button) OooOO0.OooO00o(i, viewInflate);
            if (button != null) {
                i = oO00O0oO.btOpen;
                Button button2 = (Button) OooOO0.OooO00o(i, viewInflate);
                if (button2 != null) {
                    i = oO00O0oO.btSubscription;
                    Button button3 = (Button) OooOO0.OooO00o(i, viewInflate);
                    if (button3 != null) {
                        i = oO00O0oO.ivVip;
                        UserPremiumView userPremiumView = (UserPremiumView) OooOO0.OooO00o(i, viewInflate);
                        if (userPremiumView != null) {
                            i = oO00O0oO.ll_ari;
                            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                            if (linearLayout != null) {
                                i = oO00O0oO.sdv_header;
                                NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                                if (netImageView != null) {
                                    i = oO00O0oO.stateLayout;
                                    StateLayout stateLayout = (StateLayout) OooOO0.OooO00o(i, viewInflate);
                                    if (stateLayout != null) {
                                        i = oO00O0oO.tl_aristocracy;
                                        YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, viewInflate);
                                        if (ylTableLayout != null) {
                                            i = oO00O0oO.tv_ari;
                                            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView != null) {
                                                i = oO00O0oO.tv_bottom;
                                                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView2 != null) {
                                                    i = oO00O0oO.tv_time;
                                                    TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = oO00O0oO.tv_top;
                                                        TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                        if (textView4 != null) {
                                                            i = oO00O0oO.viewPager;
                                                            ViewPager2 viewPager2 = (ViewPager2) OooOO0.OooO00o(i, viewInflate);
                                                            if (viewPager2 != null) {
                                                                return new pa((LinearLayout) viewInflate, button, button2, button3, userPremiumView, linearLayout, netImageView, stateLayout, ylTableLayout, textView, textView2, textView3, textView4, viewPager2);
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
