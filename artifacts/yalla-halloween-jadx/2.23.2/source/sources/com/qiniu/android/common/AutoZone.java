package com.qiniu.android.common;

import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.metrics.UploadRegionRequestMetrics;
import com.qiniu.android.http.request.RequestTransaction;
import com.qiniu.android.storage.UpToken;
import com.qiniu.android.utils.SingleFlight;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoZone extends Zone {
    private static final SingleFlight SingleFlight = new SingleFlight();
    private String ucServer;
    private Map<String, ZonesInfo> zonesInfoMap = new ConcurrentHashMap();
    private ArrayList<RequestTransaction> transactions = new ArrayList<>();

    public static class GlobalCache {
        private static GlobalCache globalCache = new GlobalCache();
        private ConcurrentHashMap<String, JSONObject> cache = new ConcurrentHashMap<>();

        private GlobalCache() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cache(JSONObject jSONObject, String str) {
            if (str == null || str.isEmpty()) {
                return;
            }
            if (jSONObject == null) {
                this.cache.remove(str);
            } else {
                this.cache.put(str, jSONObject);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static GlobalCache getInstance() {
            return globalCache;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ZonesInfo zonesInfoForKey(String str) {
            if (str == null || str.isEmpty()) {
                return null;
            }
            return ZonesInfo.createZonesInfo(this.cache.get(str));
        }
    }

    public static class SingleFlightValue {
        private UploadRegionRequestMetrics metrics;
        private JSONObject response;
        private ResponseInfo responseInfo;

        private SingleFlightValue() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RequestTransaction createUploadRequestTransaction(UpToken upToken) {
        RequestTransaction requestTransaction = new RequestTransaction(getUcServerList(), ZoneInfo.EmptyRegionId, upToken);
        this.transactions.add(requestTransaction);
        return requestTransaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyUploadRequestTransaction(RequestTransaction requestTransaction) {
        this.transactions.remove(requestTransaction);
    }

    public List<String> getUcServerList() {
        if (this.ucServer != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.ucServer);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Config.preQueryHost00);
        arrayList2.add(Config.preQueryHost01);
        return arrayList2;
    }

    @Override // com.qiniu.android.common.Zone
    public ZonesInfo getZonesInfo(UpToken upToken) {
        if (upToken == null) {
            return null;
        }
        return this.zonesInfoMap.get(upToken.index());
    }

    @Override // com.qiniu.android.common.Zone
    public void preQuery(final UpToken upToken, final Zone.QueryHandler queryHandler) {
        if (upToken == null || !upToken.isValid()) {
            queryHandler.complete(-1, ResponseInfo.invalidToken("invalid token"), null);
            return;
        }
        final String strIndex = upToken.index();
        ZonesInfo zonesInfo = getZonesInfo(upToken);
        if (zonesInfo == null && (zonesInfo = GlobalCache.getInstance().zonesInfoForKey(strIndex)) != null && zonesInfo.isValid()) {
            this.zonesInfoMap.put(strIndex, zonesInfo);
        }
        if (zonesInfo != null && zonesInfo.isValid()) {
            queryHandler.complete(0, ResponseInfo.successResponse(), null);
            return;
        }
        try {
            SingleFlight.perform(strIndex, new SingleFlight.ActionHandler() { // from class: com.qiniu.android.common.AutoZone.1
                @Override // com.qiniu.android.utils.SingleFlight.ActionHandler
                public void action(final SingleFlight.CompleteHandler completeHandler) throws Exception {
                    final RequestTransaction requestTransactionCreateUploadRequestTransaction = AutoZone.this.createUploadRequestTransaction(upToken);
                    requestTransactionCreateUploadRequestTransaction.queryUploadHosts(true, new RequestTransaction.RequestCompleteHandler() { // from class: com.qiniu.android.common.AutoZone.1.1
                        @Override // com.qiniu.android.http.request.RequestTransaction.RequestCompleteHandler
                        public void complete(ResponseInfo responseInfo, UploadRegionRequestMetrics uploadRegionRequestMetrics, JSONObject jSONObject) {
                            AutoZone.this.destroyUploadRequestTransaction(requestTransactionCreateUploadRequestTransaction);
                            SingleFlightValue singleFlightValue = new SingleFlightValue();
                            singleFlightValue.responseInfo = responseInfo;
                            singleFlightValue.response = jSONObject;
                            singleFlightValue.metrics = uploadRegionRequestMetrics;
                            completeHandler.complete(singleFlightValue);
                        }
                    });
                }
            }, new SingleFlight.CompleteHandler() { // from class: com.qiniu.android.common.AutoZone.2
                @Override // com.qiniu.android.utils.SingleFlight.CompleteHandler
                public void complete(Object obj) {
                    SingleFlightValue singleFlightValue = (SingleFlightValue) obj;
                    ResponseInfo responseInfo = singleFlightValue.responseInfo;
                    UploadRegionRequestMetrics uploadRegionRequestMetrics = singleFlightValue.metrics;
                    JSONObject jSONObject = singleFlightValue.response;
                    if (responseInfo != null && responseInfo.isOK() && jSONObject != null) {
                        AutoZone.this.zonesInfoMap.put(strIndex, ZonesInfo.createZonesInfo(jSONObject));
                        GlobalCache.getInstance().cache(jSONObject, strIndex);
                        queryHandler.complete(0, responseInfo, uploadRegionRequestMetrics);
                        return;
                    }
                    if (responseInfo.isNetworkBroken()) {
                        queryHandler.complete(-1, responseInfo, uploadRegionRequestMetrics);
                        return;
                    }
                    AutoZone.this.zonesInfoMap.put(strIndex, FixedZone.localsZoneInfo().getZonesInfo(upToken));
                    queryHandler.complete(0, responseInfo, uploadRegionRequestMetrics);
                }
            });
        } catch (Exception e) {
            queryHandler.complete(-1, ResponseInfo.localIOError(e.toString()), null);
        }
    }

    public void setUcServer(String str) {
        this.ucServer = str;
    }
}
