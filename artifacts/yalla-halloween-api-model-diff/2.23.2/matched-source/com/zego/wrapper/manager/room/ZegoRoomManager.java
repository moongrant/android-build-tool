package com.zego.wrapper.manager.room;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.OooO00o;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.youth.banner.config.BannerConfig;
import com.zego.wrapper.log.ZLog;
import com.zego.wrapper.manager.entity.ResultCode;
import com.zego.wrapper.manager.entity.ZegoUser;
import com.zego.wrapper.manager.utils.MD5Utils;
import com.zego.wrapper.manager.utils.ZegoStreamInfoHelper;
import com.zego.zegoavkit2.error.ZegoError;
import com.zego.zegoavkit2.soundlevel.IZegoSoundLevelCallback;
import com.zego.zegoavkit2.soundlevel.ZegoSoundLevelInfo;
import com.zego.zegoavkit2.soundlevel.ZegoSoundLevelMonitor;
import com.zego.zegoliveroom.ZegoLiveRoom;
import com.zego.zegoliveroom.callback.IZegoCustomCommandCallback;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import com.zego.zegoliveroom.callback.IZegoLivePlayerCallback2;
import com.zego.zegoliveroom.callback.IZegoLivePublisherCallback;
import com.zego.zegoliveroom.callback.IZegoLoginCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoRoomCallback;
import com.zego.zegoliveroom.entity.ZegoPlayStats;
import com.zego.zegoliveroom.entity.ZegoPlayStreamQuality;
import com.zego.zegoliveroom.entity.ZegoPublishStreamQuality;
import com.zego.zegoliveroom.entity.ZegoStreamInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class ZegoRoomManager implements IZegoRoomCallback, IZegoLiveEventCallback, IZegoLivePublisherCallback, IZegoLivePlayerCallback2, IZegoSoundLevelCallback {
    private static final String LIVE_EVENT_STREAM_KEY = "StreamID";
    private static final int RECONNECT_ROOM_MESSAGE = 1;
    private static final int START_USER_LIVE_MESSAGE = 2;
    private static final String TAG = "ZegoRoomManager";
    private boolean isAutoReconnectRoom;
    private boolean isCaptureFirstFrame;
    private boolean isDisconnect;
    private boolean isOnlyAudio;
    private boolean isPreview;
    private boolean isSoundLevelMonitor;
    private Set<ZegoStreamInfo> mAllStreams;
    private boolean mDefaultMuteAllRemoteAudioStreams;
    private boolean mDefaultMuteAllRemoteVideoStreams;
    private Set<ZegoUser> mFocusPlayUserSet;
    private ZegoRoomManagerIDGenerateCallback mIDGenerateCallback;
    private Map<ZegoUser, ZegoUserLiveInfo> mLiveInfos;
    private List<ZegoRoomManagerLiveStatusCallback> mLiveStatusCallbacks;
    private int mLoginStatus;
    private List<ZegoRoomManagerCallback> mManagerCallbacks;
    private boolean mMuteAllRemoteAudioStreams;
    private boolean mMuteAllRemoteVideoStreams;
    private View mPreviewView;
    private int mPreviewViewMode;
    private long mReconnectInterval;
    private int mReconnectTimeoutSec;
    private ZegoRoomInfo mRoomInfo;
    private int mSoundLevelMonitorCycle;
    private Timer mStopReconnectTimer;
    private Handler mUIHandler = new Handler(Looper.getMainLooper()) { // from class: com.zego.wrapper.manager.room.ZegoRoomManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Log.d(ZegoRoomManager.TAG, "mUIHandler 重连房间");
                ZegoRoomManager.this.reconnectRoom();
            } else {
                if (i != 2) {
                    return;
                }
                Log.d(ZegoRoomManager.TAG, "mUIHandler 重新推拉流 user" + message.obj);
                ZegoRoomManager.this.startUserLive((ZegoUser) message.obj);
            }
        }
    };
    private ZegoUser mUserInfo;
    private ZegoLiveRoom mZegoLiveRoom;
    private ZegoLoginRoomCallback mZegoLoginRoomCallback;

    private ZegoRoomManager() {
    }

    private void addLiveUser(ZegoUser zegoUser) {
        String str = TAG;
        ZLog.d(str, "addLiveUser user: " + zegoUser, new Object[0]);
        if (liveUsers().contains(zegoUser)) {
            return;
        }
        ZegoUserLiveInfo zegoUserLiveInfo = new ZegoUserLiveInfo();
        zegoUserLiveInfo.isMuteAudio = this.mDefaultMuteAllRemoteAudioStreams;
        zegoUserLiveInfo.isMuteVideo = this.mDefaultMuteAllRemoteVideoStreams;
        this.mLiveInfos.put(zegoUser, zegoUserLiveInfo);
        ZLog.d(str, "onLiveUserJoin user: " + zegoUser, new Object[0]);
        Iterator<ZegoRoomManagerCallback> it = this.mManagerCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onLiveUserJoin(zegoUser);
        }
        setStreamStatus(0, ResultCode.RESULT_CODE_SUCCESS, zegoUser);
        startUserLive(zegoUser);
    }

    private void addStreams(ZegoStreamInfo[] zegoStreamInfoArr) {
        ZLog.d(TAG, "addStreams streamList: " + Arrays.toString(zegoStreamInfoArr), new Object[0]);
        if (zegoStreamInfoArr == null) {
            return;
        }
        ZegoStreamInfoHelper.addAllStreamToSet(this.mAllStreams, Arrays.asList(zegoStreamInfoArr));
        for (ZegoStreamInfo zegoStreamInfo : zegoStreamInfoArr) {
            ZegoUser zegoUser = new ZegoUser();
            zegoUser.userID = zegoStreamInfo.userID;
            zegoUser.userName = zegoStreamInfo.userName;
            Set<ZegoUser> set = this.mFocusPlayUserSet;
            if (!(set != null) || (set.contains(zegoUser) && !this.mUserInfo.equals(zegoUser))) {
                addLiveUser(zegoUser);
            }
        }
        updateStreamExtraInfo(zegoStreamInfoArr);
    }

    private void callbackAllLiveStreamError() {
        for (ZegoUser zegoUser : this.mLiveInfos.keySet()) {
            String strStreamIDForUser = streamIDForUser(zegoUser);
            ZegoUserLiveInfo zegoUserLiveInfo = this.mLiveInfos.get(zegoUser);
            if ((zegoUserLiveInfo == null || zegoUserLiveInfo.getStreamStatus() == 0) ? false : true) {
                if (this.mUserInfo.equals(zegoUser)) {
                    onPublishStateUpdate(ZegoError.kLiveRoomTimeoutError, strStreamIDForUser, null);
                } else {
                    onPlayStateUpdate(ZegoError.kLiveRoomTimeoutError, strStreamIDForUser);
                }
            }
        }
    }

    private void clearAllCallback() {
        this.mManagerCallbacks.clear();
        this.mLiveStatusCallbacks.clear();
    }

    private void deleteStreams(ZegoStreamInfo[] zegoStreamInfoArr) {
        ZLog.d(TAG, "deleteStreams streams: " + Arrays.toString(zegoStreamInfoArr), new Object[0]);
        if (zegoStreamInfoArr == null) {
            return;
        }
        for (ZegoStreamInfo zegoStreamInfo : zegoStreamInfoArr) {
            ZegoUser zegoUser = new ZegoUser();
            zegoUser.userID = zegoStreamInfo.userID;
            zegoUser.userName = zegoStreamInfo.userName;
            removeLiveUser(zegoUser);
        }
        ZegoStreamInfoHelper.removeAllStreamFromCollection(this.mAllStreams, Arrays.asList(zegoStreamInfoArr));
    }

    private void endLoginRetryWithReason(int i) {
        ZLog.d(TAG, "endLoginRetryWithReason reason: ", Integer.valueOf(i));
        leaveRoomInner();
        releaseTimeoutTimer();
        Iterator<ZegoRoomManagerCallback> it = this.mManagerCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAutoReconnectStop(i);
        }
    }

    private String genLiveIDWithUser(ZegoUser zegoUser) {
        return MD5Utils.md5(getCurrentRoomID()) + "-" + zegoUser.userID;
    }

    private String getLiveIDWithUser(ZegoUser zegoUser) {
        ZegoRoomManagerIDGenerateCallback zegoRoomManagerIDGenerateCallback = this.mIDGenerateCallback;
        return zegoRoomManagerIDGenerateCallback == null ? genLiveIDWithUser(zegoUser) : zegoRoomManagerIDGenerateCallback.genLiveIDWithUser(zegoUser);
    }

    private void handleReconnectRoomStreams(ZegoStreamInfo[] zegoStreamInfoArr) {
        ZLog.d(TAG, "handleReconnectRoomStreams streams: " + Arrays.toString(zegoStreamInfoArr), new Object[0]);
        boolean zIsSelfLive = isSelfLive();
        HashSet hashSet = zegoStreamInfoArr == null ? new HashSet() : new HashSet(Arrays.asList(zegoStreamInfoArr));
        HashSet hashSet2 = new HashSet(this.mAllStreams);
        HashSet hashSet3 = new HashSet(this.mAllStreams);
        ZegoStreamInfoHelper.retainAllStreamFromCollection(hashSet3, hashSet);
        ZegoStreamInfoHelper.removeAllStreamFromCollection(hashSet2, hashSet);
        if (zIsSelfLive) {
            startUserLive(this.mUserInfo);
        }
        ZegoStreamInfoHelper.removeAllStreamFromCollection(hashSet, this.mAllStreams);
        reconnectStreams((ZegoStreamInfo[]) hashSet3.toArray(new ZegoStreamInfo[0]));
        addStreams((ZegoStreamInfo[]) hashSet.toArray(new ZegoStreamInfo[0]));
        deleteStreams((ZegoStreamInfo[]) hashSet2.toArray(new ZegoStreamInfo[0]));
    }

    private boolean isSelfLive() {
        return liveUsers().contains(this.mUserInfo);
    }

    private void leaveRoomInner() {
        ZLog.d(TAG, "leaveRoomInner", new Object[0]);
        this.mZegoLiveRoom.logoutRoom();
        this.mUIHandler.removeCallbacksAndMessages(null);
    }

    private ZegoUserLiveInfo liveInfoForUser(ZegoUser zegoUser) {
        ZegoUserLiveInfo zegoUserLiveInfo = this.mLiveInfos.get(zegoUser);
        if (this.mUserInfo.equals(zegoUser) && zegoUserLiveInfo != null) {
            zegoUserLiveInfo.mFirstFrame = this.isCaptureFirstFrame;
            zegoUserLiveInfo.mVideoView = this.mPreviewView;
            zegoUserLiveInfo.mViewMode = this.mPreviewViewMode;
        }
        return this.mLiveInfos.get(zegoUser);
    }

    private Set<ZegoUser> liveUsers() {
        return this.mLiveInfos.keySet();
    }

    public static ZegoRoomManager managerWithLiveRoom(ZegoLiveRoom zegoLiveRoom, boolean z) {
        ZLog.i(TAG, "managerWithLiveRoom liveRoom: %1$s, isOnlyAudio: %2$s", zegoLiveRoom, Boolean.valueOf(z));
        ZegoRoomManager zegoRoomManager = new ZegoRoomManager();
        zegoRoomManager.isOnlyAudio = z;
        zegoRoomManager.isPreview = false;
        zegoRoomManager.mAllStreams = new HashSet();
        zegoRoomManager.mLiveInfos = new HashMap();
        zegoRoomManager.mReconnectInterval = 1000L;
        zegoRoomManager.mSoundLevelMonitorCycle = 500;
        zegoRoomManager.mManagerCallbacks = new ArrayList();
        zegoRoomManager.mLiveStatusCallbacks = new ArrayList();
        zegoRoomManager.mPreviewView = null;
        zegoRoomManager.mPreviewViewMode = 1;
        zegoRoomManager.isCaptureFirstFrame = false;
        zegoRoomManager.mZegoLiveRoom = zegoLiveRoom;
        zegoLiveRoom.enableCamera(!z);
        zegoRoomManager.setZegoLiveRoomCallback();
        return zegoRoomManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLoginRetryTimeout() {
        ZLog.d(TAG, "onLoginRetryTimeout mZegoLoginRoomCallback: " + this.mZegoLoginRoomCallback, new Object[0]);
        final ResultCode resultCodeCreateRoomResultCode = ZegoRoomManagerErrorHelper.createRoomResultCode(ZegoRoomManagerErrorHelper.LOGIN_ROOM_TIME_OUT_ERROR_CODE);
        updateLoginStatusWithLoginEvent(2, resultCodeCreateRoomResultCode);
        if (this.mZegoLoginRoomCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.wrapper.manager.room.ZegoRoomManager.5
                @Override // java.lang.Runnable
                public void run() {
                    ZegoRoomManager.this.mZegoLoginRoomCallback.onLoginRoom(resultCodeCreateRoomResultCode);
                }
            });
        }
        endLoginRetryWithReason(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLoginRoomComplete(int i, ZegoStreamInfo[] zegoStreamInfoArr, ZegoRoomInfo zegoRoomInfo, ZegoLoginRoomCallback zegoLoginRoomCallback) {
        String str = TAG;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = zegoRoomInfo.mRoomID;
        objArr[2] = Integer.valueOf(zegoStreamInfoArr == null ? 0 : zegoStreamInfoArr.length);
        ZLog.d(str, "onLoginRoomComplete errorCode: %1$s, roomID: %2$s, streamList.length: %3$s", objArr);
        ZegoRoomInfo zegoRoomInfo2 = this.mRoomInfo;
        if ((zegoRoomInfo2 != null && zegoRoomInfo.mRoomID.equals(zegoRoomInfo2.mRoomID) && this.mLoginStatus == 1) ? false : true) {
            Object[] objArr2 = new Object[2];
            ZegoRoomInfo zegoRoomInfo3 = this.mRoomInfo;
            objArr2[0] = zegoRoomInfo3 != null ? zegoRoomInfo3.mRoomID : null;
            objArr2[1] = Integer.valueOf(this.mLoginStatus);
            ZLog.e(str, "onLoginRoomComplete mRoomInfo.mRoomID: %1$s, mLoginStatus: %2$s", objArr2);
            return;
        }
        if (i == 0) {
            boolean z = this.isDisconnect;
            this.isDisconnect = false;
            updateLoginStatusWithLoginEvent(1, ResultCode.RESULT_CODE_SUCCESS);
            if (z) {
                handleReconnectRoomStreams(zegoStreamInfoArr);
            } else {
                addStreams(zegoStreamInfoArr);
            }
            releaseTimeoutTimer();
            if (zegoLoginRoomCallback != null) {
                zegoLoginRoomCallback.onLoginRoom(ZegoRoomManagerErrorHelper.createRoomResultCode(i));
                this.mZegoLoginRoomCallback = null;
                return;
            }
            return;
        }
        ResultCode resultCodeCreateRoomResultCode = ZegoRoomManagerErrorHelper.createRoomResultCode(i);
        updateLoginStatusWithLoginEvent(2, resultCodeCreateRoomResultCode);
        boolean z2 = resultCodeCreateRoomResultCode.getCode() == 52001002;
        boolean z3 = resultCodeCreateRoomResultCode.getCode() == 52002002;
        ZLog.d(str, "onLoginRoomComplete isAutoReconnectRoom: %1$s, isAudienceCantCreateRoom: %2$s, isCustomTokenError: %3$s", Boolean.valueOf(this.isAutoReconnectRoom), Boolean.valueOf(z2), Boolean.valueOf(z3));
        boolean z4 = this.isAutoReconnectRoom;
        if (z4 && (z2 || z3)) {
            endLoginRetryWithReason(0);
            leaveRoomInner();
            if (zegoLoginRoomCallback != null) {
                zegoLoginRoomCallback.onLoginRoom(resultCodeCreateRoomResultCode);
                this.mZegoLoginRoomCallback = null;
                return;
            }
            return;
        }
        if (z4) {
            this.mUIHandler.sendEmptyMessageDelayed(1, this.mReconnectInterval);
        } else if (zegoLoginRoomCallback != null) {
            zegoLoginRoomCallback.onLoginRoom(resultCodeCreateRoomResultCode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reconnectRoom() {
        ZLog.d(TAG, "reconnectRoom isAutoReconnectRoom: " + this.isAutoReconnectRoom, new Object[0]);
        if (this.isAutoReconnectRoom) {
            joinRoom(this.mRoomInfo, this.mUserInfo, this.mZegoLoginRoomCallback);
        }
    }

    private void reconnectStreams(ZegoStreamInfo[] zegoStreamInfoArr) {
        ZLog.d(TAG, "reconnectStreams streams: " + Arrays.toString(zegoStreamInfoArr), new Object[0]);
        int length = zegoStreamInfoArr.length;
        for (int i = 0; i < length; i++) {
            ZegoStreamInfo zegoStreamInfo = zegoStreamInfoArr[i];
            ZLog.d(TAG, "reconnectStreams stream: " + zegoStreamInfo.streamID, new Object[0]);
            ZegoUser zegoUser = new ZegoUser();
            zegoUser.userID = zegoStreamInfo.userID;
            zegoUser.userName = zegoStreamInfo.userName;
            Set<ZegoUser> set = this.mFocusPlayUserSet;
            if (!(set != null) || (set.contains(zegoUser) && !this.mUserInfo.equals(zegoUser))) {
                startUserLive(zegoUser);
            }
        }
        updateStreamExtraInfo(zegoStreamInfoArr);
    }

    private void releaseTimeoutTimer() {
        ZLog.d(TAG, "releaseTimeoutTimer mStopReconnectTimer: " + this.mStopReconnectTimer, new Object[0]);
        Timer timer = this.mStopReconnectTimer;
        if (timer != null) {
            timer.cancel();
            this.mStopReconnectTimer = null;
        }
    }

    private Set<ZegoUser> remoteLiveUsers() {
        HashSet hashSet = new HashSet(liveUsers());
        hashSet.remove(this.mUserInfo);
        return hashSet;
    }

    private void removeAllLiveUsers() {
        Iterator<ZegoUser> it = liveUsers().iterator();
        while (it.hasNext()) {
            stopUserLive(it.next());
        }
        this.mLiveInfos.clear();
    }

    private void removeLiveUser(ZegoUser zegoUser) {
        String str = TAG;
        ZLog.d(str, "removeLiveUser user: " + zegoUser, new Object[0]);
        if (liveUsers().contains(zegoUser)) {
            this.mUIHandler.removeMessages(2, zegoUser);
            stopUserLive(zegoUser);
            this.mLiveInfos.remove(zegoUser);
            ZLog.d(str, "onLiveUserLeave user: " + zegoUser, new Object[0]);
            Iterator<ZegoRoomManagerCallback> it = this.mManagerCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onLiveUserLeave(zegoUser);
            }
        }
    }

    private void removeZegoLiveRoomCallback() {
        this.mZegoLiveRoom.setZegoRoomCallback(null);
        this.mZegoLiveRoom.setZegoLivePublisherCallback(null);
        this.mZegoLiveRoom.setZegoLivePlayerCallback(null);
        this.mZegoLiveRoom.setZegoLiveEventCallback(null);
    }

    private void reset() {
        this.mZegoLoginRoomCallback = null;
        this.mRoomInfo = null;
        this.isDisconnect = false;
        this.mLiveInfos.clear();
        this.mAllStreams.clear();
        this.mFocusPlayUserSet = null;
    }

    private void retryUserLiveWithUser(ZegoUser zegoUser) {
        ZLog.d(TAG, "retryUserLiveWithUser user: " + zegoUser, new Object[0]);
        Message message = new Message();
        message.what = 2;
        message.obj = zegoUser;
        this.mUIHandler.sendMessageDelayed(message, this.mReconnectInterval);
    }

    private void setExtraInfo(String str, ZegoUser zegoUser) {
        ZegoUserLiveInfo zegoUserLiveInfo = this.mLiveInfos.get(zegoUser);
        if (zegoUserLiveInfo == null || zegoUser == null || TextUtils.equals(zegoUserLiveInfo.mExtraInfo, str)) {
            return;
        }
        zegoUserLiveInfo.mExtraInfo = str;
        ZLog.d(TAG, "setExtraInfo extraInfo: %1$s, toUser: %2$s", str, zegoUser);
        Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onExtraInfoUpdate(zegoUser, str);
        }
    }

    private void setFirstFrame(boolean z, int i, int i2, ZegoUser zegoUser) {
        if (zegoUser == null || this.mUserInfo.equals(zegoUser)) {
            this.isCaptureFirstFrame = z;
            if (z) {
                ZLog.d(TAG, "onUserGetFirstFrame toUser: %1$s", zegoUser);
                Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onUserGetFirstFrame(zegoUser, i, i2);
                }
                return;
            }
            return;
        }
        ZegoUserLiveInfo zegoUserLiveInfo = this.mLiveInfos.get(zegoUser);
        if (zegoUserLiveInfo != null) {
            zegoUserLiveInfo.mFirstFrame = z;
            if (z) {
                ZLog.d(TAG, "onUserGetFirstFrame toUser: %1$s", zegoUser);
                Iterator<ZegoRoomManagerLiveStatusCallback> it2 = this.mLiveStatusCallbacks.iterator();
                while (it2.hasNext()) {
                    it2.next().onUserGetFirstFrame(zegoUser, i, i2);
                }
            }
        }
    }

    private void setLiveStatus(int i, ResultCode resultCode, ZegoUser zegoUser) {
        ZegoUserLiveInfo zegoUserLiveInfo = this.mLiveInfos.get(zegoUser);
        if (zegoUserLiveInfo == null || zegoUser == null) {
            return;
        }
        int status = zegoUserLiveInfo.getStatus();
        zegoUserLiveInfo.setLiveStatus(i);
        int status2 = zegoUserLiveInfo.getStatus();
        if (status != status2) {
            ZLog.d(TAG, "onLiveStatusChange toUser: %1$s, newStatus: %2$s, errorCode: %3$s", zegoUser, Integer.valueOf(status2), resultCode);
            Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onLiveStatusChange(zegoUser, status2, resultCode);
            }
        }
    }

    private void setLoginStatus(int i) {
        this.mLoginStatus = i;
        updateLiveRoomSoundLevelMonitorState();
    }

    private void setRemoteStreamAudioMuteState(ZegoUser zegoUser) {
        ZegoUserLiveInfo zegoUserLiveInfoLiveInfoForUser = liveInfoForUser(zegoUser);
        String strStreamIDForUser = streamIDForUser(zegoUser);
        if (zegoUserLiveInfoLiveInfoForUser == null) {
            return;
        }
        boolean z = (zegoUserLiveInfoLiveInfoForUser.isMuteAudio || this.mMuteAllRemoteAudioStreams) ? false : true;
        ZLog.d(TAG, "activateAudioPlayStream streamID: " + strStreamIDForUser + " active: " + z, new Object[0]);
        this.mZegoLiveRoom.activateAudioPlayStream(strStreamIDForUser, z);
    }

    private void setRemoteStreamVideoMuteState(ZegoUser zegoUser) {
        ZegoUserLiveInfo zegoUserLiveInfoLiveInfoForUser = liveInfoForUser(zegoUser);
        String strStreamIDForUser = streamIDForUser(zegoUser);
        if (zegoUserLiveInfoLiveInfoForUser == null) {
            return;
        }
        boolean z = (zegoUserLiveInfoLiveInfoForUser.isMuteVideo || this.mMuteAllRemoteVideoStreams) ? false : true;
        ZLog.d(TAG, "activateVideoPlayStream streamID: " + strStreamIDForUser + " active: " + z, new Object[0]);
        this.mZegoLiveRoom.activateVideoPlayStream(strStreamIDForUser, z);
    }

    private void setSoundLevel(ZegoSoundLevelInfo[] zegoSoundLevelInfoArr) {
        ZegoUserLiveInfo zegoUserLiveInfo;
        for (ZegoSoundLevelInfo zegoSoundLevelInfo : zegoSoundLevelInfoArr) {
            ZegoUser zegoUserUserForStreamID = userForStreamID(zegoSoundLevelInfo.streamID);
            if (zegoUserUserForStreamID != null && (zegoUserLiveInfo = this.mLiveInfos.get(zegoUserUserForStreamID)) != null) {
                zegoUserLiveInfo.mSoundLevel = zegoSoundLevelInfo.soundLevel;
            }
        }
        Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onGetSoundLevels(zegoSoundLevelInfoArr);
        }
    }

    private void setStreamStatus(int i, ResultCode resultCode, ZegoUser zegoUser) {
        ZegoUserLiveInfo zegoUserLiveInfo = this.mLiveInfos.get(zegoUser);
        if (zegoUserLiveInfo == null || zegoUser == null) {
            return;
        }
        int status = zegoUserLiveInfo.getStatus();
        zegoUserLiveInfo.setStreamStatus(i);
        int status2 = zegoUserLiveInfo.getStatus();
        if (status != status2) {
            ZLog.d(TAG, "onLiveStatusChange toUser: %1$s, newStatus: %2$s, errorCode: %3$s", zegoUser, Integer.valueOf(status2), resultCode);
            Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onLiveStatusChange(zegoUser, status2, resultCode);
            }
        }
    }

    private void setUserLiveQuality(ZegoUserLiveQuality zegoUserLiveQuality, ZegoUser zegoUser) {
        ZegoUserLiveInfo zegoUserLiveInfo = this.mLiveInfos.get(zegoUser);
        if (zegoUserLiveInfo == null || zegoUser == null) {
            return;
        }
        zegoUserLiveInfo.mLiveQuality = zegoUserLiveQuality;
        Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onLiveQualityUpdate(zegoUser, zegoUserLiveQuality);
        }
    }

    private void setZegoLiveRoomCallback() {
        this.mZegoLiveRoom.setZegoRoomCallback(this);
        this.mZegoLiveRoom.setZegoLivePublisherCallback(this);
        this.mZegoLiveRoom.setZegoLivePlayerCallback(this);
        this.mZegoLiveRoom.setZegoLiveEventCallback(this);
    }

    private void setupTimeoutTimer() {
        ZLog.d(TAG, "setupTimeoutTimer mStopReconnectTimer: %1$s, mReconnectTimeoutSec: %2$s", this.mStopReconnectTimer, Integer.valueOf(this.mReconnectTimeoutSec));
        if (this.mStopReconnectTimer != null || this.mReconnectTimeoutSec == 0) {
            return;
        }
        Timer timer = new Timer();
        this.mStopReconnectTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.zego.wrapper.manager.room.ZegoRoomManager.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                ZegoRoomManager.this.onLoginRetryTimeout();
            }
        }, ((long) this.mReconnectTimeoutSec) * 1000);
    }

    private void startPlayStreamWithUser(ZegoUser zegoUser) {
        String strStreamIDForUser = streamIDForUser(zegoUser);
        ZLog.d(TAG, "startPlayStreamWithUser toUser: %1$s, streamID: %2$s", zegoUser, strStreamIDForUser);
        this.mZegoLiveRoom.startPlayingStream(strStreamIDForUser, null);
        setRemoteStreamAudioMuteState(zegoUser);
        setRemoteStreamVideoMuteState(zegoUser);
        setStreamStatus(1, ResultCode.RESULT_CODE_SUCCESS, zegoUser);
    }

    private void startPublish() {
        String strStreamIDForUser = streamIDForUser(this.mUserInfo);
        ZLog.d(TAG, o00O00OO.OooO00o("startPublish streamID: ", strStreamIDForUser), new Object[0]);
        this.mZegoLiveRoom.startPublishing(strStreamIDForUser, null, 0);
        setStreamStatus(1, ResultCode.RESULT_CODE_SUCCESS, this.mUserInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startUserLive(ZegoUser zegoUser) {
        ZLog.d(TAG, "startUserLive user: %1$s, isLogin: %2$s", zegoUser, Boolean.valueOf(isLogin()));
        if (isLogin()) {
            if (this.mUserInfo.equals(zegoUser)) {
                startPublish();
            } else {
                startPlayStreamWithUser(zegoUser);
            }
        }
    }

    private void stopPlayStreamWithUser(ZegoUser zegoUser) {
        String strStreamIDForUser = streamIDForUser(zegoUser);
        ZLog.d(TAG, "stopPlayStreamWithUser toUser: %1$s, streamID: %2$s", zegoUser, strStreamIDForUser);
        this.mZegoLiveRoom.updatePlayView(strStreamIDForUser, null);
        this.mZegoLiveRoom.stopPlayingStream(strStreamIDForUser);
    }

    private void stopPublish() {
        ZLog.d(TAG, "stopPublish", new Object[0]);
        this.mZegoLiveRoom.stopPublishing();
        updateCaptureFirstFrameIfNeed();
    }

    private void stopUserLive(ZegoUser zegoUser) {
        ZLog.d(TAG, "stopUserLive user:" + zegoUser, new Object[0]);
        if (this.mUserInfo.equals(zegoUser)) {
            stopPublish();
        } else {
            stopPlayStreamWithUser(zegoUser);
        }
    }

    private ZegoStreamInfo streamForUser(@NonNull ZegoUser zegoUser) {
        for (ZegoStreamInfo zegoStreamInfo : this.mAllStreams) {
            if (zegoUser.userID.equals(zegoStreamInfo.userID)) {
                return zegoStreamInfo;
            }
        }
        return null;
    }

    private void updateCaptureFirstFrameIfNeed() {
        ZegoUserLiveInfo zegoUserLiveInfoLiveInfoForUser = liveInfoForUser(this.mUserInfo);
        boolean z = true;
        ZLog.d(TAG, "updateCaptureFirstFrameIfNeed isPreview: %1$s, userLiveInfo: %2$s", Boolean.valueOf(this.isPreview), zegoUserLiveInfoLiveInfoForUser);
        if (!this.isPreview && (zegoUserLiveInfoLiveInfoForUser == null || zegoUserLiveInfoLiveInfoForUser.getStatus() == 0)) {
            z = false;
        }
        if (z) {
            return;
        }
        setFirstFrame(false, 0, 0, this.mUserInfo);
    }

    private void updateLiveRoomSoundLevelMonitorState() {
        boolean z = false;
        ZLog.d(TAG, "updateLiveRoomSoundLevelMonitorState isLogin: %1$s, isSoundLevelMonitor: %2$s", Boolean.valueOf(isLogin()), Boolean.valueOf(this.isSoundLevelMonitor));
        if (isLogin() && this.isSoundLevelMonitor) {
            z = true;
        }
        if (!z) {
            ZegoSoundLevelMonitor.getInstance().stop();
            ZegoSoundLevelMonitor.getInstance().setCallback(null);
        } else {
            ZegoSoundLevelMonitor.getInstance().start();
            ZegoSoundLevelMonitor.getInstance().setCallback(this);
            ZegoSoundLevelMonitor.getInstance().setCycle(this.mSoundLevelMonitorCycle);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    private void updateLoginStatusWithLoginEvent(int i, ResultCode resultCode) {
        String str = TAG;
        ZLog.d(str, "updateLoginStatusWithLoginEvent loginEvent: %1$s, resultCode: %2$s", Integer.valueOf(i), resultCode);
        int i2 = this.mLoginStatus;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (i == 3) {
                            setLoginStatus(0);
                        } else if (i != 4) {
                            if (i == 5) {
                                setLoginStatus(2);
                            } else if (i == 6 || i == 7) {
                                setLoginStatus(0);
                            } else {
                                Log.w(str, "updateLoginStatusWithLoginEvent status error!! mLoginStatus = " + this.mLoginStatus + " loginEvent = " + i);
                            }
                        }
                    }
                } else if (i == 3) {
                    setLoginStatus(0);
                } else if (i == 4) {
                    setLoginStatus(3);
                } else if (i == 6 || i == 7) {
                    setLoginStatus(0);
                } else {
                    Log.w(str, "updateLoginStatusWithLoginEvent status error!! mLoginStatus = " + this.mLoginStatus + " loginEvent = " + i);
                }
            } else if (i == 1) {
                setLoginStatus(2);
            } else if (i == 2 || i == 3) {
                setLoginStatus(0);
            } else {
                Log.w(str, "updateLoginStatusWithLoginEvent status error!! mLoginStatus = " + this.mLoginStatus + " loginEvent = " + i);
            }
        } else if (i == 0) {
            setLoginStatus(1);
        } else if (i != 3) {
            Log.w(str, "updateLoginStatusWithLoginEvent status error!! mLoginStatus = " + this.mLoginStatus + " loginEvent = " + i);
        }
        ZLog.d(str, "updateLoginStatusWithLoginEvent mLoginStatus: " + this.mLoginStatus, new Object[0]);
        Iterator<ZegoRoomManagerCallback> it = this.mManagerCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onLoginEventOccur(i, this.mLoginStatus, resultCode);
        }
    }

    private void updateStreamExtraInfo(ZegoStreamInfo[] zegoStreamInfoArr) {
        String str;
        for (ZegoStreamInfo zegoStreamInfo : zegoStreamInfoArr) {
            ZegoUser zegoUser = new ZegoUser();
            zegoUser.userID = zegoStreamInfo.userID;
            zegoUser.userName = zegoStreamInfo.userName;
            ZegoUserLiveInfo zegoUserLiveInfoLiveInfoForUser = liveInfoForUser(zegoUser);
            if (zegoUserLiveInfoLiveInfoForUser == null) {
                ZLog.e(TAG, "updateStreamExtraInfo liveInfo == null", new Object[0]);
            } else {
                boolean z = true;
                ZLog.d(TAG, "updateStreamExtraInfo liveInfo.mExtraInfo: %1$s, stream.extraInfo: %2$s", zegoUserLiveInfoLiveInfoForUser.mExtraInfo, zegoStreamInfo.extraInfo);
                String str2 = zegoUserLiveInfoLiveInfoForUser.mExtraInfo;
                if ((str2 == null || str2.equals(zegoStreamInfo.extraInfo)) && ((str = zegoStreamInfo.extraInfo) == null || str.equals(zegoUserLiveInfoLiveInfoForUser.mExtraInfo))) {
                    z = false;
                }
                if (z) {
                    setExtraInfo(zegoStreamInfo.extraInfo, zegoUser);
                }
            }
        }
    }

    public void addLiveStatusCallback(ZegoRoomManagerLiveStatusCallback zegoRoomManagerLiveStatusCallback) {
        ZLog.i(TAG, "addLiveStatusCallback managerCallback: " + zegoRoomManagerLiveStatusCallback, new Object[0]);
        this.mLiveStatusCallbacks.add(zegoRoomManagerLiveStatusCallback);
    }

    public void addManagerCallback(ZegoRoomManagerCallback zegoRoomManagerCallback) {
        ZLog.i(TAG, "addManagerCallback managerCallback: " + zegoRoomManagerCallback, new Object[0]);
        this.mManagerCallbacks.add(zegoRoomManagerCallback);
    }

    public String getCurrentRoomID() {
        ZegoRoomInfo zegoRoomInfo = this.mRoomInfo;
        if (zegoRoomInfo == null) {
            return null;
        }
        return zegoRoomInfo.mRoomID;
    }

    public Map<ZegoUser, ZegoUserLiveInfo> getLiveInfos() {
        return this.mLiveInfos;
    }

    public int getLoginStatus() {
        return this.mLoginStatus;
    }

    public ZegoRoomInfo getRoomInfo() {
        return this.mRoomInfo;
    }

    public int getUid() {
        ZegoUser zegoUser = this.mUserInfo;
        if (zegoUser == null) {
            return 0;
        }
        return zegoUser.uid();
    }

    public ZegoUser getUserInfo() {
        return this.mUserInfo;
    }

    public boolean isCurrentRoom(String str) {
        String currentRoomID = getCurrentRoomID();
        return currentRoomID != null && currentRoomID.equals(str);
    }

    public boolean isLogin() {
        int i = this.mLoginStatus;
        return i == 1 || i == 2 || i == 3;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public void joinRoom(final ZegoRoomInfo zegoRoomInfo, ZegoUser zegoUser, final ZegoLoginRoomCallback zegoLoginRoomCallback) {
        String str = TAG;
        ZLog.i(str, "joinRoom roomInfo: %1$s, userInfo: %2$s, loginRoomCallback: %3$s, mLoginStatus: %4$s", zegoRoomInfo, zegoUser, zegoLoginRoomCallback, Integer.valueOf(this.mLoginStatus));
        if (this.mLoginStatus != 0) {
            Log.w(str, "joinRoom mLoginStatus = " + this.mLoginStatus);
            return;
        }
        this.mRoomInfo = zegoRoomInfo;
        this.mUserInfo = zegoUser;
        ZegoLiveRoom.setUser(zegoUser.userID, zegoUser.userName);
        int i = this.mUserInfo.equals(zegoRoomInfo.mOwner) ? 1 : 2;
        updateLoginStatusWithLoginEvent(0, ResultCode.RESULT_CODE_SUCCESS);
        boolean zLoginRoom = this.mZegoLiveRoom.loginRoom(zegoRoomInfo.mRoomID, zegoRoomInfo.mRoomName, i, new IZegoLoginCompletionCallback() { // from class: com.zego.wrapper.manager.room.ZegoRoomManager.2
            @Override // com.zego.zegoliveroom.callback.IZegoLoginCompletionCallback
            public void onLoginCompletion(int i2, ZegoStreamInfo[] zegoStreamInfoArr) {
                ZegoRoomManager.this.onLoginRoomComplete(i2, zegoStreamInfoArr, zegoRoomInfo, zegoLoginRoomCallback);
            }
        });
        ZLog.d(str, "joinRoom loginRoom result: %1$s, isAutoReconnectRoom: %2$s", Boolean.valueOf(zLoginRoom), Boolean.valueOf(this.isAutoReconnectRoom));
        if (zLoginRoom) {
            this.mZegoLoginRoomCallback = zegoLoginRoomCallback;
            if (this.isAutoReconnectRoom) {
                setupTimeoutTimer();
                return;
            }
            return;
        }
        updateLoginStatusWithLoginEvent(2, ZegoRoomManagerErrorHelper.createRoomResultCode(ZegoRoomManagerErrorHelper.PARAM_ERROR_CODE));
        if (this.isAutoReconnectRoom) {
            endLoginRetryWithReason(0);
        }
    }

    public void leaveRoom() {
        ZLog.i(TAG, "leaveRoom mLoginStatus: " + this.mLoginStatus, new Object[0]);
        removeAllLiveUsers();
        leaveRoomInner();
        updateLoginStatusWithLoginEvent(3, ResultCode.RESULT_CODE_SUCCESS);
        if (this.isAutoReconnectRoom && !isLogin()) {
            endLoginRetryWithReason(1);
        }
        reset();
    }

    public void muteAllRemoteAudioStreams(boolean z) {
        ZLog.i(TAG, "muteAllRemoteAudioStreams muted: " + z, new Object[0]);
        this.mMuteAllRemoteAudioStreams = z;
        Iterator<ZegoUser> it = remoteLiveUsers().iterator();
        while (it.hasNext()) {
            setRemoteStreamAudioMuteState(it.next());
        }
    }

    public void muteAllRemoteVideoStreams(boolean z) {
        ZLog.i(TAG, "muteAllRemoteVideoStreams muted: " + z, new Object[0]);
        this.mMuteAllRemoteVideoStreams = z;
        Iterator<ZegoUser> it = remoteLiveUsers().iterator();
        while (it.hasNext()) {
            setRemoteStreamVideoMuteState(it.next());
        }
    }

    public void muteRemoteAudioStream(boolean z, ZegoUser zegoUser) {
        ZLog.i(TAG, "muteRemoteAudioStream muted: " + z + " user: " + zegoUser, new Object[0]);
        ZegoUserLiveInfo zegoUserLiveInfoLiveInfoForUser = liveInfoForUser(zegoUser);
        if (zegoUserLiveInfoLiveInfoForUser == null || z == zegoUserLiveInfoLiveInfoForUser.isMuteAudio) {
            return;
        }
        zegoUserLiveInfoLiveInfoForUser.isMuteAudio = z;
        setRemoteStreamAudioMuteState(zegoUser);
    }

    public void muteRemoteVideoStream(boolean z, ZegoUser zegoUser) {
        ZLog.i(TAG, "muteRemoteVideoStream muted: " + z + " user: " + zegoUser, new Object[0]);
        ZegoUserLiveInfo zegoUserLiveInfoLiveInfoForUser = liveInfoForUser(zegoUser);
        if (zegoUserLiveInfoLiveInfoForUser == null || z == zegoUserLiveInfoLiveInfoForUser.isMuteVideo) {
            return;
        }
        zegoUserLiveInfoLiveInfoForUser.isMuteVideo = z;
        setRemoteStreamVideoMuteState(zegoUser);
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePublisherCallback
    public void onCaptureAudioFirstFrame() {
        ZLog.d(TAG, "onCaptureAudioFirstFrame", new Object[0]);
        Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onUserGetFirstAudioFrame(this.mUserInfo);
        }
    }

    @Override // com.zego.zegoavkit2.soundlevel.IZegoSoundLevelCallback
    public void onCaptureSoundLevelUpdate(ZegoSoundLevelInfo zegoSoundLevelInfo) {
        setSoundLevel(new ZegoSoundLevelInfo[]{zegoSoundLevelInfo});
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePublisherCallback
    public void onCaptureVideoFirstFrame() {
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePublisherCallback
    public void onCaptureVideoSizeChangedTo(int i, int i2) {
        ZLog.d(TAG, "onCaptureVideoFirstFrame", new Object[0]);
        ZegoUser zegoUser = this.mUserInfo;
        ZegoUserLiveInfo zegoUserLiveInfoLiveInfoForUser = zegoUser == null ? null : liveInfoForUser(zegoUser);
        if (zegoUserLiveInfoLiveInfoForUser == null || !zegoUserLiveInfoLiveInfoForUser.mFirstFrame) {
            setFirstFrame(true, i, i2, this.mUserInfo);
            return;
        }
        Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onUserVideoFrameChange(this.mUserInfo, i, i2);
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoRoomCallback
    public void onDisconnect(int i, String str) {
        ZLog.d(TAG, "onDisconnect reason: %1$s, roomID: %2$s, currentRoomID: %3$s", Integer.valueOf(i), str, getCurrentRoomID());
        if (isCurrentRoom(str)) {
            this.isDisconnect = true;
            updateLoginStatusWithLoginEvent(6, ZegoRoomManagerErrorHelper.createResultCodeByRoomDisconnectReason(i));
            callbackAllLiveStreamError();
            if (this.isAutoReconnectRoom) {
                this.mUIHandler.sendEmptyMessageDelayed(1, this.mReconnectInterval);
            }
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback
    public void onInviteJoinLiveRequest(int i, String str, String str2, String str3) {
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePublisherCallback
    public void onJoinLiveRequest(int i, String str, String str2, String str3) {
    }

    @Override // com.zego.zegoliveroom.callback.IZegoRoomCallback
    public void onKickOut(int i, String str, String str2) {
        ZLog.d(TAG, "onKickOut reason: %1$s, roomID: %2$s, customReason: %3$s currentRoomID: %4$s", Integer.valueOf(i), str, str2, getCurrentRoomID());
        if (isCurrentRoom(str)) {
            this.isDisconnect = true;
            updateLoginStatusWithLoginEvent(7, ZegoRoomManagerErrorHelper.createResultCodeByKickOutReason(i));
            callbackAllLiveStreamError();
            if (this.isAutoReconnectRoom) {
                endLoginRetryWithReason(2);
            }
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLiveEventCallback
    public void onLiveEvent(int i, HashMap<String, String> map) {
        String str = map.get(LIVE_EVENT_STREAM_KEY);
        ZegoUser zegoUserUserForStreamID = userForStreamID(str);
        int i2 = 2;
        ZLog.d(TAG, "onLiveEvent streamID: %1$s, event: %2$s", str, Integer.valueOf(i));
        ResultCode resultCodeCreateResultCodeByLiveEventTempBrokenReason = ResultCode.RESULT_CODE_SUCCESS;
        switch (i) {
            case 1:
            case 3:
                i2 = 1;
                break;
            case 2:
            case 4:
                break;
            case 5:
            case 6:
                resultCodeCreateResultCodeByLiveEventTempBrokenReason = ZegoRoomManagerErrorHelper.createResultCodeByLiveEventTempBrokenReason();
                i2 = 0;
                break;
            default:
                return;
        }
        setLiveStatus(i2, resultCodeCreateResultCodeByLiveEventTempBrokenReason, zegoUserUserForStreamID);
    }

    @Override // com.zego.zegoliveroom.callback.IZegoRoomCallback
    public void onNetworkQuality(String str, int i, int i2) {
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback
    public void onPlayQualityUpdate(String str, ZegoPlayStreamQuality zegoPlayStreamQuality) {
        setUserLiveQuality(ZegoUserLiveQuality.initWithPlayQuality(zegoPlayStreamQuality), userForStreamID(str));
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback
    public void onPlayStateUpdate(int i, String str) {
        ZLog.d(TAG, "onPlayStateUpdate playState: %1$s, streamID: %2$s", Integer.valueOf(i), str);
        boolean z = i == 0;
        ZegoUser zegoUserUserForStreamID = userForStreamID(str);
        if (zegoUserUserForStreamID == null) {
            return;
        }
        if (z) {
            setStreamStatus(2, ResultCode.RESULT_CODE_SUCCESS, zegoUserUserForStreamID);
            return;
        }
        setStreamStatus(0, ZegoRoomManagerErrorHelper.createResultCodeByPlayState(i), zegoUserUserForStreamID);
        setFirstFrame(false, 0, 0, zegoUserUserForStreamID);
        if (isLogin()) {
            retryUserLiveWithUser(zegoUserUserForStreamID);
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback2
    public void onPlayStatsUpdate(ZegoPlayStats zegoPlayStats) {
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePublisherCallback
    public void onPublishQualityUpdate(String str, ZegoPublishStreamQuality zegoPublishStreamQuality) {
        setUserLiveQuality(ZegoUserLiveQuality.initWithPublishQuality(zegoPublishStreamQuality), this.mUserInfo);
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePublisherCallback
    public void onPublishStateUpdate(int i, String str, HashMap<String, Object> map) {
        ZLog.d(TAG, "onPublishStateUpdate stateCode: %1$s, streamID: %2$s", Integer.valueOf(i), str);
        if (i == 0) {
            setStreamStatus(2, ResultCode.RESULT_CODE_SUCCESS, this.mUserInfo);
            return;
        }
        setStreamStatus(0, ZegoRoomManagerErrorHelper.createResultCodeByPublishState(i), this.mUserInfo);
        updateCaptureFirstFrameIfNeed();
        if (isLogin()) {
            retryUserLiveWithUser(this.mUserInfo);
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoRoomCallback
    public void onReconnect(int i, String str) {
        ZLog.d(TAG, "onReconnect reason: %1$s, roomID: %2$s", Integer.valueOf(i), str);
        if (isCurrentRoom(str)) {
            updateLoginStatusWithLoginEvent(5, ResultCode.RESULT_CODE_SUCCESS);
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoRoomCallback
    public void onRecvCustomCommand(String str, String str2, String str3, String str4) {
        ZLog.d(TAG, "onRecvCustomCommand fromUserID: %1$s, fromUserName: %2$s, content: %3$s, roomID: %4$s", str, str2, str3, str4);
        if (isCurrentRoom(str4)) {
            ZegoUser zegoUser = new ZegoUser();
            zegoUser.userID = str;
            zegoUser.userName = str2;
            Iterator<ZegoRoomManagerCallback> it = this.mManagerCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onRecvCustomCommand(zegoUser, str3);
            }
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback
    public void onRecvEndJoinLiveCommand(String str, String str2, String str3) {
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback2
    public void onRecvRemoteAudioFirstFrame(String str) {
        ZegoUser zegoUserUserForStreamID = userForStreamID(str);
        ZLog.d(TAG, "onRecvRemoteAudioFirstFrame streamID: %1$s, user: %2$s", str, zegoUserUserForStreamID);
        if (zegoUserUserForStreamID == null) {
            return;
        }
        Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onUserGetFirstAudioFrame(zegoUserUserForStreamID);
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback2
    public void onRecvRemoteVideoFirstFrame(String str) {
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback2
    public void onRemoteCameraStatusUpdate(String str, int i, int i2) {
        ZegoUser zegoUserUserForStreamID = userForStreamID(str);
        ZLog.d(TAG, "onRemoteCameraStatusUpdate streamID: %1$s, user: %2$s, status: %3$s, reason: %4$s", str, zegoUserUserForStreamID, Integer.valueOf(i), Integer.valueOf(i2));
        if (zegoUserUserForStreamID == null) {
            return;
        }
        boolean z = i == 1;
        Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onRemoteCameraMute(z, zegoUserUserForStreamID);
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback2
    public void onRemoteMicStatusUpdate(String str, int i, int i2) {
        ZegoUser zegoUserUserForStreamID = userForStreamID(str);
        ZLog.d(TAG, "onRemoteMicStatusUpdate streamID: %1$s, user: %2$s, status: %3$s, reason: %4$s", str, zegoUserUserForStreamID, Integer.valueOf(i), Integer.valueOf(i2));
        if (zegoUserUserForStreamID == null) {
            return;
        }
        boolean z = i == 1;
        Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onRemoteMicMute(z, zegoUserUserForStreamID);
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback2
    public void onRemoteSpeakerStatusUpdate(String str, int i, int i2) {
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback2
    public void onRenderRemoteVideoFirstFrame(String str) {
        ZegoUser zegoUserUserForStreamID = userForStreamID(str);
        ZLog.d(TAG, "onRenderRemoteVideoFirstFrame streamID: %1$s, user: %2$s", str, zegoUserUserForStreamID);
        if (zegoUserUserForStreamID == null) {
            return;
        }
        Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onRenderRemoteUserVideoFrame(zegoUserUserForStreamID);
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoRoomCallback
    public void onRoomInfoUpdated(com.zego.zegoliveroom.entity.ZegoRoomInfo zegoRoomInfo, String str) {
    }

    @Override // com.zego.zegoavkit2.soundlevel.IZegoSoundLevelCallback
    public void onSoundLevelUpdate(ZegoSoundLevelInfo[] zegoSoundLevelInfoArr) {
        setSoundLevel(zegoSoundLevelInfoArr);
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLiveEventCallback
    public void onStreamEvent(int i, String str, HashMap<String, String> map) {
    }

    @Override // com.zego.zegoliveroom.callback.IZegoRoomCallback
    public void onStreamExtraInfoUpdated(ZegoStreamInfo[] zegoStreamInfoArr, String str) {
        ZLog.d(TAG, "onStreamExtraInfoUpdated streamList: %1$s, roomID: %2$s", zegoStreamInfoArr, str);
        if (isCurrentRoom(str)) {
            for (ZegoStreamInfo zegoStreamInfo : zegoStreamInfoArr) {
                ZegoUser zegoUser = new ZegoUser();
                zegoUser.userID = zegoStreamInfo.userID;
                zegoUser.userName = zegoStreamInfo.userName;
                setExtraInfo(zegoStreamInfo.extraInfo, zegoUser);
            }
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoRoomCallback
    public void onStreamUpdated(int i, ZegoStreamInfo[] zegoStreamInfoArr, String str) {
        ZLog.d(TAG, "onStreamUpdated updateType: %1$s, streamList: %2$s, roomID: %3$s", Integer.valueOf(i), zegoStreamInfoArr, str);
        if (isCurrentRoom(str)) {
            if (2001 == i) {
                addStreams(zegoStreamInfoArr);
            } else if (2002 == i) {
                deleteStreams(zegoStreamInfoArr);
            }
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoRoomCallback
    public void onTempBroken(int i, String str) {
        ZLog.d(TAG, "onTempBroken reason: %1$s, roomID: %2$s", Integer.valueOf(i), str);
        if (isCurrentRoom(str)) {
            updateLoginStatusWithLoginEvent(4, ZegoRoomManagerErrorHelper.createResultCodeByRoomTempBrokenReason(i));
        }
    }

    @Override // com.zego.zegoliveroom.callback.IZegoRoomCallback
    public void onTokenWillExpired(String str, int i) {
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback2
    public void onVideoDecoderError(int i, int i2, String str) {
    }

    @Override // com.zego.zegoliveroom.callback.IZegoLivePlayerCallback
    public void onVideoSizeChangedTo(String str, int i, int i2) {
        ZegoUser zegoUserUserForStreamID;
        ZegoUserLiveInfo zegoUserLiveInfo;
        ZLog.d(TAG, "onVideoSizeChangedTo streamID: %1$s, width: %2$s, height: %3$s", str, Integer.valueOf(i), Integer.valueOf(i2));
        if (i <= 0 || i2 <= 0 || (zegoUserUserForStreamID = userForStreamID(str)) == null || (zegoUserLiveInfo = this.mLiveInfos.get(zegoUserUserForStreamID)) == null) {
            return;
        }
        if (zegoUserLiveInfo.mFirstFrame) {
            Iterator<ZegoRoomManagerLiveStatusCallback> it = this.mLiveStatusCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onUserVideoFrameChange(zegoUserUserForStreamID, i, i2);
            }
        } else {
            setFirstFrame(true, i, i2, zegoUserUserForStreamID);
            if (zegoUserLiveInfo.mVideoView != null) {
                this.mZegoLiveRoom.setViewMode(zegoUserLiveInfo.mViewMode, str);
                this.mZegoLiveRoom.updatePlayView(str, zegoUserLiveInfo.mVideoView);
            }
        }
    }

    public void release() {
        ZLog.i(TAG, "RoomManager release", new Object[0]);
        leaveRoom();
        if (this.isPreview) {
            this.mZegoLiveRoom.stopPreview();
            this.isPreview = false;
        }
        clearAllCallback();
        setSoundLevelMonitor(false);
        removeZegoLiveRoomCallback();
        this.mIDGenerateCallback = null;
        this.mZegoLiveRoom = null;
    }

    public void removeLiveStatusCallback(ZegoRoomManagerLiveStatusCallback zegoRoomManagerLiveStatusCallback) {
        ZLog.i(TAG, "removeLiveStatusCallback managerCallback: " + zegoRoomManagerLiveStatusCallback, new Object[0]);
        this.mLiveStatusCallbacks.remove(zegoRoomManagerLiveStatusCallback);
    }

    public void removeManagerCallback(ZegoRoomManagerCallback zegoRoomManagerCallback) {
        ZLog.i(TAG, "removeManagerCallback managerCallback: " + zegoRoomManagerCallback, new Object[0]);
        this.mManagerCallbacks.remove(zegoRoomManagerCallback);
    }

    public void sendCustomCommand(String str, ZegoUser[] zegoUserArr, final ZegoSendCustomCmdCallback zegoSendCustomCmdCallback) {
        ZLog.i(TAG, "sendCustomCommand content: %1$s, memberList.length: %2$s, callback: %3$s", str, zegoUserArr, zegoSendCustomCmdCallback);
        com.zego.zegoliveroom.entity.ZegoUser[] zegoUserArr2 = new com.zego.zegoliveroom.entity.ZegoUser[zegoUserArr.length];
        for (int i = 0; i < zegoUserArr.length; i++) {
            zegoUserArr2[i] = zegoUserArr[i].toInnerZegoUser();
        }
        if (this.mZegoLiveRoom.sendCustomCommand(zegoUserArr2, str, new IZegoCustomCommandCallback() { // from class: com.zego.wrapper.manager.room.ZegoRoomManager.3
            @Override // com.zego.zegoliveroom.callback.IZegoCustomCommandCallback
            public void onSendCustomCommand(int i2, String str2) {
                ZLog.i(ZegoRoomManager.TAG, "onSendCustomCommand errorCode: %1$s, roomID: %2$s", Integer.valueOf(i2), str2);
                if (ZegoRoomManager.this.isCurrentRoom(str2)) {
                    if (!(i2 == 0)) {
                        if (zegoSendCustomCmdCallback != null) {
                            zegoSendCustomCmdCallback.onSendCustomCmd(ZegoRoomManagerErrorHelper.createResultCodeBySendCmdErrorCode(i2));
                        }
                    } else {
                        ZegoSendCustomCmdCallback zegoSendCustomCmdCallback2 = zegoSendCustomCmdCallback;
                        if (zegoSendCustomCmdCallback2 != null) {
                            zegoSendCustomCmdCallback2.onSendCustomCmd(ResultCode.RESULT_CODE_SUCCESS);
                        }
                    }
                }
            }
        })) {
            return;
        }
        ZLog.d(TAG, "sendCustomCommand callback: " + zegoSendCustomCmdCallback, new Object[0]);
        if (zegoSendCustomCmdCallback != null) {
            zegoSendCustomCmdCallback.onSendCustomCmd(ZegoRoomManagerErrorHelper.createResultCodeBySendCmdErrorCode(ZegoRoomManagerErrorHelper.PARAM_ERROR_CODE));
        }
    }

    public void setAutoReconnectRoom(boolean z) {
        ZLog.i(TAG, "setAutoReconnectRoom this.isAutoReconnectRoom: %1$s, isAutoReconnectRoom: %2$s", Boolean.valueOf(this.isAutoReconnectRoom), Boolean.valueOf(z));
        if (this.isAutoReconnectRoom != z) {
            this.isAutoReconnectRoom = z;
            this.mUIHandler.removeCallbacksAndMessages(null);
        }
    }

    public void setDefaultMuteAllRemoteAudioStreams(boolean z) {
        ZLog.i(TAG, "setDefaultMuteAllRemoteAudioStreams muted: " + z, new Object[0]);
        this.mDefaultMuteAllRemoteAudioStreams = z;
    }

    public void setDefaultMuteAllRemoteVideoStreams(boolean z) {
        ZLog.i(TAG, "setDefaultMuteAllRemoteVideoStreams muted: " + z, new Object[0]);
        this.mDefaultMuteAllRemoteVideoStreams = z;
    }

    public void setFocusPlayUserSet(@Nullable Set<ZegoUser> set) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("setRemoteLiveUserSet userIDSet: ");
        sb.append(set == null ? null : Arrays.toString(set.toArray(new ZegoUser[0])));
        sb.append(", loginStatus: ");
        sb.append(getLoginStatus());
        ZLog.i(str, sb.toString(), new Object[0]);
        this.mFocusPlayUserSet = set;
        if (isLogin() || this.isDisconnect) {
            boolean z = set != null;
            for (ZegoStreamInfo zegoStreamInfo : this.mAllStreams) {
                ZegoUser zegoUser = new ZegoUser();
                zegoUser.userID = zegoStreamInfo.userID;
                zegoUser.userName = zegoStreamInfo.userName;
                if (!z) {
                    addLiveUser(zegoUser);
                } else if (set.contains(zegoUser)) {
                    addLiveUser(zegoUser);
                } else {
                    removeLiveUser(zegoUser);
                }
            }
        }
    }

    public void setIDGenerateCallback(ZegoRoomManagerIDGenerateCallback zegoRoomManagerIDGenerateCallback) {
        ZLog.i(TAG, "setIDGenerateCallback idGenerateCallback: " + zegoRoomManagerIDGenerateCallback, new Object[0]);
        this.mIDGenerateCallback = zegoRoomManagerIDGenerateCallback;
    }

    public void setLiveExtraInfo(String str) {
        ZLog.i(TAG, o00O00OO.OooO00o("setLiveExtraInfo extraInfo: ", str), new Object[0]);
        this.mZegoLiveRoom.updateStreamExtraInfo(str);
        setExtraInfo(str, this.mUserInfo);
    }

    public void setLiveVideoView(View view, int i, ZegoUser zegoUser) {
        ZLog.i(TAG, "setLiveVideoView liveVideoView: %1$s, viewMode: %2$s, forUser: %3$s, isOnlyAudio: %4$s", view, Integer.valueOf(i), zegoUser, Boolean.valueOf(this.isOnlyAudio));
        if (this.isOnlyAudio) {
            return;
        }
        if (zegoUser == null || this.mUserInfo.equals(zegoUser)) {
            this.mPreviewView = view;
            this.mPreviewViewMode = i;
            if (this.isPreview) {
                this.mZegoLiveRoom.setPreviewView(view);
                this.mZegoLiveRoom.setPreviewViewMode(i);
                return;
            }
            return;
        }
        ZegoUserLiveInfo zegoUserLiveInfoLiveInfoForUser = liveInfoForUser(zegoUser);
        if (zegoUserLiveInfoLiveInfoForUser == null) {
            return;
        }
        zegoUserLiveInfoLiveInfoForUser.mViewMode = i;
        zegoUserLiveInfoLiveInfoForUser.mVideoView = view;
        if (zegoUserLiveInfoLiveInfoForUser.mFirstFrame) {
            String strStreamIDForUser = streamIDForUser(zegoUser);
            this.mZegoLiveRoom.setViewMode(i, strStreamIDForUser);
            this.mZegoLiveRoom.updatePlayView(strStreamIDForUser, view);
        }
    }

    public void setReconnectInterval(long j) {
        ZLog.i(TAG, "setReconnectInterval mReconnectInterval: %1$s, reconnectInterval: %2$s", Long.valueOf(this.mReconnectInterval), Long.valueOf(j));
        if (this.mReconnectInterval != j) {
            this.mReconnectInterval = j;
        }
    }

    public void setReconnectTimeoutSec(int i) {
        ZLog.i(TAG, OooO00o.OooO00o("setReconnectTimeoutSec reconnectTimeoutSec: ", i), new Object[0]);
        this.mReconnectTimeoutSec = i;
    }

    public void setSoundLevelMonitor(boolean z) {
        ZLog.i(TAG, "setSoundLevelMonitor this.isSoundLevelMonitor: %1$s, isSoundLevelMonitor: %2$s", Boolean.valueOf(this.isSoundLevelMonitor), Boolean.valueOf(z));
        if (this.isSoundLevelMonitor == z) {
            return;
        }
        this.isSoundLevelMonitor = z;
        updateLiveRoomSoundLevelMonitorState();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0012 A[PHI: r0
      0x0012: PHI (r0v4 int) = (r0v1 int), (r0v2 int) binds: [B:3:0x0010, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSoundLevelMonitorCycle(int i) {
        ZLog.i(TAG, OooO00o.OooO00o("setSoundLevelMonitorCycle soundLevelMonitorCycle: ", i), new Object[0]);
        int i2 = BannerConfig.LOOP_TIME;
        if (i > 3000) {
            i = i2;
        } else {
            i2 = 100;
            if (i < 100) {
                i = i2;
            }
        }
        this.mSoundLevelMonitorCycle = i;
        ZegoSoundLevelMonitor.getInstance().setCycle(i);
    }

    public void setVolumeForUser(int i, ZegoUser zegoUser) {
        ZLog.i(TAG, "setVolumeForUser volume: %1$s, user: %2$s", Integer.valueOf(i), zegoUser);
        if (this.mUserInfo.equals(zegoUser)) {
            this.mZegoLiveRoom.setCaptureVolume(i);
            return;
        }
        ZegoStreamInfo zegoStreamInfoStreamForUser = streamForUser(zegoUser);
        if (zegoStreamInfoStreamForUser != null) {
            this.mZegoLiveRoom.setPlayVolume(i, zegoStreamInfoStreamForUser.streamID);
        }
    }

    public void startLive() {
        ZLog.i(TAG, "startLive mUserInfo: " + this.mUserInfo, new Object[0]);
        addLiveUser(this.mUserInfo);
    }

    public void startPreview() {
        ZLog.i(TAG, "startPreview isOnlyAudio: " + this.isOnlyAudio + " isPreview: " + this.isPreview, new Object[0]);
        if (this.isOnlyAudio || this.isPreview) {
            return;
        }
        this.mZegoLiveRoom.setPreviewViewMode(this.mPreviewViewMode);
        this.mZegoLiveRoom.setPreviewView(this.mPreviewView);
        this.mZegoLiveRoom.startPreview();
        this.isPreview = true;
    }

    public void stopLive() {
        ZLog.i(TAG, "stopLive mUserInfo: " + this.mUserInfo, new Object[0]);
        removeLiveUser(this.mUserInfo);
    }

    public void stopPreview() {
        ZLog.i(TAG, "stopPreview isOnlyAudio: " + this.isOnlyAudio + " isPreview: " + this.isPreview, new Object[0]);
        if (this.isOnlyAudio || !this.isPreview) {
            return;
        }
        this.mZegoLiveRoom.setPreviewView(null);
        this.mZegoLiveRoom.stopPreview();
        this.isPreview = false;
        updateCaptureFirstFrameIfNeed();
    }

    public String streamIDForUser(ZegoUser zegoUser) {
        ZegoUser zegoUser2 = this.mUserInfo;
        if (zegoUser2 != null && zegoUser2.equals(zegoUser)) {
            return getLiveIDWithUser(zegoUser);
        }
        ZegoStreamInfo zegoStreamInfoStreamForUser = streamForUser(zegoUser);
        if (zegoStreamInfoStreamForUser == null) {
            return null;
        }
        return zegoStreamInfoStreamForUser.streamID;
    }

    public ZegoUser userForStreamID(String str) {
        ZegoUser zegoUser = this.mUserInfo;
        if (zegoUser != null && streamIDForUser(zegoUser).equals(str)) {
            return this.mUserInfo;
        }
        for (ZegoStreamInfo zegoStreamInfo : this.mAllStreams) {
            if (zegoStreamInfo.streamID.equals(str)) {
                ZegoUser zegoUser2 = new ZegoUser();
                zegoUser2.userID = zegoStreamInfo.userID;
                zegoUser2.userName = zegoStreamInfo.userName;
                return zegoUser2;
            }
        }
        return null;
    }
}
