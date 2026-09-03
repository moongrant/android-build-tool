package p423o0OoO000;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.Surface;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p468o0OooOoo.oO0000Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends OooOO0O {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MediaMetadataRetriever f39835OooO0o = new MediaMetadataRetriever();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public MediaPlayer f39836OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public String f39837OooO0oO;

    public static final class OooO00o implements MediaPlayer.OnCompletionListener {
        public OooO00o() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            OooOOO.OooO00o oooO00o = OooOOO0.this.f39831OooO00o;
            if (oooO00o != null) {
                oooO00o.OooO0O0();
            }
        }
    }

    public static final class OooO0O0 implements MediaPlayer.OnPreparedListener {
        public OooO0O0() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            OooOOO.OooO0o oooO0o = OooOOO0.this.f39832OooO0O0;
            if (oooO0o != null) {
                oooO0o.OooO00o();
            }
        }
    }

    public static final class OooO0OO implements MediaPlayer.OnErrorListener {
        public OooO0OO() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            OooOOO.OooO0O0 oooO0O0 = OooOOO0.this.f39833OooO0OO;
            if (oooO0O0 == null) {
                return false;
            }
            oooO0O0.OooO00o(i, i2, "");
            return false;
        }
    }

    public static final class OooO0o implements MediaPlayer.OnInfoListener {
        public OooO0o() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            OooOOO.OooO0OO oooO0OO;
            if (i != 3 || (oooO0OO = OooOOO0.this.f39834OooO0Oo) == null) {
                return false;
            }
            oooO0OO.OooO00o();
            return false;
        }
    }

    @Override // p423o0OoO000.OooOOO
    public final void OooO00o() {
        MediaPlayer mediaPlayer = this.f39836OooO0o0;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.reset();
        this.f39837OooO0oO = "";
    }

    @Override // p423o0OoO000.OooOOO
    public final void OooO0O0(@NotNull Surface surface) {
        MediaPlayer mediaPlayer = this.f39836OooO0o0;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.setSurface(surface);
    }

    @Override // p423o0OoO000.OooOOO
    @NotNull
    public final oO0000Oo OooO0OO() throws Exception {
        String str = this.f39837OooO0oO;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataPath");
        }
        if (TextUtils.isEmpty(str)) {
            throw new Exception("dataPath is null, please set setDataSource firstly!");
        }
        MediaMetadataRetriever mediaMetadataRetriever = this.f39835OooO0o;
        String str2 = this.f39837OooO0oO;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataPath");
        }
        mediaMetadataRetriever.setDataSource(str2);
        String strExtractMetadata = this.f39835OooO0o.extractMetadata(18);
        String strExtractMetadata2 = this.f39835OooO0o.extractMetadata(19);
        if (TextUtils.isEmpty(strExtractMetadata) || TextUtils.isEmpty(strExtractMetadata2)) {
            throw new Exception("DefaultSystemPlayer get metadata failure!");
        }
        String strExtractMetadata3 = this.f39835OooO0o.extractMetadata(18);
        Intrinsics.checkExpressionValueIsNotNull(strExtractMetadata3, "retriever.extractMetadat…METADATA_KEY_VIDEO_WIDTH)");
        int i = Integer.parseInt(strExtractMetadata3);
        String strExtractMetadata4 = this.f39835OooO0o.extractMetadata(19);
        Intrinsics.checkExpressionValueIsNotNull(strExtractMetadata4, "retriever.extractMetadat…ETADATA_KEY_VIDEO_HEIGHT)");
        return new oO0000Oo(i, Integer.parseInt(strExtractMetadata4));
    }

    @Override // p423o0OoO000.OooOOO
    @NotNull
    public final String OooO0o() {
        return "DefaultSystemPlayer";
    }

    @Override // p423o0OoO000.OooOOO
    public final void OooO0oO() {
        MediaPlayer mediaPlayer = this.f39836OooO0o0;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.setScreenOnWhilePlaying(true);
    }

    @Override // p423o0OoO000.OooOOO
    public final void OooO0oo() {
        MediaPlayer mediaPlayer = this.f39836OooO0o0;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.setLooping(false);
    }

    @Override // p423o0OoO000.OooOOO
    public final void OooOO0() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f39836OooO0o0 = mediaPlayer;
        mediaPlayer.setOnCompletionListener(new OooO00o());
        MediaPlayer mediaPlayer2 = this.f39836OooO0o0;
        if (mediaPlayer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer2.setOnPreparedListener(new OooO0O0());
        MediaPlayer mediaPlayer3 = this.f39836OooO0o0;
        if (mediaPlayer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer3.setOnErrorListener(new OooO0OO());
        MediaPlayer mediaPlayer4 = this.f39836OooO0o0;
        if (mediaPlayer4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer4.setOnInfoListener(new OooO0o());
    }

    @Override // p423o0OoO000.OooOOO
    public final void OooOO0O(@NotNull String str) throws IOException {
        this.f39837OooO0oO = str;
        MediaPlayer mediaPlayer = this.f39836OooO0o0;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.setDataSource(str);
    }

    @Override // p423o0OoO000.OooOOO
    public final void OooOO0o() {
        MediaPlayer mediaPlayer = this.f39836OooO0o0;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.prepareAsync();
    }

    @Override // p423o0OoO000.OooOOO
    public final void pause() {
        MediaPlayer mediaPlayer = this.f39836OooO0o0;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.pause();
    }

    @Override // p423o0OoO000.OooOOO
    public final void release() {
        MediaPlayer mediaPlayer = this.f39836OooO0o0;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.release();
        this.f39837OooO0oO = "";
    }

    @Override // p423o0OoO000.OooOOO
    public final void start() {
        MediaPlayer mediaPlayer = this.f39836OooO0o0;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.start();
    }

    @Override // p423o0OoO000.OooOOO
    public final void stop() {
        MediaPlayer mediaPlayer = this.f39836OooO0o0;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.stop();
    }
}
