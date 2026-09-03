package o000O0O0;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {
    public static boolean OooO00o(@NonNull MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
