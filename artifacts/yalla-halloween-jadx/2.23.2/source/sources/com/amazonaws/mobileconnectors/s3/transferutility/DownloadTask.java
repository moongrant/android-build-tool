package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
class DownloadTask implements Callable<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Log f12226OooO0Oo = LogFactory.OooO00o(DownloadTask.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AmazonS3 f12227OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TransferRecord f12228OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TransferStatusUpdater f12229OooO0OO;

    public DownloadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        this.f12228OooO0O0 = transferRecord;
        this.f12227OooO00o = amazonS3;
        this.f12229OooO0OO = transferStatusUpdater;
    }

    public static void OooO00o(File file, S3ObjectInputStream s3ObjectInputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        Log log = f12226OooO0Oo;
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, file.length() > 0));
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i = s3ObjectInputStream.read(bArr);
                        if (i != -1) {
                            bufferedOutputStream.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                log.OooOO0O("got exception", e);
                            }
                        }
                    }
                    bufferedOutputStream.close();
                    try {
                        s3ObjectInputStream.close();
                    } catch (IOException e2) {
                        log.OooOO0O("got exception", e2);
                    }
                } catch (SocketTimeoutException e3) {
                    e = e3;
                    String str = "SocketTimeoutException: Unable to retrieve contents over network: " + e.getMessage();
                    log.OooO0o0(str);
                    throw new AmazonClientException(str, e);
                } catch (IOException e4) {
                    e = e4;
                    throw new AmazonClientException("Unable to store object contents to disk: " + e.getMessage(), e);
                } catch (Throwable th) {
                    th = th;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e5) {
                            log.OooOO0O("got exception", e5);
                        }
                    }
                    if (s3ObjectInputStream == null) {
                        throw th;
                    }
                    try {
                        s3ObjectInputStream.close();
                        throw th;
                    } catch (IOException e6) {
                        log.OooOO0O("got exception", e6);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (SocketTimeoutException e7) {
            e = e7;
        } catch (IOException e8) {
            e = e8;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        long jLongValue;
        int iLastIndexOf;
        Log log = f12226OooO0Oo;
        TransferStatusUpdater transferStatusUpdater = this.f12229OooO0OO;
        TransferRecord transferRecord = this.f12228OooO0O0;
        try {
            TransferNetworkLossHandler.OooO0O0();
            if (!TransferNetworkLossHandler.OooO0O0().OooO0Oo()) {
                log.OooO0oo("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                transferStatusUpdater.OooO0oo(transferRecord.f12249OooO00o, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            log.OooO0o0("TransferUtilityException: [" + e + "]");
        }
        transferStatusUpdater.OooO0oo(transferRecord.f12249OooO00o, TransferState.IN_PROGRESS);
        ProgressListener progressListenerOooO0Oo = transferStatusUpdater.OooO0Oo(transferRecord.f12249OooO00o);
        try {
            GetObjectRequest getObjectRequest = new GetObjectRequest(transferRecord.f12258OooOO0O, transferRecord.f12259OooOO0o);
            TransferUtility.OooO0O0(getObjectRequest);
            File file = new File(transferRecord.f12261OooOOO0);
            long length = file.length();
            if (length > 0) {
                log.OooO0oO(String.format("Resume transfer %d from %d bytes", Integer.valueOf(transferRecord.f12249OooO00o), Long.valueOf(length)));
                getObjectRequest.f12483OooO0oo = new long[]{length, -1};
            }
            getObjectRequest.f12485OooOO0O = progressListenerOooO0Oo;
            S3Object s3ObjectOooO0OO = this.f12227OooO00o.OooO0OO(getObjectRequest);
            if (s3ObjectOooO0OO == null) {
                transferStatusUpdater.OooO0o(transferRecord.f12249OooO00o, new IllegalStateException("AmazonS3.getObject returns null"));
                transferStatusUpdater.OooO0oo(transferRecord.f12249OooO00o, TransferState.FAILED);
                return Boolean.FALSE;
            }
            ObjectMetadata objectMetadata = s3ObjectOooO0OO.f12515OooO0o;
            String str = (String) objectMetadata.f12504OooO0o0.get("Content-Range");
            if (str == null || (iLastIndexOf = str.lastIndexOf("/")) < 0) {
                Long l = (Long) objectMetadata.f12504OooO0o0.get("Content-Length");
                jLongValue = l == null ? 0L : l.longValue();
            } else {
                jLongValue = Long.parseLong(str.substring(iLastIndexOf + 1));
            }
            long j = jLongValue;
            this.f12229OooO0OO.OooO0oO(length, j, true, transferRecord.f12249OooO00o);
            OooO00o(file, s3ObjectOooO0OO.f12517OooO0oO);
            this.f12229OooO0OO.OooO0oO(j, j, true, transferRecord.f12249OooO00o);
            transferStatusUpdater.OooO0oo(transferRecord.f12249OooO00o, TransferState.COMPLETED);
            return Boolean.TRUE;
        } catch (Exception e2) {
            if (TransferState.PENDING_CANCEL.equals(transferRecord.f12257OooOO0)) {
                int i = transferRecord.f12249OooO00o;
                TransferState transferState = TransferState.CANCELED;
                transferStatusUpdater.OooO0oo(i, transferState);
                log.OooO0oo("Transfer is " + transferState);
                return Boolean.FALSE;
            }
            if (TransferState.PENDING_PAUSE.equals(transferRecord.f12257OooOO0)) {
                int i2 = transferRecord.f12249OooO00o;
                TransferState transferState2 = TransferState.PAUSED;
                transferStatusUpdater.OooO0oo(i2, transferState2);
                log.OooO0oo("Transfer is " + transferState2);
                new ProgressEvent(0L).f12155OooO0O0 = 32;
                ((TransferStatusUpdater.TransferProgressListener) progressListenerOooO0Oo).OooO00o(new ProgressEvent(0L));
                return Boolean.FALSE;
            }
            try {
                TransferNetworkLossHandler.OooO0O0();
                if (!TransferNetworkLossHandler.OooO0O0().OooO0Oo()) {
                    log.OooO0oo("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                    transferStatusUpdater.OooO0oo(transferRecord.f12249OooO00o, TransferState.WAITING_FOR_NETWORK);
                    log.OooO0oO("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                    new ProgressEvent(0L).f12155OooO0O0 = 32;
                    ((TransferStatusUpdater.TransferProgressListener) progressListenerOooO0Oo).OooO00o(new ProgressEvent(0L));
                    return Boolean.FALSE;
                }
            } catch (TransferUtilityException e3) {
                log.OooO0o0("TransferUtilityException: [" + e3 + "]");
            }
            if (RetryUtils.OooO0O0(e2)) {
                log.OooO0oo("Transfer is interrupted. " + e2);
                transferStatusUpdater.OooO0oo(transferRecord.f12249OooO00o, TransferState.FAILED);
                return Boolean.FALSE;
            }
            log.OooO0oO("Failed to download: " + transferRecord.f12249OooO00o + " due to " + e2.getMessage());
            transferStatusUpdater.OooO0o(transferRecord.f12249OooO00o, e2);
            transferStatusUpdater.OooO0oo(transferRecord.f12249OooO00o, TransferState.FAILED);
            return Boolean.FALSE;
        }
    }
}
