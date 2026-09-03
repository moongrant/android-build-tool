package p407o0Oo0OOO;

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
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44545OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f44546OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44547OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44548OooO0Oo;

    public o0OO0(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f44545OooO00o = constraintLayout;
        this.f44546OooO0O0 = textView;
        this.f44547OooO0OO = textView2;
        this.f44548OooO0Oo = textView3;
    }

    @NonNull
    public static o0OO0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44545OooO00o;
    }

    @NonNull
    public static o0OO0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o0OO00O.item_moment_detail_comment_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0Oo0oo.count;
        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = o0Oo0oo.latest;
            TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView2 != null) {
                i = o0Oo0oo.popular;
                TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView3 != null) {
                    i = o0Oo0oo.switchLayout;
                    if (((LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        return new o0OO0((ConstraintLayout) viewInflate, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
