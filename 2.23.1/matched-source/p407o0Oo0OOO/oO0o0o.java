package p407o0Oo0OOO;

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
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0o0o implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45017OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f45018OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f45019OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f45020OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SwitchView f45021OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f45022OooO0o0;

    public oO0o0o(@NonNull ConstraintLayout constraintLayout, @NonNull ScrollableViews scrollableViews, @NonNull ScrollableViews scrollableViews2, @NonNull ScrollableViews scrollableViews3, @NonNull ScrollableViews scrollableViews4, @NonNull SwitchView switchView) {
        this.f45017OooO00o = constraintLayout;
        this.f45018OooO0O0 = scrollableViews;
        this.f45019OooO0OO = scrollableViews2;
        this.f45020OooO0Oo = scrollableViews3;
        this.f45022OooO0o0 = scrollableViews4;
        this.f45021OooO0o = switchView;
    }

    @NonNull
    public static oO0o0o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45017OooO00o;
    }

    @NonNull
    public static oO0o0o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o0OO00O.main_activity_test, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0Oo0oo.scrollNumberViewsH;
        ScrollableViews scrollableViews = (ScrollableViews) OooO0O0.OooO00o(i, viewInflate);
        if (scrollableViews != null) {
            i = o0Oo0oo.scrollNumberViewsM;
            ScrollableViews scrollableViews2 = (ScrollableViews) OooO0O0.OooO00o(i, viewInflate);
            if (scrollableViews2 != null) {
                i = o0Oo0oo.scrollNumberViewsX;
                ScrollableViews scrollableViews3 = (ScrollableViews) OooO0O0.OooO00o(i, viewInflate);
                if (scrollableViews3 != null) {
                    i = o0Oo0oo.scrollNumberViewsXX;
                    ScrollableViews scrollableViews4 = (ScrollableViews) OooO0O0.OooO00o(i, viewInflate);
                    if (scrollableViews4 != null) {
                        i = o0Oo0oo.switchView;
                        SwitchView switchView = (SwitchView) OooO0O0.OooO00o(i, viewInflate);
                        if (switchView != null) {
                            return new oO0o0o((ConstraintLayout) viewInflate, scrollableViews, scrollableViews2, scrollableViews3, scrollableViews4, switchView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
