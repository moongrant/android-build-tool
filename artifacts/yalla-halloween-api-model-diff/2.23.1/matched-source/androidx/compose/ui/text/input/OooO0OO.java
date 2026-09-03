package androidx.compose.ui.text.input;

import android.os.Bundle;
import androidx.media3.session.Oooo0;
import com.facebook.appevents.UserDataStore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4196OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f4197OooO0o0;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f4196OooO0Oo = i;
        this.f4197OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4196OooO0Oo;
        Object obj = this.f4197OooO0o0;
        switch (i) {
            case 0:
                TextInputServiceAndroid.sendInputCommand$lambda$1((TextInputServiceAndroid) obj);
                break;
            case 1:
                ((Oooo0) obj).release();
                break;
            default:
                UserDataStore.m4073setUserDataAndHash$lambda1((Bundle) obj);
                break;
        }
    }
}
