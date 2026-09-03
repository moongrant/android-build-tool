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
import com.yalla.yalla.ui.view.LineAnimView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f44205OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44206OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f44207OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f44208OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44209OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LineAnimView f44210OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f44211OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f44212OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f44213OooO0oo;

    public o00(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LineAnimView lineAnimView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f44206OooO00o = linearLayout;
        this.f44207OooO0O0 = button;
        this.f44208OooO0OO = editText;
        this.f44209OooO0Oo = imageView;
        this.f44211OooO0o0 = imageView2;
        this.f44210OooO0o = lineAnimView;
        this.f44212OooO0oO = textView;
        this.f44213OooO0oo = textView2;
        this.f44205OooO = textView3;
    }

    @NonNull
    public static o00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44206OooO00o;
    }

    @NonNull
    public static o00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.account_activity_enter_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bt_next;
        Button button = (Button) OooO0O0.OooO00o(i, viewInflate);
        if (button != null) {
            i = o0OO00O.et_password;
            EditText editText = (EditText) OooO0O0.OooO00o(i, viewInflate);
            if (editText != null) {
                i = o0OO00O.iv_delete;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.iv_see;
                    ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView2 != null) {
                        i = o0OO00O.lav_password;
                        LineAnimView lineAnimView = (LineAnimView) OooO0O0.OooO00o(i, viewInflate);
                        if (lineAnimView != null) {
                            i = o0OO00O.tv_forgot_password;
                            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView != null) {
                                i = o0OO00O.tv_phone_number;
                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView2 != null) {
                                    i = o0OO00O.tv_tips;
                                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView3 != null) {
                                        return new o00((LinearLayout) viewInflate, button, editText, imageView, imageView2, lineAnimView, textView, textView2, textView3);
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
