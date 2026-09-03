package p409o0Oo0o0o;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 GuideSpTable.kt\ncom/yalla/yalla/data/sp/table/GuideSpTable$isPayEmojiHasReadLiveData$2\n*L\n1#1,15:1\n201#2,6:16\n*E\n"})
public final class oo0o0Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f45224OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f45225OooO0o0;

    public oo0o0Oo(MutableLiveData mutableLiveData, o0O0O00 o0o0o00) {
        this.f45224OooO0Oo = mutableLiveData;
        this.f45225OooO0o0 = o0o0o00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f45224OooO0Oo).observeForever(new o0O0O00.OooO0O0(new o0OO00O(this.f45225OooO0o0)));
    }
}
