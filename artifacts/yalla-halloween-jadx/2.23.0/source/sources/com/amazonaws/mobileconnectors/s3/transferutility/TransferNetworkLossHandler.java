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
import java.util.ArrayList;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class TransferNetworkLossHandler extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Log f9151OooO0Oo = LogFactory.OooO00o(TransferNetworkLossHandler.class);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static TransferNetworkLossHandler f9152OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConnectivityManager f9153OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TransferDBUtil f9154OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TransferStatusUpdater f9155OooO0OO;

    public TransferNetworkLossHandler(Context context) {
        TransferStatusUpdater transferStatusUpdater;
        this.f9153OooO00o = (ConnectivityManager) context.getSystemService("connectivity");
        this.f9154OooO0O0 = new TransferDBUtil(context);
        Log log = TransferStatusUpdater.f9192OooO0OO;
        synchronized (TransferStatusUpdater.class) {
            if (TransferStatusUpdater.f9196OooO0oO == null) {
                TransferDBUtil transferDBUtil = new TransferDBUtil(context);
                TransferStatusUpdater.f9194OooO0o = transferDBUtil;
                TransferStatusUpdater.f9196OooO0oO = new TransferStatusUpdater(transferDBUtil);
            }
            transferStatusUpdater = TransferStatusUpdater.f9196OooO0oO;
        }
        this.f9155OooO0OO = transferStatusUpdater;
    }

    public static void OooO00o(TransferNetworkLossHandler transferNetworkLossHandler) {
        TransferRecord transferRecordOooO0O0;
        synchronized (transferNetworkLossHandler) {
            TransferState[] transferStateArr = {TransferState.WAITING_FOR_NETWORK};
            f9151OooO0Oo.OooO0oO("Loading transfers from database...");
            ArrayList<Integer> arrayList = new ArrayList();
            Cursor cursorOooO0Oo = null;
            try {
                TransferDBUtil transferDBUtil = transferNetworkLossHandler.f9154OooO0O0;
                TransferType transferType = TransferType.ANY;
                transferDBUtil.getClass();
                cursorOooO0Oo = TransferDBUtil.OooO0Oo(transferType, transferStateArr);
                int i = 0;
                while (cursorOooO0Oo.moveToNext()) {
                    int i2 = cursorOooO0Oo.getInt(cursorOooO0Oo.getColumnIndexOrThrow("_id"));
                    if (transferNetworkLossHandler.f9155OooO0OO.OooO0O0(i2) == null) {
                        TransferRecord transferRecord = new TransferRecord(i2);
                        transferRecord.OooO0OO(cursorOooO0Oo);
                        transferNetworkLossHandler.f9155OooO0OO.OooO00o(transferRecord);
                        i++;
                    }
                    arrayList.add(Integer.valueOf(i2));
                }
                f9151OooO0Oo.OooO0oO("Closing the cursor for resumeAllTransfers");
                cursorOooO0Oo.close();
                try {
                    for (Integer num : arrayList) {
                        AmazonS3 amazonS3 = (AmazonS3) S3ClientReference.f9140OooO00o.get(num);
                        if (amazonS3 != null && (transferRecordOooO0O0 = transferNetworkLossHandler.f9155OooO0OO.OooO0O0(num.intValue())) != null) {
                            Future<?> future = transferRecordOooO0O0.f9186OooOoo0;
                            if (!((future == null || future.isDone()) ? false : true)) {
                                transferRecordOooO0O0.OooO0O0(amazonS3, transferNetworkLossHandler.f9154OooO0O0, transferNetworkLossHandler.f9155OooO0OO, transferNetworkLossHandler.f9153OooO00o);
                            }
                        }
                    }
                } catch (Exception e) {
                    f9151OooO0Oo.OooO0o0("Error in resuming the transfers." + e.getMessage());
                }
                f9151OooO0Oo.OooO0oO(i + " transfers are loaded from database.");
            } catch (Throwable th) {
                if (cursorOooO0Oo != null) {
                    f9151OooO0Oo.OooO0oO("Closing the cursor for resumeAllTransfers");
                    cursorOooO0Oo.close();
                }
                throw th;
            }
        }
    }

    public static synchronized TransferNetworkLossHandler OooO0O0() throws TransferUtilityException {
        TransferNetworkLossHandler transferNetworkLossHandler;
        transferNetworkLossHandler = f9152OooO0o0;
        if (transferNetworkLossHandler == null) {
            f9151OooO0Oo.OooO0o0("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
            throw new TransferUtilityException(0);
        }
        return transferNetworkLossHandler;
    }

    public static synchronized TransferNetworkLossHandler OooO0OO(Context context) {
        if (f9152OooO0o0 == null) {
            f9152OooO0o0 = new TransferNetworkLossHandler(context);
        }
        return f9152OooO0o0;
    }

    public final boolean OooO0Oo() {
        NetworkInfo activeNetworkInfo = this.f9153OooO00o.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            Log log = f9151OooO0Oo;
            log.OooO0oo("Network connectivity changed detected.");
            log.OooO0oo("Network connected: " + OooO0Oo());
            new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (TransferNetworkLossHandler.this.OooO0Oo()) {
                        TransferNetworkLossHandler.OooO00o(TransferNetworkLossHandler.this);
                        return;
                    }
                    TransferNetworkLossHandler transferNetworkLossHandler = TransferNetworkLossHandler.this;
                    synchronized (transferNetworkLossHandler) {
                        for (TransferRecord transferRecord : transferNetworkLossHandler.f9155OooO0OO.OooO0OO().values()) {
                            if (((AmazonS3) S3ClientReference.f9140OooO00o.get(Integer.valueOf(transferRecord.f9159OooO00o))) != null) {
                                boolean z = false;
                                if (!transferRecord.OooO00o(transferNetworkLossHandler.f9155OooO0OO, transferNetworkLossHandler.f9153OooO00o)) {
                                    TransferState transferState = transferRecord.f9167OooOO0;
                                    if (!(TransferState.COMPLETED.equals(transferState) || TransferState.FAILED.equals(transferState) || TransferState.CANCELED.equals(transferState))) {
                                        Future<?> future = transferRecord.f9186OooOoo0;
                                        if (future != null && !future.isDone()) {
                                            z = true;
                                        }
                                        if (z) {
                                            transferRecord.f9186OooOoo0.cancel(true);
                                        }
                                        z = true;
                                    }
                                }
                                if (z) {
                                    transferNetworkLossHandler.f9155OooO0OO.OooO0oo(transferRecord.f9159OooO00o, TransferState.WAITING_FOR_NETWORK);
                                }
                            }
                        }
                    }
                }
            }).start();
        }
    }
}
