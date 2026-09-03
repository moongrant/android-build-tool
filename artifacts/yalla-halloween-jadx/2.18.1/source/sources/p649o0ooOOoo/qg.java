package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class qg implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50388OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50389OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50390OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50391OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50392OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f50393OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final UserTagView f50394OooO0oO;

    public qg(@NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull UserTagView userTagView) {
        this.f50388OooO00o = linearLayout;
        this.f50389OooO0O0 = netImageView;
        this.f50390OooO0OO = imageView;
        this.f50391OooO0Oo = imageView2;
        this.f50393OooO0o0 = imageView3;
        this.f50392OooO0o = textView;
        this.f50394OooO0oO = userTagView;
    }

    @NonNull
    public static qg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50388OooO00o;
    }

    @NonNull
    public static qg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_item_member_convene, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.head;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.head);
        if (netImageView != null) {
            i = R.id.officials;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.officials);
            if (imageView != null) {
                i = R.id.position;
                ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.position);
                if (imageView2 != null) {
                    i = R.id.select;
                    ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.select);
                    if (imageView3 != null) {
                        i = R.id.time;
                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.time);
                        if (textView != null) {
                            i = R.id.userTagView;
                            UserTagView userTagView = (UserTagView) o00Oo0.OooO00o(viewInflate, R.id.userTagView);
                            if (userTagView != null) {
                                return new qg((LinearLayout) viewInflate, netImageView, imageView, imageView2, imageView3, textView, userTagView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
