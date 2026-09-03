package p254o00ooOO0;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zacp;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zaq;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo00 extends zaq {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ zada f40988OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(zada zadaVar, Looper looper) {
        super(looper);
        this.f40988OooO00o = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String strValueOf = String.valueOf(runtimeException.getMessage());
                Log.e("TransformedResultImpl", strValueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(strValueOf) : new String("Runtime exception on the transformation worker thread: "));
                throw runtimeException;
            }
            StringBuilder sb = new StringBuilder(70);
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i);
            Log.e("TransformedResultImpl", sb.toString());
            return;
        }
        PendingResult<?> pendingResult = (PendingResult) message.obj;
        synchronized (this.f40988OooO00o.f14913OooO0o0) {
            try {
                zada zadaVar = (zada) Preconditions.checkNotNull(this.f40988OooO00o.f14909OooO0O0);
                if (pendingResult == null) {
                    zadaVar.OooO00o(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zacp) {
                    zadaVar.OooO00o(((zacp) pendingResult).f14898OooO00o);
                } else {
                    zadaVar.zai(pendingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
