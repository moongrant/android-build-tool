package p630o0ooO00;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO0O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f48695OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final List<T> f48696OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f48697OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public o000OO0O(boolean z, @Nullable List<? extends T> list, boolean z2) {
        this.f48695OooO00o = z;
        this.f48696OooO0O0 = list;
        this.f48697OooO0OO = z2;
    }

    public /* synthetic */ o000OO0O(List list) {
        this(true, list, !(list.isEmpty()));
    }
}
