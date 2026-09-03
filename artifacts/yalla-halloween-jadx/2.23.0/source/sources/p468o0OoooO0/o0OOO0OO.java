package p468o0OoooO0;

import com.android.billingclient.api.o0000O;
import com.yalla.yalla.module.media.utils.FFmpegCmdResult;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import p009OooOOo0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0OO implements OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Continuation<FFmpegCmdResult> f46929OooO00o;

    public o0OOO0OO(SafeContinuation safeContinuation) {
        this.f46929OooO00o = safeContinuation;
    }

    @Override // p009OooOOo0.OooO0O0
    public final void OooO00o(float f) {
        o0000O.OooO0Oo("execCmd onProgress  " + f);
        o0OOOO00.f46932OooO0OO.setValue(Float.valueOf(f));
    }

    @Override // p009OooOOo0.OooO0O0
    public final void onCancel() {
        o0OO0O0.OooO00o("_VideoCompressUtil", "execCmd onCancel");
        o0OOOO00 o0oooo01 = o0OOOO00.f46930OooO00o;
        o0OOOO00.f46932OooO0OO.setValue(null);
        Result.Companion companion = Result.INSTANCE;
        this.f46929OooO00o.resumeWith(Result.m4213constructorimpl(FFmpegCmdResult.Cancel));
    }

    @Override // p009OooOOo0.OooO0O0
    public final void onFailure() {
        o0OO0O0.OooO00o("_VideoCompressUtil", "execCmd onFailure");
        o0OOOO00.f46932OooO0OO.setValue(null);
        Result.Companion companion = Result.INSTANCE;
        this.f46929OooO00o.resumeWith(Result.m4213constructorimpl(FFmpegCmdResult.Failure));
    }

    @Override // p009OooOOo0.OooO0O0
    public final void onSuccess() {
        o0OO0O0.OooO00o("_VideoCompressUtil", "execCmd onSuccess");
        o0OOOO00 o0oooo01 = o0OOOO00.f46930OooO00o;
        o0OOOO00.f46932OooO0OO.setValue(Float.valueOf(1.0f));
        Result.Companion companion = Result.INSTANCE;
        this.f46929OooO00o.resumeWith(Result.m4213constructorimpl(FFmpegCmdResult.Success));
    }
}
