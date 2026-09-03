package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.SearchView;
import com.weieyu.yalla.R;
import java.util.Objects;
import p104o000oo0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class vd implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final SearchView f50809OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SearchView f50810OooO0O0;

    public vd(@NonNull SearchView searchView, @NonNull SearchView searchView2) {
        this.f50809OooO00o = searchView;
        this.f50810OooO0O0 = searchView2;
    }

    @NonNull
    public static vd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50809OooO00o;
    }

    @NonNull
    public static vd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_header_at_friends_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        Objects.requireNonNull(viewInflate, "rootView");
        SearchView searchView = (SearchView) viewInflate;
        return new vd(searchView, searchView);
    }
}
