package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class tg implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50665OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50666OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50667OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50668OooO0Oo;

    public tg(@NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f50665OooO00o = linearLayout;
        this.f50666OooO0O0 = netImageView;
        this.f50667OooO0OO = textView;
        this.f50668OooO0Oo = textView2;
    }

    @NonNull
    public static tg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50665OooO00o;
    }

    @NonNull
    public static tg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_item_treauser_box_carousel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.nivUserHeader;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.nivUserHeader);
        if (netImageView != null) {
            i = R.id.tvName;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvName);
            if (textView != null) {
                i = R.id.tvTitle;
                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTitle);
                if (textView2 != null) {
                    return new tg((LinearLayout) viewInflate, netImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
