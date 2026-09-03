package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class cg implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49107OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f49108OooO0O0;

    public cg(@NonNull FrameLayout frameLayout, @NonNull ComposeView composeView) {
        this.f49107OooO00o = frameLayout;
        this.f49108OooO0O0 = composeView;
    }

    @NonNull
    public static cg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49107OooO00o;
    }

    @NonNull
    public static cg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_fragment_room_event_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ComposeView composeView = (ComposeView) o00Oo0.OooO00o(viewInflate, R.id.composeView);
        if (composeView != null) {
            return new cg((FrameLayout) viewInflate, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.composeView)));
    }
}
