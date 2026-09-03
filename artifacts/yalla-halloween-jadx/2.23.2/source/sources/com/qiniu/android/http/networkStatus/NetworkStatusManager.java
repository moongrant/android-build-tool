package com.qiniu.android.http.networkStatus;

import com.qiniu.android.storage.FileRecorder;
import com.qiniu.android.storage.Recorder;
import com.qiniu.android.utils.AsyncRun;
import com.qiniu.android.utils.Utils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkStatusManager {
    private static String kNetworkStatusDiskKey = "NetworkStatus:v1.0.0";
    private static NetworkStatusManager networkStatusManager = new NetworkStatusManager();
    private boolean hasInit = false;
    private boolean isHandlingNetworkInfoOfDisk = false;
    private ConcurrentHashMap<String, NetworkStatus> networkStatusInfo;
    private Recorder recorder;

    public static class NetworkStatus {
        private int speed;

        /* JADX INFO: Access modifiers changed from: private */
        public static NetworkStatus statusFromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            NetworkStatus networkStatus = new NetworkStatus();
            try {
                networkStatus.speed = jSONObject.getInt("speed");
            } catch (Exception unused) {
            }
            return networkStatus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("speed", this.speed);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public int getSpeed() {
            return this.speed;
        }

        public void setSpeed(int i) {
            this.speed = i;
        }
    }

    private void asyncRecordNetworkStatusInfo() {
        synchronized (this) {
            if (this.isHandlingNetworkInfoOfDisk) {
                return;
            }
            this.isHandlingNetworkInfoOfDisk = true;
            AsyncRun.runInBack(new Runnable() { // from class: com.qiniu.android.http.networkStatus.NetworkStatusManager.1
                @Override // java.lang.Runnable
                public void run() {
                    NetworkStatusManager.this.recordNetworkStatusInfo();
                    NetworkStatusManager.this.isHandlingNetworkInfoOfDisk = false;
                }
            });
        }
    }

    private void asyncRecoverNetworkStatusFromDisk() {
        synchronized (this) {
            if (this.isHandlingNetworkInfoOfDisk) {
                return;
            }
            this.isHandlingNetworkInfoOfDisk = true;
            AsyncRun.runInBack(new Runnable() { // from class: com.qiniu.android.http.networkStatus.NetworkStatusManager.2
                @Override // java.lang.Runnable
                public void run() {
                    NetworkStatusManager.this.recoverNetworkStatusFromDisk();
                    NetworkStatusManager.this.isHandlingNetworkInfoOfDisk = true;
                }
            });
        }
    }

    public static NetworkStatusManager getInstance() {
        networkStatusManager.initData();
        return networkStatusManager;
    }

    public static String getNetworkStatusType(String str, String str2) {
        return Utils.getIpType(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordNetworkStatusInfo() {
        setupRecorder();
        if (this.recorder == null || this.networkStatusInfo == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : this.networkStatusInfo.keySet()) {
            NetworkStatus networkStatus = this.networkStatusInfo.get(str);
            if (networkStatus != null) {
                try {
                    jSONObject.put(str, networkStatus.toJson());
                } catch (Exception unused) {
                }
            }
        }
        this.recorder.set(kNetworkStatusDiskKey, jSONObject.toString().getBytes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recoverNetworkStatusFromDisk() {
        setupRecorder();
        Recorder recorder = this.recorder;
        if (recorder == null || this.networkStatusInfo == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(recorder.get(kNetworkStatusDiskKey)));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    NetworkStatus networkStatusStatusFromJson = NetworkStatus.statusFromJson(jSONObject.getJSONObject(next));
                    if (networkStatusStatusFromJson != null) {
                        this.networkStatusInfo.put(next, networkStatusStatusFromJson);
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    private synchronized void setupRecorder() {
        if (this.recorder == null) {
            try {
                this.recorder = new FileRecorder(Utils.sdkDirectory() + "/NetworkInfo");
            } catch (Exception unused) {
            }
        }
    }

    public NetworkStatus getNetworkStatus(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        NetworkStatus networkStatus = this.networkStatusInfo.get(str);
        return networkStatus == null ? new NetworkStatus() : networkStatus;
    }

    public synchronized void initData() {
        if (this.hasInit) {
            return;
        }
        networkStatusManager.networkStatusInfo = new ConcurrentHashMap<>();
        networkStatusManager.asyncRecoverNetworkStatusFromDisk();
    }

    public void updateNetworkStatus(String str, int i) {
        if (str == null || str.length() == 0) {
            return;
        }
        NetworkStatus networkStatus = this.networkStatusInfo.get(str);
        if (networkStatus == null) {
            networkStatus = new NetworkStatus();
            this.networkStatusInfo.put(str, networkStatus);
        }
        networkStatus.setSpeed(i);
        asyncRecordNetworkStatusInfo();
    }
}
