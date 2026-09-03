package com.billy.android.swipe.refresh;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.billy.android.swipe.OooO;
import com.billy.android.swipe.OooO00o;
import com.billy.android.swipe.OooO0O0;
import com.billy.android.swipe.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public class ClassicHeader extends RelativeLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TextView f9823OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f9824OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageView f9825OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ObjectAnimator f9826OooO0oO;

    public ClassicHeader(Context context) {
        super(context);
        if (isInEditMode()) {
            OooO00o();
        }
    }

    public final void OooO00o() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        LayoutInflater.from(getContext()).inflate(OooO0O0.ssr_classic_header_footer, this);
        if (layoutParams == null) {
            Context context = getContext();
            OooO.OooO00o oooO00o = OooO.f9795OooO00o;
            layoutParams = new ViewGroup.LayoutParams(-1, (int) TypedValue.applyDimension(1, 60, context.getResources().getDisplayMetrics()));
        }
        setLayoutParams(layoutParams);
        if (getBackground() == null) {
            setBackgroundColor(-1118482);
        }
        ImageView imageView = (ImageView) findViewById(OooO00o.ssr_classics_progress);
        this.f9825OooO0o0 = imageView;
        imageView.setVisibility(8);
        TextView textView = (TextView) findViewById(OooO00o.ssr_classics_title);
        this.f9823OooO0Oo = textView;
        textView.setText(OooO0OO.ssr_header_pulling);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f9825OooO0o0, "rotation", 0.0f, 3600.0f);
        this.f9826OooO0oO = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(5000L);
        this.f9826OooO0oO.setInterpolator(null);
        this.f9826OooO0oO.setRepeatCount(-1);
        this.f9826OooO0oO.setRepeatMode(1);
    }

    public View getView() {
        return this;
    }

    public void setText(int i) {
        TextView textView;
        if (this.f9824OooO0o == i || (textView = this.f9823OooO0Oo) == null) {
            return;
        }
        this.f9824OooO0o = i;
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
