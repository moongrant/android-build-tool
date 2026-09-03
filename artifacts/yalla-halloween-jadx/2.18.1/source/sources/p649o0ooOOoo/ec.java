package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.SearchView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ec implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49240OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SearchView f49241OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49242OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f49243OooO0Oo;

    public ec(@NonNull FrameLayout frameLayout, @NonNull SearchView searchView, @NonNull TextView textView, @NonNull View view) {
        this.f49240OooO00o = frameLayout;
        this.f49241OooO0O0 = searchView;
        this.f49242OooO0OO = textView;
        this.f49243OooO0Oo = view;
    }

    @NonNull
    public static ec inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49240OooO00o;
    }

    @NonNull
    public static ec inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_header_friend_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.searchView;
        SearchView searchView = (SearchView) o00Oo0.OooO00o(viewInflate, R.id.searchView);
        if (searchView != null) {
            i = R.id.tvFriendNum;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvFriendNum);
            if (textView != null) {
                i = R.id.vLine;
                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.vLine);
                if (viewOooO00o != null) {
                    return new ec((FrameLayout) viewInflate, searchView, textView, viewOooO00o);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
