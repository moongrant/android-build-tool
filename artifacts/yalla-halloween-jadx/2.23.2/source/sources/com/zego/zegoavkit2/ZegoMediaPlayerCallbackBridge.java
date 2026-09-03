package com.zego.zegoavkit2;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.zego.zegoavkit2.entities.VideoFrame;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ZegoMediaPlayerCallbackBridge {
    private static volatile HashMap<Integer, IZegoMediaPlayerWithIndexCallback> mEventWithIndexCallbackMap = new HashMap<>();
    private static volatile HashMap<Integer, IZegoMediaPlayerVideoPlayWithIndexCallback> mVideoDataWithIndexCallbackMap = new HashMap<>();
    private static volatile HashMap<Integer, IZegoMediaPlayerVideoPlayWithIndexCallback2> mVideoDataWithIndexCallback2Map = new HashMap<>();
    private static volatile HashMap<Integer, IZegoMediaPlayerAudioPlayCallback> mAudioDataCallbackMap = new HashMap<>();
    private static volatile HashMap<Integer, IZegoMediaPlayerMediaSideInfoCallback> mMediaSideInfoCallbackMap = new HashMap<>();
    private static volatile HashMap<Integer, ZegoMediaPlayerFileReader> mVideoMediaPlayerFileReaderMap = new HashMap<>();
    private static volatile HashMap<Integer, ByteBuffer> mVideoBuffers = new HashMap<>();

    public static void close(int i) {
        ZegoMediaPlayerFileReader zegoMediaPlayerFileReader = mVideoMediaPlayerFileReaderMap.get(Integer.valueOf(i));
        if (zegoMediaPlayerFileReader != null) {
            zegoMediaPlayerFileReader.close(i);
        }
    }

    public static int dequeueInputBuffer(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        IZegoMediaPlayerVideoPlayWithIndexCallback2 iZegoMediaPlayerVideoPlayWithIndexCallback2 = mVideoDataWithIndexCallback2Map.get(Integer.valueOf(i3));
        if (iZegoMediaPlayerVideoPlayWithIndexCallback2 != null) {
            return iZegoMediaPlayerVideoPlayWithIndexCallback2.dequeueInputBuffer(i, i2, iArr, iArr2, i3);
        }
        return -1;
    }

    public static VideoFrame getInputBuffer(int i, int i2) {
        IZegoMediaPlayerVideoPlayWithIndexCallback2 iZegoMediaPlayerVideoPlayWithIndexCallback2 = mVideoDataWithIndexCallback2Map.get(Integer.valueOf(i2));
        if (iZegoMediaPlayerVideoPlayWithIndexCallback2 != null) {
            return iZegoMediaPlayerVideoPlayWithIndexCallback2.getInputBuffer(i, i2);
        }
        return null;
    }

    public static long getSize(int i) {
        ZegoMediaPlayerFileReader zegoMediaPlayerFileReader = mVideoMediaPlayerFileReaderMap.get(Integer.valueOf(i));
        if (zegoMediaPlayerFileReader != null) {
            return zegoMediaPlayerFileReader.getSize(i);
        }
        return 0L;
    }

    public static void onAudioBegin(final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.7
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onAudioBegin(i);
                }
            }
        });
    }

    public static void onAudioDataCallback(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        IZegoMediaPlayerAudioPlayCallback iZegoMediaPlayerAudioPlayCallback = mAudioDataCallbackMap.get(Integer.valueOf(i4));
        if (iZegoMediaPlayerAudioPlayCallback != null) {
            iZegoMediaPlayerAudioPlayCallback.onPlayAudioData(byteBuffer, i, i2, i3, i4);
        }
    }

    public static void onBufferBegin(final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.9
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onBufferBegin(i);
                }
            }
        });
    }

    public static void onBufferEnd(final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.10
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onBufferEnd(i);
                }
            }
        });
    }

    public static void onLoadComplete(final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.11
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onLoadComplete(i);
                }
            }
        });
    }

    public static void onMediaSideInfoCallback(ByteBuffer byteBuffer, int i) {
        IZegoMediaPlayerMediaSideInfoCallback iZegoMediaPlayerMediaSideInfoCallback = mMediaSideInfoCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerMediaSideInfoCallback != null) {
            iZegoMediaPlayerMediaSideInfoCallback.onMediaSideInfo(byteBuffer, i);
        }
    }

    public static void onPlayEnd(final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.8
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onPlayEnd(i);
                }
            }
        });
    }

    public static void onPlayError(final int i, final int i2) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i2));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.5
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onPlayError(i, i2);
                }
            }
        });
    }

    public static void onPlayPause(final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.2
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onPlayPause(i);
                }
            }
        });
    }

    public static void onPlayResume(final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.4
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onPlayResume(i);
                }
            }
        });
    }

    public static void onPlayStart(final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.1
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onPlayStart(i);
                }
            }
        });
    }

    public static void onPlayStop(final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.3
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onPlayStop(i);
                }
            }
        });
    }

    public static void onPlayVideoData(ByteBuffer byteBuffer, int i, ZegoVideoDataFormat zegoVideoDataFormat, int i2) {
        IZegoMediaPlayerVideoPlayWithIndexCallback iZegoMediaPlayerVideoPlayWithIndexCallback = mVideoDataWithIndexCallbackMap.get(Integer.valueOf(i2));
        if (iZegoMediaPlayerVideoPlayWithIndexCallback != null) {
            ByteBuffer byteBufferAllocateDirect = mVideoBuffers.containsKey(Integer.valueOf(i2)) ? mVideoBuffers.get(Integer.valueOf(i2)) : null;
            if (byteBufferAllocateDirect == null || byteBufferAllocateDirect.capacity() < i) {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
                mVideoBuffers.put(Integer.valueOf(i2), byteBufferAllocateDirect);
            }
            byteBufferAllocateDirect.clear();
            byteBufferAllocateDirect.put(byteBuffer);
            byteBufferAllocateDirect.flip();
            iZegoMediaPlayerVideoPlayWithIndexCallback.onPlayVideoData(byteBufferAllocateDirect.array(), i, zegoVideoDataFormat, i2);
        }
    }

    public static void onProcessInterval(long j, int i) {
        IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        iZegoMediaPlayerWithIndexCallback.onProcessInterval(j, i);
    }

    public static void onReadEOF(final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.14
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onReadEOF(i);
                }
            }
        });
    }

    public static void onSeekComplete(final int i, final long j, final int i2) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i2));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.12
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onSeekComplete(i, j, i2);
                }
            }
        });
    }

    public static void onSnapshot(Bitmap bitmap, final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        final Bitmap bitmapCopy = bitmap != null ? bitmap.copy(bitmap.getConfig(), true) : null;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.13
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onSnapshot(bitmapCopy, i);
                }
            }
        });
    }

    public static void onVideoBegin(final int i) {
        final IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback = mEventWithIndexCallbackMap.get(Integer.valueOf(i));
        if (iZegoMediaPlayerWithIndexCallback == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zego.zegoavkit2.ZegoMediaPlayerCallbackBridge.6
            @Override // java.lang.Runnable
            public void run() {
                IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback2 = iZegoMediaPlayerWithIndexCallback;
                if (iZegoMediaPlayerWithIndexCallback2 != null) {
                    iZegoMediaPlayerWithIndexCallback2.onVideoBegin(i);
                }
            }
        });
    }

    public static int open(String str, int i) {
        ZegoMediaPlayerFileReader zegoMediaPlayerFileReader = mVideoMediaPlayerFileReaderMap.get(Integer.valueOf(i));
        if (zegoMediaPlayerFileReader != null) {
            return zegoMediaPlayerFileReader.open(str, i);
        }
        return -1;
    }

    public static void queueInputBuffer(int i, ZegoVideoDataFormat zegoVideoDataFormat, int i2) {
        IZegoMediaPlayerVideoPlayWithIndexCallback2 iZegoMediaPlayerVideoPlayWithIndexCallback2 = mVideoDataWithIndexCallback2Map.get(Integer.valueOf(i2));
        if (iZegoMediaPlayerVideoPlayWithIndexCallback2 != null) {
            iZegoMediaPlayerVideoPlayWithIndexCallback2.queueInputBuffer(i, zegoVideoDataFormat, i2);
        }
    }

    public static ByteBuffer read(int i, int i2) {
        ZegoMediaPlayerFileReader zegoMediaPlayerFileReader = mVideoMediaPlayerFileReaderMap.get(Integer.valueOf(i2));
        if (zegoMediaPlayerFileReader != null) {
            return zegoMediaPlayerFileReader.read(i, i2);
        }
        return null;
    }

    public static void removeVideoDataBuffer(int i) {
        if (mVideoBuffers.containsKey(Integer.valueOf(i))) {
            mVideoBuffers.remove(Integer.valueOf(i));
        }
    }

    public static long seek(long j, int i, int i2) {
        ZegoMediaPlayerFileReader zegoMediaPlayerFileReader = mVideoMediaPlayerFileReaderMap.get(Integer.valueOf(i2));
        if (zegoMediaPlayerFileReader != null) {
            return zegoMediaPlayerFileReader.seek(j, i, i2);
        }
        return -1L;
    }

    public static void setAudioDataCallback(IZegoMediaPlayerAudioPlayCallback iZegoMediaPlayerAudioPlayCallback, int i) {
        mAudioDataCallbackMap.put(Integer.valueOf(i), iZegoMediaPlayerAudioPlayCallback);
    }

    public static void setEventWithIndexCallback(IZegoMediaPlayerWithIndexCallback iZegoMediaPlayerWithIndexCallback, int i) {
        mEventWithIndexCallbackMap.put(Integer.valueOf(i), iZegoMediaPlayerWithIndexCallback);
    }

    public static void setMediaPlayerFileReader(ZegoMediaPlayerFileReader zegoMediaPlayerFileReader, int i) {
        mVideoMediaPlayerFileReaderMap.put(Integer.valueOf(i), zegoMediaPlayerFileReader);
    }

    public static void setMediaSideInfoCallback(IZegoMediaPlayerMediaSideInfoCallback iZegoMediaPlayerMediaSideInfoCallback, int i) {
        mMediaSideInfoCallbackMap.put(Integer.valueOf(i), iZegoMediaPlayerMediaSideInfoCallback);
    }

    public static void setVideoDataWithIndexCallback(IZegoMediaPlayerVideoPlayWithIndexCallback iZegoMediaPlayerVideoPlayWithIndexCallback, int i) {
        mVideoDataWithIndexCallbackMap.put(Integer.valueOf(i), iZegoMediaPlayerVideoPlayWithIndexCallback);
    }

    public static void setVideoDataWithIndexCallback2(IZegoMediaPlayerVideoPlayWithIndexCallback2 iZegoMediaPlayerVideoPlayWithIndexCallback2, int i) {
        mVideoDataWithIndexCallback2Map.put(Integer.valueOf(i), iZegoMediaPlayerVideoPlayWithIndexCallback2);
    }
}
