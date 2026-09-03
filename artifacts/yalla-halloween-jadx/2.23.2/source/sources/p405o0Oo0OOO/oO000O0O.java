package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000O0O implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f44761OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44762OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44763OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44764OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44765OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44766OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44767OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f44768OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f44769OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44770OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f44771OooOO0O;

    public oO000O0O(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.f44762OooO00o = linearLayout;
        this.f44763OooO0O0 = linearLayout2;
        this.f44764OooO0OO = textView;
        this.f44765OooO0Oo = textView2;
        this.f44767OooO0o0 = textView3;
        this.f44766OooO0o = textView4;
        this.f44768OooO0oO = textView5;
        this.f44769OooO0oo = textView6;
        this.f44761OooO = textView7;
        this.f44770OooOO0 = textView8;
        this.f44771OooOO0O = textView9;
    }

    @NonNull
    public static oO000O0O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44762OooO00o;
    }

    @NonNull
    public static oO000O0O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_activity_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.llUnprotected;
        LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
        if (linearLayout != null) {
            i = o0OO00O.tvAbout;
            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = o0OO00O.tvAccount;
                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView2 != null) {
                    i = o0OO00O.tvBlock;
                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView3 != null) {
                        i = o0OO00O.tvCache;
                        TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView4 != null) {
                            i = o0OO00O.tvChat;
                            TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView5 != null) {
                                i = o0OO00O.tvLogout;
                                TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView6 != null) {
                                    i = o0OO00O.tvNetWork;
                                    TextView textView7 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView7 != null) {
                                        i = o0OO00O.tvNotification;
                                        TextView textView8 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView8 != null) {
                                            i = o0OO00O.tvPrivacy;
                                            TextView textView9 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView9 != null) {
                                                return new oO000O0O((LinearLayout) viewInflate, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
