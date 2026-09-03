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
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o000O0O0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooO0o implements o000O0O.OooO00o {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int[] f4704OooOoO0 = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ArrayList<OooOO0> f4705OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f4706OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f4707OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f4708OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f4709OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList<OooOO0> f4710OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f4711OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ArrayList<OooOO0> f4712OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f4713OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ArrayList<OooOO0> f4714OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f4715OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Drawable f4717OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public CharSequence f4718OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View f4719OooOOOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f4724OooOo;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public OooOO0 f4727OooOo0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f4716OooOO0o = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f4720OooOOOo = false;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f4722OooOOo0 = false;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f4721OooOOo = false;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f4723OooOOoo = false;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ArrayList<OooOO0> f4726OooOo00 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<OooOOO0>> f4725OooOo0 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f4728OooOo0o = false;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OooO00o {
        boolean OooO00o(@NonNull OooO0o oooO0o, @NonNull MenuItem menuItem);

        void OooO0O0(@NonNull OooO0o oooO0o);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OooO0O0 {
        boolean OooO00o(OooOO0 oooOO1);
    }

    public OooO0o(Context context) {
        boolean zOooO0O0;
        boolean z = false;
        this.f4706OooO00o = context;
        Resources resources = context.getResources();
        this.f4707OooO0O0 = resources;
        this.f4710OooO0o = new ArrayList<>();
        this.f4712OooO0oO = new ArrayList<>();
        this.f4713OooO0oo = true;
        this.f4705OooO = new ArrayList<>();
        this.f4714OooOO0 = new ArrayList<>();
        this.f4715OooOO0O = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = o000OOo.f28122OooO00o;
            if (Build.VERSION.SDK_INT >= 28) {
                zOooO0O0 = o000OOo.OooO0O0.OooO0O0(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zOooO0O0 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zOooO0O0) {
                z = true;
            }
        }
        this.f4709OooO0Oo = z;
    }

    public final void OooO(List<OooOO0> list, int i, KeyEvent keyEvent) {
        boolean zOooOOOO = OooOOOO();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f4710OooO0o.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooOO0 oooOO1 = this.f4710OooO0o.get(i2);
                if (oooOO1.hasSubMenu()) {
                    oooOO1.f4743OooOOOO.OooO(list, i, keyEvent);
                }
                char c = zOooOOOO ? oooOO1.f4738OooOO0 : oooOO1.f4737OooO0oo;
                if (((modifiers & 69647) == ((zOooOOOO ? oooOO1.f4739OooOO0O : oooOO1.f4729OooO) & 69647)) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zOooOOOO && c == '\b' && i == 67)) && oooOO1.isEnabled()) {
                        list.add(oooOO1);
                    }
                }
            }
        }
    }

    public MenuItem OooO00o(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f4704OooOoO0;
            if (i5 < 6) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                OooOO0 oooOO1 = new OooOO0(this, i, i2, i3, i6, charSequence, this.f4716OooOO0o);
                ArrayList<OooOO0> arrayList = this.f4710OooO0o;
                int size = arrayList.size();
                do {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                    }
                    arrayList.add(i4, oooOO1);
                    OooOOo(true);
                    return oooOO1;
                } while (arrayList.get(size).f4733OooO0Oo > i6);
                i4 = size + 1;
                arrayList.add(i4, oooOO1);
                OooOOo(true);
                return oooOO1;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final void OooO0O0(OooOOO0 oooOOO0) {
        OooO0OO(oooOOO0, this.f4706OooO00o);
    }

    public final void OooO0OO(OooOOO0 oooOOO0, Context context) {
        this.f4725OooOo0.add(new WeakReference<>(oooOOO0));
        oooOOO0.OooO0oo(context, this);
        this.f4715OooOO0O = true;
    }

    public final void OooO0Oo(boolean z) {
        if (this.f4723OooOOoo) {
            return;
        }
        this.f4723OooOOoo = true;
        for (WeakReference<OooOOO0> weakReference : this.f4725OooOo0) {
            OooOOO0 oooOOO0 = weakReference.get();
            if (oooOOO0 == null) {
                this.f4725OooOo0.remove(weakReference);
            } else {
                oooOOO0.OooO0OO(this, z);
            }
        }
        this.f4723OooOOoo = false;
    }

    public boolean OooO0o(@NonNull OooO0o oooO0o, @NonNull MenuItem menuItem) {
        OooO00o oooO00o = this.f4711OooO0o0;
        return oooO00o != null && oooO00o.OooO00o(oooO0o, menuItem);
    }

    public boolean OooO0o0(OooOO0 oooOO1) {
        boolean zOooO0oO = false;
        if (!this.f4725OooOo0.isEmpty() && this.f4727OooOo0O == oooOO1) {
            OooOooO();
            for (WeakReference<OooOOO0> weakReference : this.f4725OooOo0) {
                OooOOO0 oooOOO0 = weakReference.get();
                if (oooOOO0 != null) {
                    zOooO0oO = oooOOO0.OooO0oO(oooOO1);
                    if (zOooO0oO) {
                        break;
                    }
                } else {
                    this.f4725OooOo0.remove(weakReference);
                }
            }
            OooOoo();
            if (zOooO0oO) {
                this.f4727OooOo0O = null;
            }
        }
        return zOooO0oO;
    }

    public boolean OooO0oO(OooOO0 oooOO1) {
        boolean zOooOOO0 = false;
        if (this.f4725OooOo0.isEmpty()) {
            return false;
        }
        OooOooO();
        for (WeakReference<OooOOO0> weakReference : this.f4725OooOo0) {
            OooOOO0 oooOOO0 = weakReference.get();
            if (oooOOO0 != null) {
                zOooOOO0 = oooOOO0.OooOOO0(oooOO1);
                if (zOooOOO0) {
                    break;
                }
            } else {
                this.f4725OooOo0.remove(weakReference);
            }
        }
        OooOoo();
        if (zOooOOO0) {
            this.f4727OooOo0O = oooOO1;
        }
        return zOooOOO0;
    }

    public final OooOO0 OooO0oo(int i, KeyEvent keyEvent) {
        ArrayList<OooOO0> arrayList = this.f4726OooOo00;
        arrayList.clear();
        OooO(arrayList, i, keyEvent);
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
        boolean zOooOOOO = OooOOOO();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0 oooOO1 = arrayList.get(i2);
            char c = zOooOOOO ? oooOO1.f4738OooOO0 : oooOO1.f4737OooO0oo;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zOooOOOO && c == '\b' && i == 67))) {
                return oooOO1;
            }
        }
        return null;
    }

    public final void OooOO0() {
        ArrayList<OooOO0> arrayListOooOOO0 = OooOOO0();
        if (this.f4715OooOO0O) {
            boolean zOooO0o0 = false;
            for (WeakReference<OooOOO0> weakReference : this.f4725OooOo0) {
                OooOOO0 oooOOO0 = weakReference.get();
                if (oooOOO0 == null) {
                    this.f4725OooOo0.remove(weakReference);
                } else {
                    zOooO0o0 |= oooOOO0.OooO0o0();
                }
            }
            if (zOooO0o0) {
                this.f4705OooO.clear();
                this.f4714OooOO0.clear();
                int size = arrayListOooOOO0.size();
                for (int i = 0; i < size; i++) {
                    OooOO0 oooOO1 = arrayListOooOOO0.get(i);
                    if (oooOO1.OooO0oO()) {
                        this.f4705OooO.add(oooOO1);
                    } else {
                        this.f4714OooOO0.add(oooOO1);
                    }
                }
            } else {
                this.f4705OooO.clear();
                this.f4714OooOO0.clear();
                this.f4714OooOO0.addAll(OooOOO0());
            }
            this.f4715OooOO0O = false;
        }
    }

    public String OooOO0O() {
        return "android:menu:actionviewstates";
    }

    public OooO0o OooOO0o() {
        return this;
    }

    public boolean OooOOO() {
        return this.f4728OooOo0o;
    }

    @NonNull
    public final ArrayList<OooOO0> OooOOO0() {
        if (!this.f4713OooO0oo) {
            return this.f4712OooO0oO;
        }
        this.f4712OooO0oO.clear();
        int size = this.f4710OooO0o.size();
        for (int i = 0; i < size; i++) {
            OooOO0 oooOO1 = this.f4710OooO0o.get(i);
            if (oooOO1.isVisible()) {
                this.f4712OooO0oO.add(oooOO1);
            }
        }
        this.f4713OooO0oo = false;
        this.f4715OooOO0O = true;
        return this.f4712OooO0oO;
    }

    public boolean OooOOOO() {
        return this.f4708OooO0OO;
    }

    public boolean OooOOOo() {
        return this.f4709OooO0Oo;
    }

    public void OooOOo(boolean z) {
        if (this.f4720OooOOOo) {
            this.f4722OooOOo0 = true;
            if (z) {
                this.f4721OooOOo = true;
                return;
            }
            return;
        }
        if (z) {
            this.f4713OooO0oo = true;
            this.f4715OooOO0O = true;
        }
        if (this.f4725OooOo0.isEmpty()) {
            return;
        }
        OooOooO();
        for (WeakReference<OooOOO0> weakReference : this.f4725OooOo0) {
            OooOOO0 oooOOO0 = weakReference.get();
            if (oooOOO0 == null) {
                this.f4725OooOo0.remove(weakReference);
            } else {
                oooOOO0.OooO0Oo(z);
            }
        }
        OooOoo();
    }

    public final void OooOOo0() {
        this.f4715OooOO0O = true;
        OooOOo(true);
    }

    public final boolean OooOOoo(MenuItem menuItem, int i) {
        return OooOo00(menuItem, null, i);
    }

    public final void OooOo(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f4725OooOo0.isEmpty()) {
            return;
        }
        for (WeakReference<OooOOO0> weakReference : this.f4725OooOo0) {
            OooOOO0 oooOOO0 = weakReference.get();
            if (oooOOO0 == null) {
                this.f4725OooOo0.remove(weakReference);
            } else {
                int id = oooOOO0.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    oooOOO0.OooO(parcelable);
                }
            }
        }
    }

    public final void OooOo0(int i, boolean z) {
        if (i < 0 || i >= this.f4710OooO0o.size()) {
            return;
        }
        this.f4710OooO0o.remove(i);
        if (z) {
            OooOOo(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a6 A[SYNTHETIC] */
    public final boolean OooOo00(MenuItem menuItem, OooOOO0 oooOOO0, int i) {
        o000O0O0.OooO00o oooO00o;
        boolean zExpandActionView;
        o000O0O0.OooO00o oooO00o2;
        boolean z;
        OooOo00 oooOo00;
        OooOOO0 oooOOO1;
        OooOO0 oooOO1 = (OooOO0) menuItem;
        boolean zOooOO0O = false;
        if (oooOO1 == null || !oooOO1.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oooOO1.f4744OooOOOo;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oooOO1)) {
            OooO0o oooO0o = oooOO1.f4741OooOOO;
            if (oooO0o.OooO0o(oooO0o, oooOO1)) {
                zExpandActionView = true;
            } else {
                Intent intent = oooOO1.f4736OooO0oO;
                if (intent != null) {
                    try {
                        oooOO1.f4741OooOOO.f4706OooO00o.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                        oooO00o = oooOO1.f4755OooOoOO;
                        if (oooO00o == null) {
                        }
                        zExpandActionView = false;
                        oooO00o2 = oooOO1.f4755OooOoOO;
                        if (oooO00o2 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (oooOO1.OooO0o()) {
                            zExpandActionView |= oooOO1.expandActionView();
                            if (zExpandActionView) {
                                OooO0Oo(true);
                            }
                        } else if (oooOO1.hasSubMenu()) {
                            if ((i & 4) == 0) {
                                OooO0Oo(false);
                            }
                            if (!oooOO1.hasSubMenu()) {
                                oooOO1.OooOOO0(new OooOo00(this.f4706OooO00o, this, oooOO1));
                            }
                            oooOo00 = oooOO1.f4743OooOOOO;
                            if (z) {
                                oooO00o2.OooO0o(oooOo00);
                            }
                            if (!this.f4725OooOo0.isEmpty()) {
                                if (oooOOO0 != null) {
                                }
                                for (WeakReference<OooOOO0> weakReference : this.f4725OooOo0) {
                                    oooOOO1 = weakReference.get();
                                    if (oooOOO1 == null) {
                                        this.f4725OooOo0.remove(weakReference);
                                    } else if (!zOooOO0O) {
                                        zOooOO0O = oooOOO1.OooOO0O(oooOo00);
                                    }
                                }
                            }
                            zExpandActionView |= zOooOO0O;
                            if (!zExpandActionView) {
                                OooO0Oo(true);
                            }
                        } else {
                            if ((i & 4) == 0) {
                                OooO0Oo(false);
                            }
                            if (!oooOO1.hasSubMenu()) {
                                oooOO1.OooOOO0(new OooOo00(this.f4706OooO00o, this, oooOO1));
                            }
                            oooOo00 = oooOO1.f4743OooOOOO;
                            if (z) {
                                oooO00o2.OooO0o(oooOo00);
                            }
                            if (!this.f4725OooOo0.isEmpty()) {
                                zOooOO0O = oooOOO0 != null ? oooOOO0.OooOO0O(oooOo00) : false;
                                while (r8.hasNext()) {
                                    oooOOO1 = weakReference.get();
                                    if (oooOOO1 == null) {
                                        this.f4725OooOo0.remove(weakReference);
                                    } else if (!zOooOO0O) {
                                        zOooOO0O = oooOOO1.OooOO0O(oooOo00);
                                    }
                                }
                            }
                            zExpandActionView |= zOooOO0O;
                            if (!zExpandActionView) {
                                OooO0Oo(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    oooO00o = oooOO1.f4755OooOoOO;
                    if (oooO00o == null && oooO00o.OooO0o0()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        oooO00o2 = oooOO1.f4755OooOoOO;
        if (oooO00o2 == null && oooO00o2.OooO00o()) {
            z = true;
        } else {
            z = false;
        }
        if (oooOO1.OooO0o()) {
            zExpandActionView |= oooOO1.expandActionView();
            if (zExpandActionView) {
                OooO0Oo(true);
            }
        } else if (oooOO1.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                OooO0Oo(false);
            }
            if (!oooOO1.hasSubMenu()) {
                oooOO1.OooOOO0(new OooOo00(this.f4706OooO00o, this, oooOO1));
            }
            oooOo00 = oooOO1.f4743OooOOOO;
            if (z) {
                oooO00o2.OooO0o(oooOo00);
            }
            if (!this.f4725OooOo0.isEmpty()) {
                if (oooOOO0 != null) {
                }
                while (r8.hasNext()) {
                    oooOOO1 = weakReference.get();
                    if (oooOOO1 == null) {
                        this.f4725OooOo0.remove(weakReference);
                    } else if (!zOooOO0O) {
                        zOooOO0O = oooOOO1.OooOO0O(oooOo00);
                    }
                }
            }
            zExpandActionView |= zOooOO0O;
            if (!zExpandActionView) {
                OooO0Oo(true);
            }
        } else if ((i & 1) == 0) {
            OooO0Oo(true);
        }
        return zExpandActionView;
    }

    public final void OooOo0O(OooOOO0 oooOOO0) {
        for (WeakReference<OooOOO0> weakReference : this.f4725OooOo0) {
            OooOOO0 oooOOO1 = weakReference.get();
            if (oooOOO1 == null || oooOOO1 == oooOOO0) {
                this.f4725OooOo0.remove(weakReference);
            }
        }
    }

    public final void OooOo0o(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(OooOO0O());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((OooOo00) item.getSubMenu()).OooOo0o(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void OooOoO(Bundle bundle) {
        Parcelable parcelableOooOO0o;
        if (this.f4725OooOo0.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<OooOOO0> weakReference : this.f4725OooOo0) {
            OooOOO0 oooOOO0 = weakReference.get();
            if (oooOOO0 == null) {
                this.f4725OooOo0.remove(weakReference);
            } else {
                int id = oooOOO0.getId();
                if (id > 0 && (parcelableOooOO0o = oooOOO0.OooOO0o()) != null) {
                    sparseArray.put(id, parcelableOooOO0o);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final void OooOoO0(Bundle bundle) {
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
                ((OooOo00) item.getSubMenu()).OooOoO0(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(OooOO0O(), sparseArray);
        }
    }

    public void OooOoOO(OooO00o oooO00o) {
        this.f4711OooO0o0 = oooO00o;
    }

    public final void OooOoo() {
        this.f4720OooOOOo = false;
        if (this.f4722OooOOo0) {
            this.f4722OooOOo0 = false;
            OooOOo(this.f4721OooOOo);
        }
    }

    public final void OooOoo0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f4707OooO0O0;
        if (view != null) {
            this.f4719OooOOOO = view;
            this.f4718OooOOO0 = null;
            this.f4717OooOOO = null;
        } else {
            if (i > 0) {
                this.f4718OooOOO0 = resources.getText(i);
            } else if (charSequence != null) {
                this.f4718OooOOO0 = charSequence;
            }
            if (i2 > 0) {
                Context context = this.f4706OooO00o;
                Object obj = o000O000.OooO00o.f28085OooO00o;
                this.f4717OooOOO = o000O000.OooO00o.OooO0OO.OooO0O0(context, i2);
            } else if (drawable != null) {
                this.f4717OooOOO = drawable;
            }
            this.f4719OooOOOO = null;
        }
        OooOOo(false);
    }

    public final void OooOooO() {
        if (this.f4720OooOOOo) {
            return;
        }
        this.f4720OooOOOo = true;
        this.f4722OooOOo0 = false;
        this.f4721OooOOo = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return OooO00o(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f4706OooO00o.getPackageManager();
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
            MenuItem intent3 = OooO00o(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
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
        OooOO0 oooOO1 = this.f4727OooOo0O;
        if (oooOO1 != null) {
            OooO0o0(oooOO1);
        }
        this.f4710OooO0o.clear();
        OooOOo(true);
    }

    public final void clearHeader() {
        this.f4717OooOOO = null;
        this.f4718OooOOO0 = null;
        this.f4719OooOOOO = null;
        OooOOo(false);
    }

    @Override // android.view.Menu
    public final void close() {
        OooO0Oo(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0 oooOO1 = this.f4710OooO0o.get(i2);
            if (oooOO1.f4730OooO00o == i) {
                return oooOO1;
            }
            if (oooOO1.hasSubMenu() && (menuItemFindItem = oooOO1.f4743OooOOOO.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return this.f4710OooO0o.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f4724OooOo) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f4710OooO0o.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return OooO0oo(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return OooOo00(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        OooOO0 oooOO0OooO0oo = OooO0oo(i, keyEvent);
        boolean zOooOo00 = oooOO0OooO0oo != null ? OooOo00(oooOO0OooO0oo, null, i2) : false;
        if ((i2 & 2) != 0) {
            OooO0Oo(true);
        }
        return zOooOo00;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f4710OooO0o.get(i2).f4731OooO0O0 == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f4710OooO0o.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f4710OooO0o.get(i2).f4731OooO0O0 != i) {
                    break;
                }
                OooOo0(i2, false);
                i3 = i4;
            }
            OooOOo(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            if (this.f4710OooO0o.get(i2).f4730OooO00o == i) {
                OooOo0(i2, true);
            }
            i2++;
        }
        i2 = -1;
        OooOo0(i2, true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f4710OooO0o.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0 oooOO1 = this.f4710OooO0o.get(i2);
            if (oooOO1.f4731OooO0O0 == i) {
                oooOO1.OooOO0O(z2);
                oooOO1.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f4728OooOo0o = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.f4710OooO0o.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0 oooOO1 = this.f4710OooO0o.get(i2);
            if (oooOO1.f4731OooO0O0 == i) {
                oooOO1.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int size = this.f4710OooO0o.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            OooOO0 oooOO1 = this.f4710OooO0o.get(i2);
            if (oooOO1.f4731OooO0O0 == i) {
                int i3 = oooOO1.f4748OooOo;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                oooOO1.f4748OooOo = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            OooOOo(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f4708OooO0OO = z;
        OooOOo(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4710OooO0o.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return OooO00o(0, 0, 0, this.f4707OooO0O0.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f4707OooO0O0.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO00o(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        OooOO0 oooOO1 = (OooOO0) OooO00o(i, i2, i3, charSequence);
        OooOo00 oooOo00 = new OooOo00(this.f4706OooO00o, this, oooOO1);
        oooOO1.OooOOO0(oooOo00);
        return oooOo00;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return OooO00o(i, i2, i3, this.f4707OooO0O0.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f4707OooO0O0.getString(i4));
    }
}
