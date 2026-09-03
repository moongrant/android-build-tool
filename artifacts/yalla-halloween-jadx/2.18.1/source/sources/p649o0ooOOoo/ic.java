package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ic implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49657OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49658OooO0O0;

    public ic(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f49657OooO00o = linearLayout;
        this.f49658OooO0O0 = linearLayout2;
    }

    @NonNull
    public static ic OooO00o(@NonNull View view) {
        int i = R.id.btInRoom;
        if (((Button) o00Oo0.OooO00o(view, R.id.btInRoom)) != null) {
            i = R.id.ivInRoomClose;
            if (((ImageView) o00Oo0.OooO00o(view, R.id.ivInRoomClose)) != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new ic(linearLayout, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ic inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49657OooO00o;
    }

    @NonNull
    public static ic inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_layout_chat_in_room_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
