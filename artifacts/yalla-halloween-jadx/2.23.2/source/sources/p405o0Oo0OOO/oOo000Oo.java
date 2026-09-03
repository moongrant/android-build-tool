package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000Oo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45200OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f45201OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f45202OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f45203OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f45204OooO0o0;

    public oOo000Oo(@NonNull ConstraintLayout constraintLayout, @NonNull EditText editText, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f45200OooO00o = constraintLayout;
        this.f45201OooO0O0 = editText;
        this.f45202OooO0OO = netImageView;
        this.f45203OooO0Oo = textView;
        this.f45204OooO0o0 = textView2;
    }

    @NonNull
    public static oOo000Oo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45200OooO00o;
    }

    @NonNull
    public static oOo000Oo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_dialog_share_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.dialog_activity_share_et;
        EditText editText = (EditText) OooO0O0.OooO00o(i, viewInflate);
        if (editText != null) {
            i = o0OO00O.dialog_activity_share_nv_head_photo;
            NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
            if (netImageView != null) {
                i = o0OO00O.dialog_activity_share_tv1;
                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView != null) {
                    i = o0OO00O.dialog_activity_share_tv2;
                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        i = o0OO00O.dialog_post_share_fl;
                        if (((ConstraintLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            return new oOo000Oo((ConstraintLayout) viewInflate, editText, netImageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
