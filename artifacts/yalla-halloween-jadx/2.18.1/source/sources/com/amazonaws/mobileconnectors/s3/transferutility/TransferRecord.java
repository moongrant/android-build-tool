package com.amazonaws.mobileconnectors.s3.transferutility;

import OooO00o.OooO00o;
import OooO0o.OooO0OO;
import android.database.Cursor;
import android.net.ConnectivityManager;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.util.json.JsonUtils;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareInternalUtility;
import com.qiniu.android.collect.ReportItem;
import com.umeng.analytics.pro.ao;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;
import p023Oooo00O.o00O0;
import p386o0OOoo0O.o000OOo0;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
class TransferRecord {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final Log f10469OooOooo = LogFactory.OooO00o(TransferRecord.class);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TransferType f10470OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f10471OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f10472OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f10473OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10474OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f10475OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f10476OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f10477OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f10478OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TransferState f10479OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f10480OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f10481OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public String f10482OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f10483OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public String f10484OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public String f10485OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public String f10486OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public String f10487OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public String f10488OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f10489OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Map<String, String> f10490OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public String f10491OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public String f10492OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f10493OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f10494OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f10495OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f10496OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Future<?> f10497OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public TransferUtilityOptions f10498OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public o000OOo0 f10499OooOooO = new o000OOo0();

    public TransferRecord(int i) {
        this.f10471OooO00o = i;
    }

    public final boolean OooO00o(TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        TransferUtilityOptions transferUtilityOptions;
        if (connectivityManager != null && (transferUtilityOptions = this.f10498OooOoo0) != null) {
            TransferNetworkConnectionType transferNetworkConnectionType = transferUtilityOptions.f10531Oooo0o;
            Objects.requireNonNull(transferNetworkConnectionType);
            if (!transferNetworkConnectionType.OooO00o(connectivityManager.getActiveNetworkInfo())) {
                Log log = f10469OooOooo;
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Network Connection ");
                sbOooO0o0.append(this.f10498OooOoo0.f10531Oooo0o);
                sbOooO0o0.append(" is not available.");
                log.OooO0o(sbOooO0o0.toString());
                transferStatusUpdater.OooO0o(this.f10471OooO00o, TransferState.WAITING_FOR_NETWORK);
                return false;
            }
        }
        return true;
    }

    public final boolean OooO0O0() {
        Future<?> future = this.f10497OooOoo;
        return (future == null || future.isDone()) ? false : true;
    }

    public final boolean OooO0OO(AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        if (!OooO0O0()) {
            if ((this.f10476OooO0o0 == 0 && !TransferState.COMPLETED.equals(this.f10479OooOO0)) && OooO00o(transferStatusUpdater, connectivityManager)) {
                if (this.f10470OooO.equals(TransferType.DOWNLOAD)) {
                    this.f10497OooOoo = TransferThreadPool.OooO0O0(new DownloadTask(this, amazonS3, transferStatusUpdater));
                } else {
                    this.f10497OooOoo = TransferThreadPool.OooO0O0(new UploadTask(this, amazonS3, transferDBUtil, transferStatusUpdater));
                }
                return true;
            }
        }
        return false;
    }

