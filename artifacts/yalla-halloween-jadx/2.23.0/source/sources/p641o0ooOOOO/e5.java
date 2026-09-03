package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class e5 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57814OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f57815OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f57816OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TopicFollowPostNumberView f57817OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f57818OooO0o0;

    public e5(@NonNull ConstraintLayout constraintLayout, @NonNull EditText editText, @NonNull NetImageView netImageView, @NonNull TopicFollowPostNumberView topicFollowPostNumberView, @NonNull TextView textView) {
        this.f57814OooO00o = constraintLayout;
        this.f57815OooO0O0 = editText;
        this.f57816OooO0OO = netImageView;
        this.f57817OooO0Oo = topicFollowPostNumberView;
        this.f57818OooO0o0 = textView;
    }

    @NonNull
    public static e5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57814OooO00o;
    }

    @NonNull
    public static e5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_dialog_share_topic, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.dialog_topic_share_et;
        EditText editText = (EditText) OooOO0.OooO00o(i, viewInflate);
        if (editText != null) {
            i = oO00O0oO.dialog_topic_share_iv_bg;
            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.dialog_topic_share_nv_head_photo;
                NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    i = oO00O0oO.dialog_topic_share_tv_count;
                    TopicFollowPostNumberView topicFollowPostNumberView = (TopicFollowPostNumberView) OooOO0.OooO00o(i, viewInflate);
                    if (topicFollowPostNumberView != null) {
                        i = oO00O0oO.dialog_topic_share_tv_name;
                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            return new e5((ConstraintLayout) viewInflate, editText, netImageView, topicFollowPostNumberView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
