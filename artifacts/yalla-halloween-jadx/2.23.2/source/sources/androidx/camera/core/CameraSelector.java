package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.o000OO00;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p028Oooo0oO.o000O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class CameraSelector {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public static final CameraSelector f3393OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public static final CameraSelector f3394OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashSet<o000O> f3395OooO00o;

    @OptIn(markerClass = {ExperimentalLensFacing.class})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LensFacing {
    }

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new o000OO00(0));
        f3393OooO0O0 = new CameraSelector(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new o000OO00(1));
        f3394OooO0OO = new CameraSelector(linkedHashSet2);
    }

    public CameraSelector(LinkedHashSet<o000O> linkedHashSet) {
        this.f3395OooO00o = linkedHashSet;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final LinkedHashSet<CameraInternal> OooO00o(@NonNull LinkedHashSet<CameraInternal> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<CameraInternal> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().OooO00o());
        }
        List listOooO0O0 = OooO0O0(arrayList);
        LinkedHashSet<CameraInternal> linkedHashSet2 = new LinkedHashSet<>();
        for (CameraInternal cameraInternal : linkedHashSet) {
            if (listOooO0O0.contains(cameraInternal.OooO00o())) {
                linkedHashSet2.add(cameraInternal);
            }
        }
        return linkedHashSet2;
    }

    @NonNull
    public final List OooO0O0(@NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator<o000O> it = this.f3395OooO00o.iterator();
        while (it.hasNext()) {
            arrayList2 = it.next().OooO0O0(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Integer OooO0OO() {
        Integer num = null;
        for (o000O o000o : this.f3395OooO00o) {
            if (o000o instanceof o000OO00) {
                Integer numValueOf = Integer.valueOf(((o000OO00) o000o).f3704OooO0O0);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0Oo(@NonNull LinkedHashSet linkedHashSet) {
        Iterator<CameraInternal> it = OooO00o(linkedHashSet).iterator();
        if (!it.hasNext()) {
            throw new IllegalArgumentException("No available camera can be found");
        }
        it.next();
    }
}
