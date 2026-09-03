package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class la implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f49938OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49939OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49940OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49941OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49942OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49943OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49944OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49945OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49946OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49947OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f49948OooOO0O;

    public la(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.f49939OooO00o = linearLayout;
        this.f49940OooO0O0 = linearLayout2;
        this.f49941OooO0OO = textView;
        this.f49942OooO0Oo = textView2;
        this.f49944OooO0o0 = textView3;
        this.f49943OooO0o = textView4;
        this.f49945OooO0oO = textView5;
        this.f49946OooO0oo = textView6;
        this.f49938OooO = textView7;
        this.f49947OooOO0 = textView8;
        this.f49948OooOO0O = textView9;
    }

    @NonNull
    public static la inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49939OooO00o;
    }

    @NonNull
    public static la inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_activity_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.llUnprotected;
        LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llUnprotected);
        if (linearLayout != null) {
            i = R.id.tvAbout;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvAbout);
            if (textView != null) {
                i = R.id.tvAccount;
                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvAccount);
                if (textView2 != null) {
                    i = R.id.tvBlock;
                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvBlock);
                    if (textView3 != null) {
                        i = R.id.tvCache;
                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvCache);
                        if (textView4 != null) {
                            i = R.id.tvChat;
                            TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvChat);
                            if (textView5 != null) {
                                i = R.id.tvLogout;
                                TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvLogout);
                                if (textView6 != null) {
                                    i = R.id.tvNetWork;
                                    TextView textView7 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvNetWork);
                                    if (textView7 != null) {
                                        i = R.id.tvNotification;
                                        TextView textView8 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvNotification);
                                        if (textView8 != null) {
                                            i = R.id.tvPrivacy;
                                            TextView textView9 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvPrivacy);
                                            if (textView9 != null) {
                                                return new la((LinearLayout) viewInflate, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
