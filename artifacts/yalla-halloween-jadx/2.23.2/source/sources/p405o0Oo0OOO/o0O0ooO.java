package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class o0O0ooO implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44547OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f44548OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f44549OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44550OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44551OooO0o0;

    public o0O0ooO(@NonNull FrameLayout frameLayout, @NonNull StateButton stateButton, @NonNull StateButton stateButton2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f44547OooO00o = frameLayout;
        this.f44548OooO0O0 = stateButton;
        this.f44549OooO0OO = stateButton2;
        this.f44550OooO0Oo = imageView;
        this.f44551OooO0o0 = textView;
    }

    @NonNull
    public static o0O0ooO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44547OooO00o;
    }

    @NonNull
    public static o0O0ooO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.account_activity_login_on_room, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btFaceBook;
        StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = o0OO00O.btLoginPhone;
            StateButton stateButton2 = (StateButton) OooO0O0.OooO00o(i, viewInflate);
            if (stateButton2 != null) {
                i = o0OO00O.ivClose;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.ivLoginIcon;
                    if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.tvTermsService;
                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            return new o0O0ooO((FrameLayout) viewInflate, stateButton, stateButton2, imageView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
