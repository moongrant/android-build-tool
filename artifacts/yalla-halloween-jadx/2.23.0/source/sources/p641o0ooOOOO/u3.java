package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class u3 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f58934OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58935OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58936OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58937OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58938OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58939OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f58940OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f58941OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f58942OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58943OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f58944OooOO0O;

    public u3(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.f58935OooO00o = linearLayout;
        this.f58936OooO0O0 = linearLayout2;
        this.f58937OooO0OO = textView;
        this.f58938OooO0Oo = textView2;
        this.f58940OooO0o0 = textView3;
        this.f58939OooO0o = textView4;
        this.f58941OooO0oO = textView5;
        this.f58942OooO0oo = textView6;
        this.f58934OooO = textView7;
        this.f58943OooOO0 = textView8;
        this.f58944OooOO0O = textView9;
    }

    @NonNull
    public static u3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58935OooO00o;
    }

    @NonNull
    public static u3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_activity_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.llUnprotected;
        LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
        if (linearLayout != null) {
            i = oO00O0oO.tvAbout;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = oO00O0oO.tvAccount;
                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView2 != null) {
                    i = oO00O0oO.tvBlock;
                    TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView3 != null) {
                        i = oO00O0oO.tvCache;
                        TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView4 != null) {
                            i = oO00O0oO.tvChat;
                            TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView5 != null) {
                                i = oO00O0oO.tvLogout;
                                TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView6 != null) {
                                    i = oO00O0oO.tvNetWork;
                                    TextView textView7 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView7 != null) {
                                        i = oO00O0oO.tvNotification;
                                        TextView textView8 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView8 != null) {
                                            i = oO00O0oO.tvPrivacy;
                                            TextView textView9 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView9 != null) {
                                                return new u3((LinearLayout) viewInflate, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
