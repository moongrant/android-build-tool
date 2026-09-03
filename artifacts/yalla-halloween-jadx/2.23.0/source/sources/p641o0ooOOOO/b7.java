package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.ui.view.crop.SubsamplingScaleImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class b7 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57588OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57589OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SubsamplingScaleImageView f57590OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateButton f57591OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final StateButton f57592OooO0o0;

    public b7(@NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull SubsamplingScaleImageView subsamplingScaleImageView, @NonNull StateButton stateButton, @NonNull StateButton stateButton2) {
        this.f57588OooO00o = frameLayout;
        this.f57589OooO0O0 = constraintLayout;
        this.f57590OooO0OO = subsamplingScaleImageView;
        this.f57591OooO0Oo = stateButton;
        this.f57592OooO0o0 = stateButton2;
    }

    @NonNull
    public static b7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57588OooO00o;
    }

    @NonNull
    public static b7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_activity_customize_theme_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.clContent;
        ConstraintLayout constraintLayout = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
        if (constraintLayout != null) {
            i = oO00O0oO.clCustomizePreviewTop;
            if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.ivCustomizePreviewBg;
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) OooOO0.OooO00o(i, viewInflate);
                if (subsamplingScaleImageView != null) {
                    i = oO00O0oO.ivCustomizePreviewImage;
                    if (((NetImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.ivCustomizeThemeAnnouncement;
                        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                            i = oO00O0oO.ivCustomizeThemeClose;
                            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                i = oO00O0oO.ivCustomizeThemeShare;
                                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                    i = oO00O0oO.llCustomizePreviewBottom;
                                    if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                                        i = oO00O0oO.stCancel;
                                        StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
                                        if (stateButton != null) {
                                            i = oO00O0oO.stUpload;
                                            StateButton stateButton2 = (StateButton) OooOO0.OooO00o(i, viewInflate);
                                            if (stateButton2 != null) {
                                                i = oO00O0oO.svCustomizePreview;
                                                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                    i = oO00O0oO.tvCustomizePreviewName;
                                                    if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                        return new b7((FrameLayout) viewInflate, constraintLayout, subsamplingScaleImageView, stateButton, stateButton2);
                                                    }
                                                }
                                            }
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
