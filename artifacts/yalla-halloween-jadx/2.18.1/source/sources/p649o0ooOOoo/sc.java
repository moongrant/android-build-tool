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
import com.app.base.view.ViewPagerFixed;
import com.google.android.material.appbar.AppBarLayout;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import com.yalla.yalla.common.ui.view.PraiseView;
import com.yalla.yalla.common.ui.view.refresh.RefreshLayout;
import com.yalla.yalla.ui.activity.moment.momentDetail.PostDetailListTitleView;
import com.yalla.yalla.ui.activity.moment.momentDetail.PostDetailTopicHeader;
import com.yalla.yalla.ui.view.MomentDetailView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class sc implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f50575OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50576OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f50577OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditTextSpan f50578OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f50579OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final PanelLayout f50580OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final EmojiFaceView f50581OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f50582OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50583OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final PraiseView f50584OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final ImageView f50585OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final PraiseView f50586OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ImageView f50587OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f50588OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final MomentDetailView f50589OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final PostDetailListTitleView f50590OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final RefreshLayout f50591OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final PostDetailTopicHeader f50592OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final View f50593OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f50594OooOo00;

    public sc(@NonNull LinearLayout linearLayout, @NonNull AppBarLayout appBarLayout, @NonNull EditTextSpan editTextSpan, @NonNull View view, @NonNull EmojiFaceView emojiFaceView, @NonNull PanelLayout panelLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull PraiseView praiseView, @NonNull ImageView imageView4, @NonNull PraiseView praiseView2, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull MomentDetailView momentDetailView, @NonNull PostDetailListTitleView postDetailListTitleView, @NonNull PostDetailTopicHeader postDetailTopicHeader, @NonNull RefreshLayout refreshLayout, @NonNull View view2, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f50576OooO00o = linearLayout;
        this.f50577OooO0O0 = appBarLayout;
        this.f50578OooO0OO = editTextSpan;
        this.f50579OooO0Oo = view;
        this.f50581OooO0o0 = emojiFaceView;
        this.f50580OooO0o = panelLayout;
        this.f50582OooO0oO = imageView;
        this.f50583OooO0oo = imageView2;
        this.f50575OooO = imageView3;
        this.f50584OooOO0 = praiseView;
        this.f50585OooOO0O = imageView4;
        this.f50586OooOO0o = praiseView2;
        this.f50588OooOOO0 = imageView5;
        this.f50587OooOOO = imageView6;
        this.f50589OooOOOO = momentDetailView;
        this.f50590OooOOOo = postDetailListTitleView;
        this.f50592OooOOo0 = postDetailTopicHeader;
        this.f50591OooOOo = refreshLayout;
        this.f50593OooOOoo = view2;
        this.f50594OooOo00 = viewPagerFixed;
    }

    @NonNull
    public static sc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50576OooO00o;
    }

    @NonNull
    public static sc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_activity_post_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) o00Oo0.OooO00o(viewInflate, R.id.appBarLayout);
        if (appBarLayout != null) {
            i = R.id.editTextInput;
            EditTextSpan editTextSpan = (EditTextSpan) o00Oo0.OooO00o(viewInflate, R.id.editTextInput);
            if (editTextSpan != null) {
                i = R.id.editTextInputClick;
                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.editTextInputClick);
                if (viewOooO00o != null) {
                    i = R.id.emojiFaceView;
                    EmojiFaceView emojiFaceView = (EmojiFaceView) o00Oo0.OooO00o(viewInflate, R.id.emojiFaceView);
                    if (emojiFaceView != null) {
                        i = R.id.head;
                        if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.head)) != null) {
                            i = R.id.inputPanelLayout;
                            PanelLayout panelLayout = (PanelLayout) o00Oo0.OooO00o(viewInflate, R.id.inputPanelLayout);
                            if (panelLayout != null) {
                                i = R.id.ivAt;
                                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivAt);
                                if (imageView != null) {
                                    i = R.id.ivEmoji;
                                    ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivEmoji);
                                    if (imageView2 != null) {
                                        i = R.id.ivGiftSend;
                                        ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftSend);
                                        if (imageView3 != null) {
                                            i = R.id.ivPraiseOther;
                                            PraiseView praiseView = (PraiseView) o00Oo0.OooO00o(viewInflate, R.id.ivPraiseOther);
                                            if (praiseView != null) {
                                                i = R.id.ivPraisePlaceholder;
                                                ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPraisePlaceholder);
                                                if (imageView4 != null) {
                                                    i = R.id.ivPraiseSelf;
                                                    PraiseView praiseView2 = (PraiseView) o00Oo0.OooO00o(viewInflate, R.id.ivPraiseSelf);
                                                    if (praiseView2 != null) {
                                                        i = R.id.ivSend;
                                                        ImageView imageView5 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSend);
                                                        if (imageView5 != null) {
                                                            i = R.id.ivShare;
                                                            ImageView imageView6 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivShare);
                                                            if (imageView6 != null) {
                                                                i = R.id.layoutInput;
                                                                if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutInput)) != null) {
                                                                    i = R.id.postDetailHeaderView;
                                                                    MomentDetailView momentDetailView = (MomentDetailView) o00Oo0.OooO00o(viewInflate, R.id.postDetailHeaderView);
                                                                    if (momentDetailView != null) {
                                                                        i = R.id.postDetailListTitleView;
                                                                        PostDetailListTitleView postDetailListTitleView = (PostDetailListTitleView) o00Oo0.OooO00o(viewInflate, R.id.postDetailListTitleView);
                                                                        if (postDetailListTitleView != null) {
                                                                            i = R.id.postDetailTopicHeader;
                                                                            PostDetailTopicHeader postDetailTopicHeader = (PostDetailTopicHeader) o00Oo0.OooO00o(viewInflate, R.id.postDetailTopicHeader);
                                                                            if (postDetailTopicHeader != null) {
                                                                                i = R.id.refreshLayout;
                                                                                RefreshLayout refreshLayout = (RefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.refreshLayout);
                                                                                if (refreshLayout != null) {
                                                                                    i = R.id.vShade;
                                                                                    View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.vShade);
                                                                                    if (viewOooO00o2 != null) {
                                                                                        i = R.id.viewPager;
                                                                                        ViewPagerFixed viewPagerFixed = (ViewPagerFixed) o00Oo0.OooO00o(viewInflate, R.id.viewPager);
                                                                                        if (viewPagerFixed != null) {
                                                                                            return new sc((LinearLayout) viewInflate, appBarLayout, editTextSpan, viewOooO00o, emojiFaceView, panelLayout, imageView, imageView2, imageView3, praiseView, imageView4, praiseView2, imageView5, imageView6, momentDetailView, postDetailListTitleView, postDetailTopicHeader, refreshLayout, viewOooO00o2, viewPagerFixed);
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
