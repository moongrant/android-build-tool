package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.netimage.NetImageView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000o0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45205OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f45206OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f45207OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f45208OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f45209OooO0o0;

    public oOo000o0(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.f45205OooO00o = linearLayout;
        this.f45206OooO0O0 = editText;
        this.f45207OooO0OO = netImageView;
        this.f45208OooO0Oo = textView;
        this.f45209OooO0o0 = imageView;
    }

    @NonNull
    public static oOo000o0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45205OooO00o;
    }

    @NonNull
    public static oOo000o0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_dialog_share_post, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.dialog_post_share_et;
        EditText editText = (EditText) OooO0O0.OooO00o(i, viewInflate);
        if (editText != null) {
            i = o0OO00O.dialog_post_share_fl;
            if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.dialog_post_share_nv_head_photo;
                NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    i = o0OO00O.dialog_post_share_tv_name;
                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = o0OO00O.ivVideo;
                        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView != null) {
                            return new oOo000o0((LinearLayout) viewInflate, editText, netImageView, textView, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
