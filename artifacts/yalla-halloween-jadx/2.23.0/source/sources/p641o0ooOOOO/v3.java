package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.ScrollableViews;
import com.yalla.yalla.ui.view.SwitchView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class v3 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59038OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f59039OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f59040OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f59041OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SwitchView f59042OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f59043OooO0o0;

    public v3(@NonNull ConstraintLayout constraintLayout, @NonNull ScrollableViews scrollableViews, @NonNull ScrollableViews scrollableViews2, @NonNull ScrollableViews scrollableViews3, @NonNull ScrollableViews scrollableViews4, @NonNull SwitchView switchView) {
        this.f59038OooO00o = constraintLayout;
        this.f59039OooO0O0 = scrollableViews;
        this.f59040OooO0OO = scrollableViews2;
        this.f59041OooO0Oo = scrollableViews3;
        this.f59043OooO0o0 = scrollableViews4;
        this.f59042OooO0o = switchView;
    }

    @NonNull
    public static v3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59038OooO00o;
    }

    @NonNull
    public static v3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_activity_test, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.scrollNumberViewsH;
        ScrollableViews scrollableViews = (ScrollableViews) OooOO0.OooO00o(i, viewInflate);
        if (scrollableViews != null) {
            i = oO00O0oO.scrollNumberViewsM;
            ScrollableViews scrollableViews2 = (ScrollableViews) OooOO0.OooO00o(i, viewInflate);
            if (scrollableViews2 != null) {
                i = oO00O0oO.scrollNumberViewsX;
                ScrollableViews scrollableViews3 = (ScrollableViews) OooOO0.OooO00o(i, viewInflate);
                if (scrollableViews3 != null) {
                    i = oO00O0oO.scrollNumberViewsXX;
                    ScrollableViews scrollableViews4 = (ScrollableViews) OooOO0.OooO00o(i, viewInflate);
                    if (scrollableViews4 != null) {
                        i = oO00O0oO.switchView;
                        SwitchView switchView = (SwitchView) OooOO0.OooO00o(i, viewInflate);
                        if (switchView != null) {
                            return new v3((ConstraintLayout) viewInflate, scrollableViews, scrollableViews2, scrollableViews3, scrollableViews4, switchView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
