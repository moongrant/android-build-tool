package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o0oO implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f45232OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f45233OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f45234OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f45235OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f45236OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f45237OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f45238OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45239OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f45240OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45241OooOO0;

    public oOo0o0oO(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f45233OooO00o = relativeLayout;
        this.f45234OooO0O0 = imageView;
        this.f45235OooO0OO = imageView2;
        this.f45236OooO0Oo = imageView3;
        this.f45238OooO0o0 = imageView4;
        this.f45237OooO0o = imageView5;
        this.f45239OooO0oO = linearLayout;
        this.f45240OooO0oo = relativeLayout2;
        this.f45232OooO = textView;
        this.f45241OooOO0 = textView2;
    }

    @NonNull
    public static oOo0o0oO OooO00o(@NonNull View view) {
        int i = o0OO00O.ivVoiceCancel;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, view);
        if (imageView != null) {
            i = o0OO00O.ivVoiceMoveCancel;
            ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, view);
            if (imageView2 != null) {
                i = o0OO00O.ivVoiceRecordLeft;
                ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, view);
                if (imageView3 != null) {
                    i = o0OO00O.ivVoiceRecordRight;
                    ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, view);
                    if (imageView4 != null) {
                        i = o0OO00O.ivVoiceSend;
                        ImageView imageView5 = (ImageView) OooO0O0.OooO00o(i, view);
                        if (imageView5 != null) {
                            i = o0OO00O.llVoice;
                            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, view);
                            if (linearLayout != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i = o0OO00O.tvVoiceCancelTip;
                                TextView textView = (TextView) OooO0O0.OooO00o(i, view);
                                if (textView != null) {
                                    i = o0OO00O.tvVoiceTime;
                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, view);
                                    if (textView2 != null) {
                                        return new oOo0o0oO(relativeLayout, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, relativeLayout, textView, textView2);
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
    public static oOo0o0oO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45233OooO00o;
    }

    @NonNull
    public static oOo0o0oO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_layout_chat_voice, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
