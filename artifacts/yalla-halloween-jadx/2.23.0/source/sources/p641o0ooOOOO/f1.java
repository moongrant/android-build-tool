package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.UserTagView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57890OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserTagView f57891OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57892OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f57893OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f57894OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f57895OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f57896OooO0oO;

    public f1(@NonNull RelativeLayout relativeLayout, @NonNull UserTagView userTagView, @NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f57890OooO00o = relativeLayout;
        this.f57891OooO0O0 = userTagView;
        this.f57892OooO0OO = linearLayout;
        this.f57893OooO0Oo = netImageView;
        this.f57895OooO0o0 = textView;
        this.f57894OooO0o = textView2;
        this.f57896OooO0oO = textView3;
    }

    @NonNull
    public static f1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57890OooO00o;
    }

    @NonNull
    public static f1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.contribution_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.headUserTagView;
        UserTagView userTagView = (UserTagView) OooOO0.OooO00o(i, viewInflate);
        if (userTagView != null) {
            i = oO00O0oO.ll_header;
            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
            if (linearLayout != null) {
                i = oO00O0oO.sdv_header;
                NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    i = oO00O0oO.tv_coin;
                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = oO00O0oO.tv_contribution_time;
                        TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView2 != null) {
                            i = oO00O0oO.tv_trophy;
                            TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView3 != null) {
                                return new f1((RelativeLayout) viewInflate, userTagView, linearLayout, netImageView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
