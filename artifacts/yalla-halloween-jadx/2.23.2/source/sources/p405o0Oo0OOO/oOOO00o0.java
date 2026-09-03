package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00o0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45156OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f45157OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f45158OooO0OO;

    public oOOO00o0(@NonNull FrameLayout frameLayout, @NonNull ComposeView composeView, @NonNull View view) {
        this.f45156OooO00o = frameLayout;
        this.f45157OooO0O0 = composeView;
        this.f45158OooO0OO = view;
    }

    @NonNull
    public static oOOO00o0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45156OooO00o;
    }

    @NonNull
    public static oOOO00o0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_view_layout_moment_message_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = o0OO00O.composeView;
        ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
        if (composeView == null || (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.viewShade), viewInflate)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
        return new oOOO00o0(frameLayout, composeView, viewOooO00o);
    }
}
