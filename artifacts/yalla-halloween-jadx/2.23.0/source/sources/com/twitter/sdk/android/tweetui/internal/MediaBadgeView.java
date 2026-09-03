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
import com.facebook.internal.AnalyticsEvents;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.OooO0o;
import com.twitter.sdk.android.core.models.VideoInfo;
import com.twitter.sdk.android.tweetui.o0O0O00;
import com.twitter.sdk.android.tweetui.o0OO00O;
import com.twitter.sdk.android.tweetui.oo0o0Oo;
import o0OOOOO.Oooo000;
import p347o0OOOOoo.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
public class MediaBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TextView f22345OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ImageView f22346OooO0o0;

    public MediaBadgeView(Context context) {
        this(context, null);
    }

    public void setBadge(Drawable drawable) {
        this.f22346OooO0o0.setVisibility(0);
        this.f22345OooO0Oo.setVisibility(8);
        this.f22346OooO0o0.setImageDrawable(drawable);
    }

    public void setCard(OooO0o oooO0o) {
        if (Oooo000.OooO00o(oooO0o)) {
            setBadge(getResources().getDrawable(o0OO00O.tw__vine_badge));
        } else {
            this.f22345OooO0Oo.setVisibility(8);
            this.f22346OooO0o0.setVisibility(8);
        }
    }

    public void setMediaEntity(MediaEntity mediaEntity) {
        if ("animated_gif".equals(mediaEntity.f22030OooOOOO)) {
            setBadge(getResources().getDrawable(o0OO00O.tw__gif_badge));
        } else if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.equals(mediaEntity.f22030OooOOOO)) {
            VideoInfo videoInfo = mediaEntity.f22031OooOOOo;
            setText(videoInfo == null ? 0L : videoInfo.f22197OooO0o0);
        } else {
            this.f22345OooO0Oo.setVisibility(8);
            this.f22346OooO0o0.setVisibility(8);
        }
    }

    public void setText(long j) {
        this.f22345OooO0Oo.setVisibility(0);
        this.f22346OooO0o0.setVisibility(8);
        this.f22345OooO0Oo.setText(o0OoOo0.OooO00o(j));
    }

    public MediaBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(o0O0O00.tw__media_badge, (ViewGroup) this, true);
        this.f22345OooO0Oo = (TextView) viewInflate.findViewById(oo0o0Oo.tw__video_duration);
        this.f22346OooO0o0 = (ImageView) viewInflate.findViewById(oo0o0Oo.tw__gif_badge);
    }
}
