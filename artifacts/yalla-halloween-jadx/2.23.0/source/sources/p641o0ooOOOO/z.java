package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f59419OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59420OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f59421OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f59422OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f59423OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LineAnimView f59424OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f59425OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59426OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f59427OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f59428OooOO0;

    public z(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull LineAnimView lineAnimView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f59420OooO00o = linearLayout;
        this.f59421OooO0O0 = button;
        this.f59422OooO0OO = editText;
        this.f59423OooO0Oo = imageView;
        this.f59425OooO0o0 = netImageView;
        this.f59424OooO0o = lineAnimView;
        this.f59426OooO0oO = linearLayout2;
        this.f59427OooO0oo = textView;
        this.f59419OooO = textView2;
        this.f59428OooOO0 = textView3;
    }

    @NonNull
    public static z inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59420OooO00o;
    }

    @NonNull
    public static z inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.account_activity_login_phone, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.btNext;
        Button button = (Button) OooOO0.OooO00o(i, viewInflate);
        if (button != null) {
            i = oO00O0oO.etPhoneNumber;
            EditText editText = (EditText) OooOO0.OooO00o(i, viewInflate);
            if (editText != null) {
                i = oO00O0oO.iv_delete;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.iv_login_country;
                    NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                    if (netImageView != null) {
                        i = oO00O0oO.lav_login;
                        LineAnimView lineAnimView = (LineAnimView) OooOO0.OooO00o(i, viewInflate);
                        if (lineAnimView != null) {
                            i = oO00O0oO.llCountryCode;
                            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                            if (linearLayout != null) {
                                i = oO00O0oO.tv_area_code;
                                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView != null) {
                                    i = oO00O0oO.tv_register;
                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = oO00O0oO.tv_tips;
                                        TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            return new z((LinearLayout) viewInflate, button, editText, imageView, netImageView, lineAnimView, linearLayout, textView, textView2, textView3);
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
