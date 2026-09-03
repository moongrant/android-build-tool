package p471o0OoooO0;

import android.content.DialogInterface;
import com.yalla.yalla.module.media.music.MusicAddScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0 implements DialogInterface.OnDismissListener {
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        MusicAddScreen.scanCompletedListener = null;
    }
}
