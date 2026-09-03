package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class xb implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50958OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f50959OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f50960OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TopicFollowPostNumberView f50961OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50962OooO0o0;

    public xb(@NonNull ConstraintLayout constraintLayout, @NonNull EditText editText, @NonNull NetImageView netImageView, @NonNull TopicFollowPostNumberView topicFollowPostNumberView, @NonNull TextView textView) {
        this.f50958OooO00o = constraintLayout;
        this.f50959OooO0O0 = editText;
        this.f50960OooO0OO = netImageView;
        this.f50961OooO0Oo = topicFollowPostNumberView;
        this.f50962OooO0o0 = textView;
    }

    @NonNull
    public static xb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50958OooO00o;
    }

    @NonNull
    public static xb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_dialog_share_topic, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.dialog_topic_share_et;
        EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.dialog_topic_share_et);
        if (editText != null) {
            i = R.id.dialog_topic_share_iv_bg;
            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.dialog_topic_share_iv_bg)) != null) {
                i = R.id.dialog_topic_share_nv_head_photo;
                NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.dialog_topic_share_nv_head_photo);
                if (netImageView != null) {
                    i = R.id.dialog_topic_share_tv_count;
                    TopicFollowPostNumberView topicFollowPostNumberView = (TopicFollowPostNumberView) o00Oo0.OooO00o(viewInflate, R.id.dialog_topic_share_tv_count);
                    if (topicFollowPostNumberView != null) {
                        i = R.id.dialog_topic_share_tv_name;
                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.dialog_topic_share_tv_name);
                        if (textView != null) {
                            return new xb((ConstraintLayout) viewInflate, editText, netImageView, topicFollowPostNumberView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
