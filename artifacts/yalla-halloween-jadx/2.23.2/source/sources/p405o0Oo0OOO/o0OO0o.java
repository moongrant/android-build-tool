package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.recyclerview.NoScrollRecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44598OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f44599OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NoScrollRecyclerView f44600OooO0OO;

    public o0OO0o(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull NoScrollRecyclerView noScrollRecyclerView) {
        this.f44598OooO00o = linearLayout;
        this.f44599OooO0O0 = textView;
        this.f44600OooO0OO = noScrollRecyclerView;
    }

    @NonNull
    public static o0OO0o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44598OooO00o;
    }

    @NonNull
    public static o0OO0o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.layout_moment_task_poll, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ballots;
        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = o0OO00O.recyclerView;
            NoScrollRecyclerView noScrollRecyclerView = (NoScrollRecyclerView) OooO0O0.OooO00o(i, viewInflate);
            if (noScrollRecyclerView != null) {
                return new o0OO0o((LinearLayout) viewInflate, textView, noScrollRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
