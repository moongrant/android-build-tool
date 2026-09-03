package p034OoooOO0;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.core.impl.o0o0Oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.PSKKeyManager;
import p028Oooo0oO.o00O0O0;
import p031OoooO0.OooOOOO;
import p031OoooO0.Oooo0;
import p036OoooOOo.o0000oo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f1453OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Rational f1454OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f1455OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0ooOOo f1456OooO0Oo;

    public o00oO0o(@NonNull o0Oo0oo o0oo0oo2, @Nullable Size size) {
        Rational rational;
        this.f1453OooO00o = o0oo0oo2;
        o0oo0oo2.OooO0OO();
        o0oo0oo2.OooO0o0();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List<Size> listOooO0oo = o0oo0oo2.OooO0oo(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            if (listOooO0oo.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listOooO0oo, new Oooo0(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f1454OooO0O0 = rational;
        this.f1455OooO0OO = rational == null || rational.getNumerator() >= rational.getDenominator();
        this.f1456OooO0Oo = new o0ooOOo(o0oo0oo2, rational);
    }

    @NonNull
    public static ArrayList OooO0O0(@NonNull ArrayList arrayList) {
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(OooOOOO.f1388OooO00o);
        arrayList2.add(OooOOOO.f1390OooO0OO);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    if (OooOOOO.OooO00o(size, (Rational) it2.next(), o0000oo.f1475OooO0OO)) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    arrayList2.add(rational);
                }
            }
        }
        return arrayList2;
    }

    @Nullable
    public static Rational OooO0OO(int i, boolean z) {
        if (i != -1) {
            if (i == 0) {
                return z ? OooOOOO.f1388OooO00o : OooOOOO.f1389OooO0O0;
            }
            if (i == 1) {
                return z ? OooOOOO.f1390OooO0OO : OooOOOO.f1391OooO0Oo;
            }
            o00O0O0.OooO0O0("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        }
        return null;
    }

    public static HashMap OooO0Oo(@NonNull ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = OooO0O0(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (OooOOOO.OooO00o(size, rational, o0000oo.f1475OooO0OO)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static void OooO0o(@NonNull List<Size> list, @NonNull Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void OooO0o0(@NonNull List<Size> list, @NonNull Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    @NonNull
    public final ArrayList OooO00o(@NonNull o0o0Oo o0o0oo) {
        Size[] sizeArr;
        int iOooO0o = o0o0oo.OooO0o();
        List listOooO00o = ((ImageOutputConfig) o0o0oo).OooO00o();
        if (listOooO00o == null) {
            sizeArr = null;
            break;
        }
        Iterator it = listOooO00o.iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).intValue() == iOooO0o) {
                sizeArr = (Size[]) pair.second;
                break;
            }
        }
        List<Size> listAsList = sizeArr != null ? Arrays.asList(sizeArr) : null;
        if (listAsList == null) {
            listAsList = this.f1453OooO00o.OooO0oo(iOooO0o);
        }
        ArrayList arrayList = new ArrayList(listAsList);
        Collections.sort(arrayList, new Oooo0(true));
        if (arrayList.isEmpty()) {
            o00O0O0.OooO0oo("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + iOooO0o + ".");
        }
        return arrayList;
    }
}
