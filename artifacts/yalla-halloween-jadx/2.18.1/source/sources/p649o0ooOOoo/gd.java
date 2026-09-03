package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.framework.view.editTextSpan.EditTextSpan;
import com.app.base.view.EmojiFaceView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class gd implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final SVGAView f49452OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49453OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final PanelLayout f49454OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageButton f49455OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final EditTextSpan f49456OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f49457OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f49458OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f49459OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49460OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final View f49461OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49462OooOO0O;

    public gd(@NonNull LinearLayout linearLayout, @NonNull PanelLayout panelLayout, @NonNull ImageButton imageButton, @NonNull EditTextSpan editTextSpan, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull RecyclerView recyclerView, @NonNull SVGAView sVGAView, @NonNull View view, @NonNull XRefreshLayout xRefreshLayout) {
        this.f49453OooO00o = linearLayout;
        this.f49454OooO0O0 = panelLayout;
        this.f49455OooO0OO = imageButton;
        this.f49456OooO0Oo = editTextSpan;
        this.f49458OooO0o0 = imageView;
        this.f49457OooO0o = imageView2;
        this.f49459OooO0oO = imageView3;
        this.f49460OooO0oo = recyclerView;
        this.f49452OooO = sVGAView;
        this.f49461OooOO0 = view;
        this.f49462OooOO0O = xRefreshLayout;
    }

    @NonNull
    public static gd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49453OooO00o;
    }

    @NonNull
    public static gd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_detail_comment_son_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.emojiFaceView;
        if (((EmojiFaceView) o00Oo0.OooO00o(viewInflate, R.id.emojiFaceView)) != null) {
            i = R.id.faceLayout;
            PanelLayout panelLayout = (PanelLayout) o00Oo0.OooO00o(viewInflate, R.id.faceLayout);
            if (panelLayout != null) {
                i = R.id.mEditContentClick;
                ImageButton imageButton = (ImageButton) o00Oo0.OooO00o(viewInflate, R.id.mEditContentClick);
                if (imageButton != null) {
                    i = R.id.mEditContentInput;
                    EditTextSpan editTextSpan = (EditTextSpan) o00Oo0.OooO00o(viewInflate, R.id.mEditContentInput);
                    if (editTextSpan != null) {
                        i = R.id.mIvAt;
                        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.mIvAt);
                        if (imageView != null) {
                            i = R.id.mIvEmoji;
                            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.mIvEmoji);
                            if (imageView2 != null) {
                                i = R.id.mIvSend;
                                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.mIvSend);
                                if (imageView3 != null) {
                                    i = R.id.recyclerView;
                                    RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
                                    if (recyclerView != null) {
                                        i = R.id.sVGAView;
                                        SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.sVGAView);
                                        if (sVGAView != null) {
                                            i = R.id.vShade;
                                            View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.vShade);
                                            if (viewOooO00o != null) {
                                                i = R.id.xRefreshLayout;
                                                XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.xRefreshLayout);
                                                if (xRefreshLayout != null) {
                                                    return new gd((LinearLayout) viewInflate, panelLayout, imageButton, editTextSpan, imageView, imageView2, imageView3, recyclerView, sVGAView, viewOooO00o, xRefreshLayout);
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
