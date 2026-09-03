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
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class s8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50522OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50523OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50524OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50525OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f50526OooO0o0;

    public s8(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull View view) {
        this.f50522OooO00o = constraintLayout;
        this.f50523OooO0O0 = netImageView;
        this.f50524OooO0OO = imageView;
        this.f50525OooO0Oo = textView;
        this.f50526OooO0o0 = view;
    }

    @NonNull
    public static s8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50522OooO00o;
    }

    @NonNull
    public static s8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.footer_room_online, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivHeader;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHeader);
        if (netImageView != null) {
            i = R.id.ivKick;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivKick);
            if (imageView != null) {
                i = R.id.tvName;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvName);
                if (textView != null) {
                    i = R.id.vTop;
                    View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.vTop);
                    if (viewOooO00o != null) {
                        return new s8((ConstraintLayout) viewInflate, netImageView, imageView, textView, viewOooO00o);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
