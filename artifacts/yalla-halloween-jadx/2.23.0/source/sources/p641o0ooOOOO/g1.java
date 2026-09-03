package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57950OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f57951OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f57952OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f57953OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f57954OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f57955OooO0o0;

    public g1(@NonNull FrameLayout frameLayout, @NonNull StateButton stateButton, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f57950OooO00o = frameLayout;
        this.f57951OooO0O0 = stateButton;
        this.f57952OooO0OO = editText;
        this.f57953OooO0Oo = imageView;
        this.f57955OooO0o0 = textView;
        this.f57954OooO0o = textView2;
    }

    @NonNull
    public static g1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57950OooO00o;
    }

    @NonNull
    public static g1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_common_suspension_appeal, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.btConfirm;
        StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = oO00O0oO.etReason;
            EditText editText = (EditText) OooOO0.OooO00o(i, viewInflate);
            if (editText != null) {
                i = oO00O0oO.ivClose;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.tvBlockedId;
                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = oO00O0oO.tvNum;
                        TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView2 != null) {
                            return new g1((FrameLayout) viewInflate, stateButton, editText, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
