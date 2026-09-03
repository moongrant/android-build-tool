package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class lb implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49949OooO00o;

    public lb(@NonNull FrameLayout frameLayout) {
        this.f49949OooO00o = frameLayout;
    }

    @NonNull
    public static lb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49949OooO00o;
    }

    @NonNull
    public static lb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_search_adapter_hot, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_tip)) != null) {
            return new lb((FrameLayout) viewInflate);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tv_tip)));
    }
}
