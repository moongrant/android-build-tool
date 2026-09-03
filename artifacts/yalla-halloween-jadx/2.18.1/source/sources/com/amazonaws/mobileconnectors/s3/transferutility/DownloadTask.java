package com.amazonaws.mobileconnectors.s3.transferutility;

import OooO00o.OooO00o;
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
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
class DownloadTask implements Callable<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Log f10448OooO0Oo = LogFactory.OooO00o(DownloadTask.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AmazonS3 f10449OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TransferRecord f10450OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TransferStatusUpdater f10451OooO0OO;

    public DownloadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        this.f10450OooO0O0 = transferRecord;
        this.f10449OooO00o = amazonS3;
        this.f10451OooO0OO = transferStatusUpdater;
    }

    public final void OooO00o(InputStream inputStream, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
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
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            bufferedOutputStream.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                f10448OooO0Oo.OooO0oO("got exception", e);
                            }
                        }
                    }
                    bufferedOutputStream.close();
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        f10448OooO0Oo.OooO0oO("got exception", e2);
                    }
                } catch (SocketTimeoutException e3) {
                    e = e3;
                    String str = "SocketTimeoutException: Unable to retrieve contents over network: " + e.getMessage();
                    f10448OooO0Oo.OooOO0(str);
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
                            f10448OooO0Oo.OooO0oO("got exception", e5);
                        }
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    try {
                        inputStream.close();
                        throw th;
                    } catch (IOException e6) {
                        f10448OooO0Oo.OooO0oO("got exception", e6);
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
        try {
            if (TransferNetworkLossHandler.OooO00o() != null && !TransferNetworkLossHandler.OooO00o().OooO0O0()) {
                f10448OooO0Oo.OooO0o("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                this.f10451OooO0OO.OooO0o(this.f10450OooO0O0.f10471OooO00o, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            f10448OooO0Oo.OooOO0("TransferUtilityException: [" + e + "]");
        }
        this.f10451OooO0OO.OooO0o(this.f10450OooO0O0.f10471OooO00o, TransferState.IN_PROGRESS);
        ProgressListener progressListenerOooO0OO = this.f10451OooO0OO.OooO0OO(this.f10450OooO0O0.f10471OooO00o);
        try {
            TransferRecord transferRecord = this.f10450OooO0O0;
            GetObjectRequest getObjectRequest = new GetObjectRequest(transferRecord.f10480OooOO0O, transferRecord.f10481OooOO0o);
            TransferUtility.OooO0O0(getObjectRequest);
            File file = new File(this.f10450OooO0O0.f10483OooOOO0);
            long length = file.length();
            if (length > 0) {
                f10448OooO0Oo.OooO00o(String.format("Resume transfer %d from %d bytes", Integer.valueOf(this.f10450OooO0O0.f10471OooO00o), Long.valueOf(length)));
                getObjectRequest.f10810OoooO00 = new long[]{length, -1};
            }
            getObjectRequest.f10808OoooO = progressListenerOooO0OO;
            S3Object object = this.f10449OooO00o.getObject(getObjectRequest);
            if (object == null) {
                this.f10451OooO0OO.OooO0Oo(this.f10450OooO0O0.f10471OooO00o, new IllegalStateException("AmazonS3.getObject returns null"));
                this.f10451OooO0OO.OooO0o(this.f10450OooO0O0.f10471OooO00o, TransferState.FAILED);
                return Boolean.FALSE;
            }
            ObjectMetadata objectMetadata = object.f10900Oooo0oo;
            String str = (String) objectMetadata.f10867Oooo0oO.get("Content-Range");
            if (str == null || (iLastIndexOf = str.lastIndexOf("/")) < 0) {
                Long l = (Long) objectMetadata.f10867Oooo0oO.get("Content-Length");
                jLongValue = l == null ? 0L : l.longValue();
            } else {
                jLongValue = Long.parseLong(str.substring(iLastIndexOf + 1));
            }
            long j = jLongValue;
            this.f10451OooO0OO.OooO0o0(this.f10450OooO0O0.f10471OooO00o, length, j, true);
            OooO00o(object.f10897Oooo, file);
            this.f10451OooO0OO.OooO0o0(this.f10450OooO0O0.f10471OooO00o, j, j, true);
            this.f10451OooO0OO.OooO0o(this.f10450OooO0O0.f10471OooO00o, TransferState.COMPLETED);
            return Boolean.TRUE;
        } catch (Exception e2) {
            if (TransferState.PENDING_CANCEL.equals(this.f10450OooO0O0.f10479OooOO0)) {
                TransferStatusUpdater transferStatusUpdater = this.f10451OooO0OO;
                int i = this.f10450OooO0O0.f10471OooO00o;
                TransferState transferState = TransferState.CANCELED;
                transferStatusUpdater.OooO0o(i, transferState);
                f10448OooO0Oo.OooO0o("Transfer is " + transferState);
                return Boolean.FALSE;
            }
            if (TransferState.PENDING_PAUSE.equals(this.f10450OooO0O0.f10479OooOO0)) {
                TransferStatusUpdater transferStatusUpdater2 = this.f10451OooO0OO;
                int i2 = this.f10450OooO0O0.f10471OooO00o;
                TransferState transferState2 = TransferState.PAUSED;
                transferStatusUpdater2.OooO0o(i2, transferState2);
                f10448OooO0Oo.OooO0o("Transfer is " + transferState2);
                new ProgressEvent(0L).f10370OooO0O0 = 32;
                ((TransferStatusUpdater.TransferProgressListener) progressListenerOooO0OO).OooO00o(new ProgressEvent(0L));
                return Boolean.FALSE;
            }
            try {
                if (TransferNetworkLossHandler.OooO00o() != null && !TransferNetworkLossHandler.OooO00o().OooO0O0()) {
                    Log log = f10448OooO0Oo;
                    log.OooO0o("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                    this.f10451OooO0OO.OooO0o(this.f10450OooO0O0.f10471OooO00o, TransferState.WAITING_FOR_NETWORK);
                    log.OooO00o("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                    new ProgressEvent(0L).f10370OooO0O0 = 32;
                    ((TransferStatusUpdater.TransferProgressListener) progressListenerOooO0OO).OooO00o(new ProgressEvent(0L));
                    return Boolean.FALSE;
                }
            } catch (TransferUtilityException e3) {
                f10448OooO0Oo.OooOO0("TransferUtilityException: [" + e3 + "]");
            }
            if (RetryUtils.OooO0O0(e2)) {
                f10448OooO0Oo.OooO0o("Transfer is interrupted. " + e2);
                this.f10451OooO0OO.OooO0o(this.f10450OooO0O0.f10471OooO00o, TransferState.FAILED);
                return Boolean.FALSE;
            }
            Log log2 = f10448OooO0Oo;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed to download: ");
            sbOooO0o0.append(this.f10450OooO0O0.f10471OooO00o);
            sbOooO0o0.append(" due to ");
            sbOooO0o0.append(e2.getMessage());
            log2.OooO00o(sbOooO0o0.toString());
            this.f10451OooO0OO.OooO0Oo(this.f10450OooO0O0.f10471OooO00o, e2);
            this.f10451OooO0OO.OooO0o(this.f10450OooO0O0.f10471OooO00o, TransferState.FAILED);
            return Boolean.FALSE;
        }
    }
}
