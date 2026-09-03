package o0OOO0OO;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.Surface;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends o0OOO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public MediaPlayer f42763OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MediaMetadataRetriever f42764OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public String f42765OooO0OO;

    public static final class OooO00o implements MediaPlayer.OnCompletionListener {
        public OooO00o() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            o0OOO0OO.OooO0OO.OooO00o completionListener = OooO0O0.this.getCompletionListener();
            if (completionListener != null) {
                completionListener.OooO0O0();
            }
        }
    }

    /* JADX INFO: renamed from: o0OOO0OO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0447OooO0O0 implements MediaPlayer.OnPreparedListener {
        public C0447OooO0O0() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            o0OOO0OO.OooO0OO.OooO0o preparedListener = OooO0O0.this.getPreparedListener();
            if (preparedListener != null) {
                preparedListener.OooO00o();
            }
        }
    }

    public static final class OooO0OO implements MediaPlayer.OnErrorListener {
        public OooO0OO() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            o0OOO0OO.OooO0OO.OooO0O0 errorListener = OooO0O0.this.getErrorListener();
            if (errorListener == null) {
                return false;
            }
            errorListener.onError();
            return false;
        }
    }

    public static final class OooO0o implements MediaPlayer.OnInfoListener {
        public OooO0o() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            o0OOO0OO.OooO0OO.InterfaceC0448OooO0OO firstFrameListener;
            if (i != 3 || (firstFrameListener = OooO0O0.this.getFirstFrameListener()) == null) {
                return false;
            }
            firstFrameListener.OooO00o();
            return false;
        }
    }

    public OooO0O0() {
        super(null, 1, null);
        this.f42764OooO0O0 = new MediaMetadataRetriever();
    }

    @Override // o0OOO0OO.OooO0OO
    @NotNull
    public final o0OOO0O.OooO0O0 getVideoInfo() throws Exception {
        String str = this.f42765OooO0OO;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataPath");
        }
        if (TextUtils.isEmpty(str)) {
            throw new Exception("dataPath is null, please set setDataSource firstly!");
        }
        MediaMetadataRetriever mediaMetadataRetriever = this.f42764OooO0O0;
        String str2 = this.f42765OooO0OO;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataPath");
        }
        mediaMetadataRetriever.setDataSource(str2);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        if (TextUtils.isEmpty(strExtractMetadata) || TextUtils.isEmpty(strExtractMetadata2)) {
            throw new Exception("DefaultSystemPlayer get metadata failure!");
        }
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(18);
        Intrinsics.checkExpressionValueIsNotNull(strExtractMetadata3, "retriever.extractMetadat…METADATA_KEY_VIDEO_WIDTH)");
        int i = Integer.parseInt(strExtractMetadata3);
        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(19);
        Intrinsics.checkExpressionValueIsNotNull(strExtractMetadata4, "retriever.extractMetadat…ETADATA_KEY_VIDEO_HEIGHT)");
        return new o0OOO0O.OooO0O0(i, Integer.parseInt(strExtractMetadata4));
    }

    @Override // o0OOO0OO.OooO0OO
    public final void initMediaPlayer() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f42763OooO00o = mediaPlayer;
        mediaPlayer.setOnCompletionListener(new OooO00o());
        MediaPlayer mediaPlayer2 = this.f42763OooO00o;
        if (mediaPlayer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer2.setOnPreparedListener(new C0447OooO0O0());
        MediaPlayer mediaPlayer3 = this.f42763OooO00o;
        if (mediaPlayer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer3.setOnErrorListener(new OooO0OO());
        MediaPlayer mediaPlayer4 = this.f42763OooO00o;
        if (mediaPlayer4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer4.setOnInfoListener(new OooO0o());
    }

    @Override // o0OOO0OO.OooO0OO
    public final void pause() {
        MediaPlayer mediaPlayer = this.f42763OooO00o;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.pause();
    }

    @Override // o0OOO0OO.OooO0OO
    public final void prepareAsync() {
        MediaPlayer mediaPlayer = this.f42763OooO00o;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.prepareAsync();
    }

    @Override // o0OOO0OO.OooO0OO
    public final void release() {
        MediaPlayer mediaPlayer = this.f42763OooO00o;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.release();
        this.f42765OooO0OO = "";
    }

    @Override // o0OOO0OO.OooO0OO
    public final void reset() {
        MediaPlayer mediaPlayer = this.f42763OooO00o;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.reset();
        this.f42765OooO0OO = "";
    }

    @Override // o0OOO0OO.OooO0OO
    public final void setDataSource(@NotNull String str) throws IOException {
        this.f42765OooO0OO = str;
        MediaPlayer mediaPlayer = this.f42763OooO00o;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.setDataSource(str);
    }

    @Override // o0OOO0OO.OooO0OO
    public final void setLooping(boolean z) {
        MediaPlayer mediaPlayer = this.f42763OooO00o;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.setLooping(false);
    }

    @Override // o0OOO0OO.OooO0OO
    public final void setScreenOnWhilePlaying(boolean z) {
        MediaPlayer mediaPlayer = this.f42763OooO00o;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.setScreenOnWhilePlaying(true);
    }

    @Override // o0OOO0OO.OooO0OO
    public final void setSurface(@NotNull Surface surface) {
        MediaPlayer mediaPlayer = this.f42763OooO00o;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.setSurface(surface);
    }

    @Override // o0OOO0OO.OooO0OO
    public final void start() {
        MediaPlayer mediaPlayer = this.f42763OooO00o;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.start();
    }

    @Override // o0OOO0OO.OooO0OO
    public final void stop() {
        MediaPlayer mediaPlayer = this.f42763OooO00o;
        if (mediaPlayer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
        }
        mediaPlayer.stop();
    }
}
