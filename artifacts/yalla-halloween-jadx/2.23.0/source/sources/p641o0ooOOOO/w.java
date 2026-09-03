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
import com.yalla.yalla.ui.view.LineAnimView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f59105OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59106OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f59107OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f59108OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f59109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LineAnimView f59110OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f59111OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f59112OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f59113OooO0oo;

    public w(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LineAnimView lineAnimView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f59106OooO00o = linearLayout;
        this.f59107OooO0O0 = button;
        this.f59108OooO0OO = editText;
        this.f59109OooO0Oo = imageView;
        this.f59111OooO0o0 = imageView2;
        this.f59110OooO0o = lineAnimView;
        this.f59112OooO0oO = textView;
        this.f59113OooO0oo = textView2;
        this.f59105OooO = textView3;
    }

    @NonNull
    public static w inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59106OooO00o;
    }

    @NonNull
    public static w inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.account_activity_enter_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bt_next;
        Button button = (Button) OooOO0.OooO00o(i, viewInflate);
        if (button != null) {
            i = oO00O0oO.et_password;
            EditText editText = (EditText) OooOO0.OooO00o(i, viewInflate);
            if (editText != null) {
                i = oO00O0oO.iv_delete;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.iv_see;
                    ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView2 != null) {
                        i = oO00O0oO.lav_password;
                        LineAnimView lineAnimView = (LineAnimView) OooOO0.OooO00o(i, viewInflate);
                        if (lineAnimView != null) {
                            i = oO00O0oO.tv_forgot_password;
                            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView != null) {
                                i = oO00O0oO.tv_phone_number;
                                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView2 != null) {
                                    i = oO00O0oO.tv_tips;
                                    TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView3 != null) {
                                        return new w((LinearLayout) viewInflate, button, editText, imageView, imageView2, lineAnimView, textView, textView2, textView3);
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
