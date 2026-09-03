package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {

    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkManager() {
    }
}
