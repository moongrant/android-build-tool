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
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
class UploadPartTask implements Callable<Boolean> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Log f10532OooO0o = LogFactory.OooO00o(UploadPartTask.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final UploadTask.UploadPartTaskMetadata f10533OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final UploadTask.UploadTaskProgressListener f10534OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final UploadPartRequest f10535OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AmazonS3 f10536OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TransferDBUtil f10537OooO0o0;

    public class UploadPartTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public UploadTask.UploadTaskProgressListener f10538OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f10539OooO0O0;

        public UploadPartTaskProgressListener(UploadTask.UploadTaskProgressListener uploadTaskProgressListener) {
            this.f10538OooO00o = uploadTaskProgressListener;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadPartTaskMetadata>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadPartTaskMetadata>] */
        @Override // com.amazonaws.event.ProgressListener
        public final void OooO00o(ProgressEvent progressEvent) {
            long j = 0;
            if (32 == progressEvent.f10370OooO0O0) {
                UploadPartTask.f10532OooO0o.OooO0o("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f10539OooO0O0 = 0L;
            } else {
                this.f10539OooO0O0 += progressEvent.f10369OooO00o;
            }
            UploadTask.UploadTaskProgressListener uploadTaskProgressListener = this.f10538OooO00o;
            int i = UploadPartTask.this.f10535OooO0OO.f10947OoooO;
            long j2 = this.f10539OooO0O0;
            synchronized (uploadTaskProgressListener) {
                UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = (UploadTask.UploadPartTaskMetadata) UploadTask.this.f10548OooO0o0.get(Integer.valueOf(i));
                if (uploadPartTaskMetadata == null) {
                    UploadTask.f10541OooO0oO.OooO0o("Update received for unknown part. Ignoring.");
                    return;
                }
                uploadPartTaskMetadata.f10550OooO0O0 = j2;
                Iterator it = UploadTask.this.f10548OooO0o0.entrySet().iterator();
                while (it.hasNext()) {
                    j += ((UploadTask.UploadPartTaskMetadata) ((Map.Entry) it.next()).getValue()).f10550OooO0O0;
                }
                if (j > uploadTaskProgressListener.f10552OooO00o) {
                    UploadTask uploadTask = UploadTask.this;
                    TransferStatusUpdater transferStatusUpdater = uploadTask.f10546OooO0Oo;
                    TransferRecord transferRecord = uploadTask.f10544OooO0O0;
                    transferStatusUpdater.OooO0o0(transferRecord.f10471OooO00o, j, transferRecord.f10475OooO0o, true);
                    uploadTaskProgressListener.f10552OooO00o = j;
                }
            }
        }
    }

    public UploadPartTask(UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata, UploadTask.UploadTaskProgressListener uploadTaskProgressListener, UploadPartRequest uploadPartRequest, AmazonS3 amazonS3, TransferDBUtil transferDBUtil) {
        this.f10533OooO00o = uploadPartTaskMetadata;
        this.f10534OooO0O0 = uploadTaskProgressListener;
        this.f10535OooO0OO = uploadPartRequest;
        this.f10536OooO0Oo = amazonS3;
        this.f10537OooO0o0 = transferDBUtil;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        try {
            this.f10533OooO00o.f10551OooO0OO = TransferState.IN_PROGRESS;
            UploadPartRequest uploadPartRequest = this.f10535OooO0OO;
            uploadPartRequest.f10272Oooo0o = new UploadPartTaskProgressListener(this.f10534OooO0O0);
            UploadPartResult uploadPartResultUploadPart = this.f10536OooO0Oo.uploadPart(uploadPartRequest);
            UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = this.f10533OooO00o;
            TransferState transferState = TransferState.PART_COMPLETED;
            uploadPartTaskMetadata.f10551OooO0OO = transferState;
            this.f10537OooO0o0.OooO0o0(this.f10535OooO0OO.f10946Oooo, transferState);
            TransferDBUtil transferDBUtil = this.f10537OooO0o0;
            int i = this.f10535OooO0OO.f10946Oooo;
            String str = uploadPartResultUploadPart.f10954Oooo;
            Objects.requireNonNull(transferDBUtil);
            ContentValues contentValues = new ContentValues();
            contentValues.put("etag", str);
            TransferDBUtil.f10461OooO0OO.OooO0OO(transferDBUtil.OooO0OO(i), contentValues, null, null);
            return Boolean.TRUE;
        } catch (Exception e) {
            Log log = f10532OooO0o;
            log.OooOO0("Upload part interrupted: " + e);
            new ProgressEvent(0L).f10370OooO0O0 = 32;
            Objects.requireNonNull(this.f10534OooO0O0);
            try {
                if (TransferNetworkLossHandler.OooO00o() != null && !TransferNetworkLossHandler.OooO00o().OooO0O0()) {
                    log.OooO0o("Thread: [" + Thread.currentThread().getId() + "]: Network wasn't available.");
                    UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata2 = this.f10533OooO00o;
                    TransferState transferState2 = TransferState.WAITING_FOR_NETWORK;
                    uploadPartTaskMetadata2.f10551OooO0OO = transferState2;
                    this.f10537OooO0o0.OooO0o0(this.f10535OooO0OO.f10946Oooo, transferState2);
                    log.OooO0o("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                    return Boolean.FALSE;
                }
            } catch (TransferUtilityException e2) {
                f10532OooO0o.OooOO0("TransferUtilityException: [" + e2 + "]");
            }
            UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata3 = this.f10533OooO00o;
            TransferState transferState3 = TransferState.FAILED;
            uploadPartTaskMetadata3.f10551OooO0OO = transferState3;
            this.f10537OooO0o0.OooO0o0(this.f10535OooO0OO.f10946Oooo, transferState3);
            f10532OooO0o.OooO0oo("Encountered error uploading part ", e);
            throw e;
        }
    }
}
