package p649o0ooOOoo;

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
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.common.ui.view.crop.SubsamplingScaleImageView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class je implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49763OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49764OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SubsamplingScaleImageView f49765OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateButton f49766OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final StateButton f49767OooO0o0;

    public je(@NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull SubsamplingScaleImageView subsamplingScaleImageView, @NonNull StateButton stateButton, @NonNull StateButton stateButton2) {
        this.f49763OooO00o = frameLayout;
        this.f49764OooO0O0 = constraintLayout;
        this.f49765OooO0OO = subsamplingScaleImageView;
        this.f49766OooO0Oo = stateButton;
        this.f49767OooO0o0 = stateButton2;
    }

    @NonNull
    public static je inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49763OooO00o;
    }

    @NonNull
    public static je inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_customize_theme_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.clContent;
        ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.clContent);
        if (constraintLayout != null) {
            i = R.id.clCustomizePreviewTop;
            if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.clCustomizePreviewTop)) != null) {
                i = R.id.ivCustomizePreviewBg;
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCustomizePreviewBg);
                if (subsamplingScaleImageView != null) {
                    i = R.id.ivCustomizePreviewImage;
                    if (((NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCustomizePreviewImage)) != null) {
                        i = R.id.ivCustomizeThemeAnnouncement;
                        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCustomizeThemeAnnouncement)) != null) {
                            i = R.id.ivCustomizeThemeClose;
                            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCustomizeThemeClose)) != null) {
                                i = R.id.ivCustomizeThemeShare;
                                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCustomizeThemeShare)) != null) {
                                    i = R.id.llCustomizePreviewBottom;
                                    if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llCustomizePreviewBottom)) != null) {
                                        i = R.id.stCancel;
                                        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.stCancel);
                                        if (stateButton != null) {
                                            i = R.id.stUpload;
                                            StateButton stateButton2 = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.stUpload);
                                            if (stateButton2 != null) {
                                                i = R.id.svCustomizePreview;
                                                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.svCustomizePreview)) != null) {
                                                    i = R.id.tvCustomizePreviewName;
                                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvCustomizePreviewName)) != null) {
                                                        return new je((FrameLayout) viewInflate, constraintLayout, subsamplingScaleImageView, stateButton, stateButton2);
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
