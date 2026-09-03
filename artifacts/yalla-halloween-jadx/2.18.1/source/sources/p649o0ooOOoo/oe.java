package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oe implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50187OooO00o;

    public oe(@NonNull FrameLayout frameLayout) {
        this.f50187OooO00o = frameLayout;
    }

    @NonNull
    public static oe inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50187OooO00o;
    }

    @NonNull
    public static oe inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_lucky_packet_hisatory_list_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvTotally)) != null) {
            return new oe((FrameLayout) viewInflate);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvTotally)));
    }
}
