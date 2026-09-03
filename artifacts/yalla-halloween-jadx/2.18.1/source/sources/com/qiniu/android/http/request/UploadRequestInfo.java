package com.qiniu.android.http.request;

/* JADX INFO: loaded from: classes2.dex */
class UploadRequestInfo {
    public static final String RequestTypeBput = "bput";
    public static final String RequestTypeCompletePart = "complete_part";
    public static final String RequestTypeForm = "form";
    public static final String RequestTypeInitParts = "init_parts";
    public static final String RequestTypeMkblk = "mkblk";
    public static final String RequestTypeMkfile = "mkfile";
    public static final String RequestTypeUCQuery = "uc_query";
    public static final String RequestTypeUpLog = "uplog";
    public static final String RequestTypeUploadPart = "upload_part";
    public String bucket;
    public String currentRegionId;
    public Long fileOffset;
    public String key;
    public String requestType;
    public String targetRegionId;

    public boolean shouldReportRequestLog() {
        return !this.requestType.equals(RequestTypeUpLog);
    }
}
