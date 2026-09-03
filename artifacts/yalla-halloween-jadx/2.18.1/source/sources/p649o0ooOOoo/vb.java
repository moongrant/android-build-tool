package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class vb implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50802OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f50803OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f50804OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50805OooO0Oo;

    public vb(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull NetImageView netImageView, @NonNull TextView textView) {
        this.f50802OooO00o = linearLayout;
        this.f50803OooO0O0 = editText;
        this.f50804OooO0OO = netImageView;
        this.f50805OooO0Oo = textView;
    }

    @NonNull
    public static vb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50802OooO00o;
    }

    @NonNull
    public static vb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_dialog_share_post, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.dialog_post_share_et;
        EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.dialog_post_share_et);
        if (editText != null) {
            i = R.id.dialog_post_share_fl;
            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.dialog_post_share_fl)) != null) {
                i = R.id.dialog_post_share_nv_head_photo;
                NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.dialog_post_share_nv_head_photo);
                if (netImageView != null) {
                    i = R.id.dialog_post_share_tv_name;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.dialog_post_share_tv_name);
                    if (textView != null) {
                        return new vb((LinearLayout) viewInflate, editText, netImageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
