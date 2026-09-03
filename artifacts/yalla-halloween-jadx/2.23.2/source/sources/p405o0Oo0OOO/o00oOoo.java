package p405o0Oo0OOO;

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
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.LineAnimView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f44373OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44374OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f44375OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f44376OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44377OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LineAnimView f44378OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f44379OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44380OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f44381OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44382OooOO0;

    public o00oOoo(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull LineAnimView lineAnimView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f44374OooO00o = linearLayout;
        this.f44375OooO0O0 = button;
        this.f44376OooO0OO = editText;
        this.f44377OooO0Oo = imageView;
        this.f44379OooO0o0 = netImageView;
        this.f44378OooO0o = lineAnimView;
        this.f44380OooO0oO = linearLayout2;
        this.f44381OooO0oo = textView;
        this.f44373OooO = textView2;
        this.f44382OooOO0 = textView3;
    }

    @NonNull
    public static o00oOoo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44374OooO00o;
    }

    @NonNull
    public static o00oOoo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.account_activity_login_phone, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btNext;
        Button button = (Button) OooO0O0.OooO00o(i, viewInflate);
        if (button != null) {
            i = o0OO00O.etPhoneNumber;
            EditText editText = (EditText) OooO0O0.OooO00o(i, viewInflate);
            if (editText != null) {
                i = o0OO00O.iv_delete;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.iv_login_country;
                    NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (netImageView != null) {
                        i = o0OO00O.lav_login;
                        LineAnimView lineAnimView = (LineAnimView) OooO0O0.OooO00o(i, viewInflate);
                        if (lineAnimView != null) {
                            i = o0OO00O.llCountryCode;
                            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (linearLayout != null) {
                                i = o0OO00O.tv_area_code;
                                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView != null) {
                                    i = o0OO00O.tv_register;
                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = o0OO00O.tv_tips;
                                        TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            return new o00oOoo((LinearLayout) viewInflate, button, editText, imageView, netImageView, lineAnimView, linearLayout, textView, textView2, textView3);
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
