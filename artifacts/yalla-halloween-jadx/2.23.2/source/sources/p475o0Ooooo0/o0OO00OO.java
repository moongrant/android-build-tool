package p475o0Ooooo0;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account$currWealthExperience$2\n*L\n1#1,15:1\n300#2,2:16\n*E\n"})
public final class o0OO00OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f48055OooO0Oo;

    public o0OO00OO(MutableLiveData mutableLiveData) {
        this.f48055OooO0Oo = mutableLiveData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f48055OooO0Oo).observeForever(new o0O00oO0.o0000O00(oo0ooO.f48130OooO0Oo));
    }
}
