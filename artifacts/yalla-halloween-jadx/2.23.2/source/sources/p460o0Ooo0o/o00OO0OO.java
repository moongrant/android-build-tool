package p460o0Ooo0o;

import com.android.billingclient.api.o0000O0;
import com.yalla.yalla.module.media.utils.FFmpegCmdResult;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import p009OooOOo0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO implements OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Continuation<FFmpegCmdResult> f47802OooO00o;

    public o00OO0OO(SafeContinuation safeContinuation) {
        this.f47802OooO00o = safeContinuation;
    }

    @Override // p009OooOOo0.OooO0O0
    public final void OooO00o(float f) {
        o0000O0.OooO0OO("execCmd onProgress  " + f);
        oo0O.f47809OooO0OO.setValue(Float.valueOf(f));
    }

    @Override // p009OooOOo0.OooO0O0
    public final void onCancel() {
        oo0o0O0.OooO00o("_VideoCompressUtil", "execCmd onCancel");
        oo0O oo0o = oo0O.f47807OooO00o;
        oo0O.f47809OooO0OO.setValue(null);
        Result.Companion companion = Result.INSTANCE;
        this.f47802OooO00o.resumeWith(Result.m4215constructorimpl(FFmpegCmdResult.Cancel));
    }

    @Override // p009OooOOo0.OooO0O0
    public final void onFailure() {
        oo0o0O0.OooO00o("_VideoCompressUtil", "execCmd onFailure");
        oo0O.f47809OooO0OO.setValue(null);
        Result.Companion companion = Result.INSTANCE;
        this.f47802OooO00o.resumeWith(Result.m4215constructorimpl(FFmpegCmdResult.Failure));
    }

    @Override // p009OooOOo0.OooO0O0
    public final void onSuccess() {
        oo0o0O0.OooO00o("_VideoCompressUtil", "execCmd onSuccess");
        oo0O oo0o = oo0O.f47807OooO00o;
        oo0O.f47809OooO0OO.setValue(Float.valueOf(1.0f));
        Result.Companion companion = Result.INSTANCE;
        this.f47802OooO00o.resumeWith(Result.m4215constructorimpl(FFmpegCmdResult.Success));
    }
}
