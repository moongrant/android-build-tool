package com.billy.android.swipe.refresh;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p209o00o0oOO.o00O00;
import p209o00o0oOO.o00O000;
import p209o00o0oOO.o00O000o;
import p209o00o0oOO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public class ClassicHeader extends RelativeLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ObjectAnimator f12344Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f12345Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImageView f12346Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f12347Oooo0oo;

    public ClassicHeader(Context context) {
        super(context);
        if (isInEditMode()) {
            OooO00o();
        }
    }

    public final void OooO00o() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        LayoutInflater.from(getContext()).inflate(o00O000o.ssr_classic_header_footer, this);
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, oOO00O.OooO00o(60, getContext()));
        }
        setLayoutParams(layoutParams);
        if (getBackground() == null) {
            setBackgroundColor(-1118482);
        }
        ImageView imageView = (ImageView) findViewById(o00O000.ssr_classics_progress);
        this.f12346Oooo0oO = imageView;
        imageView.setVisibility(8);
        TextView textView = (TextView) findViewById(o00O000.ssr_classics_title);
        this.f12345Oooo0o = textView;
        textView.setText(o00O00.ssr_header_pulling);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f12346Oooo0oO, "rotation", ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 3600.0f);
        this.f12344Oooo = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(5000L);
        this.f12344Oooo.setInterpolator(null);
        this.f12344Oooo.setRepeatCount(-1);
        this.f12344Oooo.setRepeatMode(1);
    }

    public View getView() {
        return this;
    }

    public void setText(int i) {
        TextView textView;
        if (this.f12347Oooo0oo == i || (textView = this.f12345Oooo0o) == null) {
            return;
        }
        this.f12347Oooo0oo = i;
        textView.setText(i);
    }

    public ClassicHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            OooO00o();
        }
    }

    public ClassicHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            OooO00o();
        }
    }

    @TargetApi(21)
    public ClassicHeader(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            OooO00o();
        }
    }
}
