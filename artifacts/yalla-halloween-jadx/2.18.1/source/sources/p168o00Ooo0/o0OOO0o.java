package p168o00Ooo0;

import android.media.MediaPlayer;
import java.io.FileInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public MediaPlayer f32656OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f32657OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f32658OooO0OO = "";

    public class OooO00o implements MediaPlayer.OnPreparedListener {
        public OooO00o() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.start();
            Objects.requireNonNull(o0OOO0o.this);
        }
    }

    public o0OOO0o(MediaPlayer.OnCompletionListener onCompletionListener) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f32656OooO00o = mediaPlayer;
        mediaPlayer.setOnCompletionListener(onCompletionListener);
    }

    public final void OooO00o(String str, String str2) {
        MediaPlayer mediaPlayer = this.f32656OooO00o;
        if (mediaPlayer == null) {
            return;
        }
        this.f32658OooO0OO = str2;
        try {
            if (this.f32657OooO0O0) {
                mediaPlayer.reset();
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            this.f32656OooO00o.setDataSource(fileInputStream.getFD());
            this.f32656OooO00o.setAudioStreamType(3);
            this.f32657OooO0O0 = true;
            this.f32656OooO00o.prepare();
            this.f32656OooO00o.setOnPreparedListener(new OooO00o());
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0O0() {
        MediaPlayer mediaPlayer = this.f32656OooO00o;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f32656OooO00o.stop();
        }
        this.f32658OooO0OO = "";
    }
}
