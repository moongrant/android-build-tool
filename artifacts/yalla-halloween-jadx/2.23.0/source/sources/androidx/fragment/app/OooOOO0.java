package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends Lambda implements Function1<Map.Entry<String, View>, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Collection<String> f5913OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(Collection<String> collection) {
        super(1);
        this.f5913OooO0Oo = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Map.Entry<String, View> entry) {
        Map.Entry<String, View> entry2 = entry;
        Intrinsics.checkNotNullParameter(entry2, "entry");
        Collection<String> collection = this.f5913OooO0Oo;
        View value = entry2.getValue();
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        return Boolean.valueOf(CollectionsKt.contains(collection, ViewCompat.OooOOO.OooOO0O(value)));
    }
}
