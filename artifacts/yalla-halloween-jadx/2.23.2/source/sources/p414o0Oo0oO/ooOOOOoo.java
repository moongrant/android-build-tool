package p414o0Oo0oO;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 GuideSpTable.kt\ncom/yalla/yalla/data/sp/table/GuideSpTable$isPayEmojiHasReadLiveData$2\n*L\n1#1,15:1\n201#2,6:16\n*E\n"})
public final class ooOOOOoo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f46404OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oO0OOo0o f46405OooO0o0;

    public ooOOOOoo(MutableLiveData mutableLiveData, oO0OOo0o oo0ooo0o) {
        this.f46404OooO0Oo = mutableLiveData;
        this.f46405OooO0o0 = oo0ooo0o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((MutableLiveData) this.f46404OooO0Oo).observeForever(new oO0OOo0o.OooO0O0(new oO000OOo(this.f46405OooO0o0)));
    }
}
