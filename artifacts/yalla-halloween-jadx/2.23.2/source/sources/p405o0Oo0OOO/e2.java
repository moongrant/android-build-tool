package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f43816OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43817OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f43818OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Button f43819OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Button f43820OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43821OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f43822OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f43823OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f43824OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f43825OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f43826OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f43827OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f43828OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f43829OooOOO0;

    public e2(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull UserPremiumView userPremiumView, @NonNull LinearLayout linearLayout2, @NonNull NetImageView netImageView, @NonNull StateLayout stateLayout, @NonNull YlTableLayout ylTableLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ViewPager2 viewPager2) {
        this.f43817OooO00o = linearLayout;
        this.f43818OooO0O0 = button;
        this.f43819OooO0OO = button2;
        this.f43820OooO0Oo = button3;
        this.f43822OooO0o0 = userPremiumView;
        this.f43821OooO0o = linearLayout2;
        this.f43823OooO0oO = netImageView;
        this.f43824OooO0oo = stateLayout;
        this.f43816OooO = ylTableLayout;
        this.f43825OooOO0 = textView;
        this.f43826OooOO0O = textView2;
        this.f43827OooOO0o = textView3;
        this.f43829OooOOO0 = textView4;
        this.f43828OooOOO = viewPager2;
    }

    @NonNull
    public static e2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43817OooO00o;
    }

    @NonNull
    public static e2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_vip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ari_ll;
        if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.btEnOpen;
            Button button = (Button) OooO0O0.OooO00o(i, viewInflate);
            if (button != null) {
                i = o0OO00O.btOpen;
                Button button2 = (Button) OooO0O0.OooO00o(i, viewInflate);
                if (button2 != null) {
                    i = o0OO00O.btSubscription;
                    Button button3 = (Button) OooO0O0.OooO00o(i, viewInflate);
                    if (button3 != null) {
                        i = o0OO00O.ivVip;
                        UserPremiumView userPremiumView = (UserPremiumView) OooO0O0.OooO00o(i, viewInflate);
                        if (userPremiumView != null) {
                            i = o0OO00O.ll_ari;
                            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (linearLayout != null) {
                                i = o0OO00O.sdv_header;
                                NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                                if (netImageView != null) {
                                    i = o0OO00O.stateLayout;
                                    StateLayout stateLayout = (StateLayout) OooO0O0.OooO00o(i, viewInflate);
                                    if (stateLayout != null) {
                                        i = o0OO00O.tl_aristocracy;
                                        YlTableLayout ylTableLayout = (YlTableLayout) OooO0O0.OooO00o(i, viewInflate);
                                        if (ylTableLayout != null) {
                                            i = o0OO00O.tv_ari;
                                            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView != null) {
                                                i = o0OO00O.tv_bottom;
                                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView2 != null) {
                                                    i = o0OO00O.tv_time;
                                                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = o0OO00O.tv_top;
                                                        TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (textView4 != null) {
                                                            i = o0OO00O.viewPager;
                                                            ViewPager2 viewPager2 = (ViewPager2) OooO0O0.OooO00o(i, viewInflate);
                                                            if (viewPager2 != null) {
                                                                return new e2((LinearLayout) viewInflate, button, button2, button3, userPremiumView, linearLayout, netImageView, stateLayout, ylTableLayout, textView, textView2, textView3, textView4, viewPager2);
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
