package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class h8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f49524OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49525OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49526OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49527OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49528OooO0o0;

    public h8(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull NetImageView netImageView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f49524OooO00o = linearLayoutCompat;
        this.f49525OooO0O0 = netImageView;
        this.f49526OooO0OO = constraintLayout;
        this.f49527OooO0Oo = textView;
        this.f49528OooO0o0 = textView2;
    }

    @NonNull
    public static h8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49524OooO00o;
    }

    @NonNull
    public static h8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_share_ins, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.iv_app;
        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_app)) != null) {
            i = R.id.iv_image;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_image);
            if (netImageView != null) {
                i = R.id.iv_logo;
                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_logo)) != null) {
                    i = R.id.layout_bg;
                    ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_bg);
                    if (constraintLayout != null) {
                        i = R.id.tv_content;
                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_content);
                        if (textView != null) {
                            i = R.id.tv_send;
                            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_send);
                            if (textView2 != null) {
                                return new h8((LinearLayoutCompat) viewInflate, netImageView, constraintLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
