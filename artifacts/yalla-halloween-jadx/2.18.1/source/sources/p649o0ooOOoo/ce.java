package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ce implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f49103OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f49104OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f49105OooO0OO;

    public ce(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull NetImageView netImageView) {
        this.f49103OooO00o = relativeLayout;
        this.f49104OooO0O0 = textView;
        this.f49105OooO0OO = netImageView;
    }

    @NonNull
    public static ce inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49103OooO00o;
    }

    @NonNull
    public static ce inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_view_image_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.gif;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.gif);
        if (textView != null) {
            i = R.id.image;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.image);
            if (netImageView != null) {
                return new ce((RelativeLayout) viewInflate, textView, netImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
