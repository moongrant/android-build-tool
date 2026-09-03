package p464o0Oooo;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account$visitorNum$2\n*L\n1#1,15:1\n139#2,2:16\n*E\n"})
public final class o0oO0Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f46857OooO0Oo;

    public o0oO0Ooo(MutableLiveData mutableLiveData) {
        this.f46857OooO0Oo = mutableLiveData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f46857OooO0Oo).observeForever(new o000000O.o0000O00(o0O00OOO.f46837OooO0Oo));
    }
}
