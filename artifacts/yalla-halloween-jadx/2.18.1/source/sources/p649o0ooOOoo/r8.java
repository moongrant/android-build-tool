package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import com.weieyu.yalla.R;
import java.util.Objects;
import p104o000oo0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class r8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ComposeView f50429OooO00o;

    public r8(@NonNull ComposeView composeView) {
        this.f50429OooO00o = composeView;
    }

    @NonNull
    public static r8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50429OooO00o;
    }

    @NonNull
    public static r8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.face_panel_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        Objects.requireNonNull(viewInflate, "rootView");
        return new r8((ComposeView) viewInflate);
    }
}
