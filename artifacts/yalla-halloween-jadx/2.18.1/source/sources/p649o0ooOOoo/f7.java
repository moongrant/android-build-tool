package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import java.util.Objects;
import p104o000oo0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class f7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final HeaderLayout f49334OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final HeaderLayout f49335OooO0O0;

    public f7(@NonNull HeaderLayout headerLayout, @NonNull HeaderLayout headerLayout2) {
        this.f49334OooO00o = headerLayout;
        this.f49335OooO0O0 = headerLayout2;
    }

    @NonNull
    public static f7 OooO00o(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        HeaderLayout headerLayout = (HeaderLayout) view;
        return new f7(headerLayout, headerLayout);
    }

    @NonNull
    public static f7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49334OooO00o;
    }

    @NonNull
    public static f7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.base_header_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
