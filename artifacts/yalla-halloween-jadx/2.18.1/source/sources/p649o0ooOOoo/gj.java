package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.FixTextView;
import com.app.base.view.LanguageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class gj implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f49501OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49502OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LanguageView f49503OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49504OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49505OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f49506OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49507OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final UserTagView f49508OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49509OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final View f49510OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f49511OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49512OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49513OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final FixTextView f49514OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final FixTextView f49515OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final FixTextView f49516OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f49517OooOOo0;

    public gj(@NonNull LinearLayout linearLayout, @NonNull LanguageView languageView, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull UserTagView userTagView, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FixTextView fixTextView, @NonNull TextView textView4, @NonNull FixTextView fixTextView2, @NonNull FixTextView fixTextView3, @NonNull TextView textView5) {
        this.f49502OooO00o = linearLayout;
        this.f49503OooO0O0 = languageView;
        this.f49504OooO0OO = linearLayout2;
        this.f49505OooO0Oo = recyclerView;
        this.f49507OooO0o0 = netImageView;
        this.f49506OooO0o = netImageView2;
        this.f49508OooO0oO = userTagView;
        this.f49509OooO0oo = textView;
        this.f49501OooO = view;
        this.f49510OooOO0 = view2;
        this.f49511OooOO0O = textView2;
        this.f49512OooOO0o = textView3;
        this.f49514OooOOO0 = fixTextView;
        this.f49513OooOOO = textView4;
        this.f49515OooOOOO = fixTextView2;
        this.f49516OooOOOo = fixTextView3;
        this.f49517OooOOo0 = textView5;
    }

    @NonNull
    public static gj inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49502OooO00o;
    }

    @NonNull
    public static gj inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_topic_info_head, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.languageViewTopic;
        LanguageView languageView = (LanguageView) o00Oo0.OooO00o(viewInflate, R.id.languageViewTopic);
        if (languageView != null) {
            i = R.id.layoutTopicManager;
            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutTopicManager);
            if (linearLayout != null) {
                i = R.id.listManager;
                RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.listManager);
                if (recyclerView != null) {
                    i = R.id.nivTopicHeader;
                    NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.nivTopicHeader);
                    if (netImageView != null) {
                        i = R.id.ownerUserTagHeader;
                        NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ownerUserTagHeader);
                        if (netImageView2 != null) {
                            i = R.id.ownerUserTagView;
                            UserTagView userTagView = (UserTagView) o00Oo0.OooO00o(viewInflate, R.id.ownerUserTagView);
                            if (userTagView != null) {
                                i = R.id.tvAdminManager;
                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvAdminManager);
                                if (textView != null) {
                                    i = R.id.tvAdminManagerBottomView;
                                    View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.tvAdminManagerBottomView);
                                    if (viewOooO00o != null) {
                                        i = R.id.tvAdminManagerTopView;
                                        View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.tvAdminManagerTopView);
                                        if (viewOooO00o2 != null) {
                                            i = R.id.tvInfoTitle;
                                            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvInfoTitle);
                                            if (textView2 != null) {
                                                i = R.id.tvRegionTitle;
                                                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvRegionTitle);
                                                if (textView3 != null) {
                                                    i = R.id.tvRule;
                                                    FixTextView fixTextView = (FixTextView) o00Oo0.OooO00o(viewInflate, R.id.tvRule);
                                                    if (fixTextView != null) {
                                                        i = R.id.tvRuleTitle;
                                                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvRuleTitle);
                                                        if (textView4 != null) {
                                                            i = R.id.tvTopicDesc;
                                                            FixTextView fixTextView2 = (FixTextView) o00Oo0.OooO00o(viewInflate, R.id.tvTopicDesc);
                                                            if (fixTextView2 != null) {
                                                                i = R.id.tvTopicManagerInfo;
                                                                FixTextView fixTextView3 = (FixTextView) o00Oo0.OooO00o(viewInflate, R.id.tvTopicManagerInfo);
                                                                if (fixTextView3 != null) {
                                                                    i = R.id.tvTopicName;
                                                                    TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTopicName);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tvUserTitle;
                                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvUserTitle)) != null) {
                                                                            return new gj((LinearLayout) viewInflate, languageView, linearLayout, recyclerView, netImageView, netImageView2, userTagView, textView, viewOooO00o, viewOooO00o2, textView2, textView3, fixTextView, textView4, fixTextView2, fixTextView3, textView5);
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
