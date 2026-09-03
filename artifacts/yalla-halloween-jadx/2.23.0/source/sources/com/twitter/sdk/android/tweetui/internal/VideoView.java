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

/* JADX INFO: loaded from: classes4.dex */
public class VideoView extends SurfaceView implements VideoControlView.OooO0O0 {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ int f22394OooOooo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public MediaPlayer f22395OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f22396OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f22397OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Uri f22398OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f22399OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public SurfaceHolder f22400OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f22401OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f22402OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f22403OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f22404OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f22405OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public VideoControlView f22406OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f22407OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f22408OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public MediaPlayer.OnPreparedListener f22409OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public MediaPlayer.OnErrorListener f22410OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f22411OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f22412OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public MediaPlayer.OnInfoListener f22413OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f22414OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f22415OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO0o f22416OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0OO f22417OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO f22418OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final GestureDetector f22419OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooOO0 f22420OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final OooOOO0 f22421OooOooO;

    public class OooO implements MediaPlayer.OnErrorListener {
        public OooO() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            VideoView videoView = VideoView.this;
            Log.d(videoView.f22396OooO0Oo, "Error: " + i + "," + i2);
            videoView.f22397OooO0o = -1;
            videoView.f22399OooO0oO = -1;
            VideoControlView videoControlView = videoView.f22406OooOOOO;
            if (videoControlView != null) {
                videoControlView.OooO00o();
            }
            MediaPlayer.OnErrorListener onErrorListener = videoView.f22410OooOOoo;
            if (onErrorListener != null) {
                onErrorListener.onError(videoView.f22395OooO, i, i2);
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
            videoView.f22402OooOO0O = videoWidth;
            videoView.f22403OooOO0o = mediaPlayer.getVideoHeight();
            if (videoView.f22402OooOO0O == 0 || videoView.f22403OooOO0o == 0) {
                return;
            }
            videoView.getHolder().setFixedSize(videoView.f22402OooOO0O, videoView.f22403OooOO0o);
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
            videoView.f22397OooO0o = 2;
            MediaPlayer.OnPreparedListener onPreparedListener = videoView.f22409OooOOo0;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(videoView.f22395OooO);
            }
            VideoControlView videoControlView2 = videoView.f22406OooOOOO;
            if (videoControlView2 != null) {
                videoControlView2.setEnabled(true);
            }
            videoView.f22402OooOO0O = mediaPlayer.getVideoWidth();
            videoView.f22403OooOO0o = mediaPlayer.getVideoHeight();
            int i = videoView.f22412OooOo0;
            if (i != 0) {
                videoView.OooO0o(i);
            }
            if (videoView.f22402OooOO0O == 0 || videoView.f22403OooOO0o == 0) {
                if (videoView.f22399OooO0oO == 3) {
                    videoView.OooO0oO();
                    return;
                }
                return;
            }
            videoView.getHolder().setFixedSize(videoView.f22402OooOO0O, videoView.f22403OooOO0o);
            if (videoView.f22405OooOOO0 == videoView.f22402OooOO0O && videoView.f22404OooOOO == videoView.f22403OooOO0o) {
                if (videoView.f22399OooO0oO == 3) {
                    videoView.OooO0oO();
                    VideoControlView videoControlView3 = videoView.f22406OooOOOO;
                    if (videoControlView3 != null) {
                        videoControlView3.OooO0O0();
                        return;
                    }
                    return;
                }
                if (videoView.OooO0OO()) {
                    return;
                }
                if ((i != 0 || videoView.getCurrentPosition() > 0) && (videoControlView = videoView.f22406OooOOOO) != null) {
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
            videoView.f22397OooO0o = 5;
            videoView.f22399OooO0oO = 5;
            MediaPlayer.OnCompletionListener onCompletionListener = videoView.f22407OooOOOo;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(videoView.f22395OooO);
            }
        }
    }

