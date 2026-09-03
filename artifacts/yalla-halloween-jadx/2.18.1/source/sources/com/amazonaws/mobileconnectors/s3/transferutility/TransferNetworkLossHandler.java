package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.umeng.analytics.pro.ao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TransferNetworkLossHandler extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Log f10463OooO0Oo = LogFactory.OooO00o(TransferNetworkLossHandler.class);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static TransferNetworkLossHandler f10464OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConnectivityManager f10465OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TransferDBUtil f10466OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TransferStatusUpdater f10467OooO0OO;

    public TransferNetworkLossHandler(Context context) {
        this.f10465OooO00o = (ConnectivityManager) context.getSystemService("connectivity");
        this.f10466OooO0O0 = new TransferDBUtil(context);
        this.f10467OooO0OO = TransferStatusUpdater.OooO00o(context);
    }

    public static synchronized TransferNetworkLossHandler OooO00o() throws TransferUtilityException {
        TransferNetworkLossHandler transferNetworkLossHandler;
        transferNetworkLossHandler = f10464OooO0o0;
        if (transferNetworkLossHandler == null) {
            f10463OooO0Oo.OooOO0("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
            throw new TransferUtilityException("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
        }
        return transferNetworkLossHandler;
    }

    public final boolean OooO0O0() {
        NetworkInfo activeNetworkInfo = this.f10465OooO00o.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            Log log = f10463OooO0Oo;
            log.OooO0o("Network connectivity changed detected.");
            log.OooO0o("Network connected: " + OooO0O0());
            new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler.1
                /* JADX WARN: Code duplicated, block: B:73:0x0152  */
                /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Map<java.lang.Integer, com.amazonaws.services.s3.AmazonS3>, java.util.concurrent.ConcurrentHashMap] */
                /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map<java.lang.Integer, com.amazonaws.services.s3.AmazonS3>, java.util.concurrent.ConcurrentHashMap] */
                /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord>, java.util.concurrent.ConcurrentHashMap] */
                @Override // java.lang.Runnable
                public final void run() {
                    Map mapUnmodifiableMap;
                    boolean z;
                    TransferRecord transferRecordOooO0O0;
                    int i = 0;
                    if (!TransferNetworkLossHandler.this.OooO0O0()) {
                        TransferNetworkLossHandler transferNetworkLossHandler = TransferNetworkLossHandler.this;
                        synchronized (transferNetworkLossHandler) {
                            TransferStatusUpdater transferStatusUpdater = transferNetworkLossHandler.f10467OooO0OO;
                            synchronized (transferStatusUpdater) {
                                mapUnmodifiableMap = Collections.unmodifiableMap(transferStatusUpdater.f10510OooO00o);
                            }
                            for (TransferRecord transferRecord : mapUnmodifiableMap.values()) {
                                if (((AmazonS3) S3ClientReference.f10452OooO00o.get(Integer.valueOf(transferRecord.f10471OooO00o))) != null) {
                                    if (transferRecord.OooO00o(transferNetworkLossHandler.f10467OooO0OO, transferNetworkLossHandler.f10465OooO00o)) {
                                        z = false;
                                    } else {
                                        TransferState transferState = transferRecord.f10479OooOO0;
                                        if (TransferState.COMPLETED.equals(transferState) || TransferState.FAILED.equals(transferState) || TransferState.CANCELED.equals(transferState)) {
                                            z = false;
                                        } else {
                                            if (transferRecord.OooO0O0()) {
                                                transferRecord.f10497OooOoo.cancel(true);
                                            }
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        transferNetworkLossHandler.f10467OooO0OO.OooO0o(transferRecord.f10471OooO00o, TransferState.WAITING_FOR_NETWORK);
                                    }
                                }
                            }
                        }
                        return;
                    }
                    TransferNetworkLossHandler transferNetworkLossHandler2 = TransferNetworkLossHandler.this;
                    synchronized (transferNetworkLossHandler2) {
                        TransferState[] transferStateArr = {TransferState.WAITING_FOR_NETWORK};
                        TransferNetworkLossHandler.f10463OooO0Oo.OooO00o("Loading transfers from database...");
                        Cursor cursorOooO0Oo = null;
                        ArrayList<Integer> arrayList = new ArrayList();
                        try {
                            cursorOooO0Oo = transferNetworkLossHandler2.f10466OooO0O0.OooO0Oo(TransferType.ANY, transferStateArr);
                            while (cursorOooO0Oo.moveToNext()) {
                                int i2 = cursorOooO0Oo.getInt(cursorOooO0Oo.getColumnIndexOrThrow(ao.d));
                                if (transferNetworkLossHandler2.f10467OooO0OO.OooO0O0(i2) == null) {
                                    TransferRecord transferRecord2 = new TransferRecord(i2);
                                    transferRecord2.OooO0Oo(cursorOooO0Oo);
                                    TransferStatusUpdater transferStatusUpdater2 = transferNetworkLossHandler2.f10467OooO0OO;
                                    synchronized (transferStatusUpdater2) {
                                        try {
                                            transferStatusUpdater2.f10510OooO00o.put(Integer.valueOf(transferRecord2.f10471OooO00o), transferRecord2);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    i++;
                                }
                                arrayList.add(Integer.valueOf(i2));
                            }
                            TransferNetworkLossHandler.f10463OooO0Oo.OooO00o("Closing the cursor for resumeAllTransfers");
                            cursorOooO0Oo.close();
                            try {
                                for (Integer num : arrayList) {
                                    AmazonS3 amazonS3 = (AmazonS3) S3ClientReference.f10452OooO00o.get(num);
                                    if (amazonS3 != null && (transferRecordOooO0O0 = transferNetworkLossHandler2.f10467OooO0OO.OooO0O0(num.intValue())) != null && !transferRecordOooO0O0.OooO0O0()) {
                                        transferRecordOooO0O0.OooO0OO(amazonS3, transferNetworkLossHandler2.f10466OooO0O0, transferNetworkLossHandler2.f10467OooO0OO, transferNetworkLossHandler2.f10465OooO00o);
                                    }
                                }
                            } catch (Exception e) {
                                TransferNetworkLossHandler.f10463OooO0Oo.OooOO0("Error in resuming the transfers." + e.getMessage());
                            }
                            TransferNetworkLossHandler.f10463OooO0Oo.OooO00o(i + " transfers are loaded from database.");
                        } catch (Throwable th2) {
                            if (cursorOooO0Oo != null) {
                                TransferNetworkLossHandler.f10463OooO0Oo.OooO00o("Closing the cursor for resumeAllTransfers");
                                cursorOooO0Oo.close();
                            }
                            throw th2;
                        }
                    }
                }
            }).start();
        }
    }
}
