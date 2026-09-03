package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ka implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49849OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f49850OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49851OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49852OooO0Oo;

    public ka(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull FrameLayout frameLayout2) {
        this.f49849OooO00o = frameLayout;
        this.f49850OooO0O0 = textView;
        this.f49851OooO0OO = textView2;
        this.f49852OooO0Oo = frameLayout2;
    }

    @NonNull
    public static ka OooO00o(@NonNull View view) {
        int i = R.id.tvTermsServiceAccept;
        TextView textView = (TextView) o00Oo0.OooO00o(view, R.id.tvTermsServiceAccept);
        if (textView != null) {
            i = R.id.tvTermsServiceTip;
            TextView textView2 = (TextView) o00Oo0.OooO00o(view, R.id.tvTermsServiceTip);
            if (textView2 != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new ka(frameLayout, textView, textView2, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ka inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49849OooO00o;
    }

    @NonNull
    public static ka inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_activity_main_terms_service, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
