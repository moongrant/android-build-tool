package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.database.Cursor;
import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.util.Mimetypes;
import com.facebook.share.internal.ShareInternalUtility;
import com.qiniu.android.collect.ReportItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
class UploadTask implements Callable<Boolean> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Log f9221OooO0oO = LogFactory.OooO00o(UploadTask.class);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final HashMap f9222OooO0oo = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AmazonS3 f9223OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TransferRecord f9224OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TransferDBUtil f9225OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TransferStatusUpdater f9226OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList f9227OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f9228OooO0o0 = new HashMap();

    public class UploadPartTaskMetadata {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Future<Boolean> f9229OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f9230OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public TransferState f9231OooO0OO;
    }

    public class UploadTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f9232OooO00o;

        public UploadTaskProgressListener(TransferRecord transferRecord) {
            this.f9232OooO00o = transferRecord.f9165OooO0oO;
        }

        @Override // com.amazonaws.event.ProgressListener
        public final void OooO00o(ProgressEvent progressEvent) {
        }
    }

    static {
        for (CannedAccessControlList cannedAccessControlList : CannedAccessControlList.values()) {
            f9222OooO0oo.put(cannedAccessControlList.toString(), cannedAccessControlList);
        }
    }

    public UploadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater) {
        this.f9224OooO0O0 = transferRecord;
        this.f9223OooO00o = amazonS3;
        this.f9225OooO0OO = transferDBUtil;
        this.f9226OooO0Oo = transferStatusUpdater;
    }

    public static PutObjectRequest OooO0O0(TransferRecord transferRecord) {
        File file = new File(transferRecord.f9171OooOOO0);
        PutObjectRequest putObjectRequest = new PutObjectRequest(transferRecord.f9168OooOO0O, transferRecord.f9169OooOO0o, file);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        Long lValueOf = Long.valueOf(file.length());
        TreeMap treeMap = objectMetadata.f9414OooO0o0;
        treeMap.put("Content-Length", lValueOf);
        String str = transferRecord.f9176OooOOoo;
        if (str != null) {
            treeMap.put("Cache-Control", str);
        }
        String str2 = transferRecord.f9175OooOOo0;
        if (str2 != null) {
            treeMap.put("Content-Disposition", str2);
        }
        String str3 = transferRecord.f9174OooOOo;
        if (str3 != null) {
            treeMap.put("Content-Encoding", str3);
        }
        String str4 = transferRecord.f9173OooOOOo;
        if (str4 != null) {
            treeMap.put("Content-Type", str4);
        } else {
            treeMap.put("Content-Type", Mimetypes.OooO00o().OooO0O0(file));
        }
        String str5 = transferRecord.f9179OooOo00;
        if (str5 != null) {
            putObjectRequest.f9356OooOOO = str5;
        }
        if (transferRecord.f9180OooOo0O != null) {
            objectMetadata.f9413OooO0o = new Date(Long.valueOf(transferRecord.f9180OooOo0O).longValue());
        }
        String str6 = transferRecord.f9181OooOo0o;
        if (str6 != null) {
            objectMetadata.OooO0o(str6);
        }
        Map<String, String> map = transferRecord.f9178OooOo0;
        if (map != null) {
            objectMetadata.f9412OooO0Oo = map;
            String str7 = map.get("x-amz-tagging");
            if (str7 != null) {
                try {
                    String[] strArrSplit = str7.split("&");
                    ArrayList arrayList = new ArrayList();
                    for (String str8 : strArrSplit) {
                        String[] strArrSplit2 = str8.split("=");
                        arrayList.add(new Tag(strArrSplit2[0], strArrSplit2[1]));
                    }
                    putObjectRequest.f9360OooOOo0 = new ObjectTagging(arrayList);
                } catch (Exception e) {
                    f9221OooO0oO.OooO0Oo("Error in passing the object tags as request headers.", e);
                }
            }
            String str9 = transferRecord.f9178OooOo0.get("x-amz-website-redirect-location");
            if (str9 != null) {
                putObjectRequest.f9358OooOOOO = str9;
            }
            String str10 = transferRecord.f9178OooOo0.get("x-amz-request-payer");
            if (str10 != null) {
                putObjectRequest.f9423OooOOo = "requester".equals(str10);
            }
        }
        String str11 = transferRecord.f9183OooOoO0;
        if (str11 != null) {
            treeMap.put("Content-MD5", str11);
        }
        String str12 = transferRecord.f9177OooOo;
        if (str12 != null) {
            putObjectRequest.f9359OooOOOo = new SSEAwsKeyManagementParams(str12);
        }
        putObjectRequest.f9354OooOO0O = objectMetadata;
        String str13 = transferRecord.f9182OooOoO;
        putObjectRequest.f9355OooOO0o = str13 == null ? null : (CannedAccessControlList) f9222OooO0oo.get(str13);
        return putObjectRequest;
    }

    public final void OooO00o(int i, String str, String str2, String str3) throws AmazonClientException {
        this.f9225OooO0OO.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor cursorOooO0O0 = null;
        try {
            cursorOooO0O0 = TransferDBUtil.f9149OooO0OO.OooO0O0(TransferDBUtil.OooO0O0(i), null, null);
            while (cursorOooO0O0.moveToNext()) {
                arrayList.add(new PartETag(cursorOooO0O0.getInt(cursorOooO0O0.getColumnIndexOrThrow("part_num")), cursorOooO0O0.getString(cursorOooO0O0.getColumnIndexOrThrow("etag"))));
            }
            cursorOooO0O0.close();
            CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(str, str2, str3, arrayList);
            TransferUtility.OooO00o(completeMultipartUploadRequest);
            this.f9223OooO00o.OooO00o(completeMultipartUploadRequest);
        } catch (Throwable th) {
            if (cursorOooO0O0 != null) {
                cursorOooO0O0.close();
            }
            throw th;
        }
    }

    public final String OooO0OO(PutObjectRequest putObjectRequest) {
        InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(putObjectRequest.f9351OooO0oO, putObjectRequest.f9352OooO0oo);
        initiateMultipartUploadRequest.f9402OooOO0 = putObjectRequest.f9355OooOO0o;
        initiateMultipartUploadRequest.f9399OooO = putObjectRequest.f9354OooOO0O;
        initiateMultipartUploadRequest.f9403OooOO0O = putObjectRequest.f9359OooOOOo;
        initiateMultipartUploadRequest.f9404OooOO0o = putObjectRequest.f9360OooOOo0;
        TransferUtility.OooO00o(initiateMultipartUploadRequest);
        return this.f9223OooO00o.OooO0O0(initiateMultipartUploadRequest).f9405OooO0Oo;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        long j;
        Cursor cursorOooO0O0;
        HashMap map;
        Cursor cursorOooO0O1;
        TransferRecord transferRecord = this.f9224OooO0O0;
        TransferStatusUpdater transferStatusUpdater = this.f9226OooO0Oo;
        Log log = f9221OooO0oO;
        try {
            TransferNetworkLossHandler.OooO0O0();
            if (!TransferNetworkLossHandler.OooO0O0().OooO0Oo()) {
                log.OooO0oo("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            log.OooO0o0("TransferUtilityException: [" + e + "]");
        }
        transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.IN_PROGRESS);
        int i = transferRecord.f9161OooO0OO;
        AmazonS3 amazonS3 = this.f9223OooO00o;
        if (i != 1 || transferRecord.f9164OooO0o0 != 0) {
            if (i != 0) {
                return Boolean.FALSE;
            }
            PutObjectRequest putObjectRequestOooO0O0 = OooO0O0(transferRecord);
            ProgressListener progressListenerOooO0Oo = transferStatusUpdater.OooO0Oo(transferRecord.f9159OooO00o);
            long length = putObjectRequestOooO0O0.f9350OooO.length();
            TransferUtility.OooO0O0(putObjectRequestOooO0O0);
            putObjectRequestOooO0O0.f8962OooO0Oo = progressListenerOooO0Oo;
            try {
                amazonS3.OooO0o(putObjectRequestOooO0O0);
                this.f9226OooO0Oo.OooO0oO(length, length, true, transferRecord.f9159OooO00o);
                transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.COMPLETED);
                return Boolean.TRUE;
            } catch (Exception e2) {
                if (TransferState.PENDING_CANCEL.equals(transferRecord.f9167OooOO0)) {
                    int i2 = transferRecord.f9159OooO00o;
                    TransferState transferState = TransferState.CANCELED;
                    transferStatusUpdater.OooO0oo(i2, transferState);
                    log.OooO0oo("Transfer is " + transferState);
                    return Boolean.FALSE;
                }
                if (TransferState.PENDING_PAUSE.equals(transferRecord.f9167OooOO0)) {
                    int i3 = transferRecord.f9159OooO00o;
                    TransferState transferState2 = TransferState.PAUSED;
                    transferStatusUpdater.OooO0oo(i3, transferState2);
                    log.OooO0oo("Transfer is " + transferState2);
                    new ProgressEvent(0L).f9065OooO0O0 = 32;
                    ((TransferStatusUpdater.TransferProgressListener) progressListenerOooO0Oo).OooO00o(new ProgressEvent(0L));
                    return Boolean.FALSE;
                }
                try {
                    TransferNetworkLossHandler.OooO0O0();
                    if (!TransferNetworkLossHandler.OooO0O0().OooO0Oo()) {
                        log.OooO0oo("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.WAITING_FOR_NETWORK);
                        log.OooO0oO("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0L).f9065OooO0O0 = 32;
                        ((TransferStatusUpdater.TransferProgressListener) progressListenerOooO0Oo).OooO00o(new ProgressEvent(0L));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e3) {
                    log.OooO0o0("TransferUtilityException: [" + e3 + "]");
                }
                if (RetryUtils.OooO0O0(e2)) {
                    log.OooO0oo("Transfer is interrupted. " + e2);
                    transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.FAILED);
                    return Boolean.FALSE;
                }
                log.OooO0oO("Failed to upload: " + transferRecord.f9159OooO00o + " due to " + e2.getMessage());
                transferStatusUpdater.OooO0o(transferRecord.f9159OooO00o, e2);
                transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.FAILED);
                return Boolean.FALSE;
            }
        }
        String str = transferRecord.f9170OooOOO;
        String str2 = "state";
        TransferDBUtil transferDBUtil = this.f9225OooO0OO;
        if (str == null || str.isEmpty()) {
            PutObjectRequest putObjectRequestOooO0O1 = OooO0O0(transferRecord);
            TransferUtility.OooO00o(putObjectRequestOooO0O1);
            try {
                String strOooO0OO = OooO0OO(putObjectRequestOooO0O1);
                transferRecord.f9170OooOOO = strOooO0OO;
                int i4 = transferRecord.f9159OooO00o;
                transferDBUtil.getClass();
                ContentValues contentValues = new ContentValues();
                contentValues.put("multipart_id", strOooO0OO);
                TransferDBUtil.f9149OooO0OO.OooO0OO(TransferDBUtil.OooO0OO(i4), contentValues, null, null);
                j = 0;
            } catch (AmazonClientException e4) {
                log.OooO0Oo("Error initiating multipart upload: " + transferRecord.f9159OooO00o + " due to " + e4.getMessage(), e4);
                transferStatusUpdater.OooO0o(transferRecord.f9159OooO00o, e4);
                transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.FAILED);
                return Boolean.FALSE;
            }
        } else {
            int i5 = transferRecord.f9159OooO00o;
            transferDBUtil.getClass();
            try {
                cursorOooO0O1 = TransferDBUtil.f9149OooO0OO.OooO0O0(TransferDBUtil.OooO0O0(i5), null, null);
                long j2 = 0;
                while (cursorOooO0O1.moveToNext()) {
                    try {
                        if (TransferState.PART_COMPLETED.equals(TransferState.OooO00o(cursorOooO0O1.getString(cursorOooO0O1.getColumnIndexOrThrow("state"))))) {
                            j2 += cursorOooO0O1.getLong(cursorOooO0O1.getColumnIndexOrThrow(ReportItem.RequestKeyBytesTotal));
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursorOooO0O1 != null) {
                            cursorOooO0O1.close();
                        }
                        throw th;
                    }
                }
                cursorOooO0O1.close();
                if (j2 > 0) {
                    log.OooO0oo(String.format("Resume transfer %d from %d bytes", Integer.valueOf(transferRecord.f9159OooO00o), Long.valueOf(j2)));
                }
                j = j2;
            } catch (Throwable th2) {
                th = th2;
                cursorOooO0O1 = null;
            }
        }
        UploadTaskProgressListener uploadTaskProgressListener = new UploadTaskProgressListener(transferRecord);
        this.f9226OooO0Oo.OooO0oO(j, transferRecord.f9163OooO0o, false, transferRecord.f9159OooO00o);
        int i6 = transferRecord.f9159OooO00o;
        String str3 = transferRecord.f9170OooOOO;
        transferDBUtil.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            cursorOooO0O0 = null;
            try {
                cursorOooO0O0 = TransferDBUtil.f9149OooO0OO.OooO0O0(TransferDBUtil.OooO0O0(i6), null, null);
                while (cursorOooO0O0.moveToNext()) {
                    if (!TransferState.PART_COMPLETED.equals(TransferState.OooO00o(cursorOooO0O0.getString(cursorOooO0O0.getColumnIndexOrThrow(str2))))) {
                        UploadPartRequest uploadPartRequest = new UploadPartRequest();
                        uploadPartRequest.f9445OooO0oO = cursorOooO0O0.getInt(cursorOooO0O0.getColumnIndexOrThrow("_id"));
                        cursorOooO0O0.getInt(cursorOooO0O0.getColumnIndexOrThrow("main_upload_id"));
                        uploadPartRequest.f9446OooO0oo = cursorOooO0O0.getString(cursorOooO0O0.getColumnIndexOrThrow("bucket_name"));
                        uploadPartRequest.f9444OooO = cursorOooO0O0.getString(cursorOooO0O0.getColumnIndexOrThrow("key"));
                        uploadPartRequest.f9447OooOO0 = str3;
                        String str4 = str2;
                        uploadPartRequest.f9451OooOOO0 = new File(cursorOooO0O0.getString(cursorOooO0O0.getColumnIndexOrThrow(ShareInternalUtility.STAGING_PARAM)));
                        String str5 = str3;
                        uploadPartRequest.f9450OooOOO = cursorOooO0O0.getLong(cursorOooO0O0.getColumnIndexOrThrow(ReportItem.RequestKeyFileOffset));
                        uploadPartRequest.f9448OooOO0O = cursorOooO0O0.getInt(cursorOooO0O0.getColumnIndexOrThrow("part_num"));
                        uploadPartRequest.f9449OooOO0o = cursorOooO0O0.getLong(cursorOooO0O0.getColumnIndexOrThrow(ReportItem.RequestKeyBytesTotal));
                        cursorOooO0O0.getInt(cursorOooO0O0.getColumnIndexOrThrow("is_last_part"));
                        arrayList.add(uploadPartRequest);
                        str2 = str4;
                        str3 = str5;
                    }
                }
                cursorOooO0O0.close();
                this.f9227OooO0o = arrayList;
                log.OooO0oo("Multipart upload " + transferRecord.f9159OooO00o + " in " + this.f9227OooO0o.size() + " parts.");
                Iterator it = this.f9227OooO0o.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    map = this.f9228OooO0o0;
                    if (!zHasNext) {
                        try {
                            break;
                        } catch (Exception e5) {
                            log.OooO0o0("Upload resulted in an exception. " + e5);
                            Iterator it2 = map.values().iterator();
                            while (it2.hasNext()) {
                                ((UploadPartTaskMetadata) it2.next()).f9229OooO00o.cancel(true);
                            }
                            if (TransferState.PENDING_CANCEL.equals(transferRecord.f9167OooOO0)) {
                                int i7 = transferRecord.f9159OooO00o;
                                TransferState transferState3 = TransferState.CANCELED;
                                transferStatusUpdater.OooO0oo(i7, transferState3);
                                log.OooO0oo("Transfer is " + transferState3);
                                return Boolean.FALSE;
                            }
                            if (TransferState.PENDING_PAUSE.equals(transferRecord.f9167OooOO0)) {
                                int i8 = transferRecord.f9159OooO00o;
                                TransferState transferState4 = TransferState.PAUSED;
                                transferStatusUpdater.OooO0oo(i8, transferState4);
                                log.OooO0oo("Transfer is " + transferState4);
                                return Boolean.FALSE;
                            }
                            for (UploadPartTaskMetadata uploadPartTaskMetadata : map.values()) {
                                TransferState transferState5 = TransferState.WAITING_FOR_NETWORK;
                                if (transferState5.equals(uploadPartTaskMetadata.f9231OooO0OO)) {
                                    log.OooO0oo("Individual part is WAITING_FOR_NETWORK.");
                                    transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, transferState5);
                                    return Boolean.FALSE;
                                }
                            }
                            try {
                                TransferNetworkLossHandler.OooO0O0();
                                if (!TransferNetworkLossHandler.OooO0O0().OooO0Oo()) {
                                    log.OooO0oo("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                                    transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.WAITING_FOR_NETWORK);
                                    return Boolean.FALSE;
                                }
                            } catch (TransferUtilityException e6) {
                                log.OooO0o0("TransferUtilityException: [" + e6 + "]");
                            }
                            if (RetryUtils.OooO0O0(e5)) {
                                log.OooO0oo("Transfer is interrupted. " + e5);
                                transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.FAILED);
                                return Boolean.FALSE;
                            }
                            log.OooO0Oo("Error encountered during multi-part upload: " + transferRecord.f9159OooO00o + " due to " + e5.getMessage(), e5);
                            transferStatusUpdater.OooO0o(transferRecord.f9159OooO00o, e5);
                            transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.FAILED);
                            return Boolean.FALSE;
                        }
                    }
                    UploadPartRequest uploadPartRequest2 = (UploadPartRequest) it.next();
                    TransferUtility.OooO00o(uploadPartRequest2);
                    UploadPartTaskMetadata uploadPartTaskMetadata2 = new UploadPartTaskMetadata();
                    uploadPartTaskMetadata2.f9230OooO0O0 = 0L;
                    uploadPartTaskMetadata2.f9231OooO0OO = TransferState.WAITING;
                    map.put(Integer.valueOf(uploadPartRequest2.f9448OooOO0O), uploadPartTaskMetadata2);
                    uploadPartTaskMetadata2.f9229OooO00o = TransferThreadPool.OooO0O0(new UploadPartTask(uploadPartTaskMetadata2, uploadTaskProgressListener, uploadPartRequest2, this.f9223OooO00o, this.f9225OooO0OO));
                }
                Iterator it3 = map.values().iterator();
                boolean zBooleanValue = true;
                while (it3.hasNext()) {
                    zBooleanValue &= ((UploadPartTaskMetadata) it3.next()).f9229OooO00o.get().booleanValue();
                }
                if (!zBooleanValue) {
                    try {
                        TransferNetworkLossHandler.OooO0O0();
                        if (!TransferNetworkLossHandler.OooO0O0().OooO0Oo()) {
                            log.OooO0oo("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                            transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.WAITING_FOR_NETWORK);
                            return Boolean.FALSE;
                        }
                    } catch (TransferUtilityException e7) {
                        log.OooO0o0("TransferUtilityException: [" + e7 + "]");
                    }
                }
                log.OooO0oo("Completing the multi-part upload transfer for " + transferRecord.f9159OooO00o);
                try {
                    OooO00o(transferRecord.f9159OooO00o, transferRecord.f9168OooOO0O, transferRecord.f9169OooOO0o, transferRecord.f9170OooOOO);
                    TransferStatusUpdater transferStatusUpdater2 = this.f9226OooO0Oo;
                    int i9 = transferRecord.f9159OooO00o;
                    long j3 = transferRecord.f9163OooO0o;
                    transferStatusUpdater2.OooO0oO(j3, j3, true, i9);
                    transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.COMPLETED);
                    return Boolean.TRUE;
                } catch (AmazonClientException e8) {
                    log.OooO0Oo("Failed to complete multipart: " + transferRecord.f9159OooO00o + " due to " + e8.getMessage(), e8);
                    int i10 = transferRecord.f9159OooO00o;
                    String str6 = transferRecord.f9168OooOO0O;
                    String str7 = transferRecord.f9169OooOO0o;
                    String str8 = transferRecord.f9170OooOOO;
                    log.OooO0oo("Aborting the multipart since complete multipart failed.");
                    try {
                        amazonS3.OooO0o0(new AbortMultipartUploadRequest(str6, str7, str8));
                        log.OooO0oO("Successfully aborted multipart upload: " + i10);
                    } catch (AmazonClientException e9) {
                        log.OooO00o("Failed to abort the multipart upload: " + i10, e9);
                    }
                    transferStatusUpdater.OooO0o(transferRecord.f9159OooO00o, e8);
                    transferStatusUpdater.OooO0oo(transferRecord.f9159OooO00o, TransferState.FAILED);
                    return Boolean.FALSE;
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursorOooO0O0 != null) {
                    cursorOooO0O0.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cursorOooO0O0 = null;
        }
    }
}
