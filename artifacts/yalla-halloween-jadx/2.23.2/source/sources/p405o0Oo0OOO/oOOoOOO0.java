package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.flexbox.FlexboxLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOoOOO0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45189OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f45190OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f45191OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FlexboxLayout f45192OooO0Oo;

    public oOOoOOO0(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull FlexboxLayout flexboxLayout) {
        this.f45189OooO00o = frameLayout;
        this.f45190OooO0O0 = view;
        this.f45191OooO0OO = imageView;
        this.f45192OooO0Oo = flexboxLayout;
    }

    @NonNull
    public static oOOoOOO0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45189OooO00o;
    }

    @NonNull
    public static oOOoOOO0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_search_adapter_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bottomView;
        View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            i = o0OO00O.deleteSearchHistory;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0OO00O.historySearchLayout;
                FlexboxLayout flexboxLayout = (FlexboxLayout) OooO0O0.OooO00o(i, viewInflate);
                if (flexboxLayout != null) {
                    i = o0OO00O.tvSearch;
                    if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        return new oOOoOOO0((FrameLayout) viewInflate, viewOooO00o, imageView, flexboxLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
