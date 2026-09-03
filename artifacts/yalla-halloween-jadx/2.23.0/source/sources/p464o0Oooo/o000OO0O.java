package p464o0Oooo;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account$currWealthLevel$2\n*L\n1#1,15:1\n292#2,2:16\n*E\n"})
public final class o000OO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f46797OooO0Oo;

    public o000OO0O(MutableLiveData mutableLiveData) {
        this.f46797OooO0Oo = mutableLiveData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f46797OooO0Oo).observeForever(new o000000O.o0000O00(o000O0Oo.f46793OooO0Oo));
    }
}
