package com.zego.wrapper;

import OooO00o.OooO00o;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.OrientationEventListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zego.wrapper.callback.ZegoLiveRoomEngineDestroyCompletionCallback;
import com.zego.wrapper.empty.audioplayer.IZegoAudioPlayerCallback;
import com.zego.wrapper.helper.FileHelper;
import com.zego.wrapper.helper.ZegoMediaPlayerCallbackAdapter;
import com.zego.wrapper.live.ZegoLiveTranscoding;
import com.zego.wrapper.log.ZLog;
import com.zego.wrapper.log.ZegoLogManager;
import com.zego.wrapper.manager.entity.ResultCode;
import com.zego.wrapper.manager.entity.ZegoUser;
import com.zego.wrapper.manager.room.ZegoLoginRoomCallback;
import com.zego.wrapper.manager.room.ZegoRoomInfo;
import com.zego.wrapper.manager.room.ZegoRoomManager;
import com.zego.wrapper.manager.room.ZegoRoomManagerCallback;
import com.zego.wrapper.manager.room.ZegoRoomManagerLiveStatusCallback;
import com.zego.wrapper.manager.room.ZegoUserLiveInfo;
import com.zego.wrapper.manager.room.ZegoUserLiveQuality;
import com.zego.wrapper.video.ZegoImage;
import com.zego.wrapper.video.ZegoLiveRoomVideoCanvas;
import com.zego.wrapper.video.ZegoVideoEncoderConfiguration;
import com.zego.zegoavkit2.ZegoMediaPlayer;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioReverbMode;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioReverbParam;
import com.zego.zegoavkit2.mixstream.IZegoMixStreamExCallback;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamConfig;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamInfo;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamOutput;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamResultEx;
import com.zego.zegoavkit2.mixstream.ZegoMixStreamWatermark;
import com.zego.zegoavkit2.mixstream.ZegoStreamMixer;
import com.zego.zegoavkit2.soundlevel.ZegoSoundLevelInfo;
import com.zego.zegoliveroom.ZegoLiveRoom;
import com.zego.zegoliveroom.callback.IZegoAVEngineCallback;
import com.zego.zegoliveroom.callback.IZegoAudioRecordCallback2;
import com.zego.zegoliveroom.callback.IZegoInitSDKCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoLogHookCallback;
import com.zego.zegoliveroom.callback.IZegoUpdatePublishTargetCallback;
import com.zego.zegoliveroom.constants.ZegoAvConfig;
import com.zego.zegoliveroom.entity.ZegoAudioRecordConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.KotlinVersion;
import org.json.JSONException;
import org.json.JSONObject;
import p016OooOoO0.OooOo00;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
public class ZegoLiveRoomEngine implements ZegoRoomManagerCallback, ZegoRoomManagerLiveStatusCallback, IZegoAudioRecordCallback2, IZegoMixStreamExCallback, IZegoAVEngineCallback, IZegoAudioPlayerCallback {
    private static final String ASSETS_FILE_PREFIX = "/assets/";
    private static final float DEFAULT_DAMPING = 0.25f;
    private static final float DEFAULT_DRY_WET_RATIO = 0.0f;
    private static final float DEFAULT_REVERBERANC = 0.0f;
    private static final float DEFAULT_ROOM_SIZE = 0.0f;
    private static final int DEFAULT_RTC_DRY_WET_LEVEL = 0;
    private static final double DEFAULT_VOICE_CHANGE_VALUE = 0.0d;
    private static final double DEFAULT_VOICE_PITCH = 1.0d;
    private static final int ERROR_CODE = -1;
    private static final String LOCAL_VIEW_MIRROR_SETTING = "che.video.localViewMirrorSetting";
    private static final String LOCAL_VIEW_MIRROR_SETTING_PARAM_DISABLE_MIRROR = "disableMirror";
    private static final String LOCAL_VIEW_MIRROR_SETTING_PARAM_FORCE_MIRROR = "forceMirror";
    private static final float MAX_DAMPING = 2.0f;
    private static final float MAX_REVERBERANC = 0.5f;
    private static final float MAX_ROOM_SIZE = 1.0f;
    private static final int MAX_RTC_DRY_WET_LEVEL = 10;
    private static final int MAX_RTC_REVERBERANC = 200;
    private static final int MAX_RTC_ROOM_SIZE = 100;
    private static final double MAX_VOICE_CHANGE_VALUE = 8.0d;
    private static final double MAX_VOICE_PITCH = 2.0d;
    private static final float MIN_DAMPING = 0.0f;
    private static final float MIN_REVERBERANC = 0.0f;
    private static final float MIN_ROOM_SIZE = 0.0f;
    private static final int MIN_RTC_DRY_WET_LEVEL = -20;
    private static final int MIN_RTC_REVERBERANC = 0;
    private static final int MIN_RTC_ROOM_SIZE = 0;
    private static final double MIN_VOICE_CHANGE_VALUE = -8.0d;
    private static final double MIN_VOICE_PITCH = 0.5d;
    private static final int SUCCESS_CODE = 0;
    private static final String TAG = "ZegoLiveRoomEngine";
    private static final String ZEGO_WATERMARK_FILE_PREFIX = "file:";
    private static ZegoLiveRoomEngineDestroyCompletionCallback sDestroyCompletionCallback = null;
    private static String sFilePath = null;
    private static int sFileSizeInKBytes = 5120;
    private static ZegoLiveRoomEngine sInstance;
    private static int sLogFilter;
    private boolean isRecording;
    private Context mApplicationContext;
    private AudioManager mAudioManager;
    private int mAudioMixingCycleCount;
    private long mBroadcastTimestamp;
    private String mCurrentApiName;
    private int mCurrentAudioMixingRepeatCount;
    private Timer mDisconnectCallbackTimer;
    private IZegoLiveRoomEngineEventHandler mEngineEventHandler;
    private ZegoLiveRoom mLiveRoom;
    private ZegoLiveTranscoding mLiveTranscoding;
    private ZegoLiveRoomVideoCanvas mLocalCanvas;
    private long mLoginTimestamp;
    private ZegoMediaPlayer mMediaPlayer;
    private Set<Integer> mMixSeqs;
    private OrientationEventListener mOrientationEventListener;
    private String mPlayFilePath;
    private long mPreviewTimestamp;
    private ZegoRoomManager mRoomManager;
    private ZegoStreamMixer mStreamMixer;
    private final int AUDIO_MIXING_EVENT_START = 0;
    private final int AUDIO_MIXING_EVENT_STOP = 1;
    private final int AUDIO_MIXING_EVENT_FINISH = 2;
    private final int AUDIO_MIXING_EVENT_ERROR = 3;
    private final int AUDIO_MIXING_EVENT_PAUSE = 4;
    private final int AUDIO_MIXING_EVENT_RESUME = 5;
    private int mOrientationMode = 0;
    private int mOrientation = 0;
    private Handler mUIHandler = new Handler(Looper.getMainLooper());
    private boolean isAVEngineStart = false;
    private boolean isPauseAudioModule = false;
    private boolean isEnableCamera = true;
    private boolean isEnableMic = false;
    private boolean isMuteLocalAudioPublish = false;
    private int mAudioChannelCount = 1;
    private int mMediaPlayerPlayVolume = 100;
    private boolean isAudioMixingReplace = false;
    private int mCaptureVolume = 100;
    private int mAudioMixingState = 713;
    private float mDamping = 0.25f;
    private int mRtcDryLevel = 0;
    private int mRtcWetLevel = 0;
    private float mDryWetRatio = MAX_ROOM_SIZE;
    private float mRoomSize = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    private float mReverberance = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    public boolean enableANSModeAI = false;
    private Map<ZegoUser, ZegoLiveRoomVideoCanvas> mRemoteCanvas = new HashMap();
    private int mChannelProfile = 0;
    private int mAudioProfile = 0;
    private int mAudioScenario = 0;
    private int mRole = 2;
    private int mConnectionState = 1;
    private boolean mHasJoinedCurrentChannel = false;
    private int mCurrentCameraDevice = 1;

    private ZegoLiveRoomEngine(IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler) {
        this.mEngineEventHandler = iZegoLiveRoomEngineEventHandler;
        setVideoOrientationMode(this.mOrientationMode);
    }

    public static /* synthetic */ int access$1408(ZegoLiveRoomEngine zegoLiveRoomEngine) {
        int i = zegoLiveRoomEngine.mCurrentAudioMixingRepeatCount;
        zegoLiveRoomEngine.mCurrentAudioMixingRepeatCount = i + 1;
        return i;
    }

