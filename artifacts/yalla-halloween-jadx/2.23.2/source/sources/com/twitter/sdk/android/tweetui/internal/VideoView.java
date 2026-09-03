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

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ int f21920OooOooo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public MediaPlayer f21921OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f21922OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f21923OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Uri f21924OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f21925OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public SurfaceHolder f21926OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f21927OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f21928OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f21929OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f21930OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f21931OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public VideoControlView f21932OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f21933OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f21934OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public MediaPlayer.OnPreparedListener f21935OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public MediaPlayer.OnErrorListener f21936OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f21937OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f21938OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public MediaPlayer.OnInfoListener f21939OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f21940OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f21941OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO0o f21942OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0OO f21943OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO f21944OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final GestureDetector f21945OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooOO0 f21946OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final OooOOO0 f21947OooOooO;

    public class OooO implements MediaPlayer.OnErrorListener {
        public OooO() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            VideoView videoView = VideoView.this;
            Log.d(videoView.f21922OooO0Oo, "Error: " + i + "," + i2);
            videoView.f21923OooO0o = -1;
            videoView.f21925OooO0oO = -1;
            VideoControlView videoControlView = videoView.f21932OooOOOO;
            if (videoControlView != null) {
                videoControlView.OooO00o();
            }
            MediaPlayer.OnErrorListener onErrorListener = videoView.f21936OooOOoo;
            if (onErrorListener != null) {
                onErrorListener.onError(videoView.f21921OooO, i, i2);
            }
            return true;
        }
    }

    public class OooO00o implements MediaPlayer.OnVideoSizeChangedListener {
        public OooO00o() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            int videoWidth = mediaPlayer.getVideoWidth();
            VideoView videoView = VideoView.this;
            videoView.f21928OooOO0O = videoWidth;
            videoView.f21929OooOO0o = mediaPlayer.getVideoHeight();
            if (videoView.f21928OooOO0O == 0 || videoView.f21929OooOO0o == 0) {
                return;
            }
            videoView.getHolder().setFixedSize(videoView.f21928OooOO0O, videoView.f21929OooOO0o);
            videoView.requestLayout();
        }
    }

    public class OooO0O0 implements MediaPlayer.OnPreparedListener {
        public OooO0O0() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            VideoControlView videoControlView;
            VideoView videoView = VideoView.this;
            videoView.f21923OooO0o = 2;
            MediaPlayer.OnPreparedListener onPreparedListener = videoView.f21935OooOOo0;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(videoView.f21921OooO);
            }
            VideoControlView videoControlView2 = videoView.f21932OooOOOO;
            if (videoControlView2 != null) {
                videoControlView2.setEnabled(true);
            }
            videoView.f21928OooOO0O = mediaPlayer.getVideoWidth();
            videoView.f21929OooOO0o = mediaPlayer.getVideoHeight();
            int i = videoView.f21938OooOo0;
            if (i != 0) {
                videoView.OooO0o(i);
            }
            if (videoView.f21928OooOO0O == 0 || videoView.f21929OooOO0o == 0) {
                if (videoView.f21925OooO0oO == 3) {
                    videoView.OooO0oO();
                    return;
                }
                return;
            }
            videoView.getHolder().setFixedSize(videoView.f21928OooOO0O, videoView.f21929OooOO0o);
            if (videoView.f21931OooOOO0 == videoView.f21928OooOO0O && videoView.f21930OooOOO == videoView.f21929OooOO0o) {
                if (videoView.f21925OooO0oO == 3) {
                    videoView.OooO0oO();
                    VideoControlView videoControlView3 = videoView.f21932OooOOOO;
                    if (videoControlView3 != null) {
                        videoControlView3.OooO0O0();
                        return;
                    }
                    return;
                }
                if (videoView.OooO0OO()) {
                    return;
                }
                if ((i != 0 || videoView.getCurrentPosition() > 0) && (videoControlView = videoView.f21932OooOOOO) != null) {
                    videoControlView.OooO0O0();
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
            videoView.f21923OooO0o = 5;
            videoView.f21925OooO0oO = 5;
            MediaPlayer.OnCompletionListener onCompletionListener = videoView.f21933OooOOOo;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(videoView.f21921OooO);
            }
        }
    }

    public class OooO0o implements MediaPlayer.OnInfoListener {
        public OooO0o() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            MediaPlayer.OnInfoListener onInfoListener = VideoView.this.f21939OooOo00;
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
            VideoView.this.f21934OooOOo = i;
        }
    }

    public class OooOO0O extends GestureDetector.SimpleOnGestureListener {
        public OooOO0O() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            VideoControlView videoControlView;
            int i = VideoView.f21920OooOooo;
            VideoView videoView = VideoView.this;
            if (videoView.OooO0O0() && (videoControlView = videoView.f21932OooOOOO) != null) {
                if (videoControlView.getVisibility() == 0) {
                    videoView.f21932OooOOOO.OooO00o();
                } else {
                    videoView.f21932OooOOOO.OooO0O0();
                }
            }
            return false;
        }
    }

    public class OooOOO0 implements SurfaceHolder.Callback {
        public OooOOO0() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            VideoView videoView = VideoView.this;
            videoView.f21931OooOOO0 = i2;
            videoView.f21930OooOOO = i3;
            boolean z = videoView.f21925OooO0oO == 3;
            boolean z2 = videoView.f21928OooOO0O == i2 && videoView.f21929OooOO0o == i3;
            if (videoView.f21921OooO != null && z && z2) {
                int i4 = videoView.f21938OooOo0;
                if (i4 != 0) {
                    videoView.OooO0o(i4);
                }
                videoView.OooO0oO();
                VideoControlView videoControlView = videoView.f21932OooOOOO;
                if (videoControlView != null) {
                    videoControlView.OooO0O0();
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            VideoView videoView = VideoView.this;
            videoView.f21926OooO0oo = surfaceHolder;
            videoView.OooO0Oo();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            VideoView videoView = VideoView.this;
            videoView.f21926OooO0oo = null;
            VideoControlView videoControlView = videoView.f21932OooOOOO;
            if (videoControlView != null) {
                videoControlView.OooO00o();
            }
            MediaPlayer mediaPlayer = videoView.f21921OooO;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
                videoView.f21921OooO.release();
                videoView.f21921OooO = null;
                videoView.f21923OooO0o = 0;
                videoView.f21925OooO0oO = 0;
            }
        }
    }

    public VideoView(Context context) {
        super(context);
        this.f21922OooO0Oo = "VideoView";
        this.f21923OooO0o = 0;
        this.f21925OooO0oO = 0;
        this.f21926OooO0oo = null;
        this.f21921OooO = null;
        this.f21941OooOo0o = new OooO00o();
        this.f21937OooOo = new OooO0O0();
        this.f21943OooOoO0 = new OooO0OO();
        this.f21942OooOoO = new OooO0o();
        this.f21944OooOoOO = new OooO();
        this.f21946OooOoo0 = new OooOO0();
        this.f21945OooOoo = new GestureDetector(getContext(), new OooOO0O());
        this.f21947OooOooO = new OooOOO0();
        OooO00o();
    }

    public final void OooO00o() {
        this.f21928OooOO0O = 0;
        this.f21929OooOO0o = 0;
        getHolder().addCallback(this.f21947OooOooO);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        requestFocus();
        this.f21923OooO0o = 0;
        this.f21925OooO0oO = 0;
    }

    public final boolean OooO0O0() {
        int i;
        return (this.f21921OooO == null || (i = this.f21923OooO0o) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final boolean OooO0OO() {
        return OooO0O0() && this.f21921OooO.isPlaying();
    }

    public final void OooO0Oo() {
        VideoControlView videoControlView;
        OooO oooO = this.f21944OooOoOO;
        if (this.f21924OooO0o0 == null || this.f21926OooO0oo == null) {
            return;
        }
        MediaPlayer mediaPlayer = this.f21921OooO;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f21921OooO.release();
            this.f21921OooO = null;
            this.f21923OooO0o = 0;
        }
        try {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.f21921OooO = mediaPlayer2;
            int i = this.f21927OooOO0;
            if (i != 0) {
                mediaPlayer2.setAudioSessionId(i);
            } else {
                this.f21927OooOO0 = mediaPlayer2.getAudioSessionId();
            }
            this.f21921OooO.setOnPreparedListener(this.f21937OooOo);
            this.f21921OooO.setOnVideoSizeChangedListener(this.f21941OooOo0o);
            this.f21921OooO.setOnCompletionListener(this.f21943OooOoO0);
            this.f21921OooO.setOnErrorListener(oooO);
            this.f21921OooO.setOnInfoListener(this.f21942OooOoO);
            this.f21921OooO.setOnBufferingUpdateListener(this.f21946OooOoo0);
            this.f21934OooOOo = 0;
            this.f21921OooO.setLooping(this.f21940OooOo0O);
            this.f21921OooO.setDataSource(getContext(), this.f21924OooO0o0);
            this.f21921OooO.setDisplay(this.f21926OooO0oo);
            this.f21921OooO.setAudioStreamType(3);
            this.f21921OooO.setScreenOnWhilePlaying(true);
            this.f21921OooO.prepareAsync();
            this.f21923OooO0o = 1;
            if (this.f21921OooO == null || (videoControlView = this.f21932OooOOOO) == null) {
                return;
            }
            videoControlView.setMediaPlayer(this);
            this.f21932OooOOOO.setEnabled(OooO0O0());
        } catch (Exception e) {
            Log.w(this.f21922OooO0Oo, "Unable to open content: " + this.f21924OooO0o0, e);
            this.f21923OooO0o = -1;
            this.f21925OooO0oO = -1;
            oooO.onError(this.f21921OooO, 1, 0);
        }
    }

    public final void OooO0o(int i) {
        if (!OooO0O0()) {
            this.f21938OooOo0 = i;
        } else {
            this.f21921OooO.seekTo(i);
            this.f21938OooOo0 = 0;
        }
    }

    public final void OooO0o0() {
        if (OooO0O0() && this.f21921OooO.isPlaying()) {
            this.f21921OooO.pause();
            this.f21923OooO0o = 4;
        }
        this.f21925OooO0oO = 4;
    }

    public final void OooO0oO() {
        if (OooO0O0()) {
            this.f21921OooO.start();
            this.f21923OooO0o = 3;
        }
        this.f21925OooO0oO = 3;
    }

    @Override // com.twitter.sdk.android.tweetui.internal.VideoControlView.OooO0O0
    public int getBufferPercentage() {
        if (this.f21921OooO != null) {
            return this.f21934OooOOo;
        }
        return 0;
    }

    @Override // com.twitter.sdk.android.tweetui.internal.VideoControlView.OooO0O0
    public int getCurrentPosition() {
        if (OooO0O0()) {
            return this.f21921OooO.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.twitter.sdk.android.tweetui.internal.VideoControlView.OooO0O0
    public int getDuration() {
        if (OooO0O0()) {
            return this.f21921OooO.getDuration();
        }
        return -1;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        VideoControlView videoControlView;
        boolean z = (i == 4 || i == 24 || i == 25 || i == 82 || i == 5 || i == 6) ? false : true;
        if (OooO0O0() && z && (videoControlView = this.f21932OooOOOO) != null) {
            if (i == 79 || i == 85) {
                if (this.f21921OooO.isPlaying()) {
                    OooO0o0();
                    this.f21932OooOOOO.OooO0O0();
                } else {
                    OooO0oO();
                    this.f21932OooOOOO.OooO00o();
                }
                return true;
            }
            if (i == 126) {
                if (!this.f21921OooO.isPlaying()) {
                    OooO0oO();
                    this.f21932OooOOOO.OooO00o();
                }
                return true;
            }
            if (i == 86 || i == 127) {
                if (this.f21921OooO.isPlaying()) {
                    OooO0o0();
                    this.f21932OooOOOO.OooO0O0();
                }
                return true;
            }
            if (videoControlView.getVisibility() == 0) {
                this.f21932OooOOOO.OooO00o();
            } else {
                this.f21932OooOOOO.OooO0O0();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = View.getDefaultSize(this.f21928OooOO0O, i);
        int defaultSize2 = View.getDefaultSize(this.f21929OooOO0o, i2);
        if (this.f21928OooOO0O > 0 && this.f21929OooOO0o > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.f21928OooOO0O;
                int i5 = i4 * size2;
                int i6 = this.f21929OooOO0o;
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
                int i7 = (this.f21929OooOO0o * size) / this.f21928OooOO0O;
                if (mode2 != Integer.MIN_VALUE || i7 <= size2) {
                    defaultSize2 = i7;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i3 = (this.f21928OooOO0O * size2) / this.f21929OooOO0o;
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                } else {
                    int i8 = this.f21928OooOO0O;
                    int i9 = this.f21929OooOO0o;
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
        return this.f21945OooOoo.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void setMediaController(VideoControlView videoControlView) {
        VideoControlView videoControlView2 = this.f21932OooOOOO;
        if (videoControlView2 != null) {
            videoControlView2.OooO00o();
        }
        this.f21932OooOOOO = videoControlView;
        if (this.f21921OooO == null || videoControlView == null) {
            return;
        }
        videoControlView.setMediaPlayer(this);
        this.f21932OooOOOO.setEnabled(OooO0O0());
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f21933OooOOOo = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f21936OooOOoo = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.f21939OooOo00 = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f21935OooOOo0 = onPreparedListener;
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21922OooO0Oo = "VideoView";
        this.f21923OooO0o = 0;
        this.f21925OooO0oO = 0;
        this.f21926OooO0oo = null;
        this.f21921OooO = null;
        this.f21941OooOo0o = new OooO00o();
        this.f21937OooOo = new OooO0O0();
        this.f21943OooOoO0 = new OooO0OO();
        this.f21942OooOoO = new OooO0o();
        this.f21944OooOoOO = new OooO();
        this.f21946OooOoo0 = new OooOO0();
        this.f21945OooOoo = new GestureDetector(getContext(), new OooOO0O());
        this.f21947OooOooO = new OooOOO0();
        OooO00o();
    }
}
