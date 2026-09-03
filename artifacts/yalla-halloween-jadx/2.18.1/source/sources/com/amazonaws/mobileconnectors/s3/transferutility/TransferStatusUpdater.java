package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class TransferStatusUpdater {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static TransferDBUtil f10507OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static TransferStatusUpdater f10509OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Integer, TransferRecord> f10510OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f10511OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Log f10505OooO0OO = LogFactory.OooO00o(TransferStatusUpdater.class);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final HashSet<TransferState> f10506OooO0Oo = new HashSet<>(Arrays.asList(TransferState.PART_COMPLETED, TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE, TransferState.PENDING_NETWORK_DISCONNECT));

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Map<Integer, List<TransferListener>> f10508OooO0o0 = new ConcurrentHashMap<Integer, List<TransferListener>>() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.1
    };

    public class TransferProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TransferRecord f10522OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f10523OooO0O0;

        public TransferProgressListener(TransferRecord transferRecord) {
            this.f10522OooO00o = transferRecord;
        }

        @Override // com.amazonaws.event.ProgressListener
        public final synchronized void OooO00o(ProgressEvent progressEvent) {
            if (32 == progressEvent.f10370OooO0O0) {
                TransferStatusUpdater.f10505OooO0OO.OooO0o("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f10523OooO0O0 = 0L;
            } else {
                long j = this.f10523OooO0O0 + progressEvent.f10369OooO00o;
                this.f10523OooO0O0 = j;
                TransferRecord transferRecord = this.f10522OooO00o;
                if (j > transferRecord.f10477OooO0oO) {
                    transferRecord.f10477OooO0oO = j;
                    TransferStatusUpdater.this.OooO0o0(transferRecord.f10471OooO00o, j, transferRecord.f10475OooO0o, true);
                }
            }
        }
    }

    public TransferStatusUpdater(TransferDBUtil transferDBUtil) {
        f10507OooO0o = transferDBUtil;
        this.f10511OooO0O0 = new Handler(Looper.getMainLooper());
        this.f10510OooO00o = new ConcurrentHashMap();
    }

    public static synchronized TransferStatusUpdater OooO00o(Context context) {
        if (f10509OooO0oO == null) {
            TransferDBUtil transferDBUtil = new TransferDBUtil(context);
            f10507OooO0o = transferDBUtil;
            f10509OooO0oO = new TransferStatusUpdater(transferDBUtil);
        }
        return f10509OooO0oO;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord>, java.util.concurrent.ConcurrentHashMap] */
    public final synchronized TransferRecord OooO0O0(int i) {
        return (TransferRecord) this.f10510OooO00o.get(Integer.valueOf(i));
    }

    public final synchronized ProgressListener OooO0OO(int i) {
        TransferRecord transferRecordOooO0O0;
        transferRecordOooO0O0 = OooO0O0(i);
        if (transferRecordOooO0O0 == null) {
            f10505OooO0OO.OooO0o("TransferStatusUpdater doesn't track the transfer: " + i);
            throw new IllegalArgumentException("transfer " + i + " doesn't exist");
        }
        f10505OooO0OO.OooO0o("Creating a new progress listener for transfer: " + i);
        return new TransferProgressListener(transferRecordOooO0O0);
    }

    public final void OooO0Oo(final int i, final Exception exc) {
        Map<Integer, List<TransferListener>> map = f10508OooO0o0;
        synchronized (map) {
            List<TransferListener> list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                for (final TransferListener transferListener : list) {
                    this.f10511OooO0O0.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            transferListener.onError();
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009e A[Catch: all -> 0x00d0, LOOP:0: B:31:0x0098->B:33:0x009e, LOOP_END, TryCatch #0 {, blocks: (B:25:0x007e, B:27:0x008d, B:30:0x0094, B:31:0x0098, B:33:0x009e, B:34:0x00af, B:36:0x00b7, B:38:0x00bf, B:41:0x00ca, B:40:0x00c7, B:44:0x00cd), top: B:53:0x007e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:25:0x007e, B:27:0x008d, B:30:0x0094, B:31:0x0098, B:33:0x009e, B:34:0x00af, B:36:0x00b7, B:38:0x00bf, B:41:0x00ca, B:40:0x00c7, B:44:0x00cd), top: B:53:0x007e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Map<java.lang.Integer, com.amazonaws.services.s3.AmazonS3>, java.util.concurrent.ConcurrentHashMap] */
    public final synchronized void OooO0o(final int i, final TransferState transferState) {
        Map<Integer, List<TransferListener>> map;
        List<TransferListener> list;
        boolean zContains = f10506OooO0Oo.contains(transferState);
        TransferRecord transferRecord = (TransferRecord) this.f10510OooO00o.get(Integer.valueOf(i));
        if (transferRecord != null) {
            zContains |= transferState.equals(transferRecord.f10479OooOO0);
            transferRecord.f10479OooOO0 = transferState;
            if (f10507OooO0o.OooO0o(transferRecord) == 0) {
                f10505OooO0OO.OooO("Failed to update the status of transfer " + i);
            }
        } else if (f10507OooO0o.OooO0o0(i, transferState) == 0) {
            f10505OooO0OO.OooO("Failed to update the status of transfer " + i);
        }
        if (zContains) {
            return;
        }
        if (!TransferState.COMPLETED.equals(transferState)) {
            map = f10508OooO0o0;
            synchronized (map) {
                list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
                if (list != null) {
                    for (final TransferListener transferListener : list) {
                        this.f10511OooO0O0.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                transferListener.OooO0O0();
                            }
                        });
                    }
                    if (TransferState.COMPLETED.equals(transferState)) {
                        list.clear();
                    } else {
                        list.clear();
                    }
                    return;
                }
                return;
            }
        }
        synchronized (this) {
            S3ClientReference.f10452OooO00o.remove(Integer.valueOf(i));
            f10507OooO0o.OooO00o(i);
            map = f10508OooO0o0;
            synchronized (map) {
                list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
                if (list != null && !list.isEmpty()) {
                    while (r2.hasNext()) {
                        this.f10511OooO0O0.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                transferListener.OooO0O0();
                            }
                        });
                    }
                    if (TransferState.COMPLETED.equals(transferState) || TransferState.FAILED.equals(transferState) || TransferState.CANCELED.equals(transferState)) {
                        list.clear();
                    }
                    return;
                }
                return;
            }
        }
        throw th;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord>, java.util.concurrent.ConcurrentHashMap] */
    public final synchronized void OooO0o0(final int i, final long j, final long j2, boolean z) {
        TransferRecord transferRecord = (TransferRecord) this.f10510OooO00o.get(Integer.valueOf(i));
        if (transferRecord != null) {
            transferRecord.f10477OooO0oO = j;
            transferRecord.f10475OooO0o = j2;
        }
        TransferDBUtil transferDBUtil = f10507OooO0o;
        Objects.requireNonNull(transferDBUtil);
        ContentValues contentValues = new ContentValues();
        contentValues.put("bytes_current", Long.valueOf(j));
        TransferDBUtil.f10461OooO0OO.OooO0OO(transferDBUtil.OooO0OO(i), contentValues, null, null);
        if (z) {
            Map<Integer, List<TransferListener>> map = f10508OooO0o0;
            synchronized (map) {
                List list = (List) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
                if (list != null && !list.isEmpty()) {
                    for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                        final TransferListener transferListener = (TransferListener) it.next();
                        this.f10511OooO0O0.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                transferListener.OooO00o();
                            }
                        });
                    }
                }
            }
        }
    }
}
