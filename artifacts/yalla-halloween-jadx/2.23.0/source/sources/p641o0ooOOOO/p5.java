package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class p5 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f58590OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f58591OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58592OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58593OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58594OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58595OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f58596OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58597OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f58598OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58599OooOO0;

    public p5(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f58591OooO00o = relativeLayout;
        this.f58592OooO0O0 = imageView;
        this.f58593OooO0OO = imageView2;
        this.f58594OooO0Oo = imageView3;
        this.f58596OooO0o0 = imageView4;
        this.f58595OooO0o = imageView5;
        this.f58597OooO0oO = linearLayout;
        this.f58598OooO0oo = relativeLayout2;
        this.f58590OooO = textView;
        this.f58599OooOO0 = textView2;
    }

    @NonNull
    public static p5 OooO00o(@NonNull View view) {
        int i = oO00O0oO.ivVoiceCancel;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, view);
        if (imageView != null) {
            i = oO00O0oO.ivVoiceMoveCancel;
            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, view);
            if (imageView2 != null) {
                i = oO00O0oO.ivVoiceRecordLeft;
                ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, view);
                if (imageView3 != null) {
                    i = oO00O0oO.ivVoiceRecordRight;
                    ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, view);
                    if (imageView4 != null) {
                        i = oO00O0oO.ivVoiceSend;
                        ImageView imageView5 = (ImageView) OooOO0.OooO00o(i, view);
                        if (imageView5 != null) {
                            i = oO00O0oO.llVoice;
                            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, view);
                            if (linearLayout != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i = oO00O0oO.tvVoiceCancelTip;
                                TextView textView = (TextView) OooOO0.OooO00o(i, view);
                                if (textView != null) {
                                    i = oO00O0oO.tvVoiceTime;
                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, view);
                                    if (textView2 != null) {
                                        return new p5(relativeLayout, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, relativeLayout, textView, textView2);
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
    public static p5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58591OooO00o;
    }

    @NonNull
    public static p5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_layout_chat_voice, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
