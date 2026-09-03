package androidx.compose.ui.text.input;

import com.common.support.utils.UtilsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4187OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f4188OooO0o0;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f4187OooO0Oo = i;
        this.f4188OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4187OooO0Oo;
        Object obj = this.f4188OooO0o0;
        switch (i) {
            case 0:
                TextInputServiceAndroid.sendInputCommand$lambda$1((TextInputServiceAndroid) obj);
                break;
            default:
                UtilsKt.m4028runDelayedOnUiThread$lambda1((Function0) obj);
                break;
        }
    }
}
