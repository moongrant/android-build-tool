package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f43976OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f43977OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43978OooO0OO;

    public j1(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView) {
        this.f43976OooO00o = frameLayout;
        this.f43977OooO0O0 = imageView;
        this.f43978OooO0OO = recyclerView;
    }

    @NonNull
    public static j1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43976OooO00o;
    }

    @NonNull
    public static j1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.switch_view_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bgImage;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.recyclerView;
            RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
            if (recyclerView != null) {
                return new j1((FrameLayout) viewInflate, imageView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
