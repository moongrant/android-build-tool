package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.room.RoomBroadcastViewAll;
import com.yalla.yalla.ui.view.room.RoomBroadcastViewVip6;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class f9 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57937OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RoomBroadcastViewAll f57938OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RoomBroadcastViewVip6 f57939OooO0OO;

    public f9(@NonNull LinearLayout linearLayout, @NonNull RoomBroadcastViewAll roomBroadcastViewAll, @NonNull RoomBroadcastViewVip6 roomBroadcastViewVip6) {
        this.f57937OooO00o = linearLayout;
        this.f57938OooO0O0 = roomBroadcastViewAll;
        this.f57939OooO0OO = roomBroadcastViewVip6;
    }

    @NonNull
    public static f9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57937OooO00o;
    }

    @NonNull
    public static f9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_item_broadcast, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.layoutAll;
        RoomBroadcastViewAll roomBroadcastViewAll = (RoomBroadcastViewAll) OooOO0.OooO00o(i, viewInflate);
        if (roomBroadcastViewAll != null) {
            i = oO00O0oO.layoutVip6;
            RoomBroadcastViewVip6 roomBroadcastViewVip6 = (RoomBroadcastViewVip6) OooOO0.OooO00o(i, viewInflate);
            if (roomBroadcastViewVip6 != null) {
                return new f9((LinearLayout) viewInflate, roomBroadcastViewAll, roomBroadcastViewVip6);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
