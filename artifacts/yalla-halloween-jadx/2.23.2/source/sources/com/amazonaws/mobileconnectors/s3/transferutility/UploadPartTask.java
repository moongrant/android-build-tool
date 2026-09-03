package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
class UploadPartTask implements Callable<Boolean> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Log f12302OooO0o = LogFactory.OooO00o(UploadPartTask.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final UploadTask.UploadPartTaskMetadata f12303OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final UploadTask.UploadTaskProgressListener f12304OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final UploadPartRequest f12305OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AmazonS3 f12306OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TransferDBUtil f12307OooO0o0;

    public class UploadPartTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final UploadTask.UploadTaskProgressListener f12308OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f12309OooO0O0;

        public UploadPartTaskProgressListener(UploadTask.UploadTaskProgressListener uploadTaskProgressListener) {
            this.f12308OooO00o = uploadTaskProgressListener;
        }

        @Override // com.amazonaws.event.ProgressListener
        public final void OooO00o(ProgressEvent progressEvent) {
            long j = 0;
            if (32 == progressEvent.f12155OooO0O0) {
                UploadPartTask.f12302OooO0o.OooO0oo("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f12309OooO0O0 = 0L;
            } else {
                this.f12309OooO0O0 += progressEvent.f12154OooO00o;
            }
            UploadTask.UploadTaskProgressListener uploadTaskProgressListener = this.f12308OooO00o;
            int i = UploadPartTask.this.f12305OooO0OO.f12539OooOO0O;
            long j2 = this.f12309OooO0O0;
            synchronized (uploadTaskProgressListener) {
                UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = (UploadTask.UploadPartTaskMetadata) UploadTask.this.f12318OooO0o0.get(Integer.valueOf(i));
                if (uploadPartTaskMetadata == null) {
                    UploadTask.f12311OooO0oO.OooO0oo("Update received for unknown part. Ignoring.");
                    return;
                }
                uploadPartTaskMetadata.f12320OooO0O0 = j2;
                Iterator it = UploadTask.this.f12318OooO0o0.entrySet().iterator();
                while (it.hasNext()) {
                    j += ((UploadTask.UploadPartTaskMetadata) ((Map.Entry) it.next()).getValue()).f12320OooO0O0;
                }
                if (j > uploadTaskProgressListener.f12322OooO00o) {
                    UploadTask uploadTask = UploadTask.this;
                    TransferStatusUpdater transferStatusUpdater = uploadTask.f12316OooO0Oo;
                    TransferRecord transferRecord = uploadTask.f12314OooO0O0;
                    transferStatusUpdater.OooO0oO(j, transferRecord.f12253OooO0o, true, transferRecord.f12249OooO00o);
                    uploadTaskProgressListener.f12322OooO00o = j;
                }
            }
        }
    }

    public UploadPartTask(UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata, UploadTask.UploadTaskProgressListener uploadTaskProgressListener, UploadPartRequest uploadPartRequest, AmazonS3 amazonS3, TransferDBUtil transferDBUtil) {
        this.f12303OooO00o = uploadPartTaskMetadata;
        this.f12304OooO0O0 = uploadTaskProgressListener;
        this.f12305OooO0OO = uploadPartRequest;
        this.f12306OooO0Oo = amazonS3;
        this.f12307OooO0o0 = transferDBUtil;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        UploadTask.UploadTaskProgressListener uploadTaskProgressListener = this.f12304OooO0O0;
        TransferDBUtil transferDBUtil = this.f12307OooO0o0;
        UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = this.f12303OooO00o;
        UploadPartRequest uploadPartRequest = this.f12305OooO0OO;
        try {
            uploadPartTaskMetadata.f12321OooO0OO = TransferState.IN_PROGRESS;
            uploadPartRequest.f12052OooO0Oo = new UploadPartTaskProgressListener(uploadTaskProgressListener);
            UploadPartResult uploadPartResultOooO0Oo = this.f12306OooO0Oo.OooO0Oo(uploadPartRequest);
            TransferState transferState = TransferState.PART_COMPLETED;
            uploadPartTaskMetadata.f12321OooO0OO = transferState;
            int i = uploadPartRequest.f12536OooO0oO;
            transferDBUtil.getClass();
            TransferDBUtil.OooO0o0(i, transferState);
            int i2 = uploadPartRequest.f12536OooO0oO;
            String str = uploadPartResultOooO0Oo.f12543OooO0Oo;
            ContentValues contentValues = new ContentValues();
            contentValues.put("etag", str);
            TransferDBUtil.f12239OooO0OO.OooO0OO(TransferDBUtil.OooO0OO(i2), contentValues, null, null);
            return Boolean.TRUE;
        } catch (Exception e) {
            Log log = f12302OooO0o;
            log.OooO0o0("Upload part interrupted: " + e);
            new ProgressEvent(0L).f12155OooO0O0 = 32;
            uploadTaskProgressListener.getClass();
            try {
                TransferNetworkLossHandler.OooO0O0();
                if (!TransferNetworkLossHandler.OooO0O0().OooO0Oo()) {
                    log.OooO0oo("Thread: [" + Thread.currentThread().getId() + "]: Network wasn't available.");
                    TransferState transferState2 = TransferState.WAITING_FOR_NETWORK;
                    uploadPartTaskMetadata.f12321OooO0OO = transferState2;
                    int i3 = uploadPartRequest.f12536OooO0oO;
                    transferDBUtil.getClass();
                    TransferDBUtil.OooO0o0(i3, transferState2);
                    log.OooO0oo("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                    return Boolean.FALSE;
                }
            } catch (TransferUtilityException e2) {
                log.OooO0o0("TransferUtilityException: [" + e2 + "]");
            }
            TransferState transferState3 = TransferState.FAILED;
            uploadPartTaskMetadata.f12321OooO0OO = transferState3;
            int i4 = uploadPartRequest.f12536OooO0oO;
            transferDBUtil.getClass();
            TransferDBUtil.OooO0o0(i4, transferState3);
            log.OooO0Oo("Encountered error uploading part ", e);
            throw e;
        }
    }
}
