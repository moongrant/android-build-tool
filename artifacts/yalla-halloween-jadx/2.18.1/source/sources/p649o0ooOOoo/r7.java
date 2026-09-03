package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class r7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50423OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f50424OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final EditText f50425OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50426OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50427OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50428OooO0o0;

    public r7(@NonNull FrameLayout frameLayout, @NonNull StateButton stateButton, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f50423OooO00o = frameLayout;
        this.f50424OooO0O0 = stateButton;
        this.f50425OooO0OO = editText;
        this.f50426OooO0Oo = imageView;
        this.f50428OooO0o0 = textView;
        this.f50427OooO0o = textView2;
    }

    @NonNull
    public static r7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50423OooO00o;
    }

    @NonNull
    public static r7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_common_suspension_appeal, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btConfirm;
        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btConfirm);
        if (stateButton != null) {
            i = R.id.etReason;
            EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.etReason);
            if (editText != null) {
                i = R.id.ivClose;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClose);
                if (imageView != null) {
                    i = R.id.tvBlockedId;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvBlockedId);
                    if (textView != null) {
                        i = R.id.tvNum;
                        TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvNum);
                        if (textView2 != null) {
                            return new r7((FrameLayout) viewInflate, stateButton, editText, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
