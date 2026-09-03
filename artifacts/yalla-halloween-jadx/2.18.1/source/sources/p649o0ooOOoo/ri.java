package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ri implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50507OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50508OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50509OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50510OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50511OooO0o0;

    public ri(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.f50507OooO00o = constraintLayout;
        this.f50508OooO0O0 = netImageView;
        this.f50509OooO0OO = imageView;
        this.f50510OooO0Oo = linearLayout;
        this.f50511OooO0o0 = recyclerView;
    }

    @NonNull
    public static ri inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50507OooO00o;
    }

    @NonNull
    public static ri inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_gift_blind_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivBlindBg;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBlindBg);
        if (netImageView != null) {
            i = R.id.ivBlindView;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBlindView);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.llBlindViewBg;
                LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llBlindViewBg);
                if (linearLayout != null) {
                    i = R.id.rvBlindGiftTipsList;
                    RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvBlindGiftTipsList);
                    if (recyclerView != null) {
                        i = R.id.tvBlindMaySend;
                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvBlindMaySend)) != null) {
                            return new ri(constraintLayout, netImageView, imageView, linearLayout, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
