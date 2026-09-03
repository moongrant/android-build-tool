package p358o0OOOooO;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumSource;
import com.yalla.album.AlbumActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O extends Lambda implements Function1<List<? extends AlbumSource>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AlbumActivity f43810OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(AlbumActivity albumActivity) {
        super(1);
        this.f43810OooO0Oo = albumActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends AlbumSource> list) {
        List<? extends AlbumSource> loadData = list;
        Intrinsics.checkNotNullParameter(loadData, "$this$loadData");
        AlbumActivity albumActivity = this.f43810OooO0Oo;
        albumActivity.getClass();
        Intrinsics.checkNotNullParameter(loadData, "<set-?>");
        albumActivity.f22495OooO0oO = loadData;
        if (!albumActivity.f22496OooO0oo.isEmpty()) {
            List<AlbumItem> data = albumActivity.f22495OooO0oO.get(0).getData();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10)), 16));
            for (Object obj : data) {
                linkedHashMap.put(((AlbumItem) obj).getContentUri(), obj);
            }
            ArrayList<Uri> arrayList = albumActivity.f22496OooO0oo;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (linkedHashMap.containsKey((Uri) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AlbumItem albumItem = (AlbumItem) linkedHashMap.get((Uri) it.next());
                if (albumItem != null) {
                    arrayList3.add(albumItem);
                }
            }
            albumActivity.f22492OooO = albumActivity.f22496OooO0oo.size() - arrayList3.size();
            albumActivity.OooOOO().setInitMultiSelectedData(arrayList3);
            albumActivity.OooOOo();
        }
        Object value = albumActivity.f22506OooOOoo.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-albumRv>(...)");
        RecyclerView.Adapter adapter = ((RecyclerView) value).getAdapter();
        BaseQuickAdapter baseQuickAdapter = adapter instanceof BaseQuickAdapter ? (BaseQuickAdapter) adapter : null;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.OooOoO0(albumActivity.f22495OooO0oO);
        }
        albumActivity.OooOOo0();
        return Unit.INSTANCE;
    }
}
