package io.agora.rtc.audio;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.Surface;
import android.webkit.URLUtil;
import com.facebook.login.widget.ToolTipPopup;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.agora.rtc.internal.Logging;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class MediaCodecAudioDecoder {
    private static final int EXTRACTOR_TIMEOUT_MS = 6000;
    private static final int HTTP_REQUEST_TIMEOUT = 4000;
    private static final int MAX_DECODER_RETRY_COUNT = 300;
    private static final String PREFIX_ASSETS = "/assets/";
    private static final String PREFIX_DOCUMENT = "content://";
    private static final String TAG = "MediaCodec Audio Decoder";
    private ByteBuffer mDecodedRAWBuffer;
    private long mFileLength;
    private ByteBuffer[] mInputBuffers;
    private ByteBuffer[] mOutputBuffers;
    private Context mContext = null;
    private MediaCodec mMediaCodec = null;
    private MediaExtractorWrapper mExtractor = null;
    private MediaFormat mTrackFormat = null;
    private boolean mDecodedDataReady = false;
    private boolean eoInputStream = false;
    private boolean eoOutputStream = false;
    private int mSampleRate = 44100;
    private int mChannels = 2;
    private int mRetryCount = 0;
    private MediaCodec mAACDecoder = null;
    private ByteBuffer mAACOutputBuffer = ByteBuffer.allocateDirect(4096);

    public class MediaExtractorWrapper {
        private final CountDownLatch countDownLatch;
        private final Handler mHandler;
        private final MediaExtractor mMediaExtractor;
        private volatile boolean mPrepared;
        private final String threadName;

        public MediaExtractorWrapper() {
            String str = "MediaExtractor-" + new Random().nextInt();
            this.threadName = str;
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper());
            this.mMediaExtractor = new MediaExtractor();
            this.countDownLatch = new CountDownLatch(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean setDataSource(final String str) throws InterruptedException {
            Logging.d(MediaCodecAudioDecoder.TAG, "setDataSource()");
            final boolean zStartsWith = str.startsWith(MediaCodecAudioDecoder.PREFIX_ASSETS);
            final boolean zStartsWith2 = str.startsWith(MediaCodecAudioDecoder.PREFIX_DOCUMENT);
            this.mHandler.post(new Runnable() { // from class: io.agora.rtc.audio.MediaCodecAudioDecoder.MediaExtractorWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    Logging.d(MediaCodecAudioDecoder.TAG, "setDataSource in thread " + MediaExtractorWrapper.this.threadName);
                    try {
                        if (zStartsWith && MediaCodecAudioDecoder.this.mContext != null) {
                            AssetFileDescriptor assetFileDescriptorOpenFd = MediaCodecAudioDecoder.this.mContext.getAssets().openFd(str.substring(8));
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                        } else if (!zStartsWith2 || MediaCodecAudioDecoder.this.mContext == null) {
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(str);
                        } else {
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(MediaCodecAudioDecoder.this.mContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r").getFileDescriptor());
                        }
                        MediaExtractorWrapper.this.mPrepared = true;
                    } catch (Exception unused) {
                        Logging.w(MediaCodecAudioDecoder.TAG, "setDataSource fail");
                    }
                    MediaExtractorWrapper.this.countDownLatch.countDown();
                }
            });
            this.countDownLatch.await(ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME, TimeUnit.MILLISECONDS);
            return this.mPrepared;
        }

        public void advance() {
            checkPrepared();
            this.mMediaExtractor.advance();
        }

        public void checkPrepared() {
            if (!this.mPrepared) {
                throw new IllegalStateException("mMediaExtractor hasn't prepared");
            }
        }

        public int getSampleFlags() {
            checkPrepared();
            return this.mMediaExtractor.getSampleFlags();
        }

        public long getSampleTime() {
            checkPrepared();
            return this.mMediaExtractor.getSampleTime();
        }

        public int getTrackCount() {
            checkPrepared();
            return this.mMediaExtractor.getTrackCount();
        }

        public MediaFormat getTrackFormat(int i) {
            checkPrepared();
            return this.mMediaExtractor.getTrackFormat(i);
        }

        public int readSampleData(ByteBuffer byteBuffer, int i) {
            checkPrepared();
            return this.mMediaExtractor.readSampleData(byteBuffer, i);
        }

        public void release() {
            Logging.d(MediaCodecAudioDecoder.TAG, "release()");
            this.mHandler.post(new Runnable() { // from class: io.agora.rtc.audio.MediaCodecAudioDecoder.MediaExtractorWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    if (MediaExtractorWrapper.this.mMediaExtractor != null) {
                        MediaExtractorWrapper.this.mMediaExtractor.release();
                    }
                    MediaExtractorWrapper.this.mHandler.getLooper().quit();
                    Logging.d(MediaCodecAudioDecoder.TAG, "mediaExtractor released in thread " + MediaExtractorWrapper.this.threadName);
                }
            });
        }

        public void seekTo(long j, int i) {
            checkPrepared();
            this.mMediaExtractor.seekTo(j, i);
        }

        public void selectTrack(int i) {
            checkPrepared();
            this.mMediaExtractor.selectTrack(i);
        }

        public void unselectTrack(int i) {
            checkPrepared();
            this.mMediaExtractor.unselectTrack(i);
        }
    }

    private boolean checkInfoChange() {
        try {
            MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            if (integer == 22050) {
                integer = 22000;
            } else if (integer == 11025) {
                integer = 11000;
            }
            int integer2 = outputFormat.getInteger("channel-count");
            boolean z = (this.mSampleRate == integer && this.mChannels == integer2) ? false : true;
            this.mSampleRate = integer;
            this.mChannels = integer2;
            return z;
        } catch (Exception e) {
            Logging.e(TAG, "Error when checking file's new format");
            e.printStackTrace();
            return false;
        }
    }

    private void cloneByteBuffer(ByteBuffer byteBuffer) {
        try {
            ByteBuffer byteBuffer2 = this.mDecodedRAWBuffer;
            if (byteBuffer2 == null || byteBuffer2.limit() != byteBuffer.limit()) {
                ByteBuffer byteBuffer3 = this.mDecodedRAWBuffer;
                if (byteBuffer3 != null) {
                    byteBuffer3.clear();
                    this.mDecodedRAWBuffer = null;
                }
                this.mDecodedRAWBuffer = ByteBuffer.allocateDirect(byteBuffer.limit());
            }
            this.mDecodedRAWBuffer.position(0);
            this.mDecodedRAWBuffer.put(byteBuffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cloneByteBufferByLength(ByteBuffer byteBuffer, int i) {
        try {
            ByteBuffer byteBuffer2 = this.mDecodedRAWBuffer;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i) {
                ByteBuffer byteBuffer3 = this.mDecodedRAWBuffer;
                if (byteBuffer3 != null) {
                    byteBuffer3.clear();
                    this.mDecodedRAWBuffer = null;
                }
                this.mDecodedRAWBuffer = ByteBuffer.allocateDirect(i);
            }
            this.mDecodedRAWBuffer.position(0);
            byteBuffer.limit(i);
            this.mDecodedRAWBuffer.put(byteBuffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encodeUrl(String str) {
        Logging.d(TAG, "encodedUrl()");
        try {
            URL url = new URL(str);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    public static boolean testNetworkUrlAvailable(String str) throws Throwable {
        Exception e;
        HttpURLConnection httpURLConnection;
        Logging.d(TAG, "testNetworkUrlAvailable encodedUrl");
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            try {
                try {
                    httpURLConnection.setConnectTimeout(4000);
                    httpURLConnection.setReadTimeout(4000);
                    httpURLConnection.getResponseCode();
                    boolean z = httpURLConnection.getResponseCode() != 404;
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    httpURLConnection.disconnect();
                    return z;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (httpURLConnection == null) {
                        return false;
                    }
                    httpURLConnection.disconnect();
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    public boolean checkAACSupported() {
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                if (!mediaCodecInfo.isEncoder() && mediaCodecInfo.getName().toLowerCase().contains("nvidia")) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "Error when checking aac codec availability");
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkUrlEncoded(String str) {
        try {
            return !TextUtils.equals(str, URLDecoder.decode(str, "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean createAACStreaming(int i) {
        try {
            this.mAACDecoder = MediaCodec.createDecoderByType("audio/mp4a-latm");
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, 1);
            mediaFormatCreateAudioFormat.setInteger("sample-rate", i);
            mediaFormatCreateAudioFormat.setInteger("channel-count", 1);
            mediaFormatCreateAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(new byte[]{18, -120}));
            this.mAACDecoder.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec != null) {
                mediaCodec.start();
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "Error when creating aac decode stream");
            e.printStackTrace();
            return false;
        }
    }

    public boolean createStreaming(String str) {
        try {
            Logging.i(TAG, "Try to decode audio file : " + str);
            this.mRetryCount = 0;
            if (TextUtils.isEmpty(str)) {
                Logging.w(TAG, "Fail to open, empty url");
                return false;
            }
            if (URLUtil.isNetworkUrl(str)) {
                String strEncodeUrl = checkUrlEncoded(str) ? str : encodeUrl(str);
                if (strEncodeUrl == null || !testNetworkUrlAvailable(strEncodeUrl)) {
                    Logging.w(TAG, "Fail to open, 404 for url");
                    return false;
                }
            }
            MediaExtractorWrapper mediaExtractorWrapper = new MediaExtractorWrapper();
            this.mExtractor = mediaExtractorWrapper;
            if (!mediaExtractorWrapper.setDataSource(str)) {
                Logging.w(TAG, "Failed to setDataSource");
                releaseStreaming();
                return false;
            }
            int trackCount = this.mExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                this.mExtractor.unselectTrack(i);
            }
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = this.mExtractor.getTrackFormat(i2);
                this.mTrackFormat = trackFormat;
                String string = trackFormat.getString("mime");
                this.mTrackFormat.setInteger("pcm-encoding", 2);
                if (string.contains("audio/")) {
                    this.mExtractor.selectTrack(i2);
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
                    this.mMediaCodec = mediaCodecCreateDecoderByType;
                    mediaCodecCreateDecoderByType.configure(this.mTrackFormat, (Surface) null, (MediaCrypto) null, 0);
                    break;
                }
            }
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.start();
            }
            this.mChannels = this.mTrackFormat.getInteger("channel-count");
            int integer = this.mTrackFormat.getInteger("sample-rate");
            this.mSampleRate = integer;
            if (integer == 22050) {
                this.mSampleRate = 22000;
            } else if (integer == 11025) {
                this.mSampleRate = 11000;
            }
            this.mFileLength = this.mTrackFormat.getLong("durationUs");
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "Error when creating aac audio file decoder");
            e.printStackTrace();
            return false;
        }
    }

    public int decodeAACFrame(byte[] bArr) {
        int i = 0;
        try {
            int iDequeueInputBuffer = this.mAACDecoder.dequeueInputBuffer(200L);
            if (iDequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = this.mAACDecoder.getInputBuffer(iDequeueInputBuffer);
                inputBuffer.clear();
                inputBuffer.put(bArr);
                this.mAACDecoder.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, 0L, 0);
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.mAACDecoder.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 || iDequeueOutputBuffer == -2 || iDequeueOutputBuffer == -1 || iDequeueOutputBuffer < 0) {
                return 0;
            }
            ByteBuffer outputBuffer = this.mAACDecoder.getOutputBuffer(iDequeueOutputBuffer);
            int i2 = bufferInfo.size;
            try {
                this.mAACOutputBuffer.position(0);
                outputBuffer.limit(i2);
                this.mAACOutputBuffer.put(outputBuffer);
                this.mAACDecoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return i2;
            } catch (Exception e) {
                i = i2;
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        Logging.e(TAG, "Error when decoding aac stream");
        e.printStackTrace();
        return i;
    }

    public boolean decodeFrame() {
        int iDequeueInputBuffer;
        int i;
        try {
            if (!this.eoInputStream && (iDequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(0L)) >= 0) {
                int sampleData = this.mExtractor.readSampleData(this.mMediaCodec.getInputBuffer(iDequeueInputBuffer), 0);
                if (sampleData <= 0) {
                    this.eoInputStream = true;
                    i = 0;
                } else {
                    i = sampleData;
                }
                long sampleTime = this.mExtractor.getSampleTime();
                int sampleFlags = this.mExtractor.getSampleFlags();
                if (this.eoInputStream) {
                    sampleFlags |= 4;
                }
                this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, i, sampleTime, sampleFlags);
                this.mExtractor.advance();
            }
            if (!this.eoOutputStream) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                int iDequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                this.mDecodedDataReady = false;
                if (iDequeueOutputBuffer != -3 && iDequeueOutputBuffer != -2) {
                    if (iDequeueOutputBuffer != -1) {
                        this.mRetryCount = 0;
                        if (iDequeueOutputBuffer >= 0) {
                            if ((bufferInfo.flags & 4) == 4) {
                                this.eoOutputStream = true;
                            }
                            cloneByteBuffer(this.mMediaCodec.getOutputBuffer(iDequeueOutputBuffer));
                            this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            this.mDecodedDataReady = true;
                        }
                    } else {
                        int i2 = this.mRetryCount + 1;
                        this.mRetryCount = i2;
                        if (i2 >= 300) {
                            Logging.e(TAG, "EAGAIN count=" + this.mRetryCount + " presentationTimeUs=" + bufferInfo.presentationTimeUs + " totalUs=" + this.mFileLength + " Force EOS");
                            this.eoOutputStream = true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            Logging.e(TAG, "Error when decoding audio file stream");
            e.printStackTrace();
        }
        return this.eoOutputStream;
    }

    public int getChannelCount() {
        return this.mChannels;
    }

    public long getCurrentFilePosition() {
        return this.mExtractor.getSampleTime();
    }

    public boolean getDecodeDataReadyFlag() {
        return this.mDecodedDataReady;
    }

    public long getFileLength() {
        return this.mFileLength;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public int getTrackNum() {
        MediaExtractorWrapper mediaExtractorWrapper = this.mExtractor;
        if (mediaExtractorWrapper == null) {
            return 0;
        }
        int trackCount = mediaExtractorWrapper.getTrackCount();
        int i = 0;
        for (int i2 = 0; i2 < trackCount; i2++) {
            if (this.mExtractor.getTrackFormat(i2).getString("mime").contains("audio/")) {
                i++;
            }
        }
        return i;
    }

    public void releaseAACStreaming() {
        try {
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACDecoder.release();
                this.mAACDecoder = null;
            }
        } catch (Exception e) {
            Logging.e(TAG, "Error when releasing aac decode stream");
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0023 A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #1 {Exception -> 0x0029, blocks: (B:3:0x0002, B:14:0x001d, B:13:0x0018, B:15:0x001f, B:17:0x0023, B:9:0x000c, B:6:0x0007, B:10:0x0011), top: B:25:0x0002, inners: #0, #2 }] */
    public void releaseStreaming() {
        MediaExtractorWrapper mediaExtractorWrapper;
        try {
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                } catch (Exception e) {
                    Logging.e(TAG, "Media decoder stop failed", e);
                }
                try {
                    this.mMediaCodec.release();
                } catch (Exception e2) {
                    Logging.e(TAG, "Media decoder release failed", e2);
                }
                this.mMediaCodec = null;
                mediaExtractorWrapper = this.mExtractor;
                if (mediaExtractorWrapper != null) {
                    mediaExtractorWrapper.release();
                    this.mExtractor = null;
                }
            } else {
                mediaExtractorWrapper = this.mExtractor;
                if (mediaExtractorWrapper != null) {
                    mediaExtractorWrapper.release();
                    this.mExtractor = null;
                }
            }
        } catch (Exception e3) {
            Logging.e(TAG, "Error when releasing audio file stream");
            e3.printStackTrace();
        }
        this.eoOutputStream = false;
        this.eoInputStream = false;
    }

    public void rewindStreaming() {
        try {
            this.mExtractor.seekTo(0L, 1);
            this.mMediaCodec.flush();
        } catch (Exception e) {
            Logging.e(TAG, "Error when rewinding audio file stream");
            e.printStackTrace();
        }
        this.eoInputStream = false;
        this.eoOutputStream = false;
        this.mDecodedDataReady = false;
    }

    public boolean selectTrack(int i) {
        if (this.mExtractor == null) {
            return false;
        }
        return createStreaming(i, getCurrentFilePosition());
    }

    public void setCurrentFilePosition(long j) {
        this.mExtractor.seekTo(j, 2);
    }

    private boolean createStreaming(int i, long j) {
        boolean z;
        try {
            int trackCount = this.mExtractor.getTrackCount();
            int i2 = i + 1;
            if (trackCount < i2) {
                return false;
            }
            for (int i3 = 0; i3 < trackCount; i3++) {
                this.mExtractor.unselectTrack(i3);
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= trackCount) {
                    z = false;
                    break;
                }
                MediaFormat trackFormat = this.mExtractor.getTrackFormat(i4);
                this.mTrackFormat = trackFormat;
                if (trackFormat.getString("mime").contains("audio/") && (i5 = i5 + 1) == i2) {
                    z = true;
                    break;
                }
                i4++;
            }
            if (!z) {
                Logging.e(TAG, "the selected audio track won't found");
                return false;
            }
            this.mExtractor.selectTrack(i4);
            setCurrentFilePosition(j);
            this.mChannels = this.mTrackFormat.getInteger("channel-count");
            int integer = this.mTrackFormat.getInteger("sample-rate");
            this.mSampleRate = integer;
            if (integer == 22050) {
                this.mSampleRate = 22000;
            } else if (integer == 11025) {
                this.mSampleRate = 11000;
            }
            this.mFileLength = this.mTrackFormat.getLong("durationUs");
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "Error when creating aac audio file decoder");
            e.printStackTrace();
            return false;
        }
    }
}
