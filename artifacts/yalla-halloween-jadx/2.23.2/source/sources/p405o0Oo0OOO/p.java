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
import com.yalla.yalla.ui.view.StateLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45350OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f45351OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f45352OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f45353OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final StateLayout f45354OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f45355OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f45356OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f45357OooO0oo;

    public p(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f45350OooO00o = constraintLayout;
        this.f45351OooO0O0 = imageView;
        this.f45352OooO0OO = textView;
        this.f45353OooO0Oo = view;
        this.f45355OooO0o0 = recyclerView;
        this.f45354OooO0o = stateLayout;
        this.f45356OooO0oO = textView2;
        this.f45357OooO0oo = textView3;
    }

    @NonNull
    public static p inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45350OooO00o;
    }

    @NonNull
    public static p inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_dialog_quick_recharge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.close;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.coin;
            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.line), viewInflate)) != null) {
                i = o0OO00O.recyclerView;
                RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = o0OO00O.stateLayout;
                    StateLayout stateLayout = (StateLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (stateLayout != null) {
                        i = o0OO00O.tempText;
                        TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView2 != null) {
                            i = o0OO00O.tvHelp;
                            TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView3 != null) {
                                return new p((ConstraintLayout) viewInflate, imageView, textView, viewOooO00o, recyclerView, stateLayout, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
