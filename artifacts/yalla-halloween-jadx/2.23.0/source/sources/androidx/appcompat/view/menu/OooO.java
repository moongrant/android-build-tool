package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.view.o0000OO0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooO implements o0000.OooO00o {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int[] f2570OooOoO0 = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList<OooOO0O> f2571OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f2572OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f2573OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f2574OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f2575OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList<OooOO0O> f2576OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f2577OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList<OooOO0O> f2578OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f2579OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList<OooOO0O> f2580OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f2581OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Drawable f2583OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public CharSequence f2584OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View f2585OooOOOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f2590OooOo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public OooOO0O f2593OooOo0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f2582OooOO0o = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f2586OooOOOo = false;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f2588OooOOo0 = false;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f2587OooOOo = false;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f2589OooOOoo = false;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final ArrayList<OooOO0O> f2592OooOo00 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<OooOOO>> f2591OooOo0 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f2594OooOo0o = false;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OooO00o {
        boolean OooO00o(@NonNull OooO oooO, @NonNull MenuItem menuItem);

        void OooO0O0(@NonNull OooO oooO);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OooO0O0 {
        boolean OooO0Oo(OooOO0O oooOO0O);
    }

    public OooO(Context context) {
        boolean zOooO0O0;
        boolean z = false;
        this.f2572OooO00o = context;
        Resources resources = context.getResources();
        this.f2573OooO0O0 = resources;
        this.f2576OooO0o = new ArrayList<>();
        this.f2578OooO0oO = new ArrayList<>();
        this.f2579OooO0oo = true;
        this.f2571OooO = new ArrayList<>();
        this.f2580OooOO0 = new ArrayList<>();
        this.f2581OooOO0O = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = o0000OO0.f5420OooO00o;
            if (Build.VERSION.SDK_INT >= 28) {
                zOooO0O0 = o0000OO0.OooO0O0.OooO0O0(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zOooO0O0 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zOooO0O0) {
                z = true;
            }
        }
        this.f2575OooO0Oo = z;
    }

    public final void OooO() {
        ArrayList<OooOO0O> arrayListOooOO0o = OooOO0o();
        if (this.f2581OooOO0O) {
            CopyOnWriteArrayList<WeakReference<OooOOO>> copyOnWriteArrayList = this.f2591OooOo0;
            boolean zOooOO0 = false;
            for (WeakReference<OooOOO> weakReference : copyOnWriteArrayList) {
                OooOOO oooOOO = weakReference.get();
                if (oooOOO == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zOooOO0 |= oooOOO.OooOO0();
                }
            }
            ArrayList<OooOO0O> arrayList = this.f2571OooO;
            ArrayList<OooOO0O> arrayList2 = this.f2580OooOO0;
            if (zOooOO0) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListOooOO0o.size();
                for (int i = 0; i < size; i++) {
                    OooOO0O oooOO0O = arrayListOooOO0o.get(i);
                    if ((oooOO0O.f2645OooOo & 32) == 32) {
                        arrayList.add(oooOO0O);
                    } else {
                        arrayList2.add(oooOO0O);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(OooOO0o());
            }
            this.f2581OooOO0O = false;
        }
    }

    public OooOO0O OooO00o(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f2570OooOoO0[i5] << 16) | (65535 & i3);
        OooOO0O oooOO0O = new OooOO0O(this, i, i2, i3, i6, charSequence, this.f2582OooOO0o);
        ArrayList<OooOO0O> arrayList = this.f2576OooO0o;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                i4 = 0;
            }
            arrayList.add(i4, oooOO0O);
            OooOOOo(true);
            return oooOO0O;
        } while (arrayList.get(size).f2630OooO0Oo > i6);
        i4 = size + 1;
        arrayList.add(i4, oooOO0O);
        OooOOOo(true);
        return oooOO0O;
    }

    public final void OooO0O0(OooOOO oooOOO, Context context) {
        this.f2591OooOo0.add(new WeakReference<>(oooOOO));
        oooOOO.OooOO0O(context, this);
        this.f2581OooOO0O = true;
    }

    public final void OooO0OO(boolean z) {
        if (this.f2589OooOOoo) {
            return;
        }
        this.f2589OooOOoo = true;
        CopyOnWriteArrayList<WeakReference<OooOOO>> copyOnWriteArrayList = this.f2591OooOo0;
        for (WeakReference<OooOOO> weakReference : copyOnWriteArrayList) {
            OooOOO oooOOO = weakReference.get();
            if (oooOOO == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                oooOOO.OooO0O0(this, z);
            }
        }
        this.f2589OooOOoo = false;
    }

    public boolean OooO0Oo(OooOO0O oooOO0O) {
        CopyOnWriteArrayList<WeakReference<OooOOO>> copyOnWriteArrayList = this.f2591OooOo0;
        boolean zOooO0Oo = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2593OooOo0O == oooOO0O) {
            OooOoO0();
            for (WeakReference<OooOOO> weakReference : copyOnWriteArrayList) {
                OooOOO oooOOO = weakReference.get();
                if (oooOOO != null) {
                    zOooO0Oo = oooOOO.OooO0Oo(oooOO0O);
                    if (zOooO0Oo) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            OooOo();
            if (zOooO0Oo) {
                this.f2593OooOo0O = null;
            }
        }
        return zOooO0Oo;
    }

    public boolean OooO0o(OooOO0O oooOO0O) {
        CopyOnWriteArrayList<WeakReference<OooOOO>> copyOnWriteArrayList = this.f2591OooOo0;
        boolean zOooO0oo = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        OooOoO0();
        for (WeakReference<OooOOO> weakReference : copyOnWriteArrayList) {
            OooOOO oooOOO = weakReference.get();
            if (oooOOO != null) {
                zOooO0oo = oooOOO.OooO0oo(oooOO0O);
                if (zOooO0oo) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        OooOo();
        if (zOooO0oo) {
            this.f2593OooOo0O = oooOO0O;
        }
        return zOooO0oo;
    }

    public boolean OooO0o0(@NonNull OooO oooO, @NonNull MenuItem menuItem) {
        OooO00o oooO00o = this.f2577OooO0o0;
        return oooO00o != null && oooO00o.OooO00o(oooO, menuItem);
    }

    public final OooOO0O OooO0oO(int i, KeyEvent keyEvent) {
        ArrayList<OooOO0O> arrayList = this.f2592OooOo00;
        arrayList.clear();
        OooO0oo(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zOooOOO = OooOOO();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0O oooOO0O = arrayList.get(i2);
            char c = zOooOOO ? oooOO0O.f2635OooOO0 : oooOO0O.f2634OooO0oo;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zOooOOO && c == '\b' && i == 67))) {
                return oooOO0O;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    public final void OooO0oo(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zOooOOO = OooOOO();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList<OooOO0O> arrayList2 = this.f2576OooO0o;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooOO0O oooOO0O = arrayList2.get(i2);
                if (oooOO0O.hasSubMenu()) {
                    oooOO0O.f2640OooOOOO.OooO0oo(arrayList, i, keyEvent);
                }
                char c = zOooOOO ? oooOO0O.f2635OooOO0 : oooOO0O.f2634OooO0oo;
                if (((modifiers & 69647) == ((zOooOOO ? oooOO0O.f2636OooOO0O : oooOO0O.f2626OooO) & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if (c != cArr[0] && c != cArr[2]) {
                        if (zOooOOO && c == '\b') {
                            if (i == 67) {
                            }
                        }
                    }
                    if (oooOO0O.isEnabled()) {
                        arrayList.add(oooOO0O);
                    }
                }
            }
        }
    }

    public String OooOO0() {
        return "android:menu:actionviewstates";
    }

    public OooO OooOO0O() {
        return this;
    }

    @NonNull
    public final ArrayList<OooOO0O> OooOO0o() {
        boolean z = this.f2579OooO0oo;
        ArrayList<OooOO0O> arrayList = this.f2578OooO0oO;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<OooOO0O> arrayList2 = this.f2576OooO0o;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            OooOO0O oooOO0O = arrayList2.get(i);
            if (oooOO0O.isVisible()) {
                arrayList.add(oooOO0O);
            }
        }
        this.f2579OooO0oo = false;
        this.f2581OooOO0O = true;
        return arrayList;
    }

    public boolean OooOOO() {
        return this.f2574OooO0OO;
    }

    public boolean OooOOO0() {
        return this.f2594OooOo0o;
    }

    public boolean OooOOOO() {
        return this.f2575OooO0Oo;
    }

    public void OooOOOo(boolean z) {
        if (this.f2586OooOOOo) {
            this.f2588OooOOo0 = true;
            if (z) {
                this.f2587OooOOo = true;
                return;
            }
            return;
        }
        if (z) {
            this.f2579OooO0oo = true;
            this.f2581OooOO0O = true;
        }
        CopyOnWriteArrayList<WeakReference<OooOOO>> copyOnWriteArrayList = this.f2591OooOo0;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        OooOoO0();
        for (WeakReference<OooOOO> weakReference : copyOnWriteArrayList) {
            OooOOO oooOOO = weakReference.get();
            if (oooOOO == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                oooOOO.OooO(z);
            }
        }
        OooOo();
    }

    public final void OooOOo(OooOOO oooOOO) {
        CopyOnWriteArrayList<WeakReference<OooOOO>> copyOnWriteArrayList = this.f2591OooOo0;
        for (WeakReference<OooOOO> weakReference : copyOnWriteArrayList) {
            OooOOO oooOOO2 = weakReference.get();
            if (oooOOO2 == null || oooOOO2 == oooOOO) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003e  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a6 A[SYNTHETIC] */
    public final boolean OooOOo0(MenuItem menuItem, OooOOO oooOOO, int i) {
        androidx.core.view.OooO0O0 oooO0O0;
        boolean zExpandActionView;
        androidx.core.view.OooO0O0 oooO0O1;
        boolean z;
        OooOo oooOo;
        CopyOnWriteArrayList<WeakReference<OooOOO>> copyOnWriteArrayList;
        OooOOO oooOOO2;
        OooOO0O oooOO0O = (OooOO0O) menuItem;
        boolean zOooO0o = false;
        if (oooOO0O == null || !oooOO0O.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oooOO0O.f2641OooOOOo;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oooOO0O)) {
            OooO oooO = oooOO0O.f2638OooOOO;
            if (oooO.OooO0o0(oooO, oooOO0O)) {
                zExpandActionView = true;
            } else {
                Intent intent = oooOO0O.f2633OooO0oO;
                if (intent != null) {
                    try {
                        oooO.f2572OooO00o.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                        oooO0O0 = oooOO0O.f2652OooOoOO;
                        if (oooO0O0 == null) {
                        }
                        zExpandActionView = false;
                        oooO0O1 = oooOO0O.f2652OooOoOO;
                        if (oooO0O1 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (oooOO0O.OooO0o0()) {
                            zExpandActionView |= oooOO0O.expandActionView();
                            if (zExpandActionView) {
                                OooO0OO(true);
                            }
                        } else if (oooOO0O.hasSubMenu()) {
                            if ((i & 4) == 0) {
                                OooO0OO(false);
                            }
                            if (!oooOO0O.hasSubMenu()) {
                                OooOo oooOo2 = new OooOo(this.f2572OooO00o, this, oooOO0O);
                                oooOO0O.f2640OooOOOO = oooOo2;
                                oooOo2.setHeaderTitle(oooOO0O.f2632OooO0o0);
                            }
                            oooOo = oooOO0O.f2640OooOOOO;
                            if (z) {
                                oooO0O1.OooO0o(oooOo);
                            }
                            copyOnWriteArrayList = this.f2591OooOo0;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (oooOOO != null) {
                                }
                                for (WeakReference<OooOOO> weakReference : copyOnWriteArrayList) {
                                    oooOOO2 = weakReference.get();
                                    if (oooOOO2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zOooO0o) {
                                        zOooO0o = oooOOO2.OooO0o(oooOo);
                                    }
                                }
                            }
                            zExpandActionView |= zOooO0o;
                            if (!zExpandActionView) {
                                OooO0OO(true);
                            }
                        } else {
                            if ((i & 4) == 0) {
                                OooO0OO(false);
                            }
                            if (!oooOO0O.hasSubMenu()) {
                                OooOo oooOo3 = new OooOo(this.f2572OooO00o, this, oooOO0O);
                                oooOO0O.f2640OooOOOO = oooOo3;
                                oooOo3.setHeaderTitle(oooOO0O.f2632OooO0o0);
                            }
                            oooOo = oooOO0O.f2640OooOOOO;
                            if (z) {
                                oooO0O1.OooO0o(oooOo);
                            }
                            copyOnWriteArrayList = this.f2591OooOo0;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zOooO0o = oooOOO != null ? oooOOO.OooO0o(oooOo) : false;
                                while (r8.hasNext()) {
                                    oooOOO2 = weakReference.get();
                                    if (oooOOO2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zOooO0o) {
                                        zOooO0o = oooOOO2.OooO0o(oooOo);
                                    }
                                }
                            }
                            zExpandActionView |= zOooO0o;
                            if (!zExpandActionView) {
                                OooO0OO(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    oooO0O0 = oooOO0O.f2652OooOoOO;
                    if (oooO0O0 == null && oooO0O0.OooO0o0()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        oooO0O1 = oooOO0O.f2652OooOoOO;
        if (oooO0O1 == null && oooO0O1.OooO00o()) {
            z = true;
        } else {
            z = false;
        }
        if (oooOO0O.OooO0o0()) {
            zExpandActionView |= oooOO0O.expandActionView();
            if (zExpandActionView) {
                OooO0OO(true);
            }
        } else if (oooOO0O.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                OooO0OO(false);
            }
            if (!oooOO0O.hasSubMenu()) {
                OooOo oooOo4 = new OooOo(this.f2572OooO00o, this, oooOO0O);
                oooOO0O.f2640OooOOOO = oooOo4;
                oooOo4.setHeaderTitle(oooOO0O.f2632OooO0o0);
            }
            oooOo = oooOO0O.f2640OooOOOO;
            if (z) {
                oooO0O1.OooO0o(oooOo);
            }
            copyOnWriteArrayList = this.f2591OooOo0;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (oooOOO != null) {
                }
                while (r8.hasNext()) {
                    oooOOO2 = weakReference.get();
                    if (oooOOO2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zOooO0o) {
                        zOooO0o = oooOOO2.OooO0o(oooOo);
                    }
                }
            }
            zExpandActionView |= zOooO0o;
            if (!zExpandActionView) {
                OooO0OO(true);
            }
        } else if ((i & 1) == 0) {
            OooO0OO(true);
        }
        return zExpandActionView;
    }

    public final void OooOOoo(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(OooOO0());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((OooOo) item.getSubMenu()).OooOOoo(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void OooOo() {
        this.f2586OooOOOo = false;
        if (this.f2588OooOOo0) {
            this.f2588OooOOo0 = false;
            OooOOOo(this.f2587OooOOo);
        }
    }

    public final void OooOo0(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((OooOo) item.getSubMenu()).OooOo0(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(OooOO0(), sparseArray);
        }
    }

    public final void OooOo00(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<OooOOO>> copyOnWriteArrayList = this.f2591OooOo0;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference<OooOOO> weakReference : copyOnWriteArrayList) {
                OooOOO oooOOO = weakReference.get();
                if (oooOOO == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = oooOOO.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        oooOOO.OooO0o0(parcelable);
                    }
                }
            }
        }
    }

    public final void OooOo0O(Bundle bundle) {
        Parcelable parcelableOooO0oO;
        CopyOnWriteArrayList<WeakReference<OooOOO>> copyOnWriteArrayList = this.f2591OooOo0;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<OooOOO> weakReference : copyOnWriteArrayList) {
            OooOOO oooOOO = weakReference.get();
            if (oooOOO == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = oooOOO.getId();
                if (id > 0 && (parcelableOooO0oO = oooOOO.OooO0oO()) != null) {
                    sparseArray.put(id, parcelableOooO0oO);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final void OooOo0o(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f2585OooOOOO = view;
            this.f2584OooOOO0 = null;
            this.f2583OooOOO = null;
        } else {
            if (i > 0) {
                this.f2584OooOOO0 = this.f2573OooO0O0.getText(i);
            } else if (charSequence != null) {
                this.f2584OooOOO0 = charSequence;
            }
            if (i2 > 0) {
                Object obj = ContextCompat.f5271OooO00o;
                this.f2583OooOOO = ContextCompat.OooO0OO.OooO0O0(this.f2572OooO00o, i2);
            } else if (drawable != null) {
                this.f2583OooOOO = drawable;
            }
            this.f2585OooOOOO = null;
        }
        OooOOOo(false);
    }

    public final void OooOoO0() {
        if (this.f2586OooOOOo) {
            return;
        }
        this.f2586OooOOOo = true;
        this.f2588OooOOo0 = false;
        this.f2587OooOOo = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return OooO00o(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2572OooO00o.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            OooOO0O oooOO0OOooO00o = OooO00o(i, i2, i3, resolveInfo.loadLabel(packageManager));
            oooOO0OOooO00o.setIcon(resolveInfo.loadIcon(packageManager));
            oooOO0OOooO00o.f2633OooO0oO = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = oooOO0OOooO00o;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        OooOO0O oooOO0O = this.f2593OooOo0O;
        if (oooOO0O != null) {
            OooO0Oo(oooOO0O);
        }
        this.f2576OooO0o.clear();
        OooOOOo(true);
    }

    public final void clearHeader() {
        this.f2583OooOOO = null;
        this.f2584OooOOO0 = null;
        this.f2585OooOOOO = null;
        OooOOOo(false);
    }

    @Override // android.view.Menu
    public final void close() {
        OooO0OO(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0O oooOO0O = this.f2576OooO0o.get(i2);
            if (oooOO0O.f2627OooO00o == i) {
                return oooOO0O;
            }
            if (oooOO0O.hasSubMenu() && (menuItemFindItem = oooOO0O.f2640OooOOOO.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return this.f2576OooO0o.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2590OooOo) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f2576OooO0o.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return OooO0oO(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return OooOOo0(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        OooOO0O oooOO0OOooO0oO = OooO0oO(i, keyEvent);
        boolean zOooOOo0 = oooOO0OOooO0oO != null ? OooOOo0(oooOO0OOooO0oO, null, i2) : false;
        if ((i2 & 2) != 0) {
            OooO0OO(true);
        }
        return zOooOOo0;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList<OooOO0O> arrayList;
        int size = size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            arrayList = this.f2576OooO0o;
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (arrayList.get(i3).f2628OooO0O0 == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || arrayList.get(i3).f2628OooO0O0 != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            OooOOOo(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList<OooOO0O> arrayList;
        int size = size();
        int i2 = 0;
        while (true) {
            arrayList = this.f2576OooO0o;
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (arrayList.get(i2).f2627OooO00o == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        OooOOOo(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList<OooOO0O> arrayList = this.f2576OooO0o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0O oooOO0O = arrayList.get(i2);
            if (oooOO0O.f2628OooO0O0 == i) {
                oooOO0O.OooO0o(z2);
                oooOO0O.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f2594OooOo0o = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList<OooOO0O> arrayList = this.f2576OooO0o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0O oooOO0O = arrayList.get(i2);
            if (oooOO0O.f2628OooO0O0 == i) {
                oooOO0O.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList<OooOO0O> arrayList = this.f2576OooO0o;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0O oooOO0O = arrayList.get(i2);
            if (oooOO0O.f2628OooO0O0 == i) {
                int i3 = oooOO0O.f2645OooOo;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                oooOO0O.f2645OooOo = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            OooOOOo(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f2574OooO0OO = z;
        OooOOOo(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2576OooO0o.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return OooO00o(0, 0, 0, this.f2573OooO0O0.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2573OooO0O0.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO00o(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        OooOO0O oooOO0OOooO00o = OooO00o(i, i2, i3, charSequence);
        OooOo oooOo = new OooOo(this.f2572OooO00o, this, oooOO0OOooO00o);
        oooOO0OOooO00o.f2640OooOOOO = oooOo;
        oooOo.setHeaderTitle(oooOO0OOooO00o.f2632OooO0o0);
        return oooOo;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return OooO00o(i, i2, i3, this.f2573OooO0O0.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2573OooO0O0.getString(i4));
    }
}
