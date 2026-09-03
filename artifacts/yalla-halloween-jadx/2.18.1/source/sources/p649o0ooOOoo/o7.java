package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.FixTextView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50146OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixTextView f50147OooO0O0;

    public o7(@NonNull FrameLayout frameLayout, @NonNull FixTextView fixTextView) {
        this.f50146OooO00o = frameLayout;
        this.f50147OooO0O0 = fixTextView;
    }

    @NonNull
    public static o7 OooO00o(@NonNull View view) {
        FixTextView fixTextView = (FixTextView) o00Oo0.OooO00o(view, R.id.tvMessage);
        if (fixTextView != null) {
            return new o7((FrameLayout) view, fixTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvMessage)));
    }

    @NonNull
    public static o7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50146OooO00o;
    }

    @NonNull
    public static o7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.chatline_member_up_level, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
