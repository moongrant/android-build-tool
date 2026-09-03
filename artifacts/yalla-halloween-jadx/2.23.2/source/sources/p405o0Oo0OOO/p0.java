package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.SearchView;
import o00O00o0.OooO00o;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final SearchView f45358OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SearchView f45359OooO0O0;

    public p0(@NonNull SearchView searchView, @NonNull SearchView searchView2) {
        this.f45358OooO00o = searchView;
        this.f45359OooO0O0 = searchView2;
    }

    @NonNull
    public static p0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45358OooO00o;
    }

    @NonNull
    public static p0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_header_ban_enter_room, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        SearchView searchView = (SearchView) viewInflate;
        return new p0(searchView, searchView);
    }
}
