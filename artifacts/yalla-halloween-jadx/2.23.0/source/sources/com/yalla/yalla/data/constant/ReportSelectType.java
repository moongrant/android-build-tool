package com.yalla.yalla.data.constant;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/data/constant/ReportSelectType;", "", "Ljava/io/Serializable;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "getValue", "()I", "Porn", "Spam", "Violence", "Illegal", "Fraud", "Plagiarism", "Other", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public enum ReportSelectType implements Serializable {
    Porn(1),
    Spam(2),
    Violence(3),
    Illegal(4),
    Fraud(5),
    Plagiarism(6),
    Other(10);

    private final int value;

    ReportSelectType(int i) {
        this.value = i;
    }
}
