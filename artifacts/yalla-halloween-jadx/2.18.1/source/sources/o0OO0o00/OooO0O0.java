package o0OO0o00;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements Continuation<Void, List> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Collection f37918OooO0Oo;

    public OooO0O0(Collection collection) {
        this.f37918OooO0Oo = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ List then(@NonNull Task<Void> task) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f37918OooO0Oo.iterator();
        while (it.hasNext()) {
            arrayList.add(((Task) it.next()).getResult());
        }
        return arrayList;
    }
}
