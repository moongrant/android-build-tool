package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.HeaderLayout;
import o00O00o0.OooO00o;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final HeaderLayout f44251OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final HeaderLayout f44252OooO0O0;

    public o00O(@NonNull HeaderLayout headerLayout, @NonNull HeaderLayout headerLayout2) {
        this.f44251OooO00o = headerLayout;
        this.f44252OooO0O0 = headerLayout2;
    }

    @NonNull
    public static o00O OooO00o(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HeaderLayout headerLayout = (HeaderLayout) view;
        return new o00O(headerLayout, headerLayout);
    }

    @NonNull
    public static o00O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44251OooO00o;
    }

    @NonNull
    public static o00O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.base_header_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
