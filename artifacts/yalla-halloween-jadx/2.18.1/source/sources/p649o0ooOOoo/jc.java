package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class jc implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f49743OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f49744OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49745OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49746OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f49747OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f49748OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f49749OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49750OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f49751OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49752OooOO0;

    public jc(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f49744OooO00o = relativeLayout;
        this.f49745OooO0O0 = imageView;
        this.f49746OooO0OO = imageView2;
        this.f49747OooO0Oo = imageView3;
        this.f49749OooO0o0 = imageView4;
        this.f49748OooO0o = imageView5;
        this.f49750OooO0oO = linearLayout;
        this.f49751OooO0oo = relativeLayout2;
        this.f49743OooO = textView;
        this.f49752OooOO0 = textView2;
    }

    @NonNull
    public static jc OooO00o(@NonNull View view) {
        int i = R.id.ivVoiceCancel;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(view, R.id.ivVoiceCancel);
        if (imageView != null) {
            i = R.id.ivVoiceMoveCancel;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(view, R.id.ivVoiceMoveCancel);
            if (imageView2 != null) {
                i = R.id.ivVoiceRecordLeft;
                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(view, R.id.ivVoiceRecordLeft);
                if (imageView3 != null) {
                    i = R.id.ivVoiceRecordRight;
                    ImageView imageView4 = (ImageView) o00Oo0.OooO00o(view, R.id.ivVoiceRecordRight);
                    if (imageView4 != null) {
                        i = R.id.ivVoiceSend;
                        ImageView imageView5 = (ImageView) o00Oo0.OooO00o(view, R.id.ivVoiceSend);
                        if (imageView5 != null) {
                            i = R.id.llVoice;
                            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(view, R.id.llVoice);
                            if (linearLayout != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i = R.id.tvVoiceCancelTip;
                                TextView textView = (TextView) o00Oo0.OooO00o(view, R.id.tvVoiceCancelTip);
                                if (textView != null) {
                                    i = R.id.tvVoiceTime;
                                    TextView textView2 = (TextView) o00Oo0.OooO00o(view, R.id.tvVoiceTime);
                                    if (textView2 != null) {
                                        return new jc(relativeLayout, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, relativeLayout, textView, textView2);
                                    }
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
    public static jc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49744OooO00o;
    }

    @NonNull
    public static jc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_layout_chat_voice, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
