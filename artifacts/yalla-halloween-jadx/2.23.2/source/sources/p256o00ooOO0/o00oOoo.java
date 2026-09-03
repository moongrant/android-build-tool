package p256o00ooOO0;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oOoo implements OnCompleteListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f40312OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zaad f40313OooO0O0;

    public o00oOoo(zaad zaadVar, TaskCompletionSource taskCompletionSource) {
        this.f40313OooO0O0 = zaadVar;
        this.f40312OooO00o = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.f40313OooO0O0.f14335OooO0O0.remove(this.f40312OooO00o);
    }
}
