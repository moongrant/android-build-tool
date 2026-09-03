package p249o00ooO0;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO implements Comparator<Scope> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Scope scope, Scope scope2) {
        return scope.getScopeUri().compareTo(scope2.getScopeUri());
    }
}
