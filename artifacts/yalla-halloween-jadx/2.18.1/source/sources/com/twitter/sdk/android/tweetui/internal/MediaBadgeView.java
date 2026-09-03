package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.o00O0;
import com.facebook.internal.AnalyticsEvents;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.VideoInfo;
import p436o0OoOOOO.o0O000Oo;
import p439o0OoOOo0.o00;
import p439o0OoOOo0.o000OOo0;
import p439o0OoOOo0.o00O0000;
import p440o0OoOOoO.o0OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public class MediaBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f20149Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImageView f20150Oooo0oO;

    public MediaBadgeView(Context context) {
        this(context, null);
    }

    public void setBadge(Drawable drawable) {
        this.f20150Oooo0oO.setVisibility(0);
        this.f20149Oooo0o.setVisibility(8);
        this.f20150Oooo0oO.setImageDrawable(drawable);
    }

    public void setCard(o0O000Oo o0o000oo2) {
        if (o0OO0O0.OooO0Oo(o0o000oo2)) {
            setBadge(getResources().getDrawable(o000OOo0.tw__vine_badge));
        } else {
            this.f20149Oooo0o.setVisibility(8);
            this.f20150Oooo0oO.setVisibility(8);
        }
    }

    public void setMediaEntity(MediaEntity mediaEntity) {
        if ("animated_gif".equals(mediaEntity.f19994OoooOOo)) {
            setBadge(getResources().getDrawable(o000OOo0.tw__gif_badge));
        } else if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.equals(mediaEntity.f19994OoooOOo)) {
            VideoInfo videoInfo = mediaEntity.f19995OoooOo0;
            setText(videoInfo == null ? 0L : videoInfo.f20056Oooo0oO);
        } else {
            this.f20149Oooo0o.setVisibility(8);
            this.f20150Oooo0oO.setVisibility(8);
        }
    }

    public void setText(long j) {
        this.f20149Oooo0o.setVisibility(0);
        this.f20150Oooo0oO.setVisibility(8);
        this.f20149Oooo0o.setText(o00O0.OooO0Oo(j));
    }

    public MediaBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(o00O0000.tw__media_badge, (ViewGroup) this, true);
        this.f20149Oooo0o = (TextView) viewInflate.findViewById(o00.tw__video_duration);
        this.f20150Oooo0oO = (ImageView) viewInflate.findViewById(o00.tw__gif_badge);
    }
}
