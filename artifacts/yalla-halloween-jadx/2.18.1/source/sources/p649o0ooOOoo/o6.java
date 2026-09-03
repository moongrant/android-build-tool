package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class o6 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50141OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f50142OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f50143OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50144OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50145OooO0o0;

    public o6(@NonNull FrameLayout frameLayout, @NonNull StateButton stateButton, @NonNull StateButton stateButton2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f50141OooO00o = frameLayout;
        this.f50142OooO0O0 = stateButton;
        this.f50143OooO0OO = stateButton2;
        this.f50144OooO0Oo = imageView;
        this.f50145OooO0o0 = textView;
    }

    @NonNull
    public static o6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50141OooO00o;
    }

    @NonNull
    public static o6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_login_on_room, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btFaceBook;
        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btFaceBook);
        if (stateButton != null) {
            i = R.id.btLoginPhone;
            StateButton stateButton2 = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btLoginPhone);
            if (stateButton2 != null) {
                i = R.id.ivClose;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClose);
                if (imageView != null) {
                    i = R.id.ivLoginIcon;
                    if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLoginIcon)) != null) {
                        i = R.id.tvTermsService;
                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTermsService);
                        if (textView != null) {
                            return new o6((FrameLayout) viewInflate, stateButton, stateButton2, imageView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
