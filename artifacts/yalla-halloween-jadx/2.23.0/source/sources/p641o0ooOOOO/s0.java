package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.HeaderLayout;
import p081o000OoOO.OooO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final HeaderLayout f58772OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final HeaderLayout f58773OooO0O0;

    public s0(@NonNull HeaderLayout headerLayout, @NonNull HeaderLayout headerLayout2) {
        this.f58772OooO00o = headerLayout;
        this.f58773OooO0O0 = headerLayout2;
    }

    @NonNull
    public static s0 OooO00o(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        HeaderLayout headerLayout = (HeaderLayout) view;
        return new s0(headerLayout, headerLayout);
    }

    @NonNull
    public static s0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58772OooO00o;
    }

    @NonNull
    public static s0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.base_header_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
