package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0OOO implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45171OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45172OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SubsamplingScaleImageView f45173OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateButton f45174OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final StateButton f45175OooO0o0;

    public oOOO0OOO(@NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull SubsamplingScaleImageView subsamplingScaleImageView, @NonNull StateButton stateButton, @NonNull StateButton stateButton2) {
        this.f45171OooO00o = frameLayout;
        this.f45172OooO0O0 = constraintLayout;
        this.f45173OooO0OO = subsamplingScaleImageView;
        this.f45174OooO0Oo = stateButton;
        this.f45175OooO0o0 = stateButton2;
    }

    @NonNull
    public static oOOO0OOO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45171OooO00o;
    }

    @NonNull
    public static oOOO0OOO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_activity_customize_theme_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.clContent;
        ConstraintLayout constraintLayout = (ConstraintLayout) OooO0O0.OooO00o(i, viewInflate);
        if (constraintLayout != null) {
            i = o0OO00O.clCustomizePreviewTop;
            if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.ivCustomizePreviewBg;
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) OooO0O0.OooO00o(i, viewInflate);
                if (subsamplingScaleImageView != null) {
                    i = o0OO00O.ivCustomizePreviewImage;
                    if (((NetImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.ivCustomizeThemeAnnouncement;
                        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.ivCustomizeThemeClose;
                            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                i = o0OO00O.ivCustomizeThemeShare;
                                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                    i = o0OO00O.llCustomizePreviewBottom;
                                    if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                        i = o0OO00O.stCancel;
                                        StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
                                        if (stateButton != null) {
                                            i = o0OO00O.stUpload;
                                            StateButton stateButton2 = (StateButton) OooO0O0.OooO00o(i, viewInflate);
                                            if (stateButton2 != null) {
                                                i = o0OO00O.svCustomizePreview;
                                                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                    i = o0OO00O.tvCustomizePreviewName;
                                                    if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                        return new oOOO0OOO((FrameLayout) viewInflate, constraintLayout, subsamplingScaleImageView, stateButton, stateButton2);
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
