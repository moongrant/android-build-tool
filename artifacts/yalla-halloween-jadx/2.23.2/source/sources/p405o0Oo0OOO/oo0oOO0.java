package p405o0Oo0OOO;

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
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oOO0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45274OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45275OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f45276OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45277OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f45278OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f45279OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f45280OooO0oO;

    public oo0oOO0(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f45274OooO00o = constraintLayout;
        this.f45275OooO0O0 = netImageView;
        this.f45276OooO0OO = imageView;
        this.f45277OooO0Oo = linearLayout;
        this.f45279OooO0o0 = recyclerView;
        this.f45278OooO0o = sVGAView;
        this.f45280OooO0oO = textView;
    }

    @NonNull
    public static oo0oOO0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45274OooO00o;
    }

    @NonNull
    public static oo0oOO0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.activity_user_header_frame, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivBg;
        if (((NetImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.ivHeader;
            NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = o0OO00O.ivLock;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.layoutBelow;
                    LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (linearLayout != null) {
                        i = o0OO00O.layoutTop;
                        if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                            if (recyclerView != null) {
                                i = o0OO00O.svgaHeaderFrame;
                                SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                if (sVGAView != null) {
                                    i = o0OO00O.tvLockState;
                                    if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                        i = o0OO00O.tvMedalOfHonor;
                                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView != null) {
                                            return new oo0oOO0((ConstraintLayout) viewInflate, netImageView, imageView, linearLayout, recyclerView, sVGAView, textView);
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
