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
public final class md implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50023OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50024OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50025OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50026OooO0Oo;

    public md(@NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f50023OooO00o = linearLayout;
        this.f50024OooO0O0 = netImageView;
        this.f50025OooO0OO = textView;
        this.f50026OooO0Oo = textView2;
    }

    @NonNull
    public static md inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50023OooO00o;
    }

    @NonNull
    public static md inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_detail_share_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivShareItem;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivShareItem);
        if (netImageView != null) {
            i = R.id.tvShareContentItem;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvShareContentItem);
            if (textView != null) {
                i = R.id.tvShareTitleItem;
                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvShareTitleItem);
                if (textView2 != null) {
                    return new md((LinearLayout) viewInflate, netImageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