    private boolean addMixStreamTarget(String str) {
        if (this.mStreamMixer == null) {
            ZegoStreamMixer zegoStreamMixer = new ZegoStreamMixer();
            this.mStreamMixer = zegoStreamMixer;
            zegoStreamMixer.setMixStreamExCallback(this);
            this.mMixSeqs = new HashSet();
        }
        ZegoLiveTranscoding zegoLiveTranscoding = this.mLiveTranscoding;
        ZegoMixStreamConfig zegoMixStreamConfig = new ZegoMixStreamConfig();
        zegoMixStreamConfig.outputWidth = zegoLiveTranscoding.width;
        zegoMixStreamConfig.outputHeight = zegoLiveTranscoding.height;
        zegoMixStreamConfig.outputRateControlMode = 0;
        zegoMixStreamConfig.outputBitrate = zegoLiveTranscoding.videoBitrate * 1000;
        zegoMixStreamConfig.outputFps = zegoLiveTranscoding.videoFramerate;
        zegoMixStreamConfig.outputAudioBitrate = zegoLiveTranscoding.audioBitrate * 1000;
        zegoMixStreamConfig.channels = zegoLiveTranscoding.audioChannels;
        ZegoImage zegoImage = zegoLiveTranscoding.watermark;
        if (zegoImage != null && !TextUtils.isEmpty(zegoImage.url)) {
            ZegoMixStreamWatermark zegoMixStreamWatermark = new ZegoMixStreamWatermark();
            zegoMixStreamWatermark.image = zegoImage.url;
            int i = zegoImage.x;
            zegoMixStreamWatermark.left = i;
            int i2 = zegoImage.y;
            zegoMixStreamWatermark.top = i2;
            zegoMixStreamWatermark.right = i + zegoImage.width;
            zegoMixStreamWatermark.bottom = i2 + zegoImage.height;
            zegoMixStreamConfig.watermark = zegoMixStreamWatermark;
        }
        ZegoImage zegoImage2 = zegoLiveTranscoding.backgroundImage;
        if (zegoImage2 != null && !TextUtils.isEmpty(zegoImage2.url)) {
            zegoMixStreamConfig.outputBackgroundImage = zegoImage2.url;
        }
        zegoMixStreamConfig.outputBackgroundColor = convertRGB2RGBA(zegoLiveTranscoding.backgroundColor);
        ArrayList<ZegoLiveTranscoding.TranscodingUser> users = zegoLiveTranscoding.getUsers();
        Collections.sort(users, new Comparator<ZegoLiveTranscoding.TranscodingUser>() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.8
            @Override // java.util.Comparator
            public int compare(ZegoLiveTranscoding.TranscodingUser transcodingUser, ZegoLiveTranscoding.TranscodingUser transcodingUser2) {
                return transcodingUser.zOrder - transcodingUser2.zOrder;
            }
        });
        ArrayList arrayList = new ArrayList(zegoLiveTranscoding.getUserCount());
        for (ZegoLiveTranscoding.TranscodingUser transcodingUser : users) {
            String strStreamIDForUser = this.mRoomManager.streamIDForUser(ZegoUser.userWithUID(transcodingUser.uid));
            if (TextUtils.isEmpty(strStreamIDForUser)) {
                String str2 = TAG;
                StringBuilder sbOooO0O0 = OooO00o.OooO0O0("addMixStreamTarget no streamID find by uid: ");
                sbOooO0O0.append(transcodingUser.uid);
                ZLog.e(str2, sbOooO0O0.toString(), new Object[0]);
                return false;
            }
            ZegoMixStreamInfo zegoMixStreamInfo = new ZegoMixStreamInfo();
            zegoMixStreamInfo.streamID = strStreamIDForUser;
            int i3 = transcodingUser.x;
            zegoMixStreamInfo.left = i3;
            int i4 = transcodingUser.y;
            zegoMixStreamInfo.top = i4;
            zegoMixStreamInfo.right = i3 + transcodingUser.width;
            zegoMixStreamInfo.bottom = i4 + transcodingUser.height;
            arrayList.add(zegoMixStreamInfo);
        }
        zegoMixStreamConfig.inputStreamList = (ZegoMixStreamInfo[]) arrayList.toArray(new ZegoMixStreamInfo[0]);
        ZegoMixStreamOutput zegoMixStreamOutput = new ZegoMixStreamOutput();
        zegoMixStreamOutput.isUrl = true;
        zegoMixStreamOutput.target = str;
        zegoMixStreamConfig.outputList = new ZegoMixStreamOutput[]{zegoMixStreamOutput};
        int iMixStreamEx = this.mStreamMixer.mixStreamEx(zegoMixStreamConfig, str);
        ZLog.d(TAG, android.support.v4.media.OooO00o.OooO00o("addMixStreamTarget mixStreamEx result: ", iMixStreamEx), new Object[0]);
        boolean z = iMixStreamEx > 0;
        if (z) {
            this.mMixSeqs.add(Integer.valueOf(iMixStreamEx));
        }
        return z;
    }

    private boolean addPublishTarget(final String str) {
        ZegoRoomManager zegoRoomManager = this.mRoomManager;
        return this.mLiveRoom.addPublishTarget(str, zegoRoomManager.streamIDForUser(zegoRoomManager.getUserInfo()), new IZegoUpdatePublishTargetCallback() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.7
            @Override // com.zego.zegoliveroom.callback.IZegoUpdatePublishTargetCallback
            public void onUpdatePublishTargetState(int i, String str2) {
                ZLog.d(ZegoLiveRoomEngine.TAG, "addPublishTarget onUpdatePublishTargetState errorCode: %1$s, streamID: %2$s", Integer.valueOf(i), str2);
                ZegoLiveRoomEngine.this.callOnStreamPublished(str, i);
            }
        });
    }

    private void applyAudioProfile() {
        int i;
        int i2;
        int i3 = this.mAudioProfile;
        if (i3 == 0) {
            i3 = this.mChannelProfile == 0 ? 1 : 2;
        }
        if (i3 == 1) {
            i = 18000;
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    i = 56000;
                } else if (i3 == 4) {
                    i = 128000;
                } else if (i3 != 5) {
                    return;
                } else {
                    i = 192000;
                }
                i2 = 2;
                ZLog.d(TAG, "applyAudioProfile bitrate: %1$s, audioChannelCount: %2$s", Integer.valueOf(i), Integer.valueOf(i2));
                this.mLiveRoom.setAudioBitrate(i);
                setAudioChannelCount(i2);
            }
            i = 48000;
        }
        i2 = 1;
        ZLog.d(TAG, "applyAudioProfile bitrate: %1$s, audioChannelCount: %2$s", Integer.valueOf(i), Integer.valueOf(i2));
        this.mLiveRoom.setAudioBitrate(i);
        setAudioChannelCount(i2);
    }

    private void applyAudioScenario() {
        int i;
        boolean z;
        int i2 = this.mAudioScenario;
        int i3 = 4;
        if (i2 == 1) {
            i = 0;
            z = false;
        } else if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4 && i2 == 5) {
                    i = 4;
                    i3 = 3;
                }
                i = 0;
                z = false;
            } else {
                i = 4;
            }
            z = true;
        } else {
            i = 1;
            z = false;
        }
        ZLog.d(TAG, "applyAudioScenario enableVAD: %1$s, latencyMode: %2$s, trafficControlProperty: %3$s", Boolean.valueOf(z), Integer.valueOf(i3), Integer.valueOf(i));
        this.mLiveRoom.enableVAD(z);
        this.mLiveRoom.setLatencyMode(i3);
        this.mLiveRoom.enableTrafficControl(i, true);
    }

    private void applyChannelProfile() {
    }

    private void applyCommonConfig() {
        this.mLiveRoom.setAppOrientation(this.mOrientation);
        this.mLiveRoom.enableDTX(true);
        this.mLiveRoom.enableAEC(true);
        this.mLiveRoom.enableNoiseSuppress(true);
        this.mLiveRoom.setNoiseSuppressMode(2);
    }

    private void callOnApiCallExecuted(final String str, final int i) {
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.13
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onApiCallExecuted(i, str, null);
            }
        });
    }

    private void callOnAudioMixingFinished() {
        ZLog.d(TAG, "callOnAudioMixingFinished speakers: %1$s", this.mEngineEventHandler);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.30
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onAudioMixingFinished();
            }
        });
    }

    private void callOnAudioMixingStateChanged(final int i, final int i2) {
        ZLog.d(TAG, o00O00OO.OooO00o("callOnAudioMixingStateChanged state: ", i, ", errorCode: ", i2), new Object[0]);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.29
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onAudioMixingStateChanged(i, i2);
            }
        });
    }

    private void callOnAudioRecordCallback(byte[] bArr, int i, int i2, int i3) {
        ZLog.v(TAG, "callOnAudioRecordCallback sampleRate: %1$s, channelCount: %2$s, bitDepth: %3$s", new Object[0]);
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onAudioRecordCallback(bArr, i, i2, i3);
    }

    private void callOnAudioVolumeIndication(final IZegoLiveRoomEngineEventHandler.ZegoLiveRoomAudioVolumeInfo[] zegoLiveRoomAudioVolumeInfoArr) {
        ZLog.v(TAG, "callOnAudioVolumeIndication speakers: %1$s, mEngineEventHandler: %2$s", zegoLiveRoomAudioVolumeInfoArr, this.mEngineEventHandler);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.28
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onAudioVolumeIndication(zegoLiveRoomAudioVolumeInfoArr);
            }
        });
    }

    private void callOnClientRoleChanged(final int i, final int i2) {
        ZLog.d(TAG, "callOnClientRoleChanged oldRole: %1$s, newRole: %2$s mEngineEventHandler: %3$s", Integer.valueOf(i), Integer.valueOf(i2), this.mEngineEventHandler);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.22
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onClientRoleChanged(i, i2);
            }
        });
    }

    private void callOnConnectionBanned() {
        ZLog.d(TAG, "onConnectionBanned", new Object[0]);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.20
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onConnectionBanned();
            }
        });
    }

    private void callOnConnectionInterrupted() {
        ZLog.d(TAG, "callOnConnectionInterrupted", new Object[0]);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.18
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onConnectionInterrupted();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callOnConnectionLost() {
        ZLog.d(TAG, "callOnConnectionLost", new Object[0]);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.19
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onConnectionLost();
            }
        });
    }

    private void callOnConnectionStateChanged(final int i, final int i2) {
        ZLog.d(TAG, "callOnConnectionStateChanged state: %1$s, reason: %2$s, mEngineEventHandler: %3$s", Integer.valueOf(i), Integer.valueOf(i2), this.mEngineEventHandler);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.21
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onConnectionStateChanged(i, i2);
            }
        });
    }

    private void callOnError(final int i) {
        ZLog.d(TAG, "callOnError errorCode: %1$s, mEngineEventHandler: %2$s", Integer.valueOf(i), this.mEngineEventHandler);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.12
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onError(i);
            }
        });
    }

    private void callOnFirstLocalAudioFrame() {
        int loginElapsed = getLoginElapsed();
        ZLog.d(TAG, android.support.v4.media.OooO00o.OooO00o("callOnFirstLocalAudioFrame elapsed: ", loginElapsed), new Object[0]);
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onFirstLocalAudioFrame(loginElapsed);
    }

    private void callOnFirstLocalVideoFrame(int i, int i2) {
        int previewElapsed = this.mRoomManager.isPreview() ? getPreviewElapsed() : getLoginElapsed();
        ZLog.d(TAG, "callOnFirstLocalVideoFrame width: %1$s, height: %2$s elapsed: %3$s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(previewElapsed));
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onFirstLocalVideoFrame(i, i2, previewElapsed);
    }

    private void callOnFirstRemoteAudioDecoded(int i) {
        int loginElapsed = getLoginElapsed();
        ZLog.d(TAG, o00O00OO.OooO00o("callOnFirstRemoteAudioDecoded uid: ", i, ", elapsed: ", loginElapsed), new Object[0]);
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onFirstRemoteAudioDecoded(i, loginElapsed);
    }

    private void callOnFirstRemoteAudioFrame(int i) {
        int loginElapsed = getLoginElapsed();
        ZLog.d(TAG, o00O00OO.OooO00o("callOnFirstRemoteAudioFrame uid: ", i, ", elapsed: ", loginElapsed), new Object[0]);
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onFirstRemoteAudioFrame(i, loginElapsed);
    }

    private void callOnFirstRemoteVideoDecoded(int i, int i2, int i3) {
        int loginElapsed = getLoginElapsed();
        ZLog.d(TAG, "callOnFirstRemoteVideoDecoded uid: %1$s, width: %2$s, height: %3$s, elapsed: %4$s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(loginElapsed));
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onFirstRemoteVideoDecoded(i, i2, i3, loginElapsed);
    }

    private void callOnFirstRemoteVideoFrame(int i) {
        int loginElapsed = getLoginElapsed();
        ZLog.d(TAG, "callOnFirstRemoteVideoFrame uid: %1$s, elapsed: %2$s", Integer.valueOf(i), Integer.valueOf(loginElapsed));
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onFirstRemoteVideoFrame(i, loginElapsed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callOnJoinChannel(final String str, final long j) {
        final int loginElapsed = getLoginElapsed();
        ZLog.d(TAG, "callOnJoinChannel channel: %1$s, uid: %2$s, elapsed: %3$s", str, Long.valueOf(j), Integer.valueOf(loginElapsed));
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.15
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onJoinChannelSuccess(str, j, loginElapsed);
            }
        });
    }

    private void callOnLeaveChannel() {
        ZLog.d(TAG, "callOnLeaveChannel mEngineEventHandler: %1$s", this.mEngineEventHandler);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.17
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onLeaveChannel();
            }
        });
    }

    private void callOnLocalVideoStateChanged(final int i, final int i2) {
        ZLog.d(TAG, "callOnLocalVideoStateChanged state: %1$s, errorCode: %2$s", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.26
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onLocalVideoStateChanged(i, i2);
            }
        });
    }

    private void callOnLocalVideoStats(IZegoLiveRoomEngineEventHandler.ZegoLiveRoomLocalVideoStats zegoLiveRoomLocalVideoStats) {
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onLocalVideoStats(zegoLiveRoomLocalVideoStats);
    }

    private void callOnNetworkQuality(int i, int i2) {
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onNetworkQuality(i, i2);
    }

    private void callOnReJoinChannel(final String str, final int i) {
        final int loginElapsed = getLoginElapsed();
        ZLog.d(TAG, "callOnReJoinChannel channel: %1$s, uid: %2$s, elapsed: %3$s", str, Integer.valueOf(i), Integer.valueOf(loginElapsed));
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.16
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onReJoinChannel(str, i, loginElapsed);
            }
        });
    }

    private void callOnRemoteVideoStateChanged(final int i, final int i2) {
        ZLog.d(TAG, "callOnRemoteVideoStateChanged uid: %1$s, state: %2$s mEngineEventHandler: %3$s", Integer.valueOf(i), Integer.valueOf(i2), this.mEngineEventHandler);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.27
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onRemoteVideoStateChanged(i, i2);
            }
        });
    }

    private void callOnRemoteVideoStats(IZegoLiveRoomEngineEventHandler.ZegoLiveRoomRemoteVideoStats zegoLiveRoomRemoteVideoStats) {
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onRemoteVideoStats(zegoLiveRoomRemoteVideoStats);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callOnStreamPublished(String str, int i) {
        ZLog.d(TAG, "callOnStreamPublished url: " + str + ", error: " + i, new Object[0]);
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onStreamPublished(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callOnStreamUnpublished(String str, int i) {
        ZLog.d(TAG, "callOnStreamUnpublished url: " + str + ", error: " + i, new Object[0]);
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onStreamUnpublished(str, i);
    }

    private void callOnUserJoined(final int i, final int i2) {
        ZLog.d(TAG, "callOnUserJoined uid: %1$s, elapsed: %2$s, mEngineEventHandler: %3$s", Integer.valueOf(i), Integer.valueOf(i2), this.mEngineEventHandler);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.23
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onUserJoined(i, i2);
            }
        });
    }

    private void callOnUserMuteAudio(int i, boolean z) {
        ZLog.d(TAG, "callOnUserMuteAudio uid: %1$s, muted: %2$s", Integer.valueOf(i), Boolean.valueOf(z));
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onUserMuteAudio(i, z);
    }

    private void callOnUserMuteVideo(int i, boolean z) {
        ZLog.d(TAG, "callOnUserMuteVideo uid: %1$s, muted: %2$s", Integer.valueOf(i), Boolean.valueOf(z));
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onUserMuteVideo(i, z);
    }

    private void callOnUserOffline(final int i) {
        ZLog.d(TAG, "callOnUserOffline uid: %1$s, mEngineEventHandler: %2$s", Integer.valueOf(i), this.mEngineEventHandler);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.24
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onUserOffline(i);
            }
        });
    }

    private void callOnVideoSizeChanged(final int i, final int i2, final int i3) {
        ZLog.d(TAG, "callOnVideoSizeChanged uid: %1$s, width: %2$s, height: %3$s mEngineEventHandler: %4$s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), this.mEngineEventHandler);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.25
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onVideoSizeChanged(i, i2, i3);
            }
        });
    }

    private void callOnWarning(final int i) {
        ZLog.d(TAG, android.support.v4.media.OooO00o.OooO00o("callOnWarning warningCode: ", i), new Object[0]);
        if (this.mEngineEventHandler == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.11
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onWarning(i);
            }
        });
    }

    private void configBeforeJoinChannel() {
        applyCommonConfig();
        applyChannelProfile();
        applyAudioProfile();
        applyAudioScenario();
    }

    private int convertRGB2RGBA(int i) {
        return (((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) << 24) + (((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) << 16) + ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 8);
    }

    private float convertToVoiceChangeValue(double d) {
        double d2 = d - DEFAULT_VOICE_PITCH;
        return (float) (d2 > DEFAULT_VOICE_CHANGE_VALUE ? (d2 / DEFAULT_VOICE_PITCH) * MAX_VOICE_CHANGE_VALUE : (d2 / (-0.5d)) * MIN_VOICE_CHANGE_VALUE);
    }

    public static synchronized ZegoLiveRoomEngine create(Context context, long j, byte[] bArr, boolean z, IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler) {
        ZLog.i(TAG, "create sInstance: %1$s, appID: %2$s, appSign: %3$s, handler: %4$s", context, Long.valueOf(j), bArr, iZegoLiveRoomEngineEventHandler);
        if (sDestroyCompletionCallback != null) {
            sInstance.mLiveRoom.unInitSDK();
            sInstance.mLiveRoom = null;
            sInstance = null;
            sDestroyCompletionCallback = null;
        }
        if (sInstance == null) {
            ZegoLiveRoomEngine zegoLiveRoomEngine = new ZegoLiveRoomEngine(iZegoLiveRoomEngineEventHandler);
            sInstance = zegoLiveRoomEngine;
            zegoLiveRoomEngine.setup(context, j, bArr, z);
        }
        return sInstance;
    }

    private float dbToAmplitude(int i) {
        return (float) Math.pow(10.0d, i / 20.0f);
    }

    public static synchronized void destroy(@Nullable final ZegoLiveRoomEngineDestroyCompletionCallback zegoLiveRoomEngineDestroyCompletionCallback) {
        ZegoLiveRoomEngine zegoLiveRoomEngine = sInstance;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.mUIHandler.removeCallbacksAndMessages(null);
            ZegoLiveRoomEngine zegoLiveRoomEngine2 = sInstance;
            zegoLiveRoomEngine2.mEngineEventHandler = null;
            zegoLiveRoomEngine2.destroyAudioEffectManager();
            OrientationEventListener orientationEventListener = sInstance.mOrientationEventListener;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
            }
            sInstance.leaveChannel();
            ZegoMediaPlayer zegoMediaPlayer = sInstance.mMediaPlayer;
            if (zegoMediaPlayer != null) {
                zegoMediaPlayer.setEventWithIndexCallback(null);
                sInstance.mMediaPlayer.uninit();
                sInstance.mMediaPlayer = null;
            }
            ZegoRoomManager zegoRoomManager = sInstance.mRoomManager;
            if (zegoRoomManager != null) {
                zegoRoomManager.release();
                sInstance.mRoomManager = null;
            }
            ZegoLiveRoomEngine zegoLiveRoomEngine3 = sInstance;
            if (!zegoLiveRoomEngine3.isAVEngineStart || zegoLiveRoomEngineDestroyCompletionCallback == null) {
                ZegoLiveRoom zegoLiveRoom = zegoLiveRoomEngine3.mLiveRoom;
                if (zegoLiveRoom != null) {
                    zegoLiveRoom.unInitSDK();
                    sInstance.mLiveRoom = null;
                }
                sInstance = null;
                if (zegoLiveRoomEngineDestroyCompletionCallback != null) {
                    zegoLiveRoomEngineDestroyCompletionCallback.onDestroyCompletion();
                }
            } else {
                sDestroyCompletionCallback = new ZegoLiveRoomEngineDestroyCompletionCallback() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.1
                    @Override // com.zego.wrapper.callback.ZegoLiveRoomEngineDestroyCompletionCallback
                    public void onDestroyCompletion() {
                        if (ZegoLiveRoomEngine.sInstance.mLiveRoom != null) {
                            ZegoLiveRoomEngine.sInstance.mLiveRoom.unInitSDK();
                            ZegoLiveRoomEngine.sInstance.mLiveRoom = null;
                        }
                        ZegoLiveRoomEngine unused = ZegoLiveRoomEngine.sInstance = null;
                        zegoLiveRoomEngineDestroyCompletionCallback.onDestroyCompletion();
                        ZegoLiveRoomEngineDestroyCompletionCallback unused2 = ZegoLiveRoomEngine.sDestroyCompletionCallback = null;
                    }
                };
            }
        } else if (zegoLiveRoomEngineDestroyCompletionCallback != null) {
            zegoLiveRoomEngineDestroyCompletionCallback.onDestroyCompletion();
        }
    }

    private void destroyAudioEffectManager() {
        ZegoAudioEffectManager.destroy();
    }

    private void enableANS(boolean z) {
        ZLog.d(TAG, "enableANS: " + z, new Object[0]);
        this.mLiveRoom.enableNoiseSuppress(z);
    }

    private int getBroadcastElapsed() {
        return (int) (System.currentTimeMillis() - this.mBroadcastTimestamp);
    }

    private int getLoginElapsed() {
        return (int) (System.currentTimeMillis() - this.mLoginTimestamp);
    }

    private int getPreviewElapsed() {
        return (int) (System.currentTimeMillis() - this.mPreviewTimestamp);
    }

    public static String getSdkVersion() {
        ZLog.i(TAG, "getSdkVersion", new Object[0]);
        return ZegoLiveRoom.version();
    }

    private static int getZegoVolumeByLinearValue(int i) {
        float f;
        float f2;
        if (i == 0) {
            return 0;
        }
        float fLog10 = ((float) Math.log10(i / 100.0f)) * 20.0f;
        if (fLog10 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (fLog10 > -15.0f) {
                f2 = 30.0f;
            } else {
                f = fLog10 > -27.0f ? (fLog10 + 35.0f) / 40.0f : (fLog10 + 40.0f) / 65.0f;
            }
            return (int) (f * 100.0f);
        }
        f2 = 12.0f;
        f = (fLog10 / f2) + MAX_ROOM_SIZE;
        return (int) (f * 100.0f);
    }

    private void initRoomStatus() {
        if (!this.isEnableMic) {
            this.mLiveRoom.enableMic(true);
            this.isEnableMic = true;
        }
        if (this.isMuteLocalAudioPublish) {
            this.mLiveRoom.muteAudioPublish(false);
            this.isMuteLocalAudioPublish = false;
        }
    }

    private boolean isValidOrientation(int i) {
        int i2 = this.mOrientationMode;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i != 2) {
                    return true;
                }
            } else if (i == 0) {
                return true;
            }
        } else if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    private boolean localViewMirror(String str) {
        Objects.requireNonNull(str);
        if (str.equals(LOCAL_VIEW_MIRROR_SETTING_PARAM_DISABLE_MIRROR)) {
            this.mLiveRoom.enablePreviewMirror(false);
            return true;
        }
        if (!str.equals(LOCAL_VIEW_MIRROR_SETTING_PARAM_FORCE_MIRROR)) {
            return false;
        }
        this.mLiveRoom.enablePreviewMirror(true);
        return true;
    }

    private void onErrorOccur(String str, int i) {
        ZLog.d(TAG, "onErrorOccur api: %1$s errorCode: %2$s", str, Integer.valueOf(i));
        callOnError(i);
        callOnApiCallExecuted(str, i);
    }

    private void recordBroadcastTimestamp() {
        this.mBroadcastTimestamp = System.currentTimeMillis();
    }

    private void recordLoginTimestamp() {
        this.mLoginTimestamp = System.currentTimeMillis();
    }

    private void recordPreviewTimestamp() {
        this.mPreviewTimestamp = System.currentTimeMillis();
    }

    private boolean removeMixStreamTarget(String str) {
        if (this.mStreamMixer == null) {
            ZegoStreamMixer zegoStreamMixer = new ZegoStreamMixer();
            this.mStreamMixer = zegoStreamMixer;
            zegoStreamMixer.setMixStreamExCallback(this);
            this.mMixSeqs = new HashSet();
        }
        ZegoMixStreamConfig zegoMixStreamConfig = new ZegoMixStreamConfig();
        ZegoMixStreamOutput zegoMixStreamOutput = new ZegoMixStreamOutput();
        zegoMixStreamOutput.isUrl = true;
        zegoMixStreamOutput.target = str;
        zegoMixStreamConfig.outputList = new ZegoMixStreamOutput[]{zegoMixStreamOutput};
        zegoMixStreamConfig.inputStreamList = new ZegoMixStreamInfo[0];
        return this.mStreamMixer.mixStreamEx(zegoMixStreamConfig, str) > 0;
    }

    private boolean removePublishTarget(final String str) {
        ZegoRoomManager zegoRoomManager = this.mRoomManager;
        return this.mLiveRoom.deletePublishTarget(str, zegoRoomManager.streamIDForUser(zegoRoomManager.getUserInfo()), new IZegoUpdatePublishTargetCallback() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.9
            @Override // com.zego.zegoliveroom.callback.IZegoUpdatePublishTargetCallback
            public void onUpdatePublishTargetState(int i, String str2) {
                ZLog.d(ZegoLiveRoomEngine.TAG, "removePublishTarget onUpdatePublishTargetState errorCode: %1$s, streamID: %2$s", Integer.valueOf(i), str2);
                ZegoLiveRoomEngine.this.callOnStreamUnpublished(str, i != 0 ? 1 : 0);
            }
        });
    }

    private void reset() {
        this.mHasJoinedCurrentChannel = false;
        stopDisconnectCallbackTimerIfNeeded();
        Set<Integer> set = this.mMixSeqs;
        if (set != null) {
            set.clear();
        }
        this.mRemoteCanvas.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAudioMixingFlags() {
        this.mPlayFilePath = null;
        this.isAudioMixingReplace = false;
        this.mAudioMixingCycleCount = 0;
        this.mCurrentAudioMixingRepeatCount = 0;
    }

    private void setAudioChannelCount(int i) {
        this.mAudioChannelCount = i;
        this.mLiveRoom.setAudioChannelCount(i);
    }

    private void setCurrentApiName(String str) {
        this.mCurrentApiName = str;
    }

    private void setDamping(float f) {
        if (f > MAX_DAMPING) {
            f = MAX_DAMPING;
        } else if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        this.mDamping = f;
    }

    private void setDryWetRatio() {
        this.mDryWetRatio = dbToAmplitude(this.mRtcDryLevel) / dbToAmplitude(this.mRtcWetLevel);
    }

    public static int setLogFile(String str) {
        ZLog.i(TAG, OooOo00.OooO00o("setLogFile filePath: ", str), new Object[0]);
        ZegoLiveRoomEngine zegoLiveRoomEngine = sInstance;
        if (zegoLiveRoomEngine == null) {
            sFilePath = str;
            return 0;
        }
        zegoLiveRoomEngine.setCurrentApiName("setLogFile");
        sInstance.onErrorOccur(ZegoLiveRoomConstants.ErrorCode.SDK_SHOULD_NOT_READY);
        return -20001;
    }

    public static int setLogFileSize(int i) {
        String str = TAG;
        ZLog.i(str, android.support.v4.media.OooO00o.OooO00o("setLogFileSize fileSizeInKBytes: ", i), new Object[0]);
        ZegoLiveRoomEngine zegoLiveRoomEngine = sInstance;
        if (zegoLiveRoomEngine != null) {
            zegoLiveRoomEngine.setCurrentApiName("setLogFileSize");
            sInstance.onErrorOccur(ZegoLiveRoomConstants.ErrorCode.SDK_SHOULD_NOT_READY);
            return -20001;
        }
        if (i == 0 || (i >= 5120 && i <= 102400)) {
            sFileSizeInKBytes = i;
            return 0;
        }
        ZLog.e(str, "setLogFileSize invalidSize", new Object[0]);
        return -2;
    }

    public static int setLogFilter(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("setLogFilter filter: ", i), new Object[0]);
        ZegoLiveRoomEngine zegoLiveRoomEngine = sInstance;
        if (zegoLiveRoomEngine == null) {
            sLogFilter = i;
            return 0;
        }
        zegoLiveRoomEngine.setCurrentApiName("setLogFilter");
        sInstance.onErrorOccur(ZegoLiveRoomConstants.ErrorCode.SDK_SHOULD_NOT_READY);
        return -20001;
    }

    private void setReverbParam() {
        ZegoAudioReverbParam zegoAudioReverbParam = new ZegoAudioReverbParam();
        zegoAudioReverbParam.roomSize = this.mRoomSize;
        zegoAudioReverbParam.reverberance = this.mReverberance;
        zegoAudioReverbParam.damping = 0.25f;
        zegoAudioReverbParam.dryWetRatio = this.mDryWetRatio;
        ZegoAudioProcessing.setReverbParam(zegoAudioReverbParam);
    }

    private void setReverberance(int i) {
        if (i > 200) {
            i = 200;
        } else if (i < 0) {
            i = 0;
        }
        this.mReverberance = i / 400.0f;
    }

    private void setRoomSize(int i) {
        if (i > 100) {
            i = 100;
        } else if (i < 0) {
            i = 0;
        }
        this.mRoomSize = i / 100.0f;
    }

    private void setRtcDryLevel(int i) {
        if (i > 10) {
            i = 10;
        } else if (i < MIN_RTC_DRY_WET_LEVEL) {
            i = MIN_RTC_DRY_WET_LEVEL;
        }
        this.mRtcDryLevel = i;
        setDryWetRatio();
    }

    private void setRtcWetLevel(int i) {
        if (i > 10) {
            i = 10;
        } else if (i < MIN_RTC_DRY_WET_LEVEL) {
            i = MIN_RTC_DRY_WET_LEVEL;
        }
        this.mRtcWetLevel = i;
        setDryWetRatio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoOrientation(int i) {
        if (isValidOrientation(i) && i != this.mOrientation) {
            this.mOrientation = i;
            this.mLiveRoom.setAppOrientation(i);
        }
    }

    private void setVideoOrientationMode(int i) {
        if (this.mOrientationMode == i) {
            return;
        }
        this.mOrientationMode = i;
        if (isValidOrientation(this.mOrientation)) {
            return;
        }
        setVideoOrientation(i == 1 ? 3 : 0);
    }

    private void setup(Context context, long j, byte[] bArr, boolean z) {
        setupLiveRoom(context, j, bArr, z);
        setupDefaultConfig();
        setupRoomManager();
        setupAudioManager(context);
        setupLogManager(context);
        setupOrientationListener(context);
    }

    private void setupAudioManager(Context context) {
        this.mAudioManager = (AudioManager) context.getSystemService("audio");
    }

    private void setupDefaultConfig() {
        this.mLiveRoom.setLoopbackVolume(100);
        this.mLiveRoom.enableCamera(false);
        this.mLiveRoom.enableMic(false);
        this.mLiveRoom.muteAudioPublish(false);
        this.mLiveRoom.muteVideoPublish(false);
    }

    private void setupLiveRoom(final Context context, long j, byte[] bArr, boolean z) {
        this.mApplicationContext = context.getApplicationContext();
        int sDKContext = ZegoLiveRoom.setSDKContext(new ZegoLiveRoom.SDKContextEx() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.3
            @Override // com.zego.zegoliveroom.ZegoLiveRoom.SDKContext
            @NonNull
            public Application getAppContext() {
                return (Application) context.getApplicationContext();
            }

            @Override // com.zego.zegoliveroom.ZegoLiveRoom.SDKContextEx
            public long getLogFileSize() {
                return ZegoLiveRoomEngine.sFileSizeInKBytes;
            }

            @Override // com.zego.zegoliveroom.ZegoLiveRoom.SDKContextEx
            public IZegoLogHookCallback getLogHookCallback() {
                return null;
            }

            @Override // com.zego.zegoliveroom.ZegoLiveRoom.SDKContext
            @Nullable
            public String getLogPath() {
                return ZegoLiveRoomEngine.sFilePath;
            }

            @Override // com.zego.zegoliveroom.ZegoLiveRoom.SDKContext
            @Nullable
            public String getSoFullPath() {
                return null;
            }

            @Override // com.zego.zegoliveroom.ZegoLiveRoom.SDKContextEx
            public String getSubLogFolder() {
                return null;
            }
        });
        ZegoLiveRoom.setTestEnv(z);
        if (sDKContext < 0) {
            callOnError(3);
            ZLog.d(TAG, android.support.v4.media.OooO00o.OooO00o("setSDKContext errorCode: ", sDKContext), new Object[0]);
            return;
        }
        ZegoLiveRoom zegoLiveRoom = new ZegoLiveRoom();
        this.mLiveRoom = zegoLiveRoom;
        zegoLiveRoom.setZegoAVEngineCallback(this);
        if (this.mLiveRoom.initSDK(j, bArr, new IZegoInitSDKCompletionCallback() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.4
            @Override // com.zego.zegoliveroom.callback.IZegoInitSDKCompletionCallback
            public void onInitSDK(int i) {
                if (i == 0) {
                    ZLog.d(ZegoLiveRoomEngine.TAG, android.support.v4.media.OooO00o.OooO00o("onInitSDK errorCode: ", i), new Object[0]);
                } else {
                    ZLog.e(ZegoLiveRoomEngine.TAG, android.support.v4.media.OooO00o.OooO00o("onInitSDK errorCode: ", i), new Object[0]);
                }
            }
        })) {
            this.mLiveRoom.enableAECWhenHeadsetDetected(true);
        } else {
            callOnError(3);
            ZLog.d(TAG, "initSDK ret: false", new Object[0]);
        }
    }

    private void setupLocalVideoInner(ZegoLiveRoomVideoCanvas zegoLiveRoomVideoCanvas) {
        this.mRoomManager.setLiveVideoView(zegoLiveRoomVideoCanvas.view, zegoLiveRoomVideoCanvas.renderMode, null);
    }

    private void setupLogManager(Context context) {
        int i = sLogFilter != 0 ? 3 : 2;
        ZegoLogManager.getInstance().setLogLevelLogcat(sLogFilter);
        ZegoLogManager.getInstance().startTrace(context, i);
    }

    private void setupOrientationListener(Context context) {
        OrientationEventListener orientationEventListener = new OrientationEventListener(context, 3) { // from class: com.zego.wrapper.ZegoLiveRoomEngine.2
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i) {
                int i2;
                if (i == -1) {
                    return;
                }
                if (i > 335 || i < 30) {
                    i2 = 0;
                } else if (i > 65 && i < 120) {
                    i2 = 3;
                } else if (i > 155 && i < 210) {
                    i2 = 2;
                } else if (i <= 245 || i >= 300) {
                    return;
                } else {
                    i2 = 1;
                }
                ZegoLiveRoomEngine.this.setVideoOrientation(i2);
            }
        };
        this.mOrientationEventListener = orientationEventListener;
        if (orientationEventListener.canDetectOrientation()) {
            this.mOrientationEventListener.enable();
        } else {
            this.mOrientationEventListener.disable();
        }
    }

    private void setupRemoteVideoInner(ZegoUser zegoUser, ZegoLiveRoomVideoCanvas zegoLiveRoomVideoCanvas) {
        this.mRemoteCanvas.put(zegoUser, zegoLiveRoomVideoCanvas);
        this.mRoomManager.setLiveVideoView(zegoLiveRoomVideoCanvas.view, zegoLiveRoomVideoCanvas.renderMode, zegoUser);
    }

    private void setupRoomManager() {
        ZLog.d(TAG, "setupRoomManager", new Object[0]);
        ZegoRoomManager zegoRoomManagerManagerWithLiveRoom = ZegoRoomManager.managerWithLiveRoom(this.mLiveRoom, false);
        this.mRoomManager = zegoRoomManagerManagerWithLiveRoom;
        zegoRoomManagerManagerWithLiveRoom.setAutoReconnectRoom(true);
        this.mRoomManager.setReconnectTimeoutSec(1200);
        this.mRoomManager.addManagerCallback(this);
        this.mRoomManager.addLiveStatusCallback(this);
    }

    private void startDisconnectCallbackTimerIfNeeded() {
        String str = TAG;
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("startDisconnectCallbackTimerIfNeeded mDisconnectCallbackTimer: ");
        sbOooO0O0.append(this.mDisconnectCallbackTimer);
        ZLog.d(str, sbOooO0O0.toString(), new Object[0]);
        if (this.mDisconnectCallbackTimer != null) {
            return;
        }
        Timer timer = new Timer();
        this.mDisconnectCallbackTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.10
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.callOnConnectionLost();
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLiveIfNeed() {
        boolean z = true;
        if (!this.mRoomManager.isLogin() || (this.mChannelProfile == 1 && this.mRole == 2)) {
            z = false;
        }
        if (z) {
            this.mRoomManager.startLive();
        }
    }

    private void stopDisconnectCallbackTimerIfNeeded() {
        String str = TAG;
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("stopDisconnectCallbackTimerIfNeeded mDisconnectCallbackTimer: ");
        sbOooO0O0.append(this.mDisconnectCallbackTimer);
        ZLog.d(str, sbOooO0O0.toString(), new Object[0]);
        Timer timer = this.mDisconnectCallbackTimer;
        if (timer != null) {
            timer.cancel();
            this.mDisconnectCallbackTimer = null;
        }
    }

    private void stopLiveIfNeed() {
        if (this.mChannelProfile == 1 && this.mRole == 2) {
            this.mRoomManager.stopLive();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x006f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    public void updateAudioMixingStateWithReason(int i, int i2) {
        String str = TAG;
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("updateAudioMixingStateWithReason mAudioMixingState: ");
        sbOooO0O0.append(this.mAudioMixingState);
        sbOooO0O0.append(", audioMixingEvent: ");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", errorCode: ");
        sbOooO0O0.append(i2);
        ZLog.d(str, sbOooO0O0.toString(), new Object[0]);
        int i3 = this.mAudioMixingState;
        switch (i3) {
            case 710:
                if (i == 1 || i == 2) {
                    i3 = 713;
                } else if (i == 3) {
                    i3 = 714;
                } else if (i == 4) {
                    i3 = 711;
                } else {
                    StringBuilder sbOooO0O1 = OooO00o.OooO0O0("updateAudioMixingStateWithReason status error!! mAudioMixingState = ");
                    sbOooO0O1.append(this.mAudioMixingState);
                    sbOooO0O1.append(" audioMixingEvent = ");
                    sbOooO0O1.append(i);
                    ZLog.w(str, sbOooO0O1.toString(), new Object[0]);
                }
                break;
            case 711:
                if (i == 1) {
                    i3 = 713;
                } else if (i == 3) {
                    i3 = 714;
                } else if (i == 5) {
                    i3 = 710;
                } else {
                    StringBuilder sbOooO0O2 = OooO00o.OooO0O0("updateAudioMixingStateWithReason status error!! mAudioMixingState = ");
                    sbOooO0O2.append(this.mAudioMixingState);
                    sbOooO0O2.append(" audioMixingEvent = ");
                    sbOooO0O2.append(i);
                    ZLog.w(str, sbOooO0O2.toString(), new Object[0]);
                }
                break;
            case 713:
            case 714:
                if (i == 0) {
                    i3 = 710;
                } else {
                    StringBuilder sbOooO0O3 = OooO00o.OooO0O0("updateAudioMixingStateWithReason status error!! mAudioMixingState = ");
                    sbOooO0O3.append(this.mAudioMixingState);
                    sbOooO0O3.append(" audioMixingEvent = ");
                    sbOooO0O3.append(i);
                    ZLog.w(str, sbOooO0O3.toString(), new Object[0]);
                }
                break;
        }
        ZLog.d(str, o00O00OO.OooO00o("updateAudioMixingStateWithReason update audioMixingState: ", i3, ", audioMixingEvent: ", i), new Object[0]);
        if (i == 2) {
            callOnAudioMixingFinished();
        }
        if (i3 != this.mAudioMixingState) {
            this.mAudioMixingState = i3;
            callOnAudioMixingStateChanged(i3, i2);
        }
        if (i2 != 0) {
            callOnWarning(701);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    private void updateConnectionStateWithReason(int i) {
        int i2 = this.mConnectionState;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                if (this.mHasJoinedCurrentChannel) {
                    callOnReJoinChannel(this.mRoomManager.getCurrentRoomID(), this.mRoomManager.getUid());
                } else {
                    this.mHasJoinedCurrentChannel = true;
                }
                i2 = 3;
            } else if (i == 2) {
                i2 = 4;
            } else if (i == 3 || i == 4) {
                i2 = 5;
            } else if (i == 5) {
                i2 = 1;
            }
        } else if (this.mHasJoinedCurrentChannel) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        if (this.mConnectionState != i2) {
            this.mConnectionState = i2;
            callOnConnectionStateChanged(i2, i);
            if (this.mConnectionState == 4) {
                callOnConnectionInterrupted();
            }
            if (i == 3) {
                callOnConnectionBanned();
            }
            int i3 = this.mConnectionState;
            if (i3 != 2 && i3 != 4) {
                z = false;
            }
            if (z) {
                startDisconnectCallbackTimerIfNeeded();
            } else {
                stopDisconnectCallbackTimerIfNeeded();
            }
        }
    }

    public int addPublishStreamUrl(String str, boolean z) {
        ZegoLiveTranscoding zegoLiveTranscoding;
        ZLog.i(TAG, "addPublishStreamUrl url: %1$s, transcodingEnabled: %2$s", str, Boolean.valueOf(z));
        setCurrentApiName("addPublishStreamUrl");
        if (this.mChannelProfile != 1 || this.mConnectionState != 3) {
            onErrorOccur(4);
            return -4;
        }
        if (TextUtils.isEmpty(str)) {
            onErrorOccur(2);
            return -2;
        }
        if (z && ((zegoLiveTranscoding = this.mLiveTranscoding) == null || !zegoLiveTranscoding.isValid())) {
            onErrorOccur(4);
            return -4;
        }
        if (z ? addMixStreamTarget(str) : addPublishTarget(str)) {
            callOnApiCallExecuted(0);
            return 0;
        }
        onErrorOccur(1);
        return -1;
    }

    public int addVideoWatermark(ZegoImage zegoImage) {
        ZLog.i(TAG, "addVideoWatermark watermark: " + zegoImage, new Object[0]);
        setCurrentApiName("addVideoWatermark");
        if (zegoImage == null || TextUtils.isEmpty(zegoImage.url)) {
            onErrorOccur(2);
            return -2;
        }
        String str = zegoImage.url;
        if (!str.toLowerCase().endsWith(".png") || !new File(str).canRead()) {
            onErrorOccur(2);
            return -2;
        }
        String strOooO00o = OooOo00.OooO00o(ZEGO_WATERMARK_FILE_PREFIX, str);
        int i = zegoImage.x;
        int i2 = zegoImage.y;
        Rect rect = new Rect(i, i2, zegoImage.width + i, zegoImage.height + i2);
        ZegoLiveRoom.setWaterMarkImagePath(strOooO00o);
        ZegoLiveRoom.setPreviewWaterMarkRect(rect);
        ZegoLiveRoom.setPublishWaterMarkRect(rect);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int adjustAudioMixingVolume(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("adjustAudioMixingVolume volume: ", i), new Object[0]);
        setCurrentApiName("adjustAudioMixingVolume");
        if (i > 200) {
            i = 200;
        } else if (i < 0) {
            i = 0;
        }
        this.mMediaPlayerPlayVolume = i;
        ZegoMediaPlayer zegoMediaPlayer = this.mMediaPlayer;
        if (zegoMediaPlayer != null) {
            zegoMediaPlayer.setVolume(getZegoVolumeByLinearValue(i));
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public int adjustPlaybackSignalVolume(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("adjustPlaybackSignalVolume volume: ", i), new Object[0]);
        setCurrentApiName("adjustPlaybackSignalVolume");
        if (i > 100) {
            i = 100;
        } else if (i < 0) {
            i = 0;
        }
        this.mLiveRoom.setPlayVolume(i);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int adjustRecordingSignalVolume(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("adjustRecordingSignalVolume volume: ", i), new Object[0]);
        setCurrentApiName("adjustRecordingSignalVolume");
        if (i > 100) {
            i = 100;
        } else if (i < 0) {
            i = 0;
        }
        this.mLiveRoom.setCaptureVolume(i);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int clearVideoWatermarks() {
        ZLog.i(TAG, "clearVideoWatermarks", new Object[0]);
        setCurrentApiName("clearVideoWatermarks");
        Rect rect = new Rect(-1, -1, -1, -1);
        ZegoLiveRoom.setPreviewWaterMarkRect(rect);
        ZegoLiveRoom.setPublishWaterMarkRect(rect);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int disableAudio() {
        ZLog.i(TAG, "disableAudio", new Object[0]);
        setCurrentApiName("disableAudio");
        if (!this.isPauseAudioModule) {
            this.mLiveRoom.pauseModule(12);
            this.isPauseAudioModule = true;
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public int disableVideo() {
        ZLog.i(TAG, "disableVideo", new Object[0]);
        setCurrentApiName("disableVideo");
        if (this.isEnableCamera) {
            this.mLiveRoom.enableCamera(false);
            this.isEnableCamera = false;
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public void enableANSModeAI(boolean z) {
        ZLog.d(TAG, "enableANSModeAI: " + z, new Object[0]);
        if (z) {
            enableANS(true);
            this.mLiveRoom.setNoiseSuppressMode(3);
        } else if (this.mAudioScenario != 3) {
            enableANS(false);
        } else {
            enableANS(true);
            this.mLiveRoom.setNoiseSuppressMode(1);
        }
    }

    public int enableAudio() {
        ZLog.i(TAG, "enableAudio", new Object[0]);
        setCurrentApiName("enableAudio");
        if (this.isPauseAudioModule) {
            this.mLiveRoom.resumeModule(12);
            this.isPauseAudioModule = false;
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public int enableAudioVolumeIndication(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("enableAudioVolumeIndication interval: ", i), new Object[0]);
        setCurrentApiName("enableAudioVolumeIndication");
        boolean z = i > 0;
        this.mRoomManager.setSoundLevelMonitor(z);
        if (z) {
            this.mRoomManager.setSoundLevelMonitorCycle(i);
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public int enableInEarMonitoring(boolean z) {
        ZLog.i(TAG, "enableInEarMonitoring enabled: " + z, new Object[0]);
        setCurrentApiName("enableInEarMonitoring");
        this.mLiveRoom.enableLoopback(z);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int enableLocalAudio(boolean z) {
        ZLog.i(TAG, "enableLocalAudio enabled: " + z + ", isEnableMic: " + this.isEnableMic, new Object[0]);
        setCurrentApiName("enableLocalAudio");
        if (this.isEnableMic != z) {
            this.mLiveRoom.enableMic(z);
            this.isEnableMic = z;
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public int enableVideo() {
        ZLog.i(TAG, "enableVideo", new Object[0]);
        setCurrentApiName("enableVideo");
        if (!this.isEnableCamera) {
            this.mLiveRoom.enableCamera(true);
            this.isEnableCamera = true;
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public ZegoAudioEffectManager getAudioEffectManager() {
        return ZegoAudioEffectManager.getInstance(this);
    }

    public int getAudioMixingCurrentPosition() {
        ZLog.i(TAG, "getAudioMixingCurrentPosition", new Object[0]);
        setCurrentApiName("getAudioMixingCurrentPosition");
        if (this.mPlayFilePath == null) {
            onErrorOccur(4);
            return -4;
        }
        callOnApiCallExecuted(0);
        return (int) this.mMediaPlayer.getCurrentDuration();
    }

    public int getAudioMixingDuration() {
        ZLog.i(TAG, "getAudioMixingDuration", new Object[0]);
        setCurrentApiName("getAudioMixingDuration");
        if (this.mPlayFilePath == null) {
            onErrorOccur(4);
            return -4;
        }
        callOnApiCallExecuted(0);
        return (int) this.mMediaPlayer.getDuration();
    }

    public boolean isSpeakerphoneEnabled() {
        boolean zIsSpeakerphoneOn = this.mAudioManager.isSpeakerphoneOn();
        ZLog.i(TAG, "isSpeakerphoneEnabled isSpeakerphoneEnabled: " + zIsSpeakerphoneOn, new Object[0]);
        setCurrentApiName("isSpeakerphoneEnabled");
        callOnApiCallExecuted(0);
        return zIsSpeakerphoneOn;
    }

    public int joinChannel(String str, final String str2, final long j) {
        boolean z = true;
        ZLog.i(TAG, "joinChannel channelName: %1$s, uid: %2$s", str2, Long.valueOf(j));
        setCurrentApiName("joinChannel");
        if (sDestroyCompletionCallback != null) {
            onErrorOccur(4);
            return -4;
        }
        if (j <= 0) {
            onErrorOccur(2);
            return -2;
        }
        int i = this.mConnectionState;
        if (i != 1 && i != 5) {
            z = false;
        }
        if (!z) {
            onErrorOccur(17);
            return -17;
        }
        ZegoUser zegoUserUserWithUID = ZegoUser.userWithUID(j);
        ZegoLiveRoom.setUser(zegoUserUserWithUID.userID, zegoUserUserWithUID.userName);
        if (!TextUtils.isEmpty(str)) {
            this.mLiveRoom.setCustomToken(str);
        }
        ZegoRoomInfo zegoRoomInfo = new ZegoRoomInfo(str2, "", zegoUserUserWithUID);
        configBeforeJoinChannel();
        initRoomStatus();
        this.mRoomManager.joinRoom(zegoRoomInfo, zegoUserUserWithUID, new ZegoLoginRoomCallback() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.5
            @Override // com.zego.wrapper.manager.room.ZegoLoginRoomCallback
            public void onLoginRoom(ResultCode resultCode) {
                if (resultCode.isSuccess()) {
                    ZegoLiveRoomEngine.this.callOnJoinChannel(str2, j);
                    ZegoLiveRoomEngine.this.startLiveIfNeed();
                    ZegoLiveRoomEngine zegoLiveRoomEngine = ZegoLiveRoomEngine.this;
                    zegoLiveRoomEngine.enableANSModeAI(zegoLiveRoomEngine.enableANSModeAI);
                }
            }
        });
        callOnApiCallExecuted(0);
        return 0;
    }

    public int leaveChannel() {
        ZLog.i(TAG, "leaveChannel", new Object[0]);
        setCurrentApiName("leaveChannel");
        if (!(this.mConnectionState != 1)) {
            onErrorOccur(18);
            return -18;
        }
        this.mRoomManager.leaveRoom();
        callOnLeaveChannel();
        reset();
        callOnApiCallExecuted(0);
        return 0;
    }

    public int muteAllRemoteAudioStreams(boolean z) {
        ZLog.i(TAG, "muteAllRemoteAudioStreams muted: " + z, new Object[0]);
        setCurrentApiName("muteAllRemoteAudioStreams");
        this.mRoomManager.muteAllRemoteAudioStreams(z);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int muteAllRemoteVideoStreams(boolean z) {
        ZLog.i(TAG, "muteAllRemoteVideoStreams muted: " + z, new Object[0]);
        setCurrentApiName("muteAllRemoteVideoStreams");
        this.mRoomManager.muteAllRemoteVideoStreams(z);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int muteLocalAudioStream(boolean z) {
        ZLog.i(TAG, "muteLocalAudioStream muted: " + z, new Object[0]);
        setCurrentApiName("muteLocalAudioStream");
        if (this.isMuteLocalAudioPublish != z) {
            this.mLiveRoom.muteAudioPublish(z);
            this.isMuteLocalAudioPublish = z;
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public int muteRemoteAudioStream(int i, boolean z) {
        ZLog.i(TAG, "muteRemoteAudioStream uid: " + i + ", muted: " + z, new Object[0]);
        setCurrentApiName("muteRemoteAudioStream");
        this.mRoomManager.muteRemoteAudioStream(z, ZegoUser.userWithUID((long) i));
        callOnApiCallExecuted(0);
        return 0;
    }

    public int muteRemoteVideoStream(int i, boolean z) {
        ZLog.i(TAG, "muteRemoteVideoStream uid: " + i + ", muted: " + z, new Object[0]);
        setCurrentApiName("muteRemoteVideoStream");
        this.mRoomManager.muteRemoteVideoStream(z, ZegoUser.userWithUID((long) i));
        callOnApiCallExecuted(0);
        return 0;
    }

    @Override // com.zego.zegoliveroom.callback.IZegoAVEngineCallback
    public void onAVEngineStart() {
        this.isAVEngineStart = true;
    }

    @Override // com.zego.zegoliveroom.callback.IZegoAVEngineCallback
    public void onAVEngineStop() {
        this.isAVEngineStart = false;
        ZegoLiveRoomEngineDestroyCompletionCallback zegoLiveRoomEngineDestroyCompletionCallback = sDestroyCompletionCallback;
        if (zegoLiveRoomEngineDestroyCompletionCallback != null) {
            zegoLiveRoomEngineDestroyCompletionCallback.onDestroyCompletion();
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoAudioRecordCallback2
    public void onAudioRecordCallback(byte[] bArr, int i, int i2, int i3, int i4) {
        callOnAudioRecordCallback(bArr, i, i2, i3);
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerCallback
    public void onAutoReconnectStop(int i) {
        if (i == 2) {
            updateConnectionStateWithReason(3);
            callOnError(17);
        } else {
            if (i != 3) {
                return;
            }
            updateConnectionStateWithReason(4);
            callOnError(10);
        }
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerLiveStatusCallback
    public void onExtraInfoUpdate(ZegoUser zegoUser, String str) {
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerLiveStatusCallback
    public void onGetSoundLevels(ZegoSoundLevelInfo[] zegoSoundLevelInfoArr) {
        IZegoLiveRoomEngineEventHandler.ZegoLiveRoomAudioVolumeInfo[] zegoLiveRoomAudioVolumeInfoArr = new IZegoLiveRoomEngineEventHandler.ZegoLiveRoomAudioVolumeInfo[zegoSoundLevelInfoArr.length];
        for (int i = 0; i < zegoSoundLevelInfoArr.length; i++) {
            IZegoLiveRoomEngineEventHandler.ZegoLiveRoomAudioVolumeInfo zegoLiveRoomAudioVolumeInfo = new IZegoLiveRoomEngineEventHandler.ZegoLiveRoomAudioVolumeInfo();
            ZegoUser zegoUserUserForStreamID = this.mRoomManager.userForStreamID(zegoSoundLevelInfoArr[i].streamID);
            zegoLiveRoomAudioVolumeInfo.uid = zegoUserUserForStreamID == null ? 0 : zegoUserUserForStreamID.uid();
            zegoLiveRoomAudioVolumeInfo.volume = (int) (zegoSoundLevelInfoArr[i].soundLevel * 2.55f);
            zegoLiveRoomAudioVolumeInfoArr[i] = zegoLiveRoomAudioVolumeInfo;
        }
        callOnAudioVolumeIndication(zegoLiveRoomAudioVolumeInfoArr);
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerLiveStatusCallback
    public void onLiveQualityUpdate(ZegoUser zegoUser, ZegoUserLiveQuality zegoUserLiveQuality) {
        if (zegoUser.uid() == this.mRoomManager.getUid()) {
            IZegoLiveRoomEngineEventHandler.ZegoLiveRoomLocalVideoStats zegoLiveRoomLocalVideoStats = new IZegoLiveRoomEngineEventHandler.ZegoLiveRoomLocalVideoStats();
            zegoLiveRoomLocalVideoStats.sentBitrate = (int) (zegoUserLiveQuality.mVideoKbps + zegoUserLiveQuality.mAudioKbps);
            zegoLiveRoomLocalVideoStats.sentFrameRate = (int) zegoUserLiveQuality.mVideoFPS;
            callOnLocalVideoStats(zegoLiveRoomLocalVideoStats);
        } else {
            IZegoLiveRoomEngineEventHandler.ZegoLiveRoomRemoteVideoStats zegoLiveRoomRemoteVideoStats = new IZegoLiveRoomEngineEventHandler.ZegoLiveRoomRemoteVideoStats();
            zegoLiveRoomRemoteVideoStats.uid = zegoUser.uid();
            zegoLiveRoomRemoteVideoStats.width = (int) zegoUserLiveQuality.mVideoWidth;
            zegoLiveRoomRemoteVideoStats.height = (int) zegoUserLiveQuality.mVideoHeight;
            zegoLiveRoomRemoteVideoStats.delay = zegoUserLiveQuality.mRtt;
            zegoLiveRoomRemoteVideoStats.receivedBitrate = (int) (zegoUserLiveQuality.mVideoKbps + zegoUserLiveQuality.mAudioKbps);
            zegoLiveRoomRemoteVideoStats.decoderOutputFrameRate = (int) zegoUserLiveQuality.mVideoDecFPS;
            zegoLiveRoomRemoteVideoStats.rendererOutputFrameRate = (int) zegoUserLiveQuality.mVideoRndFPS;
            callOnRemoteVideoStats(zegoLiveRoomRemoteVideoStats);
        }
        callOnNetworkQuality(zegoUser.uid(), zegoUserLiveQuality.mNetQuality);
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerLiveStatusCallback
    public void onLiveStatusChange(ZegoUser zegoUser, int i, ResultCode resultCode) {
        boolean z = false;
        boolean z2 = zegoUser.uid() == this.mRoomManager.getUid();
        ZegoUserLiveInfo zegoUserLiveInfo = this.mRoomManager.getLiveInfos().get(zegoUser);
        if ((zegoUserLiveInfo == null || !zegoUserLiveInfo.mFirstFrame) && i == 1) {
            z = true;
        }
        if (z) {
            return;
        }
        if (z2) {
            callOnLocalVideoStateChanged(i != 2 ? 2 : 1, resultCode.getCode());
        } else {
            callOnRemoteVideoStateChanged(zegoUser.uid(), i != 2 ? 2 : 1);
        }
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerCallback
    public void onLiveUserJoin(ZegoUser zegoUser) {
        callOnUserJoined(zegoUser.uid(), zegoUser.uid() == this.mRoomManager.getUid() ? getBroadcastElapsed() : getLoginElapsed());
        ZegoLiveRoomVideoCanvas zegoLiveRoomVideoCanvas = this.mRemoteCanvas.get(zegoUser);
        if (zegoLiveRoomVideoCanvas != null) {
            this.mRoomManager.setLiveVideoView(zegoLiveRoomVideoCanvas.view, zegoLiveRoomVideoCanvas.renderMode, zegoUser);
        }
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerCallback
    public void onLiveUserLeave(ZegoUser zegoUser) {
        callOnUserOffline(zegoUser.uid());
        if (zegoUser.uid() == this.mRoomManager.getUid()) {
            callOnLocalVideoStateChanged(0, 0);
        } else {
            callOnRemoteVideoStateChanged(zegoUser.uid(), 0);
        }
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerCallback
    public void onLoginEventOccur(int i, int i2, ResultCode resultCode) {
        switch (i) {
            case 0:
                recordLoginTimestamp();
                recordBroadcastTimestamp();
                updateConnectionStateWithReason(0);
                break;
            case 1:
            case 5:
                updateConnectionStateWithReason(1);
                break;
            case 2:
                boolean z = resultCode.getCode() == -69906 || resultCode.getCode() == 52001002;
                boolean z2 = resultCode.getCode() == 52002002;
                if (z) {
                    updateConnectionStateWithReason(4);
                    callOnError(2);
                } else if (!z2) {
                    updateConnectionStateWithReason(0);
                } else {
                    updateConnectionStateWithReason(4);
                    callOnError(110);
                }
                break;
            case 3:
                updateConnectionStateWithReason(5);
                break;
            case 4:
            case 6:
                recordLoginTimestamp();
                updateConnectionStateWithReason(2);
                break;
        }
    }

    @Override // com.zego.zegoavkit2.mixstream.IZegoMixStreamExCallback
    public void onMixStreamExConfigUpdate(int i, String str, ZegoMixStreamResultEx zegoMixStreamResultEx) {
        boolean z = i == 0;
        boolean zContains = this.mMixSeqs.contains(Integer.valueOf(zegoMixStreamResultEx.seq));
        this.mMixSeqs.remove(Integer.valueOf(zegoMixStreamResultEx.seq));
        if (z) {
            ZLog.d(TAG, "onMixStreamExConfigUpdate stateCode: %1$s, mixStreamID: %2$s, seq: %3$s, isPublish: %4$s", Integer.valueOf(i), str, Integer.valueOf(zegoMixStreamResultEx.seq), Boolean.valueOf(zContains));
        } else {
            ZLog.e(TAG, "onMixStreamExConfigUpdate stateCode: %1$s, mixStreamID: %2$s, seq: %3$s, isPublish: %4$s", Integer.valueOf(i), str, Integer.valueOf(zegoMixStreamResultEx.seq), Boolean.valueOf(zContains));
        }
        if (zContains) {
            callOnStreamPublished(str, i);
        } else {
            callOnStreamUnpublished(str, i);
        }
    }

    @Override // com.zego.wrapper.empty.audioplayer.IZegoAudioPlayerCallback
    public void onPlayEffect(int i, int i2) {
        ZLog.d(TAG, o00O00OO.OooO00o("onPlayEffect soundID: ", i, ", error: ", i2), new Object[0]);
        if (i2 != 0) {
            callOnWarning(701);
        }
    }

    @Override // com.zego.wrapper.empty.audioplayer.IZegoAudioPlayerCallback
    public void onPlayEnd(int i) {
        ZLog.d(TAG, android.support.v4.media.OooO00o.OooO00o("onPlayEnd soundID: ", i), new Object[0]);
        IZegoLiveRoomEngineEventHandler iZegoLiveRoomEngineEventHandler = this.mEngineEventHandler;
        if (iZegoLiveRoomEngineEventHandler == null) {
            return;
        }
        iZegoLiveRoomEngineEventHandler.onAudioEffectFinished(i);
    }

    @Override // com.zego.wrapper.empty.audioplayer.IZegoAudioPlayerCallback
    public void onPreloadComplete(int i) {
        ZLog.d(TAG, android.support.v4.media.OooO00o.OooO00o("onPreloadComplete soundID: ", i), new Object[0]);
    }

    @Override // com.zego.wrapper.empty.audioplayer.IZegoAudioPlayerCallback
    public void onPreloadEffect(int i, int i2) {
        ZLog.d(TAG, o00O00OO.OooO00o("onPreloadEffect soundID: ", i, ", error: ", i2), new Object[0]);
        if (i2 != 0) {
            callOnWarning(701);
        }
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerCallback
    public void onRecvCustomCommand(ZegoUser zegoUser, String str) {
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerLiveStatusCallback
    public void onRemoteCameraMute(boolean z, ZegoUser zegoUser) {
        callOnUserMuteVideo(zegoUser.uid(), z);
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerLiveStatusCallback
    public void onRemoteMicMute(boolean z, ZegoUser zegoUser) {
        callOnUserMuteAudio(zegoUser.uid(), z);
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerLiveStatusCallback
    public void onRenderRemoteUserVideoFrame(ZegoUser zegoUser) {
        callOnFirstRemoteVideoFrame(zegoUser.uid());
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerLiveStatusCallback
    public void onUserGetFirstAudioFrame(ZegoUser zegoUser) {
        if (zegoUser == null || zegoUser.uid() == this.mRoomManager.getUid()) {
            callOnFirstLocalAudioFrame();
        } else {
            callOnFirstRemoteAudioFrame(zegoUser.uid());
        }
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerLiveStatusCallback
    public void onUserGetFirstFrame(ZegoUser zegoUser, int i, int i2) {
        if (zegoUser == null || zegoUser.uid() == this.mRoomManager.getUid()) {
            callOnFirstLocalVideoFrame(i, i2);
        } else {
            callOnFirstRemoteVideoDecoded(zegoUser.uid(), i, i2);
        }
    }

    @Override // com.zego.wrapper.manager.room.ZegoRoomManagerLiveStatusCallback
    public void onUserVideoFrameChange(ZegoUser zegoUser, int i, int i2) {
        callOnVideoSizeChanged(zegoUser.uid(), i, i2);
    }

    public int pauseAudioMixing() {
        ZLog.i(TAG, "pauseAudioMixing", new Object[0]);
        setCurrentApiName("pauseAudioMixing");
        if (!(this.mAudioMixingState == 710)) {
            callOnApiCallExecuted(4);
            return -4;
        }
        ZegoMediaPlayer zegoMediaPlayer = this.mMediaPlayer;
        if (zegoMediaPlayer != null) {
            zegoMediaPlayer.pause();
        }
        if (this.isAudioMixingReplace) {
            this.mLiveRoom.setCaptureVolume(this.mCaptureVolume);
        }
        callOnApiCallExecuted(0);
        updateAudioMixingStateWithReason(4, 0);
        return 0;
    }

    public int removePublishStreamUrl(String str, boolean z) {
        ZLog.i(TAG, OooOo00.OooO00o("removePublishStreamUrl url: ", str), new Object[0]);
        setCurrentApiName("removePublishStreamUrl");
        if (this.mChannelProfile != 1 || this.mConnectionState != 3) {
            onErrorOccur(4);
            return -4;
        }
        if (TextUtils.isEmpty(str)) {
            onErrorOccur(2);
            return -2;
        }
        if (z ? removeMixStreamTarget(str) : removePublishTarget(str)) {
            callOnApiCallExecuted(0);
            return 0;
        }
        onErrorOccur(1);
        return -1;
    }

    public int renewToken(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        this.mLiveRoom.setCustomToken(str);
        return 0;
    }

    public void resetReverbParam() {
        ZegoAudioReverbParam zegoAudioReverbParam = new ZegoAudioReverbParam();
        zegoAudioReverbParam.roomSize = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        zegoAudioReverbParam.reverberance = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        zegoAudioReverbParam.damping = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        zegoAudioReverbParam.dryWetRatio = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public int resumeAudioMixing() {
        ZLog.i(TAG, "resumeAudioMixing", new Object[0]);
        setCurrentApiName("resumeAudioMixing");
        if (!(this.mAudioMixingState == 711)) {
            callOnApiCallExecuted(4);
            return -4;
        }
        ZegoMediaPlayer zegoMediaPlayer = this.mMediaPlayer;
        if (zegoMediaPlayer != null) {
            zegoMediaPlayer.resume();
        }
        if (this.isAudioMixingReplace) {
            this.mLiveRoom.setCaptureVolume(0);
        }
        callOnApiCallExecuted(0);
        updateAudioMixingStateWithReason(5, 0);
        return 0;
    }

    public int setAudioMixingPosition(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("setAudioMixingPosition pos: ", i), new Object[0]);
        setCurrentApiName("setAudioMixingPosition");
        if (this.mPlayFilePath == null) {
            onErrorOccur(4);
            return -4;
        }
        this.mMediaPlayer.seekTo(i);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setAudioProfile(int i, int i2) {
        ZLog.i(TAG, "setAudioProfile profile: %1$s, scenario: %2$s", Integer.valueOf(i), Integer.valueOf(i2));
        setCurrentApiName("setAudioProfile");
        if (!(!this.mRoomManager.isLogin())) {
            onErrorOccur(4);
            return -4;
        }
        this.mAudioProfile = i;
        this.mAudioScenario = i2;
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setChannelProfile(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("setChannelProfile channelProfile: ", i), new Object[0]);
        setCurrentApiName("setChannelProfile");
        ZegoRoomManager zegoRoomManager = this.mRoomManager;
        if (!(zegoRoomManager == null || !zegoRoomManager.isLogin())) {
            onErrorOccur(4);
            return -4;
        }
        this.mChannelProfile = i;
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setClientRole(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("setClientRole role: ", i), new Object[0]);
        setCurrentApiName("setClientRole");
        int i2 = this.mRole;
        if (i2 == i) {
            callOnApiCallExecuted(0);
            return 0;
        }
        this.mRole = i;
        if (!(this.mChannelProfile == 1)) {
            callOnApiCallExecuted(0);
            return 0;
        }
        callOnClientRoleChanged(i2, i);
        if (i == 1) {
            startLiveIfNeed();
        } else if (i == 2) {
            stopLiveIfNeed();
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setDefaultAudioRouteToSpeakerphone(boolean z) {
        ZLog.i(TAG, "setDefaultAudioRouteToSpeakerphone defaultToSpeaker: " + z, new Object[0]);
        setCurrentApiName("setDefaultAudioRouteToSpeakerphone");
        this.mLiveRoom.setBuiltInSpeakerOn(z);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setDefaultMuteAllRemoteAudioStreams(boolean z) {
        ZLog.i(TAG, "setDefaultMuteAllRemoteAudioStreams muted: " + z, new Object[0]);
        setCurrentApiName("setDefaultMuteAllRemoteAudioStreams");
        this.mRoomManager.setDefaultMuteAllRemoteAudioStreams(z);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setDefaultMuteAllRemoteVideoStreams(boolean z) {
        ZLog.i(TAG, "setDefaultMuteAllRemoteVideoStreams muted: " + z, new Object[0]);
        setCurrentApiName("setDefaultMuteAllRemoteVideoStreams");
        this.mRoomManager.setDefaultMuteAllRemoteVideoStreams(z);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setEnableSpeakerphone(boolean z) {
        boolean zIsSpeakerphoneOn = this.mAudioManager.isSpeakerphoneOn();
        ZLog.i(TAG, "setEnableSpeakerphone enabled: " + z + ", isSpeakerphoneEnabled: " + zIsSpeakerphoneOn, new Object[0]);
        setCurrentApiName("setEnableSpeakerphone");
        if (z != zIsSpeakerphoneOn) {
            this.mLiveRoom.setBuiltInSpeakerOn(z);
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setInEarMonitoringVolume(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("setInEarMonitoringVolume volume: ", i), new Object[0]);
        setCurrentApiName("setInEarMonitoringVolume");
        if (i > 100) {
            i = 100;
        } else if (i < 0) {
            i = 0;
        }
        this.mLiveRoom.setLoopbackVolume(i);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setLiveTranscoding(ZegoLiveTranscoding zegoLiveTranscoding) {
        ZLog.i(TAG, "setLiveTranscoding transcoding: " + zegoLiveTranscoding, new Object[0]);
        setCurrentApiName("setLiveTranscoding");
        if (zegoLiveTranscoding == null || !zegoLiveTranscoding.isValid()) {
            onErrorOccur(2);
            return -2;
        }
        this.mLiveTranscoding = zegoLiveTranscoding;
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setLocalRenderMode(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("setLocalRenderMode mode: ", i), new Object[0]);
        setCurrentApiName("setLocalRenderMode");
        ZegoLiveRoomVideoCanvas zegoLiveRoomVideoCanvas = this.mLocalCanvas;
        if (zegoLiveRoomVideoCanvas == null) {
            ZegoLiveRoomVideoCanvas zegoLiveRoomVideoCanvas2 = new ZegoLiveRoomVideoCanvas(null);
            this.mLocalCanvas = zegoLiveRoomVideoCanvas2;
            zegoLiveRoomVideoCanvas2.renderMode = i;
        } else {
            zegoLiveRoomVideoCanvas.renderMode = i;
        }
        setupLocalVideoInner(this.mLocalCanvas);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setLocalVideoMirrorMode(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("setLocalVideoMirrorMode mode: ", i), new Object[0]);
        setCurrentApiName("setLocalVideoMirrorMode");
        if (i == 1) {
            this.mLiveRoom.enablePreviewMirror(true);
            return 0;
        }
        if (i != 2) {
            onErrorOccur(2);
            return -2;
        }
        this.mLiveRoom.enablePreviewMirror(false);
        return 0;
    }

    public int setLocalVoicePitch(double d) {
        ZLog.i(TAG, "setLocalVoicePitch pitch: " + d, new Object[0]);
        setCurrentApiName("setLocalVoicePitch");
        if (d > MAX_VOICE_PITCH) {
            d = 2.0d;
        } else if (d < MIN_VOICE_PITCH) {
            d = 0.5d;
        }
        ZegoAudioProcessing.setVoiceChangerParam(convertToVoiceChangeValue(d));
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setLocalVoiceReverb(int i, int i2) {
        ZLog.i(TAG, o00O00OO.OooO00o("setLocalVoiceReverb reverbKey: ", i, ", value: ", i2), new Object[0]);
        setCurrentApiName("setLocalVoiceReverb");
        boolean z = true;
        if (i == 0) {
            setRtcDryLevel(i2);
        } else if (i == 1) {
            setRtcWetLevel(i2);
        } else if (i == 2) {
            setRoomSize(i2);
        } else if (i == 3) {
            setReverberance(i2);
        } else if (i != 4) {
            if (i != 5) {
                onErrorOccur(2);
                return -2;
            }
            setDamping(i2);
        } else if (i2 == 0) {
            z = false;
        }
        if (z) {
            setReverbParam();
        } else {
            ZegoAudioProcessing.enableReverb(false, ZegoAudioReverbMode.SOFT_ROOM);
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setParameters(String str) {
        ZLog.i(TAG, OooOo00.OooO00o("setParameters parameters: ", str), new Object[0]);
        setCurrentApiName("setParameters");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 1) {
                String next = jSONObject.keys().next();
                byte b = -1;
                if (next.hashCode() == -332484574 && next.equals(LOCAL_VIEW_MIRROR_SETTING)) {
                    b = 0;
                }
                if (b == 0 && localViewMirror(jSONObject.getString(LOCAL_VIEW_MIRROR_SETTING))) {
                    callOnApiCallExecuted(0);
                    return 0;
                }
            }
            onErrorOccur(2);
            return -2;
        } catch (JSONException unused) {
            onErrorOccur(2);
            return -2;
        }
    }

    public int setRemoteLiveUserSet(@Nullable Set<Long> set) {
        HashSet hashSet;
        ZLog.i(TAG, "setRemoteLiveUserSet userIDSet: " + set + ", mRoomManager: " + this.mRoomManager, new Object[0]);
        setCurrentApiName("setRemoteLiveUserSet");
        if (set != null) {
            hashSet = new HashSet();
            Iterator<Long> it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(ZegoUser.userWithUID(it.next().longValue()));
            }
        } else {
            hashSet = null;
        }
        this.mRoomManager.setFocusPlayUserSet(hashSet);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setRemoteRenderMode(int i, int i2) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("setRemoteRenderMode mode: ", i2), new Object[0]);
        setCurrentApiName("setRemoteRenderMode");
        ZegoUser zegoUserUserWithUID = ZegoUser.userWithUID(i);
        ZegoLiveRoomVideoCanvas zegoLiveRoomVideoCanvas = this.mRemoteCanvas.get(zegoUserUserWithUID);
        if (zegoLiveRoomVideoCanvas == null) {
            zegoLiveRoomVideoCanvas = new ZegoLiveRoomVideoCanvas(null);
            zegoLiveRoomVideoCanvas.uid = i;
            zegoLiveRoomVideoCanvas.renderMode = i2;
        } else {
            zegoLiveRoomVideoCanvas.renderMode = i2;
        }
        setupRemoteVideoInner(zegoUserUserWithUID, zegoLiveRoomVideoCanvas);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setVideoCamera(int i) {
        ZLog.i(TAG, android.support.v4.media.OooO00o.OooO00o("setVideoCamera cameraDevice: ", i), new Object[0]);
        setCurrentApiName("setVideoCamera");
        if (i == 0) {
            this.mLiveRoom.setFrontCam(false);
        } else {
            if (i != 1) {
                onErrorOccur(2);
                return -2;
            }
            this.mLiveRoom.setFrontCam(true);
        }
        this.mCurrentCameraDevice = i;
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setVideoEncoderConfiguration(ZegoVideoEncoderConfiguration zegoVideoEncoderConfiguration) {
        ZLog.i(TAG, "setVideoEncoderConfiguration configuration: %1$s", zegoVideoEncoderConfiguration);
        setCurrentApiName("setVideoEncoderConfiguration");
        ZegoAvConfig zegoAvConfig = new ZegoAvConfig(3);
        ZegoVideoEncoderConfiguration.VideoDimensions videoDimensions = zegoVideoEncoderConfiguration.dimensions;
        zegoAvConfig.setVideoCaptureResolution(videoDimensions.width, videoDimensions.height);
        ZegoVideoEncoderConfiguration.VideoDimensions videoDimensions2 = zegoVideoEncoderConfiguration.dimensions;
        zegoAvConfig.setVideoEncodeResolution(videoDimensions2.width, videoDimensions2.height);
        zegoAvConfig.setVideoBitrate(zegoVideoEncoderConfiguration.bitrate * 1000);
        zegoAvConfig.setVideoFPS(zegoVideoEncoderConfiguration.frameRate);
        this.mLiveRoom.setAVConfig(zegoAvConfig);
        this.mLiveRoom.enableTrafficControl(zegoVideoEncoderConfiguration.degradationPrefer == 1 ? 1 : 0, true);
        this.mLiveRoom.setMinVideoBitrateForTrafficControl(zegoVideoEncoderConfiguration.minBitrate, 1);
        setVideoOrientationMode(zegoVideoEncoderConfiguration.orientationMode);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setupLocalVideo(ZegoLiveRoomVideoCanvas zegoLiveRoomVideoCanvas) {
        ZLog.i(TAG, "setupLocalVideo local: " + zegoLiveRoomVideoCanvas, new Object[0]);
        setCurrentApiName("setupLocalVideo");
        setupLocalVideoInner(zegoLiveRoomVideoCanvas);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int setupRemoteVideo(ZegoLiveRoomVideoCanvas zegoLiveRoomVideoCanvas) {
        ZLog.i(TAG, "setupRemoteVideo remote: " + zegoLiveRoomVideoCanvas, new Object[0]);
        setCurrentApiName("setupRemoteVideo");
        setupRemoteVideoInner(ZegoUser.userWithUID((long) zegoLiveRoomVideoCanvas.uid), zegoLiveRoomVideoCanvas);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int startAudioMixing(String str, boolean z, boolean z2, int i) throws Throwable {
        ZLog.i(TAG, "startAudioMixing filePath: %1$s, loopback: %2$s, replace: %3$s, cycle: %4$s", str, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i));
        setCurrentApiName("startAudioMixing");
        int i2 = this.mAudioMixingState;
        if (!(i2 == 713 || i2 == 714)) {
            stopAudioMixing(true);
        }
        if (i == 0 || i < -1) {
            callOnApiCallExecuted(2);
            return -2;
        }
        if (str.startsWith(ASSETS_FILE_PREFIX)) {
            str = FileHelper.copyAssetsFile2Phone(this.mApplicationContext, str.substring(8));
        }
        if (str == null) {
            callOnWarning(701);
            return -701;
        }
        this.mAudioMixingCycleCount = i;
        this.mCurrentAudioMixingRepeatCount = 1;
        this.mPlayFilePath = str;
        if (this.mMediaPlayer == null) {
            ZegoMediaPlayer zegoMediaPlayer = new ZegoMediaPlayer();
            this.mMediaPlayer = zegoMediaPlayer;
            zegoMediaPlayer.init(0, 3);
            this.mMediaPlayer.setVolume(this.mMediaPlayerPlayVolume);
            this.mMediaPlayer.setEventWithIndexCallback(new ZegoMediaPlayerCallbackAdapter() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.6
                @Override // com.zego.wrapper.helper.ZegoMediaPlayerCallbackAdapter, com.zego.zegoavkit2.IZegoMediaPlayerWithIndexCallback
                public void onPlayEnd(int i3) {
                    ZLog.d(ZegoLiveRoomEngine.TAG, "onPlayEnd", new Object[0]);
                    if (ZegoLiveRoomEngine.this.mAudioMixingCycleCount < 0) {
                        return;
                    }
                    if (ZegoLiveRoomEngine.this.mCurrentAudioMixingRepeatCount < ZegoLiveRoomEngine.this.mAudioMixingCycleCount) {
                        ZegoLiveRoomEngine.access$1408(ZegoLiveRoomEngine.this);
                        ZegoLiveRoomEngine.this.mMediaPlayer.start(ZegoLiveRoomEngine.this.mPlayFilePath, false);
                    } else {
                        if (ZegoLiveRoomEngine.this.isAudioMixingReplace) {
                            ZegoLiveRoomEngine.this.mLiveRoom.setCaptureVolume(ZegoLiveRoomEngine.this.mCaptureVolume);
                        }
                        ZegoLiveRoomEngine.this.resetAudioMixingFlags();
                        ZegoLiveRoomEngine.this.updateAudioMixingStateWithReason(2, 723);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0058  */
                @Override // com.zego.wrapper.helper.ZegoMediaPlayerCallbackAdapter, com.zego.zegoavkit2.IZegoMediaPlayerWithIndexCallback
                public void onPlayError(int i3, int i4) {
                    ZLog.d(ZegoLiveRoomEngine.TAG, android.support.v4.media.OooO00o.OooO00o("onPlayError code:", i3), new Object[0]);
                    if (i3 == -6) {
                        return;
                    }
                    if (ZegoLiveRoomEngine.this.isAudioMixingReplace) {
                        ZegoLiveRoomEngine.this.mLiveRoom.setCaptureVolume(ZegoLiveRoomEngine.this.mCaptureVolume);
                    }
                    ZegoLiveRoomEngine.this.resetAudioMixingFlags();
                    int i5 = -1;
                    if (i3 == -5) {
                        i5 = 1003;
                    } else if (i3 == -4) {
                        i5 = 1004;
                    } else if (i3 == -3) {
                        i5 = 1003;
                    } else if (i3 == -2) {
                        i5 = 1002;
                    } else if (i3 != -1) {
                        ZLog.w(ZegoLiveRoomEngine.TAG, android.support.v4.media.OooO00o.OooO00o("onPlayError unknown errorCode: ", i3), new Object[0]);
                    } else {
                        i5 = 1001;
                    }
                    ZegoLiveRoomEngine.this.updateAudioMixingStateWithReason(3, i5);
                }
            });
        }
        if (z) {
            this.mMediaPlayer.init(0, 3);
        } else {
            this.mMediaPlayer.init(1, 3);
        }
        if (z2) {
            this.mLiveRoom.setCaptureVolume(0);
            this.isAudioMixingReplace = true;
        } else {
            if (this.isAudioMixingReplace) {
                this.mLiveRoom.setCaptureVolume(this.mCaptureVolume);
            }
            this.isAudioMixingReplace = false;
        }
        this.mMediaPlayer.start(str, i < 0);
        callOnApiCallExecuted(0);
        updateAudioMixingStateWithReason(0, 0);
        return 0;
    }

    public int startAudioRecording(String str, int i) {
        ZLog.i(TAG, "startAudioRecording filePath: %1$s, sampleRate: %2$s", str, Integer.valueOf(i));
        setCurrentApiName("startAudioRecording");
        if (this.isRecording) {
            stopAudioRecording();
        }
        this.isRecording = true;
        ZegoAudioRecordConfig zegoAudioRecordConfig = new ZegoAudioRecordConfig();
        zegoAudioRecordConfig.mask = 4;
        zegoAudioRecordConfig.channels = this.mAudioChannelCount;
        zegoAudioRecordConfig.sampleRate = i;
        this.mLiveRoom.enableSelectedAudioRecord(zegoAudioRecordConfig);
        this.mLiveRoom.setZegoAudioRecordCallback(this);
        callOnApiCallExecuted(0);
        return 0;
    }

    public int startPreview() {
        ZLog.i(TAG, "startPreview", new Object[0]);
        setCurrentApiName("startPreview");
        if (sDestroyCompletionCallback != null) {
            onErrorOccur(4);
            return -4;
        }
        recordPreviewTimestamp();
        this.mRoomManager.startPreview();
        callOnApiCallExecuted(0);
        return 0;
    }

    public int stopAudioMixing(boolean z) {
        ZLog.i(TAG, "stopAudioMixing", new Object[0]);
        setCurrentApiName("stopAudioMixing");
        int i = this.mAudioMixingState;
        if (!(i == 710 || i == 711)) {
            callOnApiCallExecuted(4);
            return -4;
        }
        ZegoMediaPlayer zegoMediaPlayer = this.mMediaPlayer;
        if (zegoMediaPlayer != null) {
            zegoMediaPlayer.stop();
        }
        if (this.isAudioMixingReplace) {
            this.mLiveRoom.setCaptureVolume(this.mCaptureVolume);
        }
        resetAudioMixingFlags();
        callOnApiCallExecuted(0);
        updateAudioMixingStateWithReason(1, z ? 1 : 0);
        return 0;
    }

    public int stopAudioRecording() {
        ZLog.i(TAG, "stopAudioRecording", new Object[0]);
        setCurrentApiName("stopAudioRecording");
        if (this.isRecording) {
            this.isRecording = false;
            ZegoAudioRecordConfig zegoAudioRecordConfig = new ZegoAudioRecordConfig();
            zegoAudioRecordConfig.mask = 0;
            zegoAudioRecordConfig.channels = this.mAudioChannelCount;
            zegoAudioRecordConfig.sampleRate = 44100;
            this.mLiveRoom.enableSelectedAudioRecord(zegoAudioRecordConfig);
            this.mLiveRoom.setZegoAudioRecordCallback((IZegoAudioRecordCallback2) null);
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    public int stopPreview() {
        ZLog.i(TAG, "stopPreview", new Object[0]);
        setCurrentApiName("stopPreview");
        this.mRoomManager.stopPreview();
        callOnApiCallExecuted(0);
        return 0;
    }

    public int switchCamera() {
        ZLog.i(TAG, "switchCamera", new Object[0]);
        setCurrentApiName("switchCamera");
        if (this.mCurrentCameraDevice == 0) {
            this.mLiveRoom.setFrontCam(true);
            this.mCurrentCameraDevice = 1;
        } else {
            this.mLiveRoom.setFrontCam(false);
            this.mCurrentCameraDevice = 0;
        }
        callOnApiCallExecuted(0);
        return 0;
    }

    private void callOnApiCallExecuted(final int i) {
        ZLog.d(TAG, "callOnApiCallExecuted errorCode: %1$s, mEngineEventHandler: %2$s, mCurrentApiName: %3$s", Integer.valueOf(i), this.mEngineEventHandler, this.mCurrentApiName);
        if (this.mEngineEventHandler == null) {
            return;
        }
        final String str = this.mCurrentApiName;
        this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.ZegoLiveRoomEngine.14
            @Override // java.lang.Runnable
            public void run() {
                ZegoLiveRoomEngine.this.mEngineEventHandler.onApiCallExecuted(i, str, null);
            }
        });
    }

    private void onErrorOccur(int i) {
        ZLog.d(TAG, "onErrorOccur errorCode: %1$s", Integer.valueOf(i));
        callOnError(i);
        callOnApiCallExecuted(i);
    }

    public void setReverbParam(float f, float f2, float f3, float f4) {
        ZegoAudioReverbParam zegoAudioReverbParam = new ZegoAudioReverbParam();
        zegoAudioReverbParam.roomSize = this.mRoomSize;
        zegoAudioReverbParam.reverberance = this.mReverberance;
        zegoAudioReverbParam.damping = this.mDamping;
        zegoAudioReverbParam.dryWetRatio = this.mDryWetRatio;
        ZegoAudioProcessing.setReverbParam(zegoAudioReverbParam);
        ZegoAudioProcessing.enableReverb(true, ZegoAudioReverbMode.SOFT_ROOM);
    }
}
