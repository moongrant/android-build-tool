package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.support.statebutton.StateButton;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44677OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f44678OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f44679OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44680OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44681OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44682OooO0o0;

    public o0oOO(@NonNull FrameLayout frameLayout, @NonNull StateButton stateButton, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f44677OooO00o = frameLayout;
        this.f44678OooO0O0 = stateButton;
        this.f44679OooO0OO = editText;
        this.f44680OooO0Oo = imageView;
        this.f44682OooO0o0 = textView;
        this.f44681OooO0o = textView2;
    }

    @NonNull
    public static o0oOO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44677OooO00o;
    }

    @NonNull
    public static o0oOO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.dialog_common_suspension_appeal, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btConfirm;
        StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = o0OO00O.etReason;
            EditText editText = (EditText) OooO0O0.OooO00o(i, viewInflate);
            if (editText != null) {
                i = o0OO00O.ivClose;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.tvBlockedId;
                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = o0OO00O.tvNum;
                        TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView2 != null) {
                            return new o0oOO((FrameLayout) viewInflate, stateButton, editText, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
