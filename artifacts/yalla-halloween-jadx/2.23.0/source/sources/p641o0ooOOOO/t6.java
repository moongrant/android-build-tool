package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.SearchView;
import p081o000OoOO.OooO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class t6 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final SearchView f58868OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SearchView f58869OooO0O0;

    public t6(@NonNull SearchView searchView, @NonNull SearchView searchView2) {
        this.f58868OooO00o = searchView;
        this.f58869OooO0O0 = searchView2;
    }

    @NonNull
    public static t6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58868OooO00o;
    }

    @NonNull
    public static t6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_header_topic_black_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        SearchView searchView = (SearchView) viewInflate;
        return new t6(searchView, searchView);
    }
}
