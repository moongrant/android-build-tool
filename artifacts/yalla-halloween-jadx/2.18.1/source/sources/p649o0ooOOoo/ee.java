package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.app.base.view.EmojiFaceView;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ee implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f49246OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49247OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditTextSpan f49248OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final PanelLayout f49249OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final EmojiFaceView f49250OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f49251OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f49252OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f49253OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f49254OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final View f49255OooOO0;

    public ee(@NonNull LinearLayout linearLayout, @NonNull EditTextSpan editTextSpan, @NonNull PanelLayout panelLayout, @NonNull EmojiFaceView emojiFaceView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f49247OooO00o = linearLayout;
        this.f49248OooO0O0 = editTextSpan;
        this.f49249OooO0OO = panelLayout;
        this.f49250OooO0Oo = emojiFaceView;
        this.f49252OooO0o0 = imageView;
        this.f49251OooO0o = imageView2;
        this.f49253OooO0oO = imageView3;
        this.f49254OooO0oo = view;
        this.f49246OooO = view2;
        this.f49255OooOO0 = view3;
    }

    @NonNull
    public static ee inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49247OooO00o;
    }

    @NonNull
    public static ee inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_view_layout_moment_message_edit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = R.id.editContent;
        EditTextSpan editTextSpan = (EditTextSpan) o00Oo0.OooO00o(viewInflate, R.id.editContent);
        if (editTextSpan != null) {
            i = R.id.faceLayout;
            PanelLayout panelLayout = (PanelLayout) o00Oo0.OooO00o(viewInflate, R.id.faceLayout);
            if (panelLayout != null) {
                i = R.id.faceView;
                EmojiFaceView emojiFaceView = (EmojiFaceView) o00Oo0.OooO00o(viewInflate, R.id.faceView);
                if (emojiFaceView != null) {
                    i = R.id.ivAt;
                    ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivAt);
                    if (imageView != null) {
                        i = R.id.ivEmoji;
                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivEmoji);
                        if (imageView2 != null) {
                            i = R.id.ivSend;
                            ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSend);
                            if (imageView3 != null) {
                                i = R.id.layoutContent;
                                if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutContent)) != null) {
                                    i = R.id.lineBottom;
                                    View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.lineBottom);
                                    if (viewOooO00o != null) {
                                        i = R.id.lineTop;
                                        View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.lineTop);
                                        if (viewOooO00o2 != null) {
                                            i = R.id.viewShade;
                                            View viewOooO00o3 = o00Oo0.OooO00o(viewInflate, R.id.viewShade);
                                            if (viewOooO00o3 != null) {
                                                return new ee(linearLayout, editTextSpan, panelLayout, emojiFaceView, imageView, imageView2, imageView3, viewOooO00o, viewOooO00o2, viewOooO00o3);
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
