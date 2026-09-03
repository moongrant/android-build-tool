package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.LanguageView;
import com.yalla.yalla.ui.view.UserTagView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class q3 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f45412OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45413OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LanguageView f45414OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45415OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f45416OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f45417OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45418OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final UserTagView f45419OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f45420OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final View f45421OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f45422OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f45423OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f45424OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final FixTextView f45425OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final FixTextView f45426OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final FixTextView f45427OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f45428OooOOo0;

    public q3(@NonNull LinearLayout linearLayout, @NonNull LanguageView languageView, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull UserTagView userTagView, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FixTextView fixTextView, @NonNull TextView textView4, @NonNull FixTextView fixTextView2, @NonNull FixTextView fixTextView3, @NonNull TextView textView5) {
        this.f45413OooO00o = linearLayout;
        this.f45414OooO0O0 = languageView;
        this.f45415OooO0OO = linearLayout2;
        this.f45416OooO0Oo = recyclerView;
        this.f45418OooO0o0 = netImageView;
        this.f45417OooO0o = netImageView2;
        this.f45419OooO0oO = userTagView;
        this.f45420OooO0oo = textView;
        this.f45412OooO = view;
        this.f45421OooOO0 = view2;
        this.f45422OooOO0O = textView2;
        this.f45423OooOO0o = textView3;
        this.f45425OooOOO0 = fixTextView;
        this.f45424OooOOO = textView4;
        this.f45426OooOOOO = fixTextView2;
        this.f45427OooOOOo = fixTextView3;
        this.f45428OooOOo0 = textView5;
    }

    @NonNull
    public static q3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45413OooO00o;
    }

    @NonNull
    public static q3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_topic_info_head, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.languageViewTopic;
        LanguageView languageView = (LanguageView) OooO0O0.OooO00o(i, viewInflate);
        if (languageView != null) {
            i = o0OO00O.layoutTopicManager;
            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
            if (linearLayout != null) {
                i = o0OO00O.listManager;
                RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = o0OO00O.nivTopicHeader;
                    NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (netImageView != null) {
                        i = o0OO00O.ownerUserTagHeader;
                        NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (netImageView2 != null) {
                            i = o0OO00O.ownerUserTagView;
                            UserTagView userTagView = (UserTagView) OooO0O0.OooO00o(i, viewInflate);
                            if (userTagView != null) {
                                i = o0OO00O.tvAdminManager;
                                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.tvAdminManagerBottomView), viewInflate)) != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o0OO00O.tvAdminManagerTopView), viewInflate)) != null) {
                                    i = o0OO00O.tvInfoTitle;
                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = o0OO00O.tvRegionTitle;
                                        TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            i = o0OO00O.tvRule;
                                            FixTextView fixTextView = (FixTextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (fixTextView != null) {
                                                i = o0OO00O.tvRuleTitle;
                                                TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView4 != null) {
                                                    i = o0OO00O.tvTopicDesc;
                                                    FixTextView fixTextView2 = (FixTextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (fixTextView2 != null) {
                                                        i = o0OO00O.tvTopicManagerInfo;
                                                        FixTextView fixTextView3 = (FixTextView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (fixTextView3 != null) {
                                                            i = o0OO00O.tvTopicName;
                                                            TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (textView5 != null) {
                                                                i = o0OO00O.tvUserTitle;
                                                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                                    return new q3((LinearLayout) viewInflate, languageView, linearLayout, recyclerView, netImageView, netImageView2, userTagView, textView, viewOooO00o, viewOooO00o2, textView2, textView3, fixTextView, textView4, fixTextView2, fixTextView3, textView5);
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
