package p031OoooO0;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class Oooo0 implements Comparator<Size> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f1367OooO0Oo;

    public Oooo0(boolean z) {
        this.f1367OooO0Oo = false;
        this.f1367OooO0Oo = z;
    }

    @Override // java.util.Comparator
    public final int compare(@NonNull Size size, @NonNull Size size2) {
        Size size3 = size;
        Size size4 = size2;
        int iSignum = Long.signum((((long) size3.getWidth()) * ((long) size3.getHeight())) - (((long) size4.getWidth()) * ((long) size4.getHeight())));
        return this.f1367OooO0Oo ? iSignum * (-1) : iSignum;
    }
}
