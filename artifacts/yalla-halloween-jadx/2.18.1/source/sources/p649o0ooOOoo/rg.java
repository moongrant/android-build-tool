package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class rg implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50485OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50486OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50487OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50488OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final UserTagView f50489OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50490OooO0o0;

    public rg(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull UserTagView userTagView) {
        this.f50485OooO00o = constraintLayout;
        this.f50486OooO0O0 = netImageView;
        this.f50487OooO0OO = imageView;
        this.f50488OooO0Oo = imageView2;
        this.f50490OooO0o0 = textView;
        this.f50489OooO0o = userTagView;
    }

    @NonNull
    public static rg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50485OooO00o;
    }

    @NonNull
    public static rg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_item_member_remove, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.head;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.head);
        if (netImageView != null) {
            i = R.id.officials;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.officials);
            if (imageView != null) {
                i = R.id.select;
                ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.select);
                if (imageView2 != null) {
                    i = R.id.time;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.time);
                    if (textView != null) {
                        i = R.id.userTagView;
                        UserTagView userTagView = (UserTagView) o00Oo0.OooO00o(viewInflate, R.id.userTagView);
                        if (userTagView != null) {
                            return new rg((ConstraintLayout) viewInflate, netImageView, imageView, imageView2, textView, userTagView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
