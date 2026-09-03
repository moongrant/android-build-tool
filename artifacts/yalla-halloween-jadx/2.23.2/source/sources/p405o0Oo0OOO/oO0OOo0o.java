package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOo0o implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44922OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44923OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44924OooO0OO;

    public oO0OOo0o(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f44922OooO00o = constraintLayout;
        this.f44923OooO0O0 = recyclerView;
        this.f44924OooO0OO = textView;
    }

    @NonNull
    public static oO0OOo0o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44922OooO00o;
    }

    @NonNull
    public static oO0OOo0o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_clock_dialog_task, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.moraTask_bg;
        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.rvTask;
            RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
            if (recyclerView != null) {
                i = o0OO00O.tvMoraTask;
                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView != null) {
                    return new oO0OOo0o((ConstraintLayout) viewInflate, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
