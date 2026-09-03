package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.support.emojifaceutil.EmojiEditText;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class hc implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49546OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EmojiEditText f49547OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49548OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f49549OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f49550OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f49551OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f49552OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49553OooO0oo;

    public hc(@NonNull LinearLayout linearLayout, @NonNull EmojiEditText emojiEditText, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull TextView textView) {
        this.f49546OooO00o = linearLayout;
        this.f49547OooO0O0 = emojiEditText;
        this.f49548OooO0OO = imageView;
        this.f49549OooO0Oo = imageView2;
        this.f49551OooO0o0 = imageView3;
        this.f49550OooO0o = imageView4;
        this.f49552OooO0oO = imageView5;
        this.f49553OooO0oo = textView;
    }

    @NonNull
    public static hc OooO00o(@NonNull View view) {
        int i = R.id.etMessage;
        EmojiEditText emojiEditText = (EmojiEditText) o00Oo0.OooO00o(view, R.id.etMessage);
        if (emojiEditText != null) {
            i = R.id.faceRedPoint;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(view, R.id.faceRedPoint);
            if (imageView != null) {
                i = R.id.ivFaceChat;
                ImageView imageView2 = (ImageView) o00Oo0.OooO00o(view, R.id.ivFaceChat);
                if (imageView2 != null) {
                    i = R.id.ivGiftChat;
                    ImageView imageView3 = (ImageView) o00Oo0.OooO00o(view, R.id.ivGiftChat);
                    if (imageView3 != null) {
                        i = R.id.ivSendChat;
                        ImageView imageView4 = (ImageView) o00Oo0.OooO00o(view, R.id.ivSendChat);
                        if (imageView4 != null) {
                            i = R.id.ivVoiceChat;
                            ImageView imageView5 = (ImageView) o00Oo0.OooO00o(view, R.id.ivVoiceChat);
                            if (imageView5 != null) {
                                LinearLayout linearLayout = (LinearLayout) view;
                                i = R.id.tvNotFriend;
                                TextView textView = (TextView) o00Oo0.OooO00o(view, R.id.tvNotFriend);
                                if (textView != null) {
                                    return new hc(linearLayout, emojiEditText, imageView, imageView2, imageView3, imageView4, imageView5, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static hc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49546OooO00o;
    }

    @NonNull
    public static hc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_layout_chat_control, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
