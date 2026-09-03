package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class i7 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58122OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final b9 f58123OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58124OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58125OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58126OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58127OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f58128OooO0oO;

    public i7(@NonNull LinearLayout linearLayout, @NonNull b9 b9Var, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f58122OooO00o = linearLayout;
        this.f58123OooO0O0 = b9Var;
        this.f58124OooO0OO = linearLayout2;
        this.f58125OooO0Oo = textView;
        this.f58127OooO0o0 = recyclerView;
        this.f58126OooO0o = textView2;
        this.f58128OooO0oO = textView3;
    }

    @NonNull
    public static i7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58122OooO00o;
    }

    @NonNull
    public static i7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_activity_store_lockroom, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.in_create_layout;
        View viewOooO00o = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            b9 b9VarOooO00o = b9.OooO00o(viewOooO00o);
            i = oO00O0oO.ll_bottom_purcharse;
            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
            if (linearLayout != null) {
                i = oO00O0oO.ll_center;
                if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.ly_recharge;
                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = oO00O0oO.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                        if (recyclerView != null) {
                            i = oO00O0oO.rl_header;
                            if (((RelativeLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                                i = oO00O0oO.tv_coins;
                                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView2 != null) {
                                    i = oO00O0oO.tv_valid;
                                    TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView3 != null) {
                                        return new i7((LinearLayout) viewInflate, b9VarOooO00o, linearLayout, textView, recyclerView, textView2, textView3);
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
