package androidx.camera.core.impl;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo00o implements Comparator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3781OooO0Oo;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3781OooO0Oo) {
            case 0:
                return ((Config.OooO00o) obj).OooO0O0().compareTo(((Config.OooO00o) obj2).OooO0O0());
            default:
                return Integer.compare(((o00oOoO.o00Oo0.OooO00o) obj2).f40063OooO0O0, ((o00oOoO.o00Oo0.OooO00o) obj).f40063OooO0O0);
        }
    }
}
