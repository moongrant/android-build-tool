package p022Oooo00O;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.OooO0OO;
import androidx.camera.core.impl.o000OOo;
import androidx.camera.core.impl.o0O0O00;
import androidx.camera.core.impl.o0OOO0o;
import androidx.camera.core.impl.o0Oo0oo;
import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p023Oooo00o.oO0OOO00;
import p023Oooo00o.oOo00ooO;
import p027Oooo0o0.o00O00o0;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oo0o0Oo implements o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O00o0 f906OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo f907OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00 f908OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO0OOO00 f909OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0oOO f910OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f911OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f912OooO0oO = new HashMap();

    public oo0o0Oo(@NonNull Context context, @NonNull OooO0OO oooO0OO, @Nullable CameraSelector cameraSelector) throws InitializationException {
        String strOooO00o;
        boolean z;
        this.f907OooO0O0 = oooO0OO;
        oO0OOO00 oo0ooo00OooO00o = oO0OOO00.OooO00o(context, oooO0OO.f3565OooO0O0);
        this.f909OooO0Oo = oo0ooo00OooO00o;
        this.f910OooO0o = o0oOO.OooO0O0(context);
        try {
            try {
                ArrayList<String> arrayList = new ArrayList();
                oOo00ooO ooo00ooo = (oOo00ooO) oo0ooo00OooO00o.f982OooO00o;
                ooo00ooo.getClass();
                try {
                    List<String> listAsList = Arrays.asList(ooo00ooo.f1006OooO00o.getCameraIdList());
                    if (cameraSelector == null) {
                        Iterator it = listAsList.iterator();
                        while (it.hasNext()) {
                            arrayList.add((String) it.next());
                        }
                    } else {
                        try {
                            strOooO00o = oo0oOO0.OooO00o(oo0ooo00OooO00o, cameraSelector.OooO0OO(), listAsList);
                        } catch (IllegalStateException unused) {
                            strOooO00o = null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : listAsList) {
                            if (!str.equals(strOooO00o)) {
                                HashMap map = this.f912OooO0oO;
                                try {
                                    o000 o000Var = (o000) map.get(str);
                                    if (o000Var == null) {
                                        o000Var = new o000(str, this.f909OooO0Oo);
                                        map.put(str, o000Var);
                                    }
                                    arrayList2.add(o000Var);
                                } catch (CameraAccessExceptionCompat e) {
                                    throw o00OO000.OooO00o(e);
                                }
                            }
                        }
                        Iterator it2 = cameraSelector.OooO0O0(arrayList2).iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((o0Oo0oo) ((CameraInfo) it2.next())).OooO0Oo());
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (String str2 : arrayList) {
                        if (str2.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO) || str2.equals("1")) {
                            arrayList3.add(str2);
                        } else {
                            if ("robolectric".equals(Build.FINGERPRINT)) {
                                z = true;
                                break;
                            }
                            try {
                                int[] iArr = (int[]) this.f909OooO0Oo.OooO0O0(str2).OooO00o(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                                z = false;
                                if (iArr != null) {
                                    for (int i : iArr) {
                                        if (i == 0) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                            } catch (CameraAccessExceptionCompat e2) {
                                throw new InitializationException(o00OO000.OooO00o(e2));
                            }
                            if (z) {
                                arrayList3.add(str2);
                            } else {
                                o00O0O0.OooO00o("Camera2CameraFactory", "Camera " + str2 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                            }
                        }
                    }
                    this.f911OooO0o0 = arrayList3;
                    o00O00o0 o00o00o1 = new o00O00o0(this.f909OooO0Oo);
                    this.f906OooO00o = o00o00o1;
                    o0O0O00 o0o0o00 = new o0O0O00(o00o00o1);
                    this.f908OooO0OO = o0o0o00;
                    o00o00o1.f1099OooO00o.add(o0o0o00);
                } catch (CameraAccessException e3) {
                    throw new CameraAccessExceptionCompat(e3);
                }
            } catch (CameraUnavailableException e4) {
                throw new InitializationException(e4);
            }
        } catch (CameraAccessExceptionCompat e5) {
            throw new InitializationException(o00OO000.OooO00o(e5));
        }
    }

    @Override // androidx.camera.core.impl.o0OOO0o
    @NonNull
    public final oO0OOO00 OooO00o() {
        return this.f909OooO0Oo;
    }

    @Override // androidx.camera.core.impl.o0OOO0o
    @NonNull
    public final o000OO OooO0O0(@NonNull String str) throws CameraUnavailableException {
        if (!this.f911OooO0o0.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        oO0OOO00 oo0ooo00 = this.f909OooO0Oo;
        HashMap map = this.f912OooO0oO;
        try {
            o000 o000Var = (o000) map.get(str);
            if (o000Var == null) {
                o000Var = new o000(str, this.f909OooO0Oo);
                map.put(str, o000Var);
            }
            o00O00o0 o00o00o1 = this.f906OooO00o;
            o0O0O00 o0o0o00 = this.f908OooO0OO;
            o000OOo o000ooo2 = this.f907OooO0O0;
            return new o000OO(oo0ooo00, str, o000Var, o00o00o1, o0o0o00, o000ooo2.OooO00o(), o000ooo2.OooO0O0(), this.f910OooO0o);
        } catch (CameraAccessExceptionCompat e) {
            throw o00OO000.OooO00o(e);
        }
    }

    @Override // androidx.camera.core.impl.o0OOO0o
    @NonNull
    public final LinkedHashSet OooO0OO() {
        return new LinkedHashSet(this.f911OooO0o0);
    }

    @Override // androidx.camera.core.impl.o0OOO0o
    @NonNull
    public final o00O00o0 OooO0Oo() {
        return this.f906OooO00o;
    }
}
