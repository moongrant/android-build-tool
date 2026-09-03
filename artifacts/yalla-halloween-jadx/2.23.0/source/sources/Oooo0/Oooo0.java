package Oooo0;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class Oooo0 implements OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f418OooO00o;

    @RequiresApi(21)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<Surface> f419OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Size f420OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f421OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f422OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public String f424OooO0o0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f423OooO0o = false;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f425OooO0oO = 1;

        public OooO00o(@NonNull Surface surface) {
            Size size;
            int iIntValue;
            int iIntValue2;
            this.f419OooO00o = Collections.singletonList(surface);
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                size = (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                o00O0O0.OooO0OO("OutputConfigCompat", "Unable to retrieve surface size.", e);
                size = null;
            }
            this.f420OooO0O0 = size;
            try {
                iIntValue = ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class).invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                o00O0O0.OooO0OO("OutputConfigCompat", "Unable to retrieve surface format.", e2);
                iIntValue = 0;
            }
            this.f421OooO0OO = iIntValue;
            try {
                iIntValue2 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                o00O0O0.OooO0OO("OutputConfigCompat", "Unable to retrieve surface generation id.", e3);
                iIntValue2 = -1;
            }
            this.f422OooO0Oo = iIntValue2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            if (!this.f420OooO0O0.equals(oooO00o.f420OooO0O0) || this.f421OooO0OO != oooO00o.f421OooO0OO || this.f422OooO0Oo != oooO00o.f422OooO0Oo || this.f423OooO0o != oooO00o.f423OooO0o || this.f425OooO0oO != oooO00o.f425OooO0oO || !Objects.equals(this.f424OooO0o0, oooO00o.f424OooO0o0)) {
                return false;
            }
            List<Surface> list = this.f419OooO00o;
            int size = list.size();
            List<Surface> list2 = oooO00o.f419OooO00o;
            int iMin = Math.min(size, list2.size());
            for (int i = 0; i < iMin; i++) {
                if (list.get(i) != list2.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            int iHashCode = this.f419OooO00o.hashCode() ^ 31;
            int i = this.f422OooO0Oo ^ ((iHashCode << 5) - iHashCode);
            int iHashCode2 = this.f420OooO0O0.hashCode() ^ ((i << 5) - i);
            int i2 = this.f421OooO0OO ^ ((iHashCode2 << 5) - iHashCode2);
            int i3 = (this.f423OooO0o ? 1 : 0) ^ ((i2 << 5) - i2);
            int i4 = (i3 << 5) - i3;
            String str = this.f424OooO0o0;
            int iHashCode3 = (str == null ? 0 : str.hashCode()) ^ i4;
            int i5 = (iHashCode3 << 5) - iHashCode3;
            long j = this.f425OooO0oO;
            return ((int) (j ^ (j >>> 32))) ^ i5;
        }
    }

    public Oooo0(@NonNull Surface surface) {
        this.f418OooO00o = new OooO00o(surface);
    }

    @Override // Oooo0.OooOOO.OooO00o
    public void OooO00o(long j) {
    }

    @Override // Oooo0.OooOOO.OooO00o
    public void OooO0O0(@NonNull Surface surface) {
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!OooO0oo()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // Oooo0.OooOOO.OooO00o
    public void OooO0OO(long j) {
        ((OooO00o) this.f418OooO00o).f425OooO0oO = j;
    }

    @Override // Oooo0.OooOOO.OooO00o
    public void OooO0Oo(@Nullable String str) {
        ((OooO00o) this.f418OooO00o).f424OooO0o0 = str;
    }

    @Override // Oooo0.OooOOO.OooO00o
    public void OooO0o() {
        ((OooO00o) this.f418OooO00o).f423OooO0o = true;
    }

    @Override // Oooo0.OooOOO.OooO00o
    @Nullable
    public String OooO0o0() {
        return ((OooO00o) this.f418OooO00o).f424OooO0o0;
    }

    @Override // Oooo0.OooOOO.OooO00o
    @Nullable
    public Object OooO0oO() {
        return null;
    }

    public boolean OooO0oo() {
        return ((OooO00o) this.f418OooO00o).f423OooO0o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        return Objects.equals(this.f418OooO00o, ((Oooo0) obj).f418OooO00o);
    }

    @Override // Oooo0.OooOOO.OooO00o
    @Nullable
    public Surface getSurface() {
        List<Surface> list = ((OooO00o) this.f418OooO00o).f419OooO00o;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public final int hashCode() {
        return this.f418OooO00o.hashCode();
    }

    public Oooo0(@NonNull Object obj) {
        this.f418OooO00o = obj;
    }
}
