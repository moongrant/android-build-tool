package androidx.camera.core;

import android.media.Image;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import p028Oooo0oO.oo00o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class OooOO0O implements OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f3449OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public final HashSet f3450OooO0o = new HashSet();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO0 f3451OooO0o0;

    public interface OooO00o {
        void OooO00o(@NonNull OooOOO0 oooOOO0);
    }

    public OooOO0O(@NonNull OooOOO0 oooOOO0) {
        this.f3451OooO0o0 = oooOOO0;
    }

    public final void OooO00o(@NonNull OooO00o oooO00o) {
        synchronized (this.f3449OooO0Oo) {
            this.f3450OooO0o.add(oooO00o);
        }
    }

    @Override // androidx.camera.core.OooOOO0
    @NonNull
    public final OooOOO0.OooO00o[] OooooOO() {
        return this.f3451OooO0o0.OooooOO();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.f3451OooO0o0.close();
        synchronized (this.f3449OooO0Oo) {
            hashSet = new HashSet(this.f3450OooO0o);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((OooO00o) it.next()).OooO00o(this);
        }
    }

    @Override // androidx.camera.core.OooOOO0
    public final int getFormat() {
        return this.f3451OooO0o0.getFormat();
    }

    @Override // androidx.camera.core.OooOOO0
    public int getHeight() {
        return this.f3451OooO0o0.getHeight();
    }

    @Override // androidx.camera.core.OooOOO0
    @Nullable
    @ExperimentalGetImage
    public final Image getImage() {
        return this.f3451OooO0o0.getImage();
    }

    @Override // androidx.camera.core.OooOOO0
    public int getWidth() {
        return this.f3451OooO0o0.getWidth();
    }

    @Override // androidx.camera.core.OooOOO0
    @NonNull
    public oo00o o00000OO() {
        return this.f3451OooO0o0.o00000OO();
    }
}
