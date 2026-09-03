package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.UserTagView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45611OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45612OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f45613OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f45614OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final UserTagView f45615OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f45616OooO0o0;

    public v0(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull UserTagView userTagView) {
        this.f45611OooO00o = constraintLayout;
        this.f45612OooO0O0 = netImageView;
        this.f45613OooO0OO = imageView;
        this.f45614OooO0Oo = imageView2;
        this.f45616OooO0o0 = textView;
        this.f45615OooO0o = userTagView;
    }

    @NonNull
    public static v0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45611OooO00o;
    }

    @NonNull
    public static v0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_item_member_remove, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.head;
        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = o0OO00O.officials;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0OO00O.select;
                ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = o0OO00O.time;
                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = o0OO00O.userTagView;
                        UserTagView userTagView = (UserTagView) OooO0O0.OooO00o(i, viewInflate);
                        if (userTagView != null) {
                            return new v0((ConstraintLayout) viewInflate, netImageView, imageView, imageView2, textView, userTagView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
