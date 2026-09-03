package p590o0oOooo0;

import android.media.MediaPlayer;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public MediaPlayer f57121OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f57122OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f57123OooO0OO = "";

    public class OooO00o implements MediaPlayer.OnPreparedListener {
        public OooO00o() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.start();
            i0.this.getClass();
        }
    }

    public i0(MediaPlayer.OnCompletionListener onCompletionListener) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f57121OooO00o = mediaPlayer;
        mediaPlayer.setOnCompletionListener(onCompletionListener);
    }

    public final void OooO00o(String str, String str2) {
        MediaPlayer mediaPlayer = this.f57121OooO00o;
        if (mediaPlayer == null) {
            return;
        }
        this.f57123OooO0OO = str2;
        try {
            if (this.f57122OooO0O0) {
                mediaPlayer.reset();
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            this.f57121OooO00o.setDataSource(fileInputStream.getFD());
            this.f57121OooO00o.setAudioStreamType(3);
            this.f57122OooO0O0 = true;
            this.f57121OooO00o.prepare();
            this.f57121OooO00o.setOnPreparedListener(new OooO00o());
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0O0() {
        MediaPlayer mediaPlayer = this.f57121OooO00o;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f57121OooO00o.stop();
        }
        this.f57123OooO0OO = "";
        OooO0OO();
    }

    public final void OooO0OO() {
    }
}
