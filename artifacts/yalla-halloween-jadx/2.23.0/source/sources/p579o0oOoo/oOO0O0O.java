package p579o0oOoo;

import android.media.MediaPlayer;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class oOO0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public MediaPlayer f56656OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f56657OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f56658OooO0OO = "";

    public class OooO00o implements MediaPlayer.OnPreparedListener {
        public OooO00o() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.start();
            oOO0O0O.this.getClass();
        }
    }

    public oOO0O0O(MediaPlayer.OnCompletionListener onCompletionListener) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f56656OooO00o = mediaPlayer;
        mediaPlayer.setOnCompletionListener(onCompletionListener);
    }

    public final void OooO00o(String str, String str2) {
        MediaPlayer mediaPlayer = this.f56656OooO00o;
        if (mediaPlayer == null) {
            return;
        }
        this.f56658OooO0OO = str2;
        try {
            if (this.f56657OooO0O0) {
                mediaPlayer.reset();
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            this.f56656OooO00o.setDataSource(fileInputStream.getFD());
            this.f56656OooO00o.setAudioStreamType(3);
            this.f56657OooO0O0 = true;
            this.f56656OooO00o.prepare();
            this.f56656OooO00o.setOnPreparedListener(new OooO00o());
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0O0() {
        MediaPlayer mediaPlayer = this.f56656OooO00o;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f56656OooO00o.stop();
        }
        this.f56658OooO0OO = "";
        OooO0OO();
    }

    public final void OooO0OO() {
    }
}
