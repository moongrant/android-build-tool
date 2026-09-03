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
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class d7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49141OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49142OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49143OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49144OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f49145OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49146OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49147OooO0oO;

    public d7(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f49141OooO00o = constraintLayout;
        this.f49142OooO0O0 = netImageView;
        this.f49143OooO0OO = imageView;
        this.f49144OooO0Oo = linearLayout;
        this.f49146OooO0o0 = recyclerView;
        this.f49145OooO0o = sVGAView;
        this.f49147OooO0oO = textView;
    }

    @NonNull
    public static d7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49141OooO00o;
    }

    @NonNull
    public static d7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_user_header_frame, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivBg;
        if (((NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBg)) != null) {
            i = R.id.ivHeader;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHeader);
            if (netImageView != null) {
                i = R.id.ivLock;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLock);
                if (imageView != null) {
                    i = R.id.layoutBelow;
                    LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutBelow);
                    if (linearLayout != null) {
                        i = R.id.layoutTop;
                        if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutTop)) != null) {
                            i = R.id.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
                            if (recyclerView != null) {
                                i = R.id.svgaHeaderFrame;
                                SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaHeaderFrame);
                                if (sVGAView != null) {
                                    i = R.id.tvLockState;
                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvLockState)) != null) {
                                        i = R.id.tvMedalOfHonor;
                                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMedalOfHonor);
                                        if (textView != null) {
                                            return new d7((ConstraintLayout) viewInflate, netImageView, imageView, linearLayout, recyclerView, sVGAView, textView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
