package com.amazonaws.mobileconnectors.s3.transferutility;

import OooO00o.OooO00o;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
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
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareInternalUtility;
import com.qiniu.android.collect.ReportItem;
import com.umeng.analytics.pro.ao;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
class UploadTask implements Callable<Boolean> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Log f10541OooO0oO = LogFactory.OooO00o(UploadTask.class);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Map<String, CannedAccessControlList> f10542OooO0oo = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AmazonS3 f10543OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TransferRecord f10544OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TransferDBUtil f10545OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TransferStatusUpdater f10546OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<UploadPartRequest> f10547OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Map<Integer, UploadPartTaskMetadata> f10548OooO0o0 = new HashMap();

    public class UploadPartTaskMetadata {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Future<Boolean> f10549OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f10550OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public TransferState f10551OooO0OO;
    }

    public class UploadTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f10552OooO00o;

        public UploadTaskProgressListener(TransferRecord transferRecord) {
            this.f10552OooO00o = transferRecord.f10477OooO0oO;
        }

        @Override // com.amazonaws.event.ProgressListener
        public final void OooO00o(ProgressEvent progressEvent) {
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.services.s3.model.CannedAccessControlList>] */
    static {
        for (CannedAccessControlList cannedAccessControlList : CannedAccessControlList.values()) {
            f10542OooO0oo.put(cannedAccessControlList.toString(), cannedAccessControlList);
        }
    }

    public UploadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater) {
        this.f10544OooO0O0 = transferRecord;
        this.f10543OooO00o = amazonS3;
        this.f10545OooO0OO = transferDBUtil;
        this.f10546OooO0Oo = transferStatusUpdater;
    }

    public final void OooO00o(int i, String str, String str2, String str3) throws AmazonClientException {
        TransferDBUtil transferDBUtil = this.f10545OooO0OO;
        Objects.requireNonNull(transferDBUtil);
        ArrayList arrayList = new ArrayList();
        Cursor cursorOooO0O0 = null;
        try {
            cursorOooO0O0 = TransferDBUtil.f10461OooO0OO.OooO0O0(transferDBUtil.OooO0O0(i), null, null);
            while (cursorOooO0O0.moveToNext()) {
                arrayList.add(new PartETag(cursorOooO0O0.getInt(cursorOooO0O0.getColumnIndexOrThrow("part_num")), cursorOooO0O0.getString(cursorOooO0O0.getColumnIndexOrThrow("etag"))));
            }
            cursorOooO0O0.close();
            CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(str, str2, str3, arrayList);
            TransferUtility.OooO00o(completeMultipartUploadRequest);
            this.f10543OooO00o.completeMultipartUpload(completeMultipartUploadRequest);
        } catch (Throwable th) {
            if (cursorOooO0O0 != null) {
                cursorOooO0O0.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.services.s3.model.CannedAccessControlList>] */
    public final PutObjectRequest OooO0O0(TransferRecord transferRecord) {
        File file = new File(transferRecord.f10483OooOOO0);
        PutObjectRequest putObjectRequest = new PutObjectRequest(transferRecord.f10480OooOO0O, transferRecord.f10481OooOO0o, file);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.OooOOo0(file.length());
        String str = transferRecord.f10488OooOOoo;
        if (str != null) {
            objectMetadata.f10867Oooo0oO.put("Cache-Control", str);
        }
        String str2 = transferRecord.f10487OooOOo0;
        if (str2 != null) {
            objectMetadata.f10867Oooo0oO.put("Content-Disposition", str2);
        }
        String str3 = transferRecord.f10486OooOOo;
        if (str3 != null) {
            objectMetadata.f10867Oooo0oO.put("Content-Encoding", str3);
        }
        String str4 = transferRecord.f10485OooOOOo;
        if (str4 != null) {
            objectMetadata.OooOOo(str4);
        } else {
            objectMetadata.OooOOo(Mimetypes.OooO00o().OooO0O0(file));
        }
        String str5 = transferRecord.f10491OooOo00;
        if (str5 != null) {
            putObjectRequest.f10698OoooOOO = str5;
        }
        if (transferRecord.f10493OooOo0o != null) {
            objectMetadata.f10868Oooo0oo = new Date(Long.valueOf(transferRecord.f10493OooOo0o).longValue());
        }
        String str6 = transferRecord.f10489OooOo;
        if (str6 != null) {
            objectMetadata.OooO0Oo(str6);
        }
        Map<String, String> map = transferRecord.f10490OooOo0;
        if (map != null) {
            objectMetadata.f10866Oooo0o = map;
            String str7 = map.get("x-amz-tagging");
            if (str7 != null) {
                try {
                    String[] strArrSplit = str7.split("&");
                    ArrayList arrayList = new ArrayList();
                    for (String str8 : strArrSplit) {
                        String[] strArrSplit2 = str8.split("=");
                        arrayList.add(new Tag(strArrSplit2[0], strArrSplit2[1]));
                    }
                    putObjectRequest.f10701OoooOoO = new ObjectTagging(arrayList);
                } catch (Exception e) {
                    f10541OooO0oO.OooO0oo("Error in passing the object tags as request headers.", e);
                }
            }
            String str9 = transferRecord.f10490OooOo0.get("x-amz-website-redirect-location");
            if (str9 != null) {
                putObjectRequest.f10699OoooOOo = str9;
            }
            String str10 = transferRecord.f10490OooOo0.get("x-amz-request-payer");
            if (str10 != null) {
                putObjectRequest.f10876OoooOoo = "requester".equals(str10);
            }
        }
        String str11 = transferRecord.f10494OooOoO;
        if (str11 != null) {
            objectMetadata.f10867Oooo0oO.put("Content-MD5", str11);
        }
        String str12 = transferRecord.f10495OooOoO0;
        if (str12 != null) {
            putObjectRequest.f10700OoooOo0 = new SSEAwsKeyManagementParams(str12);
        }
        putObjectRequest.f10693OoooO = objectMetadata;
        String str13 = transferRecord.f10496OooOoOO;
        putObjectRequest.f10697OoooOO0 = str13 == null ? null : (CannedAccessControlList) f10542OooO0oo.get(str13);
        return putObjectRequest;
    }

    public final String OooO0OO(PutObjectRequest putObjectRequest) {
        InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(putObjectRequest.f10692Oooo, putObjectRequest.f10695OoooO00);
        initiateMultipartUploadRequest.f10822OoooO0O = putObjectRequest.f10697OoooOO0;
        initiateMultipartUploadRequest.f10820OoooO0 = putObjectRequest.f10693OoooO;
        initiateMultipartUploadRequest.f10819OoooO = putObjectRequest.f10700OoooOo0;
        initiateMultipartUploadRequest.f10823OoooOO0 = putObjectRequest.f10701OoooOoO;
        TransferUtility.OooO00o(initiateMultipartUploadRequest);
        return this.f10543OooO00o.initiateMultipartUpload(initiateMultipartUploadRequest).f10824Oooo;
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadPartTaskMetadata>] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadPartTaskMetadata>] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadPartTaskMetadata>] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.UploadPartRequest>] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadPartTaskMetadata>] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.ArrayList, java.util.List<com.amazonaws.services.s3.model.UploadPartRequest>] */
    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        long j;
        Cursor cursorOooO0O0;
        Cursor cursorOooO0O1;
        try {
            if (TransferNetworkLossHandler.OooO00o() != null && !TransferNetworkLossHandler.OooO00o().OooO0O0()) {
                f10541OooO0oO.OooO0o("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            f10541OooO0oO.OooOO0("TransferUtilityException: [" + e + "]");
        }
        this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.IN_PROGRESS);
        TransferRecord transferRecord = this.f10544OooO0O0;
        int i = transferRecord.f10473OooO0OO;
        if (i != 1 || transferRecord.f10476OooO0o0 != 0) {
            if (i != 0) {
                return Boolean.FALSE;
            }
            PutObjectRequest putObjectRequestOooO0O0 = OooO0O0(transferRecord);
            ProgressListener progressListenerOooO0OO = this.f10546OooO0Oo.OooO0OO(this.f10544OooO0O0.f10471OooO00o);
            long length = putObjectRequestOooO0O0.f10694OoooO0.length();
            TransferUtility.OooO0O0(putObjectRequestOooO0O0);
            putObjectRequestOooO0O0.f10272Oooo0o = progressListenerOooO0OO;
            try {
                this.f10543OooO00o.putObject(putObjectRequestOooO0O0);
                this.f10546OooO0Oo.OooO0o0(this.f10544OooO0O0.f10471OooO00o, length, length, true);
                this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.COMPLETED);
                return Boolean.TRUE;
            } catch (Exception e2) {
                if (TransferState.PENDING_CANCEL.equals(this.f10544OooO0O0.f10479OooOO0)) {
                    TransferStatusUpdater transferStatusUpdater = this.f10546OooO0Oo;
                    int i2 = this.f10544OooO0O0.f10471OooO00o;
                    TransferState transferState = TransferState.CANCELED;
                    transferStatusUpdater.OooO0o(i2, transferState);
                    f10541OooO0oO.OooO0o("Transfer is " + transferState);
                    return Boolean.FALSE;
                }
                if (TransferState.PENDING_PAUSE.equals(this.f10544OooO0O0.f10479OooOO0)) {
                    TransferStatusUpdater transferStatusUpdater2 = this.f10546OooO0Oo;
                    int i3 = this.f10544OooO0O0.f10471OooO00o;
                    TransferState transferState2 = TransferState.PAUSED;
                    transferStatusUpdater2.OooO0o(i3, transferState2);
                    f10541OooO0oO.OooO0o("Transfer is " + transferState2);
                    new ProgressEvent(0L).f10370OooO0O0 = 32;
                    ((TransferStatusUpdater.TransferProgressListener) progressListenerOooO0OO).OooO00o(new ProgressEvent(0L));
                    return Boolean.FALSE;
                }
                try {
                    if (TransferNetworkLossHandler.OooO00o() != null && !TransferNetworkLossHandler.OooO00o().OooO0O0()) {
                        Log log = f10541OooO0oO;
                        log.OooO0o("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.WAITING_FOR_NETWORK);
                        log.OooO00o("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0L).f10370OooO0O0 = 32;
                        ((TransferStatusUpdater.TransferProgressListener) progressListenerOooO0OO).OooO00o(new ProgressEvent(0L));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e3) {
                    f10541OooO0oO.OooOO0("TransferUtilityException: [" + e3 + "]");
                }
                if (RetryUtils.OooO0O0(e2)) {
                    f10541OooO0oO.OooO0o("Transfer is interrupted. " + e2);
                    this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.FAILED);
                    return Boolean.FALSE;
                }
                Log log2 = f10541OooO0oO;
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed to upload: ");
                sbOooO0o0.append(this.f10544OooO0O0.f10471OooO00o);
                sbOooO0o0.append(" due to ");
                sbOooO0o0.append(e2.getMessage());
                log2.OooO00o(sbOooO0o0.toString());
                this.f10546OooO0Oo.OooO0Oo(this.f10544OooO0O0.f10471OooO00o, e2);
                this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.FAILED);
                return Boolean.FALSE;
            }
        }
        String str = transferRecord.f10482OooOOO;
        if (str == null || str.isEmpty()) {
            PutObjectRequest putObjectRequestOooO0O1 = OooO0O0(this.f10544OooO0O0);
            TransferUtility.OooO00o(putObjectRequestOooO0O1);
            try {
                this.f10544OooO0O0.f10482OooOOO = OooO0OO(putObjectRequestOooO0O1);
                TransferDBUtil transferDBUtil = this.f10545OooO0OO;
                TransferRecord transferRecord2 = this.f10544OooO0O0;
                int i4 = transferRecord2.f10471OooO00o;
                String str2 = transferRecord2.f10482OooOOO;
                Objects.requireNonNull(transferDBUtil);
                ContentValues contentValues = new ContentValues();
                contentValues.put("multipart_id", str2);
                TransferDBUtil.f10461OooO0OO.OooO0OO(transferDBUtil.OooO0OO(i4), contentValues, null, null);
                j = 0;
            } catch (AmazonClientException e4) {
                Log log3 = f10541OooO0oO;
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Error initiating multipart upload: ");
                sbOooO0o1.append(this.f10544OooO0O0.f10471OooO00o);
                sbOooO0o1.append(" due to ");
                sbOooO0o1.append(e4.getMessage());
                log3.OooO0oo(sbOooO0o1.toString(), e4);
                this.f10546OooO0Oo.OooO0Oo(this.f10544OooO0O0.f10471OooO00o, e4);
                this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.FAILED);
                return Boolean.FALSE;
            }
        } else {
            TransferDBUtil transferDBUtil2 = this.f10545OooO0OO;
            int i5 = this.f10544OooO0O0.f10471OooO00o;
            Objects.requireNonNull(transferDBUtil2);
            try {
                cursorOooO0O1 = TransferDBUtil.f10461OooO0OO.OooO0O0(transferDBUtil2.OooO0O0(i5), null, null);
                j = 0;
                while (cursorOooO0O1.moveToNext()) {
                    try {
                        if (TransferState.PART_COMPLETED.equals(TransferState.OooO00o(cursorOooO0O1.getString(cursorOooO0O1.getColumnIndexOrThrow(ServerProtocol.DIALOG_PARAM_STATE))))) {
                            j += cursorOooO0O1.getLong(cursorOooO0O1.getColumnIndexOrThrow(ReportItem.RequestKeyBytesTotal));
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
                if (j > 0) {
                    f10541OooO0oO.OooO0o(String.format("Resume transfer %d from %d bytes", Integer.valueOf(this.f10544OooO0O0.f10471OooO00o), Long.valueOf(j)));
                }
            } catch (Throwable th2) {
                th = th2;
                cursorOooO0O1 = null;
            }
        }
        UploadTaskProgressListener uploadTaskProgressListener = new UploadTaskProgressListener(this.f10544OooO0O0);
        TransferStatusUpdater transferStatusUpdater3 = this.f10546OooO0Oo;
        TransferRecord transferRecord3 = this.f10544OooO0O0;
        transferStatusUpdater3.OooO0o0(transferRecord3.f10471OooO00o, j, transferRecord3.f10475OooO0o, false);
        TransferDBUtil transferDBUtil3 = this.f10545OooO0OO;
        TransferRecord transferRecord4 = this.f10544OooO0O0;
        int i6 = transferRecord4.f10471OooO00o;
        String str3 = transferRecord4.f10482OooOOO;
        Objects.requireNonNull(transferDBUtil3);
        ArrayList arrayList = new ArrayList();
        try {
            TransferDBBase transferDBBase = TransferDBUtil.f10461OooO0OO;
            Uri uriOooO0O0 = transferDBUtil3.OooO0O0(i6);
            cursorOooO0O0 = null;
            try {
                cursorOooO0O0 = transferDBBase.OooO0O0(uriOooO0O0, null, null);
                while (cursorOooO0O0.moveToNext()) {
                    if (!TransferState.PART_COMPLETED.equals(TransferState.OooO00o(cursorOooO0O0.getString(cursorOooO0O0.getColumnIndexOrThrow(ServerProtocol.DIALOG_PARAM_STATE))))) {
                        UploadPartRequest uploadPartRequest = new UploadPartRequest();
                        uploadPartRequest.f10946Oooo = cursorOooO0O0.getInt(cursorOooO0O0.getColumnIndexOrThrow(ao.d));
                        cursorOooO0O0.getInt(cursorOooO0O0.getColumnIndexOrThrow("main_upload_id"));
                        uploadPartRequest.f10949OoooO00 = cursorOooO0O0.getString(cursorOooO0O0.getColumnIndexOrThrow("bucket_name"));
                        uploadPartRequest.f10948OoooO0 = cursorOooO0O0.getString(cursorOooO0O0.getColumnIndexOrThrow("key"));
                        uploadPartRequest.f10950OoooO0O = str3;
                        uploadPartRequest.f10953o000oOoO = new File(cursorOooO0O0.getString(cursorOooO0O0.getColumnIndexOrThrow(ShareInternalUtility.STAGING_PARAM)));
                        uploadPartRequest.f10952OoooOOO = cursorOooO0O0.getLong(cursorOooO0O0.getColumnIndexOrThrow(ReportItem.RequestKeyFileOffset));
                        uploadPartRequest.f10947OoooO = cursorOooO0O0.getInt(cursorOooO0O0.getColumnIndexOrThrow("part_num"));
                        uploadPartRequest.f10951OoooOO0 = cursorOooO0O0.getLong(cursorOooO0O0.getColumnIndexOrThrow(ReportItem.RequestKeyBytesTotal));
                        cursorOooO0O0.getInt(cursorOooO0O0.getColumnIndexOrThrow("is_last_part"));
                        arrayList.add(uploadPartRequest);
                    }
                }
                cursorOooO0O0.close();
                this.f10547OooO0o = arrayList;
                Log log4 = f10541OooO0oO;
                StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Multipart upload ");
                sbOooO0o2.append(this.f10544OooO0O0.f10471OooO00o);
                sbOooO0o2.append(" in ");
                sbOooO0o2.append(this.f10547OooO0o.size());
                sbOooO0o2.append(" parts.");
                log4.OooO0o(sbOooO0o2.toString());
                for (UploadPartRequest uploadPartRequest2 : this.f10547OooO0o) {
                    TransferUtility.OooO00o(uploadPartRequest2);
                    UploadPartTaskMetadata uploadPartTaskMetadata = new UploadPartTaskMetadata();
                    uploadPartTaskMetadata.f10550OooO0O0 = 0L;
                    uploadPartTaskMetadata.f10551OooO0OO = TransferState.WAITING;
                    this.f10548OooO0o0.put(Integer.valueOf(uploadPartRequest2.f10947OoooO), uploadPartTaskMetadata);
                    uploadPartTaskMetadata.f10549OooO00o = TransferThreadPool.OooO0O0(new UploadPartTask(uploadPartTaskMetadata, uploadTaskProgressListener, uploadPartRequest2, this.f10543OooO00o, this.f10545OooO0OO));
                }
                try {
                    Iterator it = this.f10548OooO0o0.values().iterator();
                    boolean zBooleanValue = true;
                    while (it.hasNext()) {
                        zBooleanValue &= ((UploadPartTaskMetadata) it.next()).f10549OooO00o.get().booleanValue();
                    }
                    if (!zBooleanValue) {
                        try {
                            if (TransferNetworkLossHandler.OooO00o() != null && !TransferNetworkLossHandler.OooO00o().OooO0O0()) {
                                f10541OooO0oO.OooO0o("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                                this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.WAITING_FOR_NETWORK);
                                return Boolean.FALSE;
                            }
                        } catch (TransferUtilityException e5) {
                            f10541OooO0oO.OooOO0("TransferUtilityException: [" + e5 + "]");
                        }
                    }
                    Log log5 = f10541OooO0oO;
                    StringBuilder sbOooO0o3 = OooO00o.OooO0o0("Completing the multi-part upload transfer for ");
                    sbOooO0o3.append(this.f10544OooO0O0.f10471OooO00o);
                    log5.OooO0o(sbOooO0o3.toString());
                    try {
                        TransferRecord transferRecord5 = this.f10544OooO0O0;
                        OooO00o(transferRecord5.f10471OooO00o, transferRecord5.f10480OooOO0O, transferRecord5.f10481OooOO0o, transferRecord5.f10482OooOOO);
                        TransferStatusUpdater transferStatusUpdater4 = this.f10546OooO0Oo;
                        TransferRecord transferRecord6 = this.f10544OooO0O0;
                        int i7 = transferRecord6.f10471OooO00o;
                        long j2 = transferRecord6.f10475OooO0o;
                        transferStatusUpdater4.OooO0o0(i7, j2, j2, true);
                        this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.COMPLETED);
                        return Boolean.TRUE;
                    } catch (AmazonClientException e6) {
                        Log log6 = f10541OooO0oO;
                        StringBuilder sbOooO0o4 = OooO00o.OooO0o0("Failed to complete multipart: ");
                        sbOooO0o4.append(this.f10544OooO0O0.f10471OooO00o);
                        sbOooO0o4.append(" due to ");
                        sbOooO0o4.append(e6.getMessage());
                        log6.OooO0oo(sbOooO0o4.toString(), e6);
                        TransferRecord transferRecord7 = this.f10544OooO0O0;
                        int i8 = transferRecord7.f10471OooO00o;
                        String str4 = transferRecord7.f10480OooOO0O;
                        String str5 = transferRecord7.f10481OooOO0o;
                        String str6 = transferRecord7.f10482OooOOO;
                        log6.OooO0o("Aborting the multipart since complete multipart failed.");
                        try {
                            this.f10543OooO00o.abortMultipartUpload(new AbortMultipartUploadRequest(str4, str5, str6));
                            log6.OooO00o("Successfully aborted multipart upload: " + i8);
                        } catch (AmazonClientException e7) {
                            f10541OooO0oO.OooO0O0("Failed to abort the multipart upload: " + i8, e7);
                        }
                        this.f10546OooO0Oo.OooO0Oo(this.f10544OooO0O0.f10471OooO00o, e6);
                        this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.FAILED);
                        return Boolean.FALSE;
                    }
                } catch (Exception e8) {
                    f10541OooO0oO.OooOO0("Upload resulted in an exception. " + e8);
                    Iterator it2 = this.f10548OooO0o0.values().iterator();
                    while (it2.hasNext()) {
                        ((UploadPartTaskMetadata) it2.next()).f10549OooO00o.cancel(true);
                    }
                    if (TransferState.PENDING_CANCEL.equals(this.f10544OooO0O0.f10479OooOO0)) {
                        TransferStatusUpdater transferStatusUpdater5 = this.f10546OooO0Oo;
                        int i9 = this.f10544OooO0O0.f10471OooO00o;
                        TransferState transferState3 = TransferState.CANCELED;
                        transferStatusUpdater5.OooO0o(i9, transferState3);
                        f10541OooO0oO.OooO0o("Transfer is " + transferState3);
                        return Boolean.FALSE;
                    }
                    if (TransferState.PENDING_PAUSE.equals(this.f10544OooO0O0.f10479OooOO0)) {
                        TransferStatusUpdater transferStatusUpdater6 = this.f10546OooO0Oo;
                        int i10 = this.f10544OooO0O0.f10471OooO00o;
                        TransferState transferState4 = TransferState.PAUSED;
                        transferStatusUpdater6.OooO0o(i10, transferState4);
                        f10541OooO0oO.OooO0o("Transfer is " + transferState4);
                        return Boolean.FALSE;
                    }
                    for (UploadPartTaskMetadata uploadPartTaskMetadata2 : this.f10548OooO0o0.values()) {
                        TransferState transferState5 = TransferState.WAITING_FOR_NETWORK;
                        if (transferState5.equals(uploadPartTaskMetadata2.f10551OooO0OO)) {
                            f10541OooO0oO.OooO0o("Individual part is WAITING_FOR_NETWORK.");
                            this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, transferState5);
                            return Boolean.FALSE;
                        }
                    }
                    try {
                        if (TransferNetworkLossHandler.OooO00o() != null && !TransferNetworkLossHandler.OooO00o().OooO0O0()) {
                            f10541OooO0oO.OooO0o("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                            this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.WAITING_FOR_NETWORK);
                            return Boolean.FALSE;
                        }
                    } catch (TransferUtilityException e9) {
                        f10541OooO0oO.OooOO0("TransferUtilityException: [" + e9 + "]");
                    }
                    if (RetryUtils.OooO0O0(e8)) {
                        f10541OooO0oO.OooO0o("Transfer is interrupted. " + e8);
                        this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.FAILED);
                        return Boolean.FALSE;
                    }
                    Log log7 = f10541OooO0oO;
                    StringBuilder sbOooO0o5 = OooO00o.OooO0o0("Error encountered during multi-part upload: ");
                    sbOooO0o5.append(this.f10544OooO0O0.f10471OooO00o);
                    sbOooO0o5.append(" due to ");
                    sbOooO0o5.append(e8.getMessage());
                    log7.OooO0oo(sbOooO0o5.toString(), e8);
                    this.f10546OooO0Oo.OooO0Oo(this.f10544OooO0O0.f10471OooO00o, e8);
                    this.f10546OooO0Oo.OooO0o(this.f10544OooO0O0.f10471OooO00o, TransferState.FAILED);
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