    public final void OooO0Oo(Cursor cursor) {
        this.f10471OooO00o = cursor.getInt(cursor.getColumnIndexOrThrow(ao.d));
        this.f10472OooO0O0 = cursor.getInt(cursor.getColumnIndexOrThrow("main_upload_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("type"));
        TransferType transferType = TransferType.UPLOAD;
        if (!string.equalsIgnoreCase(transferType.toString())) {
            transferType = TransferType.DOWNLOAD;
            if (!string.equalsIgnoreCase(transferType.toString())) {
                transferType = TransferType.ANY;
                if (!string.equalsIgnoreCase(transferType.toString())) {
                    throw new IllegalArgumentException(OooO0OO.OooO00o("Type ", string, " is not a recognized type"));
                }
            }
        }
        this.f10470OooO = transferType;
        this.f10479OooOO0 = TransferState.OooO00o(cursor.getString(cursor.getColumnIndexOrThrow(ServerProtocol.DIALOG_PARAM_STATE)));
        this.f10480OooOO0O = cursor.getString(cursor.getColumnIndexOrThrow("bucket_name"));
        this.f10481OooOO0o = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        cursor.getString(cursor.getColumnIndexOrThrow("version_id"));
        this.f10475OooO0o = cursor.getLong(cursor.getColumnIndexOrThrow(ReportItem.RequestKeyBytesTotal));
        this.f10477OooO0oO = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_current"));
        cursor.getLong(cursor.getColumnIndexOrThrow("speed"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_requester_pays"));
        this.f10473OooO0OO = cursor.getInt(cursor.getColumnIndexOrThrow("is_multipart"));
        this.f10474OooO0Oo = cursor.getInt(cursor.getColumnIndexOrThrow("is_last_part"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_encrypted"));
        this.f10476OooO0o0 = cursor.getInt(cursor.getColumnIndexOrThrow("part_num"));
        this.f10484OooOOOO = cursor.getString(cursor.getColumnIndexOrThrow("etag"));
        this.f10483OooOOO0 = cursor.getString(cursor.getColumnIndexOrThrow(ShareInternalUtility.STAGING_PARAM));
        this.f10482OooOOO = cursor.getString(cursor.getColumnIndexOrThrow("multipart_id"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_start"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_last"));
        this.f10478OooO0oo = cursor.getLong(cursor.getColumnIndexOrThrow(ReportItem.RequestKeyFileOffset));
        this.f10485OooOOOo = cursor.getString(cursor.getColumnIndexOrThrow("header_content_type"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_content_language"));
        this.f10487OooOOo0 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_disposition"));
        this.f10486OooOOo = cursor.getString(cursor.getColumnIndexOrThrow("header_content_encoding"));
        this.f10488OooOOoo = cursor.getString(cursor.getColumnIndexOrThrow("header_cache_control"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_expire"));
        this.f10490OooOo0 = JsonUtils.OooO0OO(cursor.getString(cursor.getColumnIndexOrThrow("user_metadata")));
        this.f10492OooOo0O = cursor.getString(cursor.getColumnIndexOrThrow("expiration_time_rule_id"));
        this.f10493OooOo0o = cursor.getString(cursor.getColumnIndexOrThrow("http_expires_date"));
        this.f10489OooOo = cursor.getString(cursor.getColumnIndexOrThrow("sse_algorithm"));
        this.f10495OooOoO0 = cursor.getString(cursor.getColumnIndexOrThrow("kms_key"));
        this.f10494OooOoO = cursor.getString(cursor.getColumnIndexOrThrow("content_md5"));
        this.f10496OooOoOO = cursor.getString(cursor.getColumnIndexOrThrow("canned_acl"));
        this.f10491OooOo00 = cursor.getString(cursor.getColumnIndexOrThrow("header_storage_class"));
        this.f10498OooOoo0 = (TransferUtilityOptions) this.f10499OooOooO.OooO0OO(cursor.getString(cursor.getColumnIndexOrThrow("transfer_utility_options")), TransferUtilityOptions.class);
    }

    public final String toString() {
        StringBuilder sbOooO00o = Oooo0.OooO00o("[", "id:");
        sbOooO00o.append(this.f10471OooO00o);
        sbOooO00o.append(",");
        sbOooO00o.append("bucketName:");
        o00O0.OooO0OO(sbOooO00o, this.f10480OooOO0O, ",", "key:");
        o00O0.OooO0OO(sbOooO00o, this.f10481OooOO0o, ",", "file:");
        o00O0.OooO0OO(sbOooO00o, this.f10483OooOOO0, ",", "type:");
        sbOooO00o.append(this.f10470OooO);
        sbOooO00o.append(",");
        sbOooO00o.append("bytesTotal:");
        sbOooO00o.append(this.f10475OooO0o);
        sbOooO00o.append(",");
        sbOooO00o.append("bytesCurrent:");
        sbOooO00o.append(this.f10477OooO0oO);
        sbOooO00o.append(",");
        sbOooO00o.append("fileOffset:");
        sbOooO00o.append(this.f10478OooO0oo);
        sbOooO00o.append(",");
        sbOooO00o.append("state:");
        sbOooO00o.append(this.f10479OooOO0);
        sbOooO00o.append(",");
        sbOooO00o.append("cannedAcl:");
        o00O0.OooO0OO(sbOooO00o, this.f10496OooOoOO, ",", "mainUploadId:");
        sbOooO00o.append(this.f10472OooO0O0);
        sbOooO00o.append(",");
        sbOooO00o.append("isMultipart:");
        sbOooO00o.append(this.f10473OooO0OO);
        sbOooO00o.append(",");
        sbOooO00o.append("isLastPart:");
        sbOooO00o.append(this.f10474OooO0Oo);
        sbOooO00o.append(",");
        sbOooO00o.append("partNumber:");
        sbOooO00o.append(this.f10476OooO0o0);
        sbOooO00o.append(",");
        sbOooO00o.append("multipartId:");
        o00O0.OooO0OO(sbOooO00o, this.f10482OooOOO, ",", "eTag:");
        o00O0.OooO0OO(sbOooO00o, this.f10484OooOOOO, ",", "storageClass:");
        o00O0.OooO0OO(sbOooO00o, this.f10491OooOo00, ",", "userMetadata:");
        sbOooO00o.append(this.f10490OooOo0.toString());
        sbOooO00o.append(",");
        sbOooO00o.append("transferUtilityOptions:");
        sbOooO00o.append(this.f10499OooOooO.OooO0oo(this.f10498OooOoo0));
        sbOooO00o.append("]");
        return sbOooO00o.toString();
    }
}
