package com.qiniu.android.http.metrics;

import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.http.request.Request;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UploadSingleRequestMetrics {
    public String clientName;
    public String clientVersion;
    public UploadSingleRequestMetrics connectCheckMetrics;
    public Date connectEndDate;
    public Date connectStartDate;
    public Date domainLookupEndDate;
    public Date domainLookupStartDate;
    public Date endDate;
    public String httpVersion;
    public String localAddress;
    public Integer localPort;
    public String remoteAddress;
    public Integer remotePort;
    public Request request;
    public Date requestEndDate;
    public Date requestStartDate;
    public ResponseInfo response;
    public Date responseEndDate;
    public Date responseStartDate;
    public Date secureConnectionEndDate;
    public Date secureConnectionStartDate;
    public Date startDate;
    public long countOfRequestHeaderBytesSent = 0;
    public long countOfRequestBodyBytesSent = 0;
    public long countOfResponseHeaderBytesReceived = 0;
    public long countOfResponseBodyBytesReceived = 0;

    private long time(Date date, Date date2) {
        if (date == null || date2 == null) {
            return 0L;
        }
        return date2.getTime() - date.getTime();
    }

    public Long bytesSend() {
        long j = totalBytes();
        long j2 = this.countOfRequestHeaderBytesSent + this.countOfRequestBodyBytesSent;
        if (j2 <= j) {
            j = j2;
        }
        return Long.valueOf(j);
    }

    public void setRequest(Request request) {
        if (request != null) {
            this.request = new Request(request.urlString, request.httpMethod, request.allHeaders, null, request.timeout);
        }
    }

    public long totalBytes() {
        Request request = this.request;
        if (request == null) {
            return 0L;
        }
        long length = request.allHeaders != null ? new JSONObject(this.request.allHeaders).toString().length() : 0L;
        byte[] bArr = this.request.httpBody;
        return length + (bArr != null ? bArr.length : 0L);
    }

    public long totalConnectTime() {
        return time(this.connectStartDate, this.connectEndDate);
    }

    public long totalDnsTime() {
        return time(this.domainLookupStartDate, this.domainLookupEndDate);
    }

    public long totalElapsedTime() {
        return time(this.startDate, this.endDate);
    }

    public long totalRequestTime() {
        return time(this.requestStartDate, this.requestEndDate);
    }

    public long totalResponseTime() {
        return time(this.responseStartDate, this.responseEndDate);
    }

    public long totalSecureConnectTime() {
        return time(this.secureConnectionStartDate, this.secureConnectionEndDate);
    }

    public long totalWaitTime() {
        return time(this.requestEndDate, this.responseStartDate);
    }
}
