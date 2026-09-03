package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45244OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final q0 f45245OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45246OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f45247OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f45248OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f45249OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f45250OooO0oO;

    public oo00(@NonNull LinearLayout linearLayout, @NonNull q0 q0Var, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f45244OooO00o = linearLayout;
        this.f45245OooO0O0 = q0Var;
        this.f45246OooO0OO = linearLayout2;
        this.f45247OooO0Oo = textView;
        this.f45249OooO0o0 = recyclerView;
        this.f45248OooO0o = textView2;
        this.f45250OooO0oO = textView3;
    }

    @NonNull
    public static oo00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45244OooO00o;
    }

    @NonNull
    public static oo00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_activity_store_lockroom, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.in_create_layout;
        View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            q0 q0VarOooO00o = q0.OooO00o(viewOooO00o);
            i = o0OO00O.ll_bottom_purcharse;
            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
            if (linearLayout != null) {
                i = o0OO00O.ll_center;
                if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.ly_recharge;
                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = o0OO00O.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                        if (recyclerView != null) {
                            i = o0OO00O.rl_header;
                            if (((RelativeLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                i = o0OO00O.tv_coins;
                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView2 != null) {
                                    i = o0OO00O.tv_valid;
                                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView3 != null) {
                                        return new oo00((LinearLayout) viewInflate, q0VarOooO00o, linearLayout, textView, recyclerView, textView2, textView3);
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
