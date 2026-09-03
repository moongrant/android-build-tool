package com.zego.zegoliveroom;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.DocumentsContract;
import android.support.v4.media.OooO00o;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.youth.banner.config.BannerConfig;
import com.zego.zegoavkit2.ZegoStreamExtraPlayInfo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import com.zego.zegoavkit2.entities.ZegoCDNPublishTarget;
import com.zego.zegoavkit2.entities.ZegoStreamRelayCDNInfo;
import com.zego.zegoavkit2.utils.ZegoLogUtil;
import com.zego.zegoliveroom.callback.IZegoAVEngineCallback;
import com.zego.zegoliveroom.callback.IZegoAudioPostpCallback;
import com.zego.zegoliveroom.callback.IZegoAudioPrepCallback2;
import com.zego.zegoliveroom.callback.IZegoAudioProcCallback;
import com.zego.zegoliveroom.callback.IZegoAudioRecordCallback;
import com.zego.zegoliveroom.callback.IZegoAudioRecordCallback2;
import com.zego.zegoliveroom.callback.IZegoAudioRouteCallback;
import com.zego.zegoliveroom.callback.IZegoCheckAudioVADCallback;
import com.zego.zegoliveroom.callback.IZegoCustomCommandCallback;
import com.zego.zegoliveroom.callback.IZegoDeviceEventCallback;
import com.zego.zegoliveroom.callback.IZegoEndJoinLiveCallback;
import com.zego.zegoliveroom.callback.IZegoExperimentalAPICallback;
import com.zego.zegoliveroom.callback.IZegoInitSDKCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import com.zego.zegoliveroom.callback.IZegoLivePlayerCallback;
import com.zego.zegoliveroom.callback.IZegoLivePlayerCallback2;
import com.zego.zegoliveroom.callback.IZegoLivePublisherCallback;
import com.zego.zegoliveroom.callback.IZegoLivePublisherCallback2;
import com.zego.zegoliveroom.callback.IZegoLivePublisherExCallback;
import com.zego.zegoliveroom.callback.IZegoLogHookCallback;
import com.zego.zegoliveroom.callback.IZegoLogInfoCallback;
import com.zego.zegoliveroom.callback.IZegoLoginCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoNetTypeCallback;
import com.zego.zegoliveroom.callback.IZegoRealtimeSequentialDataCallback;
import com.zego.zegoliveroom.callback.IZegoResponseCallback;
import com.zego.zegoliveroom.callback.IZegoRoomCallback;
import com.zego.zegoliveroom.callback.IZegoRunLoopObserveCallback;
import com.zego.zegoliveroom.callback.IZegoSnapshotCompletionCallback;
import com.zego.zegoliveroom.callback.IZegoSnapshotCompletionCallback2;
import com.zego.zegoliveroom.callback.IZegoUpdatePublishTargetCallback;
import com.zego.zegoliveroom.callback.im.IZegoBigRoomMessageCallback;
import com.zego.zegoliveroom.callback.im.IZegoIMCallback;
import com.zego.zegoliveroom.callback.im.IZegoRoomMessageCallback;
import com.zego.zegoliveroom.constants.ZegoAvConfig;
import com.zego.zegoliveroom.constants.ZegoConstants;
import com.zego.zegoliveroom.entity.ZegoAudioFrame;
import com.zego.zegoliveroom.entity.ZegoAudioRecordConfig;
import com.zego.zegoliveroom.entity.ZegoBigRoomMessage;
import com.zego.zegoliveroom.entity.ZegoCodecCapabilityInfo;
import com.zego.zegoliveroom.entity.ZegoExtPrepSet;
import com.zego.zegoliveroom.entity.ZegoPlayStats;
import com.zego.zegoliveroom.entity.ZegoPlayStreamParams;
import com.zego.zegoliveroom.entity.ZegoPlayStreamQuality;
import com.zego.zegoliveroom.entity.ZegoPublishStreamParams;
import com.zego.zegoliveroom.entity.ZegoPublishStreamQuality;
import com.zego.zegoliveroom.entity.ZegoRoomInfo;
import com.zego.zegoliveroom.entity.ZegoRoomMessage;
import com.zego.zegoliveroom.entity.ZegoStreamInfo;
import com.zego.zegoliveroom.entity.ZegoUser;
import com.zego.zegoliveroom.entity.ZegoUserState;
import com.zego.zegoliveroom.utils.ZegoCommonUtils;
import com.zego.zegoliveroom.utils.zegoevent.ZegoEventManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes5.dex */
public final class ZegoLiveRoom implements ZegoLiveRoomJNI.IJniZegoLiveRoomCallback, ZegoLiveRoomJNI.IJniZegoIMCallback {
    private static final int DEFAULT_LOG_SIZE = 5242880;
    static SDKContext mContext;
    private static IZegoLogHookCallback mZegoLogHookCallback;
    private static String sLogPath;
    private Map<Integer, IZegoCustomCommandCallback> mMapCustomCommandCallback;
    private Map<Integer, IZegoEndJoinLiveCallback> mMapEndJoinLiveResponseCallback;
    private Map<Object, Object> mMapIMCallback;
    private Map<Integer, IZegoResponseCallback> mMapInviteJoinLiveResponseCallback;
    private Map<Integer, IZegoResponseCallback> mMapJoinLiveResponseCallback;
    private Map<String, IZegoSnapshotCompletionCallback> mMapStreamSnapshotCompletionCallback;
    private Map<Integer, IZegoUpdatePublishTargetCallback> mMapUpdatePublishTargetCallback;
    private Map<String, IZegoLoginCompletionCallback> mMapZegoLoginCompletionCallback;
    private volatile IZegoRoomCallback mZegoRoomCallback = null;
    private volatile IZegoRunLoopObserveCallback mZegoRunLoopObserveCallback = null;
    private volatile IZegoLivePlayerCallback mZegoLivePlayerCallback = null;
    private volatile IZegoInitSDKCompletionCallback mZegoInitSDKCallback = null;
    private volatile IZegoLivePublisherCallback mZegoLivePublisherCallback = null;
    private volatile IZegoLivePublisherCallback2 mZegoLivePublisherCallback2 = null;
    private volatile IZegoLivePublisherExCallback mZegoLivePublisherExCallback = null;
    private volatile IZegoAudioRecordCallback mZegoAudioRecordCallback = null;
    private volatile IZegoAudioRecordCallback2 mZegoAudioRecordCallback2 = null;
    private volatile IZegoAudioPrepCallback2 mZegoAudioPrepCB = null;
    private volatile IZegoAudioProcCallback mZegoAudioProcCB = null;
    private volatile IZegoAudioPostpCallback mZegoAudioPostpCB = null;
    private volatile IZegoExperimentalAPICallback mZegoExperimentalAPICB = null;
    private volatile IZegoDeviceEventCallback mZegoDeviceEventCallback = null;
    private volatile IZegoLiveEventCallback mZegoLiveEventCallback = null;
    private volatile IZegoIMCallback mZegoIMCallback = null;
    private volatile IZegoAVEngineCallback mZegoAVEngineCallback = null;
    private volatile IZegoLogInfoCallback mZegoLogInfoCallback = null;
    private volatile IZegoAudioRouteCallback mZegoAudioRouteCallback = null;
    private volatile IZegoNetTypeCallback mZegoNetTypeCallback = null;
    private volatile IZegoRealtimeSequentialDataCallback mZegoRealtimeSequentialDataCallback = null;
    private volatile IZegoCheckAudioVADCallback mZegoCheckAudioVADCallback = null;
    private volatile IZegoSnapshotCompletionCallback mPreviewSnapshotCompletionCallback = null;
    private volatile IZegoSnapshotCompletionCallback2 mPreviewSnapshotCompletionCallback2 = null;
    private Handler mUIHandler = new Handler(Looper.getMainLooper());

    public interface SDKContext {
        @NonNull
        Application getAppContext();

        @Nullable
        String getLogPath();

        @Nullable
        String getSoFullPath();
    }

    public interface SDKContextEx extends SDKContext {
        long getLogFileSize();

        IZegoLogHookCallback getLogHookCallback();

        @Nullable
        String getSubLogFolder();
    }

    public interface SDKContextEx2 extends SDKContextEx {
        @Nullable
        Uri getLogPathUri();
    }

    public ZegoLiveRoom() {
        this.mMapJoinLiveResponseCallback = null;
        this.mMapEndJoinLiveResponseCallback = null;
        this.mMapInviteJoinLiveResponseCallback = null;
        this.mMapZegoLoginCompletionCallback = null;
        this.mMapStreamSnapshotCompletionCallback = null;
        this.mMapIMCallback = null;
        this.mMapCustomCommandCallback = null;
        this.mMapUpdatePublishTargetCallback = null;
        this.mMapEndJoinLiveResponseCallback = new HashMap();
        this.mMapJoinLiveResponseCallback = new HashMap();
        this.mMapInviteJoinLiveResponseCallback = new HashMap();
        this.mMapZegoLoginCompletionCallback = new HashMap();
        this.mMapStreamSnapshotCompletionCallback = new HashMap();
        this.mMapIMCallback = new HashMap();
        this.mMapCustomCommandCallback = new HashMap();
        this.mMapUpdatePublishTargetCallback = new HashMap();
    }

