package io.agora.rtc.internal;

import OooO00o.OooO00o;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.uc.crashsdk.export.LogType;
import com.yalla.yalla.common.manager.googlepay.PayError;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.AgoraMediaRecorder;
import io.agora.rtc.Constants;
import io.agora.rtc.IAudioEffectManager;
import io.agora.rtc.IAudioFrameObserver;
import io.agora.rtc.ILogWriter;
import io.agora.rtc.IMetadataObserver;
import io.agora.rtc.IRtcChannelEventHandler;
import io.agora.rtc.IRtcEngineEventHandler;
import io.agora.rtc.IRtcEngineEventHandlerEx;
import io.agora.rtc.IVideoEncodedFrameObserver;
import io.agora.rtc.IVideoFrameObserver;
import io.agora.rtc.RtcChannel;
import io.agora.rtc.RtcEngineConfig;
import io.agora.rtc.RtcEngineEx;
import io.agora.rtc.audio.AgoraRhythmPlayerConfig;
import io.agora.rtc.audio.AudioParams;
import io.agora.rtc.audio.AudioRecordingConfiguration;
import io.agora.rtc.audio.HardwareEarbackController;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.live.LiveInjectStreamConfig;
import io.agora.rtc.live.LiveTranscoding;
import io.agora.rtc.mediaio.AgoraDefaultRender;
import io.agora.rtc.mediaio.AgoraDefaultSource;
import io.agora.rtc.mediaio.IVideoSink;
import io.agora.rtc.mediaio.IVideoSource;
import io.agora.rtc.models.ChannelMediaOptions;
import io.agora.rtc.models.ClientRoleOptions;
import io.agora.rtc.models.ContentInspectConfig;
import io.agora.rtc.models.DataStreamConfig;
import io.agora.rtc.models.EchoTestConfiguration;
import io.agora.rtc.models.UserInfo;
import io.agora.rtc.video.AgoraImage;
import io.agora.rtc.video.AgoraVideoFrame;
import io.agora.rtc.video.BeautyOptions;
import io.agora.rtc.video.CameraCapturerConfiguration;
import io.agora.rtc.video.ChannelMediaInfo;
import io.agora.rtc.video.ChannelMediaRelayConfiguration;
import io.agora.rtc.video.ColorEnhanceOptions;
import io.agora.rtc.video.LowLightEnhanceOptions;
import io.agora.rtc.video.VideoCanvas;
import io.agora.rtc.video.VideoDenoiserOptions;
import io.agora.rtc.video.VideoEncoderConfiguration;
import io.agora.rtc.video.VirtualBackgroundSource;
import io.agora.rtc.video.WatermarkOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.microedition.khronos.egl.EGLContext;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public class RtcEngineImpl extends RtcEngineEx implements IAudioEffectManager {
    private static final String TAG = "RtcEngine";
    public static final int VIDEO_SOURCE_TYPE_CUSTOMIZED = 2;
    public static final int VIDEO_SOURCE_TYPE_DEFAULT = 1;
    private static final int VIDEO_SOURCE_TYPE_EXTERNAL_DEPRECATED = 3;
    public static final int VIDEO_SOURCE_TYPE_NULL = 0;
    private static boolean sLibLoaded = false;
    public static float[] sMatrix = {1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f};
    public IRtcEngineEventHandler.AgoraFacePositionInfo[] faceRectArr;
    private WeakReference<Context> mContext;
    private long mNativeHandle;
    private int mVideoSourceType = 1;
    private boolean mLocalVideoEnabled = false;
    private boolean mUseLocalView = false;
    private int mExAudioSourceSampleRate = 0;
    private int mExAudioSourceChannels = 0;
    private int mExAudioSinkChannels = -1;
    private int mExAudioSinkSampleRate = -1;
    private long lastOrientationTs = 0;
    private int mTotalRotation = 1000;
    private final ConcurrentHashMap<IRtcEngineEventHandler, Integer> mRtcHandlers = new ConcurrentHashMap<>();
    private RtcChannelImpl mDefaultRtcChannel = null;
    private final LinkedList<RtcChannelImpl> mRtcChannels = new LinkedList<>();
    private IRtcEngineEventHandler.RtcStats mRtcStats = null;
    private WifiManager.WifiLock mWifiLock = null;
    private int mChannelProfile = 1;
    private int mClientRole = 2;
    private IntentFilter filter = new IntentFilter();
    private BroadcastReceiver mUsbStateChangeReceiver = new BroadcastReceiver() { // from class: io.agora.rtc.internal.RtcEngineImpl.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action) || "android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(action)) {
                Logging.i(RtcEngineImpl.TAG, "device attached");
                RtcEngineImpl.this.refresh_device_list();
            }
            if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action) || "android.hardware.usb.action.USB_ACCESSORY_DETACHED".equals(action)) {
                Logging.i(RtcEngineImpl.TAG, "device detached");
                RtcEngineImpl.this.refresh_device_list();
            }
        }
    };

    public RtcEngineImpl(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler) throws Exception {
        this.mNativeHandle = 0L;
        this.mContext = new WeakReference<>(context);
        addHandler(iRtcEngineEventHandler);
        HardwareEarbackController.getInstance(context).isHardwareEarbackSupported();
        this.mNativeHandle = nativeObjectInit(context, str, "", "", "", "", "", "");
        initDeviceNotify(context);
        setParameter("che.android_app_external_storage_path", CommonUtility.getAppPrivateStorageDir(context));
    }

    private int adjustEffectsPlayoutVolume(int i) {
        return setParameter("che.audio.set_effect_file_playout_volume", i);
    }

    private int adjustEffectsPublishVolume(int i) {
        return setParameter("che.audio.set_effect_file_publish_volume", i);
    }

    public static boolean checkIfInUIThread(String str) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            Logging.i(TAG, str + " in UI Thread");
            return true;
        }
        Logging.i(TAG, str + " not in UI Thread");
        return false;
    }

    private synchronized boolean checkStatus() {
        if (this.mNativeHandle == 0) {
            throw new IllegalStateException("RtcEngine does not initialize or it may be destroyed");
        }
        return true;
    }

    private void checkVoipPermissions(Context context, String str) throws SecurityException {
        if (context == null || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            throw new SecurityException(OooOo00.OooO00o(str, " is not granted"));
        }
    }

    private native int deliverFrame(long j, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8);

    private int doCheckPermission(Context context) {
        try {
            checkVoipPermissions(context, "android.permission.INTERNET");
            return 0;
        } catch (SecurityException unused) {
            Logging.e(TAG, "can't join channel because no permission");
            return -9;
        }
    }

    private void doJoinChannelCheck(Context context) {
        if (joinChannelFirstTimeOrAllChannelLeft()) {
            doMonitorSystemEvent(context);
            doCheckPermission(context);
        }
    }

    private void doLeaveChannelCheck() {
        if (joinChannelFirstTimeOrAllChannelLeft()) {
            doStopMonitorSystemEvent();
        }
    }

    private void doMonitorSystemEvent(Context context) {
        WifiManager.WifiLock wifiLock;
        if (context != null && context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0 && Connectivity.getNetworkType(context) == 2 && context.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0 && (wifiLock = this.mWifiLock) != null) {
            wifiLock.acquire();
            Logging.i(TAG, "hp connection mode detected");
        }
    }

    private void doStopMonitorSystemEvent() {
        WifiManager.WifiLock wifiLock = this.mWifiLock;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.mWifiLock.release();
        Logging.i(TAG, "hp connection mode ended");
    }

    private static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    private String getAssetsCacheFile(Context context, String str) {
        try {
            File file = new File(context.getCacheDir(), "wm_" + str.replace(File.separator, "_"));
            if (file.exists()) {
                file.delete();
            }
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i <= 0) {
                            fileOutputStream.close();
                            inputStreamOpen.close();
                            return file.getAbsolutePath();
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                inputStreamOpen.close();
                throw th2;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private int getEffectsPlayoutVolume() {
        int iNativeGetIntParameter = nativeGetIntParameter(this.mNativeHandle, "che.audio.get_effect_file_playout_volume", null);
        if (iNativeGetIntParameter < 0) {
            return 0;
        }
        return iNativeGetIntParameter;
    }

    public static String getLocalHost() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (!networkInterface.getName().startsWith("usb")) {
                    Iterator it = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it.hasNext()) {
                        String strInetAddressToIpAddress = inetAddressToIpAddress((InetAddress) it.next());
                        if (strInetAddressToIpAddress != null && !strInetAddressToIpAddress.isEmpty()) {
                            return strInetAddressToIpAddress;
                        }
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private RtcEngineMessage.PVideoNetOptions getOptionsByVideoProfile(int i) {
        try {
            byte[] bArrNativeGetOptionsByVideoProfile = nativeGetOptionsByVideoProfile(this.mNativeHandle, i);
            if (bArrNativeGetOptionsByVideoProfile == null) {
                return null;
            }
            RtcEngineMessage.PVideoNetOptions pVideoNetOptions = new RtcEngineMessage.PVideoNetOptions();
            pVideoNetOptions.unmarshall(bArrNativeGetOptionsByVideoProfile);
            return pVideoNetOptions;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String inetAddressToIpAddress(InetAddress inetAddress) {
        if (inetAddress.isLoopbackAddress()) {
            return null;
        }
        if (inetAddress instanceof Inet4Address) {
            return ((Inet4Address) inetAddress).getHostAddress();
        }
        boolean z = inetAddress instanceof Inet6Address;
        return null;
    }

    private void initDeviceNotify(Context context) {
        this.filter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        this.filter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        this.filter.addAction("android.hardware.usb.action.USB_ACCESSORY_ATTACHED");
        this.filter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        this.filter.addAction("android.hardware.usb.action.USB_STATE");
        context.registerReceiver(this.mUsbStateChangeReceiver, this.filter);
    }

    public static synchronized boolean initializeNativeLibs() {
        if (!sLibLoaded) {
            loadNativeLibrary();
            sLibLoaded = nativeClassInit() == 0;
        }
        return sLibLoaded;
    }

    private boolean joinChannelFirstTimeOrAllChannelLeft() {
        synchronized (this) {
            boolean z = false;
            if (this.mDefaultRtcChannel != null) {
                return false;
            }
            Iterator<RtcChannelImpl> it = this.mRtcChannels.iterator();
            while (it.hasNext()) {
                if (it.next().hasJoined()) {
                    return z;
                }
            }
            z = true;
            return z;
        }
    }

    public static synchronized void loadNativeLibrary() {
        System.loadLibrary("agora-core");
        System.loadLibrary("agora-fdkaac");
        System.loadLibrary("agora-mpg123");
        System.loadLibrary("agora-soundtouch");
        System.loadLibrary("agora-rtc-sdk");
        try {
            System.loadLibrary("agora_ai_denoise_extension");
            Logging.i(TAG, "AgoraAI Denoise module loaded.");
        } catch (Throwable unused) {
        }
        try {
            System.loadLibrary("agora_jnd_extension");
            Logging.i(TAG, "libagora_jnd_extension module loaded.");
        } catch (Throwable unused2) {
        }
        try {
            System.loadLibrary("agora_dav1d_extension");
            Logging.i(TAG, "AgoraDav1d module loaded.");
        } catch (Throwable unused3) {
        }
        try {
            System.loadLibrary("agora_video_process_extension");
            Logging.i(TAG, "AgoraVideoProcess module loaded.");
        } catch (Throwable unused4) {
            Logging.e(TAG, "AgoraVideoProcess module load failed.");
        }
    }

    private native int nativeAddInjectStreamUrl(long j, String str, byte[] bArr);

    private native int nativeAddLocalVideoRender(long j, IVideoSink iVideoSink, int i);

    private native int nativeAddPublishStreamUrl(long j, String str, boolean z);

    private native int nativeAddRemoteVideoRender(long j, int i, IVideoSink iVideoSink, int i2);

    private native int nativeAddVideoCapturer(long j, IVideoSource iVideoSource, int i);

    private native int nativeAddVideoWatermark(long j, String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    private static native int nativeClassInit();

    private native int nativeClearVideoWatermarks(long j);

    private native int nativeComplain(long j, String str, String str2);

    private native int nativeCreateDataStream(long j, boolean z, boolean z2);

    private native int nativeCreateDataStream2(long j, boolean z, boolean z2);

    private native long nativeCreateRtcChannel(long j, String str);

    private native int nativeDestroy(long j);

    private static native int nativeDeviceChanged(long j);

    private native int nativeDisableAudio(long j);

    private native int nativeDisableVideo(long j);

    private native int nativeEnableAudio(long j);

    private native int nativeEnableContentInspect(long j, boolean z, byte[] bArr);

    private native int nativeEnableDeepLearningDenoise(long j, boolean z);

    private native int nativeEnableEncryption(long j, boolean z, int i, String str, byte[] bArr);

    private native int nativeEnableLocalAudio(long j, boolean z);

    private native int nativeEnableRemoteSuperResolution(long j, int i, boolean z);

    private native int nativeEnableVideo(long j);

    private native int nativeEnableVirtualBackground(long j, boolean z, Object obj);

    private native String nativeGetCallId(long j);

    public static native String nativeGetChatEngineVersion();

    private native int nativeGetConncetionState(long j);

    private native long nativeGetDefaultRtcChannel(long j);

    public static native String nativeGetErrorDescription(int i);

    private native long nativeGetHandle(long j);

    private native int nativeGetIntParameter(long j, String str, String str2);

    private native int nativeGetMediaRecorder(long j, Object obj);

    private static native byte[] nativeGetOptionsByVideoProfile(long j, int i);

    private native String nativeGetParameter(long j, String str, String str2);

    private native String nativeGetParameters(long j, String str);

    private native String nativeGetProfile(long j);

    public static native String nativeGetSdkVersion();

    private native int nativeGetUserInfoByUid(long j, int i, Object obj);

    private native int nativeGetUserInfoByUserAccount(long j, String str, Object obj);

    private native boolean nativeIsSpeakerphoneEnabled(long j);

    private native int nativeJoinChannel(long j, byte[] bArr, String str, String str2, String str3, int i, Object obj);

    private native int nativeJoinChannelWithUserAccount(long j, String str, String str2, String str3, Object obj);

    private native int nativeLeaveChannel(long j);

    public static native int nativeLog(int i, String str);

    private native String nativeMakeQualityReportUrl(long j, String str, int i, int i2, int i3);

    private native int nativeMuteAllRemoteVideoStreams(long j, boolean z);

    private native int nativeMuteLocalAudioStream(long j, boolean z);

    private native int nativeMuteLocalVideoStream(long j, boolean z);

    private native long nativeObjectInit(Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    private native long nativeObjectInitWithConfig(Object obj);

    private native int nativePauseAllChannelMediaRelay(long j);

    private native int nativePullAudioFrame(long j, byte[] bArr, int i, int i2);

    private native int nativePushExternalAudioFrameRawData(long j, byte[] bArr, long j2, int i, int i2);

    private native int nativePushExternalAudioFrameRawDataExt(long j, byte[] bArr, long j2, int i, int i2, int i3, int i4);

    private native int nativeRate(long j, String str, int i, String str2);

    private native int nativeRegisterAudioFrameObserver(long j, Object obj);

    private native int nativeRegisterLocalUserAccount(long j, String str, String str2);

    private native int nativeRegisterMediaMetadataObserver(long j, Object obj, int i);

    private native int nativeRegisterVideoEncodedFrameObserver(long j, Object obj);

    private native int nativeRegisterVideoFrameObserver(long j, Object obj);

    private native int nativeReleaseLogWriter(long j);

    private native int nativeReleaseRecorder(long j);

    private native int nativeRemoveInjectStreamUrl(long j, String str);

    private native int nativeRemovePublishStreamUrl(long j, String str);

    private native int nativeRemoveVideoReceiveTrack(long j, int i);

    private native int nativeRenewChannelKey(long j, String str);

    private native int nativeRenewToken(long j, String str);

    private native int nativeResumeAllChannelMediaRelay(long j);

    private native int nativeRtcChannelRelease(long j);

    private native int nativeSendCustomReportMessage(long j, String str, String str2, String str3, String str4, int i);

    private native int nativeSendStreamMessage(long j, int i, byte[] bArr);

    private native int nativeSetApiCallMode(long j, int i);

    private native int nativeSetAppType(long j, int i);

    private native int nativeSetAudioProfile(long j, int i, int i2);

    private native int nativeSetBeautyEffectOptions(long j, boolean z, int i, float f, float f2, float f3, float f4);

    private native int nativeSetChannelProfile(long j, int i);

    private native int nativeSetClientRole(long j, int i);

    private native int nativeSetClientRoleOptions(long j, int i, Object obj);

    private native int nativeSetCloudProxy(long j, int i);

    private native int nativeSetColorEnhanceOptions(long j, boolean z, float f, float f2);

    private native int nativeSetDefaultAudioRoutetoSpeakerphone(long j, boolean z);

    private native int nativeSetEGL10Context(long j, EGLContext eGLContext);

    private native int nativeSetEGL10TextureId(long j, int i, EGLContext eGLContext, int i2, int i3, int i4, long j2, float[] fArr);

    private native int nativeSetEGL14Context(long j, android.opengl.EGLContext eGLContext);

    private native int nativeSetEGL14TextureId(long j, int i, android.opengl.EGLContext eGLContext, int i2, int i3, int i4, long j2, float[] fArr);

    private native int nativeSetEglBaseRootContext(long j, EglBase.Context context);

    private native int nativeSetEnableSpeakerphone(long j, boolean z);

    private native int nativeSetEncryptionSecret(long j, String str);

    private native int nativeSetLiveTranscoding(long j, byte[] bArr);

    private native int nativeSetLocalAccessPoint(long j, ArrayList<String> arrayList, String str);

    private native int nativeSetLocalVideoMirrorMode(long j, int i);

    private native int nativeSetLogWriter(long j, Object obj);

    private native int nativeSetLowlightEnhanceOptions(long j, boolean z, int i, int i2);

    private native int nativeSetParameters(long j, String str);

    private native int nativeSetProfile(long j, String str, boolean z);

    private native int nativeSetRemoteRenderMode(long j, int i, int i2);

    private native int nativeSetRemoteRenderModeWithMirrorMode(long j, int i, int i2, int i3);

    private native int nativeSetRemoteUserPriority(long j, int i, int i2);

    private native int nativeSetScreenCaptureContentHint(long j, int i);

    private native int nativeSetVideoDenoiserOptions(long j, boolean z, int i, int i2);

    private native int nativeSetVideoEncoderConfiguration(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    private native int nativeSetVideoProfileEx(long j, int i, int i2, int i3, int i4);

    private native int nativeSetupVideoLocal(long j, View view, int i, int i2);

    private native int nativeSetupVideoRemote(long j, View view, int i, String str, int i2, int i3);

    private native int nativeStartAudioRecording(long j, String str, int i, int i2, int i3, int i4);

    private native int nativeStartChannelMediaRelay(long j, byte[] bArr);

    private native int nativeStartDumpVideoReceiveTrack(long j, int i, String str);

    private native int nativeStartEchoTest(long j, byte[] bArr);

    private native int nativeStartEchoTestWithConfig(long j, Object obj);

    private native int nativeStartEchoTestWithInterval(long j, byte[] bArr, int i);

    private native int nativeStartLastmileProbeTest(long j, byte[] bArr, boolean z, boolean z2, int i, int i2);

    private native int nativeStartPreview(long j);

    private native int nativeStartRecording(long j, String str, int i, int i2, int i3, int i4);

    private native int nativeStopAudioRecording(long j);

    private native int nativeStopChannelMediaRelay(long j);

    private native int nativeStopDumpVideoReceiveTrack(long j);

    private native int nativeStopEchoTest(long j);

    private native int nativeStopLastmileProbeTest(long j);

    private native int nativeStopRecording(long j);

    private native int nativeSwitchCamera(long j);

    private native int nativeSwitchCameraByDirection(long j, int i);

    private native int nativeSwitchChannel(long j, String str, String str2, Object obj);

    private native int nativeTakeSnapshot(long j, String str, int i, String str2);

    private native int nativeUpdateChannelMediaRelay(long j, byte[] bArr);

    private native String nativeUploadLogFile(long j);

    private void onApiCallExecuted(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PApiCallExecuted pApiCallExecuted = new RtcEngineMessage.PApiCallExecuted();
        pApiCallExecuted.unmarshall(bArr);
        iRtcEngineEventHandler.onApiCallExecuted(pApiCallExecuted.error, pApiCallExecuted.api, pApiCallExecuted.result);
    }

    private void onAudioPublishStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PPublishAudioState pPublishAudioState = new RtcEngineMessage.PPublishAudioState();
        pPublishAudioState.unmarshall(bArr);
        iRtcEngineEventHandler.onAudioPublishStateChanged(pPublishAudioState.channel, pPublishAudioState.oldstate, pPublishAudioState.newstate, pPublishAudioState.elapsed);
    }

    private void onAudioSubscribeStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PSubscribeAudioState pSubscribeAudioState = new RtcEngineMessage.PSubscribeAudioState();
        pSubscribeAudioState.unmarshall(bArr);
        iRtcEngineEventHandler.onAudioSubscribeStateChanged(pSubscribeAudioState.channel, pSubscribeAudioState.uid, pSubscribeAudioState.oldstate, pSubscribeAudioState.newstate, pSubscribeAudioState.elapsed);
    }

    private void onCameraExposureAreaChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PCameraExposureAreaChanged pCameraExposureAreaChanged = new RtcEngineMessage.PCameraExposureAreaChanged();
        pCameraExposureAreaChanged.unmarshall(bArr);
        int i = pCameraExposureAreaChanged.x;
        int i2 = pCameraExposureAreaChanged.y;
        iRtcEngineEventHandler.onCameraExposureAreaChanged(new Rect(i, i2, pCameraExposureAreaChanged.width + i, pCameraExposureAreaChanged.height + i2));
    }

    private void onCameraFocusAreaChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PCameraFocusAreaChanged pCameraFocusAreaChanged = new RtcEngineMessage.PCameraFocusAreaChanged();
        pCameraFocusAreaChanged.unmarshall(bArr);
        int i = pCameraFocusAreaChanged.x;
        int i2 = pCameraFocusAreaChanged.y;
        iRtcEngineEventHandler.onCameraFocusAreaChanged(new Rect(i, i2, pCameraFocusAreaChanged.width + i, pCameraFocusAreaChanged.height + i2));
    }

    private void onChannelMediaRelayEvent(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PCrossChannelEvent pCrossChannelEvent = new RtcEngineMessage.PCrossChannelEvent();
        pCrossChannelEvent.unmarshall(bArr);
        iRtcEngineEventHandler.onChannelMediaRelayEvent(pCrossChannelEvent.f26355code);
    }

    private void onChannelMediaRelayStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PCrossChannelState pCrossChannelState = new RtcEngineMessage.PCrossChannelState();
        pCrossChannelState.unmarshall(bArr);
        iRtcEngineEventHandler.onChannelMediaRelayStateChanged(pCrossChannelState.state, pCrossChannelState.f26356code);
    }

    private void onContentInspectResult(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PContentInspectResult pContentInspectResult = new RtcEngineMessage.PContentInspectResult();
        pContentInspectResult.unmarshall(bArr);
        iRtcEngineEventHandler.onContentInspectResult(pContentInspectResult.result);
    }

    private void onFacePositionChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (bArr == null) {
            return;
        }
        RtcEngineMessage.PFaceDetectValue pFaceDetectValue = new RtcEngineMessage.PFaceDetectValue();
        pFaceDetectValue.unmarshall(bArr);
        this.faceRectArr = null;
        RtcEngineMessage.PFaceDetectValue.FaceRect[] faceRectArr = pFaceDetectValue.rectArr;
        int i = 0;
        if (faceRectArr != null && faceRectArr.length > 0) {
            this.faceRectArr = new IRtcEngineEventHandler.AgoraFacePositionInfo[faceRectArr.length];
            while (true) {
                RtcEngineMessage.PFaceDetectValue.FaceRect[] faceRectArr2 = pFaceDetectValue.rectArr;
                if (i >= faceRectArr2.length) {
                    break;
                }
                RtcEngineMessage.PFaceDetectValue.FaceRect faceRect = faceRectArr2[i];
                IRtcEngineEventHandler.AgoraFacePositionInfo agoraFacePositionInfo = new IRtcEngineEventHandler.AgoraFacePositionInfo();
                agoraFacePositionInfo.x = faceRect.x;
                agoraFacePositionInfo.y = faceRect.y;
                agoraFacePositionInfo.width = faceRect.width;
                agoraFacePositionInfo.height = faceRect.height;
                agoraFacePositionInfo.distance = pFaceDetectValue.disArr[i];
                this.faceRectArr[i] = agoraFacePositionInfo;
                i++;
            }
        } else {
            this.faceRectArr = new IRtcEngineEventHandler.AgoraFacePositionInfo[0];
        }
        iRtcEngineEventHandler.onFacePositionChanged(pFaceDetectValue.imageWidth, pFaceDetectValue.imageHeight, this.faceRectArr);
    }

    private void onFirstLocalAudioFrame(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstLocalAudioFrame pFirstLocalAudioFrame = new RtcEngineMessage.PFirstLocalAudioFrame();
        pFirstLocalAudioFrame.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstLocalAudioFrame(pFirstLocalAudioFrame.elapsed);
    }

    private void onFirstLocalAudioFramePublished(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstLocalAudioFramePublished pFirstLocalAudioFramePublished = new RtcEngineMessage.PFirstLocalAudioFramePublished();
        pFirstLocalAudioFramePublished.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstLocalAudioFramePublished(pFirstLocalAudioFramePublished.elapsed);
    }

    private void onFirstLocalVideoFrame(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstLocalVideoFrame pFirstLocalVideoFrame = new RtcEngineMessage.PFirstLocalVideoFrame();
        pFirstLocalVideoFrame.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstLocalVideoFrame(pFirstLocalVideoFrame.width, pFirstLocalVideoFrame.height, pFirstLocalVideoFrame.elapsed);
    }

    private void onFirstLocalVideoFramePublished(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstLocalVideoFramePublished pFirstLocalVideoFramePublished = new RtcEngineMessage.PFirstLocalVideoFramePublished();
        pFirstLocalVideoFramePublished.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstLocalVideoFramePublished(pFirstLocalVideoFramePublished.elapsed);
    }

    private void onFirstRemoteAudioFrame(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstRemoteAudioFrame pFirstRemoteAudioFrame = new RtcEngineMessage.PFirstRemoteAudioFrame();
        pFirstRemoteAudioFrame.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstRemoteAudioFrame(pFirstRemoteAudioFrame.uid, pFirstRemoteAudioFrame.elapsed);
    }

    private void onFirstRemoteVideoDecoded(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstRemoteVideoDecoded pFirstRemoteVideoDecoded = new RtcEngineMessage.PFirstRemoteVideoDecoded();
        pFirstRemoteVideoDecoded.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstRemoteVideoDecoded(pFirstRemoteVideoDecoded.uid, pFirstRemoteVideoDecoded.width, pFirstRemoteVideoDecoded.height, pFirstRemoteVideoDecoded.elapsed);
    }

    private void onFirstRemoteVideoFrame(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PFirstRemoteVideoFrame pFirstRemoteVideoFrame = new RtcEngineMessage.PFirstRemoteVideoFrame();
        pFirstRemoteVideoFrame.unmarshall(bArr);
        iRtcEngineEventHandler.onFirstRemoteVideoFrame(pFirstRemoteVideoFrame.uid, pFirstRemoteVideoFrame.width, pFirstRemoteVideoFrame.height, pFirstRemoteVideoFrame.elapsed);
    }

    private void onLocalAudioStat(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PLocalAudioStat pLocalAudioStat = new RtcEngineMessage.PLocalAudioStat();
        pLocalAudioStat.unmarshall(bArr);
        iRtcEngineEventHandler.onLocalAudioStats(pLocalAudioStat.stats);
    }

    private void onLocalVideoStat(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PLocalVideoStat pLocalVideoStat = new RtcEngineMessage.PLocalVideoStat();
        pLocalVideoStat.unmarshall(bArr);
        iRtcEngineEventHandler.onLocalVideoStats(pLocalVideoStat.stats);
    }

    private void onLogEvent(int i, String str) {
    }

    private void onRemoteAudioStat(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PRemoteAudioStat pRemoteAudioStat = new RtcEngineMessage.PRemoteAudioStat();
        pRemoteAudioStat.unmarshall(bArr);
        IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats = pRemoteAudioStat.stats;
        if (remoteAudioStats.uid == 0) {
            return;
        }
        iRtcEngineEventHandler.onRemoteAudioStats(remoteAudioStats);
    }

    private void onRemoteAudioStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PRemoteAudioState pRemoteAudioState = new RtcEngineMessage.PRemoteAudioState();
        pRemoteAudioState.unmarshall(bArr);
        iRtcEngineEventHandler.onRemoteAudioStateChanged(pRemoteAudioState.uid, pRemoteAudioState.state, pRemoteAudioState.reason, pRemoteAudioState.elapsed);
    }

    private void onRemoteVideoStat(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PRemoteVideoStat pRemoteVideoStat = new RtcEngineMessage.PRemoteVideoStat();
        pRemoteVideoStat.unmarshall(bArr);
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStats = pRemoteVideoStat.stats;
        if (remoteVideoStats.uid == 0) {
            return;
        }
        iRtcEngineEventHandler.onRemoteVideoStats(remoteVideoStats);
    }

    private void onRemoteVideoStateChangedExt(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PRemoteVideoStateExt pRemoteVideoStateExt = new RtcEngineMessage.PRemoteVideoStateExt();
        pRemoteVideoStateExt.unmarshall(bArr);
        iRtcEngineEventHandler.onRemoteVideoStateChanged(pRemoteVideoStateExt.uid, pRemoteVideoStateExt.state, pRemoteVideoStateExt.reason, pRemoteVideoStateExt.elapsed);
    }

    private void onRequestAudioFileInfo(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PAudioFileInfo pAudioFileInfo = new RtcEngineMessage.PAudioFileInfo();
        pAudioFileInfo.unmarshall(bArr);
        IRtcEngineEventHandler.AudioFileInfo audioFileInfo = new IRtcEngineEventHandler.AudioFileInfo();
        audioFileInfo.filePath = pAudioFileInfo.filePath;
        audioFileInfo.durationMs = pAudioFileInfo.durationMs;
        iRtcEngineEventHandler.onRequestAudioFileInfo(audioFileInfo, pAudioFileInfo.error);
    }

    private void onRtcChannelAudioPublishStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PPublishAudioState pPublishAudioState = new RtcEngineMessage.PPublishAudioState();
        pPublishAudioState.unmarshall(bArr);
        iRtcChannelEventHandler.onAudioPublishStateChanged(rtcChannelImpl, pPublishAudioState.oldstate, pPublishAudioState.newstate, pPublishAudioState.elapsed);
    }

    private void onRtcChannelAudioSubscribeStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PSubscribeAudioState pSubscribeAudioState = new RtcEngineMessage.PSubscribeAudioState();
        pSubscribeAudioState.unmarshall(bArr);
        iRtcChannelEventHandler.onAudioSubscribeStateChanged(rtcChannelImpl, pSubscribeAudioState.uid, pSubscribeAudioState.oldstate, pSubscribeAudioState.newstate, pSubscribeAudioState.elapsed);
    }

    private void onRtcChannelChannelMediaRelayEvent(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PCrossChannelEvent pCrossChannelEvent = new RtcEngineMessage.PCrossChannelEvent();
        pCrossChannelEvent.unmarshall(bArr);
        iRtcChannelEventHandler.onChannelMediaRelayEvent(rtcChannelImpl, pCrossChannelEvent.f26355code);
    }

    private void onRtcChannelChannelMediaRelayStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PCrossChannelState pCrossChannelState = new RtcEngineMessage.PCrossChannelState();
        pCrossChannelState.unmarshall(bArr);
        iRtcChannelEventHandler.onChannelMediaRelayStateChanged(rtcChannelImpl, pCrossChannelState.state, pCrossChannelState.f26356code);
    }

    private void onRtcChannelFirstRemoteVideoFrame(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PFirstRemoteVideoFrame pFirstRemoteVideoFrame = new RtcEngineMessage.PFirstRemoteVideoFrame();
        pFirstRemoteVideoFrame.unmarshall(bArr);
        iRtcChannelEventHandler.onFirstRemoteVideoFrame(rtcChannelImpl, pFirstRemoteVideoFrame.uid, pFirstRemoteVideoFrame.width, pFirstRemoteVideoFrame.height, pFirstRemoteVideoFrame.elapsed);
    }

    private void onRtcChannelRemoteAudioStat(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PRemoteAudioStat pRemoteAudioStat = new RtcEngineMessage.PRemoteAudioStat();
        pRemoteAudioStat.unmarshall(bArr);
        IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats = pRemoteAudioStat.stats;
        if (remoteAudioStats.uid == 0) {
            return;
        }
        iRtcChannelEventHandler.onRemoteAudioStats(rtcChannelImpl, remoteAudioStats);
    }

    private void onRtcChannelRemoteAudioStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PRemoteAudioState pRemoteAudioState = new RtcEngineMessage.PRemoteAudioState();
        pRemoteAudioState.unmarshall(bArr);
        iRtcChannelEventHandler.onRemoteAudioStateChanged(rtcChannelImpl, pRemoteAudioState.uid, pRemoteAudioState.state, pRemoteAudioState.reason, pRemoteAudioState.elapsed);
    }

    private void onRtcChannelRemoteVideoStat(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PRemoteVideoStat pRemoteVideoStat = new RtcEngineMessage.PRemoteVideoStat();
        pRemoteVideoStat.unmarshall(bArr);
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStats = pRemoteVideoStat.stats;
        if (remoteVideoStats.uid == 0) {
            return;
        }
        iRtcChannelEventHandler.onRemoteVideoStats(rtcChannelImpl, remoteVideoStats);
    }

    private void onRtcChannelRemoteVideoStateChangedExt(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PRemoteVideoStateExt pRemoteVideoStateExt = new RtcEngineMessage.PRemoteVideoStateExt();
        pRemoteVideoStateExt.unmarshall(bArr);
        iRtcChannelEventHandler.onRemoteVideoStateChanged(rtcChannelImpl, pRemoteVideoStateExt.uid, pRemoteVideoStateExt.state, pRemoteVideoStateExt.reason, pRemoteVideoStateExt.elapsed);
    }

    private void onRtcChannelStreamMessage(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PStreamMessage pStreamMessage = new RtcEngineMessage.PStreamMessage();
        pStreamMessage.unmarshall(bArr);
        iRtcChannelEventHandler.onStreamMessage(rtcChannelImpl, pStreamMessage.uid, pStreamMessage.streamId, pStreamMessage.payload);
    }

    private void onRtcChannelStreamMessageError(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PStreamMessageError pStreamMessageError = new RtcEngineMessage.PStreamMessageError();
        pStreamMessageError.unmarshall(bArr);
        iRtcChannelEventHandler.onStreamMessageError(rtcChannelImpl, pStreamMessageError.uid, pStreamMessageError.streamId, pStreamMessageError.error, pStreamMessageError.missed, pStreamMessageError.cached);
    }

    private void onRtcChannelUserSuperResolutionEnabledExt(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PUserSuperResolutionEnabled pUserSuperResolutionEnabled = new RtcEngineMessage.PUserSuperResolutionEnabled();
        pUserSuperResolutionEnabled.unmarshall(bArr);
        iRtcChannelEventHandler.onUserSuperResolutionEnabled(rtcChannelImpl, pUserSuperResolutionEnabled.uid, pUserSuperResolutionEnabled.enabled, pUserSuperResolutionEnabled.reason);
    }

    private void onRtcChannelVideoPublishStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PPublishVideoState pPublishVideoState = new RtcEngineMessage.PPublishVideoState();
        pPublishVideoState.unmarshall(bArr);
        iRtcChannelEventHandler.onVideoPublishStateChanged(rtcChannelImpl, pPublishVideoState.oldstate, pPublishVideoState.newstate, pPublishVideoState.elapsed);
    }

    private void onRtcChannelVideoSizeChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PVideoSizeChanged pVideoSizeChanged = new RtcEngineMessage.PVideoSizeChanged();
        pVideoSizeChanged.unmarshall(bArr);
        iRtcChannelEventHandler.onVideoSizeChanged(rtcChannelImpl, pVideoSizeChanged.uid, pVideoSizeChanged.width, pVideoSizeChanged.height, pVideoSizeChanged.rotation);
    }

    private void onRtcChannelVideoSubscribeStateChanged(byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        RtcEngineMessage.PSubscribeVideoState pSubscribeVideoState = new RtcEngineMessage.PSubscribeVideoState();
        pSubscribeVideoState.unmarshall(bArr);
        iRtcChannelEventHandler.onVideoSubscribeStateChanged(rtcChannelImpl, pSubscribeVideoState.uid, pSubscribeVideoState.oldstate, pSubscribeVideoState.newstate, pSubscribeVideoState.elapsed);
    }

    private void onSnapshotTaken(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PSnapshotTaken pSnapshotTaken = new RtcEngineMessage.PSnapshotTaken();
        pSnapshotTaken.unmarshall(bArr);
        iRtcEngineEventHandler.onSnapshotTaken(pSnapshotTaken.channel, pSnapshotTaken.uid, pSnapshotTaken.filepath, pSnapshotTaken.width, pSnapshotTaken.height, pSnapshotTaken.errCode);
    }

    private void onSpeakersReport(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (bArr == null) {
            return;
        }
        RtcEngineMessage.PMediaResSpeakersReport pMediaResSpeakersReport = new RtcEngineMessage.PMediaResSpeakersReport();
        pMediaResSpeakersReport.unmarshall(bArr);
        RtcEngineMessage.PMediaResSpeakersReport.Speaker[] speakerArr = pMediaResSpeakersReport.speakers;
        if (speakerArr == null || speakerArr.length < 0) {
            iRtcEngineEventHandler.onAudioVolumeIndication(new IRtcEngineEventHandler.AudioVolumeInfo[0], 0);
            return;
        }
        IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IRtcEngineEventHandler.AudioVolumeInfo[speakerArr.length];
        for (int i = 0; i < pMediaResSpeakersReport.speakers.length; i++) {
            audioVolumeInfoArr[i] = new IRtcEngineEventHandler.AudioVolumeInfo();
            IRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo = audioVolumeInfoArr[i];
            RtcEngineMessage.PMediaResSpeakersReport.Speaker[] speakerArr2 = pMediaResSpeakersReport.speakers;
            audioVolumeInfo.uid = speakerArr2[i].uid;
            audioVolumeInfoArr[i].volume = speakerArr2[i].volume;
            audioVolumeInfoArr[i].vad = speakerArr2[i].vad;
            audioVolumeInfoArr[i].channelId = speakerArr2[i].channelId;
        }
        iRtcEngineEventHandler.onAudioVolumeIndication(audioVolumeInfoArr, pMediaResSpeakersReport.mixVolume);
    }

    private void onStreamMessage(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PStreamMessage pStreamMessage = new RtcEngineMessage.PStreamMessage();
        pStreamMessage.unmarshall(bArr);
        iRtcEngineEventHandler.onStreamMessage(pStreamMessage.uid, pStreamMessage.streamId, pStreamMessage.payload);
    }

    private void onStreamMessageError(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PStreamMessageError pStreamMessageError = new RtcEngineMessage.PStreamMessageError();
        pStreamMessageError.unmarshall(bArr);
        iRtcEngineEventHandler.onStreamMessageError(pStreamMessageError.uid, pStreamMessageError.streamId, pStreamMessageError.error, pStreamMessageError.missed, pStreamMessageError.cached);
    }

    private void onUploadLogResult(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PUploadLogResult pUploadLogResult = new RtcEngineMessage.PUploadLogResult();
        pUploadLogResult.unmarshall(bArr);
        iRtcEngineEventHandler.onUploadLogResult(pUploadLogResult.requestId, pUploadLogResult.success, pUploadLogResult.reason);
    }

    private void onUserSuperResolutionEnabled(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PUserSuperResolutionEnabled pUserSuperResolutionEnabled = new RtcEngineMessage.PUserSuperResolutionEnabled();
        pUserSuperResolutionEnabled.unmarshall(bArr);
        iRtcEngineEventHandler.onUserSuperResolutionEnabled(pUserSuperResolutionEnabled.uid, pUserSuperResolutionEnabled.enabled, pUserSuperResolutionEnabled.reason);
    }

    private void onVideoPublishStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PPublishVideoState pPublishVideoState = new RtcEngineMessage.PPublishVideoState();
        pPublishVideoState.unmarshall(bArr);
        iRtcEngineEventHandler.onVideoPublishStateChanged(pPublishVideoState.channel, pPublishVideoState.oldstate, pPublishVideoState.newstate, pPublishVideoState.elapsed);
    }

    private void onVideoSizeChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PVideoSizeChanged pVideoSizeChanged = new RtcEngineMessage.PVideoSizeChanged();
        pVideoSizeChanged.unmarshall(bArr);
        iRtcEngineEventHandler.onVideoSizeChanged(pVideoSizeChanged.uid, pVideoSizeChanged.width, pVideoSizeChanged.height, pVideoSizeChanged.rotation);
    }

    private void onVideoSubscribeStateChanged(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PSubscribeVideoState pSubscribeVideoState = new RtcEngineMessage.PSubscribeVideoState();
        pSubscribeVideoState.unmarshall(bArr);
        iRtcEngineEventHandler.onVideoSubscribeStateChanged(pSubscribeVideoState.channel, pSubscribeVideoState.uid, pSubscribeVideoState.oldstate, pSubscribeVideoState.newstate, pSubscribeVideoState.elapsed);
    }

    private void onVirtualBackgroundSourceEnabled(byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        RtcEngineMessage.PVirtualBackgroundSourceEnabled pVirtualBackgroundSourceEnabled = new RtcEngineMessage.PVirtualBackgroundSourceEnabled();
        pVirtualBackgroundSourceEnabled.unmarshall(bArr);
        iRtcEngineEventHandler.onVirtualBackgroundSourceEnabled(pVirtualBackgroundSourceEnabled.enabled, pVirtualBackgroundSourceEnabled.reason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refresh_device_list() {
        nativeDeviceChanged(this.mNativeHandle);
    }

    private void sendLogEvent(byte[] bArr) {
        try {
            onLogEvent(0, new String(bArr, "ISO-8859-1"));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    private native int setExtVideoSource(long j, int i, int i2);

    private int setParameter(String str, boolean z) {
        return setParameters(formatString("{\"%s\":%b}", str, Boolean.valueOf(z)));
    }

    private int setParameterObject(String str, String str2) {
        return setParameters(formatString("{\"%s\":%s}", str, str2));
    }

    private int setRootContext(EglBase.Context context) {
        return nativeSetEglBaseRootContext(this.mNativeHandle, context);
    }

    private int setVideoRotateCapturedFrames(int i, int i2) {
        return setParameterObject("che.video.local.rotate_video", formatString("{\"degree\":%d,\"rotation\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void unRegisterBroadcstReceiver(Context context) {
        context.unregisterReceiver(this.mUsbStateChangeReceiver);
    }

    @Override // io.agora.rtc.RtcEngine
    public void addHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        this.mRtcHandlers.put(iRtcEngineEventHandler, 0);
    }

    @Override // io.agora.rtc.RtcEngine
    public int addInjectStreamUrl(String str, LiveInjectStreamConfig liveInjectStreamConfig) {
        if (str == null || liveInjectStreamConfig == null) {
            return -2;
        }
        return nativeAddInjectStreamUrl(this.mNativeHandle, str, new RtcEngineMessage.PInjectStreamConfig().marshall(liveInjectStreamConfig));
    }

    @Override // io.agora.rtc.RtcEngine
    public int addPublishStreamUrl(String str, boolean z) {
        return nativeAddPublishStreamUrl(this.mNativeHandle, str, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int addVideoWatermark(AgoraImage agoraImage) {
        WatermarkOptions watermarkOptions;
        String str = null;
        if (agoraImage != null) {
            str = agoraImage.url;
            watermarkOptions = new WatermarkOptions();
            watermarkOptions.visibleInPreview = false;
            WatermarkOptions.Rectangle rectangle = new WatermarkOptions.Rectangle(agoraImage.x, agoraImage.y, agoraImage.width, agoraImage.height);
            watermarkOptions.positionInLandscapeMode = rectangle;
            watermarkOptions.positionInPortraitMode = rectangle;
        } else {
            watermarkOptions = null;
        }
        return addVideoWatermark(str, watermarkOptions);
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustAudioMixingPlayoutVolume(int i) {
        return setParameter("che.audio.set_file_as_playout_volume", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustAudioMixingPublishVolume(int i) {
        return setParameter("che.audio.set_file_as_playout_publish_volume", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustAudioMixingVolume(int i) {
        int iAdjustAudioMixingPlayoutVolume = adjustAudioMixingPlayoutVolume(i);
        if (iAdjustAudioMixingPlayoutVolume == 0) {
            adjustAudioMixingPublishVolume(i);
        }
        return iAdjustAudioMixingPlayoutVolume;
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustPlaybackSignalVolume(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 400) {
            i = ShopVehicleListModel.VehicleTagType_Vip400;
        }
        if (i < 100) {
            setParameter("che.audio.farend.compression", 100);
            return setParameter("che.audio.playout.signal.volume", i);
        }
        setParameter("che.audio.playout.signal.volume", 100);
        return setParameter("che.audio.farend.compression", (((i - 100) / 3) * 7) + 100);
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustRecordingSignalVolume(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 400) {
            i = ShopVehicleListModel.VehicleTagType_Vip400;
        }
        return setParameter("che.audio.record.signal.volume", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int adjustUserPlaybackSignalVolume(int i, int i2) {
        return setParameters(formatString("{\"che.audio.playout.uid.volume\":{\"uid\":%d,\"volume\":%d}}", Long.valueOf(((long) i) & 4294967295L), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int clearVideoWatermarks() {
        return nativeClearVideoWatermarks(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int complain(String str, String str2) {
        return nativeComplain(this.mNativeHandle, str, str2);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int configRhythmPlayer(AgoraRhythmPlayerConfig agoraRhythmPlayerConfig) {
        return setParameterObject("che.audio.config_rhythm", formatString("{\"beatsPerMeasure\":%d,\"beatsPerMinute\":%d,\"publish\":%d}", Integer.valueOf(agoraRhythmPlayerConfig.beatsPerMeasure), Integer.valueOf(agoraRhythmPlayerConfig.beatsPerMinute), Integer.valueOf(agoraRhythmPlayerConfig.publish ? 1 : 0)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int createDataStream(boolean z, boolean z2) {
        return nativeCreateDataStream(this.mNativeHandle, z, z2);
    }

    @Override // io.agora.rtc.RtcEngine
    public RtcChannel createRtcChannel(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        synchronized (this) {
            RtcChannelImpl rtcChannelImpl = this.mDefaultRtcChannel;
            if (rtcChannelImpl != null && rtcChannelImpl.channelId().equals(str) && this.mDefaultRtcChannel.isInitialized()) {
                return this.mDefaultRtcChannel;
            }
            for (RtcChannelImpl rtcChannelImpl2 : this.mRtcChannels) {
                if (rtcChannelImpl2.channelId() != null && rtcChannelImpl2.channelId().equals(str) && rtcChannelImpl2.isInitialized()) {
                    return rtcChannelImpl2;
                }
            }
            long jNativeCreateRtcChannel = nativeCreateRtcChannel(this.mNativeHandle, str);
            if (jNativeCreateRtcChannel == 0) {
                return null;
            }
            RtcChannelImpl rtcChannelImpl3 = new RtcChannelImpl();
            rtcChannelImpl3.initialize(this, jNativeCreateRtcChannel);
            this.mRtcChannels.add(rtcChannelImpl3);
            return rtcChannelImpl3;
        }
    }

    public int destroyRtcChannel(String str) {
        if (str == null || str.length() <= 0) {
            return PayError.ERROR_CONNECT_FAILED;
        }
        synchronized (this) {
            RtcChannelImpl rtcChannelImpl = this.mDefaultRtcChannel;
            if (rtcChannelImpl != null && rtcChannelImpl.channelId().equals(str)) {
                return -5;
            }
            for (RtcChannelImpl rtcChannelImpl2 : this.mRtcChannels) {
                if (rtcChannelImpl2.channelId() != null && rtcChannelImpl2.channelId().equals(str)) {
                    int iNativeRtcChannelRelease = nativeRtcChannelRelease(rtcChannelImpl2.getNativeHandle());
                    this.mRtcChannels.remove(rtcChannelImpl2);
                    return iNativeRtcChannelRelease;
                }
            }
            return 0;
        }
    }

    @Override // io.agora.rtc.RtcEngine
    public int disableAudio() {
        return nativeDisableAudio(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int disableLastmileTest() {
        return setParameter("rtc.lastmile_test", false);
    }

    @Override // io.agora.rtc.RtcEngine
    public int disableVideo() {
        this.mLocalVideoEnabled = false;
        return nativeDisableVideo(this.mNativeHandle);
    }

    public void doDestroy() {
        try {
            Context context = this.mContext.get();
            if (context != null) {
                unRegisterBroadcstReceiver(context);
            }
        } catch (Exception e) {
            Logging.e(e.getMessage());
        }
        setExternalVideoSource(false, false, true);
        doStopMonitorSystemEvent();
        synchronized (this) {
            RtcChannelImpl rtcChannelImpl = this.mDefaultRtcChannel;
            if (rtcChannelImpl != null) {
                rtcChannelImpl.onEngineDestroy();
            }
            Iterator<RtcChannelImpl> it = this.mRtcChannels.iterator();
            while (it.hasNext()) {
                it.next().onEngineDestroy();
            }
        }
        nativeDestroy(this.mNativeHandle);
        this.mNativeHandle = 0L;
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableAudio() {
        return nativeEnableAudio(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    @Deprecated
    public int enableAudioQualityIndication(boolean z) {
        return setParameter("rtc.audio_quality_indication", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableAudioVolumeIndication(int i, int i2, boolean z) {
        if (i < 0) {
            i = 0;
        }
        return z ? setParameterObject("che.audio.volume_indication", formatString("{\"interval\":%d,\"smooth\":%d,\"vad\":%d}", Integer.valueOf(i), Integer.valueOf(i2), 1)) : setParameterObject("che.audio.volume_indication", formatString("{\"interval\":%d,\"smooth\":%d,\"vad\":%d}", Integer.valueOf(i), Integer.valueOf(i2), 0));
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableContentInspect(boolean z, ContentInspectConfig contentInspectConfig) {
        byte[] bArrMarshall;
        if (!z) {
            bArrMarshall = null;
        } else {
            if (contentInspectConfig == null) {
                return -2;
            }
            bArrMarshall = new RtcEngineMessage.PContentInspectConfig().marshall(contentInspectConfig);
        }
        return nativeEnableContentInspect(this.mNativeHandle, z, bArrMarshall);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableDeepLearningDenoise(boolean z) {
        return nativeEnableDeepLearningDenoise(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableDualStreamMode(boolean z) {
        return setParameters(String.format("{\"rtc.dual_stream_mode\":%b,\"che.video.enableLowBitRateStream\":%d}", Boolean.valueOf(z), Integer.valueOf(z ? 1 : 0)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableEncryption(boolean z, EncryptionConfig encryptionConfig) {
        return nativeEnableEncryption(this.mNativeHandle, z, encryptionConfig.encryptionMode.getValue(), encryptionConfig.encryptionKey, encryptionConfig.encryptionKdfSalt);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableFaceDetection(boolean z) {
        return setParameter("che.video.faceDistance", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean enableHighPerfWifiMode(boolean z) {
        Context context = this.mContext.get();
        if (context == null) {
            return false;
        }
        if (!z) {
            this.mWifiLock = null;
            return true;
        }
        if (context.checkPermission("android.permission.WAKE_LOCK", Process.myPid(), Process.myUid()) != 0) {
            this.mWifiLock = null;
            return false;
        }
        if (this.mWifiLock != null) {
            return true;
        }
        this.mWifiLock = ((WifiManager) context.getSystemService("wifi")).createWifiLock(3, "agora.voip.lock");
        return true;
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableInEarMonitoring(boolean z) {
        return setParameter("che.audio.headset.monitoring", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableLastmileTest() {
        return setParameter("rtc.lastmile_test", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableLocalAudio(boolean z) {
        return nativeEnableLocalAudio(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableLocalVideo(boolean z) {
        this.mLocalVideoEnabled = z;
        return setParameters(String.format("{\"rtc.video.capture\":%b,\"che.video.local.capture\":%b,\"che.video.local.render\":%b,\"che.video.local.send\":%b}", Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int enableRecap(int i) {
        if (i < 0) {
            i = 0;
        }
        return setParameter("che.audio.recap.interval", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableRemoteSuperResolution(int i, boolean z) {
        return nativeEnableRemoteSuperResolution(this.mNativeHandle, i, z);
    }

    public int enableRemoteVideo(boolean z, int i) {
        return setParameterObject("che.video.peer.receive", formatString("{\"enable\":%b, \"uid\":%d}", Boolean.valueOf(z), Long.valueOf(((long) i) & 4294967295L)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableSoundPositionIndication(boolean z) {
        return setParameter("che.audio.enable_sound_position", z);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int enableTransportQualityIndication(boolean z) {
        return setParameter("rtc.transport_quality_indication", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableVideo() {
        this.mLocalVideoEnabled = true;
        return nativeEnableVideo(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableVirtualBackground(boolean z, VirtualBackgroundSource virtualBackgroundSource) {
        if (virtualBackgroundSource == null) {
            if (z) {
                return -2;
            }
            virtualBackgroundSource = new VirtualBackgroundSource();
        }
        return nativeEnableVirtualBackground(this.mNativeHandle, z, virtualBackgroundSource);
    }

    @Override // io.agora.rtc.RtcEngine
    public int enableWebSdkInteroperability(boolean z) {
        return setParameters(String.format("{\"rtc.video.web_h264_interop_enable\":%b,\"che.video.web_h264_interop_enable\":%b}", Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    public void finalize() {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeDestroy(j);
        }
    }

    public ActivityManager getActivityManager(Context context) {
        if (context == null) {
            return null;
        }
        return (ActivityManager) context.getSystemService("activity");
    }

    @Override // io.agora.rtc.RtcEngine
    public IAudioEffectManager getAudioEffectManager() {
        return this;
    }

    @Override // io.agora.rtc.RtcEngine
    public int getAudioFileInfo(String str) {
        return setParameterObject("che.audio.get_file_info", formatString("{\"url\":\"%s\"}", str));
    }

    public AudioManager getAudioManager(Context context) {
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    @Override // io.agora.rtc.RtcEngine
    public int getAudioMixingCurrentPosition() {
        return nativeGetIntParameter(this.mNativeHandle, "che.audio.get_mixing_file_played_ms", null);
    }

    @Override // io.agora.rtc.RtcEngine
    @Deprecated
    public int getAudioMixingDuration() {
        return nativeGetIntParameter(this.mNativeHandle, "che.audio.get_mixing_file_length_ms", null);
    }

    @Override // io.agora.rtc.RtcEngine
    public int getAudioMixingPlayoutVolume() {
        return nativeGetIntParameter(this.mNativeHandle, "che.audio.get_file_as_playout_volume", null);
    }

    @Override // io.agora.rtc.RtcEngine
    public int getAudioMixingPublishVolume() {
        return nativeGetIntParameter(this.mNativeHandle, "che.audio.get_file_as_playout_publish_volume", null);
    }

    @Override // io.agora.rtc.RtcEngine
    public int getAudioTrackCount() {
        return nativeGetIntParameter(this.mNativeHandle, "che.audio.get_audio_track_count", null);
    }

    @Override // io.agora.rtc.RtcEngine
    public String getCallId() {
        return nativeGetCallId(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public float getCameraMaxZoomFactor() {
        String strNativeGetParameter = nativeGetParameter(this.mNativeHandle, "che.video.camera.get_max_zoom", null);
        if (strNativeGetParameter == null) {
            return 1.0f;
        }
        return Double.valueOf(strNativeGetParameter).floatValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public int getConnectionState() {
        return nativeGetConncetionState(this.mNativeHandle);
    }

    public Context getContext() {
        return this.mContext.get();
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int getEffectCurrentPosition(int i) {
        int iNativeGetIntParameter = nativeGetIntParameter(this.mNativeHandle, "che.audio.get_effect_file_position", formatString("%d", Integer.valueOf(i)));
        if (iNativeGetIntParameter < 0) {
            return 0;
        }
        return iNativeGetIntParameter;
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int getEffectDuration(String str) {
        int iNativeGetIntParameter = nativeGetIntParameter(this.mNativeHandle, "che.audio.get_effect_file_duration", formatString("%s", str));
        if (iNativeGetIntParameter < 0) {
            return 0;
        }
        return iNativeGetIntParameter;
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public double getEffectsVolume() {
        return getEffectsPlayoutVolume();
    }

    public int getMediaRecorder(AgoraMediaRecorder.IMediaRecorderCallback iMediaRecorderCallback) {
        return nativeGetMediaRecorder(this.mNativeHandle, iMediaRecorderCallback);
    }

    @Override // io.agora.rtc.RtcEngine
    public long getNativeHandle() {
        return nativeGetHandle(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public String getParameter(String str, String str2) {
        return nativeGetParameter(this.mNativeHandle, str, str2);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public String getParameters(String str) {
        return nativeGetParameters(this.mNativeHandle, str);
    }

    public String getProfile() {
        return nativeGetProfile(this.mNativeHandle);
    }

    public IRtcEngineEventHandler.RtcStats getRtcStats() {
        if (this.mRtcStats == null) {
            this.mRtcStats = new IRtcEngineEventHandler.RtcStats();
        }
        return this.mRtcStats;
    }

    @Override // io.agora.rtc.RtcEngine
    public int getUserInfoByUid(int i, UserInfo userInfo) {
        return nativeGetUserInfoByUid(this.mNativeHandle, i, userInfo);
    }

    @Override // io.agora.rtc.RtcEngine
    public int getUserInfoByUserAccount(String str, UserInfo userInfo) {
        return nativeGetUserInfoByUserAccount(this.mNativeHandle, str, userInfo);
    }

    public void handleChannelEvent(int i, byte[] bArr, IRtcChannelEventHandler iRtcChannelEventHandler, RtcChannelImpl rtcChannelImpl) {
        if (iRtcChannelEventHandler == null || rtcChannelImpl == null) {
            return;
        }
        switch (i) {
            case 101:
                RtcEngineMessage.PError pError = new RtcEngineMessage.PError();
                pError.unmarshall(bArr);
                iRtcChannelEventHandler.onChannelError(rtcChannelImpl, pError.err);
                break;
            case 102:
                RtcEngineMessage.PError pError2 = new RtcEngineMessage.PError();
                pError2.unmarshall(bArr);
                iRtcChannelEventHandler.onChannelWarning(rtcChannelImpl, pError2.err);
                break;
            case RtcEngineEvent.EvtType.EVT_REQUEST_TOKEN /* 1108 */:
                iRtcChannelEventHandler.onRequestToken(rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_CLIENT_ROLE_CHANGED /* 1109 */:
                RtcEngineMessage.PClientRoleChanged pClientRoleChanged = new RtcEngineMessage.PClientRoleChanged();
                pClientRoleChanged.unmarshall(bArr);
                iRtcChannelEventHandler.onClientRoleChanged(rtcChannelImpl, pClientRoleChanged.oldRole, pClientRoleChanged.newRole);
                break;
            case RtcEngineEvent.EvtType.EVT_LIVE_TRANSCODING /* 1112 */:
                iRtcChannelEventHandler.onTranscodingUpdated(rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_STREAM_INJECTED_STATUS /* 1116 */:
                RtcEngineMessage.PStreamInjectedStatus pStreamInjectedStatus = new RtcEngineMessage.PStreamInjectedStatus();
                pStreamInjectedStatus.unmarshall(bArr);
                iRtcChannelEventHandler.onStreamInjectedStatus(rtcChannelImpl, pStreamInjectedStatus.url, pStreamInjectedStatus.uid, pStreamInjectedStatus.status);
                break;
            case RtcEngineEvent.EvtType.EVT_PRIVILEGE_WILL_EXPIRE /* 1117 */:
                RtcEngineMessage.PPrivilegeWillExpire pPrivilegeWillExpire = new RtcEngineMessage.PPrivilegeWillExpire();
                pPrivilegeWillExpire.unmarshall(bArr);
                iRtcChannelEventHandler.onTokenPrivilegeWillExpire(rtcChannelImpl, pPrivilegeWillExpire.token);
                break;
            case RtcEngineEvent.EvtType.EVT_RTMP_STREAMING_STATE /* 1119 */:
                RtcEngineMessage.PRtmpStreamingState pRtmpStreamingState = new RtcEngineMessage.PRtmpStreamingState();
                pRtmpStreamingState.unmarshall(bArr);
                iRtcChannelEventHandler.onRtmpStreamingStateChanged(rtcChannelImpl, pRtmpStreamingState.url, pRtmpStreamingState.state, pRtmpStreamingState.error);
                break;
            case RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS /* 13001 */:
                RtcEngineMessage.PMediaResJoinMedia pMediaResJoinMedia = new RtcEngineMessage.PMediaResJoinMedia();
                pMediaResJoinMedia.unmarshall(bArr);
                if (!pMediaResJoinMedia.firstSuccess) {
                    iRtcChannelEventHandler.onRejoinChannelSuccess(rtcChannelImpl, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                } else {
                    iRtcChannelEventHandler.onJoinChannelSuccess(rtcChannelImpl, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                }
                break;
            case RtcEngineEvent.EvtType.EVT_LEAVE_CHANNEL /* 13006 */:
                Context context = this.mContext.get();
                if (context != null) {
                    getAudioManager(context).setMode(0);
                }
                RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats = new RtcEngineMessage.PMediaResRtcStats();
                pMediaResRtcStats.unmarshall(bArr);
                updateRtcStats(pMediaResRtcStats);
                iRtcChannelEventHandler.onLeaveChannel(rtcChannelImpl, getRtcStats());
                break;
            case RtcEngineEvent.EvtType.EVT_NETWORK_QUALITY /* 13007 */:
                RtcEngineMessage.PMediaResNetworkQuality pMediaResNetworkQuality = new RtcEngineMessage.PMediaResNetworkQuality();
                pMediaResNetworkQuality.unmarshall(bArr);
                iRtcChannelEventHandler.onNetworkQuality(rtcChannelImpl, pMediaResNetworkQuality.uid, pMediaResNetworkQuality.txQuality, pMediaResNetworkQuality.rxQuality);
                break;
            case RtcEngineEvent.EvtType.EVT_USER_OFFLINE /* 13008 */:
                RtcEngineMessage.PMediaResUserOfflineEvent pMediaResUserOfflineEvent = new RtcEngineMessage.PMediaResUserOfflineEvent();
                pMediaResUserOfflineEvent.unmarshall(bArr);
                iRtcChannelEventHandler.onUserOffline(rtcChannelImpl, pMediaResUserOfflineEvent.uid, pMediaResUserOfflineEvent.reason);
                break;
            case RtcEngineEvent.EvtType.EVT_RTC_STATS /* 13010 */:
                RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats2 = new RtcEngineMessage.PMediaResRtcStats();
                pMediaResRtcStats2.unmarshall(bArr);
                updateRtcStats(pMediaResRtcStats2);
                iRtcChannelEventHandler.onRtcStats(rtcChannelImpl, getRtcStats());
                break;
            case RtcEngineEvent.EvtType.EVT_USER_JOINED /* 13013 */:
                RtcEngineMessage.PMediaResUserJoinedEvent pMediaResUserJoinedEvent = new RtcEngineMessage.PMediaResUserJoinedEvent();
                pMediaResUserJoinedEvent.unmarshall(bArr);
                iRtcChannelEventHandler.onUserJoined(rtcChannelImpl, pMediaResUserJoinedEvent.uid, pMediaResUserJoinedEvent.elapsed);
                break;
            case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME /* 14002 */:
                onRtcChannelFirstRemoteVideoFrame(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_REMOTE_VIDEO_STAT /* 14004 */:
                onRtcChannelRemoteVideoStat(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_CONNECTION_LOST /* 14008 */:
                iRtcChannelEventHandler.onConnectionLost(rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE /* 14009 */:
                onRtcChannelStreamMessage(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE_ERROR /* 14012 */:
                onRtcChannelStreamMessageError(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_VIDEO_SIZE_CHANGED /* 14013 */:
                onRtcChannelVideoSizeChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_ACTIVE_SPEAKER /* 14016 */:
                RtcEngineMessage.PActiveSpeaker pActiveSpeaker = new RtcEngineMessage.PActiveSpeaker();
                pActiveSpeaker.unmarshall(bArr);
                iRtcChannelEventHandler.onActiveSpeaker(rtcChannelImpl, pActiveSpeaker.uid);
                break;
            case RtcEngineEvent.EvtType.EVT_LOCAL_PUBLISH_FALLBACK_TO_AUDIO_ONLY /* 14022 */:
                RtcEngineMessage.PLocalFallbackStatus pLocalFallbackStatus = new RtcEngineMessage.PLocalFallbackStatus();
                pLocalFallbackStatus.unmarshall(bArr);
                iRtcChannelEventHandler.onLocalPublishFallbackToAudioOnly(rtcChannelImpl, pLocalFallbackStatus.state);
                break;
            case RtcEngineEvent.EvtType.EVT_REMOTE_SUBSCRIBE_FALLBACK_TO_AUDIO_ONLY /* 14023 */:
                RtcEngineMessage.PMediaResUserState pMediaResUserState = new RtcEngineMessage.PMediaResUserState();
                pMediaResUserState.unmarshall(bArr);
                iRtcChannelEventHandler.onRemoteSubscribeFallbackToAudioOnly(rtcChannelImpl, pMediaResUserState.uid, pMediaResUserState.state);
                break;
            case RtcEngineEvent.EvtType.EVT_CONNECTION_STATE_CHANGED /* 14028 */:
                RtcEngineMessage.PConnectionState pConnectionState = new RtcEngineMessage.PConnectionState();
                pConnectionState.unmarshall(bArr);
                iRtcChannelEventHandler.onConnectionStateChanged(rtcChannelImpl, pConnectionState.state, pConnectionState.reason);
                break;
            case RtcEngineEvent.EvtType.EVT_REMOTE_AUDIO_STAT /* 14030 */:
                onRtcChannelRemoteAudioStat(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_REMOTE_VIDEO_STATE_CHANGED_EXT /* 14036 */:
                onRtcChannelRemoteVideoStateChangedExt(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_CROSS_CHANNEL_STATE /* 14037 */:
                onRtcChannelChannelMediaRelayStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_CROSS_CHANNEL_EVENT /* 14038 */:
                onRtcChannelChannelMediaRelayEvent(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_REMOTE_AUDIO_STATE_CHANGED /* 14040 */:
                onRtcChannelRemoteAudioStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_PUBLISH_AUDIO_STATE_CHANGED /* 14045 */:
                onRtcChannelAudioPublishStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_PUBLISH_VIDEO_STATE_CHANGED /* 14046 */:
                onRtcChannelVideoPublishStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_SUBSCRIBE_AUDIO_STATE_CHANGED /* 14047 */:
                onRtcChannelAudioSubscribeStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_SUBSCRIBE_VIDEO_STATE_CHANGED /* 14048 */:
                onRtcChannelVideoSubscribeStateChanged(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
            case RtcEngineEvent.EvtType.EVT_USER_SUPER_RESOLUTION_ENABLED /* 14049 */:
                onRtcChannelUserSuperResolutionEnabledExt(bArr, iRtcChannelEventHandler, rtcChannelImpl);
                break;
        }
    }

    public void handleEvent(int i, byte[] bArr, IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (iRtcEngineEventHandler == null) {
        }
        if (i == 1101) {
            RtcEngineMessage.PMediaResTransportQuality pMediaResTransportQuality = new RtcEngineMessage.PMediaResTransportQuality();
            pMediaResTransportQuality.unmarshall(bArr);
            if (pMediaResTransportQuality.isAudio) {
                ((IRtcEngineEventHandlerEx) iRtcEngineEventHandler).onAudioTransportQuality(pMediaResTransportQuality.peer_uid, pMediaResTransportQuality.bitrate, pMediaResTransportQuality.delay, pMediaResTransportQuality.lost);
                return;
            } else {
                ((IRtcEngineEventHandlerEx) iRtcEngineEventHandler).onVideoTransportQuality(pMediaResTransportQuality.peer_uid, pMediaResTransportQuality.bitrate, pMediaResTransportQuality.delay, pMediaResTransportQuality.lost);
                return;
            }
        }
        if (i == 1102) {
            RtcEngineMessage.PMediaResAudioQuality pMediaResAudioQuality = new RtcEngineMessage.PMediaResAudioQuality();
            pMediaResAudioQuality.unmarshall(bArr);
            iRtcEngineEventHandler.onAudioQuality(pMediaResAudioQuality.peer_uid, pMediaResAudioQuality.quality, pMediaResAudioQuality.delay, pMediaResAudioQuality.lost);
            return;
        }
        if (i == 14019) {
            iRtcEngineEventHandler.onConnectionBanned();
            return;
        }
        if (i == 14020) {
            onCameraFocusAreaChanged(bArr, iRtcEngineEventHandler);
            return;
        }
        switch (i) {
            case 100:
                sendLogEvent(bArr);
                break;
            case 101:
                RtcEngineMessage.PError pError = new RtcEngineMessage.PError();
                pError.unmarshall(bArr);
                iRtcEngineEventHandler.onError(pError.err);
                break;
            case 102:
                RtcEngineMessage.PError pError2 = new RtcEngineMessage.PError();
                pError2.unmarshall(bArr);
                iRtcEngineEventHandler.onWarning(pError2.err);
                break;
            default:
                switch (i) {
                    case 1002:
                        break;
                    case RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_EVENT /* 1104 */:
                        RtcEngineMessage.PMediaEngineEvent pMediaEngineEvent = new RtcEngineMessage.PMediaEngineEvent();
                        pMediaEngineEvent.unmarshall(bArr);
                        int i2 = pMediaEngineEvent.f26357code;
                        if (i2 != 10) {
                            if (i2 != 14) {
                                if (i2 != 15) {
                                    switch (i2) {
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                            break;
                                        default:
                                            switch (i2) {
                                                case 701:
                                                case 702:
                                                case 703:
                                                    iRtcEngineEventHandler.onAudioMixingStateChanged(714, i2);
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 720:
                                                        case 721:
                                                        case 722:
                                                        case 726:
                                                            iRtcEngineEventHandler.onAudioMixingStateChanged(710, i2);
                                                            break;
                                                        case 723:
                                                        case 724:
                                                            iRtcEngineEventHandler.onAudioMixingStateChanged(713, i2);
                                                            break;
                                                        case 725:
                                                            iRtcEngineEventHandler.onAudioMixingStateChanged(711, i2);
                                                            break;
                                                        default:
                                                            StringBuilder sbOooO0O0 = OooO00o.OooO0O0("Unknown media engine event ");
                                                            sbOooO0O0.append(pMediaEngineEvent.f26357code);
                                                            Logging.d(TAG, sbOooO0O0.toString());
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    iRtcEngineEventHandler.onMicrophoneEnabled(false);
                                    break;
                                }
                            } else {
                                iRtcEngineEventHandler.onMicrophoneEnabled(true);
                                break;
                            }
                        } else {
                            iRtcEngineEventHandler.onAudioMixingFinished();
                            break;
                        }
                        break;
                    case RtcEngineEvent.EvtType.EVT_API_CALL_EXECUTED /* 1106 */:
                        onApiCallExecuted(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS /* 10001 */:
                        new RtcEngineMessage.MediaResSetupTime().unmarshall(bArr);
                        break;
                    case RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS /* 13001 */:
                        RtcEngineMessage.PMediaResJoinMedia pMediaResJoinMedia = new RtcEngineMessage.PMediaResJoinMedia();
                        pMediaResJoinMedia.unmarshall(bArr);
                        if (!pMediaResJoinMedia.firstSuccess) {
                            iRtcEngineEventHandler.onRejoinChannelSuccess(pMediaResJoinMedia.channel, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                        } else {
                            iRtcEngineEventHandler.onJoinChannelSuccess(pMediaResJoinMedia.channel, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                        }
                        break;
                    case RtcEngineEvent.EvtType.EVT_RTC_STATS /* 13010 */:
                        RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats = new RtcEngineMessage.PMediaResRtcStats();
                        pMediaResRtcStats.unmarshall(bArr);
                        updateRtcStats(pMediaResRtcStats);
                        iRtcEngineEventHandler.onRtcStats(getRtcStats());
                        break;
                    case RtcEngineEvent.EvtType.EVT_RECAP_INDICATION /* 14000 */:
                        ((IRtcEngineEventHandlerEx) iRtcEngineEventHandler).onRecap(bArr);
                        break;
                    case RtcEngineEvent.EvtType.EVT_AUDIO_VOLUME_INDICATION /* 14001 */:
                        onSpeakersReport(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME /* 14002 */:
                        onFirstRemoteVideoFrame(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_STAT /* 14003 */:
                        onLocalVideoStat(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_REMOTE_VIDEO_STAT /* 14004 */:
                        onRemoteVideoStat(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_FIRST_LOCAL_VIDEO_FRAME /* 14005 */:
                        onFirstLocalVideoFrame(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_FIRST_LOCAL_VIDEO_FRAME_PUBLISH /* 14006 */:
                        onFirstLocalVideoFramePublished(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_DECODED /* 14007 */:
                        onFirstRemoteVideoDecoded(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_CONNECTION_LOST /* 14008 */:
                        iRtcEngineEventHandler.onConnectionLost();
                        break;
                    case RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE /* 14009 */:
                        onStreamMessage(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_CONNECTION_INTERRUPTED /* 14010 */:
                        iRtcEngineEventHandler.onConnectionInterrupted();
                        break;
                    case RtcEngineEvent.EvtType.EVT_LOCAL_PUBLISH_FALLBACK_TO_AUDIO_ONLY /* 14022 */:
                        RtcEngineMessage.PLocalFallbackStatus pLocalFallbackStatus = new RtcEngineMessage.PLocalFallbackStatus();
                        pLocalFallbackStatus.unmarshall(bArr);
                        iRtcEngineEventHandler.onLocalPublishFallbackToAudioOnly(pLocalFallbackStatus.state);
                        break;
                    case RtcEngineEvent.EvtType.EVT_REMOTE_SUBSCRIBE_FALLBACK_TO_AUDIO_ONLY /* 14023 */:
                        RtcEngineMessage.PMediaResUserState pMediaResUserState = new RtcEngineMessage.PMediaResUserState();
                        pMediaResUserState.unmarshall(bArr);
                        iRtcEngineEventHandler.onRemoteSubscribeFallbackToAudioOnly(pMediaResUserState.uid, pMediaResUserState.state);
                        break;
                    case RtcEngineEvent.EvtType.EVT_USER_TRANSPORT_STAT /* 14024 */:
                        RtcEngineMessage.PUserTransportStat pUserTransportStat = new RtcEngineMessage.PUserTransportStat();
                        pUserTransportStat.unmarshall(bArr);
                        if (!pUserTransportStat.isAudio) {
                            iRtcEngineEventHandler.onRemoteVideoTransportStats(pUserTransportStat.peer_uid, pUserTransportStat.delay, pUserTransportStat.lost, pUserTransportStat.rxKBitRate);
                        } else {
                            iRtcEngineEventHandler.onRemoteAudioTransportStats(pUserTransportStat.peer_uid, pUserTransportStat.delay, pUserTransportStat.lost, pUserTransportStat.rxKBitRate);
                        }
                        break;
                    case RtcEngineEvent.EvtType.EVT_CONNECTION_STATE_CHANGED /* 14028 */:
                        RtcEngineMessage.PConnectionState pConnectionState = new RtcEngineMessage.PConnectionState();
                        pConnectionState.unmarshall(bArr);
                        iRtcEngineEventHandler.onConnectionStateChanged(pConnectionState.state, pConnectionState.reason);
                        break;
                    case RtcEngineEvent.EvtType.EVT_CAMERA_EXPOSURE_AREA_CHANGED /* 14029 */:
                        onCameraExposureAreaChanged(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_REMOTE_AUDIO_STAT /* 14030 */:
                        onRemoteAudioStat(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_NETWORK_TYPE_CHANGED /* 14031 */:
                        RtcEngineMessage.PNetworkTypeChanged pNetworkTypeChanged = new RtcEngineMessage.PNetworkTypeChanged();
                        pNetworkTypeChanged.unmarshall(bArr);
                        iRtcEngineEventHandler.onNetworkTypeChanged(pNetworkTypeChanged.type);
                        break;
                    case RtcEngineEvent.EvtType.EVT_AUDIO_ROUTING_CHANGED /* 14032 */:
                        RtcEngineMessage.PAudioRoutingChanged pAudioRoutingChanged = new RtcEngineMessage.PAudioRoutingChanged();
                        pAudioRoutingChanged.unmarshall(bArr);
                        iRtcEngineEventHandler.onAudioRouteChanged(pAudioRoutingChanged.routing);
                        break;
                    case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_AUDIO_DECODED /* 14033 */:
                        RtcEngineMessage.PMediaResFirstRemoteAudioDecoded pMediaResFirstRemoteAudioDecoded = new RtcEngineMessage.PMediaResFirstRemoteAudioDecoded();
                        pMediaResFirstRemoteAudioDecoded.unmarshall(bArr);
                        iRtcEngineEventHandler.onFirstRemoteAudioDecoded(pMediaResFirstRemoteAudioDecoded.uid, pMediaResFirstRemoteAudioDecoded.elapsed);
                        break;
                    case RtcEngineEvent.EvtType.EVT_LOCAL_USER_REGISTERED /* 14034 */:
                        RtcEngineMessage.PUserAccountInfo pUserAccountInfo = new RtcEngineMessage.PUserAccountInfo();
                        pUserAccountInfo.unmarshall(bArr);
                        iRtcEngineEventHandler.onLocalUserRegistered(pUserAccountInfo.uid, pUserAccountInfo.userAccount);
                        break;
                    case RtcEngineEvent.EvtType.EVT_USER_INFO_UPDATED /* 14035 */:
                        RtcEngineMessage.PUserAccountInfo pUserAccountInfo2 = new RtcEngineMessage.PUserAccountInfo();
                        pUserAccountInfo2.unmarshall(bArr);
                        UserInfo userInfo = new UserInfo();
                        int i3 = pUserAccountInfo2.uid;
                        userInfo.uid = i3;
                        userInfo.userAccount = pUserAccountInfo2.userAccount;
                        iRtcEngineEventHandler.onUserInfoUpdated(i3, userInfo);
                        break;
                    case RtcEngineEvent.EvtType.EVT_REMOTE_VIDEO_STATE_CHANGED_EXT /* 14036 */:
                        onRemoteVideoStateChangedExt(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_CROSS_CHANNEL_STATE /* 14037 */:
                        onChannelMediaRelayStateChanged(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_CROSS_CHANNEL_EVENT /* 14038 */:
                        onChannelMediaRelayEvent(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_REMOTE_AUDIO_STATE_CHANGED /* 14040 */:
                        onRemoteAudioStateChanged(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_LOCAL_AUDIO_STAT /* 14041 */:
                        onLocalAudioStat(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_LOCAL_AUDIO_STATE_CHANGED /* 14042 */:
                        RtcEngineMessage.PMediaResLocalAudioStateChanged pMediaResLocalAudioStateChanged = new RtcEngineMessage.PMediaResLocalAudioStateChanged();
                        pMediaResLocalAudioStateChanged.unmarshall(bArr);
                        iRtcEngineEventHandler.onLocalAudioStateChanged(pMediaResLocalAudioStateChanged.state, pMediaResLocalAudioStateChanged.error);
                        break;
                    case RtcEngineEvent.EvtType.EVT_FACE_DETECT_VALUE /* 14043 */:
                        onFacePositionChanged(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.FIRST_LOCAL_AUDIO_FRAME_PUBLISHED /* 14044 */:
                        onFirstLocalAudioFramePublished(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_PUBLISH_AUDIO_STATE_CHANGED /* 14045 */:
                        onAudioPublishStateChanged(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_PUBLISH_VIDEO_STATE_CHANGED /* 14046 */:
                        onVideoPublishStateChanged(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_SUBSCRIBE_AUDIO_STATE_CHANGED /* 14047 */:
                        onAudioSubscribeStateChanged(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_SUBSCRIBE_VIDEO_STATE_CHANGED /* 14048 */:
                        onVideoSubscribeStateChanged(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_USER_SUPER_RESOLUTION_ENABLED /* 14049 */:
                        onUserSuperResolutionEnabled(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_UPLOAD_LOG_RESULT /* 14050 */:
                        onUploadLogResult(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_VIRTUAL_BACKGROUND_SOURCE_ENABLED /* 14051 */:
                        onVirtualBackgroundSourceEnabled(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_AUDIO_FILE_INFO /* 14052 */:
                        onRequestAudioFileInfo(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_SNAPSHOT_TAKEN /* 14053 */:
                        onSnapshotTaken(bArr, iRtcEngineEventHandler);
                        break;
                    case RtcEngineEvent.EvtType.EVT_CONTENT_INSPECT_RESULT /* 14054 */:
                        onContentInspectResult(bArr, iRtcEngineEventHandler);
                        break;
                    default:
                        switch (i) {
                            case 1005:
                                iRtcEngineEventHandler.onCameraReady();
                                break;
                            case 1006:
                                iRtcEngineEventHandler.onMediaEngineStartCallSuccess();
                                break;
                            case 1007:
                                iRtcEngineEventHandler.onVideoStopped();
                                break;
                            default:
                                switch (i) {
                                    case RtcEngineEvent.EvtType.EVT_REQUEST_TOKEN /* 1108 */:
                                        iRtcEngineEventHandler.onRequestToken();
                                        break;
                                    case RtcEngineEvent.EvtType.EVT_CLIENT_ROLE_CHANGED /* 1109 */:
                                        RtcEngineMessage.PClientRoleChanged pClientRoleChanged = new RtcEngineMessage.PClientRoleChanged();
                                        pClientRoleChanged.unmarshall(bArr);
                                        iRtcEngineEventHandler.onClientRoleChanged(pClientRoleChanged.oldRole, pClientRoleChanged.newRole);
                                        break;
                                    case RtcEngineEvent.EvtType.EVT_PUBLISH_URL /* 1110 */:
                                        RtcEngineMessage.PStreamPublished pStreamPublished = new RtcEngineMessage.PStreamPublished();
                                        pStreamPublished.unmarshall(bArr);
                                        iRtcEngineEventHandler.onStreamPublished(pStreamPublished.url, pStreamPublished.error);
                                        break;
                                    case RtcEngineEvent.EvtType.EVT_UNPUBLISH_URL /* 1111 */:
                                        RtcEngineMessage.PStreamUnPublished pStreamUnPublished = new RtcEngineMessage.PStreamUnPublished();
                                        pStreamUnPublished.unmarshall(bArr);
                                        iRtcEngineEventHandler.onStreamUnpublished(pStreamUnPublished.url);
                                        break;
                                    case RtcEngineEvent.EvtType.EVT_LIVE_TRANSCODING /* 1112 */:
                                        iRtcEngineEventHandler.onTranscodingUpdated();
                                        break;
                                    default:
                                        switch (i) {
                                            case RtcEngineEvent.EvtType.EVT_STREAM_INJECTED_STATUS /* 1116 */:
                                                RtcEngineMessage.PStreamInjectedStatus pStreamInjectedStatus = new RtcEngineMessage.PStreamInjectedStatus();
                                                pStreamInjectedStatus.unmarshall(bArr);
                                                iRtcEngineEventHandler.onStreamInjectedStatus(pStreamInjectedStatus.url, pStreamInjectedStatus.uid, pStreamInjectedStatus.status);
                                                break;
                                            case RtcEngineEvent.EvtType.EVT_PRIVILEGE_WILL_EXPIRE /* 1117 */:
                                                RtcEngineMessage.PPrivilegeWillExpire pPrivilegeWillExpire = new RtcEngineMessage.PPrivilegeWillExpire();
                                                pPrivilegeWillExpire.unmarshall(bArr);
                                                iRtcEngineEventHandler.onTokenPrivilegeWillExpire(pPrivilegeWillExpire.token);
                                                break;
                                            case RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_STATE_CHANGED /* 1118 */:
                                                RtcEngineMessage.PMediaResLocalVideoStateChanged pMediaResLocalVideoStateChanged = new RtcEngineMessage.PMediaResLocalVideoStateChanged();
                                                pMediaResLocalVideoStateChanged.unmarshall(bArr);
                                                iRtcEngineEventHandler.onLocalVideoStateChanged(pMediaResLocalVideoStateChanged.localVideoState, pMediaResLocalVideoStateChanged.error);
                                                break;
                                            case RtcEngineEvent.EvtType.EVT_RTMP_STREAMING_STATE /* 1119 */:
                                                RtcEngineMessage.PRtmpStreamingState pRtmpStreamingState = new RtcEngineMessage.PRtmpStreamingState();
                                                pRtmpStreamingState.unmarshall(bArr);
                                                iRtcEngineEventHandler.onRtmpStreamingStateChanged(pRtmpStreamingState.url, pRtmpStreamingState.state, pRtmpStreamingState.error);
                                                break;
                                            case RtcEngineEvent.EvtType.EVT_STREAM_EVENT /* 1120 */:
                                                RtcEngineMessage.PStreamEvent pStreamEvent = new RtcEngineMessage.PStreamEvent();
                                                pStreamEvent.unmarshall(bArr);
                                                iRtcEngineEventHandler.onRtmpStreamingEvent(pStreamEvent.url, pStreamEvent.error);
                                                break;
                                            default:
                                                switch (i) {
                                                    case RtcEngineEvent.EvtType.EVT_LEAVE_CHANNEL /* 13006 */:
                                                        Context context = this.mContext.get();
                                                        if (context != null) {
                                                            getAudioManager(context).setMode(0);
                                                        }
                                                        RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats2 = new RtcEngineMessage.PMediaResRtcStats();
                                                        pMediaResRtcStats2.unmarshall(bArr);
                                                        updateRtcStats(pMediaResRtcStats2);
                                                        iRtcEngineEventHandler.onLeaveChannel(getRtcStats());
                                                        break;
                                                    case RtcEngineEvent.EvtType.EVT_NETWORK_QUALITY /* 13007 */:
                                                        RtcEngineMessage.PMediaResNetworkQuality pMediaResNetworkQuality = new RtcEngineMessage.PMediaResNetworkQuality();
                                                        pMediaResNetworkQuality.unmarshall(bArr);
                                                        iRtcEngineEventHandler.onNetworkQuality(pMediaResNetworkQuality.uid, pMediaResNetworkQuality.txQuality, pMediaResNetworkQuality.rxQuality);
                                                        break;
                                                    case RtcEngineEvent.EvtType.EVT_USER_OFFLINE /* 13008 */:
                                                        RtcEngineMessage.PMediaResUserOfflineEvent pMediaResUserOfflineEvent = new RtcEngineMessage.PMediaResUserOfflineEvent();
                                                        pMediaResUserOfflineEvent.unmarshall(bArr);
                                                        iRtcEngineEventHandler.onUserOffline(pMediaResUserOfflineEvent.uid, pMediaResUserOfflineEvent.reason);
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case RtcEngineEvent.EvtType.EVT_USER_JOINED /* 13013 */:
                                                                RtcEngineMessage.PMediaResUserJoinedEvent pMediaResUserJoinedEvent = new RtcEngineMessage.PMediaResUserJoinedEvent();
                                                                pMediaResUserJoinedEvent.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onUserJoined(pMediaResUserJoinedEvent.uid, pMediaResUserJoinedEvent.elapsed);
                                                                break;
                                                            case RtcEngineEvent.EvtType.EVT_USER_MUTE_AUDIO /* 13014 */:
                                                                RtcEngineMessage.PMediaResUserState pMediaResUserState2 = new RtcEngineMessage.PMediaResUserState();
                                                                pMediaResUserState2.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onUserMuteAudio(pMediaResUserState2.uid, pMediaResUserState2.state);
                                                                break;
                                                            case RtcEngineEvent.EvtType.EVT_USER_MUTE_VIDEO /* 13015 */:
                                                                RtcEngineMessage.PMediaResUserState pMediaResUserState3 = new RtcEngineMessage.PMediaResUserState();
                                                                pMediaResUserState3.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onUserMuteVideo(pMediaResUserState3.uid, pMediaResUserState3.state);
                                                                break;
                                                            case RtcEngineEvent.EvtType.EVT_USER_ENABLE_VIDEO /* 13016 */:
                                                                RtcEngineMessage.PMediaResUserState pMediaResUserState4 = new RtcEngineMessage.PMediaResUserState();
                                                                pMediaResUserState4.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onUserEnableVideo(pMediaResUserState4.uid, pMediaResUserState4.state);
                                                                break;
                                                            case RtcEngineEvent.EvtType.EVT_LASTMILE_QUALITY /* 13017 */:
                                                                RtcEngineMessage.PMediaResLastmileQuality pMediaResLastmileQuality = new RtcEngineMessage.PMediaResLastmileQuality();
                                                                pMediaResLastmileQuality.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onLastmileQuality(pMediaResLastmileQuality.quality);
                                                                break;
                                                            case RtcEngineEvent.EvtType.AUDIO_EFFECT_FINISHED /* 13018 */:
                                                                RtcEngineMessage.PMediaResAudioEffectFinished pMediaResAudioEffectFinished = new RtcEngineMessage.PMediaResAudioEffectFinished();
                                                                pMediaResAudioEffectFinished.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onAudioEffectFinished(pMediaResAudioEffectFinished.soundId);
                                                                break;
                                                            case RtcEngineEvent.EvtType.EVT_USER_ENABLE_LOCAL_VIDEO /* 13019 */:
                                                                RtcEngineMessage.PMediaResUserState pMediaResUserState5 = new RtcEngineMessage.PMediaResUserState();
                                                                pMediaResUserState5.unmarshall(bArr);
                                                                iRtcEngineEventHandler.onUserEnableLocalVideo(pMediaResUserState5.uid, pMediaResUserState5.state);
                                                                break;
                                                            case RtcEngineEvent.EvtType.EVT_LASTMILE_PROBE_RESULT /* 13020 */:
                                                                RtcEngineMessage.PMediaResLastmileProbeResult pMediaResLastmileProbeResult = new RtcEngineMessage.PMediaResLastmileProbeResult();
                                                                pMediaResLastmileProbeResult.unmarshall(bArr);
                                                                IRtcEngineEventHandler.LastmileProbeResult lastmileProbeResult = new IRtcEngineEventHandler.LastmileProbeResult();
                                                                lastmileProbeResult.state = pMediaResLastmileProbeResult.state;
                                                                lastmileProbeResult.rtt = pMediaResLastmileProbeResult.rtt;
                                                                IRtcEngineEventHandler.LastmileProbeResult.LastmileProbeOneWayResult lastmileProbeOneWayResult = lastmileProbeResult.uplinkReport;
                                                                RtcEngineMessage.PMediaResLastmileProbeResult.LastmileProbeOneWayResult lastmileProbeOneWayResult2 = pMediaResLastmileProbeResult.uplinkReport;
                                                                lastmileProbeOneWayResult.packetLossRate = lastmileProbeOneWayResult2.packetLossRate;
                                                                lastmileProbeOneWayResult.jitter = lastmileProbeOneWayResult2.jitter;
                                                                lastmileProbeOneWayResult.availableBandwidth = lastmileProbeOneWayResult2.availableBandwidth;
                                                                IRtcEngineEventHandler.LastmileProbeResult.LastmileProbeOneWayResult lastmileProbeOneWayResult3 = lastmileProbeResult.downlinkReport;
                                                                RtcEngineMessage.PMediaResLastmileProbeResult.LastmileProbeOneWayResult lastmileProbeOneWayResult4 = pMediaResLastmileProbeResult.downlinkReport;
                                                                lastmileProbeOneWayResult3.packetLossRate = lastmileProbeOneWayResult4.packetLossRate;
                                                                lastmileProbeOneWayResult3.jitter = lastmileProbeOneWayResult4.jitter;
                                                                lastmileProbeOneWayResult3.availableBandwidth = lastmileProbeOneWayResult4.availableBandwidth;
                                                                iRtcEngineEventHandler.onLastmileProbeResult(lastmileProbeResult);
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE_ERROR /* 14012 */:
                                                                        onStreamMessageError(bArr, iRtcEngineEventHandler);
                                                                        break;
                                                                    case RtcEngineEvent.EvtType.EVT_VIDEO_SIZE_CHANGED /* 14013 */:
                                                                        onVideoSizeChanged(bArr, iRtcEngineEventHandler);
                                                                        break;
                                                                    case RtcEngineEvent.EvtType.FIRST_LOCAL_AUDIO_FRAME /* 14014 */:
                                                                        onFirstLocalAudioFrame(bArr, iRtcEngineEventHandler);
                                                                        break;
                                                                    case RtcEngineEvent.EvtType.FIRST_REMOTE_AUDIO_FRAME /* 14015 */:
                                                                        onFirstRemoteAudioFrame(bArr, iRtcEngineEventHandler);
                                                                        break;
                                                                    case RtcEngineEvent.EvtType.EVT_ACTIVE_SPEAKER /* 14016 */:
                                                                        RtcEngineMessage.PActiveSpeaker pActiveSpeaker = new RtcEngineMessage.PActiveSpeaker();
                                                                        pActiveSpeaker.unmarshall(bArr);
                                                                        iRtcEngineEventHandler.onActiveSpeaker(pActiveSpeaker.uid);
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                iRtcEngineEventHandler.onMediaEngineLoadSuccess();
                break;
        }
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isCameraAutoFocusFaceModeSupported() {
        return Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.face_focus_supported", null)).booleanValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isCameraExposurePositionSupported() {
        return Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.exposure_supported", null)).booleanValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isCameraFocusSupported() {
        return Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.focus_supported", null)).booleanValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isCameraTorchSupported() {
        return Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.torch_supported", null)).booleanValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isCameraZoomSupported() {
        return Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.zoom_supported", null)).booleanValue();
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isSpeakerphoneEnabled() {
        return nativeIsSpeakerphoneEnabled(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean isTextureEncodeSupported() {
        return DeviceUtils.getRecommendedEncoderType() == 0;
    }

    @Override // io.agora.rtc.RtcEngine
    public int joinChannel(String str, String str2, String str3, int i) {
        Context context = this.mContext.get();
        if (context == null) {
            return -7;
        }
        doJoinChannelCheck(context);
        int iNativeJoinChannel = nativeJoinChannel(this.mNativeHandle, null, str, str2, str3, i, null);
        synchronized (this) {
            if (this.mDefaultRtcChannel == null) {
                this.mDefaultRtcChannel = new RtcChannelImpl();
            }
            if (iNativeJoinChannel == 0) {
                this.mDefaultRtcChannel.initialize(this, nativeGetDefaultRtcChannel(this.mNativeHandle));
            }
        }
        return iNativeJoinChannel;
    }

    @Override // io.agora.rtc.RtcEngine
    public int joinChannelWithUserAccount(String str, String str2, String str3) {
        int iNativeJoinChannelWithUserAccount = nativeJoinChannelWithUserAccount(this.mNativeHandle, str, str2, str3, null);
        synchronized (this) {
            if (this.mDefaultRtcChannel == null) {
                this.mDefaultRtcChannel = new RtcChannelImpl();
            }
            if (iNativeJoinChannelWithUserAccount == 0) {
                this.mDefaultRtcChannel.initialize(this, nativeGetDefaultRtcChannel(this.mNativeHandle));
            }
        }
        return iNativeJoinChannelWithUserAccount;
    }

    @Override // io.agora.rtc.RtcEngine
    public int leaveChannel() {
        synchronized (this) {
            if (this.mDefaultRtcChannel != null) {
                this.mDefaultRtcChannel = null;
            }
        }
        doLeaveChannelCheck();
        return nativeLeaveChannel(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public String makeQualityReportUrl(String str, int i, int i2, int i3) {
        return nativeMakeQualityReportUrl(this.mNativeHandle, str, i, i2, i3);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int monitorAudioRouteChange(boolean z) {
        Logging.i("API call monitorAudioRouteChange:" + z);
        return 0;
    }

    @Override // io.agora.rtc.RtcEngine
    @TargetApi(11)
    @Deprecated
    public void monitorBluetoothHeadsetEvent(boolean z) {
        Logging.i(TAG, "enter monitorBluetoothHeadsetEvent:" + z);
    }

    @Override // io.agora.rtc.RtcEngine
    @Deprecated
    public void monitorHeadsetEvent(boolean z) {
        Logging.i(TAG, "enter monitorHeadsetEvent:" + z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteAllRemoteAudioStreams(boolean z) {
        return setParameter("rtc.audio.mute_peers", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteAllRemoteVideoStreams(boolean z) {
        return nativeMuteAllRemoteVideoStreams(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteLocalAudioStream(boolean z) {
        return nativeMuteLocalAudioStream(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteLocalVideoStream(boolean z) {
        return nativeMuteLocalVideoStream(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteRemoteAudioStream(int i, boolean z) {
        return setParameters(formatString("{\"rtc.audio.mute_peer\":{\"uid\":%d,\"mute\":%b}}", Long.valueOf(((long) i) & 4294967295L), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int muteRemoteVideoStream(int i, boolean z) {
        return setParameters(formatString("{\"rtc.video.mute_peer\":{\"uid\":%d,\"mute\":%b}}", Long.valueOf(((long) i) & 4294967295L), Boolean.valueOf(z)));
    }

    public void onChannelEvent(String str, int i, byte[] bArr) {
        if (str == null || str.length() <= 0) {
            return;
        }
        RtcChannelImpl rtcChannelImpl = null;
        synchronized (this) {
            for (RtcChannelImpl rtcChannelImpl2 : this.mRtcChannels) {
                if (rtcChannelImpl2.channelId() != null && rtcChannelImpl2.channelId().equals(str)) {
                    rtcChannelImpl = rtcChannelImpl2;
                    break;
                }
            }
        }
        if (rtcChannelImpl == null || !rtcChannelImpl.isInitialized() || rtcChannelImpl.getEventHandler() == null) {
            return;
        }
        handleChannelEvent(i, bArr, rtcChannelImpl.getEventHandler(), rtcChannelImpl);
    }

    public void onEvent(int i, byte[] bArr) {
        try {
            Iterator<IRtcEngineEventHandler> it = this.mRtcHandlers.keySet().iterator();
            while (it.hasNext()) {
                IRtcEngineEventHandler next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    handleEvent(i, bArr, next);
                }
            }
        } catch (Exception e) {
            StringBuilder sbOooO0O0 = OooO00o.OooO0O0("onEvent: ");
            sbOooO0O0.append(e.toString());
            Log.e(TAG, sbOooO0O0.toString());
        }
    }

    public void onRtcChannelJoinChannel() {
        doJoinChannelCheck(getContext());
    }

    public void onRtcChannelLeaveChannel() {
        doLeaveChannelCheck();
    }

    @Override // io.agora.rtc.RtcEngine
    public int pauseAllChannelMediaRelay() {
        return nativePauseAllChannelMediaRelay(this.mNativeHandle);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int pauseAllEffects() {
        return setParameter("che.audio.game_pause_all_effects", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int pauseAudio() {
        return setParameter("rtc.audio.paused", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int pauseAudioMixing() {
        return setParameter("che.audio.pause_file_as_playout", true);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int pauseEffect(int i) {
        return setParameter("che.audio.game_pause_effect", i);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    @Deprecated
    public int playEffect(int i, String str, int i2, double d, double d2, double d3) {
        return playEffect(i, str, i2, d, d2, d3, false, 0);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int playRecap() {
        return setParameter("che.audio.recap.start_play", true);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int preloadEffect(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        return setParameterObject("che.audio.game_preload_effect", formatString("{\"soundId\":%d,\"filePath\":\"%s\"}", Integer.valueOf(i), str));
    }

    @Override // io.agora.rtc.RtcEngine
    public int pullPlaybackAudioFrame(byte[] bArr, int i) {
        int i2 = this.mExAudioSinkChannels;
        if (i2 == 1 || i2 == 2) {
            return nativePullAudioFrame(this.mNativeHandle, bArr, i, i2);
        }
        return -1;
    }

    @Override // io.agora.rtc.RtcEngine
    @Deprecated
    public int pushExternalAudioFrame(byte[] bArr, long j) {
        return nativePushExternalAudioFrameRawData(this.mNativeHandle, bArr, j, this.mExAudioSourceSampleRate, this.mExAudioSourceChannels);
    }

    @Override // io.agora.rtc.RtcEngine
    public boolean pushExternalVideoFrame(AgoraVideoFrame agoraVideoFrame) {
        int i;
        if (agoraVideoFrame == null || (i = agoraVideoFrame.format) == 12) {
            Logging.e("pushExternalVideoFrame failed!! invalid video frame.");
            return false;
        }
        if (this.mVideoSourceType != 3) {
            Logging.e("pushExternalVideoFrame failed!! Call setExternalVideoSource to enable enable external video source!!");
            return false;
        }
        if (i != 10 && i != 11) {
            return ((i > 0 && i <= 8) || i == 16) && deliverFrame(this.mNativeHandle, agoraVideoFrame.buf, agoraVideoFrame.stride, agoraVideoFrame.height, agoraVideoFrame.cropLeft, agoraVideoFrame.cropTop, agoraVideoFrame.cropRight, agoraVideoFrame.cropBottom, agoraVideoFrame.rotation, agoraVideoFrame.timeStamp, i) == 0;
        }
        if (agoraVideoFrame.textureID == 0) {
            Logging.e("pushExternalVideoFrame failed!! invalid texture ID.");
            return false;
        }
        android.opengl.EGLContext eGLContext = agoraVideoFrame.eglContext14;
        if (eGLContext != null) {
            return updateSharedContext(eGLContext) == 0 && setTextureIdWithMatrix(agoraVideoFrame.textureID, agoraVideoFrame.eglContext14, agoraVideoFrame.format, agoraVideoFrame.stride, agoraVideoFrame.height, agoraVideoFrame.timeStamp, agoraVideoFrame.transform) == 0;
        }
        EGLContext eGLContext2 = agoraVideoFrame.eglContext11;
        return eGLContext2 != null && updateSharedContext(eGLContext2) == 0 && setTextureIdWithMatrix(agoraVideoFrame.textureID, agoraVideoFrame.eglContext11, agoraVideoFrame.format, agoraVideoFrame.stride, agoraVideoFrame.height, agoraVideoFrame.timeStamp, agoraVideoFrame.transform) == 0;
    }

    @Override // io.agora.rtc.RtcEngine
    public int rate(String str, int i, String str2) {
        return nativeRate(this.mNativeHandle, str, i, str2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        if (iAudioFrameObserver != null) {
            AudioParams mixedAudioParams = iAudioFrameObserver.getMixedAudioParams();
            if (mixedAudioParams != null) {
                setMixedAudioFrameParameters(mixedAudioParams.sampleRate, mixedAudioParams.samplesPerCall);
            }
            AudioParams recordAudioParams = iAudioFrameObserver.getRecordAudioParams();
            if (recordAudioParams != null) {
                setRecordingAudioFrameParameters(recordAudioParams.sampleRate, recordAudioParams.channel, recordAudioParams.mode, recordAudioParams.samplesPerCall);
            }
            AudioParams playbackAudioParams = iAudioFrameObserver.getPlaybackAudioParams();
            if (playbackAudioParams != null) {
                setPlaybackAudioFrameParameters(playbackAudioParams.sampleRate, playbackAudioParams.channel, playbackAudioParams.mode, playbackAudioParams.samplesPerCall);
            }
        }
        return nativeRegisterAudioFrameObserver(this.mNativeHandle, iAudioFrameObserver);
    }

    @Override // io.agora.rtc.RtcEngine
    public int registerLocalUserAccount(String str, String str2) {
        if (str == null || str2 == null) {
            return -2;
        }
        return nativeRegisterLocalUserAccount(this.mNativeHandle, str, str2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int registerMediaMetadataObserver(IMetadataObserver iMetadataObserver, int i) {
        return nativeRegisterMediaMetadataObserver(this.mNativeHandle, iMetadataObserver, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int registerVideoEncodedFrameObserver(IVideoEncodedFrameObserver iVideoEncodedFrameObserver) {
        return nativeRegisterVideoEncodedFrameObserver(this.mNativeHandle, iVideoEncodedFrameObserver);
    }

    @Override // io.agora.rtc.RtcEngine
    public int registerVideoFrameObserver(IVideoFrameObserver iVideoFrameObserver) {
        return nativeRegisterVideoFrameObserver(this.mNativeHandle, iVideoFrameObserver);
    }

    public void reinitialize(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler) {
        addHandler(iRtcEngineEventHandler);
    }

    @Override // io.agora.rtc.RtcEngine
    public int releaseLogWriter() {
        return nativeReleaseLogWriter(this.mNativeHandle);
    }

    public void releaseRecorder() {
        nativeReleaseRecorder(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public void removeHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (this.mRtcHandlers.containsKey(iRtcEngineEventHandler)) {
            this.mRtcHandlers.remove(iRtcEngineEventHandler);
        }
    }

    @Override // io.agora.rtc.RtcEngine
    public int removeInjectStreamUrl(String str) {
        if (str == null) {
            return -2;
        }
        return nativeRemoveInjectStreamUrl(this.mNativeHandle, str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int removePublishStreamUrl(String str) {
        return nativeRemovePublishStreamUrl(this.mNativeHandle, str);
    }

    public int removeRemoteVideoTrack(int i) {
        return nativeRemoveVideoReceiveTrack(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int renewToken(String str) {
        if (str == null) {
            return -2;
        }
        return setParameter("rtc.renew_token", str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int resumeAllChannelMediaRelay() {
        return nativeResumeAllChannelMediaRelay(this.mNativeHandle);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int resumeAllEffects() {
        return setParameter("che.audio.game_resume_all_effects", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int resumeAudio() {
        return setParameter("rtc.audio.paused", false);
    }

    @Override // io.agora.rtc.RtcEngine
    public int resumeAudioMixing() {
        return setParameter("che.audio.pause_file_as_playout", false);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int resumeEffect(int i) {
        return setParameter("che.audio.game_resume_effect", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int selectAudioTrack(int i) {
        if (i < 0) {
            return -2;
        }
        return setParameter("che.audio.select_audio_track", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int sendCustomReportMessage(String str, String str2, String str3, String str4, int i) {
        return nativeSendCustomReportMessage(this.mNativeHandle, str, str2, str3, str4, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int sendStreamMessage(int i, byte[] bArr) {
        return nativeSendStreamMessage(this.mNativeHandle, i, bArr);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int setApiCallMode(int i) {
        return nativeSetApiCallMode(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int setAppType(int i) {
        return nativeSetAppType(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setAudioEffectParameters(int i, int i2, int i3) {
        if (i == 33816832) {
            return setParameterObject("che.audio.morph.electronic_voice", formatString("{\"key\":%d,\"value\":%d}", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        if (i == 33622016) {
            return setParameter("che.audio.morph.threedim_voice", i2);
        }
        return -2;
    }

    @Override // io.agora.rtc.RtcEngine
    public int setAudioEffectPreset(int i) {
        if (i == 0) {
            return setParameter("che.audio.morph.voice_changer", 0);
        }
        if (i == 33620224) {
            return setParameter("che.audio.morph.reverb_preset", 1);
        }
        if (i == 33620480) {
            return setParameter("che.audio.morph.reverb_preset", 2);
        }
        if (i == 33620736) {
            return setParameter("che.audio.morph.reverb_preset", 5);
        }
        if (i == 33620992) {
            return setParameter("che.audio.morph.reverb_preset", 8);
        }
        if (i == 33621248) {
            return setParameter("che.audio.morph.virtual_stereo", 1);
        }
        if (i == 33621504) {
            return setParameter("che.audio.morph.voice_changer", 15);
        }
        if (i == 33621760) {
            return setParameter("che.audio.morph.voice_changer", 5);
        }
        if (i == 33622016) {
            return setParameter("che.audio.morph.threedim_voice", 10);
        }
        if (i == 33685760) {
            return setParameter("che.audio.morph.reverb_preset", 3);
        }
        if (i == 33686016) {
            return setParameter("che.audio.morph.voice_changer", 1);
        }
        if (i == 33686272) {
            return setParameter("che.audio.morph.voice_changer", 2);
        }
        if (i == 33686528) {
            return setParameter("che.audio.morph.reverb_preset", 4);
        }
        if (i == 33686784) {
            return setParameter("che.audio.morph.voice_changer", 3);
        }
        if (i == 33687040) {
            return setParameter("che.audio.morph.voice_changer", 4);
        }
        if (i == 33687296) {
            return setParameter("che.audio.morph.voice_changer", 6);
        }
        if (i == 33751296) {
            return setParameter("che.audio.morph.reverb_preset", 7);
        }
        if (i == 33751552) {
            return setParameter("che.audio.morph.reverb_preset", 6);
        }
        if (i == 33816832) {
            return setParameterObject("che.audio.morph.electronic_voice", formatString("{\"key\":%d,\"value\":%d}", 1, 4));
        }
        return -2;
    }

    @Override // io.agora.rtc.RtcEngine
    public int setAudioMixingDualMonoMode(int i) {
        if (i < 0 || i > 3) {
            return -2;
        }
        return setParameter("che.audio.set_dual_mono_mode", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setAudioMixingPitch(int i) {
        if (i > 12 || i < -12) {
            return -2;
        }
        return setParameter("che.audio.set_playout_file_pitch_semitones", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setAudioMixingPlaybackSpeed(int i) {
        return setParameter("che.audio.set_audio_mixing_play_tempo", ((double) i) / 100.0d);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setAudioMixingPosition(int i) {
        return setParameter("che.audio.mixing.file.position", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setAudioProfile(int i, int i2) {
        return nativeSetAudioProfile(this.mNativeHandle, i, i2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setBeautyEffectOptions(boolean z, BeautyOptions beautyOptions) {
        if (beautyOptions == null) {
            if (z) {
                return -2;
            }
            beautyOptions = new BeautyOptions();
        }
        return nativeSetBeautyEffectOptions(this.mNativeHandle, z, beautyOptions.lighteningContrastLevel, beautyOptions.lighteningLevel, beautyOptions.smoothnessLevel, beautyOptions.rednessLevel, beautyOptions.sharpnessLevel);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraAutoFocusFaceModeEnabled(boolean z) {
        return setParameter("che.video.camera.face_detection", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraCapturerConfiguration(CameraCapturerConfiguration cameraCapturerConfiguration) {
        CameraCapturerConfiguration.CaptureDimensions captureDimensions;
        int parameter = setParameter("che.video.camera_capture_mode", cameraCapturerConfiguration.preference.getValue());
        if (cameraCapturerConfiguration.preference == CameraCapturerConfiguration.CAPTURER_OUTPUT_PREFERENCE.CAPTURER_OUTPUT_PREFERENCE_MANUAL && (captureDimensions = cameraCapturerConfiguration.dimensions) != null) {
            setParameter("che.video.capture_width", captureDimensions.width);
            setParameter("che.video.capture_height", cameraCapturerConfiguration.dimensions.height);
        }
        return parameter == 0 ? switchCamera(cameraCapturerConfiguration.cameraDirection) : parameter;
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraExposurePosition(float f, float f2) {
        return setParameterObject("che.video.camera.exposure", formatString("{\"x\":%f,\"y\":%f,\"preview\":%b}", Float.valueOf(f), Float.valueOf(f2), Boolean.TRUE));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraFocusPositionInPreview(float f, float f2) {
        return setParameterObject("che.video.camera.focus", formatString("{\"x\":%f,\"y\":%f,\"preview\":%b}", Float.valueOf(f), Float.valueOf(f2), Boolean.TRUE));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraTorchOn(boolean z) {
        return setParameter("che.video.camera.flash", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCameraZoomFactor(float f) {
        return setParameter("che.video.camera.zoom", f);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setChannelProfile(int i) {
        if (i == 0) {
            setClientRole(1);
        }
        return nativeSetChannelProfile(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setClientRole(int i) {
        return nativeSetClientRole(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setCloudProxy(int i) {
        return nativeSetCloudProxy(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setColorEnhanceOptions(boolean z, ColorEnhanceOptions colorEnhanceOptions) {
        if (colorEnhanceOptions == null) {
            if (z) {
                return -2;
            }
            colorEnhanceOptions = new ColorEnhanceOptions();
        }
        return nativeSetColorEnhanceOptions(this.mNativeHandle, z, colorEnhanceOptions.strengthLevel, colorEnhanceOptions.skinProtectLevel);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setDefaultAudioRoutetoSpeakerphone(boolean z) {
        Logging.i(String.format("API call to setDefaultAudioRoutetoSpeakerphone :%b", Boolean.valueOf(z)));
        return nativeSetDefaultAudioRoutetoSpeakerphone(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setDefaultMuteAllRemoteAudioStreams(boolean z) {
        return setParameter("rtc.audio.set_default_mute_peers", z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setDefaultMuteAllRemoteVideoStreams(boolean z) {
        return setParameter("rtc.video.set_default_mute_peers", z);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int setEffectPosition(int i, int i2) {
        return setParameterObject("che.audio.set_effect_file_position", formatString("{\"soundId\":%d,\"effectPos\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int setEffectsVolume(double d) {
        int i = (int) d;
        int iAdjustEffectsPlayoutVolume = adjustEffectsPlayoutVolume(i);
        return iAdjustEffectsPlayoutVolume == 0 ? adjustEffectsPublishVolume(i) : iAdjustEffectsPlayoutVolume;
    }

    @Override // io.agora.rtc.RtcEngine
    public int setEnableSpeakerphone(boolean z) {
        Logging.i(String.format("API call to setEnableSpeakerphone to %b", Boolean.valueOf(z)));
        return nativeSetEnableSpeakerphone(this.mNativeHandle, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setEncryptionMode(String str) {
        return setParameter("rtc.encryption.mode", str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setEncryptionSecret(String str) {
        return nativeSetEncryptionSecret(this.mNativeHandle, str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setExternalAudioSink(boolean z, int i, int i2) {
        if (i2 != 1 && i2 != 2) {
            return -1;
        }
        if (i != 8000 && i != 16000 && i != 32000 && i != 44100 && i != 48000) {
            return -2;
        }
        this.mExAudioSinkChannels = i2;
        this.mExAudioSinkSampleRate = i;
        return z ? setParameters(formatString("{\"che.audio.external_render\":%b,\"che.audio.external_render.pull\":%b,\"che.audio.set_render_raw_audio_format\":{\"sampleRate\":%d,\"channelCnt\":%d,\"mode\":%d}}", Boolean.valueOf(z), Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), 0)) : setParameters(formatString("{\"che.audio.external_render\":%b,\"che.audio.external_render\":%b,\"che.audio.external_render.pull\":%b}", Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setExternalAudioSource(boolean z, int i, int i2) {
        this.mExAudioSourceSampleRate = i;
        this.mExAudioSourceChannels = i2;
        return z ? setParameters(formatString("{\"che.audio.external_capture\":%b,\"che.audio.set_external_source_format\":{\"sampleRate\":%d,\"channelCnt\":%d}}", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2))) : setParameters(formatString("{\"che.audio.external_capture\":%b,\"che.audio.external_capture\":%b}", Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setExternalAudioSourceVolume(int i, int i2) {
        return setParameters(formatString("{\"che.audio.set_external_source_volume\":{\"sourcePos\":%d, \"gain\":%d}}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public void setExternalVideoSource(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.mVideoSourceType = 3;
        } else {
            this.mVideoSourceType = 1;
        }
        if (z2) {
            if (z) {
                setParameter("che.video.enable_external_texture_input", true);
            } else {
                setParameter("che.video.enable_external_texture_input", false);
                Logging.w("setExternalVideoSource: on Android, texture mode cannot be disabled once enabled.");
            }
        }
        setExtVideoSource(this.mNativeHandle, z ? 1 : 0, z3 ? 1 : 0);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setHighQualityAudioParameters(boolean z, boolean z2, boolean z3) {
        return setParameterObject("che.audio.codec.hq", formatString("{\"fullband\":%b,\"stereo\":%b,\"fullBitrate\":%b}", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setInEarMonitoringVolume(int i) {
        return setParameter("che.audio.headset.monitoring.parameter", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLiveTranscoding(LiveTranscoding liveTranscoding) {
        if (liveTranscoding == null) {
            return -2;
        }
        return nativeSetLiveTranscoding(this.mNativeHandle, new RtcEngineMessage.PLiveTranscoding().marshall(liveTranscoding));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalAccessPoint(ArrayList<String> arrayList, String str) {
        return nativeSetLocalAccessPoint(this.mNativeHandle, arrayList, str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalPublishFallbackOption(int i) {
        return setParameter("rtc.local_publish_fallback_option", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalRenderMode(int i) {
        return setRemoteRenderMode(0, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVideoMirrorMode(int i) {
        return nativeSetLocalVideoMirrorMode(this.mNativeHandle, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVideoRenderer(IVideoSink iVideoSink) {
        int i;
        if (iVideoSink == null) {
            i = 0;
        } else {
            i = iVideoSink instanceof AgoraDefaultRender ? 1 : 2;
        }
        return nativeAddLocalVideoRender(this.mNativeHandle, iVideoSink, i);
    }

    @Override // io.agora.rtc.RtcEngine
    @Deprecated
    public int setLocalVoiceChanger(int i) {
        if (i == 0) {
            return setParameter("che.audio.morph.voice_changer", i);
        }
        if (i > 0 && i < 1048576) {
            return setParameter("che.audio.morph.voice_changer", i);
        }
        if (i > 1048576 && i < 2097152) {
            return setParameter("che.audio.morph.voice_changer", (i - 1048576) + 6);
        }
        if (i <= 2097152 || i >= 3145728) {
            return -2;
        }
        return setParameter("che.audio.morph.beauty_voice", i - 2097152);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVoiceEqualization(int i, int i2) {
        return setParameterObject("che.audio.morph.equalization", formatString("{\"index\":%d,\"gain\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVoicePitch(double d) {
        return setParameter("che.audio.morph.pitch_shift", (int) (d * 100.0d));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalVoiceReverb(int i, int i2) {
        return setParameterObject("che.audio.morph.reverb", formatString("{\"key\":%d,\"value\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    @Deprecated
    public int setLocalVoiceReverbPreset(int i) {
        if (i == 0) {
            return setParameter("che.audio.morph.reverb_preset", i);
        }
        if (i > 0 && i < 1048576) {
            return setParameter("che.audio.morph.reverb_preset", i + 8);
        }
        if (i > 1048576 && i < 2097152) {
            return setParameter("che.audio.morph.reverb_preset", i - 1048576);
        }
        if (i > 2097152 && i < 2097154) {
            return setParameter("che.audio.morph.virtual_stereo", i - 2097152);
        }
        if (i > 3145728 && i < 3145730) {
            return setParameterObject("che.audio.morph.electronic_voice", formatString("{\"key\":%d,\"value\":%d}", 1, 4));
        }
        if (i <= 4194304 || i >= 4194306) {
            return -2;
        }
        return setParameter("che.audio.morph.threedim_voice", 10);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLogFile(String str) {
        int parameter = setParameter("rtc.log_file", str);
        if (parameter == 0) {
            getParameters("[\"rtc.log_file\"]").equals(str);
        }
        return parameter;
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLogFileSize(int i) {
        return setParameter("rtc.log_size", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLogFilter(int i) {
        return setParameter("rtc.log_filter", i & Constants.LOG_FILTER_DEBUG);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLogWriter(ILogWriter iLogWriter) {
        return nativeSetLogWriter(this.mNativeHandle, iLogWriter);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLowlightEnhanceOptions(boolean z, LowLightEnhanceOptions lowLightEnhanceOptions) {
        if (lowLightEnhanceOptions == null) {
            if (z) {
                return -2;
            }
            lowLightEnhanceOptions = new LowLightEnhanceOptions();
        }
        return nativeSetLowlightEnhanceOptions(this.mNativeHandle, z, lowLightEnhanceOptions.lowlightEnhanceMode, lowLightEnhanceOptions.lowlightEnhanceLevel);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setMixedAudioFrameParameters(int i, int i2) {
        return setParameterObject("che.audio.set_mixed_raw_audio_format", formatString("{\"sampleRate\":%d,\"samplesPerCall\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setParameters(String str) {
        return nativeSetParameters(this.mNativeHandle, str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setPlaybackAudioFrameParameters(int i, int i2, int i3, int i4) {
        return setParameterObject("che.audio.set_render_raw_audio_format", formatString("{\"sampleRate\":%d,\"channelCnt\":%d,\"mode\":%d,\"samplesPerCall\":%d}", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    @Override // io.agora.rtc.RtcEngine
    @Deprecated
    public void setPreferHeadset(boolean z) {
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int setProfile(String str, boolean z) {
        return nativeSetProfile(this.mNativeHandle, str, z);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRecordingAudioFrameParameters(int i, int i2, int i3, int i4) {
        return setParameterObject("che.audio.set_capture_raw_audio_format", formatString("{\"sampleRate\":%d,\"channelCnt\":%d,\"mode\":%d,\"samplesPerCall\":%d}", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteDefaultVideoStreamType(int i) {
        return setParameter("rtc.video.set_remote_default_video_stream_type", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteRenderMode(int i, int i2) {
        return nativeSetRemoteRenderMode(this.mNativeHandle, (int) (((long) i) & 4294967295L), i2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteSubscribeFallbackOption(int i) {
        return setParameter("rtc.remote_subscribe_fallback_option", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteUserPriority(int i, int i2) {
        return nativeSetRemoteUserPriority(this.mNativeHandle, i, i2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteVideoRenderer(int i, IVideoSink iVideoSink) {
        int i2;
        if (iVideoSink == null) {
            i2 = 0;
        } else {
            i2 = iVideoSink instanceof AgoraDefaultRender ? 1 : 2;
        }
        return nativeAddRemoteVideoRender(this.mNativeHandle, i, iVideoSink, i2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteVideoStreamType(int i, int i2) {
        long j = ((long) i) & 4294967295L;
        return setParameters(formatString("{\"rtc.video.set_remote_video_stream\":{\"uid\":%d,\"stream\":%d},\"che.video.setstream\":{\"uid\":%d,\"stream\":%d}}", Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteVoicePosition(int i, double d, double d2) {
        return setParameterObject("che.audio.game_place_sound_position", formatString("{\"uid\":%d,\"pan\":%f,\"gain\":%f}", Long.valueOf(((long) i) & 4294967295L), Double.valueOf(d), Double.valueOf(d2)));
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int setTextureId(int i, EGLContext eGLContext, int i2, int i3, long j) {
        return nativeSetEGL10TextureId(this.mNativeHandle, i, eGLContext, 10, i2, i3, j, sMatrix);
    }

    public int setTextureIdWithMatrix(int i, EGLContext eGLContext, int i2, int i3, int i4, long j, float[] fArr) {
        if (fArr == null) {
            return nativeSetEGL10TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, sMatrix);
        }
        if (fArr.length < 16) {
            return -2;
        }
        return nativeSetEGL10TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, fArr);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVideoDenoiserOptions(boolean z, VideoDenoiserOptions videoDenoiserOptions) {
        if (videoDenoiserOptions == null) {
            if (z) {
                return -2;
            }
            videoDenoiserOptions = new VideoDenoiserOptions();
        }
        return nativeSetVideoDenoiserOptions(this.mNativeHandle, z, videoDenoiserOptions.denoiserMode, videoDenoiserOptions.denoiserLevel);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVideoEncoderConfiguration(VideoEncoderConfiguration videoEncoderConfiguration) {
        long j = this.mNativeHandle;
        VideoEncoderConfiguration.VideoDimensions videoDimensions = videoEncoderConfiguration.dimensions;
        return nativeSetVideoEncoderConfiguration(j, videoDimensions.width, videoDimensions.height, videoEncoderConfiguration.frameRate, videoEncoderConfiguration.minFrameRate, videoEncoderConfiguration.bitrate, videoEncoderConfiguration.minBitrate, videoEncoderConfiguration.orientationMode.getValue(), videoEncoderConfiguration.degradationPrefer.getValue(), videoEncoderConfiguration.mirrorMode);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVideoProfile(int i, boolean z) {
        if (i < 0) {
            return -2;
        }
        return setParameters(formatString("{\"rtc.video.profile\":[%d,%b]}", Integer.valueOf(i), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVideoQualityParameters(boolean z) {
        return setParameters(String.format("{\"rtc.video.prefer_frame_rate\":%b,\"che.video.prefer_frame_rate\":%b}", Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVideoSource(IVideoSource iVideoSource) {
        if (iVideoSource == null) {
            this.mVideoSourceType = 0;
        } else if (iVideoSource instanceof AgoraDefaultSource) {
            this.mVideoSourceType = 1;
        } else {
            this.mVideoSourceType = 2;
        }
        return nativeAddVideoCapturer(this.mNativeHandle, iVideoSource, this.mVideoSourceType);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVoiceBeautifierParameters(int i, int i2, int i3) {
        if (i == 16908544 || i == 16908800) {
            return setParameterObject("che.audio.morph.beauty_sing", formatString("{\"key\":%d,\"value\":%d}", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        return -2;
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVoiceBeautifierPreset(int i) {
        if (i == 0) {
            return setParameter("che.audio.morph.voice_changer", 0);
        }
        if (i == 16843008) {
            return setParameter("che.audio.morph.beauty_voice", 1);
        }
        if (i == 16843264) {
            return setParameter("che.audio.morph.beauty_voice", 2);
        }
        if (i == 16843520) {
            return setParameter("che.audio.morph.beauty_voice", 3);
        }
        if (i == 16908544) {
            return setParameterObject("che.audio.morph.beauty_sing", formatString("{\"key\":%d,\"value\":%d}", 1, 1));
        }
        if (i == 16908800) {
            return setParameterObject("che.audio.morph.beauty_sing", formatString("{\"key\":%d,\"value\":%d}", 2, 1));
        }
        if (i == 16974080) {
            return setParameter("che.audio.morph.voice_changer", 7);
        }
        if (i == 16974336) {
            return setParameter("che.audio.morph.voice_changer", 8);
        }
        if (i == 16974592) {
            return setParameter("che.audio.morph.voice_changer", 9);
        }
        if (i == 16974848) {
            return setParameter("che.audio.morph.voice_changer", 10);
        }
        if (i == 16975104) {
            return setParameter("che.audio.morph.voice_changer", 11);
        }
        if (i == 16975360) {
            return setParameter("che.audio.morph.voice_changer", 12);
        }
        if (i == 16975616) {
            return setParameter("che.audio.morph.voice_changer", 13);
        }
        if (i == 16975872) {
            return setParameter("che.audio.morph.voice_changer", 14);
        }
        return -2;
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVoiceConversionPreset(int i) {
        if (i == 0) {
            return setParameter("che.audio.morph.voice_changer", 0);
        }
        if (i == 50397440) {
            return setParameter("che.audio.morph.vocal_changer", 1);
        }
        if (i == 50397696) {
            return setParameter("che.audio.morph.vocal_changer", 2);
        }
        if (i == 50397952) {
            return setParameter("che.audio.morph.vocal_changer", 3);
        }
        if (i == 50398208) {
            return setParameter("che.audio.morph.vocal_changer", 4);
        }
        return -2;
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int setVolumeOfEffect(int i, double d) {
        return setParameterObject("che.audio.game_adjust_effect_volume", formatString("{\"soundId\":%d,\"gain\":%f}", Integer.valueOf(i), Double.valueOf(d)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int setupLocalVideo(VideoCanvas videoCanvas) {
        checkIfInUIThread("setupLocalVideo");
        if (this.mVideoSourceType == 3) {
            return -1;
        }
        if (videoCanvas != null) {
            this.mUseLocalView = true;
            nativeSetupVideoLocal(this.mNativeHandle, videoCanvas.view, videoCanvas.renderMode, videoCanvas.mirrorMode);
        } else {
            this.mUseLocalView = false;
            nativeSetupVideoLocal(this.mNativeHandle, null, 1, 0);
        }
        return 0;
    }

    @Override // io.agora.rtc.RtcEngine
    public int setupRemoteVideo(VideoCanvas videoCanvas) {
        checkIfInUIThread("setupRemoteVideo");
        if (videoCanvas == null) {
            return -1;
        }
        String str = videoCanvas.channelId;
        return str != null ? nativeSetupVideoRemote(this.mNativeHandle, videoCanvas.view, videoCanvas.renderMode, str, videoCanvas.uid, videoCanvas.mirrorMode) : nativeSetupVideoRemote(this.mNativeHandle, videoCanvas.view, videoCanvas.renderMode, "", videoCanvas.uid, videoCanvas.mirrorMode);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startAudioMixing(String str, boolean z, boolean z2, int i, int i2) {
        return setParameterObject("che.audio.start_file_as_playout", formatString("{\"filePath\":\"%s\", \"loopback\":%b, \"replace\":%b, \"cycle\":%d, \"startPos\": %d}", str, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int startAudioRecording(String str, int i) {
        return startAudioRecording(str, LogType.UNEXP_KNOWN_REASON, i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startChannelMediaRelay(ChannelMediaRelayConfiguration channelMediaRelayConfiguration) {
        if (channelMediaRelayConfiguration == null || channelMediaRelayConfiguration.getDestChannelMediaInfos().size() == 0 || channelMediaRelayConfiguration.getSrcChannelMediaInfo() == null) {
            return -2;
        }
        for (Map.Entry<String, ChannelMediaInfo> entry : channelMediaRelayConfiguration.getDestChannelMediaInfos().entrySet()) {
            if (entry.getValue().channelName == null || entry.getValue().channelName.length() == 0) {
                return -2;
            }
        }
        return nativeStartChannelMediaRelay(this.mNativeHandle, new RtcEngineMessage.PChannelMediaRelayConfiguration().marshall(channelMediaRelayConfiguration));
    }

    @Override // io.agora.rtc.RtcEngine
    public int startDumpVideoReceiveTrack(int i, String str) {
        return nativeStartDumpVideoReceiveTrack(this.mNativeHandle, i, str);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startEchoTest() {
        Context context = this.mContext.get();
        if (context == null) {
            return -7;
        }
        doMonitorSystemEvent(context);
        return nativeStartEchoTest(this.mNativeHandle, null);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startLastmileProbeTest(LastmileProbeConfig lastmileProbeConfig) {
        Context context = this.mContext.get();
        if (context == null) {
            return -7;
        }
        doMonitorSystemEvent(context);
        return nativeStartLastmileProbeTest(this.mNativeHandle, null, lastmileProbeConfig.probeUplink, lastmileProbeConfig.probeDownlink, lastmileProbeConfig.expectedUplinkBitrate, lastmileProbeConfig.expectedDownlinkBitrate);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startPreview() {
        if (this.mVideoSourceType == 3) {
            return -4;
        }
        return nativeStartPreview(this.mNativeHandle);
    }

    public int startRecording(String str, int i, int i2, int i3, int i4) {
        return nativeStartRecording(this.mNativeHandle, str, i, i2, i3, i4);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int startRhythmPlayer(String str, String str2, AgoraRhythmPlayerConfig agoraRhythmPlayerConfig) {
        return setParameterObject("che.audio.play_rhythm", formatString("{\"file1\":\"%s\",\"file2\":\"%s\",\"beatsPerMeasure\":%d, \"beatsPerMinute\":%d,\"publish\":%d}", str, str2, Integer.valueOf(agoraRhythmPlayerConfig.beatsPerMeasure), Integer.valueOf(agoraRhythmPlayerConfig.beatsPerMinute), Integer.valueOf(agoraRhythmPlayerConfig.publish ? 1 : 0)));
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int stopAllEffects() {
        return setParameter("che.audio.game_stop_all_effects", true);
    }

    public int stopAllRemoteVideo() {
        return setParameter("che.video.peer.stop_all_renders", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopAudioMixing() {
        return setParameter("che.audio.stop_file_as_playout", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopAudioRecording() {
        return nativeStopAudioRecording(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopChannelMediaRelay() {
        return nativeStopChannelMediaRelay(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopDumpVideoReceiveTrack() {
        return nativeStopDumpVideoReceiveTrack(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopEchoTest() {
        return nativeStopEchoTest(this.mNativeHandle);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int stopEffect(int i) {
        return setParameter("che.audio.game_stop_effect", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopLastmileProbeTest() {
        return nativeStopLastmileProbeTest(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int stopPreview() {
        return setParameter("rtc.video.preview", false);
    }

    public int stopRecording() {
        return nativeStopRecording(this.mNativeHandle);
    }

    public int stopRemoteVideo(int i) {
        return setParameter("che.video.peer.stop_video", ((long) i) & 4294967295L);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int stopRhythmPlayer() {
        return setParameter("che.audio.stop_rhythm", true);
    }

    @Override // io.agora.rtc.RtcEngine
    public int switchCamera() {
        if (this.mVideoSourceType != 1) {
            return -1;
        }
        return nativeSwitchCamera(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int switchChannel(String str, String str2) {
        ChannelMediaOptions channelMediaOptions = new ChannelMediaOptions();
        channelMediaOptions.autoSubscribeAudio = true;
        channelMediaOptions.autoSubscribeVideo = true;
        return switchChannel(str, str2, channelMediaOptions);
    }

    @Override // io.agora.rtc.RtcEngine
    public int takeSnapshot(String str, int i, String str2) {
        return nativeTakeSnapshot(this.mNativeHandle, str, i, str2);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int unloadEffect(int i) {
        return setParameter("che.audio.game_unload_effect", i);
    }

    @Override // io.agora.rtc.RtcEngine
    public int updateChannelMediaRelay(ChannelMediaRelayConfiguration channelMediaRelayConfiguration) {
        if (channelMediaRelayConfiguration == null || channelMediaRelayConfiguration.getDestChannelMediaInfos().size() == 0 || channelMediaRelayConfiguration.getSrcChannelMediaInfo() == null) {
            return -2;
        }
        for (Map.Entry<String, ChannelMediaInfo> entry : channelMediaRelayConfiguration.getDestChannelMediaInfos().entrySet()) {
            if (entry.getValue().channelName == null || entry.getValue().channelName.length() == 0) {
                return -2;
            }
        }
        return nativeUpdateChannelMediaRelay(this.mNativeHandle, new RtcEngineMessage.PChannelMediaRelayConfiguration().marshall(channelMediaRelayConfiguration));
    }

    public synchronized void updateRtcStats(RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats) {
        IRtcEngineEventHandler.RtcStats rtcStats = getRtcStats();
        if (rtcStats == null) {
            return;
        }
        rtcStats.totalDuration = pMediaResRtcStats.totalDuration;
        rtcStats.txBytes = pMediaResRtcStats.totalTxBytes;
        rtcStats.rxBytes = pMediaResRtcStats.totalRxBytes;
        rtcStats.txAudioBytes = pMediaResRtcStats.txAudioBytes;
        rtcStats.txVideoBytes = pMediaResRtcStats.txVideoBytes;
        rtcStats.rxAudioBytes = pMediaResRtcStats.rxAudioBytes;
        rtcStats.rxVideoBytes = pMediaResRtcStats.rxVideoBytes;
        rtcStats.txKBitRate = pMediaResRtcStats.txKBitRate;
        rtcStats.rxKBitRate = pMediaResRtcStats.rxKBitRate;
        rtcStats.txAudioKBitRate = pMediaResRtcStats.txAudioKBitRate;
        rtcStats.rxAudioKBitRate = pMediaResRtcStats.rxAudioKBitRate;
        rtcStats.txVideoKBitRate = pMediaResRtcStats.txVideoKBitRate;
        rtcStats.rxVideoKBitRate = pMediaResRtcStats.rxVideoKBitRate;
        rtcStats.lastmileDelay = pMediaResRtcStats.lastmileDelay;
        rtcStats.txPacketLossRate = pMediaResRtcStats.txPacketLossRate;
        rtcStats.rxPacketLossRate = pMediaResRtcStats.rxPacketLossRate;
        rtcStats.users = pMediaResRtcStats.users;
        rtcStats.cpuTotalUsage = ((double) pMediaResRtcStats.cpuTotalUsage) / 100.0d;
        rtcStats.cpuAppUsage = ((double) pMediaResRtcStats.cpuAppUsage) / 100.0d;
        rtcStats.gatewayRtt = pMediaResRtcStats.gatewayRtt;
        rtcStats.memoryAppUsageRatio = pMediaResRtcStats.memoryAppUsageRatio;
        rtcStats.memoryTotalUsageRatio = pMediaResRtcStats.memoryTotalUsageRatio;
        rtcStats.memoryAppUsageInKbytes = pMediaResRtcStats.memoryAppUsageInKbytes;
        rtcStats.videoMosValue = pMediaResRtcStats.videoMosValue;
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int updateSharedContext(EGLContext eGLContext) {
        return nativeSetEGL10Context(this.mNativeHandle, eGLContext);
    }

    @Override // io.agora.rtc.RtcEngine
    public String uploadLogFile() {
        return nativeUploadLogFile(this.mNativeHandle);
    }

    @Override // io.agora.rtc.RtcEngine
    public int useExternalAudioDevice() {
        return setParameters("{\"che.audio.audioSampleRate\":32000, \"che.audio.external_device\":true}");
    }

    private int setParameter(String str, int i) {
        return setParameters(formatString("{\"%s\":%d}", str, Integer.valueOf(i)));
    }

    @Override // io.agora.rtc.RtcEngine
    public int createDataStream(DataStreamConfig dataStreamConfig) {
        return nativeCreateDataStream2(this.mNativeHandle, dataStreamConfig.ordered, dataStreamConfig.syncWithAudio);
    }

    @Override // io.agora.rtc.IAudioEffectManager
    @Deprecated
    public int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z) {
        return playEffect(i, str, i2, d, d2, d3, z, 0);
    }

    @Override // io.agora.rtc.RtcEngine
    public int pushExternalAudioFrame(byte[] bArr, long j, int i, int i2, int i3, int i4) {
        return nativePushExternalAudioFrameRawDataExt(this.mNativeHandle, bArr, j, i, i2, i3, i4);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setClientRole(int i, ClientRoleOptions clientRoleOptions) {
        return nativeSetClientRoleOptions(this.mNativeHandle, i, clientRoleOptions);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setLocalRenderMode(int i, int i2) {
        return setRemoteRenderMode(0, i, i2);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setRemoteRenderMode(int i, int i2, int i3) {
        return nativeSetRemoteRenderModeWithMirrorMode(this.mNativeHandle, (int) (((long) i) & 4294967295L), i2, i3);
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int setTextureId(int i, android.opengl.EGLContext eGLContext, int i2, int i3, long j) {
        return nativeSetEGL14TextureId(this.mNativeHandle, i, eGLContext, 11, i2, i3, j, sMatrix);
    }

    @Override // io.agora.rtc.RtcEngine
    public int setVideoProfile(int i, int i2, int i3, int i4) {
        return nativeSetVideoProfileEx(this.mNativeHandle, i, i2, i3, i4);
    }

    @Override // io.agora.rtc.RtcEngine
    @Deprecated
    public int startAudioMixing(String str, boolean z, boolean z2, int i) {
        return startAudioMixing(str, z, z2, i, 0);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startAudioRecording(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        return setParameterObject("che.audio.start_recording", formatString("{\"filePath\":\"%s\", \"sampleRate\":%d, \"quality\":%d}", str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // io.agora.rtc.RtcEngineEx
    public int updateSharedContext(android.opengl.EGLContext eGLContext) {
        return nativeSetEGL14Context(this.mNativeHandle, eGLContext);
    }

    private int setParameter(String str, long j) {
        return setParameters(formatString("{\"%s\":%d}", str, Long.valueOf(j)));
    }

    private int switchCamera(CameraCapturerConfiguration.CAMERA_DIRECTION camera_direction) {
        if (this.mVideoSourceType != 1) {
            return -1;
        }
        return nativeSwitchCameraByDirection(this.mNativeHandle, camera_direction.getValue());
    }

    @Override // io.agora.rtc.IAudioEffectManager
    public int playEffect(int i, String str, int i2, double d, double d2, double d3, boolean z, int i3) {
        return setParameterObject("che.audio.game_play_effect", formatString("{\"soundId\":%d,\"filePath\":\"%s\",\"loopCount\":%d, \"pitch\":%f,\"pan\":%f,\"gain\":%f, \"send2far\":%d, \"startPos\":%d}", Integer.valueOf(i), str, Integer.valueOf(i2), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(z ? 1 : 0), Integer.valueOf(i3)));
    }

    private int setParameter(String str, double d) {
        return setParameters(formatString("{\"%s\":%f}", str, Double.valueOf(d)));
    }

    public int setTextureIdWithMatrix(int i, android.opengl.EGLContext eGLContext, int i2, int i3, int i4, long j, float[] fArr) {
        if (fArr == null) {
            return nativeSetEGL14TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, sMatrix);
        }
        if (fArr.length < 16) {
            return -2;
        }
        return nativeSetEGL14TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, fArr);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startAudioRecording(AudioRecordingConfiguration audioRecordingConfiguration) {
        return nativeStartAudioRecording(this.mNativeHandle, audioRecordingConfiguration.filePath, audioRecordingConfiguration.recordingQuality, audioRecordingConfiguration.recordingPosition, audioRecordingConfiguration.recordingSampleRate, audioRecordingConfiguration.recordingChannel);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startEchoTest(int i) {
        Context context = this.mContext.get();
        if (context == null) {
            return -7;
        }
        doMonitorSystemEvent(context);
        return nativeStartEchoTestWithInterval(this.mNativeHandle, null, i);
    }

    private int setParameter(String str, String str2) {
        return setParameters(formatString("{\"%s\":\"%s\"}", str, str2));
    }

    @Override // io.agora.rtc.RtcEngine
    public int switchChannel(String str, String str2, ChannelMediaOptions channelMediaOptions) {
        if (channelMediaOptions == null) {
            return -2;
        }
        return nativeSwitchChannel(this.mNativeHandle, str, str2, channelMediaOptions);
    }

    @Override // io.agora.rtc.RtcEngine
    public int joinChannelWithUserAccount(String str, String str2, String str3, ChannelMediaOptions channelMediaOptions) {
        if (channelMediaOptions == null) {
            return -2;
        }
        int iNativeJoinChannelWithUserAccount = nativeJoinChannelWithUserAccount(this.mNativeHandle, str, str2, str3, channelMediaOptions);
        synchronized (this) {
            if (this.mDefaultRtcChannel == null) {
                this.mDefaultRtcChannel = new RtcChannelImpl();
            }
            if (iNativeJoinChannelWithUserAccount == 0) {
                this.mDefaultRtcChannel.initialize(this, nativeGetDefaultRtcChannel(this.mNativeHandle));
            }
        }
        return iNativeJoinChannelWithUserAccount;
    }

    @Override // io.agora.rtc.RtcEngine
    public int addVideoWatermark(String str, WatermarkOptions watermarkOptions) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (str == null || TextUtils.isEmpty(str) || watermarkOptions == null) {
            return -2;
        }
        WatermarkOptions.Rectangle rectangle = watermarkOptions.positionInLandscapeMode;
        if (rectangle != null) {
            int i9 = rectangle.x;
            int i10 = rectangle.y;
            int i11 = rectangle.width;
            i4 = rectangle.height;
            i2 = i10;
            i3 = i11;
            i = i9;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        WatermarkOptions.Rectangle rectangle2 = watermarkOptions.positionInPortraitMode;
        if (rectangle2 != null) {
            int i12 = rectangle2.x;
            int i13 = rectangle2.y;
            int i14 = rectangle2.width;
            i8 = rectangle2.height;
            i5 = i12;
            i6 = i13;
            i7 = i14;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        return nativeAddVideoWatermark(this.mNativeHandle, str, watermarkOptions.visibleInPreview, i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Override // io.agora.rtc.RtcEngine
    public int startEchoTest(EchoTestConfiguration echoTestConfiguration) {
        Context context = this.mContext.get();
        if (context == null) {
            return -7;
        }
        String str = echoTestConfiguration.channelId;
        if (str == null || str.length() == 0) {
            return -2;
        }
        doMonitorSystemEvent(context);
        return nativeStartEchoTestWithConfig(this.mNativeHandle, echoTestConfiguration);
    }

    @Override // io.agora.rtc.RtcEngine
    public int joinChannel(String str, String str2, String str3, int i, ChannelMediaOptions channelMediaOptions) {
        Context context = this.mContext.get();
        if (context == null) {
            return -7;
        }
        if (channelMediaOptions == null) {
            return -2;
        }
        doJoinChannelCheck(context);
        int iNativeJoinChannel = nativeJoinChannel(this.mNativeHandle, null, str, str2, str3, i, channelMediaOptions);
        synchronized (this) {
            if (this.mDefaultRtcChannel == null) {
                this.mDefaultRtcChannel = new RtcChannelImpl();
            }
            if (iNativeJoinChannel == 0) {
                this.mDefaultRtcChannel.initialize(this, nativeGetDefaultRtcChannel(this.mNativeHandle));
            }
        }
        return iNativeJoinChannel;
    }

    public RtcEngineImpl(RtcEngineConfig rtcEngineConfig) throws Exception {
        this.mNativeHandle = 0L;
        this.mContext = new WeakReference<>(rtcEngineConfig.mContext);
        addHandler(rtcEngineConfig.mEventHandler);
        this.mNativeHandle = nativeObjectInitWithConfig(rtcEngineConfig);
        initDeviceNotify(rtcEngineConfig.mContext);
    }
}
