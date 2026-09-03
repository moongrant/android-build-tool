package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class u2 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58930OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f58931OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58932OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58933OooO0Oo;

    public u2(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f58930OooO00o = constraintLayout;
        this.f58931OooO0O0 = textView;
        this.f58932OooO0OO = textView2;
        this.f58933OooO0Oo = textView3;
    }

    @NonNull
    public static u2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58930OooO00o;
    }

    @NonNull
    public static u2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.item_moment_detail_comment_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.count;
        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = oO00O0oO.latest;
            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView2 != null) {
                i = oO00O0oO.popular;
                TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView3 != null) {
                    i = oO00O0oO.switchLayout;
                    if (((LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate)) != null) {
                        return new u2((ConstraintLayout) viewInflate, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
