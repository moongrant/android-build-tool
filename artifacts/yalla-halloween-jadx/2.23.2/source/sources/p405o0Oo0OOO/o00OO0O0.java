package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.FixTextView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44350OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44351OooO0O0;

    public o00OO0O0(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView) {
        this.f44350OooO00o = frameLayout;
        this.f44351OooO0O0 = imageView;
    }

    @NonNull
    public static o00OO0O0 OooO00o(@NonNull View view) {
        int i = o0OO00O.iv;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, view);
        if (imageView != null) {
            i = o0OO00O.tvMessage;
            if (((FixTextView) OooO0O0.OooO00o(i, view)) != null) {
                return new o00OO0O0((FrameLayout) view, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static o00OO0O0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44350OooO00o;
    }

    @NonNull
    public static o00OO0O0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.chatline_follow_room_tip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
