package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.internal.AnalyticsEvents;
import com.squareup.picasso.OooO;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.oo000o;
import com.twitter.sdk.android.core.OooOO0;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.OooO0o;
import com.twitter.sdk.android.core.models.OooOOO0;
import com.twitter.sdk.android.core.models.OooOo;
import com.twitter.sdk.android.tweetui.GalleryActivity;
import com.twitter.sdk.android.tweetui.PlayerActivity;
import com.twitter.sdk.android.tweetui.o000000;
import com.twitter.sdk.android.tweetui.o0000O;
import com.twitter.sdk.android.tweetui.o0000Ooo;
import com.twitter.sdk.android.tweetui.o0OO00O;
import com.twitter.sdk.android.tweetui.o0Oo0oo;
import com.twitter.sdk.android.tweetui.oo0o0Oo;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import o0OOOOO.Oooo000;
import org.jctools.util.Pow2;
import p028Oooo0oO.o0O00o0;
import p347o0OOOOoo.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
public class TweetMediaView extends ViewGroup implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f22371OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OverlayImageView[] f22372OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Path f22373OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public List<MediaEntity> f22374OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final RectF f22375OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f22376OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float[] f22377OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f22378OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f22379OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f22380OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO00o f22381OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooOo f22382OooOOOO;

    public static class OooO00o {
    }

    public static class OooO0O0 implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<ImageView> f22383OooO00o;

        public OooO0O0(OverlayImageView overlayImageView) {
            this.f22383OooO00o = new WeakReference<>(overlayImageView);
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0OO f22384OooO0OO = new OooO0OO(0, 0);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f22385OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f22386OooO0O0;

        public OooO0OO(int i, int i2) {
            this.f22385OooO00o = i;
            this.f22386OooO0O0 = i2;
        }
    }

    public TweetMediaView(Context context) {
        this(context, null);
    }

    public final OverlayImageView OooO00o(int i) {
        OverlayImageView[] overlayImageViewArr = this.f22372OooO0Oo;
        OverlayImageView overlayImageView = overlayImageViewArr[i];
        if (overlayImageView == null) {
            overlayImageView = new OverlayImageView(getContext());
            overlayImageView.setLayoutParams(generateDefaultLayoutParams());
            overlayImageView.setOnClickListener(this);
            overlayImageViewArr[i] = overlayImageView;
            addView(overlayImageView, i);
        } else {
            OooO0OO(i, 0, 0);
            OooO0O0(i, 0, 0, 0, 0);
        }
        overlayImageView.setVisibility(0);
        overlayImageView.setBackgroundColor(this.f22378OooOO0O);
        overlayImageView.setTag(oo0o0Oo.tw__entity_index, Integer.valueOf(i));
        return overlayImageView;
    }

    public final void OooO0O0(int i, int i2, int i3, int i4, int i5) {
        OverlayImageView overlayImageView = this.f22372OooO0Oo[i];
        if (overlayImageView.getLeft() == i2 && overlayImageView.getTop() == i3 && overlayImageView.getRight() == i4 && overlayImageView.getBottom() == i5) {
            return;
        }
        overlayImageView.layout(i2, i3, i4, i5);
    }

    public final void OooO0OO(int i, int i2, int i3) {
        this.f22372OooO0Oo[i].measure(View.MeasureSpec.makeMeasureSpec(i2, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(i3, Pow2.MAX_POW2));
    }

    public final void OooO0Oo(OverlayImageView overlayImageView, String str) {
        this.f22381OooOOO0.getClass();
        Picasso picasso = o0000O.OooO00o().f22443OooO0O0;
        if (picasso == null) {
            return;
        }
        oo000o oo000oVarOooO0Oo = picasso.OooO0Oo(str);
        oo000oVarOooO0Oo.f21852OooO0OO = true;
        oo000oVarOooO0Oo.f21851OooO0O0.f21812OooO0o0 = true;
        int i = this.f22379OooOO0o;
        if (i == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        oo000oVarOooO0Oo.f21853OooO0Oo = i;
        oo000oVarOooO0Oo.OooO0O0(overlayImageView, new OooO0O0(overlayImageView));
    }

    public final void OooO0o(OooOo oooOo, List<MediaEntity> list) {
        if (oooOo == null || list == null || list.isEmpty() || list.equals(this.f22374OooO0o0)) {
            return;
        }
        this.f22382OooOOOO = oooOo;
        this.f22374OooO0o0 = list;
        for (int i = 0; i < this.f22371OooO; i++) {
            OverlayImageView overlayImageView = this.f22372OooO0Oo[i];
            if (overlayImageView != null) {
                overlayImageView.setVisibility(8);
            }
        }
        this.f22371OooO = 0;
        this.f22371OooO = Math.min(4, list.size());
        for (int i2 = 0; i2 < this.f22371OooO; i2++) {
            OverlayImageView overlayImageViewOooO00o = OooO00o(i2);
            MediaEntity mediaEntity = list.get(i2);
            String str = mediaEntity.f22032OooOOo0;
            if (TextUtils.isEmpty(str)) {
                overlayImageViewOooO00o.setContentDescription(getResources().getString(o000000.tw__tweet_media));
            } else {
                overlayImageViewOooO00o.setContentDescription(str);
            }
            OooO0Oo(overlayImageViewOooO00o, this.f22371OooO > 1 ? o0O00o0.OooO0O0(new StringBuilder(), mediaEntity.f22026OooOO0O, ":small") : mediaEntity.f22026OooOO0O);
            if (o00oO0o.OooO0OO(mediaEntity)) {
                overlayImageViewOooO00o.setOverlayDrawable(getContext().getResources().getDrawable(o0OO00O.tw__player_overlay));
            } else {
                overlayImageViewOooO00o.setOverlayDrawable(null);
            }
        }
        this.f22380OooOOO = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO.equals(list.get(0).f22030OooOOOO);
        requestLayout();
    }

    public final void OooO0o0(int i, int i2, int i3, int i4) {
        float f = i;
        float[] fArr = this.f22377OooOO0;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = i2;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = i3;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = i4;
        fArr[6] = f4;
        fArr[7] = f4;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!this.f22380OooOOO) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f22373OooO0o);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        Integer num = (Integer) view.getTag(oo0o0Oo.tw__entity_index);
        boolean z = false;
        if (this.f22374OooO0o0.isEmpty()) {
            OooO0o oooO0o = this.f22382OooOOOO.f22097Oooo00o;
            Intent intent = new Intent(getContext(), (Class<?>) PlayerActivity.class);
            com.twitter.sdk.android.core.models.OooO0OO oooO0OO = oooO0o.f22050OooO00o;
            oooO0OO.getClass();
            try {
                obj = oooO0OO.f22049OooO00o.get("player_stream_url");
            } catch (ClassCastException unused) {
                obj = null;
            }
            intent.putExtra("PLAYER_ITEM", new PlayerActivity.PlayerItem((String) obj, true, false));
            OooOO0.OooO00o(getContext(), intent);
            return;
        }
        MediaEntity mediaEntity = this.f22374OooO0o0.get(num.intValue());
        if (!o00oO0o.OooO0OO(mediaEntity)) {
            if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO.equals(mediaEntity.f22030OooOOOO)) {
                int iIntValue = num.intValue();
                Intent intent2 = new Intent(getContext(), (Class<?>) GalleryActivity.class);
                long j = this.f22382OooOOOO.f22064OooO;
                intent2.putExtra("GALLERY_ITEM", new GalleryActivity.GalleryItem(iIntValue, this.f22374OooO0o0));
                OooOO0.OooO00o(getContext(), intent2);
                return;
            }
            return;
        }
        if (o00oO0o.OooO00o(mediaEntity) != null) {
            Intent intent3 = new Intent(getContext(), (Class<?>) PlayerActivity.class);
            if ("animated_gif".equals(mediaEntity.f22030OooOOOO) || (AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.endsWith(mediaEntity.f22030OooOOOO) && mediaEntity.f22031OooOOOo.f22197OooO0o0 < 6500)) {
                z = true;
            }
            intent3.putExtra("PLAYER_ITEM", new PlayerActivity.PlayerItem(o00oO0o.OooO00o(mediaEntity).f22199OooO0o, z, true ^ "animated_gif".equals(mediaEntity.f22030OooOOOO)));
            OooOO0.OooO00o(getContext(), intent3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f22371OooO > 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i5 = this.f22376OooO0oo;
            int i6 = (measuredWidth - i5) / 2;
            int i7 = (measuredHeight - i5) / 2;
            int i8 = i6 + i5;
            int i9 = this.f22371OooO;
            if (i9 == 1) {
                OooO0O0(0, 0, 0, measuredWidth, measuredHeight);
                return;
            }
            if (i9 == 2) {
                OooO0O0(0, 0, 0, i6, measuredHeight);
                OooO0O0(1, i8, 0, measuredWidth, measuredHeight);
                return;
            }
            if (i9 == 3) {
                OooO0O0(0, 0, 0, i6, measuredHeight);
                OooO0O0(1, i8, 0, measuredWidth, i7);
                OooO0O0(2, i8, i7 + i5, measuredWidth, measuredHeight);
            } else {
                if (i9 != 4) {
                    return;
                }
                OooO0O0(0, 0, 0, i6, i7);
                int i10 = i5 + i7;
                OooO0O0(2, 0, i10, i6, measuredHeight);
                OooO0O0(1, i8, 0, measuredWidth, i7);
                OooO0O0(3, i8, i10, measuredWidth, measuredHeight);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f22371OooO;
        OooO0OO oooO0OO = OooO0OO.f22384OooO0OO;
        if (i3 > 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i4 = this.f22376OooO0oo;
            int i5 = (size - i4) / 2;
            int i6 = (size2 - i4) / 2;
            int i7 = this.f22371OooO;
            if (i7 == 1) {
                OooO0OO(0, size, size2);
            } else if (i7 == 2) {
                OooO0OO(0, i5, size2);
                OooO0OO(1, i5, size2);
            } else if (i7 == 3) {
                OooO0OO(0, i5, size2);
                OooO0OO(1, i5, i6);
                OooO0OO(2, i5, i6);
            } else if (i7 == 4) {
                OooO0OO(0, i5, i6);
                OooO0OO(1, i5, i6);
                OooO0OO(2, i5, i6);
                OooO0OO(3, i5, i6);
            }
            int iMax = Math.max(size, 0);
            int iMax2 = Math.max(size2, 0);
            if (iMax != 0 || iMax2 != 0) {
                oooO0OO = new OooO0OO(iMax, iMax2);
            }
        }
        setMeasuredDimension(oooO0OO.f22385OooO00o, oooO0OO.f22386OooO0O0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.f22373OooO0o;
        path.reset();
        RectF rectF = this.f22375OooO0oO;
        rectF.set(0.0f, 0.0f, i, i2);
        path.addRoundRect(rectF, this.f22377OooOO0, Path.Direction.CW);
        path.close();
    }

    public void setMediaBgColor(int i) {
        this.f22378OooOO0O = i;
    }

    public void setPhotoErrorResId(int i) {
        this.f22379OooOO0o = i;
    }

    public void setTweetMediaClickListener(o0000Ooo o0000ooo) {
    }

    public void setVineCard(OooOo oooOo) {
        OooO0o oooO0o;
        Object obj;
        if (oooOo == null || (oooO0o = oooOo.f22097Oooo00o) == null || !Oooo000.OooO00o(oooO0o)) {
            return;
        }
        this.f22382OooOOOO = oooOo;
        this.f22374OooO0o0 = Collections.emptyList();
        for (int i = 0; i < this.f22371OooO; i++) {
            OverlayImageView overlayImageView = this.f22372OooO0Oo[i];
            if (overlayImageView != null) {
                overlayImageView.setVisibility(8);
            }
        }
        OooO0o oooO0o2 = oooOo.f22097Oooo00o;
        this.f22371OooO = 1;
        OverlayImageView overlayImageViewOooO00o = OooO00o(0);
        com.twitter.sdk.android.core.models.OooO0OO oooO0OO = oooO0o2.f22050OooO00o;
        oooO0OO.getClass();
        try {
            obj = oooO0OO.f22049OooO00o.get("player_image");
        } catch (ClassCastException unused) {
            obj = null;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        String str = oooOOO0.f22063OooO0Oo;
        if (TextUtils.isEmpty(str)) {
            overlayImageViewOooO00o.setContentDescription(getResources().getString(o000000.tw__tweet_media));
        } else {
            overlayImageViewOooO00o.setContentDescription(str);
        }
        OooO0Oo(overlayImageViewOooO00o, oooOOO0.f22062OooO0OO);
        overlayImageViewOooO00o.setOverlayDrawable(getContext().getResources().getDrawable(o0OO00O.tw__player_overlay));
        this.f22380OooOOO = false;
        requestLayout();
    }

    public TweetMediaView(Context context, AttributeSet attributeSet) {
        OooO00o oooO00o = new OooO00o();
        super(context, attributeSet);
        this.f22372OooO0Oo = new OverlayImageView[4];
        this.f22374OooO0o0 = Collections.emptyList();
        this.f22373OooO0o = new Path();
        this.f22375OooO0oO = new RectF();
        this.f22377OooOO0 = new float[8];
        this.f22378OooOO0O = -16777216;
        this.f22381OooOOO0 = oooO00o;
        this.f22376OooO0oo = getResources().getDimensionPixelSize(o0Oo0oo.tw__media_view_divider_size);
        this.f22379OooOO0o = o0OO00O.tw__ic_tweet_photo_error_dark;
    }
}
