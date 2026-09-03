package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44593OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f44594OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44595OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44596OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f44597OooO0o0;

    public o0OO0O0(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayoutCompat linearLayoutCompat) {
        this.f44593OooO00o = constraintLayout;
        this.f44594OooO0O0 = textView;
        this.f44595OooO0OO = textView2;
        this.f44596OooO0Oo = textView3;
        this.f44597OooO0o0 = linearLayoutCompat;
    }

    @NonNull
    public static o0OO0O0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44593OooO00o;
    }

    @NonNull
    public static o0OO0O0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.item_moment_detail_like_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.count;
        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = o0OO00O.end;
            TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView2 != null) {
                i = o0OO00O.start;
                TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView3 != null) {
                    i = o0OO00O.switchLayout;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                    if (linearLayoutCompat != null) {
                        return new o0OO0O0((ConstraintLayout) viewInflate, textView, textView2, textView3, linearLayoutCompat);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
