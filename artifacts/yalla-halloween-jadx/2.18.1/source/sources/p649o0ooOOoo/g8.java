package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class g8 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f49430OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49431OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f49432OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49433OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49434OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49435OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49436OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49437OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49438OooO0oo;

    public g8(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f49431OooO00o = linearLayout;
        this.f49432OooO0O0 = textView;
        this.f49433OooO0OO = textView2;
        this.f49434OooO0Oo = textView3;
        this.f49436OooO0o0 = linearLayout2;
        this.f49435OooO0o = textView4;
        this.f49437OooO0oO = textView5;
        this.f49438OooO0oo = textView6;
        this.f49430OooO = textView7;
    }

    @NonNull
    public static g8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49431OooO00o;
    }

    @NonNull
    public static g8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_share, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.facebook;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.facebook);
        if (textView != null) {
            i = R.id.friends;
            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.friends);
            if (textView2 != null) {
                i = R.id.instagram;
                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.instagram);
                if (textView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    i = R.id.moments;
                    TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.moments);
                    if (textView4 != null) {
                        i = R.id.scrollView;
                        if (((HorizontalScrollView) o00Oo0.OooO00o(viewInflate, R.id.scrollView)) != null) {
                            i = R.id.title;
                            TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.title);
                            if (textView5 != null) {
                                i = R.id.twitter;
                                TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.twitter);
                                if (textView6 != null) {
                                    i = R.id.whatsApp;
                                    TextView textView7 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.whatsApp);
                                    if (textView7 != null) {
                                        return new g8(linearLayout, textView, textView2, textView3, linearLayout, textView4, textView5, textView6, textView7);
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
