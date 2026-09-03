package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44178OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatButton f44179OooO0O0;

    public n(@NonNull FrameLayout frameLayout, @NonNull AppCompatButton appCompatButton) {
        this.f44178OooO00o = frameLayout;
        this.f44179OooO0O0 = appCompatButton;
    }

    @NonNull
    public static n inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44178OooO00o;
    }

    @NonNull
    public static n inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_dialog_mora_game_rules, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.content1;
        if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.content2;
            if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.content3;
                if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.content4;
                    if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.content5;
                        if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.image;
                            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                i = o0OO00O.ok;
                                AppCompatButton appCompatButton = (AppCompatButton) OooO0O0.OooO00o(i, viewInflate);
                                if (appCompatButton != null) {
                                    i = o0OO00O.title;
                                    if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                        return new n((FrameLayout) viewInflate, appCompatButton);
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
