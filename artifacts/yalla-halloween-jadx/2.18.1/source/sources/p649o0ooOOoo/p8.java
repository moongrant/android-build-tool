package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.platform.ComposeView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class p8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50235OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f50236OooO0O0;

    public p8(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ComposeView composeView) {
        this.f50235OooO00o = linearLayoutCompat;
        this.f50236OooO0O0 = composeView;
    }

    @NonNull
    public static p8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50235OooO00o;
    }

    @NonNull
    public static p8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.event_fragment_square, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ComposeView composeView = (ComposeView) o00Oo0.OooO00o(viewInflate, R.id.cv);
        if (composeView != null) {
            return new p8((LinearLayoutCompat) viewInflate, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.cv)));
    }
}
