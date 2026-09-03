package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
class TransferStatusUpdater {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static TransferDBUtil f9194OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static TransferStatusUpdater f9196OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f9197OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f9198OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Log f9192OooO0OO = LogFactory.OooO00o(TransferStatusUpdater.class);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final HashSet<TransferState> f9193OooO0Oo = new HashSet<>(Arrays.asList(TransferState.PART_COMPLETED, TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE, TransferState.PENDING_NETWORK_DISCONNECT));

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Map<Integer, List<TransferListener>> f9195OooO0o0 = new ConcurrentHashMap<Integer, List<TransferListener>>() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.1
    };

    public class TransferProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TransferRecord f9202OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f9203OooO0O0;

        public TransferProgressListener(TransferRecord transferRecord) {
            this.f9202OooO00o = transferRecord;
        }

        @Override // com.amazonaws.event.ProgressListener
        public final synchronized void OooO00o(ProgressEvent progressEvent) {
            if (32 == progressEvent.f9065OooO0O0) {
                TransferStatusUpdater.f9192OooO0OO.OooO0oo("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f9203OooO0O0 = 0L;
            } else {
                long j = this.f9203OooO0O0 + progressEvent.f9064OooO00o;
                this.f9203OooO0O0 = j;
                TransferRecord transferRecord = this.f9202OooO00o;
                if (j > transferRecord.f9165OooO0oO) {
                    transferRecord.f9165OooO0oO = j;
                    TransferStatusUpdater.this.OooO0oO(j, transferRecord.f9163OooO0o, true, transferRecord.f9159OooO00o);
                }
            }
        }
    }

    public TransferStatusUpdater(TransferDBUtil transferDBUtil) {
        f9194OooO0o = transferDBUtil;
        this.f9198OooO0O0 = new Handler(Looper.getMainLooper());
        this.f9197OooO00o = new ConcurrentHashMap();
    }

    public final synchronized void OooO00o(TransferRecord transferRecord) {
        this.f9197OooO00o.put(Integer.valueOf(transferRecord.f9159OooO00o), transferRecord);
    }

    public final synchronized TransferRecord OooO0O0(int i) {
        return (TransferRecord) this.f9197OooO00o.get(Integer.valueOf(i));
    }

    public final synchronized Map<Integer, TransferRecord> OooO0OO() {
        return Collections.unmodifiableMap(this.f9197OooO00o);
    }

    public final synchronized ProgressListener OooO0Oo(int i) {
        TransferRecord transferRecordOooO0O0;
        transferRecordOooO0O0 = OooO0O0(i);
        if (transferRecordOooO0O0 == null) {
            f9192OooO0OO.OooO0oo("TransferStatusUpdater doesn't track the transfer: " + i);
            throw new IllegalArgumentException("transfer " + i + " doesn't exist");
        }
        f9192OooO0OO.OooO0oo("Creating a new progress listener for transfer: " + i);
        return new TransferProgressListener(transferRecordOooO0O0);
    }

    public final void OooO0o(int i, Exception exc) {
        Map<Integer, List<TransferListener>> map = f9195OooO0o0;
        synchronized (map) {
            List list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f9198OooO0O0.post(new Runnable(i, exc) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9201OooO0Oo.onError();
                        }
                    });
                }
            }
        }
    }

    public final synchronized void OooO0o0(int i) {
        S3ClientReference.f9140OooO00o.remove(Integer.valueOf(i));
        f9194OooO0o.getClass();
        TransferDBUtil.OooO00o(i);
    }

    public final synchronized void OooO0oO(long j, long j2, boolean z, int i) {
        TransferRecord transferRecord = (TransferRecord) this.f9197OooO00o.get(Integer.valueOf(i));
        if (transferRecord != null) {
            transferRecord.f9165OooO0oO = j;
            transferRecord.f9163OooO0o = j2;
        }
        f9194OooO0o.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("bytes_current", Long.valueOf(j));
        TransferDBUtil.f9149OooO0OO.OooO0OO(TransferDBUtil.OooO0OO(i), contentValues, null, null);
        if (z) {
            Map<Integer, List<TransferListener>> map = f9195OooO0o0;
            synchronized (map) {
                List list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.f9198OooO0O0.post(new Runnable(i, j, j2) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f9200OooO0Oo.OooO0O0();
                            }
                        });
                    }
                }
            }
        }
    }

    public final synchronized void OooO0oo(int i, TransferState transferState) {
        boolean zContains = f9193OooO0Oo.contains(transferState);
        TransferRecord transferRecord = (TransferRecord) this.f9197OooO00o.get(Integer.valueOf(i));
        if (transferRecord == null) {
            f9194OooO0o.getClass();
            if (TransferDBUtil.OooO0o0(i, transferState) == 0) {
                f9192OooO0OO.OooO("Failed to update the status of transfer " + i);
            }
        } else {
            zContains |= transferState.equals(transferRecord.f9167OooOO0);
            transferRecord.f9167OooOO0 = transferState;
            f9194OooO0o.getClass();
            if (TransferDBUtil.OooO0o(transferRecord) == 0) {
                f9192OooO0OO.OooO("Failed to update the status of transfer " + i);
            }
        }
        if (zContains) {
            return;
        }
        if (TransferState.COMPLETED.equals(transferState)) {
            OooO0o0(i);
        }
        Map<Integer, List<TransferListener>> map = f9195OooO0o0;
        synchronized (map) {
            List list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f9198OooO0O0.post(new Runnable(i, transferState) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9199OooO0Oo.OooO00o();
                        }
                    });
                }
                if (TransferState.COMPLETED.equals(transferState) || TransferState.FAILED.equals(transferState) || TransferState.CANCELED.equals(transferState)) {
                    list.clear();
                }
            }
        }
    }
}