    public class OooO0o implements MediaPlayer.OnInfoListener {
        public OooO0o() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            MediaPlayer.OnInfoListener onInfoListener = VideoView.this.f22413OooOo00;
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
            VideoView.this.f22408OooOOo = i;
        }
    }

    public class OooOO0O extends GestureDetector.SimpleOnGestureListener {
        public OooOO0O() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            VideoControlView videoControlView;
            int i = VideoView.f22394OooOooo;
            VideoView videoView = VideoView.this;
            if (videoView.OooO0O0() && (videoControlView = videoView.f22406OooOOOO) != null) {
                if (videoControlView.getVisibility() == 0) {
                    videoView.f22406OooOOOO.OooO00o();
                } else {
                    videoView.f22406OooOOOO.OooO0O0();
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
            videoView.f22405OooOOO0 = i2;
            videoView.f22404OooOOO = i3;
            boolean z = videoView.f22399OooO0oO == 3;
            boolean z2 = videoView.f22402OooOO0O == i2 && videoView.f22403OooOO0o == i3;
            if (videoView.f22395OooO != null && z && z2) {
                int i4 = videoView.f22412OooOo0;
                if (i4 != 0) {
                    videoView.OooO0o(i4);
                }
                videoView.OooO0oO();
                VideoControlView videoControlView = videoView.f22406OooOOOO;
                if (videoControlView != null) {
                    videoControlView.OooO0O0();
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            VideoView videoView = VideoView.this;
            videoView.f22400OooO0oo = surfaceHolder;
            videoView.OooO0Oo();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            VideoView videoView = VideoView.this;
            videoView.f22400OooO0oo = null;
            VideoControlView videoControlView = videoView.f22406OooOOOO;
            if (videoControlView != null) {
                videoControlView.OooO00o();
            }
            MediaPlayer mediaPlayer = videoView.f22395OooO;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
                videoView.f22395OooO.release();
                videoView.f22395OooO = null;
                videoView.f22397OooO0o = 0;
                videoView.f22399OooO0oO = 0;
            }
        }
    }

    public VideoView(Context context) {
        super(context);
        this.f22396OooO0Oo = "VideoView";
        this.f22397OooO0o = 0;
        this.f22399OooO0oO = 0;
        this.f22400OooO0oo = null;
        this.f22395OooO = null;
        this.f22415OooOo0o = new OooO00o();
        this.f22411OooOo = new OooO0O0();
        this.f22417OooOoO0 = new OooO0OO();
        this.f22416OooOoO = new OooO0o();
        this.f22418OooOoOO = new OooO();
        this.f22420OooOoo0 = new OooOO0();
        this.f22419OooOoo = new GestureDetector(getContext(), new OooOO0O());
        this.f22421OooOooO = new OooOOO0();
        OooO00o();
    }

    public final void OooO00o() {
        this.f22402OooOO0O = 0;
        this.f22403OooOO0o = 0;
        getHolder().addCallback(this.f22421OooOooO);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        requestFocus();
        this.f22397OooO0o = 0;
        this.f22399OooO0oO = 0;
    }

    public final boolean OooO0O0() {
        int i;
        return (this.f22395OooO == null || (i = this.f22397OooO0o) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final boolean OooO0OO() {
        return OooO0O0() && this.f22395OooO.isPlaying();
    }

    public final void OooO0Oo() {
        VideoControlView videoControlView;
        OooO oooO = this.f22418OooOoOO;
        if (this.f22398OooO0o0 == null || this.f22400OooO0oo == null) {
            return;
        }
        MediaPlayer mediaPlayer = this.f22395OooO;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f22395OooO.release();
            this.f22395OooO = null;
            this.f22397OooO0o = 0;
        }
        try {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.f22395OooO = mediaPlayer2;
            int i = this.f22401OooOO0;
            if (i != 0) {
                mediaPlayer2.setAudioSessionId(i);
            } else {
                this.f22401OooOO0 = mediaPlayer2.getAudioSessionId();
            }
            this.f22395OooO.setOnPreparedListener(this.f22411OooOo);
            this.f22395OooO.setOnVideoSizeChangedListener(this.f22415OooOo0o);
            this.f22395OooO.setOnCompletionListener(this.f22417OooOoO0);
            this.f22395OooO.setOnErrorListener(oooO);
            this.f22395OooO.setOnInfoListener(this.f22416OooOoO);
            this.f22395OooO.setOnBufferingUpdateListener(this.f22420OooOoo0);
            this.f22408OooOOo = 0;
            this.f22395OooO.setLooping(this.f22414OooOo0O);
            this.f22395OooO.setDataSource(getContext(), this.f22398OooO0o0);
            this.f22395OooO.setDisplay(this.f22400OooO0oo);
            this.f22395OooO.setAudioStreamType(3);
            this.f22395OooO.setScreenOnWhilePlaying(true);
            this.f22395OooO.prepareAsync();
            this.f22397OooO0o = 1;
            if (this.f22395OooO == null || (videoControlView = this.f22406OooOOOO) == null) {
                return;
            }
            videoControlView.setMediaPlayer(this);
            this.f22406OooOOOO.setEnabled(OooO0O0());
        } catch (Exception e) {
            Log.w(this.f22396OooO0Oo, "Unable to open content: " + this.f22398OooO0o0, e);
            this.f22397OooO0o = -1;
            this.f22399OooO0oO = -1;
            oooO.onError(this.f22395OooO, 1, 0);
        }
    }

    public final void OooO0o(int i) {
        if (!OooO0O0()) {
            this.f22412OooOo0 = i;
        } else {
            this.f22395OooO.seekTo(i);
            this.f22412OooOo0 = 0;
        }
    }

    public final void OooO0o0() {
        if (OooO0O0() && this.f22395OooO.isPlaying()) {
            this.f22395OooO.pause();
            this.f22397OooO0o = 4;
        }
        this.f22399OooO0oO = 4;
    }

    public final void OooO0oO() {
        if (OooO0O0()) {
            this.f22395OooO.start();
            this.f22397OooO0o = 3;
        }
        this.f22399OooO0oO = 3;
    }

    @Override // com.twitter.sdk.android.tweetui.internal.VideoControlView.OooO0O0
    public int getBufferPercentage() {
        if (this.f22395OooO != null) {
            return this.f22408OooOOo;
        }
        return 0;
    }

    @Override // com.twitter.sdk.android.tweetui.internal.VideoControlView.OooO0O0
    public int getCurrentPosition() {
        if (OooO0O0()) {
            return this.f22395OooO.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.twitter.sdk.android.tweetui.internal.VideoControlView.OooO0O0
    public int getDuration() {
        if (OooO0O0()) {
            return this.f22395OooO.getDuration();
        }
        return -1;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        VideoControlView videoControlView;
        boolean z = (i == 4 || i == 24 || i == 25 || i == 82 || i == 5 || i == 6) ? false : true;
        if (OooO0O0() && z && (videoControlView = this.f22406OooOOOO) != null) {
            if (i == 79 || i == 85) {
                if (this.f22395OooO.isPlaying()) {
                    OooO0o0();
                    this.f22406OooOOOO.OooO0O0();
                } else {
                    OooO0oO();
                    this.f22406OooOOOO.OooO00o();
                }
                return true;
            }
            if (i == 126) {
                if (!this.f22395OooO.isPlaying()) {
                    OooO0oO();
                    this.f22406OooOOOO.OooO00o();
                }
                return true;
            }
            if (i == 86 || i == 127) {
                if (this.f22395OooO.isPlaying()) {
                    OooO0o0();
                    this.f22406OooOOOO.OooO0O0();
                }
                return true;
            }
            if (videoControlView.getVisibility() == 0) {
                this.f22406OooOOOO.OooO00o();
            } else {
                this.f22406OooOOOO.OooO0O0();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = View.getDefaultSize(this.f22402OooOO0O, i);
        int defaultSize2 = View.getDefaultSize(this.f22403OooOO0o, i2);
        if (this.f22402OooOO0O > 0 && this.f22403OooOO0o > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.f22402OooOO0O;
                int i5 = i4 * size2;
                int i6 = this.f22403OooOO0o;
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
                int i7 = (this.f22403OooOO0o * size) / this.f22402OooOO0O;
                if (mode2 != Integer.MIN_VALUE || i7 <= size2) {
                    defaultSize2 = i7;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i3 = (this.f22402OooOO0O * size2) / this.f22403OooOO0o;
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                } else {
                    int i8 = this.f22402OooOO0O;
                    int i9 = this.f22403OooOO0o;
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
        return this.f22419OooOoo.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void setMediaController(VideoControlView videoControlView) {
        VideoControlView videoControlView2 = this.f22406OooOOOO;
        if (videoControlView2 != null) {
            videoControlView2.OooO00o();
        }
        this.f22406OooOOOO = videoControlView;
        if (this.f22395OooO == null || videoControlView == null) {
            return;
        }
        videoControlView.setMediaPlayer(this);
        this.f22406OooOOOO.setEnabled(OooO0O0());
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f22407OooOOOo = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f22410OooOOoo = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.f22413OooOo00 = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f22409OooOOo0 = onPreparedListener;
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22396OooO0Oo = "VideoView";
        this.f22397OooO0o = 0;
        this.f22399OooO0oO = 0;
        this.f22400OooO0oo = null;
        this.f22395OooO = null;
        this.f22415OooOo0o = new OooO00o();
        this.f22411OooOo = new OooO0O0();
        this.f22417OooOoO0 = new OooO0OO();
        this.f22416OooOoO = new OooO0o();
        this.f22418OooOoOO = new OooO();
        this.f22420OooOoo0 = new OooOO0();
        this.f22419OooOoo = new GestureDetector(getContext(), new OooOO0O());
        this.f22421OooOooO = new OooOOO0();
        OooO00o();
    }
}
