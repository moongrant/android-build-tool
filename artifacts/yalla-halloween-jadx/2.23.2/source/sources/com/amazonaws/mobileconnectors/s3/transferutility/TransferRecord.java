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
    public static final Log f12247OooOooO = LogFactory.OooO00o(TransferRecord.class);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TransferType f12248OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f12249OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f12250OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f12251OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f12252OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f12253OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f12254OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f12255OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f12256OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TransferState f12257OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f12258OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f12259OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public String f12260OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f12261OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public String f12262OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public String f12263OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public String f12264OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public String f12265OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public String f12266OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f12267OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Map<String, String> f12268OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public String f12269OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public String f12270OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f12271OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f12272OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f12273OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public TransferUtilityOptions f12274OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooOOO0 f12275OooOoo = new OooOOO0();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Future<?> f12276OooOoo0;

    public TransferRecord(int i) {
        this.f12249OooO00o = i;
    }

    public final boolean OooO00o(TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        TransferUtilityOptions transferUtilityOptions;
        if (connectivityManager != null && (transferUtilityOptions = this.f12274OooOoOO) != null) {
            TransferNetworkConnectionType transferNetworkConnectionType = transferUtilityOptions.f12301OooO0Oo;
            transferNetworkConnectionType.getClass();
            if (!transferNetworkConnectionType.OooO00o(connectivityManager.getActiveNetworkInfo())) {
                f12247OooOooO.OooO0oo("Network Connection " + this.f12274OooOoOO.f12301OooO0Oo + " is not available.");
                transferStatusUpdater.OooO0oo(this.f12249OooO00o, TransferState.WAITING_FOR_NETWORK);
                return false;
            }
        }
        return true;
    }

    public final void OooO0O0(AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        Future<?> future = this.f12276OooOoo0;
        if ((future == null || future.isDone()) ? false : true) {
            return;
        }
        if ((this.f12254OooO0o0 == 0 && !TransferState.COMPLETED.equals(this.f12257OooOO0)) && OooO00o(transferStatusUpdater, connectivityManager)) {
            if (this.f12248OooO.equals(TransferType.DOWNLOAD)) {
                this.f12276OooOoo0 = TransferThreadPool.OooO0O0(new DownloadTask(this, amazonS3, transferStatusUpdater));
            } else {
                this.f12276OooOoo0 = TransferThreadPool.OooO0O0(new UploadTask(this, amazonS3, transferDBUtil, transferStatusUpdater));
            }
        }
    }

    public final void OooO0OO(Cursor cursor) {
        this.f12249OooO00o = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
        this.f12250OooO0O0 = cursor.getInt(cursor.getColumnIndexOrThrow("main_upload_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("type"));
        TransferType transferType = TransferType.UPLOAD;
        if (!string.equalsIgnoreCase(transferType.toString())) {
            transferType = TransferType.DOWNLOAD;
            if (!string.equalsIgnoreCase(transferType.toString())) {
                transferType = TransferType.ANY;
                if (!string.equalsIgnoreCase(transferType.toString())) {
                    throw new IllegalArgumentException(o000oOoO.OooO0O0("Type ", string, " is not a recognized type"));
                }
            }
        }
        this.f12248OooO = transferType;
        this.f12257OooOO0 = TransferState.OooO00o(cursor.getString(cursor.getColumnIndexOrThrow("state")));
        this.f12258OooOO0O = cursor.getString(cursor.getColumnIndexOrThrow("bucket_name"));
        this.f12259OooOO0o = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        cursor.getString(cursor.getColumnIndexOrThrow("version_id"));
        this.f12253OooO0o = cursor.getLong(cursor.getColumnIndexOrThrow(ReportItem.RequestKeyBytesTotal));
        this.f12255OooO0oO = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_current"));
        cursor.getLong(cursor.getColumnIndexOrThrow("speed"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_requester_pays"));
        this.f12251OooO0OO = cursor.getInt(cursor.getColumnIndexOrThrow("is_multipart"));
        this.f12252OooO0Oo = cursor.getInt(cursor.getColumnIndexOrThrow("is_last_part"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_encrypted"));
        this.f12254OooO0o0 = cursor.getInt(cursor.getColumnIndexOrThrow("part_num"));
        this.f12262OooOOOO = cursor.getString(cursor.getColumnIndexOrThrow("etag"));
        this.f12261OooOOO0 = cursor.getString(cursor.getColumnIndexOrThrow(ShareInternalUtility.STAGING_PARAM));
        this.f12260OooOOO = cursor.getString(cursor.getColumnIndexOrThrow("multipart_id"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_start"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_last"));
        this.f12256OooO0oo = cursor.getLong(cursor.getColumnIndexOrThrow(ReportItem.RequestKeyFileOffset));
        this.f12263OooOOOo = cursor.getString(cursor.getColumnIndexOrThrow("header_content_type"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_content_language"));
        this.f12265OooOOo0 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_disposition"));
        this.f12264OooOOo = cursor.getString(cursor.getColumnIndexOrThrow("header_content_encoding"));
        this.f12266OooOOoo = cursor.getString(cursor.getColumnIndexOrThrow("header_cache_control"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_expire"));
        this.f12268OooOo0 = JsonUtils.OooO0OO(cursor.getString(cursor.getColumnIndexOrThrow("user_metadata")));
        cursor.getString(cursor.getColumnIndexOrThrow("expiration_time_rule_id"));
        this.f12270OooOo0O = cursor.getString(cursor.getColumnIndexOrThrow("http_expires_date"));
        this.f12271OooOo0o = cursor.getString(cursor.getColumnIndexOrThrow("sse_algorithm"));
        this.f12267OooOo = cursor.getString(cursor.getColumnIndexOrThrow("kms_key"));
        this.f12273OooOoO0 = cursor.getString(cursor.getColumnIndexOrThrow("content_md5"));
        this.f12272OooOoO = cursor.getString(cursor.getColumnIndexOrThrow("canned_acl"));
        this.f12269OooOo00 = cursor.getString(cursor.getColumnIndexOrThrow("header_storage_class"));
        this.f12274OooOoOO = (TransferUtilityOptions) this.f12275OooOoo.OooO0OO(cursor.getString(cursor.getColumnIndexOrThrow("transfer_utility_options")), TransferUtilityOptions.class);
    }

    public final String toString() {
        return "[id:" + this.f12249OooO00o + ",bucketName:" + this.f12258OooOO0O + ",key:" + this.f12259OooOO0o + ",file:" + this.f12261OooOOO0 + ",type:" + this.f12248OooO + ",bytesTotal:" + this.f12253OooO0o + ",bytesCurrent:" + this.f12255OooO0oO + ",fileOffset:" + this.f12256OooO0oo + ",state:" + this.f12257OooOO0 + ",cannedAcl:" + this.f12272OooOoO + ",mainUploadId:" + this.f12250OooO0O0 + ",isMultipart:" + this.f12251OooO0OO + ",isLastPart:" + this.f12252OooO0Oo + ",partNumber:" + this.f12254OooO0o0 + ",multipartId:" + this.f12260OooOOO + ",eTag:" + this.f12262OooOOOO + ",storageClass:" + this.f12269OooOo00 + ",userMetadata:" + this.f12268OooOo0.toString() + ",transferUtilityOptions:" + this.f12275OooOoo.OooO0oo(this.f12274OooOoOO) + "]";
    }
}
