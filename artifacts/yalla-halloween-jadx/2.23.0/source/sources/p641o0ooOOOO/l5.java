package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.SearchView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class l5 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58333OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SearchView f58334OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58335OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f58336OooO0Oo;

    public l5(@NonNull FrameLayout frameLayout, @NonNull SearchView searchView, @NonNull TextView textView, @NonNull View view) {
        this.f58333OooO00o = frameLayout;
        this.f58334OooO0O0 = searchView;
        this.f58335OooO0OO = textView;
        this.f58336OooO0Oo = view;
    }

    @NonNull
    public static l5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58333OooO00o;
    }

    @NonNull
    public static l5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_header_friend_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.searchView;
        SearchView searchView = (SearchView) OooOO0.OooO00o(i, viewInflate);
        if (searchView != null) {
            i = oO00O0oO.tvFriendNum;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.vLine), viewInflate)) != null) {
                return new l5((FrameLayout) viewInflate, searchView, textView, viewOooO00o);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
