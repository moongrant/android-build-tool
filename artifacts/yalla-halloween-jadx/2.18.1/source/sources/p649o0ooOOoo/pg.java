package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.RoomBroadcastStaticView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class pg implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50326OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RoomBroadcastStaticView f50327OooO0O0;

    public pg(@NonNull LinearLayout linearLayout, @NonNull RoomBroadcastStaticView roomBroadcastStaticView) {
        this.f50326OooO00o = linearLayout;
        this.f50327OooO0O0 = roomBroadcastStaticView;
    }

    @NonNull
    public static pg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50326OooO00o;
    }

    @NonNull
    public static pg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_item_broadcast, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        RoomBroadcastStaticView roomBroadcastStaticView = (RoomBroadcastStaticView) o00Oo0.OooO00o(viewInflate, R.id.layoutStatic);
        if (roomBroadcastStaticView != null) {
            return new pg((LinearLayout) viewInflate, roomBroadcastStaticView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.layoutStatic)));
    }
}
