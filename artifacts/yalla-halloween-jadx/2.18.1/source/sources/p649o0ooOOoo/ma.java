package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.ScrollableViews;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ma implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50010OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f50011OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f50012OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f50013OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ScrollableViews f50014OooO0o0;

    public ma(@NonNull LinearLayout linearLayout, @NonNull ScrollableViews scrollableViews, @NonNull ScrollableViews scrollableViews2, @NonNull ScrollableViews scrollableViews3, @NonNull ScrollableViews scrollableViews4) {
        this.f50010OooO00o = linearLayout;
        this.f50011OooO0O0 = scrollableViews;
        this.f50012OooO0OO = scrollableViews2;
        this.f50013OooO0Oo = scrollableViews3;
        this.f50014OooO0o0 = scrollableViews4;
    }

    @NonNull
    public static ma inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50010OooO00o;
    }

    @NonNull
    public static ma inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_activity_test, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.scrollNumberViewsH;
        ScrollableViews scrollableViews = (ScrollableViews) o00Oo0.OooO00o(viewInflate, R.id.scrollNumberViewsH);
        if (scrollableViews != null) {
            i = R.id.scrollNumberViewsM;
            ScrollableViews scrollableViews2 = (ScrollableViews) o00Oo0.OooO00o(viewInflate, R.id.scrollNumberViewsM);
            if (scrollableViews2 != null) {
                i = R.id.scrollNumberViewsX;
                ScrollableViews scrollableViews3 = (ScrollableViews) o00Oo0.OooO00o(viewInflate, R.id.scrollNumberViewsX);
                if (scrollableViews3 != null) {
                    i = R.id.scrollNumberViewsXX;
                    ScrollableViews scrollableViews4 = (ScrollableViews) o00Oo0.OooO00o(viewInflate, R.id.scrollNumberViewsXX);
                    if (scrollableViews4 != null) {
                        return new ma((LinearLayout) viewInflate, scrollableViews, scrollableViews2, scrollableViews3, scrollableViews4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
