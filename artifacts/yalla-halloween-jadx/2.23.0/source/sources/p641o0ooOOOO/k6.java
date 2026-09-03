package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.netimage.NetImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class k6 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f58265OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58266OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f58267OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f58268OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f58269OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f58270OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f58271OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f58272OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f58273OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58274OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f58275OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58276OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58277OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58278OooOOO0;

    public k6(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f58266OooO00o = linearLayout;
        this.f58267OooO0O0 = view;
        this.f58268OooO0OO = view2;
        this.f58269OooO0Oo = view3;
        this.f58271OooO0o0 = view4;
        this.f58270OooO0o = netImageView;
        this.f58272OooO0oO = textView;
        this.f58273OooO0oo = textView2;
        this.f58265OooO = textView3;
        this.f58274OooOO0 = textView4;
        this.f58275OooOO0O = textView5;
        this.f58276OooOO0o = textView6;
        this.f58278OooOOO0 = textView7;
        this.f58277OooOOO = textView8;
    }

    @NonNull
    public static k6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58266OooO00o;
    }

    @NonNull
    public static k6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewOooO00o3;
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_activity_topic_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bgTopicDesc;
        View viewOooO00o4 = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o4 != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.bgTopicHeader), viewInflate)) != null && (viewOooO00o2 = OooOO0.OooO00o((i = oO00O0oO.bgTopicName), viewInflate)) != null && (viewOooO00o3 = OooOO0.OooO00o((i = oO00O0oO.bgTopicRule), viewInflate)) != null) {
            i = oO00O0oO.nivTopicHeader;
            NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = oO00O0oO.tvTopicDesc;
                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView != null) {
                    i = oO00O0oO.tvTopicName;
                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        i = oO00O0oO.tvTopicRule;
                        TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView3 != null) {
                            i = oO00O0oO.vTopicBlackList;
                            TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView4 != null) {
                                i = oO00O0oO.vTopicDesc;
                                TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView5 != null) {
                                    i = oO00O0oO.vTopicHeader;
                                    TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView6 != null) {
                                        i = oO00O0oO.vTopicManager;
                                        TextView textView7 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView7 != null) {
                                            i = oO00O0oO.vTopicName;
                                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                i = oO00O0oO.vTopicRule;
                                                TextView textView8 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView8 != null) {
                                                    return new k6((LinearLayout) viewInflate, viewOooO00o4, viewOooO00o, viewOooO00o2, viewOooO00o3, netImageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
