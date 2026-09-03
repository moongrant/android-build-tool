package androidx.core.view;

import android.content.Context;
import android.view.GestureDetector;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f5338OooO00o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final GestureDetector f5339OooO00o;

        public OooO00o(Context context, androidx.recyclerview.widget.o00O0O.OooO oooO) {
            this.f5339OooO00o = new GestureDetector(context, oooO, null);
        }
    }

    public Oooo0(@NonNull Context context, @NonNull androidx.recyclerview.widget.o00O0O.OooO oooO) {
        this.f5338OooO00o = new OooO00o(context, oooO);
    }
}
