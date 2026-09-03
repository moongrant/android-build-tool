package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58700OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f58701OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58702OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58703OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f58704OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58705OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f58706OooO0oO;

    public r0(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull SVGAView sVGAView, @NonNull TextView textView) {
        this.f58700OooO00o = constraintLayout;
        this.f58701OooO0O0 = netImageView;
        this.f58702OooO0OO = imageView;
        this.f58703OooO0Oo = linearLayout;
        this.f58705OooO0o0 = recyclerView;
        this.f58704OooO0o = sVGAView;
        this.f58706OooO0oO = textView;
    }

    @NonNull
    public static r0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58700OooO00o;
    }

    @NonNull
    public static r0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.activity_user_header_frame, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivBg;
        if (((NetImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.ivHeader;
            NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = oO00O0oO.ivLock;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.layoutBelow;
                    LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                    if (linearLayout != null) {
                        i = oO00O0oO.layoutTop;
                        if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                            i = oO00O0oO.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                            if (recyclerView != null) {
                                i = oO00O0oO.svgaHeaderFrame;
                                SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                if (sVGAView != null) {
                                    i = oO00O0oO.tvLockState;
                                    if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                        i = oO00O0oO.tvMedalOfHonor;
                                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView != null) {
                                            return new r0((ConstraintLayout) viewInflate, netImageView, imageView, linearLayout, recyclerView, sVGAView, textView);
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
