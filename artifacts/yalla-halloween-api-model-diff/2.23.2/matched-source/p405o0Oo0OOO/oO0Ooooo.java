package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.ScrollableViews;
import com.yalla.yalla.ui.view.SwitchView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Ooooo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44968OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f44969OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f44970OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f44971OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SwitchView f44972OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f44973OooO0o0;

    public oO0Ooooo(@NonNull ConstraintLayout constraintLayout, @NonNull ScrollableViews scrollableViews, @NonNull ScrollableViews scrollableViews2, @NonNull ScrollableViews scrollableViews3, @NonNull ScrollableViews scrollableViews4, @NonNull SwitchView switchView) {
        this.f44968OooO00o = constraintLayout;
        this.f44969OooO0O0 = scrollableViews;
        this.f44970OooO0OO = scrollableViews2;
        this.f44971OooO0Oo = scrollableViews3;
        this.f44973OooO0o0 = scrollableViews4;
        this.f44972OooO0o = switchView;
    }

    @NonNull
    public static oO0Ooooo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44968OooO00o;
    }

    @NonNull
    public static oO0Ooooo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_activity_test, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.scrollNumberViewsH;
        ScrollableViews scrollableViews = (ScrollableViews) OooO0O0.OooO00o(i, viewInflate);
        if (scrollableViews != null) {
            i = o0OO00O.scrollNumberViewsM;
            ScrollableViews scrollableViews2 = (ScrollableViews) OooO0O0.OooO00o(i, viewInflate);
            if (scrollableViews2 != null) {
                i = o0OO00O.scrollNumberViewsX;
                ScrollableViews scrollableViews3 = (ScrollableViews) OooO0O0.OooO00o(i, viewInflate);
                if (scrollableViews3 != null) {
                    i = o0OO00O.scrollNumberViewsXX;
                    ScrollableViews scrollableViews4 = (ScrollableViews) OooO0O0.OooO00o(i, viewInflate);
                    if (scrollableViews4 != null) {
                        i = o0OO00O.switchView;
                        SwitchView switchView = (SwitchView) OooO0O0.OooO00o(i, viewInflate);
                        if (switchView != null) {
                            return new oO0Ooooo((ConstraintLayout) viewInflate, scrollableViews, scrollableViews2, scrollableViews3, scrollableViews4, switchView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
