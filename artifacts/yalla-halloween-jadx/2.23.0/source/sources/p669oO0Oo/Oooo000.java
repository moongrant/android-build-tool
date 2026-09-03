package p669oO0Oo;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Observer;
import com.yalla.yalla.service.room.OooO00o;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 implements Observer<Pair<? extends Boolean, ? extends Boolean>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LazyListState f60408OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f60409OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f60410OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f60411OooO0oO;

    public Oooo000(LazyListState lazyListState, CoroutineScope coroutineScope, Ref.IntRef intRef, MutableState<Boolean> mutableState) {
        this.f60408OooO0Oo = lazyListState;
        this.f60410OooO0o0 = coroutineScope;
        this.f60409OooO0o = intRef;
        this.f60411OooO0oO = mutableState;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Pair<? extends Boolean, ? extends Boolean> pair) {
        Pair<? extends Boolean, ? extends Boolean> it = pair;
        Intrinsics.checkNotNullParameter(it, "it");
        LazyListState lazyListState = this.f60408OooO0Oo;
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        boolean zBooleanValue = it.getSecond().booleanValue();
        MutableState<Boolean> mutableState = this.f60411OooO0oO;
        if (!zBooleanValue) {
            Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) layoutInfo.getVisibleItemsInfo());
            Intrinsics.checkNotNull(objLastOrNull);
            if (((LazyListItemInfo) objLastOrNull).getIndex() == OooO00o.f24979OooO0oO.OooO0oO() - 1) {
                mutableState.setValue(Boolean.FALSE);
                return;
            }
            return;
        }
        if (it.getFirst().booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(this.f60410OooO0o0, null, null, new OooOo(lazyListState, null), 3, null);
        } else {
            if (layoutInfo.getVisibleItemsInfo().size() <= 1) {
                return;
            }
            mutableState.setValue(Boolean.valueOf((((LazyListItemInfo) CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo())).getOffset() != this.f60409OooO0o.element ? (LazyListItemInfo) CollectionsKt.last((List) layoutInfo.getVisibleItemsInfo()) : layoutInfo.getVisibleItemsInfo().get(layoutInfo.getVisibleItemsInfo().size() + (-2))).getIndex() < OooO00o.f24979OooO0oO.f47386OooOOo.size() - 1));
        }
    }
}
