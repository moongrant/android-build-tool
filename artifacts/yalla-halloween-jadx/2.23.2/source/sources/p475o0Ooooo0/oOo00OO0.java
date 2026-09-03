package p475o0Ooooo0;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account$sex$2\n*L\n1#1,15:1\n205#2,2:16\n*E\n"})
public final class oOo00OO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f48121OooO0Oo;

    public oOo00OO0(MutableLiveData mutableLiveData) {
        this.f48121OooO0Oo = mutableLiveData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f48121OooO0Oo).observeForever(new o0O00oO0.o0000O00(oO00O0o.f48086OooO0Oo));
    }
}
