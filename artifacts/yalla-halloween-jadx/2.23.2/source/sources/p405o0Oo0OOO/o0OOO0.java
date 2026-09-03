package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.recyclerview.NoScrollRecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44610OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44611OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44612OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NoScrollRecyclerView f44613OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final View f44614OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44615OooO0o0;

    public o0OOO0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull NoScrollRecyclerView noScrollRecyclerView, @NonNull TextView textView, @NonNull View view) {
        this.f44610OooO00o = constraintLayout;
        this.f44611OooO0O0 = imageView;
        this.f44612OooO0OO = linearLayout;
        this.f44613OooO0Oo = noScrollRecyclerView;
        this.f44615OooO0o0 = textView;
        this.f44614OooO0o = view;
    }

    @NonNull
    public static o0OOO0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44610OooO00o;
    }

    @NonNull
    public static o0OOO0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.layout_send_moment_poll, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.close;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.layoutAdd;
            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
            if (linearLayout != null) {
                i = o0OO00O.pollLength;
                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.recyclerView;
                    NoScrollRecyclerView noScrollRecyclerView = (NoScrollRecyclerView) OooO0O0.OooO00o(i, viewInflate);
                    if (noScrollRecyclerView != null) {
                        i = o0OO00O.timeLong;
                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            i = o0OO00O.title;
                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.titleLine), viewInflate)) != null) {
                                i = o0OO00O.tvAdd;
                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                    return new o0OOO0((ConstraintLayout) viewInflate, imageView, linearLayout, noScrollRecyclerView, textView, viewOooO00o);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
