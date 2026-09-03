package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.netimage.NetImageView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O00O implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f45080OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45081OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f45082OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f45083OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f45084OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f45085OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f45086OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f45087OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f45088OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45089OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f45090OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f45091OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f45092OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45093OooOOO0;

    public oOO0O00O(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f45081OooO00o = linearLayout;
        this.f45082OooO0O0 = view;
        this.f45083OooO0OO = view2;
        this.f45084OooO0Oo = view3;
        this.f45086OooO0o0 = view4;
        this.f45085OooO0o = netImageView;
        this.f45087OooO0oO = textView;
        this.f45088OooO0oo = textView2;
        this.f45080OooO = textView3;
        this.f45089OooOO0 = textView4;
        this.f45090OooOO0O = textView5;
        this.f45091OooOO0o = textView6;
        this.f45093OooOOO0 = textView7;
        this.f45092OooOOO = textView8;
    }

    @NonNull
    public static oOO0O00O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45081OooO00o;
    }

    @NonNull
    public static oOO0O00O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewOooO00o3;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_activity_topic_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bgTopicDesc;
        View viewOooO00o4 = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o4 != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.bgTopicHeader), viewInflate)) != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o0OO00O.bgTopicName), viewInflate)) != null && (viewOooO00o3 = OooO0O0.OooO00o((i = o0OO00O.bgTopicRule), viewInflate)) != null) {
            i = o0OO00O.nivTopicHeader;
            NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = o0OO00O.tvTopicDesc;
                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView != null) {
                    i = o0OO00O.tvTopicName;
                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        i = o0OO00O.tvTopicRule;
                        TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView3 != null) {
                            i = o0OO00O.vTopicBlackList;
                            TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView4 != null) {
                                i = o0OO00O.vTopicDesc;
                                TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView5 != null) {
                                    i = o0OO00O.vTopicHeader;
                                    TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView6 != null) {
                                        i = o0OO00O.vTopicManager;
                                        TextView textView7 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView7 != null) {
                                            i = o0OO00O.vTopicName;
                                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                i = o0OO00O.vTopicRule;
                                                TextView textView8 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView8 != null) {
                                                    return new oOO0O00O((LinearLayout) viewInflate, viewOooO00o4, viewOooO00o, viewOooO00o2, viewOooO00o3, netImageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
