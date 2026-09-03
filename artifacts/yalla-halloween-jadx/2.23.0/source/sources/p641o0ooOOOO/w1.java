package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f59117OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f59118OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59119OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f59120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f59121OooO0o0;

    public w1(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull NetImageView netImageView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f59117OooO00o = linearLayoutCompat;
        this.f59118OooO0O0 = netImageView;
        this.f59119OooO0OO = constraintLayout;
        this.f59120OooO0Oo = textView;
        this.f59121OooO0o0 = textView2;
    }

    @NonNull
    public static w1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59117OooO00o;
    }

    @NonNull
    public static w1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_share_ins, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.iv_app;
        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.iv_image;
            NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = oO00O0oO.iv_logo;
                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.layout_bg;
                    ConstraintLayout constraintLayout = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
                    if (constraintLayout != null) {
                        i = oO00O0oO.tv_content;
                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            i = oO00O0oO.tv_send;
                            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView2 != null) {
                                return new w1((LinearLayoutCompat) viewInflate, netImageView, constraintLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
