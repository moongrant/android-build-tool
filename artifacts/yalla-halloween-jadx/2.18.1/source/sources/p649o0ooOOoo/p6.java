package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.LineAnimView;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class p6 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f50223OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50224OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f50225OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f50226OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50227OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LineAnimView f50228OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50229OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50230OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f50231OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50232OooOO0;

    public p6(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull LineAnimView lineAnimView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f50224OooO00o = linearLayout;
        this.f50225OooO0O0 = button;
        this.f50226OooO0OO = editText;
        this.f50227OooO0Oo = imageView;
        this.f50229OooO0o0 = netImageView;
        this.f50228OooO0o = lineAnimView;
        this.f50230OooO0oO = linearLayout2;
        this.f50231OooO0oo = textView;
        this.f50223OooO = textView2;
        this.f50232OooOO0 = textView3;
    }

    @NonNull
    public static p6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50224OooO00o;
    }

    @NonNull
    public static p6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_login_phone, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btNext;
        Button button = (Button) o00Oo0.OooO00o(viewInflate, R.id.btNext);
        if (button != null) {
            i = R.id.etPhoneNumber;
            EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.etPhoneNumber);
            if (editText != null) {
                i = R.id.iv_delete;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_delete);
                if (imageView != null) {
                    i = R.id.iv_login_country;
                    NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_login_country);
                    if (netImageView != null) {
                        i = R.id.lav_login;
                        LineAnimView lineAnimView = (LineAnimView) o00Oo0.OooO00o(viewInflate, R.id.lav_login);
                        if (lineAnimView != null) {
                            i = R.id.llCountryCode;
                            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llCountryCode);
                            if (linearLayout != null) {
                                i = R.id.tv_area_code;
                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_area_code);
                                if (textView != null) {
                                    i = R.id.tvTermsService;
                                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTermsService);
                                    if (textView2 != null) {
                                        i = R.id.tv_tips;
                                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_tips);
                                        if (textView3 != null) {
                                            return new p6((LinearLayout) viewInflate, button, editText, imageView, netImageView, lineAnimView, linearLayout, textView, textView2, textView3);
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
