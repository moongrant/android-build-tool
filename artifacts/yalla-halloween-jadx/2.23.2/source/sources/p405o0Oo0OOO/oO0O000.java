package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44851OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f44852OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f44853OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TopicFollowPostNumberView f44854OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44855OooO0o0;

    public oO0O000(@NonNull ConstraintLayout constraintLayout, @NonNull EditText editText, @NonNull NetImageView netImageView, @NonNull TopicFollowPostNumberView topicFollowPostNumberView, @NonNull TextView textView) {
        this.f44851OooO00o = constraintLayout;
        this.f44852OooO0O0 = editText;
        this.f44853OooO0OO = netImageView;
        this.f44854OooO0Oo = topicFollowPostNumberView;
        this.f44855OooO0o0 = textView;
    }

    @NonNull
    public static oO0O000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44851OooO00o;
    }

    @NonNull
    public static oO0O000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_dialog_share_topic, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.dialog_topic_share_et;
        EditText editText = (EditText) OooO0O0.OooO00o(i, viewInflate);
        if (editText != null) {
            i = o0OO00O.dialog_topic_share_iv_bg;
            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.dialog_topic_share_nv_head_photo;
                NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    i = o0OO00O.dialog_topic_share_tv_count;
                    TopicFollowPostNumberView topicFollowPostNumberView = (TopicFollowPostNumberView) OooO0O0.OooO00o(i, viewInflate);
                    if (topicFollowPostNumberView != null) {
                        i = o0OO00O.dialog_topic_share_tv_name;
                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            return new oO0O000((ConstraintLayout) viewInflate, editText, netImageView, topicFollowPostNumberView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
