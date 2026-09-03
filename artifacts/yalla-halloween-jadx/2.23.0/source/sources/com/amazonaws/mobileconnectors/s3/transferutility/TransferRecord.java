package com.amazonaws.mobileconnectors.s3.transferutility;

import android.database.Cursor;
import android.net.ConnectivityManager;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.util.json.JsonUtils;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.gson.OooOOO0;
import com.qiniu.android.collect.ReportItem;
import java.util.Map;
import java.util.concurrent.Future;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
class TransferRecord {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final Log f9157OooOooO = LogFactory.OooO00o(TransferRecord.class);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TransferType f9158OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f9159OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f9160OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f9161OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f9162OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f9163OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f9164OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f9165OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f9166OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TransferState f9167OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f9168OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f9169OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public String f9170OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f9171OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public String f9172OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public String f9173OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public String f9174OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public String f9175OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public String f9176OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f9177OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Map<String, String> f9178OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public String f9179OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public String f9180OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f9181OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f9182OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f9183OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public TransferUtilityOptions f9184OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooOOO0 f9185OooOoo = new OooOOO0();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Future<?> f9186OooOoo0;

    public TransferRecord(int i) {
        this.f9159OooO00o = i;
    }

    public final boolean OooO00o(TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        TransferUtilityOptions transferUtilityOptions;
        if (connectivityManager != null && (transferUtilityOptions = this.f9184OooOoOO) != null) {
            TransferNetworkConnectionType transferNetworkConnectionType = transferUtilityOptions.f9211OooO0Oo;
            transferNetworkConnectionType.getClass();
            if (!transferNetworkConnectionType.OooO00o(connectivityManager.getActiveNetworkInfo())) {
                f9157OooOooO.OooO0oo("Network Connection " + this.f9184OooOoOO.f9211OooO0Oo + " is not available.");
                transferStatusUpdater.OooO0oo(this.f9159OooO00o, TransferState.WAITING_FOR_NETWORK);
                return false;
            }
        }
        return true;
    }

    public final void OooO0O0(AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        Future<?> future = this.f9186OooOoo0;
        if ((future == null || future.isDone()) ? false : true) {
            return;
        }
        if ((this.f9164OooO0o0 == 0 && !TransferState.COMPLETED.equals(this.f9167OooOO0)) && OooO00o(transferStatusUpdater, connectivityManager)) {
            if (this.f9158OooO.equals(TransferType.DOWNLOAD)) {
                this.f9186OooOoo0 = TransferThreadPool.OooO0O0(new DownloadTask(this, amazonS3, transferStatusUpdater));
            } else {
                this.f9186OooOoo0 = TransferThreadPool.OooO0O0(new UploadTask(this, amazonS3, transferDBUtil, transferStatusUpdater));
            }
        }
    }

