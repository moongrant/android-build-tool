package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class VideoView extends SurfaceView implements VideoControlView.OooO0O0 {

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public static final /* synthetic */ int f20199o00Oo0 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f20200Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f20201Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Uri f20202Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f20203Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f20204OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public MediaPlayer f20205OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public SurfaceHolder f20206OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f20207OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f20208OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f20209OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public VideoControlView f20210OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f20211OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public MediaPlayer.OnPreparedListener f20212OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f20213OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public MediaPlayer.OnErrorListener f20214Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public MediaPlayer.OnInfoListener f20215Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f20216OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f20217OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public OooO00o f20218OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public OooO0OO f20219Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public OooO0O0 f20220Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public OooO0o f20221OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public OooO f20222Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f20223o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public OooOOO0 f20224o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public OooOO0 f20225o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public GestureDetector f20226ooOO;

    public class OooO implements MediaPlayer.OnErrorListener {
        public OooO() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Log.d(VideoView.this.f20201Oooo0o, "Error: " + i + "," + i2);
            VideoView videoView = VideoView.this;
            videoView.f20203Oooo0oo = -1;
            videoView.f20200Oooo = -1;
            VideoControlView videoControlView = videoView.f20210OoooOOo;
            if (videoControlView != null) {
                videoControlView.OooO00o();
            }
            VideoView videoView2 = VideoView.this;
            MediaPlayer.OnErrorListener onErrorListener = videoView2.f20214Ooooo00;
            if (onErrorListener != null) {
                onErrorListener.onError(videoView2.f20205OoooO0, i, i2);
            }
            return true;
        }
    }

    public class OooO00o implements MediaPlayer.OnVideoSizeChangedListener {
        public OooO00o() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            VideoView.this.f20204OoooO = mediaPlayer.getVideoWidth();
            VideoView.this.f20208OoooOO0 = mediaPlayer.getVideoHeight();
            VideoView videoView = VideoView.this;
            if (videoView.f20204OoooO == 0 || videoView.f20208OoooOO0 == 0) {
                return;
            }
            SurfaceHolder holder = videoView.getHolder();
            VideoView videoView2 = VideoView.this;
            holder.setFixedSize(videoView2.f20204OoooO, videoView2.f20208OoooOO0);
            VideoView.this.requestLayout();
        }
    }

    public class OooO0O0 implements MediaPlayer.OnPreparedListener {
        public OooO0O0() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            VideoControlView videoControlView;
            VideoView videoView = VideoView.this;
            videoView.f20203Oooo0oo = 2;
            MediaPlayer.OnPreparedListener onPreparedListener = videoView.f20212OoooOoO;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(videoView.f20205OoooO0);
            }
            VideoControlView videoControlView2 = VideoView.this.f20210OoooOOo;
            if (videoControlView2 != null) {
                videoControlView2.setEnabled(true);
            }
            VideoView.this.f20204OoooO = mediaPlayer.getVideoWidth();
            VideoView.this.f20208OoooOO0 = mediaPlayer.getVideoHeight();
            VideoView videoView2 = VideoView.this;
            int i = videoView2.f20216OooooO0;
            if (i != 0) {
                videoView2.OooO0oo(i);
            }
            VideoView videoView3 = VideoView.this;
            if (videoView3.f20204OoooO == 0 || videoView3.f20208OoooOO0 == 0) {
                if (videoView3.f20200Oooo == 3) {
                    videoView3.OooO();
                    return;
                }
                return;
            }
            SurfaceHolder holder = videoView3.getHolder();
            VideoView videoView4 = VideoView.this;
            holder.setFixedSize(videoView4.f20204OoooO, videoView4.f20208OoooOO0);
            VideoView videoView5 = VideoView.this;
            if (videoView5.f20223o000oOoO == videoView5.f20204OoooO && videoView5.f20209OoooOOO == videoView5.f20208OoooOO0) {
                if (videoView5.f20200Oooo == 3) {
                    videoView5.OooO();
                    VideoControlView videoControlView3 = VideoView.this.f20210OoooOOo;
                    if (videoControlView3 != null) {
                        videoControlView3.OooO0OO();
                        return;
                    }
                    return;
                }
                if (videoView5.OooO0Oo()) {
                    return;
                }
                if ((i != 0 || VideoView.this.getCurrentPosition() > 0) && (videoControlView = VideoView.this.f20210OoooOOo) != null) {
                    videoControlView.OooO0OO();
                }
            }
        }
    }

    public class OooO0OO implements MediaPlayer.OnCompletionListener {
        public OooO0OO() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            VideoView videoView = VideoView.this;
            videoView.f20203Oooo0oo = 5;
            videoView.f20200Oooo = 5;
            MediaPlayer.OnCompletionListener onCompletionListener = videoView.f20211OoooOo0;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(videoView.f20205OoooO0);
            }
        }
    }

    public class OooO0o implements MediaPlayer.OnInfoListener {
        public OooO0o() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            MediaPlayer.OnInfoListener onInfoListener = VideoView.this.f20215Ooooo0o;
            if (onInfoListener == null) {
                return true;
            }
            onInfoListener.onInfo(mediaPlayer, i, i2);
            return true;
        }
    }

    public class OooOO0 implements MediaPlayer.OnBufferingUpdateListener {
        public OooOO0() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            VideoView.this.f20213OoooOoo = i;
        }
    }

    public class OooOO0O extends GestureDetector.SimpleOnGestureListener {
        public OooOO0O() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            VideoView videoView = VideoView.this;
            int i = VideoView.f20199o00Oo0;
            if (!videoView.OooO0OO()) {
                return false;
            }
            VideoView videoView2 = VideoView.this;
            if (videoView2.f20210OoooOOo == null) {
                return false;
            }
            videoView2.OooOO0();
            return false;
        }
    }

    public class OooOOO0 implements SurfaceHolder.Callback {
        public OooOOO0() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            VideoView videoView = VideoView.this;
            videoView.f20223o000oOoO = i2;
            videoView.f20209OoooOOO = i3;
            boolean z = false;
            boolean z2 = videoView.f20200Oooo == 3;
            if (videoView.f20204OoooO == i2 && videoView.f20208OoooOO0 == i3) {
                z = true;
            }
            if (videoView.f20205OoooO0 != null && z2 && z) {
                int i4 = videoView.f20216OooooO0;
                if (i4 != 0) {
                    videoView.OooO0oo(i4);
                }
                VideoView.this.OooO();
                VideoControlView videoControlView = VideoView.this.f20210OoooOOo;
                if (videoControlView != null) {
                    videoControlView.OooO0OO();
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            VideoView videoView = VideoView.this;
            videoView.f20206OoooO00 = surfaceHolder;
            videoView.OooO0o0();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            VideoView videoView = VideoView.this;
            videoView.f20206OoooO00 = null;
            VideoControlView videoControlView = videoView.f20210OoooOOo;
            if (videoControlView != null) {
                videoControlView.OooO00o();
            }
            VideoView.this.OooO0oO(true);
        }
    }

    public VideoView(Context context) {
        super(context);
        this.f20201Oooo0o = "VideoView";
        this.f20203Oooo0oo = 0;
        this.f20200Oooo = 0;
        this.f20206OoooO00 = null;
        this.f20205OoooO0 = null;
        this.f20218OooooOo = new OooO00o();
        this.f20220Oooooo0 = new OooO0O0();
        this.f20219Oooooo = new OooO0OO();
        this.f20221OoooooO = new OooO0o();
        this.f20222Ooooooo = new OooO();
        this.f20225o0OoOo0 = new OooOO0();
        this.f20226ooOO = new GestureDetector(getContext(), new OooOO0O());
        this.f20224o00O0O = new OooOOO0();
        OooO0O0();
    }

    public final void OooO() {
        if (OooO0OO()) {
            this.f20205OoooO0.start();
            this.f20203Oooo0oo = 3;
        }
        this.f20200Oooo = 3;
    }

    public final void OooO00o() {
        VideoControlView videoControlView;
        if (this.f20205OoooO0 == null || (videoControlView = this.f20210OoooOOo) == null) {
            return;
        }
        videoControlView.setMediaPlayer(this);
        this.f20210OoooOOo.setEnabled(OooO0OO());
    }

    public final void OooO0O0() {
        this.f20204OoooO = 0;
        this.f20208OoooOO0 = 0;
        getHolder().addCallback(this.f20224o00O0O);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        requestFocus();
        this.f20203Oooo0oo = 0;
        this.f20200Oooo = 0;
    }

    public final boolean OooO0OO() {
        int i;
        return (this.f20205OoooO0 == null || (i = this.f20203Oooo0oo) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final boolean OooO0Oo() {
        return OooO0OO() && this.f20205OoooO0.isPlaying();
    }

    public final void OooO0o() {
        if (OooO0OO() && this.f20205OoooO0.isPlaying()) {
            this.f20205OoooO0.pause();
            this.f20203Oooo0oo = 4;
        }
        this.f20200Oooo = 4;
    }

    public final void OooO0o0() {
        if (this.f20202Oooo0oO == null || this.f20206OoooO00 == null) {
            return;
        }
        OooO0oO(false);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f20205OoooO0 = mediaPlayer;
            int i = this.f20207OoooO0O;
            if (i != 0) {
                mediaPlayer.setAudioSessionId(i);
            } else {
                this.f20207OoooO0O = mediaPlayer.getAudioSessionId();
            }
            this.f20205OoooO0.setOnPreparedListener(this.f20220Oooooo0);
            this.f20205OoooO0.setOnVideoSizeChangedListener(this.f20218OooooOo);
            this.f20205OoooO0.setOnCompletionListener(this.f20219Oooooo);
            this.f20205OoooO0.setOnErrorListener(this.f20222Ooooooo);
            this.f20205OoooO0.setOnInfoListener(this.f20221OoooooO);
            this.f20205OoooO0.setOnBufferingUpdateListener(this.f20225o0OoOo0);
            this.f20213OoooOoo = 0;
            this.f20205OoooO0.setLooping(this.f20217OooooOO);
            this.f20205OoooO0.setDataSource(getContext(), this.f20202Oooo0oO);
            this.f20205OoooO0.setDisplay(this.f20206OoooO00);
            this.f20205OoooO0.setAudioStreamType(3);
            this.f20205OoooO0.setScreenOnWhilePlaying(true);
            this.f20205OoooO0.prepareAsync();
            this.f20203Oooo0oo = 1;
            OooO00o();
        } catch (Exception e) {
            String str = this.f20201Oooo0o;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unable to open content: ");
            sbOooO0o0.append(this.f20202Oooo0oO);
            Log.w(str, sbOooO0o0.toString(), e);
            this.f20203Oooo0oo = -1;
            this.f20200Oooo = -1;
            this.f20222Ooooooo.onError(this.f20205OoooO0, 1, 0);
        }
    }

    public final void OooO0oO(boolean z) {
        MediaPlayer mediaPlayer = this.f20205OoooO0;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f20205OoooO0.release();
            this.f20205OoooO0 = null;
            this.f20203Oooo0oo = 0;
            if (z) {
                this.f20200Oooo = 0;
            }
        }
    }

    public final void OooO0oo(int i) {
        if (!OooO0OO()) {
            this.f20216OooooO0 = i;
        } else {
            this.f20205OoooO0.seekTo(i);
            this.f20216OooooO0 = 0;
        }
    }

    public final void OooOO0() {
        if (this.f20210OoooOOo.getVisibility() == 0) {
            this.f20210OoooOOo.OooO00o();
        } else {
            this.f20210OoooOOo.OooO0OO();
        }
    }

    @Override // com.twitter.sdk.android.tweetui.internal.VideoControlView.OooO0O0
    public int getBufferPercentage() {
        if (this.f20205OoooO0 != null) {
            return this.f20213OoooOoo;
        }
        return 0;
    }

    @Override // com.twitter.sdk.android.tweetui.internal.VideoControlView.OooO0O0
    public int getCurrentPosition() {
        if (OooO0OO()) {
            return this.f20205OoooO0.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.twitter.sdk.android.tweetui.internal.VideoControlView.OooO0O0
    public int getDuration() {
        if (OooO0OO()) {
            return this.f20205OoooO0.getDuration();
        }
        return -1;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = (i == 4 || i == 24 || i == 25 || i == 82 || i == 5 || i == 6) ? false : true;
        if (OooO0OO() && z && this.f20210OoooOOo != null) {
            if (i == 79 || i == 85) {
                if (this.f20205OoooO0.isPlaying()) {
                    OooO0o();
                    this.f20210OoooOOo.OooO0OO();
                } else {
                    OooO();
                    this.f20210OoooOOo.OooO00o();
                }
                return true;
            }
            if (i == 126) {
                if (!this.f20205OoooO0.isPlaying()) {
                    OooO();
                    this.f20210OoooOOo.OooO00o();
                }
                return true;
            }
            if (i == 86 || i == 127) {
                if (this.f20205OoooO0.isPlaying()) {
                    OooO0o();
                    this.f20210OoooOOo.OooO0OO();
                }
                return true;
            }
            OooOO0();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = View.getDefaultSize(this.f20204OoooO, i);
        int defaultSize2 = View.getDefaultSize(this.f20208OoooOO0, i2);
        if (this.f20204OoooO > 0 && this.f20208OoooOO0 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.f20204OoooO;
                int i5 = i4 * size2;
                int i6 = this.f20208OoooOO0;
                if (i5 < size * i6) {
                    defaultSize = (i4 * size2) / i6;
                } else {
                    if (i4 * size2 > size * i6) {
                        defaultSize2 = (i6 * size) / i4;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else if (mode == 1073741824) {
                int i7 = (this.f20208OoooOO0 * size) / this.f20204OoooO;
                if (mode2 != Integer.MIN_VALUE || i7 <= size2) {
                    defaultSize2 = i7;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i3 = (this.f20204OoooO * size2) / this.f20208OoooOO0;
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                } else {
                    int i8 = this.f20204OoooO;
                    int i9 = this.f20208OoooOO0;
                    if (mode2 != Integer.MIN_VALUE || i9 <= size2) {
                        i3 = i8;
                        size2 = i9;
                    } else {
                        i3 = (size2 * i8) / i9;
                    }
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize2 = (i9 * size) / i8;
                        defaultSize = size;
                    }
                }
                defaultSize = i3;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f20226ooOO.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void setMediaController(VideoControlView videoControlView) {
        VideoControlView videoControlView2 = this.f20210OoooOOo;
        if (videoControlView2 != null) {
            videoControlView2.OooO00o();
        }
        this.f20210OoooOOo = videoControlView;
        OooO00o();
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f20211OoooOo0 = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f20214Ooooo00 = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.f20215Ooooo0o = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f20212OoooOoO = onPreparedListener;
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20201Oooo0o = "VideoView";
        this.f20203Oooo0oo = 0;
        this.f20200Oooo = 0;
        this.f20206OoooO00 = null;
        this.f20205OoooO0 = null;
        this.f20218OooooOo = new OooO00o();
        this.f20220Oooooo0 = new OooO0O0();
        this.f20219Oooooo = new OooO0OO();
        this.f20221OoooooO = new OooO0o();
        this.f20222Ooooooo = new OooO();
        this.f20225o0OoOo0 = new OooOO0();
        this.f20226ooOO = new GestureDetector(getContext(), new OooOO0O());
        this.f20224o00O0O = new OooOOO0();
        OooO0O0();
    }
}
