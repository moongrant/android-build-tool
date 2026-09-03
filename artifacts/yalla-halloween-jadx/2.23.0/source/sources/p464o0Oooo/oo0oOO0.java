package p464o0Oooo;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account$kaVipStateAndLevel$2\n*L\n1#1,15:1\n259#2,5:16\n*E\n"})
public final class oo0oOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f46865OooO0Oo;

    public oo0oOO0(MutableLiveData mutableLiveData) {
        this.f46865OooO0Oo = mutableLiveData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f46865OooO0Oo).observeForever(new o000000O.o0000O00(o00O0OOO.f46814OooO0Oo));
    }
}
