package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class se implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50599OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final lg f50600OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50601OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50602OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50603OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50604OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f50605OooO0oO;

    public se(@NonNull LinearLayout linearLayout, @NonNull lg lgVar, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f50599OooO00o = linearLayout;
        this.f50600OooO0O0 = lgVar;
        this.f50601OooO0OO = linearLayout2;
        this.f50602OooO0Oo = textView;
        this.f50604OooO0o0 = recyclerView;
        this.f50603OooO0o = textView2;
        this.f50605OooO0oO = textView3;
    }

    @NonNull
    public static se inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50599OooO00o;
    }

    @NonNull
    public static se inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_store_lockroom, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.in_create_layout;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.in_create_layout);
        if (viewOooO00o != null) {
            lg lgVarOooO00o = lg.OooO00o(viewOooO00o);
            i = R.id.ll_bottom_purcharse;
            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_bottom_purcharse);
            if (linearLayout != null) {
                i = R.id.ll_center;
                if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_center)) != null) {
                    i = R.id.ly_recharge;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.ly_recharge);
                    if (textView != null) {
                        i = R.id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
                        if (recyclerView != null) {
                            i = R.id.rl_header;
                            if (((RelativeLayout) o00Oo0.OooO00o(viewInflate, R.id.rl_header)) != null) {
                                i = R.id.tv_coins;
                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_coins);
                                if (textView2 != null) {
                                    i = R.id.tv_valid;
                                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_valid);
                                    if (textView3 != null) {
                                        return new se((LinearLayout) viewInflate, lgVarOooO00o, linearLayout, textView, recyclerView, textView2, textView3);
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
