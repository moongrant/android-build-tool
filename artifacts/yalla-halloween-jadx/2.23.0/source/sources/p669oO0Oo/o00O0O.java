package p669oO0Oo;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.lifecycle.Observer;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f60542OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f60543OooO0o0;

    public o00O0O(LazyListState lazyListState, CoroutineScope coroutineScope) {
        this.f60542OooO0Oo = coroutineScope;
        this.f60543OooO0o0 = lazyListState;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        bool.booleanValue();
        BuildersKt__Builders_commonKt.launch$default(this.f60542OooO0Oo, null, null, new o0OoOo0(this.f60543OooO0o0, null), 3, null);
    }
}
