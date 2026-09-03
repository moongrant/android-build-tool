package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.GiftRunWayItemView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ti implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50672OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final GiftRunWayItemView f50673OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final GiftRunWayItemView f50674OooO0OO;

    public ti(@NonNull LinearLayout linearLayout, @NonNull GiftRunWayItemView giftRunWayItemView, @NonNull GiftRunWayItemView giftRunWayItemView2) {
        this.f50672OooO00o = linearLayout;
        this.f50673OooO0O0 = giftRunWayItemView;
        this.f50674OooO0OO = giftRunWayItemView2;
    }

    @NonNull
    public static ti inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50672OooO00o;
    }

    @NonNull
    public static ti inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_gift_run_way, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.gift_run_way_bottom;
        GiftRunWayItemView giftRunWayItemView = (GiftRunWayItemView) o00Oo0.OooO00o(viewInflate, R.id.gift_run_way_bottom);
        if (giftRunWayItemView != null) {
            i = R.id.gift_run_way_top;
            GiftRunWayItemView giftRunWayItemView2 = (GiftRunWayItemView) o00Oo0.OooO00o(viewInflate, R.id.gift_run_way_top);
            if (giftRunWayItemView2 != null) {
                return new ti((LinearLayout) viewInflate, giftRunWayItemView, giftRunWayItemView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
