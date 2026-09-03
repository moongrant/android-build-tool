package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ld implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49962OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f49963OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f49964OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49965OooO0Oo;

    public ld(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull NetImageView netImageView, @NonNull TextView textView2) {
        this.f49962OooO00o = constraintLayout;
        this.f49963OooO0O0 = textView;
        this.f49964OooO0OO = netImageView;
        this.f49965OooO0Oo = textView2;
    }

    @NonNull
    public static ld inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49962OooO00o;
    }

    @NonNull
    public static ld inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_detail_share, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.contentShare;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.contentShare);
        if (textView != null) {
            i = R.id.imageShare;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.imageShare);
            if (netImageView != null) {
                i = R.id.titleShare;
                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.titleShare);
                if (textView2 != null) {
                    return new ld((ConstraintLayout) viewInflate, textView, netImageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
