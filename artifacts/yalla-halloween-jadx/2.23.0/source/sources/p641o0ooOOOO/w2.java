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
public final class w2 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59122OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f59123OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f59124OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f59125OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f59126OooO0o0;

    public w2(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayoutCompat linearLayoutCompat) {
        this.f59122OooO00o = constraintLayout;
        this.f59123OooO0O0 = textView;
        this.f59124OooO0OO = textView2;
        this.f59125OooO0Oo = textView3;
        this.f59126OooO0o0 = linearLayoutCompat;
    }

    @NonNull
    public static w2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59122OooO00o;
    }

    @NonNull
    public static w2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.item_moment_detail_like_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.count;
        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = oO00O0oO.end;
            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView2 != null) {
                i = oO00O0oO.start;
                TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView3 != null) {
                    i = oO00O0oO.switchLayout;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                    if (linearLayoutCompat != null) {
                        return new w2((ConstraintLayout) viewInflate, textView, textView2, textView3, linearLayoutCompat);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
