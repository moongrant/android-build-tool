package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.netimage.NetImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class i9 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58141OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f58142OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58143OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58144OooO0Oo;

    public i9(@NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f58141OooO00o = linearLayout;
        this.f58142OooO0O0 = netImageView;
        this.f58143OooO0OO = textView;
        this.f58144OooO0Oo = textView2;
    }

    @NonNull
    public static i9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58141OooO00o;
    }

    @NonNull
    public static i9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_item_treauser_box_carousel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.nivUserHeader;
        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = oO00O0oO.tvName;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = oO00O0oO.tvTitle;
                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView2 != null) {
                    return new i9((LinearLayout) viewInflate, netImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
