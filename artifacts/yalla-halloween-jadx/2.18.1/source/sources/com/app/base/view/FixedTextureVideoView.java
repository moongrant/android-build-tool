package com.app.base.view;

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

/* JADX INFO: loaded from: classes.dex */
public class FixedTextureVideoView extends TextureView implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f11988Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f11989Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Uri f11990Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Map<String, String> f11991Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f11992OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Surface f11993OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f11994OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public MediaPlayer f11995OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f11996OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public MediaController f11997OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f11998OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public MediaPlayer.OnPreparedListener f11999OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f12000OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public MediaPlayer.OnErrorListener f12001OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public MediaPlayer.OnInfoListener f12002Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f12003Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f12004OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f12005OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f12006OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public OooO00o f12007Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public Matrix f12008Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public OooO0O0 f12009OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public OooO0OO f12010Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f12011o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public OooOO0 f12012o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public OooOO0O f12013o00Oo0;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public OooO0o f12014o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public OooO f12015ooOO;

    public class OooO implements MediaPlayer.OnErrorListener {

        public class OooO00o implements DialogInterface.OnClickListener {
            public OooO00o() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
                MediaPlayer.OnCompletionListener onCompletionListener = fixedTextureVideoView.f11998OoooOOo;
                if (onCompletionListener != null) {
                    onCompletionListener.onCompletion(fixedTextureVideoView.f11995OoooO0O);
                }
            }
        }

        public OooO() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
            fixedTextureVideoView.f11988Oooo = -1;
            fixedTextureVideoView.f11994OoooO00 = -1;
            MediaController mediaController = fixedTextureVideoView.f11997OoooOOO;
            if (mediaController != null) {
                mediaController.hide();
            }
            FixedTextureVideoView fixedTextureVideoView2 = FixedTextureVideoView.this;
            MediaPlayer.OnErrorListener onErrorListener = fixedTextureVideoView2.f12001OoooOoo;
            if ((onErrorListener == null || !onErrorListener.onError(fixedTextureVideoView2.f11995OoooO0O, i, i2)) && FixedTextureVideoView.this.getWindowToken() != null) {
                FixedTextureVideoView.this.getContext().getResources();
                new AlertDialog.Builder(FixedTextureVideoView.this.getContext()).setMessage(i == 200 ? R.string.VideoView_error_text_invalid_progressive_playback : R.string.VideoView_error_text_unknown).setPositiveButton(R.string.VideoView_error_button, new OooO00o()).setCancelable(false).show();
            }
            return true;
        }
    }

    public class OooO00o implements MediaPlayer.OnVideoSizeChangedListener {
        public OooO00o() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            FixedTextureVideoView.this.f11996OoooOO0 = mediaPlayer.getVideoWidth();
            FixedTextureVideoView.this.f12011o000oOoO = mediaPlayer.getVideoHeight();
            FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
            if (fixedTextureVideoView.f11996OoooOO0 == 0 || fixedTextureVideoView.f12011o000oOoO == 0) {
                return;
            }
            SurfaceTexture surfaceTexture = fixedTextureVideoView.getSurfaceTexture();
            FixedTextureVideoView fixedTextureVideoView2 = FixedTextureVideoView.this;
            surfaceTexture.setDefaultBufferSize(fixedTextureVideoView2.f11996OoooOO0, fixedTextureVideoView2.f12011o000oOoO);
            FixedTextureVideoView.this.requestLayout();
            FixedTextureVideoView fixedTextureVideoView3 = FixedTextureVideoView.this;
            int i3 = fixedTextureVideoView3.f11996OoooOO0;
            int i4 = fixedTextureVideoView3.f12011o000oOoO;
            if (fixedTextureVideoView3.getResizedHeight() == 0 || fixedTextureVideoView3.getResizedWidth() == 0) {
                return;
            }
            float f = i3;
            float f2 = i4;
            float fMax = Math.max(fixedTextureVideoView3.getResizedWidth() / f, fixedTextureVideoView3.getResizedHeight() / f2);
            Matrix matrix = fixedTextureVideoView3.f12008Oooooo0;
            if (matrix == null) {
                fixedTextureVideoView3.f12008Oooooo0 = new Matrix();
            } else {
                matrix.reset();
            }
            fixedTextureVideoView3.f12008Oooooo0.preTranslate((fixedTextureVideoView3.getResizedWidth() - i3) / 2, (fixedTextureVideoView3.getResizedHeight() - i4) / 2);
            fixedTextureVideoView3.f12008Oooooo0.preScale(f / fixedTextureVideoView3.getResizedWidth(), f2 / fixedTextureVideoView3.getResizedHeight());
            fixedTextureVideoView3.f12008Oooooo0.postScale(fMax, fMax, fixedTextureVideoView3.getResizedWidth() / 2, fixedTextureVideoView3.getResizedHeight() / 2);
            fixedTextureVideoView3.setTransform(fixedTextureVideoView3.f12008Oooooo0);
            fixedTextureVideoView3.postInvalidate();
        }
    }

    public class OooO0O0 implements MediaPlayer.OnPreparedListener {
        public OooO0O0() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            MediaController mediaController;
            FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
            fixedTextureVideoView.f11988Oooo = 2;
            fixedTextureVideoView.f12006OooooOo = true;
            fixedTextureVideoView.f12005OooooOO = true;
            fixedTextureVideoView.f12004OooooO0 = true;
            MediaPlayer.OnPreparedListener onPreparedListener = fixedTextureVideoView.f11999OoooOo0;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(fixedTextureVideoView.f11995OoooO0O);
            }
            MediaController mediaController2 = FixedTextureVideoView.this.f11997OoooOOO;
            if (mediaController2 != null) {
                mediaController2.setEnabled(true);
            }
            FixedTextureVideoView.this.f11996OoooOO0 = mediaPlayer.getVideoWidth();
            FixedTextureVideoView.this.f12011o000oOoO = mediaPlayer.getVideoHeight();
            FixedTextureVideoView fixedTextureVideoView2 = FixedTextureVideoView.this;
            int i = fixedTextureVideoView2.f12003Ooooo0o;
            if (i != 0) {
                fixedTextureVideoView2.seekTo(i);
            }
            FixedTextureVideoView fixedTextureVideoView3 = FixedTextureVideoView.this;
            if (fixedTextureVideoView3.f11996OoooOO0 == 0 || fixedTextureVideoView3.f12011o000oOoO == 0) {
                if (fixedTextureVideoView3.f11994OoooO00 == 3) {
                    fixedTextureVideoView3.start();
                    return;
                }
                return;
            }
            SurfaceTexture surfaceTexture = fixedTextureVideoView3.getSurfaceTexture();
            FixedTextureVideoView fixedTextureVideoView4 = FixedTextureVideoView.this;
            surfaceTexture.setDefaultBufferSize(fixedTextureVideoView4.f11996OoooOO0, fixedTextureVideoView4.f12011o000oOoO);
            FixedTextureVideoView fixedTextureVideoView5 = FixedTextureVideoView.this;
            if (fixedTextureVideoView5.f11994OoooO00 == 3) {
                fixedTextureVideoView5.start();
                MediaController mediaController3 = FixedTextureVideoView.this.f11997OoooOOO;
                if (mediaController3 != null) {
                    mediaController3.show();
                    return;
                }
                return;
            }
            if (fixedTextureVideoView5.isPlaying()) {
                return;
            }
            if ((i != 0 || FixedTextureVideoView.this.getCurrentPosition() > 0) && (mediaController = FixedTextureVideoView.this.f11997OoooOOO) != null) {
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
            fixedTextureVideoView.f11988Oooo = 5;
            fixedTextureVideoView.f11994OoooO00 = 5;
            MediaController mediaController = fixedTextureVideoView.f11997OoooOOO;
            if (mediaController != null) {
                mediaController.hide();
            }
            FixedTextureVideoView fixedTextureVideoView2 = FixedTextureVideoView.this;
            MediaPlayer.OnCompletionListener onCompletionListener = fixedTextureVideoView2.f11998OoooOOo;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(fixedTextureVideoView2.f11995OoooO0O);
            }
        }
    }

    public class OooO0o implements MediaPlayer.OnInfoListener {
        public OooO0o() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            MediaPlayer.OnInfoListener onInfoListener = FixedTextureVideoView.this.f12002Ooooo00;
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
            FixedTextureVideoView.this.f12000OoooOoO = i;
        }
    }

    public class OooOO0O implements TextureView.SurfaceTextureListener {
        public OooOO0O() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            FixedTextureVideoView.this.f11993OoooO0 = new Surface(surfaceTexture);
            FixedTextureVideoView.this.OooO0Oo();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Surface surface = FixedTextureVideoView.this.f11993OoooO0;
            if (surface != null) {
                surface.release();
                FixedTextureVideoView.this.f11993OoooO0 = null;
            }
            MediaController mediaController = FixedTextureVideoView.this.f11997OoooOOO;
            if (mediaController != null) {
                mediaController.hide();
            }
            FixedTextureVideoView.this.OooO0o0(true);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            FixedTextureVideoView fixedTextureVideoView = FixedTextureVideoView.this;
            boolean z = false;
            boolean z2 = fixedTextureVideoView.f11994OoooO00 == 3;
            if (i > 0 && i2 > 0) {
                z = true;
            }
            if (fixedTextureVideoView.f11995OoooO0O != null && z2 && z) {
                int i3 = fixedTextureVideoView.f12003Ooooo0o;
                if (i3 != 0) {
                    fixedTextureVideoView.seekTo(i3);
                }
                FixedTextureVideoView.this.start();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public FixedTextureVideoView(Context context) {
        super(context);
        this.f11989Oooo0o = "TextureVideoView";
        this.f11988Oooo = 0;
        this.f11994OoooO00 = 0;
        this.f11993OoooO0 = null;
        this.f11995OoooO0O = null;
        this.f12007Oooooo = new OooO00o();
        this.f12009OoooooO = new OooO0O0();
        this.f12010Ooooooo = new OooO0OO();
        this.f12014o0OoOo0 = new OooO0o();
        this.f12015ooOO = new OooO();
        this.f12012o00O0O = new OooOO0();
        this.f12013o00Oo0 = new OooOO0O();
        OooO0O0();
    }

    public final void OooO00o() {
        MediaController mediaController;
        if (this.f11995OoooO0O == null || (mediaController = this.f11997OoooOOO) == null) {
            return;
        }
        mediaController.setMediaPlayer(this);
        this.f11997OoooOOO.setAnchorView(getParent() instanceof View ? (View) getParent() : this);
        this.f11997OoooOOO.setEnabled(OooO0OO());
    }

    public final void OooO0O0() {
        this.f11996OoooOO0 = 0;
        this.f12011o000oOoO = 0;
        setSurfaceTextureListener(this.f12013o00Oo0);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f11988Oooo = 0;
        this.f11994OoooO00 = 0;
    }

    public final boolean OooO0OO() {
        int i;
        return (this.f11995OoooO0O == null || (i = this.f11988Oooo) == -1 || i == 0 || i == 1) ? false : true;
    }

    public final void OooO0Oo() {
        if (this.f11990Oooo0oO == null || this.f11993OoooO0 == null) {
            return;
        }
        OooO0o0(false);
        ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).requestAudioFocus(null, 3, 1);
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f11995OoooO0O = mediaPlayer;
            int i = this.f11992OoooO;
            if (i != 0) {
                mediaPlayer.setAudioSessionId(i);
            } else {
                this.f11992OoooO = mediaPlayer.getAudioSessionId();
            }
            this.f11995OoooO0O.setOnPreparedListener(this.f12009OoooooO);
            this.f11995OoooO0O.setOnVideoSizeChangedListener(this.f12007Oooooo);
            this.f11995OoooO0O.setOnCompletionListener(this.f12010Ooooooo);
            this.f11995OoooO0O.setOnErrorListener(this.f12015ooOO);
            this.f11995OoooO0O.setOnInfoListener(this.f12014o0OoOo0);
            this.f11995OoooO0O.setOnBufferingUpdateListener(this.f12012o00O0O);
            this.f12000OoooOoO = 0;
            this.f11995OoooO0O.setDataSource(getContext().getApplicationContext(), this.f11990Oooo0oO, this.f11991Oooo0oo);
            this.f11995OoooO0O.setSurface(this.f11993OoooO0);
            this.f11995OoooO0O.setAudioStreamType(3);
            this.f11995OoooO0O.setScreenOnWhilePlaying(true);
            this.f11995OoooO0O.prepareAsync();
            this.f11988Oooo = 1;
            OooO00o();
        } catch (IOException e) {
            String str = this.f11989Oooo0o;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unable to open content: ");
            sbOooO0o0.append(this.f11990Oooo0oO);
            Log.w(str, sbOooO0o0.toString(), e);
            this.f11988Oooo = -1;
            this.f11994OoooO00 = -1;
            this.f12015ooOO.onError(this.f11995OoooO0O, 1, 0);
        } catch (IllegalArgumentException e2) {
            String str2 = this.f11989Oooo0o;
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Unable to open content: ");
            sbOooO0o1.append(this.f11990Oooo0oO);
            Log.w(str2, sbOooO0o1.toString(), e2);
            this.f11988Oooo = -1;
            this.f11994OoooO00 = -1;
            this.f12015ooOO.onError(this.f11995OoooO0O, 1, 0);
        }
    }

    public final void OooO0o() {
        if (this.f11997OoooOOO.isShowing()) {
            this.f11997OoooOOO.hide();
        } else {
            this.f11997OoooOOO.show();
        }
    }

    public final void OooO0o0(boolean z) {
        MediaPlayer mediaPlayer = this.f11995OoooO0O;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f11995OoooO0O.release();
            this.f11995OoooO0O = null;
            this.f11988Oooo = 0;
            if (z) {
                this.f11994OoooO00 = 0;
            }
            ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return this.f12004OooooO0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f12005OooooOO;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f12006OooooOo;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.f11992OoooO == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f11992OoooO = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f11992OoooO;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f11995OoooO0O != null) {
            return this.f12000OoooOoO;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (OooO0OO()) {
            return this.f11995OoooO0O.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (OooO0OO()) {
            return this.f11995OoooO0O.getDuration();
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
        return this.f12011o000oOoO;
    }

    public int getVideoWidth() {
        return this.f11996OoooOO0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return OooO0OO() && this.f11995OoooO0O.isPlaying();
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
        if (OooO0OO() && z && this.f11997OoooOOO != null) {
            if (i == 79 || i == 85) {
                if (this.f11995OoooO0O.isPlaying()) {
                    pause();
                    this.f11997OoooOOO.show();
                } else {
                    start();
                    this.f11997OoooOOO.hide();
                }
                return true;
            }
            if (i == 126) {
                if (!this.f11995OoooO0O.isPlaying()) {
                    start();
                    this.f11997OoooOOO.hide();
                }
                return true;
            }
            if (i == 86 || i == 127) {
                if (this.f11995OoooO0O.isPlaying()) {
                    pause();
                    this.f11997OoooOOO.show();
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
        int defaultSize = View.getDefaultSize(this.f11996OoooOO0, i);
        int defaultSize2 = View.getDefaultSize(this.f12011o000oOoO, i2);
        if (this.f11996OoooOO0 > 0 && this.f12011o000oOoO > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.f11996OoooOO0;
                int i5 = i4 * size2;
                int i6 = this.f12011o000oOoO;
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
                int i8 = (this.f12011o000oOoO * size) / this.f11996OoooOO0;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    defaultSize2 = i8;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i3 = (this.f11996OoooOO0 * size2) / this.f12011o000oOoO;
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize = size;
                    }
                    defaultSize2 = size2;
                } else {
                    int i9 = this.f11996OoooOO0;
                    int i10 = this.f12011o000oOoO;
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
        if (OooO0OO() && this.f11997OoooOOO != null) {
            OooO0o();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (OooO0OO() && this.f11997OoooOOO != null) {
            OooO0o();
        }
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        if (OooO0OO() && this.f11995OoooO0O.isPlaying()) {
            this.f11995OoooO0O.pause();
            this.f11988Oooo = 4;
        }
        this.f11994OoooO00 = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        if (!OooO0OO()) {
            this.f12003Ooooo0o = i;
        } else {
            this.f11995OoooO0O.seekTo(i);
            this.f12003Ooooo0o = 0;
        }
    }

    public void setMediaController(MediaController mediaController) {
        MediaController mediaController2 = this.f11997OoooOOO;
        if (mediaController2 != null) {
            mediaController2.hide();
        }
        this.f11997OoooOOO = mediaController;
        OooO00o();
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f11998OoooOOo = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f12001OoooOoo = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.f12002Ooooo00 = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f11999OoooOo0 = onPreparedListener;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.f11990Oooo0oO = uri;
        this.f11991Oooo0oo = null;
        this.f12003Ooooo0o = 0;
        OooO0Oo();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (OooO0OO()) {
            this.f11995OoooO0O.start();
            this.f11988Oooo = 3;
        }
        this.f11994OoooO00 = 3;
    }

    public FixedTextureVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        OooO0O0();
    }

    public FixedTextureVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11989Oooo0o = "TextureVideoView";
        this.f11988Oooo = 0;
        this.f11994OoooO00 = 0;
        this.f11993OoooO0 = null;
        this.f11995OoooO0O = null;
        this.f12007Oooooo = new OooO00o();
        this.f12009OoooooO = new OooO0O0();
        this.f12010Ooooooo = new OooO0OO();
        this.f12014o0OoOo0 = new OooO0o();
        this.f12015ooOO = new OooO();
        this.f12012o00O0O = new OooOO0();
        this.f12013o00Oo0 = new OooOO0O();
        OooO0O0();
    }
}
