package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class q7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f50343OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserTagView f50344OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50345OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f50346OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50347OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50348OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f50349OooO0oO;

    public q7(@NonNull RelativeLayout relativeLayout, @NonNull UserTagView userTagView, @NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f50343OooO00o = relativeLayout;
        this.f50344OooO0O0 = userTagView;
        this.f50345OooO0OO = linearLayout;
        this.f50346OooO0Oo = netImageView;
        this.f50348OooO0o0 = textView;
        this.f50347OooO0o = textView2;
        this.f50349OooO0oO = textView3;
    }

    @NonNull
    public static q7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50343OooO00o;
    }

    @NonNull
    public static q7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.contribution_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.headUserTagView;
        UserTagView userTagView = (UserTagView) o00Oo0.OooO00o(viewInflate, R.id.headUserTagView);
        if (userTagView != null) {
            i = R.id.ll_header;
            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_header);
            if (linearLayout != null) {
                i = R.id.sdv_header;
                NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.sdv_header);
                if (netImageView != null) {
                    i = R.id.tv_coin;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_coin);
                    if (textView != null) {
                        i = R.id.tv_contribution_time;
                        TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_contribution_time);
                        if (textView2 != null) {
                            i = R.id.tv_trophy;
                            TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_trophy);
                            if (textView3 != null) {
                                return new q7((RelativeLayout) viewInflate, userTagView, linearLayout, netImageView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
