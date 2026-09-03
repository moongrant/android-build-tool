package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.room.RoomBroadcastViewAll;
import com.yalla.yalla.ui.view.room.RoomBroadcastViewVip6;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45570OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RoomBroadcastViewAll f45571OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RoomBroadcastViewVip6 f45572OooO0OO;

    public u0(@NonNull LinearLayout linearLayout, @NonNull RoomBroadcastViewAll roomBroadcastViewAll, @NonNull RoomBroadcastViewVip6 roomBroadcastViewVip6) {
        this.f45570OooO00o = linearLayout;
        this.f45571OooO0O0 = roomBroadcastViewAll;
        this.f45572OooO0OO = roomBroadcastViewVip6;
    }

    @NonNull
    public static u0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45570OooO00o;
    }

    @NonNull
    public static u0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_item_broadcast, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.layoutAll;
        RoomBroadcastViewAll roomBroadcastViewAll = (RoomBroadcastViewAll) OooO0O0.OooO00o(i, viewInflate);
        if (roomBroadcastViewAll != null) {
            i = o0OO00O.layoutVip6;
            RoomBroadcastViewVip6 roomBroadcastViewVip6 = (RoomBroadcastViewVip6) OooO0O0.OooO00o(i, viewInflate);
            if (roomBroadcastViewVip6 != null) {
                return new u0((LinearLayout) viewInflate, roomBroadcastViewAll, roomBroadcastViewVip6);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
