package o000O0O0;

import android.content.Context;
import android.view.GestureDetector;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f28104OooO00o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final GestureDetector f28105OooO00o;

        public OooO00o(Context context, GestureDetector.OnGestureListener onGestureListener) {
            this.f28105OooO00o = new GestureDetector(context, onGestureListener, null);
        }
    }

    public OooO0OO(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this.f28104OooO00o = new OooO00o(context, onGestureListener);
    }
}
