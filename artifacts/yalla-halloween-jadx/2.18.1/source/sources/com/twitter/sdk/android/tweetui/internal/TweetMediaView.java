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
import com.squareup.picasso.Picasso;
import com.squareup.picasso.o000oOoO;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.tweetui.GalleryActivity;
import com.twitter.sdk.android.tweetui.PlayerActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p058o0000OoO.OooO;
import p418o0Oo0oo.oo000o;
import p420o0Oo0ooO.oO00Oo00;
import p436o0OoOOOO.o0O000Oo;
import p436o0OoOOOO.o0O00O0o;
import p436o0OoOOOO.o0O00OOO;
import p438o0OoOOo.o000O0o;
import p439o0OoOOo0.o00;
import p439o0OoOOo0.o000OO00;
import p439o0OoOOo0.o000OOo0;
import p439o0OoOOo0.o00O00OO;
import p439o0OoOOo0.o00O0OO0;
import p439o0OoOOo0.o00oOoo;
import p440o0OoOOoO.o0OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public class TweetMediaView extends ViewGroup implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final RectF f20175Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OverlayImageView[] f20176Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<MediaEntity> f20177Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Path f20178Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f20179OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f20180OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f20181OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final float[] f20182OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f20183OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f20184OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public o00O00OO f20185OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public o0O00OOO f20186OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final OooO00o f20187o000oOoO;

    public static class OooO00o {
    }

    public static class OooO0O0 implements oO00Oo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<ImageView> f20188OooO00o;

        public OooO0O0(ImageView imageView) {
            this.f20188OooO00o = new WeakReference<>(imageView);
        }
    }

    public TweetMediaView(Context context) {
        this(context, null);
    }

    public final void OooO(o0O00OOO o0o00ooo2, List<MediaEntity> list) {
        if (o0o00ooo2 == null || list == null || list.isEmpty() || list.equals(this.f20177Oooo0oO)) {
            return;
        }
        this.f20186OoooOo0 = o0o00ooo2;
        this.f20177Oooo0oO = list;
        OooO00o();
        this.f20180OoooO0 = Math.min(4, list.size());
        for (int i = 0; i < this.f20180OoooO0; i++) {
            OverlayImageView overlayImageViewOooO0O0 = OooO0O0(i);
            MediaEntity mediaEntity = list.get(i);
            OooO0o0(overlayImageViewOooO0O0, mediaEntity.f19996OoooOoO);
            OooO0o(overlayImageViewOooO0O0, this.f20180OoooO0 > 1 ? OooO.OooO00o(new StringBuilder(), mediaEntity.f19988OoooO, ":small") : mediaEntity.f19988OoooO);
            OooO0oO(overlayImageViewOooO0O0, o000O0o.OooO0o0(mediaEntity));
        }
        this.f20184OoooOOO = o000O0o.OooO0Oo(list.get(0));
        requestLayout();
    }

    public final void OooO00o() {
        for (int i = 0; i < this.f20180OoooO0; i++) {
            OverlayImageView overlayImageView = this.f20176Oooo0o[i];
            if (overlayImageView != null) {
                overlayImageView.setVisibility(8);
            }
        }
        this.f20180OoooO0 = 0;
    }

    public final OverlayImageView OooO0O0(int i) {
        OverlayImageView overlayImageView = this.f20176Oooo0o[i];
        if (overlayImageView == null) {
            overlayImageView = new OverlayImageView(getContext());
            overlayImageView.setLayoutParams(generateDefaultLayoutParams());
            overlayImageView.setOnClickListener(this);
            this.f20176Oooo0o[i] = overlayImageView;
            addView(overlayImageView, i);
        } else {
            OooO0Oo(i, 0, 0);
            OooO0OO(i, 0, 0, 0, 0);
        }
        overlayImageView.setVisibility(0);
        overlayImageView.setBackgroundColor(this.f20179OoooO);
        overlayImageView.setTag(o00.tw__entity_index, Integer.valueOf(i));
        return overlayImageView;
    }

    public final void OooO0OO(int i, int i2, int i3, int i4, int i5) {
        OverlayImageView overlayImageView = this.f20176Oooo0o[i];
        if (overlayImageView.getLeft() == i2 && overlayImageView.getTop() == i3 && overlayImageView.getRight() == i4 && overlayImageView.getBottom() == i5) {
            return;
        }
        overlayImageView.layout(i2, i3, i4, i5);
    }

    public final void OooO0Oo(int i, int i2, int i3) {
        this.f20176Oooo0o[i].measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public final void OooO0o(ImageView imageView, String str) {
        Objects.requireNonNull(this.f20187o000oOoO);
        Picasso picasso = o00O0OO0.OooO00o().f40175OooO0O0;
        if (picasso == null) {
            return;
        }
        o000oOoO o000ooooOooO0Oo = picasso.OooO0Oo(str);
        o000ooooOooO0Oo.f19817OooO0OO = true;
        o000ooooOooO0Oo.f19816OooO0O0.f19787OooO0o0 = true;
        int i = this.f20183OoooOO0;
        if (i == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        o000ooooOooO0Oo.f19818OooO0Oo = i;
        o000ooooOooO0Oo.OooO0O0(imageView, new OooO0O0(imageView));
    }

    public final void OooO0o0(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            imageView.setContentDescription(getResources().getString(o00oOoo.tw__tweet_media));
        } else {
            imageView.setContentDescription(str);
        }
    }

    public final void OooO0oO(OverlayImageView overlayImageView, boolean z) {
        if (z) {
            overlayImageView.setOverlayDrawable(getContext().getResources().getDrawable(o000OOo0.tw__player_overlay));
        } else {
            overlayImageView.setOverlayDrawable(null);
        }
    }

    public final void OooO0oo(int i, int i2, int i3, int i4) {
        float[] fArr = this.f20182OoooO0O;
        float f = i;
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
        if (!this.f20184OoooOOO) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f20178Oooo0oo);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num = (Integer) view.getTag(o00.tw__entity_index);
        if (this.f20185OoooOOo != null) {
            if (!this.f20177Oooo0oO.isEmpty()) {
                this.f20177Oooo0oO.get(num.intValue());
            }
            this.f20185OoooOOo.OooO00o();
            return;
        }
        boolean z = false;
        if (this.f20177Oooo0oO.isEmpty()) {
            o0O000Oo o0o000oo2 = this.f20186OoooOo0.f40035Oooo00o;
            Intent intent = new Intent(getContext(), (Class<?>) PlayerActivity.class);
            intent.putExtra("PLAYER_ITEM", new PlayerActivity.PlayerItem((String) o0o000oo2.f39979OooO00o.OooO00o("player_stream_url"), true, false));
            oo000o.OooO0OO(getContext(), intent);
            return;
        }
        MediaEntity mediaEntity = this.f20177Oooo0oO.get(num.intValue());
        if (!o000O0o.OooO0o0(mediaEntity)) {
            if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO.equals(mediaEntity.f19994OoooOOo)) {
                int iIntValue = num.intValue();
                Intent intent2 = new Intent(getContext(), (Class<?>) GalleryActivity.class);
                intent2.putExtra("GALLERY_ITEM", new GalleryActivity.GalleryItem(this.f20186OoooOo0.f40002OooO, iIntValue, this.f20177Oooo0oO));
                oo000o.OooO0OO(getContext(), intent2);
                return;
            }
            return;
        }
        if (o000O0o.OooO0O0(mediaEntity) != null) {
            Intent intent3 = new Intent(getContext(), (Class<?>) PlayerActivity.class);
            if ("animated_gif".equals(mediaEntity.f19994OoooOOo) || (AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.endsWith(mediaEntity.f19994OoooOOo) && mediaEntity.f19995OoooOo0.f20056Oooo0oO < 6500)) {
                z = true;
            }
            intent3.putExtra("PLAYER_ITEM", new PlayerActivity.PlayerItem(o000O0o.OooO0O0(mediaEntity).f20060Oooo0oo, z, !"animated_gif".equals(mediaEntity.f19994OoooOOo)));
            oo000o.OooO0OO(getContext(), intent3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f20180OoooO0 > 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i5 = this.f20181OoooO00;
            int i6 = (measuredWidth - i5) / 2;
            int i7 = (measuredHeight - i5) / 2;
            int i8 = i5 + i6;
            int i9 = this.f20180OoooO0;
            if (i9 == 1) {
                OooO0OO(0, 0, 0, measuredWidth, measuredHeight);
                return;
            }
            if (i9 == 2) {
                OooO0OO(0, 0, 0, i6, measuredHeight);
                OooO0OO(1, i6 + this.f20181OoooO00, 0, measuredWidth, measuredHeight);
                return;
            }
            if (i9 == 3) {
                OooO0OO(0, 0, 0, i6, measuredHeight);
                OooO0OO(1, i8, 0, measuredWidth, i7);
                OooO0OO(2, i8, i7 + this.f20181OoooO00, measuredWidth, measuredHeight);
            } else {
                if (i9 != 4) {
                    return;
                }
                OooO0OO(0, 0, 0, i6, i7);
                OooO0OO(2, 0, i7 + this.f20181OoooO00, i6, measuredHeight);
                OooO0OO(1, i8, 0, measuredWidth, i7);
                OooO0OO(3, i8, i7 + this.f20181OoooO00, measuredWidth, measuredHeight);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        OooO0OO oooO0OO;
        if (this.f20180OoooO0 > 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i3 = this.f20181OoooO00;
            int i4 = (size - i3) / 2;
            int i5 = (size2 - i3) / 2;
            int i6 = this.f20180OoooO0;
            if (i6 == 1) {
                OooO0Oo(0, size, size2);
            } else if (i6 == 2) {
                OooO0Oo(0, i4, size2);
                OooO0Oo(1, i4, size2);
            } else if (i6 == 3) {
                OooO0Oo(0, i4, size2);
                OooO0Oo(1, i4, i5);
                OooO0Oo(2, i4, i5);
            } else if (i6 == 4) {
                OooO0Oo(0, i4, i5);
                OooO0Oo(1, i4, i5);
                OooO0Oo(2, i4, i5);
                OooO0Oo(3, i4, i5);
            }
            int iMax = Math.max(size, 0);
            int iMax2 = Math.max(size2, 0);
            oooO0OO = (iMax == 0 && iMax2 == 0) ? OooO0OO.f20189OooO0OO : new OooO0OO(iMax, iMax2);
        } else {
            oooO0OO = OooO0OO.f20189OooO0OO;
        }
        setMeasuredDimension(oooO0OO.f20190OooO00o, oooO0OO.f20191OooO0O0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f20178Oooo0oo.reset();
        this.f20175Oooo.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i, i2);
        this.f20178Oooo0oo.addRoundRect(this.f20175Oooo, this.f20182OoooO0O, Path.Direction.CW);
        this.f20178Oooo0oo.close();
    }

    public void setMediaBgColor(int i) {
        this.f20179OoooO = i;
    }

    public void setPhotoErrorResId(int i) {
        this.f20183OoooOO0 = i;
    }

    public void setTweetMediaClickListener(o00O00OO o00o00oo2) {
        this.f20185OoooOOo = o00o00oo2;
    }

    public void setVineCard(o0O00OOO o0o00ooo2) {
        o0O000Oo o0o000oo2;
        if (o0o00ooo2 == null || (o0o000oo2 = o0o00ooo2.f40035Oooo00o) == null || !o0OO0O0.OooO0Oo(o0o000oo2)) {
            return;
        }
        this.f20186OoooOo0 = o0o00ooo2;
        this.f20177Oooo0oO = Collections.emptyList();
        OooO00o();
        o0O000Oo o0o000oo3 = o0o00ooo2.f40035Oooo00o;
        this.f20180OoooO0 = 1;
        OverlayImageView overlayImageViewOooO0O0 = OooO0O0(0);
        o0O00O0o o0o00o0o = (o0O00O0o) o0o000oo3.f39979OooO00o.OooO00o("player_image");
        OooO0o0(overlayImageViewOooO0O0, o0o00o0o.f39990OooO0Oo);
        OooO0o(overlayImageViewOooO0O0, o0o00o0o.f39989OooO0OO);
        OooO0oO(overlayImageViewOooO0O0, true);
        this.f20184OoooOOO = false;
        requestLayout();
    }

    public TweetMediaView(Context context, AttributeSet attributeSet) {
        OooO00o oooO00o = new OooO00o();
        super(context, attributeSet);
        this.f20176Oooo0o = new OverlayImageView[4];
        this.f20177Oooo0oO = Collections.emptyList();
        this.f20178Oooo0oo = new Path();
        this.f20175Oooo = new RectF();
        this.f20182OoooO0O = new float[8];
        this.f20179OoooO = -16777216;
        this.f20187o000oOoO = oooO00o;
        this.f20181OoooO00 = getResources().getDimensionPixelSize(o000OO00.tw__media_view_divider_size);
        this.f20183OoooOO0 = o000OOo0.tw__ic_tweet_photo_error_dark;
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0OO f20189OooO0OO = new OooO0OO();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f20190OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f20191OooO0O0;

        public OooO0OO() {
            this.f20190OooO00o = 0;
            this.f20191OooO0O0 = 0;
        }

        public OooO0OO(int i, int i2) {
            this.f20190OooO00o = i;
            this.f20191OooO0O0 = i2;
        }
    }
}
