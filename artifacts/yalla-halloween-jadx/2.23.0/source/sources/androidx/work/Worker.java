package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import p094o000o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0000O00<ListenableWorker.OooO00o> f8392OooO;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final o0000O00 OooO0o0() {
        this.f8392OooO = new o0000O00<>();
        this.f8373OooO0o0.f8395OooO0OO.execute(new OooO0OO(this));
        return this.f8392OooO;
    }

    @NonNull
    @WorkerThread
    public abstract ListenableWorker.OooO00o OooO0oo();
}
