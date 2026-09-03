package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45690OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f45691OooO0O0;

    public y(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView) {
        this.f45690OooO00o = frameLayout;
        this.f45691OooO0O0 = imageView;
    }

    @NonNull
    public static y inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45690OooO00o;
    }

    @NonNull
    public static y inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_dialog_vote_game_rule, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivClose;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.tvContent1;
            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.tvContent2;
                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.tvContent3;
                    if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.tvContent4;
                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.tvContent5;
                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                i = o0OO00O.tvTitle;
                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                    return new y((FrameLayout) viewInflate, imageView);
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
