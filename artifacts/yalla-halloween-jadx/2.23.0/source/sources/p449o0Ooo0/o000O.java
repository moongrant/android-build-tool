package p449o0Ooo0;

import android.content.DialogInterface;
import com.yalla.yalla.module.media.music.MusicAddScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000O implements DialogInterface.OnDismissListener {
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        MusicAddScreen.scanCompletedListener = null;
    }
}
