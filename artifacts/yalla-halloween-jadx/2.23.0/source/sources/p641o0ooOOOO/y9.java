package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.yalla.support.statebutton.StateButton;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class y9 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59405OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f59406OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f59407OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f59408OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final View f59409OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final db f59410OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f59411OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f59412OooO0oo;

    public y9(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton, @NonNull StateButton stateButton2, @NonNull FragmentContainerView fragmentContainerView, @NonNull db dbVar, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f59405OooO00o = constraintLayout;
        this.f59406OooO0O0 = stateButton;
        this.f59407OooO0OO = stateButton2;
        this.f59408OooO0Oo = fragmentContainerView;
        this.f59410OooO0o0 = dbVar;
        this.f59409OooO0o = view;
        this.f59411OooO0oO = view2;
        this.f59412OooO0oo = view3;
    }

    @NonNull
    public static y9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59405OooO00o;
    }

    @NonNull
    public static y9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewOooO00o3;
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_activity_badge_rank, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.btFriendType;
        StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = oO00O0oO.btGlobType;
            StateButton stateButton2 = (StateButton) OooOO0.OooO00o(i, viewInflate);
            if (stateButton2 != null) {
                i = oO00O0oO.fgBadgeRank;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) OooOO0.OooO00o(i, viewInflate);
                if (fragmentContainerView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.headerLayout), viewInflate)) != null) {
                    s0.OooO00o(viewOooO00o);
                    i = oO00O0oO.ilBottom;
                    View viewOooO00o4 = OooOO0.OooO00o(i, viewInflate);
                    if (viewOooO00o4 != null) {
                        db dbVarOooO00o = db.OooO00o(viewOooO00o4);
                        i = oO00O0oO.lineBg;
                        View viewOooO00o5 = OooOO0.OooO00o(i, viewInflate);
                        if (viewOooO00o5 != null && (viewOooO00o2 = OooOO0.OooO00o((i = oO00O0oO.shape), viewInflate)) != null && (viewOooO00o3 = OooOO0.OooO00o((i = oO00O0oO.vBg), viewInflate)) != null) {
                            return new y9((ConstraintLayout) viewInflate, stateButton, stateButton2, fragmentContainerView, dbVarOooO00o, viewOooO00o5, viewOooO00o2, viewOooO00o3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
