package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44757OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f44758OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44759OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44760OooO0Oo;

    public oO000O0(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull FrameLayout frameLayout2) {
        this.f44757OooO00o = frameLayout;
        this.f44758OooO0O0 = textView;
        this.f44759OooO0OO = textView2;
        this.f44760OooO0Oo = frameLayout2;
    }

    @NonNull
    public static oO000O0 OooO00o(@NonNull View view) {
        int i = o0OO00O.tvTermsServiceAccept;
        TextView textView = (TextView) OooO0O0.OooO00o(i, view);
        if (textView != null) {
            i = o0OO00O.tvTermsServiceTip;
            TextView textView2 = (TextView) OooO0O0.OooO00o(i, view);
            if (textView2 != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new oO000O0(frameLayout, textView, textView2, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static oO000O0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44757OooO00o;
    }

    @NonNull
    public static oO000O0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_activity_main_terms_service, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
