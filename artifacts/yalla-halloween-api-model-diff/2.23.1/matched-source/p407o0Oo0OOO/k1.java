package p407o0Oo0OOO;

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
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f43994OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f43995OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43996OooO0OO;

    public k1(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView) {
        this.f43994OooO00o = frameLayout;
        this.f43995OooO0O0 = imageView;
        this.f43996OooO0OO = recyclerView;
    }

    @NonNull
    public static k1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43994OooO00o;
    }

    @NonNull
    public static k1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o0OO00O.switch_view_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0Oo0oo.bgImage;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0Oo0oo.recyclerView;
            RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
            if (recyclerView != null) {
                return new k1((FrameLayout) viewInflate, imageView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