    public final void OooO0OO(Cursor cursor) {
        this.f9159OooO00o = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
        this.f9160OooO0O0 = cursor.getInt(cursor.getColumnIndexOrThrow("main_upload_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("type"));
        TransferType transferType = TransferType.UPLOAD;
        if (!string.equalsIgnoreCase(transferType.toString())) {
            transferType = TransferType.DOWNLOAD;
            if (!string.equalsIgnoreCase(transferType.toString())) {
                transferType = TransferType.ANY;
                if (!string.equalsIgnoreCase(transferType.toString())) {
                    throw new IllegalArgumentException(o000oOoO.OooO00o("Type ", string, " is not a recognized type"));
                }
            }
        }
        this.f9158OooO = transferType;
        this.f9167OooOO0 = TransferState.OooO00o(cursor.getString(cursor.getColumnIndexOrThrow("state")));
        this.f9168OooOO0O = cursor.getString(cursor.getColumnIndexOrThrow("bucket_name"));
        this.f9169OooOO0o = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        cursor.getString(cursor.getColumnIndexOrThrow("version_id"));
        this.f9163OooO0o = cursor.getLong(cursor.getColumnIndexOrThrow(ReportItem.RequestKeyBytesTotal));
        this.f9165OooO0oO = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_current"));
        cursor.getLong(cursor.getColumnIndexOrThrow("speed"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_requester_pays"));
        this.f9161OooO0OO = cursor.getInt(cursor.getColumnIndexOrThrow("is_multipart"));
        this.f9162OooO0Oo = cursor.getInt(cursor.getColumnIndexOrThrow("is_last_part"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_encrypted"));
        this.f9164OooO0o0 = cursor.getInt(cursor.getColumnIndexOrThrow("part_num"));
        this.f9172OooOOOO = cursor.getString(cursor.getColumnIndexOrThrow("etag"));
        this.f9171OooOOO0 = cursor.getString(cursor.getColumnIndexOrThrow(ShareInternalUtility.STAGING_PARAM));
        this.f9170OooOOO = cursor.getString(cursor.getColumnIndexOrThrow("multipart_id"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_start"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_last"));
        this.f9166OooO0oo = cursor.getLong(cursor.getColumnIndexOrThrow(ReportItem.RequestKeyFileOffset));
        this.f9173OooOOOo = cursor.getString(cursor.getColumnIndexOrThrow("header_content_type"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_content_language"));
        this.f9175OooOOo0 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_disposition"));
        this.f9174OooOOo = cursor.getString(cursor.getColumnIndexOrThrow("header_content_encoding"));
        this.f9176OooOOoo = cursor.getString(cursor.getColumnIndexOrThrow("header_cache_control"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_expire"));
        this.f9178OooOo0 = JsonUtils.OooO0OO(cursor.getString(cursor.getColumnIndexOrThrow("user_metadata")));
        cursor.getString(cursor.getColumnIndexOrThrow("expiration_time_rule_id"));
        this.f9180OooOo0O = cursor.getString(cursor.getColumnIndexOrThrow("http_expires_date"));
        this.f9181OooOo0o = cursor.getString(cursor.getColumnIndexOrThrow("sse_algorithm"));
        this.f9177OooOo = cursor.getString(cursor.getColumnIndexOrThrow("kms_key"));
        this.f9183OooOoO0 = cursor.getString(cursor.getColumnIndexOrThrow("content_md5"));
        this.f9182OooOoO = cursor.getString(cursor.getColumnIndexOrThrow("canned_acl"));
        this.f9179OooOo00 = cursor.getString(cursor.getColumnIndexOrThrow("header_storage_class"));
        this.f9184OooOoOO = (TransferUtilityOptions) this.f9185OooOoo.OooO0OO(cursor.getString(cursor.getColumnIndexOrThrow("transfer_utility_options")), TransferUtilityOptions.class);
    }

    public final String toString() {
        return "[id:" + this.f9159OooO00o + ",bucketName:" + this.f9168OooOO0O + ",key:" + this.f9169OooOO0o + ",file:" + this.f9171OooOOO0 + ",type:" + this.f9158OooO + ",bytesTotal:" + this.f9163OooO0o + ",bytesCurrent:" + this.f9165OooO0oO + ",fileOffset:" + this.f9166OooO0oo + ",state:" + this.f9167OooOO0 + ",cannedAcl:" + this.f9182OooOoO + ",mainUploadId:" + this.f9160OooO0O0 + ",isMultipart:" + this.f9161OooO0OO + ",isLastPart:" + this.f9162OooO0Oo + ",partNumber:" + this.f9164OooO0o0 + ",multipartId:" + this.f9170OooOOO + ",eTag:" + this.f9172OooOOOO + ",storageClass:" + this.f9179OooOo00 + ",userMetadata:" + this.f9178OooOo0.toString() + ",transferUtilityOptions:" + this.f9185OooOoo.OooO0oo(this.f9184OooOoOO) + "]";
    }
}
