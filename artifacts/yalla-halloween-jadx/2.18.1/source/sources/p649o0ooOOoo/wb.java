package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class wb implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50882OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f50883OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f50884OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50885OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50886OooO0o0;

    public wb(@NonNull ConstraintLayout constraintLayout, @NonNull EditText editText, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f50882OooO00o = constraintLayout;
        this.f50883OooO0O0 = editText;
        this.f50884OooO0OO = netImageView;
        this.f50885OooO0Oo = textView;
        this.f50886OooO0o0 = textView2;
    }

    @NonNull
    public static wb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50882OooO00o;
    }

    @NonNull
    public static wb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_dialog_share_room, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.et_share_room;
        EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.et_share_room);
        if (editText != null) {
            i = R.id.fl_share_room;
            if (((FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.fl_share_room)) != null) {
                i = R.id.nv_share_room_head_photo;
                NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.nv_share_room_head_photo);
                if (netImageView != null) {
                    i = R.id.tv_share_room_id;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_share_room_id);
                    if (textView != null) {
                        i = R.id.tv_share_room_name;
                        TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_share_room_name);
                        if (textView2 != null) {
                            return new wb((ConstraintLayout) viewInflate, editText, netImageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
