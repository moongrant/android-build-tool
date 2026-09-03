package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.framework.view.recyclerView.NoScrollRecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class s9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50527OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f50528OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NoScrollRecyclerView f50529OooO0OO;

    public s9(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull NoScrollRecyclerView noScrollRecyclerView) {
        this.f50527OooO00o = linearLayout;
        this.f50528OooO0O0 = textView;
        this.f50529OooO0OO = noScrollRecyclerView;
    }

    @NonNull
    public static s9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50527OooO00o;
    }

    @NonNull
    public static s9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_moment_task_poll, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ballots;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.ballots);
        if (textView != null) {
            i = R.id.recyclerView;
            NoScrollRecyclerView noScrollRecyclerView = (NoScrollRecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
            if (noScrollRecyclerView != null) {
                return new s9((LinearLayout) viewInflate, textView, noScrollRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
