package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class d7 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57734OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f57735OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57736OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57737OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f57738OooO0o0;

    public d7(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull NetImageView netImageView2) {
        this.f57734OooO00o = constraintLayout;
        this.f57735OooO0O0 = netImageView;
        this.f57736OooO0OO = appCompatTextView;
        this.f57737OooO0Oo = appCompatTextView2;
        this.f57738OooO0o0 = netImageView2;
    }

    @NonNull
    public static d7 OooO00o(@NonNull View view) {
        int i = oO00O0oO.bg;
        if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = oO00O0oO.head;
            NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, view);
            if (netImageView != null) {
                i = oO00O0oO.name;
                AppCompatTextView appCompatTextView = (AppCompatTextView) OooOO0.OooO00o(i, view);
                if (appCompatTextView != null) {
                    i = oO00O0oO.number;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooOO0.OooO00o(i, view);
                    if (appCompatTextView2 != null) {
                        i = oO00O0oO.pic;
                        NetImageView netImageView2 = (NetImageView) OooOO0.OooO00o(i, view);
                        if (netImageView2 != null) {
                            return new d7(constraintLayout, netImageView, appCompatTextView, appCompatTextView2, netImageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static d7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57734OooO00o;
    }

    @NonNull
    public static d7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_activity_lucky_packet_detail_head, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
