package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.DotView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class p9 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58608OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final DotView f58609OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58610OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58611OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final a3 f58612OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58613OooO0o0;

    public p9(@NonNull LinearLayout linearLayout, @NonNull DotView dotView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull a3 a3Var) {
        this.f58608OooO00o = linearLayout;
        this.f58609OooO0O0 = dotView;
        this.f58610OooO0OO = textView;
        this.f58611OooO0Oo = imageView;
        this.f58613OooO0o0 = imageView2;
        this.f58612OooO0o = a3Var;
    }

    @NonNull
    public static p9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58608OooO00o;
    }

    @NonNull
    public static p9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_member_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.convenePosition;
        DotView dotView = (DotView) OooOO0.OooO00o(i, viewInflate);
        if (dotView != null) {
            i = oO00O0oO.count;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = oO00O0oO.delete;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.doubt;
                    ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView2 != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.search), viewInflate)) != null) {
                        return new p9((LinearLayout) viewInflate, dotView, textView, imageView, imageView2, a3.OooO00o(viewOooO00o));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
