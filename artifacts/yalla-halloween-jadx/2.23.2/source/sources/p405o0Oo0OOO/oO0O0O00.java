package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.SearchView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0O00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44888OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SearchView f44889OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44890OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f44891OooO0Oo;

    public oO0O0O00(@NonNull FrameLayout frameLayout, @NonNull SearchView searchView, @NonNull TextView textView, @NonNull View view) {
        this.f44888OooO00o = frameLayout;
        this.f44889OooO0O0 = searchView;
        this.f44890OooO0OO = textView;
        this.f44891OooO0Oo = view;
    }

    @NonNull
    public static oO0O0O00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44888OooO00o;
    }

    @NonNull
    public static oO0O0O00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_header_friend_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.searchView;
        SearchView searchView = (SearchView) OooO0O0.OooO00o(i, viewInflate);
        if (searchView != null) {
            i = o0OO00O.tvFriendNum;
            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.vLine), viewInflate)) != null) {
                return new oO0O0O00((FrameLayout) viewInflate, searchView, textView, viewOooO00o);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
