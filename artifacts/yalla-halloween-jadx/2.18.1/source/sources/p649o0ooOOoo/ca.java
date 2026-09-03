package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ca implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49087OooO00o;

    public ca(@NonNull ConstraintLayout constraintLayout) {
        this.f49087OooO00o = constraintLayout;
    }

    @NonNull
    public static ca inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49087OooO00o;
    }

    @NonNull
    public static ca inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_status_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        if (((SVGAView) o00Oo0.OooO00o(viewInflate, R.id.view_empty_holder_sv_first_loading)) != null) {
            return new ca((ConstraintLayout) viewInflate);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.view_empty_holder_sv_first_loading)));
    }
}
