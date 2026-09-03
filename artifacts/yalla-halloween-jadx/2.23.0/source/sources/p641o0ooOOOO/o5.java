package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o5 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58516OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58517OooO0O0;

    public o5(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f58516OooO00o = linearLayout;
        this.f58517OooO0O0 = linearLayout2;
    }

    @NonNull
    public static o5 OooO00o(@NonNull View view) {
        int i = oO00O0oO.btInRoom;
        if (((Button) OooOO0.OooO00o(i, view)) != null) {
            i = oO00O0oO.ivInRoomClose;
            if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new o5(linearLayout, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static o5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58516OooO00o;
    }

    @NonNull
    public static o5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_layout_chat_in_room_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
