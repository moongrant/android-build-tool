package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f44366OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserTagView f44367OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44368OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f44369OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44370OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44371OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f44372OooO0oO;

    public o00Oo00(@NonNull RelativeLayout relativeLayout, @NonNull UserTagView userTagView, @NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f44366OooO00o = relativeLayout;
        this.f44367OooO0O0 = userTagView;
        this.f44368OooO0OO = linearLayout;
        this.f44369OooO0Oo = netImageView;
        this.f44371OooO0o0 = textView;
        this.f44370OooO0o = textView2;
        this.f44372OooO0oO = textView3;
    }

    @NonNull
    public static o00Oo00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44366OooO00o;
    }

    @NonNull
    public static o00Oo00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.contribution_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.headUserTagView;
        UserTagView userTagView = (UserTagView) OooO0O0.OooO00o(i, viewInflate);
        if (userTagView != null) {
            i = o0OO00O.ll_header;
            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
            if (linearLayout != null) {
                i = o0OO00O.sdv_header;
                NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    i = o0OO00O.tv_coin;
                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = o0OO00O.tv_contribution_time;
                        TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView2 != null) {
                            i = o0OO00O.tv_trophy;
                            TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView3 != null) {
                                return new o00Oo00((RelativeLayout) viewInflate, userTagView, linearLayout, netImageView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