    private static Uri _createFolder(Context context, Uri uri, String str) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, "vnd.android.document/directory", str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Uri _createSubFolder(Context context, Uri uri, String str) {
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split("/")) {
                if (uri == null) {
                    break;
                }
                if (!str2.isEmpty()) {
                    Uri uri_findFolder = _findFolder(context, uri, str2);
                    uri = uri_findFolder != null ? uri_findFolder : _createFolder(context, uri, str2);
                }
            }
        }
        return uri;
    }

    private static Uri _findFolder(Context context, Uri uri, String str) {
        Cursor cursorQuery = context.getContentResolver().query(DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri)), new String[]{"document_id", "_display_name"}, null, null, null);
        Uri uriBuildDocumentUriUsingTree = null;
        if (cursorQuery == null) {
            return null;
        }
        while (cursorQuery.moveToNext()) {
            if (cursorQuery.getString(cursorQuery.getColumnIndex("_display_name")).equalsIgnoreCase(str)) {
                uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(cursorQuery.getColumnIndex("document_id")));
                break;
            }
        }
        cursorQuery.close();
        return uriBuildDocumentUriUsingTree;
    }

    private boolean _initSDKInner(long j, byte[] bArr, Context context) {
        String str;
        if (!"6.10.1.21071".equals(version())) {
            throw new RuntimeException("[ZEGO] The version of SDK jar and native shared library (.so) does not match!");
        }
        if (j == 0) {
            str = "[Java_ZegoLiveRoom_initSDK] failed，appid is 0";
        } else {
            if (bArr == null) {
                ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_initSDK] will use token");
            }
            if (ZegoCommonUtils.isDeviceInBlackList()) {
                ZegoLiveRoomJNI.setAudioDeviceMode(2);
                ZegoLiveRoomJNI.enableAEC(true);
                ZegoLiveRoomJNI.enableNoiseSuppress(true);
            }
            if (ZegoLiveRoomJNI.initSDK((int) j, bArr, context, ZegoLiveRoom.class.getClassLoader())) {
                ZegoLiveRoomJNI.setZegoLiveRoomCallback(this);
                ZegoLiveRoomJNI.setZegoIMCallback(this);
                ZegoEventManager.getInstance().onActiveEvent(ZegoEventManager.ZEGO_EVENT_ID_INITSDK);
                return true;
            }
            str = "[Java_ZegoLiveRoom_initSDK], init failed";
        }
        ZegoLiveRoomJNI.logPrint(str);
        return false;
    }

    @Deprecated
    public static void _logPrint(int i, String str, Object... objArr) {
        String str2 = String.format(str, objArr);
        if (i == 0) {
            ZegoLiveRoomJNI.logPrint(str2);
            return;
        }
        if (1 != i) {
            if (2 != i) {
                return;
            } else {
                ZegoLiveRoomJNI.logPrint(str2);
            }
        }
        ZegoLiveRoomJNI.logPrintVerbose(str2);
    }

    public static void enableCheckPoc(boolean z) {
        ZegoLiveRoomJNI.enableCheckPoc(z);
    }

    private ZegoUser[] getListOfLegalUser(ZegoUser[] zegoUserArr) {
        ZegoUser[] zegoUserArr2 = null;
        if (zegoUserArr != null && zegoUserArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (ZegoUser zegoUser : zegoUserArr) {
                if (zegoUser != null && !TextUtils.isEmpty(zegoUser.userID) && !TextUtils.isEmpty(zegoUser.userName)) {
                    arrayList.add(zegoUser);
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                return null;
            }
            zegoUserArr2 = new ZegoUser[size];
            for (int i = 0; i < size; i++) {
                zegoUserArr2[i] = (ZegoUser) arrayList.get(i);
            }
        }
        return zegoUserArr2;
    }

    public static int getMaxPlayChannelCount() {
        return ZegoLiveRoomJNI.getMaxPlayChannelCount();
    }

    public static int getMaxPublishChannelCount() {
        return ZegoLiveRoomJNI.getMaxPublishChannelCount();
    }

    private static String getServiceUrl(String str) {
        return ZegoLiveRoomJNI.getServiceUrl(str);
    }

    private void removeAllRoomCallback() {
        this.mMapEndJoinLiveResponseCallback.clear();
        this.mMapJoinLiveResponseCallback.clear();
        this.mMapInviteJoinLiveResponseCallback.clear();
        this.mMapZegoLoginCompletionCallback.clear();
        this.mMapStreamSnapshotCompletionCallback.clear();
        this.mPreviewSnapshotCompletionCallback = null;
        this.mPreviewSnapshotCompletionCallback2 = null;
        this.mMapIMCallback.clear();
        this.mMapCustomCommandCallback.clear();
        this.mMapUpdatePublishTargetCallback.clear();
    }

    public static boolean requireHardwareDecoder(boolean z) {
        return ZegoLiveRoomJNI.requireHardwareDecoder(z, null);
    }

    public static boolean requireHardwareEncoder(boolean z) {
        return ZegoLiveRoomJNI.requireHardwareEncoder(z);
    }

    private static void setAlphaEnv(boolean z) {
        ZegoLiveRoomJNI.setAlphaEnv(z);
    }

    private boolean setAppOrientationInner(int i, int i2) {
        if (i >= 0 && i <= 3) {
            return ZegoLiveRoomJNI.setAppOrientation(i, i2);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setAppOrientationInner] failed, orientation is illegal");
        return false;
    }

    @TargetApi(23)
    public static boolean setAudioDevice(int i, String str) {
        if (i == 0 || i == 1) {
            return ZegoLiveRoomJNI.setAudioDevice(i, str);
        }
        Log.w("ZEGO", String.format("deviceType: %d invalid when setAudioDevice", Integer.valueOf(i)));
        return false;
    }

    public static void setAudioDeviceMode(int i) {
        if (ZegoCommonUtils.isDeviceInBlackList() && (1 == i || 4 == i || 5 == i || 8 == i)) {
            i = 2;
        }
        ZegoLiveRoomJNI.setAudioDeviceMode(i);
    }

    public static void setBusinessType(int i) {
        ZegoLiveRoomJNI.setBusinessType(i);
    }

    public static void setConfig(String str) {
        ZegoLiveRoomJNI.setConfig(str);
    }

    @TargetApi(21)
    public static boolean setDummyCaptureImagePath(Uri uri, int i) {
        return setDummyCaptureImagePath(uri == null ? "" : uri.toString(), i);
    }

    @Deprecated
    public static void setLogPath(String str) {
        sLogPath = str;
    }

    public static boolean setPlayQualityMonitorCycle(long j) {
        return ZegoLiveRoomJNI.setPlayQualityMonitorCycle(j);
    }

    public static boolean setPreviewWaterMarkRect(Rect rect) {
        return setPreviewWaterMarkRectInner(rect, 0);
    }

    private static boolean setPreviewWaterMarkRectInner(Rect rect, int i) {
        if (rect == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setPreviewWaterMarkRectInner] failed, rect is null");
            return false;
        }
        ZegoLiveRoomJNI.setPreviewWaterMarkRect(rect.left, rect.top, rect.right, rect.bottom, i);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016 A[PHI: r0
      0x0016: PHI (r0v8 java.lang.String) = (r0v2 java.lang.String), (r0v5 java.lang.String) binds: [B:6:0x0014, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    private void setPublishConfigInner(Map<String, Object> map, int i) {
        if (map == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setPublishConfigInner] invalid params, config is null");
            return;
        }
        String str = (String) map.get("publish_custom_target");
        if (TextUtils.isEmpty(str)) {
            str = (String) map.get(ZegoConstants.PublishConfig.PUBLISH_CUSTOM_TARGET);
            if (!TextUtils.isEmpty(str)) {
                ZegoLiveRoomJNI.setPublishConfig(str, i);
            }
        } else {
            ZegoLiveRoomJNI.setPublishConfig(str, i);
        }
        String str2 = (String) map.get("publish_cdn_target");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ZegoLiveRoomJNI.setCDNPublishTarget(str2, i);
    }

    public static boolean setPublishQualityMonitorCycle(long j) {
        return ZegoLiveRoomJNI.setPublishQualityMonitorCycle(j);
    }

    public static boolean setPublishWaterMarkRect(Rect rect) {
        return setPublishWaterMarkRectInner(rect, 0);
    }

    private static boolean setPublishWaterMarkRectInner(Rect rect, int i) {
        if (rect == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setPublishWaterMarkRectInner] failed, rect is null");
            return false;
        }
        ZegoLiveRoomJNI.setPublishWaterMarkRect(rect.left, rect.top, rect.right, rect.bottom, i);
        return true;
    }

    public static boolean setRoomMode(int i) {
        return ZegoLiveRoomJNI.setRoomMode(i);
    }

    public static int setSDKContext(SDKContext sDKContext) {
        long logFileSize;
        IZegoLogHookCallback logHookCallback;
        String subLogFolder;
        Uri logPathUri;
        mContext = sDKContext;
        Application appContext = sDKContext.getAppContext();
        int iEnsureSoLoaded = ZegoLiveRoomJNI.ensureSoLoaded(appContext, sDKContext.getSoFullPath());
        if (iEnsureSoLoaded < 0) {
            Log.e("Java_ZegoLiveRoom", "load zegoliveroom native library failed, errorCode: " + iEnsureSoLoaded);
        } else {
            String logPath = null;
            if (sDKContext instanceof SDKContextEx) {
                SDKContextEx sDKContextEx = (SDKContextEx) sDKContext;
                logFileSize = sDKContextEx.getLogFileSize();
                subLogFolder = sDKContextEx.getSubLogFolder();
                logHookCallback = sDKContextEx.getLogHookCallback();
            } else {
                logFileSize = 5242880;
                logHookCallback = null;
                subLogFolder = null;
            }
            if ((sDKContext instanceof SDKContextEx2) && (logPathUri = ((SDKContextEx2) sDKContext).getLogPathUri()) != null) {
                Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(logPathUri, DocumentsContract.getTreeDocumentId(logPathUri));
                if (subLogFolder != null) {
                    uriBuildDocumentUriUsingTree = _createSubFolder(appContext, uriBuildDocumentUriUsingTree, subLogFolder);
                } else {
                    logPath = subLogFolder;
                }
                subLogFolder = logPath;
                logPath = uriBuildDocumentUriUsingTree.toString();
            }
            if (logPath == null || logPath.length() == 0) {
                logPath = sDKContext.getLogPath();
            }
            if (logPath == null || logPath.length() == 0) {
                logPath = ZegoLogUtil.getLogPath(appContext);
            }
            if (logHookCallback != null) {
                mZegoLogHookCallback = logHookCallback;
                ZegoLiveRoomJNI.setLogHook();
            }
            ZegoLiveRoomJNI.setLogPathAndSize(logPath, logFileSize, subLogFolder, appContext);
        }
        if (iEnsureSoLoaded > 0) {
            ZegoLiveRoomJNI.logPrint(OooO00o.OooO00o("Java_ZegoLiveRoom_setSDKContext，reload zegoliveroom native library success with code: ", iEnsureSoLoaded));
        }
        return iEnsureSoLoaded;
    }

    public static void setTestEnv(boolean z) {
        ZegoLiveRoomJNI.setTestEnv(z);
    }

    public static boolean setUser(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "[Java_ZegoLiveRoom_setUser] failed, userID is empty";
        } else {
            if (!TextUtils.isEmpty(str2)) {
                return ZegoLiveRoomJNI.setUser(str, str2);
            }
            str3 = "[Java_ZegoLiveRoom_setUser] failed, userName is empty";
        }
        ZegoLiveRoomJNI.logPrint(str3);
        return false;
    }

    public static void setVerbose(boolean z) {
        ZegoLiveRoomJNI.setVerbose(z);
    }

    @TargetApi(21)
    public static boolean setWaterMarkImagePath(Uri uri) {
        if (uri != null) {
            return setWaterMarkImagePathInner(uri.toString(), 0);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setWaterMarkImagePath] failed, imageUri is null");
        return false;
    }

    private static boolean setWaterMarkImagePathInner(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setWaterMarkImagePathInner] failed, imagePath is empty");
            return false;
        }
        ZegoLiveRoomJNI.setWaterMarkImagePath(str, i);
        return true;
    }

    private boolean startPlayingStreamInner(String str, Object obj, ZegoStreamExtraPlayInfo zegoStreamExtraPlayInfo) {
        if (TextUtils.isEmpty(str)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_startPlayingStreamInner] failed, streamID is empty");
            return false;
        }
        if (zegoStreamExtraPlayInfo != null && TextUtils.isEmpty(zegoStreamExtraPlayInfo.params)) {
            zegoStreamExtraPlayInfo.params = "";
        }
        return ZegoLiveRoomJNI.startPlayingStream(str, obj, zegoStreamExtraPlayInfo);
    }

    private boolean startPublishInner(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return ZegoLiveRoomJNI.startPublishing(str, str2, i);
    }

    private boolean startPublishInner2(String str, String str2, int i, int i2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        if (TextUtils.isEmpty(str3) || ZegoLiveRoomJNI.updateStreamExtraInfo(str3, i2)) {
            return ZegoLiveRoomJNI.startPublishing2(str, str2, i, i2, str4);
        }
        return false;
    }

    private boolean startPublishInner3(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5) {
        String str6 = TextUtils.isEmpty(str) ? "" : str;
        String str7 = TextUtils.isEmpty(str2) ? "" : str2;
        String str8 = TextUtils.isEmpty(str4) ? "" : str4;
        String str9 = TextUtils.isEmpty(str5) ? "" : str5;
        if (!TextUtils.isEmpty(str3) && !ZegoLiveRoomJNI.updateStreamExtraInfo(str3, i3)) {
            return false;
        }
        return ZegoLiveRoomJNI.startPublishing3(str6, str7, i, i2, i3, str8, str9);
    }

    private boolean updateStreamExtraInfoInner(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return ZegoLiveRoomJNI.updateStreamExtraInfo(str, i);
    }

    public static void uploadLog() {
        ZegoLiveRoomJNI.uploadLog();
    }

    public static String version() {
        return ZegoLiveRoomJNI.version();
    }

    public static String version2() {
        return ZegoLiveRoomJNI.version2();
    }

    public int activateAllAudioPlayStream(boolean z) {
        return ZegoLiveRoomJNI.activateAllAudioPlayStream(z);
    }

    public int activateAllVideoPlayStream(boolean z) {
        return ZegoLiveRoomJNI.activateAllVideoPlayStream(z);
    }

    public int activateAudioPlayStream(String str, boolean z) {
        return ZegoLiveRoomJNI.activateAudioPlayStream(str, z);
    }

    public int activateVideoPlayStream(String str, boolean z) {
        return ZegoLiveRoomJNI.activateVideoPlayStream(str, z, -1);
    }

    public boolean addPublishTarget(String str, String str2, IZegoUpdatePublishTargetCallback iZegoUpdatePublishTargetCallback) {
        String strOooO00o;
        if (iZegoUpdatePublishTargetCallback == null) {
            strOooO00o = "[Java_ZegoLiveRoom_addPublishTarget] failed, callback is null";
        } else {
            int iAddPublishTarget = ZegoLiveRoomJNI.addPublishTarget(str, str2);
            if (iAddPublishTarget != -1) {
                if (this.mMapUpdatePublishTargetCallback.get(Integer.valueOf(iAddPublishTarget)) != null) {
                    ZegoLiveRoomJNI.logPrint(OooO00o.OooO00o("[Java_ZegoLiveRoom_addPublishTarget], unfinished add publish target, seq:", iAddPublishTarget));
                }
                this.mMapUpdatePublishTargetCallback.put(Integer.valueOf(iAddPublishTarget), iZegoUpdatePublishTargetCallback);
                return true;
            }
            strOooO00o = OooO00o.OooO00o("[Java_ZegoLiveRoom_addPublishTarget] failed, seq:", iAddPublishTarget);
        }
        ZegoLiveRoomJNI.logPrint(strOooO00o);
        return false;
    }

    public int callExperimentalAPI(String str) {
        return ZegoLiveRoomJNI.callExperimentalAPI(str);
    }

    public boolean deletePublishTarget(String str, String str2, IZegoUpdatePublishTargetCallback iZegoUpdatePublishTargetCallback) {
        String strOooO00o;
        if (iZegoUpdatePublishTargetCallback == null) {
            strOooO00o = "[Java_ZegoLiveRoom_deletePublishTarget] failed, callback is null";
        } else {
            int iDeletePublishTarget = ZegoLiveRoomJNI.deletePublishTarget(str, str2);
            if (iDeletePublishTarget != -1) {
                if (this.mMapUpdatePublishTargetCallback.get(Integer.valueOf(iDeletePublishTarget)) != null) {
                    ZegoLiveRoomJNI.logPrint(OooO00o.OooO00o("[Java_ZegoLiveRoom_deletePublishTarget], unfinished delete publish target, seq:", iDeletePublishTarget));
                }
                this.mMapUpdatePublishTargetCallback.put(Integer.valueOf(iDeletePublishTarget), iZegoUpdatePublishTargetCallback);
                return true;
            }
            strOooO00o = OooO00o.OooO00o("[Java_ZegoLiveRoom_deletePublishTarget] failed, seq:", iDeletePublishTarget);
        }
        ZegoLiveRoomJNI.logPrint(strOooO00o);
        return false;
    }

    public void enableAEC(boolean z) {
        ZegoLiveRoomJNI.enableAEC(z);
    }

    public void enableAECWhenHeadsetDetected(boolean z) {
        ZegoLiveRoomJNI.enableAECWhenHeadsetDetected(z);
    }

    public void enableAGC(boolean z) {
        ZegoLiveRoomJNI.enableAGC(z);
    }

    public void enableAudioPostp(boolean z, String str) {
        ZegoLiveRoomJNI.enableAudioPostp(z, str);
    }

    public void enableAudioPrepVADStableStateMonitor(boolean z) {
        ZegoLiveRoomJNI.enableAudioPrepVADStableStateMonitor(z, BannerConfig.LOOP_TIME);
    }

    public boolean enableBeautifying(int i) {
        return ZegoLiveRoomJNI.enableBeautifying(i, 0);
    }

    public boolean enableCamera(boolean z) {
        return ZegoLiveRoomJNI.enableCamera(z, 0);
    }

    public boolean enableCaptureMirror(boolean z) {
        return ZegoLiveRoomJNI.enableCaptureMirror(z, 0);
    }

    public void enableCapturedAudioVADStableStateMonitor(boolean z) {
        ZegoLiveRoomJNI.enableCapturedAudioVADStableStateMonitor(z, BannerConfig.LOOP_TIME);
    }

    public void enableDTX(boolean z) {
        ZegoLiveRoomJNI.enableDTX(z);
    }

    public boolean enableH265EncodeFallback(boolean z) {
        return ZegoLiveRoomJNI.enableH265EncodeFallback(z);
    }

    public boolean enableLoopback(boolean z) {
        return ZegoLiveRoomJNI.enableLoopback(z);
    }

    public boolean enableMic(boolean z) {
        return ZegoLiveRoomJNI.enableMic(z);
    }

    public boolean enableMicDevice(boolean z) {
        return ZegoLiveRoomJNI.enableMicDevice(z);
    }

    public boolean enableNoiseSuppress(boolean z) {
        return ZegoLiveRoomJNI.enableNoiseSuppress(z);
    }

    public boolean enablePlayVirtualStereo(boolean z, int i, String str) {
        return ZegoLiveRoomJNI.enablePlayVirtualStereo(z, i, str);
    }

    public boolean enablePreviewMirror(boolean z) {
        return ZegoLiveRoomJNI.enablePreviewMirror(z, 0);
    }

    @Deprecated
    public int enablePublishStreamAlignment(boolean z) {
        return ZegoLiveRoomJNI.setStreamAlignmentProperty(z ? 1 : 0, -1);
    }

    public boolean enableRateControl(boolean z) {
        return ZegoLiveRoomJNI.enableRateControl(z, 0);
    }

    public void enableScreenCaptureEncodeOptimization(boolean z, int i) {
        ZegoLiveRoomJNI.enableScreenCaptureEncodeOptimization(z, i);
    }

    @Deprecated
    public boolean enableSelectedAudioRecord(int i, int i2) {
        return ZegoLiveRoomJNI.enableSelectedAudioRecord(i, i2, 1);
    }

    public boolean enableSpeaker(boolean z) {
        return ZegoLiveRoomJNI.enableSpeaker(z);
    }

    public boolean enableTorch(boolean z) {
        return ZegoLiveRoomJNI.enableTorch(z, 0);
    }

    public void enableTrafficControl(int i, boolean z) {
        ZegoLiveRoomJNI.enableTrafficControl(i, z, 0);
    }

    public boolean enableTransientNoiseSuppress(boolean z) {
        return ZegoLiveRoomJNI.enableTransientNoiseSuppress(z);
    }

    public void enableVAD(boolean z) {
        ZegoLiveRoomJNI.enableVAD(z);
    }

    public boolean enableViewMirror(boolean z, String str) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.enableViewMirror(z, str);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_enableViewMirror] failed, streamID is empty");
        return false;
    }

    public boolean endJoinLive(String str, IZegoEndJoinLiveCallback iZegoEndJoinLiveCallback) {
        return endJoinLive(str, null, iZegoEndJoinLiveCallback);
    }

    public int getAudioRouteType() {
        return ZegoLiveRoomJNI.getAudioRouteType();
    }

    public float getCaptureSoundLevel() {
        return ZegoLiveRoomJNI.getCaptureSoundLevel();
    }

    public float getSoundLevelOfStream(String str) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.getSoundLevelOfStream(str);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_getSoundLevelOfStream] failed, streamID is empty");
        return 0.0f;
    }

    public ZegoUser getUserByStreamID(String str) {
        return ZegoLiveRoomJNI.getUserByStreamID(str);
    }

    public ZegoCodecCapabilityInfo[] getVideoCodecCapabilityList() {
        String videoCodecCapabilityList = ZegoLiveRoomJNI.getVideoCodecCapabilityList();
        if (videoCodecCapabilityList == null || videoCodecCapabilityList.length() == 0) {
            return new ZegoCodecCapabilityInfo[0];
        }
        String[] strArrSplit = videoCodecCapabilityList.split(";");
        ZegoCodecCapabilityInfo[] zegoCodecCapabilityInfoArr = new ZegoCodecCapabilityInfo[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split(",");
            ZegoCodecCapabilityInfo zegoCodecCapabilityInfo = new ZegoCodecCapabilityInfo();
            zegoCodecCapabilityInfoArr[i] = zegoCodecCapabilityInfo;
            zegoCodecCapabilityInfo.codecId = Integer.parseInt(strArrSplit2[0]);
            zegoCodecCapabilityInfoArr[i].isHardware = Integer.parseInt(strArrSplit2[1]);
        }
        return zegoCodecCapabilityInfoArr;
    }

    public boolean initSDK(long j, byte[] bArr) {
        return initSDK(j, bArr, (IZegoInitSDKCompletionCallback) null);
    }

    public boolean inviteJoinLive(String str, IZegoResponseCallback iZegoResponseCallback) {
        return inviteJoinLive(str, null, iZegoResponseCallback);
    }

    public boolean isVideoDecoderSupported(int i) {
        return ZegoLiveRoomJNI.isVideoDecoderSupported(i);
    }

    public boolean isVideoEncoderSupported(int i) {
        return ZegoLiveRoomJNI.isVideoEncoderSupported(i);
    }

    public boolean loginRoom(String str, int i, IZegoLoginCompletionCallback iZegoLoginCompletionCallback) {
        return loginRoom(str, "", i, iZegoLoginCompletionCallback);
    }

    public boolean logoutRoom() {
        boolean zLogoutRoom = logoutRoom(null);
        if (zLogoutRoom) {
            removeAllRoomCallback();
        }
        return zLogoutRoom;
    }

    public int muteAudioPublish(boolean z) {
        return muteAudioPublish(z, 0);
    }

    public int muteVideoPublish(boolean z) {
        return muteVideoPublish(z, 0);
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onAVEngineStart() {
        final IZegoAVEngineCallback iZegoAVEngineCallback = this.mZegoAVEngineCallback;
        if (iZegoAVEngineCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.54
                @Override // java.lang.Runnable
                public void run() {
                    iZegoAVEngineCallback.onAVEngineStart();
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onAVEngineStop() {
        final IZegoAVEngineCallback iZegoAVEngineCallback = this.mZegoAVEngineCallback;
        if (iZegoAVEngineCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.55
                @Override // java.lang.Runnable
                public void run() {
                    iZegoAVEngineCallback.onAVEngineStop();
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public ZegoAudioFrame onAudioPostp(ZegoAudioFrame zegoAudioFrame, String str) {
        IZegoAudioPostpCallback iZegoAudioPostpCallback = this.mZegoAudioPostpCB;
        return iZegoAudioPostpCallback != null ? iZegoAudioPostpCallback.onAudioPostp(zegoAudioFrame, str) : zegoAudioFrame;
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public ZegoAudioFrame onAudioPrep(ZegoAudioFrame zegoAudioFrame) {
        IZegoAudioPrepCallback2 iZegoAudioPrepCallback2 = this.mZegoAudioPrepCB;
        return iZegoAudioPrepCallback2 != null ? iZegoAudioPrepCallback2.onAudioPrep(zegoAudioFrame) : zegoAudioFrame;
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onAudioPrepVADStateUpdate(final int i) {
        final IZegoCheckAudioVADCallback iZegoCheckAudioVADCallback = this.mZegoCheckAudioVADCallback;
        if (iZegoCheckAudioVADCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.69
                @Override // java.lang.Runnable
                public void run() {
                    iZegoCheckAudioVADCallback.onAudioPrepVADStateUpdate(i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public ZegoAudioFrame onAudioProc(ZegoAudioFrame zegoAudioFrame) {
        IZegoAudioProcCallback iZegoAudioProcCallback = this.mZegoAudioProcCB;
        return iZegoAudioProcCallback != null ? iZegoAudioProcCallback.onAudioProc(zegoAudioFrame) : zegoAudioFrame;
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onAudioRecordCallback(final byte[] bArr, final int i, final int i2, final int i3, final int i4) {
        final IZegoAudioRecordCallback2 iZegoAudioRecordCallback2 = this.mZegoAudioRecordCallback2;
        if (iZegoAudioRecordCallback2 != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.47
                @Override // java.lang.Runnable
                public void run() {
                    iZegoAudioRecordCallback2.onAudioRecordCallback(bArr, i, i2, i3, i4);
                }
            });
            return;
        }
        final IZegoAudioRecordCallback iZegoAudioRecordCallback = this.mZegoAudioRecordCallback;
        if (iZegoAudioRecordCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.48
                @Override // java.lang.Runnable
                public void run() {
                    iZegoAudioRecordCallback.onAudioRecordCallback(bArr, i, i2, i3);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onAudioRouteChange(final int i) {
        final IZegoAudioRouteCallback iZegoAudioRouteCallback = this.mZegoAudioRouteCallback;
        if (iZegoAudioRouteCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.62
                @Override // java.lang.Runnable
                public void run() {
                    iZegoAudioRouteCallback.onAudioRouteChange(i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onCaptureAudioFirstFrame() {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.41
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback.onCaptureAudioFirstFrame();
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onCaptureVideoFirstFrame() {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.36
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback.onCaptureVideoFirstFrame();
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onCaptureVideoSizeChanged(final int i, final int i2) {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.34
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback.onCaptureVideoSizeChangedTo(i, i2);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onCapturedAudioVADStateUpdate(final int i) {
        final IZegoCheckAudioVADCallback iZegoCheckAudioVADCallback = this.mZegoCheckAudioVADCallback;
        if (iZegoCheckAudioVADCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.68
                @Override // java.lang.Runnable
                public void run() {
                    iZegoCheckAudioVADCallback.onCapturedAudioVADStateUpdate(i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onCustomCommand(final int i, int i2, final String str) {
        final IZegoCustomCommandCallback iZegoCustomCommandCallback = this.mMapCustomCommandCallback.get(Integer.valueOf(i2));
        if (iZegoCustomCommandCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.50
                @Override // java.lang.Runnable
                public void run() {
                    iZegoCustomCommandCallback.onSendCustomCommand(i, str);
                }
            });
            this.mMapCustomCommandCallback.remove(Integer.valueOf(i2));
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onDeviceError(final String str, final int i) {
        final IZegoDeviceEventCallback iZegoDeviceEventCallback = this.mZegoDeviceEventCallback;
        if (iZegoDeviceEventCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.46
                @Override // java.lang.Runnable
                public void run() {
                    iZegoDeviceEventCallback.onDeviceError(str, i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onDisconnect(final int i, final String str) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.7
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRoomCallback.onDisconnect(i, str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onEndJoinLive(final int i, int i2, final String str) {
        final IZegoEndJoinLiveCallback iZegoEndJoinLiveCallbackRemove = this.mMapEndJoinLiveResponseCallback.remove(Integer.valueOf(i2));
        if (iZegoEndJoinLiveCallbackRemove != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.32
                @Override // java.lang.Runnable
                public void run() {
                    iZegoEndJoinLiveCallbackRemove.onEndJoinLive(i, str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onExperimentalAPICallback(final String str) {
        final IZegoExperimentalAPICallback iZegoExperimentalAPICallback = this.mZegoExperimentalAPICB;
        if (iZegoExperimentalAPICallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.49
                @Override // java.lang.Runnable
                public void run() {
                    iZegoExperimentalAPICallback.onExperimentalAPICallback(str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onInitSDK(final int i) {
        final IZegoInitSDKCompletionCallback iZegoInitSDKCompletionCallback = this.mZegoInitSDKCallback;
        if (iZegoInitSDKCompletionCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.1
                @Override // java.lang.Runnable
                public void run() {
                    iZegoInitSDKCompletionCallback.onInitSDK(i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onInviteJoinLiveRequest(final int i, final String str, final String str2, final String str3) {
        final IZegoLivePlayerCallback iZegoLivePlayerCallback = this.mZegoLivePlayerCallback;
        if (iZegoLivePlayerCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.17
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePlayerCallback.onInviteJoinLiveRequest(i, str, str2, str3);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onInviteJoinLiveResponse(final int i, final String str, final String str2, int i2) {
        final IZegoResponseCallback iZegoResponseCallbackRemove = this.mMapInviteJoinLiveResponseCallback.remove(Integer.valueOf(i2));
        if (iZegoResponseCallbackRemove != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.31
                @Override // java.lang.Runnable
                public void run() {
                    iZegoResponseCallbackRemove.onResponse(i, str, str2);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onJoinLiveRequest(final int i, final String str, final String str2, final String str3) {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.30
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback.onJoinLiveRequest(i, str, str2, str3);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onJoinLiveResponse(final int i, final String str, final String str2, int i2) {
        final IZegoResponseCallback iZegoResponseCallbackRemove = this.mMapJoinLiveResponseCallback.remove(Integer.valueOf(i2));
        if (iZegoResponseCallbackRemove != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.16
                @Override // java.lang.Runnable
                public void run() {
                    iZegoResponseCallbackRemove.onResponse(i, str, str2);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onKickOut(final int i, final String str, final String str2) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.6
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRoomCallback.onKickOut(i, str, str2);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onLiveEvent(final int i, final HashMap<String, String> map) {
        final IZegoLiveEventCallback iZegoLiveEventCallback = this.mZegoLiveEventCallback;
        if (iZegoLiveEventCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.44
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLiveEventCallback.onLiveEvent(i, map);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onLogHook(String str) {
        IZegoLogHookCallback iZegoLogHookCallback = mZegoLogHookCallback;
        if (iZegoLogHookCallback != null) {
            iZegoLogHookCallback.onLogHook(str);
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onLogUploadResult(final int i) {
        final IZegoLogInfoCallback iZegoLogInfoCallback = this.mZegoLogInfoCallback;
        if (iZegoLogInfoCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.3
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLogInfoCallback.onLogUploadResult(i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onLogWillOverwrite() {
        final IZegoLogInfoCallback iZegoLogInfoCallback = this.mZegoLogInfoCallback;
        if (iZegoLogInfoCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.2
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLogInfoCallback.onLogWillOverwrite();
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onLoginRoom(final int i, String str, final ZegoStreamInfo[] zegoStreamInfoArr) {
        final IZegoLoginCompletionCallback iZegoLoginCompletionCallback = this.mMapZegoLoginCompletionCallback.get(str);
        this.mMapZegoLoginCompletionCallback.remove(str);
        if (iZegoLoginCompletionCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.5
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLoginCompletionCallback.onLoginCompletion(i, zegoStreamInfoArr);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onNetTypeChange(final int i) {
        final IZegoNetTypeCallback iZegoNetTypeCallback = this.mZegoNetTypeCallback;
        if (iZegoNetTypeCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.63
                @Override // java.lang.Runnable
                public void run() {
                    iZegoNetTypeCallback.onNetTypeChange(i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onNetworkQuality(final String str, final int i, final int i2) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.52
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRoomCallback.onNetworkQuality(str, i, i2);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onPlayQualityUpdate(final String str, final ZegoPlayStreamQuality zegoPlayStreamQuality) {
        final IZegoLivePlayerCallback iZegoLivePlayerCallback = this.mZegoLivePlayerCallback;
        if (iZegoLivePlayerCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.14
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePlayerCallback.onPlayQualityUpdate(str, zegoPlayStreamQuality);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onPlayStateUpdate(final int i, final String str) {
        final IZegoLivePlayerCallback iZegoLivePlayerCallback = this.mZegoLivePlayerCallback;
        if (iZegoLivePlayerCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.13
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePlayerCallback.onPlayStateUpdate(i, str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onPlayStatsUpdate(final ZegoPlayStats zegoPlayStats) {
        final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2;
        if (!(this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) || (iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback) == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.15
            @Override // java.lang.Runnable
            public void run() {
                iZegoLivePlayerCallback2.onPlayStatsUpdate(zegoPlayStats);
            }
        });
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onPreviewSnapshot(final int i, final Bitmap bitmap) {
        final IZegoSnapshotCompletionCallback2 iZegoSnapshotCompletionCallback2 = this.mPreviewSnapshotCompletionCallback2;
        if (iZegoSnapshotCompletionCallback2 != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.43
                @Override // java.lang.Runnable
                public void run() {
                    iZegoSnapshotCompletionCallback2.onZegoSnapshotCompletion(i, bitmap);
                }
            });
            this.mPreviewSnapshotCompletionCallback2 = null;
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onPreviewVideoFirstFrame(final int i) {
        final IZegoLivePublisherCallback2 iZegoLivePublisherCallback2 = this.mZegoLivePublisherCallback2;
        if (iZegoLivePublisherCallback2 != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.38
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback2.onPreviewVideoFirstFrame(i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onPublishQulityUpdate(final String str, final ZegoPublishStreamQuality zegoPublishStreamQuality) {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.33
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback.onPublishQualityUpdate(str, zegoPublishStreamQuality);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onPublishStateUpdate(final int i, final String str, final HashMap<String, Object> map) {
        final IZegoLivePublisherCallback iZegoLivePublisherCallback = this.mZegoLivePublisherCallback;
        if (iZegoLivePublisherCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.27
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback.onPublishStateUpdate(i, str, map);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onReconnect(final int i, final String str) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.8
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRoomCallback.onReconnect(i, str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoIMCallback
    public void onRecvBigRoomMessage(final String str, final ZegoBigRoomMessage[] zegoBigRoomMessageArr) {
        final IZegoIMCallback iZegoIMCallback = this.mZegoIMCallback;
        if (iZegoIMCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.61
                @Override // java.lang.Runnable
                public void run() {
                    iZegoIMCallback.onRecvBigRoomMessage(str, zegoBigRoomMessageArr);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRecvCustomCommand(final String str, final String str2, final String str3, final String str4) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.51
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRoomCallback.onRecvCustomCommand(str, str2, str3, str4);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRecvEndJoinLiveCommand(final String str, final String str2, final String str3) {
        final IZegoLivePlayerCallback iZegoLivePlayerCallback = this.mZegoLivePlayerCallback;
        if (iZegoLivePlayerCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.18
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePlayerCallback.onRecvEndJoinLiveCommand(str, str2, str3);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRecvRealtimeSequentialData(ByteBuffer byteBuffer, String str) {
        IZegoRealtimeSequentialDataCallback iZegoRealtimeSequentialDataCallback = this.mZegoRealtimeSequentialDataCallback;
        if (iZegoRealtimeSequentialDataCallback != null) {
            iZegoRealtimeSequentialDataCallback.onRecvRealtimeSequentialData(byteBuffer, str);
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRecvRemoteAudioFirstFrame(final String str) {
        final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2;
        if (!(this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) || (iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback) == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.23
            @Override // java.lang.Runnable
            public void run() {
                iZegoLivePlayerCallback2.onRecvRemoteAudioFirstFrame(str);
            }
        });
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRecvRemoteVideoFirstFrame(final String str) {
        final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2;
        if (!(this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) || (iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback) == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.24
            @Override // java.lang.Runnable
            public void run() {
                iZegoLivePlayerCallback2.onRecvRemoteVideoFirstFrame(str);
            }
        });
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoIMCallback
    public void onRecvRoomMessage(final String str, final ZegoRoomMessage[] zegoRoomMessageArr) {
        final IZegoIMCallback iZegoIMCallback = this.mZegoIMCallback;
        if (iZegoIMCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.60
                @Override // java.lang.Runnable
                public void run() {
                    iZegoIMCallback.onRecvRoomMessage(str, zegoRoomMessageArr);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRelayCDNStateUpdate(final ZegoStreamRelayCDNInfo[] zegoStreamRelayCDNInfoArr, final String str) {
        final IZegoLivePublisherExCallback iZegoLivePublisherExCallback = this.mZegoLivePublisherExCallback;
        if (iZegoLivePublisherExCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.28
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherExCallback.onRelayCDNStateUpdate(zegoStreamRelayCDNInfoArr, str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRemoteCameraStatusUpdate(final String str, final int i, final int i2) {
        final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2;
        if (!(this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) || (iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback) == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.20
            @Override // java.lang.Runnable
            public void run() {
                iZegoLivePlayerCallback2.onRemoteCameraStatusUpdate(str, i, i2);
            }
        });
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRemoteMicStatusUpdate(final String str, final int i, final int i2) {
        final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2;
        if (!(this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) || (iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback) == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.21
            @Override // java.lang.Runnable
            public void run() {
                iZegoLivePlayerCallback2.onRemoteMicStatusUpdate(str, i, i2);
            }
        });
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRemoteSpeakerStatusUpdate(final String str, final int i, final int i2) {
        final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2;
        if (!(this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) || (iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback) == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.22
            @Override // java.lang.Runnable
            public void run() {
                iZegoLivePlayerCallback2.onRemoteSpeakerStatusUpdate(str, i, i2);
            }
        });
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRenderRemoteVideoFirstFrame(final String str) {
        final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2;
        if (!(this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) || (iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback) == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.25
            @Override // java.lang.Runnable
            public void run() {
                iZegoLivePlayerCallback2.onRenderRemoteVideoFirstFrame(str);
            }
        });
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRoomInfoUpdated(final ZegoRoomInfo zegoRoomInfo, final String str) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.10
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRoomCallback.onRoomInfoUpdated(zegoRoomInfo, str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onRunLoopObserveCallback(final long j, final int i, final int i2, final int i3, final int i4) {
        final IZegoRunLoopObserveCallback iZegoRunLoopObserveCallback = this.mZegoRunLoopObserveCallback;
        if (iZegoRunLoopObserveCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.4
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRunLoopObserveCallback.onRunLoopObserveCallback(j, i, i2, i3, i4);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoIMCallback
    public void onSendBigRoomMessage(final int i, final String str, int i2, final String str2) {
        final IZegoBigRoomMessageCallback iZegoBigRoomMessageCallback = (IZegoBigRoomMessageCallback) this.mMapIMCallback.get(Integer.valueOf(i2));
        if (iZegoBigRoomMessageCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.59
                @Override // java.lang.Runnable
                public void run() {
                    iZegoBigRoomMessageCallback.onSendBigRoomMessage(i, str, str2);
                }
            });
            this.mMapIMCallback.remove(Integer.valueOf(i2));
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onSendLocalAudioFirstFrame(final int i) {
        final IZegoLivePublisherCallback2 iZegoLivePublisherCallback2 = this.mZegoLivePublisherCallback2;
        if (iZegoLivePublisherCallback2 != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.39
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback2.onSendLocalAudioFirstFrame(i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onSendLocalVideoFirstFrame(final int i) {
        final IZegoLivePublisherCallback2 iZegoLivePublisherCallback2 = this.mZegoLivePublisherCallback2;
        if (iZegoLivePublisherCallback2 != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.40
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback2.onSendLocalVideoFirstFrame(i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onSendRealtimeSequentialData(final int i, final int i2) {
        final IZegoRealtimeSequentialDataCallback iZegoRealtimeSequentialDataCallback = this.mZegoRealtimeSequentialDataCallback;
        if (iZegoRealtimeSequentialDataCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.64
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRealtimeSequentialDataCallback.onSendRealtimeSequentialData(i, i2);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoIMCallback
    public void onSendRoomMessage(final int i, final String str, int i2, final long j) {
        final IZegoRoomMessageCallback iZegoRoomMessageCallback = (IZegoRoomMessageCallback) this.mMapIMCallback.get(Integer.valueOf(i2));
        if (iZegoRoomMessageCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.58
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRoomMessageCallback.onSendRoomMessage(i, str, j);
                }
            });
            this.mMapIMCallback.remove(Integer.valueOf(i2));
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onSnapshot(final Bitmap bitmap, String str) {
        final IZegoSnapshotCompletionCallback iZegoSnapshotCompletionCallback = this.mMapStreamSnapshotCompletionCallback.get(str);
        if (iZegoSnapshotCompletionCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.26
                @Override // java.lang.Runnable
                public void run() {
                    iZegoSnapshotCompletionCallback.onZegoSnapshotCompletion(bitmap);
                }
            });
            this.mMapStreamSnapshotCompletionCallback.remove(str);
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onStreamEvent(final int i, final String str, final HashMap<String, String> map) {
        final IZegoLiveEventCallback iZegoLiveEventCallback = this.mZegoLiveEventCallback;
        if (iZegoLiveEventCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.45
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLiveEventCallback.onStreamEvent(i, str, map);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onStreamExtraInfoUpdated(final ZegoStreamInfo[] zegoStreamInfoArr, final String str) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.12
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRoomCallback.onStreamExtraInfoUpdated(zegoStreamInfoArr, str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onStreamUpdated(final int i, final ZegoStreamInfo[] zegoStreamInfoArr, final String str) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.11
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRoomCallback.onStreamUpdated(i, zegoStreamInfoArr, str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onTempBroken(final int i, final String str) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.9
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRoomCallback.onTempBroken(i, str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onTokenWillExpired(final String str, final int i) {
        final IZegoRoomCallback iZegoRoomCallback = this.mZegoRoomCallback;
        if (iZegoRoomCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.53
                @Override // java.lang.Runnable
                public void run() {
                    iZegoRoomCallback.onTokenWillExpired(str, i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoIMCallback
    public void onUpdateOnlineCount(final String str, final int i) {
        final IZegoIMCallback iZegoIMCallback = this.mZegoIMCallback;
        if (iZegoIMCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.57
                @Override // java.lang.Runnable
                public void run() {
                    iZegoIMCallback.onUpdateOnlineCount(str, i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onUpdatePublishTargetState(final int i, final String str, int i2) {
        final IZegoUpdatePublishTargetCallback iZegoUpdatePublishTargetCallbackRemove = this.mMapUpdatePublishTargetCallback.remove(Integer.valueOf(i2));
        if (iZegoUpdatePublishTargetCallbackRemove != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.29
                @Override // java.lang.Runnable
                public void run() {
                    iZegoUpdatePublishTargetCallbackRemove.onUpdatePublishTargetState(i, str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoIMCallback
    public void onUserUpdate(final ZegoUserState[] zegoUserStateArr, final int i, final String str) {
        final IZegoIMCallback iZegoIMCallback = this.mZegoIMCallback;
        if (iZegoIMCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.56
                @Override // java.lang.Runnable
                public void run() {
                    iZegoIMCallback.onUserUpdate(zegoUserStateArr, i, str);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onVideoDecoderError(final int i, final int i2, final String str) {
        final IZegoLivePlayerCallback2 iZegoLivePlayerCallback2;
        if (!(this.mZegoLivePlayerCallback instanceof IZegoLivePlayerCallback2) || (iZegoLivePlayerCallback2 = (IZegoLivePlayerCallback2) this.mZegoLivePlayerCallback) == null) {
            return;
        }
        this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.66
            @Override // java.lang.Runnable
            public void run() {
                iZegoLivePlayerCallback2.onVideoDecoderError(i, i2, str);
            }
        });
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onVideoEncoderChanged(final int i, final int i2, final int i3) {
        final IZegoLivePublisherCallback2 iZegoLivePublisherCallback2 = this.mZegoLivePublisherCallback2;
        if (iZegoLivePublisherCallback2 != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.67
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback2.onVideoEncoderChanged(i, i2, i3);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onVideoEncoderError(final int i, final int i2, final int i3) {
        final IZegoLivePublisherCallback2 iZegoLivePublisherCallback2 = this.mZegoLivePublisherCallback2;
        if (iZegoLivePublisherCallback2 != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.65
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback2.onVideoEncoderError(i, i2, i3);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onVideoSizeChanged(final String str, final int i, final int i2) {
        final IZegoLivePlayerCallback iZegoLivePlayerCallback = this.mZegoLivePlayerCallback;
        if (iZegoLivePlayerCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.19
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePlayerCallback.onVideoSizeChangedTo(str, i, i2);
                }
            });
        }
    }

    public void pauseModule(int i) {
        ZegoLiveRoomJNI.pauseModule(i);
    }

    public boolean requestJoinLive(IZegoResponseCallback iZegoResponseCallback) {
        return requestJoinLive(null, iZegoResponseCallback);
    }

    public boolean requireHardwareDecoderByStream(boolean z, String str) {
        return ZegoLiveRoomJNI.requireHardwareDecoder(z, str);
    }

    public boolean requireHardwareEncoderByChannel(boolean z, int i) {
        return ZegoLiveRoomJNI.requireHardwareEncoderByChannel(z, i);
    }

    public boolean respondInviteJoinLiveReq(int i, int i2) {
        return respondInviteJoinLiveReq(i, i2, null);
    }

    public boolean respondJoinLiveReq(int i, int i2) {
        return respondJoinLiveReq(i, i2, null);
    }

    public void resumeModule(int i) {
        ZegoLiveRoomJNI.resumeModule(i);
    }

    public boolean sendBigRoomMessage(int i, int i2, String str, IZegoBigRoomMessageCallback iZegoBigRoomMessageCallback) {
        return sendBigRoomMessage(i, i2, str, null, iZegoBigRoomMessageCallback);
    }

    public boolean sendCustomCommand(ZegoUser[] zegoUserArr, String str, IZegoCustomCommandCallback iZegoCustomCommandCallback) {
        return sendCustomCommand(zegoUserArr, str, null, iZegoCustomCommandCallback);
    }

    public int sendRealtimeSequentialData(ByteBuffer byteBuffer, int i) {
        return ZegoLiveRoomJNI.sendRealtimeSequentialData(byteBuffer, byteBuffer.limit(), i);
    }

    public boolean sendRoomMessage(int i, int i2, String str, IZegoRoomMessageCallback iZegoRoomMessageCallback) {
        return sendRoomMessage(i, i2, str, null, iZegoRoomMessageCallback);
    }

    public void setAECMode(int i) {
        ZegoLiveRoomJNI.setAECMode(i);
    }

    public boolean setAVConfig(ZegoAvConfig zegoAvConfig) {
        return setAVConfigInner(zegoAvConfig, 0);
    }

    public boolean setAVConfigInner(ZegoAvConfig zegoAvConfig, int i) {
        if (zegoAvConfig == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setAVConfigInner] failed, config is null");
            return false;
        }
        return ZegoLiveRoomJNI.setVideoCaptureResolution(zegoAvConfig.getVideoCaptureResolutionWidth(), zegoAvConfig.getVideoCaptureResolutionHeight(), i) & ZegoLiveRoomJNI.setVideoFPS(zegoAvConfig.getVideoFPS(), i) & true & ZegoLiveRoomJNI.setVideoBitrate(zegoAvConfig.getVideoBitrate(), i) & ZegoLiveRoomJNI.setVideoEncodeResolution(zegoAvConfig.getVideoEncodeResolutionWidth(), zegoAvConfig.getVideoEncodeResolutionHeight(), i);
    }

    public boolean setAppOrientation(int i) {
        return setAppOrientationInner(i, 0);
    }

    public boolean setAudioBitrate(int i) {
        return ZegoLiveRoomJNI.setAudioBitrate(i, 0);
    }

    public void setAudioCaptureShiftOnMix(int i) {
        ZegoLiveRoomJNI.setAudioCaptureShiftOnMix(i);
    }

    public void setAudioChannelCount(int i) {
        ZegoLiveRoomJNI.setAudioChannelCount(i);
    }

    public void setAudioChannelCountByChannel(int i, int i2) {
        ZegoLiveRoomJNI.setAudioChannelCountByChannel(i, i2);
    }

    @Deprecated
    public boolean setAudioEqualizerGain(int i, float f) {
        String str;
        try {
            return ((Boolean) ZegoAudioProcessing.class.getMethod("setAudioEqualizerGain", Integer.TYPE, Float.TYPE).invoke(null, Integer.valueOf(i), Float.valueOf(f))).booleanValue();
        } catch (ClassNotFoundException e) {
            e = e;
            str = "setAudioEqualizerGain not implement";
            Log.e("ZEGO", str, e);
            return false;
        } catch (Throwable th) {
            e = th;
            str = "setAudioEqualizerGain failed";
            Log.e("ZEGO", str, e);
            return false;
        }
    }

    public boolean setAudioMixMode(int i, List<String> list) {
        return ZegoLiveRoomJNI.setAudioMixMode(i, list);
    }

    public void setAudioPostpCallback(IZegoAudioPostpCallback iZegoAudioPostpCallback, ZegoExtPrepSet zegoExtPrepSet) {
        this.mZegoAudioPostpCB = iZegoAudioPostpCallback;
        ZegoLiveRoomJNI.setAudioPostpCallback(iZegoAudioPostpCallback != null, zegoExtPrepSet);
    }

    public void setAudioPrepAfterLoopbackCallback(IZegoAudioProcCallback iZegoAudioProcCallback, ZegoExtPrepSet zegoExtPrepSet) {
        this.mZegoAudioProcCB = iZegoAudioProcCallback;
        ZegoLiveRoomJNI.setAudioPrepAfterLoopbackCallback(iZegoAudioProcCallback != null, zegoExtPrepSet);
    }

    public void setAudioPrepCallback(IZegoAudioPrepCallback2 iZegoAudioPrepCallback2, ZegoExtPrepSet zegoExtPrepSet) {
        this.mZegoAudioPrepCB = iZegoAudioPrepCallback2;
        ZegoLiveRoomJNI.setAudioPrepCallback(iZegoAudioPrepCallback2 != null, zegoExtPrepSet);
    }

    public void setAudioVADStableStateCallback(IZegoCheckAudioVADCallback iZegoCheckAudioVADCallback) {
        this.mZegoCheckAudioVADCallback = iZegoCheckAudioVADCallback;
        ZegoLiveRoomJNI.enableAudioVADStableStateCallback(iZegoCheckAudioVADCallback != null);
    }

    public boolean setBuiltInSpeakerOn(boolean z) {
        return ZegoLiveRoomJNI.setBuiltInSpeakerOn(z);
    }

    public boolean setCaptureFrameRotation(int i, int i2) {
        return ZegoLiveRoomJNI.setCaptureFrameRotation(i, i2);
    }

    public void setCapturePipelineScaleMode(int i) {
        ZegoLiveRoomJNI.setCapturePipelineScaleMode(i);
    }

    public void setCaptureVolume(int i) {
        ZegoLiveRoomJNI.setCaptureVolume(i);
    }

    public void setChannelExtraParam(String str, int i) {
        ZegoLiveRoomJNI.setChannelExtraParam(str, i);
    }

    public boolean setCustomCDNPublishTarget(ZegoCDNPublishTarget zegoCDNPublishTarget, int i) {
        return zegoCDNPublishTarget == null ? ZegoLiveRoomJNI.setCustomCDNPublishTarget(null, null, null, i) : ZegoLiveRoomJNI.setCustomCDNPublishTarget(zegoCDNPublishTarget.url, zegoCDNPublishTarget.protocols, zegoCDNPublishTarget.quicVersions, i);
    }

    @Deprecated
    public boolean setCustomToken(String str) {
        return ZegoLiveRoomJNI.setCustomToken(str);
    }

    public void setExperimentalAPICallback(IZegoExperimentalAPICallback iZegoExperimentalAPICallback) {
        this.mZegoExperimentalAPICB = iZegoExperimentalAPICallback;
        ZegoLiveRoomJNI.setExperimentalAPICallback(iZegoExperimentalAPICallback != null);
    }

    public boolean setFilter(int i) {
        return ZegoLiveRoomJNI.setFilter(i, 0);
    }

    public boolean setFrontCam(boolean z) {
        return ZegoLiveRoomJNI.setFrontCam(z, 0);
    }

    public void setLatencyMode(int i) {
        ZegoLiveRoomJNI.setLatencyMode(i);
    }

    public void setLatencyModeByChannel(int i, int i2) {
        ZegoLiveRoomJNI.setLatencyModeByChannel(i, i2);
    }

    public void setLoopbackVolume(int i) {
        ZegoLiveRoomJNI.setLoopbackVolume(i);
    }

    public void setMinVideoBitrateForTrafficControl(int i, int i2) {
        ZegoLiveRoomJNI.setMinVideoBitrateForTrafficControl(i, i2, 0);
    }

    public void setMinVideoFpsForTrafficControl(int i, int i2) {
        ZegoLiveRoomJNI.setMinVideoFpsForTrafficControl(i, i2);
    }

    public void setMinVideoResolutionForTrafficControl(int i, int i2, int i3) {
        ZegoLiveRoomJNI.setMinVideoResolutionForTrafficControl(i, i2, i3);
    }

    public boolean setNoiseSuppressMode(int i) {
        return ZegoLiveRoomJNI.setNoiseSuppressMode(i);
    }

    public boolean setPlayStreamFocus(String str) {
        return ZegoLiveRoomJNI.setPlayStreamFocus(str);
    }

    public int setPlayStreamsAlignmentProperty(int i) {
        return ZegoLiveRoomJNI.setPlayStreamsAlignmentProperty(i);
    }

    public boolean setPlayVolume(int i) {
        return ZegoLiveRoomJNI.setPlayVolume(i);
    }

    public boolean setPolishFactor(float f) {
        return ZegoLiveRoomJNI.setPolishFactor(f, 0);
    }

    public boolean setPolishStep(float f) {
        return ZegoLiveRoomJNI.setPolishStep(f, 0);
    }

    public boolean setPreviewRotation(int i) {
        return ZegoLiveRoomJNI.setPreviewRotation(i, 0);
    }

    public boolean setPreviewView(Object obj) {
        return ZegoLiveRoomJNI.setPreviewView(obj, 0);
    }

    public boolean setPreviewViewBackgroundColor(int i) {
        return ZegoLiveRoomJNI.setPreviewViewBackgroundColor(i, 0);
    }

    public boolean setPreviewViewMode(int i) {
        return ZegoLiveRoomJNI.setPreviewViewMode(i, 0);
    }

    public void setPublishConfig(Map<String, Object> map) {
        setPublishConfigInner(map, 0);
    }

    public void setPublishEncryptKey(byte[] bArr, int i) {
        ZegoLiveRoomJNI.setPublishEncryptKey(bArr, i);
    }

    public boolean setRecvBufferLevelLimit(int i, int i2, String str) {
        return ZegoLiveRoomJNI.setRecvBufferLevelLimit(i, i2, str);
    }

    public boolean setRoomConfig(boolean z, boolean z2) {
        return setRoomConfig(z, z2, null);
    }

    public boolean setRoomMaxUserCount(int i) {
        return setRoomMaxUserCount(i, null);
    }

    public void setRunLoopObserveCallback(IZegoRunLoopObserveCallback iZegoRunLoopObserveCallback) {
        this.mZegoRunLoopObserveCallback = iZegoRunLoopObserveCallback;
        ZegoLiveRoomJNI.enableRunLoopObserveCallback(iZegoRunLoopObserveCallback != null);
    }

    public boolean setSharpenFactor(float f) {
        return ZegoLiveRoomJNI.setSharpenFactor(f, 0);
    }

    public int setStreamAlignmentProperty(int i, int i2) {
        return ZegoLiveRoomJNI.setStreamAlignmentProperty(i, i2);
    }

    public boolean setToken(String str, String str2) {
        return ZegoLiveRoomJNI.setToken(str, str2);
    }

    public void setTrafficControlFocusOn(int i) {
        ZegoLiveRoomJNI.setTrafficControlFocusOn(i, 0);
    }

    public boolean setVideoCaptureDeviceId(String str, int i) {
        return ZegoLiveRoomJNI.setVideoCaptureDeviceId(str, i);
    }

    public boolean setVideoCodecId(int i, int i2) {
        return ZegoLiveRoomJNI.setVideoCodecId(i, i2);
    }

    public void setVideoEncoderRateControlConfig(int i, int i2) {
        ZegoLiveRoomJNI.setVideoEncoderRateControlConfig(i, i2, 0);
    }

    public boolean setVideoKeyFrameInterval(int i) {
        return setVideoKeyFrameInterval(i, 0);
    }

    public boolean setVideoMirrorMode(int i, int i2) {
        return ZegoLiveRoomJNI.setVideoMirrorMode(i, i2);
    }

    public boolean setVideoSource(int i, int i2) {
        return ZegoLiveRoomJNI.setVideoSource(i, i2);
    }

    public boolean setViewBackgroundColor(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.setViewBackgroundColor(i, str);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setViewBackgroundColor] failed, streamID is empty");
        return false;
    }

    public boolean setViewMode(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.setViewMode(i, str);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setViewMode] failed, streamID is empty");
        return false;
    }

    public boolean setViewRotation(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.setViewRotation(i, str);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setViewRotation] failed, streamID is empty");
        return false;
    }

    public boolean setWhitenFactor(float f) {
        return ZegoLiveRoomJNI.setWhitenFactor(f, 0);
    }

    public void setZegoAVEngineCallback(IZegoAVEngineCallback iZegoAVEngineCallback) {
        this.mZegoAVEngineCallback = iZegoAVEngineCallback;
    }

    public void setZegoAudioRecordCallback(IZegoAudioRecordCallback2 iZegoAudioRecordCallback2) {
        this.mZegoAudioRecordCallback2 = iZegoAudioRecordCallback2;
    }

    public void setZegoAudioRouteCallback(IZegoAudioRouteCallback iZegoAudioRouteCallback) {
        this.mZegoAudioRouteCallback = iZegoAudioRouteCallback;
        ZegoLiveRoomJNI.enableAudioRouteCallback(iZegoAudioRouteCallback != null);
    }

    public void setZegoDeviceEventCallback(IZegoDeviceEventCallback iZegoDeviceEventCallback) {
        this.mZegoDeviceEventCallback = iZegoDeviceEventCallback;
    }

    public void setZegoIMCallback(IZegoIMCallback iZegoIMCallback) {
        this.mZegoIMCallback = iZegoIMCallback;
    }

    public void setZegoLiveEventCallback(IZegoLiveEventCallback iZegoLiveEventCallback) {
        this.mZegoLiveEventCallback = iZegoLiveEventCallback;
    }

    public void setZegoLivePlayerCallback(IZegoLivePlayerCallback iZegoLivePlayerCallback) {
        this.mZegoLivePlayerCallback = iZegoLivePlayerCallback;
    }

    public void setZegoLivePublisherCallback(IZegoLivePublisherCallback iZegoLivePublisherCallback) {
        this.mZegoLivePublisherCallback = iZegoLivePublisherCallback;
    }

    public void setZegoLivePublisherCallback2(IZegoLivePublisherCallback2 iZegoLivePublisherCallback2) {
        this.mZegoLivePublisherCallback2 = iZegoLivePublisherCallback2;
    }

    public void setZegoLivePublisherExCallback(IZegoLivePublisherExCallback iZegoLivePublisherExCallback) {
        this.mZegoLivePublisherExCallback = iZegoLivePublisherExCallback;
    }

    public void setZegoLogInfoCallback(IZegoLogInfoCallback iZegoLogInfoCallback) {
        this.mZegoLogInfoCallback = iZegoLogInfoCallback;
    }

    public void setZegoNetTypeCallback(IZegoNetTypeCallback iZegoNetTypeCallback) {
        this.mZegoNetTypeCallback = iZegoNetTypeCallback;
        ZegoLiveRoomJNI.enableNetTypeCallback(iZegoNetTypeCallback != null);
    }

    public void setZegoRealtimeSequentialDataCallback(IZegoRealtimeSequentialDataCallback iZegoRealtimeSequentialDataCallback) {
        this.mZegoRealtimeSequentialDataCallback = iZegoRealtimeSequentialDataCallback;
        ZegoLiveRoomJNI.enableRealtimeSequentialDataCallback(iZegoRealtimeSequentialDataCallback != null);
    }

    public void setZegoRoomCallback(IZegoRoomCallback iZegoRoomCallback) {
        this.mZegoRoomCallback = iZegoRoomCallback;
    }

    public boolean startPlayingStream(String str, Object obj) {
        return startPlayingStreamInner(str, obj, null);
    }

    public boolean startPlayingStreamWithParams(ZegoPlayStreamParams zegoPlayStreamParams) {
        if (zegoPlayStreamParams == null) {
            return false;
        }
        if (TextUtils.isEmpty(zegoPlayStreamParams.streamID)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_startPlayingStreamInner] failed, streamID is empty");
            return false;
        }
        ZegoStreamExtraPlayInfo zegoStreamExtraPlayInfo = zegoPlayStreamParams.extraInfo;
        if (zegoStreamExtraPlayInfo != null && TextUtils.isEmpty(zegoStreamExtraPlayInfo.params)) {
            zegoPlayStreamParams.extraInfo.params = "";
        }
        if (TextUtils.isEmpty(zegoPlayStreamParams.roomID)) {
            zegoPlayStreamParams.roomID = "";
        }
        return ZegoLiveRoomJNI.startPlayingStreamWithParams(zegoPlayStreamParams.streamID, zegoPlayStreamParams.displayView, zegoPlayStreamParams.extraInfo, zegoPlayStreamParams.roomID);
    }

    public boolean startPreview() {
        return ZegoLiveRoomJNI.startPreview(0);
    }

    public boolean startPublishing(String str, String str2, int i) {
        return startPublishInner(str, str2, i);
    }

    public boolean startPublishing2(String str, String str2, int i, int i2) {
        return startPublishInner2(str, str2, i, i2, null, null);
    }

    public boolean startPublishingWithParams(ZegoPublishStreamParams zegoPublishStreamParams) {
        if (zegoPublishStreamParams == null) {
            return false;
        }
        return startPublishInner3(zegoPublishStreamParams.streamID, zegoPublishStreamParams.streamTitle, zegoPublishStreamParams.publishFlag, zegoPublishStreamParams.forceSynchronousNetworkTime, zegoPublishStreamParams.channelIndex, zegoPublishStreamParams.extraInfo, zegoPublishStreamParams.publishParams, zegoPublishStreamParams.roomID);
    }

    public boolean stopPlayingStream(String str) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.stopPlayingStream(str);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_stopPlayingStream] failed, streamID is empty");
        return false;
    }

    public boolean stopPreview() {
        return ZegoLiveRoomJNI.stopPreview(0);
    }

    public boolean stopPublishing() {
        return ZegoLiveRoomJNI.stopPublishing(0);
    }

    public boolean switchRoom(String str, String str2, int i, IZegoLoginCompletionCallback iZegoLoginCompletionCallback) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "[Java_ZegoLiveRoom_switchRoom] failed, roomID is empty";
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            if (iZegoLoginCompletionCallback != null) {
                boolean zSwitchRoom = ZegoLiveRoomJNI.switchRoom(str, str2, i);
                if (zSwitchRoom) {
                    removeAllRoomCallback();
                    ZegoEventManager.getInstance().onActiveEvent(ZegoEventManager.ZEGO_EVENT_ID_LOGOUT_ROOM);
                    if (this.mMapZegoLoginCompletionCallback.get(str) != null) {
                        ZegoLiveRoomJNI.logPrint(o00O00OO.OooO00o("[Java_ZegoLiveRoom_switchRoom] find unfinished roomid: ", str));
                    }
                    this.mMapZegoLoginCompletionCallback.put(str, iZegoLoginCompletionCallback);
                }
                return zSwitchRoom;
            }
            str3 = "[Java_ZegoLiveRoom_switchRoom] failed, callback is null";
        }
        ZegoLiveRoomJNI.logPrint(str3);
        return false;
    }

    public boolean takePreviewSnapshot(IZegoSnapshotCompletionCallback2 iZegoSnapshotCompletionCallback2, int i) {
        if (iZegoSnapshotCompletionCallback2 == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_takePreviewSnapshot_channel] failed, callback is null");
            return false;
        }
        this.mPreviewSnapshotCompletionCallback2 = iZegoSnapshotCompletionCallback2;
        return ZegoLiveRoomJNI.takePreviewSnapshot(i);
    }

    public boolean takeSnapshotOfStream(String str, IZegoSnapshotCompletionCallback iZegoSnapshotCompletionCallback) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "[Java_ZegoLiveRoom_takeSnapshotOfStream] failed, streamID is empty";
        } else {
            if (iZegoSnapshotCompletionCallback != null) {
                boolean zTakeSnapshot = ZegoLiveRoomJNI.takeSnapshot(str);
                if (zTakeSnapshot) {
                    if (this.mMapStreamSnapshotCompletionCallback.get(str) != null) {
                        ZegoLiveRoomJNI.logPrint(o00O00OO.OooO00o("[Java_ZegoLiveRoom_takeSnapshotOfStream] unfinished snapshot, streamID:", str));
                    }
                    this.mMapStreamSnapshotCompletionCallback.put(str, iZegoSnapshotCompletionCallback);
                }
                return zTakeSnapshot;
            }
            str2 = "[Java_ZegoLiveRoom_takeSnapshotOfStream] failed, callback is null";
        }
        ZegoLiveRoomJNI.logPrint(str2);
        return false;
    }

    public boolean unInitSDK() {
        try {
            sLogPath = null;
            this.mZegoRoomCallback = null;
            this.mZegoLivePlayerCallback = null;
            this.mZegoLivePublisherCallback = null;
            this.mZegoLivePublisherExCallback = null;
            this.mZegoLivePublisherCallback2 = null;
            this.mZegoDeviceEventCallback = null;
            this.mZegoLiveEventCallback = null;
            this.mZegoAudioRecordCallback = null;
            this.mZegoIMCallback = null;
            this.mZegoAVEngineCallback = null;
            this.mZegoInitSDKCallback = null;
            this.mZegoLogInfoCallback = null;
            this.mZegoAudioRouteCallback = null;
            this.mZegoNetTypeCallback = null;
            this.mZegoRealtimeSequentialDataCallback = null;
            this.mZegoRunLoopObserveCallback = null;
            removeAllRoomCallback();
            ZegoLiveRoomJNI.setZegoLiveRoomCallback(null);
            ZegoLiveRoomJNI.setZegoIMCallback(null);
            ZegoEventManager.getInstance().onActiveEvent(ZegoEventManager.ZEGO_EVENT_ID_UNINITSDK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ZegoLiveRoomJNI.unInitSDK();
    }

    public void updatePlayDecryptKey(String str, byte[] bArr) {
        ZegoLiveRoomJNI.updatePlayDecryptKey(str, bArr);
    }

    public boolean updatePlayView(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return ZegoLiveRoomJNI.updatePlayView(str, obj);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_updatePlayView] failed, streamID is empty");
        return false;
    }

    public boolean updateStreamExtraInfo(String str) {
        return updateStreamExtraInfoInner(str, 0);
    }

    public static boolean setDummyCaptureImagePath(String str, int i) {
        ZegoLiveRoomJNI.setDummyCaptureImagePath(str, i);
        return true;
    }

    public static boolean setPreviewWaterMarkRect(Rect rect, int i) {
        return setPreviewWaterMarkRectInner(rect, i);
    }

    public static boolean setPublishWaterMarkRect(Rect rect, int i) {
        return setPublishWaterMarkRectInner(rect, i);
    }

    @TargetApi(21)
    public static boolean setWaterMarkImagePath(Uri uri, int i) {
        if (uri != null) {
            return setWaterMarkImagePathInner(uri.toString(), i);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_setWaterMarkImagePath] failed, imageUri is null");
        return false;
    }

    public int activateVideoPlayStream(String str, boolean z, int i) {
        return ZegoLiveRoomJNI.activateVideoPlayStream(str, z, i);
    }

    public void enableAudioPrepVADStableStateMonitor(boolean z, int i) {
        ZegoLiveRoomJNI.enableAudioPrepVADStableStateMonitor(z, i);
    }

    public boolean enableBeautifying(int i, int i2) {
        return ZegoLiveRoomJNI.enableBeautifying(i, i2);
    }

    public boolean enableCamera(boolean z, int i) {
        return ZegoLiveRoomJNI.enableCamera(z, i);
    }

    public boolean enableCaptureMirror(boolean z, int i) {
        return ZegoLiveRoomJNI.enableCaptureMirror(z, i);
    }

    public void enableCapturedAudioVADStableStateMonitor(boolean z, int i) {
        ZegoLiveRoomJNI.enableCapturedAudioVADStableStateMonitor(z, i);
    }

    public boolean enablePreviewMirror(boolean z, int i) {
        return ZegoLiveRoomJNI.enablePreviewMirror(z, i);
    }

    public boolean enableRateControl(boolean z, int i) {
        return ZegoLiveRoomJNI.enableRateControl(z, i);
    }

    public boolean enableSelectedAudioRecord(ZegoAudioRecordConfig zegoAudioRecordConfig) {
        if (zegoAudioRecordConfig != null) {
            return ZegoLiveRoomJNI.enableSelectedAudioRecord(zegoAudioRecordConfig.mask, zegoAudioRecordConfig.sampleRate, zegoAudioRecordConfig.channels);
        }
        ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_enableSelectedAudioRecord] failed, config is NULL");
        return false;
    }

    public boolean enableTorch(boolean z, int i) {
        return ZegoLiveRoomJNI.enableTorch(z, i);
    }

    public void enableTrafficControl(int i, boolean z, int i2) {
        ZegoLiveRoomJNI.enableTrafficControl(i, z, i2);
    }

    public boolean endJoinLive(String str, String str2, IZegoEndJoinLiveCallback iZegoEndJoinLiveCallback) {
        String strOooO00o;
        if (iZegoEndJoinLiveCallback == null) {
            strOooO00o = "[Java_ZegoLiveRoom_endJoinLive] failed, callback is null";
        } else if (TextUtils.isEmpty(str)) {
            strOooO00o = "[Java_ZegoLiveRoom_endJoinLive] failed, userId is empty";
        } else {
            int iEndJoinLive = ZegoLiveRoomJNI.endJoinLive(str, str2);
            if (iEndJoinLive > 0) {
                if (this.mMapEndJoinLiveResponseCallback.get(Integer.valueOf(iEndJoinLive)) != null) {
                    ZegoLiveRoomJNI.logPrint(OooO00o.OooO00o("[Java_ZegoLiveRoom_endJoinLive], unfinished send end join live, seq:", iEndJoinLive));
                }
                this.mMapEndJoinLiveResponseCallback.put(Integer.valueOf(iEndJoinLive), iZegoEndJoinLiveCallback);
                return true;
            }
            strOooO00o = OooO00o.OooO00o("[Java_ZegoLiveRoom_endJoinLive] failed, seq:", iEndJoinLive);
        }
        ZegoLiveRoomJNI.logPrint(strOooO00o);
        return false;
    }

    @Deprecated
    public boolean initSDK(long j, byte[] bArr, Context context) {
        SDKContext sDKContext;
        if (context == null && ((sDKContext = mContext) == null || sDKContext.getAppContext() == null)) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_initSDK] failed, context is null");
            return false;
        }
        if (mContext == null) {
            String logPath = sLogPath;
            if (logPath == null || logPath.length() == 0) {
                logPath = ZegoLogUtil.getLogPath(context);
            }
            ZegoLiveRoomJNI.setLogPathAndSize(logPath, 5242880L, null, context);
        }
        if (context == null) {
            context = mContext.getAppContext();
        }
        return _initSDKInner(j, bArr, context);
    }

    public boolean inviteJoinLive(String str, String str2, IZegoResponseCallback iZegoResponseCallback) {
        String strOooO00o;
        if (TextUtils.isEmpty(str)) {
            strOooO00o = "[Java_ZegoLiveRoom_inviteJoinLive] failed, userID is empty";
        } else if (iZegoResponseCallback == null) {
            strOooO00o = "[Java_ZegoLiveRoom_inviteJoinLive] failed, callback is null";
        } else {
            int iInviteJoinLive = ZegoLiveRoomJNI.inviteJoinLive(str, str2);
            if (iInviteJoinLive > 0) {
                if (this.mMapInviteJoinLiveResponseCallback.get(Integer.valueOf(iInviteJoinLive)) != null) {
                    ZegoLiveRoomJNI.logPrint(OooO00o.OooO00o("[Java_ZegoLiveRoom_inviteJoinLive] unfinished invite JoinLive, seq:", iInviteJoinLive));
                }
                this.mMapInviteJoinLiveResponseCallback.put(Integer.valueOf(iInviteJoinLive), iZegoResponseCallback);
                return true;
            }
            strOooO00o = OooO00o.OooO00o("[Java_ZegoLiveRoom_inviteJoinLive] failed, seq:", iInviteJoinLive);
        }
        ZegoLiveRoomJNI.logPrint(strOooO00o);
        return false;
    }

    public boolean loginRoom(String str, String str2, int i, IZegoLoginCompletionCallback iZegoLoginCompletionCallback) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "[Java_ZegoLiveRoom_loginRoom] failed, roomID is empty";
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            if (iZegoLoginCompletionCallback != null) {
                boolean zLoginRoom = ZegoLiveRoomJNI.loginRoom(str, str2, i);
                if (zLoginRoom) {
                    if (this.mMapZegoLoginCompletionCallback.get(str) != null) {
                        ZegoLiveRoomJNI.logPrint(o00O00OO.OooO00o("[Java_ZegoLiveRoom_loginRoom], unfinished room login: ", str));
                    }
                    this.mMapZegoLoginCompletionCallback.put(str, iZegoLoginCompletionCallback);
                }
                return zLoginRoom;
            }
            str3 = "[Java_ZegoLiveRoom_loginRoom] failed, callback is null";
        }
        ZegoLiveRoomJNI.logPrint(str3);
        return false;
    }

    public boolean logoutRoom(String str) {
        ZegoEventManager.getInstance().onActiveEvent(ZegoEventManager.ZEGO_EVENT_ID_LOGOUT_ROOM);
        return ZegoLiveRoomJNI.logoutRoom(str);
    }

    public int muteAudioPublish(boolean z, int i) {
        return ZegoLiveRoomJNI.muteAudioPublish(z, i);
    }

    public int muteVideoPublish(boolean z, int i) {
        return ZegoLiveRoomJNI.muteVideoPublish(z, i);
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onCaptureVideoFirstFrame(final int i) {
        final IZegoLivePublisherCallback2 iZegoLivePublisherCallback2 = this.mZegoLivePublisherCallback2;
        if (iZegoLivePublisherCallback2 != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.37
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback2.onCaptureVideoFirstFrame(i);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onCaptureVideoSizeChanged(final int i, final int i2, final int i3) {
        final IZegoLivePublisherCallback2 iZegoLivePublisherCallback2 = this.mZegoLivePublisherCallback2;
        if (iZegoLivePublisherCallback2 != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.35
                @Override // java.lang.Runnable
                public void run() {
                    iZegoLivePublisherCallback2.onCaptureVideoSizeChangedTo(i, i2, i3);
                }
            });
        }
    }

    @Override // com.zego.zegoliveroom.ZegoLiveRoomJNI.IJniZegoLiveRoomCallback
    public void onPreviewSnapshot(final Bitmap bitmap) {
        final IZegoSnapshotCompletionCallback iZegoSnapshotCompletionCallback = this.mPreviewSnapshotCompletionCallback;
        if (iZegoSnapshotCompletionCallback != null) {
            this.mUIHandler.post(new Runnable() { // from class: com.zego.zegoliveroom.ZegoLiveRoom.42
                @Override // java.lang.Runnable
                public void run() {
                    iZegoSnapshotCompletionCallback.onZegoSnapshotCompletion(bitmap);
                }
            });
            this.mPreviewSnapshotCompletionCallback = null;
        }
    }

    public boolean requestJoinLive(String str, IZegoResponseCallback iZegoResponseCallback) {
        String strOooO00o;
        if (iZegoResponseCallback == null) {
            strOooO00o = "[Java_ZegoLiveRoom_requestJoinLive] failed, callback is null";
        } else {
            int iRequestJoinLive = ZegoLiveRoomJNI.requestJoinLive(str);
            if (iRequestJoinLive > 0) {
                if (this.mMapJoinLiveResponseCallback.get(Integer.valueOf(iRequestJoinLive)) != null) {
                    ZegoLiveRoomJNI.logPrint(OooO00o.OooO00o("[Java_ZegoLiveRoom_requestJoinLive] unfinished send end join live, seq:", iRequestJoinLive));
                }
                this.mMapJoinLiveResponseCallback.put(Integer.valueOf(iRequestJoinLive), iZegoResponseCallback);
                return true;
            }
            strOooO00o = OooO00o.OooO00o("[Java_ZegoLiveRoom_requestJoinLive] failed, seq:", iRequestJoinLive);
        }
        ZegoLiveRoomJNI.logPrint(strOooO00o);
        return false;
    }

    public boolean respondInviteJoinLiveReq(int i, int i2, String str) {
        return ZegoLiveRoomJNI.respondInviteJoinLiveReq(i, i2, str);
    }

    public boolean respondJoinLiveReq(int i, int i2, String str) {
        return ZegoLiveRoomJNI.respondJoinLiveReq(i, i2, str);
    }

    public boolean sendBigRoomMessage(int i, int i2, String str, String str2, IZegoBigRoomMessageCallback iZegoBigRoomMessageCallback) {
        String strOooO00o;
        if (iZegoBigRoomMessageCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_sendBigRoomMessage] callback is null");
        }
        if (TextUtils.isEmpty(str)) {
            strOooO00o = "[Java_ZegoLiveRoom_sendBigRoomMessage] failed, content is empty";
        } else {
            int iSendBigRoomMessage = ZegoLiveRoomJNI.sendBigRoomMessage(i, i2, str, str2);
            if (iSendBigRoomMessage != -1) {
                if (this.mMapIMCallback.get(Integer.valueOf(iSendBigRoomMessage)) != null) {
                    ZegoLiveRoomJNI.logPrint(OooO00o.OooO00o("[Java_ZegoLiveRoom_sendBigRoomMessage], unfinished send room message, seq:", iSendBigRoomMessage));
                }
                if (iZegoBigRoomMessageCallback == null) {
                    return true;
                }
                this.mMapIMCallback.put(Integer.valueOf(iSendBigRoomMessage), iZegoBigRoomMessageCallback);
                return true;
            }
            strOooO00o = OooO00o.OooO00o("[Java_ZegoLiveRoom_sendBigRoomMessage] failed, seq:", iSendBigRoomMessage);
        }
        ZegoLiveRoomJNI.logPrint(strOooO00o);
        return false;
    }

    public boolean sendCustomCommand(ZegoUser[] zegoUserArr, String str, String str2, IZegoCustomCommandCallback iZegoCustomCommandCallback) {
        String str3;
        if (iZegoCustomCommandCallback == null) {
            str3 = "[Java_ZegoLiveRoom_sendCustomCommand] failed, callback is null";
        } else {
            ZegoUser[] listOfLegalUser = getListOfLegalUser(zegoUserArr);
            if (listOfLegalUser == null) {
                str3 = "[Java_ZegoLiveRoom_sendCustomCommand] failed, listMember is empty";
            } else {
                if (!TextUtils.isEmpty(str)) {
                    int iSendCustomCommand = ZegoLiveRoomJNI.sendCustomCommand(listOfLegalUser, listOfLegalUser.length, str, str2);
                    if (iSendCustomCommand == -1) {
                        return false;
                    }
                    if (this.mMapCustomCommandCallback.get(Integer.valueOf(iSendCustomCommand)) != null) {
                        ZegoLiveRoomJNI.logPrint(OooO00o.OooO00o("[Java_ZegoLiveRoom_sendCustomCommand], unfinished custom command, seq:", iSendCustomCommand));
                    }
                    this.mMapCustomCommandCallback.put(Integer.valueOf(iSendCustomCommand), iZegoCustomCommandCallback);
                    return true;
                }
                str3 = "[Java_ZegoLiveRoom_sendCustomCommand] failed, content is empty";
            }
        }
        ZegoLiveRoomJNI.logPrint(str3);
        return false;
    }

    public boolean sendRoomMessage(int i, int i2, String str, String str2, IZegoRoomMessageCallback iZegoRoomMessageCallback) {
        String strOooO00o;
        if (iZegoRoomMessageCallback == null) {
            strOooO00o = "[Java_ZegoLiveRoom_sendRoomMessage] failed, callback is null";
        } else if (TextUtils.isEmpty(str)) {
            strOooO00o = "[Java_ZegoLiveRoom_sendRoomMessage] failed, content is empty";
        } else {
            int iSendRoomMessageEx = ZegoLiveRoomJNI.sendRoomMessageEx(i, i2, str, str2);
            if (iSendRoomMessageEx != -1) {
                if (this.mMapIMCallback.get(Integer.valueOf(iSendRoomMessageEx)) != null) {
                    ZegoLiveRoomJNI.logPrint(OooO00o.OooO00o("[Java_ZegoLiveRoom_sendRoomMessage], unfinished send room message, seq:", iSendRoomMessageEx));
                }
                this.mMapIMCallback.put(Integer.valueOf(iSendRoomMessageEx), iZegoRoomMessageCallback);
                return true;
            }
            strOooO00o = OooO00o.OooO00o("[Java_ZegoLiveRoom_sendRoomMessage] failed, seq:", iSendRoomMessageEx);
        }
        ZegoLiveRoomJNI.logPrint(strOooO00o);
        return false;
    }

    public boolean setAVConfig(ZegoAvConfig zegoAvConfig, int i) {
        return setAVConfigInner(zegoAvConfig, i);
    }

    public boolean setAppOrientation(int i, int i2) {
        return setAppOrientationInner(i, i2);
    }

    public boolean setAudioBitrate(int i, int i2) {
        return ZegoLiveRoomJNI.setAudioBitrate(i, i2);
    }

    public boolean setFilter(int i, int i2) {
        return ZegoLiveRoomJNI.setFilter(i, i2);
    }

    public boolean setFrontCam(boolean z, int i) {
        return ZegoLiveRoomJNI.setFrontCam(z, i);
    }

    public void setMinVideoBitrateForTrafficControl(int i, int i2, int i3) {
        ZegoLiveRoomJNI.setMinVideoBitrateForTrafficControl(i, i2, i3);
    }

    public boolean setPlayVolume(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return ZegoLiveRoomJNI.setPlayVolume2(i, str);
    }

    public boolean setPolishFactor(float f, int i) {
        return ZegoLiveRoomJNI.setPolishFactor(f, i);
    }

    public boolean setPolishStep(float f, int i) {
        return ZegoLiveRoomJNI.setPolishStep(f, i);
    }

    public boolean setPreviewRotation(int i, int i2) {
        return ZegoLiveRoomJNI.setPreviewRotation(i, i2);
    }

    public boolean setPreviewView(Object obj, int i) {
        return ZegoLiveRoomJNI.setPreviewView(obj, i);
    }

    public boolean setPreviewViewBackgroundColor(int i, int i2) {
        return ZegoLiveRoomJNI.setPreviewViewBackgroundColor(i, i2);
    }

    public boolean setPreviewViewMode(int i, int i2) {
        return ZegoLiveRoomJNI.setPreviewViewMode(i, i2);
    }

    public void setPublishConfig(Map<String, Object> map, int i) {
        setPublishConfigInner(map, i);
    }

    public boolean setRoomConfig(boolean z, boolean z2, String str) {
        return ZegoLiveRoomJNI.setRoomConfig(z, z2, str);
    }

    public boolean setRoomMaxUserCount(int i, String str) {
        return ZegoLiveRoomJNI.setRoomMaxUserCount(i, str);
    }

    public boolean setSharpenFactor(float f, int i) {
        return ZegoLiveRoomJNI.setSharpenFactor(f, i);
    }

    public void setTrafficControlFocusOn(int i, int i2) {
        ZegoLiveRoomJNI.setTrafficControlFocusOn(i, i2);
    }

    public void setVideoEncoderRateControlConfig(int i, int i2, int i3) {
        ZegoLiveRoomJNI.setVideoEncoderRateControlConfig(i, i2, i3);
    }

    public boolean setVideoKeyFrameInterval(int i, int i2) {
        return ZegoLiveRoomJNI.setVideoKeyFrameInterval(i, i2);
    }

    public boolean setWhitenFactor(float f, int i) {
        return ZegoLiveRoomJNI.setWhitenFactor(f, i);
    }

    public void setZegoAudioRecordCallback(IZegoAudioRecordCallback iZegoAudioRecordCallback) {
        this.mZegoAudioRecordCallback = iZegoAudioRecordCallback;
    }

    public boolean startPlayingStream(String str, Object obj, ZegoStreamExtraPlayInfo zegoStreamExtraPlayInfo) {
        return startPlayingStreamInner(str, obj, zegoStreamExtraPlayInfo);
    }

    public boolean startPreview(int i) {
        return ZegoLiveRoomJNI.startPreview(i);
    }

    public boolean startPublishing(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str3) || ZegoLiveRoomJNI.updateStreamExtraInfo(str3, 0)) {
            return startPublishInner(str, str2, i);
        }
        return false;
    }

    public boolean startPublishing2(String str, String str2, int i, String str3, int i2) {
        return startPublishInner2(str, str2, i, i2, str3, null);
    }

    public boolean stopPreview(int i) {
        return ZegoLiveRoomJNI.stopPreview(i);
    }

    public boolean stopPublishing(int i) {
        return ZegoLiveRoomJNI.stopPublishing(i);
    }

    public boolean takePreviewSnapshot(IZegoSnapshotCompletionCallback iZegoSnapshotCompletionCallback) {
        if (iZegoSnapshotCompletionCallback == null) {
            ZegoLiveRoomJNI.logPrint("[Java_ZegoLiveRoom_takePreviewSnapshot] failed, callback is null");
            return false;
        }
        this.mPreviewSnapshotCompletionCallback = iZegoSnapshotCompletionCallback;
        return ZegoLiveRoomJNI.takePreviewSnapshot(0);
    }

    public boolean updateStreamExtraInfo(String str, int i) {
        return updateStreamExtraInfoInner(str, i);
    }

    public static boolean setWaterMarkImagePath(String str) {
        return setWaterMarkImagePathInner(str, 0);
    }

    public boolean initSDK(long j, byte[] bArr, IZegoInitSDKCompletionCallback iZegoInitSDKCompletionCallback) {
        this.mZegoInitSDKCallback = iZegoInitSDKCompletionCallback;
        SDKContext sDKContext = mContext;
        if (sDKContext == null || sDKContext.getAppContext() == null) {
            throw new RuntimeException("[ZEGO] Android application context not set!");
        }
        return _initSDKInner(j, bArr, mContext.getAppContext().getApplicationContext());
    }

    public boolean startPlayingStream(String str, Object obj, String str2) {
        ZegoStreamExtraPlayInfo zegoStreamExtraPlayInfo = new ZegoStreamExtraPlayInfo();
        zegoStreamExtraPlayInfo.params = str2;
        return startPlayingStreamInner(str, obj, zegoStreamExtraPlayInfo);
    }

    public boolean startPublishing2(String str, String str2, int i, String str3, String str4, int i2) {
        return startPublishInner2(str, str2, i, i2, str3, str4);
    }

    public static boolean setWaterMarkImagePath(String str, int i) {
        return setWaterMarkImagePathInner(str, i);
    }
}
