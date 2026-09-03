package com.yalla.yalla.ui.view;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class FixedTextureVideoView extends TextureView implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Surface f30411OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f30412OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Map<String, String> f30413OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Uri f30414OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f30415OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f30416OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public MediaPlayer f30417OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f30418OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f30419OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public MediaController f30420OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f30421OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f30422OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public MediaPlayer.OnPreparedListener f30423OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public MediaPlayer.OnErrorListener f30424OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f30425OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public MediaPlayer.OnInfoListener f30426OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Matrix f30427OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f30428OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f30429OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f30430OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f30431OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO0O0 f30432OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o f30433OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO0OO f30434OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooO f30435OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO0o f30436OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final OooOO0 f30437OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooOO0O f30438OooOooo;

    public class OooO implements MediaPlayer.OnErrorListener {

        public class OooO00o implements DialogInterface.OnClickListener {
            public OooO00o() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
                MediaPlayer.OnCompletionListener onCompletionListener = fixedTextureVideoView.f30422OooOOOO;
                if (onCompletionListener != null) {
                    onCompletionListener.onCompletion(fixedTextureVideoView.f30417OooOO0);
                }
            }
        }

        public OooO() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
            fixedTextureVideoView.f30415OooO0oO = -1;
            fixedTextureVideoView.f30416OooO0oo = -1;
            MediaController mediaController = fixedTextureVideoView.f30420OooOOO;
            if (mediaController != null) {
                mediaController.hide();
            }
            MediaPlayer.OnErrorListener onErrorListener = fixedTextureVideoView.f30424OooOOo;
            if ((onErrorListener == null || !onErrorListener.onError(fixedTextureVideoView.f30417OooOO0, i, i2)) && fixedTextureVideoView.getWindowToken() != null) {
                fixedTextureVideoView.getContext().getResources();
                new AlertDialog.Builder(fixedTextureVideoView.getContext()).setMessage(i == 200 ? R.string.VideoView_error_text_invalid_progressive_playback : R.string.VideoView_error_text_unknown).setPositiveButton(R.string.VideoView_error_button, new OooO00o()).setCancelable(false).show();
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
            FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
            fixedTextureVideoView.f30419OooOO0o = videoWidth;
            fixedTextureVideoView.f30421OooOOO0 = mediaPlayer.getVideoHeight();
            if (fixedTextureVideoView.f30419OooOO0o == 0 || fixedTextureVideoView.f30421OooOOO0 == 0) {
                return;
            }
            fixedTextureVideoView.getSurfaceTexture().setDefaultBufferSize(fixedTextureVideoView.f30419OooOO0o, fixedTextureVideoView.f30421OooOOO0);
            fixedTextureVideoView.requestLayout();
            int i3 = fixedTextureVideoView.f30419OooOO0o;
            int i4 = fixedTextureVideoView.f30421OooOOO0;
            if (fixedTextureVideoView.getResizedHeight() == 0 || fixedTextureVideoView.getResizedWidth() == 0) {
                return;
            }
            float f = i3;
            float f2 = i4;
            float fMax = Math.max(fixedTextureVideoView.getResizedWidth() / f, fixedTextureVideoView.getResizedHeight() / f2);
            Matrix matrix = fixedTextureVideoView.f30427OooOo;
            if (matrix == null) {
                fixedTextureVideoView.f30427OooOo = new Matrix();
            } else {
                matrix.reset();
            }
            fixedTextureVideoView.f30427OooOo.preTranslate((fixedTextureVideoView.getResizedWidth() - i3) / 2, (fixedTextureVideoView.getResizedHeight() - i4) / 2);
            fixedTextureVideoView.f30427OooOo.preScale(f / fixedTextureVideoView.getResizedWidth(), f2 / fixedTextureVideoView.getResizedHeight());
            fixedTextureVideoView.f30427OooOo.postScale(fMax, fMax, fixedTextureVideoView.getResizedWidth() / 2, fixedTextureVideoView.getResizedHeight() / 2);
            fixedTextureVideoView.setTransform(fixedTextureVideoView.f30427OooOo);
            fixedTextureVideoView.postInvalidate();
        }
    }

    public class OooO0O0 implements MediaPlayer.OnPreparedListener {
        public OooO0O0() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            MediaController mediaController;
            FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
            fixedTextureVideoView.f30415OooO0oO = 2;
            fixedTextureVideoView.f30431OooOo0o = true;
            fixedTextureVideoView.f30430OooOo0O = true;
            fixedTextureVideoView.f30428OooOo0 = true;
            MediaPlayer.OnPreparedListener onPreparedListener = fixedTextureVideoView.f30423OooOOOo;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(fixedTextureVideoView.f30417OooOO0);
            }
            MediaController mediaController2 = fixedTextureVideoView.f30420OooOOO;
            if (mediaController2 != null) {
                mediaController2.setEnabled(true);
            }
            fixedTextureVideoView.f30419OooOO0o = mediaPlayer.getVideoWidth();
            fixedTextureVideoView.f30421OooOOO0 = mediaPlayer.getVideoHeight();
            int i = fixedTextureVideoView.f30429OooOo00;
            if (i != 0) {
                fixedTextureVideoView.seekTo(i);
            }
            if (fixedTextureVideoView.f30419OooOO0o == 0 || fixedTextureVideoView.f30421OooOOO0 == 0) {
                if (fixedTextureVideoView.f30416OooO0oo == 3) {
                    fixedTextureVideoView.start();
                    return;
                }
                return;
            }
            fixedTextureVideoView.getSurfaceTexture().setDefaultBufferSize(fixedTextureVideoView.f30419OooOO0o, fixedTextureVideoView.f30421OooOOO0);
            if (fixedTextureVideoView.f30416OooO0oo == 3) {
                fixedTextureVideoView.start();
                MediaController mediaController3 = fixedTextureVideoView.f30420OooOOO;
                if (mediaController3 != null) {
                    mediaController3.show();
                    return;
                }
                return;
            }
            if (fixedTextureVideoView.isPlaying()) {
                return;
            }
            if ((i != 0 || fixedTextureVideoView.getCurrentPosition() > 0) && (mediaController = fixedTextureVideoView.f30420OooOOO) != null) {
                mediaController.show(0);
            }
        }
    }

    public class OooO0OO implements MediaPlayer.OnCompletionListener {
        public OooO0OO() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
            fixedTextureVideoView.f30415OooO0oO = 5;
            fixedTextureVideoView.f30416OooO0oo = 5;
            MediaController mediaController = fixedTextureVideoView.f30420OooOOO;
            if (mediaController != null) {
                mediaController.hide();
            }
            MediaPlayer.OnCompletionListener onCompletionListener = fixedTextureVideoView.f30422OooOOOO;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(fixedTextureVideoView.f30417OooOO0);
            }
        }
    }

    public class OooO0o implements MediaPlayer.OnInfoListener {
        public OooO0o() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            MediaPlayer.OnInfoListener onInfoListener = FixedTextureVideoView.this.f30426OooOOoo;
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
            FixedTextureVideoView.this.f30425OooOOo0 = i;
        }
    }

    public class OooOO0O implements TextureView.SurfaceTextureListener {
        public OooOO0O() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Surface surface = new Surface(surfaceTexture);
            FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
            fixedTextureVideoView.f30411OooO = surface;
            fixedTextureVideoView.OooO0Oo();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
            Surface surface = fixedTextureVideoView.f30411OooO;
            if (surface != null) {
                surface.release();
                fixedTextureVideoView.f30411OooO = null;
            }
            MediaController mediaController = fixedTextureVideoView.f30420OooOOO;
            if (mediaController != null) {
                mediaController.hide();
            }
            fixedTextureVideoView.OooO0o0(true);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
            boolean z = fixedTextureVideoView.f30416OooO0oo == 3;
            boolean z2 = i > 0 && i2 > 0;
            if (fixedTextureVideoView.f30417OooOO0 != null && z && z2) {
                int i3 = fixedTextureVideoView.f30429OooOo00;
                if (i3 != 0) {
                    fixedTextureVideoView.seekTo(i3);
                }
                fixedTextureVideoView.start();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public FixedTextureVideoView(Context context) {
        super(context);
        this.f30412OooO0Oo = "TextureVideoView";
        this.f30415OooO0oO = 0;
        this.f30416OooO0oo = 0;
        this.f30411OooO = null;
        this.f30417OooOO0 = null;
        this.f30433OooOoO0 = new OooO00o();
        this.f30432OooOoO = new OooO0O0();
        this.f30434OooOoOO = new OooO0OO();
        this.f30436OooOoo0 = new OooO0o();
        this.f30435OooOoo = new OooO();
        this.f30437OooOooO = new OooOO0();
        this.f30438OooOooo = new OooOO0O();
        OooO0O0();
    }

    public final void OooO00o() {
        MediaController mediaController;
        if (this.f30417OooOO0 == null || (mediaController = this.f30420OooOOO) == null) {
            return;
        }
        mediaController.setMediaPlayer(this);
        this.f30420OooOOO.setAnchorView(getParent() instanceof View ? (View) getParent() : this);
        this.f30420OooOOO.setEnabled(OooO0OO());
    }

    public final void OooO0O0() {
        this.f30419OooOO0o = 0;
        this.f30421OooOOO0 = 0;
        setSurfaceTextureListener(this.f30438OooOooo);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f30415OooO0oO = 0;
        this.f30416OooO0oo = 0;
    }

    public final boolean OooO0OO() {
        int i;
        return (this.f30417OooOO0 == null || (i = this.f30415OooO0oO) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void OooO0Oo() {
        String str = this.f30412OooO0Oo;
        OooO oooO = this.f30435OooOoo;
        if (this.f30414OooO0o0 == null || this.f30411OooO == null) {
            return;
        }
        OooO0o0(false);
        ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).requestAudioFocus(null, 3, 1);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f30417OooOO0 = mediaPlayer;
            int i = this.f30418OooOO0O;
            if (i != 0) {
                mediaPlayer.setAudioSessionId(i);
            } else {
                this.f30418OooOO0O = mediaPlayer.getAudioSessionId();
            }
            this.f30417OooOO0.setOnPreparedListener(this.f30432OooOoO);
            this.f30417OooOO0.setOnVideoSizeChangedListener(this.f30433OooOoO0);
            this.f30417OooOO0.setOnCompletionListener(this.f30434OooOoOO);
            this.f30417OooOO0.setOnErrorListener(oooO);
            this.f30417OooOO0.setOnInfoListener(this.f30436OooOoo0);
            this.f30417OooOO0.setOnBufferingUpdateListener(this.f30437OooOooO);
            this.f30425OooOOo0 = 0;
            this.f30417OooOO0.setDataSource(getContext().getApplicationContext(), this.f30414OooO0o0, this.f30413OooO0o);
            this.f30417OooOO0.setSurface(this.f30411OooO);
            this.f30417OooOO0.setAudioStreamType(3);
            this.f30417OooOO0.setScreenOnWhilePlaying(true);
            this.f30417OooOO0.prepareAsync();
            this.f30415OooO0oO = 1;
            OooO00o();
        } catch (IOException e) {
            Log.w(str, "Unable to open content: " + this.f30414OooO0o0, e);
            this.f30415OooO0oO = -1;
            this.f30416OooO0oo = -1;
            oooO.onError(this.f30417OooOO0, 1, 0);
        } catch (IllegalArgumentException e2) {
            Log.w(str, "Unable to open content: " + this.f30414OooO0o0, e2);
            this.f30415OooO0oO = -1;
            this.f30416OooO0oo = -1;
            oooO.onError(this.f30417OooOO0, 1, 0);
        }
    }

    public final void OooO0o() {
        if (this.f30420OooOOO.isShowing()) {
            this.f30420OooOOO.hide();
        } else {
            this.f30420OooOOO.show();
        }
    }

    public final void OooO0o0(boolean z) {
        MediaPlayer mediaPlayer = this.f30417OooOO0;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f30417OooOO0.release();
            this.f30417OooOO0 = null;
            this.f30415OooO0oO = 0;
            if (z) {
                this.f30416OooO0oo = 0;
            }
            ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return this.f30428OooOo0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f30430OooOo0O;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f30431OooOo0o;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.f30418OooOO0O == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f30418OooOO0O = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f30418OooOO0O;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f30417OooOO0 != null) {
            return this.f30425OooOOo0;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (OooO0OO()) {
            return this.f30417OooOO0.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (OooO0OO()) {
            return this.f30417OooOO0.getDuration();
        }
        return -1;
    }

    public int getResizedHeight() {
        return getHeight();
    }

    public int getResizedWidth() {
        return getWidth();
    }

    public int getVideoHeight() {
        return this.f30421OooOOO0;
    }

    public int getVideoWidth() {
        return this.f30419OooOO0o;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return OooO0OO() && this.f30417OooOO0.isPlaying();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(FixedTextureVideoView.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(FixedTextureVideoView.class.getName());
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = (i == 4 || i == 24 || i == 25 || i == 164 || i == 82 || i == 5 || i == 6) ? false : true;
        if (OooO0OO() && z && this.f30420OooOOO != null) {
            if (i == 79 || i == 85) {
                if (this.f30417OooOO0.isPlaying()) {
                    pause();
                    this.f30420OooOOO.show();
                } else {
                    start();
                    this.f30420OooOOO.hide();
                }
                return true;
            }
            if (i == 126) {
                if (!this.f30417OooOO0.isPlaying()) {
                    start();
                    this.f30420OooOOO.hide();
                }
                return true;
            }
            if (i == 86 || i == 127) {
                if (this.f30417OooOO0.isPlaying()) {
                    pause();
                    this.f30420OooOOO.show();
                }
                return true;
            }
            OooO0o();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = View.getDefaultSize(this.f30419OooOO0o, i);
        int defaultSize2 = View.getDefaultSize(this.f30421OooOOO0, i2);
        if (this.f30419OooOO0o > 0 && this.f30421OooOOO0 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.f30419OooOO0o;
                int i5 = i4 * size2;
                int i6 = this.f30421OooOOO0;
                int i7 = size * i6;
                if (i5 < i7) {
                    i3 = i5 / i6;
                    defaultSize = i3;
                    defaultSize2 = size2;
                } else {
                    if (i5 > i7) {
                        defaultSize2 = i7 / i4;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i8 = (this.f30421OooOOO0 * size) / this.f30419OooOO0o;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    defaultSize2 = i8;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i3 = (this.f30419OooOO0o * size2) / this.f30421OooOOO0;
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                } else {
                    int i9 = this.f30419OooOO0o;
                    int i10 = this.f30421OooOOO0;
                    if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                        i3 = i9;
                        size2 = i10;
                    } else {
                        i3 = (size2 * i9) / i10;
                    }
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize2 = (i10 * size) / i9;
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
        if (OooO0OO() && this.f30420OooOOO != null) {
            OooO0o();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (OooO0OO() && this.f30420OooOOO != null) {
            OooO0o();
        }
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        if (OooO0OO() && this.f30417OooOO0.isPlaying()) {
            this.f30417OooOO0.pause();
            this.f30415OooO0oO = 4;
        }
        this.f30416OooO0oo = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        if (!OooO0OO()) {
            this.f30429OooOo00 = i;
        } else {
            this.f30417OooOO0.seekTo(i);
            this.f30429OooOo00 = 0;
        }
    }

    public void setMediaController(MediaController mediaController) {
        MediaController mediaController2 = this.f30420OooOOO;
        if (mediaController2 != null) {
            mediaController2.hide();
        }
        this.f30420OooOOO = mediaController;
        OooO00o();
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f30422OooOOOO = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f30424OooOOo = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.f30426OooOOoo = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f30423OooOOOo = onPreparedListener;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.f30414OooO0o0 = uri;
        this.f30413OooO0o = null;
        this.f30429OooOo00 = 0;
        OooO0Oo();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (OooO0OO()) {
            this.f30417OooOO0.start();
            this.f30415OooO0oO = 3;
        }
        this.f30416OooO0oo = 3;
    }

    public FixedTextureVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        OooO0O0();
    }

    public FixedTextureVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30412OooO0Oo = "TextureVideoView";
        this.f30415OooO0oO = 0;
        this.f30416OooO0oo = 0;
        this.f30411OooO = null;
        this.f30417OooOO0 = null;
        this.f30433OooOoO0 = new OooO00o();
        this.f30432OooOoO = new OooO0O0();
        this.f30434OooOoOO = new OooO0OO();
        this.f30436OooOoo0 = new OooO0o();
        this.f30435OooOoo = new OooO();
        this.f30437OooOooO = new OooOO0();
        this.f30438OooOooo = new OooOO0O();
        OooO0O0();
    }
}
