package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.yalla.support.statebutton.StateButton;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44185OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f44186OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f44187OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f44188OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final View f44189OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final s2 f44190OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f44191OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f44192OooO0oo;

    public n1(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton, @NonNull StateButton stateButton2, @NonNull FragmentContainerView fragmentContainerView, @NonNull s2 s2Var, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f44185OooO00o = constraintLayout;
        this.f44186OooO0O0 = stateButton;
        this.f44187OooO0OO = stateButton2;
        this.f44188OooO0Oo = fragmentContainerView;
        this.f44190OooO0o0 = s2Var;
        this.f44189OooO0o = view;
        this.f44191OooO0oO = view2;
        this.f44192OooO0oo = view3;
    }

    @NonNull
    public static n1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44185OooO00o;
    }

    @NonNull
    public static n1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewOooO00o3;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_badge_rank, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btFriendType;
        StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = o0OO00O.btGlobType;
            StateButton stateButton2 = (StateButton) OooO0O0.OooO00o(i, viewInflate);
            if (stateButton2 != null) {
                i = o0OO00O.fgBadgeRank;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) OooO0O0.OooO00o(i, viewInflate);
                if (fragmentContainerView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.headerLayout), viewInflate)) != null) {
                    o00O.OooO00o(viewOooO00o);
                    i = o0OO00O.ilBottom;
                    View viewOooO00o4 = OooO0O0.OooO00o(i, viewInflate);
                    if (viewOooO00o4 != null) {
                        s2 s2VarOooO00o = s2.OooO00o(viewOooO00o4);
                        i = o0OO00O.lineBg;
                        View viewOooO00o5 = OooO0O0.OooO00o(i, viewInflate);
                        if (viewOooO00o5 != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o0OO00O.shape), viewInflate)) != null && (viewOooO00o3 = OooO0O0.OooO00o((i = o0OO00O.vBg), viewInflate)) != null) {
                            return new n1((ConstraintLayout) viewInflate, stateButton, stateButton2, fragmentContainerView, s2VarOooO00o, viewOooO00o5, viewOooO00o2, viewOooO00o3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
