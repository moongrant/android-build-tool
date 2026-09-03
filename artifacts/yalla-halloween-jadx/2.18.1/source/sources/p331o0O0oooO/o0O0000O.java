package p331o0O0oooO;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0000O implements OnCompleteListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37079OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zaad f37080OooO0o0;

    public o0O0000O(zaad zaadVar, TaskCompletionSource taskCompletionSource) {
        this.f37080OooO0o0 = zaadVar;
        this.f37079OooO0Oo = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.f37080OooO0o0.f15312OooO0O0.remove(this.f37079OooO0Oo);
    }
}
