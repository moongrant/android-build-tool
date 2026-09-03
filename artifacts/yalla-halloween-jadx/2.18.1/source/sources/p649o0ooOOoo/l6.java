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
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class l6 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f49905OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49906OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f49907OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f49908OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f49909OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LineAnimView f49910OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f49911OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49912OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49913OooO0oo;

    public l6(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LineAnimView lineAnimView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f49906OooO00o = linearLayout;
        this.f49907OooO0O0 = button;
        this.f49908OooO0OO = editText;
        this.f49909OooO0Oo = imageView;
        this.f49911OooO0o0 = imageView2;
        this.f49910OooO0o = lineAnimView;
        this.f49912OooO0oO = textView;
        this.f49913OooO0oo = textView2;
        this.f49905OooO = textView3;
    }

    @NonNull
    public static l6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49906OooO00o;
    }

    @NonNull
    public static l6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_enter_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.bt_next;
        Button button = (Button) o00Oo0.OooO00o(viewInflate, R.id.bt_next);
        if (button != null) {
            i = R.id.et_password;
            EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.et_password);
            if (editText != null) {
                i = R.id.iv_delete;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_delete);
                if (imageView != null) {
                    i = R.id.iv_see;
                    ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_see);
                    if (imageView2 != null) {
                        i = R.id.lav_password;
                        LineAnimView lineAnimView = (LineAnimView) o00Oo0.OooO00o(viewInflate, R.id.lav_password);
                        if (lineAnimView != null) {
                            i = R.id.tv_forgot_password;
                            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_forgot_password);
                            if (textView != null) {
                                i = R.id.tv_phone_number;
                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_phone_number);
                                if (textView2 != null) {
                                    i = R.id.tv_tips;
                                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_tips);
                                    if (textView3 != null) {
                                        return new l6((LinearLayout) viewInflate, button, editText, imageView, imageView2, lineAnimView, textView, textView2, textView3);
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
