package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class bc implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f57614OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57615OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LanguageView f57616OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57617OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57618OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f57619OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f57620OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final UserTagView f57621OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f57622OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final View f57623OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f57624OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f57625OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f57626OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final FixTextView f57627OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final FixTextView f57628OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final FixTextView f57629OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f57630OooOOo0;

    public bc(@NonNull LinearLayout linearLayout, @NonNull LanguageView languageView, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull UserTagView userTagView, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FixTextView fixTextView, @NonNull TextView textView4, @NonNull FixTextView fixTextView2, @NonNull FixTextView fixTextView3, @NonNull TextView textView5) {
        this.f57615OooO00o = linearLayout;
        this.f57616OooO0O0 = languageView;
        this.f57617OooO0OO = linearLayout2;
        this.f57618OooO0Oo = recyclerView;
        this.f57620OooO0o0 = netImageView;
        this.f57619OooO0o = netImageView2;
        this.f57621OooO0oO = userTagView;
        this.f57622OooO0oo = textView;
        this.f57614OooO = view;
        this.f57623OooOO0 = view2;
        this.f57624OooOO0O = textView2;
        this.f57625OooOO0o = textView3;
        this.f57627OooOOO0 = fixTextView;
        this.f57626OooOOO = textView4;
        this.f57628OooOOOO = fixTextView2;
        this.f57629OooOOOo = fixTextView3;
        this.f57630OooOOo0 = textView5;
    }

    @NonNull
    public static bc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57615OooO00o;
    }

    @NonNull
    public static bc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_topic_info_head, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.languageViewTopic;
        LanguageView languageView = (LanguageView) OooOO0.OooO00o(i, viewInflate);
        if (languageView != null) {
            i = oO00O0oO.layoutTopicManager;
            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
            if (linearLayout != null) {
                i = oO00O0oO.listManager;
                RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = oO00O0oO.nivTopicHeader;
                    NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                    if (netImageView != null) {
                        i = oO00O0oO.ownerUserTagHeader;
                        NetImageView netImageView2 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                        if (netImageView2 != null) {
                            i = oO00O0oO.ownerUserTagView;
                            UserTagView userTagView = (UserTagView) OooOO0.OooO00o(i, viewInflate);
                            if (userTagView != null) {
                                i = oO00O0oO.tvAdminManager;
                                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.tvAdminManagerBottomView), viewInflate)) != null && (viewOooO00o2 = OooOO0.OooO00o((i = oO00O0oO.tvAdminManagerTopView), viewInflate)) != null) {
                                    i = oO00O0oO.tvInfoTitle;
                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = oO00O0oO.tvRegionTitle;
                                        TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            i = oO00O0oO.tvRule;
                                            FixTextView fixTextView = (FixTextView) OooOO0.OooO00o(i, viewInflate);
                                            if (fixTextView != null) {
                                                i = oO00O0oO.tvRuleTitle;
                                                TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView4 != null) {
                                                    i = oO00O0oO.tvTopicDesc;
                                                    FixTextView fixTextView2 = (FixTextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (fixTextView2 != null) {
                                                        i = oO00O0oO.tvTopicManagerInfo;
                                                        FixTextView fixTextView3 = (FixTextView) OooOO0.OooO00o(i, viewInflate);
                                                        if (fixTextView3 != null) {
                                                            i = oO00O0oO.tvTopicName;
                                                            TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (textView5 != null) {
                                                                i = oO00O0oO.tvUserTitle;
                                                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                                    return new bc((LinearLayout) viewInflate, languageView, linearLayout, recyclerView, netImageView, netImageView2, userTagView, textView, viewOooO00o, viewOooO00o2, textView2, textView3, fixTextView, textView4, fixTextView2, fixTextView3, textView5);
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
