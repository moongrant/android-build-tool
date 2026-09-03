package p047Oooooo0;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOOO0 implements Map.Entry<Object, Object>, KMutableMap.Entry {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Object f4127Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object f4128Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo<Object, Object> f4129Oooo0oo;

    public o00OOOO0(o00OOOOo<Object, Object> o00ooooo2) {
        this.f4129Oooo0oo = o00ooooo2;
        Map.Entry<? extends Object, ? extends Object> entry = o00ooooo2.f4130Oooo;
        Intrinsics.checkNotNull(entry);
        this.f4127Oooo0o = entry.getKey();
        Map.Entry<? extends Object, ? extends Object> entry2 = o00ooooo2.f4130Oooo;
        Intrinsics.checkNotNull(entry2);
        this.f4128Oooo0oO = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4127Oooo0o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4128Oooo0oO;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        o00OOOOo<Object, Object> o00ooooo2 = this.f4129Oooo0oo;
        if (o00ooooo2.f4131Oooo0o.OooO0O0() != o00ooooo2.f4133Oooo0oo) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f4128Oooo0oO;
        o00ooooo2.f4131Oooo0o.put(this.f4127Oooo0o, obj);
        this.f4128Oooo0oO = obj;
        return obj2;
    }
}
