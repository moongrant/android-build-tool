package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.FixTextView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44340OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixTextView f44341OooO0O0;

    public o00OO000(@NonNull FrameLayout frameLayout, @NonNull FixTextView fixTextView) {
        this.f44340OooO00o = frameLayout;
        this.f44341OooO0O0 = fixTextView;
    }

    @NonNull
    public static o00OO000 OooO00o(@NonNull View view) {
        int i = o0OO00O.content;
        if (((LinearLayout) OooO0O0.OooO00o(i, view)) != null) {
            i = o0OO00O.tvMessage;
            FixTextView fixTextView = (FixTextView) OooO0O0.OooO00o(i, view);
            if (fixTextView != null) {
                return new o00OO000((FrameLayout) view, fixTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static o00OO000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44340OooO00o;
    }

    @NonNull
    public static o00OO000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.chatline_contribution_up, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
