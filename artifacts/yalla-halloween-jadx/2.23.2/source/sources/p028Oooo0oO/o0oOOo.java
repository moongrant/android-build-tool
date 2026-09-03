package p028Oooo0oO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.Oooo0;
import androidx.camera.core.ViewPort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o000OO.OooOOO0;
import p037OoooOo0.o00O00O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0oOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final ViewPort f1184OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final List<Oooo0> f1185OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final List<CameraEffect> f1186OooO0OO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final List<Integer> f1187OooO0Oo = Arrays.asList(1, 2, 4, 3, 7);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ViewPort f1188OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f1189OooO0O0 = new ArrayList();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f1190OooO0OO = new ArrayList();

        @NonNull
        public final o0oOOo OooO00o() {
            ArrayList arrayList = this.f1189OooO0O0;
            OooOOO0.OooO0O0(!arrayList.isEmpty(), "UseCase must not be empty.");
            ArrayList arrayList2 = this.f1190OooO0OO;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((CameraEffect) it.next()).getClass();
                List<Integer> list = f1187OooO0Oo;
                boolean zContains = list.contains(0);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                objArr[0] = o00O00O.OooO00o(0);
                ArrayList arrayList3 = new ArrayList();
                Iterator<Integer> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(o00O00O.OooO00o(it2.next().intValue()));
                }
                StringBuilder sb = new StringBuilder("[");
                StringBuilder sb2 = new StringBuilder();
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it3.next());
                        if (it3.hasNext()) {
                            sb2.append((CharSequence) ", ");
                        }
                    }
                }
                sb.append(sb2.toString());
                sb.append("]");
                objArr[1] = sb.toString();
                OooOOO0.OooO0O0(zContains, String.format(locale, "Effects target %s is not in the supported list %s.", objArr));
            }
            return new o0oOOo(this.f1188OooO00o, arrayList, arrayList2);
        }
    }

    public o0oOOo(@Nullable ViewPort viewPort, @NonNull ArrayList arrayList, @NonNull ArrayList arrayList2) {
        this.f1184OooO00o = viewPort;
        this.f1185OooO0O0 = arrayList;
        this.f1186OooO0OO = arrayList2;
    }
}
