package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0Oo0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44894OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44895OooO0O0;

    public oO0O0Oo0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f44894OooO00o = linearLayout;
        this.f44895OooO0O0 = linearLayout2;
    }

    @NonNull
    public static oO0O0Oo0 OooO00o(@NonNull View view) {
        int i = o0OO00O.btInRoom;
        if (((Button) OooO0O0.OooO00o(i, view)) != null) {
            i = o0OO00O.ivInRoomClose;
            if (((ImageView) OooO0O0.OooO00o(i, view)) != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new oO0O0Oo0(linearLayout, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static oO0O0Oo0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44894OooO00o;
    }

    @NonNull
    public static oO0O0Oo0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_layout_chat_in_room_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
